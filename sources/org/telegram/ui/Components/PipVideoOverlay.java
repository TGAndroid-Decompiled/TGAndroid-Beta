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
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
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
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.iv.RichEditor;

public class PipVideoOverlay implements IPipSourceDelegate {
    public static final boolean IS_TRANSITION_ANIMATION_SUPPORTED = true;
    public static final float ROUNDED_CORNERS_DP = 10.0f;
    private static final float SIDE_PADDING_DP = 16.0f;
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
    private static final FloatPropertyCompat PIP_X_PROPERTY = new SimpleFloatPropertyCompat("pipX", new EmojiView$$ExternalSyntheticLambda30(26), new EmojiView$$ExternalSyntheticLambda30(27));
    private static final FloatPropertyCompat PIP_Y_PROPERTY = new SimpleFloatPropertyCompat("pipY", new EmojiView$$ExternalSyntheticLambda30(24), new EmojiView$$ExternalSyntheticLambda30(25));
    private static PipVideoOverlay instance = new PipVideoOverlay();
    private float minScaleFactor = 0.75f;
    private float maxScaleFactor = 1.4f;
    private float scaleFactor = 1.0f;
    private final VideoForwardDrawable videoForwardDrawable = new VideoForwardDrawable(false);
    private final Runnable progressRunnable = new PipVideoOverlay$$ExternalSyntheticLambda12(this, 1);
    private float[] longClickStartPoint = new float[2];
    private final Runnable longClickCallback = new PipVideoOverlay$$ExternalSyntheticLambda12(this, 2);
    private final Runnable dismissControlsCallback = new PipVideoOverlay$$ExternalSyntheticLambda12(this, 3);

    public class AnonymousClass3 implements ScaleGestureDetector.OnScaleGestureListener {
        public AnonymousClass3() {
        }

        public void lambda$onScale$0() {
            PipVideoOverlay.this.contentView.invalidate();
            PipVideoOverlay.this.contentFrameLayout.requestLayout();
        }

