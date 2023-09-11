package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
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
import android.text.style.URLSpan;
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
import androidx.annotation.Keep;
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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
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
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.HintView2;
public class SecretMediaViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile SecretMediaViewer Instance;
    private ActionBar actionBar;
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
    private boolean canDragDown;
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
    private final Runnable hideActionBarRunnable;
    private boolean ignoreDelete;
    private AnimatorSet imageMoveAnimation;
    private DecelerateInterpolator interpolator;
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
    private float pinchStartScale;
    private float pinchStartX;
    private float pinchStartY;
    private ImageView playButton;
    private PlayPauseDrawable playButtonDrawable;
    private boolean playButtonShown;
    private int playerRetryPlayCount;
    private Path roundRectPath;
    private float scale;
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
    private final Runnable updateProgressRunnable;
    private boolean useOvershootForScale;
    private VelocityTracker velocityTracker;
    private float videoCrossfadeAlpha;
    private long videoCrossfadeAlphaLastTime;
    private boolean videoCrossfadeStarted;
    private int videoHeight;
    private VideoPlayer videoPlayer;
    private final int[] videoPlayerCurrentTime;
    private SimpleTextView videoPlayerTime;
    private final int[] videoPlayerTotalTime;
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
    private boolean isActionBarVisible = true;
    private PhotoBackgroundDrawable photoBackgroundDrawable = new PhotoBackgroundDrawable(-16777216);

    public void onLinkClick(ClickableSpan clickableSpan, TextView textView) {
    }

    public void onLinkLongPress(URLSpan uRLSpan, TextView textView, Runnable runnable) {
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

    public SecretMediaViewer() {
        new Paint();
        this.scale = 1.0f;
        this.interpolator = new DecelerateInterpolator(1.5f);
        this.pinchStartScale = 1.0f;
        this.canDragDown = true;
        this.updateProgressRunnable = new Runnable() {
            @Override
            public final void run() {
                SecretMediaViewer.this.lambda$new$0();
            }
        };
        this.videoPlayerCurrentTime = new int[2];
        this.videoPlayerTotalTime = new int[2];
        this.hideActionBarRunnable = new Runnable() {
            @Override
            public final void run() {
                SecretMediaViewer.this.lambda$new$6();
            }
        };
        this.roundRectPath = new Path();
    }

    static int access$1510(SecretMediaViewer secretMediaViewer) {
        int i = secretMediaViewer.playerRetryPlayCount;
        secretMediaViewer.playerRetryPlayCount = i - 1;
        return i;
    }

    public class FrameLayoutDrawer extends FrameLayout {
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

    public class SecretDeleteTimer extends FrameLayout {
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
            this.particlePaint.setStrokeCap(Paint.Cap.ROUND);
            this.particlePaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint(1);
            this.afterDeleteProgressPaint = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.afterDeleteProgressPaint.setStrokeCap(Paint.Cap.ROUND);
            this.afterDeleteProgressPaint.setColor(-1644826);
            this.afterDeleteProgressPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Paint paint3 = new Paint(1);
            this.circlePaint = paint3;
            paint3.setColor(2130706432);
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
            float dpf2 = AndroidUtilities.dpf2(10.5f);
            this.deleteProgressRect.set(measuredWidth - dpf2, measuredHeight - dpf2, measuredWidth + dpf2, dpf2 + measuredHeight);
            setPivotX(measuredWidth);
            setPivotY(measuredHeight);
        }

        @Override
        @SuppressLint({"DrawAllocation"})
        protected void onDraw(Canvas canvas) {
            float max;
            if (SecretMediaViewer.this.currentMessageObject != null) {
                if (SecretMediaViewer.this.currentMessageObject.messageOwner.destroyTime != 0 || SecretMediaViewer.this.currentMessageObject.messageOwner.ttl == Integer.MAX_VALUE) {
                    if (this.useVideoProgress) {
                        if (SecretMediaViewer.this.videoPlayer != null) {
                            long duration = SecretMediaViewer.this.videoPlayer.getDuration();
                            long currentPosition = SecretMediaViewer.this.videoPlayer.getCurrentPosition();
                            if (duration != -9223372036854775807L && currentPosition != -9223372036854775807L) {
                                max = 1.0f - (((float) currentPosition) / ((float) duration));
                            }
                        }
                        max = 1.0f;
                    } else {
                        max = ((float) Math.max(0L, this.destroyTime - (System.currentTimeMillis() + (ConnectionsManager.getInstance(SecretMediaViewer.this.currentAccount).getTimeDifference() * 1000)))) / (((float) this.destroyTtl) * 1000.0f);
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
                        float centerX = this.deleteProgressRect.centerX();
                        float centerY = this.deleteProgressRect.centerY() - AndroidUtilities.dp(1.0f);
                        float dp = AndroidUtilities.dp(8.0f);
                        this.drawable.setBounds((int) (centerX - dp), (int) (centerY - dp), (int) (centerX + dp), (int) (centerY + dp));
                        this.drawable.draw(canvas);
                        float f2 = max * (-360.0f);
                        canvas.drawArc(this.deleteProgressRect, -90.0f, f2, false, this.afterDeleteProgressPaint);
                        this.timerParticles.draw(canvas, this.particlePaint, this.deleteProgressRect, f2, 1.0f);
                    }
                    invalidate();
                }
            }
        }
    }

    public class PhotoBackgroundDrawable extends ColorDrawable {
        private Runnable drawRunnable;
        private int frame;

        public PhotoBackgroundDrawable(int i) {
            super(i);
        }

        @Override
        @Keep
        public void setAlpha(int i) {
            if (SecretMediaViewer.this.parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) SecretMediaViewer.this.parentActivity).drawerLayoutContainer.setAllowDrawContent((SecretMediaViewer.this.isPhotoVisible && i == 255) ? false : true);
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
        SecretMediaViewer secretMediaViewer = Instance;
        if (secretMediaViewer == null) {
            synchronized (PhotoViewer.class) {
                secretMediaViewer = Instance;
                if (secretMediaViewer == null) {
                    secretMediaViewer = new SecretMediaViewer();
                    Instance = secretMediaViewer;
                }
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
                } else if (!closePhoto(true, true)) {
                    this.closeAfterAnimation = true;
                }
            }
        } else if (i == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.currentMessageObject == null || this.secretDeleteTimer == null || ((Long) objArr[0]).longValue() != this.currentDialogId) {
                return;
            }
            SparseArray sparseArray = (SparseArray) objArr[1];
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                int keyAt = sparseArray.keyAt(i3);
                ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (this.currentMessageObject.getId() == ((Integer) arrayList.get(i4)).intValue()) {
                        this.currentMessageObject.messageOwner.destroyTime = keyAt;
                        this.secretDeleteTimer.invalidate();
                        return;
                    }
                }
            }
        } else if (i == NotificationCenter.updateMessageMedia && this.currentMessageObject.getId() == ((TLRPC$Message) objArr[0]).id) {
            if (this.isVideo && !this.videoWatchedOneTime) {
                this.closeVideoAfterWatch = true;
            } else if (!closePhoto(true, true)) {
                this.closeAfterAnimation = true;
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

    public class AnonymousClass2 implements VideoPlayer.VideoPlayerDelegate {
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
            return false;
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
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
                        }
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        secretMediaViewer.closePhoto(true, !secretMediaViewer.ignoreDelete);
                    }
                }
            } else if (SecretMediaViewer.this.isPlaying) {
            } else {
                SecretMediaViewer.this.isPlaying = true;
            }
        }

        @Override
        public void onError(VideoPlayer videoPlayer, Exception exc) {
            if (SecretMediaViewer.this.playerRetryPlayCount > 0) {
                SecretMediaViewer.access$1510(SecretMediaViewer.this);
                final File file = this.val$file;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SecretMediaViewer.AnonymousClass2.this.lambda$onError$0(file);
                    }
                }, 100L);
                return;
            }
            FileLog.e(exc);
        }

        public void lambda$onError$0(File file) {
            SecretMediaViewer.this.preparePlayer(file);
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

    public void lambda$new$0() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return;
        }
        long currentPosition = videoPlayer.getCurrentPosition();
        long duration = this.videoPlayer.getDuration();
        if (duration == -9223372036854775807L) {
            currentPosition = 0;
            duration = 0;
        }
        if (duration > 0 && !this.seekbar.isDragging()) {
            this.seekbar.setProgress(((float) currentPosition) / ((float) duration));
            this.seekbarView.invalidate();
        }
        updateVideoPlayerTime();
        if (this.videoPlayer.isPlaying()) {
            AndroidUtilities.runOnUIThread(this.updateProgressRunnable, 17L);
        }
    }

    private void updateVideoPlayerTime() {
        String format;
        String format2;
        Arrays.fill(this.videoPlayerCurrentTime, 0);
        Arrays.fill(this.videoPlayerTotalTime, 0);
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            long max = Math.max(0L, videoPlayer.getCurrentPosition()) / 1000;
            long max2 = Math.max(0L, this.videoPlayer.getDuration()) / 1000;
            int[] iArr = this.videoPlayerCurrentTime;
            iArr[0] = (int) (max / 60);
            iArr[1] = (int) (max % 60);
            int[] iArr2 = this.videoPlayerTotalTime;
            iArr2[0] = (int) (max2 / 60);
            iArr2[1] = (int) (max2 % 60);
        }
        int[] iArr3 = this.videoPlayerCurrentTime;
        if (iArr3[0] >= 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(iArr3[0] / 60), Integer.valueOf(this.videoPlayerCurrentTime[0] % 60), Integer.valueOf(this.videoPlayerCurrentTime[1]));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(iArr3[0]), Integer.valueOf(this.videoPlayerCurrentTime[1]));
        }
        int[] iArr4 = this.videoPlayerTotalTime;
        if (iArr4[0] >= 60) {
            format2 = String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(iArr4[0] / 60), Integer.valueOf(this.videoPlayerTotalTime[0] % 60), Integer.valueOf(this.videoPlayerTotalTime[1]));
        } else {
            format2 = String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(iArr4[0]), Integer.valueOf(this.videoPlayerTotalTime[1]));
        }
        this.videoPlayerTime.setText(String.format(Locale.ROOT, "%s / %s", format, format2));
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
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 21 && SecretMediaViewer.this.lastInsets != null) {
                    WindowInsets windowInsets = (WindowInsets) SecretMediaViewer.this.lastInsets;
                    if (AndroidUtilities.incorrectDisplaySizeFix) {
                        int i5 = AndroidUtilities.displaySize.y;
                        if (size2 > i5) {
                            size2 = i5;
                        }
                        size2 += AndroidUtilities.statusBarHeight;
                    }
                    size2 -= windowInsets.getSystemWindowInsetBottom();
                    size -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i6 = AndroidUtilities.displaySize.y;
                    if (size2 > i6) {
                        size2 = i6;
                    }
                }
                setMeasuredDimension(size, size2);
                if (i4 >= 21 && SecretMediaViewer.this.lastInsets != null) {
                    size -= ((WindowInsets) SecretMediaViewer.this.lastInsets).getSystemWindowInsetLeft();
                }
                SecretMediaViewer.this.containerView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }

            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                int systemWindowInsetLeft = (Build.VERSION.SDK_INT < 21 || SecretMediaViewer.this.lastInsets == null) ? 0 : ((WindowInsets) SecretMediaViewer.this.lastInsets).getSystemWindowInsetLeft() + 0;
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
                    int currentActionBarHeight = ((ActionBar.getCurrentActionBarHeight() - SecretMediaViewer.this.secretDeleteTimer.getMeasuredHeight()) / 2) + (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0);
                    SecretMediaViewer.this.secretDeleteTimer.layout(SecretMediaViewer.this.secretDeleteTimer.getLeft(), currentActionBarHeight, SecretMediaViewer.this.secretDeleteTimer.getRight(), SecretMediaViewer.this.secretDeleteTimer.getMeasuredHeight() + currentActionBarHeight);
                }
                if (SecretMediaViewer.this.secretHint != null && SecretMediaViewer.this.secretDeleteTimer != null) {
                    int currentActionBarHeight2 = ((((ActionBar.getCurrentActionBarHeight() - SecretMediaViewer.this.secretDeleteTimer.getMeasuredHeight()) / 2) + (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0)) + SecretMediaViewer.this.secretDeleteTimer.getMeasuredHeight()) - AndroidUtilities.dp(10.0f);
                    SecretMediaViewer.this.secretHint.layout(SecretMediaViewer.this.secretHint.getLeft(), currentActionBarHeight2, SecretMediaViewer.this.secretHint.getRight(), SecretMediaViewer.this.secretHint.getMeasuredHeight() + currentActionBarHeight2);
                }
                if (SecretMediaViewer.this.captionScrollView != null) {
                    int currentActionBarHeight3 = ActionBar.getCurrentActionBarHeight() + (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0);
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
                    SecretMediaViewer.this.captionScrollView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(((measuredHeight - ActionBar.getCurrentActionBarHeight()) - (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0)) - (SecretMediaViewer.this.seekbarContainer.getVisibility() == 0 ? SecretMediaViewer.this.seekbarContainer.getMeasuredHeight() : 0), 1073741824));
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
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            this.containerView.setFitsSystemWindows(true);
            this.containerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsets lambda$setParentActivity$1;
                    lambda$setParentActivity$1 = SecretMediaViewer.this.lambda$setParentActivity$1(view2, windowInsets);
                    return lambda$setParentActivity$1;
                }
            });
            this.containerView.setSystemUiVisibility(1792);
        }
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
        this.actionBar.setOccupyStatusBar(i2 >= 21);
        this.actionBar.setItemsBackgroundColor(1090519039, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(70.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
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
                        SecretMediaViewer.this.videoPlayer.seekTo(f * ((float) duration), false);
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
                        SecretMediaViewer.this.videoPlayer.seekTo(f * ((float) duration), false);
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
        TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = new TextSelectionHelper.SimpleTextSelectionHelper(this, null, new DarkThemeResourceProvider()) {
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
                View lambda$setParentActivity$2;
                lambda$setParentActivity$2 = SecretMediaViewer.this.lambda$setParentActivity$2(activity);
                return lambda$setParentActivity$2;
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
        if (i2 >= 21) {
            layoutParams2.flags = -2147417848;
        } else {
            layoutParams2.flags = 8;
        }
        layoutParams2.flags |= LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM;
        this.centerImage.setParentView(this.containerView);
        this.centerImage.setForceCrossfade(true);
        TextSelectionHelper<Cell>.TextSelectionOverlay overlayView = this.textSelectionHelper.getOverlayView(this.windowView.getContext());
        if (overlayView != null) {
            AndroidUtilities.removeFromParent(overlayView);
            this.containerView.addView(overlayView);
        }
        this.textSelectionHelper.setParentView(this.containerView);
        this.textSelectionHelper.setInvalidateParent();
    }

    public WindowInsets lambda$setParentActivity$1(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = (WindowInsets) this.lastInsets;
        this.lastInsets = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            this.windowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public View lambda$setParentActivity$2(Activity activity) {
        return new PhotoViewer.CaptionTextView(activity, this.captionScrollView, this.textSelectionHelper, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                SecretMediaViewer.this.onLinkClick((ClickableSpan) obj, (TextView) obj2);
            }
        }, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                SecretMediaViewer.this.onLinkLongPress((URLSpan) obj, (TextView) obj2, (Runnable) obj3);
            }
        });
    }

    private void setCurrentCaption(MessageObject messageObject, CharSequence charSequence, boolean z, boolean z2) {
        boolean z3;
        TLRPC$Message tLRPC$Message;
        int i;
        CharSequence cloneSpans = AnimatedEmojiSpan.cloneSpans(charSequence, 3);
        boolean z4 = false;
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
                protected void onScrollEnd() {
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
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.captionTextViewSwitcher.getCurrentView().getText());
        PhotoViewer.CaptionTextViewSwitcher captionTextViewSwitcher = this.captionTextViewSwitcher;
        TextView nextView = z2 ? captionTextViewSwitcher.getNextView() : captionTextViewSwitcher.getCurrentView();
        int maxLines = nextView.getMaxLines();
        if (maxLines == 1) {
            this.captionTextViewSwitcher.getCurrentView().setSingleLine(false);
            this.captionTextViewSwitcher.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.captionTextViewSwitcher.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.captionTextViewSwitcher.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.captionTextViewSwitcher.getCurrentView().setEllipsize(null);
            this.captionTextViewSwitcher.getNextView().setEllipsize(null);
        }
        nextView.setScrollX(0);
        PhotoViewer.CaptionScrollView captionScrollView2 = this.captionScrollView;
        captionScrollView2.dontChangeTopMargin = false;
        if (z2 && (i = Build.VERSION.SDK_INT) >= 19) {
            if (i >= 23) {
                TransitionManager.endTransitions(captionScrollView2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new AnonymousClass12(2, isEmpty2, isEmpty)).addTransition(new AnonymousClass11(1, isEmpty2, isEmpty)).setDuration(200L);
            if (!isEmpty2) {
                this.captionScrollView.dontChangeTopMargin = true;
                duration.addTransition(new AnonymousClass13());
            }
            if (isEmpty2 && !isEmpty) {
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
        if (!isEmpty) {
            Theme.createChatResources(null, true);
            if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || tLRPC$Message.translatedText == null || !TextUtils.equals(tLRPC$Message.translatedToLanguage, TranslateAlert2.getToLanguage())) {
                if (messageObject != null && !messageObject.messageOwner.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    messageObject.addEntitiesToText(spannableString, true, false);
                    if (messageObject.isVideo()) {
                        MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableString, false, 3, (int) messageObject.getDuration(), false);
                    }
                    cloneSpans = Emoji.replaceEmoji(spannableString, nextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
                } else {
                    cloneSpans = Emoji.replaceEmoji(new SpannableStringBuilder(cloneSpans), nextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
                }
            }
            this.captionTextViewSwitcher.setTag(cloneSpans);
            try {
                this.captionTextViewSwitcher.setText(cloneSpans, z2, false);
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
            this.captionTextViewSwitcher.setVisibility(4, (!z3 || isEmpty2) ? true : true);
            this.captionTextViewSwitcher.setTag(null);
        }
        if (this.captionTextViewSwitcher.getCurrentView() instanceof PhotoViewer.CaptionTextView) {
            ((PhotoViewer.CaptionTextView) this.captionTextViewSwitcher.getCurrentView()).setLoading(z);
        }
    }

    public class AnonymousClass12 extends Fade {
        final boolean val$isCaptionEmpty;
        final boolean val$isCurrentCaptionEmpty;

        AnonymousClass12(int i, boolean z, boolean z2) {
            super(i);
            this.val$isCurrentCaptionEmpty = z;
            this.val$isCaptionEmpty = z2;
        }

        @Override
        public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
            if (!this.val$isCurrentCaptionEmpty && this.val$isCaptionEmpty && view == SecretMediaViewer.this.captionTextViewSwitcher) {
                onDisappear.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SecretMediaViewer.this.captionScrollView.setVisibility(4);
                        SecretMediaViewer.this.captionScrollView.backgroundAlpha = 1.0f;
                    }
                });
                ((ObjectAnimator) onDisappear).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SecretMediaViewer.AnonymousClass12.this.lambda$onDisappear$0(valueAnimator);
                    }
                });
            }
            return onDisappear;
        }

        public void lambda$onDisappear$0(ValueAnimator valueAnimator) {
            SecretMediaViewer.this.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SecretMediaViewer.this.captionScrollView.invalidate();
        }
    }

    public class AnonymousClass11 extends Fade {
        final boolean val$isCaptionEmpty;
        final boolean val$isCurrentCaptionEmpty;

        AnonymousClass11(int i, boolean z, boolean z2) {
            super(i);
            this.val$isCurrentCaptionEmpty = z;
            this.val$isCaptionEmpty = z2;
        }

        @Override
        public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
            if (this.val$isCurrentCaptionEmpty && !this.val$isCaptionEmpty && view == SecretMediaViewer.this.captionTextViewSwitcher) {
                onAppear.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SecretMediaViewer.this.captionScrollView.backgroundAlpha = 1.0f;
                    }
                });
                ((ObjectAnimator) onAppear).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SecretMediaViewer.AnonymousClass11.this.lambda$onAppear$0(valueAnimator);
                    }
                });
            }
            return onAppear;
        }

        public void lambda$onAppear$0(ValueAnimator valueAnimator) {
            SecretMediaViewer.this.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SecretMediaViewer.this.captionScrollView.invalidate();
        }
    }

    public class AnonymousClass13 extends Transition {
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
            int intValue;
            if (transitionValues.view != SecretMediaViewer.this.captionScrollView) {
                if (transitionValues2.view != SecretMediaViewer.this.captionTextViewSwitcher || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(SecretMediaViewer.this.captionTextViewSwitcher, View.TRANSLATION_Y, 0.0f, intValue);
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SecretMediaViewer.this.captionTextViewSwitcher.setTranslationY(0.0f);
                    }
                });
                return ofFloat;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
            ofInt.addListener(new AnimatorListenerAdapter() {
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
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SecretMediaViewer.AnonymousClass13.this.lambda$createAnimator$0(valueAnimator);
                }
            });
            return ofInt;
        }

        public void lambda$createAnimator$0(ValueAnimator valueAnimator) {
            SecretMediaViewer.this.captionScrollView.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
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
        this.secretHint.setInnerPadding(12, 7, 11, 7);
        this.secretHint.setIconMargin(2);
        this.secretHint.setIconTranslate(0.0f, 0.0f);
        int i = R.raw.fire_on;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        rLottieDrawable.start();
        this.secretHint.setIcon(rLottieDrawable);
        this.secretHint.show();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public void openMedia(MessageObject messageObject, PhotoViewer.PhotoViewerProvider photoViewerProvider, final Runnable runnable, Runnable runnable2) {
        final PhotoViewer.PlaceProviderObject placeForPhoto;
        int i;
        float f;
        char c;
        ImageLocation forDocument;
        if (this.parentActivity == null || messageObject == null || !messageObject.needDrawBluredPreview() || photoViewerProvider == null || (placeForPhoto = photoViewerProvider.getPlaceForPhoto(messageObject, null, 0, true)) == null) {
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
        float width = rectF.width();
        float height = rectF.height();
        Point point = AndroidUtilities.displaySize;
        int i2 = point.x;
        this.scale = Math.max(width / i2, height / (point.y + (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0)));
        int[] iArr = placeForPhoto.radius;
        if (iArr != null) {
            this.animateFromRadius = new int[iArr.length];
            int i3 = 0;
            while (true) {
                int[] iArr2 = placeForPhoto.radius;
                if (i3 >= iArr2.length) {
                    break;
                }
                this.animateFromRadius[i3] = iArr2[i3];
                i3++;
            }
        } else {
            this.animateFromRadius = null;
        }
        float f2 = rectF.left;
        this.translationX = ((placeForPhoto.viewX + f2) + (width / 2.0f)) - (i2 / 2);
        this.translationY = ((placeForPhoto.viewY + rectF.top) + (height / 2.0f)) - (i / 2);
        this.clipHorizontal = Math.abs(f2 - placeForPhoto.imageReceiver.getImageX());
        int abs = (int) Math.abs(rectF.top - placeForPhoto.imageReceiver.getImageY());
        int[] iArr3 = new int[2];
        placeForPhoto.parentView.getLocationInWindow(iArr3);
        int i4 = iArr3[1];
        int i5 = Build.VERSION.SDK_INT;
        float f3 = ((i4 - (i5 >= 21 ? 0 : AndroidUtilities.statusBarHeight)) - (placeForPhoto.viewY + rectF.top)) + placeForPhoto.clipTopAddition;
        this.clipTop = f3;
        float f4 = abs;
        this.clipTop = Math.max(0.0f, Math.max(f3, f4));
        float height2 = (((placeForPhoto.viewY + rectF.top) + ((int) height)) - ((iArr3[1] + placeForPhoto.parentView.getHeight()) - (i5 >= 21 ? 0 : AndroidUtilities.statusBarHeight))) + placeForPhoto.clipBottomAddition;
        this.clipBottom = height2;
        this.clipBottom = Math.max(0.0f, Math.max(height2, f4));
        this.clipTopOrigin = 0.0f;
        this.clipTopOrigin = Math.max(0.0f, Math.max(0.0f, f4));
        this.clipBottomOrigin = 0.0f;
        this.clipBottomOrigin = Math.max(0.0f, Math.max(0.0f, f4));
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
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.currentDialogId = MessageObject.getPeerId(messageObject.messageOwner.peer_id);
        this.currentMessageObject = messageObject;
        TLRPC$Document document = messageObject.getDocument();
        ImageReceiver.BitmapHolder bitmapHolder = this.currentThumb;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.currentThumb = null;
        }
        this.currentThumb = placeForPhoto.imageReceiver.getThumbBitmapSafe();
        this.seekbarContainer.setVisibility(8);
        if (document != null) {
            int i6 = 0;
            while (true) {
                if (i6 >= document.attributes.size()) {
                    break;
                }
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(i6);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                    TLRPC$TL_documentAttributeVideo tLRPC$TL_documentAttributeVideo = (TLRPC$TL_documentAttributeVideo) tLRPC$DocumentAttribute;
                    this.videoWidth = tLRPC$TL_documentAttributeVideo.w;
                    this.videoHeight = tLRPC$TL_documentAttributeVideo.h;
                    break;
                }
                i6++;
            }
            if (MessageObject.isGifDocument(document)) {
                this.actionBar.setTitle(LocaleController.getString("DisappearingGif", R.string.DisappearingGif));
                String str = messageObject.messageOwner.attachPath;
                if (str != null && messageObject.attachPathExists) {
                    forDocument = ImageLocation.getForPath(str);
                } else {
                    forDocument = ImageLocation.getForDocument(document);
                }
                f = 1.0f;
                c = 4;
                this.centerImage.setImage(forDocument, (String) null, this.currentThumb != null ? new BitmapDrawable(this.currentThumb.bitmap) : null, -1L, (String) null, messageObject, 1);
                SecretDeleteTimer secretDeleteTimer = this.secretDeleteTimer;
                TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                secretDeleteTimer.setDestroyTime(tLRPC$Message.destroyTime * 1000, tLRPC$Message.ttl, false);
            } else {
                f = 1.0f;
                c = 4;
                this.playerRetryPlayCount = 1;
                this.actionBar.setTitle(LocaleController.getString("DisappearingVideo", R.string.DisappearingVideo));
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
                int i7 = messageObject.messageOwner.destroyTime;
                System.currentTimeMillis();
                ConnectionsManager.getInstance(this.currentAccount).getTimeDifference();
                messageObject.getDuration();
                SecretDeleteTimer secretDeleteTimer2 = this.secretDeleteTimer;
                TLRPC$Message tLRPC$Message2 = messageObject.messageOwner;
                secretDeleteTimer2.setDestroyTime(tLRPC$Message2.destroyTime * 1000, tLRPC$Message2.ttl, false);
            }
        } else {
            f = 1.0f;
            c = 4;
            this.actionBar.setTitle(LocaleController.getString("DisappearingPhoto", R.string.DisappearingPhoto));
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
            this.centerImage.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), (String) null, this.currentThumb != null ? new BitmapDrawable(this.currentThumb.bitmap) : null, -1L, (String) null, messageObject, 2);
            SecretDeleteTimer secretDeleteTimer3 = this.secretDeleteTimer;
            TLRPC$Message tLRPC$Message3 = messageObject.messageOwner;
            secretDeleteTimer3.setDestroyTime(tLRPC$Message3.destroyTime * 1000, tLRPC$Message3.ttl, false);
            if (closestPhotoSizeWithSize != null) {
                this.videoWidth = closestPhotoSizeWithSize.w;
                this.videoHeight = closestPhotoSizeWithSize.h;
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
                    SecretMediaViewer.this.lambda$openMedia$3(view);
                }
            });
        } else {
            this.secretDeleteTimer.setOnClickListener(null);
        }
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
        this.secretDeleteTimer.invalidate();
        this.isVisible = true;
        Window window = this.parentActivity.getWindow();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 21) {
            this.wasLightNavigationBar = AndroidUtilities.getLightNavigationBar(window);
            AndroidUtilities.setLightNavigationBar(window, false);
            AndroidUtilities.setLightNavigationBar((View) this.windowView, false);
            Activity activity = this.parentActivity;
            if (activity instanceof LaunchActivity) {
                this.wasNavigationBarColor = ((LaunchActivity) activity).getNavigationBarColor();
                ((LaunchActivity) this.parentActivity).animateNavigationBarColor(-16777216);
            } else {
                this.wasNavigationBarColor = window.getNavigationBarColor();
                AndroidUtilities.setNavigationBarColor(window, -16777216);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.imageMoveAnimation = animatorSet;
        Animator[] animatorArr = new Animator[7];
        animatorArr[0] = ObjectAnimator.ofFloat(this.actionBar, View.ALPHA, 0.0f, 1.0f);
        animatorArr[1] = ObjectAnimator.ofFloat(this.captionScrollView, View.ALPHA, f);
        animatorArr[2] = ObjectAnimator.ofFloat(this.secretHint, View.ALPHA, 0.0f, 1.0f);
        animatorArr[3] = ObjectAnimator.ofInt(this.photoBackgroundDrawable, (Property<PhotoBackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0, 255);
        animatorArr[c] = ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f);
        VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = this.seekbarContainer;
        animatorArr[5] = ObjectAnimator.ofFloat(videoPlayerControlFrameLayout, videoPlayerControlFrameLayout.SEEKBAR_ALPHA, f);
        VideoPlayerControlFrameLayout videoPlayerControlFrameLayout2 = this.seekbarContainer;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        if (!this.isVideo) {
            f = 0.0f;
        }
        fArr[0] = f;
        animatorArr[6] = ObjectAnimator.ofFloat(videoPlayerControlFrameLayout2, property, fArr);
        animatorSet.playTogether(animatorArr);
        this.photoAnimationInProgress = 3;
        this.photoAnimationEndRunnable = new Runnable() {
            @Override
            public final void run() {
                SecretMediaViewer.this.lambda$openMedia$4(runnable);
            }
        };
        this.imageMoveAnimation.setDuration(250L);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (SecretMediaViewer.this.photoAnimationEndRunnable != null) {
                    Runnable runnable3 = SecretMediaViewer.this.photoAnimationEndRunnable;
                    SecretMediaViewer.this.photoAnimationEndRunnable = null;
                    runnable3.run();
                }
            }
        });
        this.photoTransitionAnimationStartTime = System.currentTimeMillis();
        if (i8 >= 18 && SharedConfig.getDevicePerformanceClass() == 0) {
            this.containerView.setLayerType(2, null);
        }
        this.imageMoveAnimation.setInterpolator(new DecelerateInterpolator());
        this.photoBackgroundDrawable.frame = 0;
        this.photoBackgroundDrawable.drawRunnable = new Runnable() {
            @Override
            public final void run() {
                SecretMediaViewer.this.lambda$openMedia$5(placeForPhoto);
            }
        };
        this.imageMoveAnimation.start();
    }

    public void lambda$openMedia$3(View view) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (tLRPC$Message.destroyTime != 0 || tLRPC$Message.ttl == Integer.MAX_VALUE) {
                if (this.secretHint.shown()) {
                    this.secretHint.hide();
                } else {
                    showSecretHint();
                }
            }
        }
    }

    public void lambda$openMedia$4(Runnable runnable) {
        this.photoAnimationInProgress = 0;
        this.imageMoveAnimation = null;
        if (runnable != null) {
            runnable.run();
        }
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        if (frameLayoutDrawer == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            frameLayoutDrawer.setLayerType(0, null);
        }
        this.containerView.invalidate();
        if (this.closeAfterAnimation) {
            closePhoto(true, true);
        } else if (!this.ignoreDelete || MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) >= 3) {
        } else {
            showSecretHint();
        }
    }

    public void lambda$openMedia$5(PhotoViewer.PlaceProviderObject placeProviderObject) {
        this.disableShowCheck = false;
        placeProviderObject.imageReceiver.setVisible(false, true);
    }

    public boolean isShowingImage(MessageObject messageObject) {
        MessageObject messageObject2;
        return (!this.isVisible || this.disableShowCheck || messageObject == null || (messageObject2 = this.currentMessageObject) == null || messageObject2.getId() != messageObject.getId()) ? false : true;
    }

    public void lambda$new$6() {
        toggleActionBar(false, true);
    }

    private void toggleActionBar(boolean z, boolean z2) {
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
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(actionBar, property, fArr));
            VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = this.seekbarContainer;
            Property<VideoPlayerControlFrameLayout, Float> property2 = videoPlayerControlFrameLayout.SEEKBAR_ALPHA;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(videoPlayerControlFrameLayout, property2, fArr2));
            PhotoViewer.CaptionScrollView captionScrollView = this.captionScrollView;
            Property property3 = View.ALPHA;
            float[] fArr3 = new float[1];
            fArr3[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(captionScrollView, property3, fArr3));
            View view = this.seekbarBackground;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(view, property4, fArr4));
            View view2 = this.navigationBar;
            Property property5 = View.ALPHA;
            float[] fArr5 = new float[1];
            fArr5[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(view2, property5, fArr5));
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

    public void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.onDraw(android.graphics.Canvas):void");
    }

    @Keep
    public float getVideoCrossfadeAlpha() {
        return this.videoCrossfadeAlpha;
    }

    @Keep
    public void setVideoCrossfadeAlpha(float f) {
        this.videoCrossfadeAlpha = f;
        this.containerView.invalidate();
    }

    private boolean checkPhotoAnimation() {
        if (this.photoAnimationInProgress != 0 && Math.abs(this.photoTransitionAnimationStartTime - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.photoAnimationEndRunnable;
            if (runnable != null) {
                this.photoAnimationEndRunnable = null;
                runnable.run();
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

    public boolean closePhoto(boolean r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.closePhoto(boolean, boolean):boolean");
    }

    public void lambda$closePhoto$7(PhotoViewer.PlaceProviderObject placeProviderObject) {
        this.imageMoveAnimation = null;
        this.photoAnimationInProgress = 0;
        if (Build.VERSION.SDK_INT >= 18) {
            this.containerView.setLayerType(0, null);
        }
        this.containerView.setVisibility(4);
        onPhotoClosed(placeProviderObject);
    }

    public class AnonymousClass16 extends AnimatorListenerAdapter {
        final PhotoViewer.PlaceProviderObject val$object;

        AnonymousClass16(PhotoViewer.PlaceProviderObject placeProviderObject) {
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
                    SecretMediaViewer.AnonymousClass16.this.lambda$onAnimationEnd$0();
                }
            });
        }

        public void lambda$onAnimationEnd$0() {
            if (SecretMediaViewer.this.photoAnimationEndRunnable != null) {
                Runnable runnable = SecretMediaViewer.this.photoAnimationEndRunnable;
                SecretMediaViewer.this.photoAnimationEndRunnable = null;
                runnable.run();
            }
        }
    }

    public void lambda$closePhoto$8(PhotoViewer.PlaceProviderObject placeProviderObject) {
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        if (frameLayoutDrawer == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            frameLayoutDrawer.setLayerType(0, null);
        }
        this.containerView.setVisibility(4);
        this.photoAnimationInProgress = 0;
        onPhotoClosed(placeProviderObject);
        this.containerView.setScaleX(1.0f);
        this.containerView.setScaleY(1.0f);
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
                SecretMediaViewer.this.lambda$onPhotoClosed$9();
            }
        }, 50L);
    }

    public void lambda$onPhotoClosed$9() {
        ImageReceiver.BitmapHolder bitmapHolder = this.currentThumb;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.currentThumb = null;
        }
        this.centerImage.setImageBitmap((Bitmap) null);
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.isPhotoVisible = false;
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
            return;
        }
        this.maxY = 0.0f;
        this.minY = 0.0f;
    }

    private int getContainerViewWidth() {
        return this.containerView.getWidth();
    }

    private int getContainerViewHeight() {
        return this.containerView.getHeight();
    }

    public boolean processTouchEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.processTouchEvent(android.view.MotionEvent):boolean");
    }

    private void checkMinMax(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.checkMinMax(boolean):void");
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

    @Keep
    public void setAnimationValue(float f) {
        this.animationValue = f;
        this.containerView.invalidate();
    }

    @Keep
    public float getAnimationValue() {
        return this.animationValue;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.scale != 1.0f) {
            this.scroller.abortAnimation();
            this.scroller.fling(Math.round(this.translationX), Math.round(this.translationY), Math.round(f), Math.round(f2), (int) this.minX, (int) this.maxX, (int) this.minY, (int) this.maxY);
            this.containerView.postInvalidate();
            return false;
        }
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
    public boolean onDoubleTap(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public class VideoPlayerControlFrameLayout extends FrameLayout {
        public final Property<VideoPlayerControlFrameLayout, Float> SEEKBAR_ALPHA;
        private boolean ignoreLayout;
        private int lastTimeWidth;
        private int parentHeight;
        private int parentWidth;
        private float progress;
        private boolean seekBarTransitionEnabled;
        private SpringAnimation timeSpring;
        private FloatValueHolder timeValue;
        private boolean translationYAnimationEnabled;

        public void lambda$new$0(DynamicAnimation dynamicAnimation, float f, float f2) {
            SecretMediaViewer.this.seekbar.setSize((int) (((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f) - (this.parentWidth > this.parentHeight ? AndroidUtilities.dp(48.0f) : 0)), getMeasuredHeight());
        }

        public VideoPlayerControlFrameLayout(Context context) {
            super(context);
            this.progress = 1.0f;
            this.seekBarTransitionEnabled = true;
            this.translationYAnimationEnabled = true;
            this.timeValue = new FloatValueHolder(0.0f);
            this.timeSpring = new SpringAnimation(this.timeValue).setSpring(new SpringForce(0.0f).setStiffness(750.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    SecretMediaViewer.VideoPlayerControlFrameLayout.this.lambda$new$0(dynamicAnimation, f, f2);
                }
            });
            this.SEEKBAR_ALPHA = new AnimationProperties.FloatProperty<VideoPlayerControlFrameLayout>(this, "progress") {
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
            int i3;
            String format;
            this.ignoreLayout = true;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SecretMediaViewer.this.videoPlayerTime.getLayoutParams();
            if (this.parentWidth > this.parentHeight) {
                i3 = AndroidUtilities.dp(48.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
                i3 = 0;
            }
            this.ignoreLayout = false;
            super.onMeasure(i, i2);
            long j = 0;
            if (SecretMediaViewer.this.videoPlayer != null) {
                long duration = SecretMediaViewer.this.videoPlayer.getDuration();
                if (duration != -9223372036854775807L) {
                    j = duration;
                }
            }
            long j2 = j / 1000;
            long j3 = j2 / 60;
            if (j3 > 60) {
                format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60), Long.valueOf(j2 % 60));
            } else {
                format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j3), Long.valueOf(j2 % 60));
            }
            int ceil = (int) Math.ceil(SecretMediaViewer.this.videoPlayerTime.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
            this.timeSpring.cancel();
            if (this.lastTimeWidth != 0) {
                float f = ceil;
                if (this.timeValue.getValue() != f) {
                    this.timeSpring.getSpring().setFinalPosition(f);
                    this.timeSpring.start();
                    this.lastTimeWidth = ceil;
                }
            }
            SecretMediaViewer.this.seekbar.setSize(((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i3, getMeasuredHeight());
            this.timeValue.setValue(ceil);
            this.lastTimeWidth = ceil;
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            SecretMediaViewer.this.seekbar.setProgress(SecretMediaViewer.this.videoPlayer != null ? ((float) SecretMediaViewer.this.videoPlayer.getCurrentPosition()) / ((float) SecretMediaViewer.this.videoPlayer.getDuration()) : 0.0f);
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
