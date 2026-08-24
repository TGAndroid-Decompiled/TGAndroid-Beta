package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.Property;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PlayPauseDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Scroller;
import org.telegram.ui.Components.TimerParticles;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.VideoPlayerSeekBar;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.HintView2;

public class SecretMediaViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private static volatile SecretMediaViewer Instance;
    private ActionBar actionBar;
    private WindowVisibilityManager.Controller activityVisibilityController;
    private int[] animateFromRadius;
    private float animateToClipBottom;
    private float animateToClipBottomOrigin;
    private float animateToClipHorizontal;
    private float animateToClipTop;
    private float animateToClipTopOrigin;
    private boolean animateToRadius;
    private float animateToScale;
    private float animateToX;
    private float animateToY;
    private long animationStartTime;
    private float animationValue;
    private AspectRatioFrameLayout aspectRatioFrameLayout;
    private FrameLayout captionContainer;
    private boolean captionHwLayerEnabled;
    private PhotoViewer.CaptionScrollView captionScrollView;
    private PhotoViewer.CaptionTextViewSwitcher captionTextViewSwitcher;
    private float clipBottom;
    private float clipBottomOrigin;
    private float clipHorizontal;
    private float clipTop;
    private float clipTopOrigin;
    private boolean closeAfterAnimation;
    private long closeTime;
    private boolean closeVideoAfterWatch;
    private FrameLayoutDrawer containerView;
    private int currentAccount;
    private AnimatorSet currentActionBarAnimation;
    private long currentDialogId;
    private MessageObject currentMessageObject;
    private PhotoViewer.PhotoViewerProvider currentProvider;
    private float[] currentRadii;
    private ImageReceiver.BitmapHolder currentThumb;
    private boolean disableShowCheck;
    private boolean discardTap;
    private boolean doubleTap;
    private float dragY;
    private boolean draggingDown;
    private GestureDetector gestureDetector;
    private boolean ignoreDelete;
    private AnimatorSet imageMoveAnimation;
    private boolean invalidCoords;
    private boolean isPhotoVisible;
    private boolean isPlaying;
    private boolean isVideo;
    private boolean isVisible;
    private Object lastInsets;
    private float maxX;
    private float maxY;
    private float minX;
    private float minY;
    private float moveStartX;
    private float moveStartY;
    private boolean moving;
    private View navigationBar;
    private Runnable onClose;
    private long openTime;
    private Activity parentActivity;
    private Runnable photoAnimationEndRunnable;
    private int photoAnimationInProgress;
    private long photoTransitionAnimationStartTime;
    private float pinchCenterX;
    private float pinchCenterY;
    private float pinchStartDistance;
    private float pinchStartX;
    private float pinchStartY;
    private ImageView playButton;
    private PlayPauseDrawable playButtonDrawable;
    private boolean playButtonShown;
    private int playerRetryPlayCount;
    private Scroller scroller;
    private SecretDeleteTimer secretDeleteTimer;
    private HintView2 secretHint;
    private VideoPlayerSeekBar seekbar;
    private View seekbarBackground;
    private VideoPlayerControlFrameLayout seekbarContainer;
    private View seekbarView;
    private TextSelectionHelper.SimpleTextSelectionHelper textSelectionHelper;
    private boolean textureUploaded;
    private float translationX;
    private float translationY;
    private boolean useOvershootForScale;
    private VelocityTracker velocityTracker;
    private float videoCrossfadeAlpha;
    private long videoCrossfadeAlphaLastTime;
    private boolean videoCrossfadeStarted;
    private int videoHeight;
    private VideoPlayer videoPlayer;
    private SimpleTextView videoPlayerTime;
    private TextureView videoTextureView;
    private boolean videoWatchedOneTime;
    private int videoWidth;
    private boolean wasLightNavigationBar;
    private int wasNavigationBarColor;
    private WindowManager.LayoutParams windowLayoutParams;
    private FrameLayout windowView;
    private boolean zoomAnimation;
    private boolean zooming;
    private ImageReceiver centerImage = new ImageReceiver();
    private int[] coords = new int[2];
    private boolean isActionBarVisible = true;
    private PhotoBackgroundDrawable photoBackgroundDrawable = new PhotoBackgroundDrawable(-16777216);
    private Paint blackPaint = new Paint();
    private float scale = 1.0f;
    private DecelerateInterpolator interpolator = new DecelerateInterpolator(1.5f);
    private float pinchStartScale = 1.0f;
    private boolean canDragDown = true;
    private final Runnable updateProgressRunnable = new Runnable() {
        @Override
        public final void run() {
            SecretMediaViewer.m3993$r8$lambda$Ffut9PT6DjtyuuAhLsbYn9OOQg(this.f$0);
        }
    };
    private final int[] videoPlayerCurrentTime = new int[2];
    private final int[] videoPlayerTotalTime = new int[2];
    private final Runnable hideActionBarRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.toggleActionBar(false, true);
        }
    };
    private Path roundRectPath = new Path();
    public final Property VIDEO_CROSSFADE_ALPHA = new AnimationProperties.FloatProperty("videoCrossfadeAlpha") {
        @Override
        public void setValue(SecretMediaViewer secretMediaViewer, float f) {
            secretMediaViewer.setVideoCrossfadeAlpha(f);
        }

        @Override
        public Float get(SecretMediaViewer secretMediaViewer) {
            return Float.valueOf(secretMediaViewer.getVideoCrossfadeAlpha());
        }
    };
    public final Property ANIMATION_VALUE = new AnimationProperties.FloatProperty("animationValue") {
        @Override
        public void setValue(SecretMediaViewer secretMediaViewer, float f) {
            secretMediaViewer.setAnimationValue(f);
        }

        @Override
        public Float get(SecretMediaViewer secretMediaViewer) {
            return Float.valueOf(secretMediaViewer.getAnimationValue());
        }
    };

    public void onLinkClick(ClickableSpan clickableSpan, TextView textView) {
    }

    public void onLinkLongPress(ClickableSpan clickableSpan, TextView textView, Runnable runnable) {
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    static int access$1610(SecretMediaViewer secretMediaViewer) {
        int i = secretMediaViewer.playerRetryPlayCount;
        secretMediaViewer.playerRetryPlayCount = i - 1;
        return i;
    }

    class FrameLayoutDrawer extends FrameLayout {
        public FrameLayoutDrawer(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            SecretMediaViewer.this.processTouchEvent(motionEvent);
            return true;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            SecretMediaViewer.this.onDraw(canvas);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return view != SecretMediaViewer.this.aspectRatioFrameLayout && super.drawChild(canvas, view, j);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            SecretMediaViewer.this.centerImage.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            SecretMediaViewer.this.centerImage.onDetachedFromWindow();
        }
    }

    class SecretDeleteTimer extends FrameLayout {
        private Paint afterDeleteProgressPaint;
        private Paint circlePaint;
        private RectF deleteProgressRect;
        private long destroyTime;
        private long destroyTtl;
        private RLottieDrawable drawable;
        private boolean once;
        private StaticLayout onceLayout;
        private float onceLayoutHeight;
        private float onceLayoutWidth;
        private TextPaint oncePaint;
        private Paint particlePaint;
        private TimerParticles timerParticles;
        private boolean useVideoProgress;

        public SecretDeleteTimer(Context context) {
            super(context);
            this.deleteProgressRect = new RectF();
            this.timerParticles = new TimerParticles();
            this.oncePaint = new TextPaint(1);
            setWillNotDraw(false);
            Paint paint = new Paint(1);
            this.particlePaint = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            this.particlePaint.setColor(-1644826);
            Paint paint2 = this.particlePaint;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint2.setStrokeCap(cap);
            Paint paint3 = this.particlePaint;
            Paint.Style style = Paint.Style.STROKE;
            paint3.setStyle(style);
            Paint paint4 = new Paint(1);
            this.afterDeleteProgressPaint = paint4;
            paint4.setStyle(style);
            this.afterDeleteProgressPaint.setStrokeCap(cap);
            this.afterDeleteProgressPaint.setColor(-1644826);
            this.afterDeleteProgressPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Paint paint5 = new Paint(1);
            this.circlePaint = paint5;
            paint5.setColor(2130706432);
            int i = R.raw.fire_on;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.drawable = rLottieDrawable;
            rLottieDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.drawable.setMasterParent(this);
            this.drawable.start();
        }

        public void setDestroyTime(long j, long j2, boolean z) {
            this.once = false;
            this.destroyTime = j;
            this.destroyTtl = j2;
            this.useVideoProgress = z;
            this.drawable.start();
            invalidate();
        }

        public void setOnce() {
            this.once = true;
            this.oncePaint.setTextSize(AndroidUtilities.dp(13.0f));
            this.oncePaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            this.oncePaint.setColor(-1);
            StaticLayout staticLayout = new StaticLayout("1", this.oncePaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.onceLayout = staticLayout;
            this.onceLayoutWidth = staticLayout.getLineCount() > 0 ? this.onceLayout.getLineWidth(0) : 0.0f;
            this.onceLayoutHeight = this.onceLayout.getHeight();
            invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            float measuredHeight = getMeasuredHeight() / 2.0f;
            float fDpf2 = AndroidUtilities.dpf2(10.5f);
            this.deleteProgressRect.set(measuredWidth - fDpf2, measuredHeight - fDpf2, measuredWidth + fDpf2, fDpf2 + measuredHeight);
            setPivotX(measuredWidth);
            setPivotY(measuredHeight);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float fMax;
            if (SecretMediaViewer.this.currentMessageObject != null) {
                if (SecretMediaViewer.this.currentMessageObject.messageOwner.destroyTime != 0 || SecretMediaViewer.this.currentMessageObject.messageOwner.ttl == Integer.MAX_VALUE) {
                    if (this.useVideoProgress) {
                        if (SecretMediaViewer.this.videoPlayer != null) {
                            long duration = SecretMediaViewer.this.videoPlayer.getDuration();
                            long currentPosition = SecretMediaViewer.this.videoPlayer.getCurrentPosition();
                            if (duration == -9223372036854775807L || currentPosition == -9223372036854775807L) {
                                fMax = 1.0f;
                            } else {
                                fMax = 1.0f - (currentPosition / duration);
                            }
                        } else {
                            fMax = 1.0f;
                        }
                    } else if (this.destroyTime == 0) {
                        fMax = 1.0f;
                    } else {
                        fMax = Math.max(0L, this.destroyTime - (System.currentTimeMillis() + ((long) (ConnectionsManager.getInstance(SecretMediaViewer.this.currentAccount).getTimeDifference() * 1000)))) / (this.destroyTtl * 1000.0f);
                    }
                    if (this.once) {
                        canvas.save();
                        canvas.translate(this.deleteProgressRect.centerX() - (this.onceLayoutWidth / 2.0f), this.deleteProgressRect.centerY() - (this.onceLayoutHeight / 2.0f));
                        this.onceLayout.draw(canvas);
                        canvas.restore();
                        canvas.drawArc(this.deleteProgressRect, 90.0f, 180.0f, false, this.afterDeleteProgressPaint);
                        float f = 19.285715f;
                        for (int i = 0; i < 5; i++) {
                            canvas.drawArc(this.deleteProgressRect, f + 270.0f, 12.857143f, false, this.afterDeleteProgressPaint);
                            f += 32.14286f;
                        }
                        this.timerParticles.draw(canvas, this.particlePaint, this.deleteProgressRect, 0.0f, 1.0f);
                    } else {
                        float fCenterX = this.deleteProgressRect.centerX();
                        float fCenterY = this.deleteProgressRect.centerY() - AndroidUtilities.dp(1.0f);
                        float fDp = AndroidUtilities.dp(8.0f);
                        this.drawable.setBounds((int) (fCenterX - fDp), (int) (fCenterY - fDp), (int) (fCenterX + fDp), (int) (fCenterY + fDp));
                        this.drawable.draw(canvas);
                        float f2 = fMax * (-360.0f);
                        canvas.drawArc(this.deleteProgressRect, -90.0f, f2, false, this.afterDeleteProgressPaint);
                        this.timerParticles.draw(canvas, this.particlePaint, this.deleteProgressRect, f2, 1.0f);
                    }
                    invalidate();
                }
            }
        }
    }

    private class PhotoBackgroundDrawable extends ColorDrawable {
        private Runnable drawRunnable;
        private int frame;

        public PhotoBackgroundDrawable(int i) {
            super(i);
        }

        @Override
        public void setAlpha(int i) {
            if (SecretMediaViewer.this.activityVisibilityController != null) {
                SecretMediaViewer.this.activityVisibilityController.setHidden(SecretMediaViewer.this.isPhotoVisible && i == 255);
            }
            super.setAlpha(i);
        }

        @Override
        public void draw(Canvas canvas) {
            Runnable runnable;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.frame == 2 && (runnable = this.drawRunnable) != null) {
                    runnable.run();
                    this.drawRunnable = null;
                } else {
                    invalidateSelf();
                }
                this.frame++;
            }
        }

        @Override
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4 + AndroidUtilities.navigationBarHeight);
        }

        @Override
        public void setBounds(Rect rect) {
            rect.bottom += AndroidUtilities.navigationBarHeight;
            super.setBounds(rect);
        }
    }

    public static SecretMediaViewer getInstance() {
        SecretMediaViewer secretMediaViewer;
        SecretMediaViewer secretMediaViewer2 = Instance;
        if (secretMediaViewer2 != null) {
            return secretMediaViewer2;
        }
        synchronized (PhotoViewer.class) {
            try {
                secretMediaViewer = Instance;
                if (secretMediaViewer == null) {
                    secretMediaViewer = new SecretMediaViewer();
                    Instance = secretMediaViewer;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return secretMediaViewer;
    }

    public static boolean hasInstance() {
        return Instance != null;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.currentMessageObject != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.currentMessageObject.getId()))) {
                if (this.isVideo && !this.videoWatchedOneTime) {
                    this.closeVideoAfterWatch = true;
                    return;
                } else {
                    if (closePhoto(true, true)) {
                        return;
                    }
                    this.closeAfterAnimation = true;
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.currentMessageObject == null || this.secretDeleteTimer == null || ((Long) objArr[0]).longValue() != this.currentDialogId) {
                return;
            }
            SparseArray sparseArray = (SparseArray) objArr[1];
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                int iKeyAt = sparseArray.keyAt(i3);
                ArrayList arrayList = (ArrayList) sparseArray.get(iKeyAt);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (this.currentMessageObject.getId() == ((Integer) arrayList.get(i4)).intValue()) {
                        this.currentMessageObject.messageOwner.destroyTime = iKeyAt;
                        this.secretDeleteTimer.invalidate();
                        return;
                    }
                }
            }
            return;
        }
        if (i == NotificationCenter.updateMessageMedia) {
            if (this.currentMessageObject.getId() == ((TLRPC.Message) objArr[0]).id) {
                if (this.isVideo && !this.videoWatchedOneTime) {
                    this.closeVideoAfterWatch = true;
                } else {
                    if (closePhoto(true, true)) {
                        return;
                    }
                    this.closeAfterAnimation = true;
                }
            }
        }
    }

    public void preparePlayer(File file) {
        if (this.parentActivity == null) {
            return;
        }
        releasePlayer();
        if (this.videoTextureView == null) {
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(this.parentActivity);
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setVisibility(0);
            this.containerView.addView(this.aspectRatioFrameLayout, 0, LayoutHelper.createFrame(-1, -1, 17));
            TextureView textureView = new TextureView(this.parentActivity);
            this.videoTextureView = textureView;
            textureView.setOpaque(false);
            this.aspectRatioFrameLayout.addView(this.videoTextureView, LayoutHelper.createFrame(-1, -1, 17));
        }
        this.textureUploaded = false;
        this.videoCrossfadeStarted = false;
        this.videoTextureView.setAlpha(1.0f);
        if (this.videoPlayer == null) {
            VideoPlayer videoPlayer = new VideoPlayer() {
                @Override
                public void setPlayWhenReady(boolean z) {
                    super.setPlayWhenReady(z);
                    SecretMediaViewer.this.playButtonDrawable.setPause(z);
                }

                @Override
                public void play() {
                    super.play();
                    SecretMediaViewer.this.playButtonDrawable.setPause(true);
                }

                @Override
                public void pause() {
                    super.pause();
                    SecretMediaViewer.this.playButtonDrawable.setPause(false);
                }
            };
            this.videoPlayer = videoPlayer;
            videoPlayer.setTextureView(this.videoTextureView);
            this.videoPlayer.setDelegate(new AnonymousClass2(file));
        }
        this.videoPlayer.preparePlayer(Uri.fromFile(file), "other");
        this.videoPlayer.setPlayWhenReady(true);
        this.playButtonDrawable.setPause(true);
    }

    class AnonymousClass2 implements VideoPlayer.VideoPlayerDelegate {
        final File val$file;

        @Override
        public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onRenderedFirstFrame(this, eventTime);
        }

        @Override
        public void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
        }

        @Override
        public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return VideoPlayer.VideoPlayerDelegate.CC.$default$onSurfaceDestroyed(this, surfaceTexture);
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSurfaceTextureUpdated(this, surfaceTexture);
        }

        AnonymousClass2(File file) {
            this.val$file = file;
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            if (SecretMediaViewer.this.videoPlayer == null || SecretMediaViewer.this.currentMessageObject == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(SecretMediaViewer.this.updateProgressRunnable);
            AndroidUtilities.runOnUIThread(SecretMediaViewer.this.updateProgressRunnable);
            if (i == 4 || i == 1) {
                try {
                    SecretMediaViewer.this.parentActivity.getWindow().clearFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    SecretMediaViewer.this.parentActivity.getWindow().addFlags(128);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            if (i == 3 && SecretMediaViewer.this.aspectRatioFrameLayout.getVisibility() != 0) {
                SecretMediaViewer.this.aspectRatioFrameLayout.setVisibility(0);
            }
            if (!SecretMediaViewer.this.videoPlayer.isPlaying() || i == 4) {
                if (SecretMediaViewer.this.isPlaying) {
                    SecretMediaViewer.this.isPlaying = false;
                    if (i == 4) {
                        SecretMediaViewer.this.videoWatchedOneTime = true;
                        if (!SecretMediaViewer.this.closeVideoAfterWatch) {
                            SecretMediaViewer.this.videoPlayer.seekTo(0L);
                            SecretMediaViewer.this.videoPlayer.play();
                            return;
                        } else {
                            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                            secretMediaViewer.closePhoto(true, !secretMediaViewer.ignoreDelete);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (SecretMediaViewer.this.isPlaying) {
                return;
            }
            SecretMediaViewer.this.isPlaying = true;
        }

        @Override
        public void onError(VideoPlayer videoPlayer, Exception exc) {
            if (SecretMediaViewer.this.playerRetryPlayCount > 0) {
                SecretMediaViewer.access$1610(SecretMediaViewer.this);
                final File file = this.val$file;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SecretMediaViewer.this.preparePlayer(file);
                    }
                }, 100L);
                return;
            }
            FileLog.e(exc);
        }

        @Override
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            if (SecretMediaViewer.this.aspectRatioFrameLayout != null) {
                if (i3 != 90 && i3 != 270) {
                    i2 = i;
                    i = i2;
                }
                SecretMediaViewer.this.aspectRatioFrameLayout.setAspectRatio(i == 0 ? 1.0f : (i2 * f) / i, i3);
            }
        }

        @Override
        public void onRenderedFirstFrame() {
            if (SecretMediaViewer.this.textureUploaded) {
                return;
            }
            SecretMediaViewer.this.textureUploaded = true;
            SecretMediaViewer.this.containerView.invalidate();
        }
    }

    public static void m3993$r8$lambda$Ffut9PT6DjtyuuAhLsbYn9OOQg(SecretMediaViewer secretMediaViewer) {
        VideoPlayer videoPlayer = secretMediaViewer.videoPlayer;
        if (videoPlayer == null) {
            return;
        }
        long currentPosition = videoPlayer.getCurrentPosition();
        long duration = secretMediaViewer.videoPlayer.getDuration();
        if (duration == -9223372036854775807L) {
            currentPosition = 0;
            duration = 0;
        }
        if (duration > 0 && !secretMediaViewer.seekbar.isDragging()) {
            secretMediaViewer.seekbar.setProgress(currentPosition / duration);
            secretMediaViewer.seekbarView.invalidate();
        }
        secretMediaViewer.updateVideoPlayerTime();
        if (secretMediaViewer.videoPlayer.isPlaying()) {
            AndroidUtilities.runOnUIThread(secretMediaViewer.updateProgressRunnable, 17L);
        }
    }

    private void updateVideoPlayerTime() {
        String str;
        String str2;
        Arrays.fill(this.videoPlayerCurrentTime, 0);
        Arrays.fill(this.videoPlayerTotalTime, 0);
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            long jMax = Math.max(0L, videoPlayer.getCurrentPosition()) / 1000;
            long jMax2 = Math.max(0L, this.videoPlayer.getDuration()) / 1000;
            int[] iArr = this.videoPlayerCurrentTime;
            iArr[0] = (int) (jMax / 60);
            iArr[1] = (int) (jMax % 60);
            int[] iArr2 = this.videoPlayerTotalTime;
            iArr2[0] = (int) (jMax2 / 60);
            iArr2[1] = (int) (jMax2 % 60);
        }
        int i = this.videoPlayerCurrentTime[0];
        if (i >= 60) {
            str = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(this.videoPlayerCurrentTime[0] % 60), Integer.valueOf(this.videoPlayerCurrentTime[1]));
        } else {
            str = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i), Integer.valueOf(this.videoPlayerCurrentTime[1]));
        }
        int i2 = this.videoPlayerTotalTime[0];
        if (i2 >= 60) {
            str2 = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i2 / 60), Integer.valueOf(this.videoPlayerTotalTime[0] % 60), Integer.valueOf(this.videoPlayerTotalTime[1]));
        } else {
            str2 = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(this.videoPlayerTotalTime[1]));
        }
        this.videoPlayerTime.setText(String.format(Locale.ROOT, "%s / %s", str, str2));
    }

    private void releasePlayer() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            this.playerRetryPlayCount = 0;
            videoPlayer.releasePlayer(true);
            this.videoPlayer = null;
        }
        try {
            Activity activity = this.parentActivity;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            this.containerView.removeView(aspectRatioFrameLayout);
            this.aspectRatioFrameLayout = null;
        }
        if (this.videoTextureView != null) {
            this.videoTextureView = null;
        }
        this.isPlaying = false;
    }

    public void setParentActivity(final Activity activity) {
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.centerImage.setCurrentAccount(i);
        if (this.parentActivity == activity) {
            return;
        }
        this.parentActivity = activity;
        this.scroller = new Scroller(activity);
        FrameLayout frameLayout = new FrameLayout(activity) {
            @Override
            protected void onMeasure(int i2, int i3) {
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                if (SecretMediaViewer.this.lastInsets != null) {
                    WindowInsets windowInsets = (WindowInsets) SecretMediaViewer.this.lastInsets;
                    if (AndroidUtilities.incorrectDisplaySizeFix) {
                        int i4 = AndroidUtilities.displaySize.y;
                        if (size2 > i4) {
                            size2 = i4;
                        }
                        size2 += AndroidUtilities.statusBarHeight;
                    }
                    size2 -= windowInsets.getSystemWindowInsetBottom();
                    size -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i5 = AndroidUtilities.displaySize.y;
                    if (size2 > i5) {
                        size2 = i5;
                    }
                }
                setMeasuredDimension(size, size2);
                if (SecretMediaViewer.this.lastInsets != null) {
                    size -= ((WindowInsets) SecretMediaViewer.this.lastInsets).getSystemWindowInsetLeft();
                }
                SecretMediaViewer.this.containerView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }

            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                int systemWindowInsetLeft = SecretMediaViewer.this.lastInsets != null ? ((WindowInsets) SecretMediaViewer.this.lastInsets).getSystemWindowInsetLeft() : 0;
                SecretMediaViewer.this.containerView.layout(systemWindowInsetLeft, 0, SecretMediaViewer.this.containerView.getMeasuredWidth() + systemWindowInsetLeft, SecretMediaViewer.this.containerView.getMeasuredHeight());
                if (z) {
                    if (SecretMediaViewer.this.imageMoveAnimation == null) {
                        SecretMediaViewer.this.scale = 1.0f;
                        SecretMediaViewer.this.translationX = 0.0f;
                        SecretMediaViewer.this.translationY = 0.0f;
                    }
                    SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                    secretMediaViewer.updateMinMax(secretMediaViewer.scale);
                }
            }
        };
        this.windowView = frameLayout;
        frameLayout.setBackgroundDrawable(this.photoBackgroundDrawable);
        this.windowView.setFocusable(true);
        this.windowView.setFocusableInTouchMode(true);
        this.windowView.setClipChildren(false);
        this.windowView.setClipToPadding(false);
        this.containerView = new FrameLayoutDrawer(activity) {
            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                if (SecretMediaViewer.this.secretDeleteTimer != null) {
                    int currentActionBarHeight = ((ActionBar.getCurrentActionBarHeight() - SecretMediaViewer.this.secretDeleteTimer.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    SecretMediaViewer.this.secretDeleteTimer.layout(SecretMediaViewer.this.secretDeleteTimer.getLeft(), currentActionBarHeight, SecretMediaViewer.this.secretDeleteTimer.getRight(), SecretMediaViewer.this.secretDeleteTimer.getMeasuredHeight() + currentActionBarHeight);
                }
                if (SecretMediaViewer.this.secretHint != null && SecretMediaViewer.this.secretDeleteTimer != null) {
                    int currentActionBarHeight2 = ((((ActionBar.getCurrentActionBarHeight() - SecretMediaViewer.this.secretDeleteTimer.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight) + SecretMediaViewer.this.secretDeleteTimer.getMeasuredHeight()) - AndroidUtilities.dp(10.0f);
                    SecretMediaViewer.this.secretHint.layout(SecretMediaViewer.this.secretHint.getLeft(), currentActionBarHeight2, SecretMediaViewer.this.secretHint.getRight(), SecretMediaViewer.this.secretHint.getMeasuredHeight() + currentActionBarHeight2);
                }
                if (SecretMediaViewer.this.captionScrollView != null) {
                    int currentActionBarHeight3 = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    SecretMediaViewer.this.captionScrollView.layout(SecretMediaViewer.this.captionScrollView.getLeft(), currentActionBarHeight3, SecretMediaViewer.this.captionScrollView.getRight(), SecretMediaViewer.this.captionScrollView.getMeasuredHeight() + currentActionBarHeight3);
                }
                if (SecretMediaViewer.this.navigationBar != null) {
                    int i6 = i5 - i3;
                    SecretMediaViewer.this.navigationBar.layout(0, i6, i4 - i2, AndroidUtilities.navigationBarHeight + i6);
                }
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                if (SecretMediaViewer.this.captionScrollView != null) {
                    SecretMediaViewer.this.captionScrollView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(((measuredHeight - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - (SecretMediaViewer.this.seekbarContainer.getVisibility() != 0 ? 0 : SecretMediaViewer.this.seekbarContainer.getMeasuredHeight()), 1073741824));
                }
                if (SecretMediaViewer.this.navigationBar != null) {
                    SecretMediaViewer.this.navigationBar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                }
            }
        };
        View view = new View(activity);
        this.navigationBar = view;
        view.setBackgroundColor(2130706432);
        this.containerView.addView(this.navigationBar, LayoutHelper.createFrame(-1, -2, 80));
        this.containerView.setFocusable(false);
        this.windowView.addView(this.containerView);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.containerView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 51;
        this.containerView.setLayoutParams(layoutParams);
        this.containerView.setFitsSystemWindows(true);
        this.containerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return SecretMediaViewer.m3992$r8$lambda$EB1SUjXe1RdWIVAqiOX8YbzSrY(this.f$0, view2, windowInsets);
            }
        });
        this.containerView.setSystemUiVisibility(1792);
        GestureDetector gestureDetector = new GestureDetector(this.containerView.getContext(), this);
        this.gestureDetector = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
        ActionBar actionBar = new ActionBar(activity) {
            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                SecretMediaViewer.this.secretHint.setAlpha(f);
                SecretMediaViewer.this.secretDeleteTimer.setAlpha(f);
            }
        };
        this.actionBar = actionBar;
        actionBar.setTitleColor(-1);
        this.actionBar.setSubtitleColor(-1);
        this.actionBar.setBackgroundColor(2130706432);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setItemsBackgroundColor(1090519039, false);
        this.actionBar.setItemsColor(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(70.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    SecretMediaViewer.this.closePhoto(true, false);
                }
            }
        });
        HintView2 hintView2 = new HintView2(activity, 1);
        this.secretHint = hintView2;
        hintView2.setJoint(1.0f, -26.0f);
        this.secretHint.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.containerView.addView(this.secretHint, LayoutHelper.createFrame(-1, 80.0f, 53, 0.0f, 48.0f, 0.0f, 0.0f));
        SecretDeleteTimer secretDeleteTimer = new SecretDeleteTimer(activity);
        this.secretDeleteTimer = secretDeleteTimer;
        this.containerView.addView(secretDeleteTimer, LayoutHelper.createFrame(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        VideoPlayerSeekBar.SeekBarDelegate seekBarDelegate = new VideoPlayerSeekBar.SeekBarDelegate() {
            @Override
            public void onSeekBarDrag(float f) {
                if (SecretMediaViewer.this.videoPlayer != null) {
                    long duration = SecretMediaViewer.this.videoPlayer.getDuration();
                    if (duration != -9223372036854775807L) {
                        SecretMediaViewer.this.videoPlayer.seekTo((long) (f * duration), false);
                    }
                    SecretMediaViewer.this.videoPlayer.play();
                }
            }

            @Override
            public void onSeekBarContinuousDrag(float f) {
                if (SecretMediaViewer.this.videoPlayer != null) {
                    SecretMediaViewer.this.videoPlayer.pause();
                    long duration = SecretMediaViewer.this.videoPlayer.getDuration();
                    if (duration != -9223372036854775807L) {
                        SecretMediaViewer.this.videoPlayer.seekTo((long) (f * duration), false);
                    }
                }
            }
        };
        this.seekbarContainer = new VideoPlayerControlFrameLayout(activity);
        View view2 = new View(activity);
        this.seekbarBackground = view2;
        view2.setBackgroundColor(2130706432);
        this.seekbarContainer.addView(this.seekbarBackground, LayoutHelper.createFrame(-1, -1, 119));
        SimpleTextView simpleTextView = new SimpleTextView(this.containerView.getContext());
        this.videoPlayerTime = simpleTextView;
        simpleTextView.setTextColor(-1);
        this.videoPlayerTime.setGravity(53);
        this.videoPlayerTime.setTextSize(14);
        this.videoPlayerTime.setImportantForAccessibility(2);
        this.seekbarContainer.addView(this.videoPlayerTime, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        View view3 = new View(activity) {
            @Override
            protected void onDraw(Canvas canvas) {
                SecretMediaViewer.this.seekbar.draw(canvas, this);
            }
        };
        this.seekbarView = view3;
        VideoPlayerSeekBar videoPlayerSeekBar = new VideoPlayerSeekBar(view3);
        this.seekbar = videoPlayerSeekBar;
        videoPlayerSeekBar.setHorizontalPadding(AndroidUtilities.dp(2.0f));
        this.seekbar.setColors(872415231, 872415231, -1, -1, -1, 1509949439);
        this.seekbar.setDelegate(seekBarDelegate);
        this.seekbarContainer.addView(this.seekbarView);
        this.containerView.addView(this.seekbarContainer, LayoutHelper.createFrame(-1, 48, 80));
        TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = new TextSelectionHelper.SimpleTextSelectionHelper(null, new DarkThemeResourceProvider()) {
            @Override
            public int getParentBottomPadding() {
                return 0;
            }
        };
        this.textSelectionHelper = simpleTextSelectionHelper;
        simpleTextSelectionHelper.allowScrollPrentRelative = true;
        simpleTextSelectionHelper.useMovingOffset = false;
        PhotoViewer.CaptionTextViewSwitcher captionTextViewSwitcher = new PhotoViewer.CaptionTextViewSwitcher(this.containerView.getContext());
        this.captionTextViewSwitcher = captionTextViewSwitcher;
        captionTextViewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                return SecretMediaViewer.$r8$lambda$rudsVOkVWXRVpouJDU9EcHMxyQ0(this.f$0, activity);
            }
        });
        this.captionTextViewSwitcher.setVisibility(4);
        setCaptionHwLayerEnabled(true);
        ImageView imageView = new ImageView(activity);
        this.playButton = imageView;
        imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(64.0f), 1711276032));
        PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable(28);
        this.playButtonDrawable = playPauseDrawable;
        playPauseDrawable.setCallback(this.playButton);
        this.playButton.setImageDrawable(this.playButtonDrawable);
        this.playButton.setScaleType(ImageView.ScaleType.CENTER);
        this.playButton.setScaleX(0.6f);
        this.playButton.setScaleY(0.6f);
        this.playButton.setAlpha(0.0f);
        this.playButton.setPivotX(AndroidUtilities.dp(32.0f));
        this.playButton.setPivotY(AndroidUtilities.dp(32.0f));
        this.containerView.addView(this.playButton, LayoutHelper.createFrame(64, 64, 17));
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams2;
        layoutParams2.height = -1;
        layoutParams2.format = -3;
        layoutParams2.width = -1;
        layoutParams2.gravity = 48;
        layoutParams2.type = 99;
        layoutParams2.flags = -2147409656;
        AndroidUtilities.logFlagSecure();
        this.centerImage.setParentView(this.containerView);
        this.centerImage.setForceCrossfade(true);
        TextSelectionHelper.TextSelectionOverlay overlayView = this.textSelectionHelper.getOverlayView(this.windowView.getContext());
        if (overlayView != null) {
            AndroidUtilities.removeFromParent(overlayView);
            this.containerView.addView(overlayView);
        }
        this.textSelectionHelper.setParentView(this.containerView);
        this.textSelectionHelper.setInvalidateParent();
    }

    public static WindowInsets m3992$r8$lambda$EB1SUjXe1RdWIVAqiOX8YbzSrY(SecretMediaViewer secretMediaViewer, View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = (WindowInsets) secretMediaViewer.lastInsets;
        secretMediaViewer.lastInsets = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            secretMediaViewer.windowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static View $r8$lambda$rudsVOkVWXRVpouJDU9EcHMxyQ0(final SecretMediaViewer secretMediaViewer, Activity activity) {
        secretMediaViewer.getClass();
        return new PhotoViewer.CaptionTextView(activity, secretMediaViewer.captionScrollView, secretMediaViewer.textSelectionHelper, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.onLinkClick((ClickableSpan) obj, (TextView) obj2);
            }
        }, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                this.f$0.onLinkLongPress((ClickableSpan) obj, (TextView) obj2, (Runnable) obj3);
            }
        });
    }

    private void setCurrentCaption(MessageObject messageObject, CharSequence charSequence, boolean z, boolean z2) {
        boolean z3;
        TLRPC.Message message;
        CharSequence charSequenceCloneSpans = AnimatedEmojiSpan.cloneSpans(charSequence, 3);
        if (this.captionScrollView == null) {
            FrameLayout frameLayout = new FrameLayout(this.containerView.getContext());
            this.captionContainer = frameLayout;
            this.captionTextViewSwitcher.setContainer(frameLayout);
            PhotoViewer.CaptionScrollView captionScrollView = new PhotoViewer.CaptionScrollView(this.containerView.getContext(), this.captionTextViewSwitcher, this.captionContainer) {
                @Override
                protected void onScrollStart() {
                    AndroidUtilities.cancelRunOnUIThread(SecretMediaViewer.this.hideActionBarRunnable);
                }

                @Override
                protected void onScrollUpdate() {
                    if (SecretMediaViewer.this.imageMoveAnimation == null) {
                        SecretMediaViewer.this.showPlayButton(((float) getScrollY()) < ((float) getMeasuredHeight()) / 3.0f && SecretMediaViewer.this.isActionBarVisible, true);
                    }
                }

                @Override
                public void onScrollEnd() {
                    if (!SecretMediaViewer.this.isVideo || getScrollY() > 0) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(SecretMediaViewer.this.hideActionBarRunnable, 3000L);
                }
            };
            this.captionScrollView = captionScrollView;
            this.captionTextViewSwitcher.setScrollView(captionScrollView);
            this.captionContainer.setClipChildren(false);
            this.captionScrollView.addView(this.captionContainer, new ViewGroup.LayoutParams(-1, -2));
            this.containerView.addView(this.captionScrollView, LayoutHelper.createFrame(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.textSelectionHelper.getOverlayView(this.containerView.getContext()).bringToFront();
        }
        if (this.captionTextViewSwitcher.getParent() != this.captionContainer) {
            this.captionTextViewSwitcher.setMeasureAllChildren(true);
            this.captionContainer.addView(this.captionTextViewSwitcher, -1, -2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceCloneSpans);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.captionTextViewSwitcher.getCurrentView().getText());
        TextView nextView = z2 ? this.captionTextViewSwitcher.getNextView() : this.captionTextViewSwitcher.getCurrentView();
        int maxLines = nextView.getMaxLines();
        if (maxLines == 1) {
            this.captionTextViewSwitcher.getCurrentView().setSingleLine(false);
            this.captionTextViewSwitcher.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.captionTextViewSwitcher.getCurrentView().setMaxLines(Integer.MAX_VALUE);
            this.captionTextViewSwitcher.getNextView().setMaxLines(Integer.MAX_VALUE);
            this.captionTextViewSwitcher.getCurrentView().setEllipsize(null);
            this.captionTextViewSwitcher.getNextView().setEllipsize(null);
        }
        nextView.setScrollX(0);
        PhotoViewer.CaptionScrollView captionScrollView2 = this.captionScrollView;
        captionScrollView2.dontChangeTopMargin = false;
        if (z2) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(captionScrollView2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new AnonymousClass12(2, zIsEmpty2, zIsEmpty)).addTransition(new AnonymousClass11(1, zIsEmpty2, zIsEmpty)).setDuration(200L);
            if (!zIsEmpty2) {
                this.captionScrollView.dontChangeTopMargin = true;
                duration.addTransition(new AnonymousClass13());
            }
            if (zIsEmpty2 && !zIsEmpty) {
                duration.addTarget((View) this.captionTextViewSwitcher);
            }
            TransitionManager.beginDelayedTransition(this.captionScrollView, duration);
            z3 = true;
        } else {
            this.captionTextViewSwitcher.getCurrentView().setText((CharSequence) null);
            PhotoViewer.CaptionScrollView captionScrollView3 = this.captionScrollView;
            if (captionScrollView3 != null) {
                captionScrollView3.scrollTo(0, 0);
            }
            z3 = false;
        }
        if (!zIsEmpty) {
            Theme.createChatResources(null, true);
            if (messageObject == null || (message = messageObject.messageOwner) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, TranslateAlert2.getToLanguage())) {
                if (messageObject != null && !messageObject.messageOwner.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(charSequenceCloneSpans);
                    messageObject.addEntitiesToText(spannableString, true, false);
                    if (messageObject.isVideo()) {
                        MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableString, false, 3, (int) messageObject.getDuration(), false);
                    }
                    charSequenceCloneSpans = Emoji.replaceEmoji(spannableString, nextView.getPaint().getFontMetricsInt(), false);
                } else {
                    charSequenceCloneSpans = Emoji.replaceEmoji(new SpannableStringBuilder(charSequenceCloneSpans), nextView.getPaint().getFontMetricsInt(), false);
                }
            }
            this.captionTextViewSwitcher.setTag(charSequenceCloneSpans);
            try {
                this.captionTextViewSwitcher.setText(charSequenceCloneSpans, z2, false);
                PhotoViewer.CaptionScrollView captionScrollView4 = this.captionScrollView;
                if (captionScrollView4 != null) {
                    captionScrollView4.updateTopMargin();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.captionTextViewSwitcher.setVisibility(this.isActionBarVisible ? 0 : 4);
        } else {
            this.captionTextViewSwitcher.setText(null, z2);
            this.captionTextViewSwitcher.getCurrentView().setTextColor(-1);
            this.captionTextViewSwitcher.setVisibility(4, !z3 || zIsEmpty2);
            this.captionTextViewSwitcher.setTag(null);
        }
        if (this.captionTextViewSwitcher.getCurrentView() instanceof PhotoViewer.CaptionTextView) {
            ((PhotoViewer.CaptionTextView) this.captionTextViewSwitcher.getCurrentView()).setLoading(z);
        }
    }

    class AnonymousClass12 extends Fade {
        final boolean val$isCaptionEmpty;
        final boolean val$isCurrentCaptionEmpty;

        AnonymousClass12(int i, boolean z, boolean z2) {
            super(i);
            this.val$isCurrentCaptionEmpty = z;
            this.val$isCaptionEmpty = z2;
        }

        @Override
        public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator animatorOnDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
            if (!this.val$isCurrentCaptionEmpty && this.val$isCaptionEmpty && view == SecretMediaViewer.this.captionTextViewSwitcher) {
                animatorOnDisappear.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SecretMediaViewer.this.captionScrollView.setVisibility(4);
                        SecretMediaViewer.this.captionScrollView.backgroundAlpha = 1.0f;
                    }
                });
                ((ObjectAnimator) animatorOnDisappear).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SecretMediaViewer.AnonymousClass12.$r8$lambda$kyrqcWTrRw6tDig9LENbvRg62Jk(this.f$0, valueAnimator);
                    }
                });
            }
            return animatorOnDisappear;
        }

        public static void $r8$lambda$kyrqcWTrRw6tDig9LENbvRg62Jk(AnonymousClass12 anonymousClass12, ValueAnimator valueAnimator) {
            SecretMediaViewer.this.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SecretMediaViewer.this.captionScrollView.invalidate();
        }
    }

    class AnonymousClass11 extends Fade {
        final boolean val$isCaptionEmpty;
        final boolean val$isCurrentCaptionEmpty;

        AnonymousClass11(int i, boolean z, boolean z2) {
            super(i);
            this.val$isCurrentCaptionEmpty = z;
            this.val$isCaptionEmpty = z2;
        }

        @Override
        public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator animatorOnAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
            if (this.val$isCurrentCaptionEmpty && !this.val$isCaptionEmpty && view == SecretMediaViewer.this.captionTextViewSwitcher) {
                animatorOnAppear.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SecretMediaViewer.this.captionScrollView.backgroundAlpha = 1.0f;
                    }
                });
                ((ObjectAnimator) animatorOnAppear).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SecretMediaViewer.AnonymousClass11.$r8$lambda$MuHCBsVWGbpFGgxVLXGeMd2e5XQ(this.f$0, valueAnimator);
                    }
                });
            }
            return animatorOnAppear;
        }

        public static void $r8$lambda$MuHCBsVWGbpFGgxVLXGeMd2e5XQ(AnonymousClass11 anonymousClass11, ValueAnimator valueAnimator) {
            SecretMediaViewer.this.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SecretMediaViewer.this.captionScrollView.invalidate();
        }
    }

    class AnonymousClass13 extends Transition {
        AnonymousClass13() {
        }

        @Override
        public void captureStartValues(TransitionValues transitionValues) {
            if (transitionValues.view == SecretMediaViewer.this.captionScrollView) {
                transitionValues.values.put("scrollY", Integer.valueOf(SecretMediaViewer.this.captionScrollView.getScrollY()));
            }
        }

        @Override
        public void captureEndValues(TransitionValues transitionValues) {
            if (transitionValues.view == SecretMediaViewer.this.captionTextViewSwitcher) {
                transitionValues.values.put("translationY", Integer.valueOf(SecretMediaViewer.this.captionScrollView.getPendingMarginTopDiff()));
            }
        }

        @Override
        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            int iIntValue;
            if (transitionValues.view != SecretMediaViewer.this.captionScrollView) {
                if (transitionValues2.view != SecretMediaViewer.this.captionTextViewSwitcher || (iIntValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(SecretMediaViewer.this.captionTextViewSwitcher, (Property<PhotoViewer.CaptionTextViewSwitcher, Float>) View.TRANSLATION_Y, 0.0f, iIntValue);
                objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SecretMediaViewer.this.captionTextViewSwitcher.setTranslationY(0.0f);
                    }
                });
                return objectAnimatorOfFloat;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
            valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SecretMediaViewer.this.captionTextViewSwitcher.getNextView().setText((CharSequence) null);
                    SecretMediaViewer.this.captionScrollView.applyPendingTopMargin();
                }

                @Override
                public void onAnimationStart(Animator animator) {
                    SecretMediaViewer.this.captionScrollView.stopScrolling();
                }
            });
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SecretMediaViewer.this.captionScrollView.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            return valueAnimatorOfInt;
        }
    }

    public void showPlayButton(boolean z, boolean z2) {
        boolean z3 = this.isVideo && z;
        if (this.playButtonShown == z3 && z2) {
            return;
        }
        this.playButtonShown = z3;
        this.playButton.animate().cancel();
        if (z2) {
            this.playButton.animate().scaleX(z3 ? 1.0f : 0.6f).scaleY(z3 ? 1.0f : 0.6f).alpha(z3 ? 1.0f : 0.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            return;
        }
        this.playButton.setScaleX(z3 ? 1.0f : 0.6f);
        this.playButton.setScaleY(z3 ? 1.0f : 0.6f);
        this.playButton.setAlpha(z3 ? 1.0f : 0.0f);
    }

    private void showSecretHint() {
        this.secretHint.setMultilineText(true);
        String string = LocaleController.getString(this.isVideo ? R.string.VideoShownOnce : R.string.PhotoShownOnce);
        HintView2 hintView2 = this.secretHint;
        hintView2.setMaxWidthPx(HintView2.cutInFancyHalf(string, hintView2.getTextPaint()));
        this.secretHint.setText(string);
        this.secretHint.setInnerPadding(12.0f, 7.0f, 11.0f, 7.0f);
        this.secretHint.setIconMargin(2);
        this.secretHint.setIconTranslate(0.0f, 0.0f);
        this.secretHint.setIcon(R.raw.fire_on);
        this.secretHint.show();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public void openMedia(final MessageObject messageObject, PhotoViewer.PhotoViewerProvider photoViewerProvider, final Runnable runnable, Runnable runnable2) {
        PhotoViewer.PlaceProviderObject placeForPhoto;
        char c;
        final PhotoViewer.PlaceProviderObject placeProviderObject;
        String str;
        float f;
        ImageLocation forDocument;
        if (this.parentActivity == null || messageObject == null || !messageObject.needDrawBluredPreview() || photoViewerProvider == null || (placeForPhoto = photoViewerProvider.getPlaceForPhoto(messageObject, null, 0, true, false)) == null) {
            return;
        }
        this.ignoreDelete = messageObject.messageOwner.ttl == Integer.MAX_VALUE;
        this.onClose = runnable2;
        this.currentProvider = photoViewerProvider;
        this.openTime = System.currentTimeMillis();
        this.closeTime = 0L;
        this.isActionBarVisible = true;
        this.isPhotoVisible = true;
        this.draggingDown = false;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setVisibility(4);
        }
        releasePlayer();
        this.pinchStartDistance = 0.0f;
        this.pinchStartScale = 1.0f;
        this.pinchCenterX = 0.0f;
        this.pinchCenterY = 0.0f;
        this.pinchStartX = 0.0f;
        this.pinchStartY = 0.0f;
        this.moveStartX = 0.0f;
        this.moveStartY = 0.0f;
        this.zooming = false;
        this.moving = false;
        this.doubleTap = false;
        this.invalidCoords = false;
        this.canDragDown = true;
        updateMinMax(this.scale);
        this.photoBackgroundDrawable.setAlpha(0);
        this.containerView.setAlpha(1.0f);
        this.containerView.setVisibility(0);
        this.secretDeleteTimer.setAlpha(1.0f);
        this.isVideo = false;
        this.videoWatchedOneTime = false;
        this.closeVideoAfterWatch = false;
        this.disableShowCheck = true;
        this.centerImage.setManualAlphaAnimator(false);
        this.videoWidth = 0;
        this.videoHeight = 0;
        RectF rectF = new RectF(placeForPhoto.imageReceiver.getDrawRegion());
        rectF.left = Math.max(rectF.left, placeForPhoto.imageReceiver.getImageX());
        rectF.top = Math.max(rectF.top, placeForPhoto.imageReceiver.getImageY());
        rectF.right = Math.min(rectF.right, placeForPhoto.imageReceiver.getImageX2());
        rectF.bottom = Math.min(rectF.bottom, placeForPhoto.imageReceiver.getImageY2());
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        Point point = AndroidUtilities.displaySize;
        int i = point.x;
        int i2 = point.y + AndroidUtilities.statusBarHeight;
        this.scale = Math.max(fWidth / i, fHeight / i2);
        int[] iArr = placeForPhoto.radius;
        if (iArr != null) {
            this.animateFromRadius = new int[iArr.length];
            int i3 = 0;
            while (true) {
                int[] iArr2 = placeForPhoto.radius;
                c = 1;
                if (i3 >= iArr2.length) {
                    break;
                }
                this.animateFromRadius[i3] = iArr2[i3];
                i3++;
            }
        } else {
            c = 1;
            this.animateFromRadius = null;
        }
        float f2 = placeForPhoto.viewX;
        float f3 = rectF.left;
        this.translationX = ((f2 + f3) + (fWidth / 2.0f)) - (i / 2);
        this.translationY = ((placeForPhoto.viewY + rectF.top) + (fHeight / 2.0f)) - (i2 / 2);
        this.clipHorizontal = Math.abs(f3 - placeForPhoto.imageReceiver.getImageX());
        int iAbs = (int) Math.abs(rectF.top - placeForPhoto.imageReceiver.getImageY());
        int[] iArr3 = new int[2];
        placeForPhoto.parentView.getLocationInWindow(iArr3);
        float f4 = (iArr3[c] - (placeForPhoto.viewY + rectF.top)) + placeForPhoto.clipTopAddition;
        this.clipTop = f4;
        float f5 = iAbs;
        this.clipTop = Math.max(0.0f, Math.max(f4, f5));
        float height = (((placeForPhoto.viewY + rectF.top) + ((int) fHeight)) - (iArr3[c] + placeForPhoto.parentView.getHeight())) + placeForPhoto.clipBottomAddition;
        this.clipBottom = height;
        this.clipBottom = Math.max(0.0f, Math.max(height, f5));
        this.clipTopOrigin = 0.0f;
        this.clipTopOrigin = Math.max(0.0f, Math.max(0.0f, f5));
        this.clipBottomOrigin = 0.0f;
        this.clipBottomOrigin = Math.max(0.0f, Math.max(0.0f, f5));
        this.animationStartTime = System.currentTimeMillis();
        this.animateToX = 0.0f;
        this.animateToY = 0.0f;
        this.animateToClipBottom = 0.0f;
        this.animateToClipBottomOrigin = 0.0f;
        this.animateToClipHorizontal = 0.0f;
        this.animateToClipTop = 0.0f;
        this.animateToClipTopOrigin = 0.0f;
        this.animateToScale = 1.0f;
        this.animateToRadius = true;
        this.zoomAnimation = true;
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
        this.activityVisibilityController = LaunchActivity.obtainActivityVisibilityController();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.currentDialogId = MessageObject.getPeerId(messageObject.messageOwner.peer_id);
        this.currentMessageObject = messageObject;
        TLRPC.Document document = messageObject.getDocument();
        ImageReceiver.BitmapHolder bitmapHolder = this.currentThumb;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.currentThumb = null;
        }
        this.currentThumb = placeForPhoto.imageReceiver.getThumbBitmapSafe();
        this.seekbarContainer.setVisibility(8);
        if (document == null) {
            placeProviderObject = placeForPhoto;
            str = "window";
            f = 1.0f;
            this.actionBar.setTitle(LocaleController.getString(R.string.DisappearingPhoto));
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
            this.centerImage.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), (String) null, this.currentThumb != null ? new BitmapDrawable(this.currentThumb.bitmap) : null, -1L, (String) null, messageObject, 2);
            if (closestPhotoSizeWithSize != null) {
                this.videoWidth = closestPhotoSizeWithSize.w;
                this.videoHeight = closestPhotoSizeWithSize.h;
            }
        } else {
            for (int i4 = 0; i4 < document.attributes.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                    this.videoWidth = tL_documentAttributeVideo.w;
                    this.videoHeight = tL_documentAttributeVideo.h;
                    break;
                }
            }
            if (!MessageObject.isGifDocument(document)) {
                placeProviderObject = placeForPhoto;
                str = "window";
                f = 1.0f;
                this.playerRetryPlayCount = 1;
                this.actionBar.setTitle(LocaleController.getString(R.string.DisappearingVideo));
                File file = new File(messageObject.messageOwner.attachPath);
                if (file.exists()) {
                    preparePlayer(file);
                } else {
                    File pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner);
                    File file2 = new File(pathToMessage.getAbsolutePath() + ".enc");
                    if (file2.exists()) {
                        pathToMessage = file2;
                    }
                    preparePlayer(pathToMessage);
                }
                this.isVideo = true;
                this.seekbarContainer.setVisibility(0);
                this.centerImage.setImage((ImageLocation) null, (String) null, this.currentThumb != null ? new BitmapDrawable(this.currentThumb.bitmap) : null, -1L, (String) null, messageObject, 2);
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.DisappearingGif));
                String str2 = messageObject.messageOwner.attachPath;
                if (str2 != null && messageObject.attachPathExists) {
                    forDocument = ImageLocation.getForPath(str2);
                } else {
                    forDocument = ImageLocation.getForDocument(document);
                }
                placeProviderObject = placeForPhoto;
                str = "window";
                f = 1.0f;
                this.centerImage.setImage(forDocument, (String) null, this.currentThumb != null ? new BitmapDrawable(this.currentThumb.bitmap) : null, -1L, (String) null, messageObject, 1);
            }
        }
        setCurrentCaption(messageObject, "", false, false);
        setCurrentCaption(messageObject, messageObject.caption, false, true);
        toggleActionBar(true, false);
        showPlayButton(false, false);
        this.playButtonDrawable.setPause(true);
        if (this.ignoreDelete) {
            this.secretDeleteTimer.setOnce();
            this.secretDeleteTimer.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SecretMediaViewer.m3996$r8$lambda$aiD_rYmPKxGQ1dCHwLJFpjQS4(this.f$0, view);
                }
            });
        } else {
            this.secretDeleteTimer.setOnClickListener(null);
        }
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService(str)).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        ((WindowManager) this.parentActivity.getSystemService(str)).addView(this.windowView, this.windowLayoutParams);
        this.secretDeleteTimer.invalidate();
        this.isVisible = true;
        Window window = this.parentActivity.getWindow();
        this.wasLightNavigationBar = AndroidUtilities.getLightNavigationBar(window);
        AndroidUtilities.setLightNavigationBar(this.parentActivity, false);
        AndroidUtilities.setLightNavigationBar((View) this.windowView, false);
        Activity activity = this.parentActivity;
        if (activity instanceof LaunchActivity) {
            this.wasNavigationBarColor = ((LaunchActivity) activity).getNavigationBarColor();
            ((LaunchActivity) this.parentActivity).animateNavigationBarColor(-16777216);
        } else {
            this.wasNavigationBarColor = window.getNavigationBarColor();
            AndroidUtilities.setNavigationBarColor(this.parentActivity, -16777216);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.imageMoveAnimation = animatorSet;
        ActionBar actionBar = this.actionBar;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) property, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.captionScrollView, (Property<PhotoViewer.CaptionScrollView, Float>) property, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.secretHint, (Property<HintView2, Float>) property, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.photoBackgroundDrawable, (Property<PhotoBackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0, 255);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, (Property<SecretMediaViewer, Float>) this.ANIMATION_VALUE, 0.0f, 1.0f);
        VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = this.seekbarContainer;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(videoPlayerControlFrameLayout, (Property<VideoPlayerControlFrameLayout, Float>) videoPlayerControlFrameLayout.SEEKBAR_ALPHA, f);
        VideoPlayerControlFrameLayout videoPlayerControlFrameLayout2 = this.seekbarContainer;
        if (!this.isVideo) {
            f = 0.0f;
        }
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfInt, objectAnimatorOfFloat4, objectAnimatorOfFloat5, ObjectAnimator.ofFloat(videoPlayerControlFrameLayout2, (Property<VideoPlayerControlFrameLayout, Float>) property, f));
        this.photoAnimationInProgress = 3;
        this.photoAnimationEndRunnable = new Runnable() {
            @Override
            public final void run() {
                SecretMediaViewer.$r8$lambda$_w9CIZX6mrrxKRsIKjdYz_If59s(this.f$0, runnable, messageObject);
            }
        };
        this.imageMoveAnimation.setDuration(250L);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (SecretMediaViewer.this.photoAnimationEndRunnable != null) {
                    SecretMediaViewer.this.photoAnimationEndRunnable.run();
                    SecretMediaViewer.this.photoAnimationEndRunnable = null;
                }
            }
        });
        this.photoTransitionAnimationStartTime = System.currentTimeMillis();
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            this.containerView.setLayerType(2, null);
        }
        this.imageMoveAnimation.setInterpolator(new DecelerateInterpolator());
        this.photoBackgroundDrawable.frame = 0;
        this.photoBackgroundDrawable.drawRunnable = new Runnable() {
            @Override
            public final void run() {
                SecretMediaViewer.m3994$r8$lambda$GodSndelY6Qo7NwED9kIMUhYGo(this.f$0, placeProviderObject);
            }
        };
        this.imageMoveAnimation.start();
    }

    public static void m3996$r8$lambda$aiD_rYmPKxGQ1dCHwLJFpjQS4(SecretMediaViewer secretMediaViewer, View view) {
        MessageObject messageObject = secretMediaViewer.currentMessageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (secretMediaViewer.secretHint.shown()) {
                    secretMediaViewer.secretHint.hide();
                } else {
                    secretMediaViewer.showSecretHint();
                }
            }
        }
    }

    public static void $r8$lambda$_w9CIZX6mrrxKRsIKjdYz_If59s(SecretMediaViewer secretMediaViewer, Runnable runnable, MessageObject messageObject) {
        secretMediaViewer.photoAnimationInProgress = 0;
        secretMediaViewer.imageMoveAnimation = null;
        if (runnable != null) {
            runnable.run();
        }
        FrameLayoutDrawer frameLayoutDrawer = secretMediaViewer.containerView;
        if (frameLayoutDrawer == null) {
            return;
        }
        frameLayoutDrawer.setLayerType(0, null);
        secretMediaViewer.containerView.invalidate();
        SecretDeleteTimer secretDeleteTimer = secretMediaViewer.secretDeleteTimer;
        TLRPC.Message message = messageObject.messageOwner;
        secretDeleteTimer.setDestroyTime(message.destroyTimeMillis, message.ttl, false);
        if (secretMediaViewer.closeAfterAnimation) {
            secretMediaViewer.closePhoto(true, true);
        } else {
            if (!secretMediaViewer.ignoreDelete || MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) >= 3) {
                return;
            }
            secretMediaViewer.showSecretHint();
        }
    }

    public static void m3994$r8$lambda$GodSndelY6Qo7NwED9kIMUhYGo(SecretMediaViewer secretMediaViewer, PhotoViewer.PlaceProviderObject placeProviderObject) {
        secretMediaViewer.disableShowCheck = false;
        placeProviderObject.imageReceiver.setVisible(false, true);
    }

    public boolean isShowingImage(MessageObject messageObject) {
        MessageObject messageObject2;
        return (!this.isVisible || this.disableShowCheck || messageObject == null || (messageObject2 = this.currentMessageObject) == null || messageObject2.getId() != messageObject.getId()) ? false : true;
    }

    public void toggleActionBar(boolean z, boolean z2) {
        AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
        if (z && this.isVideo) {
            AndroidUtilities.runOnUIThread(this.hideActionBarRunnable, 3000L);
        }
        if (z) {
            this.actionBar.setVisibility(0);
        }
        this.actionBar.setEnabled(z);
        this.isActionBarVisible = z;
        showPlayButton(z, z2);
        if (z2) {
            ArrayList arrayList = new ArrayList();
            ActionBar actionBar = this.actionBar;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) property, z ? 1.0f : 0.0f));
            VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = this.seekbarContainer;
            arrayList.add(ObjectAnimator.ofFloat(videoPlayerControlFrameLayout, (Property<VideoPlayerControlFrameLayout, Float>) videoPlayerControlFrameLayout.SEEKBAR_ALPHA, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.captionScrollView, (Property<PhotoViewer.CaptionScrollView, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.seekbarBackground, (Property<View, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property, z ? 1.0f : 0.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            this.currentActionBarAnimation = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z) {
                this.currentActionBarAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (SecretMediaViewer.this.currentActionBarAnimation == null || !SecretMediaViewer.this.currentActionBarAnimation.equals(animator)) {
                            return;
                        }
                        SecretMediaViewer.this.actionBar.setVisibility(8);
                        SecretMediaViewer.this.currentActionBarAnimation = null;
                        SecretMediaViewer.this.captionScrollView.scrollTo(0, 0);
                    }
                });
            }
            this.currentActionBarAnimation.setDuration(200L);
            this.currentActionBarAnimation.start();
            return;
        }
        this.actionBar.setAlpha(z ? 1.0f : 0.0f);
        this.captionScrollView.setAlpha(z ? 1.0f : 0.0f);
        this.seekbarBackground.setAlpha(z ? 1.0f : 0.0f);
        this.navigationBar.setAlpha(z ? 1.0f : 0.0f);
        if (z) {
            return;
        }
        this.actionBar.setVisibility(8);
        this.captionScrollView.scrollTo(0, 0);
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void setOnClose(Runnable runnable) {
        this.onClose = runnable;
    }

    public void destroyPhotoViewer() {
        FrameLayout frameLayout;
        Runnable runnable = this.onClose;
        if (runnable != null) {
            runnable.run();
            this.onClose = null;
        }
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.isVisible = false;
        this.currentProvider = null;
        ImageReceiver.BitmapHolder bitmapHolder = this.currentThumb;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.currentThumb = null;
        }
        releasePlayer();
        if (this.parentActivity != null && (frameLayout = this.windowView) != null) {
            try {
                if (frameLayout.getParent() != null) {
                    ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
                }
                this.windowView = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        Instance = null;
    }

    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        boolean z;
        float f10;
        float f11;
        int i;
        float f12;
        if (this.isPhotoVisible) {
            if (this.imageMoveAnimation != null) {
                if (!this.scroller.isFinished()) {
                    this.scroller.abortAnimation();
                }
                if (this.useOvershootForScale) {
                    float f13 = this.animationValue;
                    if (f13 < 0.9f) {
                        f12 = f13 / 0.9f;
                        float f14 = this.scale;
                        f = f14 + (((this.animateToScale * 1.02f) - f14) * f12);
                    } else {
                        float f15 = this.animateToScale;
                        f = f15 + (0.01999998f * f15 * (1.0f - ((f13 - 0.9f) / 0.100000024f)));
                        f12 = 1.0f;
                    }
                    float f16 = this.translationY;
                    f2 = f16 + ((this.animateToY - f16) * f12);
                    float f17 = this.translationX;
                    f3 = f17 + ((this.animateToX - f17) * f12);
                    float f18 = this.clipTop;
                    f4 = f18 + ((this.animateToClipTop - f18) * f12);
                    float f19 = this.clipBottom;
                    f5 = f19 + ((this.animateToClipBottom - f19) * f12);
                    float f20 = this.clipTopOrigin;
                    f6 = f20 + ((this.animateToClipTopOrigin - f20) * f12);
                    float f21 = this.clipBottomOrigin;
                    f7 = f21 + ((this.animateToClipBottomOrigin - f21) * f12);
                    float f22 = this.clipHorizontal;
                    f8 = f22 + ((this.animateToClipHorizontal - f22) * f12);
                } else {
                    float f23 = this.scale;
                    float f24 = this.animateToScale - f23;
                    float f25 = this.animationValue;
                    f = (f24 * f25) + f23;
                    float f26 = this.translationY;
                    float f27 = f26 + ((this.animateToY - f26) * f25);
                    float f28 = this.translationX;
                    f3 = f28 + ((this.animateToX - f28) * f25);
                    float f29 = this.clipTop;
                    f4 = f29 + ((this.animateToClipTop - f29) * f25);
                    float f30 = this.clipBottom;
                    f5 = f30 + ((this.animateToClipBottom - f30) * f25);
                    float f31 = this.clipTopOrigin;
                    f6 = f31 + ((this.animateToClipTopOrigin - f31) * f25);
                    float f32 = this.clipBottomOrigin;
                    f7 = f32 + ((this.animateToClipBottomOrigin - f32) * f25);
                    float f33 = this.clipHorizontal;
                    f8 = f33 + ((this.animateToClipHorizontal - f33) * f25);
                    f2 = f27;
                }
                f9 = (this.animateToScale == 1.0f && this.scale == 1.0f && this.translationX == 0.0f) ? f2 : -1.0f;
                this.containerView.invalidate();
            } else {
                if (this.animationStartTime != 0) {
                    this.translationX = this.animateToX;
                    this.translationY = this.animateToY;
                    this.clipBottom = this.animateToClipBottom;
                    this.clipTop = this.animateToClipTop;
                    this.clipTopOrigin = this.animateToClipTopOrigin;
                    this.clipBottomOrigin = this.animateToClipBottomOrigin;
                    this.clipHorizontal = this.animateToClipHorizontal;
                    float f34 = this.animateToScale;
                    this.scale = f34;
                    this.animationStartTime = 0L;
                    updateMinMax(f34);
                    this.zoomAnimation = false;
                    this.useOvershootForScale = false;
                }
                if (!this.scroller.isFinished() && this.scroller.computeScrollOffset()) {
                    if (this.scroller.getStartX() < this.maxX && this.scroller.getStartX() > this.minX) {
                        this.translationX = this.scroller.getCurrX();
                    }
                    if (this.scroller.getStartY() < this.maxY && this.scroller.getStartY() > this.minY) {
                        this.translationY = this.scroller.getCurrY();
                    }
                    this.containerView.invalidate();
                }
                f = this.scale;
                f2 = this.translationY;
                f3 = this.translationX;
                f4 = this.clipTop;
                f5 = this.clipBottom;
                f6 = this.clipTopOrigin;
                f7 = this.clipBottomOrigin;
                f8 = this.clipHorizontal;
                f9 = !this.moving ? f2 : -1.0f;
            }
            if (this.animateFromRadius != null) {
                if (this.currentRadii == null) {
                    this.currentRadii = new float[8];
                }
                float f35 = this.animateToRadius ? this.animationValue : 1.0f - this.animationValue;
                int i2 = 0;
                z = true;
                for (int i3 = 8; i2 < i3; i3 = 8) {
                    float[] fArr = this.currentRadii;
                    float fLerp = AndroidUtilities.lerp(this.animateFromRadius[i2 / 2] * 2.0f, 0.0f, f35);
                    fArr[i2 + 1] = fLerp;
                    fArr[i2] = fLerp;
                    if (this.currentRadii[i2] > 0.0f) {
                        z = false;
                    }
                    i2 += 2;
                }
            } else {
                z = true;
            }
            if (this.photoAnimationInProgress == 3) {
                f10 = 1.0f;
                f11 = 0.0f;
            } else {
                if (this.scale == 1.0f && f9 != -1.0f && !this.zoomAnimation) {
                    float containerViewHeight = getContainerViewHeight() / 4.0f;
                    this.photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (1.0f - (Math.min(Math.abs(f9), containerViewHeight) / containerViewHeight)) * 255.0f));
                } else {
                    this.photoBackgroundDrawable.setAlpha(255);
                }
                if (this.zoomAnimation) {
                    f10 = 1.0f;
                    f11 = 0.0f;
                } else {
                    float f36 = this.maxX;
                    if (f3 > f36) {
                        float fMin = Math.min(1.0f, (f3 - f36) / canvas.getWidth());
                        f11 = 0.3f * fMin;
                        f10 = 1.0f - fMin;
                        f3 = this.maxX;
                    } else {
                        f10 = 1.0f;
                        f11 = 0.0f;
                    }
                }
            }
            AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
            boolean z2 = aspectRatioFrameLayout != null && aspectRatioFrameLayout.getVisibility() == 0;
            canvas.save();
            float f37 = f - f11;
            canvas.translate((getContainerViewWidth() / 2) + f3, (getContainerViewHeight() / 2) + f2);
            canvas.scale(f37, f37);
            int bitmapWidth = this.centerImage.getBitmapWidth();
            int bitmapHeight = this.centerImage.getBitmapHeight();
            int i4 = this.videoWidth;
            if (i4 != 0 && (i = this.videoHeight) != 0) {
                bitmapWidth = i4;
                bitmapHeight = i;
            }
            if (z2 && this.textureUploaded && Math.abs((bitmapWidth / bitmapHeight) - (this.videoTextureView.getMeasuredWidth() / this.videoTextureView.getMeasuredHeight())) > 0.01f) {
                bitmapWidth = this.videoTextureView.getMeasuredWidth();
                bitmapHeight = this.videoTextureView.getMeasuredHeight();
            }
            float f38 = bitmapHeight;
            float f39 = bitmapWidth;
            float fMin2 = Math.min(getContainerViewHeight() / f38, getContainerViewWidth() / f39);
            int i5 = (int) (f39 * fMin2);
            int i6 = (int) (f38 * fMin2);
            float f40 = (-i5) / 2;
            float f41 = f8 / f37;
            float f42 = f40 + f41;
            float f43 = (-i6) / 2;
            float f44 = (i5 / 2) - f41;
            float f45 = i6 / 2;
            canvas.clipRect(f42, (f4 / f37) + f43, f44, f45 - (f5 / f37));
            if (!z) {
                this.roundRectPath.reset();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f42, (f6 / f37) + f43, f44, f45 - (f7 / f37));
                this.roundRectPath.addRoundRect(rectF, this.currentRadii, Path.Direction.CW);
                canvas.clipPath(this.roundRectPath);
            }
            if (!z2 || !this.textureUploaded || !this.videoCrossfadeStarted || this.videoCrossfadeAlpha != 1.0f) {
                this.centerImage.setAlpha(f10);
                this.centerImage.setImageCoords(f40, f43, i5, i6);
                this.centerImage.draw(canvas);
            }
            if (z2) {
                if (!this.videoCrossfadeStarted && this.textureUploaded) {
                    this.videoCrossfadeStarted = true;
                    this.videoCrossfadeAlpha = 0.0f;
                    this.videoCrossfadeAlphaLastTime = System.currentTimeMillis();
                }
                canvas.translate(f40, f43);
                this.videoTextureView.setAlpha(f10 * this.videoCrossfadeAlpha);
                this.aspectRatioFrameLayout.draw(canvas);
                if (this.videoCrossfadeStarted && this.videoCrossfadeAlpha < 1.0f) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = jCurrentTimeMillis - this.videoCrossfadeAlphaLastTime;
                    this.videoCrossfadeAlphaLastTime = jCurrentTimeMillis;
                    this.videoCrossfadeAlpha += j / 200.0f;
                    this.containerView.invalidate();
                    if (this.videoCrossfadeAlpha > 1.0f) {
                        this.videoCrossfadeAlpha = 1.0f;
                    }
                }
            }
            canvas.restore();
        }
    }

    public float getVideoCrossfadeAlpha() {
        return this.videoCrossfadeAlpha;
    }

    public void setVideoCrossfadeAlpha(float f) {
        this.videoCrossfadeAlpha = f;
        this.containerView.invalidate();
    }

    private boolean checkPhotoAnimation() {
        if (this.photoAnimationInProgress != 0 && Math.abs(this.photoTransitionAnimationStartTime - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.photoAnimationEndRunnable;
            if (runnable != null) {
                runnable.run();
                this.photoAnimationEndRunnable = null;
            }
            this.photoAnimationInProgress = 0;
        }
        return this.photoAnimationInProgress != 0;
    }

    public long getOpenTime() {
        return this.openTime;
    }

    public long getCloseTime() {
        return this.closeTime;
    }

    public MessageObject getCurrentMessageObject() {
        return this.currentMessageObject;
    }

    public boolean closePhoto(boolean z, boolean z2) {
        final PhotoViewer.PlaceProviderObject placeForPhoto;
        Runnable runnable;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        if (this.parentActivity == null || !this.isPhotoVisible || checkPhotoAnimation()) {
            return false;
        }
        if (this.ignoreDelete && z2) {
            return false;
        }
        Activity activity = this.parentActivity;
        if (activity != null) {
            AndroidUtilities.setLightNavigationBar(activity, this.wasLightNavigationBar);
            AndroidUtilities.setNavigationBarColor(this.parentActivity, this.wasNavigationBarColor);
            Activity activity2 = this.parentActivity;
            if (activity2 instanceof LaunchActivity) {
                ((LaunchActivity) activity2).animateNavigationBarColor(this.wasNavigationBarColor);
            } else {
                AndroidUtilities.setNavigationBarColor(activity2, this.wasNavigationBarColor);
            }
        }
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.isActionBarVisible = false;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        this.closeTime = System.currentTimeMillis();
        PhotoViewer.PhotoViewerProvider photoViewerProvider = this.currentProvider;
        if (photoViewerProvider != null) {
            MessageObject messageObject = this.currentMessageObject;
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if ((messageMedia.photo instanceof TLRPC.TL_photoEmpty) || (messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                placeForPhoto = null;
            } else {
                placeForPhoto = photoViewerProvider.getPlaceForPhoto(messageObject, null, 0, true, false);
            }
        } else {
            placeForPhoto = null;
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.pause();
        }
        if (z) {
            this.photoAnimationInProgress = 3;
            this.containerView.invalidate();
            this.imageMoveAnimation = new AnimatorSet();
            if (placeForPhoto != null && placeForPhoto.imageReceiver.getThumbBitmap() != null && !z2 && this.onClose == null) {
                placeForPhoto.imageReceiver.setVisible(false, true);
                RectF drawRegion = placeForPhoto.imageReceiver.getDrawRegion();
                c = 7;
                float f = drawRegion.right - drawRegion.left;
                c2 = 6;
                float f2 = drawRegion.bottom - drawRegion.top;
                Point point = AndroidUtilities.displaySize;
                c3 = 5;
                int i = point.x;
                int i2 = point.y + AndroidUtilities.statusBarHeight;
                c4 = 4;
                c5 = 3;
                this.animateToScale = Math.max(f / i, f2 / i2);
                float f3 = placeForPhoto.viewX;
                float f4 = drawRegion.left;
                this.animateToX = ((f3 + f4) + (f / 2.0f)) - (i / 2);
                this.animateToY = ((placeForPhoto.viewY + drawRegion.top) + (f2 / 2.0f)) - (i2 / 2);
                this.animateToClipHorizontal = Math.abs(f4 - placeForPhoto.imageReceiver.getImageX());
                int iAbs = (int) Math.abs(drawRegion.top - placeForPhoto.imageReceiver.getImageY());
                int[] iArr = new int[2];
                placeForPhoto.parentView.getLocationInWindow(iArr);
                float f5 = (iArr[1] - (placeForPhoto.viewY + drawRegion.top)) + placeForPhoto.clipTopAddition;
                this.animateToClipTop = f5;
                float f6 = iAbs;
                this.animateToClipTop = Math.max(0.0f, Math.max(f5, f6));
                float height = (((placeForPhoto.viewY + drawRegion.top) + ((int) f2)) - (iArr[1] + placeForPhoto.parentView.getHeight())) + placeForPhoto.clipBottomAddition;
                this.animateToClipBottom = height;
                this.animateToClipBottom = Math.max(0.0f, Math.max(height, f6));
                this.animateToClipTopOrigin = 0.0f;
                this.animateToClipTopOrigin = Math.max(0.0f, Math.max(0.0f, f6));
                this.animateToClipBottomOrigin = 0.0f;
                this.animateToClipBottomOrigin = Math.max(0.0f, Math.max(0.0f, f6));
                this.animationStartTime = System.currentTimeMillis();
                this.zoomAnimation = true;
            } else {
                c = 7;
                c2 = 6;
                c3 = 5;
                c4 = 4;
                c5 = 3;
                int i3 = AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight;
                if (this.translationY < 0.0f) {
                    i3 = -i3;
                }
                this.animateToY = i3;
            }
            this.animateToRadius = false;
            showPlayButton(false, true);
            if (this.isVideo) {
                this.videoCrossfadeStarted = false;
                this.textureUploaded = false;
                AnimatorSet animatorSet = this.imageMoveAnimation;
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.photoBackgroundDrawable, (Property<PhotoBackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SecretMediaViewer, Float>) this.ANIMATION_VALUE, 0.0f, 1.0f);
                ActionBar actionBar = this.actionBar;
                Property property = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.captionScrollView, (Property<PhotoViewer.CaptionScrollView, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property, 0.0f);
                VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = this.seekbarContainer;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(videoPlayerControlFrameLayout, (Property<VideoPlayerControlFrameLayout, Float>) videoPlayerControlFrameLayout.SEEKBAR_ALPHA, 0.0f);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.seekbarContainer, (Property<VideoPlayerControlFrameLayout, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.secretHint, (Property<HintView2, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this, (Property<SecretMediaViewer, Float>) this.VIDEO_CROSSFADE_ALPHA, 0.0f);
                Animator[] animatorArr = new Animator[9];
                animatorArr[0] = objectAnimatorOfInt;
                animatorArr[1] = objectAnimatorOfFloat;
                animatorArr[2] = objectAnimatorOfFloat2;
                animatorArr[c5] = objectAnimatorOfFloat3;
                animatorArr[c4] = objectAnimatorOfFloat4;
                animatorArr[c3] = objectAnimatorOfFloat5;
                animatorArr[c2] = objectAnimatorOfFloat6;
                animatorArr[c] = objectAnimatorOfFloat7;
                animatorArr[8] = objectAnimatorOfFloat8;
                animatorSet.playTogether(animatorArr);
            } else {
                this.centerImage.setManualAlphaAnimator(true);
                AnimatorSet animatorSet2 = this.imageMoveAnimation;
                ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.photoBackgroundDrawable, (Property<PhotoBackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
                ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this, (Property<SecretMediaViewer, Float>) this.ANIMATION_VALUE, 0.0f, 1.0f);
                ActionBar actionBar2 = this.actionBar;
                Property property2 = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(actionBar2, (Property<ActionBar, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(this.captionScrollView, (Property<PhotoViewer.CaptionScrollView, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property2, 0.0f);
                VideoPlayerControlFrameLayout videoPlayerControlFrameLayout2 = this.seekbarContainer;
                ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(videoPlayerControlFrameLayout2, (Property<VideoPlayerControlFrameLayout, Float>) videoPlayerControlFrameLayout2.SEEKBAR_ALPHA, 0.0f);
                ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(this.seekbarContainer, (Property<VideoPlayerControlFrameLayout, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(this.secretHint, (Property<HintView2, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(this.centerImage, (Property<ImageReceiver, Float>) AnimationProperties.IMAGE_RECEIVER_ALPHA, 0.0f);
                Animator[] animatorArr2 = new Animator[9];
                animatorArr2[0] = objectAnimatorOfInt2;
                animatorArr2[1] = objectAnimatorOfFloat9;
                animatorArr2[2] = objectAnimatorOfFloat10;
                animatorArr2[c5] = objectAnimatorOfFloat11;
                animatorArr2[c4] = objectAnimatorOfFloat12;
                animatorArr2[c3] = objectAnimatorOfFloat13;
                animatorArr2[c2] = objectAnimatorOfFloat14;
                animatorArr2[c] = objectAnimatorOfFloat15;
                animatorArr2[8] = objectAnimatorOfFloat16;
                animatorSet2.playTogether(animatorArr2);
            }
            this.photoAnimationEndRunnable = new Runnable() {
                @Override
                public final void run() {
                    SecretMediaViewer.m3991$r8$lambda$1FmEGjwHHrohhdxS2ZZAkEtiVo(this.f$0, placeForPhoto);
                }
            };
            this.imageMoveAnimation.setInterpolator(new DecelerateInterpolator());
            this.imageMoveAnimation.setDuration(250L);
            this.imageMoveAnimation.addListener(new AnonymousClass17(placeForPhoto));
            this.photoTransitionAnimationStartTime = System.currentTimeMillis();
            this.containerView.setLayerType(2, null);
            this.imageMoveAnimation.start();
            runnable = null;
        } else {
            showPlayButton(false, true);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayoutDrawer, Float>) View.SCALE_X, 0.9f);
            ObjectAnimator objectAnimatorOfFloat18 = ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayoutDrawer, Float>) View.SCALE_Y, 0.9f);
            ObjectAnimator objectAnimatorOfInt3 = ObjectAnimator.ofInt(this.photoBackgroundDrawable, (Property<PhotoBackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
            ActionBar actionBar3 = this.actionBar;
            Property property3 = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat19 = ObjectAnimator.ofFloat(actionBar3, (Property<ActionBar, Float>) property3, 0.0f);
            ObjectAnimator objectAnimatorOfFloat20 = ObjectAnimator.ofFloat(this.captionScrollView, (Property<PhotoViewer.CaptionScrollView, Float>) property3, 0.0f);
            ObjectAnimator objectAnimatorOfFloat21 = ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property3, 0.0f);
            VideoPlayerControlFrameLayout videoPlayerControlFrameLayout3 = this.seekbarContainer;
            animatorSet3.playTogether(objectAnimatorOfFloat17, objectAnimatorOfFloat18, objectAnimatorOfInt3, objectAnimatorOfFloat19, objectAnimatorOfFloat20, objectAnimatorOfFloat21, ObjectAnimator.ofFloat(videoPlayerControlFrameLayout3, (Property<VideoPlayerControlFrameLayout, Float>) videoPlayerControlFrameLayout3.SEEKBAR_ALPHA, 0.0f), ObjectAnimator.ofFloat(this.seekbarContainer, (Property<VideoPlayerControlFrameLayout, Float>) property3, 0.0f));
            this.photoAnimationInProgress = 2;
            this.photoAnimationEndRunnable = new Runnable() {
                @Override
                public final void run() {
                    SecretMediaViewer.m3995$r8$lambda$Y0cscvIFNAqQ07bMLJdyu_i3w(this.f$0, placeForPhoto);
                }
            };
            animatorSet3.setDuration(200L);
            animatorSet3.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (SecretMediaViewer.this.photoAnimationEndRunnable != null) {
                        SecretMediaViewer.this.photoAnimationEndRunnable.run();
                        SecretMediaViewer.this.photoAnimationEndRunnable = null;
                    }
                }
            });
            this.photoTransitionAnimationStartTime = System.currentTimeMillis();
            runnable = null;
            this.containerView.setLayerType(2, null);
            animatorSet3.start();
        }
        Runnable runnable2 = this.onClose;
        if (runnable2 != null) {
            runnable2.run();
            this.onClose = runnable;
        }
        return true;
    }

    public static void m3991$r8$lambda$1FmEGjwHHrohhdxS2ZZAkEtiVo(SecretMediaViewer secretMediaViewer, PhotoViewer.PlaceProviderObject placeProviderObject) {
        secretMediaViewer.imageMoveAnimation = null;
        secretMediaViewer.photoAnimationInProgress = 0;
        secretMediaViewer.containerView.setLayerType(0, null);
        secretMediaViewer.containerView.setVisibility(4);
        secretMediaViewer.onPhotoClosed(placeProviderObject);
    }

    class AnonymousClass17 extends AnimatorListenerAdapter {
        final PhotoViewer.PlaceProviderObject val$object;

        AnonymousClass17(PhotoViewer.PlaceProviderObject placeProviderObject) {
            this.val$object = placeProviderObject;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            PhotoViewer.PlaceProviderObject placeProviderObject = this.val$object;
            if (placeProviderObject != null) {
                placeProviderObject.imageReceiver.setVisible(true, true);
            }
            SecretMediaViewer.this.isVisible = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretMediaViewer.AnonymousClass17.$r8$lambda$VsA5QgKVbUrSZCcWYNIy5CaIUrQ(this.f$0);
                }
            });
        }

        public static void $r8$lambda$VsA5QgKVbUrSZCcWYNIy5CaIUrQ(AnonymousClass17 anonymousClass17) {
            if (SecretMediaViewer.this.photoAnimationEndRunnable != null) {
                SecretMediaViewer.this.photoAnimationEndRunnable.run();
                SecretMediaViewer.this.photoAnimationEndRunnable = null;
            }
        }
    }

    public static void m3995$r8$lambda$Y0cscvIFNAqQ07bMLJdyu_i3w(SecretMediaViewer secretMediaViewer, PhotoViewer.PlaceProviderObject placeProviderObject) {
        FrameLayoutDrawer frameLayoutDrawer = secretMediaViewer.containerView;
        if (frameLayoutDrawer == null) {
            return;
        }
        frameLayoutDrawer.setLayerType(0, null);
        secretMediaViewer.containerView.setVisibility(4);
        secretMediaViewer.photoAnimationInProgress = 0;
        secretMediaViewer.onPhotoClosed(placeProviderObject);
        secretMediaViewer.containerView.setScaleX(1.0f);
        secretMediaViewer.containerView.setScaleY(1.0f);
    }

    private void onPhotoClosed(PhotoViewer.PlaceProviderObject placeProviderObject) {
        this.isVisible = false;
        this.currentProvider = null;
        this.disableShowCheck = false;
        releasePlayer();
        new ArrayList();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretMediaViewer.$r8$lambda$QyZr8o5rSvXjlgfsFK4G4w5VWTk(this.f$0);
            }
        }, 50L);
    }

    public static void $r8$lambda$QyZr8o5rSvXjlgfsFK4G4w5VWTk(SecretMediaViewer secretMediaViewer) {
        ImageReceiver.BitmapHolder bitmapHolder = secretMediaViewer.currentThumb;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            secretMediaViewer.currentThumb = null;
        }
        secretMediaViewer.centerImage.setImageBitmap((Bitmap) null);
        try {
            if (secretMediaViewer.windowView.getParent() != null) {
                ((WindowManager) secretMediaViewer.parentActivity.getSystemService("window")).removeView(secretMediaViewer.windowView);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        secretMediaViewer.isPhotoVisible = false;
    }

    public void updateMinMax(float f) {
        int imageWidth = ((int) ((this.centerImage.getImageWidth() * f) - getContainerViewWidth())) / 2;
        int imageHeight = ((int) ((this.centerImage.getImageHeight() * f) - getContainerViewHeight())) / 2;
        if (imageWidth > 0) {
            this.minX = -imageWidth;
            this.maxX = imageWidth;
        } else {
            this.maxX = 0.0f;
            this.minX = 0.0f;
        }
        if (imageHeight > 0) {
            this.minY = -imageHeight;
            this.maxY = imageHeight;
        } else {
            this.maxY = 0.0f;
            this.minY = 0.0f;
        }
    }

    private int getContainerViewWidth() {
        return this.containerView.getWidth();
    }

    private int getContainerViewHeight() {
        return this.containerView.getHeight();
    }

    public boolean processTouchEvent(MotionEvent motionEvent) {
        float f;
        if (this.photoAnimationInProgress == 0 && this.animationStartTime == 0) {
            if (motionEvent.getPointerCount() == 1 && this.gestureDetector.onTouchEvent(motionEvent) && this.doubleTap) {
                this.doubleTap = false;
                this.moving = false;
                this.zooming = false;
                checkMinMax(false);
                return true;
            }
            if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                this.discardTap = false;
                if (!this.scroller.isFinished()) {
                    this.scroller.abortAnimation();
                }
                if (!this.draggingDown) {
                    if (motionEvent.getPointerCount() == 2) {
                        this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.pinchStartScale = this.scale;
                        this.pinchCenterX = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                        this.pinchCenterY = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                        this.pinchStartX = this.translationX;
                        this.pinchStartY = this.translationY;
                        this.zooming = true;
                        this.moving = false;
                        VelocityTracker velocityTracker = this.velocityTracker;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (motionEvent.getPointerCount() == 1) {
                        this.moveStartX = motionEvent.getX();
                        float y = motionEvent.getY();
                        this.moveStartY = y;
                        this.dragY = y;
                        this.draggingDown = false;
                        this.canDragDown = true;
                        VelocityTracker velocityTracker2 = this.velocityTracker;
                        if (velocityTracker2 != null) {
                            velocityTracker2.clear();
                        }
                    }
                }
            } else {
                float f2 = 0.0f;
                if (motionEvent.getActionMasked() == 2) {
                    if (motionEvent.getPointerCount() == 2 && !this.draggingDown && this.zooming) {
                        this.discardTap = true;
                        this.scale = (((float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0))) / this.pinchStartDistance) * this.pinchStartScale;
                        this.translationX = (this.pinchCenterX - (getContainerViewWidth() / 2)) - (((this.pinchCenterX - (getContainerViewWidth() / 2)) - this.pinchStartX) * (this.scale / this.pinchStartScale));
                        float containerViewHeight = this.pinchCenterY - (getContainerViewHeight() / 2);
                        float containerViewHeight2 = (this.pinchCenterY - (getContainerViewHeight() / 2)) - this.pinchStartY;
                        float f3 = this.scale;
                        this.translationY = containerViewHeight - (containerViewHeight2 * (f3 / this.pinchStartScale));
                        updateMinMax(f3);
                        this.containerView.invalidate();
                    } else if (motionEvent.getPointerCount() == 1) {
                        VelocityTracker velocityTracker3 = this.velocityTracker;
                        if (velocityTracker3 != null) {
                            velocityTracker3.addMovement(motionEvent);
                        }
                        float fAbs = Math.abs(motionEvent.getX() - this.moveStartX);
                        float fAbs2 = Math.abs(motionEvent.getY() - this.dragY);
                        if (fAbs > AndroidUtilities.dp(3.0f) || fAbs2 > AndroidUtilities.dp(3.0f)) {
                            this.discardTap = true;
                        }
                        if (this.canDragDown && !this.draggingDown && this.scale == 1.0f && fAbs2 >= AndroidUtilities.dp(30.0f) && fAbs2 / 2.0f > fAbs) {
                            this.draggingDown = true;
                            this.moving = false;
                            this.dragY = motionEvent.getY();
                            if (this.isActionBarVisible) {
                                toggleActionBar(false, true);
                            }
                            return true;
                        }
                        if (this.draggingDown) {
                            this.translationY = motionEvent.getY() - this.dragY;
                            this.containerView.invalidate();
                        } else if (!this.invalidCoords && this.animationStartTime == 0) {
                            float x = this.moveStartX - motionEvent.getX();
                            float y2 = this.moveStartY - motionEvent.getY();
                            if (this.moving || ((this.scale == 1.0f && Math.abs(y2) + AndroidUtilities.dp(12.0f) < Math.abs(x)) || this.scale != 1.0f)) {
                                if (!this.moving) {
                                    this.moving = true;
                                    this.canDragDown = false;
                                    x = 0.0f;
                                    y2 = 0.0f;
                                }
                                this.moveStartX = motionEvent.getX();
                                this.moveStartY = motionEvent.getY();
                                updateMinMax(this.scale);
                                float f4 = this.translationX;
                                if (f4 < this.minX || f4 > this.maxX) {
                                    x /= 3.0f;
                                }
                                float f5 = this.maxY;
                                if (f5 == 0.0f) {
                                    float f6 = this.minY;
                                    if (f6 == 0.0f) {
                                        float f7 = this.translationY - y2;
                                        if (f7 < f6) {
                                            this.translationY = f6;
                                        } else if (f7 > f5) {
                                            this.translationY = f5;
                                        } else {
                                            f2 = y2;
                                        }
                                    } else {
                                        f = this.translationY;
                                        if (f >= this.minY || f > f5) {
                                            f2 = y2 / 3.0f;
                                        } else {
                                            f2 = y2;
                                        }
                                    }
                                } else {
                                    f = this.translationY;
                                    if (f >= this.minY) {
                                    }
                                    f2 = y2 / 3.0f;
                                }
                                this.translationX = f4 - x;
                                if (this.scale != 1.0f) {
                                    this.translationY -= f2;
                                }
                                this.containerView.invalidate();
                            }
                        } else {
                            this.invalidCoords = false;
                            this.moveStartX = motionEvent.getX();
                            this.moveStartY = motionEvent.getY();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                    if (this.zooming) {
                        this.invalidCoords = true;
                        float f8 = this.scale;
                        if (f8 < 1.0f) {
                            updateMinMax(1.0f);
                            animateTo(1.0f, 0.0f, 0.0f, true);
                        } else if (f8 > 3.0f) {
                            float containerViewWidth = (this.pinchCenterX - (getContainerViewWidth() / 2)) - (((this.pinchCenterX - (getContainerViewWidth() / 2)) - this.pinchStartX) * (3.0f / this.pinchStartScale));
                            float containerViewHeight3 = (this.pinchCenterY - (getContainerViewHeight() / 2)) - (((this.pinchCenterY - (getContainerViewHeight() / 2)) - this.pinchStartY) * (3.0f / this.pinchStartScale));
                            updateMinMax(3.0f);
                            float f9 = this.minX;
                            if (containerViewWidth < f9) {
                                containerViewWidth = f9;
                            } else {
                                f9 = this.maxX;
                                if (containerViewWidth > f9) {
                                    containerViewWidth = f9;
                                }
                            }
                            float f10 = this.minY;
                            if (containerViewHeight3 < f10) {
                                containerViewHeight3 = f10;
                            } else {
                                f10 = this.maxY;
                                if (containerViewHeight3 > f10) {
                                    containerViewHeight3 = f10;
                                }
                            }
                            animateTo(3.0f, containerViewWidth, containerViewHeight3, true);
                        } else {
                            checkMinMax(true);
                        }
                        this.zooming = false;
                    } else if (this.draggingDown) {
                        if (Math.abs(this.dragY - motionEvent.getY()) > getContainerViewHeight() / 6.0f) {
                            closePhoto(true, false);
                        } else {
                            animateTo(1.0f, 0.0f, 0.0f, false);
                        }
                        this.draggingDown = false;
                    } else if (this.moving) {
                        float f11 = this.translationX;
                        float f12 = this.translationY;
                        updateMinMax(this.scale);
                        this.moving = false;
                        this.canDragDown = true;
                        VelocityTracker velocityTracker4 = this.velocityTracker;
                        if (velocityTracker4 != null && this.scale == 1.0f) {
                            velocityTracker4.computeCurrentVelocity(1000);
                        }
                        float f13 = this.translationX;
                        float f14 = this.minX;
                        if (f13 < f14) {
                            f11 = f14;
                        } else {
                            f14 = this.maxX;
                            if (f13 > f14) {
                                f11 = f14;
                            }
                        }
                        float f15 = this.translationY;
                        float f16 = this.minY;
                        if (f15 < f16) {
                            f12 = f16;
                        } else {
                            f16 = this.maxY;
                            if (f15 > f16) {
                                f12 = f16;
                            }
                        }
                        animateTo(this.scale, f11, f12, false);
                    }
                }
            }
        }
        return false;
    }

    private void checkMinMax(boolean z) {
        float f = this.translationX;
        float f2 = this.translationY;
        updateMinMax(this.scale);
        float f3 = this.translationX;
        float f4 = this.minX;
        if (f3 < f4) {
            f = f4;
        } else {
            f4 = this.maxX;
            if (f3 > f4) {
                f = f4;
            }
        }
        float f5 = this.translationY;
        float f6 = this.minY;
        if (f5 < f6) {
            f2 = f6;
        } else {
            f6 = this.maxY;
            if (f5 > f6) {
                f2 = f6;
            }
        }
        animateTo(this.scale, f, f2, z);
    }

    private void animateTo(float f, float f2, float f3, boolean z) {
        animateTo(f, f2, f3, z, 250);
    }

    private void animateTo(float f, float f2, float f3, boolean z, int i) {
        if (this.scale == f && this.translationX == f2 && this.translationY == f3) {
            return;
        }
        this.zoomAnimation = z;
        this.animateToScale = f;
        this.animateToX = f2;
        this.animateToY = f3;
        this.animationStartTime = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.imageMoveAnimation = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.imageMoveAnimation.setInterpolator(this.interpolator);
        this.imageMoveAnimation.setDuration(i);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SecretMediaViewer.this.imageMoveAnimation = null;
                SecretMediaViewer.this.containerView.invalidate();
            }
        });
        this.imageMoveAnimation.start();
    }

    public void setAnimationValue(float f) {
        this.animationValue = f;
        this.containerView.invalidate();
    }

    public float getAnimationValue() {
        return this.animationValue;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.scale == 1.0f) {
            return false;
        }
        this.scroller.abortAnimation();
        this.scroller.fling(Math.round(this.translationX), Math.round(this.translationY), Math.round(f), Math.round(f2), (int) this.minX, (int) this.maxX, (int) this.minY, (int) this.maxY);
        this.containerView.postInvalidate();
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.discardTap) {
            return false;
        }
        if (this.videoPlayer != null && this.isActionBarVisible && motionEvent.getX() >= this.playButton.getX() && motionEvent.getY() >= this.playButton.getY() && motionEvent.getX() <= this.playButton.getX() + this.playButton.getMeasuredWidth() && motionEvent.getX() <= this.playButton.getX() + this.playButton.getMeasuredWidth()) {
            VideoPlayer videoPlayer = this.videoPlayer;
            videoPlayer.setPlayWhenReady(!videoPlayer.getPlayWhenReady());
            if (this.videoPlayer.getPlayWhenReady()) {
                toggleActionBar(true, true);
            } else {
                showPlayButton(true, true);
            }
        } else {
            toggleActionBar(!this.isActionBarVisible, true);
        }
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        float f = this.scale;
        boolean z = false;
        if (f == 1.0f && (this.translationY != 0.0f || this.translationX != 0.0f)) {
            return false;
        }
        if (this.animationStartTime == 0 && this.photoAnimationInProgress == 0) {
            z = true;
            if (f == 1.0f) {
                float x = (motionEvent.getX() - (getContainerViewWidth() / 2)) - (((motionEvent.getX() - (getContainerViewWidth() / 2)) - this.translationX) * (3.0f / this.scale));
                float y = (motionEvent.getY() - (getContainerViewHeight() / 2)) - (((motionEvent.getY() - (getContainerViewHeight() / 2)) - this.translationY) * (3.0f / this.scale));
                updateMinMax(3.0f);
                float f2 = this.minX;
                if (x < f2) {
                    x = f2;
                } else {
                    f2 = this.maxX;
                    if (x > f2) {
                        x = f2;
                    }
                }
                float f3 = this.minY;
                if (y < f3) {
                    y = f3;
                } else {
                    f3 = this.maxY;
                    if (y > f3) {
                        y = f3;
                    }
                }
                animateTo(3.0f, x, y, true);
            } else {
                animateTo(1.0f, 0.0f, 0.0f, true);
            }
            this.doubleTap = true;
        }
        return z;
    }

    class VideoPlayerControlFrameLayout extends FrameLayout {
        public final Property SEEKBAR_ALPHA;
        private boolean ignoreLayout;
        private int lastTimeWidth;
        private int parentHeight;
        private int parentWidth;
        private float progress;
        private boolean seekBarTransitionEnabled;
        private SpringAnimation timeSpring;
        private FloatValueHolder timeValue;
        private boolean translationYAnimationEnabled;

        public VideoPlayerControlFrameLayout(Context context) {
            super(context);
            this.progress = 1.0f;
            this.seekBarTransitionEnabled = true;
            this.translationYAnimationEnabled = true;
            this.timeValue = new FloatValueHolder(0.0f);
            this.timeSpring = (SpringAnimation) new SpringAnimation(this.timeValue).setSpring(new SpringForce(0.0f).setStiffness(750.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    SecretMediaViewer.VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = this.f$0;
                    SecretMediaViewer.this.seekbar.setSize((int) (((videoPlayerControlFrameLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f) - (videoPlayerControlFrameLayout.parentWidth > videoPlayerControlFrameLayout.parentHeight ? AndroidUtilities.dp(48.0f) : 0)), videoPlayerControlFrameLayout.getMeasuredHeight());
                }
            });
            this.SEEKBAR_ALPHA = new AnimationProperties.FloatProperty("progress") {
                @Override
                public void setValue(VideoPlayerControlFrameLayout videoPlayerControlFrameLayout, float f) {
                    videoPlayerControlFrameLayout.setProgress(f);
                }

                @Override
                public Float get(VideoPlayerControlFrameLayout videoPlayerControlFrameLayout) {
                    return Float.valueOf(videoPlayerControlFrameLayout.getProgress());
                }
            };
            setWillNotDraw(false);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.progress < 1.0f) {
                return false;
            }
            if (SecretMediaViewer.this.seekbar.onTouch(motionEvent.getAction(), motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY())) {
                getParent().requestDisallowInterceptTouchEvent(true);
                SecretMediaViewer.this.seekbarView.invalidate();
            }
            return true;
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.timeValue.setValue(0.0f);
            this.lastTimeWidth = 0;
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            long duration;
            String str;
            this.ignoreLayout = true;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SecretMediaViewer.this.videoPlayerTime.getLayoutParams();
            if (this.parentWidth > this.parentHeight) {
                iDp = AndroidUtilities.dp(48.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
                iDp = 0;
            }
            this.ignoreLayout = false;
            super.onMeasure(i, i2);
            if (SecretMediaViewer.this.videoPlayer != null) {
                duration = SecretMediaViewer.this.videoPlayer.getDuration();
                if (duration == -9223372036854775807L) {
                    duration = 0;
                }
            } else {
                duration = 0;
            }
            long j = duration / 1000;
            long j2 = j / 60;
            if (j2 > 60) {
                str = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60), Long.valueOf(j % 60));
            } else {
                str = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j2), Long.valueOf(j % 60));
            }
            int iCeil = (int) Math.ceil(SecretMediaViewer.this.videoPlayerTime.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", str)));
            this.timeSpring.cancel();
            if (this.lastTimeWidth != 0) {
                float f = iCeil;
                if (this.timeValue.getValue() == f) {
                    SecretMediaViewer.this.seekbar.setSize(((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - iCeil) - iDp, getMeasuredHeight());
                    this.timeValue.setValue(iCeil);
                } else {
                    this.timeSpring.getSpring().setFinalPosition(f);
                    this.timeSpring.start();
                }
            } else {
                SecretMediaViewer.this.seekbar.setSize(((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - iCeil) - iDp, getMeasuredHeight());
                this.timeValue.setValue(iCeil);
            }
            this.lastTimeWidth = iCeil;
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            SecretMediaViewer.this.seekbar.setProgress(SecretMediaViewer.this.videoPlayer != null ? SecretMediaViewer.this.videoPlayer.getCurrentPosition() / SecretMediaViewer.this.videoPlayer.getDuration() : 0.0f);
        }

        public float getProgress() {
            return this.progress;
        }

        public void setProgress(float f) {
            if (this.progress != f) {
                this.progress = f;
                onProgressChanged(f);
            }
        }

        private void onProgressChanged(float f) {
            SecretMediaViewer.this.videoPlayerTime.setAlpha(f);
            if (this.seekBarTransitionEnabled) {
                SecretMediaViewer.this.videoPlayerTime.setPivotX(SecretMediaViewer.this.videoPlayerTime.getWidth());
                SecretMediaViewer.this.videoPlayerTime.setPivotY(SecretMediaViewer.this.videoPlayerTime.getHeight());
                float f2 = 1.0f - f;
                float f3 = 1.0f - (0.1f * f2);
                SecretMediaViewer.this.videoPlayerTime.setScaleX(f3);
                SecretMediaViewer.this.videoPlayerTime.setScaleY(f3);
                SecretMediaViewer.this.seekbar.setTransitionProgress(f2);
                return;
            }
            if (this.translationYAnimationEnabled) {
                setTranslationY(AndroidUtilities.dpf2(24.0f) * (1.0f - f));
            }
            SecretMediaViewer.this.seekbarView.setAlpha(f);
        }
    }

    private void setCaptionHwLayerEnabled(boolean z) {
        if (this.captionHwLayerEnabled != z) {
            this.captionHwLayerEnabled = z;
            this.captionTextViewSwitcher.setLayerType(2, null);
            this.captionTextViewSwitcher.getCurrentView().setLayerType(2, null);
            this.captionTextViewSwitcher.getNextView().setLayerType(2, null);
        }
    }
}
