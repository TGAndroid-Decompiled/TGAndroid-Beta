package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.firebase.messaging.Store;
import com.stripe.android.Stripe;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.pip.utils.Trigger;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionIntroActivity;
import org.telegram.ui.CalendarActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.Crop.CropGestureDetector;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.LinkEditActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.iv.RichEditor;

public final class PipVideoOverlay implements IPipSourceDelegate {
    public static final SimpleFloatPropertyCompat PIP_X_PROPERTY = new SimpleFloatPropertyCompat(new ShareAlert$$ExternalSyntheticLambda15(15), new ShareAlert$$ExternalSyntheticLambda15(16));
    public static final SimpleFloatPropertyCompat PIP_Y_PROPERTY = new SimpleFloatPropertyCompat(new ShareAlert$$ExternalSyntheticLambda15(17), new ShareAlert$$ExternalSyntheticLambda15(18));
    public static final PipVideoOverlay instance = new PipVideoOverlay();
    public Float aspectRatio;
    public float bufferProgress;
    public boolean canLongClick;
    public View consumingChild;
    public AnonymousClass5 contentFrameLayout;
    public ActionIntroActivity.AnonymousClass2 contentView;
    public ValueAnimator controlsAnimator;
    public AnonymousClass5 controlsView;
    public PhotoViewer.AnonymousClass18 gestureDetector;
    public View innerView;
    public boolean isDismissing;
    public boolean isScrollDisallowed;
    public boolean isScrolling;
    public boolean isShowingControls;
    public boolean isVideoCompleted;
    public boolean isVisible;
    public boolean isWebView;
    public int mVideoHeight;
    public int mVideoWidth;
    public boolean onSideToDismiss;
    public EmbedBottomSheet parentSheet;
    public PhotoViewer photoViewer;
    public PhotoViewerWebView photoViewerWebView;
    public Store pipConfig;
    public int pipHeight;
    public PipSource pipSource;
    public TextureView pipTextureView;
    public int pipWidth;
    public float pipX;
    public SpringAnimation pipXSpring;
    public float pipY;
    public SpringAnimation pipYSpring;
    public View placeholderView;
    public ImageView playPauseButton;
    public boolean postedDismissControls;
    public ScaleGestureDetector scaleGestureDetector;
    public SeekSpeedDrawable seekSpeedDrawable;
    public float videoProgress;
    public CalendarActivity.AnonymousClass5 videoProgressView;
    public WindowManager.LayoutParams windowLayoutParams;
    public WindowManager windowManager;
    public boolean windowViewSkipRender;
    public float maxScaleFactor = 1.4f;
    public float scaleFactor = 1.0f;
    public final VideoForwardDrawable videoForwardDrawable = new VideoForwardDrawable(false);
    public final PipVideoOverlay$$ExternalSyntheticLambda5 progressRunnable = new PipVideoOverlay$$ExternalSyntheticLambda5(this, 1);
    public float[] longClickStartPoint = new float[2];
    public final PipVideoOverlay$$ExternalSyntheticLambda5 longClickCallback = new PipVideoOverlay$$ExternalSyntheticLambda5(this, 2);
    public final PipVideoOverlay$$ExternalSyntheticLambda5 dismissControlsCallback = new PipVideoOverlay$$ExternalSyntheticLambda5(this, 3);

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final PipVideoOverlay this$0;

