package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.Property;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
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
import org.telegram.ui.Stories.recorder.HintView2;

public final class SecretMediaViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer Instance;
    public final ChatActivity.AnonymousClass5 ANIMATION_VALUE;
    public final ChatActivity.AnonymousClass5 VIDEO_CROSSFADE_ALPHA;
    public AnonymousClass5 actionBar;
    public LaunchActivity.ActivityVisibilityController activityVisibilityController;
    public int[] animateFromRadius;
    public float animateToClipBottom;
    public float animateToClipBottomOrigin;
    public float animateToClipHorizontal;
    public float animateToClipTop;
    public float animateToClipTopOrigin;
    public boolean animateToRadius;
    public float animateToScale;
    public float animateToX;
    public float animateToY;
    public long animationStartTime;
    public float animationValue;
    public AspectRatioFrameLayout aspectRatioFrameLayout;
    public boolean canDragDown;
    public FrameLayout captionContainer;
    public boolean captionHwLayerEnabled;
    public PhotoViewer.AnonymousClass72 captionScrollView;
    public PhotoViewer.CaptionTextViewSwitcher captionTextViewSwitcher;
    public float clipBottom;
    public float clipBottomOrigin;
    public float clipHorizontal;
    public float clipTop;
    public float clipTopOrigin;
    public boolean closeAfterAnimation;
    public long closeTime;
    public boolean closeVideoAfterWatch;
    public IntroActivity.AnonymousClass1 containerView;
    public int currentAccount;
    public AnimatorSet currentActionBarAnimation;
    public long currentDialogId;
    public MessageObject currentMessageObject;
    public ChatActivity.AnonymousClass7 currentProvider;
    public float[] currentRadii;
    public ImageReceiver.BitmapHolder currentThumb;
    public boolean disableShowCheck;
    public boolean discardTap;
    public boolean doubleTap;
    public float dragY;
    public boolean draggingDown;
    public GestureDetector gestureDetector;
    public final SecretMediaViewer$$ExternalSyntheticLambda1 hideActionBarRunnable;
    public boolean ignoreDelete;
    public AnimatorSet imageMoveAnimation;
    public final DecelerateInterpolator interpolator;
    public boolean invalidCoords;
    public boolean isPhotoVisible;
    public boolean isPlaying;
    public boolean isVideo;
    public boolean isVisible;
    public WindowInsets lastInsets;
    public float maxX;
    public float maxY;
    public float minX;
    public float minY;
    public float moveStartX;
    public float moveStartY;
    public boolean moving;
    public View navigationBar;
    public Runnable onClose;
    public long openTime;
    public Activity parentActivity;
    public Runnable photoAnimationEndRunnable;
    public int photoAnimationInProgress;
    public long photoTransitionAnimationStartTime;
    public float pinchCenterX;
    public float pinchCenterY;
    public float pinchStartDistance;
    public float pinchStartScale;
    public float pinchStartX;
    public float pinchStartY;
    public ImageView playButton;
    public PlayPauseDrawable playButtonDrawable;
    public boolean playButtonShown;
    public int playerRetryPlayCount;
    public final Path roundRectPath;
    public float scale;
    public Scroller scroller;
    public SecretDeleteTimer secretDeleteTimer;
    public HintView2 secretHint;
    public VideoPlayerSeekBar seekbar;
    public View seekbarBackground;
    public VideoPlayerControlFrameLayout seekbarContainer;
    public QrActivity.AnonymousClass2 seekbarView;
    public PhotoViewer.AnonymousClass21 textSelectionHelper;
    public boolean textureUploaded;
    public float translationX;
    public float translationY;
    public final SecretMediaViewer$$ExternalSyntheticLambda1 updateProgressRunnable;
    public float videoCrossfadeAlpha;
    public long videoCrossfadeAlphaLastTime;
    public boolean videoCrossfadeStarted;
    public int videoHeight;
    public AnonymousClass1 videoPlayer;
    public final int[] videoPlayerCurrentTime;
    public SimpleTextView videoPlayerTime;
    public final int[] videoPlayerTotalTime;
    public TextureView videoTextureView;
    public boolean videoWatchedOneTime;
    public int videoWidth;
    public boolean wasLightNavigationBar;
    public int wasNavigationBarColor;
    public WindowManager.LayoutParams windowLayoutParams;
    public LoginActivity.AnonymousClass4 windowView;
    public boolean zoomAnimation;
    public boolean zooming;
    public final ImageReceiver centerImage = new ImageReceiver();
    public boolean isActionBarVisible = true;
    public final PhotoBackgroundDrawable photoBackgroundDrawable = new PhotoBackgroundDrawable();

    public final class AnonymousClass1 extends VideoPlayer {
        public AnonymousClass1() {
            super(true, false);
        }

        @Override
        public final void pause() {
            super.pause();
            SecretMediaViewer.this.playButtonDrawable.setPause(false, true);
        }

        @Override
        public final void play() {
            super.play();
            SecretMediaViewer.this.playButtonDrawable.setPause(true, true);
        }

        @Override
        public final void setPlayWhenReady(boolean z) {
            super.setPlayWhenReady(z);
            SecretMediaViewer.this.playButtonDrawable.setPause(z, true);
        }
    }

    public final class AnonymousClass11 extends Fade {
        public final int $r8$classId;
        public final SecretMediaViewer this$0;
        public final boolean val$isCaptionEmpty;
        public final boolean val$isCurrentCaptionEmpty;

        public AnonymousClass11(SecretMediaViewer secretMediaViewer, boolean z, boolean z2, int i) {
            super(1);
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.this$0 = secretMediaViewer;
                    this.val$isCurrentCaptionEmpty = z;
                    this.val$isCaptionEmpty = z2;
                    super(2);
                    break;
                default:
                    this.this$0 = secretMediaViewer;
                    this.val$isCurrentCaptionEmpty = z;
                    this.val$isCaptionEmpty = z2;
                    break;
            }
        }

        @Override
        public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            switch (this.$r8$classId) {
                case 0:
                    Animator animatorOnAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                    if (this.val$isCurrentCaptionEmpty && !this.val$isCaptionEmpty && view == this.this$0.captionTextViewSwitcher) {
                        animatorOnAppear.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 10));
                        ((ObjectAnimator) animatorOnAppear).addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 3));
                    }
                    return animatorOnAppear;
                default:
                    return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
            }
        }

        @Override
        public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            switch (this.$r8$classId) {
                case 1:
                    Animator animatorOnDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                    if (!this.val$isCurrentCaptionEmpty && this.val$isCaptionEmpty && view == this.this$0.captionTextViewSwitcher) {
                        animatorOnDisappear.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 11));
                        ((ObjectAnimator) animatorOnDisappear).addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 4));
                    }
                    return animatorOnDisappear;
                default:
                    return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
            }
        }
    }

    public final class AnonymousClass14 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final SecretMediaViewer this$0;

        public AnonymousClass14(SecretMediaViewer secretMediaViewer, int i) {
            this.$r8$classId = i;
            this.this$0 = secretMediaViewer;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    SecretMediaViewer secretMediaViewer = this.this$0;
                    Runnable runnable = secretMediaViewer.photoAnimationEndRunnable;
                    if (runnable != null) {
                        runnable.run();
                        secretMediaViewer.photoAnimationEndRunnable = null;
                    }
                    break;
                case 1:
                    SecretMediaViewer secretMediaViewer2 = this.this$0;
                    AnimatorSet animatorSet = secretMediaViewer2.currentActionBarAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        secretMediaViewer2.actionBar.setVisibility(8);
                        secretMediaViewer2.currentActionBarAnimation = null;
                        secretMediaViewer2.captionScrollView.scrollTo(0, 0);
                        break;
                    }
                    break;
                case 2:
                    SecretMediaViewer secretMediaViewer3 = this.this$0;
                    Runnable runnable2 = secretMediaViewer3.photoAnimationEndRunnable;
                    if (runnable2 != null) {
                        runnable2.run();
                        secretMediaViewer3.photoAnimationEndRunnable = null;
                    }
                    break;
                default:
                    SecretMediaViewer secretMediaViewer4 = this.this$0;
                    secretMediaViewer4.imageMoveAnimation = null;
                    secretMediaViewer4.containerView.invalidate();
                    break;
            }
        }
    }

    public final class AnonymousClass5 extends ActionBar {
        public AnonymousClass5(Activity activity) {
            super(activity, null);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            secretMediaViewer.secretHint.setAlpha(f);
            secretMediaViewer.secretDeleteTimer.setAlpha(f);
        }
    }

    public final class PhotoBackgroundDrawable extends ColorDrawable {
        public QrActivity$$ExternalSyntheticLambda17 drawRunnable;
        public int frame;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            QrActivity$$ExternalSyntheticLambda17 qrActivity$$ExternalSyntheticLambda17;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.frame != 2 || (qrActivity$$ExternalSyntheticLambda17 = this.drawRunnable) == null) {
                    invalidateSelf();
                } else {
                    qrActivity$$ExternalSyntheticLambda17.run();
                    this.drawRunnable = null;
                }
                this.frame++;
            }
        }

        @Override
        public final void setAlpha(int i) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            LaunchActivity.ActivityVisibilityController activityVisibilityController = secretMediaViewer.activityVisibilityController;
            if (activityVisibilityController != null) {
                activityVisibilityController.setHidden(secretMediaViewer.isPhotoVisible && i == 255);
            }
            super.setAlpha(i);
        }

        @Override
        public final void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4 + AndroidUtilities.navigationBarHeight);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += AndroidUtilities.navigationBarHeight;
            super.setBounds(rect);
        }
    }

    public final class SecretDeleteTimer extends FrameLayout {
        public final Paint afterDeleteProgressPaint;
        public final RectF deleteProgressRect;
        public long destroyTime;
        public long destroyTtl;
        public final RLottieDrawable drawable;
        public boolean once;
        public StaticLayout onceLayout;
        public float onceLayoutHeight;
        public float onceLayoutWidth;
        public final TextPaint oncePaint;
        public final Paint particlePaint;
        public final TimerParticles timerParticles;

        public SecretDeleteTimer(Activity activity) {
            super(activity);
            this.deleteProgressRect = new RectF();
            this.timerParticles = new TimerParticles(40);
            this.oncePaint = new TextPaint(1);
            setWillNotDraw(false);
            Paint paint = new Paint(1);
            this.particlePaint = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            paint.setColor(-1644826);
            Paint.Cap cap = Paint.Cap.ROUND;
            paint.setStrokeCap(cap);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint(1);
            this.afterDeleteProgressPaint = paint2;
            paint2.setStyle(style);
            paint2.setStrokeCap(cap);
            paint2.setColor(-1644826);
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            new Paint(1).setColor(2130706432);
            int i = R.raw.fire_on;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), true, null);
            this.drawable = rLottieDrawable;
            rLottieDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            rLottieDrawable.masterParent = this;
            rLottieDrawable.start();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            MessageObject messageObject = secretMediaViewer.currentMessageObject;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                    float fMax = this.destroyTime == 0 ? 1.0f : Math.max(0L, this.destroyTime - (System.currentTimeMillis() + ((long) (ConnectionsManager.getInstance(secretMediaViewer.currentAccount).getTimeDifference() * 1000)))) / (this.destroyTtl * 1000.0f);
                    boolean z = this.once;
                    Paint paint = this.particlePaint;
                    Paint paint2 = this.afterDeleteProgressPaint;
                    float f = fMax;
                    RectF rectF = this.deleteProgressRect;
                    if (z) {
                        canvas.save();
                        canvas.translate(rectF.centerX() - (this.onceLayoutWidth / 2.0f), rectF.centerY() - (this.onceLayoutHeight / 2.0f));
                        this.onceLayout.draw(canvas);
                        canvas.restore();
                        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
                        float f2 = 19.285715f;
                        for (int i = 0; i < 5; i++) {
                            canvas.drawArc(rectF, f2 + 270.0f, 12.857143f, false, paint2);
                            f2 += 32.14286f;
                        }
                        this.timerParticles.draw(0.0f, 1.0f, canvas, paint, rectF);
                    } else {
                        float fCenterX = rectF.centerX();
                        float fCenterY = rectF.centerY() - AndroidUtilities.dp(1.0f);
                        float fDp = AndroidUtilities.dp(8.0f);
                        RLottieDrawable rLottieDrawable = this.drawable;
                        rLottieDrawable.setBounds((int) (fCenterX - fDp), (int) (fCenterY - fDp), (int) (fCenterX + fDp), (int) (fCenterY + fDp));
                        rLottieDrawable.draw(canvas);
                        float f3 = f * (-360.0f);
                        canvas.drawArc(rectF, -90.0f, f3, false, paint2);
                        this.timerParticles.draw(f3, 1.0f, canvas, paint, rectF);
                    }
                    invalidate();
                }
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            float measuredHeight = getMeasuredHeight() / 2.0f;
            float fDpf2 = AndroidUtilities.dpf2(10.5f);
            this.deleteProgressRect.set(measuredWidth - fDpf2, measuredHeight - fDpf2, measuredWidth + fDpf2, fDpf2 + measuredHeight);
            setPivotX(measuredWidth);
            setPivotY(measuredHeight);
        }
    }

    public final class VideoPlayerControlFrameLayout extends FrameLayout {
        public final ChatActivity.AnonymousClass5 SEEKBAR_ALPHA;
        public boolean ignoreLayout;
        public int lastTimeWidth;
        public float progress;
        public final boolean seekBarTransitionEnabled;
        public final SpringAnimation timeSpring;
        public final FloatValueHolder timeValue;
        public final boolean translationYAnimationEnabled;

        public VideoPlayerControlFrameLayout(Activity activity) {
            super(activity);
            this.progress = 1.0f;
            this.seekBarTransitionEnabled = true;
            this.translationYAnimationEnabled = true;
            FloatValueHolder floatValueHolder = new FloatValueHolder(0.0f);
            this.timeValue = floatValueHolder;
            SpringAnimation springAnimation = new SpringAnimation(floatValueHolder);
            zzlt.m(0.0f, 750.0f, 1.0f, springAnimation);
            springAnimation.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(this, 13));
            this.timeSpring = springAnimation;
            this.SEEKBAR_ALPHA = new ChatActivity.AnonymousClass5("progress", 19);
            setWillNotDraw(false);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.timeValue.mValue = 0.0f;
            this.lastTimeWidth = 0;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            AnonymousClass1 anonymousClass1 = secretMediaViewer.videoPlayer;
            secretMediaViewer.seekbar.setProgress(anonymousClass1 != null ? anonymousClass1.getCurrentPosition() / secretMediaViewer.videoPlayer.getDuration() : 0.0f, false);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            long duration;
            View view;
            this.ignoreLayout = true;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            ((FrameLayout.LayoutParams) secretMediaViewer.videoPlayerTime.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
            this.ignoreLayout = false;
            super.onMeasure(i, i2);
            AnonymousClass1 anonymousClass1 = secretMediaViewer.videoPlayer;
            if (anonymousClass1 != null) {
                duration = anonymousClass1.getDuration();
                if (duration == -9223372036854775807L) {
                    duration = 0;
                }
            } else {
                duration = 0;
            }
            long j = duration / 1000;
            long j2 = j / 60;
            int iCeil = (int) Math.ceil(secretMediaViewer.videoPlayerTime.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", j2 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60), Long.valueOf(j % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j2), Long.valueOf(j % 60)))));
            SpringAnimation springAnimation = this.timeSpring;
            springAnimation.cancel();
            int i3 = this.lastTimeWidth;
            FloatValueHolder floatValueHolder = this.timeValue;
            if (i3 != 0) {
                float f = iCeil;
                if (floatValueHolder.mValue != f) {
                    springAnimation.mSpring.mFinalPosition = f;
                    springAnimation.start();
                } else {
                    VideoPlayerSeekBar videoPlayerSeekBar = secretMediaViewer.seekbar;
                    int iM = RichMessageLayout$$ExternalSyntheticOutline2.m(getMeasuredWidth(), 16.0f, iCeil);
                    int measuredHeight = getMeasuredHeight();
                    videoPlayerSeekBar.width = iM;
                    videoPlayerSeekBar.height = measuredHeight;
                    view = videoPlayerSeekBar.parentView;
                    if (view != null) {
                        view.invalidate();
                    }
                    floatValueHolder.mValue = iCeil;
                }
            } else {
                VideoPlayerSeekBar videoPlayerSeekBar2 = secretMediaViewer.seekbar;
                int iM2 = RichMessageLayout$$ExternalSyntheticOutline2.m(getMeasuredWidth(), 16.0f, iCeil);
                int measuredHeight2 = getMeasuredHeight();
                videoPlayerSeekBar2.width = iM2;
                videoPlayerSeekBar2.height = measuredHeight2;
                view = videoPlayerSeekBar2.parentView;
                if (view != null) {
                    view.invalidate();
                }
                floatValueHolder.mValue = iCeil;
            }
            this.lastTimeWidth = iCeil;
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.progress < 1.0f) {
                return false;
            }
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            if (secretMediaViewer.seekbar.onTouch(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
                getParent().requestDisallowInterceptTouchEvent(true);
                secretMediaViewer.seekbarView.invalidate();
            }
            return true;
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        public final void setProgress(float f) {
            if (this.progress != f) {
                this.progress = f;
                SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                secretMediaViewer.videoPlayerTime.setAlpha(f);
                if (!this.seekBarTransitionEnabled) {
                    if (this.translationYAnimationEnabled) {
                        setTranslationY((1.0f - f) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.seekbarView.setAlpha(f);
                    return;
                }
                SimpleTextView simpleTextView = secretMediaViewer.videoPlayerTime;
                simpleTextView.setPivotX(simpleTextView.getWidth());
                SimpleTextView simpleTextView2 = secretMediaViewer.videoPlayerTime;
                simpleTextView2.setPivotY(simpleTextView2.getHeight());
                float f2 = 1.0f - f;
                float f3 = 1.0f - (0.1f * f2);
                secretMediaViewer.videoPlayerTime.setScaleX(f3);
                secretMediaViewer.videoPlayerTime.setScaleY(f3);
                VideoPlayerSeekBar videoPlayerSeekBar = secretMediaViewer.seekbar;
                if (videoPlayerSeekBar.transitionProgress != f2) {
                    videoPlayerSeekBar.transitionProgress = f2;
                    videoPlayerSeekBar.parentView.invalidate();
                }
            }
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.scale = 1.0f;
        this.interpolator = new DecelerateInterpolator(1.5f);
        this.pinchStartScale = 1.0f;
        this.canDragDown = true;
        this.updateProgressRunnable = new SecretMediaViewer$$ExternalSyntheticLambda1(this, 2);
        this.videoPlayerCurrentTime = new int[2];
        this.videoPlayerTotalTime = new int[2];
        this.hideActionBarRunnable = new SecretMediaViewer$$ExternalSyntheticLambda1(this, 3);
        this.roundRectPath = new Path();
        this.VIDEO_CROSSFADE_ALPHA = new ChatActivity.AnonymousClass5("videoCrossfadeAlpha", 17);
        this.ANIMATION_VALUE = new ChatActivity.AnonymousClass5("animationValue", 18);
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

    public final void animateTo$1(float f, float f2, float f3, boolean z) {
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
        this.imageMoveAnimation.setDuration(250);
        this.imageMoveAnimation.addListener(new AnonymousClass14(this, 3));
        this.imageMoveAnimation.start();
    }

    public final void checkMinMax$1(boolean z) {
        float f = this.translationX;
        float f2 = this.translationY;
        updateMinMax$1(this.scale);
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
        animateTo$1(this.scale, f, f2, z);
    }

    public final boolean closePhoto(boolean z, boolean z2) {
        PhotoViewer.PlaceProviderObject placeProviderObjectAccess$1000;
        Runnable runnable;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        int i = 1;
        if (this.parentActivity == null || !this.isPhotoVisible) {
            return false;
        }
        if (this.photoAnimationInProgress != 0 && Math.abs(this.photoTransitionAnimationStartTime - System.currentTimeMillis()) >= 500) {
            Runnable runnable2 = this.photoAnimationEndRunnable;
            if (runnable2 != null) {
                runnable2.run();
                this.photoAnimationEndRunnable = null;
            }
            this.photoAnimationInProgress = 0;
        }
        if (this.photoAnimationInProgress != 0) {
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
        LaunchActivity.ActivityVisibilityController activityVisibilityController = this.activityVisibilityController;
        if (activityVisibilityController != null) {
            activityVisibilityController.setHidden(false);
            activityVisibilityController.destroyed = true;
            this.activityVisibilityController = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.isActionBarVisible = false;
        this.closeTime = System.currentTimeMillis();
        ChatActivity.AnonymousClass7 anonymousClass7 = this.currentProvider;
        if (anonymousClass7 != null) {
            MessageObject messageObject = this.currentMessageObject;
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if ((messageMedia.photo instanceof TLRPC.TL_photoEmpty) || (messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                placeProviderObjectAccess$1000 = null;
            } else {
                placeProviderObjectAccess$1000 = ChatActivity.access$1000(ChatActivity.this, messageObject, null, 0, true, false);
            }
        } else {
            placeProviderObjectAccess$1000 = null;
        }
        AnonymousClass1 anonymousClass1 = this.videoPlayer;
        if (anonymousClass1 != null) {
            anonymousClass1.pause();
        }
        PhotoBackgroundDrawable photoBackgroundDrawable = this.photoBackgroundDrawable;
        if (z) {
            this.photoAnimationInProgress = 3;
            this.containerView.invalidate();
            this.imageMoveAnimation = new AnimatorSet();
            if (placeProviderObjectAccess$1000 == null || placeProviderObjectAccess$1000.imageReceiver.getThumbBitmap() == null || z2 || this.onClose != null) {
                c = 7;
                c2 = 6;
                c3 = 5;
                c4 = 4;
                c5 = 3;
                c6 = '\b';
                int i2 = AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight;
                if (this.translationY < 0.0f) {
                    i2 = -i2;
                }
                this.animateToY = i2;
            } else {
                placeProviderObjectAccess$1000.imageReceiver.setVisible(false, true);
                RectF drawRegion = placeProviderObjectAccess$1000.imageReceiver.getDrawRegion();
                c = 7;
                c2 = 6;
                float f = drawRegion.right - drawRegion.left;
                c3 = 5;
                float f2 = drawRegion.bottom - drawRegion.top;
                Point point = AndroidUtilities.displaySize;
                c4 = 4;
                int i3 = point.x;
                int i4 = point.y + AndroidUtilities.statusBarHeight;
                c5 = 3;
                c6 = '\b';
                this.animateToScale = Math.max(f / i3, f2 / i4);
                float f3 = placeProviderObjectAccess$1000.viewX;
                float f4 = drawRegion.left;
                this.animateToX = ((f / 2.0f) + (f3 + f4)) - (i3 / 2);
                this.animateToY = ((f2 / 2.0f) + (placeProviderObjectAccess$1000.viewY + drawRegion.top)) - (i4 / 2);
                this.animateToClipHorizontal = Math.abs(f4 - placeProviderObjectAccess$1000.imageReceiver.getImageX());
                int iAbs = (int) Math.abs(drawRegion.top - placeProviderObjectAccess$1000.imageReceiver.getImageY());
                int[] iArr = new int[2];
                placeProviderObjectAccess$1000.parentView.getLocationInWindow(iArr);
                float f5 = (iArr[1] - (placeProviderObjectAccess$1000.viewY + drawRegion.top)) + placeProviderObjectAccess$1000.clipTopAddition;
                this.animateToClipTop = f5;
                float f6 = iAbs;
                this.animateToClipTop = Math.max(0.0f, Math.max(f5, f6));
                float height = (((placeProviderObjectAccess$1000.viewY + drawRegion.top) + ((int) f2)) - (placeProviderObjectAccess$1000.parentView.getHeight() + iArr[1])) + placeProviderObjectAccess$1000.clipBottomAddition;
                this.animateToClipBottom = height;
                this.animateToClipBottom = Math.max(0.0f, Math.max(height, f6));
                this.animateToClipTopOrigin = 0.0f;
                this.animateToClipTopOrigin = Math.max(0.0f, Math.max(0.0f, f6));
                this.animateToClipBottomOrigin = 0.0f;
                this.animateToClipBottomOrigin = Math.max(0.0f, Math.max(0.0f, f6));
                this.animationStartTime = System.currentTimeMillis();
                this.zoomAnimation = true;
            }
            this.animateToRadius = false;
            showPlayButton(false, true);
            boolean z3 = this.isVideo;
            ChatActivity.AnonymousClass5 anonymousClass5 = this.ANIMATION_VALUE;
            if (z3) {
                this.videoCrossfadeStarted = false;
                this.textureUploaded = false;
                AnimatorSet animatorSet = this.imageMoveAnimation;
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(photoBackgroundDrawable, AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, anonymousClass5, 0.0f, 1.0f);
                AnonymousClass5 anonymousClass6 = this.actionBar;
                Property property = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.captionScrollView, (Property<PhotoViewer.AnonymousClass72, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property, 0.0f);
                VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = this.seekbarContainer;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(videoPlayerControlFrameLayout, videoPlayerControlFrameLayout.SEEKBAR_ALPHA, 0.0f);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.seekbarContainer, (Property<VideoPlayerControlFrameLayout, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.secretHint, (Property<HintView2, Float>) property, 0.0f);
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this, this.VIDEO_CROSSFADE_ALPHA, 0.0f);
                Animator[] animatorArr = new Animator[9];
                animatorArr[0] = objectAnimatorOfInt;
                animatorArr[1] = objectAnimatorOfFloat;
                animatorArr[2] = objectAnimatorOfFloat2;
                animatorArr[c5] = objectAnimatorOfFloat3;
                animatorArr[c4] = objectAnimatorOfFloat4;
                animatorArr[c3] = objectAnimatorOfFloat5;
                animatorArr[c2] = objectAnimatorOfFloat6;
                animatorArr[c] = objectAnimatorOfFloat7;
                animatorArr[c6] = objectAnimatorOfFloat8;
                animatorSet.playTogether(animatorArr);
            } else {
                ImageReceiver imageReceiver = this.centerImage;
                imageReceiver.setManualAlphaAnimator(true);
                AnimatorSet animatorSet2 = this.imageMoveAnimation;
                ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
                ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this, anonymousClass5, 0.0f, 1.0f);
                AnonymousClass5 anonymousClass8 = this.actionBar;
                Property property2 = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass5, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(this.captionScrollView, (Property<PhotoViewer.AnonymousClass72, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property2, 0.0f);
                VideoPlayerControlFrameLayout videoPlayerControlFrameLayout2 = this.seekbarContainer;
                ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(videoPlayerControlFrameLayout2, videoPlayerControlFrameLayout2.SEEKBAR_ALPHA, 0.0f);
                ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(this.seekbarContainer, (Property<VideoPlayerControlFrameLayout, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(this.secretHint, (Property<HintView2, Float>) property2, 0.0f);
                ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(imageReceiver, AnimationProperties.IMAGE_RECEIVER_ALPHA, 0.0f);
                Animator[] animatorArr2 = new Animator[9];
                animatorArr2[0] = objectAnimatorOfInt2;
                animatorArr2[1] = objectAnimatorOfFloat9;
                animatorArr2[2] = objectAnimatorOfFloat10;
                animatorArr2[c5] = objectAnimatorOfFloat11;
                animatorArr2[c4] = objectAnimatorOfFloat12;
                animatorArr2[c3] = objectAnimatorOfFloat13;
                animatorArr2[c2] = objectAnimatorOfFloat14;
                animatorArr2[c] = objectAnimatorOfFloat15;
                animatorArr2[c6] = objectAnimatorOfFloat16;
                animatorSet2.playTogether(animatorArr2);
            }
            this.photoAnimationEndRunnable = new SecretMediaViewer$$ExternalSyntheticLambda1(this, placeProviderObjectAccess$1000, 0);
            this.imageMoveAnimation.setInterpolator(new DecelerateInterpolator());
            this.imageMoveAnimation.setDuration(250L);
            this.imageMoveAnimation.addListener(new QrActivity.AnonymousClass4(12, this, placeProviderObjectAccess$1000));
            this.photoTransitionAnimationStartTime = System.currentTimeMillis();
            this.containerView.setLayerType(2, null);
            this.imageMoveAnimation.start();
            runnable = null;
        } else {
            showPlayButton(false, true);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(this.containerView, (Property<IntroActivity.AnonymousClass1, Float>) View.SCALE_X, 0.9f);
            ObjectAnimator objectAnimatorOfFloat18 = ObjectAnimator.ofFloat(this.containerView, (Property<IntroActivity.AnonymousClass1, Float>) View.SCALE_Y, 0.9f);
            ObjectAnimator objectAnimatorOfInt3 = ObjectAnimator.ofInt(photoBackgroundDrawable, AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
            AnonymousClass5 anonymousClass9 = this.actionBar;
            Property property3 = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat19 = ObjectAnimator.ofFloat(anonymousClass9, (Property<AnonymousClass5, Float>) property3, 0.0f);
            ObjectAnimator objectAnimatorOfFloat20 = ObjectAnimator.ofFloat(this.captionScrollView, (Property<PhotoViewer.AnonymousClass72, Float>) property3, 0.0f);
            ObjectAnimator objectAnimatorOfFloat21 = ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property3, 0.0f);
            VideoPlayerControlFrameLayout videoPlayerControlFrameLayout3 = this.seekbarContainer;
            animatorSet3.playTogether(objectAnimatorOfFloat17, objectAnimatorOfFloat18, objectAnimatorOfInt3, objectAnimatorOfFloat19, objectAnimatorOfFloat20, objectAnimatorOfFloat21, ObjectAnimator.ofFloat(videoPlayerControlFrameLayout3, videoPlayerControlFrameLayout3.SEEKBAR_ALPHA, 0.0f), ObjectAnimator.ofFloat(this.seekbarContainer, (Property<VideoPlayerControlFrameLayout, Float>) property3, 0.0f));
            this.photoAnimationInProgress = 2;
            this.photoAnimationEndRunnable = new SecretMediaViewer$$ExternalSyntheticLambda1(this, placeProviderObjectAccess$1000, i);
            animatorSet3.setDuration(200L);
            animatorSet3.addListener(new AnonymousClass14(this, 2));
            this.photoTransitionAnimationStartTime = System.currentTimeMillis();
            runnable = null;
            this.containerView.setLayerType(2, null);
            animatorSet3.start();
        }
        Runnable runnable3 = this.onClose;
        if (runnable3 != null) {
            runnable3.run();
            this.onClose = runnable;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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
        if (i != NotificationCenter.didCreatedNewDeleteTask) {
            if (i == NotificationCenter.updateMessageMedia) {
                if (this.currentMessageObject.getId() == ((TLRPC.Message) objArr[0]).id) {
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
            return;
        }
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
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f = this.scale;
        if ((f == 1.0f && (this.translationY != 0.0f || this.translationX != 0.0f)) || this.animationStartTime != 0 || this.photoAnimationInProgress != 0) {
            return false;
        }
        if (f == 1.0f) {
            float fM = TextureRenderer$$ExternalSyntheticOutline0.m(3.0f, this.scale, (motionEvent.getX() - (this.containerView.getWidth() / 2)) - this.translationX, motionEvent.getX() - (this.containerView.getWidth() / 2));
            float fM2 = TextureRenderer$$ExternalSyntheticOutline0.m(3.0f, this.scale, (motionEvent.getY() - (this.containerView.getHeight() / 2)) - this.translationY, motionEvent.getY() - (this.containerView.getHeight() / 2));
            updateMinMax$1(3.0f);
            float f2 = this.minX;
            if (fM < f2) {
                fM = f2;
            } else {
                f2 = this.maxX;
                if (fM > f2) {
                    fM = f2;
                }
            }
            float f3 = this.minY;
            if (fM2 < f3) {
                fM2 = f3;
            } else {
                f3 = this.maxY;
                if (fM2 > f3) {
                    fM2 = f3;
                }
            }
            animateTo$1(3.0f, fM, fM2, true);
        } else {
            animateTo$1(1.0f, 0.0f, 0.0f, true);
        }
        this.doubleTap = true;
        return true;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.scale == 1.0f) {
            return false;
        }
        this.scroller.abortAnimation();
        this.scroller.fling(Math.round(this.translationX), Math.round(this.translationY), Math.round(f), Math.round(f2), (int) this.minX, (int) this.maxX, (int) this.minY, (int) this.maxY);
        this.containerView.postInvalidate();
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.discardTap) {
            return false;
        }
        if (this.videoPlayer == null || !this.isActionBarVisible || motionEvent.getX() < this.playButton.getX() || motionEvent.getY() < this.playButton.getY() || motionEvent.getX() > this.playButton.getX() + this.playButton.getMeasuredWidth() || motionEvent.getX() > this.playButton.getX() + this.playButton.getMeasuredWidth()) {
            toggleActionBar$1(!this.isActionBarVisible, true);
            return true;
        }
        AnonymousClass1 anonymousClass1 = this.videoPlayer;
        ExoPlayerImpl exoPlayerImpl = anonymousClass1.player;
        exoPlayerImpl.verifyApplicationThread();
        anonymousClass1.setPlayWhenReady(!exoPlayerImpl.playbackInfo.playWhenReady);
        ExoPlayerImpl exoPlayerImpl2 = this.videoPlayer.player;
        exoPlayerImpl2.verifyApplicationThread();
        if (exoPlayerImpl2.playbackInfo.playWhenReady) {
            toggleActionBar$1(true, true);
            return true;
        }
        showPlayButton(true, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void preparePlayer(File file) {
        if (this.parentActivity == null) {
            return;
        }
        releasePlayer$1();
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            this.videoPlayer = anonymousClass1;
            anonymousClass1.setTextureView(this.videoTextureView);
            this.videoPlayer.delegate = new PhotoViewer.AnonymousClass14(9, this, file);
        }
        this.videoPlayer.preparePlayer(Uri.fromFile(file), "other", 0L);
        this.videoPlayer.setPlayWhenReady(true);
        this.playButtonDrawable.setPause(true, true);
    }

    public final void releasePlayer$1() {
        AnonymousClass1 anonymousClass1 = this.videoPlayer;
        if (anonymousClass1 != null) {
            this.playerRetryPlayCount = 0;
            anonymousClass1.releasePlayer();
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

    public final void setCurrentCaption$1(MessageObject messageObject, CharSequence charSequence, boolean z) {
        boolean z2;
        CharSequence charSequenceCloneSpans = AnimatedEmojiSpan.cloneSpans(charSequence, 3);
        if (this.captionScrollView == null) {
            FrameLayout frameLayout = new FrameLayout(this.containerView.getContext());
            this.captionContainer = frameLayout;
            this.captionTextViewSwitcher.setContainer(frameLayout);
            PhotoViewer.AnonymousClass72 anonymousClass72 = new PhotoViewer.AnonymousClass72(this, this.containerView.getContext(), this.captionTextViewSwitcher, this.captionContainer, 1);
            this.captionScrollView = anonymousClass72;
            this.captionTextViewSwitcher.setScrollView(anonymousClass72);
            this.captionContainer.setClipChildren(false);
            this.captionScrollView.addView(this.captionContainer, new ViewGroup.LayoutParams(-1, -2));
            this.containerView.addView(this.captionScrollView, LayoutHelper.createFrame(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.textSelectionHelper.getOverlayView(this.containerView.getContext()).bringToFront();
        }
        boolean z3 = true;
        if (this.captionTextViewSwitcher.getParent() != this.captionContainer) {
            this.captionTextViewSwitcher.setMeasureAllChildren(true);
            this.captionContainer.addView(this.captionTextViewSwitcher, -1, -2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceCloneSpans);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.captionTextViewSwitcher.getCurrentView().getText());
        TextView nextView = z ? this.captionTextViewSwitcher.getNextView() : this.captionTextViewSwitcher.getCurrentView();
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
        PhotoViewer.AnonymousClass72 anonymousClass73 = this.captionScrollView;
        anonymousClass73.dontChangeTopMargin = false;
        if (z) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(anonymousClass73);
            }
            TransitionSet duration = new TransitionSet().addTransition(new AnonymousClass11(this, zIsEmpty2, zIsEmpty, 1)).addTransition(new AnonymousClass11(this, zIsEmpty2, zIsEmpty, 0)).setDuration(200L);
            if (!zIsEmpty2) {
                this.captionScrollView.dontChangeTopMargin = true;
                duration.addTransition(new PhotoViewer.AnonymousClass75(this, 3));
            }
            if (zIsEmpty2 && !zIsEmpty) {
                duration.addTarget((View) this.captionTextViewSwitcher);
            }
            TransitionManager.beginDelayedTransition(this.captionScrollView, duration);
            z2 = true;
        } else {
            this.captionTextViewSwitcher.getCurrentView().setText((CharSequence) null);
            PhotoViewer.AnonymousClass72 anonymousClass74 = this.captionScrollView;
            if (anonymousClass74 != null) {
                anonymousClass74.scrollTo(0, 0);
            }
            z2 = false;
        }
        if (zIsEmpty) {
            this.captionTextViewSwitcher.setText(null, z, false);
            this.captionTextViewSwitcher.getCurrentView().setTextColor(-1);
            PhotoViewer.CaptionTextViewSwitcher captionTextViewSwitcher = this.captionTextViewSwitcher;
            if (z2 && !zIsEmpty2) {
                z3 = false;
            }
            captionTextViewSwitcher.setVisibility(4, z3);
            this.captionTextViewSwitcher.setTag(null);
        } else {
            Theme.createCommonChatResources();
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, TranslateAlert2.getToLanguage())) {
                if (messageObject.messageOwner.entities.isEmpty()) {
                    charSequenceCloneSpans = Emoji.replaceEmoji(new SpannableStringBuilder(charSequenceCloneSpans), nextView.getPaint().getFontMetricsInt(), false);
                } else {
                    SpannableString spannableString = new SpannableString(charSequenceCloneSpans);
                    messageObject.addEntitiesToText(spannableString, true, false);
                    if (messageObject.isVideo()) {
                        MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableString, false, 3, (int) messageObject.getDuration(), false);
                    }
                    charSequenceCloneSpans = Emoji.replaceEmoji(spannableString, nextView.getPaint().getFontMetricsInt(), false);
                }
            }
            this.captionTextViewSwitcher.setTag(charSequenceCloneSpans);
            try {
                this.captionTextViewSwitcher.setText(charSequenceCloneSpans, z, false);
                PhotoViewer.AnonymousClass72 anonymousClass75 = this.captionScrollView;
                if (anonymousClass75 != null) {
                    anonymousClass75.updateTopMargin(anonymousClass75.getWidth(), anonymousClass75.getHeight());
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.captionTextViewSwitcher.setVisibility(this.isActionBarVisible ? 0 : 4);
        }
        if (this.captionTextViewSwitcher.getCurrentView() instanceof PhotoViewer.CaptionTextView) {
            ((PhotoViewer.CaptionTextView) this.captionTextViewSwitcher.getCurrentView()).setLoading(false);
        }
    }

    public final void showPlayButton(boolean z, boolean z2) {
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

    public final void showSecretHint() {
        this.secretHint.setMultilineText(true);
        String string = LocaleController.getString(this.isVideo ? R.string.VideoShownOnce : R.string.PhotoShownOnce);
        HintView2 hintView2 = this.secretHint;
        hintView2.textMaxWidth = HintView2.cutInFancyHalf(string, hintView2.getTextPaint());
        this.secretHint.setText(string);
        this.secretHint.setInnerPadding(12.0f, 7.0f, 11.0f, 7.0f);
        HintView2 hintView3 = this.secretHint;
        hintView3.getClass();
        hintView3.iconMargin = AndroidUtilities.dp(2);
        HintView2 hintView4 = this.secretHint;
        hintView4.getClass();
        hintView4.iconTy = 0.0f;
        int i = R.raw.fire_on;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f), true, null);
        rLottieDrawable.start();
        hintView4.setIcon(rLottieDrawable);
        this.secretHint.show();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void toggleActionBar$1(boolean z, boolean z2) {
        int i = 1;
        SecretMediaViewer$$ExternalSyntheticLambda1 secretMediaViewer$$ExternalSyntheticLambda1 = this.hideActionBarRunnable;
        AndroidUtilities.cancelRunOnUIThread(secretMediaViewer$$ExternalSyntheticLambda1);
        if (z && this.isVideo) {
            AndroidUtilities.runOnUIThread(secretMediaViewer$$ExternalSyntheticLambda1, 3000L);
        }
        if (z) {
            this.actionBar.setVisibility(0);
        }
        this.actionBar.setEnabled(z);
        this.isActionBarVisible = z;
        showPlayButton(z, z2);
        if (!z2) {
            this.actionBar.setAlpha(z ? 1.0f : 0.0f);
            this.captionScrollView.setAlpha(z ? 1.0f : 0.0f);
            this.seekbarBackground.setAlpha(z ? 1.0f : 0.0f);
            this.navigationBar.setAlpha(z ? 1.0f : 0.0f);
            if (z) {
                return;
            }
            this.actionBar.setVisibility(8);
            this.captionScrollView.scrollTo(0, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass5 anonymousClass5 = this.actionBar;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) property, z ? 1.0f : 0.0f));
        VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = this.seekbarContainer;
        arrayList.add(ObjectAnimator.ofFloat(videoPlayerControlFrameLayout, videoPlayerControlFrameLayout.SEEKBAR_ALPHA, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.captionScrollView, (Property<PhotoViewer.AnonymousClass72, Float>) property, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.seekbarBackground, (Property<View, Float>) property, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property, z ? 1.0f : 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.currentActionBarAnimation = animatorSet;
        animatorSet.playTogether(arrayList);
        if (!z) {
            this.currentActionBarAnimation.addListener(new AnonymousClass14(this, i));
        }
        this.currentActionBarAnimation.setDuration(200L);
        this.currentActionBarAnimation.start();
    }

    public final void updateMinMax$1(float f) {
        ImageReceiver imageReceiver = this.centerImage;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f) - this.containerView.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f) - this.containerView.getHeight())) / 2;
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
}
