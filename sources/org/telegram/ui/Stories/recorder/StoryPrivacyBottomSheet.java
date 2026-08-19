package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticNonNull0;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public class StoryPrivacyBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private int activePage;
    private boolean allowComments;
    private boolean allowCover;
    private boolean allowScreenshots;
    private boolean allowSmallChats;
    private boolean applyWhenDismiss;
    private final Paint backgroundPaint;
    private boolean canChangePeer;
    private int commentsPrice;
    private Drawable coverDrawable;
    private final ArrayList excludedContacts;
    private final ArrayList excludedEveryone;
    private final HashMap excludedEveryoneByGroup;
    private int excludedEveryoneCount;
    private boolean isEdit;
    private boolean isLive;
    private boolean isRtmpStream;
    private boolean keepOnMyPage;
    private boolean liveSettings;
    private boolean loadedContacts;
    private final ArrayList messageUsers;
    private Utilities.Callback onDismiss;
    private DoneCallback onDone;
    private Utilities.Callback onDone2;
    private Utilities.Callback onSelectedAlbums;
    private Utilities.Callback onSelectedPeer;
    private final HashSet selectedAlbums;
    private final ArrayList selectedContacts;
    private final HashMap selectedContactsByGroup;
    private int selectedContactsCount;
    public TLRPC.InputPeer selectedPeer;
    private int selectedType;
    private boolean sendAsMessageEnabled;
    private int shiftDp;
    private HashMap smallChatsParticipantsCount;
    private boolean startedFromSendAsMessage;
    private int storiesCount;
    private int storyPeriod;
    private ViewPagerFixed viewPager;
    private ArrayList warnUsers;
    private Runnable whenCoverClicked;

    public interface DoneCallback {
        void done(StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, Runnable runnable, Runnable runnable2);
    }

    @Override
    protected boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    public HashSet mergeUsers(ArrayList arrayList, HashMap map) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                hashSet.addAll((ArrayList) it.next());
            }
        }
        return hashSet;
    }

    class Page extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
        private Adapter adapter;
        private final ArrayList atTop;
        private final ButtonWithCounterView button;
        private final ButtonWithCounterView button2;
        private final ButtonContainer buttonContainer;
        private final LongSparseArray changelog;
        private boolean containsHeader;
        private final FrameLayout contentView;
        private HeaderCell headerView;
        private boolean isActionBar;
        private final ArrayList items;
        private int keyboardHeight;
        private boolean keyboardMoving;
        private int lastSelectedType;
        private LinearLayoutManager layoutManager;
        private RecyclerListView listView;
        private final ArrayList oldItems;
        public int pageType;
        private AlertDialog progressDialog;
        private String query;
        private boolean scrolling;
        private SearchUsersCell searchField;
        private ValueAnimator searchFieldAnimator;
        private int searchPosition;
        private boolean searchTranslationAnimating;
        private float searchTranslationAnimatingTo;
        private GraySectionCell sectionCell;
        private final ArrayList selectedUsers;
        private final HashMap selectedUsersByGroup;
        private final View underKeyboardView;
        private long waitingForChatId;
        public boolean wasAtBottom;
        public boolean wasAtTop;
        private boolean wasKeyboardVisible;

        public Page(final Context context) {
            super(context);
            this.changelog = new LongSparseArray();
            this.selectedUsers = new ArrayList();
            this.selectedUsersByGroup = new HashMap();
            this.searchPosition = -1;
            this.atTop = new ArrayList();
            this.oldItems = new ArrayList();
            this.items = new ArrayList();
            this.lastSelectedType = -1;
            this.sectionCell = new GraySectionCell(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
            SearchUsersCell searchUsersCell = new SearchUsersCell(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider, new Runnable() {
                @Override
                public final void run() {
                    StoryPrivacyBottomSheet.Page.m4591$r8$lambda$Vg0MtXVVtdrjn9PoLJwDUWMMyw(this.f$0);
                }
            }) {
                @Override
                public void setContainerHeight(float f) {
                    super.setContainerHeight(f);
                    Page.this.sectionCell.setTranslationY(((getY() - (Page.this.contentView == null ? 0 : Page.this.contentView.getPaddingTop())) + Math.min(AndroidUtilities.dp(150.0f), this.containerHeight)) - 1.0f);
                    if (Page.this.contentView != null) {
                        Page.this.contentView.invalidate();
                    }
                }

                @Override
                public void setTranslationY(float f) {
                    super.setTranslationY(f);
                    Page.this.sectionCell.setTranslationY(((getY() - (Page.this.contentView == null ? 0 : Page.this.contentView.getPaddingTop())) + Math.min(AndroidUtilities.dp(150.0f), this.containerHeight)) - 1.0f);
                    if (Page.this.contentView != null) {
                        Page.this.contentView.invalidate();
                    }
                }
            };
            this.searchField = searchUsersCell;
            int i = Theme.key_dialogBackground;
            searchUsersCell.setBackgroundColor(StoryPrivacyBottomSheet.this.getThemedColor(i));
            this.searchField.setOnSearchTextChange(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.onSearch((String) obj);
                }
            });
            HeaderCell headerCell = new HeaderCell(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
            this.headerView = headerCell;
            headerCell.setOnCloseClickListener(new Runnable() {
                @Override
                public final void run() {
                    StoryPrivacyBottomSheet.Page.m4593$r8$lambda$hXJlhQ3ZICCE_ufLSTHhRaV3c(this.f$0);
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            this.contentView = frameLayout;
            frameLayout.setPadding(0, AndroidUtilities.statusBarHeight + AndroidUtilities.dp(56.0f), 0, 0);
            frameLayout.setClipToPadding(true);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            RecyclerListView recyclerListView = new RecyclerListView(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
            this.listView = recyclerListView;
            recyclerListView.setClipToPadding(false);
            this.listView.setTranslateSelector(true);
            RecyclerListView recyclerListView2 = this.listView;
            Adapter adapter = new Adapter(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider, this.searchField, new Runnable() {
                @Override
                public final void run() {
                    storyPrivacyBottomSheet.onBackPressed();
                }
            });
            this.adapter = adapter;
            recyclerListView2.setAdapter(adapter);
            this.adapter.listView = this.listView;
            RecyclerListView recyclerListView3 = this.listView;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            this.layoutManager = linearLayoutManager;
            recyclerListView3.setLayoutManager(linearLayoutManager);
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                private boolean canScrollDown;

                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    boolean zCanScrollVertically = Page.this.listView.canScrollVertically(1);
                    if (zCanScrollVertically != this.canScrollDown) {
                        Page.this.buttonContainer.invalidate();
                        this.canScrollDown = zCanScrollVertically;
                    }
                    Page.this.contentView.invalidate();
                    ((BottomSheet) StoryPrivacyBottomSheet.this).containerView.invalidate();
                    Page page = Page.this;
                    if (page.pageType != 6 || page.listView.getChildCount() <= 0 || Page.this.listView.getChildAdapterPosition(Page.this.listView.getChildAt(0)) < MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getStoriesController().blocklist.size()) {
                        return;
                    }
                    MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getStoriesController().loadBlocklist(false);
                }

                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                    if (i2 == 1 && ((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible && Page.this.searchField != null) {
                        StoryPrivacyBottomSheet.this.closeKeyboard();
                    }
                    if (i2 == 0) {
                        Page page = Page.this;
                        page.wasAtTop = page.atTop();
                        Page page2 = Page.this;
                        page2.wasAtBottom = page2.atBottom();
                    }
                    Page.this.scrolling = i2 != 0;
                }
            });
            this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
                @Override
                public boolean hasDoubleTap(View view, int i2) {
                    return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i2);
                }

                @Override
                public void onDoubleTap(View view, int i2, float f, float f2) {
                    RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i2, f, f2);
                }

                @Override
                public final void onItemClick(View view, int i2, float f, float f2) {
                    StoryPrivacyBottomSheet.Page.$r8$lambda$rsIzbzzgEuv3PhDVlAz9CXz8xvs(this.f$0, context, view, i2, f, f2);
                }
            });
            frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
                    return true;
                }

                @Override
                protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) StoryPrivacyBottomSheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                    Page.this.listView.invalidate();
                }

                @Override
                protected void onChangeAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) StoryPrivacyBottomSheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                }

                @Override
                protected void onAddAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) StoryPrivacyBottomSheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                }

                @Override
                protected void onRemoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) StoryPrivacyBottomSheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                }
            };
            defaultItemAnimator.setDurations(350L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            this.listView.setItemAnimator(defaultItemAnimator);
            frameLayout.addView(this.searchField, LayoutHelper.createFrame(-1, -2, 55));
            frameLayout.addView(this.sectionCell, LayoutHelper.createFrame(-1, 32, 55));
            addView(this.headerView, LayoutHelper.createFrame(-1, -2, 55));
            ButtonContainer buttonContainer = new ButtonContainer(context);
            this.buttonContainer = buttonContainer;
            buttonContainer.setClickable(true);
            buttonContainer.setOrientation(1);
            buttonContainer.setPadding(AndroidUtilities.dp(10.0f) + ((BottomSheet) StoryPrivacyBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + ((BottomSheet) StoryPrivacyBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.dp(10.0f));
            buttonContainer.setBackgroundColor(Theme.getColor(i, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.onButton1Click(view);
                }
            });
            buttonWithCounterView.setRound();
            buttonContainer.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
            this.button2 = buttonWithCounterView2;
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.onButton2Click(view);
                }
            });
            buttonWithCounterView2.setRound();
            buttonContainer.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 87, 0, 8, 0, 0));
            View view = new View(context);
            this.underKeyboardView = view;
            view.setBackgroundColor(Theme.getColor(i, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider));
            addView(view, LayoutHelper.createFrame(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
            addView(buttonContainer, LayoutHelper.createFrame(-1, -2, 87));
        }

        public static void m4591$r8$lambda$Vg0MtXVVtdrjn9PoLJwDUWMMyw(Page page) {
            page.adapter.notifyItemChanged(2);
            page.listView.forceLayout();
            page.updateTops();
        }

        public static void m4593$r8$lambda$hXJlhQ3ZICCE_ufLSTHhRaV3c(Page page) {
            if (page.pageType == 0) {
                StoryPrivacyBottomSheet.this.dismiss();
            } else {
                StoryPrivacyBottomSheet.this.onBackPressed();
            }
        }

        public static void $r8$lambda$rsIzbzzgEuv3PhDVlAz9CXz8xvs(final Page page, Context context, View view, int i, float f, float f2) {
            TLRPC.ChatParticipants chatParticipants;
            ArrayList<TLRPC.ChatParticipant> arrayList;
            if (i < 0) {
                page.getClass();
                return;
            }
            if (i >= page.items.size()) {
                return;
            }
            ItemInner itemInner = (ItemInner) page.items.get(i);
            int i2 = itemInner.viewType;
            int i3 = 0;
            if (i2 != 3) {
                if (i2 == 7) {
                    if (view instanceof TextCell) {
                        TextCell textCell = (TextCell) view;
                        textCell.setChecked(!textCell.isChecked());
                        itemInner.checked = textCell.isChecked();
                        int i4 = itemInner.resId;
                        if (i4 == 0) {
                            StoryPrivacyBottomSheet.this.allowScreenshots = textCell.isChecked();
                            i3 = StoryPrivacyBottomSheet.this.selectedType == 4 ? 1 : 0;
                            if (StoryPrivacyBottomSheet.this.allowScreenshots) {
                                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                                BulletinFactory.of(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.ic_save_to_gallery, LocaleController.getString(i3 != 0 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots), 4).setDuration(5000).show(true);
                                return;
                            } else {
                                StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = StoryPrivacyBottomSheet.this;
                                BulletinFactory.of(storyPrivacyBottomSheet2.container, ((BottomSheet) storyPrivacyBottomSheet2).resourcesProvider).createSimpleBulletin(R.raw.passcode_lock_close, LocaleController.getString(i3 != 0 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots), 4).setDuration(5000).show(true);
                                return;
                            }
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                StoryPrivacyBottomSheet.this.allowComments = textCell.isChecked();
                                page.updateItems(true);
                                return;
                            }
                            return;
                        }
                        StoryPrivacyBottomSheet.this.keepOnMyPage = textCell.isChecked();
                        StoryPrivacyBottomSheet storyPrivacyBottomSheet3 = StoryPrivacyBottomSheet.this;
                        boolean z = storyPrivacyBottomSheet3.selectedPeer instanceof TLRPC.TL_inputPeerChannel;
                        if (storyPrivacyBottomSheet3.keepOnMyPage) {
                            StoryPrivacyBottomSheet storyPrivacyBottomSheet4 = StoryPrivacyBottomSheet.this;
                            BulletinFactory.of(storyPrivacyBottomSheet4.container, ((BottomSheet) storyPrivacyBottomSheet4).resourcesProvider).createSimpleBulletin(R.raw.msg_story_keep, LocaleController.getString(z ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep), 4).setDuration(5000).show(true);
                        } else {
                            StoryPrivacyBottomSheet storyPrivacyBottomSheet5 = StoryPrivacyBottomSheet.this;
                            BulletinFactory.of(storyPrivacyBottomSheet5.container, ((BottomSheet) storyPrivacyBottomSheet5).resourcesProvider).createSimpleBulletin(R.raw.fire_on, LocaleController.getString(z ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep), 4).setDuration(5000).show(true);
                        }
                        page.updateItems(true);
                        return;
                    }
                    return;
                }
                if (i2 == 9) {
                    int i5 = itemInner.id;
                    if (i5 == 0) {
                        if (StoryPrivacyBottomSheet.this.whenCoverClicked != null) {
                            StoryPrivacyBottomSheet.this.whenCoverClicked.run();
                            return;
                        }
                        return;
                    }
                    if (i5 == 1) {
                        final long dialogId = page.getDialogId();
                        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(page, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider, view);
                        itemOptionsMakeOptions.add(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new Runnable() {
                            @Override
                            public final void run() {
                                StoryPrivacyBottomSheet.Page.m4595$r8$lambda$nNiLW50c7IEy0t3byYbrZQdxrc(this.f$0, dialogId);
                            }
                        });
                        itemOptionsMakeOptions.addGap();
                        ItemOptions.addAlbumsItemOptions(itemOptionsMakeOptions, StoryPrivacyBottomSheet.this.getStoriesController().getStoryAlbumsList(dialogId), StoryPrivacyBottomSheet.this.selectedAlbums, false, null, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                StoryPrivacyBottomSheet.Page.$r8$lambda$txQm9nubBuyyRHWYwX3RrTV6fOc(this.f$0, itemOptionsMakeOptions, (StoriesController.StoryAlbum) obj);
                            }
                        });
                        itemOptionsMakeOptions.show();
                        return;
                    }
                    if (i5 != 5) {
                        if (i5 == 6) {
                            StoryPrivacyBottomSheet.this.isRtmpStream = false;
                            page.updateItems(true);
                            return;
                        }
                        return;
                    }
                    final AlertDialog alertDialog = new AlertDialog(page.getContext(), 3, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
                    alertDialog.showDelayed(500L);
                    final TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer tL_inputPeerSelf = StoryPrivacyBottomSheet.this.selectedPeer;
                    if (tL_inputPeerSelf == null) {
                        tL_inputPeerSelf = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = tL_inputPeerSelf;
                    ConnectionsManager.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).sendRequest(getgroupcallstreamrtmpurl, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            StoryPrivacyBottomSheet.Page.m4589$r8$lambda$QvExIoN4qP1E0rKiHrk7nnEsgQ(this.f$0, alertDialog, getgroupcallstreamrtmpurl, tLObject, tL_error);
                        }
                    });
                    return;
                }
                return;
            }
            if (itemInner.sendAs && StoryPrivacyBottomSheet.this.canChangePeer) {
                new ChoosePeerSheet(context, ((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount, StoryPrivacyBottomSheet.this.isLive, StoryPrivacyBottomSheet.this.selectedPeer, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoryPrivacyBottomSheet.Page.$r8$lambda$Td2s0YpryAf8K72fTDff6CD1WfI(this.f$0, (TLRPC.InputPeer) obj);
                    }
                }, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider).show();
                return;
            }
            int i6 = itemInner.type;
            if (i6 == 1) {
                if (StoryPrivacyBottomSheet.this.selectedType == 1 || StoryPrivacyBottomSheet.this.getCloseFriends().isEmpty()) {
                    StoryPrivacyBottomSheet.this.activePage = 1;
                    StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(1);
                }
                StoryPrivacyBottomSheet.this.selectedType = 1;
                page.updateCheckboxes(true);
                return;
            }
            if (i6 == 3) {
                if (StoryPrivacyBottomSheet.this.selectedType == 3 || (StoryPrivacyBottomSheet.this.selectedContacts.isEmpty() && StoryPrivacyBottomSheet.this.selectedContactsByGroup.isEmpty())) {
                    StoryPrivacyBottomSheet.this.activePage = 3;
                    StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(1);
                }
                StoryPrivacyBottomSheet.this.selectedType = 3;
                page.updateCheckboxes(true);
                return;
            }
            if (i6 == 2) {
                if (StoryPrivacyBottomSheet.this.selectedType == 2) {
                    StoryPrivacyBottomSheet.this.activePage = 2;
                    StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(1);
                }
                StoryPrivacyBottomSheet.this.selectedType = 2;
                page.updateCheckboxes(true);
                return;
            }
            if (i6 == 4) {
                if (StoryPrivacyBottomSheet.this.selectedType == 4) {
                    StoryPrivacyBottomSheet.this.activePage = 4;
                    StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(1);
                }
                StoryPrivacyBottomSheet.this.selectedType = 4;
                page.updateCheckboxes(true);
                return;
            }
            if (i6 > 0) {
                page.selectedUsers.clear();
                page.selectedUsersByGroup.clear();
                StoryPrivacyBottomSheet.this.selectedType = itemInner.type;
                page.searchField.spansContainer.removeAllSpans(true);
            } else {
                TLRPC.Chat chat = itemInner.chat;
                if (chat != null) {
                    final long j = chat.id;
                    if (StoryPrivacyBottomSheet.this.getParticipantsCount(chat) > 200) {
                        try {
                            page.performHapticFeedback(3, 1);
                        } catch (Throwable unused) {
                        }
                        new AlertDialog.Builder(page.getContext(), ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider).setTitle(LocaleController.getString(R.string.GroupTooLarge)).setMessage(LocaleController.getString(R.string.GroupTooLargeMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                    } else if (page.selectedUsersByGroup.containsKey(Long.valueOf(j))) {
                        ArrayList arrayList2 = (ArrayList) page.selectedUsersByGroup.get(Long.valueOf(j));
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            while (i3 < size) {
                                Object obj = arrayList2.get(i3);
                                i3++;
                                page.changelog.put(((Long) obj).longValue(), Boolean.FALSE);
                            }
                        }
                        page.selectedUsersByGroup.remove(Long.valueOf(j));
                        page.updateSpans(true);
                    } else {
                        final TLRPC.Chat chat2 = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getChat(Long.valueOf(j));
                        TLRPC.ChatFull chatFull = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getChatFull(j);
                        if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                            AlertDialog alertDialog2 = page.progressDialog;
                            if (alertDialog2 != null) {
                                alertDialog2.dismiss();
                                page.progressDialog = null;
                            }
                            page.waitingForChatId = j;
                            AlertDialog alertDialog3 = new AlertDialog(page.getContext(), 3, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
                            page.progressDialog = alertDialog3;
                            alertDialog3.showDelayed(50L);
                            final MessagesStorage messagesStorage = MessagesStorage.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount);
                            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                                @Override
                                public final void run() {
                                    StoryPrivacyBottomSheet.Page.$r8$lambda$XRsTEV1cnFAbMcLQjJyeEdch9Tw(this.f$0, chat2, messagesStorage, j);
                                }
                            });
                        } else {
                            page.selectChat(j, chatFull.participants);
                        }
                        if (!TextUtils.isEmpty(page.query)) {
                            page.searchField.setText("");
                            page.query = null;
                            page.updateItems(false);
                        }
                    }
                } else if (itemInner.user != null) {
                    if (page.pageType == 0) {
                        StoryPrivacyBottomSheet.this.selectedType = 0;
                    }
                    long j2 = itemInner.user.id;
                    HashSet hashSet = new HashSet(page.selectedUsers);
                    if (page.selectedUsers.contains(Long.valueOf(j2))) {
                        Iterator it = page.selectedUsersByGroup.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j2))) {
                                it.remove();
                                hashSet.addAll((Collection) entry.getValue());
                            }
                        }
                        hashSet.remove(Long.valueOf(j2));
                        page.changelog.put(j2, Boolean.FALSE);
                    } else {
                        Iterator it2 = page.selectedUsersByGroup.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j2))) {
                                it2.remove();
                                hashSet.addAll((Collection) entry2.getValue());
                            }
                        }
                        hashSet.add(Long.valueOf(j2));
                        if (!TextUtils.isEmpty(page.query)) {
                            page.searchField.setText("");
                            page.query = null;
                            page.updateItems(false);
                        }
                        page.changelog.put(j2, Boolean.TRUE);
                    }
                    page.selectedUsers.clear();
                    page.selectedUsers.addAll(hashSet);
                    page.updateSpans(true);
                }
            }
            page.updateCheckboxes(true);
            page.updateButton(true);
            page.searchField.scrollToBottom();
        }

        public static void $r8$lambda$Td2s0YpryAf8K72fTDff6CD1WfI(Page page, TLRPC.InputPeer inputPeer) {
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
            storyPrivacyBottomSheet.selectedPeer = inputPeer;
            storyPrivacyBottomSheet.selectedAlbums.clear();
            if (StoryPrivacyBottomSheet.this.isLive && StoryPrivacyBottomSheet.this.isRtmpStream) {
                StoryPrivacyBottomSheet.this.isRtmpStream = false;
            }
            if (StoryPrivacyBottomSheet.this.onSelectedPeer != null) {
                StoryPrivacyBottomSheet.this.onSelectedPeer.run(StoryPrivacyBottomSheet.this.selectedPeer);
            }
            if (StoryPrivacyBottomSheet.this.onSelectedAlbums != null) {
                StoryPrivacyBottomSheet.this.onSelectedAlbums.run(new HashSet(StoryPrivacyBottomSheet.this.selectedAlbums));
            }
            page.updateItems(true);
        }

        public static void $r8$lambda$XRsTEV1cnFAbMcLQjJyeEdch9Tw(final Page page, TLRPC.Chat chat, MessagesStorage messagesStorage, final long j) {
            TLRPC.ChatParticipants chatParticipants;
            ArrayList<TLRPC.ChatParticipant> arrayList;
            page.getClass();
            final boolean zIsChannel = ChatObject.isChannel(chat);
            final TLRPC.ChatFull chatFullLoadChatInfoInQueue = messagesStorage.loadChatInfoInQueue(j, zIsChannel, true, true, 0);
            if (chatFullLoadChatInfoInQueue == null || (chatParticipants = chatFullLoadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < chatFullLoadChatInfoInQueue.participants_count - 1)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StoryPrivacyBottomSheet.Page.m4594$r8$lambda$mMgpRX_qI4OdzQxueTMrmBFbIY(this.f$0, zIsChannel, j);
                    }
                });
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StoryPrivacyBottomSheet.Page.m4592$r8$lambda$WPm3rOSTM2_hQPwdueeDkQXZzM(this.f$0, j, chatFullLoadChatInfoInQueue);
                    }
                });
            }
        }

        public static void m4594$r8$lambda$mMgpRX_qI4OdzQxueTMrmBFbIY(final Page page, boolean z, final long j) {
            if (z) {
                MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).loadChannelParticipants(Long.valueOf(j), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoryPrivacyBottomSheet.Page.$r8$lambda$Q7fajuZTP7Jtq2gyRZ0skhS33Hw(this.f$0, j, (TLRPC.TL_channels_channelParticipants) obj);
                    }
                }, 200);
            } else {
                MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).loadFullChat(j, 0, true);
            }
        }

        public static void $r8$lambda$Q7fajuZTP7Jtq2gyRZ0skhS33Hw(Page page, long j, TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants) {
            long peerDialogId;
            AlertDialog alertDialog = page.progressDialog;
            if (alertDialog != null) {
                alertDialog.dismissUnless(350L);
                page.progressDialog = null;
            }
            if (tL_channels_channelParticipants == null || tL_channels_channelParticipants.participants.isEmpty()) {
                return;
            }
            TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
            for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                TLRPC.Peer peer = channelParticipant.peer;
                if (peer != null) {
                    peerDialogId = DialogObject.getPeerDialogId(peer);
                    if (peerDialogId < 0) {
                    }
                } else {
                    peerDialogId = channelParticipant.user_id;
                }
                tL_chatParticipant.user_id = peerDialogId;
                tL_chatParticipants.participants.add(tL_chatParticipant);
            }
            page.selectChat(j, tL_chatParticipants);
        }

        public static void m4592$r8$lambda$WPm3rOSTM2_hQPwdueeDkQXZzM(Page page, long j, TLRPC.ChatFull chatFull) {
            page.getClass();
            page.selectChat(j, chatFull.participants);
        }

        public static void m4595$r8$lambda$nNiLW50c7IEy0t3byYbrZQdxrc(final Page page, final long j) {
            Context context = page.getContext();
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
            AlertsCreator.createStoriesAlbumEnterNameForCreate(context, storyPrivacyBottomSheet.attachedFragment, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider, new MessagesStorage.StringCallback() {
                @Override
                public final void run(String str) {
                    StoryPrivacyBottomSheet.Page page2 = this.f$0;
                    StoryPrivacyBottomSheet.this.getStoriesController().createAlbum(j, str, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            StoryPrivacyBottomSheet.Page.$r8$lambda$jbxZVSlGioBY81Uj2tZZXOq9Q24(page2, (StoriesController.StoryAlbum) obj);
                        }
                    });
                }
            });
        }

        public static void $r8$lambda$jbxZVSlGioBY81Uj2tZZXOq9Q24(Page page, StoriesController.StoryAlbum storyAlbum) {
            StoryPrivacyBottomSheet.this.selectedAlbums.add(Integer.valueOf(storyAlbum.album_id));
            page.updateItems(true);
            if (StoryPrivacyBottomSheet.this.onSelectedAlbums != null) {
                StoryPrivacyBottomSheet.this.onSelectedAlbums.run(new HashSet(StoryPrivacyBottomSheet.this.selectedAlbums));
            }
        }

        public static void $r8$lambda$txQm9nubBuyyRHWYwX3RrTV6fOc(Page page, ItemOptions itemOptions, StoriesController.StoryAlbum storyAlbum) {
            page.getClass();
            itemOptions.dismiss();
            page.updateItems(true);
            if (StoryPrivacyBottomSheet.this.onSelectedAlbums != null) {
                StoryPrivacyBottomSheet.this.onSelectedAlbums.run(new HashSet(StoryPrivacyBottomSheet.this.selectedAlbums));
            }
        }

        public static void m4589$r8$lambda$QvExIoN4qP1E0rKiHrk7nnEsgQ(final Page page, final AlertDialog alertDialog, final TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            page.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoryPrivacyBottomSheet.Page.$r8$lambda$axfB2lwmf4uAmHSwfEjmZKQiOWo(this.f$0, alertDialog, tLObject, getgroupcallstreamrtmpurl, tL_error);
                }
            });
        }

        public static void $r8$lambda$axfB2lwmf4uAmHSwfEjmZKQiOWo(final Page page, AlertDialog alertDialog, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
            page.getClass();
            alertDialog.dismiss();
            if (tLObject instanceof TL_phone.groupCallStreamRtmpUrl) {
                final CreateRtmpStreamBottomSheet[] createRtmpStreamBottomSheetArr = new CreateRtmpStreamBottomSheet[1];
                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = new CreateRtmpStreamBottomSheet(page.getContext(), ((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject, StoryPrivacyBottomSheet.this.liveSettings ? null : new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoryPrivacyBottomSheet.Page.$r8$lambda$FD6JufHtKnYoIjwFTR4iCJCPgnk(this.f$0, createRtmpStreamBottomSheetArr, (Browser.Progress) obj);
                    }
                }, new DarkThemeResourceProvider());
                createRtmpStreamBottomSheetArr[0] = createRtmpStreamBottomSheet;
                createRtmpStreamBottomSheet.show();
                return;
            }
            if (tL_error != null) {
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                BulletinFactory.of(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).showForError(tL_error, true);
            }
        }

        public static void $r8$lambda$FD6JufHtKnYoIjwFTR4iCJCPgnk(Page page, CreateRtmpStreamBottomSheet[] createRtmpStreamBottomSheetArr, Browser.Progress progress) {
            StoryPrivacyBottomSheet.this.isRtmpStream = true;
            createRtmpStreamBottomSheetArr[0].dismiss();
            page.updateItems(true);
        }

        class ButtonContainer extends LinearLayout {
            final AnimatedFloat alpha;
            private ValueAnimator animator;
            final Paint dividerPaint;
            private ValueAnimator hideAnimator;
            private float translationY;
            private float translationY2;

            public ButtonContainer(Context context) {
                super(context);
                this.dividerPaint = new Paint(1);
                this.alpha = new AnimatedFloat(this);
            }

            public void hide(final boolean z, boolean z2) {
                ValueAnimator valueAnimator = this.hideAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (z2) {
                    setVisibility(0);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.translationY2, z ? getMeasuredHeight() : 0.0f);
                    this.hideAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            StoryPrivacyBottomSheet.Page.ButtonContainer.m4598$r8$lambda$42qGW8kxk47HgobtxRfqybUZjg(this.f$0, valueAnimator2);
                        }
                    });
                    this.hideAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (z) {
                                ButtonContainer.this.setVisibility(8);
                            }
                            ButtonContainer.this.hideAnimator = null;
                        }
                    });
                    this.hideAnimator.setDuration(320L);
                    this.hideAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.hideAnimator.start();
                    return;
                }
                setVisibility(z ? 8 : 0);
                float measuredHeight = z ? getMeasuredHeight() : 0.0f;
                this.translationY2 = measuredHeight;
                super.setTranslationY(measuredHeight + this.translationY);
            }

            public static void m4598$r8$lambda$42qGW8kxk47HgobtxRfqybUZjg(ButtonContainer buttonContainer, ValueAnimator valueAnimator) {
                buttonContainer.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                buttonContainer.translationY2 = fFloatValue;
                super.setTranslationY(fFloatValue + buttonContainer.translationY);
            }

            public void translateY(float f, final float f2) {
                ValueAnimator valueAnimator = this.animator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.animator = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
                this.animator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        StoryPrivacyBottomSheet.Page.ButtonContainer.$r8$lambda$3iOLnZoVxsbctwKD2XWMHU6dJpE(this.f$0, valueAnimator2);
                    }
                });
                this.animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ButtonContainer.this.setTranslationY(f2);
                        ButtonContainer.this.animator = null;
                    }
                });
                this.animator.setDuration(250L);
                this.animator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                this.animator.start();
            }

            public static void $r8$lambda$3iOLnZoVxsbctwKD2XWMHU6dJpE(ButtonContainer buttonContainer, ValueAnimator valueAnimator) {
                buttonContainer.getClass();
                buttonContainer.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }

            @Override
            public void setTranslationY(float f) {
                float f2 = this.translationY2;
                this.translationY = f;
                super.setTranslationY(f2 + f);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.dividerPaint.setColor(Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider));
                this.dividerPaint.setAlpha((int) (this.alpha.set(Page.this.listView.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, this.dividerPaint);
            }
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            TLRPC.ChatFull chatFull;
            AlertDialog alertDialog;
            if (i != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (alertDialog = this.progressDialog) == null || this.waitingForChatId != chatFull.id) {
                return;
            }
            alertDialog.dismissUnless(350L);
            this.progressDialog = null;
            this.waitingForChatId = -1L;
            selectChat(chatFull.id, chatFull.participants);
        }

        private void selectChat(final long j, TLRPC.ChatParticipants chatParticipants) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = this.pageType;
            int i2 = 0;
            boolean z = i == 1 || i == 2;
            if (chatParticipants != null && chatParticipants.participants != null) {
                for (int i3 = 0; i3 < chatParticipants.participants.size(); i3++) {
                    long j2 = chatParticipants.participants.get(i3).user_id;
                    TLRPC.User user = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getUser(Long.valueOf(j2));
                    if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000 && j2 != 0) {
                        if (z && !user.contact) {
                            arrayList2.add(Long.valueOf(j2));
                        } else {
                            arrayList.add(Long.valueOf(j2));
                        }
                        this.selectedUsers.remove(Long.valueOf(j2));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList.isEmpty()) {
                    new AlertDialog.Builder(getContext(), ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider).setMessage("All group members are not in your contact list.").setNegativeButton("Cancel", null).show();
                    return;
                }
                new AlertDialog.Builder(getContext(), ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider).setMessage(arrayList2.size() + " members are not in your contact list").setPositiveButton("Add " + arrayList.size() + " contacts", new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        StoryPrivacyBottomSheet.Page.$r8$lambda$omzG7Ix5DOsnlzQZmLEuG6fwypc(this.f$0, j, arrayList, alertDialog, i4);
                    }
                }).setNegativeButton("Cancel", null).show();
                return;
            }
            this.selectedUsersByGroup.put(Long.valueOf(j), arrayList);
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                this.changelog.put(((Long) obj).longValue(), Boolean.TRUE);
            }
            updateSpans(true);
            updateButton(true);
            updateCheckboxes(true);
            this.searchField.scrollToBottom();
        }

        public static void $r8$lambda$omzG7Ix5DOsnlzQZmLEuG6fwypc(Page page, long j, ArrayList arrayList, AlertDialog alertDialog, int i) {
            page.selectedUsersByGroup.put(Long.valueOf(j), arrayList);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                page.changelog.put(((Long) obj).longValue(), Boolean.TRUE);
            }
            page.updateSpans(true);
            page.updateButton(true);
            page.updateCheckboxes(true);
            alertDialog.dismiss();
            page.searchField.scrollToBottom();
        }

        private void updateSpans(boolean z) {
            Object chat;
            HashSet<Long> hashSetMergeUsers = StoryPrivacyBottomSheet.this.mergeUsers(this.selectedUsers, this.selectedUsersByGroup);
            int i = this.pageType;
            if (i == 3) {
                StoryPrivacyBottomSheet.this.selectedContactsCount = hashSetMergeUsers.size();
            } else if (i == 4) {
                StoryPrivacyBottomSheet.this.excludedEveryoneCount = hashSetMergeUsers.size();
            }
            MessagesController messagesController = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < this.searchField.allSpans.size(); i2++) {
                GroupCreateSpan groupCreateSpan = (GroupCreateSpan) this.searchField.allSpans.get(i2);
                if (!hashSetMergeUsers.contains(Long.valueOf(groupCreateSpan.getUid()))) {
                    arrayList.add(groupCreateSpan);
                }
            }
            for (Long l : hashSetMergeUsers) {
                long jLongValue = l.longValue();
                int i3 = 0;
                while (true) {
                    if (i3 >= this.searchField.allSpans.size()) {
                        if (jLongValue >= 0) {
                            chat = messagesController.getUser(l);
                        } else {
                            chat = messagesController.getChat(l);
                        }
                        Object obj = chat;
                        if (obj != null) {
                            GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(getContext(), obj, null, true, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider);
                            groupCreateSpan2.setOnClickListener(this);
                            arrayList2.add(groupCreateSpan2);
                            break;
                        }
                        break;
                    }
                    if (((GroupCreateSpan) this.searchField.allSpans.get(i3)).getUid() == jLongValue) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            this.searchField.spansContainer.updateSpans(arrayList, arrayList2, z);
        }

        public void onButton1Click(View view) {
            StoryPrivacy storyPrivacy;
            if (this.button.isLoading()) {
                return;
            }
            final MessagesController messagesController = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount);
            int i = this.pageType;
            if (i == 5) {
                if (StoryPrivacyBottomSheet.this.onDone2 != null) {
                    StoryPrivacyBottomSheet.this.onDone2.run(this.selectedUsers);
                }
                StoryPrivacyBottomSheet.this.dismiss();
                return;
            }
            if (i == 1) {
                TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                tL_editCloseFriends.id.addAll(this.selectedUsers);
                this.button.setLoading(true);
                ConnectionsManager.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).sendRequest(tL_editCloseFriends, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StoryPrivacyBottomSheet.Page.m4596$r8$lambda$urhmA3GuUjYcgdq8m8JrGXeTtg(this.f$0, messagesController, tLObject, tL_error);
                    }
                });
                return;
            }
            if (i == 0) {
                if (!StoryPrivacyBottomSheet.this.applyWhenDismiss) {
                    if (StoryPrivacyBottomSheet.this.selectedType != 3) {
                        if (StoryPrivacyBottomSheet.this.selectedType != 2) {
                            if (StoryPrivacyBottomSheet.this.selectedType == 4) {
                                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                                storyPrivacy = new StoryPrivacy(StoryPrivacyBottomSheet.this.selectedType, ((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount, new ArrayList(storyPrivacyBottomSheet.mergeUsers(storyPrivacyBottomSheet.excludedEveryone, StoryPrivacyBottomSheet.this.excludedEveryoneByGroup)));
                                storyPrivacy.selectedUserIds.clear();
                                storyPrivacy.selectedUserIds.addAll(StoryPrivacyBottomSheet.this.excludedEveryone);
                                storyPrivacy.selectedUserIdsByGroup.clear();
                                storyPrivacy.selectedUserIdsByGroup.putAll(StoryPrivacyBottomSheet.this.excludedEveryoneByGroup);
                            } else {
                                storyPrivacy = new StoryPrivacy(StoryPrivacyBottomSheet.this.selectedType, ((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount, (ArrayList) null);
                            }
                        } else {
                            storyPrivacy = new StoryPrivacy(StoryPrivacyBottomSheet.this.selectedType, ((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount, StoryPrivacyBottomSheet.this.excludedContacts);
                        }
                    } else {
                        StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = StoryPrivacyBottomSheet.this;
                        storyPrivacy = new StoryPrivacy(StoryPrivacyBottomSheet.this.selectedType, ((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount, new ArrayList(storyPrivacyBottomSheet2.mergeUsers(storyPrivacyBottomSheet2.selectedContacts, StoryPrivacyBottomSheet.this.selectedContactsByGroup)));
                        storyPrivacy.selectedUserIds.clear();
                        storyPrivacy.selectedUserIds.addAll(StoryPrivacyBottomSheet.this.selectedContacts);
                        storyPrivacy.selectedUserIdsByGroup.clear();
                        storyPrivacy.selectedUserIdsByGroup.putAll(StoryPrivacyBottomSheet.this.selectedContactsByGroup);
                    }
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet3 = StoryPrivacyBottomSheet.this;
                    storyPrivacyBottomSheet3.done(storyPrivacy, new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda13(storyPrivacyBottomSheet3));
                    return;
                }
                StoryPrivacyBottomSheet.this.dismiss();
                return;
            }
            if (i == 2) {
                if (StoryPrivacyBottomSheet.this.isEdit) {
                    StoryPrivacyBottomSheet.this.closeKeyboard();
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet4 = StoryPrivacyBottomSheet.this;
                    storyPrivacyBottomSheet4.done(new StoryPrivacy(2, ((BottomSheet) storyPrivacyBottomSheet4).currentAccount, this.selectedUsers), new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda13(StoryPrivacyBottomSheet.this));
                    return;
                } else {
                    StoryPrivacyBottomSheet.this.closeKeyboard();
                    StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(0);
                    return;
                }
            }
            if (i != 3) {
                if (i == 6) {
                    HashSet hashSetMergeUsers = StoryPrivacyBottomSheet.this.mergeUsers(this.selectedUsers, this.selectedUsersByGroup);
                    this.button.setLoading(true);
                    MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getStoriesController().updateBlockedUsers(hashSetMergeUsers, new Runnable() {
                        @Override
                        public final void run() {
                            StoryPrivacyBottomSheet.Page.$r8$lambda$_U9qn4Fe1a_Hv0Gu6mqAunlTcsI(this.f$0);
                        }
                    });
                    return;
                } else {
                    StoryPrivacyBottomSheet.this.selectedType = i;
                    StoryPrivacyBottomSheet.this.closeKeyboard();
                    StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(0);
                    return;
                }
            }
            if (StoryPrivacyBottomSheet.this.isEdit) {
                HashSet hashSetMergeUsers2 = StoryPrivacyBottomSheet.this.mergeUsers(this.selectedUsers, this.selectedUsersByGroup);
                if (hashSetMergeUsers2.isEmpty()) {
                    return;
                }
                StoryPrivacyBottomSheet.this.closeKeyboard();
                StoryPrivacy storyPrivacy2 = new StoryPrivacy(3, ((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount, new ArrayList(hashSetMergeUsers2));
                storyPrivacy2.selectedUserIds.clear();
                storyPrivacy2.selectedUserIds.addAll(this.selectedUsers);
                storyPrivacy2.selectedUserIdsByGroup.clear();
                storyPrivacy2.selectedUserIdsByGroup.putAll(this.selectedUsersByGroup);
                StoryPrivacyBottomSheet.this.done(storyPrivacy2, new Runnable() {
                    @Override
                    public final void run() {
                        StoryPrivacyBottomSheet.Page.m4587$r8$lambda$N9i_gRmftQZuPf8wwmy2lXE0(this.f$0);
                    }
                });
                return;
            }
            if (StoryPrivacyBottomSheet.this.mergeUsers(this.selectedUsers, this.selectedUsersByGroup).isEmpty()) {
                return;
            }
            StoryPrivacyBottomSheet.this.selectedType = 3;
            StoryPrivacyBottomSheet.this.closeKeyboard();
            StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(0);
        }

        public static void m4596$r8$lambda$urhmA3GuUjYcgdq8m8JrGXeTtg(final Page page, final MessagesController messagesController, final TLObject tLObject, TLRPC.TL_error tL_error) {
            page.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoryPrivacyBottomSheet.Page.$r8$lambda$9RYWt3J_787p9aMH1yYIkz_aWdc(this.f$0, tLObject, messagesController);
                }
            });
        }

        public static void $r8$lambda$9RYWt3J_787p9aMH1yYIkz_aWdc(Page page, TLObject tLObject, MessagesController messagesController) {
            boolean zContains;
            page.button.setLoading(false);
            if (tLObject != null) {
                ArrayList contacts = StoryPrivacyBottomSheet.this.getContacts();
                for (int i = 0; i < contacts.size(); i++) {
                    TLRPC.User user = (TLRPC.User) contacts.get(i);
                    if (user != null && (zContains = page.selectedUsers.contains(Long.valueOf(user.id))) != user.close_friend) {
                        user.close_friend = zContains;
                        user.flags2 = zContains ? user.flags2 | 4 : user.flags2 & (-5);
                        messagesController.putUser(user, false);
                    }
                }
            }
            StoryPrivacyBottomSheet.this.closeKeyboard();
            if (StoryPrivacyBottomSheet.this.isEdit) {
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                storyPrivacyBottomSheet.done(new StoryPrivacy(1, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, (ArrayList) null), new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda13(StoryPrivacyBottomSheet.this));
            } else {
                StoryPrivacyBottomSheet.this.closeKeyboard();
                StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(0);
            }
        }

        public static void m4587$r8$lambda$N9i_gRmftQZuPf8wwmy2lXE0(Page page) {
            Bulletin.removeDelegate(StoryPrivacyBottomSheet.this.container);
            StoryPrivacyBottomSheet.super.dismiss();
        }

        public static void $r8$lambda$_U9qn4Fe1a_Hv0Gu6mqAunlTcsI(Page page) {
            page.button.setLoading(false);
            StoryPrivacyBottomSheet.this.closeKeyboard();
            StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(0);
        }

        public void onButton2Click(View view) {
            int i = 5;
            if (StoryPrivacyBottomSheet.this.startedFromSendAsMessage) {
                StoryPrivacyBottomSheet.this.activePage = 5;
                StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(1);
            } else {
                StoryPrivacyBottomSheet storyPrivacyBottomSheetWhenSelectedShare = new StoryPrivacyBottomSheet(i, getContext(), ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider).whenSelectedShare(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoryPrivacyBottomSheet.Page.m4588$r8$lambda$QglIUoamQur9CexBTxFeSNrfPQ(this.f$0, (ArrayList) obj);
                    }
                });
                storyPrivacyBottomSheetWhenSelectedShare.storyPeriod = StoryPrivacyBottomSheet.this.storyPeriod;
                storyPrivacyBottomSheetWhenSelectedShare.show();
            }
        }

        public static void m4588$r8$lambda$QglIUoamQur9CexBTxFeSNrfPQ(Page page, ArrayList arrayList) {
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
            storyPrivacyBottomSheet.done(new StoryPrivacy(5, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, arrayList), new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda13(StoryPrivacyBottomSheet.this));
        }

        public float top() {
            float paddingTop;
            float y;
            float fMin = (this.layoutManager.getReverseLayout() || this.pageType == 0) ? AndroidUtilities.displaySize.y : 0.0f;
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                if (this.layoutManager.getReverseLayout()) {
                    float paddingTop2 = this.contentView.getPaddingTop() + childAt.getY();
                    float alpha = childAt.getAlpha();
                    if (paddingTop2 < fMin) {
                        fMin = AndroidUtilities.lerp(fMin, paddingTop2, alpha);
                    }
                } else if (this.pageType == 0) {
                    if (!(childAt instanceof PadView)) {
                        fMin = Math.min(this.contentView.getPaddingTop() + childAt.getY(), fMin);
                    }
                } else {
                    if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 33) {
                        paddingTop = this.contentView.getPaddingTop() + childAt.getBottom();
                        y = childAt.getTranslationY();
                    } else if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                        paddingTop = this.contentView.getPaddingTop();
                        y = childAt.getY();
                    }
                    return paddingTop + y;
                }
            }
            return fMin;
        }

        public void bind(int i) {
            this.pageType = i;
            this.changelog.clear();
            this.selectedUsers.clear();
            this.selectedUsersByGroup.clear();
            if (i == 4) {
                this.selectedUsers.addAll(StoryPrivacyBottomSheet.this.excludedEveryone);
                this.selectedUsersByGroup.putAll(StoryPrivacyBottomSheet.this.excludedEveryoneByGroup);
            } else if (i == 5) {
                this.selectedUsers.addAll(StoryPrivacyBottomSheet.this.messageUsers);
            } else if (i == 1) {
                ArrayList closeFriends = StoryPrivacyBottomSheet.this.getCloseFriends();
                for (int i2 = 0; i2 < closeFriends.size(); i2++) {
                    this.selectedUsers.add(Long.valueOf(((TLRPC.User) closeFriends.get(i2)).id));
                }
            } else if (i == 2) {
                this.selectedUsers.addAll(StoryPrivacyBottomSheet.this.excludedContacts);
            } else if (i == 3) {
                this.selectedUsers.addAll(StoryPrivacyBottomSheet.this.selectedContacts);
                this.selectedUsersByGroup.putAll(StoryPrivacyBottomSheet.this.selectedContactsByGroup);
            } else if (i == 6) {
                applyBlocklist(false);
            }
            LinearLayoutManager linearLayoutManager = this.layoutManager;
            this.adapter.reversedLayout = false;
            linearLayoutManager.setReverseLayout(false);
            updateSpans(false);
            this.searchField.setText("");
            this.searchField.setVisibility(i == 0 ? 8 : 0);
            this.searchField.scrollToBottom();
            this.query = null;
            updateItems(false);
            updateButton(false);
            updateCheckboxes(false);
            scrollToTop();
            this.listView.requestLayout();
            this.lastSelectedType = -1;
        }

        public void applyBlocklist(boolean z) {
            if (this.pageType != 6) {
                return;
            }
            this.selectedUsers.clear();
            this.selectedUsers.addAll(MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getStoriesController().blocklist);
            for (int i = 0; i < this.changelog.size(); i++) {
                long jKeyAt = this.changelog.keyAt(i);
                if (((Boolean) this.changelog.valueAt(i)).booleanValue()) {
                    if (!this.selectedUsers.contains(Long.valueOf(jKeyAt))) {
                        this.selectedUsers.add(Long.valueOf(jKeyAt));
                    }
                } else {
                    this.selectedUsers.remove(Long.valueOf(jKeyAt));
                }
            }
            if (z) {
                updateItems(true);
                updateButton(true);
                updateCheckboxes(true);
            }
        }

        public void updateItems(boolean z) {
            updateItems(z, true);
        }

        public void updateItems(boolean z, boolean z2) {
            float f;
            float f2;
            float fDp;
            float fDp2;
            boolean zIsEmpty;
            int i;
            StoryPrivacyBottomSheet storyPrivacyBottomSheet;
            boolean z3;
            boolean z4;
            ArrayList users;
            int i2;
            int i3;
            int i4;
            RecyclerListView recyclerListView;
            int iDp;
            float f3;
            TLObject tLObject;
            int i5;
            boolean z5;
            boolean zContains;
            boolean z6;
            int i6;
            boolean z7;
            int i7;
            TLObject tLObject2;
            int i8;
            boolean z8;
            int iDp2;
            boolean zContains2;
            boolean z9;
            int i9;
            boolean z10;
            int i10;
            TLObject tLObject3;
            boolean zContainsKey;
            int i11;
            float f4;
            boolean z11;
            boolean zIsChannelAndNotMegaGroup;
            int i12;
            int i13;
            String string;
            String string2;
            float f5;
            String str;
            int i14;
            String pluralString;
            int i15;
            long dialogId;
            StringBuilder sb;
            Iterator it;
            StoriesController.StoryAlbum storyAlbumFindById;
            String str2;
            String pluralString2;
            int i16;
            int i17;
            this.oldItems.clear();
            this.oldItems.addAll(this.items);
            this.items.clear();
            int i18 = this.pageType;
            if (i18 == 0) {
                this.containsHeader = false;
                this.sectionCell.setVisibility(8);
                ArrayList arrayList = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getStoriesController().sendAs;
                ItemInner itemInnerAsPad = ItemInner.asPad(24);
                this.items.add(itemInnerAsPad);
                f = 150.0f;
                if (!StoryPrivacyBottomSheet.this.liveSettings) {
                    if (StoryPrivacyBottomSheet.this.canChangePeer && (StoryPrivacyBottomSheet.this.isEdit || arrayList == null || arrayList.size() <= 1)) {
                        ArrayList arrayList2 = this.items;
                        if (!StoryPrivacyBottomSheet.this.isEdit) {
                            string = LocaleController.getString(StoryPrivacyBottomSheet.this.isLive ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
                        } else {
                            string = LocaleController.getString(R.string.StoryPrivacyAlertEditTitle);
                        }
                        f2 = 56.0f;
                        if (!StoryPrivacyBottomSheet.this.isLive) {
                            if (StoryPrivacyBottomSheet.this.storyPeriod != Integer.MAX_VALUE) {
                                i11 = 8;
                                f4 = 12.0f;
                                string2 = LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", StoryPrivacyBottomSheet.this.storyPeriod / 3600, new Object[0]);
                            } else {
                                i11 = 8;
                                f4 = 12.0f;
                                string2 = LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
                            }
                        } else {
                            string2 = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
                            i11 = 8;
                            f4 = 12.0f;
                        }
                        arrayList2.add(ItemInner.asHeader2(string, string2));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(72.0f);
                    } else {
                        f2 = 56.0f;
                        i11 = 8;
                        f4 = 12.0f;
                        this.items.add(ItemInner.asHeaderCell(LocaleController.getString(StoryPrivacyBottomSheet.this.isLive ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs)));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                        StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = StoryPrivacyBottomSheet.this;
                        TLRPC.InputPeer inputPeer = storyPrivacyBottomSheet2.selectedPeer;
                        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                            this.items.add(ItemInner.asUser(UserConfig.getInstance(((BottomSheet) storyPrivacyBottomSheet2).currentAccount).getCurrentUser(), false, false).asSendAs());
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(62.0f);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            this.items.add(ItemInner.asUser(MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet2).currentAccount).getUser(Long.valueOf(StoryPrivacyBottomSheet.this.selectedPeer.user_id)), false, false).asSendAs());
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(62.0f);
                        } else {
                            if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                TLRPC.Chat chat = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet2).currentAccount).getChat(Long.valueOf(StoryPrivacyBottomSheet.this.selectedPeer.channel_id));
                                this.items.add(ItemInner.asChat(chat, false).asSendAs());
                                zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                                itemInnerAsPad.subtractHeight += AndroidUtilities.dp(104.0f);
                            } else {
                                if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                    this.items.add(ItemInner.asChat(MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet2).currentAccount).getChat(Long.valueOf(StoryPrivacyBottomSheet.this.selectedPeer.chat_id)), false).asSendAs());
                                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(104.0f);
                                    zIsChannelAndNotMegaGroup = false;
                                }
                                ItemInner itemInnerAsShadow = ItemInner.asShadow(null);
                                if (z11) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                itemInnerAsShadow.resId = i12;
                                this.items.add(itemInnerAsShadow);
                                itemInnerAsPad.subtractHeight += AndroidUtilities.dp(12.0f);
                                if (z11) {
                                    ArrayList arrayList3 = this.items;
                                    if (StoryPrivacyBottomSheet.this.isLive) {
                                        i13 = R.string.StoryLivePrivacyWhoCanView;
                                    } else {
                                        i13 = R.string.StoryPrivacyWhoCanView;
                                    }
                                    arrayList3.add(ItemInner.asHeaderCell(LocaleController.getString(i13)));
                                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(40.0f);
                                }
                            }
                            z11 = false;
                            ItemInner itemInnerAsShadow2 = ItemInner.asShadow(null);
                            if (z11) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            itemInnerAsShadow2.resId = i12;
                            this.items.add(itemInnerAsShadow2);
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(12.0f);
                            if (z11) {
                                ArrayList arrayList4 = this.items;
                                if (StoryPrivacyBottomSheet.this.isLive) {
                                    i13 = R.string.StoryLivePrivacyWhoCanView;
                                } else {
                                    i13 = R.string.StoryPrivacyWhoCanView;
                                }
                                arrayList4.add(ItemInner.asHeaderCell(LocaleController.getString(i13)));
                                itemInnerAsPad.subtractHeight += AndroidUtilities.dp(40.0f);
                            }
                        }
                        zIsChannelAndNotMegaGroup = false;
                        z11 = true;
                        ItemInner itemInnerAsShadow3 = ItemInner.asShadow(null);
                        if (z11) {
                            i12 = 1;
                        } else {
                            i12 = 2;
                        }
                        itemInnerAsShadow3.resId = i12;
                        this.items.add(itemInnerAsShadow3);
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(12.0f);
                        if (z11) {
                            ArrayList arrayList5 = this.items;
                            if (StoryPrivacyBottomSheet.this.isLive) {
                                i13 = R.string.StoryLivePrivacyWhoCanView;
                            } else {
                                i13 = R.string.StoryPrivacyWhoCanView;
                            }
                            arrayList5.add(ItemInner.asHeaderCell(LocaleController.getString(i13)));
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(40.0f);
                        }
                    }
                    if (z11 || StoryPrivacyBottomSheet.this.liveSettings) {
                        f5 = 80.0f;
                    } else {
                        ArrayList arrayList6 = this.items;
                        f5 = 80.0f;
                        ItemInner itemInnerAsType = ItemInner.asType(4, StoryPrivacyBottomSheet.this.selectedType == 4, StoryPrivacyBottomSheet.this.excludedEveryoneCount);
                        arrayList6.add(itemInnerAsType);
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f2);
                        if (StoryPrivacyBottomSheet.this.excludedEveryoneCount == 1) {
                            if (StoryPrivacyBottomSheet.this.excludedEveryone.size() == 1) {
                                itemInnerAsType.user = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getUser((Long) StoryPrivacyBottomSheet.this.excludedEveryone.get(0));
                            } else {
                                for (ArrayList arrayList7 : StoryPrivacyBottomSheet.this.excludedEveryoneByGroup.values()) {
                                    if (arrayList7.size() >= 1) {
                                        itemInnerAsType.user = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getUser((Long) arrayList7.get(0));
                                        break;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList8 = this.items;
                        ItemInner itemInnerAsType2 = ItemInner.asType(2, StoryPrivacyBottomSheet.this.selectedType == 2, StoryPrivacyBottomSheet.this.excludedContacts.size());
                        arrayList8.add(itemInnerAsType2);
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f2);
                        if (StoryPrivacyBottomSheet.this.excludedContacts.size() == 1) {
                            itemInnerAsType2.user = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getUser((Long) StoryPrivacyBottomSheet.this.excludedContacts.get(0));
                        }
                        ArrayList closeFriends = StoryPrivacyBottomSheet.this.getCloseFriends();
                        ArrayList arrayList9 = this.items;
                        ItemInner itemInnerAsType3 = ItemInner.asType(1, StoryPrivacyBottomSheet.this.selectedType == 1, closeFriends.size());
                        arrayList9.add(itemInnerAsType3);
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f2);
                        if (closeFriends.size() == 1 && (closeFriends.get(0) instanceof TLRPC.User)) {
                            itemInnerAsType3.user = (TLRPC.User) closeFriends.get(0);
                        }
                        ArrayList arrayList10 = this.items;
                        ItemInner itemInnerAsType4 = ItemInner.asType(3, StoryPrivacyBottomSheet.this.selectedType == 3, StoryPrivacyBottomSheet.this.selectedContactsCount);
                        arrayList10.add(itemInnerAsType4);
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f2);
                        if (StoryPrivacyBottomSheet.this.selectedContactsCount == 1) {
                            if (StoryPrivacyBottomSheet.this.selectedContacts.size() == 1) {
                                itemInnerAsType4.user = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getUser((Long) StoryPrivacyBottomSheet.this.selectedContacts.get(0));
                            } else {
                                for (ArrayList arrayList11 : StoryPrivacyBottomSheet.this.selectedContactsByGroup.values()) {
                                    if (arrayList11.size() >= 1) {
                                        itemInnerAsType4.user = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getUser((Long) arrayList11.get(0));
                                        break;
                                    }
                                }
                            }
                        }
                        int blocklistCount = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getStoriesController().getBlocklistCount();
                        this.items.add(ItemInner.asShadow(AndroidUtilities.replaceSingleTag(blocklistCount <= 0 ? LocaleController.getString(StoryPrivacyBottomSheet.this.isLive ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(StoryPrivacyBottomSheet.this.isLive ? "StoryLiveBlockList" : "StoryBlockList", blocklistCount, new Object[0]), Theme.key_chat_messageLinkIn, 0, new Runnable() {
                            @Override
                            public final void run() {
                                StoryPrivacyBottomSheet.Page.$r8$lambda$EeaqFdRuzsg9R4hSYW_82it_AyM(this.f$0);
                            }
                        }, ((BottomSheet) StoryPrivacyBottomSheet.this).resourcesProvider)));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(80.0f);
                    }
                    if (!StoryPrivacyBottomSheet.this.isEdit) {
                        if (StoryPrivacyBottomSheet.this.isLive && !StoryPrivacyBottomSheet.this.liveSettings) {
                            if (StoryPrivacyBottomSheet.this.isRtmpStream) {
                                this.items.add(ItemInner.asButton(5, LocaleController.getString(R.string.LiveStoryRTMPSettings), ""));
                                itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                                this.items.add(ItemInner.asButton(6, LocaleController.getString(R.string.LiveStoryRTMPDisable), ""));
                                itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                                this.items.add(ItemInner.asShadow(null));
                                itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f4);
                            } else {
                                this.items.add(ItemInner.asButton(5, LocaleController.getString(R.string.LiveStoryRTMPEnable), ""));
                                itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                                this.items.add(ItemInner.asShadow(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                                itemInnerAsPad.subtractHeight += AndroidUtilities.dp(30.0f);
                            }
                        }
                        if (StoryPrivacyBottomSheet.this.isLive) {
                            this.items.add(ItemInner.asCheck(LocaleController.getString(R.string.StoryLiveAllowComments), 2, StoryPrivacyBottomSheet.this.allowComments));
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                        }
                        if (!StoryPrivacyBottomSheet.this.liveSettings) {
                            this.items.add(ItemInner.asCheck(LocaleController.getString(R.string.StoryAllowScreenshots), 0, StoryPrivacyBottomSheet.this.allowScreenshots));
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                        }
                        if (!StoryPrivacyBottomSheet.this.isLive && !StoryPrivacyBottomSheet.this.liveSettings) {
                            ArrayList arrayList12 = this.items;
                            if (z11) {
                                i17 = R.string.StoryKeep;
                            } else if (zIsChannelAndNotMegaGroup) {
                                i17 = R.string.StoryKeepChannel;
                            } else {
                                i17 = R.string.StoryKeepGroup;
                            }
                            arrayList12.add(ItemInner.asCheck(LocaleController.getString(i17), 1, StoryPrivacyBottomSheet.this.keepOnMyPage));
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                        }
                    }
                    if (StoryPrivacyBottomSheet.this.isLive && !StoryPrivacyBottomSheet.this.liveSettings) {
                        if (!StoryPrivacyBottomSheet.this.isEdit && StoryPrivacyBottomSheet.this.allowCover && StoryPrivacyBottomSheet.this.whenCoverClicked != null) {
                            if (StoryPrivacyBottomSheet.this.isLive) {
                                if (z11) {
                                    i16 = R.string.StoryLiveKeepInfo;
                                } else {
                                    i16 = zIsChannelAndNotMegaGroup ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo;
                                }
                                pluralString2 = LocaleController.getString(i16);
                            } else {
                                if (z11) {
                                    str2 = "StoryKeepInfo";
                                } else {
                                    str2 = zIsChannelAndNotMegaGroup ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                                }
                                pluralString2 = LocaleController.formatPluralString(str2, (StoryPrivacyBottomSheet.this.storyPeriod == Integer.MAX_VALUE ? 86400 : StoryPrivacyBottomSheet.this.storyPeriod) / 3600, new Object[0]);
                            }
                            this.items.add(ItemInner.asShadow(pluralString2));
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f5);
                        }
                    } else {
                        this.items.add(ItemInner.asShadow(null));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f4);
                    }
                    if (StoryPrivacyBottomSheet.this.keepOnMyPage && !StoryPrivacyBottomSheet.this.isLive && !StoryPrivacyBottomSheet.this.liveSettings) {
                        dialogId = getDialogId();
                        StoryPrivacyBottomSheet.this.getStoriesController().getStoryAlbumsList(dialogId);
                        sb = new StringBuilder();
                        if (StoryPrivacyBottomSheet.this.selectedAlbums.isEmpty()) {
                            if (StoryPrivacyBottomSheet.this.selectedAlbums.size() < 3) {
                                it = StoryPrivacyBottomSheet.this.selectedAlbums.iterator();
                                while (it.hasNext()) {
                                    storyAlbumFindById = StoryPrivacyBottomSheet.this.getStoriesController().getStoryAlbumsList(dialogId).findById(((Integer) it.next()).intValue());
                                    if (storyAlbumFindById != null) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(storyAlbumFindById.title);
                                    }
                                }
                            } else {
                                sb.append(LocaleController.formatPluralString("StoriesAlbumCount", StoryPrivacyBottomSheet.this.selectedAlbums.size(), new Object[0]));
                            }
                        } else {
                            sb.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                        }
                        this.items.add(ItemInner.asButton(1, LocaleController.getString(R.string.StoriesAlbum), sb));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                    }
                    if (!StoryPrivacyBottomSheet.this.isEdit && ((!StoryPrivacyBottomSheet.this.allowCover || StoryPrivacyBottomSheet.this.whenCoverClicked == null) && !StoryPrivacyBottomSheet.this.isLive && !StoryPrivacyBottomSheet.this.liveSettings)) {
                        if (StoryPrivacyBottomSheet.this.isLive) {
                            if (z11) {
                                i15 = R.string.StoryLiveKeepInfo;
                            } else if (zIsChannelAndNotMegaGroup) {
                                i15 = R.string.StoryLiveKeepChannelInfo;
                            } else {
                                i15 = R.string.StoryLiveKeepGroupInfo;
                            }
                            pluralString = LocaleController.getString(i15);
                        } else {
                            if (z11) {
                                str = "StoryKeepInfo";
                            } else if (zIsChannelAndNotMegaGroup) {
                                str = "StoryKeepChannelInfo";
                            } else {
                                str = "StoryKeepGroupInfo";
                            }
                            if (StoryPrivacyBottomSheet.this.storyPeriod == Integer.MAX_VALUE) {
                                i14 = 86400;
                            } else {
                                i14 = StoryPrivacyBottomSheet.this.storyPeriod;
                            }
                            pluralString = LocaleController.formatPluralString(str, i14 / 3600, new Object[0]);
                        }
                        this.items.add(ItemInner.asShadow(pluralString));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f5);
                    }
                    if (StoryPrivacyBottomSheet.this.keepOnMyPage && StoryPrivacyBottomSheet.this.allowCover && StoryPrivacyBottomSheet.this.whenCoverClicked != null) {
                        this.items.add(ItemInner.asButton(0, LocaleController.getString(R.string.StoryEditCover), StoryPrivacyBottomSheet.this.coverDrawable));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                        this.items.add(ItemInner.asShadow(LocaleController.getString(R.string.StoryEditCoverInfo)));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(72.0f);
                    }
                    if (StoryPrivacyBottomSheet.this.liveSettings) {
                        this.items.add(ItemInner.asButton(5, LocaleController.getString(R.string.LiveStoryRTMPSettings), ""));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                        this.items.add(ItemInner.asShadow(null));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(52.0f);
                    }
                    if (StoryPrivacyBottomSheet.this.isLive && StoryPrivacyBottomSheet.this.allowComments) {
                        this.items.add(ItemInner.asHeaderCell(LocaleController.getString(R.string.LiveStoryPricePerComment)));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(40.0f);
                        this.items.add(ItemInner.asSlider(i11));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(75.0f);
                        this.items.add(ItemInner.asShadow(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                    }
                } else {
                    this.items.add(ItemInner.asHeader3(LocaleController.getString(R.string.LiveStorySettingsHeader)));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(72.0f);
                    f2 = 56.0f;
                    i11 = 8;
                    f4 = 12.0f;
                }
                zIsChannelAndNotMegaGroup = false;
                z11 = true;
                if (z11) {
                    f5 = 80.0f;
                } else {
                    f5 = 80.0f;
                }
                if (!StoryPrivacyBottomSheet.this.isEdit) {
                    if (StoryPrivacyBottomSheet.this.isLive) {
                        if (StoryPrivacyBottomSheet.this.isRtmpStream) {
                            this.items.add(ItemInner.asButton(5, LocaleController.getString(R.string.LiveStoryRTMPSettings), ""));
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                            this.items.add(ItemInner.asButton(6, LocaleController.getString(R.string.LiveStoryRTMPDisable), ""));
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                            this.items.add(ItemInner.asShadow(null));
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f4);
                        } else {
                            this.items.add(ItemInner.asButton(5, LocaleController.getString(R.string.LiveStoryRTMPEnable), ""));
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                            this.items.add(ItemInner.asShadow(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            itemInnerAsPad.subtractHeight += AndroidUtilities.dp(30.0f);
                        }
                    }
                    if (StoryPrivacyBottomSheet.this.isLive) {
                        this.items.add(ItemInner.asCheck(LocaleController.getString(R.string.StoryLiveAllowComments), 2, StoryPrivacyBottomSheet.this.allowComments));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                    }
                    if (!StoryPrivacyBottomSheet.this.liveSettings) {
                        this.items.add(ItemInner.asCheck(LocaleController.getString(R.string.StoryAllowScreenshots), 0, StoryPrivacyBottomSheet.this.allowScreenshots));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                    }
                    if (!StoryPrivacyBottomSheet.this.isLive) {
                        ArrayList arrayList13 = this.items;
                        if (z11) {
                            i17 = R.string.StoryKeep;
                        } else if (zIsChannelAndNotMegaGroup) {
                            i17 = R.string.StoryKeepChannel;
                        } else {
                            i17 = R.string.StoryKeepGroup;
                        }
                        arrayList13.add(ItemInner.asCheck(LocaleController.getString(i17), 1, StoryPrivacyBottomSheet.this.keepOnMyPage));
                        itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                    }
                }
                if (StoryPrivacyBottomSheet.this.isLive) {
                    this.items.add(ItemInner.asShadow(null));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f4);
                } else {
                    this.items.add(ItemInner.asShadow(null));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f4);
                }
                if (StoryPrivacyBottomSheet.this.keepOnMyPage) {
                    dialogId = getDialogId();
                    StoryPrivacyBottomSheet.this.getStoriesController().getStoryAlbumsList(dialogId);
                    sb = new StringBuilder();
                    if (StoryPrivacyBottomSheet.this.selectedAlbums.isEmpty()) {
                        if (StoryPrivacyBottomSheet.this.selectedAlbums.size() < 3) {
                            it = StoryPrivacyBottomSheet.this.selectedAlbums.iterator();
                            while (it.hasNext()) {
                                storyAlbumFindById = StoryPrivacyBottomSheet.this.getStoriesController().getStoryAlbumsList(dialogId).findById(((Integer) it.next()).intValue());
                                if (storyAlbumFindById != null) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(storyAlbumFindById.title);
                                }
                            }
                        } else {
                            sb.append(LocaleController.formatPluralString("StoriesAlbumCount", StoryPrivacyBottomSheet.this.selectedAlbums.size(), new Object[0]));
                        }
                    } else {
                        sb.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                    }
                    this.items.add(ItemInner.asButton(1, LocaleController.getString(R.string.StoriesAlbum), sb));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                }
                if (!StoryPrivacyBottomSheet.this.isEdit) {
                    if (StoryPrivacyBottomSheet.this.isLive) {
                        if (z11) {
                            i15 = R.string.StoryLiveKeepInfo;
                        } else if (zIsChannelAndNotMegaGroup) {
                            i15 = R.string.StoryLiveKeepChannelInfo;
                        } else {
                            i15 = R.string.StoryLiveKeepGroupInfo;
                        }
                        pluralString = LocaleController.getString(i15);
                    } else {
                        if (z11) {
                            str = "StoryKeepInfo";
                        } else if (zIsChannelAndNotMegaGroup) {
                            str = "StoryKeepChannelInfo";
                        } else {
                            str = "StoryKeepGroupInfo";
                        }
                        if (StoryPrivacyBottomSheet.this.storyPeriod == Integer.MAX_VALUE) {
                            i14 = 86400;
                        } else {
                            i14 = StoryPrivacyBottomSheet.this.storyPeriod;
                        }
                        pluralString = LocaleController.formatPluralString(str, i14 / 3600, new Object[0]);
                    }
                    this.items.add(ItemInner.asShadow(pluralString));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(f5);
                }
                if (StoryPrivacyBottomSheet.this.keepOnMyPage) {
                    this.items.add(ItemInner.asButton(0, LocaleController.getString(R.string.StoryEditCover), StoryPrivacyBottomSheet.this.coverDrawable));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                    this.items.add(ItemInner.asShadow(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(72.0f);
                }
                if (StoryPrivacyBottomSheet.this.liveSettings) {
                    this.items.add(ItemInner.asButton(5, LocaleController.getString(R.string.LiveStoryRTMPSettings), ""));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                    this.items.add(ItemInner.asShadow(null));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(52.0f);
                }
                if (StoryPrivacyBottomSheet.this.isLive) {
                    this.items.add(ItemInner.asHeaderCell(LocaleController.getString(R.string.LiveStoryPricePerComment)));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(40.0f);
                    this.items.add(ItemInner.asSlider(i11));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(75.0f);
                    this.items.add(ItemInner.asShadow(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    itemInnerAsPad.subtractHeight += AndroidUtilities.dp(50.0f);
                }
            } else {
                f = 150.0f;
                f2 = 56.0f;
                if (i18 == 1) {
                    this.headerView.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                    this.headerView.setCloseImageVisible(true);
                    this.headerView.backDrawable.setRotation(0.0f, false);
                    this.items.add(ItemInner.asPad());
                    this.items.add(ItemInner.asHeader());
                    float fDp3 = AndroidUtilities.dp(56.0f) + 0.0f;
                    this.searchPosition = this.items.size();
                    this.items.add(ItemInner.asSearchField());
                    float fDp4 = fDp3 + AndroidUtilities.dp(150.0f);
                    this.items.add(ItemInner.asSection());
                    fDp2 = fDp4 + AndroidUtilities.dp(32.0f);
                    this.sectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                    updateSectionCell(z);
                    this.containsHeader = true;
                } else if (i18 == 2) {
                    this.headerView.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                    this.headerView.setCloseImageVisible(true);
                    this.headerView.backDrawable.setRotation(0.0f, false);
                    this.items.add(ItemInner.asPad());
                    this.items.add(ItemInner.asHeader());
                    float fDp5 = AndroidUtilities.dp(56.0f) + 0.0f;
                    this.searchPosition = this.items.size();
                    this.items.add(ItemInner.asSearchField());
                    float fDp6 = fDp5 + AndroidUtilities.dp(150.0f);
                    this.items.add(ItemInner.asSection());
                    fDp2 = fDp6 + AndroidUtilities.dp(32.0f);
                    this.sectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                    updateSectionCell(z);
                    this.containsHeader = true;
                } else if (i18 == 3) {
                    this.headerView.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                    this.headerView.setCloseImageVisible(true);
                    this.headerView.backDrawable.setRotation(0.0f, false);
                    this.items.add(ItemInner.asPad());
                    this.items.add(ItemInner.asHeader());
                    float fDp7 = AndroidUtilities.dp(56.0f) + 0.0f;
                    this.searchPosition = this.items.size();
                    this.items.add(ItemInner.asSearchField());
                    float fDp8 = fDp7 + AndroidUtilities.dp(150.0f);
                    this.items.add(ItemInner.asSection());
                    fDp2 = fDp8 + AndroidUtilities.dp(32.0f);
                    this.sectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                    updateSectionCell(z);
                    this.containsHeader = true;
                } else if (i18 == 5) {
                    this.headerView.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                    this.headerView.setCloseImageVisible(StoryPrivacyBottomSheet.this.startedFromSendAsMessage);
                    this.headerView.backDrawable.setRotation(0.0f, false);
                    this.items.add(ItemInner.asPad());
                    this.items.add(ItemInner.asHeader());
                    float fDp9 = AndroidUtilities.dp(56.0f) + 0.0f;
                    this.searchPosition = this.items.size();
                    this.items.add(ItemInner.asSearchField());
                    float fDp10 = fDp9 + AndroidUtilities.dp(150.0f);
                    this.items.add(ItemInner.asSection());
                    fDp2 = fDp10 + AndroidUtilities.dp(32.0f);
                    this.sectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                    updateSectionCell(z);
                    this.containsHeader = true;
                } else {
                    if (i18 == 6) {
                        this.headerView.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                        this.headerView.setCloseImageVisible(true);
                        this.headerView.backDrawable.setRotation(0.0f, false);
                        this.items.add(ItemInner.asPad());
                        this.items.add(ItemInner.asHeader());
                        float fDp11 = AndroidUtilities.dp(56.0f) + 0.0f;
                        this.searchPosition = this.items.size();
                        this.items.add(ItemInner.asSearchField());
                        float fDp12 = fDp11 + AndroidUtilities.dp(150.0f);
                        this.items.add(ItemInner.asSection());
                        fDp2 = fDp12 + AndroidUtilities.dp(32.0f);
                        this.sectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                        updateSectionCell(z);
                        this.containsHeader = true;
                    } else if (i18 == 4) {
                        this.headerView.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                        this.headerView.setCloseImageVisible(true);
                        this.headerView.backDrawable.setRotation(0.0f, false);
                        this.items.add(ItemInner.asPad());
                        this.items.add(ItemInner.asHeader());
                        float fDp13 = AndroidUtilities.dp(56.0f) + 0.0f;
                        this.searchPosition = this.items.size();
                        this.items.add(ItemInner.asSearchField());
                        float fDp14 = fDp13 + AndroidUtilities.dp(150.0f);
                        this.items.add(ItemInner.asSection());
                        fDp = fDp14 + AndroidUtilities.dp(32.0f);
                        this.sectionCell.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                        updateSectionCell(z);
                        this.containsHeader = true;
                    }
                    zIsEmpty = TextUtils.isEmpty(this.query);
                    if (this.pageType != 0) {
                        String lowerCase = AndroidUtilities.translitSafe(this.query).toLowerCase();
                        i = this.pageType;
                        if (i == 5) {
                            users = StoryPrivacyBottomSheet.this.getChats();
                        } else {
                            storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                            if (i != 1 || i == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (storyPrivacyBottomSheet.allowSmallChats || !((i2 = this.pageType) == 3 || i2 == 6)) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            users = storyPrivacyBottomSheet.getUsers(z3, z4);
                        }
                        HashSet hashSetMergeUsers = StoryPrivacyBottomSheet.this.mergeUsers(this.selectedUsers, this.selectedUsersByGroup);
                        if (zIsEmpty) {
                            if (!z) {
                                this.atTop.clear();
                                for (i10 = 0; i10 < users.size(); i10++) {
                                    tLObject3 = (TLObject) users.get(i10);
                                    if (tLObject3 instanceof TLRPC.User) {
                                        zContainsKey = this.selectedUsers.contains(Long.valueOf(((TLRPC.User) tLObject3).id));
                                    } else if (tLObject3 instanceof TLRPC.Chat) {
                                        zContainsKey = this.selectedUsersByGroup.containsKey(Long.valueOf(((TLRPC.Chat) tLObject3).id));
                                    } else {
                                        zContainsKey = false;
                                    }
                                    if (zContainsKey) {
                                        this.atTop.add(tLObject3);
                                    }
                                }
                            }
                            i3 = 0;
                            for (i7 = 0; i7 < this.atTop.size(); i7++) {
                                tLObject2 = (TLObject) this.atTop.get(i7);
                                if (tLObject2 instanceof TLRPC.User) {
                                    TLRPC.User user = (TLRPC.User) tLObject2;
                                    zContains2 = this.selectedUsers.contains(Long.valueOf(user.id));
                                    if (zContains2 && hashSetMergeUsers.contains(Long.valueOf(user.id))) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    ArrayList arrayList14 = this.items;
                                    ItemInner itemInnerAsUser = ItemInner.asUser(user, zContains2, z9);
                                    i9 = this.pageType;
                                    if (i9 != 2 || i9 == 4) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    arrayList14.add(itemInnerAsUser.red(z10));
                                    iDp2 = AndroidUtilities.dp(f2);
                                } else {
                                    if (tLObject2 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                                        ArrayList arrayList15 = this.items;
                                        ItemInner itemInnerAsChat = ItemInner.asChat(chat2, this.selectedUsersByGroup.containsKey(Long.valueOf(chat2.id)));
                                        i8 = this.pageType;
                                        if (i8 != 2 || i8 == 4) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        arrayList15.add(itemInnerAsChat.red(z8));
                                        iDp2 = AndroidUtilities.dp(f2);
                                    }
                                }
                                fDp += iDp2;
                                i3++;
                            }
                        } else {
                            i3 = 0;
                        }
                        for (i4 = 0; i4 < users.size(); i4++) {
                            tLObject = (TLObject) users.get(i4);
                            if ((zIsEmpty || !this.atTop.contains(tLObject)) && match(tLObject, lowerCase)) {
                                if (tLObject instanceof TLRPC.User) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject;
                                    zContains = this.selectedUsers.contains(Long.valueOf(user2.id));
                                    if (zContains && hashSetMergeUsers.contains(Long.valueOf(user2.id))) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    ArrayList arrayList16 = this.items;
                                    ItemInner itemInnerAsUser2 = ItemInner.asUser(user2, zContains, z6);
                                    i6 = this.pageType;
                                    if (i6 != 2 || i6 == 4) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    arrayList16.add(itemInnerAsUser2.red(z7));
                                    fDp += AndroidUtilities.dp(f2);
                                    i3++;
                                } else if (tLObject instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat3 = (TLRPC.Chat) tLObject;
                                    ArrayList arrayList17 = this.items;
                                    ItemInner itemInnerAsChat2 = ItemInner.asChat(chat3, this.selectedUsersByGroup.containsKey(Long.valueOf(chat3.id)));
                                    i5 = this.pageType;
                                    if (i5 != 2 || i5 == 4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    arrayList17.add(itemInnerAsChat2.red(z5));
                                    fDp += AndroidUtilities.dp(f2);
                                    i3++;
                                }
                            }
                        }
                        if (!zIsEmpty) {
                            if (i3 == 0) {
                                this.items.add(ItemInner.asNoUsers());
                                fDp += AndroidUtilities.dp(f);
                            }
                            recyclerListView = this.listView;
                            if (recyclerListView != null) {
                                iDp = ((recyclerListView.getMeasuredHeight() - this.listView.getPaddingTop()) - this.listView.getPaddingBottom()) + (((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible ? this.keyboardHeight : 0);
                            } else {
                                iDp = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(f2)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                            }
                            f3 = iDp - fDp;
                            if (f3 > 0.0f) {
                                this.items.add(ItemInner.asPadding((int) f3));
                            }
                        }
                    }
                    if (this.layoutManager.getReverseLayout()) {
                        Collections.reverse(this.items);
                    }
                    if (z2 && this.adapter != null) {
                        if (!z && StoryPrivacyBottomSheet.this.selectedType != 0) {
                            this.adapter.setItems(this.oldItems, this.items);
                        } else {
                            this.adapter.notifyDataSetChanged();
                        }
                    }
                    this.contentView.invalidate();
                }
                fDp = fDp2;
                zIsEmpty = TextUtils.isEmpty(this.query);
                if (this.pageType != 0) {
                    String lowerCase2 = AndroidUtilities.translitSafe(this.query).toLowerCase();
                    i = this.pageType;
                    if (i == 5) {
                        users = StoryPrivacyBottomSheet.this.getChats();
                    } else {
                        storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                        if (i != 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (storyPrivacyBottomSheet.allowSmallChats) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        users = storyPrivacyBottomSheet.getUsers(z3, z4);
                    }
                    HashSet hashSetMergeUsers2 = StoryPrivacyBottomSheet.this.mergeUsers(this.selectedUsers, this.selectedUsersByGroup);
                    if (zIsEmpty) {
                        if (!z) {
                            this.atTop.clear();
                            while (i10 < users.size()) {
                                tLObject3 = (TLObject) users.get(i10);
                                if (tLObject3 instanceof TLRPC.User) {
                                    zContainsKey = this.selectedUsers.contains(Long.valueOf(((TLRPC.User) tLObject3).id));
                                } else if (tLObject3 instanceof TLRPC.Chat) {
                                    zContainsKey = this.selectedUsersByGroup.containsKey(Long.valueOf(((TLRPC.Chat) tLObject3).id));
                                } else {
                                    zContainsKey = false;
                                }
                                if (zContainsKey) {
                                    this.atTop.add(tLObject3);
                                }
                            }
                        }
                        i3 = 0;
                        while (i7 < this.atTop.size()) {
                            tLObject2 = (TLObject) this.atTop.get(i7);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user3 = (TLRPC.User) tLObject2;
                                zContains2 = this.selectedUsers.contains(Long.valueOf(user3.id));
                                if (zContains2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                ArrayList arrayList18 = this.items;
                                ItemInner itemInnerAsUser3 = ItemInner.asUser(user3, zContains2, z9);
                                i9 = this.pageType;
                                if (i9 != 2) {
                                    z10 = true;
                                } else {
                                    z10 = true;
                                }
                                arrayList18.add(itemInnerAsUser3.red(z10));
                                iDp2 = AndroidUtilities.dp(f2);
                            } else {
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat4 = (TLRPC.Chat) tLObject2;
                                    ArrayList arrayList19 = this.items;
                                    ItemInner itemInnerAsChat3 = ItemInner.asChat(chat4, this.selectedUsersByGroup.containsKey(Long.valueOf(chat4.id)));
                                    i8 = this.pageType;
                                    if (i8 != 2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    arrayList19.add(itemInnerAsChat3.red(z8));
                                    iDp2 = AndroidUtilities.dp(f2);
                                }
                            }
                            fDp += iDp2;
                            i3++;
                        }
                    } else {
                        i3 = 0;
                    }
                    while (i4 < users.size()) {
                        tLObject = (TLObject) users.get(i4);
                        if (zIsEmpty) {
                            if (tLObject instanceof TLRPC.User) {
                                TLRPC.User user4 = (TLRPC.User) tLObject;
                                zContains = this.selectedUsers.contains(Long.valueOf(user4.id));
                                if (zContains) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                ArrayList arrayList110 = this.items;
                                ItemInner itemInnerAsUser4 = ItemInner.asUser(user4, zContains, z6);
                                i6 = this.pageType;
                                if (i6 != 2) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                arrayList110.add(itemInnerAsUser4.red(z7));
                                fDp += AndroidUtilities.dp(f2);
                                i3++;
                            } else if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) tLObject;
                                ArrayList arrayList111 = this.items;
                                ItemInner itemInnerAsChat4 = ItemInner.asChat(chat5, this.selectedUsersByGroup.containsKey(Long.valueOf(chat5.id)));
                                i5 = this.pageType;
                                if (i5 != 2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                arrayList111.add(itemInnerAsChat4.red(z5));
                                fDp += AndroidUtilities.dp(f2);
                                i3++;
                            }
                        } else if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user5 = (TLRPC.User) tLObject;
                            zContains = this.selectedUsers.contains(Long.valueOf(user5.id));
                            if (zContains) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            ArrayList arrayList112 = this.items;
                            ItemInner itemInnerAsUser5 = ItemInner.asUser(user5, zContains, z6);
                            i6 = this.pageType;
                            if (i6 != 2) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            arrayList112.add(itemInnerAsUser5.red(z7));
                            fDp += AndroidUtilities.dp(f2);
                            i3++;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat6 = (TLRPC.Chat) tLObject;
                            ArrayList arrayList113 = this.items;
                            ItemInner itemInnerAsChat5 = ItemInner.asChat(chat6, this.selectedUsersByGroup.containsKey(Long.valueOf(chat6.id)));
                            i5 = this.pageType;
                            if (i5 != 2) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            arrayList113.add(itemInnerAsChat5.red(z5));
                            fDp += AndroidUtilities.dp(f2);
                            i3++;
                        }
                    }
                    if (!zIsEmpty) {
                        if (i3 == 0) {
                            this.items.add(ItemInner.asNoUsers());
                            fDp += AndroidUtilities.dp(f);
                        }
                        recyclerListView = this.listView;
                        if (recyclerListView != null) {
                            iDp = ((recyclerListView.getMeasuredHeight() - this.listView.getPaddingTop()) - this.listView.getPaddingBottom()) + (((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible ? this.keyboardHeight : 0);
                        } else {
                            iDp = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(f2)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        f3 = iDp - fDp;
                        if (f3 > 0.0f) {
                            this.items.add(ItemInner.asPadding((int) f3));
                        }
                    }
                }
                if (this.layoutManager.getReverseLayout()) {
                    Collections.reverse(this.items);
                }
                if (z2) {
                    if (!z) {
                        this.adapter.notifyDataSetChanged();
                    } else {
                        this.adapter.notifyDataSetChanged();
                    }
                }
                this.contentView.invalidate();
            }
            fDp = 0.0f;
            zIsEmpty = TextUtils.isEmpty(this.query);
            if (this.pageType != 0) {
                String lowerCase3 = AndroidUtilities.translitSafe(this.query).toLowerCase();
                i = this.pageType;
                if (i == 5) {
                    users = StoryPrivacyBottomSheet.this.getChats();
                } else {
                    storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                    if (i != 1) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (storyPrivacyBottomSheet.allowSmallChats) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    users = storyPrivacyBottomSheet.getUsers(z3, z4);
                }
                HashSet hashSetMergeUsers3 = StoryPrivacyBottomSheet.this.mergeUsers(this.selectedUsers, this.selectedUsersByGroup);
                if (zIsEmpty) {
                    if (!z) {
                        this.atTop.clear();
                        while (i10 < users.size()) {
                            tLObject3 = (TLObject) users.get(i10);
                            if (tLObject3 instanceof TLRPC.User) {
                                zContainsKey = this.selectedUsers.contains(Long.valueOf(((TLRPC.User) tLObject3).id));
                            } else if (tLObject3 instanceof TLRPC.Chat) {
                                zContainsKey = this.selectedUsersByGroup.containsKey(Long.valueOf(((TLRPC.Chat) tLObject3).id));
                            } else {
                                zContainsKey = false;
                            }
                            if (zContainsKey) {
                                this.atTop.add(tLObject3);
                            }
                        }
                    }
                    i3 = 0;
                    while (i7 < this.atTop.size()) {
                        tLObject2 = (TLObject) this.atTop.get(i7);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user6 = (TLRPC.User) tLObject2;
                            zContains2 = this.selectedUsers.contains(Long.valueOf(user6.id));
                            if (zContains2) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            ArrayList arrayList114 = this.items;
                            ItemInner itemInnerAsUser6 = ItemInner.asUser(user6, zContains2, z9);
                            i9 = this.pageType;
                            if (i9 != 2) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            arrayList114.add(itemInnerAsUser6.red(z10));
                            iDp2 = AndroidUtilities.dp(f2);
                        } else {
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat7 = (TLRPC.Chat) tLObject2;
                                ArrayList arrayList115 = this.items;
                                ItemInner itemInnerAsChat6 = ItemInner.asChat(chat7, this.selectedUsersByGroup.containsKey(Long.valueOf(chat7.id)));
                                i8 = this.pageType;
                                if (i8 != 2) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                arrayList115.add(itemInnerAsChat6.red(z8));
                                iDp2 = AndroidUtilities.dp(f2);
                            }
                        }
                        fDp += iDp2;
                        i3++;
                    }
                } else {
                    i3 = 0;
                }
                while (i4 < users.size()) {
                    tLObject = (TLObject) users.get(i4);
                    if (zIsEmpty) {
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user7 = (TLRPC.User) tLObject;
                            zContains = this.selectedUsers.contains(Long.valueOf(user7.id));
                            if (zContains) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            ArrayList arrayList116 = this.items;
                            ItemInner itemInnerAsUser7 = ItemInner.asUser(user7, zContains, z6);
                            i6 = this.pageType;
                            if (i6 != 2) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            arrayList116.add(itemInnerAsUser7.red(z7));
                            fDp += AndroidUtilities.dp(f2);
                            i3++;
                        } else if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat8 = (TLRPC.Chat) tLObject;
                            ArrayList arrayList117 = this.items;
                            ItemInner itemInnerAsChat7 = ItemInner.asChat(chat8, this.selectedUsersByGroup.containsKey(Long.valueOf(chat8.id)));
                            i5 = this.pageType;
                            if (i5 != 2) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            arrayList117.add(itemInnerAsChat7.red(z5));
                            fDp += AndroidUtilities.dp(f2);
                            i3++;
                        }
                    } else if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user8 = (TLRPC.User) tLObject;
                        zContains = this.selectedUsers.contains(Long.valueOf(user8.id));
                        if (zContains) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        ArrayList arrayList118 = this.items;
                        ItemInner itemInnerAsUser8 = ItemInner.asUser(user8, zContains, z6);
                        i6 = this.pageType;
                        if (i6 != 2) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        arrayList118.add(itemInnerAsUser8.red(z7));
                        fDp += AndroidUtilities.dp(f2);
                        i3++;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat9 = (TLRPC.Chat) tLObject;
                        ArrayList arrayList119 = this.items;
                        ItemInner itemInnerAsChat8 = ItemInner.asChat(chat9, this.selectedUsersByGroup.containsKey(Long.valueOf(chat9.id)));
                        i5 = this.pageType;
                        if (i5 != 2) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        arrayList119.add(itemInnerAsChat8.red(z5));
                        fDp += AndroidUtilities.dp(f2);
                        i3++;
                    }
                }
                if (!zIsEmpty) {
                    if (i3 == 0) {
                        this.items.add(ItemInner.asNoUsers());
                        fDp += AndroidUtilities.dp(f);
                    }
                    recyclerListView = this.listView;
                    if (recyclerListView != null) {
                        iDp = ((recyclerListView.getMeasuredHeight() - this.listView.getPaddingTop()) - this.listView.getPaddingBottom()) + (((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible ? this.keyboardHeight : 0);
                    } else {
                        iDp = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(f2)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                    }
                    f3 = iDp - fDp;
                    if (f3 > 0.0f) {
                        this.items.add(ItemInner.asPadding((int) f3));
                    }
                }
            }
            if (this.layoutManager.getReverseLayout()) {
                Collections.reverse(this.items);
            }
            if (z2) {
                if (!z) {
                    this.adapter.notifyDataSetChanged();
                } else {
                    this.adapter.notifyDataSetChanged();
                }
            }
            this.contentView.invalidate();
        }

        public static void $r8$lambda$EeaqFdRuzsg9R4hSYW_82it_AyM(Page page) {
            StoryPrivacyBottomSheet.this.activePage = 6;
            StoryPrivacyBottomSheet.this.viewPager.scrollToPosition(1);
        }

        private boolean match(TLObject tLObject, String str) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                String lowerCase = AndroidUtilities.translitSafe(UserObject.getUserName(user)).toLowerCase();
                if (!lowerCase.startsWith(str)) {
                    if (!lowerCase.contains(" " + str)) {
                        String lowerCase2 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user)).toLowerCase();
                        if (!lowerCase2.startsWith(str)) {
                            if (!lowerCase2.contains(" " + str)) {
                                ArrayList<TLRPC.TL_username> arrayList = user.usernames;
                                if (arrayList != null) {
                                    for (int i = 0; i < arrayList.size(); i++) {
                                        TLRPC.TL_username tL_username = arrayList.get(i);
                                        if (tL_username.active && AndroidUtilities.translitSafe(tL_username.username).toLowerCase().startsWith(str)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            }
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                String lowerCase3 = AndroidUtilities.translitSafe(chat.title).toLowerCase();
                if (!lowerCase3.startsWith(str)) {
                    if (!lowerCase3.contains(" " + str)) {
                        String lowerCase4 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat)).toLowerCase();
                        if (!lowerCase4.startsWith(str)) {
                            if (!lowerCase4.contains(" " + str)) {
                                ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
                                if (arrayList2 != null) {
                                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                        TLRPC.TL_username tL_username2 = arrayList2.get(i2);
                                        if (tL_username2.active && AndroidUtilities.translitSafe(tL_username2.username).toLowerCase().startsWith(str)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }

        public void onSearch(String str) {
            if (str != null && str.isEmpty()) {
                str = null;
            }
            this.query = str;
            updateItems(false);
        }

        public void updateTops() {
            updateSearchFieldTop();
            updateHeaderTop();
        }

        private float getSearchFieldTop() {
            float f = -Math.max(0, Math.min(AndroidUtilities.dp(150.0f), this.searchField.resultContainerHeight) - AndroidUtilities.dp(150.0f));
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                    return Math.max(f, childAt.getY());
                }
            }
            return f;
        }

        private void updateSearchFieldTop() {
            float searchFieldTop = getSearchFieldTop();
            if (this.scrolling || this.keyboardMoving || getTranslationX() != 0.0f) {
                this.searchTranslationAnimating = false;
                ValueAnimator valueAnimator = this.searchFieldAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.searchFieldAnimator = null;
                }
                this.searchField.setTranslationY(searchFieldTop);
                return;
            }
            if (!this.searchTranslationAnimating || Math.abs(this.searchTranslationAnimatingTo - searchFieldTop) > 1.0f) {
                this.searchTranslationAnimating = true;
                ValueAnimator valueAnimator2 = this.searchFieldAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.searchFieldAnimator = null;
                }
                float translationY = this.searchField.getTranslationY();
                this.searchTranslationAnimatingTo = searchFieldTop;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, searchFieldTop);
                this.searchFieldAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        this.f$0.searchField.setTranslationY(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                    }
                });
                this.searchFieldAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Page.this.searchTranslationAnimating = false;
                    }
                });
                this.searchFieldAnimator.setInterpolator(new LinearInterpolator());
                this.searchFieldAnimator.setDuration(180L);
                this.searchFieldAnimator.start();
            }
        }

        private void updateHeaderTop() {
            if (!this.containsHeader) {
                this.headerView.setVisibility(8);
                return;
            }
            boolean z = false;
            this.headerView.setVisibility(0);
            float paddingTop = -this.headerView.getHeight();
            int i = 0;
            while (true) {
                if (i >= this.listView.getChildCount()) {
                    z = true;
                    break;
                }
                View childAt = this.listView.getChildAt(i);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                    paddingTop = this.contentView.getPaddingTop() + childAt.getY();
                    break;
                }
                i++;
            }
            if (this.isActionBar != z) {
                this.isActionBar = z;
                this.headerView.backDrawable.setRotation((z || this.pageType != 0) ? 0.0f : 1.0f, true);
            }
            this.headerView.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, paddingTop));
        }

        private long getDialogId() {
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
            TLRPC.InputPeer inputPeer = storyPrivacyBottomSheet.selectedPeer;
            if (inputPeer == null) {
                return UserConfig.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getClientUserId();
            }
            return DialogObject.getPeerDialogId(inputPeer);
        }

        public void updateButton(boolean z) {
            int i = this.pageType;
            if (i == 0) {
                this.button.setShowZero(false);
                this.button.setEnabled(true);
                this.button.setCount(0, z);
                if (!StoryPrivacyBottomSheet.this.liveSettings && !StoryPrivacyBottomSheet.this.isEdit) {
                    if (StoryPrivacyBottomSheet.this.storiesCount != 1) {
                        this.button.setText(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", StoryPrivacyBottomSheet.this.storiesCount), z);
                    } else {
                        this.button.setText(LocaleController.getString(StoryPrivacyBottomSheet.this.isLive ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z);
                    }
                } else {
                    this.button.setText(LocaleController.getString(R.string.StoryPrivacyButtonSave), z);
                }
                this.button2.setVisibility(StoryPrivacyBottomSheet.this.sendAsMessageEnabled ? 0 : 8);
                return;
            }
            if (i == 1) {
                this.button.setShowZero(false);
                this.button.setEnabled(true);
                this.button.setText(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z);
                this.button.setCount(this.selectedUsers.size(), z);
                this.button2.setVisibility(8);
                return;
            }
            if (i == 3) {
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                int i2 = storyPrivacyBottomSheet.selectedContactsCount = storyPrivacyBottomSheet.mergeUsers(this.selectedUsers, this.selectedUsersByGroup).size();
                this.button.setText(LocaleController.getString(R.string.StoryPrivacyButtonSave), z);
                this.button.setShowZero(false);
                this.buttonContainer.hide(i2 <= 0, z);
                this.button.setCount(i2, z);
                this.button.setEnabled(i2 > 0);
                this.button2.setVisibility(8);
                return;
            }
            if (i == 2) {
                this.button.setShowZero(false);
                this.button.setEnabled(true);
                if (this.selectedUsers.isEmpty()) {
                    this.button.setText(LocaleController.getString(R.string.StoryPrivacyButtonSave), z);
                    this.button.setCount(0, z);
                } else {
                    this.button.setText(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z);
                    this.button.setCount(this.selectedUsers.size(), z);
                }
                this.button2.setVisibility(8);
                return;
            }
            if (i == 5) {
                this.button.setShowZero(true);
                this.button.setEnabled(true ^ this.selectedUsers.isEmpty());
                this.button.setCount(this.selectedUsers.size(), z);
                this.button2.setVisibility(8);
                return;
            }
            if (i != 6) {
                if (i == 4) {
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = StoryPrivacyBottomSheet.this;
                    int i3 = storyPrivacyBottomSheet2.excludedEveryoneCount = storyPrivacyBottomSheet2.mergeUsers(storyPrivacyBottomSheet2.excludedEveryone, StoryPrivacyBottomSheet.this.excludedEveryoneByGroup).size();
                    this.button.setText(LocaleController.getString(R.string.StoryPrivacyButtonSave), z);
                    this.button.setShowZero(false);
                    this.buttonContainer.hide(false, z);
                    this.button.setCount(i3, z);
                    this.button.setEnabled(true);
                    this.button2.setVisibility(8);
                    return;
                }
                return;
            }
            this.button.setShowZero(false);
            this.button.setEnabled(true);
            this.button.setText(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z);
            StoriesController storiesController = MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).getStoriesController();
            if (storiesController.blocklistFull) {
                this.button.setCount(this.selectedUsers.size(), z);
            } else {
                storiesController.getBlocklistCount();
                for (int i4 = 0; i4 < this.changelog.size(); i4++) {
                    long jKeyAt = this.changelog.keyAt(i4);
                    ((Boolean) this.changelog.valueAt(i4)).getClass();
                    storiesController.blocklist.contains(Long.valueOf(jKeyAt));
                }
            }
            this.button2.setVisibility(8);
        }

        private void updateSectionCell(boolean z) {
            if (this.sectionCell == null) {
                return;
            }
            if (StoryPrivacyBottomSheet.this.mergeUsers(this.selectedUsers, this.selectedUsersByGroup).size() > 0) {
                this.sectionCell.setRightText(LocaleController.getString(R.string.UsersDeselectAll), true, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        StoryPrivacyBottomSheet.Page.m4590$r8$lambda$TSXdpxfLLNwr5QFq5veDfJFGeg(this.f$0, view);
                    }
                });
            } else if (z) {
                this.sectionCell.setRightText(null);
            } else {
                this.sectionCell.setRightText((CharSequence) null, (View.OnClickListener) null);
            }
        }

        public static void m4590$r8$lambda$TSXdpxfLLNwr5QFq5veDfJFGeg(Page page, View view) {
            ArrayList arrayList = page.selectedUsers;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                page.changelog.put(((Long) obj).longValue(), Boolean.FALSE);
            }
            for (ArrayList arrayList2 : page.selectedUsersByGroup.values()) {
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    page.changelog.put(((Long) obj2).longValue(), Boolean.FALSE);
                }
            }
            page.selectedUsers.clear();
            page.selectedUsersByGroup.clear();
            StoryPrivacyBottomSheet.this.messageUsers.clear();
            page.searchField.spansContainer.removeAllSpans(true);
            page.updateCheckboxes(true);
            page.updateButton(true);
        }

        public void updateCheckboxes(boolean z) {
            int childAdapterPosition;
            int i = this.pageType;
            if (i == 4) {
                StoryPrivacyBottomSheet.this.excludedEveryone.clear();
                StoryPrivacyBottomSheet.this.excludedEveryoneByGroup.clear();
                StoryPrivacyBottomSheet.this.excludedEveryone.addAll(this.selectedUsers);
                StoryPrivacyBottomSheet.this.excludedEveryoneByGroup.putAll(this.selectedUsersByGroup);
            } else if (i == 2) {
                StoryPrivacyBottomSheet.this.excludedContacts.clear();
                StoryPrivacyBottomSheet.this.excludedContacts.addAll(this.selectedUsers);
            } else if (i == 3) {
                StoryPrivacyBottomSheet.this.selectedContacts.clear();
                StoryPrivacyBottomSheet.this.selectedContactsByGroup.clear();
                StoryPrivacyBottomSheet.this.selectedContacts.addAll(this.selectedUsers);
                StoryPrivacyBottomSheet.this.selectedContactsByGroup.putAll(this.selectedUsersByGroup);
            } else if (i == 0) {
                StoryPrivacyBottomSheet.this.messageUsers.clear();
                StoryPrivacyBottomSheet.this.messageUsers.addAll(this.selectedUsers);
            }
            if (this.pageType == 3 && (StoryPrivacyBottomSheet.this.selectedType != 3 || (this.selectedUsers.isEmpty() && this.selectedUsersByGroup.isEmpty()))) {
                if (!this.selectedUsers.isEmpty() || !this.selectedUsersByGroup.isEmpty()) {
                    this.lastSelectedType = StoryPrivacyBottomSheet.this.selectedType;
                    StoryPrivacyBottomSheet.this.selectedType = 3;
                } else {
                    int i2 = this.lastSelectedType;
                    if (i2 != -1) {
                        StoryPrivacyBottomSheet.this.selectedType = i2;
                    }
                }
            }
            HashSet hashSetMergeUsers = StoryPrivacyBottomSheet.this.mergeUsers(this.selectedUsers, this.selectedUsersByGroup);
            int i3 = 0;
            while (true) {
                if (i3 >= this.items.size()) {
                    break;
                }
                ItemInner itemInner = (ItemInner) this.items.get(i3);
                if (itemInner != null) {
                    if (itemInner.type > 0) {
                        itemInner.checked = StoryPrivacyBottomSheet.this.selectedType == itemInner.type;
                        itemInner.halfChecked = false;
                    } else {
                        TLRPC.User user = itemInner.user;
                        if (user != null) {
                            boolean zContains = this.selectedUsers.contains(Long.valueOf(user.id));
                            itemInner.checked = zContains;
                            itemInner.halfChecked = !zContains && hashSetMergeUsers.contains(Long.valueOf(itemInner.user.id));
                        } else {
                            TLRPC.Chat chat = itemInner.chat;
                            if (chat != null) {
                                itemInner.checked = this.selectedUsersByGroup.containsKey(Long.valueOf(chat.id));
                                itemInner.halfChecked = false;
                            }
                        }
                    }
                }
                i3++;
            }
            for (int i4 = 0; i4 < this.listView.getChildCount(); i4++) {
                View childAt = this.listView.getChildAt(i4);
                if ((childAt instanceof UserCell) && (childAdapterPosition = this.listView.getChildAdapterPosition(childAt)) >= 0 && childAdapterPosition < this.items.size() && OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(childAt)) {
                    ItemInner itemInner2 = (ItemInner) this.items.get(childAdapterPosition);
                    UserCell userCell = (UserCell) childAt;
                    userCell.setChecked(itemInner2.checked || itemInner2.halfChecked, z);
                    TLRPC.Chat chat2 = itemInner2.chat;
                    float f = 1.0f;
                    if (chat2 != null) {
                        userCell.setCheckboxAlpha(StoryPrivacyBottomSheet.this.getParticipantsCount(chat2) > 200 ? 0.3f : 1.0f, z);
                    } else {
                        if (itemInner2.halfChecked && !itemInner2.checked) {
                            f = 0.5f;
                        }
                        userCell.setCheckboxAlpha(f, z);
                    }
                }
            }
            updateSectionCell(z);
        }

        public void scrollToTopSmoothly() {
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2, 0.7f);
            linearSmoothScrollerCustom.setTargetPosition(1);
            linearSmoothScrollerCustom.setOffset(-AndroidUtilities.dp(56.0f));
            this.layoutManager.startSmoothScroll(linearSmoothScrollerCustom);
        }

        public void scrollToTop() {
            if (this.pageType != 0) {
                this.listView.scrollToPosition(0);
            }
        }

        public int getTypeOn(MotionEvent motionEvent) {
            View viewFindChildViewUnder;
            int childAdapterPosition;
            if (this.pageType == 0 && motionEvent != null && (viewFindChildViewUnder = this.listView.findChildViewUnder(motionEvent.getX(), motionEvent.getY() - this.contentView.getPaddingTop())) != null && (childAdapterPosition = this.listView.getChildAdapterPosition(viewFindChildViewUnder)) >= 0 && childAdapterPosition < this.items.size()) {
                ItemInner itemInner = (ItemInner) this.items.get(childAdapterPosition);
                if (itemInner.viewType == 3 && !itemInner.sendAs) {
                    boolean z = LocaleController.isRTL;
                    float x = motionEvent.getX();
                    if (!z ? x > AndroidUtilities.dp(100.0f) : x < getWidth() - AndroidUtilities.dp(100.0f)) {
                        return itemInner.type;
                    }
                }
            }
            return -1;
        }

        public boolean atTop() {
            return !this.listView.canScrollVertically(-1);
        }

        public boolean atBottom() {
            return !this.listView.canScrollVertically(1);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            if (((BottomSheet) StoryPrivacyBottomSheet.this).keyboardHeight > 0) {
                this.keyboardHeight = ((BottomSheet) StoryPrivacyBottomSheet.this).keyboardHeight;
            }
            super.onMeasure(i, i2);
            this.contentView.setPadding(0, AndroidUtilities.statusBarHeight + (this.pageType == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
            if (this.wasKeyboardVisible != ((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible) {
                float searchFieldTop = getSearchFieldTop();
                if (((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible && searchFieldTop + Math.min(AndroidUtilities.dp(150.0f), this.searchField.resultContainerHeight) > this.listView.getPaddingTop()) {
                    scrollToTopSmoothly();
                }
                if (this.pageType == 0) {
                    this.buttonContainer.setTranslationY(((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible ? this.keyboardHeight : 0.0f);
                    this.underKeyboardView.setTranslationY(((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible ? this.keyboardHeight : 0.0f);
                } else {
                    this.buttonContainer.translateY(((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible ? this.keyboardHeight : -this.keyboardHeight, 0.0f);
                    this.underKeyboardView.setTranslationY(((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible ? this.keyboardHeight : -this.keyboardHeight);
                    this.keyboardMoving = true;
                    this.underKeyboardView.animate().translationY(0.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.keyboardMoving = false;
                        }
                    }).start();
                }
                this.wasKeyboardVisible = ((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible;
            }
            this.listView.setPadding(0, 0, 0, this.buttonContainer.getMeasuredHeight());
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override
        public void onClick(View view) {
            if (this.searchField.allSpans.contains(view)) {
                GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
                if (groupCreateSpan.isDeleting()) {
                    this.searchField.currentDeletingSpan = null;
                    this.searchField.spansContainer.removeSpan(groupCreateSpan);
                    long uid = groupCreateSpan.getUid();
                    Iterator it = this.selectedUsersByGroup.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                            it.remove();
                            this.selectedUsers.addAll((Collection) entry.getValue());
                            this.selectedUsers.remove(Long.valueOf(uid));
                        }
                    }
                    this.selectedUsers.remove(Long.valueOf(uid));
                    updateCheckboxes(true);
                    updateButton(true);
                    return;
                }
                if (this.searchField.currentDeletingSpan != null) {
                    this.searchField.currentDeletingSpan.cancelDeleteAnimation();
                    this.searchField.currentDeletingSpan = null;
                }
                this.searchField.currentDeletingSpan = groupCreateSpan;
                groupCreateSpan.startDeleteAnimation();
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        }

        private class PadView extends View {
            public PadView(Context context) {
                super(context);
            }
        }

        class Adapter extends AdapterWithDiffUtils {
            private Context context;
            private RecyclerListView listView;
            private Runnable onBack;
            private Theme.ResourcesProvider resourcesProvider;
            public boolean reversedLayout;
            private SearchUsersCell searchField;

            public Adapter(Context context, Theme.ResourcesProvider resourcesProvider, SearchUsersCell searchUsersCell, Runnable runnable) {
                this.context = context;
                this.resourcesProvider = resourcesProvider;
                this.searchField = searchUsersCell;
                this.onBack = runnable;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return (viewHolder.getItemViewType() == 3 && StoryPrivacyBottomSheet.this.canChangePeer) || viewHolder.getItemViewType() == 7 || viewHolder.getItemViewType() == 9 || viewHolder.getItemViewType() == 10;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                TextCell textCell;
                View slideIntChooseView;
                View headerCell2;
                if (i == -1) {
                    slideIntChooseView = Page.this.new PadView(this.context);
                } else if (i == 0) {
                    View view = new View(this.context);
                    view.setTag(35);
                    slideIntChooseView = view;
                } else if (i == 1) {
                    View view2 = new View(this.context);
                    view2.setTag(34);
                    slideIntChooseView = view2;
                } else if (i == 3) {
                    slideIntChooseView = new UserCell(this.context, this.resourcesProvider);
                } else {
                    if (i == 4) {
                        headerCell2 = new HeaderCell2(this.context, this.resourcesProvider, true);
                    } else if (i == 11) {
                        slideIntChooseView = new HeaderCell2(this.context, this.resourcesProvider, false);
                    } else if (i == 8) {
                        org.telegram.ui.Cells.HeaderCell headerCell = new org.telegram.ui.Cells.HeaderCell(this.context, this.resourcesProvider);
                        headerCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
                        slideIntChooseView = headerCell;
                    } else if (i == 5) {
                        StickerEmptyView stickerEmptyView = new StickerEmptyView(this.context, null, 1, this.resourcesProvider);
                        stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                        stickerEmptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        stickerEmptyView.linearLayout.setTranslationY(AndroidUtilities.dp(24.0f));
                        headerCell2 = stickerEmptyView;
                    } else if (i == 6) {
                        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(this.context, this.resourcesProvider);
                        textInfoPrivacyCell.setBackgroundColor(-15921907);
                        slideIntChooseView = textInfoPrivacyCell;
                    } else {
                        if (i == 7) {
                            textCell = new TextCell(this.context, 23, true, true, this.resourcesProvider);
                        } else if (i == 9) {
                            textCell = new TextCell(this.context, 23, true, false, this.resourcesProvider);
                        } else if (i == 10) {
                            slideIntChooseView = new SlideIntChooseView(this.context, this.resourcesProvider);
                        } else {
                            slideIntChooseView = new View(this.context) {
                                @Override
                                protected void onMeasure(int i2, int i3) {
                                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                                }
                            };
                        }
                        slideIntChooseView = textCell;
                    }
                    slideIntChooseView = headerCell2;
                }
                return new RecyclerListView.Holder(slideIntChooseView);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int i2;
                ArrayList arrayList;
                ItemInner itemInner;
                int iMax;
                int i3;
                boolean z = true;
                if (Page.this.items == null || i < 0 || i >= Page.this.items.size()) {
                    return;
                }
                ItemInner itemInner2 = (ItemInner) Page.this.items.get(i);
                int itemViewType = viewHolder.getItemViewType();
                if (!this.reversedLayout) {
                    i2 = i + 1;
                    if (i2 < Page.this.items.size()) {
                        arrayList = Page.this.items;
                        itemInner = (ItemInner) arrayList.get(i2);
                    } else {
                        itemInner = null;
                    }
                } else if (i > 0) {
                    arrayList = Page.this.items;
                    i2 = i - 1;
                    itemInner = (ItemInner) arrayList.get(i2);
                } else {
                    itemInner = null;
                }
                boolean z2 = itemInner != null && ((i3 = itemInner.viewType) == itemViewType || (i3 == 9 && itemInner.id == 1));
                if (itemViewType == 3) {
                    UserCell userCell = (UserCell) viewHolder.itemView;
                    boolean z3 = itemInner2.sendAs;
                    userCell.setIsSendAs(z3, !z3);
                    int i4 = itemInner2.type;
                    float f = 1.0f;
                    if (i4 > 0) {
                        userCell.setType(i4, itemInner2.typeCount, itemInner2.user);
                        userCell.setCheckboxAlpha(1.0f, false);
                    } else {
                        TLRPC.User user = itemInner2.user;
                        if (user != null) {
                            userCell.setUser(user);
                            if (itemInner2.halfChecked && !itemInner2.checked) {
                                f = 0.5f;
                            }
                            userCell.setCheckboxAlpha(f, false);
                        } else {
                            TLRPC.Chat chat = itemInner2.chat;
                            if (chat != null) {
                                userCell.setChat(chat, StoryPrivacyBottomSheet.this.getParticipantsCount(chat));
                            }
                        }
                    }
                    if (!itemInner2.checked && !itemInner2.halfChecked) {
                        z = false;
                    }
                    userCell.setChecked(z, false);
                    userCell.setDivider(z2);
                    userCell.setRedCheckbox(itemInner2.red);
                    userCell.drawArrow = StoryPrivacyBottomSheet.this.canChangePeer;
                    return;
                }
                if (itemViewType == 2) {
                    return;
                }
                if (itemViewType == 0) {
                    viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                    return;
                }
                if (itemViewType == -1) {
                    if (itemInner2.subtractHeight > 0) {
                        RecyclerListView recyclerListView = this.listView;
                        iMax = Math.max(((recyclerListView == null || recyclerListView.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.listView.getMeasuredHeight() + Page.this.keyboardHeight) - itemInner2.subtractHeight, AndroidUtilities.dp(120.0f));
                        viewHolder.itemView.setTag(33);
                    } else {
                        iMax = itemInner2.padHeight;
                        if (iMax >= 0) {
                            viewHolder.itemView.setTag(null);
                        } else {
                            iMax = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            viewHolder.itemView.setTag(33);
                        }
                    }
                    viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, iMax));
                    return;
                }
                if (itemViewType == 1) {
                    viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, Math.min(AndroidUtilities.dp(150.0f), this.searchField.resultContainerHeight)));
                    return;
                }
                if (itemViewType == 4) {
                    ((HeaderCell2) viewHolder.itemView).setText(itemInner2.text, itemInner2.text2);
                    return;
                }
                if (itemViewType == 11) {
                    ((HeaderCell2) viewHolder.itemView).setText(itemInner2.text, null);
                    return;
                }
                if (itemViewType == 5) {
                    try {
                        ((StickerEmptyView) viewHolder.itemView).stickerView.getImageReceiver().startAnimation();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (itemViewType == 6) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (itemInner2.text == null) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText(null);
                        return;
                    } else {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(itemInner2.text);
                        return;
                    }
                }
                if (itemViewType == 7) {
                    int i5 = itemInner2.resId;
                    if (i5 == 0) {
                        ((TextCell) viewHolder.itemView).setTextAndCheck(itemInner2.text, StoryPrivacyBottomSheet.this.allowScreenshots, z2);
                        return;
                    } else if (i5 == 1) {
                        ((TextCell) viewHolder.itemView).setTextAndCheck(itemInner2.text, StoryPrivacyBottomSheet.this.keepOnMyPage, z2);
                        return;
                    } else {
                        if (i5 == 2) {
                            ((TextCell) viewHolder.itemView).setTextAndCheck(itemInner2.text, StoryPrivacyBottomSheet.this.allowComments, z2);
                            return;
                        }
                        return;
                    }
                }
                if (itemViewType == 9) {
                    Drawable drawable = itemInner2.drawable;
                    if (drawable != null) {
                        ((TextCell) viewHolder.itemView).setTextAndValueDrawable(itemInner2.text, drawable, z2);
                        return;
                    } else {
                        ((TextCell) viewHolder.itemView).setTextAndValue(itemInner2.text, itemInner2.text2, z2);
                        return;
                    }
                }
                if (itemViewType == 8) {
                    ((org.telegram.ui.Cells.HeaderCell) viewHolder.itemView).setText(itemInner2.text);
                } else if (itemViewType == 10) {
                    int i6 = (int) MessagesController.getInstance(((BottomSheet) StoryPrivacyBottomSheet.this).currentAccount).starsPaidMessageAmountMax;
                    ((SlideIntChooseView) viewHolder.itemView).set(Utilities.clamp(StoryPrivacyBottomSheet.this.commentsPrice, i6, 0), SlideIntChooseView.Options.make(0, SlideIntChooseView.cut(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i6), 20, new Utilities.Callback2Return() {
                        @Override
                        public final Object run(Object obj, Object obj2) {
                            return StoryPrivacyBottomSheet.Page.Adapter.$r8$lambda$UIS_Jkk_zlzxU3kJNwsMLu39uAs((Integer) obj, (Integer) obj2);
                        }
                    }), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            StoryPrivacyBottomSheet.this.commentsPrice = ((Integer) obj).intValue();
                        }
                    });
                }
            }

            public static CharSequence $r8$lambda$UIS_Jkk_zlzxU3kJNwsMLu39uAs(Integer num, Integer num2) {
                if (num.intValue() == 0) {
                    return num2.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
            }

            @Override
            public int getItemViewType(int i) {
                if (Page.this.items == null || i < 0 || i >= Page.this.items.size()) {
                    return -1;
                }
                return ((ItemInner) Page.this.items.get(i)).viewType;
            }

            @Override
            public int getItemCount() {
                if (Page.this.items == null) {
                    return 0;
                }
                return Page.this.items.size();
            }
        }
    }

    public StoryPrivacyBottomSheet(final Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, true, resourcesProvider);
        this.excludedEveryone = new ArrayList();
        this.excludedEveryoneByGroup = new HashMap();
        this.excludedEveryoneCount = 0;
        this.excludedContacts = new ArrayList();
        this.selectedContacts = new ArrayList();
        this.selectedContactsByGroup = new HashMap();
        this.selectedContactsCount = 0;
        this.selectedAlbums = new HashSet();
        this.allowComments = true;
        this.allowScreenshots = true;
        this.keepOnMyPage = false;
        this.allowCover = true;
        this.canChangePeer = true;
        this.isRtmpStream = false;
        this.commentsPrice = 0;
        this.storiesCount = 1;
        this.messageUsers = new ArrayList();
        this.activePage = 1;
        this.selectedType = 4;
        this.sendAsMessageEnabled = false;
        this.smallChatsParticipantsCount = new HashMap();
        this.shiftDp = -6;
        this.storyPeriod = 86400;
        this.backgroundPaint = new Paint(1);
        this.applyWhenDismiss = false;
        this.allowSmallChats = true;
        this.isEdit = false;
        this.storyPeriod = i;
        pullSaved();
        init(context);
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public int getItemCount() {
                return 2;
            }

            @Override
            public View createView(int i2) {
                return StoryPrivacyBottomSheet.this.new Page(context);
            }

            @Override
            public int getItemViewType(int i2) {
                if (i2 == 0) {
                    return 0;
                }
                return StoryPrivacyBottomSheet.this.activePage;
            }

            @Override
            public void bindView(View view, int i2, int i3) {
                ((Page) view).bind(i3);
            }
        });
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                StoryPrivacyBottomSheet.$r8$lambda$D_xJQlGmijl8Mts4lfOfMsN51u0(this.f$0, messagesStorage);
            }
        });
        MessagesController.getInstance(this.currentAccount).getStoriesController().loadBlocklist(false);
        MessagesController.getInstance(this.currentAccount).getStoriesController().loadSendAs();
    }

    public static void $r8$lambda$D_xJQlGmijl8Mts4lfOfMsN51u0(final StoryPrivacyBottomSheet storyPrivacyBottomSheet, MessagesStorage messagesStorage) {
        storyPrivacyBottomSheet.getClass();
        final HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
        if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryPrivacyBottomSheet.m4582$r8$lambda$zf8TwZjKhX_xtWl9wpfaH4VOi0(this.f$0, smallGroupsParticipantsCount);
            }
        });
    }

    public static void m4582$r8$lambda$zf8TwZjKhX_xtWl9wpfaH4VOi0(StoryPrivacyBottomSheet storyPrivacyBottomSheet, HashMap map) {
        if (storyPrivacyBottomSheet.smallChatsParticipantsCount == null) {
            storyPrivacyBottomSheet.smallChatsParticipantsCount = new HashMap();
        }
        storyPrivacyBottomSheet.smallChatsParticipantsCount.putAll(map);
    }

    private void init(Context context) {
        Bulletin.addDelegate(this.container, new Bulletin.Delegate() {
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
            public int getBottomOffset(int i) {
                return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
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
            public int getTopOffset(int i) {
                return AndroidUtilities.statusBarHeight;
            }
        });
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        Paint paint = this.backgroundPaint;
        int i = Theme.key_dialogBackground;
        paint.setColor(Theme.getColor(i, this.resourcesProvider));
        fixNavigationBar(Theme.getColor(i, this.resourcesProvider));
        this.containerView = new ContainerView(context);
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            public void onTabAnimationUpdate(boolean z) {
                ((BottomSheet) StoryPrivacyBottomSheet.this).containerView.invalidate();
            }

            @Override
            protected boolean canScroll(MotionEvent motionEvent) {
                View currentView = StoryPrivacyBottomSheet.this.viewPager.getCurrentView();
                if (!(currentView instanceof Page)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    StoryPrivacyBottomSheet.this.closeKeyboard();
                    return true;
                }
                Page page = (Page) currentView;
                int typeOn = page.getTypeOn(motionEvent);
                if (typeOn != -1) {
                    StoryPrivacyBottomSheet.this.activePage = typeOn;
                    if (typeOn == 3) {
                        if (!StoryPrivacyBottomSheet.this.selectedContacts.isEmpty() && !StoryPrivacyBottomSheet.this.selectedContactsByGroup.isEmpty()) {
                            StoryPrivacyBottomSheet.this.selectedType = typeOn;
                        }
                    } else if (typeOn == 4) {
                        if (!StoryPrivacyBottomSheet.this.excludedEveryone.isEmpty() && !StoryPrivacyBottomSheet.this.excludedEveryoneByGroup.isEmpty()) {
                            StoryPrivacyBottomSheet.this.selectedType = typeOn;
                        }
                    } else {
                        StoryPrivacyBottomSheet.this.selectedType = typeOn;
                    }
                    page.updateCheckboxes(true);
                    page.updateButton(true);
                }
                if (typeOn != -1) {
                    StoryPrivacyBottomSheet.this.closeKeyboard();
                }
                return typeOn != -1;
            }

            @Override
            protected void onItemSelected(View view, View view2, int i2, int i3) {
                if (((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible) {
                    StoryPrivacyBottomSheet.this.closeKeyboard();
                }
            }
        };
        this.viewPager = viewPagerFixed;
        int i2 = this.backgroundPaddingLeft;
        viewPagerFixed.setPadding(i2, 0, i2, 0);
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
    }

    @Override
    public void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
        super.dismissInternal();
    }

    private StoryPrivacyBottomSheet(final int i, final Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, true, resourcesProvider);
        this.excludedEveryone = new ArrayList();
        this.excludedEveryoneByGroup = new HashMap();
        this.excludedEveryoneCount = 0;
        this.excludedContacts = new ArrayList();
        this.selectedContacts = new ArrayList();
        this.selectedContactsByGroup = new HashMap();
        this.selectedContactsCount = 0;
        this.selectedAlbums = new HashSet();
        this.allowComments = true;
        this.allowScreenshots = true;
        this.keepOnMyPage = false;
        this.allowCover = true;
        this.canChangePeer = true;
        this.isRtmpStream = false;
        this.commentsPrice = 0;
        this.storiesCount = 1;
        this.messageUsers = new ArrayList();
        this.activePage = 1;
        this.selectedType = 4;
        this.sendAsMessageEnabled = false;
        this.smallChatsParticipantsCount = new HashMap();
        this.shiftDp = -6;
        this.storyPeriod = 86400;
        this.backgroundPaint = new Paint(1);
        this.applyWhenDismiss = false;
        this.allowSmallChats = true;
        this.isEdit = false;
        init(context);
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public int getItemCount() {
                return 1;
            }

            @Override
            public View createView(int i2) {
                return StoryPrivacyBottomSheet.this.new Page(context);
            }

            @Override
            public int getItemViewType(int i2) {
                return i;
            }

            @Override
            public void bindView(View view, int i2, int i3) {
                ((Page) view).bind(i3);
            }
        });
    }

    public void closeKeyboard() {
        for (View view : this.viewPager.getViewPages()) {
            if (view instanceof Page) {
                Page page = (Page) view;
                if (page.searchField != null) {
                    AndroidUtilities.hideKeyboard(page.searchField.editText);
                }
            }
        }
    }

    public void done(StoryPrivacy storyPrivacy, Runnable runnable) {
        done(storyPrivacy, runnable, false);
    }

    public void done(final StoryPrivacy storyPrivacy, final Runnable runnable, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (this.warnUsers != null && storyPrivacy != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i = 0; i < this.warnUsers.size(); i++) {
                String str = (String) this.warnUsers.get(i);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !storyPrivacy.containsUser(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (!arrayList.isEmpty() && !z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < Math.min(2, arrayList.size()); i2++) {
                if (i2 > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i2)));
                spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.StoryRestrictions)).setMessage(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder)).setPositiveButton(LocaleController.getString(R.string.Proceed), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    this.f$0.done(storyPrivacy, runnable, true);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
            return;
        }
        View view = this.viewPager.getViewPages()[0];
        final ButtonWithCounterView buttonWithCounterView = view instanceof Page ? ((Page) view).button : null;
        if (runnable != null && buttonWithCounterView != null) {
            buttonWithCounterView.setLoading(true);
        }
        DoneCallback doneCallback = this.onDone;
        if (doneCallback == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        doneCallback.done(storyPrivacy, this.allowComments, this.allowScreenshots, this.keepOnMyPage, this.isRtmpStream, this.selectedPeer, this.commentsPrice, runnable != null ? new Runnable() {
            @Override
            public final void run() {
                StoryPrivacyBottomSheet.m4581$r8$lambda$e3bbDBvodcFRakBqslpoVJPZvA(buttonWithCounterView, runnable);
            }
        } : null, new Runnable() {
            @Override
            public final void run() {
                StoryPrivacyBottomSheet.$r8$lambda$zzb6aiHvxhSXXSbTPKrYLHlWclE(buttonWithCounterView);
            }
        });
    }

    public static void m4581$r8$lambda$e3bbDBvodcFRakBqslpoVJPZvA(ButtonWithCounterView buttonWithCounterView, Runnable runnable) {
        if (buttonWithCounterView != null) {
            buttonWithCounterView.setLoading(false);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void $r8$lambda$zzb6aiHvxhSXXSbTPKrYLHlWclE(ButtonWithCounterView buttonWithCounterView) {
        if (buttonWithCounterView != null) {
            buttonWithCounterView.setLoading(false);
        }
    }

    @Override
    public void dismiss() {
        StoryPrivacy storyPrivacy;
        if (this.onDismiss != null) {
            int i = this.selectedType;
            if (i == 3) {
                storyPrivacy = new StoryPrivacy(this.selectedType, this.currentAccount, new ArrayList(mergeUsers(this.selectedContacts, this.selectedContactsByGroup)));
                storyPrivacy.selectedUserIds.clear();
                storyPrivacy.selectedUserIds.addAll(this.selectedContacts);
                storyPrivacy.selectedUserIdsByGroup.clear();
                storyPrivacy.selectedUserIdsByGroup.putAll(this.selectedContactsByGroup);
            } else if (i == 4) {
                storyPrivacy = new StoryPrivacy(this.selectedType, this.currentAccount, new ArrayList(mergeUsers(this.excludedEveryone, this.excludedEveryoneByGroup)));
                storyPrivacy.selectedUserIds.clear();
                storyPrivacy.selectedUserIds.addAll(this.excludedEveryone);
                storyPrivacy.selectedUserIdsByGroup.clear();
                storyPrivacy.selectedUserIdsByGroup.putAll(this.excludedEveryoneByGroup);
            } else if (i == 2) {
                storyPrivacy = new StoryPrivacy(i, this.currentAccount, this.excludedContacts);
            } else {
                storyPrivacy = new StoryPrivacy(i, this.currentAccount, (ArrayList) null);
            }
            this.onDismiss.run(storyPrivacy);
            this.onDismiss = null;
        }
        Bulletin.removeDelegate(this.container);
        save();
        super.dismiss();
    }

    private class ContainerView extends FrameLayout {
        private final AnimatedFloat isActionBar;
        private final Path path;
        private float top;

        public ContainerView(Context context) {
            super(context);
            this.isActionBar = new AnimatedFloat(this, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.path = new Path();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            View[] viewPages = StoryPrivacyBottomSheet.this.viewPager.getViewPages();
            this.top = 0.0f;
            for (View view : viewPages) {
                if (view != null) {
                    Page page = (Page) view;
                    this.top += page.top() * Utilities.clamp(1.0f - Math.abs(page.getTranslationX() / page.getMeasuredWidth()), 1.0f, 0.0f);
                    boolean unused = ((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible;
                    if (page.getVisibility() == 0) {
                        page.updateTops();
                    }
                }
            }
            float f = this.isActionBar.set(this.top <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f);
            this.top = Math.max(AndroidUtilities.statusBarHeight, this.top) - (AndroidUtilities.statusBarHeight * f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((BottomSheet) StoryPrivacyBottomSheet.this).backgroundPaddingLeft, this.top, getWidth() - ((BottomSheet) StoryPrivacyBottomSheet.this).backgroundPaddingLeft, getHeight() + AndroidUtilities.dp(8.0f));
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, f);
            canvas.drawRoundRect(rectF, fLerp, fLerp, StoryPrivacyBottomSheet.this.backgroundPaint);
            canvas.save();
            this.path.rewind();
            this.path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.top) {
                StoryPrivacyBottomSheet.this.dismiss();
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }
    }

    @Override
    public void onBackPressed() {
        if (this.viewPager.getCurrentPosition() > 0) {
            closeKeyboard();
            ViewPagerFixed viewPagerFixed = this.viewPager;
            viewPagerFixed.scrollToPosition(viewPagerFixed.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected boolean canDismissWithSwipe() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof Page) {
            return ((Page) currentView).wasAtTop;
        }
        return true;
    }

    public StoryPrivacyBottomSheet whenDismiss(Utilities.Callback callback) {
        this.onDismiss = callback;
        return this;
    }

    public StoryPrivacyBottomSheet whenSelectedRules(DoneCallback doneCallback, boolean z) {
        this.onDone = doneCallback;
        this.applyWhenDismiss = z;
        return this;
    }

    public StoryPrivacyBottomSheet whenSelectedShare(Utilities.Callback callback) {
        this.onDone2 = callback;
        return this;
    }

    public StoryPrivacyBottomSheet whenSelectedPeer(Utilities.Callback callback) {
        this.onSelectedPeer = callback;
        return this;
    }

    public StoryPrivacyBottomSheet whenSelectedAlbums(Utilities.Callback callback) {
        this.onSelectedAlbums = callback;
        return this;
    }

    public StoryPrivacyBottomSheet allowCover(boolean z) {
        this.allowCover = z;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            for (View view : viewPagerFixed.getViewPages()) {
                if (view instanceof Page) {
                    ((Page) view).updateButton(false);
                }
            }
        }
        return this;
    }

    public StoryPrivacyBottomSheet setCount(int i) {
        this.storiesCount = i;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            for (View view : viewPagerFixed.getViewPages()) {
                if (view instanceof Page) {
                    ((Page) view).updateButton(false);
                }
            }
        }
        return this;
    }

    public StoryPrivacyBottomSheet enableSharing(boolean z) {
        this.sendAsMessageEnabled = z;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            for (View view : viewPagerFixed.getViewPages()) {
                if (view instanceof Page) {
                    ((Page) view).updateButton(false);
                }
            }
        }
        return this;
    }

    public StoryPrivacyBottomSheet isEdit(boolean z) {
        this.isEdit = z;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            for (View view : viewPagerFixed.getViewPages()) {
                if (view instanceof Page) {
                    Page page = (Page) view;
                    page.updateItems(false);
                    page.updateButton(false);
                }
            }
        }
        return this;
    }

    public StoryPrivacyBottomSheet setWarnUsers(ArrayList arrayList) {
        this.warnUsers = arrayList;
        return this;
    }

    public StoryPrivacyBottomSheet setPeer(TLRPC.InputPeer inputPeer) {
        this.selectedPeer = inputPeer;
        this.selectedAlbums.clear();
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            Page page = (Page) view;
            page.bind(page.pageType);
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            Page page2 = (Page) view2;
            page2.bind(page2.pageType);
        }
        return this;
    }

    public StoryPrivacyBottomSheet set(boolean z, boolean z2, boolean z3, int i) {
        this.allowComments = z;
        this.allowScreenshots = z2;
        this.keepOnMyPage = z3;
        this.commentsPrice = i;
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            Page page = (Page) view;
            page.bind(page.pageType);
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            Page page2 = (Page) view2;
            page2.bind(page2.pageType);
        }
        return this;
    }

    public StoryPrivacyBottomSheet setLive(boolean z) {
        this.isLive = z;
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            Page page = (Page) view;
            page.bind(page.pageType);
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            Page page2 = (Page) view2;
            page2.bind(page2.pageType);
        }
        return this;
    }

    public StoryPrivacyBottomSheet setLiveSettings(boolean z) {
        this.liveSettings = z;
        View[] viewPages = this.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof Page) {
            Page page = (Page) view;
            page.bind(page.pageType);
        }
        View view2 = viewPages[1];
        if (view2 instanceof Page) {
            Page page2 = (Page) view2;
            page2.bind(page2.pageType);
        }
        return this;
    }

    public StoryPrivacyBottomSheet setValue(StoryPrivacy storyPrivacy) {
        if (storyPrivacy != null) {
            int i = storyPrivacy.type;
            this.selectedType = i;
            if (i == 2) {
                this.excludedContacts.clear();
                this.excludedContacts.addAll(storyPrivacy.selectedUserIds);
            } else if (i == 3) {
                this.selectedContacts.clear();
                this.selectedContacts.addAll(storyPrivacy.selectedUserIds);
                this.selectedContactsByGroup.clear();
                this.selectedContactsByGroup.putAll(storyPrivacy.selectedUserIdsByGroup);
                this.selectedContactsCount = mergeUsers(this.selectedContacts, this.selectedContactsByGroup).size();
            } else if (i == 4) {
                this.excludedEveryone.clear();
                this.excludedEveryone.addAll(storyPrivacy.selectedUserIds);
                this.excludedEveryoneByGroup.clear();
                this.excludedEveryoneByGroup.putAll(storyPrivacy.selectedUserIdsByGroup);
                this.excludedEveryoneCount = mergeUsers(this.excludedEveryone, this.excludedEveryoneByGroup).size();
            }
            if (storyPrivacy.isShare()) {
                this.startedFromSendAsMessage = true;
                this.activePage = 5;
                this.messageUsers.clear();
                this.messageUsers.addAll(storyPrivacy.sendToUsers);
                this.viewPager.setPosition(1);
            }
            View[] viewPages = this.viewPager.getViewPages();
            View view = viewPages[0];
            if (view instanceof Page) {
                Page page = (Page) view;
                page.bind(page.pageType);
            }
            View view2 = viewPages[1];
            if (view2 instanceof Page) {
                Page page2 = (Page) view2;
                page2.bind(page2.pageType);
            }
        }
        return this;
    }

    static class ItemInner extends AdapterWithDiffUtils.Item {
        public TLRPC.Chat chat;
        public boolean checked;
        public Drawable drawable;
        public boolean halfChecked;
        public int id;
        public int padHeight;
        public boolean red;
        public int resId;
        public boolean sendAs;
        public int subtractHeight;
        public CharSequence text;
        public CharSequence text2;
        public int type;
        public int typeCount;
        public TLRPC.User user;

        private ItemInner(int i, boolean z) {
            super(i, z);
            this.padHeight = -1;
        }

        public static ItemInner asPad() {
            return asPad(-1);
        }

        public static ItemInner asPad(int i) {
            ItemInner itemInner = new ItemInner(-1, false);
            itemInner.subtractHeight = i;
            return itemInner;
        }

        public static ItemInner asHeader() {
            return new ItemInner(0, false);
        }

        public static ItemInner asHeader2(CharSequence charSequence, CharSequence charSequence2) {
            ItemInner itemInner = new ItemInner(4, false);
            itemInner.text = charSequence;
            itemInner.text2 = charSequence2;
            return itemInner;
        }

        public static ItemInner asHeader3(CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(11, false);
            itemInner.text = charSequence;
            return itemInner;
        }

        public static ItemInner asHeaderCell(CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(8, false);
            itemInner.text = charSequence;
            return itemInner;
        }

        public static ItemInner asSearchField() {
            return new ItemInner(1, false);
        }

        public static ItemInner asSection() {
            return new ItemInner(2, false);
        }

        public static ItemInner asUser(TLRPC.User user, boolean z, boolean z2) {
            ItemInner itemInner = new ItemInner(3, true);
            itemInner.user = user;
            itemInner.checked = z;
            itemInner.halfChecked = z2;
            return itemInner;
        }

        public static ItemInner asChat(TLRPC.Chat chat, boolean z) {
            ItemInner itemInner = new ItemInner(3, true);
            itemInner.chat = chat;
            itemInner.checked = z;
            return itemInner;
        }

        public static ItemInner asType(int i, boolean z, int i2) {
            ItemInner itemInner = new ItemInner(3, false);
            itemInner.type = i;
            itemInner.checked = z;
            itemInner.typeCount = i2;
            return itemInner;
        }

        public static ItemInner asShadow(CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(6, false);
            itemInner.text = charSequence;
            return itemInner;
        }

        public static ItemInner asCheck(CharSequence charSequence, int i, boolean z) {
            ItemInner itemInner = new ItemInner(7, false);
            itemInner.resId = i;
            itemInner.text = charSequence;
            itemInner.checked = z;
            return itemInner;
        }

        public static ItemInner asButton(int i, CharSequence charSequence, CharSequence charSequence2) {
            ItemInner itemInner = new ItemInner(9, false);
            itemInner.text = charSequence;
            itemInner.text2 = charSequence2;
            itemInner.id = i;
            return itemInner;
        }

        public static ItemInner asButton(int i, CharSequence charSequence, Drawable drawable) {
            ItemInner itemInner = new ItemInner(9, false);
            itemInner.text = charSequence;
            itemInner.drawable = drawable;
            itemInner.id = i;
            return itemInner;
        }

        public static ItemInner asSlider(int i) {
            ItemInner itemInner = new ItemInner(10, false);
            itemInner.id = i;
            return itemInner;
        }

        public static ItemInner asNoUsers() {
            return new ItemInner(5, false);
        }

        public static ItemInner asPadding(int i) {
            ItemInner itemInner = new ItemInner(-1, false);
            itemInner.padHeight = i;
            return itemInner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ItemInner itemInner = (ItemInner) obj;
                int i = this.viewType;
                if (i != itemInner.viewType) {
                    return false;
                }
                if (i == -1 && (this.subtractHeight != itemInner.subtractHeight || this.padHeight != itemInner.padHeight)) {
                    return false;
                }
                if (i == 3 && (this.user != itemInner.user || this.chat != itemInner.chat || this.type != itemInner.type || this.typeCount != itemInner.typeCount || this.checked != itemInner.checked || this.red != itemInner.red || this.sendAs != itemInner.sendAs)) {
                    return false;
                }
                if (i == 0 && this.resId != itemInner.resId) {
                    return false;
                }
                if (i == 2 && !TextUtils.equals(this.text, itemInner.text)) {
                    return false;
                }
                if (this.viewType == 8 && !TextUtils.equals(this.text, itemInner.text)) {
                    return false;
                }
                int i2 = this.viewType;
                if ((i2 != 4 && i2 != 11) || (TextUtils.equals(this.text, itemInner.text) && TextUtils.equals(this.text2, itemInner.text2))) {
                    if (this.viewType == 6 && (!TextUtils.equals(this.text, itemInner.text) || this.resId != itemInner.resId)) {
                        return false;
                    }
                    if (this.viewType == 7 && (this.resId != itemInner.resId || !TextUtils.equals(this.text, itemInner.text) || this.checked != itemInner.checked)) {
                        return false;
                    }
                    if (this.viewType != 9 || (this.id == itemInner.id && this.drawable == itemInner.drawable && TextUtils.equals(this.text, itemInner.text) && TextUtils.equals(this.text2, itemInner.text2))) {
                        return this.viewType != 10 || this.id == itemInner.id;
                    }
                    return false;
                }
            }
            return false;
        }

        public ItemInner red(boolean z) {
            this.red = z;
            return this;
        }

        public ItemInner asSendAs() {
            this.sendAs = true;
            return this;
        }
    }

    public ArrayList getContacts() {
        TLRPC.User user;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(this.currentAccount).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(this.currentAccount).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public ArrayList getCloseFriends() {
        TLRPC.User user;
        ArrayList contacts = getContacts();
        int i = 0;
        while (i < contacts.size()) {
            TLObject tLObject = (TLObject) contacts.get(i);
            if ((tLObject instanceof TLRPC.User) && ((user = (TLRPC.User) tLObject) == null || !user.close_friend)) {
                contacts.remove(i);
                i--;
            }
            i++;
        }
        return contacts;
    }

    public ArrayList getUsers(boolean z, boolean z2) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(this.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!this.loadedContacts) {
                ContactsController.getInstance(this.currentAccount).loadContacts(false, 0L);
            }
            this.loadedContacts = true;
        }
        for (int i = 0; i < allDialogs.size(); i++) {
            TLRPC.Dialog dialog = allDialogs.get(i);
            if (DialogObject.isUserDialog(dialog.id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.id));
                if (user2 != null && !user2.bot && user2.id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.id)) != null))) {
                    map.put(Long.valueOf(user2.id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z2 && DialogObject.isChatDialog(dialog.id) && (chat = messagesController.getChat(Long.valueOf(-dialog.id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                map.put(Long.valueOf(-chat.id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<Long, TLRPC.TL_contact>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Long key = it.next().getKey();
                key.getClass();
                if (!map.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    map.put(Long.valueOf(user.id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public int getParticipantsCount(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(chat.id);
        if (chatFull != null && (i = chatFull.participants_count) > 0) {
            return i;
        }
        HashMap map = this.smallChatsParticipantsCount;
        if (map != null && (num = (Integer) map.get(Long.valueOf(chat.id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public ArrayList getChats() {
        TLRPC.Chat chat;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i = 0; i < allDialogs.size(); i++) {
            TLRPC.Dialog dialog = allDialogs.get(i);
            if (messagesController.canAddToForward(dialog)) {
                if (DialogObject.isUserDialog(dialog.id)) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(dialog.id));
                    if (user != null && !user.bot && user.id != 777000 && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else if (DialogObject.isChatDialog(dialog.id) && (chat = messagesController.getChat(Long.valueOf(-dialog.id))) != null && !ChatObject.isForum(chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public static class UserCell extends FrameLayout {
        private Paint arrowPaint;
        private Path arrowPath;
        private final AvatarDrawable avatarDrawable;
        public final CheckBox2 checkBox;
        public long dialogId;
        private final Paint dividerPaint;
        private boolean drawArrow;
        private final BackupImageView imageView;
        private boolean[] isOnline;
        private boolean needCheck;
        private boolean needDivider;
        public final RadioButton radioButton;
        private final Theme.ResourcesProvider resourcesProvider;
        private boolean sendAs;
        private final SimpleTextView subtitleTextView;
        private final SimpleTextView titleTextView;

        public UserCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            this.avatarDrawable = avatarDrawable;
            this.dividerPaint = new Paint(1);
            this.sendAs = false;
            this.needCheck = true;
            this.drawArrow = true;
            this.isOnline = new boolean[1];
            this.resourcesProvider = resourcesProvider;
            avatarDrawable.setRoundRadius(AndroidUtilities.dp(40.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            addView(backupImageView);
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.titleTextView = simpleTextView;
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setTextSize(16);
            int i = Theme.key_dialogTextBlack;
            simpleTextView.setTextColor(Theme.getColor(i, resourcesProvider));
            simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            NotificationCenter.listenEmojiLoading(simpleTextView);
            addView(simpleTextView);
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.subtitleTextView = simpleTextView2;
            simpleTextView2.setTextSize(14);
            simpleTextView2.setTextColor(Theme.getColor(i, resourcesProvider));
            simpleTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
            NotificationCenter.listenEmojiLoading(simpleTextView2);
            addView(simpleTextView2);
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            int i2 = Theme.key_dialogRoundCheckBox;
            int i3 = Theme.key_checkboxDisabled;
            checkBox2.setColor(i2, i3, Theme.key_dialogRoundCheckBoxCheck);
            checkBox2.setDrawUnchecked(true);
            checkBox2.setDrawBackgroundAsArc(10);
            addView(checkBox2);
            checkBox2.setChecked(false, false);
            checkBox2.setVisibility(8);
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.setColor(Theme.getColor(i3, resourcesProvider), Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider));
            addView(radioButton);
            radioButton.setVisibility(8);
            updateLayouts();
        }

        private void updateLayouts() {
            float f;
            float f2;
            float f3;
            float f4;
            BackupImageView backupImageView = this.imageView;
            int i = (LocaleController.isRTL ? 5 : 3) | 16;
            boolean z = this.needCheck;
            backupImageView.setLayoutParams(LayoutHelper.createFrame(40, 40.0f, i, z ? 53.0f : 16.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
            SimpleTextView simpleTextView = this.titleTextView;
            boolean z2 = LocaleController.isRTL;
            int i2 = (z2 ? 5 : 3) | 16;
            if (z2) {
                f = 20.0f;
            } else {
                f = this.needCheck ? 105 : 68;
            }
            if (z2) {
                f2 = this.needCheck ? 105 : 68;
            } else {
                f2 = 20.0f;
            }
            simpleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, i2, f, 0.0f, f2, 0.0f));
            SimpleTextView simpleTextView2 = this.subtitleTextView;
            boolean z3 = LocaleController.isRTL;
            int i3 = (z3 ? 5 : 3) | 16;
            if (z3) {
                f3 = 20.0f;
            } else {
                f3 = this.needCheck ? 105 : 68;
            }
            if (z3) {
                f4 = this.needCheck ? 105 : 68;
            } else {
                f4 = 20.0f;
            }
            simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, i3, f3, 0.0f, f4, 0.0f));
            this.checkBox.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            this.radioButton.setLayoutParams(LayoutHelper.createFrame(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
        }

        public void setIsSendAs(boolean z, boolean z2) {
            this.sendAs = z;
            if (z2 != this.needCheck) {
                this.needCheck = z2;
                updateLayouts();
            }
            if (!this.needCheck) {
                this.radioButton.setVisibility(8);
                this.checkBox.setVisibility(8);
            }
            setWillNotDraw(!this.needDivider && (this.needCheck || !this.sendAs));
        }

        public void setRedCheckbox(boolean z) {
            this.checkBox.setColor(z ? Theme.key_color_red : Theme.key_dialogRoundCheckBox, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
        }

        public void setChecked(boolean z, boolean z2) {
            if (this.checkBox.getVisibility() == 0) {
                this.checkBox.setChecked(z, z2);
            }
            if (this.radioButton.getVisibility() == 0) {
                this.radioButton.setChecked(z, z2);
            }
        }

        public void setCheckboxAlpha(float f, boolean z) {
            if (!z) {
                this.checkBox.animate().cancel();
                this.checkBox.setAlpha(f);
                this.radioButton.animate().cancel();
                this.radioButton.setAlpha(f);
                return;
            }
            if (Math.abs(this.checkBox.getAlpha() - f) > 0.1d) {
                this.checkBox.animate().cancel();
                this.checkBox.animate().alpha(f).start();
            }
            if (Math.abs(this.radioButton.getAlpha() - f) > 0.1d) {
                this.radioButton.animate().cancel();
                this.radioButton.animate().alpha(f).start();
            }
        }

        public void set(Object obj) {
            if (obj instanceof TLRPC.User) {
                this.titleTextView.setTypeface(AndroidUtilities.bold());
                this.titleTextView.setTranslationX(0.0f);
                setUser((TLRPC.User) obj);
            } else if (obj instanceof TLRPC.Chat) {
                this.titleTextView.setTypeface(AndroidUtilities.bold());
                this.titleTextView.setTranslationX(0.0f);
                setChat((TLRPC.Chat) obj, 0);
            } else if (obj instanceof String) {
                this.titleTextView.setTypeface(null);
                this.titleTextView.setTranslationX((-AndroidUtilities.dp(52.0f)) * (LocaleController.isRTL ? -1 : 1));
                this.titleTextView.setText((String) obj);
            }
        }

        public void setUser(TLRPC.User user) {
            this.dialogId = user == null ? 0L : user.id;
            this.avatarDrawable.setInfo(user);
            this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            this.imageView.setForUserOrChat(user, this.avatarDrawable);
            this.titleTextView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), this.titleTextView.getPaint().getFontMetricsInt(), false));
            boolean[] zArr = this.isOnline;
            zArr[0] = false;
            if (this.sendAs) {
                setSubtitle(LocaleController.getString(R.string.VoipGroupPersonalAccount));
                this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
            } else {
                setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
                this.subtitleTextView.setTextColor(Theme.getColor(this.isOnline[0] ? Theme.key_dialogTextBlue2 : Theme.key_dialogTextGray3, this.resourcesProvider));
            }
            this.checkBox.setVisibility(this.needCheck ? 0 : 8);
            this.checkBox.setAlpha(1.0f);
            this.radioButton.setVisibility(8);
        }

        public void setChat(TLRPC.Chat chat, int i) {
            String lowerCase;
            this.dialogId = chat == null ? 0L : -chat.id;
            this.avatarDrawable.setInfo(chat);
            this.imageView.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f));
            this.imageView.setForUserOrChat(chat, this.avatarDrawable);
            this.titleTextView.setText(Emoji.replaceEmoji(chat.title, this.titleTextView.getPaint().getFontMetricsInt(), false));
            this.isOnline[0] = false;
            if (this.sendAs) {
                if (i <= 0) {
                    i = chat.participants_count;
                }
                boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (i >= 1) {
                    lowerCase = LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "Subscribers" : "Members", i, new Object[0]);
                } else {
                    lowerCase = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
                }
            } else if (!ChatObject.isChannel(chat) || chat.megagroup) {
                if (i >= 1) {
                    lowerCase = LocaleController.formatPluralStringComma("Members", i - 1);
                } else if (chat.has_geo) {
                    lowerCase = LocaleController.getString(R.string.MegaLocation);
                } else if (!ChatObject.isPublic(chat)) {
                    lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                } else {
                    lowerCase = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                }
            } else if (i >= 1) {
                lowerCase = LocaleController.formatPluralStringComma("Subscribers", i - 1);
            } else if (!ChatObject.isPublic(chat)) {
                lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
            } else {
                lowerCase = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
            }
            setSubtitle(lowerCase);
            this.subtitleTextView.setTextColor(Theme.getColor(this.isOnline[0] ? Theme.key_dialogTextBlue2 : Theme.key_dialogTextGray3, this.resourcesProvider));
            this.checkBox.setVisibility(this.needCheck ? 0 : 8);
            this.radioButton.setVisibility(8);
            setCheckboxAlpha(i > 200 ? 0.3f : 1.0f, false);
        }

        private CharSequence withArrow(CharSequence charSequence) {
            SpannableString spannableString = new SpannableString(">");
            Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(drawable, 2);
            drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
            spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
            return spannableStringBuilder;
        }

        public void setType(int i, int i2, TLRPC.User user) {
            if (i == 4) {
                this.titleTextView.setText(LocaleController.getString(R.string.StoryPrivacyOptionEveryone));
                if (i2 == 1 && user != null) {
                    setSubtitle(withArrow(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), this.subtitleTextView.getPaint().getFontMetricsInt(), false)));
                } else if (i2 > 0) {
                    setSubtitle(withArrow(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i2, new Object[0])));
                } else {
                    setSubtitle(withArrow(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
                }
                this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, this.resourcesProvider));
                this.avatarDrawable.setAvatarType(7);
                this.avatarDrawable.setColor(-15292942, -15630089);
            } else if (i == 2) {
                this.titleTextView.setText(LocaleController.getString(R.string.StoryPrivacyOptionContacts));
                if (i2 == 1 && user != null) {
                    setSubtitle(withArrow(Emoji.replaceEmoji(LocaleController.formatString(R.string.StoryPrivacyOptionExcludePerson, UserObject.getUserName(user)), this.subtitleTextView.getPaint().getFontMetricsInt(), false)));
                } else if (i2 > 0) {
                    setSubtitle(withArrow(LocaleController.formatPluralString("StoryPrivacyOptionExcludePeople", i2, new Object[0])));
                } else {
                    setSubtitle(withArrow(LocaleController.getString(R.string.StoryPrivacyOptionContactsDetail)));
                }
                this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, this.resourcesProvider));
                this.avatarDrawable.setAvatarType(4);
                this.avatarDrawable.setColor(-3905294, -6923014);
            } else if (i == 1) {
                this.titleTextView.setText(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends));
                if (i2 == 1 && user != null) {
                    setSubtitle(withArrow(Emoji.replaceEmoji(UserObject.getUserName(user), this.subtitleTextView.getPaint().getFontMetricsInt(), false)));
                } else if (i2 > 0) {
                    setSubtitle(withArrow(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i2, new Object[0])));
                } else {
                    setSubtitle(withArrow(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriendsDetail)));
                }
                this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, this.resourcesProvider));
                this.avatarDrawable.setAvatarType(15);
                this.avatarDrawable.setColor(-7808710, -13781445);
            } else if (i == 3) {
                this.titleTextView.setText(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts));
                if (i2 == 1 && user != null) {
                    setSubtitle(withArrow(Emoji.replaceEmoji(UserObject.getUserName(user), this.subtitleTextView.getPaint().getFontMetricsInt(), false)));
                } else if (i2 > 0) {
                    setSubtitle(withArrow(LocaleController.formatPluralString("StoryPrivacyOptionPeople", i2, new Object[0])));
                } else {
                    setSubtitle(withArrow(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContactsDetail)));
                }
                this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, this.resourcesProvider));
                this.avatarDrawable.setAvatarType(6);
                this.avatarDrawable.setColor(-18621, -618956);
            }
            this.checkBox.setVisibility(8);
            this.radioButton.setVisibility(this.needCheck ? 0 : 8);
            this.imageView.setImageDrawable(this.avatarDrawable);
            this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        }

        private void setSubtitle(CharSequence charSequence) {
            if (charSequence == null) {
                this.titleTextView.setTranslationY(0.0f);
                this.subtitleTextView.setVisibility(8);
            } else {
                this.titleTextView.setTranslationY(AndroidUtilities.dp(-9.0f));
                this.subtitleTextView.setTranslationY(AndroidUtilities.dp(12.0f));
                this.subtitleTextView.setText(charSequence);
                this.subtitleTextView.setVisibility(0);
            }
        }

        public void setDivider(boolean z) {
            this.needDivider = z;
            setWillNotDraw(!z && (this.needCheck || !this.sendAs));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!this.sendAs || this.needCheck) ? 56.0f : 62.0f), 1073741824));
            if (this.needCheck || !this.sendAs) {
                return;
            }
            Path path = this.arrowPath;
            if (path == null) {
                this.arrowPath = new Path();
            } else {
                path.rewind();
            }
            float fDp = LocaleController.isRTL ? AndroidUtilities.dp(31.0f) : getMeasuredWidth() - AndroidUtilities.dp(31.0f);
            float measuredHeight = getMeasuredHeight() / 2.0f;
            float f = LocaleController.isRTL ? -1.0f : 1.0f;
            this.arrowPath.moveTo(fDp, measuredHeight - AndroidUtilities.dp(6.0f));
            this.arrowPath.lineTo((f * AndroidUtilities.dp(6.0f)) + fDp, measuredHeight);
            this.arrowPath.lineTo(fDp, measuredHeight + AndroidUtilities.dp(6.0f));
            if (this.arrowPaint == null) {
                Paint paint = new Paint(1);
                this.arrowPaint = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.arrowPaint.setStrokeCap(Paint.Cap.ROUND);
            }
            this.arrowPaint.setStrokeWidth(AndroidUtilities.dpf2(1.86f));
            this.arrowPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), 0.3f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Canvas canvas2;
            Paint paint;
            super.onDraw(canvas);
            if (this.needDivider) {
                this.dividerPaint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
                if (LocaleController.isRTL) {
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(105.0f), getHeight(), this.dividerPaint);
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(AndroidUtilities.dp(105.0f), getHeight() - 1, getWidth(), getHeight(), this.dividerPaint);
                }
            } else {
                canvas2 = canvas;
            }
            Path path = this.arrowPath;
            if (path == null || (paint = this.arrowPaint) == null || this.needCheck || !this.sendAs || !this.drawArrow) {
                return;
            }
            canvas2.drawPath(path, paint);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            try {
                CheckBox2 checkBox2 = this.checkBox;
                boolean z = false;
                boolean z2 = checkBox2 != null && checkBox2.getVisibility() == 0;
                RadioButton radioButton = this.radioButton;
                if (radioButton != null && radioButton.getVisibility() == 0) {
                    z = true;
                }
                if (z2 || z) {
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(z2 ? this.checkBox.isChecked() : this.radioButton.isChecked());
                    accessibilityNodeInfo.setClassName(z2 ? "android.widget.CheckBox" : "android.widget.RadioButton");
                }
            } catch (Exception unused) {
            }
        }
    }

    private static class HeaderCell2 extends LinearLayout {
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView subtitleTextView;
        private final TextView titleTextView;

        public HeaderCell2(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            setOrientation(1);
            this.resourcesProvider = resourcesProvider;
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            addView(textView, LayoutHelper.createLinear(-1, -2, 55, 27, 16, 27, z ? 4 : 13));
            TextView textView2 = new TextView(context);
            this.subtitleTextView = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider));
            textView2.setTextSize(1, 14.0f);
            if (z) {
                addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 27, 0, 27, 13));
            }
        }

        public void setText(CharSequence charSequence, CharSequence charSequence2) {
            this.titleTextView.setText(charSequence);
            this.subtitleTextView.setText(charSequence2);
        }
    }

    static class HeaderCell extends FrameLayout {
        public BackDrawable backDrawable;
        private ImageView closeView;
        private final Paint dividerPaint;
        private Runnable onCloseClickListener;
        private final Theme.ResourcesProvider resourcesProvider;
        private TextView textView;

        public HeaderCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.dividerPaint = new Paint(1);
            this.resourcesProvider = resourcesProvider;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            this.textView.setTextSize(1, 20.0f);
            this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            TextView textView2 = this.textView;
            boolean z = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 23, z ? 16.0f : 53.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.closeView = imageView;
            BackDrawable backDrawable = new BackDrawable(false);
            this.backDrawable = backDrawable;
            imageView.setImageDrawable(backDrawable);
            this.backDrawable.setColor(-1);
            this.backDrawable.setRotatedColor(-1);
            this.backDrawable.setAnimationTime(220.0f);
            addView(this.closeView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
            this.closeView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StoryPrivacyBottomSheet.HeaderCell.m4584$r8$lambda$JIOSIue9zEYXvoXhoIwL2xh_f0(this.f$0, view);
                }
            });
        }

        public static void m4584$r8$lambda$JIOSIue9zEYXvoXhoIwL2xh_f0(HeaderCell headerCell, View view) {
            Runnable runnable = headerCell.onCloseClickListener;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            this.dividerPaint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), this.dividerPaint);
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }

        public void setCloseImageVisible(boolean z) {
            this.closeView.setVisibility(z ? 0 : 8);
            TextView textView = this.textView;
            boolean z2 = LocaleController.isRTL;
            textView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, 23, (z2 || !z) ? 22.0f : 53.0f, 0.0f, (z2 && z) ? 53.0f : 22.0f, 0.0f));
        }

        public void setOnCloseClickListener(Runnable runnable) {
            this.onCloseClickListener = runnable;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        }
    }

    public static class SearchUsersCell extends ScrollView {
        public ArrayList allSpans;
        private final LinearGradient bottomGradient;
        private final AnimatedFloat bottomGradientAlpha;
        private final Matrix bottomGradientMatrix;
        private final Paint bottomGradientPaint;
        public float containerHeight;
        private GroupCreateSpan currentDeletingSpan;
        private EditTextBoldCursor editText;
        private int fieldY;
        private int hintTextWidth;
        private boolean ignoreScrollEvent;
        private boolean ignoreTextChange;
        private Utilities.Callback onSearchTextChange;
        private int prevResultContainerHeight;
        private final Theme.ResourcesProvider resourcesProvider;
        public int resultContainerHeight;
        private boolean scroll;
        public SpansContainer spansContainer;
        private final LinearGradient topGradient;
        private final AnimatedFloat topGradientAlpha;
        private final Matrix topGradientMatrix;
        private final Paint topGradientPaint;
        private Runnable updateHeight;

        public SearchUsersCell(Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
            super(context);
            this.allSpans = new ArrayList();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.topGradientAlpha = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
            this.topGradient = linearGradient;
            Paint paint = new Paint(1);
            this.topGradientPaint = paint;
            this.topGradientMatrix = new Matrix();
            this.bottomGradientAlpha = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
            this.bottomGradient = linearGradient2;
            Paint paint2 = new Paint(1);
            this.bottomGradientPaint = paint2;
            this.bottomGradientMatrix = new Matrix();
            paint.setShader(linearGradient);
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint.setXfermode(new PorterDuffXfermode(mode));
            paint2.setShader(linearGradient2);
            paint2.setXfermode(new PorterDuffXfermode(mode));
            this.resourcesProvider = resourcesProvider;
            this.updateHeight = runnable;
            setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this, Theme.getColor(Theme.key_windowBackgroundWhite));
            SpansContainer spansContainer = new SpansContainer(context);
            this.spansContainer = spansContainer;
            addView(spansContainer, LayoutHelper.createFrame(-1, -2.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (SearchUsersCell.this.currentDeletingSpan != null) {
                        SearchUsersCell.this.currentDeletingSpan.cancelDeleteAnimation();
                        SearchUsersCell.this.currentDeletingSpan = null;
                    }
                    if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                        SearchUsersCell.this.fullScroll(130);
                        clearFocus();
                        requestFocus();
                    }
                    return super.onTouchEvent(motionEvent);
                }
            };
            this.editText = editTextBoldCursor;
            if (Build.VERSION.SDK_INT >= 25) {
                editTextBoldCursor.setRevealOnFocusHint(false);
            }
            this.editText.setTextSize(1, 16.0f);
            this.editText.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
            this.editText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            EditTextBoldCursor editTextBoldCursor2 = this.editText;
            int i = Theme.key_groupcreate_cursor;
            editTextBoldCursor2.setCursorColor(Theme.getColor(i, resourcesProvider));
            this.editText.setHandlesColor(Theme.getColor(i, resourcesProvider));
            this.editText.setCursorWidth(1.5f);
            EditTextBoldCursor editTextBoldCursor3 = this.editText;
            editTextBoldCursor3.setInputType(editTextBoldCursor3.getInputType() | 176);
            this.editText.setSingleLine(true);
            this.editText.setBackgroundDrawable(null);
            this.editText.setVerticalScrollBarEnabled(false);
            this.editText.setHorizontalScrollBarEnabled(false);
            this.editText.setTextIsSelectable(false);
            this.editText.setPadding(0, 0, 0, 0);
            this.editText.setImeOptions(268435462);
            this.editText.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.spansContainer.addView(this.editText);
            EditTextBoldCursor editTextBoldCursor4 = this.editText;
            int i2 = R.string.Search;
            editTextBoldCursor4.setHintText(LocaleController.getString(i2));
            this.hintTextWidth = (int) this.editText.getPaint().measureText(LocaleController.getString(i2));
            this.editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (SearchUsersCell.this.ignoreTextChange || SearchUsersCell.this.onSearchTextChange == null || editable == null) {
                        return;
                    }
                    SearchUsersCell.this.onSearchTextChange.run(editable.toString());
                }
            });
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            int scrollY = getScrollY();
            float f = scrollY;
            canvas.saveLayerAlpha(0.0f, f, getWidth(), getHeight() + scrollY, 255, 31);
            super.dispatchDraw(canvas);
            canvas.save();
            float f2 = this.topGradientAlpha.set(canScrollVertically(-1));
            this.topGradientMatrix.reset();
            this.topGradientMatrix.postTranslate(0.0f, f);
            this.topGradient.setLocalMatrix(this.topGradientMatrix);
            this.topGradientPaint.setAlpha((int) (f2 * 255.0f));
            canvas.drawRect(0.0f, f, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, this.topGradientPaint);
            float f3 = this.bottomGradientAlpha.set(canScrollVertically(1));
            this.bottomGradientMatrix.reset();
            this.bottomGradientMatrix.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
            this.bottomGradient.setLocalMatrix(this.bottomGradientMatrix);
            this.bottomGradientPaint.setAlpha((int) (f3 * 255.0f));
            canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), scrollY + getHeight(), this.bottomGradientPaint);
            canvas.restore();
            canvas.restore();
        }

        public void setText(CharSequence charSequence) {
            this.ignoreTextChange = true;
            this.editText.setText(charSequence);
            this.ignoreTextChange = false;
        }

        public void setOnSearchTextChange(Utilities.Callback<String> callback) {
            this.onSearchTextChange = callback;
        }

        @Override
        public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
            if (this.ignoreScrollEvent) {
                this.ignoreScrollEvent = false;
                return false;
            }
            rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
            rect.top += this.fieldY + AndroidUtilities.dp(20.0f);
            rect.bottom += this.fieldY + AndroidUtilities.dp(50.0f);
            return super.requestChildRectangleOnScreen(view, rect, z);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
        }

        public void setContainerHeight(float f) {
            this.containerHeight = f;
            SpansContainer spansContainer = this.spansContainer;
            if (spansContainer != null) {
                spansContainer.requestLayout();
            }
        }

        public Animator getContainerHeightAnimator(float f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.containerHeight, f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StoryPrivacyBottomSheet.SearchUsersCell.m4599$r8$lambda$Y8IBKbK8GCQW8v1AU4AVaHMvLQ(this.f$0, valueAnimator);
                }
            });
            return valueAnimatorOfFloat;
        }

        public static void m4599$r8$lambda$Y8IBKbK8GCQW8v1AU4AVaHMvLQ(SearchUsersCell searchUsersCell, ValueAnimator valueAnimator) {
            searchUsersCell.getClass();
            searchUsersCell.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        public void scrollToBottom() {
            this.scroll = true;
        }

        public class SpansContainer extends ViewGroup {
            private View addingSpan;
            private ArrayList animAddingSpans;
            private ArrayList animRemovingSpans;
            private boolean animationStarted;
            private ArrayList animators;
            private AnimatorSet currentAnimation;
            private final int heightDp;
            private final int padDp;
            private final int padXDp;
            private final int padYDp;
            private final ArrayList removingSpans;

            public SpansContainer(Context context) {
                super(context);
                this.animAddingSpans = new ArrayList();
                this.animRemovingSpans = new ArrayList();
                this.animators = new ArrayList();
                this.removingSpans = new ArrayList();
                this.padDp = 7;
                this.padYDp = 4;
                this.padXDp = 4;
                this.heightDp = 28;
            }

            @Override
            protected void onMeasure(int i, int i2) {
                Property property;
                Property property2;
                int iMin;
                int childCount = getChildCount();
                int size = View.MeasureSpec.getSize(i);
                int iDp = size - AndroidUtilities.dp(14.0f);
                int iDp2 = AndroidUtilities.dp(10.0f);
                int iDp3 = AndroidUtilities.dp(10.0f);
                int i3 = 0;
                int measuredWidth = 0;
                int measuredWidth2 = 0;
                while (true) {
                    property = View.TRANSLATION_Y;
                    property2 = View.TRANSLATION_X;
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i3);
                    if (childAt instanceof GroupCreateSpan) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                        boolean zContains = this.removingSpans.contains(childAt);
                        if (!zContains && childAt.getMeasuredWidth() + measuredWidth > iDp) {
                            iDp2 += childAt.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
                            measuredWidth = 0;
                        }
                        if (childAt.getMeasuredWidth() + measuredWidth2 > iDp) {
                            iDp3 += childAt.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
                            measuredWidth2 = 0;
                        }
                        int iDp4 = AndroidUtilities.dp(7.0f) + measuredWidth;
                        if (this.animationStarted) {
                            childCount = childCount;
                        } else if (zContains) {
                            childAt.setTranslationX(AndroidUtilities.dp(7.0f) + measuredWidth2);
                            childAt.setTranslationY(iDp3);
                            childCount = childCount;
                        } else if (this.removingSpans.isEmpty()) {
                            childCount = childCount;
                            childAt.setTranslationX(iDp4);
                            childAt.setTranslationY(iDp2);
                        } else {
                            float f = iDp4;
                            if (childAt.getTranslationX() != f) {
                                this.animators.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, f));
                            }
                            float f2 = iDp2;
                            if (childAt.getTranslationY() != f2) {
                                this.animators.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, f2));
                            }
                        }
                        if (!zContains) {
                            measuredWidth += childAt.getMeasuredWidth() + AndroidUtilities.dp(4.0f);
                        }
                        measuredWidth2 += childAt.getMeasuredWidth() + AndroidUtilities.dp(4.0f);
                    } else {
                        childCount = childCount;
                    }
                    i3++;
                    childCount = childCount;
                }
                if (AndroidUtilities.isTablet()) {
                    iMin = AndroidUtilities.dp(394.0f) / 3;
                } else {
                    Point point = AndroidUtilities.displaySize;
                    iMin = (Math.min(point.x, point.y) - AndroidUtilities.dp(136.0f)) / 3;
                }
                if (iDp - measuredWidth < iMin) {
                    iDp2 += AndroidUtilities.dp(36.0f);
                    measuredWidth = 0;
                }
                if (iDp - measuredWidth2 < iMin) {
                    iDp3 += AndroidUtilities.dp(36.0f);
                }
                SearchUsersCell.this.editText.measure(View.MeasureSpec.makeMeasureSpec(iDp - measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                SearchUsersCell.this.editText.setHintVisible(SearchUsersCell.this.editText.getMeasuredWidth() > SearchUsersCell.this.hintTextWidth, true);
                if (!this.animationStarted) {
                    int iDp5 = iDp3 + AndroidUtilities.dp(38.0f);
                    int iDp6 = measuredWidth + AndroidUtilities.dp(16.0f);
                    SearchUsersCell.this.fieldY = iDp2;
                    if (this.currentAnimation != null) {
                        int iDp7 = iDp2 + AndroidUtilities.dp(38.0f);
                        SearchUsersCell searchUsersCell = SearchUsersCell.this;
                        searchUsersCell.resultContainerHeight = iDp7;
                        float f3 = iDp7;
                        if (searchUsersCell.containerHeight != f3) {
                            this.animators.add(searchUsersCell.getContainerHeightAnimator(f3));
                        }
                        float f4 = iDp6;
                        if (SearchUsersCell.this.editText.getTranslationX() != f4) {
                            this.animators.add(ObjectAnimator.ofFloat(SearchUsersCell.this.editText, (Property<EditTextBoldCursor, Float>) property2, f4));
                        }
                        if (SearchUsersCell.this.editText.getTranslationY() != SearchUsersCell.this.fieldY) {
                            this.animators.add(ObjectAnimator.ofFloat(SearchUsersCell.this.editText, (Property<EditTextBoldCursor, Float>) property, SearchUsersCell.this.fieldY));
                        }
                        SearchUsersCell.this.editText.setAllowDrawCursor(false);
                        this.currentAnimation.playTogether(this.animators);
                        this.currentAnimation.setDuration(180L);
                        this.currentAnimation.setInterpolator(new LinearInterpolator());
                        this.currentAnimation.start();
                        this.animationStarted = true;
                        if (SearchUsersCell.this.updateHeight != null) {
                            SearchUsersCell.this.updateHeight.run();
                        }
                    } else {
                        SearchUsersCell searchUsersCell2 = SearchUsersCell.this;
                        searchUsersCell2.resultContainerHeight = iDp5;
                        searchUsersCell2.containerHeight = iDp5;
                        searchUsersCell2.editText.setTranslationX(iDp6);
                        SearchUsersCell.this.editText.setTranslationY(SearchUsersCell.this.fieldY);
                        if (SearchUsersCell.this.updateHeight != null) {
                            SearchUsersCell.this.updateHeight.run();
                        }
                        if (SearchUsersCell.this.scroll) {
                            post(new Runnable() {
                                @Override
                                public final void run() {
                                    StoryPrivacyBottomSheet.SearchUsersCell.this.fullScroll(130);
                                }
                            });
                            SearchUsersCell.this.scroll = false;
                        }
                    }
                    SearchUsersCell searchUsersCell3 = SearchUsersCell.this;
                    searchUsersCell3.prevResultContainerHeight = searchUsersCell3.resultContainerHeight;
                } else if (this.currentAnimation != null) {
                    if (!SearchUsersCell.this.ignoreScrollEvent && this.removingSpans.isEmpty()) {
                        SearchUsersCell.this.editText.bringPointIntoView(SearchUsersCell.this.editText.getSelectionStart());
                    }
                    if (SearchUsersCell.this.scroll) {
                        SearchUsersCell.this.fullScroll(130);
                        SearchUsersCell.this.scroll = false;
                    }
                }
                setMeasuredDimension(size, (int) SearchUsersCell.this.containerHeight);
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                }
            }

            public void removeSpan(final GroupCreateSpan groupCreateSpan) {
                SearchUsersCell.this.ignoreScrollEvent = true;
                SearchUsersCell.this.allSpans.remove(groupCreateSpan);
                groupCreateSpan.setOnClickListener(null);
                setupEndValues();
                this.animationStarted = false;
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentAnimation = animatorSet;
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SpansContainer.this.removeView(groupCreateSpan);
                        SpansContainer.this.removingSpans.clear();
                        SpansContainer.this.currentAnimation = null;
                        SpansContainer.this.animationStarted = false;
                        SearchUsersCell.this.editText.setAllowDrawCursor(true);
                        if (SearchUsersCell.this.updateHeight != null) {
                            SearchUsersCell.this.updateHeight.run();
                        }
                        if (SearchUsersCell.this.scroll) {
                            SearchUsersCell.this.fullScroll(130);
                            SearchUsersCell.this.scroll = false;
                        }
                    }
                });
                this.removingSpans.clear();
                this.removingSpans.add(groupCreateSpan);
                this.animAddingSpans.clear();
                this.animRemovingSpans.clear();
                this.animAddingSpans.add(groupCreateSpan);
                this.animators.clear();
                this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
                this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
                this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
                requestLayout();
            }

            public void updateSpans(final ArrayList arrayList, ArrayList arrayList2, boolean z) {
                Property property;
                Property property2;
                Property property3;
                SearchUsersCell.this.ignoreScrollEvent = true;
                SearchUsersCell.this.allSpans.removeAll(arrayList);
                SearchUsersCell.this.allSpans.addAll(arrayList2);
                this.removingSpans.clear();
                this.removingSpans.addAll(arrayList);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((GroupCreateSpan) arrayList.get(i)).setOnClickListener(null);
                }
                setupEndValues();
                if (z) {
                    this.animationStarted = false;
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.currentAnimation = animatorSet;
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                SpansContainer.this.removeView((View) arrayList.get(i2));
                            }
                            SpansContainer.this.addingSpan = null;
                            SpansContainer.this.removingSpans.clear();
                            SpansContainer.this.currentAnimation = null;
                            SpansContainer.this.animationStarted = false;
                            SearchUsersCell.this.editText.setAllowDrawCursor(true);
                            if (SearchUsersCell.this.updateHeight != null) {
                                SearchUsersCell.this.updateHeight.run();
                            }
                            if (SearchUsersCell.this.scroll) {
                                SearchUsersCell.this.fullScroll(130);
                                SearchUsersCell.this.scroll = false;
                            }
                        }
                    });
                    this.animators.clear();
                    this.animAddingSpans.clear();
                    this.animRemovingSpans.clear();
                    int i2 = 0;
                    while (true) {
                        int size = arrayList.size();
                        property = View.ALPHA;
                        property2 = View.SCALE_Y;
                        property3 = View.SCALE_X;
                        if (i2 >= size) {
                            break;
                        }
                        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList.get(i2);
                        this.animRemovingSpans.add(groupCreateSpan);
                        this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) property3, 1.0f, 0.01f));
                        this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) property2, 1.0f, 0.01f));
                        this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) property, 1.0f, 0.0f));
                        i2++;
                    }
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        GroupCreateSpan groupCreateSpan2 = (GroupCreateSpan) arrayList2.get(i3);
                        this.animAddingSpans.add(groupCreateSpan2);
                        this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan2, (Property<GroupCreateSpan, Float>) property3, 0.01f, 1.0f));
                        this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan2, (Property<GroupCreateSpan, Float>) property2, 0.01f, 1.0f));
                        this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan2, (Property<GroupCreateSpan, Float>) property, 0.0f, 1.0f));
                    }
                } else {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        removeView((View) arrayList.get(i4));
                    }
                    this.addingSpan = null;
                    this.removingSpans.clear();
                    this.currentAnimation = null;
                    this.animationStarted = false;
                    SearchUsersCell.this.editText.setAllowDrawCursor(true);
                }
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    addView((View) arrayList2.get(i5));
                }
                requestLayout();
            }

            public void removeAllSpans(boolean z) {
                SearchUsersCell.this.ignoreScrollEvent = true;
                final ArrayList arrayList = new ArrayList(SearchUsersCell.this.allSpans);
                this.removingSpans.clear();
                this.removingSpans.addAll(SearchUsersCell.this.allSpans);
                SearchUsersCell.this.allSpans.clear();
                for (int i = 0; i < arrayList.size(); i++) {
                    ((GroupCreateSpan) arrayList.get(i)).setOnClickListener(null);
                }
                setupEndValues();
                if (z) {
                    this.animationStarted = false;
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.currentAnimation = animatorSet;
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                SpansContainer.this.removeView((View) arrayList.get(i2));
                            }
                            SpansContainer.this.removingSpans.clear();
                            SpansContainer.this.currentAnimation = null;
                            SpansContainer.this.animationStarted = false;
                            SearchUsersCell.this.editText.setAllowDrawCursor(true);
                            if (SearchUsersCell.this.updateHeight != null) {
                                SearchUsersCell.this.updateHeight.run();
                            }
                            if (SearchUsersCell.this.scroll) {
                                SearchUsersCell.this.fullScroll(130);
                                SearchUsersCell.this.scroll = false;
                            }
                        }
                    });
                    this.animators.clear();
                    this.animAddingSpans.clear();
                    this.animRemovingSpans.clear();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList.get(i2);
                        this.animAddingSpans.add(groupCreateSpan);
                        this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.01f));
                        this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.01f));
                        this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
                    }
                } else {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        removeView((View) arrayList.get(i3));
                    }
                    this.removingSpans.clear();
                    this.currentAnimation = null;
                    this.animationStarted = false;
                    SearchUsersCell.this.editText.setAllowDrawCursor(true);
                }
                requestLayout();
            }

            private void setupEndValues() {
                AnimatorSet animatorSet = this.currentAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                for (int i = 0; i < this.animAddingSpans.size(); i++) {
                    ((View) this.animAddingSpans.get(i)).setScaleX(1.0f);
                    ((View) this.animAddingSpans.get(i)).setScaleY(1.0f);
                    ((View) this.animAddingSpans.get(i)).setAlpha(1.0f);
                }
                for (int i2 = 0; i2 < this.animRemovingSpans.size(); i2++) {
                    ((View) this.animRemovingSpans.get(i2)).setScaleX(0.0f);
                    ((View) this.animRemovingSpans.get(i2)).setScaleY(0.0f);
                    ((View) this.animRemovingSpans.get(i2)).setAlpha(0.0f);
                }
                this.animAddingSpans.clear();
                this.animRemovingSpans.clear();
            }
        }
    }

    public static class StoryPrivacy {
        public final ArrayList rules;
        public final ArrayList selectedInputUsers;
        public final ArrayList selectedUserIds;
        public final HashMap selectedUserIdsByGroup;
        public final ArrayList sendToUsers;
        public final int type;

        public StoryPrivacy(int i, ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            this.rules = arrayList2;
            this.selectedUserIds = new ArrayList();
            this.selectedUserIdsByGroup = new HashMap();
            this.selectedInputUsers = new ArrayList();
            this.sendToUsers = new ArrayList();
            int i2 = 0;
            if (containsRule(arrayList, TLRPC.TL_privacyValueAllowAll.class) != null) {
                this.type = 4;
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) containsRule(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
                if (tL_privacyValueDisallowUsers != null) {
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    MessagesController messagesController = MessagesController.getInstance(i);
                    while (i2 < tL_privacyValueDisallowUsers.users.size()) {
                        Long l = tL_privacyValueDisallowUsers.users.get(i2);
                        TLRPC.InputUser inputUser = messagesController.getInputUser(l.longValue());
                        if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                            this.selectedUserIds.add(l);
                            this.selectedInputUsers.add(inputUser);
                        }
                        i2++;
                    }
                    this.rules.add(tL_inputPrivacyValueDisallowUsers);
                    return;
                }
                return;
            }
            if (containsRule(arrayList, TLRPC.TL_privacyValueAllowCloseFriends.class) != null) {
                this.type = 1;
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                return;
            }
            TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) containsRule(arrayList, TLRPC.TL_privacyValueAllowUsers.class);
            if (tL_privacyValueAllowUsers != null) {
                this.type = 3;
                TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                MessagesController messagesController2 = MessagesController.getInstance(i);
                while (i2 < tL_privacyValueAllowUsers.users.size()) {
                    Long l2 = tL_privacyValueAllowUsers.users.get(i2);
                    TLRPC.InputUser inputUser2 = messagesController2.getInputUser(l2.longValue());
                    if (inputUser2 != null && !(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                        this.selectedUserIds.add(l2);
                        this.selectedInputUsers.add(inputUser2);
                    }
                    i2++;
                }
                this.rules.add(tL_inputPrivacyValueAllowUsers);
                return;
            }
            if (containsRule(arrayList, TLRPC.TL_privacyValueAllowContacts.class) != null) {
                this.type = 2;
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers2 = (TLRPC.TL_privacyValueDisallowUsers) containsRule(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
                if (tL_privacyValueDisallowUsers2 != null) {
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    MessagesController messagesController3 = MessagesController.getInstance(i);
                    while (i2 < tL_privacyValueDisallowUsers2.users.size()) {
                        Long l3 = tL_privacyValueDisallowUsers2.users.get(i2);
                        TLRPC.InputUser inputUser3 = messagesController3.getInputUser(l3.longValue());
                        if (!(inputUser3 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers2.users.add(inputUser3);
                            this.selectedUserIds.add(l3);
                            this.selectedInputUsers.add(inputUser3);
                        }
                        i2++;
                    }
                    this.rules.add(tL_inputPrivacyValueDisallowUsers2);
                    return;
                }
                return;
            }
            this.type = 4;
        }

        private Object containsRule(ArrayList arrayList, Class cls) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i);
                if (cls.isInstance(privacyRule)) {
                    return privacyRule;
                }
            }
            return null;
        }

        public StoryPrivacy() {
            ArrayList arrayList = new ArrayList();
            this.rules = arrayList;
            this.selectedUserIds = new ArrayList();
            this.selectedUserIdsByGroup = new HashMap();
            this.selectedInputUsers = new ArrayList();
            this.sendToUsers = new ArrayList();
            this.type = 4;
            arrayList.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        }

        public StoryPrivacy(int i, int i2, ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            this.rules = arrayList2;
            this.selectedUserIds = new ArrayList();
            this.selectedUserIdsByGroup = new HashMap();
            this.selectedInputUsers = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            this.sendToUsers = arrayList3;
            this.type = i;
            int i3 = 0;
            if (i == 4) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                if (i2 < 0 || arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                while (i3 < arrayList.size()) {
                    Long l = (Long) arrayList.get(i3);
                    long jLongValue = l.longValue();
                    this.selectedUserIds.add(l);
                    TLRPC.InputUser inputUser = MessagesController.getInstance(i2).getInputUser(jLongValue);
                    if (inputUser != null && !(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        this.selectedInputUsers.add(inputUser);
                    }
                    i3++;
                }
                this.rules.add(tL_inputPrivacyValueDisallowUsers);
                return;
            }
            if (i == 1) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                return;
            }
            if (i == 2) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                if (i2 < 0 || arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                while (i3 < arrayList.size()) {
                    Long l2 = (Long) arrayList.get(i3);
                    long jLongValue2 = l2.longValue();
                    this.selectedUserIds.add(l2);
                    TLRPC.InputUser inputUser2 = MessagesController.getInstance(i2).getInputUser(jLongValue2);
                    if (inputUser2 != null && !(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                        this.selectedInputUsers.add(inputUser2);
                    }
                    i3++;
                }
                this.rules.add(tL_inputPrivacyValueDisallowUsers2);
                return;
            }
            if (i != 3) {
                if (i != 5 || arrayList == null) {
                    return;
                }
                arrayList3.addAll(arrayList);
                return;
            }
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (i2 >= 0 && arrayList != null && !arrayList.isEmpty()) {
                while (i3 < arrayList.size()) {
                    Long l3 = (Long) arrayList.get(i3);
                    long jLongValue3 = l3.longValue();
                    this.selectedUserIds.add(l3);
                    TLRPC.InputUser inputUser3 = MessagesController.getInstance(i2).getInputUser(jLongValue3);
                    if (inputUser3 != null && !(inputUser3 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser3);
                        this.selectedInputUsers.add(inputUser3);
                    }
                    i3++;
                }
            }
            this.rules.add(tL_inputPrivacyValueAllowUsers);
        }

        public StoryPrivacy(int i, ArrayList arrayList, int i2) {
            ArrayList arrayList2 = new ArrayList();
            this.rules = arrayList2;
            this.selectedUserIds = new ArrayList();
            this.selectedUserIdsByGroup = new HashMap();
            this.selectedInputUsers = new ArrayList();
            this.sendToUsers = new ArrayList();
            this.type = i;
            int i3 = 0;
            if (i == 4) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                if (arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                while (i3 < arrayList.size()) {
                    TLRPC.InputUser inputUser = (TLRPC.InputUser) arrayList.get(i3);
                    if (inputUser != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        this.selectedUserIds.add(Long.valueOf(inputUser.user_id));
                        this.selectedInputUsers.add(inputUser);
                    }
                    i3++;
                }
                this.rules.add(tL_inputPrivacyValueDisallowUsers);
                return;
            }
            if (i == 1) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                return;
            }
            if (i == 2) {
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                if (arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                while (i3 < arrayList.size()) {
                    TLRPC.InputUser inputUser2 = (TLRPC.InputUser) arrayList.get(i3);
                    if (inputUser2 != null) {
                        tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                        this.selectedUserIds.add(Long.valueOf(inputUser2.user_id));
                        this.selectedInputUsers.add(inputUser2);
                    }
                    i3++;
                }
                this.rules.add(tL_inputPrivacyValueDisallowUsers2);
                return;
            }
            if (i != 3) {
                if (i != 5 || arrayList == null) {
                    return;
                }
                while (i3 < arrayList.size()) {
                    TLRPC.InputUser inputUser3 = (TLRPC.InputUser) arrayList.get(i3);
                    if (inputUser3 != null) {
                        this.sendToUsers.add(Long.valueOf(inputUser3.user_id));
                    }
                    i3++;
                }
                return;
            }
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (arrayList != null && !arrayList.isEmpty()) {
                while (i3 < arrayList.size()) {
                    TLRPC.InputUser inputUser4 = (TLRPC.InputUser) arrayList.get(i3);
                    if (inputUser4 != null) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser4);
                        this.selectedUserIds.add(Long.valueOf(inputUser4.user_id));
                        this.selectedInputUsers.add(inputUser4);
                    }
                    i3++;
                }
            }
            this.rules.add(tL_inputPrivacyValueAllowUsers);
        }

        public boolean isShare() {
            return this.type == 5;
        }

        public boolean isNone() {
            return this.sendToUsers.isEmpty() && this.rules.isEmpty();
        }

        public boolean isCloseFriends() {
            return this.type == 1;
        }

        public String toString() {
            TLRPC.InputPrivacyRule inputPrivacyRule;
            int size;
            if (!this.sendToUsers.isEmpty()) {
                return LocaleController.formatPluralString("StoryPrivacyRecipients", this.sendToUsers.size(), new Object[0]);
            }
            if (this.rules.isEmpty()) {
                return LocaleController.getString(R.string.StoryPrivacyNone);
            }
            TLRPC.InputPrivacyRule inputPrivacyRule2 = (TLRPC.InputPrivacyRule) this.rules.get(0);
            int i = this.type;
            if (i == 4) {
                inputPrivacyRule = this.rules.size() >= 2 ? (TLRPC.InputPrivacyRule) this.rules.get(1) : null;
                if ((inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) && (size = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule).users.size()) > 0) {
                    return LocaleController.formatPluralString("StoryPrivacyEveryoneExclude", size, new Object[0]);
                }
                return LocaleController.getString(R.string.StoryPrivacyEveryone);
            }
            if (i == 1) {
                return LocaleController.getString(R.string.StoryPrivacyCloseFriends);
            }
            if (i == 3 && (inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
                return LocaleController.formatPluralString("StoryPrivacyContacts", ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule2).users.size(), new Object[0]);
            }
            if (i == 2) {
                inputPrivacyRule = this.rules.size() >= 2 ? (TLRPC.InputPrivacyRule) this.rules.get(1) : null;
                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                    int size2 = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule).users.size();
                    if (size2 > 0) {
                        return LocaleController.formatPluralString("StoryPrivacyContactsExclude", size2, new Object[0]);
                    }
                    return LocaleController.getString(R.string.StoryPrivacyAllContacts);
                }
                return LocaleController.getString(R.string.StoryPrivacyAllContacts);
            }
            if (i == 0) {
                if (inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                    int size3 = ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule2).users.size();
                    if (size3 <= 0) {
                        return LocaleController.getString(R.string.StoryPrivacyNone);
                    }
                    return LocaleController.formatPluralString("StoryPrivacyContacts", size3, new Object[0]);
                }
                return LocaleController.getString(R.string.StoryPrivacyNone);
            }
            return LocaleController.getString(R.string.StoryPrivacyNone);
        }

        public ArrayList toValue() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.rules.size(); i++) {
                TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) this.rules.get(i);
                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                    arrayList.add(new TLRPC.TL_privacyValueAllowAll());
                } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                    arrayList.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                    arrayList.add(new TLRPC.TL_privacyValueAllowContacts());
                } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                    for (int i2 = 0; i2 < tL_inputPrivacyValueDisallowUsers.users.size(); i2++) {
                        tL_privacyValueDisallowUsers.users.add(Long.valueOf(tL_inputPrivacyValueDisallowUsers.users.get(i2).user_id));
                    }
                    arrayList.add(tL_privacyValueDisallowUsers);
                } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                    for (int i3 = 0; i3 < tL_inputPrivacyValueAllowUsers.users.size(); i3++) {
                        tL_privacyValueAllowUsers.users.add(Long.valueOf(tL_inputPrivacyValueAllowUsers.users.get(i3).user_id));
                    }
                    arrayList.add(tL_privacyValueAllowUsers);
                }
            }
            return arrayList;
        }

        public static ArrayList toInput(int i, ArrayList arrayList) {
            MessagesController messagesController = MessagesController.getInstance(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i2);
                if (privacyRule != null) {
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                        arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowCloseFriends) {
                        arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                        arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) privacyRule;
                        TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                        for (int i3 = 0; i3 < tL_privacyValueDisallowUsers.users.size(); i3++) {
                            TLRPC.InputUser inputUser = messagesController.getInputUser(tL_privacyValueDisallowUsers.users.get(i3).longValue());
                            if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                                tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                            }
                        }
                        arrayList2.add(tL_inputPrivacyValueDisallowUsers);
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        for (int i4 = 0; i4 < tL_privacyValueAllowUsers.users.size(); i4++) {
                            TLRPC.InputUser inputUser2 = messagesController.getInputUser(tL_privacyValueAllowUsers.users.get(i4).longValue());
                            if (!(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                                tL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                            }
                        }
                        arrayList2.add(tL_inputPrivacyValueAllowUsers);
                    }
                }
            }
            return arrayList2;
        }

        public static ArrayList toOutput(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList.get(i);
                if (inputPrivacyRule != null) {
                    if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                        arrayList2.add(new TLRPC.TL_privacyValueAllowAll());
                    } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                        arrayList2.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                    } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                        arrayList2.add(new TLRPC.TL_privacyValueAllowContacts());
                    } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                        TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                        TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                        for (int i2 = 0; i2 < tL_inputPrivacyValueDisallowUsers.users.size(); i2++) {
                            tL_privacyValueDisallowUsers.users.add(Long.valueOf(tL_inputPrivacyValueDisallowUsers.users.get(i2).user_id));
                        }
                        arrayList2.add(tL_privacyValueDisallowUsers);
                    } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                        TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                        for (int i3 = 0; i3 < tL_inputPrivacyValueAllowUsers.users.size(); i3++) {
                            tL_privacyValueAllowUsers.users.add(Long.valueOf(tL_inputPrivacyValueAllowUsers.users.get(i3).user_id));
                        }
                        arrayList2.add(tL_privacyValueAllowUsers);
                    }
                }
            }
            return arrayList2;
        }

        public boolean containsUser(TLRPC.User user) {
            if (user == null) {
                return false;
            }
            int i = this.type;
            if (i == 4) {
                return !this.selectedUserIds.contains(Long.valueOf(user.id));
            }
            if (i == 2) {
                return !this.selectedUserIds.contains(Long.valueOf(user.id)) && user.contact;
            }
            if (i == 1) {
                return user.close_friend;
            }
            if (i == 3) {
                if (this.selectedUserIds.contains(Long.valueOf(user.id))) {
                    return true;
                }
                Iterator it = this.selectedUserIdsByGroup.values().iterator();
                while (it.hasNext()) {
                    if (((ArrayList) it.next()).contains(Long.valueOf(user.id))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed == null) {
            return;
        }
        int i3 = 0;
        if (i == NotificationCenter.contactsDidLoad) {
            View[] viewPages = viewPagerFixed.getViewPages();
            View view = viewPages[0];
            if (view instanceof Page) {
                ((Page) view).updateItems(true);
            }
            View view2 = viewPages[1];
            if (view2 instanceof Page) {
                ((Page) view2).updateItems(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.storiesBlocklistUpdate) {
            View[] viewPages2 = viewPagerFixed.getViewPages();
            while (i3 < viewPages2.length) {
                View view3 = viewPages2[i3];
                if (view3 instanceof Page) {
                    Page page = (Page) view3;
                    int i4 = page.pageType;
                    if (i4 == 6) {
                        page.applyBlocklist(true);
                    } else if (i4 == 0) {
                        page.updateItems(true);
                    }
                }
                i3++;
            }
            return;
        }
        if (i == NotificationCenter.storiesSendAsUpdate) {
            View[] viewPages3 = viewPagerFixed.getViewPages();
            while (i3 < viewPages3.length) {
                View view4 = viewPages3[i3];
                if (view4 instanceof Page) {
                    Page page2 = (Page) view4;
                    if (page2.pageType == 0) {
                        page2.updateItems(true);
                    }
                }
                i3++;
            }
        }
    }

    private void pullSaved() {
        String string = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_contacts", null);
        if (string != null) {
            String[] strArrSplit = string.split(",");
            this.selectedContacts.clear();
            for (String str : strArrSplit) {
                try {
                    this.selectedContacts.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        String string2 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] strArrSplit2 = string2.split(";");
            this.selectedContactsByGroup.clear();
            for (String str2 : strArrSplit2) {
                String[] strArrSplit3 = str2.split(",");
                if (strArrSplit3.length > 0) {
                    try {
                        long j = Long.parseLong(strArrSplit3[0]);
                        ArrayList arrayList = new ArrayList();
                        for (int i = 1; i < strArrSplit3.length; i++) {
                            arrayList.add(Long.valueOf(Long.parseLong(strArrSplit3[i])));
                        }
                        this.selectedContactsByGroup.put(Long.valueOf(j), arrayList);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        String string3 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] strArrSplit4 = string3.split(",");
            this.excludedEveryone.clear();
            for (String str3 : strArrSplit4) {
                try {
                    this.excludedEveryone.add(Long.valueOf(Long.parseLong(str3)));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] strArrSplit5 = string4.split(";");
            this.excludedEveryoneByGroup.clear();
            for (String str4 : strArrSplit5) {
                String[] strArrSplit6 = str4.split(",");
                if (strArrSplit6.length > 0) {
                    try {
                        long j2 = Long.parseLong(strArrSplit6[0]);
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 1; i2 < strArrSplit6.length; i2++) {
                            arrayList2.add(Long.valueOf(Long.parseLong(strArrSplit6[i2])));
                        }
                        this.excludedEveryoneByGroup.put(Long.valueOf(j2), arrayList2);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] strArrSplit7 = string5.split(",");
            this.excludedContacts.clear();
            for (String str5 : strArrSplit7) {
                try {
                    this.excludedContacts.add(Long.valueOf(Long.parseLong(str5)));
                } catch (Exception unused5) {
                }
            }
        }
        this.selectedContactsCount = mergeUsers(this.selectedContacts, this.selectedContactsByGroup).size();
        this.excludedEveryoneCount = mergeUsers(this.excludedEveryone, this.excludedEveryoneByGroup).size();
        this.allowScreenshots = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", false);
        this.keepOnMyPage = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", true);
    }

    private void save() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.selectedContactsByGroup.entrySet()) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : this.excludedEveryoneByGroup.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry2.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("story_prv_everyoneexcept", TextUtils.join(",", this.excludedEveryone)).putString("story_prv_grpeveryoneexcept", sb2.toString()).putString("story_prv_contacts", TextUtils.join(",", this.selectedContacts)).putString("story_prv_grpcontacts", sb.toString()).putString("story_prv_excluded", TextUtils.join(",", this.excludedContacts)).putBoolean("story_noforwards", !this.allowScreenshots).putBoolean("story_keep", this.keepOnMyPage).apply();
    }

    public StoryPrivacyBottomSheet setCanChangePeer(boolean z) {
        this.canChangePeer = z;
        return this;
    }

    public StoryPrivacyBottomSheet setCover(Bitmap bitmap, Runnable runnable) {
        this.coverDrawable = bitmap == null ? null : new BitmapDrawable(bitmap);
        this.whenCoverClicked = runnable;
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            for (View view : viewPagerFixed.getViewPages()) {
                if (view instanceof Page) {
                    Page page = (Page) view;
                    page.updateItems(false);
                    page.updateButton(false);
                }
            }
        }
        return this;
    }

    public StoryPrivacyBottomSheet setCover(Bitmap bitmap) {
        this.coverDrawable = bitmap == null ? null : new BitmapDrawable(bitmap);
        ViewPagerFixed viewPagerFixed = this.viewPager;
        if (viewPagerFixed != null) {
            for (View view : viewPagerFixed.getViewPages()) {
                if (view instanceof Page) {
                    Page page = (Page) view;
                    page.updateItems(false);
                    page.updateButton(false);
                }
            }
        }
        return this;
    }

    public static class ChoosePeerSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
        private final Adapter adapter;
        private final int currentAccount;
        private final TextView headerView;
        private final boolean isLive;
        private final RecyclerListView listView;
        private final Utilities.Callback onPeerSelected;
        private List peers;
        private final TLRPC.InputPeer selectedPeer;

        public ChoosePeerSheet(Context context, final int i, boolean z, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final Theme.ResourcesProvider resourcesProvider) {
            super(context, false, resourcesProvider);
            fixNavigationBar();
            MessagesController.getInstance(i).getStoriesController().loadSendAs();
            this.isLive = z;
            this.currentAccount = i;
            this.peers = MessagesController.getInstance(i).getStoriesController().sendAs;
            this.selectedPeer = inputPeer;
            this.onPeerSelected = callback;
            this.containerView = new FrameLayout(context) {
                private final Paint backgroundPaint = new Paint(1);
                private final AnimatedFloat statusBarT = new AnimatedFloat(this, 0, 350, CubicBezierInterpolator.EASE_OUT_QUINT);

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    this.backgroundPaint.setColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
                    float fMax = Math.max(0.0f, ChoosePeerSheet.this.top());
                    float fLerp = AndroidUtilities.lerp(fMax, 0.0f, this.statusBarT.set(fMax < ((float) AndroidUtilities.statusBarHeight)));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(((BottomSheet) ChoosePeerSheet.this).backgroundPaddingLeft, fLerp, getWidth() - ((BottomSheet) ChoosePeerSheet.this).backgroundPaddingLeft, getHeight() + AndroidUtilities.dp(14.0f));
                    float fDp = AndroidUtilities.dp(14.0f) * (1.0f - this.statusBarT.get());
                    canvas.drawRoundRect(rectF, fDp, fDp, this.backgroundPaint);
                    ChoosePeerSheet.this.headerView.setTranslationY(Math.max(AndroidUtilities.statusBarHeight + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f) + fLerp));
                    canvas.save();
                    canvas.clipRect(((BottomSheet) ChoosePeerSheet.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight + AndroidUtilities.dp(14.0f), getWidth() - ((BottomSheet) ChoosePeerSheet.this).backgroundPaddingLeft, getHeight());
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }

                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getY() < ChoosePeerSheet.this.top()) {
                        ChoosePeerSheet.this.dismiss();
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            };
            RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider);
            this.listView = recyclerListView;
            int i2 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i2, 0, i2, 0);
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            recyclerListView.setAdapter(adapter);
            recyclerListView.setLayoutManager(new LinearLayoutManager(context));
            this.containerView.addView(recyclerListView, LayoutHelper.createFrame(-1, -1, 119));
            recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i3) {
                    StoryPrivacyBottomSheet.ChoosePeerSheet.$r8$lambda$VuXTism8vLvEHINXQhlVu9o8BAM(this.f$0, callback, resourcesProvider, i, view, i3);
                }
            });
            recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    ((BottomSheet) ChoosePeerSheet.this).containerView.invalidate();
                }
            });
            TextView textView = new TextView(getContext());
            this.headerView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            textView.setTextSize(1, 20.0f);
            textView.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(22.0f), AndroidUtilities.dp(2.0f), this.backgroundPaddingLeft + AndroidUtilities.dp(22.0f), AndroidUtilities.dp(14.0f));
            textView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(z ? R.string.StoryPrivacyPublishLiveAs : R.string.StoryPrivacyPublishAs));
            this.containerView.addView(textView, LayoutHelper.createFrame(-1, -2.0f));
        }

        public static void $r8$lambda$VuXTism8vLvEHINXQhlVu9o8BAM(ChoosePeerSheet choosePeerSheet, final Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider, int i, View view, int i2) {
            if (i2 <= 1) {
                choosePeerSheet.getClass();
                return;
            }
            final TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) choosePeerSheet.peers.get(i2 - 2);
            if (inputPeer.channel_id == 0 && inputPeer.chat_id == 0) {
                callback.run(inputPeer);
                choosePeerSheet.dismiss();
            } else {
                final AlertDialog alertDialog = new AlertDialog(choosePeerSheet.getContext(), 3, resourcesProvider);
                alertDialog.showDelayed(200L);
                MessagesController.getInstance(i).getStoriesController().canSendStoryFor(DialogObject.getPeerDialogId(inputPeer), new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        StoryPrivacyBottomSheet.ChoosePeerSheet.m4583$r8$lambda$ICflmlKPAU9KoQoEI7u_xSwVWI(alertDialog, callback, inputPeer, (Boolean) obj);
                    }
                }, true, resourcesProvider);
                choosePeerSheet.dismiss();
            }
        }

        public static void m4583$r8$lambda$ICflmlKPAU9KoQoEI7u_xSwVWI(AlertDialog alertDialog, Utilities.Callback callback, TLRPC.InputPeer inputPeer, Boolean bool) {
            alertDialog.dismiss();
            if (!bool.booleanValue() || callback == null) {
                return;
            }
            callback.run(inputPeer);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.storiesSendAsUpdate) {
                this.peers = MessagesController.getInstance(this.currentAccount).getStoriesController().sendAs;
                this.adapter.notifyDataSetChanged();
            }
        }

        public float top() {
            int childAdapterPosition;
            float measuredHeight = this.containerView.getMeasuredHeight();
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt != null && (childAdapterPosition = this.listView.getChildAdapterPosition(childAt)) != -1 && childAdapterPosition > 0) {
                    measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
            }
            return measuredHeight;
        }

        @Override
        protected boolean canDismissWithSwipe() {
            return top() > ((float) ((int) (((float) AndroidUtilities.displaySize.y) * 0.5f)));
        }

        private class Adapter extends RecyclerListView.SelectionAdapter {
            @Override
            public int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                return i == 1 ? 1 : 2;
            }

            private Adapter() {
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 2;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View view;
                int iDp;
                if (i == 0 || i == 1) {
                    view = new View(ChoosePeerSheet.this.getContext());
                    if (i == 0) {
                        iDp = (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f);
                    } else {
                        iDp = AndroidUtilities.dp(54.0f);
                    }
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, iDp));
                } else {
                    view = new UserCell(ChoosePeerSheet.this.getContext(), ((BottomSheet) ChoosePeerSheet.this).resourcesProvider);
                }
                return new RecyclerListView.Holder(view);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder.getItemViewType() == 2) {
                    UserCell userCell = (UserCell) viewHolder.itemView;
                    userCell.setIsSendAs(true, true);
                    TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) ChoosePeerSheet.this.peers.get(i - 2);
                    if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                        userCell.setUser(UserConfig.getInstance(ChoosePeerSheet.this.currentAccount).getCurrentUser());
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                        userCell.setUser(MessagesController.getInstance(ChoosePeerSheet.this.currentAccount).getUser(Long.valueOf(inputPeer.user_id)));
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                        userCell.setChat(MessagesController.getInstance(ChoosePeerSheet.this.currentAccount).getChat(Long.valueOf(inputPeer.chat_id)), 0);
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                        userCell.setChat(MessagesController.getInstance(ChoosePeerSheet.this.currentAccount).getChat(Long.valueOf(inputPeer.channel_id)), 0);
                    }
                    userCell.checkBox.setVisibility(8);
                    userCell.radioButton.setVisibility(0);
                    userCell.setChecked((ChoosePeerSheet.this.selectedPeer == null && i == 2) || did(ChoosePeerSheet.this.selectedPeer) == did(inputPeer), false);
                    userCell.setDivider(i != getItemCount() - 1);
                }
            }

            private long did(TLRPC.InputPeer inputPeer) {
                if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                    return UserConfig.getInstance(ChoosePeerSheet.this.currentAccount).getClientUserId();
                }
                return DialogObject.getPeerDialogId(inputPeer);
            }

            @Override
            public int getItemCount() {
                return ChoosePeerSheet.this.peers.size() + 2;
            }
        }
    }

    public StoriesController getStoriesController() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }
}
