package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.SQLite.SQLitePreparedStatement$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Cells.ReactedUserHolderView;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPopupMenu;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.MessageContainsEmojiButton;
import org.telegram.ui.Components.MessageSeenCheckDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReplaceableIconDrawable;
import org.telegram.ui.Components.SearchField;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.RecyclerListViewScroller;
import org.telegram.ui.Stars.BalanceCloud$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.SelfStoryViewsPage.HeaderView.AnonymousClass1;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.iv.RichMediaCell$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public abstract class SelfStoryViewsPage extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public int TOP_PADDING;
    public boolean checkAutoscroll;
    public final int currentAccount;
    public ViewsModel currentModel;
    public StoriesController.StoryRepostsList currentRepostsList;
    public ViewsModel defaultModel;
    public long dialogId;
    public final HeaderView headerView;
    public boolean isAttachedToWindow;
    public boolean isSearchDebounce;
    public final FillLastLinearLayoutManager layoutManager;
    public final ListAdapter listAdapter;
    public int measuerdHeight;
    public final PeerStoriesView$$ExternalSyntheticLambda27 onSharedStateChanged;
    public HeaderView.AnonymousClass1 popupMenu;
    public final RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    public final AnonymousClass1 recyclerListView;
    public int repostsListConsumedCount;
    public final DarkThemeResourceProvider resourcesProvider;
    public final RecyclerListViewScroller scroller;
    public final AnonymousClass5 searchField;
    public Drawable shadowDrawable;
    public final View shadowView;
    public final View shadowView2;
    public final FiltersState sharedFilterState;
    public boolean showContactsFilter;
    public boolean showReactionsSort;
    public boolean showSearch;
    public final FiltersState state;
    public SelfStoryViewsView.StoryItemInternal storyItem;
    public final StoryViewer storyViewer;
    public final TextView titleView;
    public final FrameLayout topViewsContainer;

    public final class AnonymousClass1 extends RecyclerListView implements StoriesListPlaceProvider.ClippedView {
        public final SelfStoryViewsView.AnonymousClass4.AnonymousClass1 this$0;
        public final SelfStoryViewsView.AnonymousClass4.AnonymousClass1 this$0$1;

        public AnonymousClass1(SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1, Context context, DarkThemeResourceProvider darkThemeResourceProvider) {
            super(context, darkThemeResourceProvider);
            this.this$0 = anonymousClass1;
            this.this$0$1 = anonymousClass1;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            this.this$0.measuerdHeight = View.MeasureSpec.getSize(i2);
            super.onMeasure(i, i2);
        }

        @Override
        public final void updateClip(int[] iArr) {
            iArr[0] = AndroidUtilities.dp(this.this$0$1.TOP_PADDING);
            iArr[1] = getMeasuredHeight();
        }
    }

    public final class AnonymousClass4 implements RecyclerListView.OnItemLongClickListener {
        public final SelfStoryViewsView.AnonymousClass4.AnonymousClass1 this$0;
        public final StoryViewer val$storyViewer;

        public AnonymousClass4(SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1, StoryViewer storyViewer) {
            this.this$0 = anonymousClass1;
            this.val$storyViewer = storyViewer;
        }

        @Override
        public final boolean onItemClick(View view, int i) {
            int i2;
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
            if (storyViewer == null || storyViewer.containerView == null) {
                return false;
            }
            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = this.this$0;
            final TL_stories.StoryView storyView = ((Item) anonymousClass1.listAdapter.items.get(i)).view;
            if (storyView == null || (user = (messagesController = MessagesController.getInstance((i2 = anonymousClass1.currentAccount))).getUser(Long.valueOf(storyView.user_id))) == null) {
                return false;
            }
            boolean z2 = messagesController.blockePeers.indexOfKey(user.id) >= 0;
            boolean z3 = user.contact || ContactsController.getInstance(i2).contactsDict.get(Long.valueOf(user.id)) != null;
            boolean zIsStoryShownToUser = anonymousClass1.isStoryShownToUser(storyView);
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
            StoryViewer.AnonymousClass3 anonymousClass3 = storyViewer.containerView;
            DarkThemeResourceProvider darkThemeResourceProvider = anonymousClass1.resourcesProvider;
            final int i3 = 0;
            boolean z4 = z2;
            final String str = strSubstring;
            ItemOptions itemOptionsCutTextInFancyHalf = ItemOptions.makeOptions(anonymousClass3, darkThemeResourceProvider, view).setGravity(3).ignoreX().setScrimViewBackground(new ColorDrawable(Theme.getColor(Theme.key_dialogBackground, darkThemeResourceProvider))).setDimAlpha(133).addIf((!zIsStoryShownToUser || zIsBlocked || z2 || zIsUserSelf) ? false : true, R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, strSubstring), new Runnable(this) {
                public final SelfStoryViewsPage.AnonymousClass4 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    ReactedUserHolderView reactedUserHolderView2 = reactedUserHolderView;
                    TL_stories.StoryView storyView2 = storyView;
                    String str2 = str;
                    TLRPC.User user2 = user;
                    MessagesController messagesController2 = messagesController;
                    SelfStoryViewsPage.AnonymousClass4 anonymousClass4 = this.f$0;
                    int i4 = i3;
                    anonymousClass4.getClass();
                    switch (i4) {
                        case 0:
                            messagesController2.getStoriesController().updateBlockUser(user2.id, true, true);
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = anonymousClass4.this$0;
                            zzkh.m(R.string.StoryHidFromToast, new Object[]{str2}, BulletinFactory.of(anonymousClass2, anonymousClass2.resourcesProvider), R.raw.ic_ban);
                            reactedUserHolderView2.animateAlpha(anonymousClass2.isStoryShownToUser(storyView2) ? 1.0f : 0.5f, true);
                            break;
                        default:
                            messagesController2.getStoriesController().updateBlockUser(user2.id, false, true);
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass5 = anonymousClass4.this$0;
                            zzkh.m(R.string.StoryShownBackToToast, new Object[]{str2}, BulletinFactory.of(anonymousClass5, anonymousClass5.resourcesProvider), R.raw.contact_check);
                            reactedUserHolderView2.animateAlpha(anonymousClass5.isStoryShownToUser(storyView2) ? 1.0f : 0.5f, true);
                            break;
                    }
                }
            }).makeMultiline(false).cutTextInFancyHalf();
            final int i4 = 1;
            ItemOptions itemOptionsCutTextInFancyHalf2 = itemOptionsCutTextInFancyHalf.addIf((!zIsBlocked || z4 || zIsUserSelf) ? false : true, R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str), new Runnable(this) {
                public final SelfStoryViewsPage.AnonymousClass4 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    ReactedUserHolderView reactedUserHolderView2 = reactedUserHolderView;
                    TL_stories.StoryView storyView2 = storyView;
                    String str2 = str;
                    TLRPC.User user2 = user;
                    MessagesController messagesController2 = messagesController;
                    SelfStoryViewsPage.AnonymousClass4 anonymousClass4 = this.f$0;
                    int i5 = i4;
                    anonymousClass4.getClass();
                    switch (i5) {
                        case 0:
                            messagesController2.getStoriesController().updateBlockUser(user2.id, true, true);
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = anonymousClass4.this$0;
                            zzkh.m(R.string.StoryHidFromToast, new Object[]{str2}, BulletinFactory.of(anonymousClass2, anonymousClass2.resourcesProvider), R.raw.ic_ban);
                            reactedUserHolderView2.animateAlpha(anonymousClass2.isStoryShownToUser(storyView2) ? 1.0f : 0.5f, true);
                            break;
                        default:
                            messagesController2.getStoriesController().updateBlockUser(user2.id, false, true);
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass5 = anonymousClass4.this$0;
                            zzkh.m(R.string.StoryShownBackToToast, new Object[]{str2}, BulletinFactory.of(anonymousClass5, anonymousClass5.resourcesProvider), R.raw.contact_check);
                            reactedUserHolderView2.animateAlpha(anonymousClass5.isStoryShownToUser(storyView2) ? 1.0f : 0.5f, true);
                            break;
                    }
                }
            }).makeMultiline(false).cutTextInFancyHalf();
            boolean z5 = (z3 || z4 || zIsUserSelf) ? false : true;
            int i5 = R.drawable.msg_user_remove;
            final int i6 = 0;
            ItemOptions itemOptionsAddIf = itemOptionsCutTextInFancyHalf2.addIf(z5, i5, (CharSequence) LocaleController.getString(R.string.BlockUser), true, new Runnable(this) {
                public final SelfStoryViewsPage.AnonymousClass4 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i6) {
                        case 0:
                            SelfStoryViewsPage.AnonymousClass4 anonymousClass4 = this.f$0;
                            anonymousClass4.getClass();
                            messagesController.blockPeer(user.id);
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = anonymousClass4.this$0;
                            BulletinFactory.of(anonymousClass2, anonymousClass2.resourcesProvider).createBanBulletin(true).show();
                            reactedUserHolderView.animateAlpha(anonymousClass2.isStoryShownToUser(storyView) ? 1.0f : 0.5f, true);
                            break;
                        default:
                            SelfStoryViewsPage.AnonymousClass4 anonymousClass5 = this.f$0;
                            anonymousClass5.getClass();
                            MessagesController messagesController2 = messagesController;
                            StoriesController storiesController = messagesController2.getStoriesController();
                            TLRPC.User user2 = user;
                            storiesController.updateBlockUser(user2.id, false, true);
                            messagesController2.unblockPeer(user2.id);
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass6 = anonymousClass5.this$0;
                            BulletinFactory.of(anonymousClass6, anonymousClass6.resourcesProvider).createBanBulletin(false).show();
                            reactedUserHolderView.animateAlpha(anonymousClass6.isStoryShownToUser(storyView) ? 1.0f : 0.5f, true);
                            break;
                    }
                }
            });
            final int i7 = 1;
            ItemOptions itemOptionsAddIf2 = itemOptionsAddIf.addIf((z3 || !z4 || zIsUserSelf) ? false : true, R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) {
                public final SelfStoryViewsPage.AnonymousClass4 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i7) {
                        case 0:
                            SelfStoryViewsPage.AnonymousClass4 anonymousClass4 = this.f$0;
                            anonymousClass4.getClass();
                            messagesController.blockPeer(user.id);
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = anonymousClass4.this$0;
                            BulletinFactory.of(anonymousClass2, anonymousClass2.resourcesProvider).createBanBulletin(true).show();
                            reactedUserHolderView.animateAlpha(anonymousClass2.isStoryShownToUser(storyView) ? 1.0f : 0.5f, true);
                            break;
                        default:
                            SelfStoryViewsPage.AnonymousClass4 anonymousClass5 = this.f$0;
                            anonymousClass5.getClass();
                            MessagesController messagesController2 = messagesController;
                            StoriesController storiesController = messagesController2.getStoriesController();
                            TLRPC.User user2 = user;
                            storiesController.updateBlockUser(user2.id, false, true);
                            messagesController2.unblockPeer(user2.id);
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass6 = anonymousClass5.this$0;
                            BulletinFactory.of(anonymousClass6, anonymousClass6.resourcesProvider).createBanBulletin(false).show();
                            reactedUserHolderView.animateAlpha(anonymousClass6.isStoryShownToUser(storyView) ? 1.0f : 0.5f, true);
                            break;
                    }
                }
            }).addIf(z3 && !zIsUserSelf, i5, (CharSequence) LocaleController.getString(R.string.StoryDeleteContact), true, (Runnable) new SendGiftSheet$$ExternalSyntheticLambda16(this, user, str, reactedUserHolderView, storyView, 21));
            TLRPC.Reaction reaction = storyView.reaction;
            if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (inputStickerSetFindStickerSet = AnimatedEmojiDrawable.getDocumentFetcher(i2).findStickerSet(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                z = false;
            } else {
                itemOptionsAddIf2.addGap();
                ArrayList arrayList = new ArrayList();
                arrayList.add(inputStickerSetFindStickerSet);
                MessageContainsEmojiButton messageContainsEmojiButton = new MessageContainsEmojiButton(anonymousClass1.currentAccount, anonymousClass1.getContext(), darkThemeResourceProvider, arrayList, 3);
                messageContainsEmojiButton.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(this, arrayList, itemOptionsAddIf2, 15));
                itemOptionsAddIf2.addView(messageContainsEmojiButton);
                z = true;
            }
            if (itemOptionsAddIf2.getItemsCount() <= 0 && !z) {
                return false;
            }
            itemOptionsAddIf2.show();
            try {
                anonymousClass1.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            return true;
        }
    }

    public final class AnonymousClass5 extends SearchField {
        public LivePlayer$$ExternalSyntheticLambda17 runnable;
        public final SelfStoryViewsView.AnonymousClass4.AnonymousClass1 this$0;

        public AnonymousClass5(SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1, Context context, DarkThemeResourceProvider darkThemeResourceProvider) {
            super(context, true, 13.0f, darkThemeResourceProvider);
            this.this$0 = anonymousClass1;
        }

        @Override
        public final void onTextChange(String str) {
            LivePlayer$$ExternalSyntheticLambda17 livePlayer$$ExternalSyntheticLambda17 = this.runnable;
            if (livePlayer$$ExternalSyntheticLambda17 != null) {
                AndroidUtilities.cancelRunOnUIThread(livePlayer$$ExternalSyntheticLambda17);
            }
            this.runnable = new LivePlayer$$ExternalSyntheticLambda17(26, this, str);
            if (TextUtils.isEmpty(str)) {
                this.runnable.run();
            } else {
                AndroidUtilities.runOnUIThread(this.runnable, 300L);
            }
            if (this.runnable != null) {
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = this.this$0;
                if (anonymousClass1.isSearchDebounce) {
                    return;
                }
                anonymousClass1.isSearchDebounce = true;
                anonymousClass1.listAdapter.updateRows();
                anonymousClass1.layoutManager.scrollToPositionWithOffset(0, -anonymousClass1.recyclerListView.getPaddingTop());
            }
        }
    }

    public final class FiltersState {
        public boolean contactsOnly;
        public String searchQuery;
        public boolean sortByReactions = true;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj != null && FiltersState.class == obj.getClass()) {
                    FiltersState filtersState = (FiltersState) obj;
                    boolean z = (TextUtils.isEmpty(this.searchQuery) && TextUtils.isEmpty(filtersState.searchQuery)) || Objects.equals(this.searchQuery, filtersState.searchQuery);
                    if (this.sortByReactions != filtersState.sortByReactions || this.contactsOnly != filtersState.contactsOnly || !z) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hash(Boolean.valueOf(this.sortByReactions), Boolean.valueOf(this.contactsOnly), this.searchQuery);
        }
    }

    public final class HeaderView extends FrameLayout {
        public final TextView allViewersView;
        public float animateFromAlpha1;
        public float animateFromAlpha2;
        public final RectF animateFromRect;
        public float animationProgress;
        public ValueAnimator animator;
        public final LinearLayout buttonContainer;
        public final TextView contactsViewersView;
        public final RectF rectF;
        public final ReplaceableIconDrawable replacableDrawable;
        public int selected;
        public final Paint selectedPaint;
        public final SelfStoryViewsView.AnonymousClass4.AnonymousClass1 this$0;

        public final class AnonymousClass1 extends CustomPopupMenu {
            public AnonymousClass1(Context context, DarkThemeResourceProvider darkThemeResourceProvider) {
                super(context, darkThemeResourceProvider, false);
            }

            @Override
            public final void onCreate(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
                int i;
                actionBarPopupWindowLayout.setBackgroundColor(ColorUtils.blendARGB(0.18f, -16777216, -1));
                HeaderView headerView = HeaderView.this;
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = headerView.this$0;
                ViewsModel viewsModel = anonymousClass1.currentModel;
                boolean z = viewsModel != null && viewsModel.isChannel;
                if (z) {
                    i = R.drawable.menu_views_reposts;
                } else {
                    i = anonymousClass1.state.sortByReactions ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions;
                }
                String string = LocaleController.getString(z ? R.string.SortByReposts : R.string.SortByReactions);
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = headerView.this$0;
                ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, i, string, false, anonymousClass2.resourcesProvider);
                if (!anonymousClass2.state.sortByReactions) {
                    actionBarMenuSubItemAddItem.setAlpha(0.5f);
                }
                final int i2 = 0;
                actionBarMenuSubItemAddItem.setOnClickListener(new View.OnClickListener(this) {
                    public final SelfStoryViewsPage.HeaderView.AnonymousClass1 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass3 = SelfStoryViewsPage.HeaderView.this.this$0;
                                SelfStoryViewsPage.FiltersState filtersState = anonymousClass3.state;
                                if (!filtersState.sortByReactions) {
                                    SelfStoryViewsPage.FiltersState filtersState2 = anonymousClass3.sharedFilterState;
                                    if (filtersState2 != null) {
                                        filtersState.sortByReactions = true;
                                        filtersState2.sortByReactions = true;
                                    } else {
                                        filtersState.sortByReactions = true;
                                    }
                                    anonymousClass3.updateViewState(true);
                                    SelfStoryViewsPage.access$600(anonymousClass3);
                                    anonymousClass3.onSharedStateChanged.accept(anonymousClass3);
                                }
                                SelfStoryViewsPage.HeaderView.AnonymousClass1 anonymousClass4 = anonymousClass3.popupMenu;
                                if (anonymousClass4 != null) {
                                    anonymousClass4.dismiss();
                                }
                                break;
                            default:
                                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass5 = SelfStoryViewsPage.HeaderView.this.this$0;
                                SelfStoryViewsPage.FiltersState filtersState3 = anonymousClass5.state;
                                if (filtersState3.sortByReactions) {
                                    SelfStoryViewsPage.FiltersState filtersState4 = anonymousClass5.sharedFilterState;
                                    if (filtersState4 != null) {
                                        filtersState3.sortByReactions = false;
                                        filtersState4.sortByReactions = false;
                                    } else {
                                        filtersState3.sortByReactions = false;
                                    }
                                    anonymousClass5.updateViewState(true);
                                    SelfStoryViewsPage.access$600(anonymousClass5);
                                    anonymousClass5.onSharedStateChanged.accept(anonymousClass5);
                                }
                                SelfStoryViewsPage.HeaderView.AnonymousClass1 anonymousClass6 = anonymousClass5.popupMenu;
                                if (anonymousClass6 != null) {
                                    anonymousClass6.dismiss();
                                }
                                break;
                        }
                    }
                });
                ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, !anonymousClass2.state.sortByReactions ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, anonymousClass2.resourcesProvider);
                if (anonymousClass2.state.sortByReactions) {
                    actionBarMenuSubItemAddItem2.setAlpha(0.5f);
                }
                final int i3 = 1;
                actionBarMenuSubItemAddItem2.setOnClickListener(new View.OnClickListener(this) {
                    public final SelfStoryViewsPage.HeaderView.AnonymousClass1 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass3 = SelfStoryViewsPage.HeaderView.this.this$0;
                                SelfStoryViewsPage.FiltersState filtersState = anonymousClass3.state;
                                if (!filtersState.sortByReactions) {
                                    SelfStoryViewsPage.FiltersState filtersState2 = anonymousClass3.sharedFilterState;
                                    if (filtersState2 != null) {
                                        filtersState.sortByReactions = true;
                                        filtersState2.sortByReactions = true;
                                    } else {
                                        filtersState.sortByReactions = true;
                                    }
                                    anonymousClass3.updateViewState(true);
                                    SelfStoryViewsPage.access$600(anonymousClass3);
                                    anonymousClass3.onSharedStateChanged.accept(anonymousClass3);
                                }
                                SelfStoryViewsPage.HeaderView.AnonymousClass1 anonymousClass4 = anonymousClass3.popupMenu;
                                if (anonymousClass4 != null) {
                                    anonymousClass4.dismiss();
                                }
                                break;
                            default:
                                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass5 = SelfStoryViewsPage.HeaderView.this.this$0;
                                SelfStoryViewsPage.FiltersState filtersState3 = anonymousClass5.state;
                                if (filtersState3.sortByReactions) {
                                    SelfStoryViewsPage.FiltersState filtersState4 = anonymousClass5.sharedFilterState;
                                    if (filtersState4 != null) {
                                        filtersState3.sortByReactions = false;
                                        filtersState4.sortByReactions = false;
                                    } else {
                                        filtersState3.sortByReactions = false;
                                    }
                                    anonymousClass5.updateViewState(true);
                                    SelfStoryViewsPage.access$600(anonymousClass5);
                                    anonymousClass5.onSharedStateChanged.accept(anonymousClass5);
                                }
                                SelfStoryViewsPage.HeaderView.AnonymousClass1 anonymousClass6 = anonymousClass5.popupMenu;
                                if (anonymousClass6 != null) {
                                    anonymousClass6.dismiss();
                                }
                                break;
                        }
                    }
                });
                ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(headerView.getContext(), anonymousClass2.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                gapView.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindowLayout.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
                ActionBarMenuItem.addText(actionBarPopupWindowLayout, LocaleController.getString(z ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription), anonymousClass2.resourcesProvider);
            }

            @Override
            public final void onDismissed() {
            }
        }

        public HeaderView(SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1, Context context) {
            super(context);
            this.this$0 = anonymousClass1;
            Paint paint = new Paint(1);
            this.selectedPaint = paint;
            this.animateFromRect = new RectF();
            this.rectF = new RectF();
            this.animationProgress = 1.0f;
            int i = Theme.key_listSelector;
            DarkThemeResourceProvider darkThemeResourceProvider = anonymousClass1.resourcesProvider;
            paint.setColor(Theme.getColor(i, darkThemeResourceProvider));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            TextView textView = new TextView(context);
            this.allViewersView = textView;
            textView.setText(LocaleController.getString(R.string.AllViewers));
            int i2 = Theme.key_dialogTextBlack;
            textView.setTextColor(Theme.getColor(i2, darkThemeResourceProvider));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            TextView textView2 = new TextView(context);
            this.contactsViewersView = textView2;
            textView2.setText(LocaleController.getString(R.string.Contacts));
            textView2.setTextColor(Theme.getColor(i2, darkThemeResourceProvider));
            textView2.setTextSize(1, 14.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 0, 13, 0, 0, 0));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 0, 0, 0, 0, 0));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.buttonContainer = linearLayout2;
            linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
            linearLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(26.0f), Theme.getColor(i, darkThemeResourceProvider)));
            linearLayout2.setOrientation(0);
            ReplaceableIconDrawable replaceableIconDrawable = new ReplaceableIconDrawable(getContext());
            this.replacableDrawable = replaceableIconDrawable;
            replaceableIconDrawable.exactlyBounds = true;
            replaceableIconDrawable.setIcon(R.drawable.menu_views_reactions3, false);
            ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageDrawable(replaceableIconDrawable);
            imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            linearLayout2.addView(imageView, LayoutHelper.createLinear(26, 26));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(R.drawable.arrow_more);
            linearLayout2.addView(imageView2, LayoutHelper.createLinear(16, 26));
            addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f));
            addView(linearLayout2, LayoutHelper.createFrame(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
            final int i3 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final SelfStoryViewsPage.HeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = this.f$0.this$0;
                            SelfStoryViewsPage.FiltersState filtersState = anonymousClass2.state;
                            if (filtersState.contactsOnly) {
                                filtersState.contactsOnly = false;
                                anonymousClass2.updateViewState(true);
                                SelfStoryViewsPage.access$600(anonymousClass2);
                                break;
                            }
                            break;
                        case 1:
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass3 = this.f$0.this$0;
                            SelfStoryViewsPage.FiltersState filtersState2 = anonymousClass3.state;
                            if (!filtersState2.contactsOnly) {
                                filtersState2.contactsOnly = true;
                                anonymousClass3.updateViewState(true);
                                SelfStoryViewsPage.access$600(anonymousClass3);
                                break;
                            }
                            break;
                        default:
                            SelfStoryViewsPage.HeaderView headerView = this.f$0;
                            Context context2 = headerView.getContext();
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass4 = headerView.this$0;
                            SelfStoryViewsPage.HeaderView.AnonymousClass1 anonymousClass5 = headerView.new AnonymousClass1(context2, anonymousClass4.resourcesProvider);
                            anonymousClass4.popupMenu = anonymousClass5;
                            LinearLayout linearLayout3 = headerView.buttonContainer;
                            anonymousClass5.show(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                            break;
                    }
                }
            });
            final int i4 = 1;
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final SelfStoryViewsPage.HeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = this.f$0.this$0;
                            SelfStoryViewsPage.FiltersState filtersState = anonymousClass2.state;
                            if (filtersState.contactsOnly) {
                                filtersState.contactsOnly = false;
                                anonymousClass2.updateViewState(true);
                                SelfStoryViewsPage.access$600(anonymousClass2);
                                break;
                            }
                            break;
                        case 1:
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass3 = this.f$0.this$0;
                            SelfStoryViewsPage.FiltersState filtersState2 = anonymousClass3.state;
                            if (!filtersState2.contactsOnly) {
                                filtersState2.contactsOnly = true;
                                anonymousClass3.updateViewState(true);
                                SelfStoryViewsPage.access$600(anonymousClass3);
                                break;
                            }
                            break;
                        default:
                            SelfStoryViewsPage.HeaderView headerView = this.f$0;
                            Context context2 = headerView.getContext();
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass4 = headerView.this$0;
                            SelfStoryViewsPage.HeaderView.AnonymousClass1 anonymousClass5 = headerView.new AnonymousClass1(context2, anonymousClass4.resourcesProvider);
                            anonymousClass4.popupMenu = anonymousClass5;
                            LinearLayout linearLayout3 = headerView.buttonContainer;
                            anonymousClass5.show(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                            break;
                    }
                }
            });
            final int i5 = 2;
            linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                public final SelfStoryViewsPage.HeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = this.f$0.this$0;
                            SelfStoryViewsPage.FiltersState filtersState = anonymousClass2.state;
                            if (filtersState.contactsOnly) {
                                filtersState.contactsOnly = false;
                                anonymousClass2.updateViewState(true);
                                SelfStoryViewsPage.access$600(anonymousClass2);
                                break;
                            }
                            break;
                        case 1:
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass3 = this.f$0.this$0;
                            SelfStoryViewsPage.FiltersState filtersState2 = anonymousClass3.state;
                            if (!filtersState2.contactsOnly) {
                                filtersState2.contactsOnly = true;
                                anonymousClass3.updateViewState(true);
                                SelfStoryViewsPage.access$600(anonymousClass3);
                                break;
                            }
                            break;
                        default:
                            SelfStoryViewsPage.HeaderView headerView = this.f$0;
                            Context context2 = headerView.getContext();
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass4 = headerView.this$0;
                            SelfStoryViewsPage.HeaderView.AnonymousClass1 anonymousClass5 = headerView.new AnonymousClass1(context2, anonymousClass4.resourcesProvider);
                            anonymousClass4.popupMenu = anonymousClass5;
                            LinearLayout linearLayout3 = headerView.buttonContainer;
                            anonymousClass5.show(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                            break;
                    }
                }
            });
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float fLerp;
            if (this.this$0.showContactsFilter) {
                int i = this.selected;
                TextView textView = this.contactsViewersView;
                TextView textView2 = this.allViewersView;
                float fLerp2 = 0.5f;
                if (i == 0) {
                    textView2.getHitRect(AndroidUtilities.rectTmp2);
                    fLerp = 0.5f;
                    fLerp2 = 1.0f;
                } else {
                    textView.getHitRect(AndroidUtilities.rectTmp2);
                    fLerp = 1.0f;
                }
                RectF rectF = this.rectF;
                rectF.set(AndroidUtilities.rectTmp2);
                float f = this.animationProgress;
                if (f != 1.0f) {
                    fLerp2 = AndroidUtilities.lerp(this.animateFromAlpha1, fLerp2, f);
                    fLerp = AndroidUtilities.lerp(this.animateFromAlpha2, fLerp, this.animationProgress);
                    AndroidUtilities.lerp(this.animateFromRect, rectF, this.animationProgress, rectF);
                }
                textView2.setAlpha(fLerp2);
                textView.setAlpha(fLerp);
                float fHeight = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, fHeight, fHeight, this.selectedPaint);
            }
            super.dispatchDraw(canvas);
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final ArrayList items = new ArrayList();
        public final SelfStoryViewsView.AnonymousClass4.AnonymousClass1 this$0;

        public ListAdapter(SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1) {
            this.this$0 = anonymousClass1;
        }

        @Override
        public final int getItemCount() {
            return this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return ((Item) this.items.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Peer tL_peerUser;
            TLRPC.Message message;
            TLRPC.Chat chat;
            TLRPC.User user;
            long j;
            float f;
            int i2;
            boolean z;
            String str;
            int i3;
            String str2;
            TLRPC.Message message2;
            if (viewHolder.getItemViewType() != 1 || i < 0) {
                return;
            }
            ArrayList arrayList = this.items;
            if (i >= arrayList.size()) {
                return;
            }
            Item item = (Item) arrayList.get(i);
            ReactedUserHolderView reactedUserHolderView = (ReactedUserHolderView) viewHolder.itemView;
            TL_stories.StoryView storyView = item.view;
            TL_stories.StoryReaction storyReaction = item.reaction;
            if (storyView != null) {
                if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                    tL_peerUser = storyView.peer_id;
                } else if (!(storyView instanceof TL_stories.TL_storyViewPublicForward) || (message2 = storyView.message) == null) {
                    tL_peerUser = new TLRPC.TL_peerUser();
                    tL_peerUser.user_id = storyView.user_id;
                } else {
                    tL_peerUser = message2.peer_id;
                }
            } else if (storyReaction != null) {
                tL_peerUser = storyReaction.peer_id;
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicForward) && (message = storyReaction.message) != null) {
                    tL_peerUser = message.peer_id;
                }
            } else {
                tL_peerUser = null;
            }
            long peerDialogId = DialogObject.getPeerDialogId(tL_peerUser);
            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = this.this$0;
            int i4 = anonymousClass1.currentAccount;
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(i4).getUser(Long.valueOf(peerDialogId));
                chat = null;
            } else {
                chat = MessagesController.getInstance(i4).getChat(Long.valueOf(-peerDialogId));
                user = null;
            }
            boolean zRemove = anonymousClass1.defaultModel.animateDateForUsers.remove(Long.valueOf(peerDialogId));
            if (storyView != null) {
                TLRPC.Reaction reaction = storyView.reaction;
                boolean z2 = (reaction == null || (str2 = ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction).emojicon) == null || !str2.equals("❤")) ? false : true;
                if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                    i3 = 11;
                    reactedUserHolderView.setUserReaction(user, null, null, z2, 0L, storyView.story, false, true, zRemove);
                } else {
                    TLRPC.User user2 = user;
                    i3 = 11;
                    if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                        TLRPC.Message message3 = storyView.message;
                        j = message3 != null ? message3.date : 0L;
                        SelfStoryViewsView.StoryItemInternal storyItemInternal = anonymousClass1.storyItem;
                        reactedUserHolderView.setUserReaction(user2, null, null, z2, j, storyItemInternal == null ? null : storyItemInternal.storyItem, true, true, zRemove);
                    } else {
                        reactedUserHolderView.setUserReaction(user2, null, z2 ? null : storyView.reaction, z2, storyView.date, null, false, true, zRemove);
                    }
                }
                int i5 = i < arrayList.size() + (-1) ? ((Item) arrayList.get(i + 1)).viewType : -1;
                reactedUserHolderView.drawDivider = i5 == 1 || i5 == i3 || i5 == 12;
                reactedUserHolderView.animateAlpha(anonymousClass1.isStoryShownToUser(storyView) ? 1.0f : 0.5f, false);
                return;
            }
            if (storyReaction != null) {
                if (storyReaction instanceof TL_stories.TL_storyReaction) {
                    TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                    TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                    boolean z3 = (reaction2 == null || (str = ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction2).emojicon) == null || !str.equals("❤")) ? false : true;
                    reactedUserHolderView.setUserReaction(user, chat, z3 ? null : tL_storyReaction.reaction, z3, tL_storyReaction.date, null, false, true, zRemove);
                } else {
                    TLRPC.User user3 = user;
                    if (!(storyReaction instanceof TL_stories.TL_storyReactionPublicRepost)) {
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            j = message4 != null ? message4.date : 0L;
                            SelfStoryViewsView.StoryItemInternal storyItemInternal2 = anonymousClass1.storyItem;
                            TL_stories.StoryItem storyItem = storyItemInternal2 == null ? null : storyItemInternal2.storyItem;
                            f = 1.0f;
                            reactedUserHolderView.setUserReaction(user3, chat, null, false, j, storyItem, true, true, zRemove);
                        }
                        if (i < arrayList.size() - 1) {
                            i2 = ((Item) arrayList.get(i + 1)).viewType;
                        } else {
                            i2 = -1;
                        }
                        if (i2 != 1 || i2 == 11 || i2 == 12) {
                            z = true;
                        } else {
                            z = false;
                        }
                        reactedUserHolderView.drawDivider = z;
                        reactedUserHolderView.animateAlpha(f, false);
                    }
                    reactedUserHolderView.setUserReaction(user3, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, zRemove);
                }
                f = 1.0f;
                if (i < arrayList.size() - 1) {
                    i2 = ((Item) arrayList.get(i + 1)).viewType;
                } else {
                    i2 = -1;
                }
                if (i2 != 1) {
                    z = true;
                } else {
                    z = true;
                }
                reactedUserHolderView.drawDivider = z;
                reactedUserHolderView.animateAlpha(f, false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            int i2;
            View fixedHeightEmptyCell;
            final SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = this.this$0;
            int i3 = 28;
            final int i4 = 1;
            final int i5 = 0;
            int i6 = anonymousClass1.currentAccount;
            DarkThemeResourceProvider darkThemeResourceProvider = anonymousClass1.resourcesProvider;
            switch (i) {
                case 0:
                    fixedHeightEmptyCell = new View(this, anonymousClass1.getContext()) {
                        public final ListAdapter this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override
                        public final void onMeasure(int i7, int i8) {
                            switch (i5) {
                                case 0:
                                    super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.this$1.this$0.TOP_PADDING), 1073741824));
                                    break;
                                default:
                                    ListAdapter listAdapter = this.this$1;
                                    int lastItemHeight = listAdapter.this$0.layoutManager.getLastItemHeight();
                                    if (lastItemHeight >= listAdapter.this$0.recyclerListView.getPaddingTop() && !listAdapter.this$0.showSearch) {
                                        lastItemHeight = 0;
                                    }
                                    super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(lastItemHeight, 1073741824));
                                    break;
                            }
                        }
                    };
                    break;
                case 1:
                    MessageSeenCheckDrawable messageSeenCheckDrawable = ReactedUserHolderView.seenDrawable;
                    fixedHeightEmptyCell = new ReactedUserHolderView(i6, anonymousClass1.getContext(), darkThemeResourceProvider) {
                        @Override
                        public final void openStory(long j) {
                            BaseFragment lastFragment = LaunchActivity.getLastFragment();
                            if (lastFragment == null) {
                                return;
                            }
                            StoryViewer storyViewerCreateOverlayStoryViewer = lastFragment.createOverlayStoryViewer();
                            storyViewerCreateOverlayStoryViewer.getClass();
                            storyViewerCreateOverlayStoryViewer.open(getContext(), j, new StoriesListPlaceProvider(this.this$0.recyclerListView, false));
                        }
                    };
                    break;
                case 2:
                case 9:
                default:
                    fixedHeightEmptyCell = new View(this, anonymousClass1.getContext()) {
                        public final ListAdapter this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override
                        public final void onMeasure(int i7, int i8) {
                            switch (i4) {
                                case 0:
                                    super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.this$1.this$0.TOP_PADDING), 1073741824));
                                    break;
                                default:
                                    ListAdapter listAdapter = this.this$1;
                                    int lastItemHeight = listAdapter.this$0.layoutManager.getLastItemHeight();
                                    if (lastItemHeight >= listAdapter.this$0.recyclerListView.getPaddingTop() && !listAdapter.this$0.showSearch) {
                                        lastItemHeight = 0;
                                    }
                                    super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(lastItemHeight, 1073741824));
                                    break;
                            }
                        }
                    };
                    break;
                case 3:
                    fixedHeightEmptyCell = new FixedHeightEmptyCell(anonymousClass1.getContext(), 70, 0);
                    break;
                case 4:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(anonymousClass1.getContext(), darkThemeResourceProvider);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(28);
                    flickerLoadingView.showDate(false);
                    fixedHeightEmptyCell = flickerLoadingView;
                    break;
                case 5:
                case 7:
                case 8:
                case 10:
                    if (anonymousClass1.defaultModel.isExpiredViews) {
                        i2 = 12;
                    } else {
                        i2 = (i == 10 || i == 7 || i == 8 || i == 5) ? 1 : 0;
                    }
                    StickerEmptyView stickerEmptyView = new StickerEmptyView(i2, anonymousClass1.getContext(), darkThemeResourceProvider) {
                        @Override
                        public final void onMeasure(int i7, int i8) {
                            ListAdapter listAdapter = this;
                            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = listAdapter.this$0;
                            super.onMeasure(i7, OKLCH.m(listAdapter.this$0.TOP_PADDING, anonymousClass2.measuerdHeight - anonymousClass2.recyclerListView.getPaddingTop(), 1073741824));
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
                    } else if (anonymousClass1.defaultModel.isExpiredViews) {
                        stickerEmptyView.title.setVisibility(8);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                        if (!MessagesController.getInstance(i6).premiumFeaturesBlocked()) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                                @Override
                                public final void run() {
                                    SelfStoryViewsPage selfStoryViewsPage = anonymousClass1;
                                    switch (i5) {
                                        case 0:
                                            int i7 = SelfStoryViewsPage.$r8$clinit;
                                            selfStoryViewsPage.getClass();
                                            new PremiumFeatureBottomSheet(selfStoryViewsPage.storyViewer.fragment, 14, false).show();
                                            break;
                                        default:
                                            int i8 = SelfStoryViewsPage.$r8$clinit;
                                            selfStoryViewsPage.getClass();
                                            new PremiumFeatureBottomSheet(selfStoryViewsPage.storyViewer.fragment, 14, false).show();
                                            break;
                                    }
                                }
                            }));
                            stickerEmptyView.createButtonLayout(LocaleController.getString(R.string.LearnMore), new Runnable() {
                                @Override
                                public final void run() {
                                    SelfStoryViewsPage selfStoryViewsPage = anonymousClass1;
                                    switch (i4) {
                                        case 0:
                                            int i7 = SelfStoryViewsPage.$r8$clinit;
                                            selfStoryViewsPage.getClass();
                                            new PremiumFeatureBottomSheet(selfStoryViewsPage.storyViewer.fragment, 14, false).show();
                                            break;
                                        default:
                                            int i8 = SelfStoryViewsPage.$r8$clinit;
                                            selfStoryViewsPage.getClass();
                                            new PremiumFeatureBottomSheet(selfStoryViewsPage.storyViewer.fragment, 14, false).show();
                                            break;
                                    }
                                }
                            });
                        }
                        stickerEmptyView.subtitle.setText(spannableStringBuilder);
                    } else {
                        stickerEmptyView.title.setVisibility(0);
                        if (anonymousClass1.defaultModel.isChannel) {
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
                    FlickerLoadingView flickerLoadingView2 = new FlickerLoadingView(anonymousClass1.getContext(), darkThemeResourceProvider);
                    flickerLoadingView2.setIsSingleCell(true);
                    flickerLoadingView2.setIgnoreHeightCheck(true);
                    flickerLoadingView2.setItemsCount(20);
                    flickerLoadingView2.setViewType(28);
                    flickerLoadingView2.showDate(false);
                    fixedHeightEmptyCell = flickerLoadingView2;
                    break;
                case 11:
                case 12:
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(anonymousClass1.getContext());
                    linksTextView.setTextSize(1, 13.0f);
                    linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, darkThemeResourceProvider));
                    linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, darkThemeResourceProvider));
                    int iDp = AndroidUtilities.dp(16.0f);
                    int iDp2 = AndroidUtilities.dp(21.0f);
                    linksTextView.setPadding(iDp2, iDp, iDp2, iDp);
                    linksTextView.setMaxLines(Integer.MAX_VALUE);
                    linksTextView.setGravity(17);
                    linksTextView.setDisablePaddingsOffsetY(true);
                    if (i == 11) {
                        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new BalanceCloud$$ExternalSyntheticLambda1(this, i3)));
                    } else {
                        linksTextView.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                    }
                    linksTextView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    fixedHeightEmptyCell = linksTextView;
                    break;
            }
            return new RecyclerListView.Holder(fixedHeightEmptyCell);
        }

        public final void updateRows() {
            ArrayList arrayList;
            FiltersState filtersState;
            ArrayList arrayList2;
            ArrayList arrayList3;
            boolean z;
            ArrayList arrayList4 = this.items;
            arrayList4.clear();
            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = this.this$0;
            ViewsModel viewsModel = anonymousClass1.currentModel;
            int i = 0;
            if (anonymousClass1.isSearchDebounce) {
                arrayList4.add(new Item(0));
                arrayList4.add(new Item(6));
            } else {
                arrayList4.add(new Item(0));
                if (viewsModel == null) {
                    if (viewsModel != null) {
                        if (viewsModel.isChannel) {
                            while (true) {
                                arrayList2 = viewsModel.views;
                                if (i < arrayList2.size()) {
                                    break;
                                }
                                arrayList4.add(new Item((TL_stories.StoryView) arrayList2.get(i)));
                                i++;
                            }
                        } else {
                            while (true) {
                                arrayList3 = viewsModel.reactions;
                                if (i < arrayList3.size()) {
                                    break;
                                }
                                arrayList4.add(new Item((TL_stories.StoryReaction) arrayList3.get(i)));
                                i++;
                            }
                        }
                    }
                    if (viewsModel == null && (viewsModel.loading || viewsModel.hasNext)) {
                        if ((viewsModel.isChannel ? viewsModel.reactions : viewsModel.views).size() <= 0) {
                            arrayList4.add(new Item(6));
                        } else {
                            arrayList4.add(new Item(4));
                        }
                    } else if (viewsModel == null && viewsModel.showReactionOnly) {
                        arrayList4.add(new Item(11));
                    } else if (viewsModel != null) {
                        if (viewsModel.isChannel) {
                            arrayList = viewsModel.reactions;
                        } else {
                            arrayList = viewsModel.views;
                        }
                        if (arrayList.size() < viewsModel.totalCount) {
                            filtersState = viewsModel.state;
                            if (TextUtils.isEmpty(filtersState.searchQuery) && !filtersState.contactsOnly) {
                                arrayList4.add(new Item(12));
                            }
                        }
                    }
                } else {
                    if ((viewsModel.isChannel ? viewsModel.reactions : viewsModel.views).size() > 0 || (!(z = viewsModel.isExpiredViews) && (viewsModel.loading || viewsModel.hasNext))) {
                        if (viewsModel != null) {
                            if (viewsModel.isChannel) {
                                while (true) {
                                    arrayList2 = viewsModel.views;
                                    if (i < arrayList2.size()) {
                                        break;
                                        break;
                                    } else {
                                        arrayList4.add(new Item((TL_stories.StoryView) arrayList2.get(i)));
                                        i++;
                                    }
                                }
                            } else {
                                while (true) {
                                    arrayList3 = viewsModel.reactions;
                                    if (i < arrayList3.size()) {
                                        break;
                                        break;
                                    } else {
                                        arrayList4.add(new Item((TL_stories.StoryReaction) arrayList3.get(i)));
                                        i++;
                                    }
                                }
                            }
                        }
                        if (viewsModel == null) {
                            if (viewsModel == null) {
                                if (viewsModel != null) {
                                    if (viewsModel.isChannel) {
                                        arrayList = viewsModel.reactions;
                                    } else {
                                        arrayList = viewsModel.views;
                                    }
                                    if (arrayList.size() < viewsModel.totalCount) {
                                        filtersState = viewsModel.state;
                                        if (TextUtils.isEmpty(filtersState.searchQuery)) {
                                            arrayList4.add(new Item(12));
                                        }
                                    }
                                }
                            } else if (viewsModel != null) {
                                if (viewsModel.isChannel) {
                                    arrayList = viewsModel.reactions;
                                } else {
                                    arrayList = viewsModel.views;
                                }
                                if (arrayList.size() < viewsModel.totalCount) {
                                    filtersState = viewsModel.state;
                                    if (TextUtils.isEmpty(filtersState.searchQuery)) {
                                        arrayList4.add(new Item(12));
                                    }
                                }
                            }
                        } else if (viewsModel == null) {
                            if (viewsModel != null) {
                                if (viewsModel.isChannel) {
                                    arrayList = viewsModel.reactions;
                                } else {
                                    arrayList = viewsModel.views;
                                }
                                if (arrayList.size() < viewsModel.totalCount) {
                                    filtersState = viewsModel.state;
                                    if (TextUtils.isEmpty(filtersState.searchQuery)) {
                                        arrayList4.add(new Item(12));
                                    }
                                }
                            }
                        } else if (viewsModel != null) {
                            if (viewsModel.isChannel) {
                                arrayList = viewsModel.reactions;
                            } else {
                                arrayList = viewsModel.views;
                            }
                            if (arrayList.size() < viewsModel.totalCount) {
                                filtersState = viewsModel.state;
                                if (TextUtils.isEmpty(filtersState.searchQuery)) {
                                    arrayList4.add(new Item(12));
                                }
                            }
                        }
                    } else {
                        FiltersState filtersState2 = viewsModel.state;
                        if (!TextUtils.isEmpty(filtersState2.searchQuery)) {
                            arrayList4.add(new Item(7));
                        } else if (z) {
                            arrayList4.add(new Item(5));
                        } else {
                            int i2 = viewsModel.totalCount;
                            if (i2 > 0 && filtersState2.contactsOnly) {
                                arrayList4.add(new Item(8));
                            } else if (i2 > 0) {
                                arrayList4.add(new Item(10));
                            } else {
                                arrayList4.add(new Item(5));
                            }
                        }
                    }
                }
            }
            arrayList4.add(new Item(9));
            notifyDataSetChanged();
        }
    }

    public final class ViewsModel {
        public final int currentAccount;
        public final long dialogId;
        public boolean initial;
        public final boolean isChannel;
        public final boolean isExpiredViews;
        public boolean loading;
        public String offset;
        public final boolean showReactionOnly;
        public final TL_stories.StoryItem storyItem;
        public int totalCount;
        public final boolean useLocalFilters;
        public final ArrayList views = new ArrayList();
        public final ArrayList originalViews = new ArrayList();
        public final ArrayList reactions = new ArrayList();
        public boolean hasNext = true;
        public int reqId = -1;
        public final HashSet animateDateForUsers = new HashSet();
        public final ArrayList listeners = new ArrayList();
        public final FiltersState state = new FiltersState();

        public ViewsModel(int i, long j, TL_stories.StoryItem storyItem) {
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
            GradientTools[] gradientToolsArr = StoriesUtilities.storiesGradientTools;
            boolean z = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() > storyItem.expire_date + 86400 && !UserConfig.getInstance(i).isPremium();
            this.isExpiredViews = z;
            if (z && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
                this.isExpiredViews = false;
                this.showReactionOnly = true;
            }
            if (this.isExpiredViews) {
                return;
            }
            this.initial = true;
            if (storyItem.views != null) {
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
        }

        public final void applyLocalFilter() {
            String lowerCase;
            String translitString;
            String strM;
            String strM2;
            if (this.isChannel) {
                return;
            }
            ArrayList arrayList = this.views;
            arrayList.clear();
            FiltersState filtersState = this.state;
            boolean z = filtersState.contactsOnly;
            ArrayList arrayList2 = this.originalViews;
            if (z || !TextUtils.isEmpty(filtersState.searchQuery)) {
                if (TextUtils.isEmpty(filtersState.searchQuery)) {
                    lowerCase = null;
                    translitString = null;
                    strM = null;
                    strM2 = null;
                } else {
                    lowerCase = filtersState.searchQuery.trim().toLowerCase();
                    translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    strM2 = zzii.m(" ", lowerCase);
                    strM = zzii.m(" ", translitString);
                }
                for (int i = 0; i < arrayList2.size(); i++) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i)).user_id));
                    boolean z2 = !filtersState.contactsOnly || (user != null && user.contact);
                    if (z2 && lowerCase != null) {
                        String lowerCase2 = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                        String publicUsername = UserObject.getPublicUsername(user);
                        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase2);
                        if ((lowerCase2 == null || (!lowerCase2.startsWith(lowerCase) && !lowerCase2.contains(strM2))) && ((strTranslitSafe == null || (!strTranslitSafe.startsWith(translitString) && !strTranslitSafe.contains(strM))) && (publicUsername == null || (!publicUsername.startsWith(translitString) && !publicUsername.contains(strM))))) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        arrayList.add((TL_stories.StoryView) arrayList2.get(i));
                    }
                }
            } else {
                arrayList.addAll(arrayList2);
            }
            if (filtersState.sortByReactions) {
                return;
            }
            Collections.sort(arrayList, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(12)));
        }

        public final void loadNext() {
            if (this.loading || !this.hasNext || this.isExpiredViews) {
                return;
            }
            boolean z = this.isChannel;
            long j = this.dialogId;
            FiltersState filtersState = this.state;
            int i = this.currentAccount;
            TL_stories.StoryItem storyItem = this.storyItem;
            if (z) {
                TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
                tL_getStoryReactionsList.forwards_first = filtersState.sortByReactions;
                tL_getStoryReactionsList.id = storyItem.id;
                tL_getStoryReactionsList.peer = MessagesController.getInstance(i).getInputPeer(j);
                tL_getStoryReactionsList.limit = (this.initial || this.reactions.size() < 20) ? 20 : 100;
                String str = this.offset;
                tL_getStoryReactionsList.offset = str;
                if (str == null) {
                    tL_getStoryReactionsList.offset = "";
                } else {
                    tL_getStoryReactionsList.flags |= 2;
                }
                this.loading = true;
                StringBuilder sb = new StringBuilder("SelfStoryViewsPage reactions load next ");
                sb.append(storyItem.id);
                sb.append(" ");
                sb.append(this.initial);
                sb.append(" offset=");
                SQLitePreparedStatement$$ExternalSyntheticOutline0.m(tL_getStoryReactionsList.offset, sb);
                final int i2 = 0;
                int iSendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) {
                    public final SelfStoryViewsPage.ViewsModel f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i2) {
                            case 0:
                                final SelfStoryViewsPage.ViewsModel viewsModel = this.f$0;
                                viewsModel.getClass();
                                final int[] iArr = iArr;
                                final int i3 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z2;
                                        switch (i3) {
                                            case 0:
                                                SelfStoryViewsPage.ViewsModel viewsModel2 = viewsModel;
                                                viewsModel2.getClass();
                                                int i4 = 0;
                                                int i5 = iArr[0];
                                                int i6 = viewsModel2.reqId;
                                                TL_stories.StoryItem storyItem2 = viewsModel2.storyItem;
                                                if (i5 != i6) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                    break;
                                                } else {
                                                    viewsModel2.loading = false;
                                                    viewsModel2.reqId = -1;
                                                    ArrayList arrayList = viewsModel2.views;
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 != null) {
                                                        TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                        int i7 = viewsModel2.currentAccount;
                                                        StoriesController storiesController = MessagesController.getInstance(i7).getStoriesController();
                                                        storiesController.getClass();
                                                        if (storyViewsList.views != null) {
                                                            for (int i8 = 0; i8 < storyViewsList.views.size(); i8++) {
                                                                TL_stories.StoryView storyView = storyViewsList.views.get(i8);
                                                                long j2 = storyView.user_id;
                                                                LongSparseArray longSparseArray = storiesController.blockedOverride;
                                                                if (longSparseArray.containsKey(j2)) {
                                                                    longSparseArray.put(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                                }
                                                            }
                                                        }
                                                        MessagesController.getInstance(i7).putUsers(storyViewsList.users, false);
                                                        MessagesController.getInstance(i7).putChats(storyViewsList.chats, false);
                                                        boolean z3 = true;
                                                        MessagesStorage.getInstance(i7).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                        boolean z4 = viewsModel2.initial;
                                                        ArrayList arrayList2 = viewsModel2.originalViews;
                                                        if (z4) {
                                                            viewsModel2.initial = false;
                                                            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                                                viewsModel2.animateDateForUsers.add(Long.valueOf(((TL_stories.StoryView) arrayList.get(i9)).user_id));
                                                            }
                                                            arrayList.clear();
                                                            arrayList2.clear();
                                                        }
                                                        if (viewsModel2.useLocalFilters) {
                                                            arrayList2.addAll(storyViewsList.views);
                                                            viewsModel2.applyLocalFilter();
                                                        } else {
                                                            arrayList.addAll(storyViewsList.views);
                                                        }
                                                        if (storyViewsList.views.isEmpty()) {
                                                            viewsModel2.hasNext = false;
                                                        } else {
                                                            viewsModel2.hasNext = true;
                                                        }
                                                        String str2 = storyViewsList.next_offset;
                                                        viewsModel2.offset = str2;
                                                        if (TextUtils.isEmpty(str2)) {
                                                            viewsModel2.hasNext = false;
                                                        }
                                                        if (storyItem2.views == null) {
                                                            storyItem2.views = new TL_stories.TL_storyViews();
                                                        }
                                                        int i10 = storyViewsList.count;
                                                        TL_stories.StoryViews storyViews = storyItem2.views;
                                                        if (i10 > storyViews.views_count) {
                                                            storyViews.recent_viewers.clear();
                                                            for (int iM = 0; iM < Math.min(3, storyViewsList.users.size()); iM = MessagesController$$ExternalSyntheticOutline2.m(storyViewsList.users.get(iM).id, storyItem2.views.recent_viewers, iM, 1)) {
                                                            }
                                                            storyItem2.views.views_count = storyViewsList.count;
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                        int i11 = storyViews2.reactions_count;
                                                        int i12 = storyViewsList.reactions_count;
                                                        if (i11 != i12) {
                                                            storyViews2.reactions_count = i12;
                                                        } else {
                                                            z3 = z2;
                                                        }
                                                        if (z3) {
                                                            NotificationCenter.getInstance(i7).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                        }
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                            viewsModel2.totalCount = 0;
                                                        }
                                                        viewsModel2.hasNext = false;
                                                    }
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList.size() + " has next " + viewsModel2.hasNext);
                                                    while (true) {
                                                        ArrayList arrayList3 = viewsModel2.listeners;
                                                        if (i4 < arrayList3.size()) {
                                                            ((SelfStoryViewsPage) arrayList3.get(i4)).onDataRecieved(viewsModel2);
                                                            i4++;
                                                        } else if (arrayList.size() < 20 && viewsModel2.hasNext) {
                                                            viewsModel2.loadNext();
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                SelfStoryViewsPage.ViewsModel viewsModel3 = viewsModel;
                                                viewsModel3.getClass();
                                                int i13 = 0;
                                                int i14 = iArr[0];
                                                int i15 = viewsModel3.reqId;
                                                TL_stories.StoryItem storyItem3 = viewsModel3.storyItem;
                                                if (i14 != i15) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                    break;
                                                } else {
                                                    viewsModel3.loading = false;
                                                    viewsModel3.reqId = -1;
                                                    ArrayList arrayList4 = viewsModel3.reactions;
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 != null) {
                                                        TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                        int i16 = viewsModel3.currentAccount;
                                                        MessagesController.getInstance(i16).putUsers(tL_storyReactionsList.users, false);
                                                        MessagesController.getInstance(i16).putChats(tL_storyReactionsList.chats, false);
                                                        MessagesStorage.getInstance(i16).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                        if (viewsModel3.initial) {
                                                            viewsModel3.initial = false;
                                                            for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                                                                viewsModel3.animateDateForUsers.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList4.get(i17)).peer_id)));
                                                            }
                                                            arrayList4.clear();
                                                            viewsModel3.originalViews.clear();
                                                        }
                                                        arrayList4.addAll(tL_storyReactionsList.reactions);
                                                        if (tL_storyReactionsList.reactions.isEmpty()) {
                                                            viewsModel3.hasNext = false;
                                                        } else {
                                                            viewsModel3.hasNext = true;
                                                        }
                                                        String str3 = tL_storyReactionsList.next_offset;
                                                        viewsModel3.offset = str3;
                                                        if (TextUtils.isEmpty(str3)) {
                                                            viewsModel3.hasNext = false;
                                                        }
                                                        if (storyItem3.views == null) {
                                                            storyItem3.views = new TL_stories.TL_storyViews();
                                                        }
                                                        int i18 = viewsModel3.totalCount;
                                                        int i19 = tL_storyReactionsList.count;
                                                        boolean z5 = i18 != i19;
                                                        viewsModel3.totalCount = i19;
                                                        if (z5) {
                                                            NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                        }
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                            viewsModel3.totalCount = 0;
                                                        }
                                                        viewsModel3.hasNext = false;
                                                    }
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList4.size() + " has next " + viewsModel3.hasNext);
                                                    while (true) {
                                                        ArrayList arrayList5 = viewsModel3.listeners;
                                                        if (i13 < arrayList5.size()) {
                                                            ((SelfStoryViewsPage) arrayList5.get(i13)).onDataRecieved(viewsModel3);
                                                            i13++;
                                                        } else if (arrayList4.size() < 20 && viewsModel3.hasNext) {
                                                            viewsModel3.loadNext();
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final SelfStoryViewsPage.ViewsModel viewsModel2 = this.f$0;
                                viewsModel2.getClass();
                                final int[] iArr2 = iArr;
                                final int i4 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z2;
                                        switch (i4) {
                                            case 0:
                                                SelfStoryViewsPage.ViewsModel viewsModel3 = viewsModel2;
                                                viewsModel3.getClass();
                                                int i5 = 0;
                                                int i6 = iArr2[0];
                                                int i7 = viewsModel3.reqId;
                                                TL_stories.StoryItem storyItem2 = viewsModel3.storyItem;
                                                if (i6 != i7) {
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                    break;
                                                } else {
                                                    viewsModel3.loading = false;
                                                    viewsModel3.reqId = -1;
                                                    ArrayList arrayList = viewsModel3.views;
                                                    TLObject tLObject2 = tLObject;
                                                    if (tLObject2 != null) {
                                                        TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                        int i8 = viewsModel3.currentAccount;
                                                        StoriesController storiesController = MessagesController.getInstance(i8).getStoriesController();
                                                        storiesController.getClass();
                                                        if (storyViewsList.views != null) {
                                                            for (int i9 = 0; i9 < storyViewsList.views.size(); i9++) {
                                                                TL_stories.StoryView storyView = storyViewsList.views.get(i9);
                                                                long j2 = storyView.user_id;
                                                                LongSparseArray longSparseArray = storiesController.blockedOverride;
                                                                if (longSparseArray.containsKey(j2)) {
                                                                    longSparseArray.put(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                                }
                                                            }
                                                        }
                                                        MessagesController.getInstance(i8).putUsers(storyViewsList.users, false);
                                                        MessagesController.getInstance(i8).putChats(storyViewsList.chats, false);
                                                        boolean z3 = true;
                                                        MessagesStorage.getInstance(i8).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                        boolean z4 = viewsModel3.initial;
                                                        ArrayList arrayList2 = viewsModel3.originalViews;
                                                        if (z4) {
                                                            viewsModel3.initial = false;
                                                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                                                viewsModel3.animateDateForUsers.add(Long.valueOf(((TL_stories.StoryView) arrayList.get(i10)).user_id));
                                                            }
                                                            arrayList.clear();
                                                            arrayList2.clear();
                                                        }
                                                        if (viewsModel3.useLocalFilters) {
                                                            arrayList2.addAll(storyViewsList.views);
                                                            viewsModel3.applyLocalFilter();
                                                        } else {
                                                            arrayList.addAll(storyViewsList.views);
                                                        }
                                                        if (storyViewsList.views.isEmpty()) {
                                                            viewsModel3.hasNext = false;
                                                        } else {
                                                            viewsModel3.hasNext = true;
                                                        }
                                                        String str2 = storyViewsList.next_offset;
                                                        viewsModel3.offset = str2;
                                                        if (TextUtils.isEmpty(str2)) {
                                                            viewsModel3.hasNext = false;
                                                        }
                                                        if (storyItem2.views == null) {
                                                            storyItem2.views = new TL_stories.TL_storyViews();
                                                        }
                                                        int i11 = storyViewsList.count;
                                                        TL_stories.StoryViews storyViews = storyItem2.views;
                                                        if (i11 > storyViews.views_count) {
                                                            storyViews.recent_viewers.clear();
                                                            for (int iM = 0; iM < Math.min(3, storyViewsList.users.size()); iM = MessagesController$$ExternalSyntheticOutline2.m(storyViewsList.users.get(iM).id, storyItem2.views.recent_viewers, iM, 1)) {
                                                            }
                                                            storyItem2.views.views_count = storyViewsList.count;
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                        int i12 = storyViews2.reactions_count;
                                                        int i13 = storyViewsList.reactions_count;
                                                        if (i12 != i13) {
                                                            storyViews2.reactions_count = i13;
                                                        } else {
                                                            z3 = z2;
                                                        }
                                                        if (z3) {
                                                            NotificationCenter.getInstance(i8).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                        }
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                            viewsModel3.totalCount = 0;
                                                        }
                                                        viewsModel3.hasNext = false;
                                                    }
                                                    FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList.size() + " has next " + viewsModel3.hasNext);
                                                    while (true) {
                                                        ArrayList arrayList3 = viewsModel3.listeners;
                                                        if (i5 < arrayList3.size()) {
                                                            ((SelfStoryViewsPage) arrayList3.get(i5)).onDataRecieved(viewsModel3);
                                                            i5++;
                                                        } else if (arrayList.size() < 20 && viewsModel3.hasNext) {
                                                            viewsModel3.loadNext();
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                SelfStoryViewsPage.ViewsModel viewsModel4 = viewsModel2;
                                                viewsModel4.getClass();
                                                int i14 = 0;
                                                int i15 = iArr2[0];
                                                int i16 = viewsModel4.reqId;
                                                TL_stories.StoryItem storyItem3 = viewsModel4.storyItem;
                                                if (i15 != i16) {
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                    break;
                                                } else {
                                                    viewsModel4.loading = false;
                                                    viewsModel4.reqId = -1;
                                                    ArrayList arrayList4 = viewsModel4.reactions;
                                                    TLObject tLObject3 = tLObject;
                                                    if (tLObject3 != null) {
                                                        TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                        int i17 = viewsModel4.currentAccount;
                                                        MessagesController.getInstance(i17).putUsers(tL_storyReactionsList.users, false);
                                                        MessagesController.getInstance(i17).putChats(tL_storyReactionsList.chats, false);
                                                        MessagesStorage.getInstance(i17).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                        if (viewsModel4.initial) {
                                                            viewsModel4.initial = false;
                                                            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                                                viewsModel4.animateDateForUsers.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList4.get(i18)).peer_id)));
                                                            }
                                                            arrayList4.clear();
                                                            viewsModel4.originalViews.clear();
                                                        }
                                                        arrayList4.addAll(tL_storyReactionsList.reactions);
                                                        if (tL_storyReactionsList.reactions.isEmpty()) {
                                                            viewsModel4.hasNext = false;
                                                        } else {
                                                            viewsModel4.hasNext = true;
                                                        }
                                                        String str3 = tL_storyReactionsList.next_offset;
                                                        viewsModel4.offset = str3;
                                                        if (TextUtils.isEmpty(str3)) {
                                                            viewsModel4.hasNext = false;
                                                        }
                                                        if (storyItem3.views == null) {
                                                            storyItem3.views = new TL_stories.TL_storyViews();
                                                        }
                                                        int i19 = viewsModel4.totalCount;
                                                        int i110 = tL_storyReactionsList.count;
                                                        boolean z5 = i19 != i110;
                                                        viewsModel4.totalCount = i110;
                                                        if (z5) {
                                                            NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                        }
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                            viewsModel4.totalCount = 0;
                                                        }
                                                        viewsModel4.hasNext = false;
                                                    }
                                                    FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList4.size() + " has next " + viewsModel4.hasNext);
                                                    while (true) {
                                                        ArrayList arrayList5 = viewsModel4.listeners;
                                                        if (i14 < arrayList5.size()) {
                                                            ((SelfStoryViewsPage) arrayList5.get(i14)).onDataRecieved(viewsModel4);
                                                            i14++;
                                                        } else if (arrayList4.size() < 20 && viewsModel4.hasNext) {
                                                            viewsModel4.loadNext();
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                this.reqId = iSendRequest;
                final int[] iArr = {iSendRequest};
                return;
            }
            TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
            tL_stories_getStoryViewsList.id = storyItem.id;
            tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i).getInputPeer(j);
            if (this.useLocalFilters) {
                tL_stories_getStoryViewsList.q = "";
                tL_stories_getStoryViewsList.just_contacts = false;
                tL_stories_getStoryViewsList.reactions_first = true;
            } else {
                String str2 = filtersState.searchQuery;
                tL_stories_getStoryViewsList.q = str2;
                if (!TextUtils.isEmpty(str2)) {
                    tL_stories_getStoryViewsList.flags |= 2;
                }
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
            FileLog.d("SelfStoryViewsPage load next " + storyItem.id + " " + this.initial + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
            final int i3 = 1;
            int iSendRequest2 = ConnectionsManager.getInstance(i).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) {
                public final SelfStoryViewsPage.ViewsModel f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i3) {
                        case 0:
                            final SelfStoryViewsPage.ViewsModel viewsModel = this.f$0;
                            viewsModel.getClass();
                            final int[] iArr2 = iArr;
                            final int i4 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z2;
                                    switch (i4) {
                                        case 0:
                                            SelfStoryViewsPage.ViewsModel viewsModel3 = viewsModel;
                                            viewsModel3.getClass();
                                            int i5 = 0;
                                            int i6 = iArr2[0];
                                            int i7 = viewsModel3.reqId;
                                            TL_stories.StoryItem storyItem2 = viewsModel3.storyItem;
                                            if (i6 != i7) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                break;
                                            } else {
                                                viewsModel3.loading = false;
                                                viewsModel3.reqId = -1;
                                                ArrayList arrayList = viewsModel3.views;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    int i8 = viewsModel3.currentAccount;
                                                    StoriesController storiesController = MessagesController.getInstance(i8).getStoriesController();
                                                    storiesController.getClass();
                                                    if (storyViewsList.views != null) {
                                                        for (int i9 = 0; i9 < storyViewsList.views.size(); i9++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i9);
                                                            long j2 = storyView.user_id;
                                                            LongSparseArray longSparseArray = storiesController.blockedOverride;
                                                            if (longSparseArray.containsKey(j2)) {
                                                                longSparseArray.put(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i8).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i8).putChats(storyViewsList.chats, false);
                                                    boolean z3 = true;
                                                    MessagesStorage.getInstance(i8).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    boolean z4 = viewsModel3.initial;
                                                    ArrayList arrayList2 = viewsModel3.originalViews;
                                                    if (z4) {
                                                        viewsModel3.initial = false;
                                                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                                            viewsModel3.animateDateForUsers.add(Long.valueOf(((TL_stories.StoryView) arrayList.get(i10)).user_id));
                                                        }
                                                        arrayList.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (viewsModel3.useLocalFilters) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        viewsModel3.applyLocalFilter();
                                                    } else {
                                                        arrayList.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        viewsModel3.hasNext = false;
                                                    } else {
                                                        viewsModel3.hasNext = true;
                                                    }
                                                    String str4 = storyViewsList.next_offset;
                                                    viewsModel3.offset = str4;
                                                    if (TextUtils.isEmpty(str4)) {
                                                        viewsModel3.hasNext = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i11 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i11 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int iM = 0; iM < Math.min(3, storyViewsList.users.size()); iM = MessagesController$$ExternalSyntheticOutline2.m(storyViewsList.users.get(iM).id, storyItem2.views.recent_viewers, iM, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i12 = storyViews2.reactions_count;
                                                    int i13 = storyViewsList.reactions_count;
                                                    if (i12 != i13) {
                                                        storyViews2.reactions_count = i13;
                                                    } else {
                                                        z3 = z2;
                                                    }
                                                    if (z3) {
                                                        NotificationCenter.getInstance(i8).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        viewsModel3.totalCount = 0;
                                                    }
                                                    viewsModel3.hasNext = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList.size() + " has next " + viewsModel3.hasNext);
                                                while (true) {
                                                    ArrayList arrayList3 = viewsModel3.listeners;
                                                    if (i5 < arrayList3.size()) {
                                                        ((SelfStoryViewsPage) arrayList3.get(i5)).onDataRecieved(viewsModel3);
                                                        i5++;
                                                    } else if (arrayList.size() < 20 && viewsModel3.hasNext) {
                                                        viewsModel3.loadNext();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            SelfStoryViewsPage.ViewsModel viewsModel4 = viewsModel;
                                            viewsModel4.getClass();
                                            int i14 = 0;
                                            int i15 = iArr2[0];
                                            int i16 = viewsModel4.reqId;
                                            TL_stories.StoryItem storyItem3 = viewsModel4.storyItem;
                                            if (i15 != i16) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                viewsModel4.loading = false;
                                                viewsModel4.reqId = -1;
                                                ArrayList arrayList4 = viewsModel4.reactions;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    int i17 = viewsModel4.currentAccount;
                                                    MessagesController.getInstance(i17).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i17).putChats(tL_storyReactionsList.chats, false);
                                                    MessagesStorage.getInstance(i17).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (viewsModel4.initial) {
                                                        viewsModel4.initial = false;
                                                        for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                                            viewsModel4.animateDateForUsers.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList4.get(i18)).peer_id)));
                                                        }
                                                        arrayList4.clear();
                                                        viewsModel4.originalViews.clear();
                                                    }
                                                    arrayList4.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        viewsModel4.hasNext = false;
                                                    } else {
                                                        viewsModel4.hasNext = true;
                                                    }
                                                    String str5 = tL_storyReactionsList.next_offset;
                                                    viewsModel4.offset = str5;
                                                    if (TextUtils.isEmpty(str5)) {
                                                        viewsModel4.hasNext = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i19 = viewsModel4.totalCount;
                                                    int i110 = tL_storyReactionsList.count;
                                                    boolean z5 = i19 != i110;
                                                    viewsModel4.totalCount = i110;
                                                    if (z5) {
                                                        NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        viewsModel4.totalCount = 0;
                                                    }
                                                    viewsModel4.hasNext = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList4.size() + " has next " + viewsModel4.hasNext);
                                                while (true) {
                                                    ArrayList arrayList5 = viewsModel4.listeners;
                                                    if (i14 < arrayList5.size()) {
                                                        ((SelfStoryViewsPage) arrayList5.get(i14)).onDataRecieved(viewsModel4);
                                                        i14++;
                                                    } else if (arrayList4.size() < 20 && viewsModel4.hasNext) {
                                                        viewsModel4.loadNext();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final SelfStoryViewsPage.ViewsModel viewsModel2 = this.f$0;
                            viewsModel2.getClass();
                            final int[] iArr3 = iArr;
                            final int i5 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z2;
                                    switch (i5) {
                                        case 0:
                                            SelfStoryViewsPage.ViewsModel viewsModel3 = viewsModel2;
                                            viewsModel3.getClass();
                                            int i6 = 0;
                                            int i7 = iArr3[0];
                                            int i8 = viewsModel3.reqId;
                                            TL_stories.StoryItem storyItem2 = viewsModel3.storyItem;
                                            if (i7 != i8) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                break;
                                            } else {
                                                viewsModel3.loading = false;
                                                viewsModel3.reqId = -1;
                                                ArrayList arrayList = viewsModel3.views;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    int i9 = viewsModel3.currentAccount;
                                                    StoriesController storiesController = MessagesController.getInstance(i9).getStoriesController();
                                                    storiesController.getClass();
                                                    if (storyViewsList.views != null) {
                                                        for (int i10 = 0; i10 < storyViewsList.views.size(); i10++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i10);
                                                            long j2 = storyView.user_id;
                                                            LongSparseArray longSparseArray = storiesController.blockedOverride;
                                                            if (longSparseArray.containsKey(j2)) {
                                                                longSparseArray.put(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i9).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i9).putChats(storyViewsList.chats, false);
                                                    boolean z3 = true;
                                                    MessagesStorage.getInstance(i9).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    boolean z4 = viewsModel3.initial;
                                                    ArrayList arrayList2 = viewsModel3.originalViews;
                                                    if (z4) {
                                                        viewsModel3.initial = false;
                                                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                                            viewsModel3.animateDateForUsers.add(Long.valueOf(((TL_stories.StoryView) arrayList.get(i11)).user_id));
                                                        }
                                                        arrayList.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (viewsModel3.useLocalFilters) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        viewsModel3.applyLocalFilter();
                                                    } else {
                                                        arrayList.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        viewsModel3.hasNext = false;
                                                    } else {
                                                        viewsModel3.hasNext = true;
                                                    }
                                                    String str4 = storyViewsList.next_offset;
                                                    viewsModel3.offset = str4;
                                                    if (TextUtils.isEmpty(str4)) {
                                                        viewsModel3.hasNext = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i12 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i12 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int iM = 0; iM < Math.min(3, storyViewsList.users.size()); iM = MessagesController$$ExternalSyntheticOutline2.m(storyViewsList.users.get(iM).id, storyItem2.views.recent_viewers, iM, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i13 = storyViews2.reactions_count;
                                                    int i14 = storyViewsList.reactions_count;
                                                    if (i13 != i14) {
                                                        storyViews2.reactions_count = i14;
                                                    } else {
                                                        z3 = z2;
                                                    }
                                                    if (z3) {
                                                        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        viewsModel3.totalCount = 0;
                                                    }
                                                    viewsModel3.hasNext = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList.size() + " has next " + viewsModel3.hasNext);
                                                while (true) {
                                                    ArrayList arrayList3 = viewsModel3.listeners;
                                                    if (i6 < arrayList3.size()) {
                                                        ((SelfStoryViewsPage) arrayList3.get(i6)).onDataRecieved(viewsModel3);
                                                        i6++;
                                                    } else if (arrayList.size() < 20 && viewsModel3.hasNext) {
                                                        viewsModel3.loadNext();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            SelfStoryViewsPage.ViewsModel viewsModel4 = viewsModel2;
                                            viewsModel4.getClass();
                                            int i15 = 0;
                                            int i16 = iArr3[0];
                                            int i17 = viewsModel4.reqId;
                                            TL_stories.StoryItem storyItem3 = viewsModel4.storyItem;
                                            if (i16 != i17) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                viewsModel4.loading = false;
                                                viewsModel4.reqId = -1;
                                                ArrayList arrayList4 = viewsModel4.reactions;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    int i18 = viewsModel4.currentAccount;
                                                    MessagesController.getInstance(i18).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i18).putChats(tL_storyReactionsList.chats, false);
                                                    MessagesStorage.getInstance(i18).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (viewsModel4.initial) {
                                                        viewsModel4.initial = false;
                                                        for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                                                            viewsModel4.animateDateForUsers.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList4.get(i19)).peer_id)));
                                                        }
                                                        arrayList4.clear();
                                                        viewsModel4.originalViews.clear();
                                                    }
                                                    arrayList4.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        viewsModel4.hasNext = false;
                                                    } else {
                                                        viewsModel4.hasNext = true;
                                                    }
                                                    String str5 = tL_storyReactionsList.next_offset;
                                                    viewsModel4.offset = str5;
                                                    if (TextUtils.isEmpty(str5)) {
                                                        viewsModel4.hasNext = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i110 = viewsModel4.totalCount;
                                                    int i111 = tL_storyReactionsList.count;
                                                    boolean z5 = i110 != i111;
                                                    viewsModel4.totalCount = i111;
                                                    if (z5) {
                                                        NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        viewsModel4.totalCount = 0;
                                                    }
                                                    viewsModel4.hasNext = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList4.size() + " has next " + viewsModel4.hasNext);
                                                while (true) {
                                                    ArrayList arrayList5 = viewsModel4.listeners;
                                                    if (i15 < arrayList5.size()) {
                                                        ((SelfStoryViewsPage) arrayList5.get(i15)).onDataRecieved(viewsModel4);
                                                        i15++;
                                                    } else if (arrayList4.size() < 20 && viewsModel4.hasNext) {
                                                        viewsModel4.loadNext();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            this.reqId = iSendRequest2;
            final int[] iArr2 = {iSendRequest2};
        }

        public final void reloadIfNeed(FiltersState filtersState, boolean z, boolean z2) {
            FiltersState filtersState2 = new FiltersState();
            filtersState2.sortByReactions = filtersState.sortByReactions;
            filtersState2.contactsOnly = filtersState.contactsOnly;
            filtersState2.searchQuery = filtersState.searchQuery;
            int i = 0;
            if (!z) {
                filtersState2.contactsOnly = false;
            }
            if (!z2) {
                filtersState2.sortByReactions = true;
            }
            FiltersState filtersState3 = this.state;
            if (filtersState3.equals(filtersState2)) {
                return;
            }
            filtersState3.sortByReactions = filtersState2.sortByReactions;
            filtersState3.contactsOnly = filtersState2.contactsOnly;
            filtersState3.searchQuery = filtersState2.searchQuery;
            if (this.isChannel || !this.useLocalFilters) {
                if (this.reqId >= 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, false);
                }
                this.reqId = -1;
                this.views.clear();
                this.reactions.clear();
                this.initial = true;
                this.loading = false;
                this.hasNext = true;
                this.offset = "";
                loadNext();
                return;
            }
            applyLocalFilter();
            while (true) {
                ArrayList arrayList = this.listeners;
                if (i >= arrayList.size()) {
                    return;
                }
                ((SelfStoryViewsPage) arrayList.get(i)).onDataRecieved(this);
                i++;
            }
        }
    }

    public SelfStoryViewsPage(StoryViewer storyViewer, Context context, FiltersState filtersState, PeerStoriesView$$ExternalSyntheticLambda27 peerStoriesView$$ExternalSyntheticLambda27) {
        super(context);
        this.TOP_PADDING = 96;
        this.state = new FiltersState();
        this.sharedFilterState = filtersState;
        this.onSharedStateChanged = peerStoriesView$$ExternalSyntheticLambda27;
        DarkThemeResourceProvider darkThemeResourceProvider = storyViewer.resourcesProvider;
        this.resourcesProvider = darkThemeResourceProvider;
        this.storyViewer = storyViewer;
        this.currentAccount = storyViewer.currentAccount;
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, darkThemeResourceProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        final SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = (SelfStoryViewsView.AnonymousClass4.AnonymousClass1) this;
        HeaderView headerView = new HeaderView(anonymousClass1, getContext());
        this.headerView = headerView;
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(anonymousClass1, context, darkThemeResourceProvider);
        this.recyclerListView = anonymousClass2;
        anonymousClass2.setClipToPadding(false);
        this.recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(anonymousClass2, true);
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, 0, anonymousClass2);
        this.layoutManager = fillLastLinearLayoutManager;
        anonymousClass2.setLayoutManager(fillLastLinearLayoutManager);
        anonymousClass2.setNestedScrollingEnabled(true);
        ListAdapter listAdapter = new ListAdapter(anonymousClass1);
        this.listAdapter = listAdapter;
        anonymousClass2.setAdapter(listAdapter);
        new RecyclerAnimationScrollHelper(anonymousClass2, fillLastLinearLayoutManager).setScrollListener(new RecyclerAnimationScrollHelper.ScrollListener() {
            @Override
            public final void onScroll() {
                anonymousClass1.invalidate();
            }
        });
        addView(anonymousClass2);
        this.scroller = new RecyclerListViewScroller(anonymousClass2);
        anonymousClass2.setOnScrollListener(new StarGiftSheet.AnonymousClass8(anonymousClass1, 16));
        anonymousClass2.setOnItemClickListener(new SelfStoryViewsPage$$ExternalSyntheticLambda0(0, (SelfStoryViewsView.AnonymousClass4.AnonymousClass1) this, storyViewer));
        anonymousClass2.setOnItemLongClickListener(new AnonymousClass4(anonymousClass1, storyViewer));
        listAdapter.updateRows();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.topViewsContainer = frameLayout;
        View view = new View(getContext());
        this.shadowView = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = Theme.key_dialogBackground;
        view.setBackground(new GradientDrawable(orientation, new int[]{Theme.getColor(i, darkThemeResourceProvider), 0}));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, 8.0f, 0, 0.0f, this.TOP_PADDING - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.shadowView2 = view2;
        view2.setBackgroundColor(Theme.getColor(i, darkThemeResourceProvider));
        frameLayout.addView(view2, LayoutHelper.createFrame(-1, 10.0f, 0, 0.0f, this.TOP_PADDING - 17, 0.0f, 0.0f));
        frameLayout.addView(headerView);
        frameLayout.addView(textView);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(anonymousClass1, getContext(), darkThemeResourceProvider);
        this.searchField = anonymousClass5;
        anonymousClass5.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(anonymousClass5, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void access$600(SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1) {
        ViewsModel viewsModel = anonymousClass1.currentModel;
        if (viewsModel != null) {
            viewsModel.listeners.remove(anonymousClass1);
        }
        ViewsModel viewsModel2 = anonymousClass1.defaultModel;
        anonymousClass1.currentModel = viewsModel2;
        if (viewsModel2 == null) {
            return;
        }
        ArrayList arrayList = viewsModel2.listeners;
        if (!arrayList.contains(anonymousClass1)) {
            arrayList.add(anonymousClass1);
        }
        anonymousClass1.currentModel.reloadIfNeed(anonymousClass1.state, anonymousClass1.showContactsFilter, anonymousClass1.showReactionsSort);
        anonymousClass1.listAdapter.updateRows();
        anonymousClass1.layoutManager.scrollToPositionWithOffset(0, (int) (anonymousClass1.getTopOffset() - anonymousClass1.recyclerListView.getPaddingTop()));
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
                if (viewsModel.reqId >= 0) {
                    ConnectionsManager.getInstance(viewsModel.currentAccount).cancelRequest(viewsModel.reqId, false);
                }
                viewsModel.reqId = -1;
            }
            ViewsModel viewsModel2 = new ViewsModel(i, j, storyItem);
            viewsModel2.loadNext();
            if (sparseArray == null) {
                LongSparseArray longSparseArray = MessagesController.getInstance(i).storiesController.selfViewsModel;
                long j2 = storyItem.dialogId;
                sparseArray = new SparseArray();
                longSparseArray.put(sparseArray, j2);
            }
            sparseArray.put(storyItem.id, viewsModel2);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int childAdapterPosition;
        int i3 = 0;
        if (i == NotificationCenter.storiesUpdated) {
            if (this.storyItem.uploadingStory != null) {
                int i4 = this.currentAccount;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) MessagesController.getInstance(i4).storiesController.allStoriesMap.get(UserConfig.getInstance(i4).clientUserId);
                if (peerStories != null) {
                    for (int i5 = 0; i5 < peerStories.stories.size(); i5++) {
                        TL_stories.StoryItem storyItem = peerStories.stories.get(i5);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.storyItem.uploadingStory.path)) {
                            SelfStoryViewsView.StoryItemInternal storyItemInternal = this.storyItem;
                            storyItemInternal.uploadingStory = null;
                            storyItemInternal.storyItem = storyItem;
                            long j = this.dialogId;
                            this.dialogId = j;
                            this.storyItem = storyItemInternal;
                            updateViewsVisibility();
                            updateViewState(false);
                            if (storyItemInternal.storyItem != null) {
                                NotificationsController.getInstance(i4).processSeenStoryReactions(j, storyItemInternal.storyItem.id);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i != NotificationCenter.storiesBlocklistUpdate) {
            return;
        }
        while (true) {
            AnonymousClass1 anonymousClass1 = this.recyclerListView;
            if (i3 >= anonymousClass1.getChildCount()) {
                return;
            }
            View childAt = anonymousClass1.getChildAt(i3);
            if ((childAt instanceof ReactedUserHolderView) && (childAdapterPosition = anonymousClass1.getChildAdapterPosition(childAt)) >= 0) {
                ListAdapter listAdapter = this.listAdapter;
                if (childAdapterPosition < listAdapter.items.size()) {
                    ((ReactedUserHolderView) childAt).animateAlpha(isStoryShownToUser(((Item) listAdapter.items.get(childAdapterPosition)).view) ? 1.0f : 0.5f, true);
                }
            }
            i3++;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        AnonymousClass1 anonymousClass1;
        int paddingTop;
        View view = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            anonymousClass1 = this.recyclerListView;
            if (i >= anonymousClass1.getChildCount()) {
                break;
            }
            View childAt = anonymousClass1.getChildAt(i);
            int childLayoutPosition = anonymousClass1.getChildLayoutPosition(childAt);
            if (childLayoutPosition < i2 || i2 == -1) {
                i2 = childLayoutPosition;
                view = childAt;
            }
            i++;
        }
        if (i2 == 0) {
            paddingTop = (int) Math.max(0.0f, view.getY());
        } else {
            paddingTop = i2 > 0 ? 0 : anonymousClass1.getPaddingTop();
        }
        FrameLayout frameLayout = this.topViewsContainer;
        float f = paddingTop;
        if (frameLayout.getTranslationY() != f) {
            frameLayout.setTranslationY(f);
            SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = (SelfStoryViewsView.AnonymousClass4.AnonymousClass1) this;
            int iIntValue = ((Integer) anonymousClass2.getTag()).intValue();
            SelfStoryViewsView selfStoryViewsView = SelfStoryViewsView.AnonymousClass4.this.this$0;
            if (iIntValue == selfStoryViewsView.viewPager.getCurrentItem()) {
                selfStoryViewsView.selfStoriesPreviewView.setAlpha(Utilities.clamp(f / selfStoryViewsView.bottomPadding, 1.0f, 0.0f));
                selfStoryViewsView.selfStoriesPreviewView.setTranslationY((-(selfStoryViewsView.bottomPadding - f)) / 2.0f);
            }
        }
        this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), paddingTop, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.shadowDrawable.draw(canvas);
        if (this.checkAutoscroll) {
            this.checkAutoscroll = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != anonymousClass1.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop2 = anonymousClass1.getPaddingTop() / 2.0f;
                RecyclerListViewScroller recyclerListViewScroller = this.scroller;
                if (translationY > paddingTop2) {
                    recyclerListViewScroller.smoothScrollBy((int) (-(anonymousClass1.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    recyclerListViewScroller.smoothScrollBy((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.recyclerListView) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(this.TOP_PADDING), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j);
        canvas.restore();
        return true;
    }

    public float getTopOffset() {
        return this.topViewsContainer.getTranslationY();
    }

    public final boolean isStoryShownToUser(TL_stories.StoryView storyView) {
        StoryEntry storyEntry;
        StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy;
        if (storyView == null) {
            return true;
        }
        int i = this.currentAccount;
        if (MessagesController.getInstance(i).getStoriesController().isBlocked(storyView) || MessagesController.getInstance(i).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(storyView.user_id));
        SelfStoryViewsView.StoryItemInternal storyItemInternal = this.storyItem;
        if (storyItemInternal != null) {
            TL_stories.StoryItem storyItem = storyItemInternal.storyItem;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(i, storyItem.privacy);
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        ViewsModel viewsModel = this.currentModel;
        if (viewsModel != null) {
            ArrayList arrayList = viewsModel.listeners;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.currentModel.animateDateForUsers.clear();
        }
        this.listAdapter.updateRows();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public final boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public final boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public final boolean clipWithGradient(int i2) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i2);
            }

            @Override
            public final int getBottomOffset(int i2) {
                return SelfStoryViewsPage.this.recyclerListView.getPaddingBottom();
            }

            @Override
            public final int getLeftPadding() {
                return Bulletin.Delegate.CC.$default$getLeftPadding(this);
            }

            @Override
            public final int getRightPadding() {
                return Bulletin.Delegate.CC.$default$getRightPadding(this);
            }

            @Override
            public final int getTopOffset(int i2) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i2);
            }

            @Override
            public final void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public final void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public final void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }
        });
    }

    public final void onDataRecieved(ViewsModel viewsModel) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        ListAdapter listAdapter = this.listAdapter;
        int size = listAdapter.items.size();
        FiltersState filtersState = this.state;
        if (TextUtils.isEmpty(filtersState.searchQuery) && !filtersState.contactsOnly) {
            updateViewsVisibility();
        }
        listAdapter.updateRows();
        this.recyclerItemsEnterAnimator.showItemsAnimated(size - 1);
        if (this.currentModel != null && this.layoutManager.findLastVisibleItemPosition() > listAdapter.items.size() - 10) {
            this.currentModel.loadNext();
        }
        if (this.currentRepostsList == null || viewsModel == null || viewsModel != this.currentModel || (arrayList = viewsModel.reactions) == null || this.repostsListConsumedCount >= arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = this.repostsListConsumedCount; i < arrayList.size(); i++) {
            TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i);
            if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                arrayList2.add(storyItem);
            }
        }
        this.repostsListConsumedCount = arrayList.size();
        if (arrayList2.isEmpty()) {
            return;
        }
        this.currentRepostsList.append(arrayList2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        ViewsModel viewsModel = this.currentModel;
        if (viewsModel != null) {
            viewsModel.listeners.remove(this);
        }
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        Bulletin.removeDelegate(this);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.topViewsContainer.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.topViewsContainer.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f) {
        AnonymousClass1 anonymousClass1 = this.recyclerListView;
        if (f != anonymousClass1.getPaddingBottom()) {
            anonymousClass1.setPadding(0, (int) f, 0, 0);
            anonymousClass1.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.shadowDrawable = drawable;
    }

    public final void updateViewState(boolean z) {
        int i;
        FiltersState filtersState = this.state;
        boolean z2 = filtersState.contactsOnly;
        HeaderView headerView = this.headerView;
        if (z2 != headerView.selected || !z) {
            ValueAnimator valueAnimator = headerView.animator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                headerView.animator.cancel();
            }
            headerView.selected = z2 ? 1 : 0;
            if (z) {
                headerView.animateFromRect.set(headerView.rectF);
                headerView.animateFromAlpha1 = headerView.allViewersView.getAlpha();
                headerView.animateFromAlpha2 = headerView.contactsViewersView.getAlpha();
                headerView.animationProgress = 0.0f;
                headerView.invalidate();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                headerView.animator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new RichMediaCell$$ExternalSyntheticLambda1(headerView, 12));
                headerView.animator.addListener(new BaseChartView.AnonymousClass4(headerView, 24));
                headerView.animator.setDuration(250L);
                headerView.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                headerView.animator.start();
            } else {
                headerView.animationProgress = 1.0f;
                headerView.invalidate();
            }
        }
        if (filtersState.sortByReactions) {
            ViewsModel viewsModel = this.currentModel;
            i = (viewsModel == null || !viewsModel.isChannel) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i = R.drawable.menu_views_recent3;
        }
        headerView.replacableDrawable.setIcon(i, z);
    }

    public final void updateViewsVisibility() {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        this.showSearch = false;
        this.showContactsFilter = false;
        this.showReactionsSort = false;
        TL_stories.StoryItem storyItem = this.storyItem.storyItem;
        TextView textView = this.titleView;
        AnonymousClass5 anonymousClass5 = this.searchField;
        HeaderView headerView = this.headerView;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews != null) {
                int i4 = storyViews.views_count;
                this.showSearch = i4 >= 15;
                this.showReactionsSort = storyViews.reactions_count >= (BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 10);
                this.showContactsFilter = (storyItem.dialogId < 0 || i4 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            }
            int i5 = this.currentAccount;
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i5).storiesController.selfViewsModel.get(storyItem.dialogId);
            ViewsModel viewsModel = sparseArray != null ? (ViewsModel) sparseArray.get(storyItem.id) : null;
            this.defaultModel = viewsModel;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i6 = storyViews2 == null ? 0 : storyViews2.views_count;
            FiltersState filtersState = this.state;
            if (viewsModel == null || !(viewsModel.isChannel || viewsModel.totalCount == i6)) {
                if (viewsModel != null) {
                    if (viewsModel.reqId >= 0) {
                        ConnectionsManager.getInstance(viewsModel.currentAccount).cancelRequest(viewsModel.reqId, false);
                    }
                    viewsModel.reqId = -1;
                }
                ViewsModel viewsModel2 = new ViewsModel(i5, this.dialogId, storyItem);
                this.defaultModel = viewsModel2;
                viewsModel2.reloadIfNeed(filtersState, this.showContactsFilter, this.showReactionsSort);
                this.defaultModel.loadNext();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.defaultModel);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.defaultModel);
                    MessagesController.getInstance(i5).storiesController.selfViewsModel.put(sparseArray2, storyItem.dialogId);
                }
            } else {
                viewsModel.reloadIfNeed(filtersState, this.showContactsFilter, this.showReactionsSort);
            }
            ViewsModel viewsModel3 = this.currentModel;
            if (viewsModel3 != null) {
                viewsModel3.listeners.remove(this);
            }
            ViewsModel viewsModel4 = this.defaultModel;
            this.currentModel = viewsModel4;
            if (viewsModel4 != null && this.isAttachedToWindow) {
                ArrayList arrayList = viewsModel4.listeners;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            ViewsModel viewsModel5 = this.currentModel;
            if (viewsModel5 == null || !viewsModel5.isExpiredViews || UserConfig.getInstance(i5).isPremium()) {
                ViewsModel viewsModel6 = this.currentModel;
                if (!viewsModel6.loading && !viewsModel6.hasNext && viewsModel6.views.isEmpty() && this.currentModel.reactions.isEmpty() && TextUtils.isEmpty(this.currentModel.state.searchQuery)) {
                    this.showSearch = false;
                    this.showReactionsSort = false;
                    this.showContactsFilter = false;
                    if (this.currentModel.isChannel) {
                        i3 = R.string.Reactions;
                    } else {
                        i3 = R.string.Viewers;
                    }
                    textView.setText(LocaleController.getString(i3));
                    anonymousClass5.setVisibility(8);
                    headerView.setVisibility(8);
                    this.TOP_PADDING = 46;
                } else {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.showSearch = false;
                        this.showReactionsSort = false;
                        this.showContactsFilter = false;
                        textView.setText(LocaleController.getString(this.currentModel.isChannel ? R.string.Reactions : R.string.Viewers));
                        anonymousClass5.setVisibility(8);
                        headerView.setVisibility(8);
                        this.TOP_PADDING = 46;
                    } else {
                        headerView.setVisibility(0);
                        ViewsModel viewsModel7 = this.currentModel;
                        boolean z3 = viewsModel7.showReactionOnly;
                        boolean z4 = viewsModel7.isChannel;
                        if (z3) {
                            textView.setText(LocaleController.getString(z4 ? R.string.Reactions : R.string.Viewers));
                            this.showSearch = false;
                            this.showReactionsSort = false;
                            this.showContactsFilter = false;
                        } else {
                            if ((z4 ? viewsModel7.reactions : viewsModel7.views).size() < 20) {
                                ViewsModel viewsModel8 = this.currentModel;
                                if ((viewsModel8.isChannel ? viewsModel8.reactions : viewsModel8.views).size() < storyItem.views.views_count) {
                                    ViewsModel viewsModel9 = this.currentModel;
                                    if (viewsModel9.loading || viewsModel9.hasNext) {
                                        if (!this.currentModel.isChannel || storyItem.views.views_count < 15) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        this.showSearch = z;
                                        TL_stories.StoryViews storyViews4 = storyItem.views;
                                        i = storyViews4.reactions_count;
                                        if (BuildVars.DEBUG_VERSION) {
                                            i2 = 5;
                                        } else {
                                            i2 = 10;
                                        }
                                        if (i >= i2) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        this.showReactionsSort = z2;
                                        this.showContactsFilter = (storyItem.dialogId >= 0 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                                    } else {
                                        this.showSearch = false;
                                        this.showReactionsSort = false;
                                        this.showContactsFilter = false;
                                    }
                                } else {
                                    if (this.currentModel.isChannel) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    this.showSearch = z;
                                    TL_stories.StoryViews storyViews5 = storyItem.views;
                                    i = storyViews5.reactions_count;
                                    if (BuildVars.DEBUG_VERSION) {
                                        i2 = 5;
                                    } else {
                                        i2 = 10;
                                    }
                                    if (i >= i2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    this.showReactionsSort = z2;
                                    this.showContactsFilter = (storyItem.dialogId >= 0 || storyViews5.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                                }
                            } else {
                                if (this.currentModel.isChannel) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                this.showSearch = z;
                                TL_stories.StoryViews storyViews6 = storyItem.views;
                                i = storyViews6.reactions_count;
                                if (BuildVars.DEBUG_VERSION) {
                                    i2 = 5;
                                } else {
                                    i2 = 10;
                                }
                                if (i >= i2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.showReactionsSort = z2;
                                this.showContactsFilter = (storyItem.dialogId >= 0 || storyViews6.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            }
                            textView.setText(LocaleController.getString(this.currentModel.isChannel ? R.string.Reactions : R.string.Viewers));
                        }
                        anonymousClass5.setVisibility(this.showSearch ? 0 : 8);
                        this.TOP_PADDING = this.showSearch ? 96 : 46;
                    }
                }
            } else {
                this.showSearch = false;
                this.showReactionsSort = false;
                this.showContactsFilter = false;
                if (this.currentModel.isChannel) {
                    i3 = R.string.Reactions;
                } else {
                    i3 = R.string.Viewers;
                }
                textView.setText(LocaleController.getString(i3));
                anonymousClass5.setVisibility(8);
                headerView.setVisibility(8);
                this.TOP_PADDING = 46;
            }
        } else {
            this.TOP_PADDING = 46;
            textView.setText(LocaleController.getString(R.string.UploadingStory));
            anonymousClass5.setVisibility(8);
            headerView.setVisibility(8);
        }
        headerView.buttonContainer.setVisibility(this.showReactionsSort ? 0 : 8);
        headerView.allViewersView.setVisibility(this.showContactsFilter ? 0 : 8);
        headerView.contactsViewersView.setVisibility(this.showContactsFilter ? 0 : 8);
        if (this.showContactsFilter) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        ((ViewGroup.MarginLayoutParams) this.shadowView.getLayoutParams()).topMargin = AndroidUtilities.dp(this.TOP_PADDING - 8);
        ((ViewGroup.MarginLayoutParams) this.shadowView2.getLayoutParams()).topMargin = AndroidUtilities.dp(this.TOP_PADDING - 17);
    }

    public final class Item {
        public final TL_stories.StoryReaction reaction;
        public final TL_stories.StoryView view;
        public final int viewType;

        public Item(int i) {
            this.viewType = i;
            this.view = null;
            this.reaction = null;
        }

        public Item(TL_stories.StoryView storyView) {
            this.viewType = 1;
            this.view = storyView;
            this.reaction = null;
        }

        public Item(TL_stories.StoryReaction storyReaction) {
            this.viewType = 1;
            this.view = null;
            this.reaction = storyReaction;
        }
    }
}
