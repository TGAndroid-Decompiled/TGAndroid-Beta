package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.GestureDetectorFixDoubleTap;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Components.VideoForwardDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

public class PipVideoOverlay implements IPipSourceDelegate {
    private static final FloatPropertyCompat PIP_X_PROPERTY = new SimpleFloatPropertyCompat("pipX", new SimpleFloatPropertyCompat.Getter() {
        @Override
        public final float get(Object obj) {
            return ((PipVideoOverlay) obj).pipX;
        }
    }, new SimpleFloatPropertyCompat.Setter() {
        @Override
        public final void set(Object obj, float f) {
            PipVideoOverlay.lambda$static$1((PipVideoOverlay) obj, f);
        }
    });
    private static final FloatPropertyCompat PIP_Y_PROPERTY = new SimpleFloatPropertyCompat("pipY", new SimpleFloatPropertyCompat.Getter() {
        @Override
        public final float get(Object obj) {
            return ((PipVideoOverlay) obj).pipY;
        }
    }, new SimpleFloatPropertyCompat.Setter() {
        @Override
        public final void set(Object obj, float f) {
            PipVideoOverlay.lambda$static$3((PipVideoOverlay) obj, f);
        }
    });
    private static PipVideoOverlay instance = new PipVideoOverlay();
    private Float aspectRatio;
    private float bufferProgress;
    private boolean canLongClick;
    private View consumingChild;
    private FrameLayout contentFrameLayout;
    private ViewGroup contentView;
    private ValueAnimator controlsAnimator;
    private FrameLayout controlsView;
    private GestureDetectorFixDoubleTap gestureDetector;
    private View innerView;
    private boolean isDismissing;
    private boolean isScrollDisallowed;
    private boolean isScrolling;
    private boolean isShowingControls;
    private boolean isVideoCompleted;
    private boolean isVisible;
    private boolean isWebView;
    private int mVideoHeight;
    private int mVideoWidth;
    private boolean onSideToDismiss;
    private EmbedBottomSheet parentSheet;
    private PhotoViewer photoViewer;
    private PhotoViewerWebView photoViewerWebView;
    private PipConfig pipConfig;
    private int pipHeight;
    private PipSource pipSource;
    public TextureView pipTextureView;
    private int pipWidth;
    private float pipX;
    private SpringAnimation pipXSpring;
    private float pipY;
    private SpringAnimation pipYSpring;
    private View placeholderView;
    private ImageView playPauseButton;
    private boolean postedDismissControls;
    private ScaleGestureDetector scaleGestureDetector;
    private SeekSpeedDrawable seekSpeedDrawable;
    private float videoProgress;
    private VideoProgressView videoProgressView;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowManager windowManager;
    private boolean windowViewSkipRender;
    private float minScaleFactor = 0.75f;
    private float maxScaleFactor = 1.4f;
    private float scaleFactor = 1.0f;
    private VideoForwardDrawable videoForwardDrawable = new VideoForwardDrawable(false);
    private Runnable progressRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$4();
        }
    };
    private float[] longClickStartPoint = new float[2];
    private Runnable longClickCallback = new Runnable() {
        @Override
        public final void run() {
            this.f$0.onLongClick();
        }
    };
    private Runnable dismissControlsCallback = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$5();
        }
    };

    @Override
    public void pipRenderBackground(Canvas canvas) {
        IPipSourceDelegate.CC.$default$pipRenderBackground(this, canvas);
    }

    @Override
    public void pipRenderForeground(Canvas canvas) {
        IPipSourceDelegate.CC.$default$pipRenderForeground(this, canvas);
    }

    public static void lambda$static$1(PipVideoOverlay pipVideoOverlay, float f) {
        WindowManager.LayoutParams layoutParams = pipVideoOverlay.windowLayoutParams;
        pipVideoOverlay.pipX = f;
        layoutParams.x = (int) f;
        try {
            AndroidUtilities.updateViewLayout(pipVideoOverlay.windowManager, pipVideoOverlay.contentView, layoutParams);
        } catch (IllegalArgumentException unused) {
            pipVideoOverlay.pipXSpring.cancel();
        }
    }

    public static void lambda$static$3(PipVideoOverlay pipVideoOverlay, float f) {
        WindowManager.LayoutParams layoutParams = pipVideoOverlay.windowLayoutParams;
        pipVideoOverlay.pipY = f;
        layoutParams.y = (int) f;
        try {
            AndroidUtilities.updateViewLayout(pipVideoOverlay.windowManager, pipVideoOverlay.contentView, layoutParams);
        } catch (IllegalArgumentException unused) {
            pipVideoOverlay.pipYSpring.cancel();
        }
    }

    public void lambda$new$4() {
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null) {
            return;
        }
        if (this.photoViewerWebView != null) {
            this.videoProgress = r1.getCurrentPosition() / this.photoViewerWebView.getVideoDuration();
            this.bufferProgress = this.photoViewerWebView.getBufferedPosition();
        } else {
            if (photoViewer.getVideoPlayer() == null) {
                return;
            }
            float duration = getDuration();
            this.videoProgress = r0.getCurrentPosition() / duration;
            this.bufferProgress = r0.getBufferedPosition() / duration;
        }
        this.videoProgressView.invalidate();
        AndroidUtilities.runOnUIThread(this.progressRunnable, 500L);
    }

    public void lambda$new$5() {
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer != null && photoViewer.getVideoPlayerRewinder().rewinding) {
            AndroidUtilities.runOnUIThread(this.dismissControlsCallback, 1500L);
            return;
        }
        this.isShowingControls = false;
        toggleControls(false);
        this.postedDismissControls = false;
    }

    public static void onRewindCanceled() {
        instance.onRewindCanceledInternal();
    }

    private void onRewindCanceledInternal() {
        this.videoForwardDrawable.setShowing(false);
    }

    public static void onUpdateRewindProgressUi(long j, float f, boolean z) {
        instance.onUpdateRewindProgressUiInternal(j, f, z);
    }

    public void onUpdateRewindProgressUiInternal(long j, float f, boolean z) {
        this.videoForwardDrawable.setTime(0L);
        if (z) {
            this.videoProgress = f;
            VideoProgressView videoProgressView = this.videoProgressView;
            if (videoProgressView != null) {
                videoProgressView.invalidate();
            }
            FrameLayout frameLayout = this.controlsView;
            if (frameLayout != null) {
                frameLayout.invalidate();
            }
        }
    }

    public static void onRewindStart(boolean z) {
        instance.onRewindStartInternal(z);
    }

    private void onRewindStartInternal(boolean z) {
        this.videoForwardDrawable.setOneShootAnimation(false);
        this.videoForwardDrawable.setLeftSide(!z);
        this.videoForwardDrawable.setShowing(true);
        VideoProgressView videoProgressView = this.videoProgressView;
        if (videoProgressView != null) {
            videoProgressView.invalidate();
        }
        FrameLayout frameLayout = this.controlsView;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    public long getCurrentPosition() {
        if (this.photoViewerWebView != null) {
            return r0.getCurrentPosition();
        }
        VideoPlayer videoPlayer = this.photoViewer.getVideoPlayer();
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getCurrentPosition();
    }

    public void seekTo(long j) {
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            photoViewerWebView.seekTo(j);
            return;
        }
        VideoPlayer videoPlayer = this.photoViewer.getVideoPlayer();
        if (videoPlayer == null) {
            return;
        }
        videoPlayer.seekTo(j);
    }

    public long getDuration() {
        if (this.photoViewerWebView != null) {
            return r0.getVideoDuration();
        }
        VideoPlayer videoPlayer = this.photoViewer.getVideoPlayer();
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getDuration();
    }

    protected void onLongClick() {
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer != null) {
            if ((photoViewer.getVideoPlayer() == null && this.photoViewerWebView == null) || this.isDismissing || this.isVideoCompleted || this.isScrolling || this.scaleGestureDetector.isInProgress() || !this.canLongClick) {
                return;
            }
            VideoPlayer videoPlayer = this.photoViewer.getVideoPlayer();
            boolean z = this.longClickStartPoint[0] >= (((float) getSuggestedWidth()) * this.scaleFactor) * 0.5f;
            long currentPosition = getCurrentPosition();
            long duration = getDuration();
            if (currentPosition == -9223372036854775807L || duration < 15000) {
                return;
            }
            if (this.photoViewerWebView != null) {
                this.photoViewer.getVideoPlayerRewinder().startRewind(this.photoViewerWebView, z, this.longClickStartPoint[0], this.photoViewer.getCurrentVideoSpeed(), this.seekSpeedDrawable);
            } else {
                this.photoViewer.getVideoPlayerRewinder().startRewind(videoPlayer, z, this.longClickStartPoint[0], this.photoViewer.getCurrentVideoSpeed(), this.seekSpeedDrawable);
            }
            if (this.isShowingControls) {
                return;
            }
            this.isShowingControls = true;
            toggleControls(true);
            if (this.postedDismissControls) {
                return;
            }
            AndroidUtilities.runOnUIThread(this.dismissControlsCallback, 1500L);
            this.postedDismissControls = true;
        }
    }

    public PipConfig getPipConfig() {
        if (this.pipConfig == null) {
            Point point = AndroidUtilities.displaySize;
            this.pipConfig = new PipConfig(point.x, point.y);
        }
        return this.pipConfig;
    }

    public static boolean isVisible() {
        return instance.isVisible;
    }

    public int getSuggestedWidth() {
        return getSuggestedWidth(getRatio());
    }

    private static int getSuggestedWidth(float f) {
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

    public int getSuggestedHeight() {
        return getSuggestedHeight(getRatio());
    }

    private static int getSuggestedHeight(float f) {
        return (int) (getSuggestedWidth(f) * f);
    }

    private float getRatio() {
        if (this.aspectRatio == null) {
            this.aspectRatio = Float.valueOf(this.mVideoHeight / this.mVideoWidth);
            Point point = AndroidUtilities.displaySize;
            this.maxScaleFactor = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / getSuggestedWidth();
            this.videoForwardDrawable.setPlayScaleFactor(this.aspectRatio.floatValue() < 1.0f ? 0.6f : 0.45f);
        }
        return this.aspectRatio.floatValue();
    }

    public void toggleControls(boolean z) {
        ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(200L);
        this.controlsAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.controlsAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$toggleControls$6(valueAnimator);
            }
        });
        this.controlsAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PipVideoOverlay.this.controlsAnimator = null;
            }
        });
        this.controlsAnimator.start();
    }

    public void lambda$toggleControls$6(ValueAnimator valueAnimator) {
        this.controlsView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void dismissAndDestroy() {
        PipVideoOverlay pipVideoOverlay = instance;
        EmbedBottomSheet embedBottomSheet = pipVideoOverlay.parentSheet;
        if (embedBottomSheet != null) {
            embedBottomSheet.destroy();
        } else {
            PhotoViewer photoViewer = pipVideoOverlay.photoViewer;
            if (photoViewer != null) {
                photoViewer.destroyPhotoViewer();
                MediaController.getInstance().tryResumePausedAudio();
            }
        }
        dismiss();
    }

    public static void dismiss() {
        dismiss(false);
    }

    public static void dismiss(boolean z) {
        instance.dismissInternal(z, false);
    }

    public static void dismiss(boolean z, boolean z2) {
        instance.dismissInternal(z, z2);
    }

    private void dismissInternal(boolean z, boolean z2) {
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.onDismissedInternal();
                    }
                }, 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PipVideoOverlay.this.onDismissedInternal();
            }
        });
        animatorSet.start();
    }

    public void onDismissedInternal() {
        try {
            ViewGroup viewGroup = this.contentView;
            if (viewGroup != null && viewGroup.getParent() != null) {
                this.windowManager.removeViewImmediate(this.contentView);
            }
        } catch (Exception unused) {
        }
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            photoViewerWebView.showControls();
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

    public static View getInnerView() {
        return instance.innerView;
    }

    public void cancelRewind() {
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null || photoViewer.getVideoPlayerRewinder() == null) {
            return;
        }
        this.photoViewer.getVideoPlayerRewinder().cancelRewind();
    }

    public static void updatePlayButton() {
        instance.updatePlayButtonInternal();
    }

    private void updatePlayButtonInternal() {
        boolean zIsPlaying;
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null || this.playPauseButton == null) {
            return;
        }
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            zIsPlaying = photoViewerWebView.isPlaying();
        } else {
            VideoPlayer videoPlayer = photoViewer.getVideoPlayer();
            if (videoPlayer == null) {
                return;
            } else {
                zIsPlaying = videoPlayer.isPlaying();
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.progressRunnable);
        if (!zIsPlaying) {
            if (this.isVideoCompleted) {
                this.playPauseButton.setImageResource(R.drawable.pip_replay_large);
                return;
            } else {
                this.playPauseButton.setImageResource(R.drawable.pip_play_large);
                return;
            }
        }
        this.playPauseButton.setImageResource(R.drawable.pip_pause_large);
        AndroidUtilities.runOnUIThread(this.progressRunnable, 500L);
    }

    public static void onVideoCompleted() {
        instance.onVideoCompletedInternal();
    }

    private void onVideoCompletedInternal() {
        VideoProgressView videoProgressView;
        if (!this.isVisible || (videoProgressView = this.videoProgressView) == null) {
            return;
        }
        this.isVideoCompleted = true;
        this.videoProgress = 0.0f;
        this.bufferProgress = 0.0f;
        videoProgressView.invalidate();
        updatePlayButtonInternal();
        AndroidUtilities.cancelRunOnUIThread(this.progressRunnable);
        if (this.isShowingControls) {
            return;
        }
        toggleControls(true);
        AndroidUtilities.cancelRunOnUIThread(this.dismissControlsCallback);
    }

    public static void setBufferedProgress(float f) {
        PipVideoOverlay pipVideoOverlay = instance;
        pipVideoOverlay.bufferProgress = f;
        VideoProgressView videoProgressView = pipVideoOverlay.videoProgressView;
        if (videoProgressView != null) {
            videoProgressView.invalidate();
        }
    }

    public static void setParentSheet(EmbedBottomSheet embedBottomSheet) {
        instance.parentSheet = embedBottomSheet;
    }

    public static void setPhotoViewer(PhotoViewer photoViewer) {
        instance.photoViewer = photoViewer;
        VideoPlayer videoPlayer = photoViewer.getVideoPlayer();
        PipSource pipSource = instance.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            instance.pipSource = null;
        }
        if (videoPlayer != null && PipUtils.checkPermissions(photoViewer.getParentActivity()) == 1) {
            PipVideoOverlay pipVideoOverlay = instance;
            PipSource.Builder placeholderView = new PipSource.Builder(photoViewer.getParentActivity(), instance).setTagPrefix("photo-viewer-pip-" + videoPlayer.playerId).setPriority(1).setCornerRadius(AndroidUtilities.dp(10.0f)).setContentView(instance.contentView).setPlaceholderView(instance.placeholderView);
            PipVideoOverlay pipVideoOverlay2 = instance;
            pipVideoOverlay.pipSource = placeholderView.setContentRatio(pipVideoOverlay2.mVideoWidth, pipVideoOverlay2.mVideoHeight).setPlayer(videoPlayer.player).setNeedMediaSession(true).build();
        }
        instance.updatePlayButtonInternal();
    }

    public static RectOld getPipRect(boolean z, float f) {
        RectOld rectOld = new RectOld();
        float f2 = 1.0f / f;
        PipVideoOverlay pipVideoOverlay = instance;
        if (pipVideoOverlay.isVisible && !z) {
            rectOld.x = pipVideoOverlay.pipX;
            rectOld.y = pipVideoOverlay.pipY + AndroidUtilities.statusBarHeight;
            PipVideoOverlay pipVideoOverlay2 = instance;
            rectOld.width = pipVideoOverlay2.pipWidth;
            rectOld.height = pipVideoOverlay2.pipHeight;
            return rectOld;
        }
        float pipX = pipVideoOverlay.getPipConfig().getPipX();
        float pipY = instance.getPipConfig().getPipY();
        float scaleFactor = instance.getPipConfig().getScaleFactor();
        rectOld.width = getSuggestedWidth(f2) * scaleFactor;
        rectOld.height = getSuggestedHeight(f2) * scaleFactor;
        if (pipX != -1.0f) {
            float f3 = rectOld.width;
            float f4 = pipX + (f3 / 2.0f);
            float f5 = AndroidUtilities.displaySize.x;
            rectOld.x = f4 >= f5 / 2.0f ? (f5 - f3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            rectOld.x = (AndroidUtilities.displaySize.x - rectOld.width) - AndroidUtilities.dp(16.0f);
        }
        if (pipY != -1.0f) {
            rectOld.y = MathUtils.clamp(pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - rectOld.height) + AndroidUtilities.statusBarHeight;
        } else {
            rectOld.y = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        }
        return rectOld;
    }

    public static boolean show(boolean z, Activity activity, View view, int i, int i2) {
        return show(z, activity, view, i, i2, false);
    }

    public static boolean show(boolean z, Activity activity, View view, int i, int i2, boolean z2) {
        return show(z, activity, null, view, i, i2, z2);
    }

    public static boolean show(boolean z, Activity activity, PhotoViewerWebView photoViewerWebView, View view, int i, int i2, boolean z2) {
        return instance.showInternal(z, activity, view, photoViewerWebView, i, i2, z2);
    }

    private boolean showInternal(boolean z, Activity activity, View view, PhotoViewerWebView photoViewerWebView, int i, int i2, boolean z2) {
        PhotoViewerWebView photoViewerWebView2;
        final boolean z3 = z || PipUtils.checkPermissions(ApplicationLoader.applicationContext) == 1;
        if (this.isVisible) {
            return false;
        }
        this.isVisible = true;
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
        this.aspectRatio = null;
        if (photoViewerWebView != null && photoViewerWebView.isControllable()) {
            this.photoViewerWebView = photoViewerWebView;
            photoViewerWebView.hideControls();
        } else {
            this.photoViewerWebView = null;
        }
        float pipX = getPipConfig().getPipX();
        float pipY = getPipConfig().getPipY();
        this.scaleFactor = getPipConfig().getScaleFactor();
        this.pipWidth = (int) (getSuggestedWidth() * this.scaleFactor);
        this.pipHeight = (int) (getSuggestedHeight() * this.scaleFactor);
        this.isShowingControls = false;
        this.pipXSpring = (SpringAnimation) new SpringAnimation(this, PIP_X_PROPERTY).setSpring(new SpringForce().setDampingRatio(0.75f).setStiffness(650.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z4, float f, float f2) {
                this.f$0.lambda$showInternal$7(dynamicAnimation, z4, f, f2);
            }
        });
        this.pipYSpring = (SpringAnimation) new SpringAnimation(this, PIP_Y_PROPERTY).setSpring(new SpringForce().setDampingRatio(0.75f).setStiffness(650.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z4, float f, float f2) {
                this.f$0.lambda$showInternal$8(dynamicAnimation, z4, f, f2);
            }
        });
        Context context = z3 ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new AnonymousClass3());
        this.scaleGestureDetector = scaleGestureDetector;
        int i3 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i3 >= 23) {
            this.scaleGestureDetector.setStylusScaleEnabled(false);
        }
        this.gestureDetector = new GestureDetectorFixDoubleTap(context, new AnonymousClass4(scaledTouchSlop));
        this.contentFrameLayout = new FrameLayout(context) {
            private Path path = new Path();

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        PipVideoOverlay.this.canLongClick = true;
                        PipVideoOverlay.this.longClickStartPoint = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(PipVideoOverlay.this.longClickCallback, 500L);
                    } else {
                        PipVideoOverlay.this.canLongClick = false;
                        PipVideoOverlay.this.cancelRewind();
                        AndroidUtilities.cancelRunOnUIThread(PipVideoOverlay.this.longClickCallback);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    PipVideoOverlay.this.canLongClick = false;
                    PipVideoOverlay.this.cancelRewind();
                    AndroidUtilities.cancelRunOnUIThread(PipVideoOverlay.this.longClickCallback);
                } else if (actionMasked == 2 && PipVideoOverlay.this.photoViewer != null && PipVideoOverlay.this.photoViewer.getVideoPlayerRewinder() != null && PipVideoOverlay.this.photoViewer.getVideoPlayerRewinder().rewinding) {
                    PipVideoOverlay.this.photoViewer.getVideoPlayerRewinder().setX(motionEvent.getX());
                }
                if (PipVideoOverlay.this.consumingChild != null) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(PipVideoOverlay.this.consumingChild.getX(), PipVideoOverlay.this.consumingChild.getY());
                    boolean zDispatchTouchEvent = PipVideoOverlay.this.consumingChild.dispatchTouchEvent(motionEvent);
                    motionEventObtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        PipVideoOverlay.this.consumingChild = null;
                    }
                    if (zDispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                motionEventObtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean zOnTouchEvent = PipVideoOverlay.this.scaleGestureDetector.onTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
                boolean z4 = !PipVideoOverlay.this.scaleGestureDetector.isInProgress() && PipVideoOverlay.this.gestureDetector.onTouchEvent(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    PipVideoOverlay.this.isScrolling = false;
                    PipVideoOverlay.this.isScrollDisallowed = false;
                    if (PipVideoOverlay.this.onSideToDismiss) {
                        PipVideoOverlay.this.onSideToDismiss = false;
                        PipVideoOverlay.dismissAndDestroy();
                    } else {
                        if (!PipVideoOverlay.this.pipXSpring.isRunning()) {
                            ((SpringAnimation) PipVideoOverlay.this.pipXSpring.setStartValue(PipVideoOverlay.this.pipX)).getSpring().setFinalPosition(PipVideoOverlay.this.pipX + (PipVideoOverlay.this.pipWidth / 2.0f) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r5 - PipVideoOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
                            PipVideoOverlay.this.pipXSpring.start();
                        }
                        if (!PipVideoOverlay.this.pipYSpring.isRunning()) {
                            ((SpringAnimation) PipVideoOverlay.this.pipYSpring.setStartValue(PipVideoOverlay.this.pipY)).getSpring().setFinalPosition(MathUtils.clamp(PipVideoOverlay.this.pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - PipVideoOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f)));
                            PipVideoOverlay.this.pipYSpring.start();
                        }
                    }
                }
                return zOnTouchEvent || z4;
            }

            @Override
            protected void onConfigurationChanged(Configuration configuration) {
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                PipVideoOverlay.this.pipConfig = null;
                AndroidUtilities.setPreferredMaxRefreshRate(PipVideoOverlay.this.windowManager, PipVideoOverlay.this.contentView, PipVideoOverlay.this.windowLayoutParams);
                if (PipVideoOverlay.this.pipWidth == PipVideoOverlay.this.getSuggestedWidth() * PipVideoOverlay.this.scaleFactor && PipVideoOverlay.this.pipHeight == PipVideoOverlay.this.getSuggestedHeight() * PipVideoOverlay.this.scaleFactor) {
                    return;
                }
                PipVideoOverlay.this.windowLayoutParams.width = PipVideoOverlay.this.pipWidth = (int) (r0.getSuggestedWidth() * PipVideoOverlay.this.scaleFactor);
                PipVideoOverlay.this.windowLayoutParams.height = PipVideoOverlay.this.pipHeight = (int) (r0.getSuggestedHeight() * PipVideoOverlay.this.scaleFactor);
                AndroidUtilities.updateViewLayout(PipVideoOverlay.this.windowManager, PipVideoOverlay.this.contentView, PipVideoOverlay.this.windowLayoutParams);
                SpringForce spring = ((SpringAnimation) PipVideoOverlay.this.pipXSpring.setStartValue(PipVideoOverlay.this.pipX)).getSpring();
                float suggestedWidth = PipVideoOverlay.this.pipX + ((PipVideoOverlay.this.getSuggestedWidth() * PipVideoOverlay.this.scaleFactor) / 2.0f);
                float f = AndroidUtilities.displaySize.x;
                spring.setFinalPosition(suggestedWidth >= f / 2.0f ? (f - (PipVideoOverlay.this.getSuggestedWidth() * PipVideoOverlay.this.scaleFactor)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
                PipVideoOverlay.this.pipXSpring.start();
                ((SpringAnimation) PipVideoOverlay.this.pipYSpring.setStartValue(PipVideoOverlay.this.pipY)).getSpring().setFinalPosition(MathUtils.clamp(PipVideoOverlay.this.pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (PipVideoOverlay.this.getSuggestedHeight() * PipVideoOverlay.this.scaleFactor)) - AndroidUtilities.dp(16.0f)));
                PipVideoOverlay.this.pipYSpring.start();
            }

            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
            }

            @Override
            protected void onSizeChanged(int i4, int i5, int i6, int i7) {
                super.onSizeChanged(i4, i5, i6, i7);
                this.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i4, i5);
                this.path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
            }
        };
        PipVideoViewGroup pipVideoViewGroup = new PipVideoViewGroup(context) {
            @Override
            protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
                PipVideoOverlay.this.contentFrameLayout.layout(0, 0, PipVideoOverlay.this.pipWidth, PipVideoOverlay.this.pipHeight);
            }

            @Override
            protected void onMeasure(int i4, int i5) {
                setMeasuredDimension(View.MeasureSpec.getSize(i4), View.MeasureSpec.getSize(i5));
                PipVideoOverlay.this.contentFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(PipVideoOverlay.this.pipWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(PipVideoOverlay.this.pipHeight, 1073741824));
            }

            @Override
            public void draw(Canvas canvas) {
                if (PipVideoOverlay.this.windowViewSkipRender) {
                    return;
                }
                canvas.save();
                canvas.scale(PipVideoOverlay.this.pipWidth / PipVideoOverlay.this.contentFrameLayout.getWidth(), PipVideoOverlay.this.pipHeight / PipVideoOverlay.this.contentFrameLayout.getHeight());
                super.draw(canvas);
                canvas.restore();
            }
        };
        this.contentView = pipVideoViewGroup;
        pipVideoViewGroup.addView(this.contentFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
        this.contentFrameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
            }
        });
        this.contentFrameLayout.setClipToOutline(true);
        this.contentFrameLayout.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_actionBar));
        this.innerView = view;
        if (view.getParent() != null) {
            ((ViewGroup) this.innerView.getParent()).removeView(this.innerView);
        }
        this.contentFrameLayout.addView(this.innerView, LayoutHelper.createFrame(-1, -1.0f));
        View view2 = new View(context);
        this.placeholderView = view2;
        this.contentFrameLayout.addView(view2, LayoutHelper.createFrame(-1, -1.0f));
        this.videoForwardDrawable.setDelegate(new VideoForwardDrawable.VideoForwardDrawableDelegate() {
            @Override
            public void onAnimationEnd() {
            }

            @Override
            public void invalidate() {
                PipVideoOverlay.this.controlsView.invalidate();
            }
        });
        this.controlsView = new FrameLayout(context) {
            @Override
            protected void onDraw(Canvas canvas) {
                if (PipVideoOverlay.this.videoForwardDrawable.isAnimating()) {
                    PipVideoOverlay.this.videoForwardDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    PipVideoOverlay.this.videoForwardDrawable.draw(canvas);
                }
                if (PipVideoOverlay.this.photoViewer == null || PipVideoOverlay.this.photoViewer.framesRewinder == null) {
                    return;
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                PipVideoOverlay.this.photoViewer.framesRewinder.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (PipVideoOverlay.this.seekSpeedDrawable == null || !PipVideoOverlay.this.seekSpeedDrawable.isShown()) {
                    return;
                }
                PipVideoOverlay.this.seekSpeedDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                PipVideoOverlay.this.seekSpeedDrawable.draw(canvas);
            }
        };
        final FrameLayout frameLayout = this.controlsView;
        Objects.requireNonNull(frameLayout);
        this.seekSpeedDrawable = new SeekSpeedDrawable(new Runnable() {
            @Override
            public final void run() {
                frameLayout.invalidate();
            }
        }, true, false);
        this.controlsView.setWillNotDraw(false);
        this.controlsView.setAlpha(0.0f);
        View view3 = new View(context);
        view3.setBackgroundColor(1275068416);
        this.controlsView.addView(view3, LayoutHelper.createFrame(-1, -1.0f));
        int iDp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i4 = Theme.key_voipgroup_actionBarItems;
        int color = Theme.getColor(i4);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(color, mode);
        int i5 = Theme.key_listSelector;
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(i5)));
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                PipVideoOverlay.dismissAndDestroy();
            }
        });
        float f = 38;
        float f2 = 4;
        this.controlsView.addView(imageView, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, f2, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(Theme.getColor(i4), mode);
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i5)));
        imageView2.setPadding(iDp, iDp, iDp, iDp);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) throws NumberFormatException {
                this.f$0.lambda$showInternal$10(z3, view4);
            }
        });
        this.controlsView.addView(imageView2, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, 48, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.playPauseButton = imageView3;
        imageView3.setColorFilter(Theme.getColor(i4), mode);
        this.playPauseButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(i5)));
        this.playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$showInternal$11(view4);
            }
        });
        View view4 = this.innerView;
        boolean z4 = (view4 instanceof WebView) || (view4 instanceof PhotoViewerWebView);
        this.isWebView = z4;
        this.playPauseButton.setVisibility((!z4 || ((photoViewerWebView2 = this.photoViewerWebView) != null && photoViewerWebView2.isControllable())) ? 0 : 8);
        this.controlsView.addView(this.playPauseButton, LayoutHelper.createFrame(38, 38, 17));
        VideoProgressView videoProgressView = new VideoProgressView(context);
        this.videoProgressView = videoProgressView;
        this.controlsView.addView(videoProgressView, LayoutHelper.createFrame(-1, -1.0f));
        this.contentFrameLayout.addView(this.controlsView, LayoutHelper.createFrame(-1, -1.0f));
        this.windowManager = (WindowManager) (z3 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = PipUtils.createWindowLayoutParams(context, z3);
        this.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
        int i6 = this.pipWidth;
        layoutParamsCreateWindowLayoutParams.width = i6;
        layoutParamsCreateWindowLayoutParams.height = this.pipHeight;
        if (pipX != -1.0f) {
            float fDp = pipX + (i6 / 2.0f) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r6 - i6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
            this.pipX = fDp;
            layoutParamsCreateWindowLayoutParams.x = (int) fDp;
        } else {
            float fDp2 = (AndroidUtilities.displaySize.x - i6) - AndroidUtilities.dp(16.0f);
            this.pipX = fDp2;
            layoutParamsCreateWindowLayoutParams.x = (int) fDp2;
        }
        if (pipY != -1.0f) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            float fClamp = MathUtils.clamp(pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - this.pipHeight);
            this.pipY = fClamp;
            layoutParams.y = (int) fClamp;
        } else {
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            float fDp3 = AndroidUtilities.dp(16.0f);
            this.pipY = fDp3;
            layoutParams2.y = (int) fDp3;
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.SCALE_Y, 1.0f));
        animatorSet.start();
        return true;
    }

    public void lambda$showInternal$7(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        getPipConfig().setPipX(f);
    }

    public void lambda$showInternal$8(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        getPipConfig().setPipY(f);
    }

    class AnonymousClass3 implements ScaleGestureDetector.OnScaleGestureListener {
        AnonymousClass3() {
        }

        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            pipVideoOverlay.scaleFactor = MathUtils.clamp(pipVideoOverlay.scaleFactor * scaleGestureDetector.getScaleFactor(), PipVideoOverlay.this.minScaleFactor, PipVideoOverlay.this.maxScaleFactor);
            PipVideoOverlay.this.pipWidth = (int) (r0.getSuggestedWidth() * PipVideoOverlay.this.scaleFactor);
            PipVideoOverlay.this.pipHeight = (int) (r0.getSuggestedHeight() * PipVideoOverlay.this.scaleFactor);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onScale$0();
                }
            });
            float fDp = scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - PipVideoOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
            if (PipVideoOverlay.this.pipXSpring.isRunning()) {
                PipVideoOverlay.this.pipXSpring.getSpring().setFinalPosition(fDp);
            } else {
                ((SpringAnimation) PipVideoOverlay.this.pipXSpring.setStartValue(PipVideoOverlay.this.pipX)).getSpring().setFinalPosition(fDp);
            }
            PipVideoOverlay.this.pipXSpring.start();
            float fClamp = MathUtils.clamp(scaleGestureDetector.getFocusY() - (PipVideoOverlay.this.pipHeight / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - PipVideoOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f));
            if (PipVideoOverlay.this.pipYSpring.isRunning()) {
                PipVideoOverlay.this.pipYSpring.getSpring().setFinalPosition(fClamp);
            } else {
                ((SpringAnimation) PipVideoOverlay.this.pipYSpring.setStartValue(PipVideoOverlay.this.pipY)).getSpring().setFinalPosition(fClamp);
            }
            PipVideoOverlay.this.pipYSpring.start();
            return true;
        }

        public void lambda$onScale$0() {
            PipVideoOverlay.this.contentView.invalidate();
            PipVideoOverlay.this.contentFrameLayout.requestLayout();
        }

        @Override
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            if (PipVideoOverlay.this.isScrolling) {
                PipVideoOverlay.this.isScrolling = false;
                PipVideoOverlay.this.canLongClick = false;
                PipVideoOverlay.this.cancelRewind();
                AndroidUtilities.cancelRunOnUIThread(PipVideoOverlay.this.longClickCallback);
            }
            PipVideoOverlay.this.isScrollDisallowed = true;
            PipVideoOverlay.this.windowLayoutParams.width = (int) (PipVideoOverlay.this.getSuggestedWidth() * PipVideoOverlay.this.maxScaleFactor);
            PipVideoOverlay.this.windowLayoutParams.height = (int) (PipVideoOverlay.this.getSuggestedHeight() * PipVideoOverlay.this.maxScaleFactor);
            AndroidUtilities.updateViewLayout(PipVideoOverlay.this.windowManager, PipVideoOverlay.this.contentView, PipVideoOverlay.this.windowLayoutParams);
            return true;
        }

        @Override
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (PipVideoOverlay.this.pipXSpring.isRunning() || PipVideoOverlay.this.pipYSpring.isRunning()) {
                final ArrayList arrayList = new ArrayList();
                DynamicAnimation.OnAnimationEndListener onAnimationEndListener = new DynamicAnimation.OnAnimationEndListener() {
                    @Override
                    public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                        dynamicAnimation.removeEndListener(this);
                        arrayList.add((SpringAnimation) dynamicAnimation);
                        if (arrayList.size() == 2) {
                            AnonymousClass3.this.updateLayout();
                        }
                    }
                };
                if (!PipVideoOverlay.this.pipXSpring.isRunning()) {
                    arrayList.add(PipVideoOverlay.this.pipXSpring);
                } else {
                    PipVideoOverlay.this.pipXSpring.addEndListener(onAnimationEndListener);
                }
                if (!PipVideoOverlay.this.pipYSpring.isRunning()) {
                    arrayList.add(PipVideoOverlay.this.pipYSpring);
                    return;
                } else {
                    PipVideoOverlay.this.pipYSpring.addEndListener(onAnimationEndListener);
                    return;
                }
            }
            updateLayout();
        }

        public void updateLayout() {
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            WindowManager.LayoutParams layoutParams = pipVideoOverlay.windowLayoutParams;
            int suggestedWidth = (int) (PipVideoOverlay.this.getSuggestedWidth() * PipVideoOverlay.this.scaleFactor);
            layoutParams.width = suggestedWidth;
            pipVideoOverlay.pipWidth = suggestedWidth;
            PipVideoOverlay pipVideoOverlay2 = PipVideoOverlay.this;
            WindowManager.LayoutParams layoutParams2 = pipVideoOverlay2.windowLayoutParams;
            int suggestedHeight = (int) (PipVideoOverlay.this.getSuggestedHeight() * PipVideoOverlay.this.scaleFactor);
            layoutParams2.height = suggestedHeight;
            pipVideoOverlay2.pipHeight = suggestedHeight;
            try {
                AndroidUtilities.updateViewLayout(PipVideoOverlay.this.windowManager, PipVideoOverlay.this.contentView, PipVideoOverlay.this.windowLayoutParams);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    class AnonymousClass4 extends GestureDetectorFixDoubleTap.OnGestureListener {
        private float startPipX;
        private float startPipY;
        final int val$touchSlop;

        AnonymousClass4(int i) {
            this.val$touchSlop = i;
        }

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            if (PipVideoOverlay.this.isShowingControls) {
                for (int i = 1; i < PipVideoOverlay.this.contentFrameLayout.getChildCount(); i++) {
                    View childAt = PipVideoOverlay.this.contentFrameLayout.getChildAt(i);
                    if (childAt.dispatchTouchEvent(motionEvent)) {
                        PipVideoOverlay.this.consumingChild = childAt;
                        return true;
                    }
                }
            }
            this.startPipX = PipVideoOverlay.this.pipX;
            this.startPipY = PipVideoOverlay.this.pipY;
            return true;
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PipVideoOverlay.this.controlsAnimator != null) {
                return true;
            }
            if (PipVideoOverlay.this.postedDismissControls) {
                AndroidUtilities.cancelRunOnUIThread(PipVideoOverlay.this.dismissControlsCallback);
                PipVideoOverlay.this.postedDismissControls = false;
            }
            PipVideoOverlay.this.isShowingControls = !r4.isShowingControls;
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            pipVideoOverlay.toggleControls(pipVideoOverlay.isShowingControls);
            if (PipVideoOverlay.this.isShowingControls && !PipVideoOverlay.this.postedDismissControls) {
                AndroidUtilities.runOnUIThread(PipVideoOverlay.this.dismissControlsCallback, 2500L);
                PipVideoOverlay.this.postedDismissControls = true;
            }
            return true;
        }

        @Override
        public boolean onDoubleTap(android.view.MotionEvent r14) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.PipVideoOverlay.AnonymousClass4.onDoubleTap(android.view.MotionEvent):boolean");
        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (!hasDoubleTap(motionEvent)) {
                return onSingleTapConfirmed(motionEvent);
            }
            return super.onSingleTapUp(motionEvent);
        }

        @Override
        public boolean hasDoubleTap(MotionEvent motionEvent) {
            if (PipVideoOverlay.this.photoViewer == null) {
                return false;
            }
            if ((PipVideoOverlay.this.photoViewer.getVideoPlayer() == null && PipVideoOverlay.this.photoViewerWebView == null) || PipVideoOverlay.this.isDismissing || PipVideoOverlay.this.isVideoCompleted || PipVideoOverlay.this.isScrolling || PipVideoOverlay.this.scaleGestureDetector.isInProgress() || !PipVideoOverlay.this.canLongClick) {
                return false;
            }
            return PipVideoOverlay.this.getCurrentPosition() != -9223372036854775807L && PipVideoOverlay.this.getDuration() >= 15000;
        }

        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!PipVideoOverlay.this.isScrolling || PipVideoOverlay.this.isScrollDisallowed) {
                return false;
            }
            ((SpringAnimation) ((SpringAnimation) PipVideoOverlay.this.pipXSpring.setStartVelocity(f)).setStartValue(PipVideoOverlay.this.pipX)).getSpring().setFinalPosition((PipVideoOverlay.this.pipX + (PipVideoOverlay.this.pipWidth / 2.0f)) + (f / 7.0f) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - PipVideoOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
            PipVideoOverlay.this.pipXSpring.start();
            ((SpringAnimation) ((SpringAnimation) PipVideoOverlay.this.pipYSpring.setStartVelocity(f)).setStartValue(PipVideoOverlay.this.pipY)).getSpring().setFinalPosition(MathUtils.clamp(PipVideoOverlay.this.pipY + (f2 / 10.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - PipVideoOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f)));
            PipVideoOverlay.this.pipYSpring.start();
            return true;
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            int iDp;
            if (!PipVideoOverlay.this.isScrolling && PipVideoOverlay.this.controlsAnimator == null && !PipVideoOverlay.this.isScrollDisallowed && (Math.abs(f) >= this.val$touchSlop || Math.abs(f2) >= this.val$touchSlop)) {
                PipVideoOverlay.this.isScrolling = true;
                PipVideoOverlay.this.pipXSpring.cancel();
                PipVideoOverlay.this.pipYSpring.cancel();
                PipVideoOverlay.this.canLongClick = false;
                PipVideoOverlay.this.cancelRewind();
                AndroidUtilities.cancelRunOnUIThread(PipVideoOverlay.this.longClickCallback);
            }
            if (PipVideoOverlay.this.isScrolling) {
                float f3 = PipVideoOverlay.this.pipX;
                final float rawX = (this.startPipX + motionEvent2.getRawX()) - motionEvent.getRawX();
                PipVideoOverlay.this.pipY = (this.startPipY + motionEvent2.getRawY()) - motionEvent.getRawY();
                if (rawX <= (-PipVideoOverlay.this.pipWidth) * 0.25f || rawX >= AndroidUtilities.displaySize.x - (PipVideoOverlay.this.pipWidth * 0.75f)) {
                    if (!PipVideoOverlay.this.onSideToDismiss) {
                        SpringForce spring = ((SpringAnimation) PipVideoOverlay.this.pipXSpring.setStartValue(f3)).getSpring();
                        float f4 = rawX + (PipVideoOverlay.this.pipWidth / 2.0f);
                        int iDp2 = AndroidUtilities.displaySize.x;
                        if (f4 >= iDp2 / 2.0f) {
                            iDp = AndroidUtilities.dp(16.0f);
                        } else {
                            iDp2 = AndroidUtilities.dp(16.0f);
                            iDp = PipVideoOverlay.this.pipWidth;
                        }
                        spring.setFinalPosition(iDp2 - iDp);
                        PipVideoOverlay.this.pipXSpring.start();
                    }
                    PipVideoOverlay.this.onSideToDismiss = true;
                } else if (PipVideoOverlay.this.onSideToDismiss) {
                    if (PipVideoOverlay.this.onSideToDismiss) {
                        PipVideoOverlay.this.pipXSpring.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                            @Override
                            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f5, float f6) {
                                this.f$0.lambda$onScroll$0(rawX, dynamicAnimation, z, f5, f6);
                            }
                        });
                        ((SpringAnimation) PipVideoOverlay.this.pipXSpring.setStartValue(f3)).getSpring().setFinalPosition(rawX);
                        PipVideoOverlay.this.pipXSpring.start();
                    }
                    PipVideoOverlay.this.onSideToDismiss = false;
                } else {
                    if (PipVideoOverlay.this.pipXSpring.isRunning()) {
                        PipVideoOverlay.this.pipXSpring.getSpring().setFinalPosition(rawX);
                    } else {
                        PipVideoOverlay.this.windowLayoutParams.x = (int) PipVideoOverlay.this.pipX = rawX;
                        PipVideoOverlay.this.getPipConfig().setPipX(rawX);
                    }
                    PipVideoOverlay.this.windowLayoutParams.y = (int) PipVideoOverlay.this.pipY;
                    PipVideoOverlay.this.getPipConfig().setPipY(PipVideoOverlay.this.pipY);
                    AndroidUtilities.updateViewLayout(PipVideoOverlay.this.windowManager, PipVideoOverlay.this.contentView, PipVideoOverlay.this.windowLayoutParams);
                }
            }
            return true;
        }

        public void lambda$onScroll$0(float f, DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
            if (z) {
                return;
            }
            PipVideoOverlay.this.pipXSpring.getSpring().setFinalPosition(f + (PipVideoOverlay.this.pipWidth / 2.0f) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - PipVideoOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
        }
    }

    public void lambda$showInternal$10(boolean z, View view) throws NumberFormatException {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
        boolean z2 = true;
        if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
            z2 = false;
        }
        if (!z && (!z2 || !LaunchActivity.isResumed)) {
            Objects.requireNonNull(view);
            LaunchActivity.onResumeStaticCallback = new EmbedBottomSheet$$ExternalSyntheticLambda6(view);
            Context context = ApplicationLoader.applicationContext;
            Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return;
        }
        EmbedBottomSheet embedBottomSheet = this.parentSheet;
        if (embedBottomSheet != null) {
            embedBottomSheet.exitFromPip();
            return;
        }
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer != null) {
            photoViewer.exitFromPip();
        }
    }

    public void lambda$showInternal$11(View view) {
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null) {
            return;
        }
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            if (photoViewerWebView.isPlaying()) {
                this.photoViewerWebView.pauseVideo();
            } else {
                this.photoViewerWebView.playVideo();
            }
        } else {
            VideoPlayer videoPlayer = photoViewer.getVideoPlayer();
            if (videoPlayer == null) {
                return;
            }
            if (videoPlayer.isPlaying()) {
                videoPlayer.pause();
            } else {
                videoPlayer.play();
            }
        }
        updatePlayButton();
    }

    private final class VideoProgressView extends View {
        private Paint bufferPaint;
        private Paint progressPaint;

        public VideoProgressView(Context context) {
            super(context);
            this.progressPaint = new Paint();
            this.bufferPaint = new Paint();
            this.progressPaint.setColor(-1);
            Paint paint = this.progressPaint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = this.progressPaint;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint2.setStrokeCap(cap);
            this.progressPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            this.bufferPaint.setColor(this.progressPaint.getColor());
            this.bufferPaint.setAlpha((int) (this.progressPaint.getAlpha() * 0.3f));
            this.bufferPaint.setStyle(style);
            this.bufferPaint.setStrokeCap(cap);
            this.bufferPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (!PipVideoOverlay.this.isWebView || (PipVideoOverlay.this.photoViewerWebView != null && PipVideoOverlay.this.photoViewerWebView.isControllable())) {
                int width = getWidth();
                int iDp = AndroidUtilities.dp(10.0f);
                float f = (width - iDp) - iDp;
                int i = ((int) (PipVideoOverlay.this.videoProgress * f)) + iDp;
                float height = getHeight() - AndroidUtilities.dp(8.0f);
                if (PipVideoOverlay.this.bufferProgress != 0.0f) {
                    float f2 = iDp;
                    canvas.drawLine(f2, height, f2 + (f * PipVideoOverlay.this.bufferProgress), height, this.bufferPaint);
                }
                canvas.drawLine(iDp, height, i, height, this.progressPaint);
            }
        }
    }

    private static final class PipConfig {
        private SharedPreferences mPrefs;

        private PipConfig(int i, int i2) {
            this.mPrefs = ApplicationLoader.applicationContext.getSharedPreferences("pip_layout_" + i + "_" + i2, 0);
        }

        public void setPipX(float f) {
            this.mPrefs.edit().putFloat("x", f).apply();
        }

        public void setPipY(float f) {
            this.mPrefs.edit().putFloat("y", f).apply();
        }

        public float getScaleFactor() {
            return this.mPrefs.getFloat("scale_factor", 1.0f);
        }

        public float getPipX() {
            return this.mPrefs.getFloat("x", -1.0f);
        }

        public float getPipY() {
            return this.mPrefs.getFloat("y", -1.0f);
        }
    }

    public static class PipVideoViewGroup extends ViewGroup {
        public PipVideoViewGroup(Context context) {
            super(context);
        }
    }

    public static TextureView getPipTextureView() {
        PipVideoOverlay pipVideoOverlay = instance;
        if (pipVideoOverlay != null) {
            return pipVideoOverlay.pipTextureView;
        }
        return null;
    }

    @Override
    public boolean pipIsAvailable() {
        PhotoViewer photoViewer = this.photoViewer;
        return photoViewer != null && photoViewer.pipIsAvailable();
    }

    @Override
    public Bitmap pipCreatePrimaryWindowViewBitmap() {
        TextureView textureView;
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null || (textureView = photoViewer.changedTextureView) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.photoViewer.changedTextureView.getBitmap();
    }

    @Override
    public View pipCreatePictureInPictureView() {
        TextureView textureView = new TextureView(this.contentView.getContext());
        this.pipTextureView = textureView;
        textureView.setVisibility(4);
        this.pipTextureView.setOpaque(false);
        this.pipTextureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                PipVideoOverlay.this.photoViewer.changedTextureView.setSurfaceTexture(surfaceTexture);
                return false;
            }
        });
        return this.pipTextureView;
    }

    @Override
    public void pipHidePrimaryWindowView(Runnable runnable) {
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer != null && photoViewer.getVideoPlayer() != null) {
            this.photoViewer.pipFirstFrameCallback = runnable;
        }
        this.windowManager.removeView(this.contentView);
        this.windowViewSkipRender = true;
        this.contentView.invalidate();
    }

    public static PipSource getPipSource() {
        PipVideoOverlay pipVideoOverlay = instance;
        if (pipVideoOverlay != null) {
            return pipVideoOverlay.pipSource;
        }
        return null;
    }

    @Override
    public Bitmap pipCreatePictureInPictureViewBitmap() {
        TextureView textureView = this.pipTextureView;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.pipTextureView.getBitmap();
    }

    @Override
    public void pipShowPrimaryWindowView(Runnable runnable) {
        PipSource pipSource = this.pipSource;
        if (pipSource != null && pipSource.params.isValid()) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            int width = this.pipSource.params.getWidth();
            this.pipWidth = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            int height = this.pipSource.params.getHeight();
            this.pipHeight = height;
            layoutParams2.height = height;
        }
        this.windowManager.addView(this.contentView, this.windowLayoutParams);
        this.windowViewSkipRender = false;
        this.contentView.invalidate();
        PhotoViewer photoViewer = this.photoViewer;
        if ((photoViewer != null ? photoViewer.getVideoPlayer() : null) == null) {
            return;
        }
        this.photoViewer.pipFirstFrameCallback = runnable;
    }
}
