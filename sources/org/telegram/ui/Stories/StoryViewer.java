package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.OnBackInvokedDispatcher;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.FastScroller;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticOutline0;
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
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MessagesSearchAdapter;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.Views.PipettePickerView;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.CollageLayoutButton;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.LivePlayerView;
import org.telegram.ui.Stories.recorder.MultipleStoriesSelector;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda46;
import org.telegram.ui.iv.RichEditor$3$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;
import org.telegram.ui.web.AddressBarList;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;
import org.webrtc.TextureViewRenderer;

public final class StoryViewer implements NotificationCenter.NotificationCenterDelegate, BaseFragment.AttachedSheet, IPipSourceDelegate {
    public static boolean animationInProgress;
    public static boolean isInSilentMode;
    public static TL_stories.StoryItem lastStoryItem;
    public static boolean runOpenAnimationAfterLayout;
    public boolean allowIntercept;
    public boolean allowSelfStoriesView;
    public boolean allowSwipeToDissmiss;
    public boolean allowSwipeToReply;
    public boolean animateAvatar;
    public StoriesListPlaceProvider.AvatarOverlaysView animateFromCell;
    public AspectRatioFrameLayout aspectRatioFrameLayout;
    public float clipBottom;
    public float clipTop;
    public AnonymousClass3 containerView;
    public int currentAccount;
    public Dialog currentDialog;
    public PeerStoriesView.VideoPlayerSharedScope currentPlayerScope;
    public BaseFragment.AttachedSheet currentSheet;
    public int dayStoryId;
    public BotSensors$1$$ExternalSyntheticLambda0 delayedTapRunnable;
    public final ArrayList doOnAnimationReadyRunnables;
    public boolean flingCalled;
    public final BaseFragment fragment;
    public boolean fromBottomSheet;
    public float fromDismissOffset;
    public float fromHeight;
    public int[] fromRadius;
    public float fromWidth;
    public float fromX;
    public float fromXCell;
    public float fromY;
    public float fromYCell;
    public boolean fullyVisible;
    public GestureDetector gestureDetector;
    public float hideEnterViewProgress;
    public boolean inSeekingMode;
    public boolean inSwipeToDissmissMode;
    public boolean invalidateOutRect;
    public boolean isBulletinVisible;
    public boolean isCaption;
    public boolean isCaptionPartVisible;
    public boolean isClosed;
    public boolean isHintVisible;
    public boolean isInPinchToZoom;
    public boolean isInTextSelectionMode;
    public boolean isInTouchMode;
    public boolean isLikesReactions;
    public boolean isLongpressed;
    public boolean isOverlayVisible;
    public boolean isPopupVisible;
    public boolean isRecording;
    public boolean isShowing;
    public boolean isSingleStory;
    public boolean isSwiping;
    public boolean isTranslating;
    public boolean keyboardVisible;
    public long lastDialogId;
    public int lastPosition;
    public float lastStoryContainerHeight;
    public Uri lastUri;
    public LivePlayer livePlayer;
    public LivePlayerView liveView;
    public final AnimationNotificationsLocker locker;
    public final StoryViewer$$ExternalSyntheticLambda2 longPressRunnable;
    public int messageId;
    public StoryViewer$$ExternalSyntheticLambda2 onCloseListener;
    public ValueAnimator openCloseAnimator;
    public boolean openedFromLightNavigationBar;
    public boolean opening;
    public TL_stories.PeerStories overrideUserStories;
    public boolean paused;
    public LivePlayerView pipLiveView;
    public PlaceProvider placeProvider;
    public VideoPlayerHolder playerHolder;
    public long playerSavedPosition;
    public final ArrayList preparedPlayers;
    public float progressToDismiss;
    public float progressToOpen;
    public int realKeyboardHeight;
    public boolean reversed;
    public final LongSparseIntArray savedPositions;
    public float selfStoriesViewsOffset;
    public SelfStoryViewsView selfStoryViewsView;
    public boolean showViewsAfterOpening;
    public TL_stories.StoryItem singleStory;
    public boolean singleStoryDeleted;
    public StoriesIntro storiesIntro;
    public StoriesController.StoriesList storiesList;
    public AnonymousClass4 storiesViewPager;
    public SurfaceView surfaceView;
    public float swipeToDismissHorizontalDirection;
    public float swipeToDismissHorizontalOffset;
    public float swipeToDismissOffset;
    public ValueAnimator swipeToDissmissBackAnimator;
    public ValueAnimator swipeToReplyBackAnimator;
    public float swipeToReplyOffset;
    public float swipeToReplyProgress;
    public boolean swipeToReplyWaitingKeyboard;
    public ValueAnimator swipeToViewsAnimator;
    public AnonymousClass6 textureView;
    public final TransitionViewHolder transitionViewHolder;
    public boolean unreadStateChanged;
    public boolean verticalScrollDetected;
    public StoriesVolumeControl volumeControl;
    public WindowManager.LayoutParams windowLayoutParams;
    public WindowManager windowManager;
    public AnonymousClass2 windowView;
    public static final ArrayList globalInstances = new ArrayList();
    public static float currentSpeed = 1.0f;
    public static boolean checkSilentMode = true;
    public static final LongSparseArray replyDrafts = new LongSparseArray();
    public boolean USE_SURFACE_VIEW = SharedConfig.useSurfaceInStories;
    public boolean ATTACH_TO_FRAGMENT = true;
    public boolean ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE = false;
    public boolean foundViewToClose = false;
    public boolean allowScreenshots = true;
    public final DarkThemeResourceProvider resourcesProvider = new DarkThemeResourceProvider();
    public final RectF avatarRectTmp = new RectF();
    public final float[] pointPosition = new float[2];

    public final class AnonymousClass2 extends SizeNotifierFrameLayout {
        public float lastTouchX;
        public final SparseArray lastX;
        public final RectF outFromRectAvatar;
        public final RectF outFromRectContainer;
        public final Path path;
        public final float[] radii;
        public final RectF rect1;
        public final RectF rect2;
        public final RectF rect3;
        public float startX;
        public float startY;
        public final BaseFragment val$fragment;