        public void updateLayout() {
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            WindowManager.LayoutParams layoutParams = pipVideoOverlay.windowLayoutParams;
            int suggestedWidth = (int) (PipVideoOverlay.this.scaleFactor * PipVideoOverlay.this.getSuggestedWidth());
            layoutParams.width = suggestedWidth;
            pipVideoOverlay.pipWidth = suggestedWidth;
            PipVideoOverlay pipVideoOverlay2 = PipVideoOverlay.this;
            WindowManager.LayoutParams layoutParams2 = pipVideoOverlay2.windowLayoutParams;
            int suggestedHeight = (int) (PipVideoOverlay.this.scaleFactor * PipVideoOverlay.this.getSuggestedHeight());
            layoutParams2.height = suggestedHeight;
            pipVideoOverlay2.pipHeight = suggestedHeight;
            try {
                AndroidUtilities.updateViewLayout(PipVideoOverlay.this.windowManager, PipVideoOverlay.this.contentView, PipVideoOverlay.this.windowLayoutParams);
            } catch (IllegalArgumentException unused) {
            }
        }

        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            pipVideoOverlay.scaleFactor = MathUtils.clamp(scaleGestureDetector.getScaleFactor() * pipVideoOverlay.scaleFactor, PipVideoOverlay.this.minScaleFactor, PipVideoOverlay.this.maxScaleFactor);
            PipVideoOverlay pipVideoOverlay2 = PipVideoOverlay.this;
            pipVideoOverlay2.pipWidth = (int) (PipVideoOverlay.this.scaleFactor * pipVideoOverlay2.getSuggestedWidth());
            PipVideoOverlay pipVideoOverlay3 = PipVideoOverlay.this;
            pipVideoOverlay3.pipHeight = (int) (PipVideoOverlay.this.scaleFactor * pipVideoOverlay3.getSuggestedHeight());
            AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 26));
            float focusX = scaleGestureDetector.getFocusX();
            int i = AndroidUtilities.displaySize.x;
            float fDp = focusX >= ((float) i) / 2.0f ? (i - PipVideoOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
            if (PipVideoOverlay.this.pipXSpring.mRunning) {
                PipVideoOverlay.this.pipXSpring.mSpring.mFinalPosition = fDp;
            } else {
                SpringAnimation springAnimation = PipVideoOverlay.this.pipXSpring;
                springAnimation.mValue = PipVideoOverlay.this.pipX;
                springAnimation.mStartValueIsSet = true;
                springAnimation.mSpring.mFinalPosition = fDp;
            }
            PipVideoOverlay.this.pipXSpring.start();
            float fClamp = MathUtils.clamp(scaleGestureDetector.getFocusY() - (PipVideoOverlay.this.pipHeight / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - PipVideoOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f));
            if (PipVideoOverlay.this.pipYSpring.mRunning) {
                PipVideoOverlay.this.pipYSpring.mSpring.mFinalPosition = fClamp;
            } else {
                SpringAnimation springAnimation2 = PipVideoOverlay.this.pipYSpring;
                springAnimation2.mValue = PipVideoOverlay.this.pipY;
                springAnimation2.mStartValueIsSet = true;
                springAnimation2.mSpring.mFinalPosition = fClamp;
            }
            PipVideoOverlay.this.pipYSpring.start();
            return true;
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
            PipVideoOverlay.this.windowLayoutParams.width = (int) (PipVideoOverlay.this.maxScaleFactor * PipVideoOverlay.this.getSuggestedWidth());
            PipVideoOverlay.this.windowLayoutParams.height = (int) (PipVideoOverlay.this.maxScaleFactor * PipVideoOverlay.this.getSuggestedHeight());
            AndroidUtilities.updateViewLayout(PipVideoOverlay.this.windowManager, PipVideoOverlay.this.contentView, PipVideoOverlay.this.windowLayoutParams);
            return true;
        }

        @Override
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (!PipVideoOverlay.this.pipXSpring.mRunning && !PipVideoOverlay.this.pipYSpring.mRunning) {
                updateLayout();
                return;
            }
            final ArrayList arrayList = new ArrayList();
            DynamicAnimation.OnAnimationEndListener onAnimationEndListener = new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    ArrayList arrayList2 = dynamicAnimation.mEndListeners;
                    int iIndexOf = arrayList2.indexOf(this);
                    if (iIndexOf >= 0) {
                        arrayList2.set(iIndexOf, null);
                    }
                    arrayList.add((SpringAnimation) dynamicAnimation);
                    if (arrayList.size() == 2) {
                        AnonymousClass3.this.updateLayout();
                    }
                }
            };
            if (PipVideoOverlay.this.pipXSpring.mRunning) {
                PipVideoOverlay.this.pipXSpring.addEndListener(onAnimationEndListener);
            } else {
                arrayList.add(PipVideoOverlay.this.pipXSpring);
            }
            if (PipVideoOverlay.this.pipYSpring.mRunning) {
                PipVideoOverlay.this.pipYSpring.addEndListener(onAnimationEndListener);
            } else {
                arrayList.add(PipVideoOverlay.this.pipYSpring);
            }
        }
    }

    public class AnonymousClass4 extends GestureDetectorFixDoubleTap.OnGestureListener {
        private float startPipX;
        private float startPipY;
        final int val$touchSlop;

        public AnonymousClass4(int i) {
            this.val$touchSlop = i;
        }

        public void lambda$onScroll$0(float f, DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
            if (z) {
                return;
            }
            SpringForce springForce = PipVideoOverlay.this.pipXSpring.mSpring;
            float f4 = (PipVideoOverlay.this.pipWidth / 2.0f) + f;
            int i = AndroidUtilities.displaySize.x;
            springForce.mFinalPosition = f4 >= ((float) i) / 2.0f ? (i - PipVideoOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        }

        @Override
        public boolean hasDoubleTap(MotionEvent motionEvent) {
            if (PipVideoOverlay.this.photoViewer != null && ((PipVideoOverlay.this.photoViewer.getVideoPlayer() != null || PipVideoOverlay.this.photoViewerWebView != null) && !PipVideoOverlay.this.isDismissing && !PipVideoOverlay.this.isVideoCompleted && !PipVideoOverlay.this.isScrolling && !PipVideoOverlay.this.scaleGestureDetector.isInProgress() && PipVideoOverlay.this.canLongClick)) {
                long currentPosition = PipVideoOverlay.this.getCurrentPosition();
                long duration = PipVideoOverlay.this.getDuration();
                if (currentPosition != -9223372036854775807L && duration >= 15000) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean z;
            if (PipVideoOverlay.this.photoViewer != null && ((PipVideoOverlay.this.photoViewer.getVideoPlayer() != null || PipVideoOverlay.this.photoViewerWebView != null) && !PipVideoOverlay.this.isDismissing && !PipVideoOverlay.this.isVideoCompleted && !PipVideoOverlay.this.isScrolling && !PipVideoOverlay.this.scaleGestureDetector.isInProgress() && PipVideoOverlay.this.canLongClick)) {
                PipVideoOverlay.this.photoViewer.getVideoPlayer();
                boolean z2 = motionEvent.getX() >= (PipVideoOverlay.this.scaleFactor * ((float) PipVideoOverlay.this.getSuggestedWidth())) * 0.5f;
                long currentPosition = PipVideoOverlay.this.getCurrentPosition();
                long duration = PipVideoOverlay.this.getDuration();
                if (currentPosition != -9223372036854775807L && duration >= 15000) {
                    long j = z2 ? currentPosition + 10000 : currentPosition - 10000;
                    if (currentPosition != j) {
                        if (j <= duration) {
                            if (j < 0) {
                                z = j >= -9000;
                                j = 0;
                            }
                            if (z) {
                                PipVideoOverlay.this.videoForwardDrawable.setOneShootAnimation(true);
                                PipVideoOverlay.this.videoForwardDrawable.setLeftSide(!z2);
                                PipVideoOverlay.this.videoForwardDrawable.addTime(10000L);
                                PipVideoOverlay.this.seekTo(j);
                                PipVideoOverlay.this.onUpdateRewindProgressUiInternal(z2 ? 10000L : -10000L, j / duration, true);
                                if (!PipVideoOverlay.this.isShowingControls) {
                                    PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
                                    pipVideoOverlay.toggleControls(pipVideoOverlay.isShowingControls = true);
                                    if (!PipVideoOverlay.this.postedDismissControls) {
                                        PipVideoOverlay.this.postedDismissControls = true;
                                        AndroidUtilities.runOnUIThread(PipVideoOverlay.this.dismissControlsCallback, 2500L);
                                    }
                                }
                            }
                            return true;
                        }
                        j = duration;
                        z = true;
                        if (z) {
                            PipVideoOverlay.this.videoForwardDrawable.setOneShootAnimation(true);
                            PipVideoOverlay.this.videoForwardDrawable.setLeftSide(!z2);
                            PipVideoOverlay.this.videoForwardDrawable.addTime(10000L);
                            PipVideoOverlay.this.seekTo(j);
                            PipVideoOverlay.this.onUpdateRewindProgressUiInternal(z2 ? 10000L : -10000L, j / duration, true);
                            if (!PipVideoOverlay.this.isShowingControls) {
                                PipVideoOverlay pipVideoOverlay2 = PipVideoOverlay.this;
                                pipVideoOverlay2.toggleControls(pipVideoOverlay2.isShowingControls = true);
                                if (!PipVideoOverlay.this.postedDismissControls) {
                                    PipVideoOverlay.this.postedDismissControls = true;
                                    AndroidUtilities.runOnUIThread(PipVideoOverlay.this.dismissControlsCallback, 2500L);
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
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!PipVideoOverlay.this.isScrolling || PipVideoOverlay.this.isScrollDisallowed) {
                return false;
            }
            SpringAnimation springAnimation = PipVideoOverlay.this.pipXSpring;
            springAnimation.mVelocity = f;
            springAnimation.mValue = PipVideoOverlay.this.pipX;
            springAnimation.mStartValueIsSet = true;
            SpringForce springForce = springAnimation.mSpring;
            float f3 = (f / 7.0f) + (PipVideoOverlay.this.pipWidth / 2.0f) + PipVideoOverlay.this.pipX;
            int i = AndroidUtilities.displaySize.x;
            springForce.mFinalPosition = f3 >= ((float) i) / 2.0f ? (i - PipVideoOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
            PipVideoOverlay.this.pipXSpring.start();
            SpringAnimation springAnimation2 = PipVideoOverlay.this.pipYSpring;
            springAnimation2.mVelocity = f;
            springAnimation2.mValue = PipVideoOverlay.this.pipY;
            springAnimation2.mStartValueIsSet = true;
            springAnimation2.mSpring.mFinalPosition = MathUtils.clamp((f2 / 10.0f) + PipVideoOverlay.this.pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - PipVideoOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f));
            PipVideoOverlay.this.pipYSpring.start();
            return true;
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
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
                final float rawX = (motionEvent2.getRawX() + this.startPipX) - motionEvent.getRawX();
                PipVideoOverlay.this.pipY = (motionEvent2.getRawY() + this.startPipY) - motionEvent.getRawY();
                if (rawX > (-PipVideoOverlay.this.pipWidth) * 0.25f && rawX < AndroidUtilities.displaySize.x - (PipVideoOverlay.this.pipWidth * 0.75f)) {
                    if (!PipVideoOverlay.this.onSideToDismiss) {
                        if (PipVideoOverlay.this.pipXSpring.mRunning) {
                            PipVideoOverlay.this.pipXSpring.mSpring.mFinalPosition = rawX;
                        } else {
                            PipVideoOverlay.this.windowLayoutParams.x = (int) PipVideoOverlay.this.pipX = rawX;
                            PipVideoOverlay.this.getPipConfig().setPipX(rawX);
                        }
                        PipVideoOverlay.this.windowLayoutParams.y = (int) PipVideoOverlay.this.pipY;
                        PipVideoOverlay.this.getPipConfig().setPipY(PipVideoOverlay.this.pipY);
                        AndroidUtilities.updateViewLayout(PipVideoOverlay.this.windowManager, PipVideoOverlay.this.contentView, PipVideoOverlay.this.windowLayoutParams);
                        return true;
                    }
                    if (PipVideoOverlay.this.onSideToDismiss) {
                        PipVideoOverlay.this.pipXSpring.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                            @Override
                            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f4, float f5) {
                                this.f$0.lambda$onScroll$0(rawX, dynamicAnimation, z, f4, f5);
                            }
                        });
                        SpringAnimation springAnimation = PipVideoOverlay.this.pipXSpring;
                        springAnimation.mValue = f3;
                        springAnimation.mStartValueIsSet = true;
                        springAnimation.mSpring.mFinalPosition = rawX;
                        PipVideoOverlay.this.pipXSpring.start();
                    }
                    PipVideoOverlay.this.onSideToDismiss = false;
                    return true;
                }
                if (!PipVideoOverlay.this.onSideToDismiss) {
                    SpringAnimation springAnimation2 = PipVideoOverlay.this.pipXSpring;
                    springAnimation2.mValue = f3;
                    springAnimation2.mStartValueIsSet = true;
                    SpringForce springForce = springAnimation2.mSpring;
                    float f4 = (PipVideoOverlay.this.pipWidth / 2.0f) + rawX;
                    int i = AndroidUtilities.displaySize.x;
                    springForce.mFinalPosition = f4 >= ((float) i) / 2.0f ? i - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - PipVideoOverlay.this.pipWidth;
                    PipVideoOverlay.this.pipXSpring.start();
                }
                PipVideoOverlay.this.onSideToDismiss = true;
            }
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
            PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
            pipVideoOverlay.isShowingControls = !pipVideoOverlay.isShowingControls;
            PipVideoOverlay pipVideoOverlay2 = PipVideoOverlay.this;
            pipVideoOverlay2.toggleControls(pipVideoOverlay2.isShowingControls);
            if (PipVideoOverlay.this.isShowingControls && !PipVideoOverlay.this.postedDismissControls) {
                AndroidUtilities.runOnUIThread(PipVideoOverlay.this.dismissControlsCallback, 2500L);
                PipVideoOverlay.this.postedDismissControls = true;
            }
            return true;
        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return !hasDoubleTap(motionEvent) ? onSingleTapConfirmed(motionEvent) : super.onSingleTapUp(motionEvent);
        }
    }

    public static final class PipConfig {
        private final SharedPreferences mPrefs;

        public float getPipX() {
            return this.mPrefs.getFloat("x", -1.0f);
        }

        public float getPipY() {
            return this.mPrefs.getFloat("y", -1.0f);
        }

        public float getScaleFactor() {
            return this.mPrefs.getFloat("scale_factor", 1.0f);
        }

        public void setPipX(float f) {
            this.mPrefs.edit().putFloat("x", f).apply();
        }

        public void setPipY(float f) {
            this.mPrefs.edit().putFloat("y", f).apply();
        }

        private void setScaleFactor(float f) {
            this.mPrefs.edit().putFloat("scale_factor", f).apply();
        }

        private PipConfig(int i, int i2) {
            this.mPrefs = ApplicationLoader.applicationContext.getSharedPreferences(Fragment$$ExternalSyntheticOutline0.m(i, i2, "pip_layout_", "_"), 0);
        }
    }

    public static class PipVideoViewGroup extends ViewGroup {
        public PipVideoViewGroup(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }
    }

    public final class VideoProgressView extends View {
        private final Paint bufferPaint;
        private final Paint progressPaint;

        public VideoProgressView(Context context) {
            super(context);
            Paint paint = new Paint();
            this.progressPaint = paint;
            Paint paint2 = new Paint();
            this.bufferPaint = paint2;
            paint.setColor(-1);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint.Cap cap = Paint.Cap.ROUND;
            paint.setStrokeCap(cap);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint2.setColor(paint.getColor());
            paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
            paint2.setStyle(style);
            paint2.setStrokeCap(cap);
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        @Override
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            super.onDraw(canvas);
            if (!PipVideoOverlay.this.isWebView || (PipVideoOverlay.this.photoViewerWebView != null && PipVideoOverlay.this.photoViewerWebView.isControllable())) {
                int width = getWidth();
                int iDp = AndroidUtilities.dp(10.0f);
                float f = (width - iDp) - iDp;
                int i = ((int) (PipVideoOverlay.this.videoProgress * f)) + iDp;
                float height = getHeight() - AndroidUtilities.dp(8.0f);
                if (PipVideoOverlay.this.bufferProgress != 0.0f) {
                    float f2 = iDp;
                    canvas2 = canvas;
                    canvas2.drawLine(f2, height, (PipVideoOverlay.this.bufferProgress * f) + f2, height, this.bufferPaint);
                } else {
                    canvas2 = canvas;
                }
                canvas2.drawLine(iDp, height, i, height, this.progressPaint);
            }
        }
    }

    public void cancelRewind() {
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null || photoViewer.getVideoPlayerRewinder() == null) {
            return;
        }
        this.photoViewer.getVideoPlayerRewinder().cancelRewind();
    }

    public static void dismiss() {
        dismiss(false);
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

    private void dismissInternal(boolean z, boolean z2) {
        int i = 0;
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
                AndroidUtilities.runOnUIThread(new PipVideoOverlay$$ExternalSyntheticLambda12(this, i), 100L);
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

    public long getCurrentPosition() {
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            return photoViewerWebView.getCurrentPosition();
        }
        VideoPlayer videoPlayer = this.photoViewer.getVideoPlayer();
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getCurrentPosition();
    }

    public long getDuration() {
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            return photoViewerWebView.getVideoDuration();
        }
        VideoPlayer videoPlayer = this.photoViewer.getVideoPlayer();
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getDuration();
    }

    public static View getInnerView() {
        return instance.innerView;
    }

    public PipConfig getPipConfig() {
        if (this.pipConfig == null) {
            Point point = AndroidUtilities.displaySize;
            this.pipConfig = new PipConfig(point.x, point.y);
        }
        return this.pipConfig;
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
            float f4 = (f3 / 2.0f) + pipX;
            float f5 = AndroidUtilities.displaySize.x;
            rectOld.x = f4 >= f5 / 2.0f ? (f5 - f3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            rectOld.x = (AndroidUtilities.displaySize.x - rectOld.width) - AndroidUtilities.dp(16.0f);
        }
        if (pipY != -1.0f) {
            rectOld.y = MathUtils.clamp(pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - rectOld.height) + AndroidUtilities.statusBarHeight;
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

    public static TextureView getPipTextureView() {
        PipVideoOverlay pipVideoOverlay = instance;
        if (pipVideoOverlay != null) {
            return pipVideoOverlay.pipTextureView;
        }
        return null;
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

    public int getSuggestedHeight() {
        return getSuggestedHeight(getRatio());
    }

    public int getSuggestedWidth() {
        return getSuggestedWidth(getRatio());
    }

    public static boolean isPipSurfaceTexture(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        PipVideoOverlay pipVideoOverlay = instance;
        return (pipVideoOverlay == null || (textureView = pipVideoOverlay.pipTextureView) == null || textureView.getSurfaceTexture() != surfaceTexture) ? false : true;
    }

    public static boolean isVisible() {
        return instance.isVisible;
    }

    public void lambda$new$4() {
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null) {
            return;
        }
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            this.videoProgress = photoViewerWebView.getCurrentPosition() / this.photoViewerWebView.getVideoDuration();
            this.bufferProgress = this.photoViewerWebView.getBufferedPosition();
        } else {
            VideoPlayer videoPlayer = photoViewer.getVideoPlayer();
            if (videoPlayer == null) {
                return;
            }
            float duration = getDuration();
            this.videoProgress = videoPlayer.getCurrentPosition() / duration;
            this.bufferProgress = videoPlayer.getBufferedPosition() / duration;
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

    public void lambda$showInternal$10(boolean z, View view) throws FileNotFoundException {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
        boolean z2 = true;
        if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
            z2 = false;
        }
        if (!z && (!z2 || !LaunchActivity.isResumed)) {
            LaunchActivity.onResumeStaticCallback = new Shaker$$ExternalSyntheticLambda0(view, 1);
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
        if (photoViewerWebView == null) {
            VideoPlayer videoPlayer = photoViewer.getVideoPlayer();
            if (videoPlayer == null) {
                return;
            }
            if (videoPlayer.isPlaying()) {
                videoPlayer.pause();
            } else {
                videoPlayer.play();
            }
        } else if (photoViewerWebView.isPlaying()) {
            this.photoViewerWebView.pauseVideo();
        } else {
            this.photoViewerWebView.playVideo();
        }
        updatePlayButton();
    }

    public void lambda$showInternal$7(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        getPipConfig().setPipX(f);
    }

    public void lambda$showInternal$8(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        getPipConfig().setPipY(f);
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

    public void lambda$toggleControls$6(ValueAnimator valueAnimator) {
        this.controlsView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
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

    public static void onRewindCanceled() {
        instance.onRewindCanceledInternal();
    }

    private void onRewindCanceledInternal() {
        this.videoForwardDrawable.setShowing(false);
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

    public static void setBufferedProgress(float f) {
        PipVideoOverlay pipVideoOverlay = instance;
        if (f > pipVideoOverlay.bufferProgress) {
            pipVideoOverlay.bufferProgress = f;
            VideoProgressView videoProgressView = pipVideoOverlay.videoProgressView;
            if (videoProgressView != null) {
                videoProgressView.invalidate();
            }
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
            PipSource.Builder builder = new PipSource.Builder(photoViewer.getParentActivity(), instance);
            builder.tagPrefix = "photo-viewer-pip-" + videoPlayer.playerId;
            builder.priority = 1;
            builder.cornerRadius = AndroidUtilities.dp(10.0f);
            PipVideoOverlay pipVideoOverlay2 = instance;
            builder.contentView = pipVideoOverlay2.contentView;
            builder.placeholderView = pipVideoOverlay2.placeholderView;
            int i = pipVideoOverlay2.mVideoWidth;
            int i2 = pipVideoOverlay2.mVideoHeight;
            builder.width = i;
            builder.height = i2;
            builder.player = videoPlayer.player;
            builder.needMediaSession = true;
            pipVideoOverlay.pipSource = builder.build();
        }
        instance.updatePlayButtonInternal();
    }

    public static boolean show(boolean z, Activity activity, View view, int i, int i2) {
        return show(z, activity, view, i, i2, false);
    }

    private boolean showInternal(boolean z, Activity activity, View view, PhotoViewerWebView photoViewerWebView, int i, int i2, boolean z2) {
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
        if (photoViewerWebView == null || !photoViewerWebView.isControllable()) {
            this.photoViewerWebView = null;
        } else {
            this.photoViewerWebView = photoViewerWebView;
            photoViewerWebView.hideControls();
        }
        float pipX = getPipConfig().getPipX();
        float pipY = getPipConfig().getPipY();
        this.scaleFactor = getPipConfig().getScaleFactor();
        this.pipWidth = (int) (getSuggestedWidth() * this.scaleFactor);
        this.pipHeight = (int) (getSuggestedHeight() * this.scaleFactor);
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
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z4, float f, float f2) {
                switch (i5) {
                    case 0:
                        this.f$0.lambda$showInternal$7(dynamicAnimation, z4, f, f2);
                        break;
                    default:
                        this.f$0.lambda$showInternal$8(dynamicAnimation, z4, f, f2);
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
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z4, float f, float f2) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$showInternal$7(dynamicAnimation, z4, f, f2);
                        break;
                    default:
                        this.f$0.lambda$showInternal$8(dynamicAnimation, z4, f, f2);
                        break;
                }
            }
        });
        this.pipYSpring = springAnimation2;
        Context context = z3 ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new AnonymousClass3());
        this.scaleGestureDetector = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (Build.VERSION.SDK_INT >= 23) {
            this.scaleGestureDetector.setStylusScaleEnabled(false);
        }
        this.gestureDetector = new GestureDetectorFixDoubleTap(context, new AnonymousClass4(scaledTouchSlop));
        this.contentFrameLayout = new FrameLayout(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                boolean zOnTouchEvent;
                boolean z4;
                float f;
                int i6;
                int iDp;
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
                    if (!zDispatchTouchEvent) {
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                        motionEventObtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                        zOnTouchEvent = PipVideoOverlay.this.scaleGestureDetector.onTouchEvent(motionEventObtain2);
                        motionEventObtain2.recycle();
                        if (PipVideoOverlay.this.scaleGestureDetector.isInProgress() && PipVideoOverlay.this.gestureDetector.onTouchEvent(motionEvent)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (actionMasked != 1 || actionMasked == 3 || actionMasked == 6) {
                            PipVideoOverlay.this.isScrolling = false;
                            PipVideoOverlay.this.isScrollDisallowed = false;
                            if (PipVideoOverlay.this.onSideToDismiss) {
                                PipVideoOverlay.this.onSideToDismiss = false;
                                PipVideoOverlay.dismissAndDestroy();
                            } else {
                                if (!PipVideoOverlay.this.pipXSpring.mRunning) {
                                    SpringAnimation springAnimation3 = PipVideoOverlay.this.pipXSpring;
                                    springAnimation3.mValue = PipVideoOverlay.this.pipX;
                                    springAnimation3.mStartValueIsSet = true;
                                    SpringForce springForce3 = springAnimation3.mSpring;
                                    f = (PipVideoOverlay.this.pipWidth / 2.0f) + PipVideoOverlay.this.pipX;
                                    i6 = AndroidUtilities.displaySize.x;
                                    if (f >= i6 / 2.0f) {
                                        iDp = (i6 - PipVideoOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f);
                                    } else {
                                        iDp = AndroidUtilities.dp(16.0f);
                                    }
                                    springForce3.mFinalPosition = iDp;
                                    PipVideoOverlay.this.pipXSpring.start();
                                }
                                if (!PipVideoOverlay.this.pipYSpring.mRunning) {
                                    SpringAnimation springAnimation4 = PipVideoOverlay.this.pipYSpring;
                                    springAnimation4.mValue = PipVideoOverlay.this.pipY;
                                    springAnimation4.mStartValueIsSet = true;
                                    springAnimation4.mSpring.mFinalPosition = MathUtils.clamp(PipVideoOverlay.this.pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - PipVideoOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f));
                                    PipVideoOverlay.this.pipYSpring.start();
                                }
                            }
                        }
                        if (zOnTouchEvent && !z4) {
                            return false;
                        }
                    }
                } else {
                    MotionEvent motionEventObtain3 = MotionEvent.obtain(motionEvent);
                    motionEventObtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                    zOnTouchEvent = PipVideoOverlay.this.scaleGestureDetector.onTouchEvent(motionEventObtain3);
                    motionEventObtain3.recycle();
                    if (PipVideoOverlay.this.scaleGestureDetector.isInProgress()) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (actionMasked != 1) {
                        PipVideoOverlay.this.isScrolling = false;
                        PipVideoOverlay.this.isScrollDisallowed = false;
                        if (PipVideoOverlay.this.onSideToDismiss) {
                            PipVideoOverlay.this.onSideToDismiss = false;
                            PipVideoOverlay.dismissAndDestroy();
                        } else {
                            if (!PipVideoOverlay.this.pipXSpring.mRunning) {
                                SpringAnimation springAnimation5 = PipVideoOverlay.this.pipXSpring;
                                springAnimation5.mValue = PipVideoOverlay.this.pipX;
                                springAnimation5.mStartValueIsSet = true;
                                SpringForce springForce4 = springAnimation5.mSpring;
                                f = (PipVideoOverlay.this.pipWidth / 2.0f) + PipVideoOverlay.this.pipX;
                                i6 = AndroidUtilities.displaySize.x;
                                if (f >= i6 / 2.0f) {
                                    iDp = (i6 - PipVideoOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f);
                                } else {
                                    iDp = AndroidUtilities.dp(16.0f);
                                }
                                springForce4.mFinalPosition = iDp;
                                PipVideoOverlay.this.pipXSpring.start();
                            }
                            if (!PipVideoOverlay.this.pipYSpring.mRunning) {
                                SpringAnimation springAnimation6 = PipVideoOverlay.this.pipYSpring;
                                springAnimation6.mValue = PipVideoOverlay.this.pipY;
                                springAnimation6.mStartValueIsSet = true;
                                springAnimation6.mSpring.mFinalPosition = MathUtils.clamp(PipVideoOverlay.this.pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - PipVideoOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f));
                                PipVideoOverlay.this.pipYSpring.start();
                            }
                        }
                    } else {
                        PipVideoOverlay.this.isScrolling = false;
                        PipVideoOverlay.this.isScrollDisallowed = false;
                        if (PipVideoOverlay.this.onSideToDismiss) {
                            PipVideoOverlay.this.onSideToDismiss = false;
                            PipVideoOverlay.dismissAndDestroy();
                        } else {
                            if (!PipVideoOverlay.this.pipXSpring.mRunning) {
                                SpringAnimation springAnimation7 = PipVideoOverlay.this.pipXSpring;
                                springAnimation7.mValue = PipVideoOverlay.this.pipX;
                                springAnimation7.mStartValueIsSet = true;
                                SpringForce springForce5 = springAnimation7.mSpring;
                                f = (PipVideoOverlay.this.pipWidth / 2.0f) + PipVideoOverlay.this.pipX;
                                i6 = AndroidUtilities.displaySize.x;
                                if (f >= i6 / 2.0f) {
                                    iDp = (i6 - PipVideoOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f);
                                } else {
                                    iDp = AndroidUtilities.dp(16.0f);
                                }
                                springForce5.mFinalPosition = iDp;
                                PipVideoOverlay.this.pipXSpring.start();
                            }
                            if (!PipVideoOverlay.this.pipYSpring.mRunning) {
                                SpringAnimation springAnimation8 = PipVideoOverlay.this.pipYSpring;
                                springAnimation8.mValue = PipVideoOverlay.this.pipY;
                                springAnimation8.mStartValueIsSet = true;
                                springAnimation8.mSpring.mFinalPosition = MathUtils.clamp(PipVideoOverlay.this.pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - PipVideoOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f));
                                PipVideoOverlay.this.pipYSpring.start();
                            }
                        }
                    }
                    if (zOnTouchEvent) {
                    }
                }
                return true;
            }

            @Override
            public void onConfigurationChanged(Configuration configuration) {
                float fDp;
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                PipVideoOverlay.this.pipConfig = null;
                AndroidUtilities.setPreferredMaxRefreshRate(PipVideoOverlay.this.windowManager, PipVideoOverlay.this.contentView, PipVideoOverlay.this.windowLayoutParams);
                if (PipVideoOverlay.this.pipWidth == PipVideoOverlay.this.scaleFactor * PipVideoOverlay.this.getSuggestedWidth()) {
                    if (PipVideoOverlay.this.pipHeight == PipVideoOverlay.this.scaleFactor * PipVideoOverlay.this.getSuggestedHeight()) {
                        return;
                    }
                }
                WindowManager.LayoutParams layoutParams = PipVideoOverlay.this.windowLayoutParams;
                PipVideoOverlay pipVideoOverlay = PipVideoOverlay.this;
                layoutParams.width = pipVideoOverlay.pipWidth = (int) (PipVideoOverlay.this.scaleFactor * pipVideoOverlay.getSuggestedWidth());
                WindowManager.LayoutParams layoutParams2 = PipVideoOverlay.this.windowLayoutParams;
                PipVideoOverlay pipVideoOverlay2 = PipVideoOverlay.this;
                layoutParams2.height = pipVideoOverlay2.pipHeight = (int) (PipVideoOverlay.this.scaleFactor * pipVideoOverlay2.getSuggestedHeight());
                AndroidUtilities.updateViewLayout(PipVideoOverlay.this.windowManager, PipVideoOverlay.this.contentView, PipVideoOverlay.this.windowLayoutParams);
                SpringAnimation springAnimation3 = PipVideoOverlay.this.pipXSpring;
                springAnimation3.mValue = PipVideoOverlay.this.pipX;
                springAnimation3.mStartValueIsSet = true;
                SpringForce springForce3 = springAnimation3.mSpring;
                float suggestedWidth = ((PipVideoOverlay.this.scaleFactor * PipVideoOverlay.this.getSuggestedWidth()) / 2.0f) + PipVideoOverlay.this.pipX;
                float f = AndroidUtilities.displaySize.x;
                if (suggestedWidth >= f / 2.0f) {
                    fDp = (f - (PipVideoOverlay.this.scaleFactor * PipVideoOverlay.this.getSuggestedWidth())) - AndroidUtilities.dp(16.0f);
                } else {
                    fDp = AndroidUtilities.dp(16.0f);
                }
                springForce3.mFinalPosition = fDp;
                PipVideoOverlay.this.pipXSpring.start();
                SpringAnimation springAnimation4 = PipVideoOverlay.this.pipYSpring;
                springAnimation4.mValue = PipVideoOverlay.this.pipY;
                springAnimation4.mStartValueIsSet = true;
                springAnimation4.mSpring.mFinalPosition = MathUtils.clamp(PipVideoOverlay.this.pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (PipVideoOverlay.this.scaleFactor * PipVideoOverlay.this.getSuggestedHeight())) - AndroidUtilities.dp(16.0f));
                PipVideoOverlay.this.pipYSpring.start();
            }
        };
        PipVideoViewGroup pipVideoViewGroup = new PipVideoViewGroup(context) {
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

            @Override
            public void onLayout(boolean z4, int i6, int i7, int i8, int i9) {
                PipVideoOverlay.this.contentFrameLayout.layout(0, 0, PipVideoOverlay.this.pipWidth, PipVideoOverlay.this.pipHeight);
            }

            @Override
            public void onMeasure(int i6, int i7) {
                setMeasuredDimension(View.MeasureSpec.getSize(i6), View.MeasureSpec.getSize(i7));
                PipVideoOverlay.this.contentFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(PipVideoOverlay.this.pipWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(PipVideoOverlay.this.pipHeight, 1073741824));
            }
        };
        this.contentView = pipVideoViewGroup;
        pipVideoViewGroup.addView(this.contentFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = this.contentFrameLayout;
        float fDp = AndroidUtilities.dp(10.0f);
        RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
        frameLayout.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(0, fDp));
        this.contentFrameLayout.setClipToOutline(true);
        this.contentFrameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_actionBar, false));
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
            public void invalidate() {
                PipVideoOverlay.this.controlsView.invalidate();
            }

            @Override
            public void onAnimationEnd() {
            }
        });
        this.controlsView = new FrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (PipVideoOverlay.this.seekSpeedDrawable == null || !PipVideoOverlay.this.seekSpeedDrawable.isShown()) {
                    return;
                }
                PipVideoOverlay.this.seekSpeedDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                PipVideoOverlay.this.seekSpeedDrawable.draw(canvas);
            }

            @Override
            public void onDraw(Canvas canvas) {
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
        };
        FrameLayout frameLayout2 = this.controlsView;
        Objects.requireNonNull(frameLayout2);
        this.seekSpeedDrawable = new SeekSpeedDrawable(new Tooltip$$ExternalSyntheticLambda0(frameLayout2, i4), true, false);
        this.controlsView.setWillNotDraw(false);
        this.controlsView.setAlpha(0.0f);
        View view3 = new View(context);
        view3.setBackgroundColor(1275068416);
        this.controlsView.addView(view3, LayoutHelper.createFrame(-1, -1.0f));
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
        imageView.setOnClickListener(new ColorPicker$$ExternalSyntheticLambda4(i3));
        float f = 38;
        float f2 = 4;
        this.controlsView.addView(imageView, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, f2, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(Theme.getColor(null, i6, false), mode);
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i7, false), 1, -1));
        imageView2.setPadding(iDp, iDp, iDp, iDp);
        imageView2.setOnClickListener(new PipVideoOverlay$$ExternalSyntheticLambda5(this, z3, i5));
        this.controlsView.addView(imageView2, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, 48, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.playPauseButton = imageView3;
        imageView3.setColorFilter(Theme.getColor(null, i6, false), mode);
        this.playPauseButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i7, false), 1, -1));
        this.playPauseButton.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 9));
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
        int i8 = this.pipWidth;
        layoutParamsCreateWindowLayoutParams.width = i8;
        layoutParamsCreateWindowLayoutParams.height = this.pipHeight;
        if (pipX != -1.0f) {
            float f3 = (i8 / 2.0f) + pipX;
            int i9 = AndroidUtilities.displaySize.x;
            float fDp2 = f3 >= ((float) i9) / 2.0f ? (i9 - i8) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
            this.pipX = fDp2;
            layoutParamsCreateWindowLayoutParams.x = (int) fDp2;
        } else {
            float fDp3 = (AndroidUtilities.displaySize.x - i8) - AndroidUtilities.dp(16.0f);
            this.pipX = fDp3;
            layoutParamsCreateWindowLayoutParams.x = (int) fDp3;
        }
        if (pipY != -1.0f) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            float fClamp = MathUtils.clamp(pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - this.pipHeight);
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.SCALE_Y, 1.0f));
        animatorSet.start();
        return true;
    }

    public void toggleControls(boolean z) {
        ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(200L);
        this.controlsAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.controlsAnimator.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 16));
        this.controlsAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PipVideoOverlay.this.controlsAnimator = null;
            }
        });
        this.controlsAnimator.start();
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
        if (zIsPlaying) {
            this.playPauseButton.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(this.progressRunnable, 500L);
        } else if (this.isVideoCompleted) {
            this.playPauseButton.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.playPauseButton.setImageResource(R.drawable.pip_play_large);
        }
    }

    public void onLongClick() {
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

    public void pipCreateActionsList(ArrayList arrayList, String str, int i) {
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
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                PipVideoOverlay.this.photoViewer.changedTextureView.setSurfaceTexture(surfaceTexture);
                return false;
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        });
        return this.pipTextureView;
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
    public Bitmap pipCreatePrimaryWindowViewBitmap() {
        TextureView textureView;
        PhotoViewer photoViewer = this.photoViewer;
        if (photoViewer == null || (textureView = photoViewer.changedTextureView) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.photoViewer.changedTextureView.getBitmap();
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

    @Override
    public boolean pipIsAvailable() {
        PhotoViewer photoViewer = this.photoViewer;
        return photoViewer != null && photoViewer.pipIsAvailable();
    }

    @Override
    public void pipRenderBackground(Canvas canvas) {
    }

    @Override
    public void pipRenderForeground(Canvas canvas) {
    }

    @Override
    public void pipShowPrimaryWindowView(Runnable runnable) {
        PipSource pipSource = this.pipSource;
        if (pipSource != null && pipSource.params.isValid()) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            int iWidth = ((Rect) this.pipSource.params.tokenCreator).width();
            this.pipWidth = iWidth;
            layoutParams.width = iWidth;
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            int iHeight = ((Rect) this.pipSource.params.tokenCreator).height();
            this.pipHeight = iHeight;
            layoutParams2.height = iHeight;
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

    public static void dismiss(boolean z) {
        instance.dismissInternal(z, false);
    }

    private static int getSuggestedHeight(float f) {
        return (int) (getSuggestedWidth(f) * f);
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

    public static boolean show(boolean z, Activity activity, View view, int i, int i2, boolean z2) {
        return show(z, activity, null, view, i, i2, z2);
    }

    public static void dismiss(boolean z, boolean z2) {
        instance.dismissInternal(z, z2);
    }

    public static boolean show(boolean z, Activity activity, PhotoViewerWebView photoViewerWebView, View view, int i, int i2, boolean z2) {
        return instance.showInternal(z, activity, view, photoViewerWebView, i, i2, z2);
    }
}