        public AnonymousClass1(PipVideoOverlay pipVideoOverlay, int i) {
            this.$r8$classId = i;
            this.this$0 = pipVideoOverlay;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.controlsAnimator = null;
                    break;
                default:
                    this.this$0.onDismissedInternal();
                    break;
            }
        }
    }

    public final class AnonymousClass4 extends GestureDetectorFixDoubleTap$OnGestureListener {
        public float startPipX;
        public float startPipY;
        public final int val$touchSlop;

        public AnonymousClass4(int i) {
            this.val$touchSlop = i;
        }

        @Override
        public final boolean hasDoubleTap() {
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            PhotoViewer photoViewer = pipVideoOverlay.photoViewer;
            if (photoViewer == null) {
                return false;
            }
            if ((photoViewer.videoPlayer == null && pipVideoOverlay.photoViewerWebView == null) || pipVideoOverlay.isDismissing || pipVideoOverlay.isVideoCompleted || pipVideoOverlay.isScrolling || pipVideoOverlay.scaleGestureDetector.isInProgress() || !pipVideoOverlay.canLongClick) {
                return false;
            }
            return pipVideoOverlay.getCurrentPosition$1() != -9223372036854775807L && pipVideoOverlay.getDuration$1() >= 15000;
        }

        @Override
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            boolean z;
            PhotoViewerWebView photoViewerWebView;
            VideoPlayer videoPlayer;
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            PhotoViewer photoViewer = pipVideoOverlay.photoViewer;
            if (photoViewer != null && ((photoViewer.videoPlayer != null || pipVideoOverlay.photoViewerWebView != null) && !pipVideoOverlay.isDismissing && !pipVideoOverlay.isVideoCompleted && !pipVideoOverlay.isScrolling && !pipVideoOverlay.scaleGestureDetector.isInProgress() && pipVideoOverlay.canLongClick)) {
                pipVideoOverlay.photoViewer.getClass();
                boolean z2 = motionEvent.getX() >= (((float) PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2())) * pipVideoOverlay.scaleFactor) * 0.5f;
                long currentPosition$1 = pipVideoOverlay.getCurrentPosition$1();
                long duration$1 = pipVideoOverlay.getDuration$1();
                if (currentPosition$1 != -9223372036854775807L && duration$1 >= 15000) {
                    long j = z2 ? currentPosition$1 + 10000 : currentPosition$1 - 10000;
                    if (currentPosition$1 != j) {
                        if (j <= duration$1) {
                            if (j < 0) {
                                z = j >= -9000;
                                j = 0;
                            }
                            if (z) {
                                VideoForwardDrawable videoForwardDrawable = pipVideoOverlay.videoForwardDrawable;
                                videoForwardDrawable.setOneShootAnimation(true);
                                videoForwardDrawable.setLeftSide(!z2);
                                long j2 = videoForwardDrawable.time + 10000;
                                videoForwardDrawable.time = j2;
                                videoForwardDrawable.timeStr = LocaleController.formatPluralString("Seconds", (int) (j2 / 1000), new Object[0]);
                                photoViewerWebView = pipVideoOverlay.photoViewerWebView;
                                if (photoViewerWebView != null) {
                                    photoViewerWebView.seekTo(j);
                                } else {
                                    videoPlayer = pipVideoOverlay.photoViewer.videoPlayer;
                                    if (videoPlayer != null) {
                                        videoPlayer.seekTo(j);
                                    }
                                }
                                pipVideoOverlay.onUpdateRewindProgressUiInternal(j / duration$1, true);
                                if (!pipVideoOverlay.isShowingControls) {
                                    pipVideoOverlay.isShowingControls = true;
                                    pipVideoOverlay.toggleControls$2(true);
                                    if (!pipVideoOverlay.postedDismissControls) {
                                        pipVideoOverlay.postedDismissControls = true;
                                        AndroidUtilities.runOnUIThread(pipVideoOverlay.dismissControlsCallback, 2500L);
                                    }
                                }
                            }
                            return true;
                        }
                        j = duration$1;
                        z = true;
                        if (z) {
                            VideoForwardDrawable videoForwardDrawable2 = pipVideoOverlay.videoForwardDrawable;
                            videoForwardDrawable2.setOneShootAnimation(true);
                            videoForwardDrawable2.setLeftSide(!z2);
                            long j3 = videoForwardDrawable2.time + 10000;
                            videoForwardDrawable2.time = j3;
                            videoForwardDrawable2.timeStr = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
                            photoViewerWebView = pipVideoOverlay.photoViewerWebView;
                            if (photoViewerWebView != null) {
                                photoViewerWebView.seekTo(j);
                            } else {
                                videoPlayer = pipVideoOverlay.photoViewer.videoPlayer;
                                if (videoPlayer != null) {
                                    videoPlayer.seekTo(j);
                                }
                            }
                            pipVideoOverlay.onUpdateRewindProgressUiInternal(j / duration$1, true);
                            if (!pipVideoOverlay.isShowingControls) {
                                pipVideoOverlay.isShowingControls = true;
                                pipVideoOverlay.toggleControls$2(true);
                                if (!pipVideoOverlay.postedDismissControls) {
                                    pipVideoOverlay.postedDismissControls = true;
                                    AndroidUtilities.runOnUIThread(pipVideoOverlay.dismissControlsCallback, 2500L);
                                }
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public final boolean onDown(MotionEvent motionEvent) {
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            if (pipVideoOverlay.isShowingControls) {
                for (int i = 1; i < pipVideoOverlay.contentFrameLayout.getChildCount(); i++) {
                    View childAt = pipVideoOverlay.contentFrameLayout.getChildAt(i);
                    if (childAt.dispatchTouchEvent(motionEvent)) {
                        pipVideoOverlay.consumingChild = childAt;
                        return true;
                    }
                }
            }
            this.startPipX = pipVideoOverlay.pipX;
            this.startPipY = pipVideoOverlay.pipY;
            return true;
        }

        @Override
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            if (!pipVideoOverlay.isScrolling || pipVideoOverlay.isScrollDisallowed) {
                return false;
            }
            SpringAnimation springAnimation = pipVideoOverlay.pipXSpring;
            springAnimation.mVelocity = f;
            float f3 = pipVideoOverlay.pipX;
            springAnimation.mValue = f3;
            springAnimation.mStartValueIsSet = true;
            SpringForce springForce = springAnimation.mSpring;
            int i = pipVideoOverlay.pipWidth;
            float f4 = (f / 7.0f) + (i / 2.0f) + f3;
            int i2 = AndroidUtilities.displaySize.x;
            springForce.mFinalPosition = f4 >= ((float) i2) / 2.0f ? (i2 - i) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
            pipVideoOverlay.pipXSpring.start();
            SpringAnimation springAnimation2 = pipVideoOverlay.pipYSpring;
            springAnimation2.mVelocity = f;
            float f5 = pipVideoOverlay.pipY;
            springAnimation2.mValue = f5;
            springAnimation2.mStartValueIsSet = true;
            springAnimation2.mSpring.mFinalPosition = MathUtils.clamp((f2 / 10.0f) + f5, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pipVideoOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
            pipVideoOverlay.pipYSpring.start();
            return true;
        }

        @Override
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            if (!pipVideoOverlay.isScrolling && pipVideoOverlay.controlsAnimator == null && !pipVideoOverlay.isScrollDisallowed) {
                float fAbs = Math.abs(f);
                float f3 = this.val$touchSlop;
                if (fAbs >= f3 || Math.abs(f2) >= f3) {
                    pipVideoOverlay.isScrolling = true;
                    pipVideoOverlay.pipXSpring.cancel();
                    pipVideoOverlay.pipYSpring.cancel();
                    pipVideoOverlay.canLongClick = false;
                    pipVideoOverlay.cancelRewind();
                    AndroidUtilities.cancelRunOnUIThread(pipVideoOverlay.longClickCallback);
                }
            }
            if (pipVideoOverlay.isScrolling) {
                float f4 = pipVideoOverlay.pipX;
                float rawX = (motionEvent2.getRawX() + this.startPipX) - motionEvent.getRawX();
                pipVideoOverlay.pipY = (motionEvent2.getRawY() + this.startPipY) - motionEvent.getRawY();
                int i = pipVideoOverlay.pipWidth;
                if (rawX > (-i) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i * 0.75f)) {
                    boolean z = pipVideoOverlay.onSideToDismiss;
                    if (z) {
                        if (z) {
                            pipVideoOverlay.pipXSpring.addEndListener(new PipVideoOverlay$4$$ExternalSyntheticLambda0(this, rawX, 0));
                            SpringAnimation springAnimation = pipVideoOverlay.pipXSpring;
                            springAnimation.mValue = f4;
                            springAnimation.mStartValueIsSet = true;
                            springAnimation.mSpring.mFinalPosition = rawX;
                            springAnimation.start();
                        }
                        pipVideoOverlay.onSideToDismiss = false;
                        return true;
                    }
                    SpringAnimation springAnimation2 = pipVideoOverlay.pipXSpring;
                    if (springAnimation2.mRunning) {
                        springAnimation2.mSpring.mFinalPosition = rawX;
                    } else {
                        WindowManager.LayoutParams layoutParams = pipVideoOverlay.windowLayoutParams;
                        pipVideoOverlay.pipX = rawX;
                        layoutParams.x = (int) rawX;
                        pipVideoOverlay.getPipConfig().store.edit().putFloat("x", rawX).apply();
                    }
                    pipVideoOverlay.windowLayoutParams.y = (int) pipVideoOverlay.pipY;
                    pipVideoOverlay.getPipConfig().store.edit().putFloat("y", pipVideoOverlay.pipY).apply();
                    AndroidUtilities.updateViewLayout(pipVideoOverlay.windowManager, pipVideoOverlay.contentView, pipVideoOverlay.windowLayoutParams);
                    return true;
                }
                if (!pipVideoOverlay.onSideToDismiss) {
                    SpringAnimation springAnimation3 = pipVideoOverlay.pipXSpring;
                    springAnimation3.mValue = f4;
                    springAnimation3.mStartValueIsSet = true;
                    SpringForce springForce = springAnimation3.mSpring;
                    float f5 = (i / 2.0f) + rawX;
                    int i2 = AndroidUtilities.displaySize.x;
                    springForce.mFinalPosition = f5 >= ((float) i2) / 2.0f ? i2 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - pipVideoOverlay.pipWidth;
                    pipVideoOverlay.pipXSpring.start();
                }
                pipVideoOverlay.onSideToDismiss = true;
            }
            return true;
        }

        @Override
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            if (pipVideoOverlay.controlsAnimator == null) {
                boolean z = pipVideoOverlay.postedDismissControls;
                PipVideoOverlay$$ExternalSyntheticLambda5 pipVideoOverlay$$ExternalSyntheticLambda5 = pipVideoOverlay.dismissControlsCallback;
                if (z) {
                    AndroidUtilities.cancelRunOnUIThread(pipVideoOverlay$$ExternalSyntheticLambda5);
                    pipVideoOverlay.postedDismissControls = false;
                }
                boolean z2 = !pipVideoOverlay.isShowingControls;
                pipVideoOverlay.isShowingControls = z2;
                pipVideoOverlay.toggleControls$2(z2);
                if (pipVideoOverlay.isShowingControls && !pipVideoOverlay.postedDismissControls) {
                    AndroidUtilities.runOnUIThread(pipVideoOverlay$$ExternalSyntheticLambda5, 2500L);
                    pipVideoOverlay.postedDismissControls = true;
                }
            }
            return true;
        }

        @Override
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (hasDoubleTap()) {
                return super.onSingleTapUp(motionEvent);
            }
            onSingleTapConfirmed(motionEvent);
            return true;
        }
    }

    public static void dismiss() {
        instance.dismissInternal(false, false);
    }

    public static RectOld getPipRect(float f, boolean z) {
        RectOld rectOld = new RectOld();
        float f2 = 1.0f / f;
        PipVideoOverlay pipVideoOverlay = instance;
        if (pipVideoOverlay.isVisible && !z) {
            rectOld.x = pipVideoOverlay.pipX;
            rectOld.y = pipVideoOverlay.pipY + AndroidUtilities.statusBarHeight;
            rectOld.width = pipVideoOverlay.pipWidth;
            rectOld.height = pipVideoOverlay.pipHeight;
            return rectOld;
        }
        float f3 = pipVideoOverlay.getPipConfig().store.getFloat("x", -1.0f);
        float f4 = pipVideoOverlay.getPipConfig().store.getFloat("y", -1.0f);
        float f5 = pipVideoOverlay.getPipConfig().store.getFloat("scale_factor", 1.0f);
        rectOld.width = getSuggestedWidth(f2) * f5;
        rectOld.height = ((int) (getSuggestedWidth(f2) * f2)) * f5;
        if (f3 != -1.0f) {
            float f6 = rectOld.width;
            float f7 = (f6 / 2.0f) + f3;
            float f8 = AndroidUtilities.displaySize.x;
            rectOld.x = f7 >= f8 / 2.0f ? (f8 - f6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            rectOld.x = (AndroidUtilities.displaySize.x - rectOld.width) - AndroidUtilities.dp(16.0f);
        }
        if (f4 != -1.0f) {
            rectOld.y = MathUtils.clamp(f4, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - rectOld.height) + AndroidUtilities.statusBarHeight;
            return rectOld;
        }
        rectOld.y = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return rectOld;
    }

    public static PipSource getPipSource() {
        PipVideoOverlay pipVideoOverlay = instance;
        if (pipVideoOverlay != null) {
            return pipVideoOverlay.pipSource;
        }
        return null;
    }

    public static int getSuggestedWidth(float f) {
        float fMin;
        float f2;
        if (f >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            fMin = Math.min(point.x, point.y);
            f2 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            fMin = Math.min(point2.x, point2.y);
            f2 = 0.6f;
        }
        return (int) (fMin * f2);
    }

    public static void setPhotoViewer(PhotoViewer photoViewer) {
        PipVideoOverlay pipVideoOverlay = instance;
        pipVideoOverlay.photoViewer = photoViewer;
        VideoPlayer videoPlayer = photoViewer.videoPlayer;
        PipSource pipSource = pipVideoOverlay.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            pipVideoOverlay.pipSource = null;
        }
        if (videoPlayer != null && PipUtils.checkPermissions(photoViewer.parentActivity) == 1) {
            PipSource.Builder builder = new PipSource.Builder(photoViewer.parentActivity, pipVideoOverlay);
            builder.tagPrefix = "photo-viewer-pip-" + videoPlayer.playerId;
            builder.priority = 1;
            builder.cornerRadius = AndroidUtilities.dp(10.0f);
            builder.contentView = pipVideoOverlay.contentView;
            builder.placeholderView = pipVideoOverlay.placeholderView;
            int i = pipVideoOverlay.mVideoWidth;
            int i2 = pipVideoOverlay.mVideoHeight;
            builder.width = i;
            builder.height = i2;
            builder.player = videoPlayer.player;
            builder.needMediaSession = true;
            pipVideoOverlay.pipSource = builder.build();
        }
        pipVideoOverlay.updatePlayButtonInternal();
    }

    public final void cancelRewind() {
        PhotoViewer.AnonymousClass4 anonymousClass4;
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null || (anonymousClass4 = photoViewer.videoPlayerRewinder) == null) {
            return;
        }
        anonymousClass4.cancelRewind();
    }

    public final void dismissInternal(boolean z, boolean z2) {
        int i = 0;
        int i2 = 1;
        if (this.isDismissing) {
            return;
        }
        this.isDismissing = true;
        ValueAnimator valueAnimator = this.controlsAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.postedDismissControls) {
            AndroidUtilities.cancelRunOnUIThread(this.dismissControlsCallback);
            this.postedDismissControls = false;
        }
        SpringAnimation springAnimation = this.pipXSpring;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.pipYSpring.cancel();
        }
        if (z || this.contentView == null) {
            if (z2) {
                onDismissedInternal();
                return;
            } else {
                AndroidUtilities.runOnUIThread(new PipVideoOverlay$$ExternalSyntheticLambda5(this, i), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.contentView, (Property<ActionIntroActivity.AnonymousClass2, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ActionIntroActivity.AnonymousClass2, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.contentView, (Property<ActionIntroActivity.AnonymousClass2, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new AnonymousClass1(this, i2));
        animatorSet.start();
    }

    public final long getCurrentPosition$1() {
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            return photoViewerWebView.getCurrentPosition();
        }
        VideoPlayer videoPlayer = this.photoViewer.videoPlayer;
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getCurrentPosition();
    }

    public final long getDuration$1() {
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            return photoViewerWebView.getVideoDuration();
        }
        VideoPlayer videoPlayer = this.photoViewer.videoPlayer;
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getDuration();
    }

    public final Store getPipConfig() {
        if (this.pipConfig == null) {
            Point point = AndroidUtilities.displaySize;
            this.pipConfig = new Store(point.x, point.y);
        }
        return this.pipConfig;
    }

    public final float getRatio$2() {
        if (this.aspectRatio == null) {
            this.aspectRatio = Float.valueOf(this.mVideoHeight / this.mVideoWidth);
            Point point = AndroidUtilities.displaySize;
            this.maxScaleFactor = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / getSuggestedWidth(getRatio$2());
            float f = this.aspectRatio.floatValue() < 1.0f ? 0.6f : 0.45f;
            VideoForwardDrawable videoForwardDrawable = this.videoForwardDrawable;
            videoForwardDrawable.playScaleFactor = f;
            videoForwardDrawable.invalidate();
        }
        return this.aspectRatio.floatValue();
    }

    public final int getSuggestedHeight$2() {
        float ratio$2 = getRatio$2();
        return (int) (getSuggestedWidth(ratio$2) * ratio$2);
    }

    public final void onDismissedInternal() {
        try {
            ActionIntroActivity.AnonymousClass2 anonymousClass2 = this.contentView;
            if (anonymousClass2 != null && anonymousClass2.getParent() != null) {
                this.windowManager.removeViewImmediate(this.contentView);
            }
        } catch (Exception unused) {
        }
        this.videoProgressView = null;
        this.innerView = null;
        this.photoViewer = null;
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            this.pipSource = null;
        }
        this.photoViewerWebView = null;
        this.parentSheet = null;
        this.consumingChild = null;
        this.isScrolling = false;
        this.isVisible = false;
        this.isDismissing = false;
        this.canLongClick = false;
        cancelRewind();
        AndroidUtilities.cancelRunOnUIThread(this.longClickCallback);
    }

    public final void onUpdateRewindProgressUiInternal(float f, boolean z) {
        this.videoForwardDrawable.setTime(0L);
        if (z) {
            this.videoProgress = f;
            CalendarActivity.AnonymousClass5 anonymousClass5 = this.videoProgressView;
            if (anonymousClass5 != null) {
                anonymousClass5.invalidate();
            }
            AnonymousClass5 anonymousClass6 = this.controlsView;
            if (anonymousClass6 != null) {
                anonymousClass6.invalidate();
            }
        }
    }

    @Override
    public final View pipCreatePictureInPictureView() {
        TextureView textureView = new TextureView(this.contentView.getContext());
        this.pipTextureView = textureView;
        textureView.setVisibility(4);
        this.pipTextureView.setOpaque(false);
        this.pipTextureView.setSurfaceTextureListener(new PhotoViewer.AnonymousClass8(this, 2));
        return this.pipTextureView;
    }

    @Override
    public final Bitmap pipCreatePictureInPictureViewBitmap() {
        TextureView textureView = this.pipTextureView;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.pipTextureView.getBitmap();
    }

    @Override
    public final Bitmap pipCreatePrimaryWindowViewBitmap() {
        TextureView textureView;
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null || (textureView = photoViewer.changedTextureView) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.photoViewer.changedTextureView.getBitmap();
    }

    @Override
    public final void pipHidePrimaryWindowView(Trigger trigger) {
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer != null && photoViewer.videoPlayer != null) {
            photoViewer.pipFirstFrameCallback = trigger;
        }
        this.windowManager.removeView(this.contentView);
        this.windowViewSkipRender = true;
        this.contentView.invalidate();
    }

    @Override
    public final boolean pipIsAvailable() {
        PhotoViewer photoViewer = this.photoViewer;
        return photoViewer != null && photoViewer.pipIsAvailable();
    }

    @Override
    public final void pipRenderBackground(Canvas canvas) {
    }

    @Override
    public final void pipRenderForeground(Canvas canvas) {
    }

    @Override
    public final void pipShowPrimaryWindowView(Trigger trigger) {
        PipSource pipSource = this.pipSource;
        if (pipSource != null && pipSource.params.isValid()) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            int iWidth = ((Rect) this.pipSource.params.binarizer).width();
            this.pipWidth = iWidth;
            layoutParams.width = iWidth;
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            int iHeight = ((Rect) this.pipSource.params.binarizer).height();
            this.pipHeight = iHeight;
            layoutParams2.height = iHeight;
        }
        this.windowManager.addView(this.contentView, this.windowLayoutParams);
        this.windowViewSkipRender = false;
        this.contentView.invalidate();
        PhotoViewer photoViewer = this.photoViewer;
        if ((photoViewer != null ? photoViewer.videoPlayer : null) == null) {
            return;
        }
        photoViewer.pipFirstFrameCallback = trigger;
    }

    public final boolean showInternal(boolean z, Activity activity, View view, PhotoViewerWebView photoViewerWebView, int i, int i2, boolean z2) {
        PhotoViewerWebView photoViewerWebView2;
        int i3 = 4;
        final int i4 = 1;
        final int i5 = 0;
        boolean z3 = z || PipUtils.checkPermissions(ApplicationLoader.applicationContext) == 1;
        if (this.isVisible) {
            return false;
        }
        this.isVisible = true;
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
        this.aspectRatio = null;
        if (photoViewerWebView == null || !photoViewerWebView.isYouTube) {
            this.photoViewerWebView = null;
        } else {
            this.photoViewerWebView = photoViewerWebView;
        }
        float f = getPipConfig().store.getFloat("x", -1.0f);
        float f2 = getPipConfig().store.getFloat("y", -1.0f);
        this.scaleFactor = getPipConfig().store.getFloat("scale_factor", 1.0f);
        this.pipWidth = (int) (getSuggestedWidth(getRatio$2()) * this.scaleFactor);
        this.pipHeight = (int) (getSuggestedHeight$2() * this.scaleFactor);
        this.isShowingControls = false;
        SpringAnimation springAnimation = new SpringAnimation(this, PIP_X_PROPERTY);
        SpringForce springForce = new SpringForce();
        springForce.setDampingRatio(0.75f);
        springForce.setStiffness(650.0f);
        springAnimation.mSpring = springForce;
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener(this) {
            public final PipVideoOverlay f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z4, float f3, float f4) {
                switch (i5) {
                    case 0:
                        this.f$0.getPipConfig().store.edit().putFloat("x", f3).apply();
                        break;
                    default:
                        this.f$0.getPipConfig().store.edit().putFloat("y", f3).apply();
                        break;
                }
            }
        });
        this.pipXSpring = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, PIP_Y_PROPERTY);
        SpringForce springForce2 = new SpringForce();
        springForce2.setDampingRatio(0.75f);
        springForce2.setStiffness(650.0f);
        springAnimation2.mSpring = springForce2;
        springAnimation2.addEndListener(new DynamicAnimation.OnAnimationEndListener(this) {
            public final PipVideoOverlay f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z4, float f3, float f4) {
                switch (i4) {
                    case 0:
                        this.f$0.getPipConfig().store.edit().putFloat("x", f3).apply();
                        break;
                    default:
                        this.f$0.getPipConfig().store.edit().putFloat("y", f3).apply();
                        break;
                }
            }
        });
        this.pipYSpring = springAnimation2;
        Context context = z3 ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new AnonymousClass3(this, i5));
        this.scaleGestureDetector = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (Build.VERSION.SDK_INT >= 23) {
            this.scaleGestureDetector.setStylusScaleEnabled(false);
        }
        this.gestureDetector = new PhotoViewer.AnonymousClass18(context, new AnonymousClass4(scaledTouchSlop));
        this.contentFrameLayout = new FrameLayout(this, context) {
            public final PipVideoOverlay this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                switch (i5) {
                    case 1:
                        super.dispatchDraw(canvas);
                        PipVideoOverlay pipVideoOverlay = this.this$0;
                        SeekSpeedDrawable seekSpeedDrawable = pipVideoOverlay.seekSpeedDrawable;
                        if (seekSpeedDrawable != null && seekSpeedDrawable.isShown()) {
                            pipVideoOverlay.seekSpeedDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                            pipVideoOverlay.seekSpeedDrawable.draw(canvas);
                            break;
                        }
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                PhotoViewer photoViewer;
                PhotoViewer.AnonymousClass4 anonymousClass4;
                switch (i5) {
                    case 0:
                        int actionMasked = motionEvent.getActionMasked();
                        PipVideoOverlay pipVideoOverlay = this.this$0;
                        if (actionMasked == 0 || actionMasked == 5) {
                            if (motionEvent.getPointerCount() == 1) {
                                pipVideoOverlay.canLongClick = true;
                                pipVideoOverlay.longClickStartPoint = new float[]{motionEvent.getX(), motionEvent.getY()};
                                AndroidUtilities.runOnUIThread(pipVideoOverlay.longClickCallback, 500L);
                            } else {
                                pipVideoOverlay.canLongClick = false;
                                pipVideoOverlay.cancelRewind();
                                AndroidUtilities.cancelRunOnUIThread(pipVideoOverlay.longClickCallback);
                            }
                        }
                        if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                            pipVideoOverlay.canLongClick = false;
                            pipVideoOverlay.cancelRewind();
                            AndroidUtilities.cancelRunOnUIThread(pipVideoOverlay.longClickCallback);
                        } else if (actionMasked == 2 && (photoViewer = pipVideoOverlay.photoViewer) != null && (anonymousClass4 = photoViewer.videoPlayerRewinder) != null && anonymousClass4.rewinding) {
                            anonymousClass4.setX(motionEvent.getX());
                        }
                        if (pipVideoOverlay.consumingChild != null) {
                            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                            motionEventObtain.offsetLocation(pipVideoOverlay.consumingChild.getX(), pipVideoOverlay.consumingChild.getY());
                            boolean zDispatchTouchEvent = pipVideoOverlay.consumingChild.dispatchTouchEvent(motionEvent);
                            motionEventObtain.recycle();
                            if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                                pipVideoOverlay.consumingChild = null;
                            }
                            if (zDispatchTouchEvent) {
                                return true;
                            }
                        }
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                        motionEventObtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                        boolean zOnTouchEvent = pipVideoOverlay.scaleGestureDetector.onTouchEvent(motionEventObtain2);
                        motionEventObtain2.recycle();
                        boolean z4 = !pipVideoOverlay.scaleGestureDetector.isInProgress() && ((GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) pipVideoOverlay.gestureDetector.this$0).onTouchEvent(motionEvent);
                        if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                            pipVideoOverlay.isScrolling = false;
                            pipVideoOverlay.isScrollDisallowed = false;
                            if (pipVideoOverlay.onSideToDismiss) {
                                pipVideoOverlay.onSideToDismiss = false;
                                PipVideoOverlay pipVideoOverlay2 = PipVideoOverlay.instance;
                                EmbedBottomSheet embedBottomSheet = pipVideoOverlay2.parentSheet;
                                if (embedBottomSheet != null) {
                                    embedBottomSheet.destroy();
                                } else {
                                    PhotoViewer photoViewer2 = pipVideoOverlay2.photoViewer;
                                    if (photoViewer2 != null) {
                                        photoViewer2.destroyPhotoViewer();
                                        MediaController.getInstance().tryResumePausedAudio();
                                    }
                                }
                                PipVideoOverlay.dismiss();
                            } else {
                                SpringAnimation springAnimation3 = pipVideoOverlay.pipXSpring;
                                if (!springAnimation3.mRunning) {
                                    float f3 = pipVideoOverlay.pipX;
                                    springAnimation3.mValue = f3;
                                    springAnimation3.mStartValueIsSet = true;
                                    SpringForce springForce3 = springAnimation3.mSpring;
                                    int i6 = pipVideoOverlay.pipWidth;
                                    float f4 = (i6 / 2.0f) + f3;
                                    int i7 = AndroidUtilities.displaySize.x;
                                    springForce3.mFinalPosition = f4 >= ((float) i7) / 2.0f ? (i7 - i6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                                    pipVideoOverlay.pipXSpring.start();
                                }
                                SpringAnimation springAnimation4 = pipVideoOverlay.pipYSpring;
                                if (!springAnimation4.mRunning) {
                                    float f5 = pipVideoOverlay.pipY;
                                    springAnimation4.mValue = f5;
                                    springAnimation4.mStartValueIsSet = true;
                                    springAnimation4.mSpring.mFinalPosition = MathUtils.clamp(f5, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pipVideoOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                                    pipVideoOverlay.pipYSpring.start();
                                }
                            }
                        }
                        return zOnTouchEvent || z4;
                    default:
                        return super.dispatchTouchEvent(motionEvent);
                }
            }

            @Override
            public void onConfigurationChanged(Configuration configuration) {
                switch (i5) {
                    case 0:
                        AndroidUtilities.checkDisplaySize(getContext(), configuration);
                        PipVideoOverlay pipVideoOverlay = this.this$0;
                        pipVideoOverlay.pipConfig = null;
                        AndroidUtilities.setPreferredMaxRefreshRate(pipVideoOverlay.windowManager, pipVideoOverlay.contentView, pipVideoOverlay.windowLayoutParams);
                        if (pipVideoOverlay.pipWidth != PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()) * pipVideoOverlay.scaleFactor || pipVideoOverlay.pipHeight != pipVideoOverlay.getSuggestedHeight$2() * pipVideoOverlay.scaleFactor) {
                            WindowManager.LayoutParams layoutParams = pipVideoOverlay.windowLayoutParams;
                            int suggestedWidth = (int) (PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()) * pipVideoOverlay.scaleFactor);
                            pipVideoOverlay.pipWidth = suggestedWidth;
                            layoutParams.width = suggestedWidth;
                            WindowManager.LayoutParams layoutParams2 = pipVideoOverlay.windowLayoutParams;
                            int suggestedHeight$2 = (int) (pipVideoOverlay.getSuggestedHeight$2() * pipVideoOverlay.scaleFactor);
                            pipVideoOverlay.pipHeight = suggestedHeight$2;
                            layoutParams2.height = suggestedHeight$2;
                            AndroidUtilities.updateViewLayout(pipVideoOverlay.windowManager, pipVideoOverlay.contentView, pipVideoOverlay.windowLayoutParams);
                            SpringAnimation springAnimation3 = pipVideoOverlay.pipXSpring;
                            float f3 = pipVideoOverlay.pipX;
                            springAnimation3.mValue = f3;
                            springAnimation3.mStartValueIsSet = true;
                            SpringForce springForce3 = springAnimation3.mSpring;
                            float fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()), pipVideoOverlay.scaleFactor, 2.0f, f3);
                            float f4 = AndroidUtilities.displaySize.x;
                            springForce3.mFinalPosition = fM >= f4 / 2.0f ? (f4 - (PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()) * pipVideoOverlay.scaleFactor)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            pipVideoOverlay.pipXSpring.start();
                            SpringAnimation springAnimation4 = pipVideoOverlay.pipYSpring;
                            float f5 = pipVideoOverlay.pipY;
                            springAnimation4.mValue = f5;
                            springAnimation4.mStartValueIsSet = true;
                            springAnimation4.mSpring.mFinalPosition = MathUtils.clamp(f5, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (pipVideoOverlay.getSuggestedHeight$2() * pipVideoOverlay.scaleFactor)) - AndroidUtilities.dp(16.0f));
                            pipVideoOverlay.pipYSpring.start();
                        }
                        break;
                    default:
                        super.onConfigurationChanged(configuration);
                        break;
                }
            }

            @Override
            public void onDraw(Canvas canvas) {
                switch (i5) {
                    case 1:
                        PipVideoOverlay pipVideoOverlay = this.this$0;
                        VideoForwardDrawable videoForwardDrawable = pipVideoOverlay.videoForwardDrawable;
                        if (videoForwardDrawable.animating) {
                            videoForwardDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                            pipVideoOverlay.videoForwardDrawable.draw(canvas);
                        }
                        PhotoViewer photoViewer = pipVideoOverlay.photoViewer;
                        if (photoViewer != null && photoViewer.framesRewinder != null) {
                            canvas.save();
                            canvas.translate(getLeft(), getTop());
                            pipVideoOverlay.photoViewer.framesRewinder.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
                            canvas.restore();
                            break;
                        }
                        break;
                    default:
                        super.onDraw(canvas);
                        break;
                }
            }
        };
        ActionIntroActivity.AnonymousClass2 anonymousClass2 = new ActionIntroActivity.AnonymousClass2(this, context, i4);
        this.contentView = anonymousClass2;
        anonymousClass2.addView(this.contentFrameLayout, LayoutHelper.createFrame(-1.0f, -1));
        AnonymousClass5 anonymousClass5 = this.contentFrameLayout;
        float fDp = AndroidUtilities.dp(10.0f);
        RichEditor.AnonymousClass5 anonymousClass6 = ViewOutlineProviderImpl.BOUNDS_OVAL;
        anonymousClass5.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(0, fDp));
        setClipToOutline(true);
        setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_actionBar, false));
        this.innerView = view;
        if (view.getParent() != null) {
            ((ViewGroup) this.innerView.getParent()).removeView(this.innerView);
        }
        addView(this.innerView, LayoutHelper.createFrame(-1.0f, -1));
        View view2 = new View(context);
        this.placeholderView = view2;
        addView(view2, LayoutHelper.createFrame(-1.0f, -1));
        this.videoForwardDrawable.delegate = new Stripe(this, 24);
        this.controlsView = new FrameLayout(this, context) {
            public final PipVideoOverlay this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                switch (i4) {
                    case 1:
                        super.dispatchDraw(canvas);
                        PipVideoOverlay pipVideoOverlay = this.this$0;
                        SeekSpeedDrawable seekSpeedDrawable = pipVideoOverlay.seekSpeedDrawable;
                        if (seekSpeedDrawable != null && seekSpeedDrawable.isShown()) {
                            pipVideoOverlay.seekSpeedDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                            pipVideoOverlay.seekSpeedDrawable.draw(canvas);
                            break;
                        }
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                PhotoViewer photoViewer;
                PhotoViewer.AnonymousClass4 anonymousClass4;
                switch (i4) {
                    case 0:
                        int actionMasked = motionEvent.getActionMasked();
                        PipVideoOverlay pipVideoOverlay = this.this$0;
                        if (actionMasked == 0 || actionMasked == 5) {
                            if (motionEvent.getPointerCount() == 1) {
                                pipVideoOverlay.canLongClick = true;
                                pipVideoOverlay.longClickStartPoint = new float[]{motionEvent.getX(), motionEvent.getY()};
                                AndroidUtilities.runOnUIThread(pipVideoOverlay.longClickCallback, 500L);
                            } else {
                                pipVideoOverlay.canLongClick = false;
                                pipVideoOverlay.cancelRewind();
                                AndroidUtilities.cancelRunOnUIThread(pipVideoOverlay.longClickCallback);
                            }
                        }
                        if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                            pipVideoOverlay.canLongClick = false;
                            pipVideoOverlay.cancelRewind();
                            AndroidUtilities.cancelRunOnUIThread(pipVideoOverlay.longClickCallback);
                        } else if (actionMasked == 2 && (photoViewer = pipVideoOverlay.photoViewer) != null && (anonymousClass4 = photoViewer.videoPlayerRewinder) != null && anonymousClass4.rewinding) {
                            anonymousClass4.setX(motionEvent.getX());
                        }
                        if (pipVideoOverlay.consumingChild != null) {
                            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                            motionEventObtain.offsetLocation(pipVideoOverlay.consumingChild.getX(), pipVideoOverlay.consumingChild.getY());
                            boolean zDispatchTouchEvent = pipVideoOverlay.consumingChild.dispatchTouchEvent(motionEvent);
                            motionEventObtain.recycle();
                            if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                                pipVideoOverlay.consumingChild = null;
                            }
                            if (zDispatchTouchEvent) {
                                return true;
                            }
                        }
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                        motionEventObtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                        boolean zOnTouchEvent = pipVideoOverlay.scaleGestureDetector.onTouchEvent(motionEventObtain2);
                        motionEventObtain2.recycle();
                        boolean z4 = !pipVideoOverlay.scaleGestureDetector.isInProgress() && ((GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) pipVideoOverlay.gestureDetector.this$0).onTouchEvent(motionEvent);
                        if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                            pipVideoOverlay.isScrolling = false;
                            pipVideoOverlay.isScrollDisallowed = false;
                            if (pipVideoOverlay.onSideToDismiss) {
                                pipVideoOverlay.onSideToDismiss = false;
                                PipVideoOverlay pipVideoOverlay2 = PipVideoOverlay.instance;
                                EmbedBottomSheet embedBottomSheet = pipVideoOverlay2.parentSheet;
                                if (embedBottomSheet != null) {
                                    embedBottomSheet.destroy();
                                } else {
                                    PhotoViewer photoViewer2 = pipVideoOverlay2.photoViewer;
                                    if (photoViewer2 != null) {
                                        photoViewer2.destroyPhotoViewer();
                                        MediaController.getInstance().tryResumePausedAudio();
                                    }
                                }
                                PipVideoOverlay.dismiss();
                            } else {
                                SpringAnimation springAnimation3 = pipVideoOverlay.pipXSpring;
                                if (!springAnimation3.mRunning) {
                                    float f3 = pipVideoOverlay.pipX;
                                    springAnimation3.mValue = f3;
                                    springAnimation3.mStartValueIsSet = true;
                                    SpringForce springForce3 = springAnimation3.mSpring;
                                    int i6 = pipVideoOverlay.pipWidth;
                                    float f4 = (i6 / 2.0f) + f3;
                                    int i7 = AndroidUtilities.displaySize.x;
                                    springForce3.mFinalPosition = f4 >= ((float) i7) / 2.0f ? (i7 - i6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                                    pipVideoOverlay.pipXSpring.start();
                                }
                                SpringAnimation springAnimation4 = pipVideoOverlay.pipYSpring;
                                if (!springAnimation4.mRunning) {
                                    float f5 = pipVideoOverlay.pipY;
                                    springAnimation4.mValue = f5;
                                    springAnimation4.mStartValueIsSet = true;
                                    springAnimation4.mSpring.mFinalPosition = MathUtils.clamp(f5, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pipVideoOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                                    pipVideoOverlay.pipYSpring.start();
                                }
                            }
                        }
                        return zOnTouchEvent || z4;
                    default:
                        return super.dispatchTouchEvent(motionEvent);
                }
            }

            @Override
            public void onConfigurationChanged(Configuration configuration) {
                switch (i4) {
                    case 0:
                        AndroidUtilities.checkDisplaySize(getContext(), configuration);
                        PipVideoOverlay pipVideoOverlay = this.this$0;
                        pipVideoOverlay.pipConfig = null;
                        AndroidUtilities.setPreferredMaxRefreshRate(pipVideoOverlay.windowManager, pipVideoOverlay.contentView, pipVideoOverlay.windowLayoutParams);
                        if (pipVideoOverlay.pipWidth != PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()) * pipVideoOverlay.scaleFactor || pipVideoOverlay.pipHeight != pipVideoOverlay.getSuggestedHeight$2() * pipVideoOverlay.scaleFactor) {
                            WindowManager.LayoutParams layoutParams = pipVideoOverlay.windowLayoutParams;
                            int suggestedWidth = (int) (PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()) * pipVideoOverlay.scaleFactor);
                            pipVideoOverlay.pipWidth = suggestedWidth;
                            layoutParams.width = suggestedWidth;
                            WindowManager.LayoutParams layoutParams2 = pipVideoOverlay.windowLayoutParams;
                            int suggestedHeight$2 = (int) (pipVideoOverlay.getSuggestedHeight$2() * pipVideoOverlay.scaleFactor);
                            pipVideoOverlay.pipHeight = suggestedHeight$2;
                            layoutParams2.height = suggestedHeight$2;
                            AndroidUtilities.updateViewLayout(pipVideoOverlay.windowManager, pipVideoOverlay.contentView, pipVideoOverlay.windowLayoutParams);
                            SpringAnimation springAnimation3 = pipVideoOverlay.pipXSpring;
                            float f3 = pipVideoOverlay.pipX;
                            springAnimation3.mValue = f3;
                            springAnimation3.mStartValueIsSet = true;
                            SpringForce springForce3 = springAnimation3.mSpring;
                            float fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()), pipVideoOverlay.scaleFactor, 2.0f, f3);
                            float f4 = AndroidUtilities.displaySize.x;
                            springForce3.mFinalPosition = fM >= f4 / 2.0f ? (f4 - (PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()) * pipVideoOverlay.scaleFactor)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            pipVideoOverlay.pipXSpring.start();
                            SpringAnimation springAnimation4 = pipVideoOverlay.pipYSpring;
                            float f5 = pipVideoOverlay.pipY;
                            springAnimation4.mValue = f5;
                            springAnimation4.mStartValueIsSet = true;
                            springAnimation4.mSpring.mFinalPosition = MathUtils.clamp(f5, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (pipVideoOverlay.getSuggestedHeight$2() * pipVideoOverlay.scaleFactor)) - AndroidUtilities.dp(16.0f));
                            pipVideoOverlay.pipYSpring.start();
                        }
                        break;
                    default:
                        super.onConfigurationChanged(configuration);
                        break;
                }
            }

            @Override
            public void onDraw(Canvas canvas) {
                switch (i4) {
                    case 1:
                        PipVideoOverlay pipVideoOverlay = this.this$0;
                        VideoForwardDrawable videoForwardDrawable = pipVideoOverlay.videoForwardDrawable;
                        if (videoForwardDrawable.animating) {
                            videoForwardDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                            pipVideoOverlay.videoForwardDrawable.draw(canvas);
                        }
                        PhotoViewer photoViewer = pipVideoOverlay.photoViewer;
                        if (photoViewer != null && photoViewer.framesRewinder != null) {
                            canvas.save();
                            canvas.translate(getLeft(), getTop());
                            pipVideoOverlay.photoViewer.framesRewinder.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
                            canvas.restore();
                            break;
                        }
                        break;
                    default:
                        super.onDraw(canvas);
                        break;
                }
            }
        };
        AnonymousClass5 anonymousClass7 = this.controlsView;
        Objects.requireNonNull(anonymousClass7);
        this.seekSpeedDrawable = new SeekSpeedDrawable(new PasscodeView$9$$ExternalSyntheticLambda0(anonymousClass7, 10), true);
        setWillNotDraw(false);
        setAlpha(0.0f);
        View view3 = new View(context);
        view3.setBackgroundColor(1275068416);
        addView(view3, LayoutHelper.createFrame(-1.0f, -1));
        int iDp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i6 = Theme.key_voipgroup_actionBarItems;
        int color = Theme.getColor(null, i6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(color, mode);
        int i7 = Theme.key_listSelector;
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i7, false), 1, -1));
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(7));
        float f3 = 38;
        float f4 = 4;
        addView(imageView, LayoutHelper.createFrame(38, f3, 5, 0.0f, f4, f4, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(Theme.getColor(null, i6, false), mode);
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i7, false), 1, -1));
        imageView2.setPadding(iDp, iDp, iDp, iDp);
        imageView2.setOnClickListener(new LinkEditActivity$$ExternalSyntheticLambda5(i3, this, z3));
        addView(imageView2, LayoutHelper.createFrame(38, f3, 5, 0.0f, f4, 48, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.playPauseButton = imageView3;
        imageView3.setColorFilter(Theme.getColor(null, i6, false), mode);
        this.playPauseButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i7, false), 1, -1));
        this.playPauseButton.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 14));
        View view4 = this.innerView;
        boolean z4 = (view4 instanceof WebView) || (view4 instanceof PhotoViewerWebView);
        this.isWebView = z4;
        this.playPauseButton.setVisibility((!z4 || ((photoViewerWebView2 = this.photoViewerWebView) != null && photoViewerWebView2.isYouTube)) ? 0 : 8);
        addView(this.playPauseButton, LayoutHelper.createFrame(38, 38, 17));
        CalendarActivity.AnonymousClass5 anonymousClass8 = new CalendarActivity.AnonymousClass5(this, context);
        this.videoProgressView = anonymousClass8;
        addView(anonymousClass8, LayoutHelper.createFrame(-1.0f, -1));
        addView(this.controlsView, LayoutHelper.createFrame(-1.0f, -1));
        this.windowManager = (WindowManager) (z3 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = PipUtils.createWindowLayoutParams(context, z3);
        this.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
        int i8 = this.pipWidth;
        layoutParamsCreateWindowLayoutParams.width = i8;
        layoutParamsCreateWindowLayoutParams.height = this.pipHeight;
        if (f != -1.0f) {
            float f5 = (i8 / 2.0f) + f;
            int i9 = AndroidUtilities.displaySize.x;
            float fDp2 = f5 >= ((float) i9) / 2.0f ? (i9 - i8) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
            this.pipX = fDp2;
            layoutParamsCreateWindowLayoutParams.x = (int) fDp2;
        } else {
            float fDp3 = (AndroidUtilities.displaySize.x - i8) - AndroidUtilities.dp(16.0f);
            this.pipX = fDp3;
            layoutParamsCreateWindowLayoutParams.x = (int) fDp3;
        }
        if (f2 != -1.0f) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            float fClamp = MathUtils.clamp(f2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - this.pipHeight);
            this.pipY = fClamp;
            layoutParams.y = (int) fClamp;
        } else {
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            float fDp4 = AndroidUtilities.dp(16.0f);
            this.pipY = fDp4;
            layoutParams2.y = (int) fDp4;
        }
        WindowManager.LayoutParams layoutParams3 = this.windowLayoutParams;
        layoutParams3.dimAmount = 0.0f;
        layoutParams3.flags = 520;
        AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.contentView, layoutParams3);
        if (z2) {
            this.windowManager.addView(this.contentView, this.windowLayoutParams);
            return true;
        }
        this.contentView.setAlpha(0.0f);
        this.contentView.setScaleX(0.1f);
        this.contentView.setScaleY(0.1f);
        this.windowManager.addView(this.contentView, this.windowLayoutParams);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.contentView, (Property<ActionIntroActivity.AnonymousClass2, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ActionIntroActivity.AnonymousClass2, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ActionIntroActivity.AnonymousClass2, Float>) View.SCALE_Y, 1.0f));
        animatorSet.start();
        return true;
    }

    public final void toggleControls$2(boolean z) {
        int i = 0;
        ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(200L);
        this.controlsAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.controlsAnimator.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 26));
        this.controlsAnimator.addListener(new AnonymousClass1(this, i));
        this.controlsAnimator.start();
    }

    public final void updatePlayButtonInternal() {
        boolean zIsPlaying;
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null || this.playPauseButton == null) {
            return;
        }
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            zIsPlaying = photoViewerWebView.isPlaying;
        } else {
            VideoPlayer videoPlayer = photoViewer.videoPlayer;
            if (videoPlayer == null) {
                return;
            } else {
                zIsPlaying = videoPlayer.isPlaying();
            }
        }
        PipVideoOverlay$$ExternalSyntheticLambda5 pipVideoOverlay$$ExternalSyntheticLambda5 = this.progressRunnable;
        AndroidUtilities.cancelRunOnUIThread(pipVideoOverlay$$ExternalSyntheticLambda5);
        if (zIsPlaying) {
            this.playPauseButton.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(pipVideoOverlay$$ExternalSyntheticLambda5, 500L);
        } else if (this.isVideoCompleted) {
            this.playPauseButton.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.playPauseButton.setImageResource(R.drawable.pip_play_large);
        }
    }

    public final class AnonymousClass3 implements ScaleGestureDetector.OnScaleGestureListener {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            switch (this.$r8$classId) {
                case 0:
                    PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) this.this$0;
                    pipVideoOverlay.scaleFactor = MathUtils.clamp(scaleGestureDetector.getScaleFactor() * pipVideoOverlay.scaleFactor, 0.75f, pipVideoOverlay.maxScaleFactor);
                    pipVideoOverlay.pipWidth = (int) (PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()) * pipVideoOverlay.scaleFactor);
                    pipVideoOverlay.pipHeight = (int) (pipVideoOverlay.getSuggestedHeight$2() * pipVideoOverlay.scaleFactor);
                    AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0(this, 11));
                    float focusX = scaleGestureDetector.getFocusX();
                    int i = AndroidUtilities.displaySize.x;
                    float fDp = focusX >= ((float) i) / 2.0f ? (i - pipVideoOverlay.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    SpringAnimation springAnimation = pipVideoOverlay.pipXSpring;
                    if (springAnimation.mRunning) {
                        springAnimation.mSpring.mFinalPosition = fDp;
                    } else {
                        springAnimation.mValue = pipVideoOverlay.pipX;
                        springAnimation.mStartValueIsSet = true;
                        springAnimation.mSpring.mFinalPosition = fDp;
                    }
                    springAnimation.start();
                    float fClamp = MathUtils.clamp(scaleGestureDetector.getFocusY() - (pipVideoOverlay.pipHeight / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pipVideoOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                    SpringAnimation springAnimation2 = pipVideoOverlay.pipYSpring;
                    if (springAnimation2.mRunning) {
                        springAnimation2.mSpring.mFinalPosition = fClamp;
                    } else {
                        springAnimation2.mValue = pipVideoOverlay.pipY;
                        springAnimation2.mStartValueIsSet = true;
                        springAnimation2.mSpring.mFinalPosition = fClamp;
                    }
                    springAnimation2.start();
                    return true;
                case 1:
                    float scaleFactor = scaleGestureDetector.getScaleFactor();
                    if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                        return false;
                    }
                    CropView cropView = ((CropGestureDetector) this.this$0).mListener;
                    float focusX2 = scaleGestureDetector.getFocusX();
                    float focusY = scaleGestureDetector.getFocusY();
                    if (!cropView.animating) {
                        float f = cropView.state.scale;
                        if (f * scaleFactor > 30.0f) {
                            scaleFactor = 30.0f / f;
                        }
                        float f2 = !cropView.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
                        ImageView imageView = cropView.imageView;
                        float width = focusX2 - (imageView.getWidth() / 2);
                        CropAreaView cropAreaView = cropView.areaView;
                        float cropWidth = width / cropAreaView.getCropWidth();
                        CropView.CropState cropState = cropView.state;
                        float f3 = ((cropState.orientation + cropState.baseRotation) % 180.0f != 0.0f ? cropState.height : cropState.width) * cropWidth;
                        float fM = ImageReceiver$$ExternalSyntheticOutline1.m((imageView.getHeight() - cropView.bottomPadding) - f2, cropView.topPadding, 2.0f, focusY) / cropAreaView.getCropHeight();
                        CropView.CropState cropState2 = cropView.state;
                        CropView.CropState.access$700(cropState2, scaleFactor, f3, ((cropState2.orientation + cropState2.baseRotation) % 180.0f != 0.0f ? cropState2.width : cropState2.height) * fM);
                        cropView.updateMatrix(false);
                    }
                    return true;
                case 2:
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    rTMPStreamPipOverlay.scaleFactor = MathUtils.clamp(scaleGestureDetector.getScaleFactor() * rTMPStreamPipOverlay.scaleFactor, 0.6f, rTMPStreamPipOverlay.maxScaleFactor);
                    rTMPStreamPipOverlay.pipWidth = (int) (rTMPStreamPipOverlay.getSuggestedWidth() * rTMPStreamPipOverlay.scaleFactor);
                    rTMPStreamPipOverlay.pipHeight = (int) (rTMPStreamPipOverlay.getSuggestedHeight() * rTMPStreamPipOverlay.scaleFactor);
                    AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(this, 27));
                    SpringAnimation springAnimation3 = rTMPStreamPipOverlay.pipXSpring;
                    springAnimation3.mValue = rTMPStreamPipOverlay.pipX;
                    springAnimation3.mStartValueIsSet = true;
                    SpringForce springForce = springAnimation3.mSpring;
                    float focusX3 = scaleGestureDetector.getFocusX();
                    int i2 = AndroidUtilities.displaySize.x;
                    springForce.mFinalPosition = focusX3 >= ((float) i2) / 2.0f ? (i2 - rTMPStreamPipOverlay.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    SpringAnimation springAnimation4 = rTMPStreamPipOverlay.pipXSpring;
                    if (!springAnimation4.mRunning) {
                        springAnimation4.start();
                    }
                    SpringAnimation springAnimation5 = rTMPStreamPipOverlay.pipYSpring;
                    springAnimation5.mValue = rTMPStreamPipOverlay.pipY;
                    springAnimation5.mStartValueIsSet = true;
                    springAnimation5.mSpring.mFinalPosition = MathUtils.clamp(scaleGestureDetector.getFocusY() - (rTMPStreamPipOverlay.pipHeight / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rTMPStreamPipOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                    SpringAnimation springAnimation6 = rTMPStreamPipOverlay.pipYSpring;
                    if (!springAnimation6.mRunning) {
                        springAnimation6.start();
                    }
                    return true;
                default:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    liveStoryPipOverlay.scaleFactor = MathUtils.clamp(scaleGestureDetector.getScaleFactor() * liveStoryPipOverlay.scaleFactor, 0.6f, liveStoryPipOverlay.maxScaleFactor);
                    liveStoryPipOverlay.pipWidth = (int) (liveStoryPipOverlay.getSuggestedWidth$1() * liveStoryPipOverlay.scaleFactor);
                    liveStoryPipOverlay.pipHeight = (int) (liveStoryPipOverlay.getSuggestedHeight$1() * liveStoryPipOverlay.scaleFactor);
                    AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(this, 8));
                    SpringAnimation springAnimation7 = liveStoryPipOverlay.pipXSpring;
                    springAnimation7.mValue = liveStoryPipOverlay.pipX;
                    springAnimation7.mStartValueIsSet = true;
                    SpringForce springForce2 = springAnimation7.mSpring;
                    float focusX4 = scaleGestureDetector.getFocusX();
                    int i3 = AndroidUtilities.displaySize.x;
                    springForce2.mFinalPosition = focusX4 >= ((float) i3) / 2.0f ? (i3 - liveStoryPipOverlay.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    SpringAnimation springAnimation8 = liveStoryPipOverlay.pipXSpring;
                    if (!springAnimation8.mRunning) {
                        springAnimation8.start();
                    }
                    SpringAnimation springAnimation9 = liveStoryPipOverlay.pipYSpring;
                    springAnimation9.mValue = liveStoryPipOverlay.pipY;
                    springAnimation9.mStartValueIsSet = true;
                    springAnimation9.mSpring.mFinalPosition = MathUtils.clamp(scaleGestureDetector.getFocusY() - (liveStoryPipOverlay.pipHeight / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - liveStoryPipOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                    SpringAnimation springAnimation10 = liveStoryPipOverlay.pipYSpring;
                    if (!springAnimation10.mRunning) {
                        springAnimation10.start();
                    }
                    return true;
            }
        }

        @Override
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            switch (this.$r8$classId) {
                case 0:
                    PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) this.this$0;
                    if (pipVideoOverlay.isScrolling) {
                        pipVideoOverlay.isScrolling = false;
                        pipVideoOverlay.canLongClick = false;
                        pipVideoOverlay.cancelRewind();
                        AndroidUtilities.cancelRunOnUIThread(pipVideoOverlay.longClickCallback);
                    }
                    pipVideoOverlay.isScrollDisallowed = true;
                    pipVideoOverlay.windowLayoutParams.width = (int) (PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()) * pipVideoOverlay.maxScaleFactor);
                    pipVideoOverlay.windowLayoutParams.height = (int) (pipVideoOverlay.getSuggestedHeight$2() * pipVideoOverlay.maxScaleFactor);
                    AndroidUtilities.updateViewLayout(pipVideoOverlay.windowManager, pipVideoOverlay.contentView, pipVideoOverlay.windowLayoutParams);
                    break;
                case 1:
                    break;
                case 2:
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    if (rTMPStreamPipOverlay.isScrolling) {
                        rTMPStreamPipOverlay.isScrolling = false;
                    }
                    rTMPStreamPipOverlay.isScrollDisallowed = true;
                    rTMPStreamPipOverlay.windowLayoutParams.width = (int) (rTMPStreamPipOverlay.getSuggestedWidth() * rTMPStreamPipOverlay.maxScaleFactor);
                    rTMPStreamPipOverlay.windowLayoutParams.height = (int) (rTMPStreamPipOverlay.getSuggestedHeight() * rTMPStreamPipOverlay.maxScaleFactor);
                    AndroidUtilities.updateViewLayout(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, rTMPStreamPipOverlay.windowLayoutParams);
                    break;
                default:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    if (liveStoryPipOverlay.isScrolling) {
                        liveStoryPipOverlay.isScrolling = false;
                    }
                    liveStoryPipOverlay.isScrollDisallowed = true;
                    liveStoryPipOverlay.windowLayoutParams.width = (int) (liveStoryPipOverlay.getSuggestedWidth$1() * liveStoryPipOverlay.maxScaleFactor);
                    liveStoryPipOverlay.windowLayoutParams.height = (int) (liveStoryPipOverlay.getSuggestedHeight$1() * liveStoryPipOverlay.maxScaleFactor);
                    AndroidUtilities.updateViewLayout(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, liveStoryPipOverlay.windowLayoutParams);
                    break;
            }
            return true;
        }

        @Override
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            switch (this.$r8$classId) {
                case 0:
                    PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) this.this$0;
                    if (pipVideoOverlay.pipXSpring.mRunning || pipVideoOverlay.pipYSpring.mRunning) {
                        final ArrayList arrayList = new ArrayList();
                        final int i = 0;
                        DynamicAnimation.OnAnimationEndListener onAnimationEndListener = new DynamicAnimation.OnAnimationEndListener() {
                            @Override
                            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                                switch (i) {
                                    case 0:
                                        ArrayList arrayList2 = dynamicAnimation.mEndListeners;
                                        int iIndexOf = arrayList2.indexOf(this);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                        }
                                        ArrayList arrayList3 = arrayList;
                                        arrayList3.add((SpringAnimation) dynamicAnimation);
                                        if (arrayList3.size() == 2) {
                                            ((AnonymousClass3) this).updateLayout();
                                        }
                                        break;
                                    case 1:
                                        ArrayList arrayList4 = dynamicAnimation.mEndListeners;
                                        int iIndexOf2 = arrayList4.indexOf(this);
                                        if (iIndexOf2 >= 0) {
                                            arrayList4.set(iIndexOf2, null);
                                        }
                                        ArrayList arrayList5 = arrayList;
                                        arrayList5.add((SpringAnimation) dynamicAnimation);
                                        if (arrayList5.size() == 2) {
                                            ((AnonymousClass3) this).updateLayout();
                                        }
                                        break;
                                    default:
                                        ArrayList arrayList6 = dynamicAnimation.mEndListeners;
                                        int iIndexOf3 = arrayList6.indexOf(this);
                                        if (iIndexOf3 >= 0) {
                                            arrayList6.set(iIndexOf3, null);
                                        }
                                        ArrayList arrayList7 = arrayList;
                                        arrayList7.add((SpringAnimation) dynamicAnimation);
                                        if (arrayList7.size() == 2) {
                                            ((AnonymousClass3) this).updateLayout();
                                        }
                                        break;
                                }
                            }
                        };
                        SpringAnimation springAnimation = pipVideoOverlay.pipXSpring;
                        if (springAnimation.mRunning) {
                            springAnimation.addEndListener(onAnimationEndListener);
                        } else {
                            arrayList.add(springAnimation);
                        }
                        SpringAnimation springAnimation2 = pipVideoOverlay.pipYSpring;
                        if (!springAnimation2.mRunning) {
                            arrayList.add(springAnimation2);
                        } else {
                            springAnimation2.addEndListener(onAnimationEndListener);
                        }
                    } else {
                        updateLayout();
                    }
                    break;
                case 1:
                    break;
                case 2:
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    if (rTMPStreamPipOverlay.pipXSpring.mRunning || rTMPStreamPipOverlay.pipYSpring.mRunning) {
                        final ArrayList arrayList2 = new ArrayList();
                        final int i2 = 1;
                        DynamicAnimation.OnAnimationEndListener onAnimationEndListener2 = new DynamicAnimation.OnAnimationEndListener() {
                            @Override
                            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                                switch (i2) {
                                    case 0:
                                        ArrayList arrayList3 = dynamicAnimation.mEndListeners;
                                        int iIndexOf = arrayList3.indexOf(this);
                                        if (iIndexOf >= 0) {
                                            arrayList3.set(iIndexOf, null);
                                        }
                                        ArrayList arrayList4 = arrayList2;
                                        arrayList4.add((SpringAnimation) dynamicAnimation);
                                        if (arrayList4.size() == 2) {
                                            ((AnonymousClass3) this).updateLayout();
                                        }
                                        break;
                                    case 1:
                                        ArrayList arrayList5 = dynamicAnimation.mEndListeners;
                                        int iIndexOf2 = arrayList5.indexOf(this);
                                        if (iIndexOf2 >= 0) {
                                            arrayList5.set(iIndexOf2, null);
                                        }
                                        ArrayList arrayList6 = arrayList2;
                                        arrayList6.add((SpringAnimation) dynamicAnimation);
                                        if (arrayList6.size() == 2) {
                                            ((AnonymousClass3) this).updateLayout();
                                        }
                                        break;
                                    default:
                                        ArrayList arrayList7 = dynamicAnimation.mEndListeners;
                                        int iIndexOf3 = arrayList7.indexOf(this);
                                        if (iIndexOf3 >= 0) {
                                            arrayList7.set(iIndexOf3, null);
                                        }
                                        ArrayList arrayList8 = arrayList2;
                                        arrayList8.add((SpringAnimation) dynamicAnimation);
                                        if (arrayList8.size() == 2) {
                                            ((AnonymousClass3) this).updateLayout();
                                        }
                                        break;
                                }
                            }
                        };
                        SpringAnimation springAnimation3 = rTMPStreamPipOverlay.pipXSpring;
                        if (springAnimation3.mRunning) {
                            springAnimation3.addEndListener(onAnimationEndListener2);
                        } else {
                            arrayList2.add(springAnimation3);
                        }
                        SpringAnimation springAnimation4 = rTMPStreamPipOverlay.pipYSpring;
                        if (!springAnimation4.mRunning) {
                            arrayList2.add(springAnimation4);
                        } else {
                            springAnimation4.addEndListener(onAnimationEndListener2);
                        }
                    } else {
                        updateLayout();
                    }
                    break;
                default:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    if (liveStoryPipOverlay.pipXSpring.mRunning || liveStoryPipOverlay.pipYSpring.mRunning) {
                        final ArrayList arrayList3 = new ArrayList();
                        final int i3 = 2;
                        DynamicAnimation.OnAnimationEndListener onAnimationEndListener3 = new DynamicAnimation.OnAnimationEndListener() {
                            @Override
                            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                                switch (i3) {
                                    case 0:
                                        ArrayList arrayList4 = dynamicAnimation.mEndListeners;
                                        int iIndexOf = arrayList4.indexOf(this);
                                        if (iIndexOf >= 0) {
                                            arrayList4.set(iIndexOf, null);
                                        }
                                        ArrayList arrayList5 = arrayList3;
                                        arrayList5.add((SpringAnimation) dynamicAnimation);
                                        if (arrayList5.size() == 2) {
                                            ((AnonymousClass3) this).updateLayout();
                                        }
                                        break;
                                    case 1:
                                        ArrayList arrayList6 = dynamicAnimation.mEndListeners;
                                        int iIndexOf2 = arrayList6.indexOf(this);
                                        if (iIndexOf2 >= 0) {
                                            arrayList6.set(iIndexOf2, null);
                                        }
                                        ArrayList arrayList7 = arrayList3;
                                        arrayList7.add((SpringAnimation) dynamicAnimation);
                                        if (arrayList7.size() == 2) {
                                            ((AnonymousClass3) this).updateLayout();
                                        }
                                        break;
                                    default:
                                        ArrayList arrayList8 = dynamicAnimation.mEndListeners;
                                        int iIndexOf3 = arrayList8.indexOf(this);
                                        if (iIndexOf3 >= 0) {
                                            arrayList8.set(iIndexOf3, null);
                                        }
                                        ArrayList arrayList9 = arrayList3;
                                        arrayList9.add((SpringAnimation) dynamicAnimation);
                                        if (arrayList9.size() == 2) {
                                            ((AnonymousClass3) this).updateLayout();
                                        }
                                        break;
                                }
                            }
                        };
                        SpringAnimation springAnimation5 = liveStoryPipOverlay.pipXSpring;
                        if (springAnimation5.mRunning) {
                            springAnimation5.addEndListener(onAnimationEndListener3);
                        } else {
                            arrayList3.add(springAnimation5);
                        }
                        SpringAnimation springAnimation6 = liveStoryPipOverlay.pipYSpring;
                        if (!springAnimation6.mRunning) {
                            arrayList3.add(springAnimation6);
                        } else {
                            springAnimation6.addEndListener(onAnimationEndListener3);
                        }
                    } else {
                        updateLayout();
                    }
                    break;
            }
        }

        public void updateLayout() {
            switch (this.$r8$classId) {
                case 0:
                    PipVideoOverlay pipVideoOverlay = (PipVideoOverlay) this.this$0;
                    WindowManager.LayoutParams layoutParams = pipVideoOverlay.windowLayoutParams;
                    int suggestedWidth = (int) (PipVideoOverlay.getSuggestedWidth(pipVideoOverlay.getRatio$2()) * pipVideoOverlay.scaleFactor);
                    layoutParams.width = suggestedWidth;
                    pipVideoOverlay.pipWidth = suggestedWidth;
                    WindowManager.LayoutParams layoutParams2 = pipVideoOverlay.windowLayoutParams;
                    int suggestedHeight$2 = (int) (pipVideoOverlay.getSuggestedHeight$2() * pipVideoOverlay.scaleFactor);
                    layoutParams2.height = suggestedHeight$2;
                    pipVideoOverlay.pipHeight = suggestedHeight$2;
                    try {
                        AndroidUtilities.updateViewLayout(pipVideoOverlay.windowManager, pipVideoOverlay.contentView, pipVideoOverlay.windowLayoutParams);
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                    break;
                case 1:
                default:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    WindowManager.LayoutParams layoutParams3 = liveStoryPipOverlay.windowLayoutParams;
                    int suggestedWidth$1 = (int) (liveStoryPipOverlay.getSuggestedWidth$1() * liveStoryPipOverlay.scaleFactor);
                    layoutParams3.width = suggestedWidth$1;
                    liveStoryPipOverlay.pipWidth = suggestedWidth$1;
                    WindowManager.LayoutParams layoutParams4 = liveStoryPipOverlay.windowLayoutParams;
                    int suggestedHeight$1 = (int) (liveStoryPipOverlay.getSuggestedHeight$1() * liveStoryPipOverlay.scaleFactor);
                    layoutParams4.height = suggestedHeight$1;
                    liveStoryPipOverlay.pipHeight = suggestedHeight$1;
                    AndroidUtilities.updateViewLayout(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, liveStoryPipOverlay.windowLayoutParams);
                    break;
                case 2:
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    WindowManager.LayoutParams layoutParams5 = rTMPStreamPipOverlay.windowLayoutParams;
                    int suggestedWidth2 = (int) (rTMPStreamPipOverlay.getSuggestedWidth() * rTMPStreamPipOverlay.scaleFactor);
                    layoutParams5.width = suggestedWidth2;
                    rTMPStreamPipOverlay.pipWidth = suggestedWidth2;
                    WindowManager.LayoutParams layoutParams6 = rTMPStreamPipOverlay.windowLayoutParams;
                    int suggestedHeight = (int) (rTMPStreamPipOverlay.getSuggestedHeight() * rTMPStreamPipOverlay.scaleFactor);
                    layoutParams6.height = suggestedHeight;
                    rTMPStreamPipOverlay.pipHeight = suggestedHeight;
                    AndroidUtilities.updateViewLayout(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, rTMPStreamPipOverlay.windowLayoutParams);
                    break;
            }
        }

        private final void onScaleEnd$org$telegram$ui$Components$Crop$CropGestureDetector$1(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}
