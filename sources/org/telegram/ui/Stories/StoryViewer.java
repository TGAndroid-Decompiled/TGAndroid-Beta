package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.LivePlayerView;

public class StoryViewer implements NotificationCenter.NotificationCenterDelegate, BaseFragment.AttachedSheet, IPipSourceDelegate {
    public static boolean animationInProgress;
    private static boolean isInSilentMode;
    private static TL_stories.StoryItem lastStoryItem;
    private static boolean runOpenAnimationAfterLayout;
    boolean allowIntercept;
    boolean allowSelfStoriesView;
    boolean allowSwipeToDissmiss;
    boolean allowSwipeToReply;
    private boolean animateAvatar;
    StoriesListPlaceProvider.AvatarOverlaysView animateFromCell;
    AspectRatioFrameLayout aspectRatioFrameLayout;
    float clipBottom;
    float clipTop;
    HwFrameLayout containerView;
    public int currentAccount;
    Dialog currentDialog;
    PeerStoriesView.VideoPlayerSharedScope currentPlayerScope;
    BaseFragment.AttachedSheet currentSheet;
    public int dayStoryId;
    private Runnable delayedTapRunnable;
    private boolean flingCalled;
    BaseFragment fragment;
    public boolean fromBottomSheet;
    float fromDismissOffset;
    float fromHeight;
    private int[] fromRadius;
    float fromWidth;
    float fromX;
    float fromXCell;
    float fromY;
    float fromYCell;
    private boolean fullyVisible;
    GestureDetector gestureDetector;
    private float hideEnterViewProgress;
    boolean inSeekingMode;
    boolean inSwipeToDissmissMode;
    private boolean invalidateOutRect;
    private boolean isBulletinVisible;
    private boolean isCaption;
    private boolean isCaptionPartVisible;
    private boolean isHintVisible;
    private boolean isInPinchToZoom;
    private boolean isInTextSelectionMode;
    private boolean isInTouchMode;
    private boolean isLikesReactions;
    public boolean isLongpressed;
    private boolean isOverlayVisible;
    private boolean isPopupVisible;
    private boolean isRecording;
    boolean isShowing;
    boolean isSingleStory;
    private boolean isSwiping;
    private boolean isWaiting;
    boolean keyboardVisible;
    long lastDialogId;
    int lastPosition;
    private float lastStoryContainerHeight;
    Uri lastUri;
    LivePlayer livePlayer;
    public LivePlayerView liveView;
    private int messageId;
    private Runnable onCloseListener;
    ValueAnimator openCloseAnimator;
    boolean openedFromLightNavigationBar;
    private boolean opening;
    TL_stories.PeerStories overrideUserStories;
    LaunchActivity parentActivity;
    private boolean paused;
    public LivePlayerView pipLiveView;
    public PlaceProvider placeProvider;
    VideoPlayerHolder playerHolder;
    private long playerSavedPosition;
    float progressToDismiss;
    float progressToOpen;
    private int realKeyboardHeight;
    boolean reversed;
    float selfStoriesViewsOffset;
    SelfStoryViewsView selfStoryViewsView;
    private boolean showViewsAfterOpening;
    TL_stories.StoryItem singleStory;
    boolean singleStoryDeleted;
    private StoriesIntro storiesIntro;
    StoriesController.StoriesList storiesList;
    public StoriesViewPager storiesViewPager;
    private SurfaceView surfaceView;
    float swipeToDismissHorizontalDirection;
    float swipeToDismissHorizontalOffset;
    float swipeToDismissOffset;
    ValueAnimator swipeToDissmissBackAnimator;
    ValueAnimator swipeToReplyBackAnimator;
    float swipeToReplyOffset;
    float swipeToReplyProgress;
    boolean swipeToReplyWaitingKeyboard;
    ValueAnimator swipeToViewsAnimator;
    private TextureView textureView;
    public boolean unreadStateChanged;
    boolean verticalScrollDetected;
    private StoriesVolumeControl volumeControl;
    WindowManager.LayoutParams windowLayoutParams;
    WindowManager windowManager;
    public SizeNotifierFrameLayout windowView;
    public static ArrayList globalInstances = new ArrayList();
    public static float currentSpeed = 1.0f;
    private static boolean checkSilentMode = true;
    private static final LongSparseArray replyDrafts = new LongSparseArray();
    public boolean USE_SURFACE_VIEW = SharedConfig.useSurfaceInStories;
    public boolean ATTACH_TO_FRAGMENT = true;
    public boolean ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE = false;
    public boolean foundViewToClose = false;
    public boolean allowScreenshots = true;
    Theme.ResourcesProvider resourcesProvider = new DarkThemeResourceProvider();
    RectF avatarRectTmp = new RectF();
    float[] pointPosition = new float[2];
    public final TransitionViewHolder transitionViewHolder = new TransitionViewHolder();
    private boolean allowTouchesByViewpager = false;
    ArrayList doOnAnimationReadyRunnables = new ArrayList();
    private boolean isClosed = true;
    AnimationNotificationsLocker locker = new AnimationNotificationsLocker();
    ArrayList preparedPlayers = new ArrayList();
    public boolean isTranslating = false;
    Runnable longPressRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.setLongPressed(true);
        }
    };
    public LongSparseIntArray savedPositions = new LongSparseIntArray();
    Paint inputBackgroundPaint = new Paint(1);

    public interface HolderClip {
        void clip(Canvas canvas, RectF rectF, float f, boolean z);
    }

    public interface HolderDrawAbove {
        void draw(Canvas canvas, RectF rectF, float f, boolean z);
    }

    private void updatePipSource() {
    }

    @Override
    public void dismiss(boolean z) {
        dismiss();
    }

    @Override
    public BulletinFactory getBulletinFactory() {
        return BaseFragment.AttachedSheet.CC.$default$getBulletinFactory(this);
    }

    @Override
    public boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override
    public void pipRenderBackground(Canvas canvas) {
        IPipSourceDelegate.CC.$default$pipRenderBackground(this, canvas);
    }

    @Override
    public void pipRenderForeground(Canvas canvas) {
        IPipSourceDelegate.CC.$default$pipRenderForeground(this, canvas);
    }

    @Override
    public void setLastVisible(boolean z) {
        BaseFragment.AttachedSheet.CC.$default$setLastVisible(this, z);
    }

    @Override
    public void setOnDismissListener(Runnable runnable) {
    }

    public static boolean isShowingImage(MessageObject messageObject) {
        return lastStoryItem != null && (messageObject.type == 23 || messageObject.isWebpage()) && !runOpenAnimationAfterLayout && lastStoryItem.messageId == messageObject.getId() && lastStoryItem.messageType != 3;
    }

    public static void closeGlobalInstances() {
        for (int i = 0; i < globalInstances.size(); i++) {
            ((StoryViewer) globalInstances.get(i)).close(false);
        }
        globalInstances.clear();
    }

    public void setLongPressed(boolean z) {
        PeerStoriesView currentPeerView;
        PeerStoriesView currentPeerView2;
        PeerStoriesView.StoryItemHolder storyItemHolder;
        VideoPlayerHolder videoPlayerHolder;
        PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope;
        if (this.isLongpressed != z) {
            this.isLongpressed = z;
            if (z && !this.isInPinchToZoom && (currentPeerView2 = this.storiesViewPager.getCurrentPeerView()) != null && (storyItemHolder = currentPeerView2.currentStory) != null && !storyItemHolder.isLive() && currentPeerView2.currentStory.uploadingStory == null) {
                if (!this.inSeekingMode && !this.inSwipeToDissmissMode && (videoPlayerSharedScope = this.currentPlayerScope) != null && videoPlayerSharedScope.player != null) {
                    currentPeerView2.storyContainer.invalidate();
                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                }
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope2 = this.currentPlayerScope;
                if (videoPlayerSharedScope2 != null && (videoPlayerHolder = videoPlayerSharedScope2.player) != null && !this.inSeekingMode) {
                    videoPlayerHolder.setSeeking(true);
                }
                this.inSeekingMode = true;
            }
            updatePlayingMode();
            StoriesViewPager storiesViewPager = this.storiesViewPager;
            if (storiesViewPager == null || (currentPeerView = storiesViewPager.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.isLongpressed);
        }
    }

    public StoryViewer(BaseFragment baseFragment) {
        this.fragment = baseFragment;
    }

    public void setSpeed(float f) {
        currentSpeed = f;
        VideoPlayerHolder videoPlayerHolder = this.playerHolder;
        if (videoPlayerHolder != null) {
            videoPlayerHolder.setSpeed(f);
        }
    }

    public void open(Context context, TL_stories.StoryItem storyItem, PlaceProvider placeProvider) {
        open(UserConfig.selectedAccount, context, storyItem, placeProvider);
    }

    public void open(int i, Context context, TL_stories.StoryItem storyItem, PlaceProvider placeProvider) {
        if (storyItem == null) {
            return;
        }
        this.currentAccount = i;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                open(i, context, storyItem, arrayList, 0, null, null, placeProvider, false);
            }
        }
    }

    public void open(Context context, long j, PlaceProvider placeProvider) {
        this.currentAccount = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        MessagesController.getInstance(this.currentAccount).getStoriesController().checkExpiredStories(j);
        open(context, null, arrayList, 0, null, null, placeProvider, false);
    }

    public void open(Context context, int i, StoriesController.StoriesList storiesList, PlaceProvider placeProvider) {
        this.currentAccount = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(storiesList.dialogId));
        this.dayStoryId = i;
        open(context, null, arrayList, 0, storiesList, null, placeProvider, false);
    }

    public void open(Context context, TL_stories.PeerStories peerStories, PlaceProvider placeProvider) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories == null || (arrayList = peerStories.stories) == null || arrayList.isEmpty()) {
            this.doOnAnimationReadyRunnables.clear();
            return;
        }
        this.currentAccount = UserConfig.selectedAccount;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
        open(context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, placeProvider, false);
    }

    public void open(Context context, TL_stories.StoryItem storyItem, int i, StoriesController.StoriesList storiesList, boolean z, PlaceProvider placeProvider) {
        this.currentAccount = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(storiesList.dialogId));
        this.dayStoryId = i;
        open(context, storyItem, arrayList, 0, storiesList, null, placeProvider, z);
    }

    public void open(Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i, StoriesController.StoriesList storiesList, TL_stories.PeerStories peerStories, PlaceProvider placeProvider, boolean z) {
        open(UserConfig.selectedAccount, context, storyItem, arrayList, i, storiesList, peerStories, placeProvider, z);
    }

    public void open(int i, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i2, StoriesController.StoriesList storiesList, TL_stories.PeerStories peerStories, PlaceProvider placeProvider, boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!AndroidUtilities.isContextSafe(context)) {
            this.doOnAnimationReadyRunnables.clear();
            return;
        }
        ValueAnimator valueAnimator = this.openCloseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.openCloseAnimator = null;
        }
        if (this.isShowing) {
            this.doOnAnimationReadyRunnables.clear();
            return;
        }
        setSpeed(1.0f);
        boolean z2 = (AndroidUtilities.isTablet() || this.fromBottomSheet) ? false : true;
        this.ATTACH_TO_FRAGMENT = z2;
        this.USE_SURFACE_VIEW = SharedConfig.useSurfaceInStories && z2;
        this.messageId = storyItem == null ? 0 : storyItem.messageId;
        this.isSingleStory = storyItem != null && storiesList == null && peerStories == null;
        this.singleStoryDeleted = false;
        if (storyItem != null) {
            this.singleStory = storyItem;
            lastStoryItem = storyItem;
        }
        this.storiesList = storiesList;
        this.overrideUserStories = peerStories;
        this.placeProvider = placeProvider;
        this.reversed = z;
        this.currentAccount = i;
        this.swipeToDismissOffset = 0.0f;
        this.swipeToDismissHorizontalOffset = 0.0f;
        StoriesViewPager storiesViewPager = this.storiesViewPager;
        if (storiesViewPager != null) {
            storiesViewPager.setHorizontalProgressToDismiss(0.0f);
            this.storiesViewPager.currentState = 0;
        }
        this.swipeToReplyProgress = 0.0f;
        this.swipeToReplyOffset = 0.0f;
        this.allowSwipeToReply = false;
        this.progressToDismiss = 0.0f;
        this.isShowing = true;
        this.isLongpressed = false;
        this.isTranslating = false;
        this.savedPositions.clear();
        AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.softInputMode = 16;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        this.windowLayoutParams.flags = -2147417728;
        this.isClosed = false;
        this.unreadStateChanged = false;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (this.windowView == null) {
            this.gestureDetector = new GestureDetector(new GestureDetector.OnGestureListener() {
                @Override
                public void onLongPress(MotionEvent motionEvent) {
                }

                @Override
                public void onShowPress(MotionEvent motionEvent) {
                }

                @Override
                public boolean onDown(MotionEvent motionEvent) {
                    StoryViewer.this.flingCalled = false;
                    StoryViewer storyViewer = StoryViewer.this;
                    return !storyViewer.findClickableView(storyViewer.windowView, motionEvent.getX(), motionEvent.getY(), false);
                }

                @Override
                public boolean onSingleTapUp(MotionEvent motionEvent) {
                    StoryViewer storyViewer = StoryViewer.this;
                    if (storyViewer.selfStoriesViewsOffset == 0.0f && storyViewer.allowIntercept) {
                        if (storyViewer.keyboardVisible || storyViewer.isCaption || StoryViewer.this.isCaptionPartVisible || StoryViewer.this.isHintVisible || StoryViewer.this.isInTextSelectionMode) {
                            StoryViewer.this.closeKeyboardOrEmoji();
                        } else {
                            PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                            if (currentPeerView != null && currentPeerView.currentStory.isLive()) {
                                return false;
                            }
                            StoryViewer.this.switchByTap(motionEvent.getX() > ((float) StoryViewer.this.containerView.getMeasuredWidth()) * 0.33f);
                        }
                    }
                    return false;
                }

                @Override
                public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    float f3;
                    StoryViewer storyViewer = StoryViewer.this;
                    if (!storyViewer.inSwipeToDissmissMode) {
                        return false;
                    }
                    if (storyViewer.allowSwipeToReply) {
                        storyViewer.swipeToReplyOffset += f2;
                        int iDp = AndroidUtilities.dp(200.0f);
                        StoryViewer storyViewer2 = StoryViewer.this;
                        float f4 = iDp;
                        if (storyViewer2.swipeToReplyOffset > f4 && !storyViewer2.swipeToReplyWaitingKeyboard) {
                            storyViewer2.swipeToReplyWaitingKeyboard = true;
                            storyViewer2.showKeyboard();
                            try {
                                StoryViewer.this.windowView.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        StoryViewer storyViewer3 = StoryViewer.this;
                        storyViewer3.swipeToReplyProgress = Utilities.clamp(storyViewer3.swipeToReplyOffset / f4, 1.0f, 0.0f);
                        if (StoryViewer.this.storiesViewPager.getCurrentPeerView() != null) {
                            StoryViewer.this.storiesViewPager.getCurrentPeerView().invalidate();
                        }
                        StoryViewer storyViewer4 = StoryViewer.this;
                        if (storyViewer4.swipeToReplyOffset >= 0.0f) {
                            return true;
                        }
                        storyViewer4.swipeToReplyOffset = 0.0f;
                        storyViewer4.allowSwipeToReply = false;
                    }
                    StoryViewer storyViewer5 = StoryViewer.this;
                    if (storyViewer5.allowSelfStoriesView) {
                        float f5 = storyViewer5.selfStoriesViewsOffset;
                        if (f5 > storyViewer5.selfStoryViewsView.maxSelfStoriesViewsOffset && f2 > 0.0f) {
                            storyViewer5.selfStoriesViewsOffset = f5 + (0.05f * f2);
                        } else {
                            storyViewer5.selfStoriesViewsOffset = f5 + f2;
                        }
                        Bulletin.hideVisible(storyViewer5.windowView);
                        if (StoryViewer.this.storiesViewPager.getCurrentPeerView() != null) {
                            StoryViewer.this.storiesViewPager.getCurrentPeerView().invalidate();
                        }
                        StoryViewer.this.containerView.invalidate();
                        StoryViewer storyViewer6 = StoryViewer.this;
                        if (storyViewer6.selfStoriesViewsOffset >= 0.0f) {
                            return true;
                        }
                        storyViewer6.selfStoriesViewsOffset = 0.0f;
                        storyViewer6.allowSelfStoriesView = false;
                    }
                    StoryViewer storyViewer7 = StoryViewer.this;
                    if (storyViewer7.progressToDismiss > 0.8f) {
                        float f6 = -f2;
                        if ((f6 <= 0.0f || storyViewer7.swipeToDismissOffset <= 0.0f) && (f6 >= 0.0f || storyViewer7.swipeToDismissOffset >= 0.0f)) {
                            f3 = 0.6f;
                        } else {
                            f3 = 0.3f;
                        }
                    } else {
                        f3 = 0.6f;
                    }
                    storyViewer7.swipeToDismissOffset -= f2 * f3;
                    Bulletin.hideVisible(storyViewer7.windowView);
                    StoryViewer.this.updateProgressToDismiss();
                    return true;
                }

                @Override
                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    StoryViewer storyViewer = StoryViewer.this;
                    if (storyViewer.swipeToReplyOffset != 0.0f && storyViewer.storiesIntro == null && f2 < -1000.0f) {
                        StoryViewer storyViewer2 = StoryViewer.this;
                        if (!storyViewer2.swipeToReplyWaitingKeyboard) {
                            storyViewer2.swipeToReplyWaitingKeyboard = true;
                            try {
                                storyViewer2.windowView.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            StoryViewer.this.showKeyboard();
                        }
                    }
                    StoryViewer storyViewer3 = StoryViewer.this;
                    if (storyViewer3.selfStoriesViewsOffset != 0.0f) {
                        if (f2 < -1000.0f) {
                            storyViewer3.cancelSwipeToViews(true);
                        } else if (f2 > 1000.0f) {
                            storyViewer3.cancelSwipeToViews(false);
                        } else {
                            storyViewer3.cancelSwipeToViews(storyViewer3.selfStoryViewsView.progressToOpen > 0.5f);
                        }
                    }
                    StoryViewer.this.flingCalled = true;
                    return false;
                }
            });
            this.windowView = new AnonymousClass2(context, lastFragment);
        }
        if (this.containerView == null) {
            this.containerView = new HwFrameLayout(context) {
                public int measureKeyboardHeight() {
                    View rootView = getRootView();
                    Rect rect = AndroidUtilities.rectTmp2;
                    getWindowVisibleDisplayFrame(rect);
                    if (rect.bottom == 0 && rect.top == 0) {
                        return 0;
                    }
                    return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
                }

                @Override
                protected void onMeasure(int i3, int i4) {
                    int size = View.MeasureSpec.getSize(i4);
                    StoryViewer storyViewer = StoryViewer.this;
                    if (!storyViewer.ATTACH_TO_FRAGMENT || storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
                        storyViewer.setKeyboardHeightFromParent(measureKeyboardHeight());
                        size += StoryViewer.this.realKeyboardHeight;
                    }
                    int size2 = View.MeasureSpec.getSize(i3);
                    int i5 = (int) ((size2 * 16.0f) / 9.0f);
                    if (size > i5) {
                        StoryViewer.this.storiesViewPager.getLayoutParams().width = -1;
                        size = i5;
                    } else {
                        int i6 = (int) ((size / 16.0f) * 9.0f);
                        StoryViewer.this.storiesViewPager.getLayoutParams().width = i6;
                        size2 = i6;
                    }
                    StoryViewer.this.aspectRatioFrameLayout.getLayoutParams().height = size + 1;
                    StoryViewer.this.aspectRatioFrameLayout.getLayoutParams().width = size2;
                    ((FrameLayout.LayoutParams) StoryViewer.this.aspectRatioFrameLayout.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                    super.onMeasure(i3, i4);
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    PeerStoriesView currentPeerView = StoryViewer.this.storiesViewPager.getCurrentPeerView();
                    StoryViewer storyViewer = StoryViewer.this;
                    SelfStoryViewsView selfStoryViewsView = storyViewer.selfStoryViewsView;
                    if (selfStoryViewsView != null && currentPeerView != null) {
                        selfStoryViewsView.setOffset(storyViewer.selfStoriesViewsOffset);
                        StoryViewer storyViewer2 = StoryViewer.this;
                        if (storyViewer2.selfStoryViewsView.progressToOpen == 1.0f) {
                            storyViewer2.storiesViewPager.setVisibility(4);
                        } else {
                            storyViewer2.storiesViewPager.setVisibility(0);
                        }
                        StoryViewer.this.storiesViewPager.checkPageVisibility();
                        float top = currentPeerView.getTop() + currentPeerView.storyContainer.getTop();
                        float f = StoryViewer.this.selfStoryViewsView.progressToOpen;
                        getMeasuredHeight();
                        float f2 = StoryViewer.this.selfStoriesViewsOffset;
                        getMeasuredHeight();
                        if (currentPeerView.storyContainer.getMeasuredHeight() > 0) {
                            StoryViewer.this.lastStoryContainerHeight = currentPeerView.storyContainer.getMeasuredHeight();
                        }
                        StoryViewer storyViewer3 = StoryViewer.this;
                        float f3 = storyViewer3.selfStoryViewsView.toHeight / storyViewer3.lastStoryContainerHeight;
                        float fLerp = AndroidUtilities.lerp(1.0f, f3, f);
                        StoryViewer.this.storiesViewPager.setPivotY(top);
                        StoryViewer.this.storiesViewPager.setPivotX(getMeasuredWidth() / 2.0f);
                        StoryViewer.this.storiesViewPager.setScaleX(fLerp);
                        StoryViewer.this.storiesViewPager.setScaleY(fLerp);
                        currentPeerView.forceUpdateOffsets = true;
                        StoryViewer storyViewer4 = StoryViewer.this;
                        if (storyViewer4.selfStoriesViewsOffset == 0.0f) {
                            currentPeerView.setViewsThumbImageReceiver(0.0f, 0.0f, 0.0f, null);
                        } else {
                            currentPeerView.setViewsThumbImageReceiver(f, fLerp, top, storyViewer4.selfStoryViewsView.getCrossfadeToImage());
                        }
                        currentPeerView.invalidate();
                        currentPeerView.outlineProvider.radiusInDp = (int) AndroidUtilities.lerp(10.0f, 6.0f / f3, StoryViewer.this.selfStoryViewsView.progressToOpen);
                        currentPeerView.storyContainer.invalidateOutline();
                        StoryViewer storyViewer5 = StoryViewer.this;
                        storyViewer5.storiesViewPager.setTranslationY((storyViewer5.selfStoryViewsView.toY - top) * f);
                    }
                    if (currentPeerView != null) {
                        StoryViewer.this.volumeControl.setTranslationY(((currentPeerView.getY() + currentPeerView.storyContainer.getY()) - StoryViewer.this.volumeControl.getTop()) - AndroidUtilities.dp(4.0f));
                    }
                    super.dispatchDraw(canvas);
                }
            };
            HwStoriesViewPager hwStoriesViewPager = new HwStoriesViewPager(this.currentAccount, context, this, this.resourcesProvider) {
                @Override
                public void onStateChanged() {
                    StoryViewer storyViewer = StoryViewer.this;
                    if (storyViewer.storiesViewPager.currentState == 1) {
                        AndroidUtilities.cancelRunOnUIThread(storyViewer.longPressRunnable);
                    }
                }
            };
            this.storiesViewPager = hwStoriesViewPager;
            hwStoriesViewPager.setDelegate(new AnonymousClass5(storiesList, arrayList, context));
            this.containerView.addView(this.storiesViewPager, LayoutHelper.createFrame(-1, -1, 1));
            this.aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
            if (this.USE_SURFACE_VIEW) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.surfaceView = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.surfaceView.setZOrderOnTop(false);
                this.aspectRatioFrameLayout.addView(this.surfaceView);
            } else {
                HwTextureView hwTextureView = new HwTextureView(context) {
                    @Override
                    public void invalidate() {
                        super.invalidate();
                        PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = StoryViewer.this.currentPlayerScope;
                        if (videoPlayerSharedScope != null) {
                            videoPlayerSharedScope.invalidate();
                        }
                    }
                };
                this.textureView = hwTextureView;
                this.aspectRatioFrameLayout.addView(hwTextureView);
            }
            LivePlayerView livePlayerView = new LivePlayerView(context, this.currentAccount, false);
            this.liveView = livePlayerView;
            livePlayerView.setVisibility(8);
            this.aspectRatioFrameLayout.addView(this.liveView);
            StoriesVolumeControl storiesVolumeControl = new StoriesVolumeControl(context);
            this.volumeControl = storiesVolumeControl;
            this.containerView.addView(storiesVolumeControl, LayoutHelper.createFrame(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        LivePlayerView livePlayerView2 = this.liveView;
        if (livePlayerView2 != null) {
            livePlayerView2.setAccount(this.currentAccount);
        }
        AndroidUtilities.removeFromParent(this.aspectRatioFrameLayout);
        this.windowView.addView(this.aspectRatioFrameLayout);
        SurfaceView surfaceView2 = this.surfaceView;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        AndroidUtilities.removeFromParent(this.containerView);
        this.windowView.addView(this.containerView);
        this.windowView.setClipChildren(false);
        if (this.isSingleStory) {
            updateTransitionParams();
        }
        if (storiesList != null) {
            this.storiesViewPager.setDays(storiesList.dialogId, storiesList.getDays(), this.currentAccount);
        } else {
            this.storiesViewPager.setPeerIds(arrayList, this.currentAccount, i2);
        }
        this.windowManager = (WindowManager) context.getSystemService("window");
        if (lastFragment == null || lastFragment.getLayoutContainer() == null || lastFragment.isSupportEdgeToEdge()) {
            this.ATTACH_TO_FRAGMENT = false;
        }
        this.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE = this.ATTACH_TO_FRAGMENT && lastFragment != null && lastFragment.isSupportEdgeToEdge();
        ViewCompat.setOnApplyWindowInsetsListener(this.containerView, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return StoryViewer.$r8$lambda$_3h4XxkHOOmj9g3cb3o7tWasEZs(this.f$0, view, windowInsetsCompat);
            }
        });
        if (this.ATTACH_TO_FRAGMENT) {
            AndroidUtilities.removeFromParent(this.windowView);
            this.windowView.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            lastFragment.getLayoutContainer().addView(this.windowView);
            if (!this.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
                AndroidUtilities.requestAdjustResize(lastFragment.getParentActivity(), lastFragment.getClassGuid());
            }
        } else {
            this.windowView.setFocusable(false);
            this.containerView.setFocusable(false);
            this.containerView.setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
            if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = this.windowView.findOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new OnBackInvokedCallback() {
                    @Override
                    public final void onBackInvoked() {
                        StoryViewer.m4456$r8$lambda$bSfwY8okinijPMZpwEi4JWN80A(this.f$0);
                    }
                });
            }
        }
        this.windowView.requestLayout();
        runOpenAnimationAfterLayout = true;
        updateTransitionParams();
        this.progressToOpen = 0.0f;
        checkNavBarColor();
        animationInProgress = true;
        checkInSilentMode();
        if (this.ATTACH_TO_FRAGMENT) {
            lockOrientation(true);
        }
        if (!this.ATTACH_TO_FRAGMENT) {
            globalInstances.add(this);
        }
        if (lastFragment != null) {
            AndroidUtilities.hideKeyboard(lastFragment.getFragmentView());
        }
    }

    class AnonymousClass2 extends SizeNotifierFrameLayout {
        float lastTouchX;
        SparseArray lastX;
        final RectF outFromRectAvatar;
        final RectF outFromRectContainer;
        final Path path;
        final float[] radii;
        final RectF rect1;
        final RectF rect2;
        final RectF rect3;
        float startX;
        float startY;
        final BaseFragment val$fragment;

        AnonymousClass2(Context context, BaseFragment baseFragment) {
            super(context);
            this.val$fragment = baseFragment;
            this.radii = new float[8];
            this.path = new Path();
            this.rect1 = new RectF();
            this.rect2 = new RectF();
            this.rect3 = new RectF();
            this.outFromRectAvatar = new RectF();
            this.outFromRectContainer = new RectF();
            this.lastX = new SparseArray();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == StoryViewer.this.aspectRatioFrameLayout) {
                return false;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            PeerStoriesView.PeerHeaderView peerHeaderView;
            float f;
            float f2;
            float f3;
            float f4;
            float y;
            float fLerp;
            StoriesUtilities.AvatarStoryParams avatarStoryParams;
            Paint paint;
            StoriesUtilities.AvatarStoryParams avatarStoryParams2;
            HolderDrawAbove holderDrawAbove;
            HolderClip holderClip;
            PeerStoriesView currentPeerView;
            StoriesUtilities.AvatarStoryParams avatarStoryParams3;
            StoryViewer storyViewer;
            TransitionViewHolder transitionViewHolder;
            float y2;
            canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (StoryViewer.this.getBlackoutAlpha() * 255.0f)));
            StoryViewer storyViewer2 = StoryViewer.this;
            if (storyViewer2.ATTACH_TO_FRAGMENT) {
                boolean z = storyViewer2.progressToOpen * (1.0f - storyViewer2.progressToDismiss) == 1.0f;
                if (storyViewer2.fullyVisible != z) {
                    StoryViewer.this.fullyVisible = z;
                    if (this.val$fragment.getLayoutContainer() != null) {
                        this.val$fragment.getLayoutContainer().invalidate();
                    }
                }
            }
            PeerStoriesView currentPeerView2 = StoryViewer.this.storiesViewPager.getCurrentPeerView();
            if (currentPeerView2 != null) {
                PeerStoriesView.PeerHeaderView peerHeaderView2 = currentPeerView2.headerView;
                if (StoryViewer.this.animateAvatar) {
                    peerHeaderView2.backupImageView.getImageReceiver().setVisible(StoryViewer.this.progressToOpen == 1.0f, true);
                } else {
                    peerHeaderView2.backupImageView.getImageReceiver().setVisible(true, false);
                }
                if (StoryViewer.this.invalidateOutRect) {
                    StoryViewer.this.invalidateOutRect = false;
                    float x = 0.0f;
                    float f5 = 0.0f;
                    for (View view = peerHeaderView2.backupImageView; view != this; view = (View) view.getParent()) {
                        if (view.getParent() == this) {
                            x += view.getLeft();
                            y2 = view.getTop();
                        } else {
                            if (view.getParent() != StoryViewer.this.storiesViewPager) {
                                x += view.getX();
                                y2 = view.getY();
                            }
                        }
                        f5 += y2;
                    }
                    this.outFromRectAvatar.set(x, f5, peerHeaderView2.backupImageView.getMeasuredWidth() + x, peerHeaderView2.backupImageView.getMeasuredHeight() + f5);
                    this.outFromRectContainer.set(0.0f, currentPeerView2.getTop() + currentPeerView2.storyContainer.getTop(), StoryViewer.this.containerView.getMeasuredWidth(), StoryViewer.this.containerView.getMeasuredHeight());
                    StoryViewer.this.containerView.getMatrix().mapRect(this.outFromRectAvatar);
                    StoryViewer.this.containerView.getMatrix().mapRect(this.outFromRectContainer);
                }
                peerHeaderView = peerHeaderView2;
            } else {
                peerHeaderView = null;
            }
            StoryViewer.this.volumeControl.setAlpha(1.0f - StoryViewer.this.progressToDismiss);
            StoryViewer storyViewer3 = StoryViewer.this;
            float fClamp = storyViewer3.swipeToDismissHorizontalOffset == 0.0f ? 1.0f - Utilities.clamp(Math.abs(storyViewer3.swipeToDismissOffset / getMeasuredHeight()), 1.0f, 0.0f) : 1.0f;
            StoryViewer storyViewer4 = StoryViewer.this;
            storyViewer4.storiesViewPager.setHorizontalProgressToDismiss((storyViewer4.swipeToDismissHorizontalOffset / storyViewer4.containerView.getMeasuredWidth()) * StoryViewer.this.progressToOpen);
            StoryViewer storyViewer5 = StoryViewer.this;
            if (storyViewer5.fromX == 0.0f && storyViewer5.fromY == 0.0f) {
                storyViewer5.containerView.setAlpha(storyViewer5.progressToOpen);
                StoryViewer storyViewer6 = StoryViewer.this;
                float f6 = (storyViewer6.progressToOpen * 0.1f) + 0.75f + (fClamp * 0.15f);
                storyViewer6.containerView.setScaleX(f6);
                StoryViewer.this.containerView.setScaleY(f6);
                StoryViewer storyViewer7 = StoryViewer.this;
                storyViewer7.containerView.setTranslationY(storyViewer7.swipeToDismissOffset);
                StoryViewer storyViewer8 = StoryViewer.this;
                storyViewer8.containerView.setTranslationX(storyViewer8.swipeToDismissHorizontalOffset);
                super.dispatchDraw(canvas);
            } else {
                float f7 = storyViewer5.progressToOpen;
                if (f7 != 1.0f) {
                    if (storyViewer5.isClosed && StoryViewer.this.animateAvatar) {
                        float f8 = StoryViewer.this.progressToOpen;
                        float fClamp2 = 1.0f - Utilities.clamp(((1.0f - f8) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                        float fClamp3 = Utilities.clamp(f8 - ((1.0f - fClamp2) * 0.05f), 1.0f, 0.0f);
                        StoryViewer.this.containerView.setAlpha(fClamp2);
                        f = f8;
                        f7 = fClamp3;
                    } else {
                        StoryViewer.this.containerView.setAlpha(1.0f);
                        f = f7;
                    }
                    if (!StoryViewer.this.isClosed || (transitionViewHolder = (storyViewer = StoryViewer.this).transitionViewHolder) == null || transitionViewHolder.storyImage == null) {
                        f2 = 0.15f;
                        f3 = 1.0f;
                        boolean unused = StoryViewer.this.isClosed;
                    } else {
                        HwFrameLayout hwFrameLayout = storyViewer.containerView;
                        f2 = 0.15f;
                        f3 = 1.0f;
                        hwFrameLayout.setAlpha(hwFrameLayout.getAlpha() * ((float) Math.pow(f, 0.20000000298023224d)));
                    }
                    StoryViewer storyViewer9 = StoryViewer.this;
                    HwFrameLayout hwFrameLayout2 = storyViewer9.containerView;
                    float left = (storyViewer9.fromX - hwFrameLayout2.getLeft()) - (StoryViewer.this.containerView.getMeasuredWidth() / 2.0f);
                    StoryViewer storyViewer10 = StoryViewer.this;
                    float f9 = storyViewer10.progressToOpen;
                    hwFrameLayout2.setTranslationX((left * (f3 - f9)) + (storyViewer10.swipeToDismissHorizontalOffset * f9));
                    StoryViewer storyViewer11 = StoryViewer.this;
                    HwFrameLayout hwFrameLayout3 = storyViewer11.containerView;
                    float top = (storyViewer11.fromY - hwFrameLayout3.getTop()) - (StoryViewer.this.containerView.getMeasuredHeight() / 2.0f);
                    StoryViewer storyViewer12 = StoryViewer.this;
                    float f10 = storyViewer12.progressToOpen;
                    hwFrameLayout3.setTranslationY((top * (f3 - f10)) + (storyViewer12.swipeToDismissOffset * f10));
                    StoryViewer storyViewer13 = StoryViewer.this;
                    float fLerp2 = AndroidUtilities.lerp(storyViewer13.fromWidth / storyViewer13.containerView.getMeasuredWidth(), (fClamp * f2) + 0.85f, f7);
                    StoryViewer.this.containerView.setScaleX(fLerp2);
                    StoryViewer.this.containerView.setScaleY(fLerp2);
                    this.path.rewind();
                    RectF rectF = this.rect1;
                    StoryViewer storyViewer14 = StoryViewer.this;
                    float f11 = storyViewer14.fromX;
                    float f12 = storyViewer14.fromWidth / 2.0f;
                    float f13 = storyViewer14.fromY;
                    float f14 = storyViewer14.fromHeight / 2.0f;
                    rectF.set(f11 - f12, f13 - f14, f11 + f12, f13 + f14);
                    if (StoryViewer.this.isClosed && StoryViewer.this.animateAvatar) {
                        this.rect2.set(this.outFromRectContainer);
                    } else if (currentPeerView2 != null) {
                        this.rect2.set(0.0f, currentPeerView2.storyContainer.getTop() + StoryViewer.this.fromDismissOffset, getMeasuredWidth(), getMeasuredHeight() + StoryViewer.this.fromDismissOffset);
                    } else {
                        this.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                    if (StoryViewer.this.isClosed && StoryViewer.this.animateAvatar) {
                        this.rect1.inset(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                    }
                    float fLerp3 = AndroidUtilities.lerp(this.rect1.centerX(), this.rect2.centerX(), StoryViewer.this.progressToOpen);
                    float fLerp4 = AndroidUtilities.lerp(this.rect1.centerY(), this.rect2.centerY(), StoryViewer.this.progressToOpen);
                    float fLerp5 = AndroidUtilities.lerp(this.rect1.height(), this.rect2.height(), f7);
                    float fLerp6 = AndroidUtilities.lerp(this.rect1.width(), this.rect2.width(), f7);
                    if (StoryViewer.this.isClosed && StoryViewer.this.animateAvatar) {
                        this.rect1.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f15 = fLerp6 / 2.0f;
                    float f16 = fLerp5 / 2.0f;
                    rectF2.set(fLerp3 - f15, fLerp4 - f16, fLerp3 + f15, fLerp4 + f16);
                    if (!StoryViewer.this.animateAvatar) {
                        if (StoryViewer.this.fromRadius != null) {
                            float[] fArr = this.radii;
                            float fLerp7 = AndroidUtilities.lerp(StoryViewer.this.fromRadius[0], 0, f);
                            fArr[1] = fLerp7;
                            fArr[0] = fLerp7;
                            float[] fArr2 = this.radii;
                            float fLerp8 = AndroidUtilities.lerp(StoryViewer.this.fromRadius[1], 0, f);
                            fArr2[3] = fLerp8;
                            fArr2[2] = fLerp8;
                            float[] fArr3 = this.radii;
                            float fLerp9 = AndroidUtilities.lerp(StoryViewer.this.fromRadius[2], 0, f);
                            fArr3[5] = fLerp9;
                            fArr3[4] = fLerp9;
                            float[] fArr4 = this.radii;
                            float fLerp10 = AndroidUtilities.lerp(StoryViewer.this.fromRadius[3], 0, f);
                            fArr4[7] = fLerp10;
                            fArr4[6] = fLerp10;
                        } else {
                            float[] fArr5 = this.radii;
                            fArr5[7] = 0.0f;
                            fArr5[6] = 0.0f;
                            fArr5[5] = 0.0f;
                            fArr5[4] = 0.0f;
                            fArr5[3] = 0.0f;
                            fArr5[2] = 0.0f;
                            fArr5[1] = 0.0f;
                            fArr5[0] = 0.0f;
                        }
                    } else {
                        float[] fArr6 = this.radii;
                        float fLerp11 = AndroidUtilities.lerp(StoryViewer.this.fromWidth / 2.0f, 0.0f, f7);
                        fArr6[7] = fLerp11;
                        fArr6[6] = fLerp11;
                        fArr6[5] = fLerp11;
                        fArr6[4] = fLerp11;
                        fArr6[3] = fLerp11;
                        fArr6[2] = fLerp11;
                        fArr6[1] = fLerp11;
                        fArr6[0] = fLerp11;
                    }
                    this.path.addRoundRect(rectF2, this.radii, Path.Direction.CCW);
                    canvas.save();
                    StoryViewer storyViewer15 = StoryViewer.this;
                    float f17 = storyViewer15.clipTop;
                    if (f17 != 0.0f && storyViewer15.clipBottom != 0.0f) {
                        float fLerp12 = AndroidUtilities.lerp(0.0f, f17, (float) Math.pow(f3 - storyViewer15.progressToOpen, 0.4000000059604645d));
                        float measuredWidth = getMeasuredWidth();
                        float measuredHeight = getMeasuredHeight();
                        StoryViewer storyViewer16 = StoryViewer.this;
                        canvas.clipRect(0.0f, fLerp12, measuredWidth, AndroidUtilities.lerp(measuredHeight, storyViewer16.clipBottom, f3 - storyViewer16.progressToOpen));
                    }
                    StoryViewer storyViewer17 = StoryViewer.this;
                    TransitionViewHolder transitionViewHolder2 = storyViewer17.transitionViewHolder;
                    if (transitionViewHolder2 != null && (avatarStoryParams3 = transitionViewHolder2.params) != null && avatarStoryParams3.drawnLive && storyViewer17.animateAvatar) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    canvas.clipPath(this.path);
                    super.dispatchDraw(canvas);
                    StoryViewer storyViewer18 = StoryViewer.this;
                    TransitionViewHolder transitionViewHolder3 = storyViewer18.transitionViewHolder;
                    if (transitionViewHolder3 == null || transitionViewHolder3.storyImage == null || (currentPeerView = storyViewer18.storiesViewPager.getCurrentPeerView()) == null || currentPeerView.storyContainer == null) {
                        f4 = 0.0f;
                    } else {
                        boolean visible = StoryViewer.this.transitionViewHolder.storyImage.getVisible();
                        RectF rectF3 = this.rect2;
                        StoryViewer storyViewer19 = StoryViewer.this;
                        float left2 = storyViewer19.swipeToDismissHorizontalOffset + storyViewer19.containerView.getLeft() + currentPeerView.getX() + currentPeerView.storyContainer.getX();
                        StoryViewer storyViewer20 = StoryViewer.this;
                        float top2 = storyViewer20.swipeToDismissOffset + storyViewer20.containerView.getTop() + currentPeerView.getY() + currentPeerView.storyContainer.getY();
                        StoryViewer storyViewer21 = StoryViewer.this;
                        float right = ((storyViewer21.swipeToDismissHorizontalOffset + storyViewer21.containerView.getRight()) - (StoryViewer.this.containerView.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - currentPeerView.storyContainer.getRight());
                        StoryViewer storyViewer22 = StoryViewer.this;
                        rectF3.set(left2, top2, right, ((storyViewer22.swipeToDismissOffset + storyViewer22.containerView.getBottom()) - (StoryViewer.this.containerView.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - currentPeerView.storyContainer.getBottom()));
                        AndroidUtilities.lerp(this.rect1, this.rect2, f, this.rect3);
                        float imageX = StoryViewer.this.transitionViewHolder.storyImage.getImageX();
                        float imageY = StoryViewer.this.transitionViewHolder.storyImage.getImageY();
                        float imageWidth = StoryViewer.this.transitionViewHolder.storyImage.getImageWidth();
                        float imageHeight = StoryViewer.this.transitionViewHolder.storyImage.getImageHeight();
                        StoryViewer.this.transitionViewHolder.storyImage.setImageCoords(this.rect3);
                        float f18 = f3 - f;
                        StoryViewer.this.transitionViewHolder.storyImage.setAlpha(f18);
                        StoryViewer.this.transitionViewHolder.storyImage.setVisible(true, false);
                        int saveCount = canvas.getSaveCount();
                        StoryViewer storyViewer23 = StoryViewer.this;
                        HolderClip holderClip2 = storyViewer23.transitionViewHolder.drawClip;
                        f4 = 0.0f;
                        if (holderClip2 != null) {
                            holderClip2.clip(canvas, this.rect3, f18, storyViewer23.opening);
                        }
                        StoryViewer.this.transitionViewHolder.storyImage.draw(canvas);
                        StoryViewer storyViewer24 = StoryViewer.this;
                        HolderDrawAbove holderDrawAbove2 = storyViewer24.transitionViewHolder.drawAbove;
                        if (holderDrawAbove2 != null) {
                            holderDrawAbove2.draw(canvas, this.rect3, f18, storyViewer24.opening);
                        }
                        StoryViewer.this.transitionViewHolder.storyImage.setVisible(visible, false);
                        StoryViewer.this.transitionViewHolder.storyImage.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                        canvas.restoreToCount(saveCount);
                    }
                    canvas.restore();
                    if (peerHeaderView != null) {
                        StoryViewer storyViewer25 = StoryViewer.this;
                        float x2 = storyViewer25.swipeToDismissHorizontalOffset;
                        float f19 = storyViewer25.swipeToDismissOffset;
                        if (storyViewer25.isClosed && StoryViewer.this.animateAvatar) {
                            this.rect2.set(this.outFromRectAvatar);
                        } else {
                            for (View view2 = peerHeaderView.backupImageView; view2 != this && view2 != null; view2 = (View) view2.getParent()) {
                                if (view2.getParent() == this) {
                                    x2 += view2.getLeft();
                                    y = view2.getTop();
                                } else {
                                    if (view2.getParent() != StoryViewer.this.storiesViewPager) {
                                        x2 += view2.getX();
                                        y = view2.getY();
                                    }
                                    if (!(view2.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                f19 += y;
                                if (!(view2.getParent() instanceof View)) {
                                    break;
                                    break;
                                }
                            }
                            this.rect2.set(x2, f19, peerHeaderView.backupImageView.getMeasuredWidth() + x2, peerHeaderView.backupImageView.getMeasuredHeight() + f19);
                        }
                        AndroidUtilities.lerp(this.rect1, this.rect2, StoryViewer.this.progressToOpen, this.rect3);
                        int saveCount2 = canvas.getSaveCount();
                        StoryViewer storyViewer26 = StoryViewer.this;
                        TransitionViewHolder transitionViewHolder4 = storyViewer26.transitionViewHolder;
                        if (transitionViewHolder4 != null && (holderClip = transitionViewHolder4.drawClip) != null) {
                            holderClip.clip(canvas, this.rect3, f3 - f, storyViewer26.opening);
                        }
                        if (StoryViewer.this.animateAvatar) {
                            StoryViewer storyViewer27 = StoryViewer.this;
                            TransitionViewHolder transitionViewHolder5 = storyViewer27.transitionViewHolder;
                            boolean z2 = (transitionViewHolder5 == null || transitionViewHolder5.crossfadeToAvatarImage == null) ? false : true;
                            if (!z2 || storyViewer27.progressToOpen != f4) {
                                if (transitionViewHolder5 != null && (avatarStoryParams2 = transitionViewHolder5.params) != null && avatarStoryParams2.drawnLive) {
                                    canvas.saveLayerAlpha(this.rect3.left - AndroidUtilities.dp(4.0f), this.rect3.top - AndroidUtilities.dp(4.0f), this.rect3.right + AndroidUtilities.dp(4.0f), this.rect3.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                }
                                peerHeaderView.backupImageView.getImageReceiver().setImageCoords(this.rect3);
                                TransitionViewHolder transitionViewHolder6 = StoryViewer.this.transitionViewHolder;
                                Integer avatarImageRoundRadius = transitionViewHolder6 != null ? transitionViewHolder6.getAvatarImageRoundRadius() : null;
                                peerHeaderView.backupImageView.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(this.rect3.width() / 2.0f, avatarImageRoundRadius != null ? avatarImageRoundRadius.intValue() : this.rect3.width() / 2.0f, f3 - StoryViewer.this.progressToOpen));
                                peerHeaderView.backupImageView.getImageReceiver().setVisible(true, false);
                                float f20 = z2 ? StoryViewer.this.progressToOpen : 1.0f;
                                TransitionViewHolder transitionViewHolder7 = StoryViewer.this.transitionViewHolder;
                                if (transitionViewHolder7 == null || transitionViewHolder7.alpha >= f3 || (paint = transitionViewHolder7.bgPaint) == null) {
                                    fLerp = f20;
                                } else {
                                    paint.setAlpha((int) ((f3 - f) * 255.0f));
                                    canvas.drawCircle(this.rect3.centerX(), this.rect3.centerY(), this.rect3.width() / 2.0f, StoryViewer.this.transitionViewHolder.bgPaint);
                                    fLerp = AndroidUtilities.lerp(StoryViewer.this.transitionViewHolder.alpha, f20, f);
                                }
                                peerHeaderView.backupImageView.getImageReceiver().setAlpha(fLerp);
                                peerHeaderView.drawUploadingProgress(canvas, this.rect3, !StoryViewer.runOpenAnimationAfterLayout, StoryViewer.this.progressToOpen);
                                peerHeaderView.backupImageView.getImageReceiver().draw(canvas);
                                peerHeaderView.backupImageView.getImageReceiver().setAlpha(f20);
                                peerHeaderView.backupImageView.getImageReceiver().setVisible(false, false);
                                TransitionViewHolder transitionViewHolder8 = StoryViewer.this.transitionViewHolder;
                                if (transitionViewHolder8 != null && (avatarStoryParams = transitionViewHolder8.params) != null && avatarStoryParams.drawnLive) {
                                    RectF rectF4 = AndroidUtilities.rectTmp;
                                    rectF4.set(this.rect3);
                                    StoriesUtilities.drawLive(canvas, rectF4, f3 - StoryViewer.this.progressToOpen, true, 0.0f);
                                    canvas.restore();
                                }
                            }
                            StoryViewer storyViewer28 = StoryViewer.this;
                            if (storyViewer28.progressToOpen != f3 && z2) {
                                storyViewer28.avatarRectTmp.set(storyViewer28.transitionViewHolder.crossfadeToAvatarImage.getImageX(), StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.getImageY(), StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.getImageX2(), StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.getImageY2());
                                int i = StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.getRoundRadius()[0];
                                boolean visible2 = StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.getVisible();
                                StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.setImageCoords(this.rect3);
                                StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.setRoundRadius((int) (this.rect3.width() / 2.0f));
                                StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.setVisible(true, false);
                                canvas.saveLayerAlpha(this.rect3, (int) ((f3 - StoryViewer.this.progressToOpen) * 255.0f), 31);
                                StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.draw(canvas);
                                canvas.restore();
                                StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.setVisible(visible2, false);
                                StoryViewer storyViewer29 = StoryViewer.this;
                                storyViewer29.transitionViewHolder.crossfadeToAvatarImage.setImageCoords(storyViewer29.avatarRectTmp);
                                StoryViewer.this.transitionViewHolder.crossfadeToAvatarImage.setRoundRadius(i);
                            }
                            StoryViewer storyViewer30 = StoryViewer.this;
                            TransitionViewHolder transitionViewHolder9 = storyViewer30.transitionViewHolder;
                            if (transitionViewHolder9 != null && (holderDrawAbove = transitionViewHolder9.drawAbove) != null) {
                                holderDrawAbove.draw(canvas, this.rect3, f3 - f, storyViewer30.opening);
                            }
                        }
                        canvas.restoreToCount(saveCount2);
                    }
                    StoryViewer storyViewer31 = StoryViewer.this;
                    if (storyViewer31.animateFromCell != null) {
                        float fClamp4 = Utilities.clamp(storyViewer31.progressToOpen / 0.4f, 1.0f, 0.0f);
                        if (fClamp4 != 1.0f) {
                            RectF rectF5 = AndroidUtilities.rectTmp;
                            StoryViewer storyViewer32 = StoryViewer.this;
                            float f21 = storyViewer32.fromX;
                            float f22 = storyViewer32.fromY;
                            rectF5.set(f21, f22, storyViewer32.fromWidth + f21, storyViewer32.fromHeight + f22);
                            rectF5.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                            if (fClamp4 != 0.0f) {
                                canvas.saveLayerAlpha(rectF5, (int) ((1.0f - fClamp4) * 255.0f), 31);
                            } else {
                                canvas.save();
                            }
                            StoryViewer storyViewer33 = StoryViewer.this;
                            canvas.translate(storyViewer33.fromXCell, storyViewer33.fromYCell);
                            StoryViewer.this.animateFromCell.drawAvatarOverlays(canvas);
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                } else {
                    storyViewer5.containerView.setAlpha(storyViewer5.progressToOpen);
                    StoryViewer storyViewer34 = StoryViewer.this;
                    float f23 = (storyViewer34.progressToOpen * 0.1f) + 0.75f + (fClamp * 0.15f);
                    storyViewer34.containerView.setScaleX(f23);
                    StoryViewer.this.containerView.setScaleY(f23);
                    StoryViewer storyViewer35 = StoryViewer.this;
                    storyViewer35.containerView.setTranslationY(storyViewer35.swipeToDismissOffset);
                    StoryViewer storyViewer36 = StoryViewer.this;
                    storyViewer36.containerView.setTranslationX(storyViewer36.swipeToDismissHorizontalOffset);
                    super.dispatchDraw(canvas);
                }
            }
            if (StoryViewer.runOpenAnimationAfterLayout) {
                StoryViewer.this.startOpenAnimation();
                boolean unused2 = StoryViewer.runOpenAnimationAfterLayout = false;
            }
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            super.requestDisallowInterceptTouchEvent(z);
            StoryViewer.this.allowIntercept = false;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            PeerStoriesView currentPeerView = StoryViewer.this.storiesViewPager.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.checkTextSelectionEvent(motionEvent)) {
                return true;
            }
            if (StoryViewer.this.isLikesReactions && currentPeerView != null && currentPeerView.checkReactionEvent(motionEvent)) {
                return true;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                StoryViewer storyViewer = StoryViewer.this;
                storyViewer.inSwipeToDissmissMode = false;
                AndroidUtilities.cancelRunOnUIThread(storyViewer.longPressRunnable);
                StoryViewer storyViewer2 = StoryViewer.this;
                float f = storyViewer2.swipeToDismissHorizontalOffset;
                if (f != 0.0f) {
                    storyViewer2.swipeToDissmissBackAnimator = ValueAnimator.ofFloat(f, 0.0f);
                    StoryViewer.this.swipeToDissmissBackAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            StoryViewer.AnonymousClass2.$r8$lambda$rmcqNVnyoA3RAkYXq1VJHTzEwcA(this.f$0, valueAnimator);
                        }
                    });
                    StoryViewer.this.swipeToDissmissBackAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            StoryViewer storyViewer3 = StoryViewer.this;
                            storyViewer3.swipeToDismissHorizontalOffset = 0.0f;
                            storyViewer3.updateProgressToDismiss();
                        }
                    });
                    StoryViewer.this.swipeToDissmissBackAnimator.setDuration(250L);
                    StoryViewer.this.swipeToDissmissBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    StoryViewer.this.swipeToDissmissBackAnimator.start();
                }
                StoryViewer storyViewer3 = StoryViewer.this;
                if (storyViewer3.progressToDismiss >= 0.3f) {
                    storyViewer3.close(true);
                }
                StoryViewer.this.setInTouchMode(false);
                StoryViewer.this.setLongPressed(false);
                z = true;
            } else {
                z = false;
            }
            if (motionEvent.getAction() == 0) {
                StoryViewer.this.swipeToReplyWaitingKeyboard = false;
                if (currentPeerView != null) {
                    currentPeerView.onActionDown(motionEvent);
                }
                StoryViewer.this.storiesViewPager.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            }
            StoryViewer storyViewer4 = StoryViewer.this;
            boolean z3 = (storyViewer4.keyboardVisible || storyViewer4.isClosed || StoryViewer.this.isRecording) ? false : true;
            StoryViewer storyViewer5 = StoryViewer.this;
            if (storyViewer5.selfStoriesViewsOffset == 0.0f && !storyViewer5.inSwipeToDissmissMode && storyViewer5.storiesViewPager.currentState == 1 && motionEvent.getAction() == 2 && z3) {
                float fFloatValue = ((Float) this.lastX.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
                if ((fFloatValue == 0.0f || StoryViewer.this.storiesViewPager.canScroll(fFloatValue)) && StoryViewer.this.swipeToDismissHorizontalOffset == 0.0f) {
                    z2 = false;
                } else {
                    StoryViewer storyViewer6 = StoryViewer.this;
                    float f2 = storyViewer6.swipeToDismissHorizontalOffset;
                    if (f2 == 0.0f) {
                        storyViewer6.swipeToDismissHorizontalDirection = -fFloatValue;
                    }
                    if ((fFloatValue < 0.0f && storyViewer6.swipeToDismissHorizontalDirection > 0.0f) || (fFloatValue > 0.0f && storyViewer6.swipeToDismissHorizontalDirection < 0.0f)) {
                        fFloatValue *= 0.2f;
                    }
                    storyViewer6.swipeToDismissHorizontalOffset = f2 - fFloatValue;
                    storyViewer6.updateProgressToDismiss();
                    StoryViewer storyViewer7 = StoryViewer.this;
                    float f3 = storyViewer7.swipeToDismissHorizontalOffset;
                    if ((f3 > 0.0f && storyViewer7.swipeToDismissHorizontalDirection < 0.0f) || (f3 < 0.0f && storyViewer7.swipeToDismissHorizontalDirection > 0.0f)) {
                        storyViewer7.swipeToDismissHorizontalOffset = 0.0f;
                    }
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if (currentPeerView != null) {
                StoryViewer storyViewer8 = StoryViewer.this;
                if (storyViewer8.selfStoriesViewsOffset == 0.0f && !storyViewer8.inSwipeToDissmissMode && !storyViewer8.isCaption && !StoryViewer.this.isRecording) {
                    StoryViewer storyViewer9 = StoryViewer.this;
                    if (storyViewer9.storiesViewPager.currentState != 1) {
                        AndroidUtilities.getViewPositionInParent(currentPeerView.storyContainer, this, storyViewer9.pointPosition);
                        float[] fArr = StoryViewer.this.pointPosition;
                        motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                        StoryViewer.this.storiesViewPager.getCurrentPeerView().checkPinchToZoom(motionEvent);
                        float[] fArr2 = StoryViewer.this.pointPosition;
                        motionEvent.offsetLocation(fArr2[0], fArr2[1]);
                    }
                }
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.lastX.clear();
            } else {
                for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                    this.lastX.put(motionEvent.getPointerId(i), Float.valueOf(motionEvent.getX(i)));
                }
            }
            if (z2) {
                return true;
            }
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                StoryViewer storyViewer10 = StoryViewer.this;
                if (storyViewer10.selfStoriesViewsOffset != 0.0f && !storyViewer10.flingCalled && StoryViewer.this.realKeyboardHeight < AndroidUtilities.dp(20.0f)) {
                    StoryViewer storyViewer11 = StoryViewer.this;
                    storyViewer11.cancelSwipeToViews(storyViewer11.selfStoryViewsView.progressToOpen > 0.5f);
                }
                PeerStoriesView currentPeerView2 = StoryViewer.this.getCurrentPeerView();
                if (currentPeerView2 != null) {
                    currentPeerView2.cancelTouch();
                }
            }
            if (z) {
                StoryViewer storyViewer12 = StoryViewer.this;
                if (!storyViewer12.swipeToReplyWaitingKeyboard) {
                    storyViewer12.cancelSwipeToReply();
                }
            }
            return zDispatchTouchEvent || (StoryViewer.animationInProgress && StoryViewer.this.isInTouchMode);
        }

        public static void $r8$lambda$rmcqNVnyoA3RAkYXq1VJHTzEwcA(AnonymousClass2 anonymousClass2, ValueAnimator valueAnimator) {
            StoryViewer.this.swipeToDismissHorizontalOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            StoryViewer.this.updateProgressToDismiss();
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            LiveCommentsView liveCommentsView;
            VideoPlayerHolder videoPlayerHolder;
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope;
            PeerStoriesView currentPeerView;
            PeerStoriesView.StoryItemHolder storyItemHolder;
            TL_stories.StoryItem storyItem;
            TLRPC.MessageMedia messageMedia;
            TLRPC.Document document;
            boolean z;
            boolean z2;
            LiveCommentsView liveCommentsView2;
            if (motionEvent.getAction() == 0 && StoryViewer.this.progressToOpen == 1.0f) {
                float x = motionEvent.getX();
                this.lastTouchX = x;
                this.startX = x;
                this.startY = motionEvent.getY();
                StoryViewer storyViewer = StoryViewer.this;
                storyViewer.verticalScrollDetected = false;
                if (storyViewer.isRecording) {
                    z = false;
                } else {
                    StoryViewer storyViewer2 = StoryViewer.this;
                    if (storyViewer2.findClickableView(storyViewer2.windowView, motionEvent.getX(), motionEvent.getY(), false)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                storyViewer.allowIntercept = z;
                StoryViewer storyViewer3 = StoryViewer.this;
                if (storyViewer3.isRecording) {
                    z2 = false;
                } else {
                    StoryViewer storyViewer4 = StoryViewer.this;
                    if (storyViewer4.findClickableView(storyViewer4.windowView, motionEvent.getX(), motionEvent.getY(), true)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                storyViewer3.allowSwipeToDissmiss = z2;
                StoryViewer storyViewer5 = StoryViewer.this;
                storyViewer5.setInTouchMode(storyViewer5.allowIntercept && !storyViewer5.isCaptionPartVisible);
                PeerStoriesView currentPeerView2 = StoryViewer.this.getCurrentPeerView();
                if (StoryViewer.this.allowIntercept && currentPeerView2 != null && (liveCommentsView2 = currentPeerView2.liveCommentsView) != null) {
                    liveCommentsView2.setAllowTouches(false);
                }
                StoryViewer storyViewer6 = StoryViewer.this;
                if (storyViewer6.allowIntercept && !storyViewer6.isRecording && StoryViewer.this.isCaptionPartVisible) {
                    StoryViewer.this.delayedTapRunnable = new Runnable() {
                        @Override
                        public final void run() {
                            StoryViewer.this.setInTouchMode(true);
                        }
                    };
                    AndroidUtilities.runOnUIThread(StoryViewer.this.delayedTapRunnable, 150L);
                }
                StoryViewer storyViewer7 = StoryViewer.this;
                if (storyViewer7.allowIntercept && !storyViewer7.keyboardVisible && !storyViewer7.isRecording && !StoryViewer.this.isInTextSelectionMode) {
                    AndroidUtilities.runOnUIThread(StoryViewer.this.longPressRunnable, 400L);
                }
            } else if (motionEvent.getAction() == 2) {
                float fAbs = Math.abs(this.startY - motionEvent.getY());
                float fAbs2 = Math.abs(this.startX - motionEvent.getX());
                StoryViewer storyViewer8 = StoryViewer.this;
                if (storyViewer8.isLongpressed && storyViewer8.inSeekingMode && !storyViewer8.isInPinchToZoom) {
                    StoryViewer storyViewer9 = StoryViewer.this;
                    if (!storyViewer9.inSwipeToDissmissMode && (videoPlayerSharedScope = storyViewer9.currentPlayerScope) != null && videoPlayerSharedScope.player != null && (currentPeerView = storyViewer9.storiesViewPager.getCurrentPeerView()) != null && (storyItemHolder = currentPeerView.currentStory) != null && storyItemHolder.uploadingStory == null && storyItemHolder.isVideo()) {
                        long documentDuration = currentPeerView.videoDuration;
                        if (documentDuration <= 0 && (storyItem = currentPeerView.currentStory.storyItem) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                            documentDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                        }
                        if (documentDuration > 0) {
                            float x2 = motionEvent.getX();
                            VideoPlayerHolder videoPlayerHolder2 = StoryViewer.this.currentPlayerScope.player;
                            if (((int) (videoPlayerHolder2.seek((x2 - this.lastTouchX) / AndroidUtilities.dp(220.0f), documentDuration) * 10.0f)) != ((int) (videoPlayerHolder2.currentSeek * 10.0f))) {
                                try {
                                    currentPeerView.performHapticFeedback(9, 1);
                                } catch (Exception unused) {
                                }
                            }
                            currentPeerView.storyContainer.invalidate();
                            this.lastTouchX = x2;
                        }
                    }
                }
                if (fAbs > fAbs2) {
                    StoryViewer storyViewer10 = StoryViewer.this;
                    if (!storyViewer10.inSeekingMode && !storyViewer10.verticalScrollDetected && fAbs > AndroidUtilities.touchSlop * 2.0f) {
                        storyViewer10.verticalScrollDetected = true;
                    }
                }
                StoryViewer storyViewer11 = StoryViewer.this;
                if (!storyViewer11.inSwipeToDissmissMode && !storyViewer11.inSeekingMode && !storyViewer11.keyboardVisible && storyViewer11.allowSwipeToDissmiss) {
                    if (fAbs > fAbs2 && fAbs > AndroidUtilities.touchSlop * 2.0f) {
                        storyViewer11.inSwipeToDissmissMode = true;
                        PeerStoriesView currentPeerView3 = storyViewer11.storiesViewPager.getCurrentPeerView();
                        if (currentPeerView3 != null) {
                            currentPeerView3.cancelTextSelection();
                        }
                        boolean z3 = currentPeerView3 != null && currentPeerView3.viewsAllowed();
                        StoryViewer storyViewer12 = StoryViewer.this;
                        storyViewer12.allowSwipeToReply = (z3 || currentPeerView3 == null || currentPeerView3.isChannel || currentPeerView3.isPremiumBlocked || storyViewer12.storiesIntro != null) ? false : true;
                        StoryViewer storyViewer13 = StoryViewer.this;
                        storyViewer13.allowSelfStoriesView = z3 && !currentPeerView3.unsupported && currentPeerView3.currentStory.storyItem != null && storyViewer13.storiesIntro == null;
                        StoryViewer storyViewer14 = StoryViewer.this;
                        if (storyViewer14.allowSelfStoriesView && this.keyboardHeight != 0) {
                            storyViewer14.allowSelfStoriesView = false;
                        }
                        if (storyViewer14.allowSelfStoriesView) {
                            storyViewer14.checkSelfStoriesView();
                        }
                        StoryViewer storyViewer15 = StoryViewer.this;
                        storyViewer15.swipeToReplyOffset = 0.0f;
                        if (storyViewer15.delayedTapRunnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(StoryViewer.this.delayedTapRunnable);
                            StoryViewer.this.delayedTapRunnable.run();
                            StoryViewer.this.delayedTapRunnable = null;
                        }
                        AndroidUtilities.cancelRunOnUIThread(StoryViewer.this.longPressRunnable);
                    }
                    StoryViewer.this.layoutAndFindView();
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(StoryViewer.this.longPressRunnable);
                if (StoryViewer.this.delayedTapRunnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(StoryViewer.this.delayedTapRunnable);
                    StoryViewer.this.delayedTapRunnable = null;
                }
                StoryViewer.this.setInTouchMode(false);
                StoryViewer storyViewer16 = StoryViewer.this;
                storyViewer16.verticalScrollDetected = false;
                storyViewer16.inSeekingMode = false;
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope2 = storyViewer16.currentPlayerScope;
                if (videoPlayerSharedScope2 != null && (videoPlayerHolder = videoPlayerSharedScope2.player) != null) {
                    videoPlayerHolder.setSeeking(false);
                }
                PeerStoriesView currentPeerView4 = StoryViewer.this.getCurrentPeerView();
                if (currentPeerView4 != null && (liveCommentsView = currentPeerView4.liveCommentsView) != null) {
                    liveCommentsView.setAllowTouches(true);
                }
            }
            StoryViewer storyViewer17 = StoryViewer.this;
            SelfStoryViewsView selfStoryViewsView = storyViewer17.selfStoryViewsView;
            boolean z4 = selfStoryViewsView != null && selfStoryViewsView.progressToOpen == 1.0f;
            if (!storyViewer17.inSwipeToDissmissMode && !z4) {
                storyViewer17.gestureDetector.onTouchEvent(motionEvent);
            }
            return StoryViewer.this.inSwipeToDissmissMode || super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            LiveCommentsView liveCommentsView;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                StoryViewer storyViewer = StoryViewer.this;
                storyViewer.inSwipeToDissmissMode = false;
                storyViewer.setInTouchMode(false);
                StoryViewer storyViewer2 = StoryViewer.this;
                if (storyViewer2.progressToDismiss < 1.0f) {
                    if (!storyViewer2.isClosed) {
                        StoryViewer storyViewer3 = StoryViewer.this;
                        storyViewer3.swipeToDissmissBackAnimator = ValueAnimator.ofFloat(storyViewer3.swipeToDismissOffset, 0.0f);
                        StoryViewer.this.swipeToDissmissBackAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                StoryViewer.AnonymousClass2.$r8$lambda$vG0uurpLutPs1BAJ_19DAxzF2Ls(this.f$0, valueAnimator);
                            }
                        });
                        StoryViewer.this.swipeToDissmissBackAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                StoryViewer storyViewer4 = StoryViewer.this;
                                storyViewer4.swipeToDismissOffset = 0.0f;
                                storyViewer4.swipeToReplyOffset = 0.0f;
                                storyViewer4.updateProgressToDismiss();
                            }
                        });
                        StoryViewer.this.swipeToDissmissBackAnimator.setDuration(150L);
                        StoryViewer.this.swipeToDissmissBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        StoryViewer.this.swipeToDissmissBackAnimator.start();
                    }
                } else {
                    storyViewer2.close(true);
                }
                PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                if (currentPeerView != null && (liveCommentsView = currentPeerView.liveCommentsView) != null) {
                    liveCommentsView.setAllowTouches(true);
                }
            }
            StoryViewer storyViewer4 = StoryViewer.this;
            if (!storyViewer4.inSwipeToDissmissMode && !storyViewer4.keyboardVisible && storyViewer4.swipeToReplyOffset == 0.0f && ((storyViewer4.selfStoriesViewsOffset == 0.0f || (!storyViewer4.allowIntercept && !storyViewer4.verticalScrollDetected)) && !storyViewer4.isInTextSelectionMode)) {
                return false;
            }
            StoryViewer.this.gestureDetector.onTouchEvent(motionEvent);
            return true;
        }

        public static void $r8$lambda$vG0uurpLutPs1BAJ_19DAxzF2Ls(AnonymousClass2 anonymousClass2, ValueAnimator valueAnimator) {
            StoryViewer.this.swipeToDismissOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            StoryViewer.this.updateProgressToDismiss();
        }

        @Override
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            if (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) {
                StoryViewer.this.dispatchVolumeEvent(keyEvent);
                return true;
            }
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                StoryViewer.this.onAttachedBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            StoryViewer storyViewer = StoryViewer.this;
            if (storyViewer.ATTACH_TO_FRAGMENT && !storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
                AndroidUtilities.requestAdjustResize(this.val$fragment.getParentActivity(), this.val$fragment.getClassGuid());
            }
            Bulletin.addDelegate(this, new Bulletin.Delegate() {
                float[] position = new float[2];

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
                    PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                    if (currentPeerView == null) {
                        return 0;
                    }
                    AndroidUtilities.getViewPositionInParent(currentPeerView.storyContainer, StoryViewer.this.windowView, this.position);
                    return (int) (AnonymousClass2.this.getMeasuredHeight() - (this.position[1] + currentPeerView.storyContainer.getMeasuredHeight()));
                }
            });
            NotificationCenter.getInstance(StoryViewer.this.currentAccount).addObserver(StoryViewer.this, NotificationCenter.storiesListUpdated);
            NotificationCenter.getInstance(StoryViewer.this.currentAccount).addObserver(StoryViewer.this, NotificationCenter.storiesUpdated);
            NotificationCenter.getInstance(StoryViewer.this.currentAccount).addObserver(StoryViewer.this, NotificationCenter.articleClosed);
            NotificationCenter.getInstance(StoryViewer.this.currentAccount).addObserver(StoryViewer.this, NotificationCenter.openArticle);
            NotificationCenter.getInstance(StoryViewer.this.currentAccount).addObserver(StoryViewer.this, NotificationCenter.storyDeleted);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
            NotificationCenter.getInstance(StoryViewer.this.currentAccount).removeObserver(StoryViewer.this, NotificationCenter.storiesListUpdated);
            NotificationCenter.getInstance(StoryViewer.this.currentAccount).removeObserver(StoryViewer.this, NotificationCenter.storiesUpdated);
            NotificationCenter.getInstance(StoryViewer.this.currentAccount).removeObserver(StoryViewer.this, NotificationCenter.articleClosed);
            NotificationCenter.getInstance(StoryViewer.this.currentAccount).removeObserver(StoryViewer.this, NotificationCenter.openArticle);
            NotificationCenter.getInstance(StoryViewer.this.currentAccount).removeObserver(StoryViewer.this, NotificationCenter.storyDeleted);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            ((FrameLayout.LayoutParams) StoryViewer.this.volumeControl.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
            StoryViewer.this.volumeControl.getLayoutParams().height = AndroidUtilities.dp(2.0f);
            super.onMeasure(i, i2);
        }
    }

    class AnonymousClass5 implements PeerStoriesView.Delegate {
        final Context val$context;
        final ArrayList val$peerIds;
        final StoriesController.StoriesList val$storiesList;

        AnonymousClass5(StoriesController.StoriesList storiesList, ArrayList arrayList, Context context) {
            this.val$storiesList = storiesList;
            this.val$peerIds = arrayList;
            this.val$context = context;
        }

        @Override
        public void onPeerSelected(long j, int i) {
            StoryViewer storyViewer = StoryViewer.this;
            if (storyViewer.lastPosition == i && storyViewer.lastDialogId == j) {
                return;
            }
            storyViewer.lastDialogId = j;
            storyViewer.lastPosition = i;
        }

        @Override
        public void shouldSwitchToNext() {
            if (StoryViewer.this.storiesViewPager.getCurrentPeerView().switchToNext(true) || StoryViewer.this.storiesViewPager.switchToNext(true)) {
                return;
            }
            StoryViewer.this.close(true);
        }

        @Override
        public void switchToNextAndRemoveCurrentPeer() {
            if (this.val$storiesList != null) {
                if (StoryViewer.this.storiesViewPager.days == null) {
                    return;
                }
                final ArrayList arrayList = new ArrayList(StoryViewer.this.storiesViewPager.days);
                int iIndexOf = StoryViewer.this.storiesViewPager.getCurrentPeerView() == null ? -1 : arrayList.indexOf(StoryViewer.this.storiesViewPager.getCurrentPeerView().getCurrentDay());
                if (iIndexOf >= 0) {
                    arrayList.remove(iIndexOf);
                    if (!StoryViewer.this.storiesViewPager.switchToNext(true)) {
                        StoryViewer.this.close(false);
                        return;
                    }
                    StoriesViewPager storiesViewPager = StoryViewer.this.storiesViewPager;
                    final StoriesController.StoriesList storiesList = this.val$storiesList;
                    storiesViewPager.onNextIdle(new Runnable() {
                        @Override
                        public final void run() {
                            StoryViewer.AnonymousClass5.m4461$r8$lambda$69d_Nv_lynm13eWuzkoM9A_Hwk(this.f$0, storiesList, arrayList);
                        }
                    });
                    return;
                }
                StoryViewer.this.close(false);
                return;
            }
            final ArrayList arrayList2 = new ArrayList(this.val$peerIds);
            final int iIndexOf2 = arrayList2.indexOf(Long.valueOf(StoryViewer.this.storiesViewPager.getCurrentPeerView().getCurrentPeer()));
            if (iIndexOf2 >= 0) {
                arrayList2.remove(iIndexOf2);
                if (!StoryViewer.this.storiesViewPager.switchToNext(true)) {
                    StoryViewer.this.close(false);
                    return;
                } else {
                    StoryViewer.this.storiesViewPager.onNextIdle(new Runnable() {
                        @Override
                        public final void run() {
                            StoryViewer.AnonymousClass5.$r8$lambda$sdryZaIkuZ5iArIDmtzEbzDoPCk(this.f$0, arrayList2, iIndexOf2);
                        }
                    });
                    return;
                }
            }
            StoryViewer.this.close(false);
        }

        public static void m4461$r8$lambda$69d_Nv_lynm13eWuzkoM9A_Hwk(AnonymousClass5 anonymousClass5, StoriesController.StoriesList storiesList, ArrayList arrayList) {
            StoryViewer storyViewer = StoryViewer.this;
            storyViewer.storiesViewPager.setDays(storiesList.dialogId, arrayList, storyViewer.currentAccount);
        }

        public static void $r8$lambda$sdryZaIkuZ5iArIDmtzEbzDoPCk(AnonymousClass5 anonymousClass5, ArrayList arrayList, int i) {
            StoryViewer storyViewer = StoryViewer.this;
            storyViewer.storiesViewPager.setPeerIds(arrayList, storyViewer.currentAccount, i);
        }

        @Override
        public void setHideEnterViewProgress(float f) {
            if (StoryViewer.this.hideEnterViewProgress != f) {
                StoryViewer.this.hideEnterViewProgress = f;
                StoryViewer.this.containerView.invalidate();
            }
        }

        @Override
        public void showDialog(Dialog dialog) {
            StoryViewer.this.showDialog(dialog);
        }

        @Override
        public boolean releasePlayer(Runnable runnable) {
            VideoPlayerHolder videoPlayerHolder = StoryViewer.this.playerHolder;
            if (videoPlayerHolder == null) {
                return false;
            }
            boolean zRelease = videoPlayerHolder.release(runnable);
            StoryViewer.this.playerHolder = null;
            return zRelease;
        }

        @Override
        public void requestAdjust(boolean z) {
            StoryViewer.this.requestAdjust(z);
        }

        @Override
        public void setKeyboardVisible(boolean z) {
            StoryViewer storyViewer = StoryViewer.this;
            if (storyViewer.keyboardVisible != z) {
                storyViewer.keyboardVisible = z;
                storyViewer.updatePlayingMode();
            }
        }

        @Override
        public void setAllowTouchesByViewPager(boolean z) {
            StoryViewer storyViewer = StoryViewer.this;
            storyViewer.allowTouchesByViewpager = storyViewer.allowTouchesByViewpager;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public void requestPlayer(TL_stories.StoryItem storyItem, long j, int i, boolean z, TLRPC.InputGroupCall inputGroupCall, PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope) {
            switchToLive(true, true);
            LivePlayer livePlayer = StoryViewer.this.livePlayer;
            if (livePlayer != null && livePlayer.dialogId == j && livePlayer.equals(inputGroupCall)) {
                return;
            }
            LivePlayerView livePlayerView = StoryViewer.this.liveView;
            if (livePlayerView != null) {
                livePlayerView.setScope(j, null);
                StoryViewer.this.liveView.reset();
            }
            if (LiveStoryPipOverlay.isVisible() && LiveStoryPipOverlay.getLivePlayer() != null && LiveStoryPipOverlay.getLivePlayer().equals(inputGroupCall)) {
                StoryViewer.this.livePlayer = LiveStoryPipOverlay.takeLivePlayer();
                LiveStoryPipOverlay.dismiss(false);
            } else {
                LivePlayer livePlayer2 = StoryViewer.this.livePlayer;
                if (livePlayer2 != null) {
                    if (livePlayer2.outgoing || LiveStoryPipOverlay.isVisible(livePlayer2)) {
                        if (StoryViewer.this.livePlayer.getDisplaySink() == StoryViewer.this.liveView.getSink()) {
                            return;
                        } else {
                            StoryViewer.this.livePlayer.setDisplaySink(null);
                        }
                    } else {
                        StoryViewer.this.livePlayer.destroy();
                    }
                    StoryViewer.this.livePlayer = null;
                }
            }
            if (LiveStoryPipOverlay.isVisible()) {
                LiveStoryPipOverlay.dismiss();
            }
            VideoPlayerHolder videoPlayerHolder = StoryViewer.this.playerHolder;
            if (videoPlayerHolder != null) {
                videoPlayerHolder.release(null);
                StoryViewer.this.playerHolder = null;
            }
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope2 = StoryViewer.this.currentPlayerScope;
            if (videoPlayerSharedScope2 != null) {
                videoPlayerSharedScope2.player = null;
                videoPlayerSharedScope2.livePlayer = null;
                videoPlayerSharedScope2.firstFrameRendered = false;
                videoPlayerSharedScope2.renderView = null;
                videoPlayerSharedScope2.textureView = null;
                videoPlayerSharedScope2.surfaceView = null;
                videoPlayerSharedScope2.invalidate();
                StoryViewer.this.currentPlayerScope = null;
            }
            if (StoryViewer.this.livePlayer == null) {
                LivePlayer livePlayer3 = LivePlayer.recording;
                if (livePlayer3 != null && livePlayer3.equals(inputGroupCall)) {
                    StoryViewer.this.livePlayer = LivePlayer.recording;
                } else {
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.livePlayer = new LivePlayer(this.val$context, storyViewer.currentAccount, storyItem, j, i, z, inputGroupCall);
                }
            }
            StoryViewer storyViewer2 = StoryViewer.this;
            LivePlayerView livePlayerView2 = storyViewer2.pipLiveView;
            if (livePlayerView2 != null) {
                storyViewer2.livePlayer.setDisplaySink(livePlayerView2.getSink());
            } else {
                storyViewer2.livePlayer.setDisplaySink(storyViewer2.liveView.getSink());
            }
            StoryViewer storyViewer3 = StoryViewer.this;
            storyViewer3.currentPlayerScope = videoPlayerSharedScope;
            videoPlayerSharedScope.firstFrameRendered = false;
            videoPlayerSharedScope.renderView = storyViewer3.aspectRatioFrameLayout;
            LivePlayerView livePlayerView3 = storyViewer3.liveView;
            videoPlayerSharedScope.textureView = livePlayerView3.textureView;
            videoPlayerSharedScope.surfaceView = livePlayerView3.surfaceView;
            videoPlayerSharedScope.livePlayer = storyViewer3.livePlayer;
            livePlayerView3.setScope(j, videoPlayerSharedScope);
            StoryViewer.this.currentPlayerScope.invalidate();
        }

        @Override
        public void requestPlayer(TLRPC.Document document, Uri uri, long j, PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope) {
            long j2;
            StoryViewer storyViewer;
            VideoPlayerHolder videoPlayerHolder;
            if (!StoryViewer.this.isClosed) {
                StoryViewer storyViewer2 = StoryViewer.this;
                if (storyViewer2.progressToOpen >= 0.9f) {
                    Uri uri2 = storyViewer2.lastUri;
                    boolean zEquals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
                    if (!zEquals || (videoPlayerHolder = (storyViewer = StoryViewer.this).playerHolder) == null) {
                        StoryViewer storyViewer3 = StoryViewer.this;
                        storyViewer3.lastUri = uri;
                        LivePlayerView livePlayerView = storyViewer3.liveView;
                        if (livePlayerView != null) {
                            livePlayerView.setScope(0L, null);
                        }
                        LivePlayer livePlayer = StoryViewer.this.livePlayer;
                        if (livePlayer != null) {
                            if (livePlayer.outgoing) {
                                livePlayer.setDisplaySink(null);
                            } else {
                                livePlayer.destroy();
                            }
                            StoryViewer.this.livePlayer = null;
                        }
                        VideoPlayerHolder videoPlayerHolder2 = StoryViewer.this.playerHolder;
                        if (videoPlayerHolder2 != null) {
                            videoPlayerHolder2.release(null);
                            StoryViewer.this.playerHolder = null;
                        }
                        PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope2 = StoryViewer.this.currentPlayerScope;
                        if (videoPlayerSharedScope2 != null) {
                            videoPlayerSharedScope2.player = null;
                            videoPlayerSharedScope2.livePlayer = null;
                            videoPlayerSharedScope2.firstFrameRendered = false;
                            videoPlayerSharedScope2.renderView = null;
                            videoPlayerSharedScope2.textureView = null;
                            videoPlayerSharedScope2.surfaceView = null;
                            videoPlayerSharedScope2.invalidate();
                            StoryViewer.this.currentPlayerScope = null;
                        }
                        if (uri != null) {
                            StoryViewer.this.currentPlayerScope = videoPlayerSharedScope;
                            for (int i = 0; i < StoryViewer.this.preparedPlayers.size(); i++) {
                                if (((VideoPlayerHolder) StoryViewer.this.preparedPlayers.get(i)).uri.equals(uri)) {
                                    StoryViewer storyViewer4 = StoryViewer.this;
                                    storyViewer4.playerHolder = (VideoPlayerHolder) storyViewer4.preparedPlayers.remove(i);
                                    break;
                                }
                            }
                            StoryViewer storyViewer5 = StoryViewer.this;
                            if (storyViewer5.playerHolder == null) {
                                storyViewer5.playerHolder = storyViewer5.new VideoPlayerHolder(storyViewer5.surfaceView, StoryViewer.this.textureView);
                                StoryViewer.this.playerHolder.document = document;
                            }
                            VideoPlayerHolder videoPlayerHolder3 = StoryViewer.this.playerHolder;
                            videoPlayerHolder3.uri = uri;
                            videoPlayerHolder3.setSpeed(StoryViewer.currentSpeed);
                            StoryViewer storyViewer6 = StoryViewer.this;
                            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope3 = storyViewer6.currentPlayerScope;
                            videoPlayerSharedScope3.player = storyViewer6.playerHolder;
                            videoPlayerSharedScope3.firstFrameRendered = false;
                            videoPlayerSharedScope3.renderView = storyViewer6.aspectRatioFrameLayout;
                            videoPlayerSharedScope3.textureView = storyViewer6.textureView;
                            StoryViewer storyViewer7 = StoryViewer.this;
                            storyViewer7.currentPlayerScope.surfaceView = storyViewer7.surfaceView;
                            StoryViewer storyViewer8 = StoryViewer.this;
                            storyViewer8.currentPlayerScope.livePlayer = null;
                            FileStreamLoadOperation.setPriorityForDocument(storyViewer8.playerHolder.document, 3);
                            FileLoader.getInstance(StoryViewer.this.currentAccount).changePriority(3, StoryViewer.this.playerHolder.document, null, null, null, null, null);
                            if (j != 0 || StoryViewer.this.playerSavedPosition == 0) {
                                j2 = j;
                            } else {
                                long j3 = StoryViewer.this.playerSavedPosition;
                                StoryViewer.this.currentPlayerScope.firstFrameRendered = true;
                                j2 = j3;
                            }
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            StoryViewer storyViewer9 = StoryViewer.this;
                            storyViewer9.currentPlayerScope.player.start(false, storyViewer9.isPaused(), uri, j2, StoryViewer.isInSilentMode, StoryViewer.currentSpeed);
                            StoryViewer.this.currentPlayerScope.invalidate();
                        } else {
                            FileLog.d("StoryViewer requestPlayer: url is null (1)");
                        }
                    } else if (zEquals) {
                        storyViewer.currentPlayerScope = videoPlayerSharedScope;
                        videoPlayerSharedScope.player = videoPlayerHolder;
                        videoPlayerSharedScope.livePlayer = null;
                        videoPlayerHolder.setSpeed(StoryViewer.currentSpeed);
                        StoryViewer storyViewer10 = StoryViewer.this;
                        PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope4 = storyViewer10.currentPlayerScope;
                        videoPlayerSharedScope4.firstFrameRendered = storyViewer10.playerHolder.firstFrameRendered;
                        videoPlayerSharedScope4.renderView = storyViewer10.aspectRatioFrameLayout;
                        videoPlayerSharedScope4.textureView = storyViewer10.textureView;
                        StoryViewer storyViewer11 = StoryViewer.this;
                        storyViewer11.currentPlayerScope.surfaceView = storyViewer11.surfaceView;
                        FileLog.d("StoryViewer requestPlayer: same url");
                    }
                    switchToLive(false, uri != null);
                    StoryViewer.this.playerSavedPosition = 0L;
                    StoryViewer.this.updatePlayingMode();
                    return;
                }
            }
            LivePlayerView livePlayerView2 = StoryViewer.this.liveView;
            if (livePlayerView2 != null) {
                livePlayerView2.setScope(0L, null);
            }
            LivePlayer livePlayer2 = StoryViewer.this.livePlayer;
            if (livePlayer2 != null) {
                if (livePlayer2.outgoing) {
                    livePlayer2.setDisplaySink(null);
                } else {
                    livePlayer2.destroy();
                }
                StoryViewer.this.livePlayer = null;
            }
            FileLog.d("StoryViewer requestPlayer ignored, because closed: " + StoryViewer.this.isClosed + ", " + StoryViewer.this.progressToOpen);
            videoPlayerSharedScope.firstFrameRendered = false;
            videoPlayerSharedScope.player = null;
            videoPlayerSharedScope.livePlayer = null;
        }

        private void switchToLive(boolean z, boolean z2) {
            int i;
            LivePlayerView livePlayerView = StoryViewer.this.liveView;
            if (livePlayerView != null) {
                livePlayerView.setVisibility(z ? 0 : 8);
            }
            if (StoryViewer.this.surfaceView != null) {
                SurfaceView surfaceView = StoryViewer.this.surfaceView;
                if (z) {
                    i = 8;
                } else {
                    i = z2 ? 0 : 4;
                }
                surfaceView.setVisibility(i);
            }
            if (StoryViewer.this.textureView != null) {
                StoryViewer.this.textureView.setVisibility(z ? 8 : 0);
            }
        }

        @Override
        public boolean isClosed() {
            return StoryViewer.this.isClosed;
        }

        @Override
        public float getProgressToDismiss() {
            return StoryViewer.this.progressToDismiss;
        }

        @Override
        public void setIsRecording(boolean z) {
            StoryViewer.this.isRecording = z;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public void setIsWaiting(boolean z) {
            StoryViewer.this.isWaiting = z;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public void setIsCaption(boolean z) {
            StoryViewer.this.isCaption = z;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public void setIsCaptionPartVisible(boolean z) {
            StoryViewer.this.isCaptionPartVisible = z;
        }

        @Override
        public void setPopupIsVisible(boolean z) {
            StoryViewer.this.isPopupVisible = z;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public void setTranslating(boolean z) {
            StoryViewer storyViewer = StoryViewer.this;
            storyViewer.isTranslating = z;
            storyViewer.updatePlayingMode();
        }

        @Override
        public void setBulletinIsVisible(boolean z) {
            StoryViewer.this.isBulletinVisible = z;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public void setIsInPinchToZoom(boolean z) {
            VideoPlayerHolder videoPlayerHolder;
            if (!StoryViewer.this.isInPinchToZoom && z) {
                StoryViewer storyViewer = StoryViewer.this;
                if (storyViewer.inSeekingMode) {
                    storyViewer.inSeekingMode = false;
                    PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = storyViewer.currentPlayerScope;
                    if (videoPlayerSharedScope != null && (videoPlayerHolder = videoPlayerSharedScope.player) != null) {
                        videoPlayerHolder.setSeeking(false);
                    }
                    PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                    if (currentPeerView != null) {
                        currentPeerView.invalidate();
                    }
                }
            }
            StoryViewer.this.isInPinchToZoom = z;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public void setIsHintVisible(boolean z) {
            StoryViewer.this.isHintVisible = z;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public void setIsSwiping(boolean z) {
            StoryViewer.this.isSwiping = z;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public void setIsInSelectionMode(boolean z) {
            StoryViewer.this.isInTextSelectionMode = z;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public void setIsLikesReaction(boolean z) {
            StoryViewer.this.isLikesReactions = z;
            StoryViewer.this.updatePlayingMode();
        }

        @Override
        public int getKeyboardHeight() {
            return StoryViewer.this.realKeyboardHeight;
        }

        @Override
        public void preparePlayer(ArrayList arrayList, ArrayList arrayList2) {
            if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers() && !StoryViewer.this.isClosed) {
                for (int i = 0; i < StoryViewer.this.preparedPlayers.size(); i++) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        if (((Uri) arrayList2.get(i2)).equals(((VideoPlayerHolder) StoryViewer.this.preparedPlayers.get(i)).uri)) {
                            arrayList2.remove(i2);
                        }
                    }
                }
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    Uri uri = (Uri) arrayList2.get(i3);
                    StoryViewer storyViewer = StoryViewer.this;
                    final VideoPlayerHolder videoPlayerHolder = storyViewer.new VideoPlayerHolder(storyViewer.surfaceView, StoryViewer.this.textureView);
                    videoPlayerHolder.setOnSeekUpdate(new Runnable() {
                        @Override
                        public final void run() {
                            StoryViewer.AnonymousClass5.$r8$lambda$zsUloioDTSIbpjF3hjh6zQKfFVI(this.f$0, videoPlayerHolder);
                        }
                    });
                    videoPlayerHolder.uri = uri;
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i3);
                    videoPlayerHolder.document = document;
                    FileStreamLoadOperation.setPriorityForDocument(document, 0);
                    videoPlayerHolder.preparePlayer(uri, StoryViewer.isInSilentMode, StoryViewer.currentSpeed);
                    StoryViewer.this.preparedPlayers.add(videoPlayerHolder);
                    if (StoryViewer.this.preparedPlayers.size() > 2) {
                        ((VideoPlayerHolder) StoryViewer.this.preparedPlayers.remove(0)).release(null);
                    }
                }
            }
        }

        public static void $r8$lambda$zsUloioDTSIbpjF3hjh6zQKfFVI(AnonymousClass5 anonymousClass5, VideoPlayerHolder videoPlayerHolder) {
            FrameLayout frameLayout;
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope;
            PeerStoriesView currentPeerView = StoryViewer.this.storiesViewPager.getCurrentPeerView();
            if (currentPeerView == null || (frameLayout = currentPeerView.storyContainer) == null || (videoPlayerSharedScope = StoryViewer.this.currentPlayerScope) == null || videoPlayerSharedScope.player != videoPlayerHolder) {
                return;
            }
            frameLayout.invalidate();
        }
    }

    public static WindowInsetsCompat $r8$lambda$_3h4XxkHOOmj9g3cb3o7tWasEZs(StoryViewer storyViewer, View view, WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetBottom;
        storyViewer.getClass();
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) storyViewer.containerView.getLayoutParams();
        marginLayoutParams.topMargin = storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE ? 0 : windowInsetsCompat.getSystemWindowInsetTop();
        if (storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
            systemWindowInsetBottom = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        } else {
            systemWindowInsetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
        }
        marginLayoutParams.bottomMargin = systemWindowInsetBottom;
        marginLayoutParams.leftMargin = defaultWindowInsets.left;
        marginLayoutParams.rightMargin = defaultWindowInsets.right;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = storyViewer.windowView;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.requestLayout();
        }
        HwFrameLayout hwFrameLayout = storyViewer.containerView;
        if (hwFrameLayout != null) {
            hwFrameLayout.requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    public static void m4456$r8$lambda$bSfwY8okinijPMZpwEi4JWN80A(StoryViewer storyViewer) {
        storyViewer.getClass();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.onBackPressed();
        } else {
            storyViewer.onAttachedBackPressed();
        }
    }

    public void showKeyboard() {
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null && currentPeerView.showKeyboard()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.cancelSwipeToReply();
                }
            }, 200L);
        } else {
            cancelSwipeToReply();
        }
    }

    public void cancelSwipeToViews(final boolean z) {
        if (this.swipeToViewsAnimator != null) {
            return;
        }
        if (this.realKeyboardHeight != 0) {
            AndroidUtilities.hideKeyboard(this.selfStoryViewsView);
            return;
        }
        if (this.allowSelfStoriesView || this.selfStoriesViewsOffset != 0.0f) {
            this.locker.lock();
            if (!z) {
                float f = this.selfStoriesViewsOffset;
                SelfStoryViewsView selfStoryViewsView = this.selfStoryViewsView;
                float f2 = selfStoryViewsView.maxSelfStoriesViewsOffset;
                if (f == f2) {
                    float f3 = f2 - 1.0f;
                    this.selfStoriesViewsOffset = f3;
                    selfStoryViewsView.setOffset(f3);
                }
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.selfStoriesViewsOffset, z ? this.selfStoryViewsView.maxSelfStoriesViewsOffset : 0.0f);
            this.swipeToViewsAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StoryViewer.$r8$lambda$YGc42QLbS7TuBLvZpyxer6Zqe8k(this.f$0, valueAnimator);
                }
            });
            this.swipeToViewsAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    StoryViewer.this.locker.unlock();
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.selfStoriesViewsOffset = z ? storyViewer.selfStoryViewsView.maxSelfStoriesViewsOffset : 0.0f;
                    PeerStoriesView currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView();
                    if (currentPeerView != null) {
                        currentPeerView.invalidate();
                    }
                    StoryViewer.this.containerView.invalidate();
                    StoryViewer.this.swipeToViewsAnimator = null;
                }
            });
            if (z) {
                this.swipeToViewsAnimator.setDuration(350L);
                this.swipeToViewsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                this.swipeToViewsAnimator.setDuration(350L);
                this.swipeToViewsAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            }
            this.swipeToViewsAnimator.start();
        }
    }

    public static void $r8$lambda$YGc42QLbS7TuBLvZpyxer6Zqe8k(StoryViewer storyViewer, ValueAnimator valueAnimator) {
        storyViewer.getClass();
        storyViewer.selfStoriesViewsOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        storyViewer.containerView.invalidate();
    }

    public void checkSelfStoriesView() {
        if (this.selfStoryViewsView == null) {
            SelfStoryViewsView selfStoryViewsView = new SelfStoryViewsView(this.containerView.getContext(), this);
            this.selfStoryViewsView = selfStoryViewsView;
            this.containerView.addView(selfStoryViewsView, 0);
        }
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.storiesList != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.storiesList.messageObjects.size(); i++) {
                    arrayList.add(((MessageObject) this.storiesList.messageObjects.get(i)).storyItem);
                }
                this.selfStoryViewsView.setItems(this.storiesList.dialogId, arrayList, currentPeerView.getListPosition());
                return;
            }
            this.selfStoryViewsView.setItems(currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems(), currentPeerView.getSelectedPosition());
        }
    }

    @Override
    public boolean showDialog(Dialog dialog) {
        try {
            this.currentDialog = dialog;
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    StoryViewer.m4455$r8$lambda$HGErF3bXB4taP1Oqextz5fqh4Y(this.f$0, dialogInterface);
                }
            });
            dialog.show();
            updatePlayingMode();
            return true;
        } catch (Throwable th) {
            FileLog.e(th);
            this.currentDialog = null;
            return false;
        }
    }

    public static void m4455$r8$lambda$HGErF3bXB4taP1Oqextz5fqh4Y(StoryViewer storyViewer, DialogInterface dialogInterface) {
        if (dialogInterface == storyViewer.currentDialog) {
            storyViewer.currentDialog = null;
            storyViewer.updatePlayingMode();
        }
    }

    public boolean listenToAttachedSheet(BaseFragment.AttachedSheet attachedSheet) {
        this.currentSheet = attachedSheet;
        attachedSheet.setOnDismissListener(new Runnable() {
            @Override
            public final void run() {
                StoryViewer.m4459$r8$lambda$nC7Kz4po3qUAQF8j_z6tDPCVAI(this.f$0);
            }
        });
        return true;
    }

    public static void m4459$r8$lambda$nC7Kz4po3qUAQF8j_z6tDPCVAI(StoryViewer storyViewer) {
        storyViewer.currentSheet = null;
        storyViewer.updatePlayingMode();
    }

    public void cancelSwipeToReply() {
        if (this.swipeToReplyBackAnimator == null) {
            this.inSwipeToDissmissMode = false;
            this.allowSwipeToReply = false;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.swipeToReplyOffset, 0.0f);
            this.swipeToReplyBackAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StoryViewer.m4458$r8$lambda$gVXenKJy40BbqgaE5XHZktw7dE(this.f$0, valueAnimator);
                }
            });
            this.swipeToReplyBackAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.swipeToReplyBackAnimator = null;
                    storyViewer.swipeToReplyOffset = 0.0f;
                    storyViewer.swipeToReplyProgress = 0.0f;
                    StoriesViewPager storiesViewPager = storyViewer.storiesViewPager;
                    PeerStoriesView currentPeerView = storiesViewPager != null ? storiesViewPager.getCurrentPeerView() : null;
                    if (currentPeerView != null) {
                        currentPeerView.invalidate();
                    }
                }
            });
            this.swipeToReplyBackAnimator.setDuration(250L);
            this.swipeToReplyBackAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            this.swipeToReplyBackAnimator.start();
        }
    }

    public static void m4458$r8$lambda$gVXenKJy40BbqgaE5XHZktw7dE(StoryViewer storyViewer, ValueAnimator valueAnimator) {
        storyViewer.getClass();
        storyViewer.swipeToReplyOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        storyViewer.swipeToReplyProgress = Utilities.clamp(storyViewer.swipeToReplyOffset / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
        StoriesViewPager storiesViewPager = storyViewer.storiesViewPager;
        PeerStoriesView currentPeerView = storiesViewPager == null ? null : storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
    }

    public boolean getStoryRect(RectF rectF) {
        PeerStoriesView currentPeerView;
        StoriesViewPager storiesViewPager = this.storiesViewPager;
        if (storiesViewPager == null || (currentPeerView = storiesViewPager.getCurrentPeerView()) == null || currentPeerView.storyContainer == null) {
            return false;
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.windowView;
        float x = sizeNotifierFrameLayout == null ? 0.0f : sizeNotifierFrameLayout.getX();
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.windowView;
        float y = sizeNotifierFrameLayout2 != null ? sizeNotifierFrameLayout2.getY() : 0.0f;
        rectF.set(this.swipeToDismissHorizontalOffset + x + this.containerView.getLeft() + currentPeerView.getX() + currentPeerView.storyContainer.getX(), this.swipeToDismissOffset + y + this.containerView.getTop() + currentPeerView.getY() + currentPeerView.storyContainer.getY(), (((x + this.swipeToDismissHorizontalOffset) + this.containerView.getRight()) - (this.containerView.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - currentPeerView.storyContainer.getRight()), (((y + this.swipeToDismissOffset) + this.containerView.getBottom()) - (this.containerView.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - currentPeerView.storyContainer.getBottom()));
        return true;
    }

    public void switchByTap(boolean z) {
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.switchToNext(z)) {
            return;
        }
        if (this.storiesViewPager.switchToNext(z)) {
            this.storiesViewPager.lockTouchEvent(150L);
            return;
        }
        if (z) {
            close(true);
            return;
        }
        VideoPlayerHolder videoPlayerHolder = this.playerHolder;
        if (videoPlayerHolder != null) {
            videoPlayerHolder.loopBack();
        }
    }

    public PeerStoriesView getCurrentPeerView() {
        StoriesViewPager storiesViewPager = this.storiesViewPager;
        if (storiesViewPager == null) {
            return null;
        }
        return storiesViewPager.getCurrentPeerView();
    }

    private void lockOrientation(boolean z) {
        Activity activityFindActivity = AndroidUtilities.findActivity(this.fragment.getContext());
        if (activityFindActivity != null) {
            try {
                activityFindActivity.setRequestedOrientation(z ? 1 : -1);
            } catch (Exception unused) {
            }
            if (z) {
                activityFindActivity.getWindow().addFlags(128);
            } else {
                activityFindActivity.getWindow().clearFlags(128);
            }
        }
    }

    public void dispatchVolumeEvent(KeyEvent keyEvent) {
        if (isInSilentMode) {
            toggleSilentMode();
            return;
        }
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null && !currentPeerView.currentStory.hasSound() && currentPeerView.currentStory.isVideo()) {
            currentPeerView.showNoSoundHint(true);
        } else {
            this.volumeControl.onKeyDown(keyEvent.getKeyCode(), keyEvent);
        }
    }

    public void toggleSilentMode() {
        boolean z = isInSilentMode;
        isInSilentMode = !z;
        VideoPlayerHolder videoPlayerHolder = this.playerHolder;
        if (videoPlayerHolder != null) {
            videoPlayerHolder.setAudioEnabled(z, false);
        }
        for (int i = 0; i < this.preparedPlayers.size(); i++) {
            ((VideoPlayerHolder) this.preparedPlayers.get(i)).setAudioEnabled(!isInSilentMode, true);
        }
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.sharedResources.setIconMuted(!soundEnabled(), true);
        }
        if (isInSilentMode) {
            return;
        }
        this.volumeControl.unmute();
    }

    private void checkInSilentMode() {
        if (checkSilentMode) {
            checkSilentMode = false;
            isInSilentMode = ((AudioManager) this.windowView.getContext().getSystemService("audio")).getRingerMode() != 2;
        }
    }

    public void layoutAndFindView() {
        PeerStoriesView currentPeerView;
        int selectedPosition;
        this.foundViewToClose = true;
        ImageReceiver imageReceiver = this.transitionViewHolder.avatarImage;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = this.transitionViewHolder.storyImage;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            this.transitionViewHolder.storyImage.setVisible(true, true);
        }
        if (this.storiesList != null && (currentPeerView = this.storiesViewPager.getCurrentPeerView()) != null && (selectedPosition = currentPeerView.getSelectedPosition()) >= 0 && selectedPosition < this.storiesList.messageObjects.size()) {
            this.messageId = ((MessageObject) this.storiesList.messageObjects.get(selectedPosition)).getId();
        }
        if (this.placeProvider != null) {
            long currentDialogId = this.storiesViewPager.getCurrentDialogId();
            int i = this.messageId;
            if (this.storiesList instanceof StoriesController.StoryRepostsList) {
                PeerStoriesView currentPeerView2 = this.storiesViewPager.getCurrentPeerView();
                int selectedPosition2 = currentPeerView2 == null ? 0 : currentPeerView2.getSelectedPosition();
                TL_stories.StoryItem storyItem = (currentPeerView2 == null || selectedPosition2 < 0 || selectedPosition2 >= currentPeerView2.storyItems.size()) ? null : (TL_stories.StoryItem) currentPeerView2.storyItems.get(selectedPosition2);
                if (storyItem != null) {
                    currentDialogId = storyItem.dialogId;
                    i = storyItem.id;
                }
            }
            this.placeProvider.preLayout(currentDialogId, i, new Runnable() {
                @Override
                public final void run() {
                    StoryViewer.$r8$lambda$RLNh5R7inEFTM9Mi9x0S_ObEQWI(this.f$0);
                }
            });
        }
    }

    public static void $r8$lambda$RLNh5R7inEFTM9Mi9x0S_ObEQWI(StoryViewer storyViewer) {
        storyViewer.updateTransitionParams();
        ImageReceiver imageReceiver = storyViewer.transitionViewHolder.avatarImage;
        if (imageReceiver != null) {
            imageReceiver.setVisible(false, true);
        }
        ImageReceiver imageReceiver2 = storyViewer.transitionViewHolder.storyImage;
        if (imageReceiver2 != null) {
            imageReceiver2.setVisible(false, true);
        }
    }

    private void updateTransitionParams() {
        if (this.placeProvider != null) {
            ImageReceiver imageReceiver = this.transitionViewHolder.avatarImage;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = this.transitionViewHolder.storyImage;
            if (imageReceiver2 != null) {
                imageReceiver2.setAlpha(1.0f);
                this.transitionViewHolder.storyImage.setVisible(true, true);
            }
            PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
            int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
            int i = (currentPeerView == null || selectedPosition < 0 || selectedPosition >= currentPeerView.storyItems.size()) ? 0 : ((TL_stories.StoryItem) currentPeerView.storyItems.get(selectedPosition)).id;
            TL_stories.StoryItem storyItem = (currentPeerView == null || selectedPosition < 0 || selectedPosition >= currentPeerView.storyItems.size()) ? null : (TL_stories.StoryItem) currentPeerView.storyItems.get(selectedPosition);
            if (storyItem == null && this.isSingleStory) {
                storyItem = this.singleStory;
            }
            long currentDialogId = this.storiesViewPager.getCurrentDialogId();
            StoriesController.StoriesList storiesList = this.storiesList;
            if ((storiesList instanceof StoriesController.SearchStoriesList) && storyItem != null) {
                currentDialogId = storyItem.dialogId;
                i = storyItem.messageId;
            } else if ((storiesList instanceof StoriesController.StoryRepostsList) && storyItem != null) {
                currentDialogId = storyItem.dialogId;
                i = storyItem.id;
            } else if (storiesList != null) {
                i = this.dayStoryId;
            }
            int i2 = i;
            long j = currentDialogId;
            this.transitionViewHolder.clear();
            if (this.placeProvider.findView(j, this.messageId, i2, storyItem == null ? -1 : storyItem.messageType, this.transitionViewHolder)) {
                TransitionViewHolder transitionViewHolder = this.transitionViewHolder;
                transitionViewHolder.storyId = i2;
                View view = transitionViewHolder.view;
                if (view != null) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    View view2 = this.transitionViewHolder.view;
                    if (view2 instanceof ChatMessageCell) {
                        iArr[1] = iArr[1] + view2.getPaddingTop();
                    }
                    float f = iArr[0];
                    this.fromXCell = f;
                    this.fromYCell = iArr[1];
                    TransitionViewHolder transitionViewHolder2 = this.transitionViewHolder;
                    KeyEvent.Callback callback = transitionViewHolder2.view;
                    if (callback instanceof StoriesListPlaceProvider.AvatarOverlaysView) {
                        this.animateFromCell = (StoriesListPlaceProvider.AvatarOverlaysView) callback;
                    } else {
                        this.animateFromCell = null;
                    }
                    this.animateAvatar = false;
                    ImageReceiver imageReceiver3 = transitionViewHolder2.avatarImage;
                    if (imageReceiver3 != null) {
                        this.fromX = f + imageReceiver3.getCenterX();
                        this.fromY = iArr[1] + this.transitionViewHolder.avatarImage.getCenterY();
                        this.fromWidth = this.transitionViewHolder.avatarImage.getImageWidth();
                        this.fromHeight = this.transitionViewHolder.avatarImage.getImageHeight();
                        StoriesUtilities.AvatarStoryParams avatarStoryParams = this.transitionViewHolder.params;
                        if (avatarStoryParams != null) {
                            this.fromWidth *= avatarStoryParams.getScale();
                            this.fromHeight *= this.transitionViewHolder.params.getScale();
                        }
                        if (this.transitionViewHolder.view.getParent() instanceof View) {
                            View view3 = (View) this.transitionViewHolder.view.getParent();
                            this.fromX = iArr[0] + (this.transitionViewHolder.avatarImage.getCenterX() * view3.getScaleX());
                            this.fromY = iArr[1] + (this.transitionViewHolder.avatarImage.getCenterY() * view3.getScaleY());
                            this.fromWidth *= view3.getScaleX();
                            this.fromHeight *= view3.getScaleY();
                        }
                        this.animateAvatar = true;
                    } else {
                        ImageReceiver imageReceiver4 = transitionViewHolder2.storyImage;
                        if (imageReceiver4 != null) {
                            this.fromX = f + imageReceiver4.getCenterX();
                            this.fromY = iArr[1] + this.transitionViewHolder.storyImage.getCenterY();
                            this.fromWidth = this.transitionViewHolder.storyImage.getImageWidth();
                            this.fromHeight = this.transitionViewHolder.storyImage.getImageHeight();
                            this.fromRadius = this.transitionViewHolder.storyImage.getRoundRadius();
                        }
                    }
                    this.transitionViewHolder.clipParent.getLocationOnScreen(iArr);
                    TransitionViewHolder transitionViewHolder3 = this.transitionViewHolder;
                    float f2 = transitionViewHolder3.clipTop;
                    if (f2 == 0.0f && transitionViewHolder3.clipBottom == 0.0f) {
                        this.clipTop = 0.0f;
                        this.clipBottom = 0.0f;
                        return;
                    } else {
                        float f3 = iArr[1];
                        this.clipTop = f2 + f3;
                        this.clipBottom = f3 + transitionViewHolder3.clipBottom;
                        return;
                    }
                }
                this.animateAvatar = false;
                this.fromY = 0.0f;
                this.fromX = 0.0f;
                return;
            }
            this.animateAvatar = false;
            this.fromY = 0.0f;
            this.fromX = 0.0f;
            return;
        }
        this.animateAvatar = false;
        this.fromY = 0.0f;
        this.fromX = 0.0f;
    }

    public void requestAdjust(boolean z) {
        if (this.ATTACH_TO_FRAGMENT) {
            if (this.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
                return;
            }
            if (z) {
                AndroidUtilities.requestAdjustNothing(this.fragment.getParentActivity(), this.fragment.getClassGuid());
                return;
            } else {
                AndroidUtilities.requestAdjustResize(this.fragment.getParentActivity(), this.fragment.getClassGuid());
                return;
            }
        }
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        layoutParams.softInputMode = z ? 48 : 16;
        try {
            this.windowManager.updateViewLayout(this.windowView, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setInTouchMode(boolean z) {
        this.isInTouchMode = z;
        if (z) {
            this.volumeControl.hide();
        }
        updatePlayingMode();
    }

    public void setOverlayVisible(boolean z) {
        this.isOverlayVisible = z;
        updatePlayingMode();
    }

    public void setOnCloseListener(Runnable runnable) {
        this.onCloseListener = runnable;
    }

    public boolean isPaused() {
        BaseFragment baseFragment;
        if (this.isPopupVisible || this.isTranslating || this.isBulletinVisible || this.isCaption || this.isWaiting || this.isInTouchMode || this.keyboardVisible || this.currentDialog != null || this.currentSheet != null || this.allowTouchesByViewpager || this.isClosed || this.isRecording || this.progressToOpen != 1.0f || this.selfStoriesViewsOffset != 0.0f || this.isHintVisible) {
            return true;
        }
        if ((this.isSwiping && this.USE_SURFACE_VIEW) || this.isOverlayVisible || this.isInTextSelectionMode || this.isLikesReactions || this.progressToDismiss != 0.0f || this.storiesIntro != null) {
            return true;
        }
        return (!this.ATTACH_TO_FRAGMENT || (baseFragment = this.fragment) == null || baseFragment.getLastStoryViewer() == this) ? false : true;
    }

    public void updatePlayingMode() {
        updatePipSource();
        if (this.storiesViewPager == null) {
            return;
        }
        boolean zIsPaused = isPaused();
        if (this.ATTACH_TO_FRAGMENT && (this.fragment.isPaused() || !this.fragment.isLastFragment())) {
            zIsPaused = true;
        }
        if (ArticleViewer.getInstance().isVisible()) {
            zIsPaused = true;
        }
        this.storiesViewPager.setPaused(zIsPaused);
        VideoPlayerHolder videoPlayerHolder = this.playerHolder;
        if (videoPlayerHolder != null) {
            if (zIsPaused) {
                videoPlayerHolder.pause();
            } else {
                videoPlayerHolder.play(currentSpeed);
            }
        }
        this.storiesViewPager.enableTouch((this.keyboardVisible || this.isClosed || this.isRecording || this.isLongpressed || this.isInPinchToZoom || this.selfStoriesViewsOffset != 0.0f || this.isInTextSelectionMode) ? false : true);
    }

    public boolean findClickableView(FrameLayout frameLayout, float f, float f2, boolean z) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView chatActivityEnterView2;
        if (frameLayout == null) {
            return false;
        }
        if (this.isPopupVisible) {
            return true;
        }
        if (this.selfStoryViewsView != null && this.selfStoriesViewsOffset != 0.0f) {
            return true;
        }
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null) {
            if (currentPeerView.findClickableView(currentPeerView, ((f - this.containerView.getX()) - this.storiesViewPager.getX()) - currentPeerView.getX(), ((f2 - this.containerView.getY()) - this.storiesViewPager.getY()) - currentPeerView.getY(), z)) {
                return true;
            }
            if (currentPeerView.keyboardVisible) {
                return false;
            }
        }
        if (z) {
            return false;
        }
        if (currentPeerView != null && (chatActivityEnterView2 = currentPeerView.chatActivityEnterView) != null && chatActivityEnterView2.getVisibility() == 0 && f2 > this.containerView.getY() + this.storiesViewPager.getY() + currentPeerView.getY() + currentPeerView.chatActivityEnterView.getY()) {
            return true;
        }
        if ((currentPeerView == null || (chatActivityEnterView = currentPeerView.chatActivityEnterView) == null || !chatActivityEnterView.isRecordingAudioVideo()) && this.storiesIntro == null) {
            return AndroidUtilities.findClickableView(frameLayout, f, f2, currentPeerView);
        }
        return true;
    }

    public boolean closeKeyboardOrEmoji() {
        PeerStoriesView currentPeerView;
        StoriesViewPager storiesViewPager = this.storiesViewPager;
        if (storiesViewPager == null || (currentPeerView = storiesViewPager.getCurrentPeerView()) == null) {
            return false;
        }
        return currentPeerView.closeKeyboardOrEmoji();
    }

    public void updateProgressToDismiss() {
        float fClamp01 = Utilities.clamp01(Math.abs(Math.max(this.swipeToDismissHorizontalOffset, this.swipeToDismissOffset) / AndroidUtilities.dp(80.0f)));
        if (this.progressToDismiss != fClamp01) {
            this.progressToDismiss = fClamp01;
            checkNavBarColor();
            PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.progressToDismissUpdated();
            }
            LivePlayer livePlayer = this.livePlayer;
            if (livePlayer != null) {
                livePlayer.setVolume((1.0f - this.progressToDismiss) * this.progressToOpen);
            }
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.windowView;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.invalidate();
        }
    }

    public void showViewsAfterOpening() {
        this.showViewsAfterOpening = true;
    }

    public void startOpenAnimation() {
        PeerStoriesView currentPeerView;
        RadialProgress radialProgress;
        updateTransitionParams();
        this.progressToOpen = 0.0f;
        setNavigationButtonsColor(true);
        this.foundViewToClose = false;
        animationInProgress = true;
        this.fromDismissOffset = this.swipeToDismissOffset;
        if (this.transitionViewHolder.radialProgressUpload != null && (currentPeerView = getCurrentPeerView()) != null && (radialProgress = currentPeerView.headerView.radialProgress) != null) {
            radialProgress.copyParams(this.transitionViewHolder.radialProgressUpload);
        }
        this.opening = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.openCloseAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StoryViewer.$r8$lambda$wOedyjRQXwjL_ECXrXHNmWciyr8(this.f$0, valueAnimator);
            }
        });
        this.locker.lock();
        HwFrameLayout hwFrameLayout = this.containerView;
        if (hwFrameLayout != null) {
            hwFrameLayout.enableHwAcceleration();
        }
        this.openCloseAnimator.addListener(new AnonymousClass9());
        this.openCloseAnimator.setStartDelay(40L);
        this.openCloseAnimator.setDuration(250L);
        this.openCloseAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.openCloseAnimator.start();
        if (this.doOnAnimationReadyRunnables.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.doOnAnimationReadyRunnables.size(); i++) {
            ((Runnable) this.doOnAnimationReadyRunnables.get(i)).run();
        }
        this.doOnAnimationReadyRunnables.clear();
    }

    public static void $r8$lambda$wOedyjRQXwjL_ECXrXHNmWciyr8(StoryViewer storyViewer, ValueAnimator valueAnimator) {
        storyViewer.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        storyViewer.progressToOpen = fFloatValue;
        HwFrameLayout hwFrameLayout = storyViewer.containerView;
        if (hwFrameLayout != null) {
            hwFrameLayout.checkHwAcceleration(fFloatValue);
        }
        LivePlayer livePlayer = storyViewer.livePlayer;
        if (livePlayer != null) {
            livePlayer.setVolume((1.0f - storyViewer.progressToDismiss) * storyViewer.progressToOpen);
        }
        storyViewer.checkNavBarColor();
        SizeNotifierFrameLayout sizeNotifierFrameLayout = storyViewer.windowView;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.invalidate();
        }
    }

    class AnonymousClass9 extends AnimatorListenerAdapter {
        AnonymousClass9() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            StoryViewer storyViewer = StoryViewer.this;
            storyViewer.progressToOpen = 1.0f;
            storyViewer.checkNavBarColor();
            StoryViewer.animationInProgress = false;
            HwFrameLayout hwFrameLayout = StoryViewer.this.containerView;
            if (hwFrameLayout != null) {
                hwFrameLayout.disableHwAcceleration();
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout = StoryViewer.this.windowView;
            if (sizeNotifierFrameLayout != null) {
                sizeNotifierFrameLayout.invalidate();
            }
            StoryViewer storyViewer2 = StoryViewer.this;
            ImageReceiver imageReceiver = storyViewer2.transitionViewHolder.avatarImage;
            if (imageReceiver != null && !storyViewer2.foundViewToClose) {
                imageReceiver.setVisible(true, true);
                StoryViewer.this.transitionViewHolder.avatarImage = null;
            }
            StoryViewer storyViewer3 = StoryViewer.this;
            ImageReceiver imageReceiver2 = storyViewer3.transitionViewHolder.storyImage;
            if (imageReceiver2 != null && !storyViewer3.foundViewToClose) {
                imageReceiver2.setAlpha(1.0f);
                StoryViewer.this.transitionViewHolder.storyImage.setVisible(true, true);
                StoryViewer.this.transitionViewHolder.storyImage = null;
            }
            PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.updatePosition();
            }
            StoryViewer storyViewer4 = StoryViewer.this;
            LivePlayer livePlayer = storyViewer4.livePlayer;
            if (livePlayer != null) {
                livePlayer.setVolume((1.0f - storyViewer4.progressToDismiss) * storyViewer4.progressToOpen);
            }
            if (StoryViewer.this.showViewsAfterOpening) {
                StoryViewer.this.showViewsAfterOpening = false;
                StoryViewer.this.openViews();
            } else if (!SharedConfig.storiesIntroShown) {
                if (StoryViewer.this.storiesIntro == null) {
                    StoryViewer storyViewer5 = StoryViewer.this;
                    if (storyViewer5.containerView != null) {
                        storyViewer5.storiesIntro = new StoriesIntro(StoryViewer.this.containerView.getContext(), StoryViewer.this.windowView);
                        StoryViewer.this.storiesIntro.setAlpha(0.0f);
                        StoryViewer storyViewer6 = StoryViewer.this;
                        storyViewer6.containerView.addView(storyViewer6.storiesIntro);
                    }
                }
                if (StoryViewer.this.storiesIntro != null) {
                    StoryViewer.this.storiesIntro.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            StoryViewer.AnonymousClass9 anonymousClass9 = this.f$0;
                            StoryViewer.this.storiesIntro.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator2) {
                                    super.onAnimationEnd(animator2);
                                    if (StoryViewer.this.storiesIntro != null) {
                                        StoryViewer.this.storiesIntro.stopAnimation();
                                        StoryViewer storyViewer7 = StoryViewer.this;
                                        storyViewer7.containerView.removeView(storyViewer7.storiesIntro);
                                    }
                                    StoryViewer.this.storiesIntro = null;
                                    StoryViewer.this.updatePlayingMode();
                                }
                            }).start();
                        }
                    });
                    StoryViewer.this.storiesIntro.animate().alpha(1.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator2) {
                            super.onAnimationEnd(animator2);
                            if (StoryViewer.this.storiesIntro != null) {
                                StoryViewer.this.storiesIntro.startAnimation(true);
                            }
                        }
                    }).start();
                }
                SharedConfig.setStoriesIntroShown(true);
            }
            StoryViewer.this.updatePlayingMode();
            StoryViewer.this.locker.unlock();
        }
    }

    public void instantClose() {
        if (this.isShowing) {
            AndroidUtilities.hideKeyboard(this.windowView);
            this.isClosed = true;
            this.fullyVisible = false;
            this.progressToOpen = 0.0f;
            this.progressToDismiss = 0.0f;
            updatePlayingMode();
            this.fromY = 0.0f;
            this.fromX = 0.0f;
            ImageReceiver imageReceiver = this.transitionViewHolder.avatarImage;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = this.transitionViewHolder.storyImage;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            TransitionViewHolder transitionViewHolder = this.transitionViewHolder;
            transitionViewHolder.storyImage = null;
            transitionViewHolder.avatarImage = null;
            HwFrameLayout hwFrameLayout = this.containerView;
            if (hwFrameLayout != null) {
                hwFrameLayout.disableHwAcceleration();
            }
            this.locker.unlock();
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = this.currentPlayerScope;
            if (videoPlayerSharedScope != null) {
                videoPlayerSharedScope.invalidate();
            }
            release();
            if (this.ATTACH_TO_FRAGMENT) {
                AndroidUtilities.removeFromParent(this.windowView);
            } else {
                this.windowManager.removeView(this.windowView);
            }
            this.windowView = null;
            this.isShowing = false;
            this.foundViewToClose = false;
            checkNavBarColor();
            Runnable runnable = this.onCloseListener;
            if (runnable != null) {
                runnable.run();
                this.onCloseListener = null;
            }
        }
    }

    private void startCloseAnimation(boolean z) {
        setNavigationButtonsColor(false);
        updateTransitionParams();
        this.locker.lock();
        this.fromDismissOffset = this.swipeToDismissOffset;
        this.opening = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progressToOpen, 0.0f);
        this.openCloseAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StoryViewer.$r8$lambda$R81Bo2BSSuOmbB4NzkVZq4jIr7U(this.f$0, valueAnimator);
            }
        });
        if (!z) {
            this.fromY = 0.0f;
            this.fromX = 0.0f;
            ImageReceiver imageReceiver = this.transitionViewHolder.avatarImage;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = this.transitionViewHolder.storyImage;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            TransitionViewHolder transitionViewHolder = this.transitionViewHolder;
            transitionViewHolder.storyImage = null;
            transitionViewHolder.avatarImage = null;
        } else {
            layoutAndFindView();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryViewer.m4457$r8$lambda$e8qkpnC4wRlziCAhFA34qHeuG4(this.f$0);
            }
        }, 16L);
    }

    public static void $r8$lambda$R81Bo2BSSuOmbB4NzkVZq4jIr7U(StoryViewer storyViewer, ValueAnimator valueAnimator) {
        storyViewer.getClass();
        storyViewer.progressToOpen = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        storyViewer.checkNavBarColor();
        SizeNotifierFrameLayout sizeNotifierFrameLayout = storyViewer.windowView;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.invalidate();
        }
        LivePlayer livePlayer = storyViewer.livePlayer;
        if (livePlayer != null) {
            livePlayer.setVolume((1.0f - storyViewer.progressToDismiss) * storyViewer.progressToOpen);
        }
    }

    public static void m4457$r8$lambda$e8qkpnC4wRlziCAhFA34qHeuG4(StoryViewer storyViewer) {
        if (storyViewer.openCloseAnimator == null) {
            return;
        }
        HwFrameLayout hwFrameLayout = storyViewer.containerView;
        if (hwFrameLayout != null) {
            hwFrameLayout.enableHwAcceleration();
        }
        storyViewer.openCloseAnimator.addListener(storyViewer.new AnonymousClass10());
        storyViewer.openCloseAnimator.setDuration(320L);
        storyViewer.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        storyViewer.openCloseAnimator.start();
    }

    class AnonymousClass10 extends AnimatorListenerAdapter {
        AnonymousClass10() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            PeerStoriesView currentPeerView;
            RadialProgress radialProgress;
            super.onAnimationEnd(animator);
            HwFrameLayout hwFrameLayout = StoryViewer.this.containerView;
            if (hwFrameLayout != null) {
                hwFrameLayout.disableHwAcceleration();
            }
            StoryViewer.this.checkNavBarColor();
            StoryViewer.this.locker.unlock();
            if (StoryViewer.this.storiesIntro != null) {
                StoryViewer.this.storiesIntro.stopAnimation();
                AndroidUtilities.removeFromParent(StoryViewer.this.storiesIntro);
                StoryViewer.this.storiesIntro = null;
            }
            ImageReceiver imageReceiver = StoryViewer.this.transitionViewHolder.avatarImage;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
                StoryViewer.this.transitionViewHolder.avatarImage = null;
            }
            ImageReceiver imageReceiver2 = StoryViewer.this.transitionViewHolder.storyImage;
            if (imageReceiver2 != null) {
                imageReceiver2.setAlpha(1.0f);
                StoryViewer.this.transitionViewHolder.storyImage.setVisible(true, true);
            }
            StoryViewer storyViewer = StoryViewer.this;
            if (storyViewer.transitionViewHolder.radialProgressUpload != null && (currentPeerView = storyViewer.getCurrentPeerView()) != null && (radialProgress = currentPeerView.headerView.radialProgress) != null) {
                StoryViewer.this.transitionViewHolder.radialProgressUpload.copyParams(radialProgress);
            }
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = StoryViewer.this.currentPlayerScope;
            if (videoPlayerSharedScope != null) {
                videoPlayerSharedScope.invalidate();
            }
            if (StoryViewer.this.surfaceView != null) {
                StoryViewer.this.surfaceView.setVisibility(4);
            }
            StoryViewer.this.release();
            try {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StoryViewer.AnonymousClass10.$r8$lambda$KDAvBx8vxPlq0cFCvRITZWlhcTE(this.f$0);
                    }
                });
            } catch (Exception unused) {
            }
            StoryViewer storyViewer2 = StoryViewer.this;
            storyViewer2.isShowing = false;
            storyViewer2.foundViewToClose = false;
            if (storyViewer2.onCloseListener != null) {
                StoryViewer.this.onCloseListener.run();
                StoryViewer.this.onCloseListener = null;
            }
        }

        public static void $r8$lambda$KDAvBx8vxPlq0cFCvRITZWlhcTE(AnonymousClass10 anonymousClass10) {
            anonymousClass10.getClass();
            try {
                StoryViewer storyViewer = StoryViewer.this;
                SizeNotifierFrameLayout sizeNotifierFrameLayout = storyViewer.windowView;
                if (sizeNotifierFrameLayout == null) {
                    return;
                }
                if (storyViewer.ATTACH_TO_FRAGMENT) {
                    AndroidUtilities.removeFromParent(sizeNotifierFrameLayout);
                } else {
                    storyViewer.windowManager.removeView(sizeNotifierFrameLayout);
                }
                StoryViewer.this.windowView = null;
            } catch (Exception unused) {
            }
        }
    }

    public void release() {
        this.lastUri = null;
        setInTouchMode(false);
        allowScreenshots(true);
        VideoPlayerHolder videoPlayerHolder = this.playerHolder;
        if (videoPlayerHolder != null) {
            videoPlayerHolder.release(null);
            this.playerHolder = null;
        }
        LivePlayerView livePlayerView = this.liveView;
        if (livePlayerView != null) {
            livePlayerView.setScope(0L, null);
        }
        LivePlayer livePlayer = this.livePlayer;
        if (livePlayer != null && !LiveStoryPipOverlay.isVisible(livePlayer)) {
            LivePlayer livePlayer2 = this.livePlayer;
            if (livePlayer2.outgoing) {
                livePlayer2.setDisplaySink(null);
            } else {
                livePlayer2.destroy();
            }
        }
        this.livePlayer = null;
        for (int i = 0; i < this.preparedPlayers.size(); i++) {
            ((VideoPlayerHolder) this.preparedPlayers.get(i)).release(null);
        }
        this.preparedPlayers.clear();
        MessagesController.getInstance(this.currentAccount).getStoriesController().stopAllPollers();
        if (this.ATTACH_TO_FRAGMENT) {
            lockOrientation(false);
        }
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null) {
            baseFragment.removeSheet(this);
        }
        globalInstances.remove(this);
        this.doOnAnimationReadyRunnables.clear();
        this.selfStoriesViewsOffset = 0.0f;
        lastStoryItem = null;
    }

    public void close(boolean z) {
        AndroidUtilities.hideKeyboard(this.windowView);
        this.isClosed = true;
        this.invalidateOutRect = true;
        updatePlayingMode();
        startCloseAnimation(z);
        if (this.unreadStateChanged) {
            this.unreadStateChanged = false;
        }
    }

    @Override
    public View mo1349getWindowView() {
        return this.windowView;
    }

    @Override
    public void dismiss() {
        close(true);
    }

    @Override
    public int getNavigationBarColor(int i) {
        return ColorUtils.blendARGB(i, -16777216, getBlackoutAlpha());
    }

    public float getBlackoutAlpha() {
        return this.progressToOpen * (((1.0f - this.progressToDismiss) * 0.5f) + 0.5f);
    }

    @Override
    public boolean onAttachedBackPressed() {
        if (this.selfStoriesViewsOffset != 0.0f) {
            if (this.selfStoryViewsView.onBackPressed()) {
                return true;
            }
            cancelSwipeToViews(false);
            return true;
        }
        if (closeKeyboardOrEmoji()) {
            return true;
        }
        close(true);
        return true;
    }

    @Override
    public boolean isShown() {
        return !this.isClosed;
    }

    public void checkNavBarColor() {
        LaunchActivity launchActivity;
        if (!this.ATTACH_TO_FRAGMENT || (launchActivity = LaunchActivity.instance) == null) {
            return;
        }
        launchActivity.checkSystemBarColors(true, true, true);
    }

    private void setNavigationButtonsColor(boolean z) {
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (!this.ATTACH_TO_FRAGMENT || launchActivity == null) {
            return;
        }
        if (z) {
            this.openedFromLightNavigationBar = launchActivity.isLightNavigationBar();
        }
        if (this.openedFromLightNavigationBar) {
            AndroidUtilities.setLightNavigationBar(launchActivity, !z);
        }
    }

    @Override
    public boolean attachedToParent() {
        return this.ATTACH_TO_FRAGMENT && this.windowView != null;
    }

    @Override
    public void setKeyboardHeightFromParent(int i) {
        if (this.realKeyboardHeight != i) {
            this.realKeyboardHeight = i;
            this.storiesViewPager.setKeyboardHeight(i);
            this.storiesViewPager.requestLayout();
            SelfStoryViewsView selfStoryViewsView = this.selfStoryViewsView;
            if (selfStoryViewsView != null) {
                selfStoryViewsView.setKeyboardHeight(i);
            }
        }
    }

    @Override
    public boolean isFullyVisible() {
        return this.fullyVisible;
    }

    public void presentFragment(BaseFragment baseFragment) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        if (this.ATTACH_TO_FRAGMENT) {
            lastFragment.presentFragment(baseFragment);
        } else {
            lastFragment.presentFragment(baseFragment);
            close(false);
        }
    }

    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    public FrameLayout getContainerForBulletin() {
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null) {
            return currentPeerView.storyContainer;
        }
        return null;
    }

    public void startActivityForResult(Intent intent, int i) {
        if (this.fragment.getParentActivity() == null) {
            return;
        }
        this.fragment.getParentActivity().startActivityForResult(intent, i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.onActivityResult(i, i2, intent);
        }
    }

    public void dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) {
            dispatchVolumeEvent(keyEvent);
        }
    }

    public void dismissVisibleDialogs() {
        Dialog dialog = this.currentDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        BaseFragment.AttachedSheet attachedSheet = this.currentSheet;
        if (attachedSheet != null) {
            attachedSheet.dismiss();
        }
        PeerStoriesView currentPeerView = getCurrentPeerView();
        if (currentPeerView != null) {
            ReactionsContainerLayout reactionsContainerLayout = currentPeerView.reactionsContainerLayout;
            if (reactionsContainerLayout != null && reactionsContainerLayout.getReactionsWindow() != null) {
                currentPeerView.reactionsContainerLayout.getReactionsWindow().dismiss();
            }
            ShareAlert shareAlert = currentPeerView.shareAlert;
            if (shareAlert != null) {
                shareAlert.dismiss();
            }
            currentPeerView.needEnterText();
        }
    }

    public float getProgressToSelfViews() {
        SelfStoryViewsView selfStoryViewsView = this.selfStoryViewsView;
        if (selfStoryViewsView == null) {
            return 0.0f;
        }
        return selfStoryViewsView.progressToOpen;
    }

    public void setSelfStoriesViewsOffset(float f) {
        this.selfStoriesViewsOffset = f;
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        HwFrameLayout hwFrameLayout = this.containerView;
        if (hwFrameLayout != null) {
            hwFrameLayout.invalidate();
        }
    }

    public void openViews() {
        checkSelfStoriesView();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryViewer.m4453$r8$lambda$Nk2rgIwGu2ifMZL58Ek4ZZAb2k(this.f$0);
            }
        }, 30L);
    }

    public static void m4453$r8$lambda$Nk2rgIwGu2ifMZL58Ek4ZZAb2k(StoryViewer storyViewer) {
        storyViewer.allowSelfStoriesView = true;
        storyViewer.cancelSwipeToViews(true);
    }

    public boolean soundEnabled() {
        return !isInSilentMode;
    }

    public void allowScreenshots(boolean z) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        boolean z2 = !this.isShowing || z;
        if (this.allowScreenshots != z2) {
            this.allowScreenshots = z2;
            SurfaceView surfaceView = this.surfaceView;
            if (surfaceView != null) {
                surfaceView.setSecure(!z2);
            }
            LivePlayerView livePlayerView = this.liveView;
            if (livePlayerView != null) {
                livePlayerView.setSecure(!z2);
            }
            if (this.ATTACH_TO_FRAGMENT) {
                if (this.fragment.getParentActivity() != null) {
                    if (z2) {
                        this.fragment.getParentActivity().getWindow().clearFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    } else {
                        this.fragment.getParentActivity().getWindow().addFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    }
                }
                return;
            }
            if (z2) {
                this.windowLayoutParams.flags &= -8193;
                AndroidUtilities.logFlagSecure();
            } else {
                this.windowLayoutParams.flags |= 8192;
                AndroidUtilities.logFlagSecure();
            }
            try {
                this.windowManager.updateViewLayout(this.windowView, this.windowLayoutParams);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void openFor(BaseFragment baseFragment, RecyclerListView recyclerListView, ChatActionCell chatActionCell) {
        MessageObject messageObject = chatActionCell.getMessageObject();
        if (baseFragment == null || baseFragment.getContext() == null || messageObject.type != 24) {
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        TL_stories.StoryItem storyItem = messageMedia.storyItem;
        storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
        storyItem.messageId = messageObject.getId();
        open(baseFragment.getContext(), messageObject.messageOwner.media.storyItem, StoriesListPlaceProvider.of(recyclerListView));
    }

    public void doOnAnimationReady(Runnable runnable) {
        if (runnable != null) {
            this.doOnAnimationReadyRunnables.add(runnable);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = 0;
        if (i == NotificationCenter.storiesListUpdated) {
            if (this.storiesList == ((StoriesController.StoriesList) objArr[0])) {
                getCurrentPeerView();
                StoriesViewPager storiesViewPager = this.storiesViewPager;
                StoriesController.StoriesList storiesList = this.storiesList;
                storiesViewPager.setDays(storiesList.dialogId, storiesList.getDays(), this.currentAccount);
                SelfStoryViewsView selfStoryViewsView = this.selfStoryViewsView;
                if (selfStoryViewsView != null) {
                    TL_stories.StoryItem selectedStory = selfStoryViewsView.getSelectedStory();
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i3 < this.storiesList.messageObjects.size()) {
                        if (selectedStory != null && selectedStory.id == ((MessageObject) this.storiesList.messageObjects.get(i3)).storyItem.id) {
                            i4 = i3;
                        }
                        arrayList.add(((MessageObject) this.storiesList.messageObjects.get(i3)).storyItem);
                        i3++;
                    }
                    this.selfStoryViewsView.setItems(this.storiesList.dialogId, arrayList, i4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.storiesUpdated) {
            PlaceProvider placeProvider = this.placeProvider;
            if (placeProvider instanceof StoriesListPlaceProvider) {
                StoriesListPlaceProvider storiesListPlaceProvider = (StoriesListPlaceProvider) placeProvider;
                if (!storiesListPlaceProvider.hasPaginationParams || storiesListPlaceProvider.onlySelfStories) {
                    return;
                }
                StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
                ArrayList hiddenList = storiesListPlaceProvider.hiddedStories ? storiesController.getHiddenList() : storiesController.getDialogListStories();
                ArrayList<Long> dialogIds = this.storiesViewPager.getDialogIds();
                boolean z = false;
                while (i3 < hiddenList.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) hiddenList.get(i3)).peer);
                    if ((!storiesListPlaceProvider.onlyUnreadStories || storiesController.hasUnreadStories(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z = true;
                    }
                    i3++;
                }
                if (z) {
                    this.storiesViewPager.getAdapter().notifyDataSetChanged();
                }
            }
            SelfStoryViewsView selfStoryViewsView2 = this.selfStoryViewsView;
            if (selfStoryViewsView2 != null) {
                selfStoryViewsView2.selfStoriesPreviewView.update();
                return;
            }
            return;
        }
        int i5 = NotificationCenter.openArticle;
        if (i == i5 || i == NotificationCenter.articleClosed) {
            updatePlayingMode();
            if (i == i5) {
                VideoPlayerHolder videoPlayerHolder = this.playerHolder;
                if (videoPlayerHolder != null) {
                    this.playerSavedPosition = videoPlayerHolder.currentPosition;
                    this.playerHolder.release(null);
                    this.playerHolder = null;
                    return;
                }
                this.playerSavedPosition = 0L;
                return;
            }
            if (this.paused || getCurrentPeerView() == null) {
                return;
            }
            getCurrentPeerView().updatePosition();
            return;
        }
        if (i == NotificationCenter.storyDeleted) {
            long jLongValue = ((Long) objArr[0]).longValue();
            int iIntValue = ((Integer) objArr[1]).intValue();
            TL_stories.StoryItem storyItem = this.singleStory;
            if (storyItem != null && storyItem.dialogId == jLongValue && storyItem.id == iIntValue) {
                this.singleStoryDeleted = true;
            }
        }
    }

    public void saveDraft(long j, TL_stories.StoryItem storyItem, CharSequence charSequence) {
        if (j == 0 || storyItem == null) {
            return;
        }
        replyDrafts.put(draftHash(j, storyItem), charSequence);
    }

    public CharSequence getDraft(long j, TL_stories.StoryItem storyItem) {
        return (j == 0 || storyItem == null) ? "" : (CharSequence) replyDrafts.get(draftHash(j, storyItem), "");
    }

    public void clearDraft(long j, TL_stories.StoryItem storyItem) {
        if (j == 0 || storyItem == null) {
            return;
        }
        replyDrafts.remove(draftHash(j, storyItem));
    }

    private long draftHash(long j, TL_stories.StoryItem storyItem) {
        return j + (j >> 16) + (((long) storyItem.id) << 16);
    }

    public void onResume() {
        this.paused = false;
        if (!ArticleViewer.getInstance().isVisible() && getCurrentPeerView() != null) {
            getCurrentPeerView().updatePosition();
        }
        StoriesIntro storiesIntro = this.storiesIntro;
        if (storiesIntro != null) {
            storiesIntro.startAnimation(false);
        }
        if (LiveStoryPipOverlay.isVisible()) {
            LiveStoryPipOverlay.dismiss();
        }
    }

    public void onPause() {
        this.paused = true;
        VideoPlayerHolder videoPlayerHolder = this.playerHolder;
        if (videoPlayerHolder != null) {
            videoPlayerHolder.release(null);
            this.playerHolder = null;
        }
        if (this.pipLiveView == null) {
            LivePlayerView livePlayerView = this.liveView;
            if (livePlayerView != null) {
                livePlayerView.setScope(0L, null);
            }
            LivePlayer livePlayer = this.livePlayer;
            if (livePlayer != null) {
                if (livePlayer.outgoing) {
                    livePlayer.setDisplaySink(null);
                } else {
                    livePlayer.destroy();
                }
                this.livePlayer = null;
            }
        }
        StoriesIntro storiesIntro = this.storiesIntro;
        if (storiesIntro != null) {
            storiesIntro.stopAnimation();
        }
    }

    public interface PlaceProvider {
        boolean findView(long j, int i, int i2, int i3, TransitionViewHolder transitionViewHolder);

        void loadNext(boolean z);

        void preLayout(long j, int i, Runnable runnable);

        public abstract class CC {
            public static void $default$loadNext(PlaceProvider placeProvider, boolean z) {
            }
        }
    }

    public static class TransitionViewHolder {
        public float alpha = 1.0f;
        public ImageReceiver avatarImage;
        public Paint bgPaint;
        public boolean checkParentScale;
        public float clipBottom;
        public View clipParent;
        public float clipTop;
        public ImageReceiver crossfadeToAvatarImage;
        public HolderDrawAbove drawAbove;
        public HolderClip drawClip;
        public boolean isLive;
        public StoriesUtilities.AvatarStoryParams params;
        public RadialProgress radialProgressUpload;
        public int storyId;
        public ImageReceiver storyImage;
        public View view;

        public Integer getAvatarImageRoundRadius() {
            View view;
            if (this.avatarImage != null) {
                return Integer.valueOf((int) (this.avatarImage.getRoundRadius()[0] * ((!this.checkParentScale || (view = this.view) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) this.view.getParent()).getScaleY())));
            }
            return null;
        }

        public void clear() {
            this.view = null;
            this.params = null;
            this.avatarImage = null;
            this.storyImage = null;
            this.drawAbove = null;
            this.drawClip = null;
            this.clipParent = null;
            this.radialProgressUpload = null;
            this.isLive = false;
            this.crossfadeToAvatarImage = null;
            this.clipTop = 0.0f;
            this.clipBottom = 0.0f;
            this.storyId = 0;
            this.bgPaint = null;
            this.alpha = 1.0f;
        }
    }

    public class VideoPlayerHolder extends VideoPlayerHolderBase {
        boolean logBuffering;

        public VideoPlayerHolder(SurfaceView surfaceView, TextureView textureView) {
            if (StoryViewer.this.USE_SURFACE_VIEW) {
                with(surfaceView);
            } else {
                with(textureView);
            }
        }

        @Override
        public boolean needRepeat() {
            return StoryViewer.this.isCaptionPartVisible;
        }

        @Override
        public void onRenderedFirstFrame() {
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = StoryViewer.this.currentPlayerScope;
            if (videoPlayerSharedScope == null) {
                return;
            }
            videoPlayerSharedScope.firstFrameRendered = true;
            this.firstFrameRendered = true;
            videoPlayerSharedScope.invalidate();
            if (!this.paused || StoryViewer.this.surfaceView == null) {
                return;
            }
            prepareStub();
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            if (i == 3 || i == 2) {
                if (this.firstFrameRendered && i == 2) {
                    this.logBuffering = true;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            StoryViewer.VideoPlayerHolder.$r8$lambda$23Zeq0HfCO9WgQ2hi0C7w7CTR7c(this.f$0);
                        }
                    });
                }
                if (this.logBuffering && i == 3) {
                    this.logBuffering = false;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            StoryViewer.VideoPlayerHolder.$r8$lambda$EROlfENFlBQ269ZdhPJEtq6SYDw(this.f$0);
                        }
                    });
                }
            }
        }

        public static void $r8$lambda$23Zeq0HfCO9WgQ2hi0C7w7CTR7c(VideoPlayerHolder videoPlayerHolder) {
            PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
            if (currentPeerView == null || currentPeerView.currentStory.storyItem == null) {
                return;
            }
            FileLog.d("StoryViewer displayed story buffering dialogId=" + currentPeerView.getCurrentPeer() + " storyId=" + currentPeerView.currentStory.storyItem.id);
        }

        public static void $r8$lambda$EROlfENFlBQ269ZdhPJEtq6SYDw(VideoPlayerHolder videoPlayerHolder) {
            PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
            if (currentPeerView == null || currentPeerView.currentStory.storyItem == null) {
                return;
            }
            FileLog.d("StoryViewer displayed story playing dialogId=" + currentPeerView.getCurrentPeer() + " storyId=" + currentPeerView.currentStory.storyItem.id);
        }
    }

    public void switchToPip() {
        BaseFragment baseFragment;
        if (this.livePlayer == null || (baseFragment = this.fragment) == null || this.liveView == null) {
            return;
        }
        Activity activityFindActivity = AndroidUtilities.findActivity(baseFragment.getContext());
        if (PipUtils.checkAnyPipPermissions(activityFindActivity)) {
            LiveStoryPipOverlay.show(activityFindActivity, this.livePlayer);
            dismiss();
        }
    }

    @Override
    public boolean pipIsAvailable() {
        return (this.fragment == null || getCurrentPeerView() == null || AndroidUtilities.findActivity(this.fragment.getContext()) == null || this.livePlayer == null || this.liveView == null || this.isClosed) ? false : true;
    }

    @Override
    public Bitmap pipCreatePrimaryWindowViewBitmap() {
        LivePlayerView livePlayerView = this.liveView;
        if (livePlayerView == null || !livePlayerView.isAvailable()) {
            return null;
        }
        return this.liveView.getBitmap();
    }

    @Override
    public Bitmap pipCreatePictureInPictureViewBitmap() {
        LivePlayerView livePlayerView = this.pipLiveView;
        if (livePlayerView == null || !livePlayerView.isAvailable()) {
            return null;
        }
        return this.pipLiveView.getBitmap();
    }

    @Override
    public View pipCreatePictureInPictureView() {
        LivePlayerView livePlayerView = new LivePlayerView(this.liveView.getContext(), this.currentAccount, false);
        this.pipLiveView = livePlayerView;
        return livePlayerView;
    }

    @Override
    public void pipHidePrimaryWindowView(Runnable runnable) {
        LivePlayerView livePlayerView = this.pipLiveView;
        if (livePlayerView != null) {
            livePlayerView.setOnFirstFrameCallback(runnable);
            this.livePlayer.setDisplaySink(this.pipLiveView.getSink());
        }
        if (this.ATTACH_TO_FRAGMENT) {
            AndroidUtilities.removeFromParent(this.windowView);
        } else {
            this.windowManager.removeView(this.windowView);
        }
        this.windowView.invalidate();
    }

    @Override
    public void pipShowPrimaryWindowView(Runnable runnable) {
        LivePlayerView livePlayerView = this.pipLiveView;
        if (livePlayerView != null) {
            livePlayerView.setOnFirstFrameCallback(runnable);
        }
        if (this.ATTACH_TO_FRAGMENT) {
            AndroidUtilities.removeFromParent(this.windowView);
            this.fragment.getLayoutContainer().addView(this.windowView);
        } else {
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
        }
        LivePlayerView livePlayerView2 = this.pipLiveView;
        if (livePlayerView2 != null) {
            livePlayerView2.release();
            this.pipLiveView = null;
        }
        this.windowView.invalidate();
        this.livePlayer.setDisplaySink(this.liveView.getSink());
    }
}
