package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.ToIntFunction;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Cells.ReactedUserHolderView;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPopupMenu;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.MessageContainsEmojiButton;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReplaceableIconDrawable;
import org.telegram.ui.Components.SearchField;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.RecyclerListViewScroller;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public abstract class SelfStoryViewsPage extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private int TOP_PADDING;
    private boolean checkAutoscroll;
    int currentAccount;
    ViewsModel currentModel;
    private StoriesController.StoryRepostsList currentRepostsList;
    ViewsModel defaultModel;
    private long dialogId;
    HeaderView headerView;
    private boolean isAttachedToWindow;
    boolean isSearchDebounce;
    public FillLastLinearLayoutManager layoutManager;
    ListAdapter listAdapter;
    private int measuerdHeight;
    Consumer onSharedStateChanged;
    private CustomPopupMenu popupMenu;
    RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    RecyclerListView recyclerListView;
    private int repostsListConsumedCount;
    Theme.ResourcesProvider resourcesProvider;
    RecyclerAnimationScrollHelper scrollHelper;
    private final RecyclerListViewScroller scroller;
    SearchField searchField;
    Drawable shadowDrawable;
    private final View shadowView;
    private final View shadowView2;
    final FiltersState sharedFilterState;
    private boolean showContactsFilter;
    private boolean showReactionsSort;
    private boolean showSearch;
    private boolean showServerErrorText;
    final FiltersState state;
    SelfStoryViewsView.StoryItemInternal storyItem;
    StoryViewer storyViewer;
    private final TextView titleView;
    private final FrameLayout topViewsContainer;

    public void onTopOffsetChanged(int i) {
    }

    protected void updateSharedState() {
    }

    public boolean isStoryShownToUser(TL_stories.StoryView storyView) {
        StoryEntry storyEntry;
        StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy;
        if (storyView == null) {
            return true;
        }
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().isBlocked(storyView) || MessagesController.getInstance(this.currentAccount).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(storyView.user_id));
        SelfStoryViewsView.StoryItemInternal storyItemInternal = this.storyItem;
        if (storyItemInternal != null) {
            TL_stories.StoryItem storyItem = storyItemInternal.storyItem;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(this.currentAccount, storyItem.privacy);
                }
                return this.storyItem.storyItem.parsedPrivacy.containsUser(user);
            }
            StoriesController.UploadingStory uploadingStory = storyItemInternal.uploadingStory;
            if (uploadingStory != null && (storyEntry = uploadingStory.entry) != null && (storyPrivacy = storyEntry.privacy) != null) {
                return storyPrivacy.containsUser(user);
            }
        }
        return true;
    }

    public SelfStoryViewsPage(final StoryViewer storyViewer, Context context, FiltersState filtersState, Consumer consumer) {
        super(context);
        this.TOP_PADDING = 96;
        this.state = new FiltersState();
        this.sharedFilterState = filtersState;
        this.onSharedStateChanged = consumer;
        this.resourcesProvider = storyViewer.resourcesProvider;
        this.storyViewer = storyViewer;
        this.currentAccount = storyViewer.currentAccount;
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        this.headerView = new HeaderView(getContext());
        RecyclerListViewInner recyclerListViewInner = new RecyclerListViewInner(context, this.resourcesProvider) {
            @Override
            protected void onMeasure(int i, int i2) {
                SelfStoryViewsPage.this.measuerdHeight = View.MeasureSpec.getSize(i2);
                super.onMeasure(i, i2);
            }
        };
        this.recyclerListView = recyclerListViewInner;
        recyclerListViewInner.setClipToPadding(false);
        this.recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.recyclerListView, true);
        RecyclerListView recyclerListView = this.recyclerListView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, 0, recyclerListView);
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView.setLayoutManager(fillLastLinearLayoutManager);
        this.recyclerListView.setNestedScrollingEnabled(true);
        RecyclerListView recyclerListView2 = this.recyclerListView;
        ListAdapter listAdapter = new ListAdapter();
        this.listAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.recyclerListView, this.layoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setScrollListener(new RecyclerAnimationScrollHelper.ScrollListener() {
            @Override
            public void onScroll() {
                SelfStoryViewsPage.this.invalidate();
            }
        });
        addView(this.recyclerListView);
        this.scroller = new RecyclerListViewScroller(this.recyclerListView);
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                SelfStoryViewsPage.this.checkLoadMore();
                SelfStoryViewsPage.this.invalidate();
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    SelfStoryViewsPage.this.checkAutoscroll = true;
                    SelfStoryViewsPage.this.invalidate();
                }
                if (i == 1) {
                    SelfStoryViewsPage.this.checkAutoscroll = false;
                    SelfStoryViewsPage.this.scroller.cancel();
                    AndroidUtilities.hideKeyboard(SelfStoryViewsPage.this);
                }
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                SelfStoryViewsPage.m4377$r8$lambda$rmw2Un7md3so28po8aPF9oEZus(this.f$0, storyViewer, view, i);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new AnonymousClass4(storyViewer));
        this.listAdapter.updateRows();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.topViewsContainer = frameLayout;
        View view = new View(getContext());
        this.shadowView = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = Theme.key_dialogBackground;
        view.setBackground(new GradientDrawable(orientation, new int[]{Theme.getColor(i, this.resourcesProvider), 0}));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, 8.0f, 0, 0.0f, this.TOP_PADDING - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.shadowView2 = view2;
        view2.setBackgroundColor(Theme.getColor(i, this.resourcesProvider));
        frameLayout.addView(view2, LayoutHelper.createFrame(-1, 10.0f, 0, 0.0f, this.TOP_PADDING - 17, 0.0f, 0.0f));
        frameLayout.addView(this.headerView);
        frameLayout.addView(textView);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(getContext(), true, 13.0f, this.resourcesProvider);
        this.searchField = anonymousClass5;
        anonymousClass5.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(this.searchField, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void m4377$r8$lambda$rmw2Un7md3so28po8aPF9oEZus(SelfStoryViewsPage selfStoryViewsPage, StoryViewer storyViewer, View view, int i) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        if (i < 0) {
            selfStoryViewsPage.getClass();
            return;
        }
        if (i >= selfStoryViewsPage.listAdapter.items.size()) {
            return;
        }
        Item item = (Item) selfStoryViewsPage.listAdapter.items.get(i);
        TL_stories.StoryView storyView = item.view;
        if (storyView instanceof TL_stories.TL_storyView) {
            storyViewer.presentFragment(ProfileActivity.of(storyView.user_id));
            return;
        }
        if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
            storyViewer.fragment.createOverlayStoryViewer().open(selfStoryViewsPage.getContext(), ((TL_stories.TL_storyViewPublicRepost) item.view).story, StoriesListPlaceProvider.of(selfStoryViewsPage.recyclerListView));
            return;
        }
        TL_stories.StoryReaction storyReaction = item.reaction;
        if (storyReaction instanceof TL_stories.TL_storyReaction) {
            storyViewer.presentFragment(ProfileActivity.of(DialogObject.getPeerDialogId(storyReaction.peer_id)));
            return;
        }
        if (!(storyReaction instanceof TL_stories.TL_storyReactionPublicRepost)) {
            boolean z = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
            if (z || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                TLRPC.Message message = z ? storyReaction.message : storyView.message;
                Bundle bundle = new Bundle();
                long peerDialogId = DialogObject.getPeerDialogId(message.peer_id);
                if (peerDialogId >= 0) {
                    bundle.putLong("user_id", peerDialogId);
                } else {
                    bundle.putLong("chat_id", -peerDialogId);
                }
                bundle.putInt("message_id", message.id);
                storyViewer.presentFragment(new ChatActivity(bundle));
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewsModel viewsModel = selfStoryViewsPage.currentModel;
        int i2 = 0;
        int size = -1;
        if (viewsModel != null && (arrayList = viewsModel.reactions) != null) {
            int size2 = arrayList.size();
            while (i2 < selfStoryViewsPage.currentModel.reactions.size()) {
                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) selfStoryViewsPage.currentModel.reactions.get(i2);
                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                    if (storyReaction2 == item.reaction) {
                        size = arrayList2.size();
                    }
                    arrayList2.add(storyItem);
                }
                i2++;
            }
            i2 = size2;
        }
        if (size < 0 || arrayList2.size() <= 1) {
            selfStoryViewsPage.currentRepostsList = null;
            storyViewer.fragment.createOverlayStoryViewer().open(selfStoryViewsPage.getContext(), ((TL_stories.TL_storyReactionPublicRepost) item.reaction).story, StoriesListPlaceProvider.of(selfStoryViewsPage.recyclerListView));
        } else {
            selfStoryViewsPage.currentRepostsList = new StoriesController.StoryRepostsList(selfStoryViewsPage.currentAccount, arrayList2);
            selfStoryViewsPage.repostsListConsumedCount = i2;
            final ViewsModel viewsModel2 = selfStoryViewsPage.currentModel;
            storyViewer.fragment.createOverlayStoryViewer().open(selfStoryViewsPage.getContext(), size, selfStoryViewsPage.currentRepostsList, StoriesListPlaceProvider.of(selfStoryViewsPage.recyclerListView).with(new StoriesListPlaceProvider.LoadNextInterface() {
                @Override
                public final void loadNext(boolean z2) {
                    SelfStoryViewsPage.$r8$lambda$_f7TK0cg3XqQRZ05pbRimcJD3nk(viewsModel2, z2);
                }
            }));
        }
    }

    public static void $r8$lambda$_f7TK0cg3XqQRZ05pbRimcJD3nk(ViewsModel viewsModel, boolean z) {
        if (viewsModel != null) {
            viewsModel.loadNext();
        }
    }

    class AnonymousClass4 implements RecyclerListView.OnItemLongClickListener {
        final StoryViewer val$storyViewer;

        AnonymousClass4(StoryViewer storyViewer) {
            this.val$storyViewer = storyViewer;
        }

        @Override
        public boolean onItemClick(View view, int i) {
            final TL_stories.StoryView storyView;
            final MessagesController messagesController;
            final TLRPC.User user;
            String strSubstring;
            boolean z;
            TLRPC.InputStickerSet inputStickerSetFindStickerSet;
            if (!(view instanceof ReactedUserHolderView)) {
                return false;
            }
            final ReactedUserHolderView reactedUserHolderView = (ReactedUserHolderView) view;
            StoryViewer storyViewer = this.val$storyViewer;
            if (storyViewer == null || storyViewer.containerView == null || (storyView = ((Item) SelfStoryViewsPage.this.listAdapter.items.get(i)).view) == null || (user = (messagesController = MessagesController.getInstance(SelfStoryViewsPage.this.currentAccount)).getUser(Long.valueOf(storyView.user_id))) == null) {
                return false;
            }
            boolean z2 = messagesController.blockePeers.indexOfKey(user.id) >= 0;
            boolean z3 = user.contact || ContactsController.getInstance(SelfStoryViewsPage.this.currentAccount).contactsDict.get(Long.valueOf(user.id)) != null;
            boolean zIsStoryShownToUser = SelfStoryViewsPage.this.isStoryShownToUser(storyView);
            boolean zIsBlocked = messagesController.getStoriesController().isBlocked(storyView);
            boolean zIsUserSelf = UserObject.isUserSelf(user);
            if (TextUtils.isEmpty(user.first_name)) {
                strSubstring = TextUtils.isEmpty(user.last_name) ? "" : user.last_name;
            } else {
                strSubstring = user.first_name;
            }
            int iIndexOf = strSubstring.indexOf(" ");
            if (iIndexOf > 2) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            if (zIsUserSelf) {
                return false;
            }
            final String str = strSubstring;
            ItemOptions itemOptionsCutTextInFancyHalf = ItemOptions.makeOptions(this.val$storyViewer.containerView, SelfStoryViewsPage.this.resourcesProvider, view).setGravity(3).ignoreX().setScrimViewBackground(new ColorDrawable(Theme.getColor(Theme.key_dialogBackground, SelfStoryViewsPage.this.resourcesProvider))).setDimAlpha(133).addIf((!zIsStoryShownToUser || zIsBlocked || z2 || zIsUserSelf) ? false : true, R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, strSubstring), new Runnable() {
                @Override
                public final void run() {
                    SelfStoryViewsPage.AnonymousClass4.m4378$r8$lambda$P5mFIATbrOZ6IMz9hL6v8vbtsM(this.f$0, messagesController, user, str, reactedUserHolderView, storyView);
                }
            }).makeMultiline(false).cutTextInFancyHalf().addIf((!zIsBlocked || z2 || zIsUserSelf) ? false : true, R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str), new Runnable() {
                @Override
                public final void run() {
                    SelfStoryViewsPage.AnonymousClass4.$r8$lambda$mDqlr_uqGmSY2oLEMzCSCB1EJHQ(this.f$0, messagesController, user, str, reactedUserHolderView, storyView);
                }
            }).makeMultiline(false).cutTextInFancyHalf();
            boolean z4 = (z3 || z2 || zIsUserSelf) ? false : true;
            int i2 = R.drawable.msg_user_remove;
            final ItemOptions itemOptionsAddIf = itemOptionsCutTextInFancyHalf.addIf(z4, i2, (CharSequence) LocaleController.getString(R.string.BlockUser), true, new Runnable() {
                @Override
                public final void run() {
                    SelfStoryViewsPage.AnonymousClass4.$r8$lambda$eovHZ3JFF3rbNfzTTothcaseAF4(this.f$0, messagesController, user, reactedUserHolderView, storyView);
                }
            }).addIf((z3 || !z2 || zIsUserSelf) ? false : true, R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable() {
                @Override
                public final void run() {
                    SelfStoryViewsPage.AnonymousClass4.$r8$lambda$YZ9ExloFDL_aXH6jflYYO4swF7c(this.f$0, messagesController, user, reactedUserHolderView, storyView);
                }
            }).addIf(z3 && !zIsUserSelf, i2, (CharSequence) LocaleController.getString(R.string.StoryDeleteContact), true, new Runnable() {
                @Override
                public final void run() {
                    SelfStoryViewsPage.AnonymousClass4.$r8$lambda$bi4jB3is2uaFHm209YvSI4quil0(this.f$0, user, str, reactedUserHolderView, storyView);
                }
            });
            TLRPC.Reaction reaction = storyView.reaction;
            if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (inputStickerSetFindStickerSet = AnimatedEmojiDrawable.getDocumentFetcher(SelfStoryViewsPage.this.currentAccount).findStickerSet(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                z = false;
            } else {
                itemOptionsAddIf.addGap();
                final ArrayList arrayList = new ArrayList();
                arrayList.add(inputStickerSetFindStickerSet);
                SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
                MessageContainsEmojiButton messageContainsEmojiButton = new MessageContainsEmojiButton(selfStoryViewsPage.currentAccount, selfStoryViewsPage.getContext(), SelfStoryViewsPage.this.resourcesProvider, arrayList, 3);
                messageContainsEmojiButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        SelfStoryViewsPage.AnonymousClass4.$r8$lambda$tE3zJGh4T7BtM5eE59ZN7FATZH8(this.f$0, arrayList, itemOptionsAddIf, view2);
                    }
                });
                itemOptionsAddIf.addView(messageContainsEmojiButton);
                z = true;
            }
            if (itemOptionsAddIf.getItemsCount() <= 0 && !z) {
                return false;
            }
            itemOptionsAddIf.show();
            try {
                SelfStoryViewsPage.this.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            return true;
        }

        public static void m4378$r8$lambda$P5mFIATbrOZ6IMz9hL6v8vbtsM(AnonymousClass4 anonymousClass4, MessagesController messagesController, TLRPC.User user, String str, ReactedUserHolderView reactedUserHolderView, TL_stories.StoryView storyView) {
            anonymousClass4.getClass();
            messagesController.getStoriesController().updateBlockUser(user.id, true);
            SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
            BulletinFactory.of(selfStoryViewsPage, selfStoryViewsPage.resourcesProvider).createSimpleBulletin(R.raw.ic_ban, LocaleController.formatString(R.string.StoryHidFromToast, str)).show();
            reactedUserHolderView.animateAlpha(SelfStoryViewsPage.this.isStoryShownToUser(storyView) ? 1.0f : 0.5f, true);
        }

        public static void $r8$lambda$mDqlr_uqGmSY2oLEMzCSCB1EJHQ(AnonymousClass4 anonymousClass4, MessagesController messagesController, TLRPC.User user, String str, ReactedUserHolderView reactedUserHolderView, TL_stories.StoryView storyView) {
            anonymousClass4.getClass();
            messagesController.getStoriesController().updateBlockUser(user.id, false);
            SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
            BulletinFactory.of(selfStoryViewsPage, selfStoryViewsPage.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.StoryShownBackToToast, str)).show();
            reactedUserHolderView.animateAlpha(SelfStoryViewsPage.this.isStoryShownToUser(storyView) ? 1.0f : 0.5f, true);
        }

        public static void $r8$lambda$eovHZ3JFF3rbNfzTTothcaseAF4(AnonymousClass4 anonymousClass4, MessagesController messagesController, TLRPC.User user, ReactedUserHolderView reactedUserHolderView, TL_stories.StoryView storyView) {
            anonymousClass4.getClass();
            messagesController.blockPeer(user.id);
            SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
            BulletinFactory.of(selfStoryViewsPage, selfStoryViewsPage.resourcesProvider).createBanBulletin(true).show();
            reactedUserHolderView.animateAlpha(SelfStoryViewsPage.this.isStoryShownToUser(storyView) ? 1.0f : 0.5f, true);
        }

        public static void $r8$lambda$YZ9ExloFDL_aXH6jflYYO4swF7c(AnonymousClass4 anonymousClass4, MessagesController messagesController, TLRPC.User user, ReactedUserHolderView reactedUserHolderView, TL_stories.StoryView storyView) {
            anonymousClass4.getClass();
            messagesController.getStoriesController().updateBlockUser(user.id, false);
            messagesController.unblockPeer(user.id);
            SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
            BulletinFactory.of(selfStoryViewsPage, selfStoryViewsPage.resourcesProvider).createBanBulletin(false).show();
            reactedUserHolderView.animateAlpha(SelfStoryViewsPage.this.isStoryShownToUser(storyView) ? 1.0f : 0.5f, true);
        }

        public static void $r8$lambda$bi4jB3is2uaFHm209YvSI4quil0(AnonymousClass4 anonymousClass4, TLRPC.User user, String str, ReactedUserHolderView reactedUserHolderView, TL_stories.StoryView storyView) {
            anonymousClass4.getClass();
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            arrayList.add(user);
            ContactsController.getInstance(SelfStoryViewsPage.this.currentAccount).deleteContact(arrayList, false);
            SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
            BulletinFactory.of(selfStoryViewsPage, selfStoryViewsPage.resourcesProvider).createSimpleBulletin(R.raw.ic_ban, LocaleController.formatString(R.string.DeletedFromYourContacts, str)).show();
            reactedUserHolderView.animateAlpha(SelfStoryViewsPage.this.isStoryShownToUser(storyView) ? 1.0f : 0.5f, true);
        }

        public static void $r8$lambda$tE3zJGh4T7BtM5eE59ZN7FATZH8(AnonymousClass4 anonymousClass4, ArrayList arrayList, ItemOptions itemOptions, View view) {
            anonymousClass4.getClass();
            new EmojiPacksAlert(new BaseFragment() {
                @Override
                public int getCurrentAccount() {
                    return this.currentAccount;
                }

                @Override
                public Context getContext() {
                    return SelfStoryViewsPage.this.getContext();
                }

                @Override
                public Theme.ResourcesProvider getResourceProvider() {
                    return SelfStoryViewsPage.this.resourcesProvider;
                }
            }, SelfStoryViewsPage.this.getContext(), SelfStoryViewsPage.this.resourcesProvider, arrayList).show();
            itemOptions.dismiss();
        }
    }

    class AnonymousClass5 extends SearchField {
        Runnable runnable;

        AnonymousClass5(Context context, boolean z, float f, Theme.ResourcesProvider resourcesProvider) {
            super(context, z, f, resourcesProvider);
        }

        @Override
        public void onTextChange(final String str) {
            Runnable runnable = this.runnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            this.runnable = new Runnable() {
                @Override
                public final void run() {
                    SelfStoryViewsPage.AnonymousClass5.m4379$r8$lambda$j9E3Ge0NIBwjm6H_1J7xWnyd4E(this.f$0, str);
                }
            };
            if (!TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(this.runnable, 300L);
            } else {
                this.runnable.run();
            }
            if (this.runnable != null) {
                SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
                if (selfStoryViewsPage.isSearchDebounce) {
                    return;
                }
                selfStoryViewsPage.isSearchDebounce = true;
                selfStoryViewsPage.listAdapter.updateRows();
                SelfStoryViewsPage selfStoryViewsPage2 = SelfStoryViewsPage.this;
                selfStoryViewsPage2.layoutManager.scrollToPositionWithOffset(0, -selfStoryViewsPage2.recyclerListView.getPaddingTop());
            }
        }

        public static void m4379$r8$lambda$j9E3Ge0NIBwjm6H_1J7xWnyd4E(AnonymousClass5 anonymousClass5, String str) {
            anonymousClass5.runnable = null;
            SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
            selfStoryViewsPage.isSearchDebounce = false;
            selfStoryViewsPage.state.searchQuery = str.toLowerCase();
            SelfStoryViewsPage.this.reload();
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        int paddingTop;
        View view = null;
        int i = -1;
        for (int i2 = 0; i2 < this.recyclerListView.getChildCount(); i2++) {
            View childAt = this.recyclerListView.getChildAt(i2);
            int childLayoutPosition = this.recyclerListView.getChildLayoutPosition(childAt);
            if (childLayoutPosition < i || i == -1) {
                view = childAt;
                i = childLayoutPosition;
            }
        }
        if (i == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else {
            paddingTop = i > 0 ? 0 : this.recyclerListView.getPaddingTop();
        }
        float f = paddingTop;
        if (this.topViewsContainer.getTranslationY() != f) {
            this.topViewsContainer.setTranslationY(f);
            onTopOffsetChanged(paddingTop);
        }
        this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, getMeasuredWidth() + AndroidUtilities.dp(6.0f), getMeasuredHeight());
        this.shadowDrawable.draw(canvas);
        if (this.checkAutoscroll) {
            this.checkAutoscroll = false;
            if (this.topViewsContainer.getTranslationY() != 0.0f && this.topViewsContainer.getTranslationY() != this.recyclerListView.getPaddingTop()) {
                if (this.topViewsContainer.getTranslationY() > this.recyclerListView.getPaddingTop() / 2.0f) {
                    this.scroller.smoothScrollBy((int) (-(this.recyclerListView.getPaddingTop() - this.topViewsContainer.getTranslationY())));
                } else {
                    this.scroller.smoothScrollBy((int) this.topViewsContainer.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.topViewsContainer.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.topViewsContainer.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.recyclerListView) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(this.TOP_PADDING), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public void checkLoadMore() {
        if (this.currentModel == null || this.layoutManager.findLastVisibleItemPosition() <= this.listAdapter.getItemCount() - 10) {
            return;
        }
        this.currentModel.loadNext();
    }

    public void setStoryItem(long j, SelfStoryViewsView.StoryItemInternal storyItemInternal) {
        this.dialogId = j;
        this.storyItem = storyItemInternal;
        updateViewsVisibility();
        updateViewState(false);
        if (storyItemInternal == null || storyItemInternal.storyItem == null) {
            return;
        }
        NotificationsController.getInstance(this.currentAccount).processSeenStoryReactions(j, storyItemInternal.storyItem.id);
    }

    private void updateViewsVisibility() {
        long j;
        boolean z;
        boolean z2;
        TL_stories.StoryViews storyViews;
        boolean z3;
        boolean z4;
        int i;
        this.showSearch = false;
        this.showContactsFilter = false;
        this.showReactionsSort = false;
        TL_stories.StoryItem storyItem = this.storyItem.storyItem;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2 != null) {
                int i2 = storyViews2.views_count;
                this.showSearch = i2 >= 15;
                this.showReactionsSort = storyViews2.reactions_count >= (BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 10);
                j = 0;
                this.showContactsFilter = (storyItem.dialogId < 0 || i2 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            } else {
                j = 0;
            }
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(this.currentAccount).storiesController.selfViewsModel.get(storyItem.dialogId);
            ViewsModel viewsModel = sparseArray != null ? (ViewsModel) sparseArray.get(storyItem.id) : null;
            this.defaultModel = viewsModel;
            TL_stories.StoryViews storyViews3 = storyItem.views;
            int i3 = storyViews3 == null ? 0 : storyViews3.views_count;
            if (viewsModel == null || (!viewsModel.isChannel && viewsModel.totalCount != i3)) {
                if (viewsModel != null) {
                    viewsModel.release();
                }
                z = true;
                ViewsModel viewsModel2 = new ViewsModel(this.currentAccount, this.dialogId, storyItem, true);
                this.defaultModel = viewsModel2;
                viewsModel2.reloadIfNeed(this.state, this.showContactsFilter, this.showReactionsSort);
                this.defaultModel.loadNext();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.defaultModel);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.defaultModel);
                    MessagesController.getInstance(this.currentAccount).storiesController.selfViewsModel.put(storyItem.dialogId, sparseArray2);
                }
            } else {
                viewsModel.reloadIfNeed(this.state, this.showContactsFilter, this.showReactionsSort);
                z = true;
            }
            ViewsModel viewsModel3 = this.currentModel;
            if (viewsModel3 != null) {
                viewsModel3.removeListener(this);
            }
            ViewsModel viewsModel4 = this.defaultModel;
            this.currentModel = viewsModel4;
            if (viewsModel4 != null && this.isAttachedToWindow) {
                viewsModel4.addListener(this);
            }
            ViewsModel viewsModel5 = this.currentModel;
            if (viewsModel5 == null || !viewsModel5.isExpiredViews || UserConfig.getInstance(this.currentAccount).isPremium()) {
                ViewsModel viewsModel6 = this.currentModel;
                if (!viewsModel6.loading && !viewsModel6.hasNext && viewsModel6.views.isEmpty() && this.currentModel.reactions.isEmpty() && TextUtils.isEmpty(this.currentModel.state.searchQuery)) {
                    this.showSearch = false;
                    this.showReactionsSort = false;
                    this.showContactsFilter = false;
                    TextView textView = this.titleView;
                    if (this.currentModel.isChannel) {
                        i = R.string.Reactions;
                    } else {
                        i = R.string.Viewers;
                    }
                    textView.setText(LocaleController.getString(i));
                    this.searchField.setVisibility(8);
                    this.headerView.setVisibility(8);
                    this.TOP_PADDING = 46;
                } else {
                    TL_stories.StoryViews storyViews4 = storyItem.views;
                    if (storyViews4 == null || storyViews4.views_count == 0) {
                        this.showSearch = false;
                        this.showReactionsSort = false;
                        this.showContactsFilter = false;
                        this.titleView.setText(LocaleController.getString(this.currentModel.isChannel ? R.string.Reactions : R.string.Viewers));
                        this.searchField.setVisibility(8);
                        this.headerView.setVisibility(8);
                        this.TOP_PADDING = 46;
                    } else {
                        this.headerView.setVisibility(0);
                        ViewsModel viewsModel7 = this.currentModel;
                        if (viewsModel7.showReactionOnly) {
                            this.titleView.setText(LocaleController.getString(viewsModel7.isChannel ? R.string.Reactions : R.string.Viewers));
                            this.showSearch = false;
                            this.showReactionsSort = false;
                            this.showContactsFilter = false;
                        } else {
                            if (viewsModel7.getCount() >= 20 || this.currentModel.getCount() >= storyItem.views.views_count) {
                                if (!this.currentModel.isChannel || storyItem.views.views_count < 15) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                this.showSearch = z2;
                                storyViews = storyItem.views;
                                if (storyViews.reactions_count >= (BuildVars.DEBUG_VERSION ? 5 : 10)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                this.showReactionsSort = z3;
                                if (storyItem.dialogId >= j || storyViews.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                this.showContactsFilter = z4;
                            } else {
                                ViewsModel viewsModel8 = this.currentModel;
                                if (!viewsModel8.loading && !viewsModel8.hasNext) {
                                    this.showSearch = false;
                                    this.showReactionsSort = false;
                                    this.showContactsFilter = false;
                                    this.showServerErrorText = z;
                                } else {
                                    if (this.currentModel.isChannel) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    this.showSearch = z2;
                                    storyViews = storyItem.views;
                                    if (storyViews.reactions_count >= (BuildVars.DEBUG_VERSION ? 5 : 10)) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    this.showReactionsSort = z3;
                                    if (storyItem.dialogId >= j) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    this.showContactsFilter = z4;
                                }
                            }
                            this.titleView.setText(LocaleController.getString(this.currentModel.isChannel ? R.string.Reactions : R.string.Viewers));
                        }
                        this.searchField.setVisibility(this.showSearch ? 0 : 8);
                        this.TOP_PADDING = this.showSearch ? 96 : 46;
                    }
                }
            } else {
                this.showSearch = false;
                this.showReactionsSort = false;
                this.showContactsFilter = false;
                TextView textView2 = this.titleView;
                if (this.currentModel.isChannel) {
                    i = R.string.Reactions;
                } else {
                    i = R.string.Viewers;
                }
                textView2.setText(LocaleController.getString(i));
                this.searchField.setVisibility(8);
                this.headerView.setVisibility(8);
                this.TOP_PADDING = 46;
            }
        } else {
            this.TOP_PADDING = 46;
            this.titleView.setText(LocaleController.getString(R.string.UploadingStory));
            this.searchField.setVisibility(8);
            this.headerView.setVisibility(8);
        }
        this.headerView.buttonContainer.setVisibility(this.showReactionsSort ? 0 : 8);
        this.headerView.allViewersView.setVisibility(this.showContactsFilter ? 0 : 8);
        this.headerView.contactsViewersView.setVisibility(this.showContactsFilter ? 0 : 8);
        if (!this.showContactsFilter) {
            this.titleView.setVisibility(0);
        } else {
            this.titleView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.shadowView.getLayoutParams()).topMargin = AndroidUtilities.dp(this.TOP_PADDING - 8);
        ((ViewGroup.MarginLayoutParams) this.shadowView2.getLayoutParams()).topMargin = AndroidUtilities.dp(this.TOP_PADDING - 17);
    }

    public static void preload(int i, long j, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i).storiesController.selfViewsModel.get(storyItem.dialogId);
        ViewsModel viewsModel = sparseArray == null ? null : (ViewsModel) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i2 = storyViews == null ? 0 : storyViews.views_count;
        if (viewsModel == null || viewsModel.totalCount != i2) {
            if (viewsModel != null) {
                viewsModel.release();
            }
            ViewsModel viewsModel2 = new ViewsModel(i, j, storyItem, true);
            viewsModel2.loadNext();
            if (sparseArray == null) {
                LongSparseArray longSparseArray = MessagesController.getInstance(i).storiesController.selfViewsModel;
                long j2 = storyItem.dialogId;
                sparseArray = new SparseArray();
                longSparseArray.put(j2, sparseArray);
            }
            sparseArray.put(storyItem.id, viewsModel2);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        ViewsModel viewsModel = this.currentModel;
        if (viewsModel != null) {
            viewsModel.addListener(this);
            this.currentModel.animateDateForUsers.clear();
        }
        this.listAdapter.updateRows();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                return SelfStoryViewsPage.this.recyclerListView.getPaddingBottom();
            }
        });
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        ViewsModel viewsModel = this.currentModel;
        if (viewsModel != null) {
            viewsModel.removeListener(this);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        Bulletin.removeDelegate(this);
    }

    public void onDataRecieved(ViewsModel viewsModel) {
        int itemCount = this.listAdapter.getItemCount();
        if (TextUtils.isEmpty(this.state.searchQuery) && !this.state.contactsOnly) {
            updateViewsVisibility();
        }
        this.listAdapter.updateRows();
        this.recyclerItemsEnterAnimator.showItemsAnimated(itemCount - 1);
        checkLoadMore();
        appendNewRepostsToList(viewsModel);
    }

    public boolean scrollToRepostCell(long j, int i) {
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter == null || listAdapter.items == null || this.layoutManager == null) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.listAdapter.items.size()) {
                i2 = -1;
                break;
            }
            Item item = (Item) this.listAdapter.items.get(i2);
            if (item != null) {
                TL_stories.StoryReaction storyReaction = item.reaction;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                    if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j && tL_storyReactionPublicRepost.story.id == i) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        if (i2 < 0) {
            return false;
        }
        int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        if (i2 >= iFindFirstVisibleItemPosition && i2 <= iFindLastVisibleItemPosition) {
            return false;
        }
        this.layoutManager.scrollToPositionWithOffset(i2, AndroidUtilities.dp(60.0f));
        return true;
    }

    private void appendNewRepostsToList(ViewsModel viewsModel) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        if (this.currentRepostsList == null || viewsModel == null || viewsModel != this.currentModel || (arrayList = viewsModel.reactions) == null || this.repostsListConsumedCount >= arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = this.repostsListConsumedCount; i < viewsModel.reactions.size(); i++) {
            TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) viewsModel.reactions.get(i);
            if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                arrayList2.add(storyItem);
            }
        }
        this.repostsListConsumedCount = viewsModel.reactions.size();
        if (arrayList2.isEmpty()) {
            return;
        }
        this.currentRepostsList.append(arrayList2);
    }

    public void setListBottomPadding(float f) {
        if (f != this.recyclerListView.getPaddingBottom()) {
            this.recyclerListView.setPadding(0, (int) f, 0, 0);
            this.recyclerListView.requestLayout();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int childAdapterPosition;
        TL_stories.PeerStories stories;
        int i3 = 0;
        if (i == NotificationCenter.storiesUpdated) {
            if (this.storyItem.uploadingStory == null || (stories = MessagesController.getInstance(this.currentAccount).storiesController.getStories(UserConfig.getInstance(this.currentAccount).clientUserId)) == null) {
                return;
            }
            while (i3 < stories.stories.size()) {
                TL_stories.StoryItem storyItem = stories.stories.get(i3);
                String str = storyItem.attachPath;
                if (str != null && str.equals(this.storyItem.uploadingStory.path)) {
                    SelfStoryViewsView.StoryItemInternal storyItemInternal = this.storyItem;
                    storyItemInternal.uploadingStory = null;
                    storyItemInternal.storyItem = storyItem;
                    setStoryItem(this.dialogId, storyItemInternal);
                    return;
                }
                i3++;
            }
            return;
        }
        if (i == NotificationCenter.storiesBlocklistUpdate) {
            while (i3 < this.recyclerListView.getChildCount()) {
                View childAt = this.recyclerListView.getChildAt(i3);
                if ((childAt instanceof ReactedUserHolderView) && (childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt)) >= 0 && childAdapterPosition < this.listAdapter.items.size()) {
                    ((ReactedUserHolderView) childAt).animateAlpha(isStoryShownToUser(((Item) this.listAdapter.items.get(childAdapterPosition)).view) ? 1.0f : 0.5f, true);
                }
                i3++;
            }
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.shadowDrawable = drawable;
    }

    public void onKeyboardShown() {
        this.recyclerListView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
        if (this.topViewsContainer.getTranslationY() != 0.0f) {
            this.scroller.smoothScrollBy((int) this.topViewsContainer.getTranslationY(), 250L, AdjustPanLayoutHelper.keyboardInterpolator);
        }
    }

    public boolean onBackPressed() {
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null && customPopupMenu.isShowing()) {
            this.popupMenu.dismiss();
            return true;
        }
        if (Math.abs(this.topViewsContainer.getTranslationY() - this.recyclerListView.getPaddingTop()) <= AndroidUtilities.dp(2.0f)) {
            return false;
        }
        this.recyclerListView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
        this.recyclerListView.smoothScrollToPosition(0);
        return true;
    }

    public float getTopOffset() {
        return this.topViewsContainer.getTranslationY();
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        ArrayList items;

        private ListAdapter() {
            this.items = new ArrayList();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FlickerLoadingView flickerLoadingView;
            int i2;
            View fixedHeightEmptyCell;
            switch (i) {
                case 0:
                    fixedHeightEmptyCell = new View(SelfStoryViewsPage.this.getContext()) {
                        @Override
                        protected void onMeasure(int i3, int i4) {
                            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(SelfStoryViewsPage.this.TOP_PADDING), 1073741824));
                        }
                    };
                    break;
                case 1:
                    int i3 = ReactedUserHolderView.STYLE_STORY;
                    SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
                    fixedHeightEmptyCell = new ReactedUserHolderView(i3, selfStoryViewsPage.currentAccount, selfStoryViewsPage.getContext(), SelfStoryViewsPage.this.resourcesProvider, false, true) {
                        @Override
                        public void openStory(long j, Runnable runnable) {
                            BaseFragment lastFragment = LaunchActivity.getLastFragment();
                            if (lastFragment == null) {
                                return;
                            }
                            StoryViewer storyViewerCreateOverlayStoryViewer = lastFragment.createOverlayStoryViewer();
                            storyViewerCreateOverlayStoryViewer.doOnAnimationReady(runnable);
                            storyViewerCreateOverlayStoryViewer.open(getContext(), j, StoriesListPlaceProvider.of(SelfStoryViewsPage.this.recyclerListView));
                        }
                    };
                    break;
                case 2:
                case 9:
                default:
                    fixedHeightEmptyCell = new View(SelfStoryViewsPage.this.getContext()) {
                        @Override
                        protected void onMeasure(int i4, int i5) {
                            int lastItemHeight = SelfStoryViewsPage.this.layoutManager.getLastItemHeight();
                            if (lastItemHeight >= SelfStoryViewsPage.this.recyclerListView.getPaddingTop() && !SelfStoryViewsPage.this.showSearch) {
                                lastItemHeight = 0;
                            }
                            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(lastItemHeight, 1073741824));
                        }
                    };
                    break;
                case 3:
                    fixedHeightEmptyCell = new FixedHeightEmptyCell(SelfStoryViewsPage.this.getContext(), 70);
                    break;
                case 4:
                    flickerLoadingView = new FlickerLoadingView(SelfStoryViewsPage.this.getContext(), SelfStoryViewsPage.this.resourcesProvider);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(28);
                    flickerLoadingView.showDate(false);
                    fixedHeightEmptyCell = flickerLoadingView;
                    break;
                case 5:
                case 7:
                case 8:
                case 10:
                    if (SelfStoryViewsPage.this.defaultModel.isExpiredViews) {
                        i2 = 12;
                    } else {
                        i2 = (i == 10 || i == 7 || i == 8 || i == 5) ? 1 : 0;
                    }
                    StickerEmptyView stickerEmptyView = new StickerEmptyView(SelfStoryViewsPage.this.getContext(), null, i2, SelfStoryViewsPage.this.resourcesProvider) {
                        @Override
                        protected void onMeasure(int i4, int i5) {
                            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec((SelfStoryViewsPage.this.measuerdHeight - SelfStoryViewsPage.this.recyclerListView.getPaddingTop()) - AndroidUtilities.dp(SelfStoryViewsPage.this.TOP_PADDING), 1073741824));
                        }
                    };
                    if (i == 7) {
                        stickerEmptyView.title.setVisibility(8);
                        stickerEmptyView.setSubtitle(LocaleController.getString(R.string.NoResult));
                    } else if (i == 8) {
                        stickerEmptyView.title.setVisibility(8);
                        stickerEmptyView.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                    } else if (i == 10) {
                        stickerEmptyView.title.setVisibility(0);
                        stickerEmptyView.title.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                        stickerEmptyView.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                    } else if (SelfStoryViewsPage.this.defaultModel.isExpiredViews) {
                        stickerEmptyView.title.setVisibility(8);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                        if (!MessagesController.getInstance(SelfStoryViewsPage.this.currentAccount).premiumFeaturesBlocked()) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            String string = LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription);
                            final SelfStoryViewsPage selfStoryViewsPage2 = SelfStoryViewsPage.this;
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(string, new Runnable() {
                                @Override
                                public final void run() {
                                    selfStoryViewsPage2.showPremiumAlert();
                                }
                            }));
                            String string2 = LocaleController.getString(R.string.LearnMore);
                            final SelfStoryViewsPage selfStoryViewsPage3 = SelfStoryViewsPage.this;
                            stickerEmptyView.createButtonLayout(string2, new Runnable() {
                                @Override
                                public final void run() {
                                    selfStoryViewsPage3.showPremiumAlert();
                                }
                            });
                        }
                        stickerEmptyView.subtitle.setText(spannableStringBuilder);
                    } else {
                        stickerEmptyView.title.setVisibility(0);
                        if (SelfStoryViewsPage.this.defaultModel.isChannel) {
                            stickerEmptyView.title.setText(LocaleController.getString(R.string.NoReactions));
                            stickerEmptyView.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                        } else {
                            stickerEmptyView.title.setText(LocaleController.getString(R.string.NoViews));
                            stickerEmptyView.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                        }
                    }
                    stickerEmptyView.showProgress(false, false);
                    fixedHeightEmptyCell = stickerEmptyView;
                    break;
                case 6:
                    flickerLoadingView = new FlickerLoadingView(SelfStoryViewsPage.this.getContext(), SelfStoryViewsPage.this.resourcesProvider);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setIgnoreHeightCheck(true);
                    flickerLoadingView.setItemsCount(20);
                    flickerLoadingView.setViewType(28);
                    flickerLoadingView.showDate(false);
                    fixedHeightEmptyCell = flickerLoadingView;
                    break;
                case 11:
                case 12:
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(SelfStoryViewsPage.this.getContext());
                    linksTextView.setTextSize(1, 13.0f);
                    linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, SelfStoryViewsPage.this.resourcesProvider));
                    linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, SelfStoryViewsPage.this.resourcesProvider));
                    int iDp = AndroidUtilities.dp(16.0f);
                    int iDp2 = AndroidUtilities.dp(21.0f);
                    linksTextView.setPadding(iDp2, iDp, iDp2, iDp);
                    linksTextView.setMaxLines(Integer.MAX_VALUE);
                    linksTextView.setGravity(17);
                    linksTextView.setDisablePaddingsOffsetY(true);
                    if (i == 11) {
                        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new Runnable() {
                            @Override
                            public final void run() {
                                SelfStoryViewsPage.this.showPremiumAlert();
                            }
                        }));
                    } else {
                        linksTextView.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                    }
                    linksTextView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    fixedHeightEmptyCell = linksTextView;
                    break;
            }
            return new RecyclerListView.Holder(fixedHeightEmptyCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Peer tL_peerUser;
            TLRPC.Message message;
            TLRPC.Chat chat;
            TLRPC.User user;
            ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL;
            String str;
            int i2;
            int i3;
            ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL2;
            String str2;
            TLRPC.Message message2;
            if (viewHolder.getItemViewType() != 1 || i < 0 || i >= this.items.size()) {
                return;
            }
            Item item = (Item) this.items.get(i);
            ReactedUserHolderView reactedUserHolderView = (ReactedUserHolderView) viewHolder.itemView;
            TL_stories.StoryView storyView = item.view;
            if (storyView != null) {
                if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                    tL_peerUser = storyView.peer_id;
                } else if ((storyView instanceof TL_stories.TL_storyViewPublicForward) && (message2 = storyView.message) != null) {
                    tL_peerUser = message2.peer_id;
                } else {
                    tL_peerUser = new TLRPC.TL_peerUser();
                    tL_peerUser.user_id = item.view.user_id;
                }
            } else {
                TL_stories.StoryReaction storyReaction = item.reaction;
                if (storyReaction != null) {
                    tL_peerUser = (!(storyReaction instanceof TL_stories.TL_storyReactionPublicForward) || (message = storyReaction.message) == null) ? storyReaction.peer_id : message.peer_id;
                } else {
                    tL_peerUser = null;
                }
            }
            long peerDialogId = DialogObject.getPeerDialogId(tL_peerUser);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(SelfStoryViewsPage.this.currentAccount).getUser(Long.valueOf(peerDialogId));
                chat = null;
            } else {
                chat = MessagesController.getInstance(SelfStoryViewsPage.this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                user = null;
            }
            boolean zRemove = SelfStoryViewsPage.this.defaultModel.animateDateForUsers.remove(Long.valueOf(peerDialogId));
            TL_stories.StoryView storyView2 = item.view;
            if (storyView2 != null) {
                TLRPC.Reaction reaction = storyView2.reaction;
                boolean z = (reaction == null || (visibleReactionFromTL2 = ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction)) == null || (str2 = visibleReactionFromTL2.emojicon) == null || !str2.equals("❤")) ? false : true;
                TL_stories.StoryView storyView3 = item.view;
                if (storyView3 instanceof TL_stories.TL_storyViewPublicRepost) {
                    TLRPC.User user2 = user;
                    i2 = 11;
                    i3 = 12;
                    reactedUserHolderView.setUserReaction(user2, null, null, z, 0L, storyView3.story, false, true, zRemove);
                } else {
                    TLRPC.Reaction reaction2 = null;
                    i2 = 11;
                    TLRPC.User user3 = user;
                    i3 = 12;
                    if (storyView3 instanceof TL_stories.TL_storyViewPublicForward) {
                        TLRPC.Message message3 = storyView3.message;
                        long j = message3 != null ? message3.date : 0L;
                        SelfStoryViewsView.StoryItemInternal storyItemInternal = SelfStoryViewsPage.this.storyItem;
                        reactedUserHolderView.setUserReaction(user3, null, null, z, j, storyItemInternal == null ? null : storyItemInternal.storyItem, true, true, zRemove);
                    } else {
                        if (!z) {
                            reaction2 = storyView3.reaction;
                        }
                        reactedUserHolderView.setUserReaction(user3, null, reaction2, z, storyView3.date, null, false, true, zRemove);
                    }
                }
                int i4 = i < this.items.size() + (-1) ? ((Item) this.items.get(i + 1)).viewType : -1;
                reactedUserHolderView.drawDivider = i4 == 1 || i4 == i2 || i4 == i3;
                reactedUserHolderView.animateAlpha(SelfStoryViewsPage.this.isStoryShownToUser(item.view) ? 1.0f : 0.5f, false);
                return;
            }
            TLRPC.Reaction reaction3 = null;
            TLRPC.User user4 = user;
            TL_stories.StoryReaction storyReaction2 = item.reaction;
            if (storyReaction2 != null) {
                if (storyReaction2 instanceof TL_stories.TL_storyReaction) {
                    TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction2;
                    TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                    boolean z2 = (reaction4 == null || (visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction4)) == null || (str = visibleReactionFromTL.emojicon) == null || !str.equals("❤")) ? false : true;
                    if (!z2) {
                        reaction3 = tL_storyReaction.reaction;
                    }
                    reactedUserHolderView.setUserReaction(user4, chat, reaction3, z2, tL_storyReaction.date, null, false, true, zRemove);
                } else if (storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) {
                    reactedUserHolderView.setUserReaction(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction2).story, false, true, zRemove);
                } else if (storyReaction2 instanceof TL_stories.TL_storyReactionPublicForward) {
                    TLRPC.Message message4 = storyReaction2.message;
                    long j2 = message4 != null ? message4.date : 0L;
                    SelfStoryViewsView.StoryItemInternal storyItemInternal2 = SelfStoryViewsPage.this.storyItem;
                    reactedUserHolderView.setUserReaction(user4, chat, null, false, j2, storyItemInternal2 == null ? null : storyItemInternal2.storyItem, true, true, zRemove);
                }
                int i5 = i < this.items.size() - 1 ? ((Item) this.items.get(i + 1)).viewType : -1;
                reactedUserHolderView.drawDivider = i5 == 1 || i5 == 11 || i5 == 12;
                reactedUserHolderView.animateAlpha(1.0f, false);
            }
        }

        @Override
        public int getItemCount() {
            return this.items.size();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        public void updateRows() {
            this.items.clear();
            SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
            ViewsModel viewsModel = selfStoryViewsPage.currentModel;
            int i = 6;
            int i2 = 0;
            if (selfStoryViewsPage.isSearchDebounce) {
                this.items.add(new Item(i2));
                this.items.add(new Item(i));
            } else {
                this.items.add(new Item(i2));
                if (viewsModel != null && viewsModel.getCount() <= 0 && (viewsModel.isExpiredViews || (!viewsModel.loading && !viewsModel.hasNext))) {
                    if (!TextUtils.isEmpty(viewsModel.state.searchQuery)) {
                        this.items.add(new Item(7));
                    } else {
                        int i3 = 5;
                        if (viewsModel.isExpiredViews) {
                            this.items.add(new Item(i3));
                        } else {
                            int i4 = viewsModel.totalCount;
                            if (i4 > 0 && viewsModel.state.contactsOnly) {
                                this.items.add(new Item(8));
                            } else if (i4 > 0) {
                                this.items.add(new Item(10));
                            } else {
                                this.items.add(new Item(i3));
                            }
                        }
                    }
                } else {
                    if (viewsModel != null) {
                        int i5 = 1;
                        if (viewsModel.isChannel) {
                            while (i2 < viewsModel.reactions.size()) {
                                this.items.add(new Item(i5, (TL_stories.StoryReaction) viewsModel.reactions.get(i2)));
                                i2++;
                            }
                        } else {
                            while (i2 < viewsModel.views.size()) {
                                this.items.add(new Item(i5, (TL_stories.StoryView) viewsModel.views.get(i2)));
                                i2++;
                            }
                        }
                    }
                    if (viewsModel != null && (viewsModel.loading || viewsModel.hasNext)) {
                        if (viewsModel.getCount() <= 0) {
                            this.items.add(new Item(i));
                        } else {
                            this.items.add(new Item(4));
                        }
                    } else if (viewsModel != null && viewsModel.showReactionOnly) {
                        this.items.add(new Item(11));
                    } else if (viewsModel != null && viewsModel.getCount() < viewsModel.totalCount && TextUtils.isEmpty(viewsModel.state.searchQuery) && !viewsModel.state.contactsOnly) {
                        this.items.add(new Item(12));
                    }
                }
            }
            this.items.add(new Item(9));
            notifyDataSetChanged();
        }

        @Override
        public int getItemViewType(int i) {
            return ((Item) this.items.get(i)).viewType;
        }
    }

    public void showPremiumAlert() {
        new PremiumFeatureBottomSheet(this.storyViewer.fragment, 14, false).show();
    }

    static class Item {
        final TL_stories.StoryReaction reaction;
        final TL_stories.StoryView view;
        final int viewType;

        private Item(int i) {
            this.viewType = i;
            this.view = null;
            this.reaction = null;
        }

        private Item(int i, TL_stories.StoryView storyView) {
            this.viewType = i;
            this.view = storyView;
            this.reaction = null;
        }

        private Item(int i, TL_stories.StoryReaction storyReaction) {
            this.viewType = i;
            this.view = null;
            this.reaction = storyReaction;
        }
    }

    public static class ViewsModel {
        int currentAccount;
        private long dialogId;
        boolean initial;
        public final boolean isChannel;
        boolean isExpiredViews;
        boolean loading;
        String offset;
        boolean showReactionOnly;
        TL_stories.StoryItem storyItem;
        public int totalCount;
        boolean useLocalFilters;
        ArrayList views = new ArrayList();
        ArrayList originalViews = new ArrayList();
        ArrayList reactions = new ArrayList();
        boolean hasNext = true;
        int reqId = -1;
        HashSet animateDateForUsers = new HashSet();
        ArrayList listeners = new ArrayList();
        FiltersState state = new FiltersState();

        public int getCount() {
            return (this.isChannel ? this.reactions : this.views).size();
        }

        public ViewsModel(int i, long j, TL_stories.StoryItem storyItem, boolean z) {
            TL_stories.StoryViews storyViews;
            this.currentAccount = i;
            this.storyItem = storyItem;
            this.isChannel = j < 0;
            this.dialogId = j;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i2 = storyViews2 == null ? 0 : storyViews2.views_count;
            this.totalCount = i2;
            if (i2 < 200) {
                this.useLocalFilters = true;
            }
            boolean z2 = StoriesUtilities.hasExpiredViews(storyItem) && !UserConfig.getInstance(i).isPremium();
            this.isExpiredViews = z2;
            if (z2 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
                this.isExpiredViews = false;
                this.showReactionOnly = true;
            }
            if (this.isExpiredViews) {
                return;
            }
            this.initial = true;
            if (storyItem.views == null || !z) {
                return;
            }
            for (int i3 = 0; i3 < storyItem.views.recent_viewers.size(); i3++) {
                Long l = storyItem.views.recent_viewers.get(i3);
                long jLongValue = l.longValue();
                if (MessagesController.getInstance(i).getUser(l) != null) {
                    TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                    tL_storyView.user_id = jLongValue;
                    tL_storyView.date = 0;
                    this.views.add(tL_storyView);
                }
            }
        }

        public void loadNext() {
            if (this.loading || !this.hasNext || this.isExpiredViews) {
                return;
            }
            if (this.isChannel) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = this.state.sortByReactions;
                tL_getStoryReactionsList.id = this.storyItem.id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                tL_getStoryReactionsList.limit = (this.initial || this.reactions.size() < 20) ? 20 : 100;
                String str = this.offset;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.loading = true;
                FileLog.d("SelfStoryViewsPage reactions load next " + this.storyItem.id + " " + this.initial + " offset=" + tL_getStoryReactionsList.offset);
                int iSendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_getStoryReactionsList, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        SelfStoryViewsPage.ViewsModel.$r8$lambda$_E22XikXnCLEG6gRbPOU5YYRs4Y(this.f$0, iArr, tLObject, tL_error);
                    }
                });
                this.reqId = iSendRequest;
                final int[] iArr = {iSendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.id = this.storyItem.id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            if (this.useLocalFilters) {
                tL_stories_getStoryViewsList.q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = this.state.searchQuery;
                tL_stories_getStoryViewsList.q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
                FiltersState filtersState = this.state;
                tL_stories_getStoryViewsList.just_contacts = filtersState.contactsOnly;
                tL_stories_getStoryViewsList.reactions_first = filtersState.sortByReactions;
            }
            tL_stories_getStoryViewsList.limit = (this.initial || this.views.size() < 20) ? 20 : 100;
            String str3 = this.offset;
            tL_stories_getStoryViewsList.offset = str3;
            if (str3 == null) {
                tL_stories_getStoryViewsList.offset = "";
            }
            this.loading = true;
            FileLog.d("SelfStoryViewsPage load next " + this.storyItem.id + " " + this.initial + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            int iSendRequest2 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    SelfStoryViewsPage.ViewsModel.m4383$r8$lambda$xYa9qoxbCnqPa1cWR01KJrOMkM(this.f$0, iArr, tLObject, tL_error);
                }
            });
            this.reqId = iSendRequest2;
            final int[] iArr2 = {iSendRequest2};
        }

        public static void $r8$lambda$_E22XikXnCLEG6gRbPOU5YYRs4Y(final ViewsModel viewsModel, final int[] iArr, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            viewsModel.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SelfStoryViewsPage.ViewsModel.m4382$r8$lambda$0vPhcFDsVZ7x0rvXatDJWkao10(this.f$0, iArr, tLObject, tL_error);
                }
            });
        }

        public static void m4382$r8$lambda$0vPhcFDsVZ7x0rvXatDJWkao10(ViewsModel viewsModel, int[] iArr, TLObject tLObject, TLRPC.TL_error tL_error) {
            viewsModel.getClass();
            if (iArr[0] != viewsModel.reqId) {
                FileLog.d("SelfStoryViewsPage reactions " + viewsModel.storyItem.id + " localId != reqId");
                return;
            }
            viewsModel.loading = false;
            viewsModel.reqId = -1;
            if (tLObject != null) {
                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject;
                MessagesController.getInstance(viewsModel.currentAccount).putUsers(tL_storyReactionsList.users, false);
                MessagesController.getInstance(viewsModel.currentAccount).putChats(tL_storyReactionsList.chats, false);
                MessagesStorage.getInstance(viewsModel.currentAccount).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                if (viewsModel.initial) {
                    viewsModel.initial = false;
                    for (int i = 0; i < viewsModel.reactions.size(); i++) {
                        viewsModel.animateDateForUsers.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) viewsModel.reactions.get(i)).peer_id)));
                    }
                    viewsModel.reactions.clear();
                    viewsModel.originalViews.clear();
                }
                viewsModel.reactions.addAll(tL_storyReactionsList.reactions);
                if (!tL_storyReactionsList.reactions.isEmpty()) {
                    viewsModel.hasNext = true;
                } else {
                    viewsModel.hasNext = false;
                }
                String str = tL_storyReactionsList.next_offset;
                viewsModel.offset = str;
                if (TextUtils.isEmpty(str)) {
                    viewsModel.hasNext = false;
                }
                TL_stories.StoryItem storyItem = viewsModel.storyItem;
                if (storyItem.views == null) {
                    storyItem.views = new TL_stories.TL_storyViews();
                }
                int i2 = viewsModel.totalCount;
                int i3 = tL_storyReactionsList.count;
                boolean z = i2 != i3;
                viewsModel.totalCount = i3;
                if (z) {
                    NotificationCenter.getInstance(viewsModel.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
                }
            } else {
                if (tL_error != null && "MSG_ID_INVALID".equals(tL_error.text)) {
                    viewsModel.totalCount = 0;
                }
                viewsModel.hasNext = false;
            }
            FileLog.d("SelfStoryViewsPage reactions " + viewsModel.storyItem.id + " response  totalItems " + viewsModel.reactions.size() + " has next " + viewsModel.hasNext);
            for (int i4 = 0; i4 < viewsModel.listeners.size(); i4++) {
                ((SelfStoryViewsPage) viewsModel.listeners.get(i4)).onDataRecieved(viewsModel);
            }
            if (viewsModel.reactions.size() >= 20 || !viewsModel.hasNext) {
                return;
            }
            viewsModel.loadNext();
        }

        public static void m4383$r8$lambda$xYa9qoxbCnqPa1cWR01KJrOMkM(final ViewsModel viewsModel, final int[] iArr, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            viewsModel.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SelfStoryViewsPage.ViewsModel.$r8$lambda$lnNFYNV5p01PbZEf9Z1_ndbo6JY(this.f$0, iArr, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$lnNFYNV5p01PbZEf9Z1_ndbo6JY(ViewsModel viewsModel, int[] iArr, TLObject tLObject, TLRPC.TL_error tL_error) {
            boolean z;
            viewsModel.getClass();
            if (iArr[0] != viewsModel.reqId) {
                FileLog.d("SelfStoryViewsPage " + viewsModel.storyItem.id + " localId != reqId");
                return;
            }
            viewsModel.loading = false;
            viewsModel.reqId = -1;
            if (tLObject != null) {
                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject;
                MessagesController.getInstance(viewsModel.currentAccount).getStoriesController().applyStoryViewsBlocked(storyViewsList);
                MessagesController.getInstance(viewsModel.currentAccount).putUsers(storyViewsList.users, false);
                MessagesController.getInstance(viewsModel.currentAccount).putChats(storyViewsList.chats, false);
                boolean z2 = true;
                MessagesStorage.getInstance(viewsModel.currentAccount).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                if (viewsModel.initial) {
                    viewsModel.initial = false;
                    for (int i = 0; i < viewsModel.views.size(); i++) {
                        viewsModel.animateDateForUsers.add(Long.valueOf(((TL_stories.StoryView) viewsModel.views.get(i)).user_id));
                    }
                    viewsModel.views.clear();
                    viewsModel.originalViews.clear();
                }
                if (viewsModel.useLocalFilters) {
                    viewsModel.originalViews.addAll(storyViewsList.views);
                    viewsModel.applyLocalFilter();
                } else {
                    viewsModel.views.addAll(storyViewsList.views);
                }
                if (!storyViewsList.views.isEmpty()) {
                    viewsModel.hasNext = true;
                } else {
                    viewsModel.hasNext = false;
                }
                String str = storyViewsList.next_offset;
                viewsModel.offset = str;
                if (TextUtils.isEmpty(str)) {
                    viewsModel.hasNext = false;
                }
                TL_stories.StoryItem storyItem = viewsModel.storyItem;
                if (storyItem.views == null) {
                    storyItem.views = new TL_stories.TL_storyViews();
                }
                int i2 = storyViewsList.count;
                TL_stories.StoryViews storyViews = viewsModel.storyItem.views;
                if (i2 > storyViews.views_count) {
                    storyViews.recent_viewers.clear();
                    for (int i3 = 0; i3 < Math.min(3, storyViewsList.users.size()); i3++) {
                        viewsModel.storyItem.views.recent_viewers.add(Long.valueOf(storyViewsList.users.get(i3).id));
                    }
                    viewsModel.storyItem.views.views_count = storyViewsList.count;
                    z = true;
                } else {
                    z = false;
                }
                TL_stories.StoryViews storyViews2 = viewsModel.storyItem.views;
                int i4 = storyViews2.reactions_count;
                int i5 = storyViewsList.reactions_count;
                if (i4 != i5) {
                    storyViews2.reactions_count = i5;
                } else {
                    z2 = z;
                }
                if (z2) {
                    NotificationCenter.getInstance(viewsModel.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
                }
            } else {
                if (tL_error != null && "MSG_ID_INVALID".equals(tL_error.text)) {
                    viewsModel.totalCount = 0;
                }
                viewsModel.hasNext = false;
            }
            FileLog.d("SelfStoryViewsPage " + viewsModel.storyItem.id + " response  totalItems " + viewsModel.views.size() + " has next " + viewsModel.hasNext);
            for (int i6 = 0; i6 < viewsModel.listeners.size(); i6++) {
                ((SelfStoryViewsPage) viewsModel.listeners.get(i6)).onDataRecieved(viewsModel);
            }
            if (viewsModel.views.size() >= 20 || !viewsModel.hasNext) {
                return;
            }
            viewsModel.loadNext();
        }

        private void applyLocalFilter() {
            String lowerCase;
            String translitString;
            String str;
            String str2;
            if (this.isChannel) {
                return;
            }
            this.views.clear();
            FiltersState filtersState = this.state;
            if (filtersState.contactsOnly || !TextUtils.isEmpty(filtersState.searchQuery)) {
                if (TextUtils.isEmpty(this.state.searchQuery)) {
                    lowerCase = null;
                    translitString = null;
                    str = null;
                    str2 = null;
                } else {
                    lowerCase = this.state.searchQuery.trim().toLowerCase();
                    translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    str = " " + lowerCase;
                    str2 = " " + translitString;
                }
                for (int i = 0; i < this.originalViews.size(); i++) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TL_stories.StoryView) this.originalViews.get(i)).user_id));
                    boolean z = !this.state.contactsOnly || (user != null && user.contact);
                    if (z && lowerCase != null) {
                        String lowerCase2 = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                        String publicUsername = UserObject.getPublicUsername(user);
                        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase2);
                        if ((lowerCase2 == null || (!lowerCase2.startsWith(lowerCase) && !lowerCase2.contains(str))) && ((strTranslitSafe == null || (!strTranslitSafe.startsWith(translitString) && !strTranslitSafe.contains(str2))) && (publicUsername == null || (!publicUsername.startsWith(translitString) && !publicUsername.contains(str2))))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.views.add((TL_stories.StoryView) this.originalViews.get(i));
                    }
                }
            } else {
                this.views.addAll(this.originalViews);
            }
            if (this.state.sortByReactions) {
                return;
            }
            Collections.sort(this.views, Comparator$CC.comparingInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return SelfStoryViewsPage.ViewsModel.m4384$r8$lambda$keJViVULdsq7Tmm19unD9O4elA((TL_stories.StoryView) obj);
                }
            }));
        }

        public static int m4384$r8$lambda$keJViVULdsq7Tmm19unD9O4elA(TL_stories.StoryView storyView) {
            return -storyView.date;
        }

        public void addListener(SelfStoryViewsPage selfStoryViewsPage) {
            if (this.listeners.contains(selfStoryViewsPage)) {
                return;
            }
            this.listeners.add(selfStoryViewsPage);
        }

        public void removeListener(SelfStoryViewsPage selfStoryViewsPage) {
            this.listeners.remove(selfStoryViewsPage);
        }

        public void release() {
            if (this.reqId >= 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, false);
            }
            this.reqId = -1;
        }

        public void reloadIfNeed(FiltersState filtersState, boolean z, boolean z2) {
            FiltersState filtersState2 = new FiltersState();
            filtersState2.set(filtersState);
            if (!z) {
                filtersState2.contactsOnly = false;
            }
            if (!z2) {
                filtersState2.sortByReactions = true;
            }
            if (this.state.equals(filtersState2)) {
                return;
            }
            this.state.set(filtersState2);
            if (!this.isChannel && this.useLocalFilters) {
                applyLocalFilter();
                for (int i = 0; i < this.listeners.size(); i++) {
                    ((SelfStoryViewsPage) this.listeners.get(i)).onDataRecieved(this);
                }
                return;
            }
            release();
            this.views.clear();
            this.reactions.clear();
            this.initial = true;
            this.loading = false;
            this.hasNext = true;
            this.offset = "";
            loadNext();
        }
    }

    class HeaderView extends FrameLayout {
        TextView allViewersView;
        float animateFromAlpha1;
        float animateFromAlpha2;
        RectF animateFromRect;
        float animationProgress;
        ValueAnimator animator;
        private final LinearLayout buttonContainer;
        TextView contactsViewersView;
        boolean lastSortType;
        RectF rectF;
        ReplaceableIconDrawable replacableDrawable;
        int selected;
        Paint selectedPaint;

        public HeaderView(Context context) {
            super(context);
            this.selectedPaint = new Paint(1);
            this.animateFromRect = new RectF();
            this.rectF = new RectF();
            this.animationProgress = 1.0f;
            Paint paint = this.selectedPaint;
            int i = Theme.key_listSelector;
            paint.setColor(Theme.getColor(i, SelfStoryViewsPage.this.resourcesProvider));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            TextView textView = new TextView(context);
            this.allViewersView = textView;
            textView.setText(LocaleController.getString(R.string.AllViewers));
            TextView textView2 = this.allViewersView;
            int i2 = Theme.key_dialogTextBlack;
            textView2.setTextColor(Theme.getColor(i2, SelfStoryViewsPage.this.resourcesProvider));
            this.allViewersView.setTextSize(1, 14.0f);
            this.allViewersView.setTypeface(AndroidUtilities.bold());
            this.allViewersView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            TextView textView3 = new TextView(context);
            this.contactsViewersView = textView3;
            textView3.setText(LocaleController.getString(R.string.Contacts));
            this.contactsViewersView.setTextColor(Theme.getColor(i2, SelfStoryViewsPage.this.resourcesProvider));
            this.contactsViewersView.setTextSize(1, 14.0f);
            this.contactsViewersView.setTypeface(AndroidUtilities.bold());
            this.contactsViewersView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
            linearLayout.addView(this.allViewersView, LayoutHelper.createLinear(-2, -2, 0, 13, 0, 0, 0));
            linearLayout.addView(this.contactsViewersView, LayoutHelper.createLinear(-2, -2, 0, 0, 0, 0, 0));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.buttonContainer = linearLayout2;
            linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
            linearLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(26.0f), Theme.getColor(i, SelfStoryViewsPage.this.resourcesProvider)));
            linearLayout2.setOrientation(0);
            ReplaceableIconDrawable replaceableIconDrawable = new ReplaceableIconDrawable(getContext());
            this.replacableDrawable = replaceableIconDrawable;
            replaceableIconDrawable.exactlyBounds = true;
            this.lastSortType = true;
            replaceableIconDrawable.setIcon(R.drawable.menu_views_reactions3, false);
            ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageDrawable(this.replacableDrawable);
            imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            linearLayout2.addView(imageView, LayoutHelper.createLinear(26, 26));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(R.drawable.arrow_more);
            linearLayout2.addView(imageView2, LayoutHelper.createLinear(16, 26));
            addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f));
            addView(linearLayout2, LayoutHelper.createFrame(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
            this.allViewersView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SelfStoryViewsPage.HeaderView.$r8$lambda$LF3A_XquY3L0fhC1LU_lr5MGhEA(this.f$0, view);
                }
            });
            this.contactsViewersView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SelfStoryViewsPage.HeaderView.$r8$lambda$Jzw98EGXyQFldFCZGJuumkm2lK4(this.f$0, view);
                }
            });
            linearLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SelfStoryViewsPage.HeaderView.$r8$lambda$MV1CvIbYp2XaTd9EXyrU8ga3lHY(this.f$0, view);
                }
            });
        }

        public static void $r8$lambda$LF3A_XquY3L0fhC1LU_lr5MGhEA(HeaderView headerView, View view) {
            SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
            FiltersState filtersState = selfStoryViewsPage.state;
            if (filtersState.contactsOnly) {
                filtersState.contactsOnly = false;
                selfStoryViewsPage.updateViewState(true);
                SelfStoryViewsPage.this.reload();
            }
        }

        public static void $r8$lambda$Jzw98EGXyQFldFCZGJuumkm2lK4(HeaderView headerView, View view) {
            SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
            FiltersState filtersState = selfStoryViewsPage.state;
            if (filtersState.contactsOnly) {
                return;
            }
            filtersState.contactsOnly = true;
            selfStoryViewsPage.updateViewState(true);
            SelfStoryViewsPage.this.reload();
        }

        class AnonymousClass1 extends CustomPopupMenu {
            @Override
            protected void onDismissed() {
            }

            AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
                super(context, resourcesProvider, z);
            }

            @Override
            protected void onCreate(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
                int i;
                actionBarPopupWindowLayout.setBackgroundColor(ColorUtils.blendARGB(-16777216, -1, 0.18f));
                SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
                ViewsModel viewsModel = selfStoryViewsPage.currentModel;
                boolean z = viewsModel != null && viewsModel.isChannel;
                if (z) {
                    i = R.drawable.menu_views_reposts;
                } else {
                    i = selfStoryViewsPage.state.sortByReactions ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions;
                }
                ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, i, LocaleController.getString(z ? R.string.SortByReposts : R.string.SortByReactions), false, SelfStoryViewsPage.this.resourcesProvider);
                if (!SelfStoryViewsPage.this.state.sortByReactions) {
                    actionBarMenuSubItemAddItem.setAlpha(0.5f);
                }
                actionBarMenuSubItemAddItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        SelfStoryViewsPage.HeaderView.AnonymousClass1.$r8$lambda$HALq8ltTb_gGNJQL_l8Irbmn1CI(this.f$0, view);
                    }
                });
                ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, !SelfStoryViewsPage.this.state.sortByReactions ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, SelfStoryViewsPage.this.resourcesProvider);
                if (SelfStoryViewsPage.this.state.sortByReactions) {
                    actionBarMenuSubItemAddItem2.setAlpha(0.5f);
                }
                actionBarMenuSubItemAddItem2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        SelfStoryViewsPage.HeaderView.AnonymousClass1.m4380$r8$lambda$o_T_lwhkJ1t8qNLae63KGjnyw(this.f$0, view);
                    }
                });
                ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(HeaderView.this.getContext(), SelfStoryViewsPage.this.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                gapView.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindowLayout.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
                ActionBarMenuItem.addText(actionBarPopupWindowLayout, LocaleController.getString(z ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription), SelfStoryViewsPage.this.resourcesProvider);
            }

            public static void $r8$lambda$HALq8ltTb_gGNJQL_l8Irbmn1CI(AnonymousClass1 anonymousClass1, View view) {
                SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
                FiltersState filtersState = selfStoryViewsPage.state;
                if (!filtersState.sortByReactions) {
                    FiltersState filtersState2 = selfStoryViewsPage.sharedFilterState;
                    if (filtersState2 != null) {
                        filtersState.sortByReactions = true;
                        filtersState2.sortByReactions = true;
                    } else {
                        filtersState.sortByReactions = true;
                    }
                    selfStoryViewsPage.updateViewState(true);
                    SelfStoryViewsPage.this.reload();
                    SelfStoryViewsPage selfStoryViewsPage2 = SelfStoryViewsPage.this;
                    selfStoryViewsPage2.onSharedStateChanged.accept(selfStoryViewsPage2);
                }
                if (SelfStoryViewsPage.this.popupMenu != null) {
                    SelfStoryViewsPage.this.popupMenu.dismiss();
                }
            }

            public static void m4380$r8$lambda$o_T_lwhkJ1t8qNLae63KGjnyw(AnonymousClass1 anonymousClass1, View view) {
                SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
                FiltersState filtersState = selfStoryViewsPage.state;
                if (filtersState.sortByReactions) {
                    FiltersState filtersState2 = selfStoryViewsPage.sharedFilterState;
                    if (filtersState2 != null) {
                        filtersState.sortByReactions = false;
                        filtersState2.sortByReactions = false;
                    } else {
                        filtersState.sortByReactions = false;
                    }
                    selfStoryViewsPage.updateViewState(true);
                    SelfStoryViewsPage.this.reload();
                    SelfStoryViewsPage selfStoryViewsPage2 = SelfStoryViewsPage.this;
                    selfStoryViewsPage2.onSharedStateChanged.accept(selfStoryViewsPage2);
                }
                if (SelfStoryViewsPage.this.popupMenu != null) {
                    SelfStoryViewsPage.this.popupMenu.dismiss();
                }
            }
        }

        public static void $r8$lambda$MV1CvIbYp2XaTd9EXyrU8ga3lHY(HeaderView headerView, View view) {
            SelfStoryViewsPage.this.popupMenu = headerView.new AnonymousClass1(headerView.getContext(), SelfStoryViewsPage.this.resourcesProvider, false);
            CustomPopupMenu customPopupMenu = SelfStoryViewsPage.this.popupMenu;
            LinearLayout linearLayout = headerView.buttonContainer;
            customPopupMenu.show(linearLayout, 0, (-linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float fLerp;
            if (SelfStoryViewsPage.this.showContactsFilter) {
                float fLerp2 = 0.5f;
                if (this.selected == 0) {
                    this.allViewersView.getHitRect(AndroidUtilities.rectTmp2);
                    fLerp = 0.5f;
                    fLerp2 = 1.0f;
                } else {
                    this.contactsViewersView.getHitRect(AndroidUtilities.rectTmp2);
                    fLerp = 1.0f;
                }
                this.rectF.set(AndroidUtilities.rectTmp2);
                float f = this.animationProgress;
                if (f != 1.0f) {
                    fLerp2 = AndroidUtilities.lerp(this.animateFromAlpha1, fLerp2, f);
                    fLerp = AndroidUtilities.lerp(this.animateFromAlpha2, fLerp, this.animationProgress);
                    RectF rectF = this.animateFromRect;
                    RectF rectF2 = this.rectF;
                    AndroidUtilities.lerp(rectF, rectF2, this.animationProgress, rectF2);
                }
                this.allViewersView.setAlpha(fLerp2);
                this.contactsViewersView.setAlpha(fLerp);
                float fHeight = this.rectF.height() / 2.0f;
                canvas.drawRoundRect(this.rectF, fHeight, fHeight, this.selectedPaint);
            }
            super.dispatchDraw(canvas);
        }

        public void setState(boolean z, boolean z2) {
            if (z == this.selected && z2) {
                return;
            }
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.animator.cancel();
            }
            this.selected = z ? 1 : 0;
            if (!z2) {
                this.animationProgress = 1.0f;
                invalidate();
                return;
            }
            this.animateFromRect.set(this.rectF);
            this.animateFromAlpha1 = this.allViewersView.getAlpha();
            this.animateFromAlpha2 = this.contactsViewersView.getAlpha();
            this.animationProgress = 0.0f;
            invalidate();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelfStoryViewsPage.HeaderView.$r8$lambda$sy_SLrOzKoRCz9rY1P1FgKvwwMs(this.f$0, valueAnimator2);
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    HeaderView headerView = HeaderView.this;
                    headerView.animator = null;
                    headerView.animationProgress = 1.0f;
                    headerView.invalidate();
                }
            });
            this.animator.setDuration(250L);
            this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animator.start();
        }

        public static void $r8$lambda$sy_SLrOzKoRCz9rY1P1FgKvwwMs(HeaderView headerView, ValueAnimator valueAnimator) {
            headerView.animationProgress = ((Float) headerView.animator.getAnimatedValue()).floatValue();
            headerView.invalidate();
        }
    }

    public void reload() {
        ViewsModel viewsModel = this.currentModel;
        if (viewsModel != null) {
            viewsModel.removeListener(this);
        }
        ViewsModel viewsModel2 = this.defaultModel;
        this.currentModel = viewsModel2;
        if (viewsModel2 == null) {
            return;
        }
        viewsModel2.addListener(this);
        this.currentModel.reloadIfNeed(this.state, this.showContactsFilter, this.showReactionsSort);
        this.listAdapter.updateRows();
        this.layoutManager.scrollToPositionWithOffset(0, (int) (getTopOffset() - this.recyclerListView.getPaddingTop()));
    }

    public void updateViewState(boolean z) {
        int i;
        this.headerView.setState(this.state.contactsOnly, z);
        HeaderView headerView = this.headerView;
        boolean z2 = this.state.sortByReactions;
        headerView.lastSortType = z2;
        ReplaceableIconDrawable replaceableIconDrawable = headerView.replacableDrawable;
        if (z2) {
            ViewsModel viewsModel = this.currentModel;
            i = (viewsModel == null || !viewsModel.isChannel) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i = R.drawable.menu_views_recent3;
        }
        replaceableIconDrawable.setIcon(i, z);
    }

    public static class FiltersState {
        boolean contactsOnly;
        String searchQuery;
        boolean sortByReactions = true;

        public void set(FiltersState filtersState) {
            this.sortByReactions = filtersState.sortByReactions;
            this.contactsOnly = filtersState.contactsOnly;
            this.searchQuery = filtersState.searchQuery;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                FiltersState filtersState = (FiltersState) obj;
                boolean z = (TextUtils.isEmpty(this.searchQuery) && TextUtils.isEmpty(filtersState.searchQuery)) || Objects.equals(this.searchQuery, filtersState.searchQuery);
                if (this.sortByReactions == filtersState.sortByReactions && this.contactsOnly == filtersState.contactsOnly && z) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(this.sortByReactions), Boolean.valueOf(this.contactsOnly), this.searchQuery);
        }
    }

    private class RecyclerListViewInner extends RecyclerListView implements StoriesListPlaceProvider.ClippedView {
        public RecyclerListViewInner(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        public void updateClip(int[] iArr) {
            iArr[0] = AndroidUtilities.dp(SelfStoryViewsPage.this.TOP_PADDING);
            iArr[1] = getMeasuredHeight();
        }
    }
}
