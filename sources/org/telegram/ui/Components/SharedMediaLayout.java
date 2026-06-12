package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.SharedLinkCell;
import org.telegram.ui.Cells.SharedMediaSectionCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda350;
import org.telegram.ui.ChatActivityContainer;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileStoriesCollectionTabs;
import org.telegram.ui.SelectStoriesBottomSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.UserListPoller;
import org.telegram.ui.Stories.ViewsForPeerStoriesRequester;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TopicsFragment;

public abstract class SharedMediaLayout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, DialogCell.DialogCellDelegate {
    private ActionBar actionBar;
    private AnimatorSet actionModeAnimation;
    private LinearLayout actionModeLayout;
    private ArrayList actionModeViews;
    private SpannableStringBuilder addPostButton;
    private float additionalFloatingTranslation;
    private boolean allowStoriesSingleColumn;
    private int animateToColumnsCount;
    private boolean animatingForward;
    private boolean animatingToOptions;
    private StoriesAdapter animationSupportingArchivedStoriesAdapter;
    private SharedPhotoVideoAdapter animationSupportingPhotoVideoAdapter;
    private StoriesAdapter animationSupportingStoriesAdapter;
    private StoriesAdapter archivedStoriesAdapter;
    private SharedDocumentsAdapter audioAdapter;
    private ArrayList audioCache;
    private ArrayList audioCellCache;
    private MediaSearchAdapter audioSearchAdapter;
    private boolean backAnimation;
    private BackDrawable backDrawable;
    private Paint backgroundPaint;
    private BotPreviewsEditContainer botPreviewsContainer;
    private ArrayList cache;
    private int cantDeleteMessagesCount;
    private ArrayList cellCache;
    private int changeColumnsTab;
    private boolean changeTypeAnimation;
    private ChannelRecommendationsAdapter channelRecommendationsAdapter;
    private ChatUsersAdapter chatUsersAdapter;
    private ImageView closeButton;
    private CommonGroupsAdapter commonGroupsAdapter;
    final Delegate delegate;
    private ActionBarMenuItem deleteItem;
    private long dialog_id;
    private boolean disableScrolling;
    private SharedDocumentsAdapter documentsAdapter;
    private MediaSearchAdapter documentsSearchAdapter;
    private int firstTab;
    private AnimatorSet floatingDateAnimation;
    private ChatActionCell floatingDateView;
    private ActionBarMenuItem forwardItem;
    private FragmentContextView fragmentContextView;
    private FrameLayout fragmentContextViewWrapper;
    private HintView fwdRestrictedHint;
    private GifAdapter gifAdapter;
    public ProfileGiftsContainer giftsContainer;
    private long giftsLastHash;
    FlickerLoadingView globalGradientView;
    private ActionBarMenuItem gotoItem;
    private GroupUsersSearchAdapter groupUsersSearchAdapter;
    private int[] hasMedia;
    private Runnable hideFloatingDateRunnable;
    public final IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private boolean ignoreSearchCollapse;
    private TLRPC.ChatFull info;
    private int initialTab;
    protected boolean isActionModeShowed;
    boolean isInPinchToZoomTouchMode;
    boolean isPinnedToTop;
    Runnable jumpToRunnable;
    int lastMeasuredTopPadding;
    private int lastVisibleHeight;
    private SharedLinksAdapter linksAdapter;
    private MediaSearchAdapter linksSearchAdapter;
    private int maximumVelocity;
    boolean maybePinchToZoomTouchMode;
    boolean maybePinchToZoomTouchMode2;
    private boolean maybeStartTracking;
    private int[] mediaColumnsCount;
    private MediaPage[] mediaPages;
    private long mergeDialogId;
    SparseArray messageAlphaEnter;
    AnimationNotificationsLocker notificationsLocker;
    private final NotificationCenter.ObserversGroup observersGroup;
    private float optionsAlpha;
    private RLottieImageView optionsSearchImageView;
    private int pagesPaddingBottom;
    private SharedPhotoVideoAdapter photoVideoAdapter;
    private boolean photoVideoChangeColumnsAnimation;
    private float photoVideoChangeColumnsProgress;
    public ImageView photoVideoOptionsItem;
    private ActionBarMenuItem pinItem;
    int pinchCenterOffset;
    int pinchCenterPosition;
    int pinchCenterX;
    int pinchCenterY;
    float pinchScale;
    boolean pinchScaleUp;
    float pinchStartDistance;
    private Drawable pinnedHeaderShadowDrawable;
    private int pointerId1;
    private int pointerId2;
    private PollAdapter pollAdapter;
    private BaseFragment profileActivity;
    private PhotoViewer.PhotoViewerProvider provider;
    Rect rect;
    private Theme.ResourcesProvider resourcesProvider;
    public TextView saveItem;
    private SavedDialogsAdapter savedDialogsAdapter;
    private ChatActivityContainer savedMessagesContainer;
    private SavedMessagesSearchAdapter savedMessagesSearchAdapter;
    public ScrollSlidingTextTabStripInner scrollSlidingTextTabStrip;
    private boolean scrolling;
    public boolean scrollingByUser;
    private float searchAlpha;
    private ActionBarMenuItem searchItem;
    public ActionBarMenuItem searchItemIcon;
    private int searchItemState;
    public StoriesController.StoriesList searchStoriesList;
    public SearchTagsList searchTagsList;
    private boolean searchWas;
    private boolean searching;
    private ReactionsLayoutInBubble.VisibleReaction searchingReaction;
    private SparseArray[] selectedFiles;
    private NumberTextView selectedMessagesCountTextView;
    SharedLinkCell.SharedLinkCellDelegate sharedLinkCellDelegate;
    private SharedMediaData[] sharedMediaData;
    private SharedMediaPreloader sharedMediaPreloader;
    private float shiftDp;
    private boolean startedTracking;
    private int startedTrackingPointerId;
    private int startedTrackingX;
    private int startedTrackingY;
    private StoriesAdapter storiesAdapter;
    private boolean storiesColumnsCountSet;
    public ProfileStoriesCollectionTabs storiesContainer;
    private ItemTouchHelper storiesReorder;
    private final HashMap storyAlbumsById;
    private final HashMap storyAlbumsByTabType;
    private float subTabsVisibilityFactor;
    private int tabIndexCounter;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    private int topLayoutPadding;
    int topPadding;
    private DialogsActivityTopPanelLayout topPanelLayout;
    private long topicId;
    private ActionBarMenuItem unpinItem;
    private TLRPC.UserFull userInfo;
    private VelocityTracker velocityTracker;
    private final int viewType;
    private SharedDocumentsAdapter voiceAdapter;
    private boolean wasReordering;
    private static final int[] supportedFastScrollTypes = {0, 1, 2, 4};
    private static final Interpolator interpolator = new Interpolator() {
        @Override
        public final float getInterpolation(float f) {
            return SharedMediaLayout.lambda$static$2(f);
        }
    };

    public interface Delegate {
        boolean canSearchMembers();

        TLRPC.Chat getCurrentChat();

        RecyclerListView getListView();

        boolean isFragmentOpened();

        boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view);

        void scrollToSharedMedia();

        void updateSelectedMediaTabText();
    }

    public interface SharedMediaPreloaderDelegate {
        void mediaCountUpdated();
    }

    public static int getStoryAlbumType(int i) {
        return (i & 65535) | 65536;
    }

    public static boolean isStoryAlbumPageType(int i) {
        return (i & (-65536)) == 65536;
    }

    public static boolean lambda$new$29(View view, MotionEvent motionEvent) {
        return true;
    }

    public static float lambda$static$2(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public void showFloatingDateView() {
    }

    public boolean addActionButtons() {
        return true;
    }

    @Override
    public boolean canClickButtonInside() {
        return false;
    }

    protected boolean canShowSearchItem() {
        return true;
    }

    protected boolean customTabs() {
        return false;
    }

    protected int getInitialTab() {
        return 0;
    }

    public TL_stories.MediaArea getStoriesArea() {
        return null;
    }

    public String getStoriesHashtag() {
        return null;
    }

    public String getStoriesHashtagUsername() {
        return null;
    }

    protected boolean includeSavedDialogs() {
        return false;
    }

    protected boolean includeStories() {
        return true;
    }

    protected void invalidateBlur() {
    }

    protected boolean isArchivedOnlyStoriesView() {
        return false;
    }

    protected boolean isSelf() {
        return false;
    }

    protected boolean isStoriesView() {
        return false;
    }

    public int mediaPageTopMargin() {
        return 0;
    }

    protected void onActionModeSelectedUpdate(SparseArray sparseArray) {
    }

    protected void onBottomButtonVisibilityChange() {
    }

    @Override
    public void onButtonClicked(DialogCell dialogCell) {
    }

    @Override
    public void onButtonLongPress(DialogCell dialogCell) {
    }

    protected boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return false;
    }

    protected void onSearchStateChanged(boolean z) {
    }

    protected void onTabScroll(boolean z) {
    }

    @Override
    public void openHiddenStories() {
    }

    public int overrideColumnsCount() {
        return -1;
    }

    protected int processColor(int i) {
        return i;
    }

    @Override
    public void showChatPreview(DialogCell dialogCell) {
    }

    static int access$14608(SharedMediaLayout sharedMediaLayout) {
        int i = sharedMediaLayout.tabIndexCounter;
        sharedMediaLayout.tabIndexCounter = i + 1;
        return i;
    }

    public static void access$3800(SharedMediaLayout sharedMediaLayout, StoriesController.StoryAlbum storyAlbum) {
        sharedMediaLayout.onStoryAlbumCreate(storyAlbum);
    }

    static int access$4908(SharedMediaLayout sharedMediaLayout) {
        int i = sharedMediaLayout.cantDeleteMessagesCount;
        sharedMediaLayout.cantDeleteMessagesCount = i + 1;
        return i;
    }

    static int access$4910(SharedMediaLayout sharedMediaLayout) {
        int i = sharedMediaLayout.cantDeleteMessagesCount;
        sharedMediaLayout.cantDeleteMessagesCount = i - 1;
        return i;
    }

    public static boolean isAnyStoryPageType(int i) {
        return i == 8 || i == 9 || isStoryAlbumPageType(i);
    }

    public boolean isInFastScroll() {
        MediaPage mediaPage = this.mediaPages[0];
        return (mediaPage == null || mediaPage.listView.getFastScroll() == null || !this.mediaPages[0].listView.getFastScroll().isPressed()) ? false : true;
    }

    public boolean dispatchFastScrollEvent(MotionEvent motionEvent) {
        View view = (View) getParent();
        motionEvent.offsetLocation(((-view.getX()) - getX()) - this.mediaPages[0].listView.getFastScroll().getX(), (((-view.getY()) - getY()) - this.mediaPages[0].getY()) - this.mediaPages[0].listView.getFastScroll().getY());
        return this.mediaPages[0].listView.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public boolean checkPinchToZoom(MotionEvent motionEvent) {
        RecyclerView.Adapter adapterStoryAlbums_getStoriesAdapterByTabType;
        BotPreviewsEditContainer botPreviewsEditContainer;
        int i = this.mediaPages[0].selectedType;
        if (i == 13 && (botPreviewsEditContainer = this.botPreviewsContainer) != null) {
            return botPreviewsEditContainer.checkPinchToZoom(motionEvent);
        }
        if ((i != 0 && !isAnyStoryPageType(i)) || getParent() == null) {
            return false;
        }
        if (this.photoVideoChangeColumnsAnimation && !this.isInPinchToZoomTouchMode) {
            return true;
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.maybePinchToZoomTouchMode && !this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.pinchScale = 1.0f;
                this.pointerId1 = motionEvent.getPointerId(0);
                this.pointerId2 = motionEvent.getPointerId(1);
                this.mediaPages[0].listView.cancelClickRunnables(false);
                this.mediaPages[0].listView.cancelLongPress();
                this.mediaPages[0].listView.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                View view = (View) getParent();
                this.pinchCenterX = (int) (((((int) ((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f)) - view.getX()) - getX()) - this.mediaPages[0].getX());
                int y = (int) (((((int) ((motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f)) - view.getY()) - getY()) - this.mediaPages[0].getY());
                this.pinchCenterY = y;
                selectPinchPosition(this.pinchCenterX, y);
                this.maybePinchToZoomTouchMode2 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - this.mediaPages[0].getY() > 0.0f) {
                    this.maybePinchToZoomTouchMode = true;
                }
            }
        } else if (motionEvent.getActionMasked() == 2 && (this.isInPinchToZoomTouchMode || this.maybePinchToZoomTouchMode2)) {
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
                if (this.pointerId1 == motionEvent.getPointerId(i4)) {
                    i2 = i4;
                }
                if (this.pointerId2 == motionEvent.getPointerId(i4)) {
                    i3 = i4;
                }
            }
            if (i2 == -1 || i3 == -1) {
                this.maybePinchToZoomTouchMode = false;
                this.maybePinchToZoomTouchMode2 = false;
                this.isInPinchToZoomTouchMode = false;
                finishPinchToMediaColumnsCount();
                return false;
            }
            float fHypot = ((float) Math.hypot(motionEvent.getX(i3) - motionEvent.getX(i2), motionEvent.getY(i3) - motionEvent.getY(i2))) / this.pinchStartDistance;
            this.pinchScale = fHypot;
            if (!this.isInPinchToZoomTouchMode && (fHypot > 1.01f || fHypot < 0.99f)) {
                this.isInPinchToZoomTouchMode = true;
                boolean z = fHypot > 1.0f;
                this.pinchScaleUp = z;
                startPinchToMediaColumnsCount(z);
            }
            if (this.isInPinchToZoomTouchMode) {
                boolean z2 = this.pinchScaleUp;
                if ((!z2 || this.pinchScale >= 1.0f) && (z2 || this.pinchScale <= 1.0f)) {
                    this.photoVideoChangeColumnsProgress = Math.max(0.0f, Math.min(1.0f, z2 ? 1.0f - ((2.0f - this.pinchScale) / 1.0f) : (1.0f - this.pinchScale) / 0.5f));
                } else {
                    this.photoVideoChangeColumnsProgress = 0.0f;
                }
                float f = this.photoVideoChangeColumnsProgress;
                if (f == 1.0f || f == 0.0f) {
                    if (isAnyStoryPageType(this.changeColumnsTab)) {
                        adapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(this.changeColumnsTab);
                    } else {
                        adapterStoryAlbums_getStoriesAdapterByTabType = this.photoVideoAdapter;
                    }
                    if (this.photoVideoChangeColumnsProgress == 1.0f) {
                        int i5 = this.animateToColumnsCount;
                        int iCeil = (((int) Math.ceil(this.pinchCenterPosition / this.animateToColumnsCount)) * i5) + ((int) ((this.startedTrackingX / (this.mediaPages[0].listView.getMeasuredWidth() - ((int) (this.mediaPages[0].listView.getMeasuredWidth() / this.animateToColumnsCount)))) * (i5 - 1)));
                        if (iCeil >= adapterStoryAlbums_getStoriesAdapterByTabType.getItemCount()) {
                            iCeil = adapterStoryAlbums_getStoriesAdapterByTabType.getItemCount() - 1;
                        }
                        this.pinchCenterPosition = iCeil;
                    }
                    finishPinchToMediaColumnsCount();
                    if (this.photoVideoChangeColumnsProgress == 0.0f) {
                        this.pinchScaleUp = !this.pinchScaleUp;
                    }
                    startPinchToMediaColumnsCount(this.pinchScaleUp);
                    this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                }
                this.mediaPages[0].listView.invalidate();
                MediaPage mediaPage = this.mediaPages[0];
                if (mediaPage.fastScrollHintView != null) {
                    mediaPage.invalidate();
                }
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && checkPointerIds(motionEvent)) || motionEvent.getActionMasked() == 3)) && this.isInPinchToZoomTouchMode) {
            this.maybePinchToZoomTouchMode2 = false;
            this.maybePinchToZoomTouchMode = false;
            this.isInPinchToZoomTouchMode = false;
            finishPinchToMediaColumnsCount();
        }
        return this.isInPinchToZoomTouchMode;
    }

    private void selectPinchPosition(int i, int i2) {
        this.pinchCenterPosition = -1;
        int i3 = i2 + this.mediaPages[0].listView.blurTopPadding;
        if (getY() != 0.0f && this.viewType == 1) {
            i3 = 0;
        }
        for (int i4 = 0; i4 < this.mediaPages[0].listView.getChildCount(); i4++) {
            View childAt = this.mediaPages[0].listView.getChildAt(i4);
            childAt.getHitRect(this.rect);
            if (this.rect.contains(i, i3)) {
                this.pinchCenterPosition = this.mediaPages[0].listView.getChildLayoutPosition(childAt);
                this.pinchCenterOffset = childAt.getTop();
            }
        }
        if (this.delegate.canSearchMembers() && this.pinchCenterPosition == -1) {
            this.pinchCenterPosition = (int) (this.mediaPages[0].layoutManager.findFirstVisibleItemPosition() + ((this.mediaColumnsCount[isAnyStoryPageType(this.mediaPages[0].selectedType) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i / this.mediaPages[0].listView.getMeasuredWidth(), 0.0f))));
            this.pinchCenterOffset = 0;
        }
    }

    private boolean checkPointerIds(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return false;
        }
        if (this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) {
            return true;
        }
        return this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0);
    }

    public boolean isSwipeBackEnabled() {
        if (canEditStories() && ((getClosestTab() == 8 || getClosestTab() == 13 || isStoryAlbumPageType(getClosestTab())) && isActionModeShown())) {
            return false;
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null && profileGiftsContainer.isReordering()) {
            return false;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        return ((profileStoriesCollectionTabs != null && profileStoriesCollectionTabs.isReordering()) || this.photoVideoChangeColumnsAnimation || this.tabsAnimationInProgress) ? false : true;
    }

    public int getPhotosVideosTypeFilter() {
        return this.sharedMediaData[0].filterType;
    }

    public boolean isPinnedToTop() {
        return this.isPinnedToTop;
    }

    public void setPinnedToTop(boolean z) {
        if (this.isPinnedToTop == z) {
            return;
        }
        this.isPinnedToTop = z;
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            updateFastScrollVisibility(mediaPageArr[i], true);
            i++;
        }
    }

    public void drawListForBlur(Canvas canvas, ArrayList arrayList) {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            MediaPage mediaPage = mediaPageArr[i];
            if (mediaPage != null && mediaPage.getVisibility() == 0) {
                for (int i2 = 0; i2 < this.mediaPages[i].listView.getChildCount(); i2++) {
                    View childAt = this.mediaPages[i].listView.getChildAt(i2);
                    if (childAt.getY() < this.mediaPages[i].listView.blurTopPadding + AndroidUtilities.dp(100.0f)) {
                        int iSave = canvas.save();
                        canvas.translate(this.mediaPages[i].getX() + childAt.getX(), getY() + this.mediaPages[i].getY() + this.mediaPages[i].listView.getY() + childAt.getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback)) {
                            arrayList.add((SizeNotifierFrameLayout.IViewWithInvalidateCallback) childAt);
                        }
                        canvas.restoreToCount(iSave);
                    }
                }
            }
            i++;
        }
    }

    @Override
    public void openStory(DialogCell dialogCell, Runnable runnable) {
        BaseFragment baseFragment = this.profileActivity;
        if (baseFragment != null && baseFragment.getMessagesController().getStoriesController().hasStories(dialogCell.getDialogId())) {
            this.profileActivity.getOrCreateStoryViewer().doOnAnimationReady(runnable);
            StoryViewer orCreateStoryViewer = this.profileActivity.getOrCreateStoryViewer();
            Context context = this.profileActivity.getContext();
            long dialogId = dialogCell.getDialogId();
            StoriesListPlaceProvider storiesListPlaceProviderOf = StoriesListPlaceProvider.of((RecyclerListView) dialogCell.getParent());
            BaseFragment baseFragment2 = this.profileActivity;
            orCreateStoryViewer.open(context, dialogId, storiesListPlaceProviderOf.addBottomClip(((baseFragment2 instanceof ProfileActivity) && ((ProfileActivity) baseFragment2).myProfile) ? AndroidUtilities.dp(68.0f) : 0));
        }
    }

    public static class MediaPage extends FrameLayout {
        private ClippingImageView animatingImageView;
        private GridLayoutManager animationSupportingLayoutManager;
        private InternalListView animationSupportingListView;
        private StickerEmptyView emptyView;
        public ObjectAnimator fastScrollAnimator;
        public boolean fastScrollEnabled;
        public Runnable fastScrollHideHintRunnable;
        public boolean fastScrollHinWasShown;
        public SharedMediaFastScrollTooltip fastScrollHintView;
        public boolean highlightAnimation;
        public int highlightMessageId;
        public float highlightProgress;
        private IBlur3Capture iBlur3Capture;
        private DefaultItemAnimator itemAnimator;
        public long lastCheckScrollTime;
        private ExtendedGridLayoutManager layoutManager;
        private InternalListView listView;
        private FlickerLoadingView progressView;
        private RecyclerAnimationScrollHelper scrollHelper;
        private RecyclerView.RecycledViewPool searchViewPool;
        public int selectedType;
        private RecyclerView.RecycledViewPool viewPool;

        public MediaPage(Context context) {
            super(context);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.animationSupportingListView) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = this.fastScrollHintView;
            if (sharedMediaFastScrollTooltip == null || sharedMediaFastScrollTooltip.getVisibility() != 0) {
                return;
            }
            RecyclerListView.FastScroll fastScroll = this.listView.getFastScroll();
            if (fastScroll != null) {
                float scrollBarY = fastScroll.getScrollBarY() + AndroidUtilities.dp(36.0f);
                if (this.selectedType == 9) {
                    scrollBarY += AndroidUtilities.dp(64.0f);
                }
                int i = this.selectedType;
                if (i == 8 || SharedMediaLayout.isStoryAlbumPageType(i)) {
                    scrollBarY += AndroidUtilities.dp(42.0f);
                }
                float measuredWidth = (getMeasuredWidth() - this.fastScrollHintView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
                this.fastScrollHintView.setPivotX(r2.getMeasuredWidth());
                this.fastScrollHintView.setPivotY(0.0f);
                this.fastScrollHintView.setTranslationX(measuredWidth);
                this.fastScrollHintView.setTranslationY(scrollBarY);
            }
            if (fastScroll.getProgress() > 0.85f) {
                SharedMediaLayout.showFastScrollHint(this, null, false);
            }
        }
    }

    public float getPhotoVideoOptionsAlpha(float f) {
        int i;
        ProfileGiftsContainer profileGiftsContainer;
        int i2;
        int i3;
        ProfileGiftsContainer profileGiftsContainer2;
        float f2 = 0.0f;
        if (isArchivedOnlyStoriesView()) {
            return 0.0f;
        }
        MediaPage mediaPage = this.mediaPages[1];
        if (mediaPage != null && ((i2 = mediaPage.selectedType) == 0 || (((i2 == 8 || isStoryAlbumPageType(i2)) && TextUtils.isEmpty(getStoriesHashtag())) || (i3 = this.mediaPages[1].selectedType) == 9 || i3 == 11 || i3 == 13 || (i3 == 14 && (profileGiftsContainer2 = this.giftsContainer) != null && profileGiftsContainer2.canFilter())))) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = this.mediaPages[0];
        if (mediaPage2 == null) {
            return f2;
        }
        int i4 = mediaPage2.selectedType;
        return (i4 == 0 || ((i4 == 8 || isStoryAlbumPageType(i4)) && TextUtils.isEmpty(getStoriesHashtag())) || (i = this.mediaPages[0].selectedType) == 9 || i == 11 || i == 13 || (i == 14 && (profileGiftsContainer = this.giftsContainer) != null && profileGiftsContainer.canFilter())) ? f2 + (1.0f - f) : f2;
    }

    public float getSearchAlpha(float f) {
        float f2 = 0.0f;
        if (isArchivedOnlyStoriesView()) {
            return 0.0f;
        }
        MediaPage mediaPage = this.mediaPages[1];
        if (mediaPage != null && isSearchItemVisible(mediaPage.selectedType) && this.mediaPages[1].selectedType != 11) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = this.mediaPages[0];
        return (mediaPage2 == null || !isSearchItemVisible(mediaPage2.selectedType) || this.mediaPages[0].selectedType == 11) ? f2 : f2 + (1.0f - f);
    }

    public void updateSearchItemIcon(float f) {
        ActionBarMenuItem actionBarMenuItem = this.searchItemIcon;
        if (actionBarMenuItem == null) {
            return;
        }
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[1];
        float f2 = 0.0f;
        if (mediaPage != null && mediaPage.selectedType == 11) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = mediaPageArr[0];
        if (mediaPage2 != null && mediaPage2.selectedType == 11) {
            f2 += 1.0f - f;
        }
        actionBarMenuItem.setAlpha(f2);
        float f3 = (0.15f * f2) + 0.85f;
        this.searchItemIcon.setScaleX(f3);
        this.searchItemIcon.setScaleY(f3);
        this.searchItemIcon.setVisibility(f2 <= 0.01f ? 8 : 0);
    }

    public void updateSearchItemIconAnimated() {
        ActionBarMenuItem actionBarMenuItem = this.searchItemIcon;
        if (actionBarMenuItem == null) {
            return;
        }
        MediaPage mediaPage = this.mediaPages[1];
        final boolean z = mediaPage != null && mediaPage.selectedType == 11;
        if (z) {
            actionBarMenuItem.setVisibility(0);
        }
        this.searchItemIcon.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.85f).scaleY(z ? 1.0f : 0.85f).withEndAction(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateSearchItemIconAnimated$0(z);
            }
        }).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
    }

    public void lambda$updateSearchItemIconAnimated$0(boolean z) {
        if (z) {
            return;
        }
        this.searchItemIcon.setVisibility(8);
    }

    public void updateFastScrollVisibility(MediaPage mediaPage, boolean z) {
        boolean z2 = mediaPage.fastScrollEnabled && this.isPinnedToTop;
        RecyclerListView.FastScroll fastScroll = mediaPage.listView.getFastScroll();
        ObjectAnimator objectAnimator = mediaPage.fastScrollAnimator;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            mediaPage.fastScrollAnimator.cancel();
        }
        if (!z) {
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setVisibility(z2 ? 0 : 8);
            fastScroll.setTag(z2 ? 1 : null);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        if (z2 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(fastScroll, (Property<RecyclerListView.FastScroll, Float>) View.ALPHA, fastScroll.getAlpha(), 1.0f);
            mediaPage.fastScrollAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(150L).start();
            fastScroll.setTag(num);
            return;
        }
        if (z2 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<RecyclerListView.FastScroll, Float>) View.ALPHA, fastScroll.getAlpha(), 0.0f);
        objectAnimatorOfFloat2.addListener(new HideViewAfterAnimation(fastScroll));
        mediaPage.fastScrollAnimator = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    public void lambda$new$1() {
        hideFloatingDateView(true);
    }

    public static class SharedMediaPreloader implements NotificationCenter.NotificationCenterDelegate {
        private boolean checkedHasSavedMessages;
        private long dialogId;
        public boolean hasPreviews;
        public boolean hasSavedMessages;
        private boolean mediaWasLoaded;
        private long mergeDialogId;
        private final NotificationCenter.ObserversGroup observersGroup;
        private BaseFragment parentFragment;
        private SharedMediaData[] sharedMediaData;
        private long topicId;
        private int[] mediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] mediaMergeCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastLoadMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastLoadMergeMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private ArrayList delegates = new ArrayList();

        public long getTopicId() {
            return this.topicId;
        }

        public boolean hasSharedMedia() {
            int[] lastMediaCount = getLastMediaCount();
            if (lastMediaCount == null) {
                return false;
            }
            for (int i : lastMediaCount) {
                if (i > 0) {
                    return true;
                }
            }
            if (this.hasSavedMessages) {
                return true;
            }
            BaseFragment baseFragment = this.parentFragment;
            return baseFragment != null && this.dialogId == baseFragment.getUserConfig().getClientUserId() && this.topicId == 0 && this.parentFragment.getMessagesController().getSavedMessagesController().hasDialogs();
        }

        public SharedMediaPreloader(BaseFragment baseFragment) {
            TLRPC.ChatFull chatFull;
            this.parentFragment = baseFragment;
            if (baseFragment instanceof ChatActivityInterface) {
                ChatActivityInterface chatActivityInterface = (ChatActivityInterface) baseFragment;
                this.dialogId = chatActivityInterface.getDialogId();
                this.mergeDialogId = chatActivityInterface.getMergeDialogId();
                this.topicId = chatActivityInterface.getTopicId();
                if (this.dialogId != baseFragment.getUserConfig().getClientUserId()) {
                    baseFragment.getMessagesController().getSavedMessagesController().hasSavedMessages(this.dialogId, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$new$0((Boolean) obj);
                        }
                    });
                }
            } else if (baseFragment instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) baseFragment;
                if (profileActivity.saved) {
                    this.dialogId = profileActivity.getUserConfig().getClientUserId();
                    this.topicId = profileActivity.getDialogId();
                } else {
                    this.dialogId = profileActivity.getDialogId();
                    this.topicId = profileActivity.getTopicId();
                    TLRPC.ChatFull chatInfo = profileActivity.getChatInfo();
                    if (chatInfo != null) {
                        setChatInfo(chatInfo);
                    }
                    if (this.dialogId != baseFragment.getUserConfig().getClientUserId()) {
                        baseFragment.getMessagesController().getSavedMessagesController().hasSavedMessages(this.dialogId, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                this.f$0.lambda$new$1((Boolean) obj);
                            }
                        });
                    }
                }
            } else if (baseFragment instanceof MediaActivity) {
                this.dialogId = ((MediaActivity) baseFragment).getDialogId();
            } else if (baseFragment instanceof DialogsActivity) {
                this.dialogId = baseFragment.getUserConfig().getClientUserId();
            }
            if (this.mergeDialogId == 0 && DialogObject.isChatDialog(this.dialogId) && (chatFull = baseFragment.getMessagesController().getChatFull(-this.dialogId)) != null) {
                long j = chatFull.migrated_from_chat_id;
                if (j != 0) {
                    this.mergeDialogId = -j;
                }
            }
            this.sharedMediaData = new SharedMediaData[9];
            int i = 0;
            while (true) {
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                if (i >= sharedMediaDataArr.length) {
                    break;
                }
                sharedMediaDataArr[i] = new SharedMediaData();
                this.sharedMediaData[i].setMaxId(0, DialogObject.isEncryptedDialog(this.dialogId) ? Integer.MIN_VALUE : Integer.MAX_VALUE);
                this.sharedMediaData[i].setMaxId(1, Integer.MAX_VALUE);
                i++;
            }
            loadMediaCounts();
            BaseFragment baseFragment2 = this.parentFragment;
            if (baseFragment2 == null) {
                this.observersGroup = null;
            } else {
                this.observersGroup = baseFragment2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
            }
        }

        public void lambda$new$0(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            this.hasSavedMessages = zBooleanValue;
            this.checkedHasSavedMessages = true;
            if (zBooleanValue) {
                int size = this.delegates.size();
                for (int i = 0; i < size; i++) {
                    ((SharedMediaPreloaderDelegate) this.delegates.get(i)).mediaCountUpdated();
                }
            }
        }

        public void lambda$new$1(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            this.hasSavedMessages = zBooleanValue;
            this.checkedHasSavedMessages = true;
            if (zBooleanValue) {
                int size = this.delegates.size();
                for (int i = 0; i < size; i++) {
                    ((SharedMediaPreloaderDelegate) this.delegates.get(i)).mediaCountUpdated();
                }
            }
        }

        public void addDelegate(SharedMediaPreloaderDelegate sharedMediaPreloaderDelegate) {
            this.delegates.add(sharedMediaPreloaderDelegate);
        }

        public void removeDelegate(SharedMediaPreloaderDelegate sharedMediaPreloaderDelegate) {
            this.delegates.remove(sharedMediaPreloaderDelegate);
        }

        public void onDestroy(BaseFragment baseFragment) {
            if (baseFragment != this.parentFragment) {
                return;
            }
            this.delegates.clear();
            NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }

        public int[] getLastMediaCount() {
            return this.lastMediaCount;
        }

        public SharedMediaData[] getSharedMediaData() {
            return this.sharedMediaData;
        }

        @Override
        public void didReceivedNotification(int r29, final int r30, java.lang.Object... r31) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.SharedMediaPreloader.didReceivedNotification(int, int, java.lang.Object[]):void");
        }

        private void loadMediaCounts() {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null) {
                return;
            }
            baseFragment.getMediaDataController().getMediaCounts(this.dialogId, this.topicId, this.parentFragment.getClassGuid());
            if (this.mergeDialogId != 0) {
                this.parentFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, this.topicId, this.parentFragment.getClassGuid());
            }
        }

        private void setChatInfo(TLRPC.ChatFull chatFull) {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null || chatFull == null) {
                return;
            }
            long j = chatFull.migrated_from_chat_id;
            if (j == 0 || this.mergeDialogId != 0) {
                return;
            }
            this.mergeDialogId = -j;
            baseFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, this.topicId, this.parentFragment.getClassGuid());
        }

        public boolean isMediaWasLoaded() {
            return this.mediaWasLoaded;
        }
    }

    public static class SharedMediaData {
        private int endLoadingStubs;
        public boolean fastScrollDataLoaded;
        public int frozenEndLoadingStubs;
        public int frozenStartOffset;
        private boolean hasPhotos;
        private boolean hasVideos;
        public boolean isFrozen;
        public boolean loading;
        public boolean loadingAfterFastScroll;
        public int min_id;
        public int requestIndex;
        private int startOffset;
        public ArrayList messages = new ArrayList();
        public SparseArray[] messagesDict = {new SparseArray(), new SparseArray()};
        public ArrayList sections = new ArrayList();
        public HashMap sectionArrays = new HashMap();
        public ArrayList fastScrollPeriods = new ArrayList();
        public int[] totalCount = {0, 0};
        public boolean[] endReached = {false, true};
        public int[] max_id = {0, 0};
        public boolean startReached = true;
        public int filterType = 0;
        public ArrayList frozenMessages = new ArrayList();
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();

        static int access$12010(SharedMediaData sharedMediaData) {
            int i = sharedMediaData.endLoadingStubs;
            sharedMediaData.endLoadingStubs = i - 1;
            return i;
        }

        static int access$610(SharedMediaData sharedMediaData) {
            int i = sharedMediaData.startOffset;
            sharedMediaData.startOffset = i - 1;
            return i;
        }

        public void setTotalCount(int i, int i2) {
            this.totalCount[i] = i2;
        }

        public int getTotalCount() {
            int[] iArr = this.totalCount;
            return iArr[0] + iArr[1];
        }

        public void setMaxId(int i, int i2) {
            this.max_id[i] = i2;
        }

        public void setEndReached(int i, boolean z) {
            this.endReached[i] = z;
        }

        public boolean addMessage(MessageObject messageObject, int i, boolean z, boolean z2) {
            if (this.messagesDict[i].indexOfKey(messageObject.getId()) >= 0) {
                return false;
            }
            ArrayList arrayList = (ArrayList) this.sectionArrays.get(messageObject.monthKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.sectionArrays.put(messageObject.monthKey, arrayList);
                if (z) {
                    this.sections.add(0, messageObject.monthKey);
                } else {
                    this.sections.add(messageObject.monthKey);
                }
            }
            if (z) {
                arrayList.add(0, messageObject);
                this.messages.add(0, messageObject);
            } else {
                arrayList.add(messageObject);
                this.messages.add(messageObject);
            }
            this.messagesDict[i].put(messageObject.getId(), messageObject);
            if (!z2) {
                if (messageObject.getId() > 0) {
                    this.max_id[i] = Math.min(messageObject.getId(), this.max_id[i]);
                    this.min_id = Math.max(messageObject.getId(), this.min_id);
                }
            } else {
                this.max_id[i] = Math.max(messageObject.getId(), this.max_id[i]);
                this.min_id = Math.min(messageObject.getId(), this.min_id);
            }
            if (!this.hasVideos && messageObject.isVideo()) {
                this.hasVideos = true;
            }
            if (!this.hasPhotos && messageObject.isPhoto()) {
                this.hasPhotos = true;
            }
            return true;
        }

        public MessageObject deleteMessage(int i, int i2) {
            ArrayList arrayList;
            MessageObject messageObject = (MessageObject) this.messagesDict[i2].get(i);
            if (messageObject == null || (arrayList = (ArrayList) this.sectionArrays.get(messageObject.monthKey)) == null) {
                return null;
            }
            arrayList.remove(messageObject);
            this.messages.remove(messageObject);
            this.messagesDict[i2].remove(messageObject.getId());
            if (arrayList.isEmpty()) {
                this.sectionArrays.remove(messageObject.monthKey);
                this.sections.remove(messageObject.monthKey);
            }
            int[] iArr = this.totalCount;
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 < 0) {
                iArr[i2] = 0;
            }
            return messageObject;
        }

        public void replaceMid(int i, int i2, int i3) {
            MessageObject messageObject = (MessageObject) this.messagesDict[i].get(i2);
            if (messageObject != null) {
                this.messagesDict[i].remove(i2);
                this.messagesDict[i].put(i3, messageObject);
                messageObject.messageOwner.id = i3;
                int[] iArr = this.max_id;
                iArr[i] = Math.min(i3, iArr[i]);
            }
        }

        public ArrayList getMessages() {
            return this.isFrozen ? this.frozenMessages : this.messages;
        }

        public int getStartOffset() {
            return this.isFrozen ? this.frozenStartOffset : this.startOffset;
        }

        public void setListFrozen(boolean z) {
            if (this.isFrozen == z) {
                return;
            }
            this.isFrozen = z;
            if (z) {
                this.frozenStartOffset = this.startOffset;
                this.frozenEndLoadingStubs = this.endLoadingStubs;
                this.frozenMessages.clear();
                this.frozenMessages.addAll(this.messages);
            }
        }

        public int getEndLoadingStubs() {
            return this.isFrozen ? this.frozenEndLoadingStubs : this.endLoadingStubs;
        }
    }

    public static class Period {
        int date;
        public String formatedDate;
        int maxId;
        public int startOffset;

        public Period(TLRPC.TL_searchResultPosition tL_searchResultPosition) {
            int i = tL_searchResultPosition.date;
            this.date = i;
            this.maxId = tL_searchResultPosition.msg_id;
            this.startOffset = tL_searchResultPosition.offset;
            this.formatedDate = LocaleController.formatYearMont(i, true);
        }
    }

    public boolean hasInternet() {
        return this.profileActivity.getConnectionsManager().getConnectionState() == 3;
    }

    public SharedMediaLayout(Context context, long j, SharedMediaPreloader sharedMediaPreloader, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, BaseFragment baseFragment, Delegate delegate, int i4, Theme.ResourcesProvider resourcesProvider) {
        this(context, j, sharedMediaPreloader, i, arrayList, chatFull, userFull, i2, i3, baseFragment, delegate, i4, resourcesProvider, null);
    }

    public SharedMediaLayout(final android.content.Context r36, final long r37, org.telegram.ui.Components.SharedMediaLayout.SharedMediaPreloader r39, int r40, java.util.ArrayList r41, org.telegram.tgnet.TLRPC.ChatFull r42, org.telegram.tgnet.TLRPC.UserFull r43, int r44, int r45, org.telegram.ui.ActionBar.BaseFragment r46, org.telegram.ui.Components.SharedMediaLayout.Delegate r47, int r48, final org.telegram.ui.ActionBar.Theme.ResourcesProvider r49, org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory r50) throws android.content.res.Resources.NotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.<init>(android.content.Context, long, org.telegram.ui.Components.SharedMediaLayout$SharedMediaPreloader, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.BaseFragment, org.telegram.ui.Components.SharedMediaLayout$Delegate, int, org.telegram.ui.ActionBar.Theme$ResourcesProvider, org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory):void");
    }

    class AnonymousClass4 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        AnonymousClass4() {
        }

        @Override
        public void onSearchExpand() {
            SharedMediaLayout.this.searching = true;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            SearchTagsList searchTagsList = sharedMediaLayout.searchTagsList;
            if (searchTagsList != null) {
                searchTagsList.show((sharedMediaLayout.getSelectedTab() == 11 || SharedMediaLayout.this.getSelectedTab() == 12) && SharedMediaLayout.this.searchTagsList.hasFilters());
            }
            ImageView imageView = SharedMediaLayout.this.photoVideoOptionsItem;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.searchItemIcon;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
            }
            SharedMediaLayout.this.searchItem.setVisibility(8);
            SharedMediaLayout.this.onSearchStateChanged(true);
            if (SharedMediaLayout.this.optionsSearchImageView != null) {
                SharedMediaLayout.this.optionsSearchImageView.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        }

        @Override
        public void onSearchCollapse() throws Resources.NotFoundException, IOException, NumberFormatException {
            SharedMediaLayout.this.searching = false;
            SharedMediaLayout.this.searchingReaction = null;
            ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.searchItemIcon;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(0);
            }
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.photoVideoOptionsItem != null && sharedMediaLayout.getPhotoVideoOptionsAlpha(0.0f) > 0.5f) {
                SharedMediaLayout.this.photoVideoOptionsItem.setVisibility(0);
            }
            SearchTagsList searchTagsList = SharedMediaLayout.this.searchTagsList;
            if (searchTagsList != null) {
                searchTagsList.clear();
                SharedMediaLayout.this.searchTagsList.show(false);
            }
            if (SharedMediaLayout.this.savedMessagesContainer != null) {
                SharedMediaLayout.this.savedMessagesContainer.chatActivity.clearSearch();
            }
            SharedMediaLayout.this.searchWas = false;
            SharedMediaLayout.this.searchItem.setVisibility(0);
            SharedMediaLayout.this.documentsSearchAdapter.search(null, true);
            SharedMediaLayout.this.linksSearchAdapter.search(null, true);
            SharedMediaLayout.this.audioSearchAdapter.search(null, true);
            SharedMediaLayout.this.groupUsersSearchAdapter.search(null, true);
            if (SharedMediaLayout.this.savedMessagesSearchAdapter != null) {
                SharedMediaLayout.this.savedMessagesSearchAdapter.search(null, null);
            }
            SharedMediaLayout.this.onSearchStateChanged(false);
            if (SharedMediaLayout.this.optionsSearchImageView != null) {
                SharedMediaLayout.this.optionsSearchImageView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            if (SharedMediaLayout.this.ignoreSearchCollapse) {
                SharedMediaLayout.this.ignoreSearchCollapse = false;
            } else {
                SharedMediaLayout.this.switchToCurrentSelectedMode(false);
            }
        }

        @Override
        public void onTextChanged(EditText editText) throws Resources.NotFoundException, IOException, NumberFormatException {
            String string = editText.getText().toString();
            if (SharedMediaLayout.this.savedMessagesContainer != null) {
                SharedMediaLayout.this.savedMessagesContainer.chatActivity.setSearchQuery(string);
                if (TextUtils.isEmpty(string) && SharedMediaLayout.this.searchingReaction == null) {
                    SharedMediaLayout.this.savedMessagesContainer.chatActivity.clearSearch();
                }
            }
            SharedMediaLayout.this.searchItem.setVisibility(8);
            SharedMediaLayout.this.searchWas = (string.length() == 0 && SharedMediaLayout.this.searchingReaction == null) ? false : true;
            SharedMediaLayout.this.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onTextChanged$0();
                }
            });
            if (SharedMediaLayout.this.mediaPages[0].selectedType == 1) {
                if (SharedMediaLayout.this.documentsSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.documentsSearchAdapter.search(string, true);
                return;
            }
            if (SharedMediaLayout.this.mediaPages[0].selectedType == 3) {
                if (SharedMediaLayout.this.linksSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.linksSearchAdapter.search(string, true);
            } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 4) {
                if (SharedMediaLayout.this.audioSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.audioSearchAdapter.search(string, true);
            } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 7) {
                if (SharedMediaLayout.this.groupUsersSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.groupUsersSearchAdapter.search(string, true);
            } else {
                if (SharedMediaLayout.this.mediaPages[0].selectedType != 11 || SharedMediaLayout.this.savedMessagesSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.savedMessagesSearchAdapter.search(string, SharedMediaLayout.this.searchingReaction);
            }
        }

        public void lambda$onTextChanged$0() {
            SharedMediaLayout.this.switchToCurrentSelectedMode(false);
        }

        @Override
        public void onSearchPressed(EditText editText) {
            super.onSearchPressed(editText);
            if (SharedMediaLayout.this.savedMessagesContainer != null) {
                SharedMediaLayout.this.savedMessagesContainer.chatActivity.hitSearch();
            }
        }

        @Override
        public void onLayout(int i, int i2, int i3, int i4) {
            SharedMediaLayout.this.searchItem.setTranslationX(((View) SharedMediaLayout.this.searchItem.getParent()).getMeasuredWidth() - SharedMediaLayout.this.searchItem.getRight());
        }
    }

    class AnonymousClass5 implements View.OnClickListener {
        final Context val$context;
        final long val$did;
        final Theme.ResourcesProvider val$resourcesProvider;

        AnonymousClass5(long j, Theme.ResourcesProvider resourcesProvider, Context context) {
            this.val$did = j;
            this.val$resourcesProvider = resourcesProvider;
            this.val$context = context;
        }

        @Override
        public void onClick(View view) {
            StoriesController.StoriesList storiesList;
            TLRPC.Chat chat;
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            ActionBarMenuSubItem actionBarMenuSubItemAdd;
            boolean z;
            ActionBarMenuSubItem actionBarMenuSubItemAddChecked;
            ActionBarMenuSubItem actionBarMenuSubItem;
            final Runnable runnable;
            StoryAlbumData storyAlbumDataStoryAlbums_getByTabType;
            boolean z2 = true;
            final int closestTab = SharedMediaLayout.this.getClosestTab();
            boolean zIsAnyStoryPageType = SharedMediaLayout.isAnyStoryPageType(closestTab);
            TLRPC.User user = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id));
            boolean zCanEditStoryAlbums = SharedMediaLayout.this.getStoriesController().canEditStoryAlbums(SharedMediaLayout.this.dialog_id);
            if (SharedMediaLayout.isStoryAlbumPageType(closestTab) && zCanEditStoryAlbums && (storyAlbumDataStoryAlbums_getByTabType = SharedMediaLayout.this.storyAlbums_getByTabType(closestTab)) != null) {
                int i = storyAlbumDataStoryAlbums_getByTabType.albumId;
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                sharedMediaLayout.buildItemOptionsForStoryAlbumActionBar(sharedMediaLayout.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem, this.val$did, i).setOnTopOfScrim().setDimAlpha(0).show();
                return;
            }
            if (closestTab == 14) {
                ProfileGiftsContainer.Page currentPage = SharedMediaLayout.this.giftsContainer.getCurrentPage();
                final StarsController.GiftsList giftsList = currentPage.list;
                if (giftsList == null) {
                    return;
                }
                final boolean zCanFilterHidden = SharedMediaLayout.this.giftsContainer.canFilterHidden();
                final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem);
                if (giftsList.isCollection) {
                    actionBarMenuSubItemAdd = null;
                    z = false;
                } else {
                    actionBarMenuSubItemAdd = itemOptionsMakeOptions.add();
                    z = true;
                }
                if (SharedMediaLayout.this.giftsContainer.canAdd()) {
                    itemOptionsMakeOptions.add(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onClick$0(itemOptionsMakeOptions);
                        }
                    });
                    z = true;
                }
                if (SharedMediaLayout.this.giftsContainer.collections.isMine()) {
                    if (!giftsList.getPinned().isEmpty() || currentPage.isCollection) {
                        itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onClick$1(itemOptionsMakeOptions);
                            }
                        });
                    }
                    z = true;
                }
                if (z) {
                    itemOptionsMakeOptions.addGap();
                }
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked2 = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked2.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked3 = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked3.setText(LocaleController.getString(R.string.Gift2FilterLimited));
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked4 = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked4.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked5 = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked5.setText(LocaleController.getString(R.string.Gift2FilterUnique));
                if (zCanFilterHidden) {
                    itemOptionsMakeOptions.addGap();
                    ActionBarMenuSubItem actionBarMenuSubItemAddChecked6 = itemOptionsMakeOptions.addChecked();
                    actionBarMenuSubItemAddChecked6.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                    actionBarMenuSubItemAddChecked = itemOptionsMakeOptions.addChecked();
                    actionBarMenuSubItemAddChecked.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                    actionBarMenuSubItem = actionBarMenuSubItemAddChecked6;
                } else {
                    actionBarMenuSubItemAddChecked = null;
                    actionBarMenuSubItem = null;
                }
                final ActionBarMenuSubItem actionBarMenuSubItem2 = actionBarMenuSubItemAddChecked;
                final ActionBarMenuSubItem actionBarMenuSubItem3 = actionBarMenuSubItemAdd;
                final ActionBarMenuSubItem actionBarMenuSubItem4 = actionBarMenuSubItem;
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        SharedMediaLayout.AnonymousClass5.lambda$onClick$2(actionBarMenuSubItem3, giftsList, actionBarMenuSubItemAddChecked2, actionBarMenuSubItemAddChecked3, actionBarMenuSubItemAddChecked4, actionBarMenuSubItemAddChecked5, zCanFilterHidden, actionBarMenuSubItem4, actionBarMenuSubItem2);
                    }
                };
                runnable2.run();
                if (actionBarMenuSubItemAdd != null) {
                    runnable = runnable2;
                    actionBarMenuSubItemAdd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            SharedMediaLayout.AnonymousClass5.lambda$onClick$3(giftsList, runnable, view2);
                        }
                    });
                } else {
                    runnable = runnable2;
                }
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked2, giftsList, runnable, 1);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked3, giftsList, runnable, 2);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked4, giftsList, runnable, 4);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked5, giftsList, runnable, 8);
                if (zCanFilterHidden) {
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem4, giftsList, runnable, 256);
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem2, giftsList, runnable, 512);
                }
                itemOptionsMakeOptions.setOnTopOfScrim().setDismissWithButtons(false).setDimAlpha(0).show();
                return;
            }
            if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && SharedMediaLayout.this.botPreviewsContainer != null) {
                ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem).addIf(SharedMediaLayout.this.botPreviewsContainer.getItemsCount() < SharedMediaLayout.this.profileActivity.getMessagesController().botPreviewMediasMax, R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onClick$4();
                    }
                }).addIf(SharedMediaLayout.this.botPreviewsContainer.getItemsCount() > 1 && !SharedMediaLayout.this.botPreviewsContainer.isSelectedAll(), R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onClick$5();
                    }
                }).addIf(SharedMediaLayout.this.botPreviewsContainer.getItemsCount() > 0, R.drawable.msg_select, LocaleController.getString(SharedMediaLayout.this.botPreviewsContainer.isSelectedAll() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onClick$6();
                    }
                }).addIf(!TextUtils.isEmpty(SharedMediaLayout.this.botPreviewsContainer.getCurrentLang()), R.drawable.msg_delete, (CharSequence) LocaleController.formatString(R.string.ProfileBotRemoveLang, TranslateAlert2.languageName(SharedMediaLayout.this.botPreviewsContainer.getCurrentLang())), true, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onClick$7();
                    }
                }).translate(0.0f, -AndroidUtilities.dp(52.0f)).setDimAlpha(0).show();
                return;
            }
            if (SharedMediaLayout.this.getSelectedTab() != 11) {
                final ItemOptions itemOptionsMakeOptions2 = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem);
                if ((closestTab == 8 || SharedMediaLayout.isStoryAlbumPageType(closestTab)) && zCanEditStoryAlbums) {
                    int i2 = R.drawable.menu_album_add;
                    String string = LocaleController.getString(R.string.StoriesAlbumAddAlbum);
                    final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
                    itemOptionsMakeOptions2.add(i2, string, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onClick$14(resourcesProvider, itemOptionsMakeOptions2);
                        }
                    });
                    itemOptionsMakeOptions2.addGap();
                }
                SharedMediaLayout.this.addZoomInZoomOutItemOptions(itemOptionsMakeOptions2);
                boolean z3 = zIsAnyStoryPageType || !((!SharedMediaLayout.this.sharedMediaData[0].hasPhotos || !SharedMediaLayout.this.sharedMediaData[0].hasVideos) && SharedMediaLayout.this.sharedMediaData[0].endReached[0] && SharedMediaLayout.this.sharedMediaData[0].endReached[1] && SharedMediaLayout.this.sharedMediaData[0].startReached);
                if (!DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id) && (user == null || !user.bot)) {
                    itemOptionsMakeOptions2.add(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onClick$15(closestTab, itemOptionsMakeOptions2);
                        }
                    });
                    if (SharedMediaLayout.this.info != null && !SharedMediaLayout.this.isStoriesView() && (chat = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getChat(Long.valueOf(SharedMediaLayout.this.info.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                        itemOptionsMakeOptions2.add(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onClick$16(itemOptionsMakeOptions2);
                            }
                        });
                    }
                    if (z3) {
                        itemOptionsMakeOptions2.addGap();
                        final ActionBarMenuSubItem actionBarMenuSubItem5 = new ActionBarMenuSubItem(this.val$context, true, false, false, this.val$resourcesProvider);
                        final ActionBarMenuSubItem actionBarMenuSubItem6 = new ActionBarMenuSubItem(this.val$context, true, false, true, this.val$resourcesProvider);
                        actionBarMenuSubItem5.setTextAndIcon(LocaleController.getString("MediaShowPhotos", R.string.MediaShowPhotos), 0);
                        itemOptionsMakeOptions2.getLayout().addView(actionBarMenuSubItem5);
                        actionBarMenuSubItem6.setTextAndIcon(LocaleController.getString("MediaShowVideos", R.string.MediaShowVideos), 0);
                        itemOptionsMakeOptions2.getLayout().addView(actionBarMenuSubItem6);
                        if (zIsAnyStoryPageType) {
                            final StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = SharedMediaLayout.this.storyAlbums_getStoriesAdapterByTabType(closestTab);
                            if (storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null && (storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList) != null) {
                                actionBarMenuSubItem5.setChecked(storiesList.showPhotos());
                                actionBarMenuSubItem6.setChecked(storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList.showVideos());
                            }
                            actionBarMenuSubItem5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view2) {
                                    this.f$0.lambda$onClick$17(actionBarMenuSubItem6, actionBarMenuSubItem5, storiesAdapterStoryAlbums_getStoriesAdapterByTabType, view2);
                                }
                            });
                            actionBarMenuSubItem6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view2) {
                                    this.f$0.lambda$onClick$18(actionBarMenuSubItem5, actionBarMenuSubItem6, storiesAdapterStoryAlbums_getStoriesAdapterByTabType, view2);
                                }
                            });
                        } else {
                            actionBarMenuSubItem5.setChecked(SharedMediaLayout.this.sharedMediaData[0].filterType == 0 || SharedMediaLayout.this.sharedMediaData[0].filterType == 1);
                            actionBarMenuSubItem5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view2) {
                                    if (SharedMediaLayout.this.changeTypeAnimation) {
                                        return;
                                    }
                                    if (!actionBarMenuSubItem6.getCheckView().isChecked() && actionBarMenuSubItem5.getCheckView().isChecked()) {
                                        ActionBarMenuSubItem actionBarMenuSubItem7 = actionBarMenuSubItem5;
                                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                        AndroidUtilities.shakeViewSpring(actionBarMenuSubItem7, sharedMediaLayout2.shiftDp = -sharedMediaLayout2.shiftDp);
                                        return;
                                    }
                                    actionBarMenuSubItem5.setChecked(!r3.getCheckView().isChecked());
                                    if (!actionBarMenuSubItem5.getCheckView().isChecked() || !actionBarMenuSubItem6.getCheckView().isChecked()) {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 2;
                                    } else {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 0;
                                    }
                                    SharedMediaLayout.this.changeMediaFilterType();
                                }
                            });
                            if (SharedMediaLayout.this.sharedMediaData[0].filterType != 0 && SharedMediaLayout.this.sharedMediaData[0].filterType != 2) {
                                z2 = false;
                            }
                            actionBarMenuSubItem6.setChecked(z2);
                            actionBarMenuSubItem6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view2) {
                                    if (SharedMediaLayout.this.changeTypeAnimation) {
                                        return;
                                    }
                                    if (!actionBarMenuSubItem5.getCheckView().isChecked() && actionBarMenuSubItem6.getCheckView().isChecked()) {
                                        ActionBarMenuSubItem actionBarMenuSubItem7 = actionBarMenuSubItem6;
                                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                        AndroidUtilities.shakeViewSpring(actionBarMenuSubItem7, sharedMediaLayout2.shiftDp = -sharedMediaLayout2.shiftDp);
                                        return;
                                    }
                                    actionBarMenuSubItem6.setChecked(!r3.getCheckView().isChecked());
                                    if (!actionBarMenuSubItem5.getCheckView().isChecked() || !actionBarMenuSubItem6.getCheckView().isChecked()) {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 1;
                                    } else {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 0;
                                    }
                                    SharedMediaLayout.this.changeMediaFilterType();
                                }
                            });
                        }
                    }
                }
                itemOptionsMakeOptions2.setDismissWithButtons(false).setOnTopOfScrim().setDimAlpha(0).show();
                return;
            }
            ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem).add(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onClick$8();
                }
            }).addGap().add(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onClick$9();
                }
            }).add(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onClick$11();
                }
            }).translate(0.0f, -AndroidUtilities.dp(52.0f)).setDimAlpha(0).show();
        }

        public void lambda$onClick$0(ItemOptions itemOptions) {
            SharedMediaLayout.this.giftsContainer.createCollection();
            itemOptions.dismiss();
        }

        public void lambda$onClick$1(ItemOptions itemOptions) {
            SharedMediaLayout.this.giftsContainer.setReordering(true);
            itemOptions.dismiss();
        }

        public static void lambda$onClick$2(ActionBarMenuSubItem actionBarMenuSubItem, StarsController.GiftsList giftsList, ActionBarMenuSubItem actionBarMenuSubItem2, ActionBarMenuSubItem actionBarMenuSubItem3, ActionBarMenuSubItem actionBarMenuSubItem4, ActionBarMenuSubItem actionBarMenuSubItem5, boolean z, ActionBarMenuSubItem actionBarMenuSubItem6, ActionBarMenuSubItem actionBarMenuSubItem7) {
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(giftsList.sort_by_date ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), giftsList.sort_by_date ? R.drawable.menu_sort_value : R.drawable.menu_sort_date);
            }
            actionBarMenuSubItem2.setChecked(giftsList.isInclude_unlimited());
            actionBarMenuSubItem3.setChecked(giftsList.isInclude_limited());
            actionBarMenuSubItem4.setChecked(giftsList.isInclude_upgradable());
            actionBarMenuSubItem5.setChecked(giftsList.isInclude_unique());
            if (z) {
                actionBarMenuSubItem6.setChecked(giftsList.isInclude_displayed());
                actionBarMenuSubItem7.setChecked(giftsList.isInclude_hidden());
            }
        }

        public static void lambda$onClick$3(StarsController.GiftsList giftsList, Runnable runnable, View view) {
            giftsList.sort_by_date = !giftsList.sort_by_date;
            runnable.run();
            giftsList.invalidate(true);
        }

        public void lambda$onClick$4() {
            StoryRecorder.getInstance(SharedMediaLayout.this.profileActivity.getParentActivity(), SharedMediaLayout.this.profileActivity.getCurrentAccount()).openBot(SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.botPreviewsContainer.getCurrentLang(), null);
        }

        public void lambda$onClick$5() {
            SharedMediaLayout.this.botPreviewsContainer.selectAll();
        }

        public void lambda$onClick$6() {
            if (SharedMediaLayout.this.botPreviewsContainer.isSelectedAll()) {
                SharedMediaLayout.this.botPreviewsContainer.unselectAll();
            } else {
                SharedMediaLayout.this.botPreviewsContainer.selectAll();
            }
        }

        public void lambda$onClick$7() {
            SharedMediaLayout.this.botPreviewsContainer.deleteLang(SharedMediaLayout.this.botPreviewsContainer.getCurrentLang());
        }

        public void lambda$onClick$8() {
            SharedMediaLayout.this.profileActivity.getMessagesController().setSavedViewAs(false);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId());
            SharedMediaLayout.this.profileActivity.presentFragment(new ChatActivity(bundle), true);
        }

        public void lambda$onClick$9() {
            try {
                SharedMediaLayout.this.profileActivity.getMediaDataController().installShortcut(SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$onClick$11() {
            final TLRPC.User currentUser = SharedMediaLayout.this.profileActivity.getUserConfig().getCurrentUser();
            AlertsCreator.createClearOrDeleteDialogAlert(SharedMediaLayout.this.profileActivity, false, null, currentUser, false, true, false, true, new MessagesStorage.BooleanCallback() {
                @Override
                public final void run(boolean z) {
                    this.f$0.lambda$onClick$10(currentUser, z);
                }
            });
        }

        public void lambda$onClick$10(TLRPC.User user, boolean z) {
            SharedMediaLayout.this.profileActivity.finishFragment();
            if (SharedMediaLayout.this.profileActivity instanceof NotificationCenter.NotificationCenterDelegate) {
                SharedMediaLayout.this.profileActivity.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) SharedMediaLayout.this.profileActivity, NotificationCenter.closeChats);
            }
            SharedMediaLayout.this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            SharedMediaLayout.this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(SharedMediaLayout.this.dialog_id), user, null, Boolean.valueOf(z));
            SharedMediaLayout.this.profileActivity.getMessagesController().setSavedViewAs(false);
        }

        public void lambda$onClick$13(String str) {
            StoriesController storiesController = SharedMediaLayout.this.getStoriesController();
            long j = SharedMediaLayout.this.dialog_id;
            final SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            storiesController.createAlbum(j, str, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    SharedMediaLayout.access$3800(sharedMediaLayout, (StoriesController.StoryAlbum) obj);
                }
            });
        }

        public void lambda$onClick$14(Theme.ResourcesProvider resourcesProvider, ItemOptions itemOptions) {
            AlertsCreator.createStoriesAlbumEnterNameForCreate(SharedMediaLayout.this.getContext(), SharedMediaLayout.this.profileActivity, resourcesProvider, new MessagesStorage.StringCallback() {
                @Override
                public final void run(String str) {
                    this.f$0.lambda$onClick$13(str);
                }
            });
            itemOptions.dismiss();
        }

        public void lambda$onClick$15(int i, ItemOptions itemOptions) {
            SharedMediaLayout.this.showMediaCalendar(i, false);
            itemOptions.dismiss();
        }

        public void lambda$onClick$16(ItemOptions itemOptions) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", 2);
            bundle.putLong("dialog_id", -SharedMediaLayout.this.info.id);
            MediaActivity mediaActivity = new MediaActivity(bundle, null);
            mediaActivity.setChatInfo(SharedMediaLayout.this.info);
            SharedMediaLayout.this.profileActivity.presentFragment(mediaActivity);
            itemOptions.dismiss();
        }

        public void lambda$onClick$17(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, StoriesAdapter storiesAdapter, View view) {
            if (SharedMediaLayout.this.changeTypeAnimation) {
                return;
            }
            if (!actionBarMenuSubItem.getCheckView().isChecked() && actionBarMenuSubItem2.getCheckView().isChecked()) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                AndroidUtilities.shakeViewSpring(view, sharedMediaLayout.shiftDp = -sharedMediaLayout.shiftDp);
                return;
            }
            actionBarMenuSubItem2.getCheckView().setChecked(!actionBarMenuSubItem2.getCheckView().isChecked(), true);
            StoriesController.StoriesList storiesList = storiesAdapter.storiesList;
            if (storiesList == null) {
                return;
            }
            storiesList.updateFilters(actionBarMenuSubItem2.getCheckView().isChecked(), actionBarMenuSubItem.getCheckView().isChecked());
        }

        public void lambda$onClick$18(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, StoriesAdapter storiesAdapter, View view) {
            if (SharedMediaLayout.this.changeTypeAnimation) {
                return;
            }
            if (!actionBarMenuSubItem.getCheckView().isChecked() && actionBarMenuSubItem2.getCheckView().isChecked()) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                AndroidUtilities.shakeViewSpring(view, sharedMediaLayout.shiftDp = -sharedMediaLayout.shiftDp);
                return;
            }
            actionBarMenuSubItem2.getCheckView().setChecked(!actionBarMenuSubItem2.getCheckView().isChecked(), true);
            StoriesController.StoriesList storiesList = storiesAdapter.storiesList;
            if (storiesList == null) {
                return;
            }
            storiesList.updateFilters(actionBarMenuSubItem.getCheckView().isChecked(), actionBarMenuSubItem2.getCheckView().isChecked());
        }
    }

    public void lambda$new$3(View view) {
        closeActionMode();
    }

    public void lambda$new$4(View view) {
        onActionBarItemClick(view, 102);
    }

    public void lambda$new$5(View view) {
        onActionBarItemClick(view, 100);
    }

    public void lambda$new$6(View view) {
        onActionBarItemClick(view, 103);
    }

    public void lambda$new$7(View view) {
        onActionBarItemClick(view, 104);
    }

    public void lambda$new$8(View view) {
        onActionBarItemClick(view, 101);
    }

    class AnonymousClass12 extends BotPreviewsEditContainer {
        AnonymousClass12(Context context, BaseFragment baseFragment, long j) {
            super(context, baseFragment, j);
        }

        @Override
        public void onSelectedTabChanged() {
            SharedMediaLayout.this.onSelectedTabChanged();
        }

        @Override
        protected boolean isSelected(MessageObject messageObject) {
            return SharedMediaLayout.this.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
        }

        @Override
        protected boolean select(MessageObject messageObject) {
            if (messageObject == null) {
                return false;
            }
            char c = messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1;
            if (SharedMediaLayout.this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0 || SharedMediaLayout.this.selectedFiles[0].size() + SharedMediaLayout.this.selectedFiles[1].size() >= 100) {
                return false;
            }
            SharedMediaLayout.this.selectedFiles[c].put(messageObject.getId(), messageObject);
            if (!messageObject.canDeleteMessage(false, null)) {
                SharedMediaLayout.access$4908(SharedMediaLayout.this);
            }
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (!sharedMediaLayout.isActionModeShowed) {
                AndroidUtilities.hideKeyboard(sharedMediaLayout.profileActivity.getParentActivity().getCurrentFocus());
                int i = 8;
                SharedMediaLayout.this.deleteItem.setVisibility(SharedMediaLayout.this.cantDeleteMessagesCount == 0 ? 0 : 8);
                if (SharedMediaLayout.this.gotoItem != null) {
                    SharedMediaLayout.this.gotoItem.setVisibility((SharedMediaLayout.this.getClosestTab() == 8 || SharedMediaLayout.this.getClosestTab() == 13) ? 8 : 0);
                }
                if (SharedMediaLayout.this.pinItem != null) {
                    SharedMediaLayout.this.pinItem.setVisibility(8);
                }
                if (SharedMediaLayout.this.unpinItem != null) {
                    SharedMediaLayout.this.unpinItem.setVisibility(8);
                }
                if (SharedMediaLayout.this.forwardItem != null) {
                    ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.forwardItem;
                    if (SharedMediaLayout.this.getClosestTab() != 8 && SharedMediaLayout.this.getClosestTab() != 13) {
                        i = 0;
                    }
                    actionBarMenuItem.setVisibility(i);
                }
                SharedMediaLayout.this.selectedMessagesCountTextView.setNumber(SharedMediaLayout.this.selectedFiles[0].size() + SharedMediaLayout.this.selectedFiles[1].size(), false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < SharedMediaLayout.this.actionModeViews.size(); i2++) {
                    View view = (View) SharedMediaLayout.this.actionModeViews.get(i2);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(250L);
                animatorSet.start();
                SharedMediaLayout.this.scrolling = false;
                SharedMediaLayout.this.showActionMode(true);
            } else {
                sharedMediaLayout.selectedMessagesCountTextView.setNumber(SharedMediaLayout.this.selectedFiles[0].size() + SharedMediaLayout.this.selectedFiles[1].size(), true);
            }
            updateSelection(true);
            return true;
        }

        @Override
        protected boolean unselect(MessageObject messageObject) {
            if (messageObject == null) {
                return false;
            }
            char c = messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1;
            if (SharedMediaLayout.this.selectedFiles[c].indexOfKey(messageObject.getId()) < 0) {
                return false;
            }
            SharedMediaLayout.this.selectedFiles[c].remove(messageObject.getId());
            if (!messageObject.canDeleteMessage(false, null)) {
                SharedMediaLayout.access$4910(SharedMediaLayout.this);
            }
            if (SharedMediaLayout.this.selectedFiles[0].size() != 0 || SharedMediaLayout.this.selectedFiles[1].size() != 0) {
                SharedMediaLayout.this.selectedMessagesCountTextView.setNumber(SharedMediaLayout.this.selectedFiles[0].size() + SharedMediaLayout.this.selectedFiles[1].size(), true);
            } else {
                AndroidUtilities.hideKeyboard(SharedMediaLayout.this.profileActivity.getParentActivity().getCurrentFocus());
                SharedMediaLayout.this.selectedFiles[0].clear();
                SharedMediaLayout.this.selectedFiles[1].clear();
                int i = 8;
                SharedMediaLayout.this.deleteItem.setVisibility(SharedMediaLayout.this.cantDeleteMessagesCount == 0 ? 0 : 8);
                if (SharedMediaLayout.this.gotoItem != null) {
                    SharedMediaLayout.this.gotoItem.setVisibility((SharedMediaLayout.this.getClosestTab() == 8 || SharedMediaLayout.this.getClosestTab() == 13) ? 8 : 0);
                }
                if (SharedMediaLayout.this.pinItem != null) {
                    SharedMediaLayout.this.pinItem.setVisibility(8);
                }
                if (SharedMediaLayout.this.unpinItem != null) {
                    SharedMediaLayout.this.unpinItem.setVisibility(8);
                }
                if (SharedMediaLayout.this.forwardItem != null) {
                    ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.forwardItem;
                    if (SharedMediaLayout.this.getClosestTab() != 8 && SharedMediaLayout.this.getClosestTab() != 13) {
                        i = 0;
                    }
                    actionBarMenuItem.setVisibility(i);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < SharedMediaLayout.this.actionModeViews.size(); i2++) {
                    View view = (View) SharedMediaLayout.this.actionModeViews.get(i2);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(250L);
                animatorSet.start();
                SharedMediaLayout.this.scrolling = false;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$unselect$0();
                    }
                }, 20L);
            }
            updateSelection(true);
            return true;
        }

        public void lambda$unselect$0() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.isActionModeShowed) {
                sharedMediaLayout.showActionMode(false);
            }
        }

        @Override
        protected boolean isActionModeShowed() {
            return SharedMediaLayout.this.isActionModeShowed;
        }

        @Override
        public int getStartedTrackingX() {
            return SharedMediaLayout.this.startedTrackingX;
        }
    }

    public void lambda$new$9(View view) {
        if (this.saveItem.getAlpha() < 0.1f) {
            return;
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null && profileGiftsContainer.isReordering()) {
            this.giftsContainer.resetReordering();
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs == null || !profileStoriesCollectionTabs.isReordering()) {
            return;
        }
        saveAndStopAlbumsReorder();
    }

    class AnonymousClass13 extends ProfileGiftsContainer {
        AnonymousClass13(BaseFragment baseFragment, Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
            super(baseFragment, context, i, j, resourcesProvider);
        }

        @Override
        protected int processColor(int i) {
            return SharedMediaLayout.this.processColor(i);
        }

        @Override
        protected void updatedReordering(final boolean z) {
            SharedMediaLayout.this.saveItem.setVisibility(0);
            SharedMediaLayout.this.saveItem.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.4f).scaleY(z ? 1.0f : 0.4f).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updatedReordering$0(z);
                }
            }).start();
            SharedMediaLayout.this.updateOptionsSearch(true);
        }

        public void lambda$updatedReordering$0(boolean z) {
            if (z) {
                return;
            }
            SharedMediaLayout.this.saveItem.setVisibility(0);
        }
    }

    class AnonymousClass14 implements ProfileStoriesCollectionTabs.Delegate {
        final Context val$context;
        final BaseFragment val$parent;
        final Theme.ResourcesProvider val$resourcesProvider;

        AnonymousClass14(Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
            this.val$context = context;
            this.val$parent = baseFragment;
            this.val$resourcesProvider = resourcesProvider;
        }

        @Override
        public void onTabAlbumSelected(int i, boolean z) {
            if (i <= 0) {
                SharedMediaLayout.this.openStoryTabIdPage(8, z);
            } else {
                SharedMediaLayout.this.openStoryTabIdPage(SharedMediaLayout.this.storyAlbums_getByAlbumId(i).tabType, z);
            }
        }

        @Override
        public void onTabAlbumScrollEnd(int i) {
            SharedMediaLayout.this.onPageMediaProgress(1.0f);
        }

        @Override
        public void onTabAlbumAnimationUpdate(float f) {
            SharedMediaLayout.this.onPageMediaProgress(f);
        }

        @Override
        public void onTabAlbumCreateCollection() {
            AlertsCreator.createStoriesAlbumEnterNameForCreate(this.val$context, this.val$parent, this.val$resourcesProvider, new MessagesStorage.StringCallback() {
                @Override
                public final void run(String str) {
                    this.f$0.lambda$onTabAlbumCreateCollection$1(str);
                }
            });
        }

        public void lambda$onTabAlbumCreateCollection$1(String str) {
            StoriesController storiesController = SharedMediaLayout.this.getStoriesController();
            long j = SharedMediaLayout.this.dialog_id;
            final SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            storiesController.createAlbum(j, str, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    SharedMediaLayout.access$3800(sharedMediaLayout, (StoriesController.StoryAlbum) obj);
                }
            });
        }

        @Override
        public void onTabAlbumLongClick(View view, final int i) {
            if (SharedMediaLayout.this.getStoriesController().canEditStoryAlbums(SharedMediaLayout.this.dialog_id)) {
                ItemOptions scrimViewBackground = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, view).setScrimViewBackground(new Drawable() {
                    private final Drawable bg;
                    private final Rect bgBounds = new Rect();

                    @Override
                    public int getOpacity() {
                        return -2;
                    }

                    @Override
                    public void setColorFilter(ColorFilter colorFilter) {
                    }

                    {
                        this.bg = Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, AnonymousClass14.this.val$resourcesProvider), Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, AnonymousClass14.this.val$resourcesProvider), 0.04f)));
                    }

                    @Override
                    public void draw(Canvas canvas) {
                        this.bgBounds.set(getBounds());
                        this.bgBounds.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                        this.bg.setBounds(this.bgBounds);
                        this.bg.draw(canvas);
                    }

                    @Override
                    public void setAlpha(int i2) {
                        this.bg.setAlpha(i2);
                    }
                });
                scrimViewBackground.add(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onTabAlbumLongClick$2(i);
                    }
                });
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                sharedMediaLayout.addStoryAlbumShareItemOptions(scrimViewBackground, sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
                scrimViewBackground.add(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onTabAlbumLongClick$3(i);
                    }
                });
                scrimViewBackground.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onTabAlbumLongClick$4(i);
                    }
                });
                scrimViewBackground.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), true, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onTabAlbumLongClick$5(i);
                    }
                });
                scrimViewBackground.show();
            }
        }

        public void lambda$onTabAlbumLongClick$2(int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.openAddStoriesToAlbumSheet(sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
        }

        public void lambda$onTabAlbumLongClick$3(int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.openRenameStoriesAlbumAlert(sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
        }

        public void lambda$onTabAlbumLongClick$4(int i) {
            SharedMediaLayout.this.lambda$onItemLongClick$58(i);
        }

        public void lambda$onTabAlbumLongClick$5(int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.openDeleteStoriesAlbumAlert(sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
        }
    }

    class AnonymousClass15 extends ProfileStoriesCollectionTabs {
        AnonymousClass15(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, StoriesController.StoriesCollections storiesCollections, ProfileStoriesCollectionTabs.Delegate delegate) {
            super(context, sizeNotifierFrameLayout, storiesCollections, delegate);
        }

        @Override
        protected void updatedReordering(final boolean z) {
            SharedMediaLayout.this.saveItem.setVisibility(0);
            SharedMediaLayout.this.saveItem.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.4f).scaleY(z ? 1.0f : 0.4f).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updatedReordering$0(z);
                }
            }).start();
            SharedMediaLayout.this.updateOptionsSearch(true);
        }

        public void lambda$updatedReordering$0(boolean z) {
            if (z) {
                return;
            }
            SharedMediaLayout.this.saveItem.setVisibility(0);
        }

        @Override
        protected void onVisibilityChange(float f) {
            super.onVisibilityChange(f);
            if (SharedMediaLayout.this.mediaPages != null) {
                for (MediaPage mediaPage : SharedMediaLayout.this.mediaPages) {
                    if (mediaPage != null && mediaPage.listView != null) {
                        InternalListView internalListView = mediaPage.listView;
                        int paddingLeft = mediaPage.listView.getPaddingLeft();
                        int pagePaddingTop = SharedMediaLayout.this.getPagePaddingTop(mediaPage.selectedType);
                        int paddingRight = mediaPage.listView.getPaddingRight();
                        InternalListView internalListView2 = mediaPage.listView;
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        int pagePaddingBottom = sharedMediaLayout.getPagePaddingBottom(sharedMediaLayout.isStoriesView());
                        internalListView2.hintPaddingBottom = pagePaddingBottom;
                        internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
                    }
                }
            }
            SharedMediaLayout.this.checkUi_topPanelLayoutY();
        }
    }

    public void lambda$new$28(MediaPage mediaPage, final Context context, final long j, final Theme.ResourcesProvider resourcesProvider, View view, int i, final float f, final float f2) throws IOException {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long peerId;
        int i2 = mediaPage.selectedType;
        if (i2 == 7) {
            if (!(view instanceof UserCell)) {
                RecyclerView.Adapter adapter = mediaPage.listView.getAdapter();
                GroupUsersSearchAdapter groupUsersSearchAdapter = this.groupUsersSearchAdapter;
                if (adapter == groupUsersSearchAdapter) {
                    TLObject item = groupUsersSearchAdapter.getItem(i);
                    if (item instanceof TLRPC.ChannelParticipant) {
                        peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer);
                    } else if (!(item instanceof TLRPC.ChatParticipant)) {
                        return;
                    } else {
                        peerId = ((TLRPC.ChatParticipant) item).user_id;
                    }
                    if (peerId == 0 || peerId == this.profileActivity.getUserConfig().getClientUserId()) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", peerId);
                    this.profileActivity.presentFragment(new ProfileActivity(bundle));
                    return;
                }
                return;
            }
            int iIntValue = !this.chatUsersAdapter.sortedUsers.isEmpty() ? ((Integer) this.chatUsersAdapter.sortedUsers.get(i)).intValue() : i;
            TLRPC.ChatParticipant chatParticipant = this.chatUsersAdapter.chatInfo.participants.participants.get(iIntValue);
            if (iIntValue < 0 || iIntValue >= this.chatUsersAdapter.chatInfo.participants.participants.size()) {
                return;
            }
            onMemberClick(chatParticipant, false, view);
            return;
        }
        if (i2 == 6 && (view instanceof ProfileSearchCell)) {
            TLRPC.Chat chat = ((ProfileSearchCell) view).getChat();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", chat.id);
            if (this.profileActivity.getMessagesController().checkCanOpenChat(bundle2, this.profileActivity)) {
                if (chat.forum) {
                    BaseFragment baseFragment = this.profileActivity;
                    baseFragment.presentFragment(TopicsFragment.getTopicsOrChat(baseFragment, bundle2));
                    return;
                } else {
                    this.profileActivity.presentFragment(new ChatActivity(bundle2));
                    return;
                }
            }
            return;
        }
        if (i2 == 1 && (view instanceof SharedDocumentCell)) {
            onItemClick(i, view, ((SharedDocumentCell) view).getMessage(), 0, mediaPage.selectedType);
            return;
        }
        if (i2 == 3 && (view instanceof SharedLinkCell)) {
            onItemClick(i, view, ((SharedLinkCell) view).getMessage(), 0, mediaPage.selectedType);
            return;
        }
        if ((i2 == 2 || i2 == 4) && (view instanceof SharedAudioCell)) {
            onItemClick(i, view, ((SharedAudioCell) view).getMessage(), 0, mediaPage.selectedType);
            return;
        }
        if (i2 == 5 && (view instanceof ContextLinkCell)) {
            onItemClick(i, view, (MessageObject) ((ContextLinkCell) view).getParentObject(), 0, mediaPage.selectedType);
            return;
        }
        if (i2 == 0 && (view instanceof SharedPhotoVideoCell2)) {
            final SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
            MessageObject messageObject = sharedPhotoVideoCell2.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                BaseFragment baseFragment2 = this.profileActivity;
                if (baseFragment2 == null) {
                    return;
                }
                final int currentAccount = baseFragment2.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final AlertDialog alertDialog = new AlertDialog(context, 3);
                alertDialog.showDelayed(200L);
                messagesController.getContentSettings(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$new$15(alertDialog, messagesController, context, sharedPhotoVideoCell2, f, f2, currentAccount, (TL_account.contentSettings) obj);
                    }
                });
                return;
            }
            if (sharedPhotoVideoCell2.canRevealSpoiler()) {
                sharedPhotoVideoCell2.startRevealMedia(f, f2);
                return;
            } else {
                if (messageObject != null) {
                    onItemClick(i, view, messageObject, 0, mediaPage.selectedType);
                    return;
                }
                return;
            }
        }
        if (isAnyStoryPageType(i2) && (view instanceof SharedPhotoVideoCell2)) {
            MessageObject messageObject2 = ((SharedPhotoVideoCell2) view).getMessageObject();
            if (messageObject2 != null) {
                onItemClick(i, view, messageObject2, 0, mediaPage.selectedType);
                return;
            }
            return;
        }
        int i3 = mediaPage.selectedType;
        if (i3 == 10) {
            if (((view instanceof ProfileSearchCell) || f2 < AndroidUtilities.dp(60.0f)) && i >= 0 && i < this.channelRecommendationsAdapter.chats.size()) {
                Bundle bundle3 = new Bundle();
                TLObject tLObject = (TLObject) this.channelRecommendationsAdapter.chats.get(i);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle3.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle3.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                this.profileActivity.presentFragment(new ChatActivity(bundle3));
                return;
            }
            return;
        }
        if (i3 == 11) {
            RecyclerView.Adapter adapter2 = mediaPage.listView.getAdapter();
            SavedMessagesSearchAdapter savedMessagesSearchAdapter = this.savedMessagesSearchAdapter;
            if (adapter2 != savedMessagesSearchAdapter) {
                if (this.isActionModeShowed) {
                    if (this.savedDialogsAdapter.itemTouchHelper.isIdle()) {
                        this.savedDialogsAdapter.select(view);
                        return;
                    }
                    return;
                }
                Bundle bundle4 = new Bundle();
                if (i < 0 || i >= this.savedDialogsAdapter.dialogs.size()) {
                    return;
                }
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) this.savedDialogsAdapter.dialogs.get(i);
                bundle4.putLong("user_id", this.profileActivity.getUserConfig().getClientUserId());
                bundle4.putInt("chatMode", 3);
                ChatActivity chatActivity = new ChatActivity(bundle4);
                chatActivity.setSavedDialog(savedDialog.dialogId);
                this.profileActivity.presentFragment(chatActivity);
                return;
            }
            if (i < 0) {
                return;
            }
            if (i < savedMessagesSearchAdapter.dialogs.size()) {
                SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) this.savedMessagesSearchAdapter.dialogs.get(i);
                Bundle bundle5 = new Bundle();
                bundle5.putLong("user_id", this.profileActivity.getUserConfig().getClientUserId());
                bundle5.putInt("chatMode", 3);
                ChatActivity chatActivity2 = new ChatActivity(bundle5);
                chatActivity2.setSavedDialog(savedDialog2.dialogId);
                this.profileActivity.presentFragment(chatActivity2);
                return;
            }
            final int size = i - this.savedMessagesSearchAdapter.dialogs.size();
            if (size < this.savedMessagesSearchAdapter.messages.size()) {
                MessageObject messageObject3 = (MessageObject) this.savedMessagesSearchAdapter.messages.get(size);
                Bundle bundle6 = new Bundle();
                bundle6.putLong("user_id", this.profileActivity.getUserConfig().getClientUserId());
                bundle6.putInt("message_id", messageObject3.getId());
                ChatActivity chatActivity3 = new ChatActivity(bundle6) {
                    boolean firstCreateView = true;

                    @Override
                    public void onTransitionAnimationStart(boolean z, boolean z2) {
                        if (this.firstCreateView) {
                            if (this.searchItem != null) {
                                lambda$openSearchWithText$364("");
                                this.searchItem.setSearchFieldText(SharedMediaLayout.this.savedMessagesSearchAdapter.lastQuery, false);
                            }
                            SearchTagsList searchTagsList = this.actionBarSearchTags;
                            if (searchTagsList != null) {
                                searchTagsList.setChosen(SharedMediaLayout.this.savedMessagesSearchAdapter.lastReaction, false);
                            }
                            SharedMediaLayout.this.profileActivity.getMediaDataController().portSavedSearchResults(getClassGuid(), SharedMediaLayout.this.savedMessagesSearchAdapter.lastReaction, SharedMediaLayout.this.savedMessagesSearchAdapter.lastQuery, SharedMediaLayout.this.savedMessagesSearchAdapter.cachedMessages, SharedMediaLayout.this.savedMessagesSearchAdapter.loadedMessages, size, SharedMediaLayout.this.savedMessagesSearchAdapter.count, SharedMediaLayout.this.savedMessagesSearchAdapter.endReached);
                            this.firstCreateView = false;
                        }
                        super.onTransitionAnimationStart(z, z2);
                    }
                };
                chatActivity3.setHighlightMessageId(messageObject3.getId());
                this.profileActivity.presentFragment(chatActivity3);
                return;
            }
            return;
        }
        if (i3 == 15 && (view instanceof ChatMessageCell)) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            final MessageObject messageObject4 = chatMessageCell.getMessageObject();
            mediaPage.listView.stopScroll();
            final int currentAccount2 = this.profileActivity.getCurrentAccount();
            TLRPC.Chat chat2 = this.profileActivity.getMessagesController().getChat(Long.valueOf(j));
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(mediaPage, resourcesProvider, chatMessageCell);
            itemOptionsMakeOptions.offsetByContainer();
            itemOptionsMakeOptions.setGravity(messageObject4.isOutOwner() ? 5 : 3);
            itemOptionsMakeOptions.add(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$16(j, messageObject4);
                }
            });
            if (!messageObject4.isPollClosed()) {
                if (messageObject4.canUnvote()) {
                    itemOptionsMakeOptions.add(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$new$20(resourcesProvider, currentAccount2, messageObject4);
                        }
                    });
                }
                if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                    itemOptionsMakeOptions.add(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$new$27(resourcesProvider, messageObject4, currentAccount2);
                        }
                    });
                }
            }
            itemOptionsMakeOptions.show();
        }
    }

    public void lambda$new$15(AlertDialog alertDialog, final MessagesController messagesController, final Context context, final SharedPhotoVideoCell2 sharedPhotoVideoCell2, final float f, final float f2, final int i, final TL_account.contentSettings contentsettings) {
        alertDialog.dismissUnless(200L);
        final boolean z = messagesController.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController.verifyAgeBotUsername);
        boolean z2 = (contentsettings == null || !contentsettings.sensitive_can_change) && z;
        final boolean[] zArr = new boolean[1];
        FrameLayout frameLayout = new FrameLayout(context);
        if (z) {
            zArr[0] = true;
        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
            BaseFragment baseFragment = this.profileActivity;
            CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, baseFragment == null ? null : baseFragment.getResourceProvider());
            checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
            checkBoxCell.setText(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false);
            checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SharedMediaLayout.lambda$new$10(zArr, view);
                }
            });
        }
        BaseFragment baseFragment2 = this.profileActivity;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(context, baseFragment2 == null ? null : baseFragment2.getResourceProvider()).setTitle(LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle)).setMessage(LocaleController.getString(z2 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText)).setView(frameLayout).setCustomViewOffset(9).setNegativeButton(LocaleController.getString(z2 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
        if (!z2) {
            negativeButton.setPositiveButton(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    SharedMediaLayout.lambda$new$14(sharedPhotoVideoCell2, f, f2, zArr, z, contentsettings, context, i, messagesController, alertDialog2, i2);
                }
            });
        }
        BaseFragment baseFragment3 = this.profileActivity;
        if (baseFragment3 != null && baseFragment3.getContext() != null) {
            this.profileActivity.showDialog(negativeButton.create());
        } else {
            negativeButton.show();
        }
    }

    public static void lambda$new$10(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$new$14(final SharedPhotoVideoCell2 sharedPhotoVideoCell2, final float f, final float f2, boolean[] zArr, boolean z, TL_account.contentSettings contentsettings, Context context, int i, final MessagesController messagesController, AlertDialog alertDialog, int i2) {
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                sharedPhotoVideoCell2.startRevealMedia(f, f2);
            }
        };
        if (zArr[0]) {
            if (z || (contentsettings != null && contentsettings.sensitive_can_change)) {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                ThemeActivity.verifyAge(context, i, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        SharedMediaLayout.lambda$new$13(messagesController, callback, (Boolean) obj);
                    }
                }, safeLastFragment == null ? null : safeLastFragment.getResourceProvider());
                return;
            } else {
                callback.run(Boolean.TRUE);
                return;
            }
        }
        callback.run(Boolean.FALSE);
    }

    public static void lambda$new$13(MessagesController messagesController, Utilities.Callback callback, Boolean bool) {
        final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!bool.booleanValue()) {
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText)).show();
            }
        } else {
            messagesController.setContentSettings(true);
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletinDetail(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new Runnable() {
                    @Override
                    public final void run() {
                        SharedMediaLayout.lambda$new$12(safeLastFragment);
                    }
                }), true)).show(true);
            }
            callback.run(Boolean.TRUE);
        }
    }

    public static void lambda$new$12(BaseFragment baseFragment) {
        baseFragment.presentFragment(new ThemeActivity(0).highlightSensitiveRow());
    }

    public void lambda$new$16(long j, MessageObject messageObject) {
        this.profileActivity.presentFragment(ChatActivity.of(j, messageObject.getId()));
    }

    public void lambda$new$20(Theme.ResourcesProvider resourcesProvider, final int i, MessageObject messageObject) {
        final AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3, resourcesProvider)};
        final int iSendVote = SendMessagesHelper.getInstance(i).sendVote(messageObject, null, new Runnable() {
            @Override
            public final void run() {
                SharedMediaLayout.lambda$new$17(alertDialogArr);
            }
        });
        if (iSendVote != 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SharedMediaLayout.lambda$new$19(alertDialogArr, i, iSendVote);
                }
            }, 500L);
        }
    }

    public static void lambda$new$17(AlertDialog[] alertDialogArr) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
    }

    public static void lambda$new$19(AlertDialog[] alertDialogArr, final int i, final int i2) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                SharedMediaLayout.lambda$new$18(i, i2, dialogInterface);
            }
        });
        alertDialogArr[0].show();
    }

    public static void lambda$new$18(int i, int i2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    public void lambda$new$27(final Theme.ResourcesProvider resourcesProvider, final MessageObject messageObject, final int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), resourcesProvider);
        builder.setDimEnabled(false);
        if (messageObject.isQuiz()) {
            builder.setTitle(LocaleController.getString(R.string.StopQuizAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.StopQuizAlertText));
        } else {
            builder.setTitle(LocaleController.getString(R.string.StopPollAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.StopPollAlertText));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Stop), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                this.f$0.lambda$new$26(resourcesProvider, messageObject, i, alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.show();
    }

    public void lambda$new$26(Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, final int i, AlertDialog alertDialog, int i2) {
        final AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3, resourcesProvider)};
        final TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = MessagesController.getInstance(i).getInputPeer(this.dialog_id);
        tL_messages_editMessage.id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        final int iSendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$new$23(alertDialogArr, i, tL_messages_editMessage, tLObject, tL_error);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SharedMediaLayout.lambda$new$25(alertDialogArr, i, iSendRequest);
            }
        }, 500L);
    }

    public void lambda$new$23(final AlertDialog[] alertDialogArr, final int i, final TLRPC.TL_messages_editMessage tL_messages_editMessage, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SharedMediaLayout.lambda$new$21(alertDialogArr);
            }
        });
        if (tL_error == null) {
            MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$22(i, tL_error, tL_messages_editMessage);
                }
            });
        }
    }

    public static void lambda$new$21(AlertDialog[] alertDialogArr) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
    }

    public void lambda$new$22(int i, TLRPC.TL_error tL_error, TLRPC.TL_messages_editMessage tL_messages_editMessage) {
        AlertsCreator.processError(i, tL_error, this.profileActivity, tL_messages_editMessage, new Object[0]);
    }

    public static void lambda$new$25(AlertDialog[] alertDialogArr, final int i, final int i2) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                SharedMediaLayout.lambda$new$24(i, i2, dialogInterface);
            }
        });
        alertDialogArr[0].show();
    }

    public static void lambda$new$24(int i, int i2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    public void lambda$new$31() {
        this.topLayoutPadding = (int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f));
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null) {
            profileGiftsContainer.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(7.0f))));
        }
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr != null) {
            for (final MediaPage mediaPage : mediaPageArr) {
                if (mediaPage != null) {
                    int paddingTop = mediaPage.listView.getPaddingTop();
                    InternalListView internalListView = mediaPage.listView;
                    int paddingLeft = mediaPage.listView.getPaddingLeft();
                    int pagePaddingTop = getPagePaddingTop(mediaPage.selectedType);
                    int paddingRight = mediaPage.listView.getPaddingRight();
                    InternalListView internalListView2 = mediaPage.listView;
                    int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
                    internalListView2.hintPaddingBottom = pagePaddingBottom;
                    internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
                    final int paddingTop2 = paddingTop - mediaPage.listView.getPaddingTop();
                    AndroidUtilities.doOnLayout(mediaPage.listView, new Runnable() {
                        @Override
                        public final void run() {
                            SharedMediaLayout.lambda$new$30(mediaPage, paddingTop2);
                        }
                    });
                }
            }
        }
    }

    public static void lambda$new$30(MediaPage mediaPage, int i) {
        mediaPage.listView.scrollBy(0, i);
    }

    public void lambda$new$32(boolean z, boolean z2) {
        if (!z) {
            requestLayout();
        }
        setVisibleHeight(this.lastVisibleHeight);
    }

    public void lambda$new$33(Canvas canvas, RectF rectF) {
        IBlur3Capture iBlur3Capture;
        for (MediaPage mediaPage : this.mediaPages) {
            if (mediaPage.iBlur3Capture != null) {
                mediaPage.iBlur3Capture.capture(canvas, rectF);
            }
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer == null || (iBlur3Capture = profileGiftsContainer.iBlur3Capture) == null) {
            return;
        }
        iBlur3Capture.capture(canvas, rectF);
    }

    protected boolean isBot() {
        TLRPC.User user;
        return this.dialog_id > 0 && (user = MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(this.dialog_id))) != null && user.bot;
    }

    public void setStoriesFilter(boolean z, boolean z2) {
        StoriesController.StoriesList storiesList;
        StoriesController.StoriesList storiesList2;
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null && (storiesList2 = storiesAdapter.storiesList) != null) {
            storiesList2.updateFilters(z, z2);
        }
        StoriesAdapter storiesAdapter2 = this.archivedStoriesAdapter;
        if (storiesAdapter2 == null || (storiesList = storiesAdapter2.storiesList) == null) {
            return;
        }
        storiesList.updateFilters(z, z2);
    }

    public void setForwardRestrictedHint(HintView hintView) {
        this.fwdRestrictedHint = hintView;
    }

    public static int getMessageId(View view) {
        if (view instanceof SharedPhotoVideoCell2) {
            return ((SharedPhotoVideoCell2) view).getMessageId();
        }
        if (view instanceof SharedDocumentCell) {
            return ((SharedDocumentCell) view).getMessage().getId();
        }
        if (view instanceof SharedAudioCell) {
            return ((SharedAudioCell) view).getMessage().getId();
        }
        return 0;
    }

    private void updateForwardItem() {
        if (this.forwardItem == null) {
            return;
        }
        boolean z = this.profileActivity.getMessagesController().isPeerNoForwards(this.dialog_id) || hasNoforwardsMessage();
        this.forwardItem.setAlpha(z ? 0.5f : 1.0f);
        if (z && this.forwardItem.getBackground() != null) {
            this.forwardItem.setBackground(null);
        } else {
            if (z || this.forwardItem.getBackground() != null) {
                return;
            }
            this.forwardItem.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 5));
        }
    }

    private boolean hasNoforwardsMessage() {
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z = false;
        for (int i = 1; i >= 0; i--) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.selectedFiles[i].size(); i2++) {
                arrayList.add(Integer.valueOf(this.selectedFiles[i].keyAt(i2)));
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer num = (Integer) it.next();
                if (num.intValue() > 0 && (messageObject = (MessageObject) this.selectedFiles[i].get(num.intValue())) != null && (message = messageObject.messageOwner) != null && message.noforwards) {
                    z = true;
                    break;
                }
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    public void changeMediaFilterType() {
        final Bitmap bitmapCreateBitmap;
        final MediaPage mediaPage = getMediaPage(0);
        if (mediaPage != null && mediaPage.getMeasuredHeight() > 0 && mediaPage.getMeasuredWidth() > 0) {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(mediaPage.getMeasuredWidth(), mediaPage.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
                bitmapCreateBitmap = null;
            }
            if (bitmapCreateBitmap != null) {
                this.changeTypeAnimation = true;
                mediaPage.listView.draw(new Canvas(bitmapCreateBitmap));
                final View view = new View(mediaPage.getContext());
                view.setBackground(new BitmapDrawable(bitmapCreateBitmap));
                mediaPage.addView(view);
                view.animate().alpha(0.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SharedMediaLayout.this.changeTypeAnimation = false;
                        if (view.getParent() != null) {
                            mediaPage.removeView(view);
                            bitmapCreateBitmap.recycle();
                        }
                    }
                }).start();
                mediaPage.listView.setAlpha(0.0f);
                mediaPage.listView.animate().alpha(1.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SharedMediaLayout.lambda$changeMediaFilterType$34(mediaPage, valueAnimator);
                    }
                }).setDuration(200L).start();
            }
        }
        int[] lastMediaCount = this.sharedMediaPreloader.getLastMediaCount();
        ArrayList arrayList = this.sharedMediaPreloader.getSharedMediaData()[0].messages;
        this.sharedMediaData[0].setTotalCount(1, 0);
        SharedMediaData sharedMediaData = this.sharedMediaData[0];
        int i = sharedMediaData.filterType;
        if (i == 0) {
            sharedMediaData.setTotalCount(0, lastMediaCount[0]);
        } else if (i == 1) {
            sharedMediaData.setTotalCount(0, lastMediaCount[6]);
        } else {
            sharedMediaData.setTotalCount(0, lastMediaCount[7]);
        }
        this.sharedMediaData[0].fastScrollDataLoaded = false;
        jumpToDate(0, DialogObject.isEncryptedDialog(this.dialog_id) ? Integer.MIN_VALUE : Integer.MAX_VALUE, 0, true);
        loadFastScrollData(false);
        this.delegate.updateSelectedMediaTabText();
        boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(this.dialog_id);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i2);
            SharedMediaData sharedMediaData2 = this.sharedMediaData[0];
            int i3 = sharedMediaData2.filterType;
            if (i3 == 0) {
                sharedMediaData2.addMessage(messageObject, 0, false, zIsEncryptedDialog);
            } else if (i3 == 1) {
                if (messageObject.isPhoto()) {
                    this.sharedMediaData[0].addMessage(messageObject, 0, false, zIsEncryptedDialog);
                }
            } else if (!messageObject.isPhoto()) {
                this.sharedMediaData[0].addMessage(messageObject, 0, false, zIsEncryptedDialog);
            }
        }
    }

    public static void lambda$changeMediaFilterType$34(MediaPage mediaPage, ValueAnimator valueAnimator) {
        mediaPage.listView.invalidate();
    }

    public MediaPage getMediaPage(int i) {
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return null;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null && mediaPage.selectedType == i) {
                return mediaPage;
            }
            i2++;
        }
    }

    public void showMediaCalendar(int r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.showMediaCalendar(int, boolean):void");
    }

    private void startPinchToMediaColumnsCount(boolean z) {
        final MediaPage mediaPage;
        if (this.photoVideoChangeColumnsAnimation) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                mediaPage = null;
                break;
            }
            int i3 = mediaPageArr[i2].selectedType;
            if (i3 == 0 || isAnyStoryPageType(i3)) {
                break;
            } else {
                i2++;
            }
        }
        mediaPage = this.mediaPages[i2];
        if (mediaPage == null) {
            return;
        }
        int i4 = mediaPage.selectedType;
        this.changeColumnsTab = i4;
        boolean zIsAnyStoryPageType = isAnyStoryPageType(i4);
        int nextMediaColumnsCount = getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0], z);
        this.animateToColumnsCount = nextMediaColumnsCount;
        if (nextMediaColumnsCount == this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0]) {
            return;
        }
        if (this.allowStoriesSingleColumn && isAnyStoryPageType(this.changeColumnsTab)) {
            return;
        }
        mediaPage.animationSupportingListView.setVisibility(0);
        if (isAnyStoryPageType(this.changeColumnsTab)) {
            mediaPage.animationSupportingListView.setAdapter(storyAlbums_getStoriesSupportingAdapterByTabType(this.changeColumnsTab));
        } else {
            mediaPage.animationSupportingListView.setAdapter(this.animationSupportingPhotoVideoAdapter);
        }
        mediaPage.animationSupportingListView.setPadding(mediaPage.animationSupportingListView.getPaddingLeft(), getPagePaddingTop(this.changeColumnsTab), mediaPage.animationSupportingListView.getPaddingRight(), getPagePaddingBottom(isStoriesView()));
        mediaPage.animationSupportingLayoutManager.setSpanCount(nextMediaColumnsCount);
        mediaPage.animationSupportingListView.invalidateItemDecorations();
        mediaPage.animationSupportingLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i5) {
                RecyclerView.Adapter adapter = mediaPage.animationSupportingListView.getAdapter();
                if (adapter == SharedMediaLayout.this.animationSupportingPhotoVideoAdapter) {
                    if (SharedMediaLayout.this.animationSupportingPhotoVideoAdapter.getItemViewType(i5) == 2) {
                        return mediaPage.animationSupportingLayoutManager.getSpanCount();
                    }
                    return 1;
                }
                if (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesSupportingAdapter(adapter) == -1 || ((StoriesAdapter) adapter).getItemViewType(i5) != 2) {
                    return 1;
                }
                return mediaPage.animationSupportingLayoutManager.getSpanCount();
            }
        });
        AndroidUtilities.updateVisibleRows(mediaPage.listView);
        this.photoVideoChangeColumnsAnimation = true;
        if (this.changeColumnsTab == 0) {
            this.sharedMediaData[0].setListFrozen(true);
        }
        this.photoVideoChangeColumnsProgress = 0.0f;
        if (this.pinchCenterPosition < 0) {
            saveScrollPosition();
            return;
        }
        while (true) {
            MediaPage[] mediaPageArr2 = this.mediaPages;
            if (i >= mediaPageArr2.length) {
                return;
            }
            MediaPage mediaPage2 = mediaPageArr2[i];
            if (mediaPage2.selectedType == this.changeColumnsTab) {
                mediaPage2.animationSupportingLayoutManager.scrollToPositionWithOffset(this.pinchCenterPosition, this.pinchCenterOffset - this.mediaPages[i].animationSupportingListView.getPaddingTop());
            }
            i++;
        }
    }

    private void finishPinchToMediaColumnsCount() {
        final MediaPage mediaPage;
        RecyclerView.Adapter adapter;
        int i = 0;
        if (!this.photoVideoChangeColumnsAnimation) {
            return;
        }
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                mediaPage = null;
                break;
            }
            mediaPage = mediaPageArr[i2];
            if (mediaPage.selectedType == this.changeColumnsTab) {
                break;
            } else {
                i2++;
            }
        }
        if (mediaPage == null) {
            return;
        }
        boolean zIsAnyStoryPageType = isAnyStoryPageType(mediaPage.selectedType);
        float f = this.photoVideoChangeColumnsProgress;
        if (f != 1.0f) {
            if (f == 0.0f) {
                this.photoVideoChangeColumnsAnimation = false;
                if (this.changeColumnsTab == 0) {
                    this.sharedMediaData[0].setListFrozen(false);
                }
                mediaPage.animationSupportingListView.setVisibility(8);
                mediaPage.listView.invalidate();
                return;
            }
            final boolean z = f > 0.2f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SharedMediaLayout.this.photoVideoChangeColumnsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    mediaPage.listView.invalidate();
                }
            });
            final int i3 = zIsAnyStoryPageType ? 1 : 0;
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    View viewFindViewByPosition;
                    RecyclerView.Adapter adapter2;
                    SharedMediaLayout.this.photoVideoChangeColumnsAnimation = false;
                    if (z) {
                        SharedMediaLayout.this.mediaColumnsCount[i3] = SharedMediaLayout.this.animateToColumnsCount;
                        if (i3 == 0) {
                            SharedConfig.setMediaColumnsCount(SharedMediaLayout.this.animateToColumnsCount);
                        } else if (SharedMediaLayout.this.getStoriesCount(mediaPage.selectedType) >= 5) {
                            SharedConfig.setStoriesColumnsCount(SharedMediaLayout.this.animateToColumnsCount);
                        }
                    }
                    for (int i4 = 0; i4 < SharedMediaLayout.this.mediaPages.length; i4++) {
                        if (SharedMediaLayout.this.mediaPages[i4] != null && SharedMediaLayout.this.mediaPages[i4].listView != null) {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            if (sharedMediaLayout.isTabZoomable(sharedMediaLayout.mediaPages[i4].selectedType) && (adapter2 = SharedMediaLayout.this.mediaPages[i4].listView.getAdapter()) != null) {
                                int itemCount = adapter2.getItemCount();
                                if (i4 == 0) {
                                    SharedMediaLayout.this.sharedMediaData[0].setListFrozen(false);
                                }
                                if (z) {
                                    SharedMediaLayout.this.mediaPages[i4].layoutManager.setSpanCount(SharedMediaLayout.this.mediaColumnsCount[i3]);
                                    SharedMediaLayout.this.mediaPages[i4].listView.invalidateItemDecorations();
                                    if (adapter2.getItemCount() == itemCount) {
                                        AndroidUtilities.updateVisibleRows(SharedMediaLayout.this.mediaPages[i4].listView);
                                    } else {
                                        adapter2.notifyDataSetChanged();
                                    }
                                }
                                SharedMediaLayout.this.mediaPages[i4].animationSupportingListView.setVisibility(8);
                            }
                        }
                    }
                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                    if (sharedMediaLayout2.pinchCenterPosition >= 0) {
                        for (int i5 = 0; i5 < SharedMediaLayout.this.mediaPages.length; i5++) {
                            if (SharedMediaLayout.this.mediaPages[i5].selectedType == SharedMediaLayout.this.changeColumnsTab) {
                                if (z && (viewFindViewByPosition = SharedMediaLayout.this.mediaPages[i5].animationSupportingLayoutManager.findViewByPosition(SharedMediaLayout.this.pinchCenterPosition)) != null) {
                                    SharedMediaLayout.this.pinchCenterOffset = viewFindViewByPosition.getTop();
                                }
                                ExtendedGridLayoutManager extendedGridLayoutManager = SharedMediaLayout.this.mediaPages[i5].layoutManager;
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                extendedGridLayoutManager.scrollToPositionWithOffset(sharedMediaLayout3.pinchCenterPosition, (-sharedMediaLayout3.mediaPages[i5].listView.getPaddingTop()) + SharedMediaLayout.this.pinchCenterOffset);
                            }
                        }
                    } else {
                        sharedMediaLayout2.saveScrollPosition();
                    }
                    super.onAnimationEnd(animator);
                }
            });
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.start();
            return;
        }
        this.photoVideoChangeColumnsAnimation = false;
        int[] iArr = this.mediaColumnsCount;
        int i4 = this.animateToColumnsCount;
        iArr[zIsAnyStoryPageType ? 1 : 0] = i4;
        if (!zIsAnyStoryPageType) {
            SharedConfig.setMediaColumnsCount(i4);
        } else if (getStoriesCount(mediaPage.selectedType) >= 5) {
            SharedConfig.setStoriesColumnsCount(this.animateToColumnsCount);
        }
        int i5 = 0;
        while (true) {
            MediaPage[] mediaPageArr2 = this.mediaPages;
            if (i5 >= mediaPageArr2.length) {
                break;
            }
            MediaPage mediaPage2 = mediaPageArr2[i5];
            if (mediaPage2 != null && mediaPage2.listView != null && isTabZoomable(this.mediaPages[i5].selectedType) && (adapter = this.mediaPages[i5].listView.getAdapter()) != null) {
                int itemCount = adapter.getItemCount();
                if (i5 == 0) {
                    this.sharedMediaData[0].setListFrozen(false);
                }
                this.mediaPages[i5].animationSupportingListView.setVisibility(8);
                this.mediaPages[i5].layoutManager.setSpanCount(this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0]);
                this.mediaPages[i5].listView.invalidateItemDecorations();
                this.mediaPages[i5].listView.invalidate();
                if (adapter.getItemCount() == itemCount) {
                    AndroidUtilities.updateVisibleRows(this.mediaPages[i5].listView);
                } else {
                    adapter.notifyDataSetChanged();
                }
            }
            i5++;
        }
        if (this.pinchCenterPosition < 0) {
            saveScrollPosition();
            return;
        }
        while (true) {
            MediaPage[] mediaPageArr3 = this.mediaPages;
            if (i >= mediaPageArr3.length) {
                return;
            }
            MediaPage mediaPage3 = mediaPageArr3[i];
            if (mediaPage3.selectedType == this.changeColumnsTab) {
                View viewFindViewByPosition = mediaPage3.animationSupportingLayoutManager.findViewByPosition(this.pinchCenterPosition);
                if (viewFindViewByPosition != null) {
                    this.pinchCenterOffset = viewFindViewByPosition.getTop();
                }
                this.mediaPages[i].layoutManager.scrollToPositionWithOffset(this.pinchCenterPosition, (-this.mediaPages[i].listView.getPaddingTop()) + this.pinchCenterOffset);
            }
            i++;
        }
    }

    private void animateToMediaColumnsCount(final int i) {
        final MediaPage mediaPage = getMediaPage(this.changeColumnsTab);
        this.pinchCenterPosition = -1;
        if (mediaPage != null) {
            mediaPage.listView.stopScroll();
            this.animateToColumnsCount = i;
            mediaPage.animationSupportingListView.setVisibility(0);
            if (isAnyStoryPageType(this.changeColumnsTab)) {
                mediaPage.animationSupportingListView.setAdapter(storyAlbums_getStoriesSupportingAdapterByTabType(this.changeColumnsTab));
            } else {
                mediaPage.animationSupportingListView.setAdapter(this.animationSupportingPhotoVideoAdapter);
            }
            InternalListView internalListView = mediaPage.animationSupportingListView;
            int paddingLeft = mediaPage.animationSupportingListView.getPaddingLeft();
            InternalListView internalListView2 = mediaPage.animationSupportingListView;
            int pagePaddingTop = getPagePaddingTop(mediaPage.selectedType);
            internalListView2.hintPaddingTop = pagePaddingTop;
            int paddingRight = mediaPage.animationSupportingListView.getPaddingRight();
            InternalListView internalListView3 = mediaPage.animationSupportingListView;
            int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
            internalListView3.hintPaddingBottom = pagePaddingBottom;
            internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
            mediaPage.animationSupportingLayoutManager.setSpanCount(i);
            mediaPage.animationSupportingListView.invalidateItemDecorations();
            int i2 = 0;
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i2 >= mediaPageArr.length) {
                    break;
                }
                MediaPage mediaPage2 = mediaPageArr[i2];
                if (mediaPage2 != null && isTabZoomable(mediaPage2.selectedType)) {
                    AndroidUtilities.updateVisibleRows(this.mediaPages[i2].listView);
                }
                i2++;
            }
            this.photoVideoChangeColumnsAnimation = true;
            if (this.changeColumnsTab == 0) {
                this.sharedMediaData[0].setListFrozen(true);
            }
            this.photoVideoChangeColumnsProgress = 0.0f;
            saveScrollPosition();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.notificationsLocker.lock();
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SharedMediaLayout.this.photoVideoChangeColumnsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    mediaPage.listView.invalidate();
                }
            });
            final int i3 = isAnyStoryPageType(mediaPage.selectedType) ? 1 : 0;
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    RecyclerView.Adapter adapter;
                    SharedMediaLayout.this.notificationsLocker.unlock();
                    SharedMediaLayout.this.photoVideoChangeColumnsAnimation = false;
                    SharedMediaLayout.this.mediaColumnsCount[i3] = i;
                    for (int i4 = 0; i4 < SharedMediaLayout.this.mediaPages.length; i4++) {
                        if (SharedMediaLayout.this.mediaPages[i4] != null && SharedMediaLayout.this.mediaPages[i4].listView != null) {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            if (sharedMediaLayout.isTabZoomable(sharedMediaLayout.mediaPages[i4].selectedType) && (adapter = SharedMediaLayout.this.mediaPages[i4].listView.getAdapter()) != null) {
                                int itemCount = adapter.getItemCount();
                                if (i4 == 0) {
                                    SharedMediaLayout.this.sharedMediaData[0].setListFrozen(false);
                                }
                                SharedMediaLayout.this.mediaPages[i4].layoutManager.setSpanCount(SharedMediaLayout.this.mediaColumnsCount[i3]);
                                SharedMediaLayout.this.mediaPages[i4].listView.invalidateItemDecorations();
                                if (adapter.getItemCount() == itemCount) {
                                    AndroidUtilities.updateVisibleRows(SharedMediaLayout.this.mediaPages[i4].listView);
                                } else {
                                    adapter.notifyDataSetChanged();
                                }
                                SharedMediaLayout.this.mediaPages[i4].animationSupportingListView.setVisibility(8);
                            }
                        }
                    }
                    SharedMediaLayout.this.saveScrollPosition();
                }
            });
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.setStartDelay(100L);
            valueAnimatorOfFloat.setDuration(350L);
            valueAnimatorOfFloat.start();
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.scrollSlidingTextTabStrip != null) {
            canvas.save();
            canvas.translate(this.scrollSlidingTextTabStrip.getX(), this.scrollSlidingTextTabStrip.getY());
            this.scrollSlidingTextTabStrip.drawBackground(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.fragmentContextView;
        if (fragmentContextView != null && fragmentContextView.isCallStyle() && this.topPanelLayout == null) {
            canvas.save();
            canvas.translate(this.fragmentContextView.getX(), this.fragmentContextView.getY());
            this.fragmentContextView.setDrawOverlay(true);
            this.fragmentContextView.draw(canvas);
            this.fragmentContextView.setDrawOverlay(false);
            canvas.restore();
        }
    }

    private ScrollSlidingTextTabStripInner createScrollingTextTabStrip(Context context) {
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner = new ScrollSlidingTextTabStripInner(context, this.resourcesProvider) {
            @Override
            protected int processColor(int i) {
                return SharedMediaLayout.this.processColor(i);
            }
        };
        int i = this.initialTab;
        if (i != -1) {
            scrollSlidingTextTabStripInner.setInitialTabId(i);
            this.initialTab = -1;
        }
        scrollSlidingTextTabStripInner.animationDuration = 320L;
        scrollSlidingTextTabStripInner.setColors(Theme.key_profile_tabSelectedLine, Theme.key_profile_tabSelectedText, Theme.key_profile_tabText, Theme.key_profile_tabSelector);
        scrollSlidingTextTabStripInner.setUseMinimalWidth(true);
        scrollSlidingTextTabStripInner.setDelegate(new AnonymousClass40());
        return scrollSlidingTextTabStripInner;
    }

    class AnonymousClass40 implements ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate {
        @Override
        public boolean canReorder(int i) {
            return false;
        }

        AnonymousClass40() {
        }

        @Override
        public void onPageSelected(int i, boolean z) {
            if (SharedMediaLayout.this.mediaPages[0].selectedType == i) {
                return;
            }
            ProfileStoriesCollectionTabs profileStoriesCollectionTabs = SharedMediaLayout.this.storiesContainer;
            if (profileStoriesCollectionTabs != null && i == 8) {
                profileStoriesCollectionTabs.selectTabWithId(0, 1.0f);
            }
            SharedMediaLayout.this.mediaPages[1].selectedType = i;
            SharedMediaLayout.this.mediaPages[1].setVisibility(0);
            SharedMediaLayout.this.hideFloatingDateView(true);
            SharedMediaLayout.this.switchToCurrentSelectedMode(true);
            SharedMediaLayout.this.animatingForward = z;
            SharedMediaLayout.this.onSelectedTabChanged();
            SharedMediaLayout.this.animateSearchToOptions(!r5.isSearchItemVisible(i), true);
            SharedMediaLayout.this.updateOptionsSearch(true);
        }

        @Override
        public void onSamePageSelected() {
            SharedMediaLayout.this.scrollToTop();
        }

        @Override
        public void onPageScrolled(float f) {
            if (f != 1.0f || SharedMediaLayout.this.mediaPages[1].getVisibility() == 0) {
                if (SharedMediaLayout.this.animatingForward) {
                    SharedMediaLayout.this.mediaPages[0].setTranslationX((-f) * SharedMediaLayout.this.mediaPages[0].getMeasuredWidth());
                    SharedMediaLayout.this.mediaPages[1].setTranslationX(SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() - (SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() * f));
                } else {
                    SharedMediaLayout.this.mediaPages[0].setTranslationX(SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() * f);
                    SharedMediaLayout.this.mediaPages[1].setTranslationX((SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() * f) - SharedMediaLayout.this.mediaPages[0].getMeasuredWidth());
                }
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                sharedMediaLayout.onTabProgress(sharedMediaLayout.getTabProgress());
                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                sharedMediaLayout2.optionsAlpha = sharedMediaLayout2.getPhotoVideoOptionsAlpha(f);
                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                sharedMediaLayout3.photoVideoOptionsItem.setVisibility((sharedMediaLayout3.optionsAlpha == 0.0f || !SharedMediaLayout.this.canShowSearchItem() || SharedMediaLayout.this.isArchivedOnlyStoriesView()) ? 4 : 0);
                if (SharedMediaLayout.this.searchItem != null && !SharedMediaLayout.this.canShowSearchItem()) {
                    SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                    SharedMediaLayout.this.searchAlpha = 0.0f;
                } else {
                    SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                    sharedMediaLayout4.searchAlpha = sharedMediaLayout4.getSearchAlpha(f);
                    SharedMediaLayout.this.updateSearchItemIconAnimated();
                }
                SharedMediaLayout.this.updateOptionsSearch();
                if (f == 1.0f) {
                    MediaPage mediaPage = SharedMediaLayout.this.mediaPages[0];
                    SharedMediaLayout.this.mediaPages[0] = SharedMediaLayout.this.mediaPages[1];
                    SharedMediaLayout.this.mediaPages[1] = mediaPage;
                    SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                    if (SharedMediaLayout.this.searchItem != null && SharedMediaLayout.this.searchItemState == 2) {
                        SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                    }
                    SharedMediaLayout.this.searchItemState = 0;
                    SharedMediaLayout.this.startStopVisibleGifs();
                }
            }
        }

        @Override
        public boolean showOptions(final int i, View view) {
            TLRPC.ProfileTab profileTab;
            if (SharedMediaLayout.this.profileActivity == null || SharedMediaLayout.getTab(i, SharedMediaLayout.this.info instanceof TLRPC.TL_channelFull) == null) {
                return false;
            }
            if (!(SharedMediaLayout.this.info instanceof TLRPC.TL_channelFull)) {
                if (SharedMediaLayout.this.dialog_id != SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId() || SharedMediaLayout.this.userInfo == null) {
                    return false;
                }
                profileTab = SharedMediaLayout.this.userInfo.main_tab;
            } else {
                if (!ChatObject.canUserDoAction(SharedMediaLayout.this.profileActivity.getMessagesController().getChat(Long.valueOf(SharedMediaLayout.this.info.id)), 5)) {
                    return false;
                }
                profileTab = SharedMediaLayout.this.info.main_tab;
            }
            if (profileTab != null && (i == SharedMediaLayout.getTabId(profileTab) || SharedMediaLayout.this.firstTab == i)) {
                return false;
            }
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, view);
            itemOptionsMakeOptions.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(Theme.key_windowBackgroundWhite)));
            itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showOptions$0(i);
                }
            });
            itemOptionsMakeOptions.show();
            return true;
        }

        public void lambda$showOptions$0(int i) {
            TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
            if (SharedMediaLayout.this.profileActivity == null) {
                return;
            }
            if (SharedMediaLayout.this.info instanceof TLRPC.TL_channelFull) {
                TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                tL_channels_setMainProfileTab.tab = SharedMediaLayout.getTab(i, true);
                tL_channels_setMainProfileTab.channel = SharedMediaLayout.this.profileActivity.getMessagesController().getInputChannel(SharedMediaLayout.this.info.id);
                SharedMediaLayout.this.info.flags2 |= 4194304;
                SharedMediaLayout.this.info.main_tab = tL_channels_setMainProfileTab.tab;
                tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
            } else {
                TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                tL_account_setMainProfileTab2.tab = SharedMediaLayout.getTab(i, true);
                tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                if (SharedMediaLayout.this.userInfo != null) {
                    SharedMediaLayout.this.userInfo.flags2 |= 1048576;
                    SharedMediaLayout.this.userInfo.main_tab = tL_account_setMainProfileTab2.tab;
                    SharedMediaLayout.this.profileActivity.getMessagesStorage().updateUserInfo(SharedMediaLayout.this.userInfo, true);
                    tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                }
            }
            SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
            SharedMediaLayout.this.updateTabs(true);
        }
    }

    protected void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public void lambda$onItemLongClick$58(int i) {
        MediaPage mediaPage;
        if (storyAlbums_getAlbumIdByTabType(getClosestTab()) != i) {
            ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
            if (profileStoriesCollectionTabs != null) {
                profileStoriesCollectionTabs.lambda$setInitialTabId$2(i);
                return;
            }
            return;
        }
        this.storiesContainer.setReorderingAlbums(true);
        StoryAlbumData storyAlbumDataStoryAlbums_getByAlbumId = storyAlbums_getByAlbumId(i);
        if (storyAlbumDataStoryAlbums_getByAlbumId == null || (mediaPage = getMediaPage(storyAlbumDataStoryAlbums_getByAlbumId.tabType)) == null) {
            return;
        }
        InternalListView internalListView = mediaPage.listView;
        for (int i2 = 0; i2 < internalListView.getChildCount(); i2++) {
            View childAt = internalListView.getChildAt(i2);
            if (childAt instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) childAt).setReordering(true, true);
            }
        }
        StoriesAdapter storiesAdapter = storyAlbumDataStoryAlbums_getByAlbumId.adapter;
        if (storiesAdapter != null) {
            storiesAdapter.setInAlbumStoriesReorder(true);
        }
        updateOptionsSearch(true);
    }

    public void saveAndStopAlbumsReorder() {
        MediaPage mediaPage;
        StoryAlbumData storyAlbumDataStoryAlbums_getByAlbumId = storyAlbums_getByAlbumId(storyAlbums_getAlbumIdByTabType(getClosestTab()));
        if (storyAlbumDataStoryAlbums_getByAlbumId == null || (mediaPage = getMediaPage(storyAlbumDataStoryAlbums_getByAlbumId.tabType)) == null) {
            return;
        }
        this.storiesContainer.resetReordering();
        InternalListView internalListView = mediaPage.listView;
        for (int i = 0; i < internalListView.getChildCount(); i++) {
            View childAt = internalListView.getChildAt(i);
            if (childAt instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) childAt).setReordering(false, true);
            }
        }
        StoriesAdapter storiesAdapter = storyAlbumDataStoryAlbums_getByAlbumId.adapter;
        if (storiesAdapter != null) {
            storiesAdapter.setInAlbumStoriesReorder(false);
        }
    }

    public void openStoryTabIdPage(int i, boolean z) {
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr[0].selectedType == i) {
            return;
        }
        MediaPage mediaPage = mediaPageArr[1];
        mediaPage.selectedType = i;
        mediaPage.setVisibility(0);
        hideFloatingDateView(true);
        switchToCurrentSelectedMode(true);
        this.animatingForward = z;
        onSelectedTabChanged();
        animateSearchToOptions(!isSearchItemVisible(i), true);
        updateOptionsSearch(true);
    }

    public void onPageMediaProgress(float f) {
        if (f != 1.0f || this.mediaPages[1].getVisibility() == 0) {
            if (this.animatingForward) {
                this.mediaPages[0].setTranslationX((-f) * r2.getMeasuredWidth());
                this.mediaPages[1].setTranslationX(r2[0].getMeasuredWidth() - (this.mediaPages[0].getMeasuredWidth() * f));
            } else {
                this.mediaPages[0].setTranslationX(r2.getMeasuredWidth() * f);
                this.mediaPages[1].setTranslationX((r2[0].getMeasuredWidth() * f) - this.mediaPages[0].getMeasuredWidth());
            }
            onTabProgress(getTabProgress());
            float photoVideoOptionsAlpha = getPhotoVideoOptionsAlpha(f);
            this.optionsAlpha = photoVideoOptionsAlpha;
            this.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !canShowSearchItem() || isArchivedOnlyStoriesView()) ? 4 : 0);
            if (this.searchItem != null && !canShowSearchItem()) {
                this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
                this.searchAlpha = 0.0f;
            } else {
                this.searchAlpha = getSearchAlpha(f);
                updateSearchItemIconAnimated();
            }
            updateOptionsSearch();
            if (f == 1.0f) {
                MediaPage[] mediaPageArr = this.mediaPages;
                MediaPage mediaPage = mediaPageArr[0];
                mediaPageArr[0] = mediaPageArr[1];
                mediaPageArr[1] = mediaPage;
                mediaPage.setVisibility(8);
                ActionBarMenuItem actionBarMenuItem = this.searchItem;
                if (actionBarMenuItem != null && this.searchItemState == 2) {
                    actionBarMenuItem.setVisibility(isStoriesView() ? 8 : 4);
                }
                this.searchItemState = 0;
                startStopVisibleGifs();
            }
        }
    }

    private boolean fillMediaData(int i) {
        SharedMediaData[] sharedMediaData = this.sharedMediaPreloader.getSharedMediaData();
        if (sharedMediaData == null) {
            return false;
        }
        if (i == 0) {
            SharedMediaData sharedMediaData2 = this.sharedMediaData[i];
            if (!sharedMediaData2.fastScrollDataLoaded) {
                int[] iArr = sharedMediaData2.totalCount;
                int[] iArr2 = sharedMediaData[i].totalCount;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = this.sharedMediaData[i].totalCount;
            int[] iArr4 = sharedMediaData[i].totalCount;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        this.sharedMediaData[i].messages.addAll(sharedMediaData[i].messages);
        this.sharedMediaData[i].sections.addAll(sharedMediaData[i].sections);
        for (Map.Entry entry : sharedMediaData[i].sectionArrays.entrySet()) {
            this.sharedMediaData[i].sectionArrays.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.sharedMediaData[i].messagesDict[i2] = sharedMediaData[i].messagesDict[i2].clone();
            SharedMediaData sharedMediaData3 = this.sharedMediaData[i];
            int[] iArr5 = sharedMediaData3.max_id;
            SharedMediaData sharedMediaData4 = sharedMediaData[i];
            iArr5[i2] = sharedMediaData4.max_id[i2];
            sharedMediaData3.endReached[i2] = sharedMediaData4.endReached[i2];
        }
        this.sharedMediaData[i].fastScrollPeriods.addAll(sharedMediaData[i].fastScrollPeriods);
        return !sharedMediaData[i].messages.isEmpty();
    }

    public void hideFloatingDateView(boolean z) {
        AndroidUtilities.cancelRunOnUIThread(this.hideFloatingDateRunnable);
        if (this.floatingDateView.getTag() == null) {
            return;
        }
        this.floatingDateView.setTag(null);
        AnimatorSet animatorSet = this.floatingDateAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.floatingDateAnimation = null;
        }
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.floatingDateAnimation = animatorSet2;
            animatorSet2.setDuration(180L);
            this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(this.floatingDateView, (Property<ChatActionCell, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.floatingDateView, (Property<ChatActionCell, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.additionalFloatingTranslation));
            this.floatingDateAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.floatingDateAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SharedMediaLayout.this.floatingDateAnimation = null;
                }
            });
            this.floatingDateAnimation.start();
            return;
        }
        this.floatingDateView.setAlpha(0.0f);
    }

    public void scrollToTop() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.scrollToTop():void");
    }

    public void checkLoadMoreScroll(MediaPage mediaPage, final RecyclerListView recyclerListView, LinearLayoutManager linearLayoutManager) {
        int i;
        int i2;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        StoriesController.StoriesList storiesList;
        if (this.photoVideoChangeColumnsAnimation || this.jumpToRunnable != null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (recyclerListView.getFastScroll() == null || !recyclerListView.getFastScroll().isPressed() || jCurrentTimeMillis - mediaPage.lastCheckScrollTime >= 300) {
            mediaPage.lastCheckScrollTime = jCurrentTimeMillis;
            if ((this.searching && this.searchWas && mediaPage.selectedType != 11) || mediaPage.selectedType == 7) {
                return;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(linearLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
            int itemCount = recyclerListView.getAdapter() == null ? 0 : recyclerListView.getAdapter().getItemCount();
            final int i3 = mediaPage.selectedType;
            if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 4) {
                itemCount = this.sharedMediaData[i3].getStartOffset() + this.sharedMediaData[i3].messages.size();
                SharedMediaData sharedMediaData = this.sharedMediaData[i3];
                if (sharedMediaData.fastScrollDataLoaded && sharedMediaData.fastScrollPeriods.size() > 2 && mediaPage.selectedType == 0 && this.sharedMediaData[i3].messages.size() != 0) {
                    float f = i3 == 0 ? this.mediaColumnsCount[0] : 1;
                    int measuredHeight = (int) ((recyclerListView.getMeasuredHeight() / (recyclerListView.getMeasuredWidth() / f)) * f * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((Period) this.sharedMediaData[i3].fastScrollPeriods.get(1)).startOffset) {
                        measuredHeight = ((Period) this.sharedMediaData[i3].fastScrollPeriods.get(1)).startOffset;
                    }
                    if ((iFindFirstVisibleItemPosition > itemCount && iFindFirstVisibleItemPosition - itemCount > measuredHeight) || ((i = iFindFirstVisibleItemPosition + iAbs) < this.sharedMediaData[i3].startOffset && this.sharedMediaData[0].startOffset - i > measuredHeight)) {
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$checkLoadMoreScroll$35(i3, recyclerListView);
                            }
                        };
                        this.jumpToRunnable = runnable;
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
            }
            int i4 = mediaPage.selectedType;
            if (i4 == 7) {
                return;
            }
            if (isAnyStoryPageType(i4)) {
                StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(mediaPage.selectedType);
                if (storiesAdapterStoryAlbums_getStoriesAdapterByTabType == null || (storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList) == null || iFindFirstVisibleItemPosition + iAbs <= storiesList.getLoadedCount() - this.mediaColumnsCount[1]) {
                    return;
                }
                storiesAdapterStoryAlbums_getStoriesAdapterByTabType.load(false);
                return;
            }
            int i5 = mediaPage.selectedType;
            if (i5 == 6) {
                if (iAbs <= 0 || this.commonGroupsAdapter.endReached || this.commonGroupsAdapter.loading || this.commonGroupsAdapter.chats.isEmpty() || iFindFirstVisibleItemPosition + iAbs < itemCount - 5) {
                    return;
                }
                CommonGroupsAdapter commonGroupsAdapter = this.commonGroupsAdapter;
                commonGroupsAdapter.getChats(((TLRPC.Chat) commonGroupsAdapter.chats.get(this.commonGroupsAdapter.chats.size() - 1)).id, 100);
                return;
            }
            if (i5 == 11) {
                int iMax = -1;
                for (int i6 = 0; i6 < mediaPage.listView.getChildCount(); i6++) {
                    iMax = Math.max(mediaPage.listView.getChildAdapterPosition(mediaPage.listView.getChildAt(i6)), iMax);
                }
                RecyclerView.Adapter adapter = mediaPage.listView.getAdapter();
                SavedMessagesSearchAdapter savedMessagesSearchAdapter = this.savedMessagesSearchAdapter;
                if (adapter == savedMessagesSearchAdapter) {
                    if (iMax + 1 >= savedMessagesSearchAdapter.dialogs.size() + this.savedMessagesSearchAdapter.loadedMessages.size()) {
                        this.savedMessagesSearchAdapter.loadMore();
                        return;
                    }
                    return;
                } else {
                    if (iMax + 1 >= this.profileActivity.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        this.profileActivity.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                }
            }
            int i7 = 10;
            if (i5 == 10 || i5 == 12 || i5 == 13 || i5 == 14) {
                return;
            }
            if (i5 == 0) {
                i7 = 3;
            } else if (i5 != 5) {
                i7 = 6;
            }
            int i8 = i5 == 15 ? 8 : i5;
            if (iAbs + iFindFirstVisibleItemPosition > itemCount - i7 || this.sharedMediaData[i8].loadingAfterFastScroll) {
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                SharedMediaData sharedMediaData2 = sharedMediaDataArr[i8];
                if (!sharedMediaData2.loading) {
                    if (i5 == 0) {
                        int i9 = sharedMediaDataArr[0].filterType;
                        i2 = i9 == 1 ? 6 : i9 == 2 ? 7 : 0;
                    } else {
                        i2 = i5 == 1 ? 1 : i5 == 2 ? 2 : i5 == 4 ? 4 : i5 == 5 ? 5 : i5 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = sharedMediaData2.endReached;
                    if (!zArr[0]) {
                        sharedMediaData2.loading = true;
                        this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, this.sharedMediaData[i8].max_id[0], 0, i2, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i8].requestIndex, null, null);
                    } else if (this.mergeDialogId != 0 && !zArr[1]) {
                        sharedMediaData2.loading = true;
                        this.profileActivity.getMediaDataController().loadMedia(this.mergeDialogId, 50, this.sharedMediaData[i8].max_id[1], 0, i2, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i8].requestIndex, null, null);
                    }
                }
            }
            int positionForIndex = this.sharedMediaData[i8].startOffset;
            if (i8 == 0) {
                positionForIndex = this.photoVideoAdapter.getPositionForIndex(0);
            }
            if (iFindFirstVisibleItemPosition - positionForIndex < i7 + 1) {
                SharedMediaData sharedMediaData3 = this.sharedMediaData[i8];
                if (!sharedMediaData3.loading && !sharedMediaData3.startReached && !sharedMediaData3.loadingAfterFastScroll) {
                    loadFromStart(mediaPage.selectedType);
                }
            }
            if (this.mediaPages[0].listView == recyclerListView) {
                int i10 = this.mediaPages[0].selectedType;
                if ((i10 != 0 && i10 != 5) || iFindFirstVisibleItemPosition == -1 || (viewHolderFindViewHolderForAdapterPosition = recyclerListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) == null) {
                    return;
                }
                if (viewHolderFindViewHolderForAdapterPosition.getItemViewType() == 0 || viewHolderFindViewHolderForAdapterPosition.getItemViewType() == 12) {
                    View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                    if (view instanceof SharedPhotoVideoCell) {
                        MessageObject messageObject = ((SharedPhotoVideoCell) view).getMessageObject(0);
                        if (messageObject != null) {
                            this.floatingDateView.setCustomDate(messageObject.messageOwner.date, false, true);
                            return;
                        }
                        return;
                    }
                    if (view instanceof ContextLinkCell) {
                        this.floatingDateView.setCustomDate(((ContextLinkCell) view).getDate(), false, true);
                    }
                }
            }
        }
    }

    public void lambda$checkLoadMoreScroll$35(int i, RecyclerListView recyclerListView) {
        findPeriodAndJumpToDate(i, recyclerListView, false);
        this.jumpToRunnable = null;
    }

    private void loadFromStart(int i) {
        int i2;
        if (i == 0) {
            int i3 = this.sharedMediaData[0].filterType;
            i2 = i3 == 1 ? 6 : i3 == 2 ? 7 : 0;
        } else {
            i2 = i == 1 ? 1 : i == 2 ? 2 : i == 4 ? 4 : i == 5 ? 5 : 3;
        }
        this.sharedMediaData[i].loading = true;
        this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, 0, this.sharedMediaData[i].min_id, i2, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i].requestIndex, null, null);
    }

    public ActionBarMenuItem getSearchItem() {
        return this.searchItem;
    }

    public RLottieImageView getSearchOptionsItem() {
        return this.optionsSearchImageView;
    }

    public TextView getSaveItem() {
        return this.saveItem;
    }

    public boolean isSearchItemVisible() {
        return isSearchItemVisible(this.mediaPages[0].selectedType);
    }

    public boolean isSearchItemVisible(int i) {
        if (i == 7) {
            return this.delegate.canSearchMembers();
        }
        return (isSearchingStories() || i == 0 || isAnyStoryPageType(i) || i == 2 || i == 5 || i == 6 || i == 11 || i == 10 || i == 13 || i == 14) ? false : true;
    }

    public boolean isTabZoomable(int i) {
        return i == 0 || isAnyStoryPageType(i);
    }

    public boolean isCalendarItemVisible() {
        int i = this.mediaPages[0].selectedType;
        return i == 0 || isAnyStoryPageType(i) || this.mediaPages[0].selectedType == 11;
    }

    public boolean isOptionsItemVisible() {
        ProfileGiftsContainer profileGiftsContainer;
        int i = this.mediaPages[0].selectedType;
        return i == 0 || isAnyStoryPageType(i) || i == 11 || i == 13 || (i == 14 && (profileGiftsContainer = this.giftsContainer) != null && profileGiftsContainer.canFilter());
    }

    public int getSelectedTab() {
        int currentTabId = this.scrollSlidingTextTabStrip.getCurrentTabId();
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = profileStoriesCollectionTabs.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? storyAlbums_getByAlbumId(currentAlbumId).tabType : currentTabId;
    }

    public int getClosestTab() {
        MediaPage mediaPage = this.mediaPages[1];
        if (mediaPage != null && mediaPage.getVisibility() == 0) {
            if (this.tabsAnimationInProgress && !this.backAnimation) {
                return this.mediaPages[1].selectedType;
            }
            if (Math.abs(this.mediaPages[1].getTranslationX()) < this.mediaPages[1].getMeasuredWidth() / 2.0f) {
                return this.mediaPages[1].selectedType;
            }
        }
        return getSelectedTab();
    }

    protected void onSelectedTabChanged() {
        boolean z = isStoriesView() || isArchivedOnlyStoriesView();
        if (this.archivedStoriesAdapter.poller != null) {
            this.archivedStoriesAdapter.poller.start(z && getClosestTab() == 9);
        }
        if (this.storiesAdapter.poller != null) {
            this.storiesAdapter.poller.start(z && getClosestTab() == 8);
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            StoriesAdapter storiesAdapter = storyAlbumData.adapter;
            if (storiesAdapter.storiesList != null) {
                storiesAdapter.poller.start(z && getClosestTab() == storyAlbumData.tabType);
            }
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            SearchTagsList searchTagsList = this.searchTagsList;
            actionBarMenuItem.setSearchFieldHint(LocaleController.getString((searchTagsList != null && searchTagsList.hasFilters() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        checkStoriesTabsPosition();
    }

    public void onDestroy() {
        this.observersGroup.removeAllObservers();
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null && storiesAdapter.storiesList != null) {
            storiesAdapter.destroy();
        }
        StoriesAdapter storiesAdapter2 = this.archivedStoriesAdapter;
        if (storiesAdapter2 != null && storiesAdapter2.storiesList != null) {
            storiesAdapter2.destroy();
        }
        Iterator it = this.storyAlbumsById.values().iterator();
        while (it.hasNext()) {
            StoriesAdapter storiesAdapter3 = ((StoryAlbumData) it.next()).adapter;
            if (storiesAdapter3.storiesList != null) {
                storiesAdapter3.destroy();
            }
        }
    }

    public void checkCurrentTabValid() {
        if (this.scrollSlidingTextTabStrip.hasTab(this.scrollSlidingTextTabStrip.getCurrentTabId())) {
            return;
        }
        int firstTabId = this.scrollSlidingTextTabStrip.getFirstTabId();
        this.scrollSlidingTextTabStrip.setInitialTabId(firstTabId);
        this.mediaPages[0].selectedType = firstTabId;
        switchToCurrentSelectedMode(false);
    }

    public void setNewMediaCounts(int[] iArr) {
        for (int i = 0; i <= 6 && this.hasMedia[i] < 0; i++) {
        }
        System.arraycopy(iArr, 0, this.hasMedia, 0, 6);
        updateTabs(true);
        checkCurrentTabValid();
        if (this.hasMedia[0] >= 0) {
            loadFastScrollData(false);
        }
    }

    private void loadFastScrollData(boolean z) {
        if (this.topicId != 0 || isSearchingStories()) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = supportedFastScrollTypes;
            if (i >= iArr.length) {
                return;
            }
            final int i2 = iArr[i];
            if ((this.sharedMediaData[i2].fastScrollDataLoaded && !z) || DialogObject.isEncryptedDialog(this.dialog_id)) {
                return;
            }
            this.sharedMediaData[i2].fastScrollDataLoaded = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i2 == 0) {
                int i3 = this.sharedMediaData[i2].filterType;
                if (i3 == 1) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i3 == 2) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                }
            } else if (i2 == 1) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i2 == 2) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_getSearchResultsPositions.limit = 100;
            tL_messages_getSearchResultsPositions.peer = this.profileActivity.getMessagesController().getInputPeer(this.dialog_id);
            if (this.topicId != 0 && this.profileActivity.getUserConfig().getClientUserId() == this.dialog_id) {
                tL_messages_getSearchResultsPositions.flags |= 4;
                tL_messages_getSearchResultsPositions.saved_peer_id = this.profileActivity.getMessagesController().getInputPeer(this.topicId);
            }
            final int i4 = this.sharedMediaData[i2].requestIndex;
            ConnectionsManager.getInstance(this.profileActivity.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(this.profileActivity.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadFastScrollData$39(i4, i2, tLObject, tL_error);
                }
            }), this.profileActivity.getClassGuid());
            i++;
        }
    }

    public void lambda$loadFastScrollData$39(final int i, final int i2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadFastScrollData$38(tL_error, i, i2, tLObject);
            }
        });
    }

    public void lambda$loadFastScrollData$38(final TLRPC.TL_error tL_error, final int i, final int i2, final TLObject tLObject) {
        NotificationCenter.getInstance(this.profileActivity.getCurrentAccount()).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadFastScrollData$37(tL_error, i, i2, tLObject);
            }
        });
    }

    public void lambda$loadFastScrollData$37(TLRPC.TL_error tL_error, int i, int i2, TLObject tLObject) {
        if (tL_error != null) {
            return;
        }
        SharedMediaData sharedMediaData = this.sharedMediaData[i2];
        if (i != sharedMediaData.requestIndex) {
            return;
        }
        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) tLObject;
        sharedMediaData.fastScrollPeriods.clear();
        int size = tL_messages_searchResultsPositions.positions.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i4);
            if (tL_searchResultPosition.date != 0) {
                this.sharedMediaData[i2].fastScrollPeriods.add(new Period(tL_searchResultPosition));
            }
        }
        Collections.sort(this.sharedMediaData[i2].fastScrollPeriods, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return SharedMediaLayout.lambda$loadFastScrollData$36((SharedMediaLayout.Period) obj, (SharedMediaLayout.Period) obj2);
            }
        });
        this.sharedMediaData[i2].setTotalCount(0, tL_messages_searchResultsPositions.count);
        SharedMediaData sharedMediaData2 = this.sharedMediaData[i2];
        sharedMediaData2.fastScrollDataLoaded = true;
        if (!sharedMediaData2.fastScrollPeriods.isEmpty()) {
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i3 >= mediaPageArr.length) {
                    break;
                }
                MediaPage mediaPage = mediaPageArr[i3];
                if (mediaPage.selectedType == i2) {
                    mediaPage.fastScrollEnabled = true;
                    updateFastScrollVisibility(mediaPage, true);
                }
                i3++;
            }
        }
        this.photoVideoAdapter.notifyDataSetChanged();
    }

    public static int lambda$loadFastScrollData$36(Period period, Period period2) {
        return period2.date - period.date;
    }

    public static void showFastScrollHint(final MediaPage mediaPage, SharedMediaData[] sharedMediaDataArr, boolean z) {
        Runnable runnable;
        if (z) {
            if (SharedConfig.fastScrollHintCount <= 0 || mediaPage.fastScrollHintView != null || mediaPage.fastScrollHinWasShown || mediaPage.listView.getFastScroll() == null || !mediaPage.listView.getFastScroll().isVisible || mediaPage.listView.getFastScroll().getVisibility() != 0 || sharedMediaDataArr[0].getTotalCount() < 50) {
                return;
            }
            SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
            mediaPage.fastScrollHinWasShown = true;
            final SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = new SharedMediaFastScrollTooltip(mediaPage.getContext());
            mediaPage.fastScrollHintView = sharedMediaFastScrollTooltip;
            mediaPage.addView(sharedMediaFastScrollTooltip, LayoutHelper.createFrame(-2, -2.0f));
            mediaPage.fastScrollHintView.setAlpha(0.0f);
            mediaPage.fastScrollHintView.setScaleX(0.8f);
            mediaPage.fastScrollHintView.setScaleY(0.8f);
            mediaPage.fastScrollHintView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            mediaPage.invalidate();
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    SharedMediaLayout.lambda$showFastScrollHint$40(mediaPage, sharedMediaFastScrollTooltip);
                }
            };
            mediaPage.fastScrollHideHintRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 4000L);
            return;
        }
        if (mediaPage.fastScrollHintView == null || (runnable = mediaPage.fastScrollHideHintRunnable) == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable);
        mediaPage.fastScrollHideHintRunnable.run();
        mediaPage.fastScrollHideHintRunnable = null;
        mediaPage.fastScrollHintView = null;
    }

    public static void lambda$showFastScrollHint$40(MediaPage mediaPage, final SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip) {
        mediaPage.fastScrollHintView = null;
        mediaPage.fastScrollHideHintRunnable = null;
        sharedMediaFastScrollTooltip.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (sharedMediaFastScrollTooltip.getParent() != null) {
                    ((ViewGroup) sharedMediaFastScrollTooltip.getParent()).removeView(sharedMediaFastScrollTooltip);
                }
            }
        }).start();
    }

    public void setCommonGroupsCount(int i) {
        if (this.topicId == 0) {
            this.hasMedia[6] = i;
        }
        updateTabs(true);
        checkCurrentTabValid();
    }

    public void onActionBarItemClick(View view, int i) {
        BotPreviewsEditContainer botPreviewsEditContainer;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z;
        TLRPC.User user2;
        if (i == 101) {
            if (isAnyStoryPageType(getSelectedTab()) || getSelectedTab() == 13) {
                if (this.selectedFiles[0] != null) {
                    if (isBot() && (botPreviewsEditContainer = this.botPreviewsContainer) != null && botPreviewsEditContainer.getCurrentList() != null) {
                        final StoriesController.BotPreviewsList currentList = this.botPreviewsContainer.getCurrentList();
                        final ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < this.selectedFiles[0].size(); i2++) {
                            TL_stories.StoryItem storyItem = ((MessageObject) this.selectedFiles[0].valueAt(i2)).storyItem;
                            if (storyItem != null) {
                                arrayList.add(storyItem.media);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
                        builder.setTitle(LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle));
                        builder.setMessage(LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList.size(), new Object[0]));
                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i3) {
                                this.f$0.lambda$onActionBarItemClick$41(currentList, arrayList, alertDialog, i3);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i3) {
                                alertDialog.dismiss();
                            }
                        });
                        AlertDialog alertDialogCreate = builder.create();
                        alertDialogCreate.show();
                        alertDialogCreate.redPositive();
                        return;
                    }
                    final ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < this.selectedFiles[0].size(); i3++) {
                        TL_stories.StoryItem storyItem2 = ((MessageObject) this.selectedFiles[0].valueAt(i3)).storyItem;
                        if (storyItem2 != null) {
                            arrayList2.add(storyItem2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), this.resourcesProvider);
                    builder2.setTitle(LocaleController.getString(arrayList2.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle));
                    builder2.setMessage(LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList2.size(), new Object[0]));
                    builder2.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            this.f$0.lambda$onActionBarItemClick$43(arrayList2, alertDialog, i4);
                        }
                    });
                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            alertDialog.dismiss();
                        }
                    });
                    AlertDialog alertDialogCreate2 = builder2.create();
                    alertDialogCreate2.show();
                    alertDialogCreate2.redPositive();
                    return;
                }
                return;
            }
            if (getSelectedTab() == 11) {
                SavedMessagesController savedMessagesController = this.profileActivity.getMessagesController().getSavedMessagesController();
                final ArrayList arrayList3 = new ArrayList();
                for (int i4 = 0; i4 < savedMessagesController.allDialogs.size(); i4++) {
                    long j = savedMessagesController.allDialogs.get(i4).dialogId;
                    if (this.savedDialogsAdapter.selectedDialogs.contains(Long.valueOf(j))) {
                        arrayList3.add(Long.valueOf(j));
                    }
                }
                String userName = "";
                if (arrayList3.isEmpty()) {
                    z = false;
                } else {
                    Long l = (Long) arrayList3.get(0);
                    long jLongValue = l.longValue();
                    z = jLongValue == this.profileActivity.getUserConfig().getClientUserId();
                    if (jLongValue < 0) {
                        TLRPC.Chat chat2 = this.profileActivity.getMessagesController().getChat(Long.valueOf(-jLongValue));
                        if (chat2 != null) {
                            userName = chat2.title;
                        }
                    } else if (jLongValue >= 0 && (user2 = this.profileActivity.getMessagesController().getUser(l)) != null) {
                        if (UserObject.isAnonymous(user2)) {
                            userName = LocaleController.getString(R.string.AnonymousForward);
                        } else {
                            userName = UserObject.getUserName(user2);
                        }
                    }
                }
                AlertDialog alertDialogCreate3 = new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(arrayList3.size() == 1 ? LocaleController.formatString(z ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, userName) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList3.size(), new Object[0])).setMessage(arrayList3.size() == 1 ? LocaleController.formatString(z ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, userName) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList3.size(), new Object[0])).setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i5) {
                        this.f$0.lambda$onActionBarItemClick$45(arrayList3, alertDialog, i5);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
                this.profileActivity.showDialog(alertDialogCreate3);
                TextView textView = (TextView) alertDialogCreate3.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
                return;
            }
            if (DialogObject.isEncryptedDialog(this.dialog_id)) {
                encryptedChat = this.profileActivity.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.dialog_id)));
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(this.dialog_id)) {
                user = this.profileActivity.getMessagesController().getUser(Long.valueOf(this.dialog_id));
                chat = null;
                encryptedChat = null;
            } else {
                chat = this.profileActivity.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
                user = null;
                encryptedChat = null;
            }
            AlertsCreator.createDeleteMessagesAlert(this.profileActivity, user, chat, encryptedChat, null, this.mergeDialogId, null, this.selectedFiles, null, 0, 0, null, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onActionBarItemClick$46();
                }
            }, null, this.resourcesProvider);
            return;
        }
        if (i == 100) {
            if (this.userInfo != null && this.profileActivity.getMessagesController().isUserNoForwards(this.userInfo)) {
                HintView hintView = this.fwdRestrictedHint;
                if (hintView != null) {
                    hintView.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.fwdRestrictedHint.showForView(view, true);
                    return;
                }
                return;
            }
            if (this.info != null) {
                TLRPC.Chat chat3 = this.profileActivity.getMessagesController().getChat(Long.valueOf(this.info.id));
                if (this.profileActivity.getMessagesController().isChatNoForwards(chat3)) {
                    HintView hintView2 = this.fwdRestrictedHint;
                    if (hintView2 != null) {
                        hintView2.setText((!ChatObject.isChannel(chat3) || chat3.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                        this.fwdRestrictedHint.showForView(view, true);
                        return;
                    }
                    return;
                }
            }
            if (hasNoforwardsMessage()) {
                HintView hintView3 = this.fwdRestrictedHint;
                if (hintView3 != null) {
                    hintView3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.fwdRestrictedHint.showForView(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                @Override
                public boolean canSelectStories() {
                    return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
                }

                @Override
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList4, CharSequence charSequence, boolean z2, boolean z3, int i5, int i6, TopicsFragment topicsFragment) {
                    return this.f$0.lambda$onActionBarItemClick$47(dialogsActivity2, arrayList4, charSequence, z2, z3, i5, i6, topicsFragment);
                }

                @Override
                public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                    return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
                }
            });
            this.profileActivity.presentFragment(dialogsActivity);
            return;
        }
        if (i == 102) {
            if (this.selectedFiles[0].size() + this.selectedFiles[1].size() != 1) {
                return;
            }
            SparseArray[] sparseArrayArr = this.selectedFiles;
            MessageObject messageObject = (MessageObject) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
            Bundle bundle2 = new Bundle();
            long dialogId = messageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
            } else if (DialogObject.isUserDialog(dialogId)) {
                bundle2.putLong("user_id", dialogId);
            } else {
                TLRPC.Chat chat4 = this.profileActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (chat4 != null && chat4.migrated_to != null) {
                    bundle2.putLong("migrated_to", dialogId);
                    dialogId = -chat4.migrated_to.channel_id;
                }
                bundle2.putLong("chat_id", -dialogId);
            }
            bundle2.putInt("message_id", messageObject.getId());
            bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
            ChatActivity chatActivity = new ChatActivity(bundle2);
            chatActivity.highlightMessageId = messageObject.getId();
            long j2 = this.topicId;
            if (j2 != 0) {
                ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(dialogId, j2));
                bundle2.putInt("message_id", messageObject.getId());
            }
            this.profileActivity.presentFragment(chatActivity, false);
            return;
        }
        if (i == 103 || i == 104) {
            if (getClosestTab() == 8) {
                StoriesAdapter storiesAdapter = this.storiesAdapter;
                if (storiesAdapter == null || storiesAdapter.storiesList == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                for (int i5 = 0; i5 < this.selectedFiles[0].size(); i5++) {
                    arrayList4.add(Integer.valueOf(((MessageObject) this.selectedFiles[0].valueAt(i5)).getId()));
                }
                pinOnUnpinStories(arrayList4, i == 103);
                closeActionMode(false);
                return;
            }
            SavedMessagesController savedMessagesController2 = this.profileActivity.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i6 = 0; i6 < savedMessagesController2.allDialogs.size(); i6++) {
                long j3 = savedMessagesController2.allDialogs.get(i6).dialogId;
                if (this.savedDialogsAdapter.selectedDialogs.contains(Long.valueOf(j3))) {
                    arrayList5.add(Long.valueOf(j3));
                }
            }
            if (savedMessagesController2.updatePinned(arrayList5, i == 103, true)) {
                int i7 = 0;
                while (true) {
                    MediaPage[] mediaPageArr = this.mediaPages;
                    if (i7 >= mediaPageArr.length) {
                        break;
                    }
                    MediaPage mediaPage = mediaPageArr[i7];
                    if (mediaPage.selectedType == 11) {
                        mediaPage.layoutManager.scrollToPositionWithOffset(0, 0);
                        break;
                    }
                    i7++;
                }
            } else {
                this.profileActivity.showDialog(new LimitReachedBottomSheet(this.profileActivity, getContext(), 33, this.profileActivity.getCurrentAccount(), null));
            }
            closeActionMode(true);
        }
    }

    public void lambda$onActionBarItemClick$41(StoriesController.BotPreviewsList botPreviewsList, ArrayList arrayList, AlertDialog alertDialog, int i) {
        botPreviewsList.delete(arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).show();
        closeActionMode(false);
    }

    public void lambda$onActionBarItemClick$43(ArrayList arrayList, AlertDialog alertDialog, int i) {
        this.profileActivity.getMessagesController().getStoriesController().deleteStories(this.dialog_id, arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatPluralString("StoriesDeleted", arrayList.size(), new Object[0])).show();
        closeActionMode(false);
    }

    public void lambda$onActionBarItemClick$45(ArrayList arrayList, AlertDialog alertDialog, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.profileActivity.getMessagesController().deleteSavedDialog(((Long) arrayList.get(i2)).longValue());
        }
        closeActionMode();
    }

    public void lambda$onActionBarItemClick$46() {
        showActionMode(false);
        this.actionBar.closeSearchField();
        this.cantDeleteMessagesCount = 0;
    }

    public boolean lambda$onActionBarItemClick$47(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) throws Resources.NotFoundException {
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        int i3 = 1;
        while (true) {
            if (i3 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i4 = 0; i4 < this.selectedFiles[i3].size(); i4++) {
                arrayList3.add(Integer.valueOf(this.selectedFiles[i3].keyAt(i4)));
            }
            Collections.sort(arrayList3);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num.intValue() > 0) {
                    arrayList2.add((MessageObject) this.selectedFiles[i3].get(num.intValue()));
                }
            }
            this.selectedFiles[i3].clear();
            i3--;
        }
        this.cantDeleteMessagesCount = 0;
        showActionMode(false);
        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
        if (savedDialogsAdapter != null) {
            savedDialogsAdapter.unselectAll();
        }
        if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == this.profileActivity.getUserConfig().getClientUserId() || charSequence != null) {
            updateRowsSelection(true);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                long j = ((MessagesStorage.TopicKey) arrayList.get(i5)).dialogId;
                if (charSequence != null) {
                    this.profileActivity.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                this.profileActivity.getSendMessagesHelper().sendMessage(arrayList2, j, false, false, true, 0, 0L);
            }
            dialogsActivity.finishFragment();
            BaseFragment baseFragment = this.profileActivity;
            UndoView undoView = baseFragment instanceof ProfileActivity ? ((ProfileActivity) baseFragment).getUndoView() : null;
            if (undoView != null) {
                if (arrayList.size() == 1) {
                    undoView.showWithAction(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, 53, Integer.valueOf(arrayList2.size()));
                } else {
                    undoView.showWithAction(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), (Runnable) null, (Runnable) null);
                }
            }
        } else {
            long j2 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle bundle = new Bundle();
            bundle.putBoolean("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j2)) {
                bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j2));
            } else {
                if (DialogObject.isUserDialog(j2)) {
                    bundle.putLong("user_id", j2);
                } else {
                    bundle.putLong("chat_id", -j2);
                }
                if (!this.profileActivity.getMessagesController().checkCanOpenChat(bundle, dialogsActivity)) {
                    return true;
                }
            }
            this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            ChatActivity chatActivity = new ChatActivity(bundle);
            ForumUtilities.applyTopic(chatActivity, (MessagesStorage.TopicKey) arrayList.get(0));
            dialogsActivity.presentFragment(chatActivity, true);
            chatActivity.showFieldPanelForForward(true, arrayList2);
        }
        return true;
    }

    private void pinOnUnpinStories(ArrayList arrayList, boolean z) {
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter == null || storiesAdapter.storiesList == null) {
            return;
        }
        if (z && arrayList.size() > this.profileActivity.getMessagesController().storiesPinnedToTopCountMax) {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", this.profileActivity.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).show();
            return;
        }
        if (this.storiesAdapter.storiesList.updatePinned(arrayList, z)) {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", this.profileActivity.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).show();
        } else if (z) {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_pin, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0])).show();
        } else {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_unpin, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).show();
        }
    }

    public void selectTabWithId(int i, float f) {
        if (this.scrollSlidingTextTabStrip != null) {
            this.scrollSlidingTextTabStrip.selectTabWithId(isStoryAlbumPageType(i) ? 8 : i, f);
        }
        if (this.storiesContainer != null) {
            if (isStoryAlbumPageType(i)) {
                this.storiesContainer.selectTabWithId(storyAlbums_getAlbumIdByTabType(i), f);
            } else if (i == 8) {
                this.storiesContainer.selectTabWithId(0, f);
            }
        }
    }

    private int getNextPageId(boolean z) {
        int nextAlbumId;
        int closestTab = getClosestTab();
        int nextPageId = this.scrollSlidingTextTabStrip.getNextPageId(z);
        if (this.storiesContainer != null) {
            if (isStoryAlbumPageType(closestTab) || closestTab == 8) {
                nextAlbumId = this.storiesContainer.getNextAlbumId(z);
            } else {
                nextAlbumId = (isStoryAlbumPageType(nextPageId) || nextPageId == 8) ? this.storiesContainer.getCurrentAlbumId() : -1;
            }
            if (nextAlbumId == 0) {
                return 8;
            }
            if (nextAlbumId > 0) {
                return storyAlbums_getByAlbumId(nextAlbumId).tabType;
            }
        }
        return nextPageId;
    }

    private boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
        MediaPage mediaPage;
        ProfileGiftsContainer profileGiftsContainer;
        BotPreviewsEditContainer botPreviewsEditContainer;
        int nextPageId = getNextPageId(z);
        if (nextPageId < 0) {
            return false;
        }
        if (this.searchItem != null && !canShowSearchItem()) {
            this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
            this.searchAlpha = 0.0f;
        } else {
            this.searchAlpha = getSearchAlpha(0.0f);
            updateSearchItemIcon(0.0f);
        }
        if (this.searching && getSelectedTab() == 11) {
            return false;
        }
        if (canEditStories() && this.isActionModeShowed && (getClosestTab() == 8 || isStoryAlbumPageType(getClosestTab()))) {
            return false;
        }
        MediaPage mediaPage2 = this.mediaPages[0];
        if (mediaPage2 != null && mediaPage2.selectedType == 13 && (botPreviewsEditContainer = this.botPreviewsContainer) != null && !botPreviewsEditContainer.canScroll(z)) {
            return false;
        }
        MediaPage mediaPage3 = this.mediaPages[0];
        if (mediaPage3 != null && mediaPage3.selectedType == 14 && (profileGiftsContainer = this.giftsContainer) != null && !profileGiftsContainer.canScroll(z)) {
            return false;
        }
        if (this.isActionModeShowed && (mediaPage = this.mediaPages[0]) != null && mediaPage.selectedType == 13) {
            return false;
        }
        ProfileGiftsContainer profileGiftsContainer2 = this.giftsContainer;
        if (profileGiftsContainer2 != null && profileGiftsContainer2.isReordering()) {
            return false;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs != null && profileStoriesCollectionTabs.isReordering()) {
            return false;
        }
        updateOptionsSearch();
        getParent().requestDisallowInterceptTouchEvent(true);
        hideFloatingDateView(true);
        this.maybeStartTracking = false;
        this.startedTracking = true;
        onTabScroll(true);
        this.startedTrackingX = (int) motionEvent.getX();
        this.actionBar.setEnabled(false);
        this.scrollSlidingTextTabStrip.setEnabled(false);
        MediaPage mediaPage4 = this.mediaPages[1];
        mediaPage4.selectedType = nextPageId;
        mediaPage4.setVisibility(0);
        this.animatingForward = z;
        switchToCurrentSelectedMode(true);
        if (z) {
            this.mediaPages[1].setTranslationX(r7[0].getMeasuredWidth());
        } else {
            this.mediaPages[1].setTranslationX(-r7[0].getMeasuredWidth());
        }
        onTabProgress(getTabProgress());
        return true;
    }

    @Override
    public void forceHasOverlappingRendering(boolean z) {
        super.forceHasOverlappingRendering(z);
    }

    @Override
    public void setPadding(int i, int i2, int i3, int i4) {
        this.topPadding = i2;
        int i5 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i5 >= mediaPageArr.length) {
                break;
            }
            mediaPageArr[i5].setTranslationY(this.topPadding - this.lastMeasuredTopPadding);
            i5++;
        }
        if (this.topPanelLayout != null) {
            checkUi_topPanelLayoutY();
        } else {
            FragmentContextView fragmentContextView = this.fragmentContextView;
            if (fragmentContextView != null) {
                fragmentContextView.setTranslationY(AndroidUtilities.dp(48.0f) + i2);
            }
        }
        this.additionalFloatingTranslation = i2;
        ChatActionCell chatActionCell = this.floatingDateView;
        chatActionCell.setTranslationY((chatActionCell.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.additionalFloatingTranslation);
    }

    public void checkUi_topPanelLayoutY() {
        if (this.topPanelLayout != null) {
            ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
            float fDp = 0.0f;
            if (profileStoriesCollectionTabs != null) {
                fDp = 0.0f + (AndroidUtilities.dp(38.0f) * this.storiesContainer.getVisibilityFactor() * (1.0f - Math.abs(profileStoriesCollectionTabs.getTranslationX() / this.storiesContainer.getMeasuredWidth())));
            }
            this.topPanelLayout.setTranslationY(this.topPadding + fDp);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int height = this.delegate.getListView() != null ? this.delegate.getListView().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (childAt instanceof MediaPage) {
                    measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec(height, 1073741824), 0);
                    MediaPage mediaPage = (MediaPage) childAt;
                    mediaPage.listView.setPadding(0, mediaPage.listView.topPadding, 0, mediaPage.listView.bottomPadding);
                } else {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                }
            }
        }
    }

    public boolean checkTabsAnimationInProgress() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.checkTabsAnimationInProgress():boolean");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return checkTabsAnimationInProgress() || this.scrollSlidingTextTabStrip.isAnimatingIndicator() || onTouchEvent(motionEvent);
    }

    public boolean isCurrentTabFirst() {
        return getSelectedTab() == this.scrollSlidingTextTabStrip.getFirstTabId();
    }

    public RecyclerListView getCurrentListView() {
        ChatActivityContainer chatActivityContainer;
        MediaPage mediaPage = this.mediaPages[0];
        int i = mediaPage.selectedType;
        if (i == 13) {
            return this.botPreviewsContainer.getCurrentListView();
        }
        if (i == 14) {
            return this.giftsContainer.getCurrentListView();
        }
        if (i != 12 || (chatActivityContainer = this.savedMessagesContainer) == null) {
            return mediaPage.listView;
        }
        return chatActivityContainer.chatActivity.getChatListView();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.disableScrolling || this.profileActivity.getParentLayout() == null || this.profileActivity.getParentLayout().checkTransitionAnimation() || checkTabsAnimationInProgress() || this.isInPinchToZoomTouchMode) {
            return false;
        }
        if (motionEvent != null) {
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            HintView hintView = this.fwdRestrictedHint;
            if (hintView != null) {
                hintView.hide();
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.startedTracking && !this.maybeStartTracking && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
            this.startedTrackingPointerId = motionEvent.getPointerId(0);
            this.maybeStartTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            this.startedTrackingY = (int) motionEvent.getY();
            this.velocityTracker.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
            int x = (int) (motionEvent.getX() - this.startedTrackingX);
            int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
            if (this.startedTracking && (((z = this.animatingForward) && x > 0) || (!z && x < 0))) {
                if (!prepareForMoving(motionEvent, x < 0)) {
                    this.maybeStartTracking = true;
                    this.startedTracking = false;
                    onTabScroll(false);
                    this.mediaPages[0].setTranslationX(0.0f);
                    this.mediaPages[1].setTranslationX(this.animatingForward ? r4[0].getMeasuredWidth() : -r4[0].getMeasuredWidth());
                    selectTabWithId(this.mediaPages[1].selectedType, 0.0f);
                    onTabProgress(getTabProgress());
                }
            }
            if (!this.maybeStartTracking || this.startedTracking) {
                if (this.startedTracking) {
                    this.mediaPages[0].setTranslationX(x);
                    if (this.animatingForward) {
                        this.mediaPages[1].setTranslationX(r9[0].getMeasuredWidth() + x);
                    } else {
                        this.mediaPages[1].setTranslationX(x - r9[0].getMeasuredWidth());
                    }
                    float fAbs = Math.abs(x) / this.mediaPages[0].getMeasuredWidth();
                    if (!canShowSearchItem()) {
                        this.searchAlpha = 0.0f;
                    } else {
                        this.searchAlpha = getSearchAlpha(fAbs);
                        updateSearchItemIcon(fAbs);
                        float photoVideoOptionsAlpha = getPhotoVideoOptionsAlpha(fAbs);
                        this.optionsAlpha = photoVideoOptionsAlpha;
                        this.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !canShowSearchItem() || isArchivedOnlyStoriesView()) ? 4 : 0);
                    }
                    updateOptionsSearch();
                    selectTabWithId(this.mediaPages[1].selectedType, fAbs);
                    onTabProgress(getTabProgress());
                    onSelectedTabChanged();
                }
            } else if (Math.abs(x) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x) > iAbs) {
                prepareForMoving(motionEvent, x < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            stopScroll(motionEvent);
        }
        return this.startedTracking;
    }

    public void scrollToPage(int i) {
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner;
        if (this.disableScrolling || (scrollSlidingTextTabStripInner = this.scrollSlidingTextTabStrip) == null) {
            return;
        }
        scrollSlidingTextTabStripInner.scrollTo(i);
    }

    private void stopScroll(MotionEvent motionEvent) {
        float xVelocity;
        float yVelocity;
        float measuredWidth;
        int measuredWidth2;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        if (motionEvent == null || motionEvent.getAction() == 3) {
            xVelocity = 0.0f;
            yVelocity = 0.0f;
        } else {
            xVelocity = this.velocityTracker.getXVelocity();
            yVelocity = this.velocityTracker.getYVelocity();
            if (!this.startedTracking && Math.abs(xVelocity) >= 3000.0f && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                prepareForMoving(motionEvent, xVelocity < 0.0f);
            }
        }
        if (this.startedTracking) {
            float x = this.mediaPages[0].getX();
            this.tabsAnimation = new AnimatorSet();
            this.backAnimation = Math.abs(x) < ((float) this.mediaPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$stopScroll$48(valueAnimator);
                }
            });
            if (this.backAnimation) {
                measuredWidth = Math.abs(x);
                if (this.animatingForward) {
                    AnimatorSet animatorSet = this.tabsAnimation;
                    MediaPage mediaPage = this.mediaPages[0];
                    Property property = View.TRANSLATION_X;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(mediaPage, (Property<MediaPage, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.mediaPages[1], (Property<MediaPage, Float>) property, r11.getMeasuredWidth()), valueAnimatorOfFloat);
                } else {
                    AnimatorSet animatorSet2 = this.tabsAnimation;
                    MediaPage mediaPage2 = this.mediaPages[0];
                    Property property2 = View.TRANSLATION_X;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(mediaPage2, (Property<MediaPage, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.mediaPages[1], (Property<MediaPage, Float>) property2, -r11.getMeasuredWidth()), valueAnimatorOfFloat);
                }
            } else {
                measuredWidth = this.mediaPages[0].getMeasuredWidth() - Math.abs(x);
                if (this.animatingForward) {
                    AnimatorSet animatorSet3 = this.tabsAnimation;
                    MediaPage mediaPage3 = this.mediaPages[0];
                    Property property3 = View.TRANSLATION_X;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(mediaPage3, (Property<MediaPage, Float>) property3, -mediaPage3.getMeasuredWidth()), ObjectAnimator.ofFloat(this.mediaPages[1], (Property<MediaPage, Float>) property3, 0.0f), valueAnimatorOfFloat);
                } else {
                    AnimatorSet animatorSet4 = this.tabsAnimation;
                    MediaPage mediaPage4 = this.mediaPages[0];
                    Property property4 = View.TRANSLATION_X;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(mediaPage4, (Property<MediaPage, Float>) property4, mediaPage4.getMeasuredWidth()), ObjectAnimator.ofFloat(this.mediaPages[1], (Property<MediaPage, Float>) property4, 0.0f), valueAnimatorOfFloat);
                }
            }
            this.tabsAnimation.setInterpolator(interpolator);
            int measuredWidth3 = getMeasuredWidth();
            float f = measuredWidth3 / 2;
            float fDistanceInfluenceForSnapDuration = f + (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f);
            float fAbs = Math.abs(xVelocity);
            if (fAbs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.tabsAnimation.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.tabsAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SharedMediaLayout.this.tabsAnimation = null;
                    if (SharedMediaLayout.this.backAnimation) {
                        SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                        if (SharedMediaLayout.this.searchItem != null && !SharedMediaLayout.this.canShowSearchItem()) {
                            SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                            SharedMediaLayout.this.searchAlpha = 0.0f;
                        } else {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            sharedMediaLayout.searchAlpha = sharedMediaLayout.getSearchAlpha(0.0f);
                            SharedMediaLayout.this.updateSearchItemIcon(0.0f);
                        }
                        SharedMediaLayout.this.updateOptionsSearch();
                        SharedMediaLayout.this.searchItemState = 0;
                    } else {
                        MediaPage mediaPage5 = SharedMediaLayout.this.mediaPages[0];
                        SharedMediaLayout.this.mediaPages[0] = SharedMediaLayout.this.mediaPages[1];
                        SharedMediaLayout.this.mediaPages[1] = mediaPage5;
                        SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                        if (SharedMediaLayout.this.searchItem != null && SharedMediaLayout.this.searchItemState == 2) {
                            SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                        }
                        SharedMediaLayout.this.searchItemState = 0;
                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                        sharedMediaLayout2.selectTabWithId(sharedMediaLayout2.mediaPages[0].selectedType, 1.0f);
                        SharedMediaLayout.this.onSelectedTabChanged();
                        SharedMediaLayout.this.startStopVisibleGifs();
                    }
                    SharedMediaLayout.this.tabsAnimationInProgress = false;
                    SharedMediaLayout.this.maybeStartTracking = false;
                    SharedMediaLayout.this.startedTracking = false;
                    SharedMediaLayout.this.onTabScroll(false);
                    SharedMediaLayout.this.actionBar.setEnabled(true);
                    SharedMediaLayout.this.scrollSlidingTextTabStrip.setEnabled(true);
                }
            });
            this.tabsAnimation.start();
            this.tabsAnimationInProgress = true;
            this.startedTracking = false;
            onSelectedTabChanged();
        } else {
            this.maybeStartTracking = false;
            this.actionBar.setEnabled(true);
            this.scrollSlidingTextTabStrip.setEnabled(true);
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.velocityTracker = null;
        }
    }

    public void lambda$stopScroll$48(ValueAnimator valueAnimator) {
        onTabProgress(getTabProgress());
    }

    public void disableScroll(boolean z) {
        if (z) {
            stopScroll(null);
        }
        this.disableScrolling = z;
    }

    public boolean closeActionMode() {
        return closeActionMode(true);
    }

    public boolean closeActionMode(boolean z) {
        if (!this.isActionModeShowed) {
            return false;
        }
        for (int i = 1; i >= 0; i--) {
            this.selectedFiles[i].clear();
        }
        this.cantDeleteMessagesCount = 0;
        onActionModeSelectedUpdate(this.selectedFiles[0]);
        BotPreviewsEditContainer botPreviewsEditContainer = this.botPreviewsContainer;
        if (botPreviewsEditContainer != null) {
            botPreviewsEditContainer.unselectAll();
            this.botPreviewsContainer.updateSelection(true);
        }
        showActionMode(false);
        updateRowsSelection(z);
        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
        if (savedDialogsAdapter != null) {
            savedDialogsAdapter.unselectAll();
        }
        return true;
    }

    public void setVisibleHeight(int i) {
        this.lastVisibleHeight = i;
        for (int i2 = 0; i2 < this.mediaPages.length; i2++) {
            float f = (-(getMeasuredHeight() - Math.max(i, AndroidUtilities.dp(this.mediaPages[i2].selectedType == 8 ? 280.0f : 120.0f)))) / 2.0f;
            this.mediaPages[i2].emptyView.setTranslationY(f);
            this.mediaPages[i2].progressView.setTranslationY(-f);
        }
        BotPreviewsEditContainer botPreviewsEditContainer = this.botPreviewsContainer;
        if (botPreviewsEditContainer != null) {
            botPreviewsEditContainer.setVisibleHeight(i);
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null) {
            profileGiftsContainer.setVisibleHeight(i);
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.selectedFiles[0];
    }

    public boolean isActionModeShown() {
        return this.isActionModeShowed;
    }

    protected void showActionMode(final boolean z) {
        if (this.isActionModeShowed == z) {
            return;
        }
        this.isActionModeShowed = z;
        AnimatorSet animatorSet = this.actionModeAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            this.actionModeLayout.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.actionModeAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.actionModeLayout, (Property<LinearLayout, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.actionModeAnimation.setDuration(180L);
        this.actionModeAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                SharedMediaLayout.this.actionModeAnimation = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (SharedMediaLayout.this.actionModeAnimation == null) {
                    return;
                }
                SharedMediaLayout.this.actionModeAnimation = null;
                if (z) {
                    return;
                }
                SharedMediaLayout.this.actionModeLayout.setVisibility(4);
            }
        });
        this.actionModeAnimation.start();
        if (z) {
            updateStoriesPinButton();
        }
    }

    private void updateStoriesPinButton() {
        boolean z;
        StoriesController.StoriesList storiesList;
        if (isBot()) {
            ActionBarMenuItem actionBarMenuItem = this.pinItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem2 = this.unpinItem;
            if (actionBarMenuItem2 != null) {
                actionBarMenuItem2.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            ActionBarMenuItem actionBarMenuItem3 = this.pinItem;
            if (actionBarMenuItem3 != null) {
                actionBarMenuItem3.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem4 = this.unpinItem;
            if (actionBarMenuItem4 != null) {
                actionBarMenuItem4.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 8) {
            int i = 0;
            while (true) {
                if (i >= this.selectedFiles[0].size()) {
                    z = false;
                    break;
                }
                MessageObject messageObject = (MessageObject) this.selectedFiles[0].valueAt(i);
                StoriesAdapter storiesAdapter = this.storiesAdapter;
                if (storiesAdapter != null && (storiesList = storiesAdapter.storiesList) != null && !storiesList.isPinned(messageObject.getId())) {
                    z = true;
                    break;
                }
                i++;
            }
            ActionBarMenuItem actionBarMenuItem5 = this.pinItem;
            if (actionBarMenuItem5 != null) {
                actionBarMenuItem5.setVisibility(z ? 0 : 8);
            }
            ActionBarMenuItem actionBarMenuItem6 = this.unpinItem;
            if (actionBarMenuItem6 != null) {
                actionBarMenuItem6.setVisibility(z ? 8 : 0);
                return;
            }
            return;
        }
        if (isStoryAlbumPageType(getClosestTab())) {
            ActionBarMenuItem actionBarMenuItem7 = this.pinItem;
            if (actionBarMenuItem7 != null) {
                actionBarMenuItem7.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem8 = this.unpinItem;
            if (actionBarMenuItem8 != null) {
                actionBarMenuItem8.setVisibility(8);
            }
        }
    }

    @Override
    public void didReceivedNotification(int r34, int r35, java.lang.Object... r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public void saveScrollPosition() {
        int i;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return;
            }
            InternalListView internalListView = mediaPageArr[i2].listView;
            if (internalListView != null) {
                int id = 0;
                int top = 0;
                for (int i3 = 0; i3 < internalListView.getChildCount(); i3++) {
                    View childAt = internalListView.getChildAt(i3);
                    if (childAt instanceof SharedPhotoVideoCell2) {
                        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                        int messageId = sharedPhotoVideoCell2.getMessageId();
                        top = sharedPhotoVideoCell2.getTop();
                        id = messageId;
                    }
                    if (childAt instanceof SharedDocumentCell) {
                        SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) childAt;
                        int id2 = sharedDocumentCell.getMessage().getId();
                        top = sharedDocumentCell.getTop();
                        id = id2;
                    }
                    if (childAt instanceof SharedAudioCell) {
                        SharedAudioCell sharedAudioCell = (SharedAudioCell) childAt;
                        id = sharedAudioCell.getMessage().getId();
                        top = sharedAudioCell.getTop();
                    }
                    if (id != 0) {
                        break;
                    }
                }
                if (id != 0) {
                    int i4 = this.mediaPages[i2].selectedType;
                    int i5 = -1;
                    if (isAnyStoryPageType(i4)) {
                        StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(i4);
                        if (storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null && storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList != null) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList.messageObjects.size()) {
                                    break;
                                }
                                if (id == ((MessageObject) storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList.messageObjects.get(i6)).getId()) {
                                    i5 = i6;
                                    break;
                                }
                                i6++;
                            }
                        }
                        i = i5;
                    } else if (i4 >= 0 && i4 < this.sharedMediaData.length) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= this.sharedMediaData[i4].messages.size()) {
                                break;
                            }
                            if (id == ((MessageObject) this.sharedMediaData[i4].messages.get(i7)).getId()) {
                                i5 = i7;
                                break;
                            }
                            i7++;
                        }
                        i = this.sharedMediaData[i4].startOffset + i5;
                    }
                    if (i5 >= 0) {
                        ((LinearLayoutManager) internalListView.getLayoutManager()).scrollToPositionWithOffset(i, (-this.mediaPages[i2].listView.getPaddingTop()) + top);
                        if (this.photoVideoChangeColumnsAnimation) {
                            this.mediaPages[i2].animationSupportingLayoutManager.scrollToPositionWithOffset(i, (-this.mediaPages[i2].listView.getPaddingTop()) + top);
                        }
                    }
                }
            }
            i2++;
        }
    }

    public void animateItemsEnter(RecyclerListView recyclerListView, int i, SparseBooleanArray sparseBooleanArray) {
        int childCount = recyclerListView.getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerListView.getChildAt(i2);
            if (childAt instanceof FlickerLoadingView) {
                view = childAt;
            }
        }
        if (view != null) {
            recyclerListView.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new AnonymousClass45(recyclerListView, sparseBooleanArray, view, i));
    }

    class AnonymousClass45 implements ViewTreeObserver.OnPreDrawListener {
        final SparseBooleanArray val$addedMesages;
        final RecyclerListView val$finalListView;
        final View val$finalProgressView;
        final int val$oldItemCount;

        AnonymousClass45(RecyclerListView recyclerListView, SparseBooleanArray sparseBooleanArray, View view, int i) {
            this.val$finalListView = recyclerListView;
            this.val$addedMesages = sparseBooleanArray;
            this.val$finalProgressView = view;
            this.val$oldItemCount = i;
        }

        @Override
        public boolean onPreDraw() {
            SharedMediaLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            RecyclerView.Adapter adapter = this.val$finalListView.getAdapter();
            if (adapter == SharedMediaLayout.this.photoVideoAdapter || adapter == SharedMediaLayout.this.documentsAdapter || adapter == SharedMediaLayout.this.audioAdapter || adapter == SharedMediaLayout.this.voiceAdapter) {
                if (this.val$addedMesages != null) {
                    int childCount = this.val$finalListView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        final int messageId = SharedMediaLayout.getMessageId(this.val$finalListView.getChildAt(i));
                        if (messageId != 0 && this.val$addedMesages.get(messageId, false)) {
                            SharedMediaLayout.this.messageAlphaEnter.put(messageId, Float.valueOf(0.0f));
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            final RecyclerListView recyclerListView = this.val$finalListView;
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    this.f$0.lambda$onPreDraw$0(messageId, recyclerListView, valueAnimator);
                                }
                            });
                            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    SharedMediaLayout.this.messageAlphaEnter.remove(messageId);
                                    AnonymousClass45.this.val$finalListView.invalidate();
                                }
                            });
                            valueAnimatorOfFloat.setStartDelay((int) ((Math.min(this.val$finalListView.getMeasuredHeight(), Math.max(0, r7.getTop())) / this.val$finalListView.getMeasuredHeight()) * 100.0f));
                            valueAnimatorOfFloat.setDuration(250L);
                            final RecyclerListView recyclerListView2 = this.val$finalListView;
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$1(recyclerListView2, valueAnimator);
                                }
                            });
                            valueAnimatorOfFloat.start();
                        }
                        this.val$finalListView.invalidate();
                    }
                }
            } else {
                int childCount2 = this.val$finalListView.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt = this.val$finalListView.getChildAt(i2);
                    if (childAt != this.val$finalProgressView && this.val$finalListView.getChildAdapterPosition(childAt) >= this.val$oldItemCount - 1) {
                        childAt.setAlpha(0.0f);
                        int iMin = (int) ((Math.min(this.val$finalListView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / this.val$finalListView.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat.setStartDelay(iMin);
                        objectAnimatorOfFloat.setDuration(200L);
                        final RecyclerListView recyclerListView3 = this.val$finalListView;
                        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$2(recyclerListView3, valueAnimator);
                            }
                        });
                        animatorSet.playTogether(objectAnimatorOfFloat);
                    }
                    View view = this.val$finalProgressView;
                    if (view != null && view.getParent() == null) {
                        this.val$finalListView.addView(this.val$finalProgressView);
                        final RecyclerView.LayoutManager layoutManager = this.val$finalListView.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.ignoreView(this.val$finalProgressView);
                            View view2 = this.val$finalProgressView;
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 0.0f);
                            objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    AnonymousClass45.this.val$finalProgressView.setAlpha(1.0f);
                                    layoutManager.stopIgnoringView(AnonymousClass45.this.val$finalProgressView);
                                    AnonymousClass45 anonymousClass45 = AnonymousClass45.this;
                                    anonymousClass45.val$finalListView.removeView(anonymousClass45.val$finalProgressView);
                                }
                            });
                            final RecyclerListView recyclerListView4 = this.val$finalListView;
                            objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$3(recyclerListView4, valueAnimator);
                                }
                            });
                            objectAnimatorOfFloat2.start();
                        }
                    }
                }
                animatorSet.start();
            }
            return true;
        }

        public void lambda$onPreDraw$0(int i, RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            SharedMediaLayout.this.messageAlphaEnter.put(i, (Float) valueAnimator.getAnimatedValue());
            recyclerListView.invalidate();
        }

        public static void lambda$onPreDraw$1(RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            if (recyclerListView.hasSections()) {
                recyclerListView.invalidate();
            }
        }

        public static void lambda$onPreDraw$2(RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            if (recyclerListView.hasSections()) {
                recyclerListView.invalidate();
            }
        }

        public static void lambda$onPreDraw$3(RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            if (recyclerListView.hasSections()) {
                recyclerListView.invalidate();
            }
        }
    }

    public void onResume() {
        this.scrolling = true;
        SharedPhotoVideoAdapter sharedPhotoVideoAdapter = this.photoVideoAdapter;
        if (sharedPhotoVideoAdapter != null) {
            sharedPhotoVideoAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter = this.documentsAdapter;
        if (sharedDocumentsAdapter != null) {
            sharedDocumentsAdapter.notifyDataSetChanged();
        }
        SharedLinksAdapter sharedLinksAdapter = this.linksAdapter;
        if (sharedLinksAdapter != null) {
            sharedLinksAdapter.notifyDataSetChanged();
        }
        for (int i = 0; i < this.mediaPages.length; i++) {
            fixLayoutInternal(i);
        }
        ChatActivityContainer chatActivityContainer = this.savedMessagesContainer;
        if (chatActivityContainer != null) {
            chatActivityContainer.onResume();
        }
    }

    public void onPause() {
        ChatActivityContainer chatActivityContainer = this.savedMessagesContainer;
        if (chatActivityContainer != null) {
            chatActivityContainer.onPause();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            if (mediaPageArr[i].listView != null) {
                this.mediaPages[i].listView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        SharedMediaLayout.this.mediaPages[i].getViewTreeObserver().removeOnPreDrawListener(this);
                        SharedMediaLayout.this.fixLayoutInternal(i);
                        return true;
                    }
                });
            }
            i++;
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.info;
        boolean z = chatFull2 != null && chatFull2.stories_pinned_available;
        this.info = chatFull;
        if (chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.mergeDialogId == 0) {
                this.mergeDialogId = -j;
                int i = 0;
                while (true) {
                    SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                    if (i >= sharedMediaDataArr.length) {
                        break;
                    }
                    if (sharedMediaDataArr[i].messagesDict[1].size() == 0) {
                        SharedMediaData sharedMediaData = this.sharedMediaData[i];
                        sharedMediaData.max_id[1] = this.info.migrated_from_max_id;
                        sharedMediaData.endReached[1] = false;
                    }
                    i++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.info;
        if (chatFull3 == null || z == chatFull3.stories_pinned_available) {
            return;
        }
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner = this.scrollSlidingTextTabStrip;
        if (scrollSlidingTextTabStripInner != null) {
            scrollSlidingTextTabStripInner.setInitialTabId(isArchivedOnlyStoriesView() ? 9 : 8);
        }
        updateTabs(true);
        switchToCurrentSelectedMode(false);
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.userInfo;
        boolean z = userFull2 != null && userFull2.stories_pinned_available;
        this.userInfo = userFull;
        updateTabs(true);
        if (userFull == null || z == userFull.stories_pinned_available) {
            return;
        }
        scrollToPage(8);
    }

    public void setChatUsers(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i = 0;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 < mediaPageArr.length) {
                MediaPage mediaPage = mediaPageArr[i2];
                if (mediaPage.selectedType == 7 && mediaPage.listView.getAdapter() != null && this.mediaPages[i2].listView.getAdapter().getItemCount() != 0 && this.profileActivity.getMessagesController().getStoriesController().hasLoadingStories()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                if (this.topicId == 0) {
                    this.chatUsersAdapter.chatInfo = chatFull;
                    this.chatUsersAdapter.sortedUsers = arrayList;
                }
                updateTabs(true);
                while (true) {
                    MediaPage[] mediaPageArr2 = this.mediaPages;
                    if (i >= mediaPageArr2.length) {
                        return;
                    }
                    MediaPage mediaPage2 = mediaPageArr2[i];
                    if (mediaPage2.selectedType == 7 && mediaPage2.listView.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(this.mediaPages[i].listView);
                    }
                    i++;
                }
            }
        }
    }

    public void updateAdapters() {
        SharedPhotoVideoAdapter sharedPhotoVideoAdapter = this.photoVideoAdapter;
        if (sharedPhotoVideoAdapter != null) {
            sharedPhotoVideoAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter = this.documentsAdapter;
        if (sharedDocumentsAdapter != null) {
            sharedDocumentsAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter2 = this.voiceAdapter;
        if (sharedDocumentsAdapter2 != null) {
            sharedDocumentsAdapter2.notifyDataSetChanged();
        }
        SharedLinksAdapter sharedLinksAdapter = this.linksAdapter;
        if (sharedLinksAdapter != null) {
            sharedLinksAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter3 = this.audioAdapter;
        if (sharedDocumentsAdapter3 != null) {
            sharedDocumentsAdapter3.notifyDataSetChanged();
        }
        PollAdapter pollAdapter = this.pollAdapter;
        if (pollAdapter != null) {
            pollAdapter.notifyDataSetChanged();
        }
        GifAdapter gifAdapter = this.gifAdapter;
        if (gifAdapter != null) {
            gifAdapter.notifyDataSetChanged();
        }
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null) {
            storiesAdapter.notifyDataSetChanged();
        }
        Iterator it = this.storyAlbumsById.values().iterator();
        while (it.hasNext()) {
            ((StoryAlbumData) it.next()).adapter.notifyDataSetChanged();
        }
    }

    private void updateRowsSelection(boolean z) {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            int childCount = mediaPageArr[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mediaPages[i].listView.getChildAt(i2);
                if (childAt instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) childAt).setChecked(false, z);
                } else if (childAt instanceof SharedPhotoVideoCell2) {
                    ((SharedPhotoVideoCell2) childAt).setChecked(false, z);
                } else if (childAt instanceof SharedLinkCell) {
                    ((SharedLinkCell) childAt).setChecked(false, z);
                } else if (childAt instanceof SharedAudioCell) {
                    ((SharedAudioCell) childAt).setChecked(false, z);
                } else if (childAt instanceof ContextLinkCell) {
                    ((ContextLinkCell) childAt).setChecked(false, z);
                } else if (childAt instanceof DialogCell) {
                    ((DialogCell) childAt).setChecked(false, z);
                }
            }
            i++;
        }
    }

    public void setMergeDialogId(long j) {
        this.mergeDialogId = j;
    }

    public void updateTabs(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.updateTabs(boolean):void");
    }

    public static Boolean lambda$updateTabs$49(ArrayList arrayList, Integer num) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Pair) arrayList.get(i)).first == num) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void startStopVisibleGifs() {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            int childCount = mediaPageArr[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mediaPages[i].listView.getChildAt(i2);
                if (childAt instanceof ContextLinkCell) {
                    ImageReceiver photoImage = ((ContextLinkCell) childAt).getPhotoImage();
                    if (i == 0) {
                        photoImage.setAllowStartAnimation(true);
                        photoImage.startAnimation();
                    } else {
                        photoImage.setAllowStartAnimation(false);
                        photoImage.stopAnimation();
                    }
                }
            }
            i++;
        }
    }

    public void switchToCurrentSelectedMode(boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.switchToCurrentSelectedMode(boolean):void");
    }

    public void lambda$switchToCurrentSelectedMode$50(boolean z, int i, View view) {
        if (z) {
            openAddStoriesToAlbumSheet(this.profileActivity, this.dialog_id, i);
        } else {
            this.profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
            StoryRecorder.getInstance(this.profileActivity.getParentActivity(), this.profileActivity.getCurrentAccount()).open(null);
        }
    }

    public void lambda$switchToCurrentSelectedMode$51(View view) {
        this.profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
        StoryRecorder.getInstance(this.profileActivity.getParentActivity(), this.profileActivity.getCurrentAccount()).open(null);
    }

    public boolean onItemLongClick(MessageObject messageObject, View view, int i) {
        return onItemLongClick(messageObject, view, i, true);
    }

    private boolean onItemLongClick(final MessageObject messageObject, final View view, final int i, boolean z) {
        StoriesAdapter storiesAdapter;
        StoriesController.StoriesList storiesList;
        if (this.isActionModeShowed || this.profileActivity.getParentActivity() == null || messageObject == null) {
            return false;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs != null && profileStoriesCollectionTabs.isReordering()) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.profileActivity.getParentActivity().getCurrentFocus());
        int i2 = 8;
        if (z && ((isStoryAlbumPageType(getClosestTab()) || getClosestTab() == 8) && !isActionModeShown())) {
            if (view instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) view).initFullSizeReceiver();
            }
            final TL_stories.StoryItem storyItem = messageObject.storyItem;
            if (storyItem == null) {
                return false;
            }
            final HashSet hashSet = new HashSet();
            ArrayList<Integer> arrayList = storyItem.albums;
            if (arrayList != null) {
                hashSet.addAll(arrayList);
            }
            boolean zIsStoryAlbumPageType = isStoryAlbumPageType(getClosestTab());
            final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.profileActivity, view, true);
            final ItemOptions itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
            itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda350(itemOptionsMakeOptions));
            itemOptionsMakeSwipeback.addGap();
            ItemOptions.addAlbumsItemOptions(itemOptionsMakeSwipeback, getStoriesController().getStoryAlbumsList(this.dialog_id), hashSet, true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onItemLongClick$54(storyItem, itemOptionsMakeOptions);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$onItemLongClick$55(hashSet, storyItem, itemOptionsMakeOptions, (StoriesController.StoryAlbum) obj);
                }
            });
            itemOptionsMakeOptions.add(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new Runnable() {
                @Override
                public final void run() {
                    itemOptionsMakeOptions.openSwipeback(itemOptionsMakeSwipeback);
                }
            });
            itemOptionsMakeOptions.addGap();
            itemOptionsMakeOptions.add(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onItemLongClick$57(messageObject, view, i);
                }
            });
            if (zIsStoryAlbumPageType) {
                final int iStoryAlbums_getAlbumIdByTabType = storyAlbums_getAlbumIdByTabType(getClosestTab());
                final String albumName = getStoriesController().getAlbumName(this.dialog_id, iStoryAlbums_getAlbumIdByTabType);
                itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onItemLongClick$58(iStoryAlbums_getAlbumIdByTabType);
                    }
                });
                itemOptionsMakeOptions.add(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onItemLongClick$60(iStoryAlbums_getAlbumIdByTabType, storyItem, albumName);
                    }
                });
            } else {
                if (getClosestTab() == 8 && (storiesAdapter = this.storiesAdapter) != null && (storiesList = storiesAdapter.storiesList) != null) {
                    if (storiesList.isPinned(storyItem.id)) {
                        itemOptionsMakeOptions.add(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onItemLongClick$61(storyItem);
                            }
                        });
                    } else {
                        itemOptionsMakeOptions.add(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onItemLongClick$62(storyItem);
                            }
                        });
                    }
                }
                itemOptionsMakeOptions.add(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onItemLongClick$63(storyItem);
                    }
                });
            }
            itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onItemLongClick$66(storyItem);
                }
            });
            itemOptionsMakeOptions.setGravity(3);
            itemOptionsMakeOptions.setBlur(true);
            itemOptionsMakeOptions.allowMoveScrim();
            itemOptionsMakeOptions.allowMoveScrimGravity(3);
            Point point = AndroidUtilities.displaySize;
            Point point2 = AndroidUtilities.displaySize;
            int iMin = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
            itemOptionsMakeOptions.animateToSize(iMin, (iMin * 4) / 3);
            itemOptionsMakeOptions.setDrawScrim(true);
            itemOptionsMakeOptions.hideScrimUnder();
            itemOptionsMakeOptions.forceBottom(true);
            itemOptionsMakeOptions.show();
            return true;
        }
        this.selectedFiles[messageObject.getDialogId() == this.dialog_id ? (char) 0 : (char) 1].put(messageObject.getId(), messageObject);
        if (!messageObject.canDeleteMessage(false, null)) {
            this.cantDeleteMessagesCount++;
        }
        this.deleteItem.setVisibility(this.cantDeleteMessagesCount == 0 ? 0 : 8);
        ActionBarMenuItem actionBarMenuItem = this.gotoItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
        }
        ActionBarMenuItem actionBarMenuItem2 = this.forwardItem;
        if (actionBarMenuItem2 != null) {
            if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                i2 = 0;
            }
            actionBarMenuItem2.setVisibility(i2);
        }
        this.selectedMessagesCountTextView.setNumber(1, false);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < this.actionModeViews.size(); i3++) {
            View view2 = (View) this.actionModeViews.get(i3);
            AndroidUtilities.clearDrawableAnimation(view2);
            arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(250L);
        animatorSet.start();
        this.scrolling = false;
        if (view instanceof SharedDocumentCell) {
            ((SharedDocumentCell) view).setChecked(true, true);
        } else if (view instanceof SharedPhotoVideoCell) {
            ((SharedPhotoVideoCell) view).setChecked(i, true, true);
        } else if (view instanceof SharedLinkCell) {
            ((SharedLinkCell) view).setChecked(true, true);
        } else if (view instanceof SharedAudioCell) {
            ((SharedAudioCell) view).setChecked(true, true);
        } else if (view instanceof ContextLinkCell) {
            ((ContextLinkCell) view).setChecked(true, true);
        } else if (view instanceof SharedPhotoVideoCell2) {
            ((SharedPhotoVideoCell2) view).setChecked(true, true);
        }
        if (!this.isActionModeShowed) {
            showActionMode(true);
        }
        onActionModeSelectedUpdate(this.selectedFiles[0]);
        updateForwardItem();
        return true;
    }

    public void lambda$onItemLongClick$54(final TL_stories.StoryItem storyItem, ItemOptions itemOptions) {
        AlertsCreator.createStoriesAlbumEnterNameForCreate(getContext(), null, this.resourcesProvider, new MessagesStorage.StringCallback() {
            @Override
            public final void run(String str) {
                this.f$0.lambda$onItemLongClick$53(storyItem, str);
            }
        });
        itemOptions.dismiss();
    }

    public void lambda$onItemLongClick$53(final TL_stories.StoryItem storyItem, String str) {
        getStoriesController().createAlbum(this.dialog_id, str, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$onItemLongClick$52(storyItem, (StoriesController.StoryAlbum) obj);
            }
        });
    }

    public void lambda$onItemLongClick$52(TL_stories.StoryItem storyItem, StoriesController.StoryAlbum storyAlbum) {
        getStoriesController().addStoryToAlbum(this.dialog_id, storyAlbum.album_id, storyItem);
        onStoryAlbumCreate(storyAlbum);
    }

    public void lambda$onItemLongClick$55(HashSet hashSet, TL_stories.StoryItem storyItem, ItemOptions itemOptions, StoriesController.StoryAlbum storyAlbum) {
        String string;
        if (hashSet.contains(Integer.valueOf(storyAlbum.album_id))) {
            getStoriesController().addStoryToAlbum(this.dialog_id, storyAlbum.album_id, storyItem);
            string = LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title);
        } else {
            getStoriesController().removeStoryFromAlbum(this.dialog_id, storyAlbum.album_id, storyItem);
            string = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, storyAlbum.title);
        }
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(string)).show();
        itemOptions.dismiss();
    }

    public void lambda$onItemLongClick$57(MessageObject messageObject, View view, int i) {
        onItemLongClick(messageObject, view, i, false);
    }

    public void lambda$onItemLongClick$59(int i, TL_stories.StoryItem storyItem) {
        getStoriesController().addStoryToAlbum(this.dialog_id, i, storyItem);
    }

    public void lambda$onItemLongClick$60(final int i, final TL_stories.StoryItem storyItem, String str) {
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onItemLongClick$59(i, storyItem);
            }
        };
        getStoriesController().removeStoryFromAlbum(this.dialog_id, i, storyItem);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), runnable).show();
    }

    public void lambda$onItemLongClick$61(TL_stories.StoryItem storyItem) {
        pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
    }

    public void lambda$onItemLongClick$62(TL_stories.StoryItem storyItem) {
        pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
    }

    public void lambda$onItemLongClick$63(TL_stories.StoryItem storyItem) {
        getStoriesController().updateStoriesPinned(this.dialog_id, new ArrayList(Collections.singletonList(storyItem)), false, null);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", 1, new Object[0]), 5000).show();
    }

    public void lambda$onItemLongClick$66(final TL_stories.StoryItem storyItem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.DeleteStoryTitle));
        builder.setMessage(LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]));
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$onItemLongClick$64(storyItem, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialogCreate.redPositive();
    }

    public void lambda$onItemLongClick$64(TL_stories.StoryItem storyItem, AlertDialog alertDialog, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        this.profileActivity.getMessagesController().getStoriesController().deleteStories(this.dialog_id, arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).show();
        closeActionMode(false);
    }

    private void onItemClick(int i, View view, MessageObject messageObject, int i2, int i3) throws IOException {
        if (messageObject == null || this.photoVideoChangeColumnsAnimation) {
            return;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs == null || !profileStoriesCollectionTabs.isReordering()) {
            String link = null;
            link = null;
            int iDp = 0;
            iDp = 0;
            if (this.isActionModeShowed) {
                int i4 = 8;
                if (i3 == 8 && !canEditStories()) {
                    return;
                }
                char c = messageObject.getDialogId() == this.dialog_id ? (char) 0 : (char) 1;
                if (this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                    this.selectedFiles[c].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.cantDeleteMessagesCount--;
                    }
                } else {
                    if (this.selectedFiles[0].size() + this.selectedFiles[1].size() >= 100) {
                        return;
                    }
                    this.selectedFiles[c].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.cantDeleteMessagesCount++;
                    }
                }
                onActionModeSelectedUpdate(this.selectedFiles[0]);
                if (this.selectedFiles[0].size() == 0 && this.selectedFiles[1].size() == 0) {
                    showActionMode(false);
                } else {
                    this.selectedMessagesCountTextView.setNumber(this.selectedFiles[0].size() + this.selectedFiles[1].size(), true);
                    this.deleteItem.setVisibility(this.cantDeleteMessagesCount == 0 ? 0 : 8);
                    ActionBarMenuItem actionBarMenuItem = this.gotoItem;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || this.selectedFiles[0].size() != 1) ? 8 : 0);
                    }
                    ActionBarMenuItem actionBarMenuItem2 = this.forwardItem;
                    if (actionBarMenuItem2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i4 = 0;
                        }
                        actionBarMenuItem2.setVisibility(i4);
                    }
                    updateStoriesPinButton();
                }
                this.scrolling = false;
                if (view instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedPhotoVideoCell) {
                    ((SharedPhotoVideoCell) view).setChecked(i2, this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedLinkCell) {
                    ((SharedLinkCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedAudioCell) {
                    ((SharedAudioCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof ContextLinkCell) {
                    ((ContextLinkCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedPhotoVideoCell2) {
                    ((SharedPhotoVideoCell2) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else if (i3 == 0) {
                int i5 = i - this.sharedMediaData[i3].startOffset;
                if (i5 >= 0 && i5 < this.sharedMediaData[i3].messages.size()) {
                    PhotoViewer.getInstance().setParentActivity(this.profileActivity);
                    PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, i5, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                }
            } else if (i3 == 2 || i3 == 4) {
                if (view instanceof SharedAudioCell) {
                    ((SharedAudioCell) view).didPressedButton();
                }
            } else if (i3 == 5) {
                PhotoViewer.getInstance().setParentActivity(this.profileActivity);
                int iIndexOf = this.sharedMediaData[i3].messages.indexOf(messageObject);
                if (iIndexOf < 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(messageObject);
                    PhotoViewer.getInstance().openPhoto(arrayList, 0, 0L, 0L, 0L, this.provider);
                } else {
                    PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, iIndexOf, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                }
            } else if (i3 == 1) {
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    TLRPC.Document document = messageObject.getDocument();
                    if (sharedDocumentCell.isLoaded()) {
                        if (messageObject.canPreviewDocument()) {
                            PhotoViewer.getInstance().setParentActivity(this.profileActivity);
                            int iIndexOf2 = this.sharedMediaData[i3].messages.indexOf(messageObject);
                            if (iIndexOf2 < 0) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(messageObject);
                                PhotoViewer.getInstance().openPhoto(arrayList2, 0, 0L, 0L, 0L, this.provider);
                                return;
                            }
                            PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, iIndexOf2, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                            return;
                        }
                        AndroidUtilities.openDocument(messageObject, this.profileActivity.getParentActivity(), this.profileActivity);
                    } else if (!sharedDocumentCell.isLoading()) {
                        MessageObject message = sharedDocumentCell.getMessage();
                        message.putInDownloadsStore = true;
                        this.profileActivity.getFileLoader().loadFile(document, message, 0, 0);
                        sharedDocumentCell.updateFileExistIcon(true);
                    } else {
                        this.profileActivity.getFileLoader().cancelLoadFile(document);
                        sharedDocumentCell.updateFileExistIcon(true);
                    }
                }
            } else if (i3 == 3) {
                try {
                    TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                    if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (webPage.cached_page != null) {
                            LaunchActivity launchActivity = LaunchActivity.instance;
                            if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                                this.profileActivity.createArticleViewer(false).open(messageObject);
                                return;
                            }
                            return;
                        }
                        String str = webPage.embed_url;
                        if (str != null && str.length() != 0) {
                            openWebView(webPage, messageObject);
                            return;
                        }
                        link = webPage.url;
                    }
                    if (link == null) {
                        link = ((SharedLinkCell) view).getLink(0);
                    }
                    if (link != null) {
                        openUrl(link);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (isAnyStoryPageType(i3)) {
                StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(i3);
                final StoriesController.StoriesList storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null ? storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList : null;
                if (storiesList == null) {
                    return;
                }
                StoryViewer orCreateStoryViewer = this.profileActivity.getOrCreateStoryViewer();
                Context context = getContext();
                int id = messageObject.getId();
                StoriesListPlaceProvider storiesListPlaceProviderWith = StoriesListPlaceProvider.of(this.mediaPages[i2].listView).with(new StoriesListPlaceProvider.LoadNextInterface() {
                    @Override
                    public final void loadNext(boolean z) {
                        SharedMediaLayout.lambda$onItemClick$67(storiesList, z);
                    }
                });
                BaseFragment baseFragment = this.profileActivity;
                if ((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).myProfile) {
                    iDp = AndroidUtilities.dp(68.0f);
                }
                orCreateStoryViewer.open(context, id, storiesList, storiesListPlaceProviderWith.addBottomClip(iDp));
            }
            updateForwardItem();
        }
    }

    public static void lambda$onItemClick$67(StoriesController.StoriesList storiesList, boolean z) {
        if (z) {
            storiesList.load(false, 30);
        }
    }

    public void openUrl(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            AlertsCreator.showOpenUrlAlert(this.profileActivity, str, true, true);
        } else {
            Browser.openUrl(this.profileActivity.getParentActivity(), str);
        }
    }

    public void openWebView(TLRPC.WebPage webPage, MessageObject messageObject) {
        EmbedBottomSheet.show(this.profileActivity, messageObject, this.provider, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, false);
    }

    private void recycleAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof SharedPhotoVideoAdapter) {
            this.cellCache.addAll(this.cache);
            this.cache.clear();
        } else if (adapter == this.audioAdapter) {
            this.audioCellCache.addAll(this.audioCache);
            this.audioCache.clear();
        } else {
            PollAdapter pollAdapter = this.pollAdapter;
            if (adapter == pollAdapter) {
                pollAdapter.listView = null;
            }
        }
    }

    public void fixLayoutInternal(int i) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 0) {
            if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                this.selectedMessagesCountTextView.setTextSize(18);
            } else {
                this.selectedMessagesCountTextView.setTextSize(20);
            }
        }
        if (i == 0) {
            this.photoVideoAdapter.notifyDataSetChanged();
        }
    }

    class AnonymousClass49 implements SharedLinkCell.SharedLinkCellDelegate {
        AnonymousClass49() {
        }

        @Override
        public void needOpenWebView(TLRPC.WebPage webPage, MessageObject messageObject) {
            SharedMediaLayout.this.openWebView(webPage, messageObject);
        }

        @Override
        public boolean canPerformActions() {
            return !SharedMediaLayout.this.isActionModeShowed;
        }

        @Override
        public void onLinkPress(final String str, boolean z) {
            if (!z) {
                SharedMediaLayout.this.openUrl(str);
                return;
            }
            BottomSheet.Builder builder = new BottomSheet.Builder(SharedMediaLayout.this.profileActivity.getParentActivity());
            builder.setTitle(str);
            builder.setItems(new CharSequence[]{LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)}, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f$0.lambda$onLinkPress$0(str, dialogInterface, i);
                }
            });
            SharedMediaLayout.this.profileActivity.showDialog(builder.create());
        }

        public void lambda$onLinkPress$0(String str, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                SharedMediaLayout.this.openUrl(str);
                return;
            }
            if (i == 1) {
                if (str.startsWith("mailto:")) {
                    str = str.substring(7);
                } else if (str.startsWith("tel:")) {
                    str = str.substring(4);
                }
                AndroidUtilities.addToClipboard(str);
            }
        }
    }

    private class SharedLinksAdapter extends RecyclerListView.SectionsAdapter {
        private Context mContext;

        @Override
        public Object getItem(int i, int i2) {
            return null;
        }

        @Override
        public String getLetter(int i) {
            return null;
        }

        public SharedLinksAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() != 0 || SharedMediaLayout.this.sharedMediaData[3].loading) {
                return i == 0 || i2 != 0;
            }
            return false;
        }

        @Override
        public int getSectionCount() {
            int i = 1;
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[3].loading) {
                return 1;
            }
            int size = SharedMediaLayout.this.sharedMediaData[3].sections.size();
            if (SharedMediaLayout.this.sharedMediaData[3].sections.isEmpty() || (SharedMediaLayout.this.sharedMediaData[3].endReached[0] && SharedMediaLayout.this.sharedMediaData[3].endReached[1])) {
                i = 0;
            }
            return size + i;
        }

        @Override
        public int getCountForSection(int i) {
            if ((SharedMediaLayout.this.sharedMediaData[3].sections.size() != 0 || SharedMediaLayout.this.sharedMediaData[3].loading) && i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                return ((ArrayList) SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get(SharedMediaLayout.this.sharedMediaData[3].sections.get(i))).size() + (i == 0 ? 0 : 1);
            }
            return 1;
        }

        @Override
        public View getSectionHeaderView(int i, View view) {
            if (view == null) {
                view = new GraySectionCell(this.mContext, 28, SharedMediaLayout.this.resourcesProvider);
            }
            if (i != 0) {
                if (i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                    view.setAlpha(1.0f);
                    ((GraySectionCell) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get((String) SharedMediaLayout.this.sharedMediaData[3].sections.get(i))).get(0)).messageOwner.date));
                }
            } else {
                view.setAlpha(0.0f);
            }
            return view;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            GraySectionCell graySectionCell;
            if (i == 3) {
                graySectionCell = new GraySectionCell(this.mContext, 28, SharedMediaLayout.this.resourcesProvider);
            } else if (i == 4) {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
                sharedLinkCell.setDelegate(SharedMediaLayout.this.sharedLinkCellDelegate);
                graySectionCell = sharedLinkCell;
            } else {
                if (i == 5) {
                    View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 3, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                    viewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    return new RecyclerListView.Holder(viewCreateEmptyStubView);
                }
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, SharedMediaLayout.this.resourcesProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate(false);
                flickerLoadingView.setViewType(5);
                graySectionCell = flickerLoadingView;
            }
            graySectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(graySectionCell);
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 6 || viewHolder.getItemViewType() == 5) {
                return;
            }
            ArrayList arrayList = (ArrayList) SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get((String) SharedMediaLayout.this.sharedMediaData[3].sections.get(i));
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 3) {
                MessageObject messageObject = (MessageObject) arrayList.get(0);
                View view = viewHolder.itemView;
                if (view instanceof GraySectionCell) {
                    ((GraySectionCell) view).setText(LocaleController.formatSectionDate(messageObject.messageOwner.date));
                    return;
                }
                return;
            }
            if (itemViewType != 4) {
                return;
            }
            if (i != 0) {
                i2--;
            }
            if (!(viewHolder.itemView instanceof SharedLinkCell) || i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            SharedLinkCell sharedLinkCell = (SharedLinkCell) viewHolder.itemView;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i2);
            sharedLinkCell.setLink(messageObject2, i2 != arrayList.size() - 1 || (i == SharedMediaLayout.this.sharedMediaData[3].sections.size() - 1 && SharedMediaLayout.this.sharedMediaData[3].loading));
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.isActionModeShowed) {
                sharedLinkCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !SharedMediaLayout.this.scrolling);
            } else {
                sharedLinkCell.setChecked(false, !sharedMediaLayout.scrolling);
            }
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[3].loading) {
                return 5;
            }
            if (i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                return (i == 0 || i2 != 0) ? 4 : 3;
            }
            return 6;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
    }

    private class SharedDocumentsAdapter extends RecyclerListView.FastScrollAdapter {
        private int currentType;
        private boolean inFastScrollMode;
        private Context mContext;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public SharedDocumentsAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        @Override
        public int getItemCount() {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].loadingAfterFastScroll) {
                return SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount();
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[this.currentType].loading) {
                return 1;
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() == 0 && ((!SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[0] || !SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[1]) && SharedMediaLayout.this.sharedMediaData[this.currentType].startReached)) {
                return 0;
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount() == 0) {
                int startOffset = SharedMediaLayout.this.sharedMediaData[this.currentType].getStartOffset() + SharedMediaLayout.this.sharedMediaData[this.currentType].getMessages().size();
                return startOffset != 0 ? (SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[0] && SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[1]) ? startOffset : SharedMediaLayout.this.sharedMediaData[this.currentType].getEndLoadingStubs() != 0 ? startOffset + SharedMediaLayout.this.sharedMediaData[this.currentType].getEndLoadingStubs() : startOffset + 1 : startOffset;
            }
            return Math.max(SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount(), SharedMediaLayout.this.sharedMediaData[this.currentType].getStartOffset() + SharedMediaLayout.this.sharedMediaData[this.currentType].getMessages().size());
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View view2;
            int i2 = 0;
            if (i == 7) {
                SharedDocumentCell sharedDocumentCell = new SharedDocumentCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
                sharedDocumentCell.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                view = sharedDocumentCell;
            } else if (i == 8) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, SharedMediaLayout.this.resourcesProvider);
                if (this.currentType == 2) {
                    flickerLoadingView.setViewType(4);
                } else {
                    flickerLoadingView.setViewType(3);
                }
                flickerLoadingView.showDate(false);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                view = flickerLoadingView;
            } else {
                if (i == 9) {
                    View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, this.currentType, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                    viewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    return new RecyclerListView.Holder(viewCreateEmptyStubView);
                }
                if (this.currentType == 4 && !SharedMediaLayout.this.audioCellCache.isEmpty()) {
                    View view3 = (View) SharedMediaLayout.this.audioCellCache.get(0);
                    SharedMediaLayout.this.audioCellCache.remove(0);
                    ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                    view2 = view3;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view3);
                        view2 = view3;
                    }
                } else {
                    view2 = new SharedAudioCell(this.mContext, i2, SharedMediaLayout.this.resourcesProvider) {
                        @Override
                        public boolean needPlayMessage(MessageObject messageObject) {
                            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                                boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
                                MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? SharedMediaLayout.this.sharedMediaData[SharedDocumentsAdapter.this.currentType].messages : null, false);
                                return zPlayMessage;
                            }
                            if (messageObject.isMusic()) {
                                return MediaController.getInstance().setPlaylist(SharedMediaLayout.this.sharedMediaData[SharedDocumentsAdapter.this.currentType].messages, messageObject, SharedMediaLayout.this.mergeDialogId);
                            }
                            return false;
                        }
                    };
                }
                SharedAudioCell sharedAudioCell = (SharedAudioCell) view2;
                sharedAudioCell.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                view = view2;
                if (this.currentType == 4) {
                    SharedMediaLayout.this.audioCache.add(sharedAudioCell);
                    view = view2;
                }
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ArrayList arrayList = SharedMediaLayout.this.sharedMediaData[this.currentType].messages;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 7) {
                View view = viewHolder.itemView;
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    MessageObject messageObject = (MessageObject) arrayList.get(i - SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset);
                    sharedDocumentCell.setDocument(messageObject, i != arrayList.size() - 1);
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedDocumentCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                        return;
                    } else {
                        sharedDocumentCell.setChecked(false, !sharedMediaLayout.scrolling);
                        return;
                    }
                }
                return;
            }
            if (itemViewType != 10) {
                return;
            }
            View view2 = viewHolder.itemView;
            if (view2 instanceof SharedAudioCell) {
                SharedAudioCell sharedAudioCell = (SharedAudioCell) view2;
                MessageObject messageObject2 = (MessageObject) arrayList.get(i - SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset);
                sharedAudioCell.setMessageObject(messageObject2, i != arrayList.size() - 1);
                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                if (sharedMediaLayout2.isActionModeShowed) {
                    sharedAudioCell.setChecked(sharedMediaLayout2.selectedFiles[(messageObject2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                } else {
                    sharedAudioCell.setChecked(false, !sharedMediaLayout2.scrolling);
                }
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[this.currentType].loading) {
                return 9;
            }
            if (i < SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset || i >= SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset + SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size()) {
                return 8;
            }
            int i2 = this.currentType;
            return (i2 == 2 || i2 == 4) ? 10 : 7;
        }

        @Override
        public String getLetter(int i) {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].fastScrollPeriods == null) {
                return "";
            }
            ArrayList arrayList = SharedMediaLayout.this.sharedMediaData[this.currentType].fastScrollPeriods;
            if (arrayList.isEmpty()) {
                return "";
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i <= ((Period) arrayList.get(i2)).startOffset) {
                    return ((Period) arrayList.get(i2)).formatedDate;
                }
            }
            return ((Period) arrayList.get(arrayList.size() - 1)).formatedDate;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            float totalItemsCount = f * ((getTotalItemsCount() * measuredHeight) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
            iArr[0] = (int) (totalItemsCount / measuredHeight);
            iArr[1] = ((int) totalItemsCount) % measuredHeight;
        }

        @Override
        public void onStartFastScroll() {
            this.inFastScrollMode = true;
            MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(this.currentType);
            if (mediaPage != null) {
                SharedMediaLayout.showFastScrollHint(mediaPage, null, false);
            }
        }

        @Override
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            if (this.inFastScrollMode) {
                this.inFastScrollMode = false;
                if (recyclerListView != null) {
                    int messageId = 0;
                    for (int i = 0; i < recyclerListView.getChildCount() && (messageId = SharedMediaLayout.getMessageId(recyclerListView.getChildAt(i))) == 0; i++) {
                    }
                    if (messageId == 0) {
                        SharedMediaLayout.this.findPeriodAndJumpToDate(this.currentType, recyclerListView, true);
                    }
                }
            }
        }

        @Override
        public int getTotalItemsCount() {
            return SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount();
        }
    }

    public static View createEmptyStubView(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        EmptyStubView emptyStubView = new EmptyStubView(context, resourcesProvider);
        if (i == 0) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoMediaSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoMedia));
            }
        } else if (i == 1) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedFiles));
            }
        } else if (i == 2) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedVoice));
            }
        } else if (i == 3) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedLinks));
            }
        } else if (i == 4) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedAudio));
            }
        } else if (i == 5) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoGIFs));
            }
        } else if (i == 6) {
            emptyStubView.emptyImageView.setImageDrawable(null);
            emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
        } else if (i == 7) {
            emptyStubView.emptyImageView.setImageDrawable(null);
            emptyStubView.emptyTextView.setText("");
        }
        return emptyStubView;
    }

    private static class EmptyStubView extends LinearLayout {
        final ImageView emptyImageView;
        final TextView emptyTextView;
        boolean ignoreRequestLayout;

        public EmptyStubView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            TextView textView = new TextView(context);
            this.emptyTextView = textView;
            ImageView imageView = new ImageView(context);
            this.emptyImageView = imageView;
            setOrientation(1);
            setGravity(17);
            addView(imageView, LayoutHelper.createLinear(-2, -2));
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView.setGravity(17);
            textView.setTextSize(1, 17.0f);
            textView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
            addView(textView, LayoutHelper.createLinear(-2, -2, 17, 0, 24, 0, 0));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            this.ignoreRequestLayout = true;
            if (AndroidUtilities.isTablet()) {
                this.emptyTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
            } else if (rotation == 3 || rotation == 1) {
                this.emptyTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
            } else {
                this.emptyTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
            }
            this.ignoreRequestLayout = false;
            super.onMeasure(i, i2);
        }

        @Override
        public void requestLayout() {
            if (this.ignoreRequestLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    private class SharedPhotoVideoAdapter extends RecyclerListView.FastScrollAdapter {
        protected boolean inFastScrollMode;
        protected Context mContext;
        SharedPhotoVideoCell2.SharedResources sharedResources;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public SharedPhotoVideoAdapter(Context context) {
            this.mContext = context;
        }

        public int getPositionForIndex(int i) {
            return SharedMediaLayout.this.sharedMediaData[0].startOffset + i;
        }

        @Override
        public int getItemCount() {
            if (DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id)) {
                if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[0].loading) {
                    return 1;
                }
                if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && (!SharedMediaLayout.this.sharedMediaData[0].endReached[0] || !SharedMediaLayout.this.sharedMediaData[0].endReached[1])) {
                    return 0;
                }
                int startOffset = SharedMediaLayout.this.sharedMediaData[0].getStartOffset() + SharedMediaLayout.this.sharedMediaData[0].getMessages().size();
                return startOffset != 0 ? (SharedMediaLayout.this.sharedMediaData[0].endReached[0] && SharedMediaLayout.this.sharedMediaData[0].endReached[1]) ? startOffset : startOffset + 1 : startOffset;
            }
            if (SharedMediaLayout.this.sharedMediaData[0].loadingAfterFastScroll) {
                return SharedMediaLayout.this.sharedMediaData[0].getTotalCount();
            }
            if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[0].loading) {
                return 1;
            }
            if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && ((!SharedMediaLayout.this.sharedMediaData[0].endReached[0] || !SharedMediaLayout.this.sharedMediaData[0].endReached[1]) && SharedMediaLayout.this.sharedMediaData[0].startReached)) {
                return 0;
            }
            if (SharedMediaLayout.this.sharedMediaData[0].getTotalCount() == 0) {
                int startOffset2 = SharedMediaLayout.this.sharedMediaData[0].getStartOffset() + SharedMediaLayout.this.sharedMediaData[0].getMessages().size();
                return startOffset2 != 0 ? (SharedMediaLayout.this.sharedMediaData[0].endReached[0] && SharedMediaLayout.this.sharedMediaData[0].endReached[1]) ? startOffset2 : SharedMediaLayout.this.sharedMediaData[0].getEndLoadingStubs() != 0 ? startOffset2 + SharedMediaLayout.this.sharedMediaData[0].getEndLoadingStubs() : startOffset2 + 1 : startOffset2;
            }
            return Math.max(SharedMediaLayout.this.sharedMediaData[0].getTotalCount(), SharedMediaLayout.this.sharedMediaData[0].getStartOffset() + SharedMediaLayout.this.sharedMediaData[0].getMessages().size());
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0 && i != 19) {
                View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 0, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                viewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(viewCreateEmptyStubView);
            }
            if (this.sharedResources == null) {
                this.sharedResources = new SharedPhotoVideoCell2.SharedResources(viewGroup.getContext(), SharedMediaLayout.this.resourcesProvider);
            }
            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(this.mContext, this.sharedResources, SharedMediaLayout.this.profileActivity.getCurrentAccount());
            if (i == 19) {
                sharedPhotoVideoCell2.setCheck2();
            }
            sharedPhotoVideoCell2.setGradientView(SharedMediaLayout.this.globalGradientView);
            if (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1) {
                sharedPhotoVideoCell2.isStory = true;
            }
            sharedPhotoVideoCell2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(sharedPhotoVideoCell2);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ArrayList messages = SharedMediaLayout.this.sharedMediaData[0].getMessages();
                int startOffset = i - SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    int messageId = sharedPhotoVideoCell2.getMessageId();
                    int i2 = this == SharedMediaLayout.this.photoVideoAdapter ? SharedMediaLayout.this.mediaColumnsCount[0] : SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.animateToColumnsCount;
                    if (startOffset >= 0 && startOffset < messages.size()) {
                        MessageObject messageObject = (MessageObject) messages.get(startOffset);
                        boolean z = messageObject.getId() == messageId;
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        if (sharedMediaLayout.isActionModeShowed) {
                            sharedPhotoVideoCell2.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z);
                        } else {
                            sharedPhotoVideoCell2.setChecked(false, z);
                        }
                        sharedPhotoVideoCell2.setMessageObject(messageObject, i2);
                        return;
                    }
                    sharedPhotoVideoCell2.setMessageObject(null, i2);
                    sharedPhotoVideoCell2.setChecked(false, false);
                }
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (!this.inFastScrollMode && SharedMediaLayout.this.sharedMediaData[0].getMessages().size() == 0 && !SharedMediaLayout.this.sharedMediaData[0].loading && SharedMediaLayout.this.sharedMediaData[0].startReached) {
                return 2;
            }
            SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
            SharedMediaLayout.this.sharedMediaData[0].getMessages().size();
            SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
            return 0;
        }

        @Override
        public String getLetter(int i) {
            if (SharedMediaLayout.this.sharedMediaData[0].fastScrollPeriods == null) {
                return "";
            }
            ArrayList arrayList = SharedMediaLayout.this.sharedMediaData[0].fastScrollPeriods;
            if (arrayList.isEmpty()) {
                return "";
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i <= ((Period) arrayList.get(i2)).startOffset) {
                    return ((Period) arrayList.get(i2)).formatedDate;
                }
            }
            return ((Period) arrayList.get(arrayList.size() - 1)).formatedDate;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            int i = (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesSupportingAdapter(this) != -1 || this == SharedMediaLayout.this.animationSupportingPhotoVideoAdapter) ? SharedMediaLayout.this.animateToColumnsCount : SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.mediaColumnsCount[0];
            int iCeil = (int) (Math.ceil(getTotalItemsCount() / i) * measuredHeight);
            int measuredHeight2 = recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop();
            if (measuredHeight == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            } else {
                float f2 = f * (iCeil - measuredHeight2);
                iArr[0] = ((int) (f2 / measuredHeight)) * i;
                iArr[1] = ((int) f2) % measuredHeight;
            }
        }

        @Override
        public void onStartFastScroll() {
            this.inFastScrollMode = true;
            MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(0);
            if (mediaPage != null) {
                SharedMediaLayout.showFastScrollHint(mediaPage, null, false);
            }
        }

        @Override
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            if (this.inFastScrollMode) {
                this.inFastScrollMode = false;
                if (recyclerListView != null) {
                    int messageId = 0;
                    for (int i = 0; i < recyclerListView.getChildCount(); i++) {
                        View childAt = recyclerListView.getChildAt(i);
                        if (childAt instanceof SharedPhotoVideoCell2) {
                            messageId = ((SharedPhotoVideoCell2) childAt).getMessageId();
                        }
                        if (messageId != 0) {
                            break;
                        }
                    }
                    if (messageId == 0) {
                        SharedMediaLayout.this.findPeriodAndJumpToDate(0, recyclerListView, true);
                    }
                }
            }
        }

        @Override
        public int getTotalItemsCount() {
            return SharedMediaLayout.this.sharedMediaData[0].getTotalCount();
        }

        @Override
        public float getScrollProgress(RecyclerListView recyclerListView) {
            int i = (this == SharedMediaLayout.this.animationSupportingPhotoVideoAdapter || SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesSupportingAdapter(this) != -1) ? SharedMediaLayout.this.animateToColumnsCount : SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.mediaColumnsCount[0];
            int iCeil = (int) Math.ceil(getTotalItemsCount() / i);
            if (recyclerListView.getChildCount() == 0) {
                return 0.0f;
            }
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            if (recyclerListView.getChildAdapterPosition(recyclerListView.getChildAt(0)) < 0) {
                return 0.0f;
            }
            return (((r5 / i) * measuredHeight) - (r1.getTop() - recyclerListView.getPaddingTop())) / ((iCeil * measuredHeight) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
        }

        @Override
        public boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            if (SharedMediaLayout.this.isSearchingStories()) {
                return false;
            }
            return recyclerListView.getChildCount() != 0 && ((int) Math.ceil((double) (((float) getTotalItemsCount()) / ((float) ((this == SharedMediaLayout.this.photoVideoAdapter || SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1) ? SharedMediaLayout.this.mediaColumnsCount[0] : SharedMediaLayout.this.animateToColumnsCount))))) * recyclerListView.getChildAt(0).getMeasuredHeight() > recyclerListView.getMeasuredHeight();
        }

        @Override
        public void onFastScrollSingleTap() {
            SharedMediaLayout.this.showMediaCalendar(0, true);
        }
    }

    public void findPeriodAndJumpToDate(int i, RecyclerListView recyclerListView, boolean z) {
        ArrayList arrayList = this.sharedMediaData[i].fastScrollPeriods;
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) recyclerListView.getLayoutManager()).findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0) {
            Period period = null;
            if (arrayList != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (iFindFirstVisibleItemPosition <= ((Period) arrayList.get(i2)).startOffset) {
                        period = (Period) arrayList.get(i2);
                        break;
                    }
                    i2++;
                }
                if (period == null) {
                    period = (Period) arrayList.get(arrayList.size() - 1);
                }
            }
            if (period != null) {
                jumpToDate(i, period.maxId, period.startOffset + 1, z);
            }
        }
    }

    public void jumpToDate(int i, int i2, int i3, boolean z) {
        this.sharedMediaData[i].messages.clear();
        this.sharedMediaData[i].messagesDict[0].clear();
        this.sharedMediaData[i].messagesDict[1].clear();
        this.sharedMediaData[i].setMaxId(0, i2);
        this.sharedMediaData[i].setEndReached(0, false);
        SharedMediaData sharedMediaData = this.sharedMediaData[i];
        sharedMediaData.startReached = false;
        sharedMediaData.startOffset = i3;
        SharedMediaData sharedMediaData2 = this.sharedMediaData[i];
        sharedMediaData2.endLoadingStubs = (sharedMediaData2.getTotalCount() - i3) - 1;
        if (this.sharedMediaData[i].endLoadingStubs < 0) {
            this.sharedMediaData[i].endLoadingStubs = 0;
        }
        SharedMediaData sharedMediaData3 = this.sharedMediaData[i];
        sharedMediaData3.min_id = i2;
        sharedMediaData3.loadingAfterFastScroll = true;
        sharedMediaData3.loading = false;
        sharedMediaData3.requestIndex++;
        MediaPage mediaPage = getMediaPage(i);
        if (mediaPage != null && mediaPage.listView.getAdapter() != null) {
            mediaPage.listView.getAdapter().notifyDataSetChanged();
        }
        if (!z) {
            return;
        }
        int i4 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i4 >= mediaPageArr.length) {
                return;
            }
            MediaPage mediaPage2 = mediaPageArr[i4];
            if (mediaPage2.selectedType == i) {
                mediaPage2.layoutManager.scrollToPositionWithOffset(Math.min(this.sharedMediaData[i].getTotalCount() - 1, this.sharedMediaData[i].startOffset), 0);
            }
            i4++;
        }
    }

    public class PollAdapter extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        public RecyclerListView listView;
        private final Context mContext;
        private final ChatMessageCell.ChatMessageCellDelegate messageDelegate;
        private final Theme.ResourcesProvider resourcesProvider;
        private final ArrayList pollsToCheck = new ArrayList(10);
        private final ArrayList groupedByDay = new ArrayList();

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public PollAdapter(Context context, final int i, final Theme.ResourcesProvider resourcesProvider) {
            this.mContext = context;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            this.messageDelegate = new ChatMessageCell.ChatMessageCellDelegate() {
                @Override
                public boolean allowAddPollOptions() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$allowAddPollOptions(this);
                }

                @Override
                public boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                }

                @Override
                public boolean canPerformActions() {
                    return true;
                }

                @Override
                public boolean canPerformReply() {
                    return canPerformActions();
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell, f, f2);
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell, keyboardButton);
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i2, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell, chat, i2, f, f2);
                }

                @Override
                public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressCustomBotButton(this, chatMessageCell, buttonCustom);
                }

                @Override
                public boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressPollOption(this, chatMessageCell, pollAnswer);
                }

                @Override
                public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressToDoButton(this, chatMessageCell, todoItem);
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell, user, f, f2);
                }

                @Override
                public void didPressAboutRevenueSharingAds() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
                }

                @Override
                public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAddPollOptionButton(this, chatMessageCell);
                }

                @Override
                public void didPressAdmin(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAdmin(this, chatMessageCell);
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell, animatedEmojiSpan);
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell);
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell, keyboardButton);
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell);
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell, chat, i2, f, f2, z);
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell, tLObject, z);
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell);
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell, textLayoutBlock);
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell);
                }

                @Override
                public void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCustomBotButton(this, chatMessageCell, buttonCustom);
                }

                @Override
                public void didPressEffect(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell);
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell, keyboardButton);
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell);
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell, i2, i3);
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell, i2);
                }

                @Override
                public void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell, imageReceiver, messageExtendedMedia, f, f2);
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell);
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell, i2);
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell, f, f2, z);
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell);
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell, f, f2);
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell, reactionCount, z, f, f2);
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i2, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell, i2, f, f2, z);
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell);
                }

                @Override
                public void didPressShowMore(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressShowMore(this, chatMessageCell);
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell);
                }

                @Override
                public void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this, chatMessageCell);
                }

                @Override
                public void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredInfo(this, chatMessageCell, f, f2);
                }

                @Override
                public void didPressSummarize(ChatMessageCell chatMessageCell, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSummarize(this, chatMessageCell, z);
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell);
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressToDoButton(this, chatMessageCell, todoItem, z);
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell, characterStyle, z);
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell, user, f, f2, z);
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell, user, document, str);
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell, str);
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell, j);
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell.getContext(), str);
                }

                @Override
                public void didQuickShareEnd(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareEnd(this, chatMessageCell, f, f2);
                }

                @Override
                public void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareMove(this, chatMessageCell, f, f2);
                }

                @Override
                public void didQuickShareStart(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareStart(this, chatMessageCell, f, f2);
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject);
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didTogglePollPreview(this, chatMessageCell);
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$drawPollMode(this, canvas, chatMessageCell);
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell, z);
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdateNoAnimation(this, chatMessageCell, z);
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell);
                }

                @Override
                public String getAdminRank(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j);
                }

                @Override
                public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getDraftMessageMeasureController(this);
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getPinchToZoomHelper(this);
                }

                @Override
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell);
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell);
                }

                @Override
                public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getTextSelectionHelper(this);
                }

                @Override
                public boolean hasSelectedMessages() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$hasSelectedMessages(this);
                }

                @Override
                public void invalidateBlur() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$invalidateBlur(this);
                }

                @Override
                public boolean isAdmin(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isAdmin(this, j);
                }

                @Override
                public boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
                }

                @Override
                public boolean isOwner(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isOwner(this, j);
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell, int i2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell, i2);
                }

                @Override
                public boolean isReplyOrSelf() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isReplyOrSelf(this);
                }

                @Override
                public boolean keyboardIsOpened() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$keyboardIsOpened(this);
                }

                @Override
                public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject, str, str2, str3, str4, i2, i3);
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell, messageObject, z);
                }

                @Override
                public void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
                }

                @Override
                public void needShowPremiumBulletin(int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i2);
                }

                @Override
                public boolean onAccessibilityAction(int i2, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i2, bundle);
                }

                @Override
                public void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
                }

                @Override
                public boolean openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$openArticlePhoto(this, chatMessageCell, pageBlock);
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject);
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell, z);
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject);
                }

                @Override
                public void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i2, int i3, int i4) {
                    SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), arrayList, null);
                }

                @Override
                public void didPressPollMedia(final ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, final TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i2) throws IOException {
                    int size;
                    TLRPC.Document document;
                    TLRPC.PollResults pollResults;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Document document2;
                    TLRPC.Document document3;
                    TLRPC.TL_textWithEntities tL_textWithEntities;
                    MessageObject messageObject = chatMessageCell.getMessageObject();
                    TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
                    if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
                        return;
                    }
                    final TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
                    if (messageMedia.geo != null) {
                        if (AndroidUtilities.isMapsInstalled(SharedMediaLayout.this.profileActivity)) {
                            LocationActivity locationActivity = new LocationActivity(3) {
                                @Override
                                protected boolean disablePermissionCheck() {
                                    return true;
                                }
                            };
                            locationActivity.setResourceProvider(resourcesProvider);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.local_id = -1;
                            tL_message.peer_id = MessagesController.getInstance(i).getPeer(SharedMediaLayout.this.dialog_id);
                            TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                            tL_messageMediaGeo.geo = messageMedia.geo;
                            String str = messageMedia.address;
                            if (str == null) {
                                str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                            }
                            tL_messageMediaGeo.address = str;
                            tL_message.media = tL_messageMediaGeo;
                            locationActivity.setSharingAllowed(false);
                            locationActivity.setMessageObject(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                            SharedMediaLayout.this.profileActivity.presentFragment(locationActivity);
                            return;
                        }
                        return;
                    }
                    if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                        ContentPreviewViewer.getInstance().setParentActivity(SharedMediaLayout.this.profileActivity.getParentActivity());
                        ContentPreviewViewer.getInstance().setDelegate(new ContentPreviewViewer.ContentPreviewViewerDelegate() {
                            @Override
                            public void addCaptionToGif(Object obj, Object obj2, boolean z, int i3, int i4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addCaptionToGif(this, obj, obj2, z, i3, i4);
                            }

                            @Override
                            public void addToFavoriteSelected(String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addToFavoriteSelected(this, str2);
                            }

                            @Override
                            public boolean can() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$can(this);
                            }

                            @Override
                            public boolean canAddCaption(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canAddCaption(this, document4);
                            }

                            @Override
                            public boolean canDeleteSticker(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canDeleteSticker(this, document4);
                            }

                            @Override
                            public boolean canEditSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canEditSticker(this);
                            }

                            @Override
                            public boolean canSchedule() {
                                return false;
                            }

                            @Override
                            public boolean canSendSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSendSticker(this);
                            }

                            @Override
                            public Boolean canSetAsStatus(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSetAsStatus(this, document4);
                            }

                            @Override
                            public void copyEmoji(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$copyEmoji(this, document4);
                            }

                            @Override
                            public void deleteSticker(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$deleteSticker(this, document4);
                            }

                            @Override
                            public void editSticker(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$editSticker(this, document4);
                            }

                            @Override
                            public ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getCustomItemOptions(this, viewGroup, view);
                            }

                            @Override
                            public String getQuery(boolean z) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z);
                            }

                            @Override
                            public void gifAddedOrDeleted() {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
                            }

                            @Override
                            public boolean isInScheduleMode() {
                                return false;
                            }

                            @Override
                            public boolean isPhotoEditor() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isPhotoEditor(this);
                            }

                            @Override
                            public boolean isReplacedSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isReplacedSticker(this);
                            }

                            @Override
                            public boolean isSettingIntroSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isSettingIntroSticker(this);
                            }

                            @Override
                            public boolean isStickerEditor() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isStickerEditor(this);
                            }

                            @Override
                            public boolean needCopy(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needCopy(this, document4);
                            }

                            @Override
                            public boolean needMenu() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
                            }

                            @Override
                            public boolean needOpen() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needOpen(this);
                            }

                            @Override
                            public boolean needRemove() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemove(this);
                            }

                            @Override
                            public boolean needRemoveFromRecent(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemoveFromRecent(this, document4);
                            }

                            @Override
                            public boolean needSend(int i3) {
                                return false;
                            }

                            @Override
                            public void newStickerPackSelected(CharSequence charSequence, String str2, Utilities.Callback callback) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$newStickerPackSelected(this, charSequence, str2, callback);
                            }

                            @Override
                            public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
                            }

                            @Override
                            public void removeFromRecent(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$removeFromRecent(this, document4);
                            }

                            @Override
                            public void resetTouch() {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$resetTouch(this);
                            }

                            @Override
                            public void sendEmoji(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendEmoji(this, document4);
                            }

                            @Override
                            public void sendGif(Object obj, Object obj2, boolean z, int i3, int i4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj, obj2, z, i3, i4);
                            }

                            @Override
                            public void sendSticker(String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, str2);
                            }

                            @Override
                            public void sendSticker(TLRPC.Document document4, String str2, Object obj, boolean z, int i3, int i4) {
                            }

                            @Override
                            public void setAsEmojiStatus(TLRPC.Document document4, Integer num) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setAsEmojiStatus(this, document4, num);
                            }

                            @Override
                            public void setIntroSticker(String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setIntroSticker(this, str2);
                            }

                            @Override
                            public void stickerSetSelected(TLRPC.StickerSet stickerSet, String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$stickerSetSelected(this, stickerSet, str2);
                            }

                            @Override
                            public void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
                                if (inputStickerSet == null || SharedMediaLayout.this.getContext() == null) {
                                    return;
                                }
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                                tL_inputStickerSetID.id = inputStickerSet.id;
                                StickersAlert stickersAlert = new StickersAlert(SharedMediaLayout.this.getContext(), SharedMediaLayout.this.profileActivity, tL_inputStickerSetID, null, null, resourcesProvider, false);
                                stickersAlert.setCalcMandatoryInsets(true);
                                stickersAlert.setClearsInputField(z);
                                stickersAlert.show();
                            }

                            @Override
                            public long getDialogId() {
                                return SharedMediaLayout.this.dialog_id;
                            }

                            @Override
                            public TLRPC.TL_messageMediaPoll getPoll() {
                                return tL_messageMediaPoll;
                            }

                            @Override
                            public TLRPC.PollAnswer getPollAnswer() {
                                return pollAnswer;
                            }

                            @Override
                            public MessageObject getPollMessageObject() {
                                return chatMessageCell.getMessageObject();
                            }

                            @Override
                            public void retractVote() {
                                SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), null, null);
                            }

                            @Override
                            public void sendVote() {
                                ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
                                arrayList.add(pollAnswer);
                                SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), arrayList, null);
                            }
                        });
                        ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                        TLRPC.Document document4 = messageMedia.document;
                        contentPreviewViewer.open(document4, null, "", null, null, MessageObject.isAnimatedEmoji(document4) ? 2 : 0, false, chatMessageCell.getMessageObject(), resourcesProvider, 200);
                        return;
                    }
                    TLRPC.Message message = messageObject.messageOwner;
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                    if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
                        size = messageMedia3 == messageMedia ? arrayList2.size() : -1;
                        TLRPC.TL_message tL_messageCopy = copy(message);
                        tL_messageCopy.media = messageMedia3;
                        arrayList2.add(new MessageObject(i, tL_messageCopy, false, true) {
                            @Override
                            public boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                                return false;
                            }
                        });
                        arrayList.add(-2);
                    } else {
                        size = -1;
                    }
                    if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                        if (messageMedia2 == messageMedia) {
                            size = arrayList2.size();
                        }
                        TLRPC.TL_message tL_messageCopy2 = copy(message);
                        tL_messageCopy2.media = messageMedia2;
                        TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                        tL_messageCopy2.message = pollResults2.solution;
                        tL_messageCopy2.entities = pollResults2.solution_entities;
                        arrayList2.add(new MessageObject(i, tL_messageCopy2, false, true) {
                            @Override
                            public boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                                return false;
                            }
                        });
                        arrayList.add(-3);
                    }
                    TlUtils.calculateAnswerShuffleHash(tL_messageMediaPoll.poll, UserConfig.getInstance(i).getClientUserId());
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                    if (arrayList3 == null) {
                        arrayList3 = poll.answers;
                    }
                    int size2 = size;
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i3);
                        TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                        if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                            if (pollAnswer2.unshuffled_index == i2) {
                                size2 = arrayList2.size();
                            }
                            TLRPC.TL_message tL_messageCopy3 = copy(message);
                            tL_messageCopy3.media = messageMedia4;
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                            tL_messageCopy3.message = tL_textWithEntities2.text;
                            tL_messageCopy3.entities = tL_textWithEntities2.entities;
                            arrayList2.add(new MessageObject(i, tL_messageCopy3, false, true) {
                                @Override
                                public boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                                    return false;
                                }
                            });
                            arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                        }
                    }
                    if (size2 <= -1 || arrayList2.isEmpty()) {
                        return;
                    }
                    messageObject.pollMediaMapping = arrayList;
                    PhotoViewer.getInstance().setParentActivity(SharedMediaLayout.this.profileActivity, resourcesProvider);
                    PhotoViewer.getInstance().openPhoto(arrayList2, size2, SharedMediaLayout.this.dialog_id, 0L, 0L, new PhotoViewer.EmptyPhotoViewerProvider() {
                        @Override
                        public boolean forceAllInGroup() {
                            return true;
                        }

                        @Override
                        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject2, TLRPC.FileLocation fileLocation, int i4, boolean z, boolean z2) {
                            ImageReceiver photoImage;
                            ChatMessageCell chatMessageCell2;
                            MessageObject messageObject3;
                            RecyclerListView recyclerListView = PollAdapter.this.listView;
                            if (recyclerListView == null) {
                                return null;
                            }
                            int childCount = recyclerListView.getChildCount();
                            for (int i5 = 0; i5 < childCount; i5++) {
                                View childAt = PollAdapter.this.listView.getChildAt(i5);
                                if (!(childAt instanceof ChatMessageCell) || messageObject2 == null || (messageObject3 = (chatMessageCell2 = (ChatMessageCell) childAt).getMessageObject()) == null || messageObject3.getId() != messageObject2.getId()) {
                                    photoImage = null;
                                } else {
                                    ArrayList<Integer> arrayList4 = messageObject3.pollMediaMapping;
                                    if (arrayList4 != null && i4 >= 0 && i4 < arrayList4.size()) {
                                        photoImage = chatMessageCell2.getPhotoImage(messageObject3.pollMediaMapping.get(i4).intValue());
                                    } else {
                                        photoImage = chatMessageCell2.getPhotoImage(i4);
                                    }
                                }
                                if (photoImage != null) {
                                    int[] iArr = new int[2];
                                    childAt.getLocationInWindow(iArr);
                                    PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                    placeProviderObject.viewX = iArr[0];
                                    placeProviderObject.viewY = iArr[1] + childAt.getPaddingTop();
                                    placeProviderObject.parentView = PollAdapter.this.listView;
                                    placeProviderObject.animatingImageView = null;
                                    placeProviderObject.imageReceiver = photoImage;
                                    if (z) {
                                        placeProviderObject.thumb = photoImage.getBitmapSafe();
                                    }
                                    placeProviderObject.radius = photoImage.getRoundRadius(true);
                                    placeProviderObject.clipTopAddition = 0;
                                    placeProviderObject.clipBottomAddition = 0;
                                    return placeProviderObject;
                                }
                            }
                            return null;
                        }
                    });
                }

                private TLRPC.TL_message copy(TLRPC.Message message) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = message.id;
                    tL_message.from_id = message.from_id;
                    tL_message.from_boosts_applied = message.from_boosts_applied;
                    tL_message.peer_id = message.peer_id;
                    tL_message.saved_peer_id = message.saved_peer_id;
                    tL_message.date = message.date;
                    tL_message.expire_date = message.expire_date;
                    tL_message.action = message.action;
                    tL_message.message = message.message;
                    tL_message.flags = message.flags;
                    tL_message.flags2 = message.flags2;
                    tL_message.mentioned = message.mentioned;
                    tL_message.media_unread = message.media_unread;
                    tL_message.out = message.out;
                    tL_message.unread = message.unread;
                    tL_message.entities = message.entities;
                    tL_message.via_bot_name = message.via_bot_name;
                    tL_message.reply_markup = message.reply_markup;
                    tL_message.views = message.views;
                    tL_message.forwards = message.forwards;
                    tL_message.replies = message.replies;
                    tL_message.edit_date = message.edit_date;
                    tL_message.silent = message.silent;
                    tL_message.post = message.post;
                    tL_message.from_scheduled = message.from_scheduled;
                    tL_message.legacy = message.legacy;
                    tL_message.edit_hide = message.edit_hide;
                    tL_message.pinned = message.pinned;
                    tL_message.fwd_from = message.fwd_from;
                    tL_message.via_bot_id = message.via_bot_id;
                    tL_message.via_business_bot_id = message.via_business_bot_id;
                    tL_message.reply_to = message.reply_to;
                    tL_message.post_author = message.post_author;
                    tL_message.grouped_id = message.grouped_id;
                    tL_message.reactions = message.reactions;
                    tL_message.restriction_reason = message.restriction_reason;
                    tL_message.ttl_period = message.ttl_period;
                    tL_message.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                    tL_message.effect = message.effect;
                    tL_message.noforwards = message.noforwards;
                    tL_message.invert_media = message.invert_media;
                    tL_message.offline = message.offline;
                    tL_message.factcheck = message.factcheck;
                    tL_message.send_state = message.send_state;
                    tL_message.fwd_msg_id = message.fwd_msg_id;
                    tL_message.params = message.params;
                    tL_message.random_id = message.random_id;
                    tL_message.local_id = message.local_id;
                    tL_message.dialog_id = message.dialog_id;
                    tL_message.ttl = message.ttl;
                    tL_message.destroyTime = message.destroyTime;
                    tL_message.destroyTimeMillis = message.destroyTimeMillis;
                    tL_message.layer = message.layer;
                    tL_message.seq_in = message.seq_in;
                    tL_message.seq_out = message.seq_out;
                    tL_message.with_my_score = message.with_my_score;
                    tL_message.replyMessage = message.replyMessage;
                    tL_message.reqId = message.reqId;
                    tL_message.realId = message.realId;
                    tL_message.stickerVerified = message.stickerVerified;
                    tL_message.isThreadMessage = message.isThreadMessage;
                    tL_message.voiceTranscription = message.voiceTranscription;
                    tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                    tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
                    tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                    tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
                    tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
                    tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
                    tL_message.originalLanguage = message.originalLanguage;
                    tL_message.translatedToLanguage = message.translatedToLanguage;
                    tL_message.translatedText = message.translatedText;
                    tL_message.replyStory = message.replyStory;
                    tL_message.quick_reply_shortcut = message.quick_reply_shortcut;
                    return tL_message;
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell, int i2) {
                    if (i2 == 80) {
                        PollVotesAlert.showForPoll(SharedMediaLayout.this.profileActivity, chatMessageCell.getMessageObject());
                    }
                }
            };
            regroup();
        }

        private void regroup() {
            this.groupedByDay.clear();
            ArrayList messages = SharedMediaLayout.this.sharedMediaData[8].getMessages();
            int i = 0;
            for (int i2 = 0; i2 < messages.size(); i2++) {
                MessageObject messageObject = (MessageObject) messages.get(i2);
                if (messageObject.dateKeyInt != i) {
                    this.groupedByDay.add(action(messageObject.messageOwner.date));
                    i = messageObject.dateKeyInt;
                }
                this.groupedByDay.add(messageObject);
            }
        }

        public void onScrolled(RecyclerListView recyclerListView) {
            this.pollsToCheck.clear();
            for (int i = 0; i < recyclerListView.getChildCount(); i++) {
                View childAt = recyclerListView.getChildAt(i);
                if (childAt instanceof ChatMessageCell) {
                    this.pollsToCheck.add(((ChatMessageCell) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(this.currentAccount).addToPollsQueue(SharedMediaLayout.this.dialog_id, this.pollsToCheck);
        }

        public void update(RecyclerListView recyclerListView, long j, TLRPC.TL_poll tL_poll, TLRPC.PollResults pollResults) {
            for (int i = 0; i < this.groupedByDay.size(); i++) {
                MessageObject messageObject = (MessageObject) this.groupedByDay.get(i);
                if (messageObject != null && messageObject.getPollId() == j) {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                        if (tL_poll != null) {
                            tL_messageMediaPoll.poll = tL_poll;
                        }
                        MessageObject.updatePollResults(tL_messageMediaPoll, pollResults);
                        notifyItemChanged(i);
                    }
                }
            }
        }

        private MessageObject action(int i) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            long j = i;
            tL_message.message = LocaleController.formatDateChat(j);
            tL_message.id = 0;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
            messageObject.type = 10;
            messageObject.contentType = 1;
            messageObject.isDateObject = true;
            return messageObject;
        }

        @Override
        public void notifyDataSetChanged() {
            regroup();
            super.notifyDataSetChanged();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                ChatMessageCell chatMessageCell = new ChatMessageCell(this.mContext, this.currentAccount, false, null, this.resourcesProvider) {
                    @Override
                    public boolean isPressed() {
                        return false;
                    }
                };
                chatMessageCell.setDelegate(this.messageDelegate);
                return new RecyclerListView.Holder(chatMessageCell);
            }
            return new RecyclerListView.Holder(new ChatActionCell(this.mContext, false, this.resourcesProvider));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws Resources.NotFoundException {
            if (i < 0 || i >= this.groupedByDay.size()) {
                return;
            }
            MessageObject messageObject = (MessageObject) this.groupedByDay.get(i);
            if (viewHolder.getItemViewType() == 0) {
                ((ChatMessageCell) viewHolder.itemView).setMessageObject(messageObject, null, false, false, false);
            } else {
                ((ChatActionCell) viewHolder.itemView).setMessageObject(messageObject);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i < 0 || i >= this.groupedByDay.size()) {
                return 0;
            }
            return ((MessageObject) this.groupedByDay.get(i)).contentType;
        }

        @Override
        public int getItemCount() {
            return this.groupedByDay.size();
        }
    }

    public class MediaSearchAdapter extends RecyclerListView.SelectionAdapter {
        private int currentType;
        private int lastReqId;
        private Context mContext;
        private Runnable searchRunnable;
        private int searchesInProgress;
        private ArrayList searchResult = new ArrayList();
        protected ArrayList globalSearch = new ArrayList();
        private int reqId = 0;

        @Override
        public int getItemViewType(int i) {
            return 24;
        }

        public MediaSearchAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        public void queryServerSearch(final String str, final int i, long j, long j2) {
            if (DialogObject.isEncryptedDialog(j)) {
                return;
            }
            if (this.reqId != 0) {
                SharedMediaLayout.this.profileActivity.getConnectionsManager().cancelRequest(this.reqId, true);
                this.reqId = 0;
                this.searchesInProgress--;
            }
            if (str == null || str.length() == 0) {
                this.globalSearch.clear();
                this.lastReqId = 0;
                notifyDataSetChanged();
                return;
            }
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.limit = 50;
            tL_messages_search.offset_id = i;
            int i2 = this.currentType;
            if (i2 == 1) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i2 == 3) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
            } else if (i2 == 4) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_search.q = str;
            tL_messages_search.peer = SharedMediaLayout.this.profileActivity.getMessagesController().getInputPeer(j);
            if (j2 != 0) {
                if (j == SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId()) {
                    tL_messages_search.flags |= 4;
                    tL_messages_search.saved_peer_id = SharedMediaLayout.this.profileActivity.getMessagesController().getInputPeer(j2);
                } else {
                    tL_messages_search.flags |= 2;
                    tL_messages_search.top_msg_id = (int) j2;
                }
            }
            if (tL_messages_search.peer == null) {
                return;
            }
            final int i3 = this.lastReqId + 1;
            this.lastReqId = i3;
            this.searchesInProgress++;
            this.reqId = SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$queryServerSearch$1(i, i3, str, tLObject, tL_error);
                }
            }, 2);
            SharedMediaLayout.this.profileActivity.getConnectionsManager().bindRequestToGuid(this.reqId, SharedMediaLayout.this.profileActivity.getClassGuid());
        }

        public void lambda$queryServerSearch$1(int i, final int i2, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
            final ArrayList arrayList = new ArrayList();
            if (tL_error == null) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                    TLRPC.Message message = messages_messages.messages.get(i3);
                    if (i == 0 || message.id <= i) {
                        arrayList.add(new MessageObject(SharedMediaLayout.this.profileActivity.getCurrentAccount(), message, false, true));
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$queryServerSearch$0(i2, arrayList, str);
                }
            });
        }

        public void lambda$queryServerSearch$0(int i, ArrayList arrayList, String str) {
            if (this.reqId != 0) {
                if (i == this.lastReqId) {
                    int itemCount = getItemCount();
                    this.globalSearch = arrayList;
                    this.searchesInProgress--;
                    int itemCount2 = getItemCount();
                    if (this.searchesInProgress == 0 || itemCount2 != 0) {
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                    }
                    for (int i2 = 0; i2 < SharedMediaLayout.this.mediaPages.length; i2++) {
                        if (SharedMediaLayout.this.mediaPages[i2].selectedType == this.currentType) {
                            if (this.searchesInProgress == 0 && itemCount2 == 0) {
                                SharedMediaLayout.this.mediaPages[i2].emptyView.title.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str));
                                SharedMediaLayout.this.mediaPages[i2].emptyView.button.setVisibility(8);
                                SharedMediaLayout.this.mediaPages[i2].emptyView.showProgress(false, true);
                            } else if (itemCount == 0) {
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i2].listView, 0, null);
                            }
                        }
                    }
                    notifyDataSetChanged();
                }
                this.reqId = 0;
            }
        }

        public void search(final String str, boolean z) {
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.searchRunnable = null;
            }
            if (!this.searchResult.isEmpty() || !this.globalSearch.isEmpty()) {
                this.searchResult.clear();
                this.globalSearch.clear();
                notifyDataSetChanged();
            }
            if (!TextUtils.isEmpty(str)) {
                for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                    if (SharedMediaLayout.this.mediaPages[i].selectedType == this.currentType) {
                        SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(true, z);
                    }
                }
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$search$3(str);
                    }
                };
                this.searchRunnable = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, 300L);
                return;
            }
            if (this.searchResult.isEmpty() && this.globalSearch.isEmpty() && this.searchesInProgress == 0) {
                return;
            }
            this.searchResult.clear();
            this.globalSearch.clear();
            if (this.reqId != 0) {
                SharedMediaLayout.this.profileActivity.getConnectionsManager().cancelRequest(this.reqId, true);
                this.reqId = 0;
                this.searchesInProgress--;
            }
        }

        public void lambda$search$3(final String str) {
            int i;
            if (!SharedMediaLayout.this.sharedMediaData[this.currentType].messages.isEmpty() && ((i = this.currentType) == 1 || i == 4)) {
                MessageObject messageObject = (MessageObject) SharedMediaLayout.this.sharedMediaData[this.currentType].messages.get(SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() - 1);
                queryServerSearch(str, messageObject.getId(), messageObject.getDialogId(), SharedMediaLayout.this.dialog_id == SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
            } else if (this.currentType == 3) {
                queryServerSearch(str, 0, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.topicId);
            }
            int i2 = this.currentType;
            if (i2 == 1 || i2 == 4) {
                final ArrayList arrayList = new ArrayList(SharedMediaLayout.this.sharedMediaData[this.currentType].messages);
                this.searchesInProgress++;
                Utilities.searchQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$search$2(str, arrayList);
                    }
                });
            }
        }

        public void lambda$search$2(String str, ArrayList arrayList) {
            TLRPC.Document document;
            boolean zContains;
            String str2;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList());
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i2);
                int i3 = 0;
                while (true) {
                    if (i3 < i) {
                        String str3 = strArr[i3];
                        String documentName = messageObject.getDocumentName();
                        if (documentName != null && documentName.length() != 0) {
                            if (documentName.toLowerCase().contains(str3)) {
                                arrayList2.add(messageObject);
                                break;
                            }
                            if (this.currentType == 4) {
                                if (messageObject.type == 0) {
                                    document = MessageObject.getMedia(messageObject.messageOwner).webpage.document;
                                } else {
                                    document = MessageObject.getMedia(messageObject.messageOwner).document;
                                }
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= document.attributes.size()) {
                                        zContains = false;
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                        String str4 = documentAttribute.performer;
                                        zContains = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                        if (!zContains && (str2 = documentAttribute.title) != null) {
                                            zContains = str2.toLowerCase().contains(str3);
                                        }
                                    } else {
                                        i4++;
                                    }
                                }
                                if (zContains) {
                                    arrayList2.add(messageObject);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i3++;
                    }
                }
            }
            updateSearchResults(arrayList2);
        }

        private void updateSearchResults(final ArrayList arrayList) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateSearchResults$4(arrayList);
                }
            });
        }

        public void lambda$updateSearchResults$4(ArrayList arrayList) {
            if (SharedMediaLayout.this.searching) {
                this.searchesInProgress--;
                int itemCount = getItemCount();
                this.searchResult = arrayList;
                int itemCount2 = getItemCount();
                if (this.searchesInProgress == 0 || itemCount2 != 0) {
                    SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                }
                for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                    if (SharedMediaLayout.this.mediaPages[i].selectedType == this.currentType) {
                        if (this.searchesInProgress == 0 && itemCount2 == 0) {
                            SharedMediaLayout.this.mediaPages[i].emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
                            SharedMediaLayout.this.mediaPages[i].emptyView.button.setVisibility(8);
                            SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(false, true);
                        } else if (itemCount == 0) {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i].listView, 0, null);
                        }
                    }
                }
                notifyDataSetChanged();
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return this.searchResult.size() + this.globalSearch.size() != 0;
        }

        @Override
        public int getItemCount() {
            int size = this.searchResult.size();
            int size2 = this.globalSearch.size();
            return size2 != 0 ? size + size2 : size;
        }

        public MessageObject getItem(int i) {
            if (i < this.searchResult.size()) {
                return (MessageObject) this.searchResult.get(i);
            }
            return (MessageObject) this.globalSearch.get(i - this.searchResult.size());
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout sharedDocumentCell;
            int i2 = this.currentType;
            int i3 = 0;
            if (i2 == 1) {
                sharedDocumentCell = new SharedDocumentCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
            } else if (i2 == 4) {
                sharedDocumentCell = new SharedAudioCell(this.mContext, i3, SharedMediaLayout.this.resourcesProvider) {
                    @Override
                    public boolean needPlayMessage(MessageObject messageObject) {
                        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                            boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
                            MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? MediaSearchAdapter.this.searchResult : null, false);
                            if (messageObject.isRoundVideo()) {
                                MediaController.getInstance().setCurrentVideoVisible(false);
                            }
                            return zPlayMessage;
                        }
                        if (messageObject.isMusic()) {
                            return MediaController.getInstance().setPlaylist(MediaSearchAdapter.this.searchResult, messageObject, SharedMediaLayout.this.mergeDialogId);
                        }
                        return false;
                    }
                };
            } else {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
                sharedLinkCell.setDelegate(SharedMediaLayout.this.sharedLinkCellDelegate);
                sharedDocumentCell = sharedLinkCell;
            }
            sharedDocumentCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(sharedDocumentCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = this.currentType;
            if (i2 == 1) {
                View view = viewHolder.itemView;
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    MessageObject item = getItem(i);
                    sharedDocumentCell.setDocument(item, i != getItemCount() - 1);
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedDocumentCell.setChecked(sharedMediaLayout.selectedFiles[(item.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (item.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(item.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                        return;
                    } else {
                        sharedDocumentCell.setChecked(false, !sharedMediaLayout.scrolling);
                        return;
                    }
                }
                return;
            }
            if (i2 == 3) {
                View view2 = viewHolder.itemView;
                if (view2 instanceof SharedLinkCell) {
                    SharedLinkCell sharedLinkCell = (SharedLinkCell) view2;
                    MessageObject item2 = getItem(i);
                    sharedLinkCell.setLink(item2, i != getItemCount() - 1);
                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                    if (sharedMediaLayout2.isActionModeShowed) {
                        sharedLinkCell.setChecked(sharedMediaLayout2.selectedFiles[(item2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (item2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(item2.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                        return;
                    } else {
                        sharedLinkCell.setChecked(false, !sharedMediaLayout2.scrolling);
                        return;
                    }
                }
                return;
            }
            if (i2 == 4) {
                View view3 = viewHolder.itemView;
                if (view3 instanceof SharedAudioCell) {
                    SharedAudioCell sharedAudioCell = (SharedAudioCell) view3;
                    MessageObject item3 = getItem(i);
                    sharedAudioCell.setMessageObject(item3, i != getItemCount() - 1);
                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                    if (sharedMediaLayout3.isActionModeShowed) {
                        sharedAudioCell.setChecked(sharedMediaLayout3.selectedFiles[(item3.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (item3.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(item3.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                    } else {
                        sharedAudioCell.setChecked(false, !sharedMediaLayout3.scrolling);
                    }
                }
            }
        }
    }

    private class GifAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        @Override
        public long getItemId(int i) {
            return i;
        }

        public GifAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading;
        }

        @Override
        public int getItemCount() {
            if (SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading) {
                return SharedMediaLayout.this.sharedMediaData[5].messages.size();
            }
            return 1;
        }

        @Override
        public int getItemViewType(int i) {
            return (SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading) ? 12 : 11;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 11) {
                View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 5, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                viewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(viewCreateEmptyStubView);
            }
            ContextLinkCell contextLinkCell = new ContextLinkCell(this.mContext, true, SharedMediaLayout.this.resourcesProvider);
            contextLinkCell.setCanPreviewGif(true);
            return new RecyclerListView.Holder(contextLinkCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            MessageObject messageObject;
            TLRPC.Document document;
            if (viewHolder.getItemViewType() != 12 || (document = (messageObject = (MessageObject) SharedMediaLayout.this.sharedMediaData[5].messages.get(i)).getDocument()) == null) {
                return;
            }
            View view = viewHolder.itemView;
            if (view instanceof ContextLinkCell) {
                ContextLinkCell contextLinkCell = (ContextLinkCell) view;
                contextLinkCell.setGif(document, messageObject, messageObject.messageOwner.date, false);
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                if (sharedMediaLayout.isActionModeShowed) {
                    contextLinkCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                } else {
                    contextLinkCell.setChecked(false, !sharedMediaLayout.scrolling);
                }
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ContextLinkCell) {
                ImageReceiver photoImage = ((ContextLinkCell) view).getPhotoImage();
                if (SharedMediaLayout.this.mediaPages[0].selectedType == 5) {
                    photoImage.setAllowStartAnimation(true);
                    photoImage.startAnimation();
                } else {
                    photoImage.setAllowStartAnimation(false);
                    photoImage.stopAnimation();
                }
            }
        }
    }

    class SavedDialogsAdapter extends RecyclerListView.SelectionAdapter {
        public RecyclerListView attachedToRecyclerView;
        private final SavedMessagesController controller;
        private final Context mContext;
        private boolean orderChanged;
        private final ArrayList oldDialogs = new ArrayList();
        private final ArrayList dialogs = new ArrayList();
        private Runnable notifyOrderUpdate = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
            }
        };
        public final RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
        public final ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() {
            @Override
            public boolean isLongPressDragEnabled() {
                return true;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            }

            @Override
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                if (!SharedMediaLayout.this.isActionModeShowed || recyclerView.getAdapter() == SharedMediaLayout.this.savedMessagesSearchAdapter) {
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }
                SavedMessagesController.SavedDialog dialog = getDialog(viewHolder);
                if (dialog != null && dialog.pinned) {
                    return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
                }
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }

            private SavedMessagesController.SavedDialog getDialog(RecyclerView.ViewHolder viewHolder) {
                int adapterPosition;
                if (viewHolder != null && (adapterPosition = viewHolder.getAdapterPosition()) >= 0 && adapterPosition < SavedDialogsAdapter.this.dialogs.size()) {
                    return (SavedMessagesController.SavedDialog) SavedDialogsAdapter.this.dialogs.get(adapterPosition);
                }
                return null;
            }

            @Override
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
                RecyclerListView recyclerListView;
                if (viewHolder != null && (recyclerListView = SavedDialogsAdapter.this.attachedToRecyclerView) != null) {
                    recyclerListView.hideSelector(false);
                }
                if (i == 0) {
                    AndroidUtilities.cancelRunOnUIThread(SavedDialogsAdapter.this.notifyOrderUpdate);
                    AndroidUtilities.runOnUIThread(SavedDialogsAdapter.this.notifyOrderUpdate, 300L);
                }
                super.onSelectedChanged(viewHolder, i);
            }

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                if (SharedMediaLayout.this.isActionModeShowed && recyclerView.getAdapter() != SharedMediaLayout.this.savedMessagesSearchAdapter) {
                    SavedMessagesController.SavedDialog dialog = getDialog(viewHolder);
                    SavedMessagesController.SavedDialog dialog2 = getDialog(viewHolder2);
                    if (dialog != null && dialog2 != null && dialog.pinned && dialog2.pinned) {
                        int adapterPosition = viewHolder.getAdapterPosition();
                        int adapterPosition2 = viewHolder2.getAdapterPosition();
                        SavedDialogsAdapter.this.dialogs.remove(adapterPosition);
                        SavedDialogsAdapter.this.dialogs.add(adapterPosition2, dialog);
                        SavedDialogsAdapter.this.notifyItemMoved(adapterPosition, adapterPosition2);
                        SavedDialogsAdapter.this.orderChanged = true;
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                super.clearView(recyclerView, viewHolder);
                viewHolder.itemView.setPressed(false);
            }
        });
        public final HashSet selectedDialogs = new HashSet();

        @Override
        public int getItemViewType(int i) {
            return 13;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public void lambda$new$0() {
            if (this.orderChanged) {
                this.orderChanged = false;
                ArrayList<Long> arrayList = new ArrayList<>();
                for (int i = 0; i < this.dialogs.size(); i++) {
                    if (((SavedMessagesController.SavedDialog) this.dialogs.get(i)).pinned) {
                        arrayList.add(Long.valueOf(((SavedMessagesController.SavedDialog) this.dialogs.get(i)).dialogId));
                    }
                }
                SharedMediaLayout.this.profileActivity.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList);
            }
        }

        public SavedDialogsAdapter(Context context) {
            this.mContext = context;
            SavedMessagesController savedMessagesController = SharedMediaLayout.this.profileActivity.getMessagesController().getSavedMessagesController();
            this.controller = savedMessagesController;
            if (SharedMediaLayout.this.includeSavedDialogs()) {
                savedMessagesController.loadDialogs(false);
            }
            setHasStableIds(true);
            update(false);
        }

        @Override
        public long getItemId(int i) {
            return (i < 0 || i >= this.dialogs.size()) ? i : ((SavedMessagesController.SavedDialog) this.dialogs.get(i)).dialogId;
        }

        public void update(boolean z) {
            this.oldDialogs.clear();
            this.oldDialogs.addAll(this.dialogs);
            this.dialogs.clear();
            this.dialogs.addAll(this.controller.allDialogs);
            if (z) {
                notifyDataSetChanged();
            }
        }

        public void select(View view) {
            SavedMessagesController.SavedDialog savedDialog;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                long dialogId = dialogCell.getDialogId();
                int i = 0;
                while (true) {
                    if (i >= this.dialogs.size()) {
                        savedDialog = null;
                        break;
                    } else {
                        if (((SavedMessagesController.SavedDialog) this.dialogs.get(i)).dialogId == dialogId) {
                            savedDialog = (SavedMessagesController.SavedDialog) this.dialogs.get(i);
                            break;
                        }
                        i++;
                    }
                }
                if (savedDialog == null) {
                    return;
                }
                if (this.selectedDialogs.contains(Long.valueOf(savedDialog.dialogId))) {
                    this.selectedDialogs.remove(Long.valueOf(savedDialog.dialogId));
                    if (this.selectedDialogs.size() <= 0) {
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        if (sharedMediaLayout.isActionModeShowed) {
                            sharedMediaLayout.showActionMode(false);
                        }
                    }
                } else {
                    this.selectedDialogs.add(Long.valueOf(savedDialog.dialogId));
                    if (this.selectedDialogs.size() > 0) {
                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                        if (!sharedMediaLayout2.isActionModeShowed) {
                            sharedMediaLayout2.showActionMode(true);
                            if (SharedMediaLayout.this.gotoItem != null) {
                                SharedMediaLayout.this.gotoItem.setVisibility(8);
                            }
                            if (SharedMediaLayout.this.forwardItem != null) {
                                SharedMediaLayout.this.forwardItem.setVisibility(8);
                            }
                        }
                    }
                }
                SharedMediaLayout.this.selectedMessagesCountTextView.setNumber(this.selectedDialogs.size(), true);
                boolean z = this.selectedDialogs.size() > 0;
                Iterator it = this.selectedDialogs.iterator();
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= this.dialogs.size()) {
                            break;
                        }
                        SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) this.dialogs.get(i2);
                        if (savedDialog2.dialogId != jLongValue) {
                            i2++;
                        } else if (!savedDialog2.pinned) {
                            z = false;
                        }
                    }
                    if (!z) {
                        break;
                    }
                }
                if (SharedMediaLayout.this.pinItem != null) {
                    SharedMediaLayout.this.pinItem.setVisibility(z ? 8 : 0);
                }
                if (SharedMediaLayout.this.unpinItem != null) {
                    SharedMediaLayout.this.unpinItem.setVisibility(z ? 0 : 8);
                }
                if (view instanceof DialogCell) {
                    dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(savedDialog.dialogId)), true);
                }
            }
        }

        public void unselectAll() {
            this.selectedDialogs.clear();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            DialogCell dialogCell = new DialogCell(null, this.mContext, false, true) {
                @Override
                public boolean isForumCell() {
                    return false;
                }

                @Override
                public boolean getIsPinned() {
                    int childAdapterPosition;
                    RecyclerListView recyclerListView = SavedDialogsAdapter.this.attachedToRecyclerView;
                    if (recyclerListView == null) {
                        return false;
                    }
                    RecyclerView.Adapter adapter = recyclerListView.getAdapter();
                    SavedDialogsAdapter savedDialogsAdapter = SavedDialogsAdapter.this;
                    if (adapter != savedDialogsAdapter || (childAdapterPosition = savedDialogsAdapter.attachedToRecyclerView.getChildAdapterPosition(this)) < 0 || childAdapterPosition >= SavedDialogsAdapter.this.dialogs.size()) {
                        return false;
                    }
                    return ((SavedMessagesController.SavedDialog) SavedDialogsAdapter.this.dialogs.get(childAdapterPosition)).pinned;
                }
            };
            dialogCell.setDialogCellDelegate(SharedMediaLayout.this);
            dialogCell.isSavedDialog = true;
            dialogCell.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
            return new RecyclerListView.Holder(dialogCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            View view = viewHolder.itemView;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) this.dialogs.get(i);
                dialogCell.setDialog(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                dialogCell.isSavedDialogCell = true;
                dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(savedDialog.dialogId)), false);
                dialogCell.useSeparator = i + 1 < getItemCount();
            }
        }

        @Override
        public int getItemCount() {
            return this.dialogs.size();
        }
    }

    class SavedMessagesSearchAdapter extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        private String lastQuery;
        private ReactionsLayoutInBubble.VisibleReaction lastReaction;
        int lastSearchId;
        private boolean loading;
        private final Context mContext;
        public final ArrayList dialogs = new ArrayList();
        public final ArrayList messages = new ArrayList();
        public final ArrayList loadedMessages = new ArrayList();
        public final ArrayList cachedMessages = new ArrayList();
        private boolean endReached = false;
        private int oldItemCounts = 0;
        private int count = 0;
        private int reqId = -1;
        private Runnable searchRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.sendRequest();
            }
        };

        @Override
        public int getItemViewType(int i) {
            return 23;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public SavedMessagesSearchAdapter(Context context) {
            this.mContext = context;
            this.currentAccount = SharedMediaLayout.this.profileActivity.getCurrentAccount();
            setHasStableIds(true);
        }

        public void search(String str, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            if (TextUtils.equals(str, this.lastQuery)) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = this.lastReaction;
                if (visibleReaction2 == null && visibleReaction == null) {
                    return;
                }
                if (visibleReaction2 != null && visibleReaction2.equals(visibleReaction)) {
                    return;
                }
            }
            this.lastQuery = str;
            this.lastReaction = visibleReaction;
            if (this.reqId >= 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = -1;
            }
            this.cachedMessages.clear();
            this.loadedMessages.clear();
            this.messages.clear();
            this.count = 0;
            this.endReached = false;
            this.loading = true;
            this.dialogs.clear();
            if (this.lastReaction == null) {
                this.dialogs.addAll(MessagesController.getInstance(this.currentAccount).getSavedMessagesController().searchDialogs(str));
            }
            for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                if (SharedMediaLayout.this.mediaPages[i].selectedType == 11) {
                    SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(true, true);
                }
            }
            if (this.lastReaction == null) {
                notifyDataSetChanged();
            }
            AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
            AndroidUtilities.runOnUIThread(this.searchRunnable, this.lastReaction != null ? 60L : 600L);
        }

        public void loadMore() {
            if (this.endReached || this.loading) {
                return;
            }
            this.loading = true;
            sendRequest();
        }

        public void sendRequest() {
            if (TextUtils.isEmpty(this.lastQuery) && this.lastReaction == null) {
                this.loading = false;
                return;
            }
            final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.q = this.lastQuery;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.lastReaction;
            if (visibleReaction != null) {
                tL_messages_search.flags |= 8;
                tL_messages_search.saved_reaction.add(visibleReaction.toTLReaction());
            }
            if (this.loadedMessages.size() > 0) {
                tL_messages_search.offset_id = ((MessageObject) this.loadedMessages.get(r2.size() - 1)).getId();
            }
            tL_messages_search.limit = 10;
            this.endReached = false;
            final int i = this.lastSearchId + 1;
            this.lastSearchId = i;
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$sendRequest$2(i, tL_messages_search);
                }
            };
            if (this.lastReaction != null) {
                MessagesStorage.getInstance(this.currentAccount).searchSavedByTag(this.lastReaction.toTLReaction(), 0L, this.lastQuery, 100, this.cachedMessages.size(), new Utilities.Callback4() {
                    @Override
                    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                        this.f$0.lambda$sendRequest$3(runnable, (ArrayList) obj, (ArrayList) obj2, (ArrayList) obj3, (ArrayList) obj4);
                    }
                }, false);
            } else {
                runnable.run();
            }
        }

        public void lambda$sendRequest$2(final int i, TLRPC.TL_messages_search tL_messages_search) {
            if (i != this.lastSearchId) {
                return;
            }
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$sendRequest$1(i, tLObject, tL_error);
                }
            });
        }

        public void lambda$sendRequest$1(final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$sendRequest$0(tLObject, i);
                }
            });
        }

        public void lambda$sendRequest$0(TLObject tLObject, int i) {
            if ((tLObject instanceof TLRPC.messages_Messages) && i == this.lastSearchId) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                    MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i2), false, true);
                    if (messageObject.hasValidGroupId()) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(this.lastQuery);
                    this.loadedMessages.add(messageObject);
                }
                this.count = messages_messages.count;
                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    this.endReached = this.loadedMessages.size() >= messages_messages.count;
                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    this.endReached = true;
                }
                updateMessages(false);
                this.loading = false;
                this.reqId = -1;
            }
        }

        public void lambda$sendRequest$3(Runnable runnable, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            MessagesController.getInstance(this.currentAccount).putUsers(arrayList2, true);
            MessagesController.getInstance(this.currentAccount).putChats(arrayList3, true);
            AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).processDocuments(arrayList4);
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i);
                if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(this.lastQuery);
                this.cachedMessages.add(messageObject);
            }
            updateMessages(true);
            AndroidUtilities.runOnUIThread(runnable, 540L);
        }

        private void updateMessages(boolean z) {
            this.messages.clear();
            HashSet hashSet = new HashSet();
            for (int i = 0; i < this.loadedMessages.size(); i++) {
                MessageObject messageObject = (MessageObject) this.loadedMessages.get(i);
                if (messageObject != null && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                    hashSet.add(Integer.valueOf(messageObject.getId()));
                    this.messages.add(messageObject);
                }
            }
            for (int i2 = 0; i2 < this.cachedMessages.size(); i2++) {
                MessageObject messageObject2 = (MessageObject) this.cachedMessages.get(i2);
                if (messageObject2 != null && !hashSet.contains(Integer.valueOf(messageObject2.getId()))) {
                    hashSet.add(Integer.valueOf(messageObject2.getId()));
                    this.messages.add(messageObject2);
                }
            }
            if (!z || !this.cachedMessages.isEmpty()) {
                for (int i3 = 0; i3 < SharedMediaLayout.this.mediaPages.length; i3++) {
                    if (SharedMediaLayout.this.mediaPages[i3].selectedType == 11 && this.messages.isEmpty() && this.dialogs.isEmpty()) {
                        SharedMediaLayout.this.mediaPages[i3].emptyView.title.setText((this.lastReaction == null || !TextUtils.isEmpty(this.lastQuery)) ? LocaleController.formatString(R.string.NoResultFoundFor, this.lastQuery) : AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.NoResultFoundForTag), this.lastReaction.toCharSequence(SharedMediaLayout.this.mediaPages[i3].emptyView.title.getPaint().getFontMetricsInt())));
                        SharedMediaLayout.this.mediaPages[i3].emptyView.button.setVisibility(8);
                        SharedMediaLayout.this.mediaPages[i3].emptyView.showProgress(false, true);
                    }
                }
            }
            this.oldItemCounts = this.count;
            notifyDataSetChanged();
        }

        @Override
        public long getItemId(int i) {
            int iHash;
            if (i < 0) {
                return i;
            }
            if (i < this.dialogs.size()) {
                iHash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) this.dialogs.get(i)).dialogId));
            } else {
                int size = i - this.dialogs.size();
                if (size >= this.messages.size()) {
                    return size;
                }
                iHash = Objects.hash(2, Long.valueOf(((MessageObject) this.messages.get(size)).getSavedDialogId()), Integer.valueOf(((MessageObject) this.messages.get(size)).getId()));
            }
            return iHash;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            DialogCell dialogCell = new DialogCell(null, this.mContext, false, true) {
                @Override
                public boolean isForumCell() {
                    return false;
                }
            };
            dialogCell.setDialogCellDelegate(SharedMediaLayout.this);
            dialogCell.isSavedDialog = true;
            dialogCell.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
            return new RecyclerListView.Holder(dialogCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0) {
                return;
            }
            View view = viewHolder.itemView;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                dialogCell.useSeparator = i + 1 < getItemCount();
                if (i < this.dialogs.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) this.dialogs.get(i);
                    dialogCell.setDialog(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i - this.dialogs.size();
                if (size < this.messages.size()) {
                    MessageObject messageObject = (MessageObject) this.messages.get(size);
                    dialogCell.setDialog(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }

        @Override
        public int getItemCount() {
            return this.dialogs.size() + this.messages.size();
        }
    }

    class ChannelRecommendationsAdapter extends RecyclerListView.SelectionAdapter {
        private final ArrayList chats = new ArrayList();
        private final Context mContext;
        private int more;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public ChannelRecommendationsAdapter(Context context) {
            this.mContext = context;
            update(false);
        }

        public void update(boolean z) {
            if (SharedMediaLayout.this.profileActivity == null) {
                return;
            }
            if (DialogObject.isChatDialog(SharedMediaLayout.this.dialog_id)) {
                TLRPC.Chat chat = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getChat(Long.valueOf(-SharedMediaLayout.this.dialog_id));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getChannelRecommendations(SharedMediaLayout.this.dialog_id);
            this.chats.clear();
            int i = 0;
            if (channelRecommendations != null) {
                for (int i2 = 0; i2 < channelRecommendations.chats.size(); i2++) {
                    TLObject tLObject = channelRecommendations.chats.get(i2);
                    if ((tLObject instanceof TLRPC.Chat) && ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                        this.chats.add(tLObject);
                    } else {
                        this.chats.add(tLObject);
                    }
                }
            }
            if (!this.chats.isEmpty() && !UserConfig.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).isPremium()) {
                i = channelRecommendations.more;
            }
            this.more = i;
            if (z) {
                notifyDataSetChanged();
            }
        }

        @Override
        public int getItemCount() {
            return this.chats.size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View profileSearchCell;
            if (i == 18) {
                profileSearchCell = new MoreRecommendationsCell(SharedMediaLayout.this.profileActivity == null ? UserConfig.selectedAccount : SharedMediaLayout.this.profileActivity.getCurrentAccount(), this.mContext, SharedMediaLayout.this.dialog_id > 0, SharedMediaLayout.this.resourcesProvider, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onCreateViewHolder$0();
                    }
                });
            } else {
                profileSearchCell = new ProfileSearchCell(this.mContext, SharedMediaLayout.this.resourcesProvider);
            }
            profileSearchCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(profileSearchCell);
        }

        public void lambda$onCreateViewHolder$0() {
            if (SharedMediaLayout.this.profileActivity != null) {
                SharedMediaLayout.this.profileActivity.presentFragment(new PremiumPreviewFragment("similar_channels"));
            }
        }

        public void openPreview(final int i) {
            if (i < 0 || i >= this.chats.size()) {
                return;
            }
            TLObject tLObject = (TLObject) this.chats.get(i);
            Bundle bundle = new Bundle();
            boolean z = tLObject instanceof TLRPC.Chat;
            if (z) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
            } else if (!(tLObject instanceof TLRPC.User)) {
                return;
            } else {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
            }
            ChatActivity chatActivity = new ChatActivity(bundle);
            if (SharedMediaLayout.this.profileActivity instanceof ProfileActivity) {
                ((ProfileActivity) SharedMediaLayout.this.profileActivity).prepareBlurBitmap();
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(SharedMediaLayout.this.getContext(), R.drawable.popup_fixed_alert, SharedMediaLayout.this.resourcesProvider, 2);
            actionBarPopupWindowLayout.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
            if (z) {
                final TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(SharedMediaLayout.this.getContext(), false, false);
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel);
                actionBarMenuSubItem.setMinimumWidth(160);
                actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$openPreview$1(view);
                    }
                });
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
                ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(SharedMediaLayout.this.getContext(), false, false);
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot);
                actionBarMenuSubItem2.setMinimumWidth(160);
                actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$openPreview$3(chat, i, view);
                    }
                });
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem2);
                SharedMediaLayout.this.profileActivity.presentFragmentAsPreviewWithMenu(chatActivity, actionBarPopupWindowLayout);
                return;
            }
            if (tLObject instanceof TLRPC.User) {
                SharedMediaLayout.this.profileActivity.presentFragmentAsPreview(chatActivity);
            }
        }

        public void lambda$openPreview$1(View view) {
            if (SharedMediaLayout.this.profileActivity == null || SharedMediaLayout.this.profileActivity.getParentLayout() == null) {
                return;
            }
            SharedMediaLayout.this.profileActivity.getParentLayout().expandPreviewFragment();
        }

        public void lambda$openPreview$3(final TLRPC.Chat chat, int i, View view) {
            SharedMediaLayout.this.profileActivity.finishPreviewFragment();
            chat.left = false;
            update(false);
            notifyItemRemoved(i);
            if (this.chats.isEmpty()) {
                SharedMediaLayout.this.updateTabs(true);
                SharedMediaLayout.this.checkCurrentTabValid();
            }
            SharedMediaLayout.this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-SharedMediaLayout.this.dialog_id));
            SharedMediaLayout.this.profileActivity.getMessagesController().addUserToChat(chat.id, SharedMediaLayout.this.profileActivity.getUserConfig().getCurrentUser(), 0, null, SharedMediaLayout.this.profileActivity, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openPreview$2(chat);
                }
            });
        }

        public void lambda$openPreview$2(TLRPC.Chat chat) {
            BulletinFactory.of(SharedMediaLayout.this.profileActivity).createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).show(true);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ProfileSearchCell profileSearchCell;
            if (viewHolder.getItemViewType() == 17) {
                View view = viewHolder.itemView;
                if (!(view instanceof ProfileSearchCell)) {
                    return;
                } else {
                    profileSearchCell = (ProfileSearchCell) view;
                }
            } else if (viewHolder.getItemViewType() == 18) {
                View view2 = viewHolder.itemView;
                if (!(view2 instanceof MoreRecommendationsCell)) {
                    return;
                } else {
                    profileSearchCell = ((MoreRecommendationsCell) view2).channelCell;
                }
            } else {
                profileSearchCell = null;
            }
            if (profileSearchCell != null) {
                profileSearchCell.setData(this.chats.get(i), null, null, null, false, false);
                profileSearchCell.useSeparator = i != this.chats.size() - 1;
            }
        }

        @Override
        public int getItemViewType(int i) {
            return (this.more <= 0 || i != getItemCount() + (-1)) ? 17 : 18;
        }
    }

    static class MoreRecommendationsCell extends FrameLayout {
        private final ButtonWithCounterView button;
        public final ProfileSearchCell channelCell;
        private final int currentAccount;
        private final View gradientView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final LinkSpanDrawable.LinksTextView textView;

        public MoreRecommendationsCell(int i, Context context, boolean z, Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context, resourcesProvider);
            this.channelCell = profileSearchCell;
            profileSearchCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2));
            addView(profileSearchCell, LayoutHelper.createFrame(-1, -2.0f));
            View view = new View(context);
            this.gradientView = view;
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i2 = Theme.key_windowBackgroundWhite;
            view.setBackground(new GradientDrawable(orientation, new int[]{Theme.multAlpha(Theme.getColor(i2, resourcesProvider), 0.4f), Theme.getColor(i2, resourcesProvider)}));
            addView(view, LayoutHelper.createFrame(-1, 60.0f));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
            this.button = buttonWithCounterView;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(z ? R.string.MoreSimilarBotsButton : R.string.MoreSimilarButton));
            spannableStringBuilder.append((CharSequence) " ");
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            buttonWithCounterView.setText(spannableStringBuilder, false);
            addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    SharedMediaLayout.MoreRecommendationsCell.lambda$new$0(runnable, view2);
                }
            });
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            this.textView = linksTextView;
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setTextAlignment(4);
            linksTextView.setGravity(17);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider));
            linksTextView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
            SpannableStringBuilder spannableStringBuilderPremiumText = AndroidUtilities.premiumText(LocaleController.getString(z ? R.string.MoreSimilarBotsText : R.string.MoreSimilarText), new Runnable() {
                @Override
                public final void run() {
                    SharedMediaLayout.MoreRecommendationsCell.lambda$new$1(runnable);
                }
            });
            SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i).recommendedChannelsLimitPremium);
            spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
            linksTextView.setText(AndroidUtilities.replaceCharSequence("%s", spannableStringBuilderPremiumText, spannableString2));
            addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
        }

        public static void lambda$new$0(Runnable runnable, View view) {
            if (runnable != null) {
                runnable.run();
            }
        }

        public static void lambda$new$1(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
        }
    }

    class CommonGroupsAdapter extends RecyclerListView.SelectionAdapter {
        private ArrayList chats = new ArrayList();
        private boolean endReached;
        private boolean firstLoaded;
        private boolean loading;
        private Context mContext;

        public CommonGroupsAdapter(Context context) {
            this.mContext = context;
        }

        public void getChats(long j, final int i) {
            long j2;
            if (this.loading) {
                return;
            }
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            if (!DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id)) {
                j2 = SharedMediaLayout.this.dialog_id;
            } else {
                j2 = SharedMediaLayout.this.profileActivity.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(SharedMediaLayout.this.dialog_id))).user_id;
            }
            TLRPC.InputUser inputUser = SharedMediaLayout.this.profileActivity.getMessagesController().getInputUser(j2);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = i;
            tL_messages_getCommonChats.max_id = j;
            this.loading = true;
            notifyDataSetChanged();
            SharedMediaLayout.this.profileActivity.getConnectionsManager().bindRequestToGuid(SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$getChats$1(i, tLObject, tL_error);
                }
            }), SharedMediaLayout.this.profileActivity.getClassGuid());
        }

        public void lambda$getChats$1(final int i, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getChats$0(tL_error, tLObject, i);
                }
            });
        }

        public void lambda$getChats$0(TLRPC.TL_error tL_error, TLObject tLObject, int i) {
            int itemCount = getItemCount();
            if (tL_error == null) {
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                SharedMediaLayout.this.profileActivity.getMessagesController().putChats(messages_chats.chats, false);
                this.endReached = messages_chats.chats.isEmpty() || messages_chats.chats.size() != i;
                this.chats.addAll(messages_chats.chats);
            } else {
                this.endReached = true;
            }
            for (int i2 = 0; i2 < SharedMediaLayout.this.mediaPages.length; i2++) {
                if (SharedMediaLayout.this.mediaPages[i2].selectedType == 6 && SharedMediaLayout.this.mediaPages[i2].listView != null) {
                    InternalListView internalListView = SharedMediaLayout.this.mediaPages[i2].listView;
                    if (this.firstLoaded || itemCount == 0) {
                        SharedMediaLayout.this.animateItemsEnter(internalListView, 0, null);
                    }
                }
            }
            this.loading = false;
            this.firstLoaded = true;
            notifyDataSetChanged();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getAdapterPosition() != this.chats.size();
        }

        @Override
        public int getItemCount() {
            if (this.chats.isEmpty() && !this.loading) {
                return 1;
            }
            int size = this.chats.size();
            return (this.chats.isEmpty() || this.endReached) ? size : size + 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ProfileSearchCell profileSearchCell;
            if (i == 14) {
                profileSearchCell = new ProfileSearchCell(this.mContext, SharedMediaLayout.this.resourcesProvider);
            } else {
                if (i == 15) {
                    View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 6, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                    viewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    return new RecyclerListView.Holder(viewCreateEmptyStubView);
                }
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, SharedMediaLayout.this.resourcesProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate(false);
                flickerLoadingView.setViewType(1);
                profileSearchCell = flickerLoadingView;
            }
            profileSearchCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(profileSearchCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 14) {
                View view = viewHolder.itemView;
                if (view instanceof ProfileSearchCell) {
                    ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                    profileSearchCell.setData((TLRPC.Chat) this.chats.get(i), null, null, null, false, false);
                    boolean z = true;
                    if (i == this.chats.size() - 1 && this.endReached) {
                        z = false;
                    }
                    profileSearchCell.useSeparator = z;
                }
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (!this.chats.isEmpty() || this.loading) {
                return i < this.chats.size() ? 14 : 16;
            }
            return 15;
        }
    }

    public int getStoriesCount(int i) {
        StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType;
        StoriesController.StoriesList storiesList;
        if (!isAnyStoryPageType(i) || (storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(i)) == null || (storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList) == null) {
            return 0;
        }
        return storiesList.getCount();
    }

    public String getBotPreviewsSubtitle(boolean z) {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        BotPreviewsEditContainer botPreviewsEditContainer;
        if (!isBot()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z && (botPreviewsEditContainer = this.botPreviewsContainer) != null) {
            return botPreviewsEditContainer.getBotPreviewsSubtitle();
        }
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter == null || storiesAdapter.storiesList == null) {
            i = 0;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < this.storiesAdapter.storiesList.messageObjects.size(); i3++) {
                MessageObject messageObject = (MessageObject) this.storiesAdapter.storiesList.messageObjects.get(i3);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (MessageObject.isVideoDocument(messageMedia.document)) {
                        i2++;
                    } else if (messageObject.storyItem.media.photo != null) {
                        i++;
                    }
                }
            }
        }
        if (i == 0 && i2 == 0) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(LocaleController.formatPluralString("Images", i, new Object[0]));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.formatPluralString("Videos", i2, new Object[0]));
        }
        return sb.toString();
    }

    public void updateStoriesList(StoriesController.StoriesList storiesList) {
        this.searchStoriesList = storiesList;
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        storiesAdapter.storiesList = storiesList;
        storiesAdapter.notifyDataSetChanged();
        StoriesAdapter storiesAdapter2 = this.animationSupportingStoriesAdapter;
        storiesAdapter2.storiesList = storiesList;
        storiesAdapter2.notifyDataSetChanged();
    }

    public class StoriesAdapter extends SharedPhotoVideoAdapter {
        private final int albumId;
        public boolean applyingReorder;
        private int id;
        private boolean inAlbumStoriesReorder;
        private final boolean isArchive;
        public ArrayList lastPinnedIds;
        private ViewsForPeerStoriesRequester poller;
        public StoriesController.StoriesList storiesList;
        private StoriesAdapter supportingAdapter;
        private final ArrayList uploadingStories;

        @Override
        public int getItemViewType(int i) {
            return 19;
        }

        public int getTopOffset() {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            return super.fastScrollIsVisible(recyclerListView);
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            super.getPositionForScrollProgress(recyclerListView, f, iArr);
        }

        @Override
        public float getScrollProgress(RecyclerListView recyclerListView) {
            return super.getScrollProgress(recyclerListView);
        }

        @Override
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            super.onFinishFastScroll(recyclerListView);
        }

        @Override
        public void onStartFastScroll() {
            super.onStartFastScroll();
        }

        public StoriesAdapter(SharedMediaLayout sharedMediaLayout, Context context, boolean z) {
            this(context, 0, z);
        }

        public StoriesAdapter(Context context, int i, boolean z) {
            TLRPC.User user;
            super(context);
            this.uploadingStories = new ArrayList();
            this.lastPinnedIds = new ArrayList();
            this.isArchive = z;
            this.albumId = i;
            int currentAccount = SharedMediaLayout.this.profileActivity.getCurrentAccount();
            if (!TextUtils.isEmpty(SharedMediaLayout.this.getStoriesHashtag())) {
                if (SharedMediaLayout.this.searchStoriesList == null) {
                    SharedMediaLayout.this.searchStoriesList = new StoriesController.SearchStoriesList(currentAccount, TextUtils.isEmpty(SharedMediaLayout.this.getStoriesHashtagUsername()) ? null : SharedMediaLayout.this.getStoriesHashtagUsername(), SharedMediaLayout.this.getStoriesHashtag());
                }
                this.storiesList = SharedMediaLayout.this.searchStoriesList;
            } else if (SharedMediaLayout.this.getStoriesArea() != null) {
                if (SharedMediaLayout.this.searchStoriesList == null) {
                    SharedMediaLayout.this.searchStoriesList = new StoriesController.SearchStoriesList(currentAccount, SharedMediaLayout.this.getStoriesArea());
                }
                this.storiesList = SharedMediaLayout.this.searchStoriesList;
            } else if ((z && !SharedMediaLayout.this.isStoriesView()) || (!z && SharedMediaLayout.this.isArchivedOnlyStoriesView())) {
                this.storiesList = null;
            } else {
                int i2 = 1;
                boolean z2 = SharedMediaLayout.this.dialog_id > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id))) != null && user.bot;
                if (i > 0) {
                    this.storiesList = SharedMediaLayout.this.profileActivity.getMessagesController().getStoriesController().getStoriesList(SharedMediaLayout.this.dialog_id, 0, i);
                } else {
                    StoriesController storiesController = SharedMediaLayout.this.profileActivity.getMessagesController().getStoriesController();
                    long j = SharedMediaLayout.this.dialog_id;
                    if (z2) {
                        i2 = 4;
                    } else if (!z) {
                        i2 = 0;
                    }
                    this.storiesList = storiesController.getStoriesList(j, i2);
                }
            }
            StoriesController.StoriesList storiesList = this.storiesList;
            if (storiesList != null) {
                this.id = storiesList.link();
                this.poller = new ViewsForPeerStoriesRequester(SharedMediaLayout.this.profileActivity.getMessagesController().getStoriesController(), SharedMediaLayout.this.dialog_id, this.storiesList.currentAccount) {
                    @Override
                    protected void getStoryIds(ArrayList arrayList) {
                        InternalListView internalListView;
                        MessageObject messageObject;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= SharedMediaLayout.this.mediaPages.length) {
                                internalListView = null;
                                break;
                            }
                            if (SharedMediaLayout.this.mediaPages[i3].listView != null) {
                                RecyclerView.Adapter adapter = SharedMediaLayout.this.mediaPages[i3].listView.getAdapter();
                                StoriesAdapter storiesAdapter = StoriesAdapter.this;
                                if (adapter == storiesAdapter) {
                                    internalListView = SharedMediaLayout.this.mediaPages[i3].listView;
                                    break;
                                }
                            }
                            i3++;
                        }
                        if (internalListView != null) {
                            for (int i4 = 0; i4 < internalListView.getChildCount(); i4++) {
                                View childAt = internalListView.getChildAt(i4);
                                if ((childAt instanceof SharedPhotoVideoCell2) && (messageObject = ((SharedPhotoVideoCell2) childAt).getMessageObject()) != null && messageObject.isStory()) {
                                    arrayList.add(Integer.valueOf(messageObject.storyItem.id));
                                }
                            }
                        }
                    }

                    @Override
                    protected boolean updateStories(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
                        StoriesAdapter.this.storiesList.updateStoryViews(arrayList, tL_stories_storyViews.views);
                        return true;
                    }
                };
            }
            checkColumns();
        }

        public void destroy() {
            StoriesController.StoriesList storiesList = this.storiesList;
            if (storiesList != null) {
                storiesList.unlink(this.id);
            }
        }

        private void checkColumns() {
            if (this.storiesList == null || this.isArchive) {
                return;
            }
            if ((!SharedMediaLayout.this.storiesColumnsCountSet || (SharedMediaLayout.this.allowStoriesSingleColumn && this.storiesList.getCount() > 1)) && this.storiesList.getCount() > 0 && !SharedMediaLayout.this.isStoriesView()) {
                if (this.storiesList.getCount() < 5) {
                    SharedMediaLayout.this.mediaColumnsCount[1] = this.storiesList.getCount();
                    if (SharedMediaLayout.this.mediaPages != null && SharedMediaLayout.this.mediaPages[0] != null && SharedMediaLayout.this.mediaPages[1] != null && SharedMediaLayout.this.mediaPages[0].listView != null && SharedMediaLayout.this.mediaPages[1].listView != null) {
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                    }
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    sharedMediaLayout.allowStoriesSingleColumn = sharedMediaLayout.mediaColumnsCount[1] == 1;
                } else if (SharedMediaLayout.this.allowStoriesSingleColumn) {
                    SharedMediaLayout.this.allowStoriesSingleColumn = false;
                    SharedMediaLayout.this.mediaColumnsCount[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (SharedMediaLayout.this.mediaPages != null && SharedMediaLayout.this.mediaPages[0] != null && SharedMediaLayout.this.mediaPages[1] != null && SharedMediaLayout.this.mediaPages[0].listView != null && SharedMediaLayout.this.mediaPages[1].listView != null) {
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                    }
                }
                SharedMediaLayout.this.storiesColumnsCountSet = true;
            }
        }

        @Override
        public void notifyDataSetChanged() {
            if (this.storiesList != null && SharedMediaLayout.this.isBot()) {
                this.uploadingStories.clear();
                ArrayList uploadingStories = MessagesController.getInstance(this.storiesList.currentAccount).getStoriesController().getUploadingStories(SharedMediaLayout.this.dialog_id);
                if (uploadingStories != null) {
                    this.uploadingStories.addAll(uploadingStories);
                }
            }
            super.notifyDataSetChanged();
            StoriesAdapter storiesAdapter = this.supportingAdapter;
            if (storiesAdapter != null) {
                storiesAdapter.notifyDataSetChanged();
            }
            checkColumns();
        }

        public int columnsCount() {
            if (this == SharedMediaLayout.this.photoVideoAdapter) {
                return SharedMediaLayout.this.mediaColumnsCount[0];
            }
            return SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.animateToColumnsCount;
        }

        @Override
        public int getItemCount() {
            if (this.storiesList == null) {
                return 0;
            }
            return this.uploadingStories.size() + ((this.storiesList.isOnlyCache() && SharedMediaLayout.this.hasInternet()) ? 0 : this.storiesList.getCount());
        }

        @Override
        public int getTotalItemsCount() {
            return getItemCount();
        }

        @Override
        public int getPositionForIndex(int i) {
            return this.isArchive ? getTopOffset() + i : i;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.ViewHolder viewHolderOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            View view = viewHolderOnCreateViewHolder.itemView;
            if (view instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) view).isStory = true;
            }
            return viewHolderOnCreateViewHolder;
        }

        public void setInAlbumStoriesReorder(boolean z) {
            if (this.inAlbumStoriesReorder != z) {
                this.inAlbumStoriesReorder = z;
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (this.storiesList != null && viewHolder.getItemViewType() == 19) {
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    sharedPhotoVideoCell2.isStory = true;
                    if (i >= 0 && i < this.uploadingStories.size()) {
                        StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) this.uploadingStories.get(i);
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        if (uploadingStory.sharedMessageObject == null) {
                            TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                            int iM = SessionDetails$$ExternalSyntheticBackport0.m(uploadingStory.random_id);
                            tL_storyItem.messageId = iM;
                            tL_storyItem.id = iM;
                            tL_storyItem.attachPath = uploadingStory.firstFramePath;
                            MessageObject messageObject = new MessageObject(this.storiesList.currentAccount, tL_storyItem) {
                                @Override
                                public float getProgress() {
                                    return this.uploadingStory.progress;
                                }
                            };
                            uploadingStory.sharedMessageObject = messageObject;
                            messageObject.uploadingStory = uploadingStory;
                        }
                        sharedPhotoVideoCell2.setMessageObject(uploadingStory.sharedMessageObject, columnsCount());
                        sharedPhotoVideoCell2.isStory = true;
                        sharedPhotoVideoCell2.setReorder(false);
                        sharedPhotoVideoCell2.setChecked(false, false);
                        return;
                    }
                    int size = i - this.uploadingStories.size();
                    if (size < 0 || size >= this.storiesList.messageObjects.size()) {
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        sharedPhotoVideoCell2.setMessageObject(null, columnsCount());
                        sharedPhotoVideoCell2.isStory = true;
                        return;
                    }
                    MessageObject messageObject2 = (MessageObject) this.storiesList.messageObjects.get(size);
                    sharedPhotoVideoCell2.isStoryPinned = messageObject2 != null && this.storiesList.isPinned(messageObject2.getId());
                    sharedPhotoVideoCell2.setReorder(SharedMediaLayout.this.isBot() || sharedPhotoVideoCell2.isStoryPinned);
                    sharedPhotoVideoCell2.isSearchingHashtag = SharedMediaLayout.this.isSearchingStories();
                    sharedPhotoVideoCell2.setMessageObject(messageObject2, columnsCount());
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (!sharedMediaLayout.isActionModeShowed || messageObject2 == null) {
                        sharedPhotoVideoCell2.setChecked(false, false);
                    } else {
                        sharedPhotoVideoCell2.setChecked(sharedMediaLayout.selectedFiles[(messageObject2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, true);
                    }
                    sharedPhotoVideoCell2.setReordering(this.inAlbumStoriesReorder, false);
                }
            }
        }

        public void load(boolean z) {
            if (this.storiesList == null) {
                return;
            }
            int iColumnsCount = columnsCount();
            this.storiesList.load(z, Math.min(100, Math.max(1, iColumnsCount / 2) * iColumnsCount * iColumnsCount));
        }

        @Override
        public String getLetter(int i) {
            int topOffset;
            MessageObject messageObject;
            TL_stories.StoryItem storyItem;
            if (this.storiesList == null || (topOffset = i - getTopOffset()) < 0 || topOffset >= this.storiesList.messageObjects.size() || (messageObject = (MessageObject) this.storiesList.messageObjects.get(topOffset)) == null || (storyItem = messageObject.storyItem) == null) {
                return null;
            }
            return LocaleController.formatYearMont(storyItem.date, true);
        }

        @Override
        public void onFastScrollSingleTap() {
            SharedMediaLayout.this.showMediaCalendar(this.isArchive ? 9 : 8, true);
        }

        public boolean canReorder(int i) {
            StoriesController.StoriesList storiesList;
            if (this.isArchive || (storiesList = this.storiesList) == null) {
                return false;
            }
            if (storiesList instanceof StoriesController.BotPreviewsList) {
                TLRPC.User user = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id));
                return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
            }
            if (i < 0 || i >= storiesList.messageObjects.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(i);
            StoriesController.StoriesList storiesList2 = this.storiesList;
            if (storiesList2.albumId > 0) {
                return true;
            }
            return storiesList2.isPinned(messageObject.getId());
        }

        public boolean swapElements(int i, int i2) {
            StoriesController.StoriesList storiesList;
            ArrayList arrayList;
            if (this.isArchive || (storiesList = this.storiesList) == null || i < 0 || i >= storiesList.messageObjects.size() || i2 < 0 || i2 >= this.storiesList.messageObjects.size()) {
                return false;
            }
            if ((this.storiesList instanceof StoriesController.BotPreviewsList) || this.albumId > 0) {
                arrayList = new ArrayList();
                for (int i3 = 0; i3 < this.storiesList.messageObjects.size(); i3++) {
                    arrayList.add(Integer.valueOf(((MessageObject) this.storiesList.messageObjects.get(i3)).getId()));
                }
            } else {
                arrayList = new ArrayList(this.storiesList.pinnedIds);
            }
            if (!this.applyingReorder) {
                this.lastPinnedIds.clear();
                this.lastPinnedIds.addAll(arrayList);
                this.applyingReorder = true;
            }
            MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(i);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(i2, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            this.storiesList.updatePinnedOrder(arrayList, false);
            notifyItemMoved(i, i2);
            return true;
        }

        public void reorderDone() {
            StoriesController.StoriesList storiesList;
            ArrayList arrayList;
            if (this.isArchive || (storiesList = this.storiesList) == null || !this.applyingReorder) {
                return;
            }
            if ((storiesList instanceof StoriesController.BotPreviewsList) || this.albumId > 0) {
                arrayList = new ArrayList();
                for (int i = 0; i < this.storiesList.messageObjects.size(); i++) {
                    arrayList.add(Integer.valueOf(((MessageObject) this.storiesList.messageObjects.get(i)).getId()));
                }
            } else {
                arrayList = storiesList.pinnedIds;
            }
            boolean z = this.lastPinnedIds.size() != arrayList.size();
            if (!z) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.lastPinnedIds.size()) {
                        break;
                    }
                    if (this.lastPinnedIds.get(i2) != arrayList.get(i2)) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                this.storiesList.updatePinnedOrder(arrayList, true);
            }
            this.applyingReorder = false;
        }
    }

    class ChatUsersAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC.ChatFull chatInfo;
        private Context mContext;
        private ArrayList sortedUsers;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public ChatUsersAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            TLRPC.ChatFull chatFull = this.chatInfo;
            if (chatFull != null && chatFull.participants.participants.isEmpty()) {
                return 1;
            }
            TLRPC.ChatFull chatFull2 = this.chatInfo;
            if (chatFull2 != null) {
                return chatFull2.participants.participants.size();
            }
            return 0;
        }

        public void updateRank(long j, String str) {
            TLRPC.ChatFull chatFull = this.chatInfo;
            if (chatFull == null || chatFull.participants == null) {
                return;
            }
            for (int i = 0; i < this.chatInfo.participants.participants.size(); i++) {
                this.chatInfo.participants.participants.get(i).setRank(j, str);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 20) {
                View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 7, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                viewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(viewCreateEmptyStubView);
            }
            UserCell userCell = new UserCell(this.mContext, 9, 0, true, false, SharedMediaLayout.this.resourcesProvider);
            userCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(userCell);
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r20, int r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.ChatUsersAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        public void lambda$onBindViewHolder$0(TLRPC.User user, String str, boolean z, boolean z2, boolean z3, View view) {
            TagEditCell.showInfoSheet(SharedMediaLayout.this.getContext(), SharedMediaLayout.this.profileActivity.getCurrentAccount(), SharedMediaLayout.this.dialog_id, user, str, z, z2, z3, SharedMediaLayout.this.resourcesProvider);
        }

        @Override
        public int getItemViewType(int i) {
            TLRPC.ChatFull chatFull = this.chatInfo;
            return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
        }
    }

    class GroupUsersSearchAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC.Chat currentChat;
        private Context mContext;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private ArrayList searchResultNames = new ArrayList();
        private int totalCount = 0;
        int searchCount = 0;

        @Override
        public int getItemViewType(int i) {
            return 22;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public GroupUsersSearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
                @Override
                public boolean canApplySearchResults(int i) {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$canApplySearchResults(this, i);
                }

                @Override
                public LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
                }

                @Override
                public LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
                }

                @Override
                public final void onDataSetChanged(int i) {
                    this.f$0.lambda$new$0(i);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap map) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, map);
                }
            });
            this.currentChat = SharedMediaLayout.this.delegate.getCurrentChat();
        }

        public void lambda$new$0(int i) {
            notifyDataSetChanged();
            if (i == 1) {
                int i2 = this.searchCount - 1;
                this.searchCount = i2;
                if (i2 == 0) {
                    for (int i3 = 0; i3 < SharedMediaLayout.this.mediaPages.length; i3++) {
                        if (SharedMediaLayout.this.mediaPages[i3].selectedType == 7) {
                            if (getItemCount() == 0) {
                                SharedMediaLayout.this.mediaPages[i3].emptyView.showProgress(false, true);
                            } else {
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i3].listView, 0, null);
                            }
                        }
                    }
                }
            }
        }

        private boolean createMenuForParticipant(TLObject tLObject, boolean z, View view) {
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                tL_chatChannelParticipant.channelParticipant = channelParticipant;
                tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
                tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                tL_chatChannelParticipant.date = channelParticipant.date;
                tLObject = tL_chatChannelParticipant;
            }
            return SharedMediaLayout.this.delegate.onMemberClick((TLRPC.ChatParticipant) tLObject, true, z, view);
        }

        public void search(final String str, boolean z) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null);
            this.searchAdapterHelper.queryServerSearch(null, true, false, true, false, false, ChatObject.isChannel(this.currentChat) ? this.currentChat.id : 0L, false, 2, 0);
            notifyDataSetChanged();
            for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                if (SharedMediaLayout.this.mediaPages[i].selectedType == 7 && !TextUtils.isEmpty(str)) {
                    SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(true, z);
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$search$1(str);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        public void lambda$search$1(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processSearch$3(str);
                }
            });
        }

        public void lambda$processSearch$3(final String str) {
            final ArrayList arrayList = null;
            this.searchRunnable = null;
            if (!ChatObject.isChannel(this.currentChat) && SharedMediaLayout.this.info != null) {
                arrayList = new ArrayList(SharedMediaLayout.this.info.participants.participants);
            }
            this.searchCount = 2;
            if (arrayList != null) {
                Utilities.searchQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$processSearch$2(str, arrayList);
                    }
                });
            } else {
                this.searchCount = 1;
            }
            this.searchAdapterHelper.queryServerSearch(str, false, false, true, false, false, ChatObject.isChannel(this.currentChat) ? this.currentChat.id : 0L, false, 2, 1);
        }

        public void lambda$processSearch$2(java.lang.String r19, java.util.ArrayList r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.GroupUsersSearchAdapter.lambda$processSearch$2(java.lang.String, java.util.ArrayList):void");
        }

        private void updateSearchResults(final ArrayList arrayList, final ArrayList arrayList2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateSearchResults$4(arrayList, arrayList2);
                }
            });
        }

        public void lambda$updateSearchResults$4(ArrayList arrayList, ArrayList arrayList2) {
            if (SharedMediaLayout.this.searching) {
                this.searchResultNames = arrayList;
                this.searchCount--;
                if (!ChatObject.isChannel(this.currentChat)) {
                    ArrayList groupSearch = this.searchAdapterHelper.getGroupSearch();
                    groupSearch.clear();
                    groupSearch.addAll(arrayList2);
                }
                if (this.searchCount == 0) {
                    for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                        if (SharedMediaLayout.this.mediaPages[i].selectedType == 7) {
                            if (getItemCount() == 0) {
                                SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(false, true);
                            } else {
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i].listView, 0, null);
                            }
                        }
                    }
                }
                notifyDataSetChanged();
            }
        }

        @Override
        public int getItemCount() {
            return this.totalCount;
        }

        @Override
        public void notifyDataSetChanged() {
            int size = this.searchAdapterHelper.getGroupSearch().size();
            this.totalCount = size;
            if (size > 0 && SharedMediaLayout.this.searching && SharedMediaLayout.this.mediaPages[0].selectedType == 7 && SharedMediaLayout.this.mediaPages[0].listView.getAdapter() != this) {
                SharedMediaLayout.this.switchToCurrentSelectedMode(false);
            }
            super.notifyDataSetChanged();
        }

        public TLObject getItem(int i) {
            int size = this.searchAdapterHelper.getGroupSearch().size();
            if (i < 0 || i >= size) {
                return null;
            }
            return (TLObject) this.searchAdapterHelper.getGroupSearch().get(i);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 9, 5, true, SharedMediaLayout.this.resourcesProvider);
            manageChatUserCell.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
            manageChatUserCell.setDelegate(new ManageChatUserCell.ManageChatUserCellDelegate() {
                @Override
                public final boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell2, boolean z) {
                    return this.f$0.lambda$onCreateViewHolder$5(manageChatUserCell2, z);
                }
            });
            return new RecyclerListView.Holder(manageChatUserCell);
        }

        public boolean lambda$onCreateViewHolder$5(ManageChatUserCell manageChatUserCell, boolean z) {
            TLObject item = getItem(((Integer) manageChatUserCell.getTag()).intValue());
            if (item instanceof TLRPC.ChannelParticipant) {
                return createMenuForParticipant((TLRPC.ChannelParticipant) item, !z, manageChatUserCell);
            }
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.User user;
            SpannableStringBuilder spannableStringBuilder;
            TLObject item = getItem(i);
            if (item instanceof TLRPC.ChannelParticipant) {
                user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer)));
            } else if (!(item instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) item).user_id));
            }
            UserObject.getPublicUsername(user);
            this.searchAdapterHelper.getGroupSearch().size();
            String lastFoundChannel = this.searchAdapterHelper.getLastFoundChannel();
            if (lastFoundChannel != null) {
                String userName = UserObject.getUserName(user);
                spannableStringBuilder = new SpannableStringBuilder(userName);
                int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, lastFoundChannel);
                if (iIndexOfIgnoreCase != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4)), iIndexOfIgnoreCase, lastFoundChannel.length() + iIndexOfIgnoreCase, 33);
                }
            } else {
                spannableStringBuilder = null;
            }
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
                manageChatUserCell.setTag(Integer.valueOf(i));
                manageChatUserCell.setData(user, spannableStringBuilder, null, false);
            }
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.selectedMessagesCountTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText2));
        RLottieImageView iconView = this.deleteItem.getIconView();
        int i = ThemeDescription.FLAG_IMAGECOLOR;
        int i2 = Theme.key_actionBarActionModeDefaultIcon;
        arrayList.add(new ThemeDescription(iconView, i, null, null, null, null, i2));
        ActionBarMenuItem actionBarMenuItem = this.deleteItem;
        int i3 = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i4 = Theme.key_actionBarActionModeDefaultSelector;
        arrayList.add(new ThemeDescription(actionBarMenuItem, i3, null, null, null, null, i4));
        if (this.gotoItem != null) {
            arrayList.add(new ThemeDescription(this.gotoItem.getIconView(), ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.gotoItem, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i4));
        }
        if (this.forwardItem != null) {
            arrayList.add(new ThemeDescription(this.forwardItem.getIconView(), ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.forwardItem, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i4));
        }
        arrayList.add(new ThemeDescription(this.closeButton, ThemeDescription.FLAG_IMAGECOLOR, null, null, new Drawable[]{this.backDrawable}, null, i2));
        arrayList.add(new ThemeDescription(this.closeButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i4));
        LinearLayout linearLayout = this.actionModeLayout;
        int i5 = ThemeDescription.FLAG_BACKGROUND;
        int i6 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, i5, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.floatingDateView, 0, null, null, null, null, Theme.key_chat_mediaTimeBackground));
        arrayList.add(new ThemeDescription(this.floatingDateView, 0, null, null, null, null, Theme.key_chat_mediaTimeText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_profile_tabSelectedLine));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabSelectedText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabSelector));
        if (this.fragmentContextView != null) {
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_CHECKTAG | ThemeDescription.FLAG_BACKGROUND, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_inappPlayerBackground));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_inappPlayerPlayPause));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_inappPlayerTitle));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_FASTSCROLL, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_inappPlayerPerformer));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_inappPlayerClose));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_returnToCallBackground));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_returnToCallText));
        }
        for (final int i7 = 0; i7 < this.mediaPages.length; i7++) {
            ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
                @Override
                public final void didSetColor() {
                    this.f$0.lambda$getThemeDescriptions$68(i7);
                }

                @Override
                public void onAnimationProgress(float f) {
                    ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
                }
            };
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
            FlickerLoadingView flickerLoadingView = this.mediaPages[i7].progressView;
            int i8 = Theme.key_windowBackgroundWhite;
            arrayList.add(new ThemeDescription(flickerLoadingView, 0, null, null, null, null, i8));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_SECTIONS, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_SECTIONS, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
            int i9 = Theme.key_progressCircle;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{UserCell.class}, new String[]{"adminTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_profile_creatorIcon));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
            int i10 = Theme.key_windowBackgroundWhiteBlackText;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
            int i11 = Theme.key_windowBackgroundWhiteGrayText;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, i11));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
            Drawable[] drawableArr = Theme.avatarDrawables;
            int i12 = Theme.key_avatar_text;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{UserCell.class}, null, drawableArr, null, i12));
            TextPaint[] textPaintArr = Theme.dialogs_namePaint;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_name));
            TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_secretName));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{ProfileSearchCell.class}, null, Theme.avatarDrawables, null, i12));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
            int i13 = Theme.key_windowBackgroundWhiteGrayText2;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{EmptyStubView.class}, new String[]{"emptyTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"dateTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText3));
            int i14 = Theme.key_sharedMedia_startStopLoadIcon;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_PROGRESSBAR, new Class[]{SharedDocumentCell.class}, new String[]{"progressView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"statusImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
            int i15 = Theme.key_checkbox;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
            int i16 = Theme.key_checkboxCheck;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_files_folderIcon));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"extTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_files_iconText));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_titleTextPaint, null, null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_descriptionTextPaint, null, null, i13));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedLinkCell.class}, new String[]{"titleTextPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedLinkCell.class}, null, null, null, Theme.key_windowBackgroundWhiteLinkText));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedLinkCell.class}, Theme.linkSelectionPaint, null, null, Theme.key_windowBackgroundWhiteLinkSelection));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_sharedMedia_linkPlaceholderText));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_sharedMedia_linkPlaceholder));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_SECTIONS | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{SharedMediaSectionCell.class}, null, null, null, i8));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_SECTIONS, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
            int i17 = Theme.key_sharedMedia_photoPlaceholder;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedPhotoVideoCell.class}, new String[]{"backgroundPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i17));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedPhotoVideoCell.class}, null, null, themeDescriptionDelegate, i15));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedPhotoVideoCell.class}, null, null, themeDescriptionDelegate, i16));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{ContextLinkCell.class}, new String[]{"backgroundPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i17));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{ContextLinkCell.class}, null, null, themeDescriptionDelegate, i15));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{ContextLinkCell.class}, null, null, themeDescriptionDelegate, i16));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, null, null, new Drawable[]{this.pinnedHeaderShadowDrawable}, null, Theme.key_windowBackgroundGrayShadow));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].emptyView.title, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].emptyView.subtitle, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i11));
        }
        return arrayList;
    }

    public void lambda$getThemeDescriptions$68(int i) {
        if (this.mediaPages[i].listView != null) {
            int childCount = this.mediaPages[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mediaPages[i].listView.getChildAt(i2);
                if (childAt instanceof SharedPhotoVideoCell) {
                    ((SharedPhotoVideoCell) childAt).updateCheckboxColor();
                } else if (childAt instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) childAt).update(0);
                } else if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(0);
                }
            }
        }
    }

    public int getNextMediaColumnsCount(int i, int i2, boolean z) {
        int i3 = i2 + (!z ? 1 : -1);
        if (i3 > 6) {
            i3 = !z ? 9 : 6;
        }
        return Utilities.clamp(i3, 9, (this.allowStoriesSingleColumn && i == 1) ? 1 : 2);
    }

    public Boolean zoomIn() {
        return zoomIn(null, null);
    }

    public Boolean zoomIn(View view, View view2) {
        if (this.photoVideoChangeColumnsAnimation) {
            return null;
        }
        MediaPage mediaPage = this.mediaPages[0];
        if (mediaPage == null) {
            return null;
        }
        int i = mediaPage.selectedType;
        this.changeColumnsTab = i;
        boolean zIsAnyStoryPageType = isAnyStoryPageType(i);
        int nextMediaColumnsCount = getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0], true);
        if (view != null && nextMediaColumnsCount == getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0] != nextMediaColumnsCount) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!zIsAnyStoryPageType) {
                SharedConfig.setMediaColumnsCount(nextMediaColumnsCount);
            } else if (getStoriesCount(this.mediaPages[0].selectedType) >= 5 || isStoryAlbumPageType(this.mediaPages[0].selectedType)) {
                SharedConfig.setStoriesColumnsCount(nextMediaColumnsCount);
            }
            animateToMediaColumnsCount(nextMediaColumnsCount);
        }
        return Boolean.valueOf(nextMediaColumnsCount != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, true));
    }

    public Boolean zoomOut() {
        return zoomOut(null, null);
    }

    public Boolean zoomOut(View view, View view2) {
        if (this.photoVideoChangeColumnsAnimation) {
            return null;
        }
        MediaPage mediaPage = this.mediaPages[0];
        if (mediaPage == null) {
            return null;
        }
        if (this.allowStoriesSingleColumn && isAnyStoryPageType(mediaPage.selectedType)) {
            return null;
        }
        int i = this.mediaPages[0].selectedType;
        this.changeColumnsTab = i;
        boolean zIsAnyStoryPageType = isAnyStoryPageType(i);
        int nextMediaColumnsCount = getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0], false);
        if (view2 != null && nextMediaColumnsCount == getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0] != nextMediaColumnsCount) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!zIsAnyStoryPageType) {
                SharedConfig.setMediaColumnsCount(nextMediaColumnsCount);
            } else if (getStoriesCount(this.mediaPages[0].selectedType) >= 5 || isStoryAlbumPageType(this.mediaPages[0].selectedType)) {
                SharedConfig.setStoriesColumnsCount(nextMediaColumnsCount);
            }
            animateToMediaColumnsCount(nextMediaColumnsCount);
        }
        return Boolean.valueOf(nextMediaColumnsCount != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, false));
    }

    public boolean canZoomIn() {
        MediaPage mediaPage;
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null) {
            return false;
        }
        boolean zIsAnyStoryPageType = isAnyStoryPageType(mediaPage.selectedType);
        int i = this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0];
        return i != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, i, true);
    }

    public boolean canZoomOut() {
        MediaPage mediaPage;
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null) {
            return false;
        }
        if (this.allowStoriesSingleColumn && isAnyStoryPageType(mediaPage.selectedType)) {
            return false;
        }
        boolean zIsAnyStoryPageType = isAnyStoryPageType(this.mediaPages[0].selectedType);
        int i = this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0];
        return i != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, i, false);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        if (view == this.fragmentContextView && this.topPanelLayout == null) {
            canvas.save();
            float top = this.mediaPages[0].getTop();
            if (this.storiesContainer != null && ((i = this.mediaPages[0].selectedType) == 8 || isStoryAlbumPageType(i))) {
                top -= this.storiesContainer.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public class ScrollSlidingTextTabStripInner extends ScrollSlidingTextTabStrip {
        public int backgroundColor;
        protected Paint backgroundPaint;
        private Rect blurBounds;

        protected void drawBackground(Canvas canvas) {
        }

        public ScrollSlidingTextTabStripInner(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.backgroundColor = 0;
            this.blurBounds = new Rect();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (this.backgroundColor != 0) {
                if (this.backgroundPaint == null) {
                    this.backgroundPaint = new Paint();
                }
                this.backgroundPaint.setColor(this.backgroundColor);
                this.blurBounds.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                canvas.translate(getScrollX(), 0.0f);
                canvas.clipPath(this.clipPath);
                if (SharedConfig.chatBlurEnabled()) {
                    SharedMediaLayout.this.drawBackgroundWithBlur(canvas, getY(), this.blurBounds, this.backgroundPaint);
                } else {
                    canvas.drawPaint(this.backgroundPaint);
                }
                canvas.translate(-getScrollX(), 0.0f);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public void setBackgroundColor(int i) {
            this.backgroundColor = i;
            invalidate();
        }
    }

    public int getThemedColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }

    private boolean isTab(int i, int i2, boolean z) {
        return (z && i2 == 8 && isStoryAlbumPageType(i)) || i == i2;
    }

    public float getBottomButtonStoriesVisibility() {
        MediaPage mediaPage;
        StoriesController.StoriesList storiesList;
        StoriesController.StoriesList storiesList2;
        MediaPage[] mediaPageArr = this.mediaPages;
        float f = 1.0f;
        if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null || mediaPageArr[1] == null || mediaPage.emptyView == null || this.mediaPages[1].emptyView == null) {
            return 1.0f;
        }
        MediaPage[] mediaPageArr2 = this.mediaPages;
        int i = mediaPageArr2[0].selectedType;
        int i2 = mediaPageArr2[1].selectedType;
        boolean z = isStoryAlbumPageType(i) || i == 8;
        boolean z2 = isStoryAlbumPageType(i2) || i2 == 8;
        if (!z && !z2) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - this.mediaPages[0].emptyView.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - this.mediaPages[1].emptyView.getVisibilityFactor();
        StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(this.mediaPages[0].selectedType);
        if (i == 8 || (storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null && (storiesList2 = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList) != null && storiesList2.getCount() > 0)) {
            visibilityFactor = 1.0f;
        }
        StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType2 = storyAlbums_getStoriesAdapterByTabType(i2);
        if (i2 != 8 && (storiesAdapterStoryAlbums_getStoriesAdapterByTabType2 == null || (storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType2.storiesList) == null || storiesList.getCount() <= 0)) {
            f = visibilityFactor2;
        }
        if (!z) {
            visibilityFactor = f;
        }
        if (!z2) {
            f = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f, Math.abs(this.mediaPages[0].getTranslationX() / this.mediaPages[0].getMeasuredWidth()));
    }

    public float getTabTranslationX(int i, boolean z) {
        float width = getWidth();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                break;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null && isTab(mediaPage.selectedType, i, z)) {
                i3++;
                width = this.mediaPages[i2].getTranslationX();
            }
            i2++;
        }
        if (i3 == 2) {
            return 0.0f;
        }
        return width;
    }

    public float getTabVisibility(int i, boolean z) {
        float fAbs = 0.0f;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return fAbs;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null && isTab(mediaPage.selectedType, i, z)) {
                fAbs += 1.0f - Math.abs(this.mediaPages[i2].getTranslationX() / getWidth());
            }
            i2++;
        }
    }

    @Deprecated
    public float getTabProgress() {
        float fAbs = 0.0f;
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return fAbs;
            }
            MediaPage mediaPage = mediaPageArr[i];
            if (mediaPage != null) {
                fAbs += mediaPage.selectedType * (1.0f - Math.abs(mediaPage.getTranslationX() / getWidth()));
            }
            i++;
        }
    }

    public void checkStoriesTabsPosition() {
        char c;
        float fAbs;
        float y;
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[0];
        if (mediaPage == null || mediaPageArr[1] == null) {
            return;
        }
        float f = 0.0f;
        if (this.storiesContainer != null) {
            char c2 = (!isAnyStoryPageType(mediaPage.selectedType) || this.mediaPages[0].selectedType == 9) ? (char) 0 : (char) 1;
            if (this.mediaPages[1].getVisibility() == 0) {
                c = (!isAnyStoryPageType(this.mediaPages[1].selectedType) || this.mediaPages[1].selectedType == 9) ? (char) 0 : (char) 1;
            } else {
                c = c2;
            }
            if (c2 == c) {
                fAbs = c2 != 0 ? 1.0f : 0.0f;
                this.storiesContainer.setTranslationX(c2 != 0 ? 0.0f : this.mediaPages[0].getMeasuredWidth());
            } else {
                this.storiesContainer.setTranslationX(this.mediaPages[c2 ^ 1].getTranslationX());
                fAbs = 1.0f - (Math.abs(this.storiesContainer.getTranslationX()) / this.storiesContainer.getMeasuredWidth());
            }
            int i = 0;
            float fClamp01 = 0.0f;
            while (true) {
                MediaPage[] mediaPageArr2 = this.mediaPages;
                if (i >= mediaPageArr2.length) {
                    break;
                }
                if (mediaPageArr2[i].getVisibility() == 0) {
                    InternalListView internalListView = this.mediaPages[i].listView;
                    View childAt = internalListView.getChildCount() == 0 ? null : internalListView.getChildAt(0);
                    if ((childAt == null ? -1 : internalListView.getChildAdapterPosition(childAt)) == 0) {
                        y = childAt.getY() - internalListView.getPaddingTop();
                    } else {
                        y = internalListView.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f);
                    }
                    fClamp01 += y * Utilities.clamp01(1.0f - (this.mediaPages[i].getTranslationX() / this.mediaPages[i].getMeasuredWidth()));
                }
                i++;
            }
            float fClamp012 = Utilities.clamp01(1.0f - ((-fClamp01) / AndroidUtilities.dpf2(48.0f)));
            float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fClamp012);
            this.storiesContainer.setAlpha(fClamp012);
            this.storiesContainer.setScaleX(fLerp);
            this.storiesContainer.setScaleY(fLerp);
            this.storiesContainer.setTranslationY(this.topPadding + fClamp01);
            f = fAbs;
        }
        checkUi_topPanelLayoutY();
        if (this.subTabsVisibilityFactor != f) {
            this.subTabsVisibilityFactor = f;
            invalidateBlur();
            invalidate();
        }
    }

    protected void onTabProgress(float f) {
        onBottomButtonVisibilityChange();
    }

    public static class InternalListView extends BlurredRecyclerView implements StoriesListPlaceProvider.ClippedView {
        public int hintPaddingBottom;
        public int hintPaddingTop;

        public InternalListView(Context context) {
            super(context);
        }

        @Override
        public void updateClip(int[] iArr) {
            iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.hintPaddingTop;
            iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.hintPaddingBottom;
        }
    }

    public void updateOptionsSearch() {
        updateOptionsSearch(false);
    }

    public void updateOptionsSearch(boolean z) {
        ProfileGiftsContainer profileGiftsContainer;
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs;
        RLottieImageView rLottieImageView = this.optionsSearchImageView;
        if (rLottieImageView == null) {
            return;
        }
        float fClamp = 0.0f;
        if (!this.searching && (((profileGiftsContainer = this.giftsContainer) == null || !profileGiftsContainer.isReordering()) && ((profileStoriesCollectionTabs = this.storiesContainer) == null || !profileStoriesCollectionTabs.isReordering()))) {
            fClamp = Utilities.clamp(this.searchAlpha + this.optionsAlpha, 1.0f, 0.0f);
        }
        rLottieImageView.setAlpha(fClamp);
        if (z) {
            animateSearchToOptions(getPhotoVideoOptionsAlpha(1.0f) > 0.5f, true);
        } else if (this.searchItemState == 2) {
            animateSearchToOptions(this.optionsAlpha > 0.1f, true);
        } else {
            animateSearchToOptions(this.searchAlpha < 0.1f, true);
        }
    }

    public void animateSearchToOptions(boolean z, boolean z2) {
        RLottieImageView rLottieImageView = this.optionsSearchImageView;
        if (rLottieImageView == null || this.animatingToOptions == z) {
            return;
        }
        this.animatingToOptions = z;
        if (!z && rLottieImageView.getAnimatedDrawable().getCurrentFrame() < 20) {
            this.optionsSearchImageView.getAnimatedDrawable().setCustomEndFrame(0);
        } else {
            this.optionsSearchImageView.getAnimatedDrawable().setCustomEndFrame(this.animatingToOptions ? 50 : 100);
        }
        if (z2) {
            this.optionsSearchImageView.getAnimatedDrawable().start();
        } else {
            this.optionsSearchImageView.getAnimatedDrawable().setCurrentFrame(this.optionsSearchImageView.getAnimatedDrawable().getCustomEndFrame());
        }
    }

    private CharSequence addPostText() {
        if (this.addPostButton == null) {
            this.addPostButton = new SpannableStringBuilder();
            if (isBot()) {
                this.addPostButton.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.addPostButton.append((CharSequence) "c");
                this.addPostButton.setSpan(new ColoredImageSpan(R.drawable.filled_premium_camera), 0, 1, 33);
                this.addPostButton.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.addPostButton;
    }

    public boolean canEditStories() {
        BaseFragment baseFragment;
        if (!isBot()) {
            return isStoriesView() || ((baseFragment = this.profileActivity) != null && baseFragment.getMessagesController().getStoriesController().canEditStories(this.dialog_id));
        }
        TLRPC.User user = MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(this.dialog_id));
        return user != null && user.bot && user.bot_can_edit;
    }

    public boolean isSearchingStories() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public void setPagesPaddingBottom(int i) {
        if (this.pagesPaddingBottom != i) {
            this.pagesPaddingBottom = i;
            MediaPage[] mediaPageArr = this.mediaPages;
            if (mediaPageArr != null) {
                for (MediaPage mediaPage : mediaPageArr) {
                    if (mediaPage != null) {
                        InternalListView internalListView = mediaPage.listView;
                        int paddingLeft = mediaPage.listView.getPaddingLeft();
                        int i2 = mediaPage.listView.topPadding;
                        int paddingRight = mediaPage.listView.getPaddingRight();
                        InternalListView internalListView2 = mediaPage.listView;
                        int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
                        internalListView2.hintPaddingBottom = pagePaddingBottom;
                        internalListView.setPadding(paddingLeft, i2, paddingRight, pagePaddingBottom);
                    }
                }
            }
        }
    }

    public int getPagePaddingBottom(boolean z) {
        return this.pagesPaddingBottom + (z ? AndroidUtilities.dp(52.0f) : 0);
    }

    public int getPagePaddingTop(int i) {
        return AndroidUtilities.dp(54.0f) + this.topLayoutPadding + ((int) ((this.storiesContainer == null || !(isStoryAlbumPageType(i) || i == 8)) ? 0.0f : this.storiesContainer.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public static class SharedMediaListView extends InternalListView {
        private final ArrayList animationSupportingSortedCells;
        private int animationSupportingSortedCellsOffset;
        protected StaticLayout archivedHintLayout;
        protected float archivedHintLayoutLeft;
        protected float archivedHintLayoutWidth;
        protected TextPaint archivedHintPaint;
        final ArrayList drawingViews;
        final ArrayList drawingViews2;
        final ArrayList drawingViews3;
        final HashSet excludeDrawViews;
        UserListPoller poller;

        public void checkHighlightCell(SharedPhotoVideoCell2 sharedPhotoVideoCell2) {
        }

        public int getAnimateToColumnsCount() {
            return 3;
        }

        public float getChangeColumnsProgress() {
            return 0.0f;
        }

        public int getColumnsCount() {
            return 3;
        }

        public SparseArray<Float> getMessageAlphaEnter() {
            return null;
        }

        public RecyclerListView.FastScrollAdapter getMovingAdapter() {
            return null;
        }

        public int getPinchCenterPosition() {
            return 0;
        }

        public RecyclerListView.FastScrollAdapter getSupportingAdapter() {
            return null;
        }

        public InternalListView getSupportingListView() {
            return null;
        }

        public abstract boolean isChangeColumnsAnimation();

        public abstract boolean isStories();

        public boolean isThisListView() {
            return true;
        }

        public SharedMediaListView(Context context) {
            super(context);
            this.excludeDrawViews = new HashSet();
            this.drawingViews = new ArrayList();
            this.drawingViews2 = new ArrayList();
            this.drawingViews3 = new ArrayList();
            this.animationSupportingSortedCells = new ArrayList();
        }

        @Override
        protected void dispatchDraw(android.graphics.Canvas r32) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView.dispatchDraw(android.graphics.Canvas):void");
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            RecyclerListView.FastScrollAdapter movingAdapter = getMovingAdapter();
            if (isThisListView() && getAdapter() == movingAdapter && isChangeColumnsAnimation() && (view instanceof SharedPhotoVideoCell2)) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public void openRenameStoriesAlbumAlert(BaseFragment baseFragment, final long j, final int i) {
        AlertsCreator.createStoriesAlbumEnterNameForRename(baseFragment.getContext(), baseFragment, getStoriesController().getAlbumName(j, i), baseFragment.getResourceProvider(), new MessagesStorage.StringCallback() {
            @Override
            public final void run(String str) {
                this.f$0.lambda$openRenameStoriesAlbumAlert$70(j, i, str);
            }
        });
    }

    public void lambda$openRenameStoriesAlbumAlert$70(long j, int i, String str) {
        getStoriesController().renameAlbum(j, i, str);
    }

    public void openDeleteStoriesAlbumAlert(BaseFragment baseFragment, final long j, final int i) {
        String albumName = getStoriesController().getAlbumName(j, i);
        int i2 = R.string.Delete;
        AlertsCreator.showSimpleConfirmAlert(baseFragment, LocaleController.getString(i2), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, albumName)), LocaleController.getString(i2), true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openDeleteStoriesAlbumAlert$71(j, i);
            }
        });
    }

    public void lambda$openDeleteStoriesAlbumAlert$71(long j, int i) {
        getStoriesController().removeAlbum(j, i);
    }

    public void openAddStoriesToAlbumSheet(BaseFragment baseFragment, final long j, final int i) {
        new SelectStoriesBottomSheet(baseFragment, j, this.mediaColumnsCount[1], new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$openAddStoriesToAlbumSheet$72(j, i, (ArrayList) obj);
            }
        }).show();
    }

    public void lambda$openAddStoriesToAlbumSheet$72(long j, int i, ArrayList arrayList) {
        getStoriesController().addStoriesToAlbum(j, i, arrayList);
    }

    public ItemOptions buildItemOptionsForStoryAlbumActionBar(final BaseFragment baseFragment, View view, final long j, final int i) {
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(baseFragment, view);
        itemOptionsMakeOptions.add(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buildItemOptionsForStoryAlbumActionBar$73(baseFragment, j, i, itemOptionsMakeOptions);
            }
        });
        addStoryAlbumShareItemOptions(itemOptionsMakeOptions, baseFragment, j, i);
        itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buildItemOptionsForStoryAlbumActionBar$74(i, itemOptionsMakeOptions);
            }
        });
        itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$buildItemOptionsForStoryAlbumActionBar$75(baseFragment, j, i, itemOptionsMakeOptions);
            }
        });
        itemOptionsMakeOptions.addGap();
        addZoomInZoomOutItemOptions(itemOptionsMakeOptions);
        itemOptionsMakeOptions.setDismissWithButtons(false);
        return itemOptionsMakeOptions;
    }

    public void lambda$buildItemOptionsForStoryAlbumActionBar$73(BaseFragment baseFragment, long j, int i, ItemOptions itemOptions) {
        openAddStoriesToAlbumSheet(baseFragment, j, i);
        itemOptions.dismiss();
    }

    public void lambda$buildItemOptionsForStoryAlbumActionBar$74(int i, ItemOptions itemOptions) {
        lambda$onItemLongClick$58(i);
        itemOptions.dismiss();
    }

    public void lambda$buildItemOptionsForStoryAlbumActionBar$75(BaseFragment baseFragment, long j, int i, ItemOptions itemOptions) {
        openDeleteStoriesAlbumAlert(baseFragment, j, i);
        itemOptions.dismiss();
    }

    public void addStoryAlbumShareItemOptions(ItemOptions itemOptions, final BaseFragment baseFragment, long j, int i) {
        String publicUsername;
        if (j > 0) {
            publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(baseFragment.getCurrentAccount()).getUser(Long.valueOf(j)));
        } else {
            publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j)));
        }
        if (publicUsername == null) {
            return;
        }
        final String str = "https://" + MessagesController.getInstance(baseFragment.getCurrentAccount()).linkPrefix + "/" + publicUsername + "/a/" + i;
        itemOptions.add(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$addStoryAlbumShareItemOptions$76(str, baseFragment);
            }
        });
    }

    class AnonymousClass50 extends ShareAlert {
        final BaseFragment val$fragment;

        AnonymousClass50(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment) {
            super(context, arrayList, str, z, str2, z2, resourcesProvider);
            this.val$fragment = baseFragment;
        }

        @Override
        protected void onSend(final LongSparseArray longSparseArray, final int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            final BaseFragment baseFragment = this.val$fragment;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SharedMediaLayout.AnonymousClass50.lambda$onSend$0(baseFragment, longSparseArray, i);
                }
            }, 100L);
        }

        public static void lambda$onSend$0(BaseFragment baseFragment, LongSparseArray longSparseArray, int i) {
            UndoView undoView;
            if (baseFragment instanceof ChatActivity) {
                undoView = ((ChatActivity) baseFragment).getUndoView();
            } else {
                undoView = baseFragment instanceof ProfileActivity ? ((ProfileActivity) baseFragment).getUndoView() : null;
            }
            UndoView undoView2 = undoView;
            if (undoView2 != null) {
                if (longSparseArray.size() == 1) {
                    undoView2.showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 53, Integer.valueOf(i));
                } else {
                    undoView2.showWithAction(0L, 53, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                }
            }
        }
    }

    public void lambda$addStoryAlbumShareItemOptions$76(String str, BaseFragment baseFragment) {
        AnonymousClass50 anonymousClass50 = new AnonymousClass50(getContext(), null, str, false, str, false, this.resourcesProvider, baseFragment);
        if (baseFragment != null) {
            baseFragment.showDialog(anonymousClass50);
        } else {
            anonymousClass50.show();
        }
    }

    public void addZoomInZoomOutItemOptions(ItemOptions itemOptions) {
        int itemsCount = itemOptions.getItemsCount();
        itemOptions.add(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$addZoomInZoomOutItemOptions$77(viewArr);
            }
        });
        itemOptions.add(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$addZoomInZoomOutItemOptions$78(viewArr);
            }
        });
        final View[] viewArr = {itemOptions.getItemAt(itemsCount), itemOptions.getItemAt(itemsCount + 1)};
        if (!canZoomIn()) {
            viewArr[0].setEnabled(false);
            viewArr[0].setAlpha(0.5f);
        }
        if (canZoomOut()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
    }

    public void lambda$addZoomInZoomOutItemOptions$77(View[] viewArr) {
        zoomIn(viewArr[0], viewArr[1]);
    }

    public void lambda$addZoomInZoomOutItemOptions$78(View[] viewArr) {
        zoomOut(viewArr[0], viewArr[1]);
    }

    public void onStoryAlbumCreate(final StoriesController.StoryAlbum storyAlbum) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onStoryAlbumCreate$79(storyAlbum);
            }
        }, 100L);
    }

    public void lambda$onStoryAlbumCreate$79(StoriesController.StoryAlbum storyAlbum) {
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs != null) {
            profileStoriesCollectionTabs.lambda$setInitialTabId$2(storyAlbum.album_id);
        }
    }

    public StoryAlbumData storyAlbums_getByAlbumId(int i) {
        StoryAlbumData storyAlbumData = (StoryAlbumData) this.storyAlbumsById.get(Integer.valueOf(i));
        if (storyAlbumData != null) {
            return storyAlbumData;
        }
        StoryAlbumData storyAlbumData2 = new StoryAlbumData(getContext(), i);
        this.storyAlbumsById.put(Integer.valueOf(i), storyAlbumData2);
        this.storyAlbumsByTabType.put(Integer.valueOf(storyAlbumData2.tabType), Integer.valueOf(storyAlbumData2.albumId));
        return storyAlbumData2;
    }

    public int storyAlbums_getAlbumIdByTabType(int i) {
        StoryAlbumData storyAlbumDataStoryAlbums_getByTabType = storyAlbums_getByTabType(i);
        if (storyAlbumDataStoryAlbums_getByTabType == null) {
            return -1;
        }
        return storyAlbumDataStoryAlbums_getByTabType.albumId;
    }

    public StoryAlbumData storyAlbums_getByTabType(int i) {
        Integer num = (Integer) this.storyAlbumsByTabType.get(Integer.valueOf(i));
        if (num == null) {
            return null;
        }
        return (StoryAlbumData) this.storyAlbumsById.get(num);
    }

    public StoriesAdapter storyAlbums_getStoriesAdapterByTabType(int i) {
        StoryAlbumData storyAlbumDataStoryAlbums_getByTabType;
        if (i == 8) {
            return this.storiesAdapter;
        }
        if (i == 9) {
            return this.archivedStoriesAdapter;
        }
        if (!isStoryAlbumPageType(i) || (storyAlbumDataStoryAlbums_getByTabType = storyAlbums_getByTabType(i)) == null) {
            return null;
        }
        return storyAlbumDataStoryAlbums_getByTabType.adapter;
    }

    public StoriesAdapter storyAlbums_getStoriesSupportingAdapterByTabType(int i) {
        StoryAlbumData storyAlbumDataStoryAlbums_getByTabType;
        if (i == 8) {
            return this.animationSupportingStoriesAdapter;
        }
        if (i == 9) {
            return this.animationSupportingArchivedStoriesAdapter;
        }
        if (!isStoryAlbumPageType(i) || (storyAlbumDataStoryAlbums_getByTabType = storyAlbums_getByTabType(i)) == null) {
            return null;
        }
        return storyAlbumDataStoryAlbums_getByTabType.adapterSupport;
    }

    private int storyAlbums_getTabTypeByStoriesList(StoriesController.StoriesList storiesList) {
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null && storiesList == storiesAdapter.storiesList) {
            return 8;
        }
        StoriesAdapter storiesAdapter2 = this.archivedStoriesAdapter;
        if (storiesAdapter2 != null && storiesList == storiesAdapter2.storiesList) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            if (storyAlbumData.adapter.storiesList == storiesList) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    public int storyAlbums_getTabTypeByStoriesAdapter(RecyclerView.Adapter adapter) {
        if (adapter == this.storiesAdapter) {
            return 8;
        }
        if (adapter == this.archivedStoriesAdapter) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            if (storyAlbumData.adapter == adapter) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    public int storyAlbums_getTabTypeByStoriesSupportingAdapter(RecyclerView.Adapter adapter) {
        if (adapter == this.animationSupportingStoriesAdapter) {
            return 8;
        }
        if (adapter == this.animationSupportingArchivedStoriesAdapter) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            if (storyAlbumData.adapterSupport == adapter) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    private class StoryAlbumData {
        public final StoriesAdapter adapter;
        public final StoriesAdapter adapterSupport;
        public final int albumId;
        public final int tabType;

        private StoryAlbumData(Context context, int i) {
            this.albumId = i;
            this.tabType = SharedMediaLayout.getStoryAlbumType(SharedMediaLayout.access$14608(SharedMediaLayout.this));
            this.adapter = new StoriesAdapter(context, i, false) {
                {
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                }

                @Override
                public void notifyDataSetChanged() {
                    super.notifyDataSetChanged();
                    StoryAlbumData storyAlbumData = StoryAlbumData.this;
                    MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(storyAlbumData.tabType);
                    if (mediaPage != null && mediaPage.animationSupportingListView.getVisibility() == 0) {
                        StoryAlbumData.this.adapterSupport.notifyDataSetChanged();
                    }
                    if (mediaPage != null) {
                        StickerEmptyView stickerEmptyView = mediaPage.emptyView;
                        StoriesController.StoriesList storiesList = this.storiesList;
                        stickerEmptyView.showProgress(storiesList != null && (storiesList.isLoading() || (SharedMediaLayout.this.hasInternet() && this.storiesList.getCount() > 0)));
                    }
                }
            };
            this.adapterSupport = SharedMediaLayout.this.new StoriesAdapter(context, i, false);
        }
    }

    public StoriesController getStoriesController() {
        return MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getStoriesController();
    }

    public static TLRPC.ProfileTab getTab(int i, boolean z) {
        if (i != 8 && i != 14 && !z) {
            return null;
        }
        if (i == 8) {
            return new TLRPC.TL_profileTabPosts();
        }
        if (i == 14) {
            return new TLRPC.TL_profileTabGifts();
        }
        if (i == 0) {
            return new TLRPC.TL_profileTabMedia();
        }
        if (i == 1) {
            return new TLRPC.TL_profileTabFiles();
        }
        if (i == 2) {
            return new TLRPC.TL_profileTabVoice();
        }
        if (i == 3) {
            return new TLRPC.TL_profileTabLinks();
        }
        if (i == 4) {
            return new TLRPC.TL_profileTabMusic();
        }
        if (i != 5) {
            return null;
        }
        return new TLRPC.TL_profileTabGifs();
    }

    public static String getTabName(int i) {
        if (i == 8) {
            return LocaleController.getString(R.string.ProfileStories);
        }
        if (i == 14) {
            return LocaleController.getString(R.string.ProfileGifts);
        }
        if (i == 0) {
            return LocaleController.getString(R.string.SharedMediaTabFull2);
        }
        if (i == 1) {
            return LocaleController.getString(R.string.SharedFilesTab2);
        }
        if (i == 2) {
            return LocaleController.getString(R.string.SharedVoiceTab2);
        }
        if (i == 3) {
            return LocaleController.getString(R.string.SharedLinksTab2);
        }
        if (i == 4) {
            return LocaleController.getString(R.string.SharedMusicTab2);
        }
        if (i != 5) {
            return null;
        }
        return LocaleController.getString(R.string.SharedGIFsTab2);
    }

    public static int getTabId(TLRPC.ProfileTab profileTab) {
        if (profileTab instanceof TLRPC.TL_profileTabPosts) {
            return 8;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMedia) {
            return 0;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifts) {
            return 14;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMusic) {
            return 4;
        }
        if (profileTab instanceof TLRPC.TL_profileTabVoice) {
            return 2;
        }
        if (profileTab instanceof TLRPC.TL_profileTabLinks) {
            return 3;
        }
        if (profileTab instanceof TLRPC.TL_profileTabFiles) {
            return 1;
        }
        return profileTab instanceof TLRPC.TL_profileTabGifs ? 5 : -1;
    }

    public void sendTabsOrder() {
        if (this.profileActivity == null || this.scrollSlidingTextTabStrip == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = this.scrollSlidingTextTabStrip.getTabIds().iterator();
        while (it.hasNext()) {
            TLRPC.ProfileTab tab = getTab(it.next().intValue(), this.info instanceof TLRPC.TL_channelFull);
            if (tab != null) {
                arrayList.add(tab);
            }
        }
    }

    public void initBlurCapture(ViewGroup viewGroup) {
        for (MediaPage mediaPage : this.mediaPages) {
            InternalListView internalListView = mediaPage.listView;
            final InternalListView internalListView2 = mediaPage.listView;
            Objects.requireNonNull(internalListView2);
            mediaPage.iBlur3Capture = new ViewGroupPartRenderer(internalListView, viewGroup, new ViewGroupPartRenderer.DrawChildMethod() {
                @Override
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    return internalListView2.drawChild(canvas, view, j);
                }
            });
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null) {
            profileGiftsContainer.initBlurCapture(viewGroup);
        }
    }
}
