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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesUtilities;
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
    private int fromRadius;
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
    Paint inputBackgroundPaint;
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
    int j;
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
    static int J = 0;
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
            this.f$0.lambda$new$0();
        }
    };
    public LongSparseIntArray savedPositions = new LongSparseIntArray();

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

    public void lambda$new$0() {
        setLongPressed(true);
    }

    public static boolean isShowingImage(MessageObject messageObject) {
        if (lastStoryItem != null) {
            return (messageObject.type == 23 || messageObject.isWebpage()) && !runOpenAnimationAfterLayout && lastStoryItem.messageId == messageObject.getId() && lastStoryItem.messageType != 3;
        }
        return false;
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
        int i = J;
        J = i + 1;
        this.j = i;
        this.inputBackgroundPaint = new Paint(1);
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
        if (context == null) {
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
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        layoutParams.flags = -2147417728;
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
                public boolean onScroll(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryViewer.AnonymousClass1.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
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
                protected void onMeasure(int i4, int i5) {
                    int size = View.MeasureSpec.getSize(i5);
                    StoryViewer storyViewer = StoryViewer.this;
                    if (!storyViewer.ATTACH_TO_FRAGMENT || storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
                        storyViewer.setKeyboardHeightFromParent(measureKeyboardHeight());
                        size += StoryViewer.this.realKeyboardHeight;
                    }
                    int size2 = View.MeasureSpec.getSize(i4);
                    int i6 = (int) ((size2 * 16.0f) / 9.0f);
                    if (size > i6) {
                        StoryViewer.this.storiesViewPager.getLayoutParams().width = -1;
                        size = i6;
                    } else {
                        int i7 = (int) ((size / 16.0f) * 9.0f);
                        StoryViewer.this.storiesViewPager.getLayoutParams().width = i7;
                        size2 = i7;
                    }
                    StoryViewer.this.aspectRatioFrameLayout.getLayoutParams().height = size + 1;
                    StoryViewer.this.aspectRatioFrameLayout.getLayoutParams().width = size2;
                    ((FrameLayout.LayoutParams) StoryViewer.this.aspectRatioFrameLayout.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                    super.onMeasure(i4, i5);
                }

                @Override
                protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
                    super.onLayout(z3, i4, i5, i6, i7);
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
                        float fLerp = AndroidUtilities.lerp(1.0f, storyViewer3.selfStoryViewsView.toHeight / storyViewer3.lastStoryContainerHeight, f);
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
                        currentPeerView.outlineProvider.radiusInDp = (int) AndroidUtilities.lerp(10.0f, 6.0f / r5, StoryViewer.this.selfStoryViewsView.progressToOpen);
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
                return this.f$0.lambda$open$1(view, windowInsetsCompat);
            }
        });
        if (this.ATTACH_TO_FRAGMENT) {
            AndroidUtilities.removeFromParent(this.windowView);
            this.windowView.setTag(-15654349, new Object());
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
            if (i3 >= 33 && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = this.windowView.findOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new OnBackInvokedCallback() {
                    @Override
                    public final void onBackInvoked() {
                        this.f$0.lambda$open$2();
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
        AndroidUtilities.hideKeyboard(lastFragment.getFragmentView());
    }

    class AnonymousClass2 extends SizeNotifierFrameLayout {
        float lastTouchX;
        SparseArray lastX;
        final RectF outFromRectAvatar;
        final RectF outFromRectContainer;
        final Path path;
        final RectF rect1;
        final RectF rect2;
        final RectF rect3;
        float startX;
        float startY;
        final BaseFragment val$fragment;

        AnonymousClass2(Context context, BaseFragment baseFragment) {
            super(context);
            this.val$fragment = baseFragment;
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
        protected void dispatchDraw(android.graphics.Canvas r18) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryViewer.AnonymousClass2.dispatchDraw(android.graphics.Canvas):void");
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            super.requestDisallowInterceptTouchEvent(z);
            StoryViewer.this.allowIntercept = false;
        }

        @Override
        public boolean dispatchTouchEvent(android.view.MotionEvent r19) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryViewer.AnonymousClass2.dispatchTouchEvent(android.view.MotionEvent):boolean");
        }

        public void lambda$dispatchTouchEvent$0(ValueAnimator valueAnimator) {
            StoryViewer.this.swipeToDismissHorizontalOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            StoryViewer.this.updateProgressToDismiss();
        }

        @Override
        public boolean onInterceptTouchEvent(android.view.MotionEvent r15) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryViewer.AnonymousClass2.onInterceptTouchEvent(android.view.MotionEvent):boolean");
        }

        public void lambda$onInterceptTouchEvent$1() {
            StoryViewer.this.setInTouchMode(true);
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
                                this.f$0.lambda$onTouchEvent$2(valueAnimator);
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

        public void lambda$onTouchEvent$2(ValueAnimator valueAnimator) {
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
                            this.f$0.lambda$switchToNextAndRemoveCurrentPeer$0(storiesList, arrayList);
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
                            this.f$0.lambda$switchToNextAndRemoveCurrentPeer$1(arrayList2, iIndexOf2);
                        }
                    });
                    return;
                }
            }
            StoryViewer.this.close(false);
        }

        public void lambda$switchToNextAndRemoveCurrentPeer$0(StoriesController.StoriesList storiesList, ArrayList arrayList) {
            StoryViewer storyViewer = StoryViewer.this;
            storyViewer.storiesViewPager.setDays(storiesList.dialogId, arrayList, storyViewer.currentAccount);
        }

        public void lambda$switchToNextAndRemoveCurrentPeer$1(ArrayList arrayList, int i) {
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
                            int i = 0;
                            while (true) {
                                if (i >= StoryViewer.this.preparedPlayers.size()) {
                                    break;
                                }
                                if (((VideoPlayerHolder) StoryViewer.this.preparedPlayers.get(i)).uri.equals(uri)) {
                                    StoryViewer storyViewer4 = StoryViewer.this;
                                    storyViewer4.playerHolder = (VideoPlayerHolder) storyViewer4.preparedPlayers.remove(i);
                                    break;
                                }
                                i++;
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
            LivePlayerView livePlayerView = StoryViewer.this.liveView;
            if (livePlayerView != null) {
                livePlayerView.setVisibility(z ? 0 : 8);
            }
            if (StoryViewer.this.surfaceView != null) {
                StoryViewer.this.surfaceView.setVisibility(z ? 8 : z2 ? 0 : 4);
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
                            this.f$0.lambda$preparePlayer$2(videoPlayerHolder);
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

        public void lambda$preparePlayer$2(VideoPlayerHolder videoPlayerHolder) {
            FrameLayout frameLayout;
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope;
            PeerStoriesView currentPeerView = StoryViewer.this.storiesViewPager.getCurrentPeerView();
            if (currentPeerView == null || (frameLayout = currentPeerView.storyContainer) == null || (videoPlayerSharedScope = StoryViewer.this.currentPlayerScope) == null || videoPlayerSharedScope.player != videoPlayerHolder) {
                return;
            }
            frameLayout.invalidate();
        }
    }

    public WindowInsetsCompat lambda$open$1(View view, WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetBottom;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.containerView.getLayoutParams();
        marginLayoutParams.topMargin = this.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE ? 0 : windowInsetsCompat.getSystemWindowInsetTop();
        if (this.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
            systemWindowInsetBottom = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        } else {
            systemWindowInsetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
        }
        marginLayoutParams.bottomMargin = systemWindowInsetBottom;
        marginLayoutParams.leftMargin = windowInsetsCompat.getSystemWindowInsetLeft();
        marginLayoutParams.rightMargin = windowInsetsCompat.getSystemWindowInsetRight();
        this.windowView.requestLayout();
        this.containerView.requestLayout();
        return WindowInsetsCompat.CONSUMED;
    }

    public void lambda$open$2() {
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.onBackPressed();
        } else {
            onAttachedBackPressed();
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
                    this.f$0.lambda$cancelSwipeToViews$3(valueAnimator);
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

    public void lambda$cancelSwipeToViews$3(ValueAnimator valueAnimator) {
        this.selfStoriesViewsOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.containerView.invalidate();
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
                    this.f$0.lambda$showDialog$4(dialogInterface);
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

    public void lambda$showDialog$4(DialogInterface dialogInterface) {
        if (dialogInterface == this.currentDialog) {
            this.currentDialog = null;
            updatePlayingMode();
        }
    }

    public boolean listenToAttachedSheet(BaseFragment.AttachedSheet attachedSheet) {
        this.currentSheet = attachedSheet;
        attachedSheet.setOnDismissListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$listenToAttachedSheet$5();
            }
        });
        return true;
    }

    public void lambda$listenToAttachedSheet$5() {
        this.currentSheet = null;
        updatePlayingMode();
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
                    this.f$0.lambda$cancelSwipeToReply$6(valueAnimator);
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

    public void lambda$cancelSwipeToReply$6(ValueAnimator valueAnimator) {
        this.swipeToReplyOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.swipeToReplyProgress = Utilities.clamp(this.swipeToReplyOffset / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
        StoriesViewPager storiesViewPager = this.storiesViewPager;
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
        PlaceProvider placeProvider = this.placeProvider;
        if (placeProvider != null) {
            placeProvider.preLayout(this.storiesViewPager.getCurrentDialogId(), this.messageId, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$layoutAndFindView$7();
                }
            });
        }
    }

    public void lambda$layoutAndFindView$7() {
        updateTransitionParams();
        ImageReceiver imageReceiver = this.transitionViewHolder.avatarImage;
        if (imageReceiver != null) {
            imageReceiver.setVisible(false, true);
        }
        ImageReceiver imageReceiver2 = this.transitionViewHolder.storyImage;
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
            } else if (storiesList != null) {
                i = this.dayStoryId;
            }
            long j = currentDialogId;
            this.transitionViewHolder.clear();
            if (this.placeProvider.findView(j, this.messageId, i, storyItem == null ? -1 : storyItem.messageType, this.transitionViewHolder)) {
                TransitionViewHolder transitionViewHolder = this.transitionViewHolder;
                transitionViewHolder.storyId = i;
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
                            this.fromRadius = this.transitionViewHolder.storyImage.getRoundRadius()[0];
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
        return this.isPopupVisible || this.isTranslating || this.isBulletinVisible || this.isCaption || this.isWaiting || this.isInTouchMode || this.keyboardVisible || this.currentDialog != null || this.currentSheet != null || this.allowTouchesByViewpager || this.isClosed || this.isRecording || this.progressToOpen != 1.0f || this.selfStoriesViewsOffset != 0.0f || this.isHintVisible || (this.isSwiping && this.USE_SURFACE_VIEW) || this.isOverlayVisible || this.isInTextSelectionMode || this.isLikesReactions || this.progressToDismiss != 0.0f || this.storiesIntro != null || !(!this.ATTACH_TO_FRAGMENT || (baseFragment = this.fragment) == null || baseFragment.getLastStoryViewer() == this);
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
                this.f$0.lambda$startOpenAnimation$8(valueAnimator);
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

    public void lambda$startOpenAnimation$8(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.progressToOpen = fFloatValue;
        HwFrameLayout hwFrameLayout = this.containerView;
        if (hwFrameLayout != null) {
            hwFrameLayout.checkHwAcceleration(fFloatValue);
        }
        LivePlayer livePlayer = this.livePlayer;
        if (livePlayer != null) {
            livePlayer.setVolume((1.0f - this.progressToDismiss) * this.progressToOpen);
        }
        checkNavBarColor();
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.windowView;
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
                            this.f$0.lambda$onAnimationEnd$0(view);
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

        public void lambda$onAnimationEnd$0(View view) {
            StoryViewer.this.storiesIntro.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (StoryViewer.this.storiesIntro != null) {
                        StoryViewer.this.storiesIntro.stopAnimation();
                        StoryViewer storyViewer = StoryViewer.this;
                        storyViewer.containerView.removeView(storyViewer.storiesIntro);
                    }
                    StoryViewer.this.storiesIntro = null;
                    StoryViewer.this.updatePlayingMode();
                }
            }).start();
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
                this.f$0.lambda$startCloseAnimation$9(valueAnimator);
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
                this.f$0.lambda$startCloseAnimation$10();
            }
        }, 16L);
    }

    public void lambda$startCloseAnimation$9(ValueAnimator valueAnimator) {
        this.progressToOpen = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        checkNavBarColor();
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.windowView;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.invalidate();
        }
        LivePlayer livePlayer = this.livePlayer;
        if (livePlayer != null) {
            livePlayer.setVolume((1.0f - this.progressToDismiss) * this.progressToOpen);
        }
    }

    public void lambda$startCloseAnimation$10() {
        if (this.openCloseAnimator == null) {
            return;
        }
        HwFrameLayout hwFrameLayout = this.containerView;
        if (hwFrameLayout != null) {
            hwFrameLayout.enableHwAcceleration();
        }
        this.openCloseAnimator.addListener(new AnonymousClass10());
        this.openCloseAnimator.setDuration(400L);
        this.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openCloseAnimator.start();
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
            StoryViewer.this.release();
            try {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onAnimationEnd$0();
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

        public void lambda$onAnimationEnd$0() {
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
    public View mo1254getWindowView() {
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
                this.f$0.lambda$openViews$11();
            }
        }, 30L);
    }

    public void lambda$openViews$11() {
        this.allowSelfStoriesView = true;
        cancelSwipeToViews(true);
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
        return j + (j >> 16) + (storyItem.id << 16);
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
                            this.f$0.lambda$onStateChanged$0();
                        }
                    });
                }
                if (this.logBuffering && i == 3) {
                    this.logBuffering = false;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onStateChanged$1();
                        }
                    });
                }
            }
        }

        public void lambda$onStateChanged$0() {
            PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
            if (currentPeerView == null || currentPeerView.currentStory.storyItem == null) {
                return;
            }
            FileLog.d("StoryViewer displayed story buffering dialogId=" + currentPeerView.getCurrentPeer() + " storyId=" + currentPeerView.currentStory.storyItem.id);
        }

        public void lambda$onStateChanged$1() {
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