        public final class AnonymousClass1 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final AnonymousClass2 this$1;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, int i) {
                this.$r8$classId = i;
                this.this$1 = anonymousClass2;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        StoryViewer storyViewer = StoryViewer.this;
                        storyViewer.swipeToDismissHorizontalOffset = 0.0f;
                        StoryViewer.access$700(storyViewer);
                        break;
                    default:
                        StoryViewer storyViewer2 = StoryViewer.this;
                        storyViewer2.swipeToDismissOffset = 0.0f;
                        storyViewer2.swipeToReplyOffset = 0.0f;
                        StoryViewer.access$700(storyViewer2);
                        break;
                }
            }
        }

        public AnonymousClass2(Context context, BaseFragment baseFragment) {
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
        public final void dispatchDraw(android.graphics.Canvas r28) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryViewer.AnonymousClass2.dispatchDraw(android.graphics.Canvas):void");
        }

        @Override
        public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            int keyCode = keyEvent.getKeyCode();
            StoryViewer storyViewer = StoryViewer.this;
            if (keyCode != 24 && keyEvent.getKeyCode() != 25) {
                if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                storyViewer.onAttachedBackPressed();
                return true;
            }
            if (StoryViewer.isInSilentMode) {
                storyViewer.toggleSilentMode();
            } else {
                PeerStoriesView currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView();
                if (currentPeerView != null) {
                    PeerStoriesView.StoryItemHolder storyItemHolder = currentPeerView.currentStory;
                    if (storyItemHolder.hasSound() || !storyItemHolder.isVideo) {
                        storyViewer.volumeControl.onKeyDown(keyEvent.getKeyCode(), keyEvent);
                    } else {
                        currentPeerView.showNoSoundHint(true);
                    }
                } else {
                    storyViewer.volumeControl.onKeyDown(keyEvent.getKeyCode(), keyEvent);
                }
            }
            return true;
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            float f;
            boolean z;
            boolean z2;
            float f2;
            SparseArray sparseArray;
            boolean z3;
            boolean zDispatchTouchEvent;
            PeerStoriesView currentPeerView;
            boolean z4;
            AnonymousClass4 anonymousClass4;
            int i;
            HintView2 hintView2;
            HintView2 hintView3;
            ActionBar.AnonymousClass8 anonymousClass8;
            StoryPrivacyButton storyPrivacyButton;
            ReactionsContainerLayout reactionsContainerLayout;
            int i2 = 0;
            StoryViewer storyViewer = StoryViewer.this;
            PeerStoriesView currentPeerView2 = storyViewer.storiesViewPager.getCurrentPeerView();
            if (currentPeerView2 != null) {
                PeerStoriesView.AnonymousClass5 anonymousClass5 = currentPeerView2.storyCaptionView;
                if (anonymousClass5.textSelectionHelper.isInSelectionMode()) {
                    float x = currentPeerView2.getX();
                    float y = ((View) currentPeerView2.getParent()).getY() + currentPeerView2.getY();
                    motionEvent.offsetLocation(-x, -y);
                    if (!anonymousClass5.textSelectionHelper.getOverlayView(currentPeerView2.getContext()).onTouchEvent(motionEvent)) {
                        motionEvent.offsetLocation(x, y);
                        float x2 = 0.0f;
                        if (!storyViewer.isLikesReactions && currentPeerView2 != null && (reactionsContainerLayout = currentPeerView2.likesReactionLayout) != null) {
                            float y2 = 0.0f;
                            for (View view = currentPeerView2; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                                x2 += view.getX();
                                y2 += view.getY();
                            }
                            if (currentPeerView2.likesReactionLayout.getReactionsWindow() != null && currentPeerView2.likesReactionLayout.getReactionsWindow().windowView != null) {
                                motionEvent.offsetLocation(-x2, (-y2) - currentPeerView2.likesReactionLayout.getReactionsWindow().windowView.getTranslationY());
                                currentPeerView2.likesReactionLayout.getReactionsWindow().windowView.dispatchTouchEvent(motionEvent);
                                return true;
                            }
                            Rect rect = AndroidUtilities.rectTmp2;
                            reactionsContainerLayout.getHitRect(rect);
                            rect.offset((int) x2, (int) y2);
                            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                currentPeerView2.showLikesReaction(false);
                                return true;
                            }
                            motionEvent.offsetLocation(-rect.left, -rect.top);
                            reactionsContainerLayout.dispatchTouchEvent(motionEvent);
                            return true;
                        }
                        if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                            storyViewer.inSwipeToDissmissMode = false;
                            AndroidUtilities.cancelRunOnUIThread(storyViewer.longPressRunnable);
                            f = storyViewer.swipeToDismissHorizontalOffset;
                            if (f != 0.0f) {
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                                storyViewer.swipeToDissmissBackAnimator = valueAnimatorOfFloat;
                                valueAnimatorOfFloat.addUpdateListener(new StoryViewer$2$$ExternalSyntheticLambda1(this, i2));
                                storyViewer.swipeToDissmissBackAnimator.addListener(new AnonymousClass1(this, i2));
                                storyViewer.swipeToDissmissBackAnimator.setDuration(250L);
                                storyViewer.swipeToDissmissBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                storyViewer.swipeToDissmissBackAnimator.start();
                            }
                            if (storyViewer.progressToDismiss >= 0.3f) {
                                storyViewer.close(true);
                            }
                            storyViewer.setInTouchMode(false);
                            storyViewer.setLongPressed(false);
                            z = true;
                        } else {
                            z = false;
                        }
                        if (motionEvent.getAction() == 0) {
                            storyViewer.swipeToReplyWaitingKeyboard = false;
                            if (currentPeerView2 != null) {
                                hintView2 = currentPeerView2.privacyHint;
                                PeerStoriesView.AnonymousClass4 anonymousClass6 = currentPeerView2.storyContainer;
                                if (hintView2 != null && hintView2.shown() && (storyPrivacyButton = currentPeerView2.privacyButton) != null && !currentPeerView2.privacyHint.containsTouch(motionEvent, currentPeerView2.privacyHint.getX() + anonymousClass6.getX() + currentPeerView2.getX(), currentPeerView2.privacyHint.getY() + anonymousClass6.getY() + currentPeerView2.getY()) && !currentPeerView2.hitButton(storyPrivacyButton, motionEvent)) {
                                    currentPeerView2.privacyHint.hide();
                                }
                                hintView3 = currentPeerView2.soundTooltip;
                                if (hintView3 != null && hintView3.shown() && (anonymousClass8 = currentPeerView2.muteIconContainer) != null && !currentPeerView2.soundTooltip.containsTouch(motionEvent, currentPeerView2.soundTooltip.getX() + anonymousClass6.getX() + currentPeerView2.getX(), currentPeerView2.soundTooltip.getY() + anonymousClass6.getY() + currentPeerView2.getY()) && !currentPeerView2.hitButton(anonymousClass8, motionEvent)) {
                                    currentPeerView2.soundTooltip.hide();
                                }
                            }
                            storyViewer.storiesViewPager.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        }
                        if (!storyViewer.keyboardVisible || storyViewer.isClosed || storyViewer.isRecording) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        f2 = storyViewer.selfStoriesViewsOffset;
                        sparseArray = this.lastX;
                        if (f2 != 0.0f && !storyViewer.inSwipeToDissmissMode && storyViewer.storiesViewPager.currentState == 1 && motionEvent.getAction() == 2 && z2) {
                            float fFloatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
                            if ((fFloatValue == 0.0f || !(((i = (anonymousClass4 = storyViewer.storiesViewPager).selectedPosition) == 0 && anonymousClass4.progress == 0.0f && fFloatValue < 0.0f) || (i == anonymousClass4.getAdapter().getCount() - 1 && anonymousClass4.progress == 0.0f && fFloatValue > 0.0f))) && storyViewer.swipeToDismissHorizontalOffset == 0.0f) {
                                z3 = false;
                            } else {
                                float f3 = storyViewer.swipeToDismissHorizontalOffset;
                                if (f3 == 0.0f) {
                                    storyViewer.swipeToDismissHorizontalDirection = -fFloatValue;
                                }
                                if ((fFloatValue < 0.0f && storyViewer.swipeToDismissHorizontalDirection > 0.0f) || (fFloatValue > 0.0f && storyViewer.swipeToDismissHorizontalDirection < 0.0f)) {
                                    fFloatValue *= 0.2f;
                                }
                                storyViewer.swipeToDismissHorizontalOffset = f3 - fFloatValue;
                                StoryViewer.access$700(storyViewer);
                                float f4 = storyViewer.swipeToDismissHorizontalOffset;
                                if ((f4 > 0.0f && storyViewer.swipeToDismissHorizontalDirection < 0.0f) || (f4 < 0.0f && storyViewer.swipeToDismissHorizontalDirection > 0.0f)) {
                                    storyViewer.swipeToDismissHorizontalOffset = 0.0f;
                                }
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                        if (currentPeerView2 != null && storyViewer.selfStoriesViewsOffset == 0.0f && !storyViewer.inSwipeToDissmissMode && !storyViewer.isCaption && !storyViewer.isRecording && storyViewer.storiesViewPager.currentState != 1) {
                            PeerStoriesView.AnonymousClass4 anonymousClass7 = currentPeerView2.storyContainer;
                            float[] fArr = storyViewer.pointPosition;
                            AndroidUtilities.getViewPositionInParent(anonymousClass7, this, fArr);
                            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                            PeerStoriesView currentPeerView3 = storyViewer.storiesViewPager.getCurrentPeerView();
                            currentPeerView3.pinchToZoomHelper.checkPinchToZoom(motionEvent, currentPeerView3.storyContainer, null, null, null, null);
                            motionEvent.offsetLocation(fArr[0], fArr[1]);
                        }
                        if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                            sparseArray.clear();
                        } else {
                            for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                                sparseArray.put(motionEvent.getPointerId(i3), Float.valueOf(motionEvent.getX(i3)));
                            }
                        }
                        if (!z3) {
                            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                                if (storyViewer.selfStoriesViewsOffset != 0.0f && !storyViewer.flingCalled && storyViewer.realKeyboardHeight < AndroidUtilities.dp(20.0f)) {
                                    if (storyViewer.selfStoryViewsView.progressToOpen > 0.5f) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    storyViewer.cancelSwipeToViews(z4);
                                }
                                currentPeerView = storyViewer.getCurrentPeerView();
                                if (currentPeerView != null) {
                                    currentPeerView.storyCaptionView.touched = false;
                                }
                            }
                            if (z && !storyViewer.swipeToReplyWaitingKeyboard) {
                                storyViewer.cancelSwipeToReply();
                            }
                            if (zDispatchTouchEvent && (!StoryViewer.animationInProgress || !storyViewer.isInTouchMode)) {
                                return false;
                            }
                        }
                    }
                } else {
                    float x3 = 0.0f;
                    if (!storyViewer.isLikesReactions) {
                    }
                    if (motionEvent.getAction() != 1) {
                        storyViewer.inSwipeToDissmissMode = false;
                        AndroidUtilities.cancelRunOnUIThread(storyViewer.longPressRunnable);
                        f = storyViewer.swipeToDismissHorizontalOffset;
                        if (f != 0.0f) {
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f, 0.0f);
                            storyViewer.swipeToDissmissBackAnimator = valueAnimatorOfFloat2;
                            valueAnimatorOfFloat2.addUpdateListener(new StoryViewer$2$$ExternalSyntheticLambda1(this, i2));
                            storyViewer.swipeToDissmissBackAnimator.addListener(new AnonymousClass1(this, i2));
                            storyViewer.swipeToDissmissBackAnimator.setDuration(250L);
                            storyViewer.swipeToDissmissBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            storyViewer.swipeToDissmissBackAnimator.start();
                        }
                        if (storyViewer.progressToDismiss >= 0.3f) {
                            storyViewer.close(true);
                        }
                        storyViewer.setInTouchMode(false);
                        storyViewer.setLongPressed(false);
                        z = true;
                    } else {
                        storyViewer.inSwipeToDissmissMode = false;
                        AndroidUtilities.cancelRunOnUIThread(storyViewer.longPressRunnable);
                        f = storyViewer.swipeToDismissHorizontalOffset;
                        if (f != 0.0f) {
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f, 0.0f);
                            storyViewer.swipeToDissmissBackAnimator = valueAnimatorOfFloat3;
                            valueAnimatorOfFloat3.addUpdateListener(new StoryViewer$2$$ExternalSyntheticLambda1(this, i2));
                            storyViewer.swipeToDissmissBackAnimator.addListener(new AnonymousClass1(this, i2));
                            storyViewer.swipeToDissmissBackAnimator.setDuration(250L);
                            storyViewer.swipeToDissmissBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            storyViewer.swipeToDissmissBackAnimator.start();
                        }
                        if (storyViewer.progressToDismiss >= 0.3f) {
                            storyViewer.close(true);
                        }
                        storyViewer.setInTouchMode(false);
                        storyViewer.setLongPressed(false);
                        z = true;
                    }
                    if (motionEvent.getAction() == 0) {
                        storyViewer.swipeToReplyWaitingKeyboard = false;
                        if (currentPeerView2 != null) {
                            hintView2 = currentPeerView2.privacyHint;
                            PeerStoriesView.AnonymousClass4 anonymousClass9 = currentPeerView2.storyContainer;
                            if (hintView2 != null) {
                                currentPeerView2.privacyHint.hide();
                            }
                            hintView3 = currentPeerView2.soundTooltip;
                            if (hintView3 != null) {
                                currentPeerView2.soundTooltip.hide();
                            }
                        }
                        storyViewer.storiesViewPager.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    }
                    if (storyViewer.keyboardVisible) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    f2 = storyViewer.selfStoriesViewsOffset;
                    sparseArray = this.lastX;
                    if (f2 != 0.0f) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (currentPeerView2 != null) {
                        PeerStoriesView.AnonymousClass4 anonymousClass10 = currentPeerView2.storyContainer;
                        float[] fArr2 = storyViewer.pointPosition;
                        AndroidUtilities.getViewPositionInParent(anonymousClass10, this, fArr2);
                        motionEvent.offsetLocation(-fArr2[0], -fArr2[1]);
                        PeerStoriesView currentPeerView4 = storyViewer.storiesViewPager.getCurrentPeerView();
                        currentPeerView4.pinchToZoomHelper.checkPinchToZoom(motionEvent, currentPeerView4.storyContainer, null, null, null, null);
                        motionEvent.offsetLocation(fArr2[0], fArr2[1]);
                    }
                    if (motionEvent.getAction() != 1) {
                        sparseArray.clear();
                    } else {
                        sparseArray.clear();
                    }
                    if (!z3) {
                        zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1) {
                            if (storyViewer.selfStoriesViewsOffset != 0.0f) {
                                if (storyViewer.selfStoryViewsView.progressToOpen > 0.5f) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                storyViewer.cancelSwipeToViews(z4);
                            }
                            currentPeerView = storyViewer.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.storyCaptionView.touched = false;
                            }
                        } else {
                            if (storyViewer.selfStoriesViewsOffset != 0.0f) {
                                if (storyViewer.selfStoryViewsView.progressToOpen > 0.5f) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                storyViewer.cancelSwipeToViews(z4);
                            }
                            currentPeerView = storyViewer.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.storyCaptionView.touched = false;
                            }
                        }
                        if (z) {
                            storyViewer.cancelSwipeToReply();
                        }
                        if (zDispatchTouchEvent) {
                        }
                    }
                }
            } else {
                float x4 = 0.0f;
                if (!storyViewer.isLikesReactions) {
                }
                if (motionEvent.getAction() != 1) {
                    storyViewer.inSwipeToDissmissMode = false;
                    AndroidUtilities.cancelRunOnUIThread(storyViewer.longPressRunnable);
                    f = storyViewer.swipeToDismissHorizontalOffset;
                    if (f != 0.0f) {
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f, 0.0f);
                        storyViewer.swipeToDissmissBackAnimator = valueAnimatorOfFloat4;
                        valueAnimatorOfFloat4.addUpdateListener(new StoryViewer$2$$ExternalSyntheticLambda1(this, i2));
                        storyViewer.swipeToDissmissBackAnimator.addListener(new AnonymousClass1(this, i2));
                        storyViewer.swipeToDissmissBackAnimator.setDuration(250L);
                        storyViewer.swipeToDissmissBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        storyViewer.swipeToDissmissBackAnimator.start();
                    }
                    if (storyViewer.progressToDismiss >= 0.3f) {
                        storyViewer.close(true);
                    }
                    storyViewer.setInTouchMode(false);
                    storyViewer.setLongPressed(false);
                    z = true;
                } else {
                    storyViewer.inSwipeToDissmissMode = false;
                    AndroidUtilities.cancelRunOnUIThread(storyViewer.longPressRunnable);
                    f = storyViewer.swipeToDismissHorizontalOffset;
                    if (f != 0.0f) {
                        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f, 0.0f);
                        storyViewer.swipeToDissmissBackAnimator = valueAnimatorOfFloat5;
                        valueAnimatorOfFloat5.addUpdateListener(new StoryViewer$2$$ExternalSyntheticLambda1(this, i2));
                        storyViewer.swipeToDissmissBackAnimator.addListener(new AnonymousClass1(this, i2));
                        storyViewer.swipeToDissmissBackAnimator.setDuration(250L);
                        storyViewer.swipeToDissmissBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        storyViewer.swipeToDissmissBackAnimator.start();
                    }
                    if (storyViewer.progressToDismiss >= 0.3f) {
                        storyViewer.close(true);
                    }
                    storyViewer.setInTouchMode(false);
                    storyViewer.setLongPressed(false);
                    z = true;
                }
                if (motionEvent.getAction() == 0) {
                    storyViewer.swipeToReplyWaitingKeyboard = false;
                    if (currentPeerView2 != null) {
                        hintView2 = currentPeerView2.privacyHint;
                        PeerStoriesView.AnonymousClass4 anonymousClass11 = currentPeerView2.storyContainer;
                        if (hintView2 != null) {
                            currentPeerView2.privacyHint.hide();
                        }
                        hintView3 = currentPeerView2.soundTooltip;
                        if (hintView3 != null) {
                            currentPeerView2.soundTooltip.hide();
                        }
                    }
                    storyViewer.storiesViewPager.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                }
                if (storyViewer.keyboardVisible) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                f2 = storyViewer.selfStoriesViewsOffset;
                sparseArray = this.lastX;
                if (f2 != 0.0f) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (currentPeerView2 != null) {
                    PeerStoriesView.AnonymousClass4 anonymousClass12 = currentPeerView2.storyContainer;
                    float[] fArr3 = storyViewer.pointPosition;
                    AndroidUtilities.getViewPositionInParent(anonymousClass12, this, fArr3);
                    motionEvent.offsetLocation(-fArr3[0], -fArr3[1]);
                    PeerStoriesView currentPeerView5 = storyViewer.storiesViewPager.getCurrentPeerView();
                    currentPeerView5.pinchToZoomHelper.checkPinchToZoom(motionEvent, currentPeerView5.storyContainer, null, null, null, null);
                    motionEvent.offsetLocation(fArr3[0], fArr3[1]);
                }
                if (motionEvent.getAction() != 1) {
                    sparseArray.clear();
                } else {
                    sparseArray.clear();
                }
                if (!z3) {
                    zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1) {
                        if (storyViewer.selfStoriesViewsOffset != 0.0f) {
                            if (storyViewer.selfStoryViewsView.progressToOpen > 0.5f) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            storyViewer.cancelSwipeToViews(z4);
                        }
                        currentPeerView = storyViewer.getCurrentPeerView();
                        if (currentPeerView != null) {
                            currentPeerView.storyCaptionView.touched = false;
                        }
                    } else {
                        if (storyViewer.selfStoriesViewsOffset != 0.0f) {
                            if (storyViewer.selfStoryViewsView.progressToOpen > 0.5f) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            storyViewer.cancelSwipeToViews(z4);
                        }
                        currentPeerView = storyViewer.getCurrentPeerView();
                        if (currentPeerView != null) {
                            currentPeerView.storyCaptionView.touched = false;
                        }
                    }
                    if (z) {
                        storyViewer.cancelSwipeToReply();
                    }
                    if (zDispatchTouchEvent) {
                    }
                }
            }
            return true;
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (view == StoryViewer.this.aspectRatioFrameLayout) {
                return false;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            StoryViewer storyViewer = StoryViewer.this;
            if (storyViewer.ATTACH_TO_FRAGMENT && !storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
                BaseFragment baseFragment = this.val$fragment;
                AndroidUtilities.requestAdjustResize(baseFragment.getParentActivity(), baseFragment.getClassGuid());
            }
            Bulletin.addDelegate(this, new Bulletin.Delegate() {
                public final float[] position = new float[2];

                @Override
                public final boolean allowLayoutChanges() {
                    return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public final boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public final boolean clipWithGradient(int i) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
                }

                @Override
                public final int getBottomOffset(int i) {
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                    if (currentPeerView == null) {
                        return 0;
                    }
                    AnonymousClass2 anonymousClass3 = StoryViewer.this.windowView;
                    PeerStoriesView.AnonymousClass4 anonymousClass4 = currentPeerView.storyContainer;
                    float[] fArr = this.position;
                    AndroidUtilities.getViewPositionInParent(anonymousClass4, anonymousClass3, fArr);
                    return (int) (anonymousClass2.getMeasuredHeight() - (fArr[1] + anonymousClass4.getMeasuredHeight()));
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
                public final int getTopOffset(int i) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
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
            NotificationCenter.getInstance(storyViewer.currentAccount).addObserver(storyViewer, NotificationCenter.storiesListUpdated);
            NotificationCenter.getInstance(storyViewer.currentAccount).addObserver(storyViewer, NotificationCenter.storiesUpdated);
            NotificationCenter.getInstance(storyViewer.currentAccount).addObserver(storyViewer, NotificationCenter.articleClosed);
            NotificationCenter.getInstance(storyViewer.currentAccount).addObserver(storyViewer, NotificationCenter.openArticle);
            NotificationCenter.getInstance(storyViewer.currentAccount).addObserver(storyViewer, NotificationCenter.storyDeleted);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
            StoryViewer storyViewer = StoryViewer.this;
            NotificationCenter.getInstance(storyViewer.currentAccount).removeObserver(storyViewer, NotificationCenter.storiesListUpdated);
            NotificationCenter.getInstance(storyViewer.currentAccount).removeObserver(storyViewer, NotificationCenter.storiesUpdated);
            NotificationCenter.getInstance(storyViewer.currentAccount).removeObserver(storyViewer, NotificationCenter.articleClosed);
            NotificationCenter.getInstance(storyViewer.currentAccount).removeObserver(storyViewer, NotificationCenter.openArticle);
            NotificationCenter.getInstance(storyViewer.currentAccount).removeObserver(storyViewer, NotificationCenter.storyDeleted);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            PeerStoriesView.AnonymousClass10 anonymousClass10;
            VideoPlayerHolder videoPlayerHolder;
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope;
            PeerStoriesView currentPeerView;
            PeerStoriesView.StoryItemHolder storyItemHolder;
            TL_stories.StoryItem storyItem;
            TLRPC.MessageMedia messageMedia;
            TLRPC.Document document;
            PeerStoriesView.AnonymousClass10 anonymousClass11;
            int action = motionEvent.getAction();
            StoryViewer storyViewer = StoryViewer.this;
            if (action == 0 && storyViewer.progressToOpen == 1.0f) {
                float x = motionEvent.getX();
                this.lastTouchX = x;
                this.startX = x;
                this.startY = motionEvent.getY();
                storyViewer.verticalScrollDetected = false;
                storyViewer.allowIntercept = (storyViewer.isRecording || StoryViewer.access$100(storyViewer, storyViewer.windowView, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
                storyViewer.allowSwipeToDissmiss = (storyViewer.isRecording || StoryViewer.access$100(storyViewer, storyViewer.windowView, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
                storyViewer.setInTouchMode(storyViewer.allowIntercept && !storyViewer.isCaptionPartVisible);
                PeerStoriesView currentPeerView2 = storyViewer.getCurrentPeerView();
                if (storyViewer.allowIntercept && currentPeerView2 != null && (anonymousClass11 = currentPeerView2.liveCommentsView) != null) {
                    anonymousClass11.setAllowTouches(false);
                }
                if (storyViewer.allowIntercept && !storyViewer.isRecording && storyViewer.isCaptionPartVisible) {
                    BotSensors$1$$ExternalSyntheticLambda0 botSensors$1$$ExternalSyntheticLambda0 = new BotSensors$1$$ExternalSyntheticLambda0(this, 12);
                    storyViewer.delayedTapRunnable = botSensors$1$$ExternalSyntheticLambda0;
                    AndroidUtilities.runOnUIThread(botSensors$1$$ExternalSyntheticLambda0, 150L);
                }
                if (storyViewer.allowIntercept && !storyViewer.keyboardVisible && !storyViewer.isRecording && !storyViewer.isInTextSelectionMode) {
                    AndroidUtilities.runOnUIThread(storyViewer.longPressRunnable, 400L);
                }
            } else if (motionEvent.getAction() == 2) {
                float fAbs = Math.abs(this.startY - motionEvent.getY());
                float fAbs2 = Math.abs(this.startX - motionEvent.getX());
                if (storyViewer.isLongpressed && storyViewer.inSeekingMode && !storyViewer.isInPinchToZoom && !storyViewer.inSwipeToDissmissMode && (videoPlayerSharedScope = storyViewer.currentPlayerScope) != null && videoPlayerSharedScope.player != null && (currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView()) != null && (storyItemHolder = currentPeerView.currentStory) != null && storyItemHolder.uploadingStory == null && storyItemHolder.isVideo) {
                    long documentDuration = currentPeerView.videoDuration;
                    if (documentDuration <= 0 && (storyItem = storyItemHolder.storyItem) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                        documentDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                    }
                    if (documentDuration > 0) {
                        float x2 = motionEvent.getX();
                        VideoPlayerHolder videoPlayerHolder2 = storyViewer.currentPlayerScope.player;
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
                if (fAbs > fAbs2 && !storyViewer.inSeekingMode && !storyViewer.verticalScrollDetected && fAbs > AndroidUtilities.touchSlop * 2.0f) {
                    storyViewer.verticalScrollDetected = true;
                }
                if (!storyViewer.inSwipeToDissmissMode && !storyViewer.inSeekingMode && !storyViewer.keyboardVisible && storyViewer.allowSwipeToDissmiss) {
                    if (fAbs > fAbs2 && fAbs > AndroidUtilities.touchSlop * 2.0f) {
                        storyViewer.inSwipeToDissmissMode = true;
                        PeerStoriesView currentPeerView3 = storyViewer.storiesViewPager.getCurrentPeerView();
                        if (currentPeerView3 != null) {
                            PeerStoriesView.AnonymousClass5 anonymousClass5 = currentPeerView3.storyCaptionView;
                            if (anonymousClass5.textSelectionHelper.isInSelectionMode()) {
                                anonymousClass5.textSelectionHelper.clear();
                            }
                        }
                        boolean z = (currentPeerView3 == null || currentPeerView3.currentStory.isLive || (!currentPeerView3.isSelf && (!currentPeerView3.isChannel || !currentPeerView3.userCanSeeViews))) ? false : true;
                        storyViewer.allowSwipeToReply = (z || currentPeerView3 == null || currentPeerView3.isChannel || currentPeerView3.isPremiumBlocked || storyViewer.storiesIntro != null) ? false : true;
                        boolean z2 = z && !currentPeerView3.unsupported && currentPeerView3.currentStory.storyItem != null && storyViewer.storiesIntro == null;
                        storyViewer.allowSelfStoriesView = z2;
                        if (z2 && this.keyboardHeight != 0) {
                            storyViewer.allowSelfStoriesView = false;
                        }
                        if (storyViewer.allowSelfStoriesView) {
                            storyViewer.checkSelfStoriesView();
                        }
                        storyViewer.swipeToReplyOffset = 0.0f;
                        BotSensors$1$$ExternalSyntheticLambda0 botSensors$1$$ExternalSyntheticLambda1 = storyViewer.delayedTapRunnable;
                        if (botSensors$1$$ExternalSyntheticLambda1 != null) {
                            AndroidUtilities.cancelRunOnUIThread(botSensors$1$$ExternalSyntheticLambda1);
                            storyViewer.delayedTapRunnable.run();
                            storyViewer.delayedTapRunnable = null;
                        }
                        AndroidUtilities.cancelRunOnUIThread(storyViewer.longPressRunnable);
                    }
                    storyViewer.layoutAndFindView();
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(storyViewer.longPressRunnable);
                BotSensors$1$$ExternalSyntheticLambda0 botSensors$1$$ExternalSyntheticLambda2 = storyViewer.delayedTapRunnable;
                if (botSensors$1$$ExternalSyntheticLambda2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(botSensors$1$$ExternalSyntheticLambda2);
                    storyViewer.delayedTapRunnable = null;
                }
                storyViewer.setInTouchMode(false);
                storyViewer.verticalScrollDetected = false;
                storyViewer.inSeekingMode = false;
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope2 = storyViewer.currentPlayerScope;
                if (videoPlayerSharedScope2 != null && (videoPlayerHolder = videoPlayerSharedScope2.player) != null) {
                    videoPlayerHolder.setSeeking(false);
                }
                PeerStoriesView currentPeerView4 = storyViewer.getCurrentPeerView();
                if (currentPeerView4 != null && (anonymousClass10 = currentPeerView4.liveCommentsView) != null) {
                    anonymousClass10.setAllowTouches(true);
                }
            }
            SelfStoryViewsView selfStoryViewsView = storyViewer.selfStoryViewsView;
            boolean z3 = selfStoryViewsView != null && selfStoryViewsView.progressToOpen == 1.0f;
            if (!storyViewer.inSwipeToDissmissMode && !z3) {
                storyViewer.gestureDetector.onTouchEvent(motionEvent);
            }
            return storyViewer.inSwipeToDissmissMode || super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            StoryViewer storyViewer = StoryViewer.this;
            ((FrameLayout.LayoutParams) storyViewer.volumeControl.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
            storyViewer.volumeControl.getLayoutParams().height = AndroidUtilities.dp(2.0f);
            super.onMeasure(i, i2);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            PeerStoriesView.AnonymousClass10 anonymousClass10;
            int action = motionEvent.getAction();
            StoryViewer storyViewer = StoryViewer.this;
            int i = 1;
            if (action == 1 || motionEvent.getAction() == 3) {
                storyViewer.inSwipeToDissmissMode = false;
                storyViewer.setInTouchMode(false);
                if (storyViewer.progressToDismiss >= 1.0f) {
                    storyViewer.close(true);
                } else if (!storyViewer.isClosed) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(storyViewer.swipeToDismissOffset, 0.0f);
                    storyViewer.swipeToDissmissBackAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new StoryViewer$2$$ExternalSyntheticLambda1(this, i));
                    storyViewer.swipeToDissmissBackAnimator.addListener(new AnonymousClass1(this, i));
                    storyViewer.swipeToDissmissBackAnimator.setDuration(150L);
                    storyViewer.swipeToDissmissBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    storyViewer.swipeToDissmissBackAnimator.start();
                }
                PeerStoriesView currentPeerView = storyViewer.getCurrentPeerView();
                if (currentPeerView != null && (anonymousClass10 = currentPeerView.liveCommentsView) != null) {
                    anonymousClass10.setAllowTouches(true);
                }
            }
            if (!storyViewer.inSwipeToDissmissMode && !storyViewer.keyboardVisible && storyViewer.swipeToReplyOffset == 0.0f && ((storyViewer.selfStoriesViewsOffset == 0.0f || (!storyViewer.allowIntercept && !storyViewer.verticalScrollDetected)) && !storyViewer.isInTextSelectionMode)) {
                return false;
            }
            storyViewer.gestureDetector.onTouchEvent(motionEvent);
            return true;
        }

        @Override
        public final void requestDisallowInterceptTouchEvent(boolean z) {
            super.requestDisallowInterceptTouchEvent(z);
            StoryViewer.this.allowIntercept = false;
        }
    }

    public final class AnonymousClass4 extends HwStoriesViewPager {
        public AnonymousClass4(int i, Context context, StoryViewer storyViewer, DarkThemeResourceProvider darkThemeResourceProvider) {
            super(i, context, storyViewer, darkThemeResourceProvider);
        }
    }

    public final class AnonymousClass5 implements PeerStoriesView.Delegate {
        public final Context val$context;
        public final ArrayList val$peerIds;
        public final StoriesController.StoriesList val$storiesList;

        public AnonymousClass5(StoriesController.StoriesList storiesList, ArrayList arrayList, Context context) {
            this.val$storiesList = storiesList;
            this.val$peerIds = arrayList;
            this.val$context = context;
        }

        public final void requestPlayer(TLRPC.Document document, Uri uri, long j, PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope) {
            long j2;
            VideoPlayerHolder videoPlayerHolder;
            StoryViewer storyViewer = StoryViewer.this;
            if (storyViewer.isClosed || storyViewer.progressToOpen < 0.9f) {
                LivePlayerView livePlayerView = storyViewer.liveView;
                if (livePlayerView != null) {
                    livePlayerView.setScope(0L, null);
                }
                LivePlayer livePlayer = storyViewer.livePlayer;
                if (livePlayer != null) {
                    if (livePlayer.outgoing) {
                        livePlayer.setDisplaySink(null);
                    } else {
                        livePlayer.destroy();
                    }
                    storyViewer.livePlayer = null;
                }
                FileLog.d("StoryViewer requestPlayer ignored, because closed: " + storyViewer.isClosed + ", " + storyViewer.progressToOpen);
                videoPlayerSharedScope.firstFrameRendered = false;
                videoPlayerSharedScope.player = null;
                videoPlayerSharedScope.livePlayer = null;
                return;
            }
            Uri uri2 = storyViewer.lastUri;
            boolean zEquals = TextUtils.equals(uri2 == null ? null : uri2.toString(), uri == null ? null : uri.toString());
            if (!zEquals || (videoPlayerHolder = storyViewer.playerHolder) == null) {
                storyViewer.lastUri = uri;
                LivePlayerView livePlayerView2 = storyViewer.liveView;
                if (livePlayerView2 != null) {
                    livePlayerView2.setScope(0L, null);
                }
                LivePlayer livePlayer2 = storyViewer.livePlayer;
                if (livePlayer2 != null) {
                    if (livePlayer2.outgoing) {
                        livePlayer2.setDisplaySink(null);
                    } else {
                        livePlayer2.destroy();
                    }
                    storyViewer.livePlayer = null;
                }
                VideoPlayerHolder videoPlayerHolder2 = storyViewer.playerHolder;
                if (videoPlayerHolder2 != null) {
                    videoPlayerHolder2.release(null);
                    storyViewer.playerHolder = null;
                }
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope2 = storyViewer.currentPlayerScope;
                if (videoPlayerSharedScope2 != null) {
                    videoPlayerSharedScope2.player = null;
                    videoPlayerSharedScope2.livePlayer = null;
                    videoPlayerSharedScope2.firstFrameRendered = false;
                    videoPlayerSharedScope2.renderView = null;
                    videoPlayerSharedScope2.textureView = null;
                    videoPlayerSharedScope2.surfaceView = null;
                    videoPlayerSharedScope2.invalidate();
                    storyViewer.currentPlayerScope = null;
                }
                if (uri != null) {
                    storyViewer.currentPlayerScope = videoPlayerSharedScope;
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = storyViewer.preparedPlayers;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        if (((VideoPlayerHolder) arrayList.get(i)).uri.equals(uri)) {
                            storyViewer.playerHolder = (VideoPlayerHolder) arrayList.remove(i);
                            break;
                        }
                        i++;
                    }
                    if (storyViewer.playerHolder == null) {
                        VideoPlayerHolder videoPlayerHolder3 = storyViewer.new VideoPlayerHolder(storyViewer.surfaceView, storyViewer.textureView);
                        storyViewer.playerHolder = videoPlayerHolder3;
                        videoPlayerHolder3.document = document;
                    }
                    VideoPlayerHolder videoPlayerHolder4 = storyViewer.playerHolder;
                    videoPlayerHolder4.uri = uri;
                    videoPlayerHolder4.setSpeed(StoryViewer.currentSpeed);
                    PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope3 = storyViewer.currentPlayerScope;
                    VideoPlayerHolder videoPlayerHolder5 = storyViewer.playerHolder;
                    videoPlayerSharedScope3.player = videoPlayerHolder5;
                    videoPlayerSharedScope3.firstFrameRendered = false;
                    videoPlayerSharedScope3.renderView = storyViewer.aspectRatioFrameLayout;
                    videoPlayerSharedScope3.textureView = storyViewer.textureView;
                    videoPlayerSharedScope3.surfaceView = storyViewer.surfaceView;
                    videoPlayerSharedScope3.livePlayer = null;
                    FileStreamLoadOperation.setPriorityForDocument(videoPlayerHolder5.document, 3);
                    FileLoader.getInstance(storyViewer.currentAccount).changePriority(3, storyViewer.playerHolder.document, null, null, null, null, null);
                    if (j == 0) {
                        long j3 = storyViewer.playerSavedPosition;
                        if (j3 != 0) {
                            storyViewer.currentPlayerScope.firstFrameRendered = true;
                            j2 = j3;
                        } else {
                            j2 = j;
                        }
                    } else {
                        j2 = j;
                    }
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    storyViewer.currentPlayerScope.player.start(false, storyViewer.isPaused(), uri, j2, StoryViewer.isInSilentMode, StoryViewer.currentSpeed);
                    storyViewer.currentPlayerScope.invalidate();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            } else if (zEquals) {
                storyViewer.currentPlayerScope = videoPlayerSharedScope;
                videoPlayerSharedScope.player = videoPlayerHolder;
                videoPlayerSharedScope.livePlayer = null;
                videoPlayerHolder.setSpeed(StoryViewer.currentSpeed);
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope4 = storyViewer.currentPlayerScope;
                videoPlayerSharedScope4.firstFrameRendered = storyViewer.playerHolder.firstFrameRendered;
                videoPlayerSharedScope4.renderView = storyViewer.aspectRatioFrameLayout;
                videoPlayerSharedScope4.textureView = storyViewer.textureView;
                videoPlayerSharedScope4.surfaceView = storyViewer.surfaceView;
                FileLog.d("StoryViewer requestPlayer: same url");
            }
            switchToLive(false, uri != null);
            storyViewer.playerSavedPosition = 0L;
            storyViewer.updatePlayingMode();
        }

        public final void setIsCaptionPartVisible() {
            StoryViewer.this.isCaptionPartVisible = false;
        }

        public final void setIsInPinchToZoom(boolean z) {
            VideoPlayerHolder videoPlayerHolder;
            StoryViewer storyViewer = StoryViewer.this;
            if (!storyViewer.isInPinchToZoom && z && storyViewer.inSeekingMode) {
                storyViewer.inSeekingMode = false;
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = storyViewer.currentPlayerScope;
                if (videoPlayerSharedScope != null && (videoPlayerHolder = videoPlayerSharedScope.player) != null) {
                    videoPlayerHolder.setSeeking(false);
                }
                PeerStoriesView currentPeerView = storyViewer.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
            }
            storyViewer.isInPinchToZoom = z;
            storyViewer.updatePlayingMode();
        }

        public final void setPopupIsVisible(boolean z) {
            StoryViewer storyViewer = StoryViewer.this;
            storyViewer.isPopupVisible = z;
            storyViewer.updatePlayingMode();
        }

        public final void setTranslating() {
            StoryViewer storyViewer = StoryViewer.this;
            storyViewer.isTranslating = false;
            storyViewer.updatePlayingMode();
        }

        public final void switchToLive(boolean z, boolean z2) {
            int i;
            StoryViewer storyViewer = StoryViewer.this;
            LivePlayerView livePlayerView = storyViewer.liveView;
            if (livePlayerView != null) {
                livePlayerView.setVisibility(z ? 0 : 8);
            }
            SurfaceView surfaceView = storyViewer.surfaceView;
            if (surfaceView != null) {
                if (z) {
                    i = 8;
                } else {
                    i = z2 ? 0 : 4;
                }
                surfaceView.setVisibility(i);
            }
            AnonymousClass6 anonymousClass6 = storyViewer.textureView;
            if (anonymousClass6 != null) {
                anonymousClass6.setVisibility(z ? 8 : 0);
            }
        }

        public final void switchToNextAndRemoveCurrentPeer() {
            StoryViewer storyViewer = StoryViewer.this;
            StoriesController.StoriesList storiesList = this.val$storiesList;
            if (storiesList == null) {
                ArrayList arrayList = new ArrayList(this.val$peerIds);
                int iIndexOf = arrayList.indexOf(Long.valueOf(storyViewer.storiesViewPager.getCurrentPeerView().getCurrentPeer()));
                if (iIndexOf < 0) {
                    storyViewer.close(false);
                    return;
                }
                arrayList.remove(iIndexOf);
                if (storyViewer.storiesViewPager.switchToNext(true)) {
                    storyViewer.storiesViewPager.doOnNextIdle = new RichTextCell$2$$ExternalSyntheticLambda1(this, arrayList, iIndexOf, 19);
                    return;
                } else {
                    storyViewer.close(false);
                    return;
                }
            }
            if (storyViewer.storiesViewPager.days == null) {
                return;
            }
            ArrayList arrayList2 = new ArrayList(storyViewer.storiesViewPager.days);
            int iIndexOf2 = storyViewer.storiesViewPager.getCurrentPeerView() == null ? -1 : arrayList2.indexOf(storyViewer.storiesViewPager.getCurrentPeerView().getCurrentDay());
            if (iIndexOf2 < 0) {
                storyViewer.close(false);
                return;
            }
            arrayList2.remove(iIndexOf2);
            if (storyViewer.storiesViewPager.switchToNext(true)) {
                storyViewer.storiesViewPager.doOnNextIdle = new EglRenderer$$ExternalSyntheticLambda6(this, storiesList, arrayList2, 3);
            } else {
                storyViewer.close(false);
            }
        }
    }

    public final class AnonymousClass7 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public boolean val$open;

        public AnonymousClass7(Object obj, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$open = z;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    this.val$open = true;
                    break;
                case 20:
                    ((CommunityEditActivity) this.this$0).avatarAnimation = null;
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            LivePlayer livePlayer;
            RadialProgressView radialProgressView;
            switch (this.$r8$classId) {
                case 0:
                    StoryViewer storyViewer = (StoryViewer) this.this$0;
                    storyViewer.locker.unlock();
                    storyViewer.selfStoriesViewsOffset = this.val$open ? storyViewer.selfStoryViewsView.maxSelfStoriesViewsOffset : 0.0f;
                    PeerStoriesView currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView();
                    if (currentPeerView != null) {
                        currentPeerView.invalidate();
                    }
                    storyViewer.containerView.invalidate();
                    storyViewer.swipeToViewsAnimator = null;
                    break;
                case 1:
                    if (!this.val$open) {
                        FastScroller fastScroller = (FastScroller) this.this$0;
                        if (((Float) fastScroller.mShowHideAnimator.getAnimatedValue()).floatValue() != 0.0f) {
                            fastScroller.mAnimationState = 2;
                            fastScroller.mRecyclerView.invalidate();
                        } else {
                            fastScroller.mAnimationState = 0;
                            fastScroller.setState(0);
                        }
                    } else {
                        this.val$open = false;
                    }
                    break;
                case 2:
                    boolean z = this.val$open;
                    float f = z ? 1.0f : 0.0f;
                    MessagesSearchAdapter.StoriesView storiesView = (MessagesSearchAdapter.StoriesView) this.this$0;
                    storiesView.transitValue = f;
                    storiesView.invalidate();
                    int i = 0;
                    while (i < 2) {
                        storiesView.titleTextView[i].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), storiesView.transitValue));
                        storiesView.titleTextView[i].setVisibility((i == 1) == z ? 0 : 8);
                        storiesView.titleTextView[i].setAlpha(AndroidUtilities.lerp(i == 0 ? 1.0f : 0.0f, i == 1 ? 1.0f : 0.0f, storiesView.transitValue));
                        storiesView.subtitleTextView[i].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), storiesView.transitValue));
                        storiesView.subtitleTextView[i].setVisibility((i == 1) == z ? 0 : 8);
                        storiesView.subtitleTextView[i].setAlpha(AndroidUtilities.lerp(i == 0 ? 1.0f : 0.0f, i == 1 ? 1.0f : 0.0f, storiesView.transitValue));
                        i++;
                    }
                    break;
                case 3:
                    if (this.val$open) {
                        ((CropView) this.this$0).fitContentInBounds(false, false, true, false);
                    }
                    break;
                case 4:
                    PipettePickerView pipettePickerView = (PipettePickerView) this.this$0;
                    ColorPickerBottomSheet.this.pipetteDelegate.onStopColorPipette();
                    if (this.val$open) {
                        pipettePickerView.colorListener.accept(Integer.valueOf(pipettePickerView.mColor));
                    }
                    if (pipettePickerView.getParent() != null) {
                        ((ViewGroup) pipettePickerView.getParent()).removeView(pipettePickerView);
                    }
                    break;
                case 5:
                    boolean z2 = this.val$open;
                    LimitPreviewView limitPreviewView = (LimitPreviewView) this.this$0;
                    if (z2) {
                        limitPreviewView.animatingRotation = false;
                    }
                    Runnable runnable = limitPreviewView.animateStarRatingRunnable;
                    if (runnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                        limitPreviewView.animateStarRatingRunnable.run();
                    }
                    break;
                case 6:
                    float f2 = this.val$open ? 1.0f : 0.0f;
                    PremiumButtonView premiumButtonView = (PremiumButtonView) this.this$0;
                    premiumButtonView.loadingT = f2;
                    premiumButtonView.buttonTextView.invalidate();
                    CheckBoxCell.AnonymousClass1 anonymousClass1 = premiumButtonView.overlayTextView;
                    if (anonymousClass1 != null) {
                        anonymousClass1.invalidate();
                    }
                    break;
                case 7:
                    CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) this.this$0;
                    customEmojiReactionsWindow.updateContainersAlpha();
                    customEmojiReactionsWindow.updateContentPosition();
                    boolean z3 = this.val$open;
                    CustomEmojiReactionsWindow.access$600(customEmojiReactionsWindow, z3);
                    customEmojiReactionsWindow.selectAnimatedEmojiDialog.invalidateOutline();
                    customEmojiReactionsWindow.enterTransitionProgress = z3 ? 1.0f : 0.0f;
                    if (z3) {
                        customEmojiReactionsWindow.enterTransitionFinished = true;
                        customEmojiReactionsWindow.containerView.invalidate();
                    }
                    float fClamp = Utilities.clamp(customEmojiReactionsWindow.enterTransitionProgress, 1.0f, 0.0f);
                    ReactionsContainerLayout reactionsContainerLayout = customEmojiReactionsWindow.reactionsContainerLayout;
                    reactionsContainerLayout.setCustomEmojiEnterProgress(fClamp);
                    if (!z3) {
                        reactionsContainerLayout.setImportantForAccessibility(0);
                        reactionsContainerLayout.setSkipDraw(false);
                        customEmojiReactionsWindow.removeView();
                        Runtime.getRuntime().gc();
                        int i2 = customEmojiReactionsWindow.type;
                        reactionsContainerLayout.setCustomEmojiReactionsBackground((i2 == 4 || i2 == 5) ? false : true);
                    }
                    customEmojiReactionsWindow.transition = false;
                    break;
                case 8:
                    float f3 = this.val$open ? 1.0f : 0.0f;
                    DialogStoriesCell dialogStoriesCell = (DialogStoriesCell) this.this$0;
                    dialogStoriesCell.collapsedProgress2 = f3;
                    dialogStoriesCell.checkCollapsedProgress();
                    break;
                case 9:
                    PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.this$0;
                    LiveCommentsView.AnonymousClass1 anonymousClass2 = anonymousClass10.listView;
                    boolean z4 = this.val$open;
                    anonymousClass2.setAlpha(z4 ? 0.0f : 1.0f);
                    anonymousClass10.shadowView.setAlpha(z4 ? 0.0f : 0.5f);
                    anonymousClass10.invalidate();
                    break;
                case 10:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    liveStoryPipOverlay.windowManager.removeViewImmediate(liveStoryPipOverlay.contentView);
                    LivePlayerView livePlayerView = liveStoryPipOverlay.textureView;
                    TextureViewRenderer textureViewRenderer = livePlayerView.textureView;
                    if (textureViewRenderer != null) {
                        textureViewRenderer.release();
                    }
                    livePlayerView.firstFrameRendered = false;
                    livePlayerView.setTextureVisible(false, false);
                    if (this.val$open && (livePlayer = liveStoryPipOverlay.livePlayer) != null && livePlayer != LivePlayer.recording) {
                        livePlayer.destroy();
                    }
                    liveStoryPipOverlay.livePlayer = null;
                    liveStoryPipOverlay.placeholderShown = true;
                    liveStoryPipOverlay.consumingChild = null;
                    liveStoryPipOverlay.isScrolling = false;
                    break;
                case 11:
                    float f4 = this.val$open ? 1.0f : 0.0f;
                    ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.this$0;
                    buttonWithCounterView.loadingT = f4;
                    buttonWithCounterView.invalidate();
                    break;
                case 12:
                    CaptionContainerView captionContainerView = (CaptionContainerView) this.this$0;
                    boolean z5 = this.val$open;
                    if (!z5) {
                        captionContainerView.applyButton.setVisibility(8);
                        MentionsContainerView mentionsContainerView = captionContainerView.mentionContainer;
                        if (mentionsContainerView != null) {
                            mentionsContainerView.setVisibility(8);
                        }
                    }
                    if (z5) {
                        captionContainerView.editText.getEditText().setAllowDrawCursor(true);
                    }
                    captionContainerView.afterUpdateShownKeyboard(z5);
                    break;
                case 13:
                    boolean z6 = this.val$open;
                    float f5 = z6 ? 1.0f : 0.0f;
                    CollageLayoutButton.CollageLayoutListView collageLayoutListView = (CollageLayoutButton.CollageLayoutListView) this.this$0;
                    collageLayoutListView.visibleProgress = f5;
                    collageLayoutListView.listView.invalidate();
                    collageLayoutListView.listView.setVisibility(z6 ? 0 : 8);
                    break;
                case 14:
                    if (!this.val$open) {
                        ((GalleryListView) this.this$0).buttonsLayout.setVisibility(8);
                    }
                    break;
                case 15:
                    if (!this.val$open) {
                        ((MultipleStoriesSelector) this.this$0).listView.setVisibility(8);
                    }
                    break;
                case 16:
                    if (!this.val$open) {
                        PaintView paintView = (PaintView) this.this$0;
                        paintView.reactionLayout.setVisibility(8);
                        paintView.reactionLayout.reset();
                    }
                    break;
                case 17:
                    boolean z7 = this.val$open;
                    StoryPrivacyBottomSheet.Page.ButtonContainer buttonContainer = (StoryPrivacyBottomSheet.Page.ButtonContainer) this.this$0;
                    if (z7) {
                        buttonContainer.setVisibility(8);
                    }
                    buttonContainer.hideAnimator = null;
                    break;
                case 18:
                    boolean z8 = this.val$open;
                    StoryRecorder storyRecorder = (StoryRecorder) this.this$0;
                    if (!z8) {
                        storyRecorder.zoomControlView.setVisibility(8);
                    }
                    storyRecorder.zoomControlAnimation = null;
                    break;
                case 19:
                    float f6 = this.val$open ? 1.0f : 0.0f;
                    BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.this$0;
                    botWebViewSheet.openedProgress = f6;
                    botWebViewSheet.checkNavBarColor();
                    break;
                default:
                    CommunityEditActivity communityEditActivity = (CommunityEditActivity) this.this$0;
                    if (communityEditActivity.avatarAnimation != null && (radialProgressView = communityEditActivity.avatarProgressView) != null) {
                        if (!this.val$open) {
                            radialProgressView.setVisibility(4);
                            communityEditActivity.avatarOverlay.setVisibility(4);
                        }
                        communityEditActivity.avatarAnimation = null;
                        break;
                    }
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 8:
                    super.onAnimationStart(animator);
                    try {
                        ((DialogStoriesCell) this.this$0).performHapticFeedback(3);
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }

        public AnonymousClass7(FastScroller fastScroller) {
            this.$r8$classId = 1;
            this.this$0 = fastScroller;
            this.val$open = false;
        }
    }

    public final class AnonymousClass8 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final StoryViewer this$0;

        public AnonymousClass8(StoryViewer storyViewer, int i) {
            this.$r8$classId = i;
            this.this$0 = storyViewer;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            PeerStoriesView currentPeerView;
            RadialProgress radialProgress;
            switch (this.$r8$classId) {
                case 0:
                    StoryViewer storyViewer = this.this$0;
                    storyViewer.swipeToReplyBackAnimator = null;
                    storyViewer.swipeToReplyOffset = 0.0f;
                    storyViewer.swipeToReplyProgress = 0.0f;
                    AnonymousClass4 anonymousClass4 = storyViewer.storiesViewPager;
                    PeerStoriesView currentPeerView2 = anonymousClass4 != null ? anonymousClass4.getCurrentPeerView() : null;
                    if (currentPeerView2 != null) {
                        currentPeerView2.invalidate();
                    }
                    break;
                case 1:
                    super.onAnimationEnd(animator);
                    StoryViewer storyViewer2 = this.this$0;
                    AnonymousClass3 anonymousClass3 = storyViewer2.containerView;
                    if (anonymousClass3 != null) {
                        anonymousClass3.disableHwAcceleration(true);
                    }
                    storyViewer2.checkNavBarColor();
                    storyViewer2.locker.unlock();
                    StoriesIntro storiesIntro = storyViewer2.storiesIntro;
                    if (storiesIntro != null) {
                        storiesIntro.stopAnimation();
                        AndroidUtilities.removeFromParent(storyViewer2.storiesIntro);
                        storyViewer2.storiesIntro = null;
                    }
                    TransitionViewHolder transitionViewHolder = storyViewer2.transitionViewHolder;
                    ImageReceiver imageReceiver = transitionViewHolder.avatarImage;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        transitionViewHolder.avatarImage = null;
                    }
                    ImageReceiver imageReceiver2 = transitionViewHolder.storyImage;
                    if (imageReceiver2 != null) {
                        imageReceiver2.setAlpha(1.0f);
                        transitionViewHolder.storyImage.setVisible(true, true);
                    }
                    if (transitionViewHolder.radialProgressUpload != null && (currentPeerView = storyViewer2.getCurrentPeerView()) != null && (radialProgress = currentPeerView.headerView.radialProgress) != null) {
                        transitionViewHolder.radialProgressUpload.copyParams(radialProgress);
                    }
                    PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = storyViewer2.currentPlayerScope;
                    if (videoPlayerSharedScope != null) {
                        videoPlayerSharedScope.invalidate();
                    }
                    SurfaceView surfaceView = storyViewer2.surfaceView;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    storyViewer2.release();
                    try {
                        AndroidUtilities.runOnUIThread(new BotSensors$1$$ExternalSyntheticLambda0(this, 11));
                        break;
                    } catch (Exception unused) {
                    }
                    storyViewer2.isShowing = false;
                    storyViewer2.foundViewToClose = false;
                    StoryViewer$$ExternalSyntheticLambda2 storyViewer$$ExternalSyntheticLambda2 = storyViewer2.onCloseListener;
                    if (storyViewer$$ExternalSyntheticLambda2 != null) {
                        storyViewer$$ExternalSyntheticLambda2.run();
                        storyViewer2.onCloseListener = null;
                    }
                    break;
                default:
                    StoryViewer storyViewer3 = this.this$0;
                    storyViewer3.progressToOpen = 1.0f;
                    storyViewer3.checkNavBarColor();
                    StoryViewer.animationInProgress = false;
                    AnonymousClass3 anonymousClass5 = storyViewer3.containerView;
                    if (anonymousClass5 != null) {
                        anonymousClass5.disableHwAcceleration(true);
                    }
                    AnonymousClass2 anonymousClass2 = storyViewer3.windowView;
                    if (anonymousClass2 != null) {
                        anonymousClass2.invalidate();
                    }
                    TransitionViewHolder transitionViewHolder2 = storyViewer3.transitionViewHolder;
                    ImageReceiver imageReceiver3 = transitionViewHolder2.avatarImage;
                    if (imageReceiver3 != null && !storyViewer3.foundViewToClose) {
                        imageReceiver3.setVisible(true, true);
                        transitionViewHolder2.avatarImage = null;
                    }
                    ImageReceiver imageReceiver4 = transitionViewHolder2.storyImage;
                    if (imageReceiver4 != null && !storyViewer3.foundViewToClose) {
                        imageReceiver4.setAlpha(1.0f);
                        transitionViewHolder2.storyImage.setVisible(true, true);
                        transitionViewHolder2.storyImage = null;
                    }
                    PeerStoriesView currentPeerView3 = storyViewer3.getCurrentPeerView();
                    if (currentPeerView3 != null) {
                        currentPeerView3.updatePosition(false);
                    }
                    LivePlayer livePlayer = storyViewer3.livePlayer;
                    if (livePlayer != null) {
                        livePlayer.setVolume((1.0f - storyViewer3.progressToDismiss) * storyViewer3.progressToOpen);
                    }
                    if (storyViewer3.showViewsAfterOpening) {
                        storyViewer3.showViewsAfterOpening = false;
                        storyViewer3.checkSelfStoriesView();
                        AndroidUtilities.runOnUIThread(new StoryViewer$$ExternalSyntheticLambda2(storyViewer3, 3), 30L);
                    } else if (!SharedConfig.storiesIntroShown) {
                        if (storyViewer3.storiesIntro == null && storyViewer3.containerView != null) {
                            StoriesIntro storiesIntro2 = new StoriesIntro(storyViewer3.containerView.getContext(), storyViewer3.windowView);
                            storyViewer3.storiesIntro = storiesIntro2;
                            storiesIntro2.setAlpha(0.0f);
                            storyViewer3.containerView.addView(storyViewer3.storiesIntro);
                        }
                        StoriesIntro storiesIntro3 = storyViewer3.storiesIntro;
                        if (storiesIntro3 != null) {
                            storiesIntro3.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, 18));
                            storyViewer3.storiesIntro.animate().alpha(1.0f).setDuration(150L).setListener(new StoryViewer$9$1(this, 1)).start();
                        }
                        SharedConfig.setStoriesIntroShown(true);
                    }
                    storyViewer3.updatePlayingMode();
                    storyViewer3.locker.unlock();
                    break;
            }
        }
    }

    public interface HolderClip {
        void clip(Canvas canvas, RectF rectF, float f, boolean z);
    }

    public interface HolderDrawAbove {
        void draw(Canvas canvas, RectF rectF, float f, boolean z);
    }

    public interface PlaceProvider {
        boolean findView(long j, int i, int i2, int i3, TransitionViewHolder transitionViewHolder);

        void loadNext(boolean z);

        void preLayout(long j, int i, Runnable runnable);
    }

    public final class TransitionViewHolder {
        public float alpha;
        public ImageReceiver avatarImage;
        public Paint bgPaint;
        public boolean checkParentScale;
        public float clipBottom;
        public View clipParent;
        public float clipTop;
        public ImageReceiver crossfadeToAvatarImage;
        public HolderDrawAbove drawAbove;
        public HolderClip drawClip;
        public StoriesUtilities.AvatarStoryParams params;
        public RadialProgress radialProgressUpload;
        public int storyId;
        public ImageReceiver storyImage;
        public View view;
    }

    public final class VideoPlayerHolder extends VideoPlayerHolderBase {
        public boolean logBuffering;

        public VideoPlayerHolder(SurfaceView surfaceView, AnonymousClass6 anonymousClass6) {
            if (StoryViewer.this.USE_SURFACE_VIEW) {
                with(surfaceView);
            } else {
                with(anonymousClass6);
            }
        }

        @Override
        public final boolean needRepeat() {
            return StoryViewer.this.isCaptionPartVisible;
        }

        @Override
        public final void onRenderedFirstFrame() {
            StoryViewer storyViewer = StoryViewer.this;
            PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = storyViewer.currentPlayerScope;
            if (videoPlayerSharedScope == null) {
                return;
            }
            videoPlayerSharedScope.firstFrameRendered = true;
            this.firstFrameRendered = true;
            videoPlayerSharedScope.invalidate();
            if (!this.paused || storyViewer.surfaceView == null) {
                return;
            }
            prepareStub();
        }

        @Override
        public final void onStateChanged(boolean z, int i) {
            if (i == 3 || i == 2) {
                if (this.firstFrameRendered && i == 2) {
                    this.logBuffering = true;
                    final int i2 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final StoryViewer.VideoPlayerHolder f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                                    if (currentPeerView != null) {
                                        PeerStoriesView.StoryItemHolder storyItemHolder = currentPeerView.currentStory;
                                        if (storyItemHolder.storyItem != null) {
                                            StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                            sb.append(currentPeerView.getCurrentPeer());
                                            sb.append(" storyId=");
                                            ChatObject$Call$$ExternalSyntheticOutline0.m(sb, storyItemHolder.storyItem.id);
                                        }
                                    }
                                    break;
                                default:
                                    PeerStoriesView currentPeerView2 = StoryViewer.this.getCurrentPeerView();
                                    if (currentPeerView2 != null) {
                                        PeerStoriesView.StoryItemHolder storyItemHolder2 = currentPeerView2.currentStory;
                                        if (storyItemHolder2.storyItem != null) {
                                            StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                            sb2.append(currentPeerView2.getCurrentPeer());
                                            sb2.append(" storyId=");
                                            ChatObject$Call$$ExternalSyntheticOutline0.m(sb2, storyItemHolder2.storyItem.id);
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (this.logBuffering && i == 3) {
                    this.logBuffering = false;
                    final int i3 = 1;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final StoryViewer.VideoPlayerHolder f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                                    if (currentPeerView != null) {
                                        PeerStoriesView.StoryItemHolder storyItemHolder = currentPeerView.currentStory;
                                        if (storyItemHolder.storyItem != null) {
                                            StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                            sb.append(currentPeerView.getCurrentPeer());
                                            sb.append(" storyId=");
                                            ChatObject$Call$$ExternalSyntheticOutline0.m(sb, storyItemHolder.storyItem.id);
                                        }
                                    }
                                    break;
                                default:
                                    PeerStoriesView currentPeerView2 = StoryViewer.this.getCurrentPeerView();
                                    if (currentPeerView2 != null) {
                                        PeerStoriesView.StoryItemHolder storyItemHolder2 = currentPeerView2.currentStory;
                                        if (storyItemHolder2.storyItem != null) {
                                            StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                            sb2.append(currentPeerView2.getCurrentPeer());
                                            sb2.append(" storyId=");
                                            ChatObject$Call$$ExternalSyntheticOutline0.m(sb2, storyItemHolder2.storyItem.id);
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        }
    }

    public StoryViewer(BaseFragment baseFragment) {
        TransitionViewHolder transitionViewHolder = new TransitionViewHolder();
        transitionViewHolder.alpha = 1.0f;
        this.transitionViewHolder = transitionViewHolder;
        this.doOnAnimationReadyRunnables = new ArrayList();
        this.isClosed = true;
        this.locker = new AnimationNotificationsLocker();
        this.preparedPlayers = new ArrayList();
        this.isTranslating = false;
        this.longPressRunnable = new StoryViewer$$ExternalSyntheticLambda2(this, 4);
        this.savedPositions = new LongSparseIntArray();
        new Paint(1);
        this.fragment = baseFragment;
    }

    public static boolean access$100(StoryViewer storyViewer, AnonymousClass2 anonymousClass2, float f, float f2, boolean z) {
        PeerStoriesView.AnonymousClass19 anonymousClass19;
        PeerStoriesView.AnonymousClass19 anonymousClass110;
        if (anonymousClass2 == null) {
            storyViewer.getClass();
            return false;
        }
        if (storyViewer.isPopupVisible) {
            return true;
        }
        if (storyViewer.selfStoryViewsView != null && storyViewer.selfStoriesViewsOffset != 0.0f) {
            return true;
        }
        PeerStoriesView currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView();
        if (currentPeerView == null) {
            if (!z) {
                if (currentPeerView != null && (anonymousClass110 = currentPeerView.chatActivityEnterView) != null && anonymousClass110.getVisibility() == 0) {
                    if (f2 > currentPeerView.chatActivityEnterView.getY() + currentPeerView.getY() + storyViewer.storiesViewPager.getY() + storyViewer.containerView.getY()) {
                        return true;
                    }
                }
                if (!(currentPeerView == null && (anonymousClass19 = currentPeerView.chatActivityEnterView) != null && anonymousClass19.isRecordingAudioVideo()) && storyViewer.storiesIntro == null) {
                    return AndroidUtilities.findClickableView(anonymousClass2, f, f2, currentPeerView);
                }
                return true;
            }
        } else {
            if (currentPeerView.findClickableView(currentPeerView, ((f - storyViewer.containerView.getX()) - storyViewer.storiesViewPager.getX()) - currentPeerView.getX(), ((f2 - storyViewer.containerView.getY()) - storyViewer.storiesViewPager.getY()) - currentPeerView.getY(), z)) {
                return true;
            }
            if (!currentPeerView.keyboardVisible) {
                if (!z) {
                    if (currentPeerView != null) {
                        if (f2 > currentPeerView.chatActivityEnterView.getY() + currentPeerView.getY() + storyViewer.storiesViewPager.getY() + storyViewer.containerView.getY()) {
                            return true;
                        }
                    }
                    if (currentPeerView == null) {
                    }
                    return AndroidUtilities.findClickableView(anonymousClass2, f, f2, currentPeerView);
                }
            }
        }
        return false;
    }

    public static void access$3100(StoryViewer storyViewer, boolean z) {
        if (!storyViewer.ATTACH_TO_FRAGMENT) {
            WindowManager.LayoutParams layoutParams = storyViewer.windowLayoutParams;
            layoutParams.softInputMode = z ? 48 : 16;
            try {
                storyViewer.windowManager.updateViewLayout(storyViewer.windowView, layoutParams);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
            return;
        }
        BaseFragment baseFragment = storyViewer.fragment;
        if (z) {
            AndroidUtilities.requestAdjustNothing(baseFragment.getParentActivity(), baseFragment.getClassGuid());
        } else {
            AndroidUtilities.requestAdjustResize(baseFragment.getParentActivity(), baseFragment.getClassGuid());
        }
    }

    public static void access$700(StoryViewer storyViewer) {
        float fClamp01 = Utilities.clamp01(Math.abs(Math.max(storyViewer.swipeToDismissHorizontalOffset, storyViewer.swipeToDismissOffset) / AndroidUtilities.dp(80.0f)));
        if (storyViewer.progressToDismiss != fClamp01) {
            storyViewer.progressToDismiss = fClamp01;
            storyViewer.checkNavBarColor();
            PeerStoriesView currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView();
            if (currentPeerView != null && currentPeerView.BIG_SCREEN) {
                currentPeerView.invalidate();
            }
            LivePlayer livePlayer = storyViewer.livePlayer;
            if (livePlayer != null) {
                livePlayer.setVolume((1.0f - storyViewer.progressToDismiss) * storyViewer.progressToOpen);
            }
        }
        AnonymousClass2 anonymousClass2 = storyViewer.windowView;
        if (anonymousClass2 != null) {
            anonymousClass2.invalidate();
        }
    }

    public static CharSequence getDraft(long j, TL_stories.StoryItem storyItem) {
        return (j == 0 || storyItem == null) ? "" : (CharSequence) replyDrafts.get(j + (j >> 16) + (((long) storyItem.id) << 16), "");
    }

    public static boolean isShowingImage(MessageObject messageObject) {
        return lastStoryItem != null && (messageObject.type == 23 || messageObject.isWebpage()) && !runOpenAnimationAfterLayout && lastStoryItem.messageId == messageObject.getId() && lastStoryItem.messageType != 3;
    }

    public static void saveDraft(long j, TL_stories.StoryItem storyItem, Editable editable) {
        if (j == 0 || storyItem == null) {
            return;
        }
        replyDrafts.put(j + (j >> 16) + (((long) storyItem.id) << 16), editable);
    }

    public final void allowScreenshots(boolean z) {
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
                BaseFragment baseFragment = this.fragment;
                if (baseFragment.getParentActivity() != null) {
                    if (z2) {
                        baseFragment.getParentActivity().getWindow().clearFlags(8192);
                        AndroidUtilities.logFlagSecure();
                        return;
                    } else {
                        baseFragment.getParentActivity().getWindow().addFlags(8192);
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

    @Override
    public final boolean attachedToParent() {
        return this.ATTACH_TO_FRAGMENT && this.windowView != null;
    }

    public final void cancelSwipeToReply() {
        int i = 2;
        int i2 = 0;
        if (this.swipeToReplyBackAnimator == null) {
            this.inSwipeToDissmissMode = false;
            this.allowSwipeToReply = false;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.swipeToReplyOffset, 0.0f);
            this.swipeToReplyBackAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new StoryViewer$$ExternalSyntheticLambda1(this, i));
            this.swipeToReplyBackAnimator.addListener(new AnonymousClass8(this, i2));
            this.swipeToReplyBackAnimator.setDuration(250L);
            this.swipeToReplyBackAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            this.swipeToReplyBackAnimator.start();
        }
    }

    public final void cancelSwipeToViews(boolean z) {
        int i = 0;
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
            valueAnimatorOfFloat.addUpdateListener(new StoryViewer$$ExternalSyntheticLambda1(this, 3));
            this.swipeToViewsAnimator.addListener(new AnonymousClass7(this, z, i));
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

    public final void checkNavBarColor() {
        LaunchActivity launchActivity;
        if (!this.ATTACH_TO_FRAGMENT || (launchActivity = LaunchActivity.instance) == null) {
            return;
        }
        launchActivity.checkSystemBarColors(true, true, true);
    }

    public final void checkSelfStoriesView() {
        if (this.selfStoryViewsView == null) {
            SelfStoryViewsView selfStoryViewsView = new SelfStoryViewsView(getContext(), this);
            this.selfStoryViewsView = selfStoryViewsView;
            addView(selfStoryViewsView, 0);
        }
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null) {
            if (this.storiesList == null) {
                this.selfStoryViewsView.setItems(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer(), currentPeerView.getStoryItems());
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.storiesList.messageObjects.size(); i++) {
                arrayList.add(((MessageObject) this.storiesList.messageObjects.get(i)).storyItem);
            }
            this.selfStoryViewsView.setItems(currentPeerView.getListPosition(), this.storiesList.dialogId, arrayList);
        }
    }

    public final void close(boolean z) {
        int i = 0;
        AndroidUtilities.hideKeyboard(this.windowView);
        this.isClosed = true;
        this.invalidateOutRect = true;
        updatePlayingMode();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (this.ATTACH_TO_FRAGMENT && launchActivity != null && this.openedFromLightNavigationBar) {
            AndroidUtilities.setLightNavigationBar((Activity) launchActivity, true);
        }
        updateTransitionParams();
        this.locker.lock();
        this.fromDismissOffset = this.swipeToDismissOffset;
        this.opening = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progressToOpen, 0.0f);
        this.openCloseAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new StoryViewer$$ExternalSyntheticLambda1(this, i));
        if (z) {
            layoutAndFindView();
        } else {
            this.fromY = 0.0f;
            this.fromX = 0.0f;
            TransitionViewHolder transitionViewHolder = this.transitionViewHolder;
            ImageReceiver imageReceiver = transitionViewHolder.avatarImage;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = transitionViewHolder.storyImage;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            transitionViewHolder.storyImage = null;
            transitionViewHolder.avatarImage = null;
        }
        AndroidUtilities.runOnUIThread(new StoryViewer$$ExternalSyntheticLambda2(this, i), 16L);
        if (this.unreadStateChanged) {
            this.unreadStateChanged = false;
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = 0;
        if (i == NotificationCenter.storiesListUpdated) {
            if (this.storiesList == ((StoriesController.StoriesList) objArr[0])) {
                getCurrentPeerView();
                AnonymousClass4 anonymousClass4 = this.storiesViewPager;
                StoriesController.StoriesList storiesList = this.storiesList;
                anonymousClass4.setDays(this.currentAccount, storiesList.dialogId, storiesList.getDays());
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
                    this.selfStoryViewsView.setItems(i4, this.storiesList.dialogId, arrayList);
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
                ArrayList arrayList2 = storiesListPlaceProvider.hiddedStories ? storiesController.hiddenListStories : storiesController.dialogListStories;
                ArrayList<Long> dialogIds = this.storiesViewPager.getDialogIds();
                boolean z = false;
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i5)).peer);
                    if ((!storiesListPlaceProvider.onlyUnreadStories || storiesController.hasUnreadStories(peerDialogId)) && !dialogIds.contains(Long.valueOf(peerDialogId))) {
                        dialogIds.add(Long.valueOf(peerDialogId));
                        z = true;
                    }
                }
                if (z) {
                    this.storiesViewPager.getAdapter().notifyDataSetChanged();
                }
            }
            SelfStoryViewsView selfStoryViewsView2 = this.selfStoryViewsView;
            if (selfStoryViewsView2 != null) {
                SelfStoryViewsView.AnonymousClass1 anonymousClass1 = selfStoryViewsView2.selfStoriesPreviewView;
                while (i3 < anonymousClass1.lastDrawnImageReceivers.size()) {
                    ((SelfStoriesPreviewView.ImageHolder) anonymousClass1.lastDrawnImageReceivers.get(i3)).updateLayout();
                    i3++;
                }
                return;
            }
            return;
        }
        int i6 = NotificationCenter.openArticle;
        if (i != i6 && i != NotificationCenter.articleClosed) {
            if (i == NotificationCenter.storyDeleted) {
                long jLongValue = ((Long) objArr[0]).longValue();
                int iIntValue = ((Integer) objArr[1]).intValue();
                TL_stories.StoryItem storyItem = this.singleStory;
                if (storyItem != null && storyItem.dialogId == jLongValue && storyItem.id == iIntValue) {
                    this.singleStoryDeleted = true;
                    return;
                }
                return;
            }
            return;
        }
        updatePlayingMode();
        if (i != i6) {
            if (this.paused || getCurrentPeerView() == null) {
                return;
            }
            getCurrentPeerView().updatePosition(false);
            return;
        }
        VideoPlayerHolder videoPlayerHolder = this.playerHolder;
        if (videoPlayerHolder == null) {
            this.playerSavedPosition = 0L;
            return;
        }
        this.playerSavedPosition = videoPlayerHolder.currentPosition;
        this.playerHolder.release(null);
        this.playerHolder = null;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        close(true);
    }

    @Override
    public final BulletinFactory getBulletinFactory() {
        return null;
    }

    public final PeerStoriesView getCurrentPeerView() {
        AnonymousClass4 anonymousClass4 = this.storiesViewPager;
        if (anonymousClass4 == null) {
            return null;
        }
        return anonymousClass4.getCurrentPeerView();
    }

    @Override
    public final int getNavigationBarColor(int i) {
        return ColorUtils.blendARGB((((1.0f - this.progressToDismiss) * 0.5f) + 0.5f) * this.progressToOpen, i, -16777216);
    }

    @Override
    public final View mo1107getWindowView() {
        return this.windowView;
    }

    public final void instantClose() {
        if (this.isShowing) {
            AndroidUtilities.hideKeyboard(this.windowView);
            this.isClosed = true;
            this.fullyVisible = false;
            this.progressToOpen = 0.0f;
            this.progressToDismiss = 0.0f;
            updatePlayingMode();
            this.fromY = 0.0f;
            this.fromX = 0.0f;
            TransitionViewHolder transitionViewHolder = this.transitionViewHolder;
            ImageReceiver imageReceiver = transitionViewHolder.avatarImage;
            if (imageReceiver != null) {
                imageReceiver.setVisible(true, true);
            }
            ImageReceiver imageReceiver2 = transitionViewHolder.storyImage;
            if (imageReceiver2 != null) {
                imageReceiver2.setVisible(true, true);
            }
            transitionViewHolder.storyImage = null;
            transitionViewHolder.avatarImage = null;
            AnonymousClass3 anonymousClass3 = this.containerView;
            if (anonymousClass3 != null) {
                anonymousClass3.disableHwAcceleration(true);
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
            StoryViewer$$ExternalSyntheticLambda2 storyViewer$$ExternalSyntheticLambda2 = this.onCloseListener;
            if (storyViewer$$ExternalSyntheticLambda2 != null) {
                storyViewer$$ExternalSyntheticLambda2.run();
                this.onCloseListener = null;
            }
        }
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        return this.fullyVisible;
    }

    public final boolean isPaused() {
        BaseFragment baseFragment;
        if (this.isPopupVisible || this.isTranslating || this.isBulletinVisible || this.isCaption || this.isInTouchMode || this.keyboardVisible || this.currentDialog != null || this.currentSheet != null || this.isClosed || this.isRecording || this.progressToOpen != 1.0f || this.selfStoriesViewsOffset != 0.0f || this.isHintVisible) {
            return true;
        }
        if ((this.isSwiping && this.USE_SURFACE_VIEW) || this.isOverlayVisible || this.isInTextSelectionMode || this.isLikesReactions || this.progressToDismiss != 0.0f || this.storiesIntro != null) {
            return true;
        }
        return (!this.ATTACH_TO_FRAGMENT || (baseFragment = this.fragment) == null || baseFragment.getLastStoryViewer() == this) ? false : true;
    }

    @Override
    public final boolean isShown() {
        return !this.isClosed;
    }

    public final void layoutAndFindView() {
        TL_stories.StoryItem storyItem;
        PeerStoriesView currentPeerView;
        int selectedPosition;
        this.foundViewToClose = true;
        TransitionViewHolder transitionViewHolder = this.transitionViewHolder;
        ImageReceiver imageReceiver = transitionViewHolder.avatarImage;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = transitionViewHolder.storyImage;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            transitionViewHolder.storyImage.setVisible(true, true);
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
                if (currentPeerView2 == null || selectedPosition2 < 0) {
                    storyItem = null;
                } else {
                    ArrayList arrayList = currentPeerView2.storyItems;
                    if (selectedPosition2 >= arrayList.size()) {
                        storyItem = null;
                    } else {
                        storyItem = (TL_stories.StoryItem) arrayList.get(selectedPosition2);
                    }
                }
                if (storyItem != null) {
                    currentDialogId = storyItem.dialogId;
                    i = storyItem.id;
                }
            }
            this.placeProvider.preLayout(currentDialogId, i, new StoryViewer$$ExternalSyntheticLambda2(this, 6));
        }
    }

    @Override
    public final boolean onAttachedBackPressed() {
        PeerStoriesView currentPeerView;
        boolean zCloseKeyboardOrEmoji = false;
        if (this.selfStoriesViewsOffset == 0.0f) {
            AnonymousClass4 anonymousClass4 = this.storiesViewPager;
            if (anonymousClass4 != null && (currentPeerView = anonymousClass4.getCurrentPeerView()) != null) {
                zCloseKeyboardOrEmoji = currentPeerView.closeKeyboardOrEmoji();
            }
            if (zCloseKeyboardOrEmoji) {
                return true;
            }
            close(true);
            return true;
        }
        SelfStoryViewsView selfStoryViewsView = this.selfStoryViewsView;
        if (selfStoryViewsView.keyboardHeight <= 0) {
            SelfStoryViewsPage currentPage = selfStoryViewsView.getCurrentPage();
            if (currentPage != null) {
                SelfStoryViewsPage.HeaderView.AnonymousClass1 anonymousClass1 = currentPage.popupMenu;
                if (anonymousClass1 == null || !anonymousClass1.isShowing()) {
                    float translationY = currentPage.topViewsContainer.getTranslationY();
                    SelfStoryViewsPage.AnonymousClass1 anonymousClass2 = currentPage.recyclerListView;
                    if (Math.abs(translationY - anonymousClass2.getPaddingTop()) > AndroidUtilities.dp(2.0f)) {
                        anonymousClass2.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        anonymousClass2.smoothScrollToPosition(0);
                    }
                } else {
                    currentPage.popupMenu.dismiss();
                }
            }
            cancelSwipeToViews(false);
            return true;
        }
        AndroidUtilities.hideKeyboard(selfStoryViewsView);
        return true;
    }

    public final void open(int i, Context context, TL_stories.StoryItem storyItem, StoriesListPlaceProvider storiesListPlaceProvider) {
        if (storyItem == null) {
            return;
        }
        this.currentAccount = i;
        if (storyItem.dialogId <= 0 || MessagesController.getInstance(i).getUser(Long.valueOf(storyItem.dialogId)) != null) {
            if (storyItem.dialogId >= 0 || MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-storyItem.dialogId)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                open(i, context, storyItem, arrayList, 0, null, null, storiesListPlaceProvider, false);
            }
        }
    }

    @Override
    public final View pipCreatePictureInPictureView() {
        LivePlayerView livePlayerView = new LivePlayerView(this.liveView.getContext(), this.currentAccount);
        this.pipLiveView = livePlayerView;
        return livePlayerView;
    }

    @Override
    public final Bitmap pipCreatePictureInPictureViewBitmap() {
        LivePlayerView livePlayerView = this.pipLiveView;
        if (livePlayerView == null) {
            return null;
        }
        TextureViewRenderer textureViewRenderer = livePlayerView.textureView;
        if (textureViewRenderer != null ? textureViewRenderer.isAvailable() : false) {
            return this.pipLiveView.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap pipCreatePrimaryWindowViewBitmap() {
        LivePlayerView livePlayerView = this.liveView;
        if (livePlayerView == null) {
            return null;
        }
        TextureViewRenderer textureViewRenderer = livePlayerView.textureView;
        if (textureViewRenderer != null ? textureViewRenderer.isAvailable() : false) {
            return this.liveView.getBitmap();
        }
        return null;
    }

    @Override
    public final void pipHidePrimaryWindowView(Runnable runnable) {
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
    public final boolean pipIsAvailable() {
        BaseFragment baseFragment = this.fragment;
        return (baseFragment == null || getCurrentPeerView() == null || AndroidUtilities.findActivity(baseFragment.getContext()) == null || this.livePlayer == null || this.liveView == null || this.isClosed) ? false : true;
    }

    @Override
    public final void pipRenderBackground(Canvas canvas) {
    }

    @Override
    public final void pipRenderForeground(Canvas canvas) {
    }

    @Override
    public final void pipShowPrimaryWindowView(Runnable runnable) {
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
            TextureViewRenderer textureViewRenderer = livePlayerView2.textureView;
            if (textureViewRenderer != null) {
                textureViewRenderer.release();
            }
            livePlayerView2.firstFrameRendered = false;
            livePlayerView2.setTextureVisible(false, false);
            this.pipLiveView = null;
        }
        this.windowView.invalidate();
        this.livePlayer.setDisplaySink(this.liveView.getSink());
    }

    public final void presentFragment(BaseFragment baseFragment) {
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

    public final void release() {
        ArrayList arrayList;
        Activity activityFindActivity;
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
        if (livePlayer != null) {
            LiveStoryPipOverlay liveStoryPipOverlay = LiveStoryPipOverlay.instance;
            if (!liveStoryPipOverlay.isVisible || liveStoryPipOverlay.livePlayer != livePlayer) {
                if (livePlayer.outgoing) {
                    livePlayer.setDisplaySink(null);
                } else {
                    livePlayer.destroy();
                }
            }
        }
        this.livePlayer = null;
        int i = 0;
        while (true) {
            arrayList = this.preparedPlayers;
            if (i >= arrayList.size()) {
                break;
            }
            ((VideoPlayerHolder) arrayList.get(i)).release(null);
            i++;
        }
        arrayList.clear();
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        for (int i2 = 0; i2 < storiesController.pollingViewsForSelfStoriesRequester.size(); i2++) {
            ((ViewsForPeerStoriesRequester) storiesController.pollingViewsForSelfStoriesRequester.valueAt(i2)).start(false);
        }
        boolean z = this.ATTACH_TO_FRAGMENT;
        BaseFragment baseFragment = this.fragment;
        if (z && (activityFindActivity = AndroidUtilities.findActivity(baseFragment.getContext())) != null) {
            try {
                activityFindActivity.setRequestedOrientation(-1);
            } catch (Exception unused) {
            }
            activityFindActivity.getWindow().clearFlags(128);
        }
        if (baseFragment != null) {
            baseFragment.removeSheet(this);
        }
        globalInstances.remove(this);
        this.doOnAnimationReadyRunnables.clear();
        this.selfStoriesViewsOffset = 0.0f;
        lastStoryItem = null;
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode = z;
        if (z) {
            StoriesVolumeControl storiesVolumeControl = this.volumeControl;
            AndroidUtilities.cancelRunOnUIThread(storiesVolumeControl.hideRunnable);
            StoriesVolumeControl storiesVolumeControl2 = (StoriesVolumeControl) storiesVolumeControl.hideRunnable.this$0;
            storiesVolumeControl2.isVisible = false;
            storiesVolumeControl2.invalidate();
        }
        updatePlayingMode();
    }

    @Override
    public final void setKeyboardHeightFromParent(int i) {
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
    public final void setLastVisible(boolean z) {
    }

    public final void setLongPressed(boolean z) {
        PeerStoriesView currentPeerView;
        PeerStoriesView currentPeerView2;
        PeerStoriesView.StoryItemHolder storyItemHolder;
        VideoPlayerHolder videoPlayerHolder;
        PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope;
        if (this.isLongpressed != z) {
            this.isLongpressed = z;
            if (z && !this.isInPinchToZoom && (currentPeerView2 = this.storiesViewPager.getCurrentPeerView()) != null && (storyItemHolder = currentPeerView2.currentStory) != null && !storyItemHolder.isLive && storyItemHolder.uploadingStory == null) {
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
            AnonymousClass4 anonymousClass4 = this.storiesViewPager;
            if (anonymousClass4 == null || (currentPeerView = anonymousClass4.getCurrentPeerView()) == null) {
                return;
            }
            currentPeerView.setLongpressed(this.isLongpressed);
        }
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        try {
            this.currentDialog = dialog;
            dialog.setOnDismissListener(new RichEditor$$ExternalSyntheticLambda46(this, 11));
            dialog.show();
            updatePlayingMode();
            return true;
        } catch (Throwable th) {
            FileLog.e(th);
            this.currentDialog = null;
            return false;
        }
    }

    public final void showKeyboard$2() {
        MentionCell.AnonymousClass1 anonymousClass1;
        EditTextCaption editField;
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView == null || currentPeerView.chatActivityEnterView == null || (((anonymousClass1 = currentPeerView.replyDisabledTextView) != null && anonymousClass1.getVisibility() == 0) || (editField = currentPeerView.chatActivityEnterView.getEditField()) == null)) {
            cancelSwipeToReply();
            return;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        AndroidUtilities.runOnUIThread(new StoryViewer$$ExternalSyntheticLambda2(this, 2), 200L);
    }

    public final void switchToPip() {
        BaseFragment baseFragment;
        int i = 13;
        int i2 = 8;
        int i3 = 1;
        int i4 = 0;
        if (this.livePlayer == null || (baseFragment = this.fragment) == null || this.liveView == null) {
            return;
        }
        Activity activityFindActivity = AndroidUtilities.findActivity(baseFragment.getContext());
        if (PipUtils.checkPermissions(activityFindActivity) > 0) {
            LivePlayer livePlayer = this.livePlayer;
            LiveStoryPipOverlay liveStoryPipOverlay = LiveStoryPipOverlay.instance;
            if (livePlayer == null) {
                liveStoryPipOverlay.getClass();
            } else if (!liveStoryPipOverlay.isVisible) {
                liveStoryPipOverlay.isVisible = true;
                liveStoryPipOverlay.livePlayer = livePlayer;
                int i5 = livePlayer.currentAccount;
                liveStoryPipOverlay.currentAccount = i5;
                NotificationCenter.getInstance(i5).addObserver(liveStoryPipOverlay, NotificationCenter.liveStoryUpdated);
                liveStoryPipOverlay.pipWidth = liveStoryPipOverlay.getSuggestedWidth$1();
                liveStoryPipOverlay.pipHeight = liveStoryPipOverlay.getSuggestedHeight$1();
                liveStoryPipOverlay.scaleFactor = 1.0f;
                liveStoryPipOverlay.isShowingControls = false;
                SpringAnimation springAnimation = new SpringAnimation(liveStoryPipOverlay, LiveStoryPipOverlay.PIP_X_PROPERTY);
                SpringForce springForce = new SpringForce();
                springForce.setDampingRatio(0.75f);
                springForce.setStiffness(650.0f);
                springAnimation.mSpring = springForce;
                liveStoryPipOverlay.pipXSpring = springAnimation;
                SpringAnimation springAnimation2 = new SpringAnimation(liveStoryPipOverlay, LiveStoryPipOverlay.PIP_Y_PROPERTY);
                SpringForce springForce2 = new SpringForce();
                springForce2.setDampingRatio(0.75f);
                springForce2.setStiffness(650.0f);
                springAnimation2.mSpring = springForce2;
                liveStoryPipOverlay.pipYSpring = springAnimation2;
                Context context = activityFindActivity != null ? activityFindActivity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new LiveStoryPipOverlay.AnonymousClass3(liveStoryPipOverlay, i4));
                liveStoryPipOverlay.scaleGestureDetector = scaleGestureDetector;
                int i6 = Build.VERSION.SDK_INT;
                scaleGestureDetector.setQuickScaleEnabled(false);
                if (i6 >= 23) {
                    liveStoryPipOverlay.scaleGestureDetector.setStylusScaleEnabled(false);
                }
                liveStoryPipOverlay.gestureDetector = new GestureDetectorCompat(context, new LiveStoryPipOverlay.AnonymousClass4(liveStoryPipOverlay, scaledTouchSlop, i4));
                liveStoryPipOverlay.contentFrameLayout = new ChatLoadingCell.AnonymousClass1(liveStoryPipOverlay, context);
                LiveStoryPipOverlay.AnonymousClass6 anonymousClass6 = new LiveStoryPipOverlay.AnonymousClass6(liveStoryPipOverlay, context, i4);
                liveStoryPipOverlay.contentView = anonymousClass6;
                anonymousClass6.addView(liveStoryPipOverlay.contentFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
                liveStoryPipOverlay.contentFrameLayout.setOutlineProvider(new RichEditor.AnonymousClass5(i2));
                liveStoryPipOverlay.contentFrameLayout.setClipToOutline(true);
                liveStoryPipOverlay.contentFrameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_actionBar, false));
                BackupImageView backupImageView = new BackupImageView(context);
                liveStoryPipOverlay.avatarImageView = backupImageView;
                liveStoryPipOverlay.contentFrameLayout.addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f));
                LivePlayerView livePlayerView = new LivePlayerView(context, liveStoryPipOverlay.currentAccount);
                liveStoryPipOverlay.textureView = livePlayerView;
                livePlayerView.setAlpha(0.0f);
                liveStoryPipOverlay.contentFrameLayout.addView(liveStoryPipOverlay.textureView, LayoutHelper.createFrame(-1, -1.0f));
                AddressBarList.AnonymousClass2 anonymousClass2 = new AddressBarList.AnonymousClass2(context, i2);
                liveStoryPipOverlay.flickerView = anonymousClass2;
                liveStoryPipOverlay.contentFrameLayout.addView(anonymousClass2, LayoutHelper.createFrame(-1, -1.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                liveStoryPipOverlay.controlsView = frameLayout;
                frameLayout.setAlpha(0.0f);
                View view = new View(context);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{1140850688, 0});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view.setBackground(gradientDrawable);
                liveStoryPipOverlay.controlsView.addView(view, LayoutHelper.createFrame(-1, -1.0f));
                int iDp = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i7 = Theme.key_voipgroup_actionBarItems;
                imageView.setColorFilter(Theme.getColor(null, i7, false));
                int i8 = Theme.key_listSelector;
                imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i8, false), 1, -1));
                imageView.setPadding(iDp, iDp, iDp, iDp);
                imageView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda0(i));
                float f = 38;
                float f2 = 4;
                liveStoryPipOverlay.controlsView.addView(imageView, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, f2, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(Theme.getColor(null, i7, false));
                imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i8, false), 1, -1));
                imageView2.setPadding(iDp, iDp, iDp, iDp);
                imageView2.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(13, livePlayer, context));
                liveStoryPipOverlay.controlsView.addView(imageView2, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, 48, 0.0f));
                liveStoryPipOverlay.contentFrameLayout.addView(liveStoryPipOverlay.controlsView, LayoutHelper.createFrame(-1, -1.0f));
                liveStoryPipOverlay.windowManager = (WindowManager) context.getSystemService("window");
                WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = PipUtils.createWindowLayoutParams(context, false);
                liveStoryPipOverlay.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
                int i9 = liveStoryPipOverlay.pipWidth;
                layoutParamsCreateWindowLayoutParams.width = i9;
                layoutParamsCreateWindowLayoutParams.height = liveStoryPipOverlay.pipHeight;
                float fDp = (AndroidUtilities.displaySize.x - i9) - AndroidUtilities.dp(16.0f);
                liveStoryPipOverlay.pipX = fDp;
                layoutParamsCreateWindowLayoutParams.x = (int) fDp;
                WindowManager.LayoutParams layoutParams = liveStoryPipOverlay.windowLayoutParams;
                float fDp2 = (AndroidUtilities.displaySize.y - liveStoryPipOverlay.pipHeight) - AndroidUtilities.dp(16.0f);
                liveStoryPipOverlay.pipY = fDp2;
                layoutParams.y = (int) fDp2;
                WindowManager.LayoutParams layoutParams2 = liveStoryPipOverlay.windowLayoutParams;
                layoutParams2.dimAmount = 0.0f;
                layoutParams2.flags = 520;
                liveStoryPipOverlay.contentView.setAlpha(0.0f);
                liveStoryPipOverlay.contentView.setScaleX(0.1f);
                liveStoryPipOverlay.contentView.setScaleY(0.1f);
                AndroidUtilities.setPreferredMaxRefreshRate(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, liveStoryPipOverlay.windowLayoutParams);
                liveStoryPipOverlay.windowManager.addView(liveStoryPipOverlay.contentView, liveStoryPipOverlay.windowLayoutParams);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet.playTogether(ObjectAnimator.ofFloat(liveStoryPipOverlay.contentView, (Property<LiveStoryPipOverlay.AnonymousClass6, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(liveStoryPipOverlay.contentView, (Property<LiveStoryPipOverlay.AnonymousClass6, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(liveStoryPipOverlay.contentView, (Property<LiveStoryPipOverlay.AnonymousClass6, Float>) View.SCALE_Y, 1.0f));
                animatorSet.addListener(new LiveStoryPipOverlay.AnonymousClass1(liveStoryPipOverlay, i3));
                animatorSet.start();
                liveStoryPipOverlay.bindTextureView$1$1();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                PipSource pipSource = liveStoryPipOverlay.pipSource;
                if (pipSource != null) {
                    pipSource.destroy();
                    liveStoryPipOverlay.pipSource = null;
                }
                if (activityFindActivity != null && PipUtils.checkPermissions(activityFindActivity) == 1) {
                    PipSource.Builder builder = new PipSource.Builder(activityFindActivity, liveStoryPipOverlay);
                    builder.tagPrefix = "pip-live-story";
                    builder.priority = 1;
                    builder.cornerRadius = AndroidUtilities.dp(10.0f);
                    builder.contentView = liveStoryPipOverlay.contentView;
                    builder.placeholderView = liveStoryPipOverlay.textureView.getPlaceholderView();
                    liveStoryPipOverlay.pipSource = builder.build();
                }
            }
            close(true);
        }
    }

    public final void toggleSilentMode() {
        boolean z = isInSilentMode;
        isInSilentMode = !z;
        VideoPlayerHolder videoPlayerHolder = this.playerHolder;
        if (videoPlayerHolder != null) {
            videoPlayerHolder.setAudioEnabled(z, false);
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.preparedPlayers;
            if (i >= arrayList.size()) {
                break;
            }
            ((VideoPlayerHolder) arrayList.get(i)).setAudioEnabled(!isInSilentMode, true);
            i++;
        }
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.sharedResources.setIconMuted(isInSilentMode, true);
        }
        if (isInSilentMode) {
            return;
        }
        StoriesVolumeControl storiesVolumeControl = this.volumeControl;
        AudioManager audioManager = (AudioManager) storiesVolumeControl.getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= streamMinVolume) {
            storiesVolumeControl.adjustVolume(true);
            return;
        }
        if (storiesVolumeControl.isVisible) {
            return;
        }
        float f = streamVolume / streamMaxVolume;
        storiesVolumeControl.currentProgress = f;
        storiesVolumeControl.volumeProgress.set(f, true);
        storiesVolumeControl.isVisible = true;
        storiesVolumeControl.invalidate();
        PeerStoriesView.AnonymousClass34 anonymousClass34 = storiesVolumeControl.hideRunnable;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass34);
        AndroidUtilities.runOnUIThread(anonymousClass34, 2000L);
    }

    public final void updatePlayingMode() {
        if (this.storiesViewPager == null) {
            return;
        }
        boolean zIsPaused = isPaused();
        if (this.ATTACH_TO_FRAGMENT) {
            BaseFragment baseFragment = this.fragment;
            if (baseFragment.isPaused() || !baseFragment.isLastFragment()) {
                zIsPaused = true;
            }
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
        this.storiesViewPager.touchEnabled = (this.keyboardVisible || this.isClosed || this.isRecording || this.isLongpressed || this.isInPinchToZoom || this.selfStoriesViewsOffset != 0.0f || this.isInTextSelectionMode) ? false : true;
    }

    public final void updateTransitionParams() {
        int i;
        TL_stories.StoryItem storyItem;
        if (this.placeProvider == null) {
            this.animateAvatar = false;
            this.fromY = 0.0f;
            this.fromX = 0.0f;
            return;
        }
        TransitionViewHolder transitionViewHolder = this.transitionViewHolder;
        ImageReceiver imageReceiver = transitionViewHolder.avatarImage;
        if (imageReceiver != null) {
            imageReceiver.setVisible(true, true);
        }
        ImageReceiver imageReceiver2 = transitionViewHolder.storyImage;
        if (imageReceiver2 != null) {
            imageReceiver2.setAlpha(1.0f);
            transitionViewHolder.storyImage.setVisible(true, true);
        }
        PeerStoriesView currentPeerView = this.storiesViewPager.getCurrentPeerView();
        int selectedPosition = currentPeerView == null ? 0 : currentPeerView.getSelectedPosition();
        if (currentPeerView == null || selectedPosition < 0) {
            i = 0;
        } else {
            ArrayList arrayList = currentPeerView.storyItems;
            if (selectedPosition >= arrayList.size()) {
                i = 0;
            } else {
                i = ((TL_stories.StoryItem) arrayList.get(selectedPosition)).id;
            }
        }
        if (currentPeerView == null || selectedPosition < 0) {
            storyItem = null;
        } else {
            ArrayList arrayList2 = currentPeerView.storyItems;
            if (selectedPosition >= arrayList2.size()) {
                storyItem = null;
            } else {
                storyItem = (TL_stories.StoryItem) arrayList2.get(selectedPosition);
            }
        }
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
        long j = currentDialogId;
        int i2 = i;
        transitionViewHolder.view = null;
        transitionViewHolder.params = null;
        transitionViewHolder.avatarImage = null;
        transitionViewHolder.storyImage = null;
        transitionViewHolder.drawAbove = null;
        transitionViewHolder.drawClip = null;
        transitionViewHolder.clipParent = null;
        transitionViewHolder.radialProgressUpload = null;
        transitionViewHolder.crossfadeToAvatarImage = null;
        transitionViewHolder.clipTop = 0.0f;
        transitionViewHolder.clipBottom = 0.0f;
        transitionViewHolder.storyId = 0;
        transitionViewHolder.bgPaint = null;
        transitionViewHolder.alpha = 1.0f;
        if (!this.placeProvider.findView(j, this.messageId, i2, storyItem == null ? -1 : storyItem.messageType, transitionViewHolder)) {
            this.animateAvatar = false;
            this.fromY = 0.0f;
            this.fromX = 0.0f;
            return;
        }
        transitionViewHolder.storyId = i2;
        View view = transitionViewHolder.view;
        if (view == null) {
            this.animateAvatar = false;
            this.fromY = 0.0f;
            this.fromX = 0.0f;
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        View view2 = transitionViewHolder.view;
        if (view2 instanceof ChatMessageCell) {
            iArr[1] = view2.getPaddingTop() + iArr[1];
        }
        float f = iArr[0];
        this.fromXCell = f;
        this.fromYCell = iArr[1];
        KeyEvent.Callback callback = transitionViewHolder.view;
        if (callback instanceof StoriesListPlaceProvider.AvatarOverlaysView) {
            this.animateFromCell = (StoriesListPlaceProvider.AvatarOverlaysView) callback;
        } else {
            this.animateFromCell = null;
        }
        this.animateAvatar = false;
        ImageReceiver imageReceiver3 = transitionViewHolder.avatarImage;
        if (imageReceiver3 != null) {
            this.fromX = imageReceiver3.getCenterX() + f;
            this.fromY = transitionViewHolder.avatarImage.getCenterY() + iArr[1];
            this.fromWidth = transitionViewHolder.avatarImage.getImageWidth();
            this.fromHeight = transitionViewHolder.avatarImage.getImageHeight();
            StoriesUtilities.AvatarStoryParams avatarStoryParams = transitionViewHolder.params;
            if (avatarStoryParams != null) {
                this.fromWidth = avatarStoryParams.getScale() * this.fromWidth;
                this.fromHeight = transitionViewHolder.params.getScale() * this.fromHeight;
            }
            if (transitionViewHolder.view.getParent() instanceof View) {
                View view3 = (View) transitionViewHolder.view.getParent();
                this.fromX = (view3.getScaleX() * transitionViewHolder.avatarImage.getCenterX()) + iArr[0];
                this.fromY = (view3.getScaleY() * transitionViewHolder.avatarImage.getCenterY()) + iArr[1];
                this.fromWidth = view3.getScaleX() * this.fromWidth;
                this.fromHeight = view3.getScaleY() * this.fromHeight;
            }
            this.animateAvatar = true;
        } else {
            ImageReceiver imageReceiver4 = transitionViewHolder.storyImage;
            if (imageReceiver4 != null) {
                this.fromX = imageReceiver4.getCenterX() + f;
                this.fromY = transitionViewHolder.storyImage.getCenterY() + iArr[1];
                this.fromWidth = transitionViewHolder.storyImage.getImageWidth();
                this.fromHeight = transitionViewHolder.storyImage.getImageHeight();
                this.fromRadius = transitionViewHolder.storyImage.getRoundRadius();
            }
        }
        transitionViewHolder.clipParent.getLocationOnScreen(iArr);
        float f2 = transitionViewHolder.clipTop;
        if (f2 == 0.0f && transitionViewHolder.clipBottom == 0.0f) {
            this.clipTop = 0.0f;
            this.clipBottom = 0.0f;
        } else {
            float f3 = iArr[1];
            this.clipTop = f2 + f3;
            this.clipBottom = f3 + transitionViewHolder.clipBottom;
        }
    }

    @Override
    public final void dismiss(boolean z) {
        close(true);
    }

    public final void open(Context context, long j, PlaceProvider placeProvider) {
        int i;
        this.currentAccount = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.allStoriesMap.get(j);
        if (peerStories != null) {
            int i2 = 0;
            while (true) {
                int size = peerStories.stories.size();
                i = storiesController.currentAccount;
                if (i2 >= size) {
                    break;
                }
                if (StoriesUtilities.isExpired(i, peerStories.stories.get(i2))) {
                    peerStories.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (peerStories.stories.isEmpty() && !storiesController.hasUnreadStories(j)) {
                storiesController.dialogListStories.remove(peerStories);
                storiesController.hiddenListStories.remove(peerStories);
                NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
        }
        open(UserConfig.selectedAccount, context, null, arrayList, 0, null, null, placeProvider, false);
    }

    public final void open(Context context, int i, StoriesController.StoriesList storiesList, StoriesListPlaceProvider storiesListPlaceProvider) {
        this.currentAccount = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(storiesList.dialogId));
        this.dayStoryId = i;
        open(UserConfig.selectedAccount, context, null, arrayList, 0, storiesList, null, storiesListPlaceProvider, false);
    }

    public final void open(Context context, TL_stories.PeerStories peerStories, PlaceProvider placeProvider) {
        ArrayList<TL_stories.StoryItem> arrayList;
        if (peerStories != null && (arrayList = peerStories.stories) != null && !arrayList.isEmpty()) {
            this.currentAccount = UserConfig.selectedAccount;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(peerStories.peer)));
            open(UserConfig.selectedAccount, context, peerStories.stories.get(0), arrayList2, 0, null, peerStories, placeProvider, false);
            return;
        }
        this.doOnAnimationReadyRunnables.clear();
    }

    public final void open(int i, Context context, TL_stories.StoryItem storyItem, ArrayList arrayList, int i2, StoriesController.StoriesList storiesList, TL_stories.PeerStories peerStories, PlaceProvider placeProvider, boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        Activity activityFindActivity;
        Object[] objArr = 0;
        int i3 = 1;
        boolean zIsContextSafe = AndroidUtilities.isContextSafe(context);
        ArrayList arrayList2 = this.doOnAnimationReadyRunnables;
        if (!zIsContextSafe) {
            arrayList2.clear();
            return;
        }
        ValueAnimator valueAnimator = this.openCloseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.openCloseAnimator = null;
        }
        if (this.isShowing) {
            arrayList2.clear();
            return;
        }
        currentSpeed = 1.0f;
        VideoPlayerHolder videoPlayerHolder = this.playerHolder;
        if (videoPlayerHolder != null) {
            videoPlayerHolder.setSpeed(1.0f);
        }
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
        AnonymousClass4 anonymousClass4 = this.storiesViewPager;
        if (anonymousClass4 != null) {
            anonymousClass4.setHorizontalProgressToDismiss(0.0f);
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
                public final boolean onDown(MotionEvent motionEvent) {
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.flingCalled = false;
                    return !StoryViewer.access$100(storyViewer, storyViewer.windowView, motionEvent.getX(), motionEvent.getY(), false);
                }

                @Override
                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    StoryViewer storyViewer = StoryViewer.this;
                    if (storyViewer.swipeToReplyOffset != 0.0f && storyViewer.storiesIntro == null && f2 < -1000.0f && !storyViewer.swipeToReplyWaitingKeyboard) {
                        storyViewer.swipeToReplyWaitingKeyboard = true;
                        try {
                            storyViewer.windowView.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        storyViewer.showKeyboard$2();
                    }
                    if (storyViewer.selfStoriesViewsOffset != 0.0f) {
                        if (f2 < -1000.0f) {
                            storyViewer.cancelSwipeToViews(true);
                        } else if (f2 > 1000.0f) {
                            storyViewer.cancelSwipeToViews(false);
                        } else {
                            storyViewer.cancelSwipeToViews(storyViewer.selfStoryViewsView.progressToOpen > 0.5f);
                        }
                    }
                    storyViewer.flingCalled = true;
                    return false;
                }

                @Override
                public final void onLongPress(MotionEvent motionEvent) {
                }

                @Override
                public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    float f3;
                    float f4;
                    float f5;
                    StoryViewer storyViewer = StoryViewer.this;
                    if (!storyViewer.inSwipeToDissmissMode) {
                        return false;
                    }
                    if (!storyViewer.allowSwipeToReply) {
                        if (storyViewer.allowSelfStoriesView) {
                            f5 = storyViewer.selfStoriesViewsOffset;
                            if (f5 > storyViewer.selfStoryViewsView.maxSelfStoriesViewsOffset) {
                                storyViewer.selfStoriesViewsOffset = f5 + f2;
                            } else {
                                storyViewer.selfStoriesViewsOffset = f5 + f2;
                            }
                            Bulletin.hideVisible(storyViewer.windowView);
                            if (storyViewer.storiesViewPager.getCurrentPeerView() != null) {
                                storyViewer.storiesViewPager.getCurrentPeerView().invalidate();
                            }
                            storyViewer.containerView.invalidate();
                            if (storyViewer.selfStoriesViewsOffset < 0.0f) {
                                storyViewer.selfStoriesViewsOffset = 0.0f;
                                storyViewer.allowSelfStoriesView = false;
                            }
                        }
                        if (storyViewer.progressToDismiss > 0.8f) {
                            f4 = -f2;
                            if (f4 > 0.0f) {
                                f3 = 0.6f;
                            } else {
                                f3 = 0.6f;
                            }
                        } else {
                            f3 = 0.6f;
                        }
                        storyViewer.swipeToDismissOffset -= f2 * f3;
                        Bulletin.hideVisible(storyViewer.windowView);
                        StoryViewer.access$700(storyViewer);
                        return true;
                    }
                    storyViewer.swipeToReplyOffset += f2;
                    float fDp = AndroidUtilities.dp(200.0f);
                    if (storyViewer.swipeToReplyOffset > fDp && !storyViewer.swipeToReplyWaitingKeyboard) {
                        storyViewer.swipeToReplyWaitingKeyboard = true;
                        storyViewer.showKeyboard$2();
                        try {
                            storyViewer.windowView.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    storyViewer.swipeToReplyProgress = Utilities.clamp(storyViewer.swipeToReplyOffset / fDp, 1.0f, 0.0f);
                    if (storyViewer.storiesViewPager.getCurrentPeerView() != null) {
                        storyViewer.storiesViewPager.getCurrentPeerView().invalidate();
                    }
                    if (storyViewer.swipeToReplyOffset < 0.0f) {
                        storyViewer.swipeToReplyOffset = 0.0f;
                        storyViewer.allowSwipeToReply = false;
                        if (storyViewer.allowSelfStoriesView) {
                            f5 = storyViewer.selfStoriesViewsOffset;
                            if (f5 > storyViewer.selfStoryViewsView.maxSelfStoriesViewsOffset || f2 <= 0.0f) {
                                storyViewer.selfStoriesViewsOffset = f5 + f2;
                            } else {
                                storyViewer.selfStoriesViewsOffset = (0.05f * f2) + f5;
                            }
                            Bulletin.hideVisible(storyViewer.windowView);
                            if (storyViewer.storiesViewPager.getCurrentPeerView() != null) {
                                storyViewer.storiesViewPager.getCurrentPeerView().invalidate();
                            }
                            storyViewer.containerView.invalidate();
                            if (storyViewer.selfStoriesViewsOffset < 0.0f) {
                                storyViewer.selfStoriesViewsOffset = 0.0f;
                                storyViewer.allowSelfStoriesView = false;
                            }
                        }
                        if (storyViewer.progressToDismiss > 0.8f) {
                            f4 = -f2;
                            if ((f4 > 0.0f || storyViewer.swipeToDismissOffset <= 0.0f) && (f4 >= 0.0f || storyViewer.swipeToDismissOffset >= 0.0f)) {
                                f3 = 0.6f;
                            } else {
                                f3 = 0.3f;
                            }
                        } else {
                            f3 = 0.6f;
                        }
                        storyViewer.swipeToDismissOffset -= f2 * f3;
                        Bulletin.hideVisible(storyViewer.windowView);
                        StoryViewer.access$700(storyViewer);
                        return true;
                    }
                    return true;
                }

                @Override
                public final void onShowPress(MotionEvent motionEvent) {
                }

                @Override
                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    PeerStoriesView currentPeerView;
                    StoryViewer storyViewer = StoryViewer.this;
                    if (storyViewer.selfStoriesViewsOffset == 0.0f && storyViewer.allowIntercept) {
                        if (storyViewer.keyboardVisible || storyViewer.isCaption || storyViewer.isCaptionPartVisible || storyViewer.isHintVisible || storyViewer.isInTextSelectionMode) {
                            AnonymousClass4 anonymousClass5 = storyViewer.storiesViewPager;
                            if (anonymousClass5 != null && (currentPeerView = anonymousClass5.getCurrentPeerView()) != null) {
                                currentPeerView.closeKeyboardOrEmoji();
                            }
                        } else {
                            PeerStoriesView currentPeerView2 = storyViewer.getCurrentPeerView();
                            if (currentPeerView2 == null || !currentPeerView2.currentStory.isLive) {
                                boolean z3 = motionEvent.getX() > ((float) storyViewer.containerView.getMeasuredWidth()) * 0.33f;
                                PeerStoriesView currentPeerView3 = storyViewer.storiesViewPager.getCurrentPeerView();
                                if (currentPeerView3 != null && !currentPeerView3.switchToNext(z3)) {
                                    if (storyViewer.storiesViewPager.switchToNext(z3)) {
                                        AnonymousClass4 anonymousClass6 = storyViewer.storiesViewPager;
                                        anonymousClass6.touchLocked = true;
                                        anonymousClass6.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                        PeerStoriesView.AnonymousClass34 anonymousClass34 = anonymousClass6.lockTouchRunnable;
                                        AndroidUtilities.cancelRunOnUIThread(anonymousClass34);
                                        AndroidUtilities.runOnUIThread(anonymousClass34, 150L);
                                        return false;
                                    }
                                    if (z3) {
                                        storyViewer.close(true);
                                        return false;
                                    }
                                    VideoPlayerHolder videoPlayerHolder2 = storyViewer.playerHolder;
                                    if (videoPlayerHolder2 != null) {
                                        videoPlayerHolder2.loopBack();
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
            });
            this.windowView = new AnonymousClass2(context, lastFragment);
        }
        if (this.containerView == null) {
            this.containerView = new HwFrameLayout(context) {
                @Override
                public final void dispatchDraw(Canvas canvas) {
                    StoryViewer storyViewer = this;
                    PeerStoriesView currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView();
                    SelfStoryViewsView selfStoryViewsView = storyViewer.selfStoryViewsView;
                    if (selfStoryViewsView != null && currentPeerView != null) {
                        selfStoryViewsView.setOffset(storyViewer.selfStoriesViewsOffset);
                        if (storyViewer.selfStoryViewsView.progressToOpen == 1.0f) {
                            storyViewer.storiesViewPager.setVisibility(4);
                        } else {
                            storyViewer.storiesViewPager.setVisibility(0);
                        }
                        storyViewer.storiesViewPager.checkPageVisibility();
                        int top = currentPeerView.getTop();
                        PeerStoriesView.AnonymousClass4 anonymousClass5 = currentPeerView.storyContainer;
                        float top2 = anonymousClass5.getTop() + top;
                        float f = storyViewer.selfStoryViewsView.progressToOpen;
                        getMeasuredHeight();
                        float f2 = storyViewer.selfStoriesViewsOffset;
                        getMeasuredHeight();
                        if (anonymousClass5.getMeasuredHeight() > 0) {
                            storyViewer.lastStoryContainerHeight = anonymousClass5.getMeasuredHeight();
                        }
                        float f3 = storyViewer.selfStoryViewsView.toHeight / storyViewer.lastStoryContainerHeight;
                        float fLerp = AndroidUtilities.lerp(1.0f, f3, f);
                        storyViewer.storiesViewPager.setPivotY(top2);
                        storyViewer.storiesViewPager.setPivotX(getMeasuredWidth() / 2.0f);
                        storyViewer.storiesViewPager.setScaleX(fLerp);
                        storyViewer.storiesViewPager.setScaleY(fLerp);
                        currentPeerView.forceUpdateOffsets = true;
                        if (storyViewer.selfStoriesViewsOffset == 0.0f) {
                            currentPeerView.viewsThumbAlpha = 0.0f;
                            currentPeerView.viewsThumbScale = 1.0f / 0.0f;
                            if (currentPeerView.viewsThumbImageReceiver != null) {
                                currentPeerView.viewsThumbImageReceiver = null;
                            }
                        } else {
                            SelfStoriesPreviewView.ImageHolder crossfadeToImage = storyViewer.selfStoryViewsView.getCrossfadeToImage();
                            currentPeerView.viewsThumbAlpha = f;
                            currentPeerView.viewsThumbScale = 1.0f / fLerp;
                            if (currentPeerView.viewsThumbImageReceiver != crossfadeToImage) {
                                currentPeerView.viewsThumbImageReceiver = crossfadeToImage;
                                if (crossfadeToImage != null) {
                                    ImageReceiver imageReceiver = crossfadeToImage.receiver;
                                    if (imageReceiver.getBitmap() != null) {
                                        currentPeerView.imageReceiver.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                                    }
                                }
                            }
                        }
                        currentPeerView.invalidate();
                        currentPeerView.outlineProvider.radiusInDp = (int) AndroidUtilities.lerp(10.0f, 6.0f / f3, storyViewer.selfStoryViewsView.progressToOpen);
                        anonymousClass5.invalidateOutline();
                        storyViewer.storiesViewPager.setTranslationY((storyViewer.selfStoryViewsView.toY - top2) * f);
                    }
                    if (currentPeerView != null) {
                        storyViewer.volumeControl.setTranslationY(((currentPeerView.storyContainer.getY() + currentPeerView.getY()) - storyViewer.volumeControl.getTop()) - AndroidUtilities.dp(4.0f));
                    }
                    super.dispatchDraw(canvas);
                }

                @Override
                public final void onMeasure(int i4, int i5) {
                    int size = View.MeasureSpec.getSize(i5);
                    StoryViewer storyViewer = this;
                    if (!storyViewer.ATTACH_TO_FRAGMENT || storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
                        View rootView = getRootView();
                        Rect rect = AndroidUtilities.rectTmp2;
                        getWindowVisibleDisplayFrame(rect);
                        int iMax = 0;
                        if (rect.bottom != 0 || rect.top != 0) {
                            iMax = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
                        }
                        storyViewer.setKeyboardHeightFromParent(iMax);
                        size += storyViewer.realKeyboardHeight;
                    }
                    int size2 = View.MeasureSpec.getSize(i4);
                    int i6 = (int) ((size2 * 16.0f) / 9.0f);
                    if (size > i6) {
                        storyViewer.storiesViewPager.getLayoutParams().width = -1;
                        size = i6;
                    } else {
                        int i7 = (int) ((size / 16.0f) * 9.0f);
                        storyViewer.storiesViewPager.getLayoutParams().width = i7;
                        size2 = i7;
                    }
                    storyViewer.aspectRatioFrameLayout.getLayoutParams().height = size + 1;
                    storyViewer.aspectRatioFrameLayout.getLayoutParams().width = size2;
                    ((FrameLayout.LayoutParams) storyViewer.aspectRatioFrameLayout.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                    super.onMeasure(i4, i5);
                }
            };
            AnonymousClass4 anonymousClass5 = new AnonymousClass4(this.currentAccount, context, this, this.resourcesProvider);
            this.storiesViewPager = anonymousClass5;
            anonymousClass5.setDelegate(new AnonymousClass5(storiesList, arrayList, context));
            addView(this.storiesViewPager, LayoutHelper.createFrame(-1, -1, 1));
            this.aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
            if (this.USE_SURFACE_VIEW) {
                SurfaceView surfaceView = new SurfaceView(context);
                this.surfaceView = surfaceView;
                surfaceView.setZOrderMediaOverlay(false);
                this.surfaceView.setZOrderOnTop(false);
                this.aspectRatioFrameLayout.addView(this.surfaceView);
            } else {
                ?? r0 = new HwTextureView(context) {
                    @Override
                    public final void invalidate() {
                        super.invalidate();
                        PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = this.currentPlayerScope;
                        if (videoPlayerSharedScope != null) {
                            videoPlayerSharedScope.invalidate();
                        }
                    }
                };
                this.textureView = r0;
                this.aspectRatioFrameLayout.addView(r0);
            }
            LivePlayerView livePlayerView = new LivePlayerView(context, this.currentAccount);
            this.liveView = livePlayerView;
            livePlayerView.setVisibility(8);
            this.aspectRatioFrameLayout.addView(this.liveView);
            StoriesVolumeControl storiesVolumeControl = new StoriesVolumeControl(context);
            this.volumeControl = storiesVolumeControl;
            addView(storiesVolumeControl, LayoutHelper.createFrame(-1, -1.0f, 0, 4.0f, 0.0f, 4.0f, 0.0f));
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
            this.storiesViewPager.setDays(this.currentAccount, storiesList.dialogId, storiesList.getDays());
        } else {
            AnonymousClass4 anonymousClass6 = this.storiesViewPager;
            int i4 = this.currentAccount;
            anonymousClass6.dialogs = arrayList;
            anonymousClass6.currentAccount = i4;
            anonymousClass6.setAdapter(null);
            anonymousClass6.setAdapter(anonymousClass6.pagerAdapter);
            anonymousClass6.setCurrentItem(i2);
            anonymousClass6.updateDelegate = true;
        }
        this.windowManager = (WindowManager) context.getSystemService("window");
        if (lastFragment == null || lastFragment.getLayoutContainer() == null || lastFragment.isSupportEdgeToEdge()) {
            this.ATTACH_TO_FRAGMENT = false;
        }
        this.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE = this.ATTACH_TO_FRAGMENT && lastFragment != null && lastFragment.isSupportEdgeToEdge();
        AnonymousClass3 anonymousClass3 = this.containerView;
        RichEditor$3$$ExternalSyntheticLambda0 richEditor$3$$ExternalSyntheticLambda0 = new RichEditor$3$$ExternalSyntheticLambda0(this, i3);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(anonymousClass3, richEditor$3$$ExternalSyntheticLambda0);
        if (this.ATTACH_TO_FRAGMENT) {
            AndroidUtilities.removeFromParent(this.windowView);
            this.windowView.setTag(R.id.sheet_attached_to_fragment_tag, new Object());
            lastFragment.getLayoutContainer().addView(this.windowView);
            if (!this.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE) {
                AndroidUtilities.requestAdjustResize(lastFragment.getParentActivity(), lastFragment.getClassGuid());
            }
        } else {
            this.windowView.setFocusable(false);
            setFocusable(false);
            setSystemUiVisibility(1792);
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
            if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = this.windowView.findOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new StoryViewer$$ExternalSyntheticLambda4(this, objArr == true ? 1 : 0));
            }
        }
        this.windowView.requestLayout();
        runOpenAnimationAfterLayout = true;
        updateTransitionParams();
        this.progressToOpen = 0.0f;
        checkNavBarColor();
        animationInProgress = true;
        if (checkSilentMode) {
            checkSilentMode = false;
            isInSilentMode = ((AudioManager) this.windowView.getContext().getSystemService("audio")).getRingerMode() != 2;
        }
        if (this.ATTACH_TO_FRAGMENT && (activityFindActivity = AndroidUtilities.findActivity(this.fragment.getContext())) != null) {
            try {
                activityFindActivity.setRequestedOrientation(1);
            } catch (Exception unused) {
            }
            activityFindActivity.getWindow().addFlags(128);
        }
        if (!this.ATTACH_TO_FRAGMENT) {
            globalInstances.add(this);
        }
        if (lastFragment != null) {
            AndroidUtilities.hideKeyboard(lastFragment.getFragmentView());
        }
    }
}
