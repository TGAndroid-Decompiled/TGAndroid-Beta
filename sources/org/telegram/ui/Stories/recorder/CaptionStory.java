package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda12;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;

public abstract class CaptionStory extends CaptionContainerView {
    public static final int[] periods = {21600, 43200, 86400, 172800};
    public float amplitude;
    public final AnimatedFloat animatedAmplitude;
    public final BlobDrawable bigWaveDrawable;
    public final Path boundsPath;
    public final AnimatedFloat cancel2T;
    public final RectF cancelBounds;
    public final AnimatedFloat cancelT;
    public Text cancelText;
    public boolean cancelling;
    public final Path circlePath;
    public AnonymousClass1 currentRecorder;
    public final CaptionStory$$ExternalSyntheticLambda0 doneCancel;
    public Drawable flipButton;
    public float fromX;
    public float fromY;
    public boolean hasRoundVideo;
    public final AnimatedFloat lock2T;
    public final Paint lockBackgroundPaint;
    public final RectF lockBounds;
    public final AnimatedFloat lockCancelledT;
    public final Path lockHandle;
    public final Paint lockHandlePaint;
    public final Paint lockPaint;
    public float lockProgress;
    public final RectF lockRect;
    public final Paint lockShadowPaint;
    public final AnimatedFloat lockT;
    public boolean locked;
    public Utilities.Callback onPeriodUpdate;
    public Utilities.Callback onPremiumHintShow;
    public final ImageView periodButton;
    public final CaptionContainerView.PeriodDrawable periodDrawable;
    public int periodIndex;
    public ItemOptions periodPopup;
    public boolean periodVisible;
    public final RecordDot recordPaint;
    public boolean recordTouch;
    public boolean recording;
    public final ImageView roundButton;
    public final Drawable roundDrawable;
    public final Paint roundPaint;
    public float slideProgress;
    public Paint slideToCancelArrowPaint;
    public Path slideToCancelArrowPath;
    public Text slideToCancelText;
    public long startTime;
    public boolean stopping;
    public final AnimatedTextView.AnimatedTextDrawable timerTextDrawable;
    public final BlobDrawable tinyWaveDrawable;
    public final Paint whitePaint;

    public final class AnonymousClass1 extends RoundVideoRecorder {
        public AnonymousClass1(Context context) {
            super(context);
        }

        public final void stop() {
            AndroidUtilities.cancelRunOnUIThread(this.stopRunnable);
            if (this.recordingStarted <= 0) {
                destroy(true);
            } else {
                CameraController.getInstance().stopVideoRecording(getCameraSessionRecording(), false, false);
            }
            CaptionStory captionStory = CaptionStory.this;
            if (captionStory.recording) {
                captionStory.releaseRecord(true, false);
            }
        }
    }

    public final class RecordDot extends Drawable {
        public float alpha;
        public float alpha2;
        public boolean attachedToWindow;
        public final RLottieDrawable drawable;
        public boolean isIncr;
        public long lastUpdateTime;
        public final StoryRecorder.AnonymousClass8 parent;
        public boolean playing;
        public final Paint redDotPaint;
        public final StoryRecorder.AnonymousClass8 this$0;

        public RecordDot(StoryRecorder.AnonymousClass8 anonymousClass8, StoryRecorder.AnonymousClass8 anonymousClass9) {
            this.this$0 = anonymousClass8;
            Paint paint = new Paint(1);
            this.redDotPaint = paint;
            this.alpha2 = 1.0f;
            this.parent = anonymousClass9;
            int i = R.raw.chat_audio_record_delete_3;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
            this.drawable = rLottieDrawable;
            rLottieDrawable.invalidateOnProgressSet = true;
            paint.setColor(-2406842);
            rLottieDrawable.applyingLayerColors = true;
            HashMap map = rLottieDrawable.newColorUpdates;
            map.put("Cup Red", -2406842);
            rLottieDrawable.requestRedrawColors();
            map.put("Box", -2406842);
            rLottieDrawable.requestRedrawColors();
            rLottieDrawable.commitApplyLayerColors();
        }

        @Override
        public final void draw(Canvas canvas) {
            boolean z = this.playing;
            RLottieDrawable rLottieDrawable = this.drawable;
            if (z) {
                rLottieDrawable.setAlpha((int) (this.alpha * 255.0f * this.alpha2));
            }
            Paint paint = this.redDotPaint;
            paint.setAlpha((int) (this.alpha * 255.0f * this.alpha2));
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastUpdateTime;
            if (this.isIncr || this.playing) {
                float f = (jCurrentTimeMillis / 600.0f) + this.alpha;
                this.alpha = f;
                if (f >= 1.0f) {
                    this.alpha = 1.0f;
                    this.isIncr = false;
                }
            } else {
                float f2 = this.alpha - (jCurrentTimeMillis / 600.0f);
                this.alpha = f2;
                if (f2 <= 0.0f) {
                    this.alpha = 0.0f;
                    this.isIncr = true;
                }
            }
            this.lastUpdateTime = System.currentTimeMillis();
            rLottieDrawable.setBounds(getBounds());
            if (this.playing) {
                rLottieDrawable.draw(canvas);
            }
            if (!this.playing || !rLottieDrawable.hasBitmap()) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
            }
            this.this$0.invalidate();
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            this.alpha2 = i / 255.0f;
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public CaptionStory(Activity activity, FrameLayout frameLayout, SizeNotifierFrameLayout sizeNotifierFrameLayout, FrameLayout frameLayout2, DarkThemeResourceProvider darkThemeResourceProvider, BlurringShader.BlurManager blurManager) {
        super(activity, frameLayout, sizeNotifierFrameLayout, frameLayout2, darkThemeResourceProvider, blurManager);
        this.periodVisible = true;
        this.periodIndex = 0;
        StoryRecorder.AnonymousClass8 anonymousClass8 = (StoryRecorder.AnonymousClass8) this;
        this.recordPaint = new RecordDot((StoryRecorder.AnonymousClass8) this, anonymousClass8);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.timerTextDrawable = animatedTextDrawable;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        animatedTextDrawable.moveAmplitude = 0.16f;
        animatedTextDrawable.animateDuration = 50L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.0f));
        Typeface typefaceBold = AndroidUtilities.bold();
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setTypeface(typefaceBold);
        animatedTextDrawable.setText("0:00.0", true, true);
        textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        Paint paint = new Paint(1);
        this.whitePaint = paint;
        Paint paint2 = new Paint(1);
        this.roundPaint = paint2;
        BlobDrawable blobDrawable = new BlobDrawable(11, 360928);
        this.tinyWaveDrawable = blobDrawable;
        BlobDrawable blobDrawable2 = new BlobDrawable(12, 360928);
        this.bigWaveDrawable = blobDrawable2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        blobDrawable.minRadius = AndroidUtilities.dp(47.0f);
        blobDrawable.maxRadius = AndroidUtilities.dp(55.0f);
        blobDrawable.generateBlob();
        blobDrawable2.minRadius = AndroidUtilities.dp(47.0f);
        blobDrawable2.maxRadius = AndroidUtilities.dp(55.0f);
        blobDrawable2.generateBlob();
        this.roundDrawable = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.animatedAmplitude = new AnimatedFloat(new CaptionStory$$ExternalSyntheticLambda0(anonymousClass8, 0), 200L, cubicBezierInterpolator, 0);
        this.circlePath = new Path();
        this.boundsPath = new Path();
        this.lockBackgroundPaint = new Paint(1);
        this.lockShadowPaint = new Paint(1);
        this.lockPaint = new Paint(1);
        Paint paint3 = new Paint(1);
        this.lockHandlePaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        CaptionStory$$ExternalSyntheticLambda0 captionStory$$ExternalSyntheticLambda0 = new CaptionStory$$ExternalSyntheticLambda0(anonymousClass8, 0);
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.lockCancelledT = new AnimatedFloat(captionStory$$ExternalSyntheticLambda0, 350L, cubicBezierInterpolator2);
        this.lockBounds = new RectF();
        this.cancelBounds = new RectF();
        this.lockRect = new RectF();
        this.lockHandle = new Path();
        this.cancelT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator2);
        this.cancel2T = new AnimatedFloat(new CaptionStory$$ExternalSyntheticLambda0(anonymousClass8, 0), 420L, cubicBezierInterpolator2, 0);
        this.lockT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator2);
        this.lock2T = new AnimatedFloat(new CaptionStory$$ExternalSyntheticLambda0(anonymousClass8, 0), 350L, cubicBezierInterpolator2, 0);
        this.doneCancel = new CaptionStory$$ExternalSyntheticLambda0(anonymousClass8, 1);
        ImageView imageView = new ImageView(activity);
        this.roundButton = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, LayoutHelper.createFrame(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(anonymousClass8, 24));
        ImageView imageView2 = new ImageView(activity);
        this.periodButton = imageView2;
        CaptionContainerView.PeriodDrawable periodDrawable = new CaptionContainerView.PeriodDrawable(5);
        this.periodDrawable = periodDrawable;
        imageView2.setImageDrawable(periodDrawable);
        imageView2.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        setPeriod(86400, false);
        addView(imageView2, LayoutHelper.createFrame(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda12(anonymousClass8, frameLayout, darkThemeResourceProvider, 19));
    }

    @Override
    public final int additionalRightMargin() {
        return 36;
    }

    @Override
    public final void afterUpdateShownKeyboard(boolean z) {
        ImageView imageView = this.periodButton;
        imageView.setVisibility((z || !this.periodVisible) ? 8 : 0);
        this.roundButton.setVisibility(z ? 8 : 0);
        if (z) {
            imageView.setVisibility(8);
        }
    }

    @Override
    public final void beforeUpdateShownKeyboard(boolean z) {
        if (z) {
            return;
        }
        this.periodButton.setVisibility(this.periodVisible ? 0 : 8);
        this.roundButton.setVisibility(0);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        StoryRecorder.AnonymousClass8 anonymousClass8;
        boolean zAccess$9600;
        StoryRecorder storyRecorder;
        AnonymousClass1 anonymousClass1;
        StoryRecorder.AnonymousClass7 anonymousClass7;
        TimelineView timelineView;
        AnonymousClass1 anonymousClass2;
        Drawable drawable;
        if (!this.recording || (anonymousClass2 = this.currentRecorder) == null || anonymousClass2.cameraView == null || (drawable = this.flipButton) == null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.roundButton.getX(), this.roundButton.getY(), this.roundButton.getX() + this.roundButton.getMeasuredWidth(), this.roundButton.getY() + this.roundButton.getMeasuredHeight());
            if (this.recordTouch && (this.hasRoundVideo || this.keyboardShown || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                if (this.recording && this.locked && this.cancelBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                    releaseRecord(false, true);
                    this.recordTouch = false;
                    return true;
                }
                if (!this.recording || (!this.lockBounds.contains(motionEvent.getX(), motionEvent.getY()) && !getBounds().contains(motionEvent.getX(), motionEvent.getY()))) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                releaseRecord(false, false);
                this.recordTouch = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getAction() == 2) {
                    if (!this.cancelling) {
                        this.slideProgress = Utilities.clamp((this.fromX - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                        float fClamp = Utilities.clamp((this.fromY - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                        this.lockProgress = fClamp;
                        z = this.locked;
                        if (z && !this.cancelling && this.slideProgress >= 1.0f) {
                            this.cancelling = true;
                            this.recording = false;
                            this.roundButton.setVisibility(4);
                            this.periodButton.setVisibility(4);
                            RecordDot recordDot = this.recordPaint;
                            recordDot.playing = true;
                            recordDot.drawable.setProgress(0.0f, true);
                            if (recordDot.attachedToWindow) {
                                recordDot.drawable.start();
                            }
                            AnonymousClass1 anonymousClass3 = this.currentRecorder;
                            if (anonymousClass3 != null) {
                                anonymousClass3.cancelled = true;
                                AndroidUtilities.cancelRunOnUIThread(anonymousClass3.stopRunnable);
                                CameraController.getInstance().stopVideoRecording(anonymousClass3.cameraView.getCameraSessionRecording(), false, false);
                                anonymousClass3.destroy(false);
                            }
                            AndroidUtilities.runOnUIThread(this.doneCancel, 800L);
                        } else if (!z && !this.cancelling && fClamp >= 1.0f && this.slideProgress < 0.4f) {
                            this.locked = true;
                            try {
                                performHapticFeedback(3, 1);
                            } catch (Exception unused) {
                            }
                        }
                        invalidate();
                        invalidateDrawOver2();
                    }
                } else if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    if (!this.cancelling && !this.locked) {
                        releaseRecord(false, false);
                    }
                    this.recordTouch = false;
                }
                return this.recordTouch;
            }
            if (this.recording) {
                this.recordTouch = false;
                releaseRecord(false, false);
                return true;
            }
            this.recordTouch = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            anonymousClass8 = (StoryRecorder.AnonymousClass8) this;
            if (CameraView.isCameraAllowed()) {
                zAccess$9600 = StoryRecorder.access$9600(StoryRecorder.this);
            } else {
                zAccess$9600 = false;
            }
            if (zAccess$9600) {
                AndroidUtilities.cancelRunOnUIThread(this.doneCancel);
                this.fromX = motionEvent.getX();
                this.fromY = motionEvent.getY();
                this.amplitude = 0.0f;
                this.slideProgress = 0.0f;
                this.cancelT.set(0.0f, true);
                this.cancel2T.set(0.0f, true);
                this.cancelling = false;
                this.stopping = false;
                this.locked = false;
                RecordDot recordDot2 = this.recordPaint;
                recordDot2.playing = false;
                RLottieDrawable rLottieDrawable = recordDot2.drawable;
                rLottieDrawable.isRunning = false;
                rLottieDrawable.checkChoreographer$1();
                recordDot2.drawable.setProgress(0.0f, true);
                this.recording = true;
                this.startTime = System.currentTimeMillis();
                this.collapsed = true;
                this.collapsedFromX = Integer.MAX_VALUE;
                invalidate();
                invalidateDrawOver2();
                AnonymousClass1 anonymousClass4 = new AnonymousClass1(getContext());
                this.currentRecorder = anonymousClass4;
                StoryRecorder.AnonymousClass8 anonymousClass9 = (StoryRecorder.AnonymousClass8) this;
                storyRecorder = StoryRecorder.this;
                anonymousClass1 = storyRecorder.currentRoundRecorder;
                if (anonymousClass1 != null) {
                    anonymousClass1.destroy(true);
                }
                anonymousClass7 = storyRecorder.previewView;
                if (anonymousClass7 != null) {
                    anonymousClass7.isMuted = true;
                    anonymousClass7.checkVolumes();
                    StoryRecorder.AnonymousClass7 anonymousClass10 = storyRecorder.previewView;
                    anonymousClass10.seekTo(0L);
                    timelineView = anonymousClass10.timelineView;
                    if (timelineView != null) {
                        timelineView.setProgress(0L);
                    }
                }
                int i = 2;
                anonymousClass4.onDoneCallback = new BotBiometry$$ExternalSyntheticLambda8(i, anonymousClass9, anonymousClass4);
                anonymousClass4.onDestroyCallback = new CaptionStory$$ExternalSyntheticLambda0(anonymousClass9, i);
                ThemePreviewActivity.AnonymousClass14 anonymousClass14 = storyRecorder.previewContainer;
                storyRecorder.currentRoundRecorder = anonymousClass4;
                anonymousClass14.addView(anonymousClass4, LayoutHelper.createFrame(-1.0f, -1));
                return true;
            }
        } else {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(drawable.getBounds());
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
            for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                if (AndroidUtilities.rectTmp.contains(motionEvent.getX(i2), motionEvent.getY(i2))) {
                    if (motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5) {
                        switchCamera();
                        Drawable drawable2 = this.flipButton;
                        if (drawable2 instanceof AnimatedVectorDrawable) {
                            ((AnimatedVectorDrawable) drawable2).start();
                        }
                    }
                    if (this.recordTouch) {
                        break;
                    }
                }
            }
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(this.roundButton.getX(), this.roundButton.getY(), this.roundButton.getX() + this.roundButton.getMeasuredWidth(), this.roundButton.getY() + this.roundButton.getMeasuredHeight());
            if (this.recordTouch) {
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getAction() == 2) {
                    if (!this.cancelling) {
                        this.slideProgress = Utilities.clamp((this.fromX - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                        float fClamp2 = Utilities.clamp((this.fromY - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                        this.lockProgress = fClamp2;
                        z = this.locked;
                        if (z) {
                            if (!z) {
                                this.locked = true;
                                performHapticFeedback(3, 1);
                            }
                        } else if (!z) {
                            this.locked = true;
                            performHapticFeedback(3, 1);
                        }
                        invalidate();
                        invalidateDrawOver2();
                    }
                } else if (motionEvent.getAction() != 1) {
                    if (!this.cancelling) {
                        releaseRecord(false, false);
                    }
                    this.recordTouch = false;
                } else {
                    if (!this.cancelling) {
                        releaseRecord(false, false);
                    }
                    this.recordTouch = false;
                }
                return this.recordTouch;
            }
            if (this.recording) {
                this.recordTouch = false;
                releaseRecord(false, false);
                return true;
            }
            this.recordTouch = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            anonymousClass8 = (StoryRecorder.AnonymousClass8) this;
            if (CameraView.isCameraAllowed()) {
                zAccess$9600 = false;
            } else {
                zAccess$9600 = StoryRecorder.access$9600(StoryRecorder.this);
            }
            if (zAccess$9600) {
                AndroidUtilities.cancelRunOnUIThread(this.doneCancel);
                this.fromX = motionEvent.getX();
                this.fromY = motionEvent.getY();
                this.amplitude = 0.0f;
                this.slideProgress = 0.0f;
                this.cancelT.set(0.0f, true);
                this.cancel2T.set(0.0f, true);
                this.cancelling = false;
                this.stopping = false;
                this.locked = false;
                RecordDot recordDot3 = this.recordPaint;
                recordDot3.playing = false;
                RLottieDrawable rLottieDrawable2 = recordDot3.drawable;
                rLottieDrawable2.isRunning = false;
                rLottieDrawable2.checkChoreographer$1();
                recordDot3.drawable.setProgress(0.0f, true);
                this.recording = true;
                this.startTime = System.currentTimeMillis();
                this.collapsed = true;
                this.collapsedFromX = Integer.MAX_VALUE;
                invalidate();
                invalidateDrawOver2();
                AnonymousClass1 anonymousClass5 = new AnonymousClass1(getContext());
                this.currentRecorder = anonymousClass5;
                StoryRecorder.AnonymousClass8 anonymousClass11 = (StoryRecorder.AnonymousClass8) this;
                storyRecorder = StoryRecorder.this;
                anonymousClass1 = storyRecorder.currentRoundRecorder;
                if (anonymousClass1 != null) {
                    anonymousClass1.destroy(true);
                }
                anonymousClass7 = storyRecorder.previewView;
                if (anonymousClass7 != null) {
                    anonymousClass7.isMuted = true;
                    anonymousClass7.checkVolumes();
                    StoryRecorder.AnonymousClass7 anonymousClass12 = storyRecorder.previewView;
                    anonymousClass12.seekTo(0L);
                    timelineView = anonymousClass12.timelineView;
                    if (timelineView != null) {
                        timelineView.setProgress(0L);
                    }
                }
                int i3 = 2;
                anonymousClass5.onDoneCallback = new BotBiometry$$ExternalSyntheticLambda8(i3, anonymousClass11, anonymousClass5);
                anonymousClass5.onDestroyCallback = new CaptionStory$$ExternalSyntheticLambda0(anonymousClass11, i3);
                ThemePreviewActivity.AnonymousClass14 anonymousClass15 = storyRecorder.previewContainer;
                storyRecorder.currentRoundRecorder = anonymousClass5;
                anonymousClass15.addView(anonymousClass5, LayoutHelper.createFrame(-1.0f, -1));
                return true;
            }
        }
        return true;
    }

    @Override
    public final void drawOver(Canvas canvas, RectF rectF) {
        float f;
        long jMin;
        Paint paint;
        float f2;
        float f3;
        float f4;
        float f5;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (this.currentRecorder != null) {
            float f6 = this.cancelT.set(this.cancelling);
            float f7 = this.lockT.set(this.locked);
            if (this.startTime <= 0) {
                this.startTime = System.currentTimeMillis();
            }
            float fSin = (((float) Math.sin(((double) ((System.currentTimeMillis() - this.startTime) / 900.0f)) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float fDp = rectF.left + AndroidUtilities.dp(21.0f);
            float fDp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            int iDp = (int) (fDp - AndroidUtilities.dp(12.0f));
            int iDp2 = (int) (fDp2 - AndroidUtilities.dp(12.0f));
            int iDp3 = (int) (fDp + AndroidUtilities.dp(12.0f));
            int iDp4 = (int) (fDp2 + AndroidUtilities.dp(12.0f));
            RecordDot recordDot = this.recordPaint;
            recordDot.setBounds(iDp, iDp2, iDp3, iDp4);
            recordDot.draw(canvas3);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.timerTextDrawable;
            animatedTextDrawable.setBounds((int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * f6)), (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f)), (int) (rectF.left + AndroidUtilities.dp(133.3f)), (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f)));
            AnonymousClass1 anonymousClass1 = this.currentRecorder;
            if (anonymousClass1.recordingStarted < 0) {
                jMin = 0;
                f = 2.0f;
            } else {
                long jCurrentTimeMillis = anonymousClass1.recordingStopped;
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                f = 2.0f;
                jMin = Math.min(59500L, jCurrentTimeMillis - anonymousClass1.recordingStarted);
            }
            int i = (int) (jMin / 1000);
            int i2 = (int) ((jMin - ((long) (i * 1000))) / 100);
            int i3 = i / 60;
            int i4 = i % 60;
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append(":");
            sb.append(i4 < 10 ? "0" : "");
            sb.append(i4);
            sb.append(".");
            sb.append(i2);
            animatedTextDrawable.setText(sb.toString(), true, true);
            animatedTextDrawable.alpha = (int) ((1.0f - f6) * 255.0f);
            animatedTextDrawable.draw(canvas3);
            float f8 = 1.0f - f7;
            float f9 = (1.0f - this.slideProgress) * f8;
            Paint paint$1 = this.captionBlur.getPaint$1(1.0f);
            if (paint$1 != null) {
                paint = paint$1;
                f2 = 10.0f;
                f3 = 12.0f;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                paint = paint$1;
                f2 = 10.0f;
                f3 = 12.0f;
            }
            if (f9 > 0.0f) {
                if (this.slideToCancelText == null) {
                    this.slideToCancelText = new Text(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.slideToCancelArrowPath == null) {
                    Path path = new Path();
                    this.slideToCancelArrowPath = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.slideToCancelArrowPath.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.slideToCancelArrowPath.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f2));
                    Paint paint2 = new Paint(1);
                    this.slideToCancelArrowPaint = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.slideToCancelArrowPaint.setStrokeCap(Paint.Cap.ROUND);
                    this.slideToCancelArrowPaint.setStrokeJoin(Paint.Join.ROUND);
                }
                this.slideToCancelArrowPaint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.slideToCancelText.ellipsizeWidth = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - animatedTextDrawable.getCurrentWidth());
                float fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.slideProgress, AndroidUtilities.dp(6.0f) * fSin, (rectF.centerX() - ((this.slideToCancelText.getWidth() + AndroidUtilities.dp(11.33f)) / f)) - (AndroidUtilities.lerp(this.slideProgress, 1.0f, f7) * (rectF.width() / 6.0f)));
                int iMultAlpha = Theme.multAlpha(f9, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(fM, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.slideToCancelArrowPaint.setColor(iMultAlpha);
                canvas3.drawPath(this.slideToCancelArrowPath, this.slideToCancelArrowPaint);
                canvas3.restore();
                f4 = 15.0f;
                f5 = 0.0f;
                this.slideToCancelText.draw(fM + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, iMultAlpha, canvas3);
            } else {
                f4 = 15.0f;
                f5 = 0.0f;
            }
            if (f7 > f5) {
                if (this.cancelText == null) {
                    this.cancelText = new Text(LocaleController.getString(R.string.CancelRound), f4, AndroidUtilities.bold());
                }
                this.cancelText.ellipsizeWidth = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - animatedTextDrawable.getCurrentWidth());
                float fWidth = ((rectF.width() / 4.0f) * f8) + (rectF.centerX() - (this.cancelText.getWidth() / f));
                canvas2 = canvas;
                this.cancelText.draw(fWidth, rectF.centerY(), 1.0f, Theme.multAlpha(f7, paint != null ? -1 : -2130706433), canvas2);
                this.cancelBounds.set(fWidth - AndroidUtilities.dp(f3), rectF.top, this.cancelText.getWidth() + fWidth + AndroidUtilities.dp(f3), rectF.bottom);
            } else {
                canvas2 = canvas;
            }
            if (paint != null) {
                canvas2.drawRect(rectF, paint);
                canvas2.restore();
            }
            invalidate();
        }
    }

    @Override
    public final void drawOver2(Canvas canvas, RectF rectF, float f) {
        float f2;
        if (f <= 0.0f) {
            return;
        }
        boolean z = this.cancelling;
        AnimatedFloat animatedFloat = this.cancel2T;
        float f3 = animatedFloat.set(z);
        boolean z2 = this.locked;
        AnimatedFloat animatedFloat2 = this.lock2T;
        float f4 = animatedFloat2.set(z2);
        float f5 = this.animatedAmplitude.set(this.amplitude, false);
        float f6 = 1.0f - f3;
        float fM = DiffUtil.m(1.0f, this.slideProgress, AndroidUtilities.dp(30.0f) * f5, AndroidUtilities.dp(41.0f)) * f6 * f;
        float fLerp = AndroidUtilities.lerp(BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, f4, getWidth() * 0.35f * this.slideProgress, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), f3);
        float fDp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean zIsEnabled = LiteMode.isEnabled(360928);
        Paint paint = this.roundPaint;
        if (zIsEnabled) {
            BlobDrawable blobDrawable = this.tinyWaveDrawable;
            blobDrawable.minRadius = AndroidUtilities.dp(47.0f);
            f2 = 0.0f;
            blobDrawable.maxRadius = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            BlobDrawable blobDrawable2 = this.bigWaveDrawable;
            blobDrawable2.minRadius = AndroidUtilities.dp(50.0f);
            blobDrawable2.maxRadius = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            blobDrawable2.update(f5, 1.01f);
            blobDrawable.update(f5, 1.02f);
            Paint paint2 = blobDrawable2.paint;
            paint2.setColor(Theme.multAlpha(0.15f * f, paint.getColor()));
            canvas.save();
            float f7 = fM / blobDrawable2.minRadius;
            canvas.scale(f7, f7, fLerp, fDp);
            blobDrawable2.draw(fLerp, fDp, canvas, paint2);
            canvas.restore();
            Paint paint3 = blobDrawable.paint;
            paint3.setColor(Theme.multAlpha(0.3f * f, paint.getColor()));
            canvas.save();
            float f8 = fM / blobDrawable.minRadius;
            canvas.scale(f8, f8, fLerp, fDp);
            blobDrawable.draw(fLerp, fDp, canvas, paint3);
            canvas.restore();
        } else {
            f2 = 0.0f;
        }
        float fMin = Math.min(fM, AndroidUtilities.dp(55.0f));
        float f9 = f * 255.0f;
        paint.setAlpha((int) f9);
        canvas.drawCircle(fLerp, fDp, fMin, paint);
        canvas.save();
        Path path = this.circlePath;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(fLerp, fDp, fMin, direction);
        canvas.clipPath(path);
        Drawable drawable = this.roundDrawable;
        drawable.setBounds((int) (fLerp - (((drawable.getIntrinsicWidth() / 2.0f) * f6) * (this.stopping ? f : 1.0f))), (int) (fDp - (((drawable.getIntrinsicHeight() / 2.0f) * f6) * (this.stopping ? f : 1.0f))), (int) (((drawable.getIntrinsicWidth() / 2.0f) * f6 * (this.stopping ? f : 1.0f)) + fLerp), (int) (((drawable.getIntrinsicHeight() / 2.0f) * f6 * (this.stopping ? f : 1.0f)) + fDp));
        drawable.setAlpha((int) (f6 * 255.0f * (this.stopping ? f : 1.0f)));
        drawable.draw(canvas);
        if (f4 > f2) {
            float fDpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * f4 * f;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(fLerp - fDpf2, fDp - fDpf2, fLerp + fDpf2, fDp + fDpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.whitePaint);
        }
        canvas.restore();
        float f10 = animatedFloat.value;
        float f11 = animatedFloat2.value;
        float fM2 = ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, f10, AndroidUtilities.lerp(this.lockCancelledT.set(this.slideProgress < 0.4f), 0.0f, f11), f);
        float fDp2 = AndroidUtilities.dp(36.0f) * fM2;
        float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f11) * fM2;
        float fDp3 = rectF.right - AndroidUtilities.dp(20.0f);
        float f12 = fLerp2 / 2.0f;
        float f13 = 1.0f - f11;
        float fLerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - f12) - ((AndroidUtilities.dp(120.0f) * this.lockProgress) * f13), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - fM2);
        RectF rectF3 = this.lockBounds;
        float f14 = fDp2 / 2.0f;
        rectF3.set(fDp3 - f14, fLerp3 - f12, f14 + fDp3, f12 + fLerp3);
        float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f11);
        Paint paint4 = this.lockShadowPaint;
        paint4.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(fM2, 536870912));
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, fLerp4, fLerp4, paint4);
        Paint paint$1 = this.backgroundBlur.getPaint$1(fM2);
        if (paint$1 == null) {
            Paint paint5 = this.lockBackgroundPaint;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * fM2));
            canvas.drawRoundRect(rectF3, fLerp4, fLerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, fLerp4, fLerp4, paint$1);
            Paint paint6 = this.backgroundPaint;
            paint6.setAlpha((int) (51.0f * fM2));
            canvas.drawRoundRect(rectF3, fLerp4, fLerp4, paint6);
        }
        canvas.save();
        canvas.scale(fM2, fM2, fDp3, fLerp3);
        Paint paint7 = this.lockPaint;
        paint7.setColor(Theme.multAlpha(fM2, -1));
        Paint paint8 = this.lockHandlePaint;
        paint8.setColor(Theme.multAlpha(fM2 * f13, -1));
        float fLerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f11);
        float fLerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f11);
        float fDp4 = (AndroidUtilities.dp(4.0f) * f13) + fLerp3;
        canvas.rotate(this.lockProgress * 12.0f * f13, fDp3, fDp4);
        RectF rectF4 = this.lockRect;
        float f15 = fLerp5 / 2.0f;
        float f16 = fLerp6 / 2.0f;
        float f17 = fDp4 - f16;
        rectF4.set(fDp3 - f15, f17, f15 + fDp3, fDp4 + f16);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f11 < 1.0f) {
            canvas.save();
            canvas.rotate(this.lockProgress * 12.0f * f13, fDp3, f17);
            canvas.translate(0.0f, f16 * f11);
            canvas.scale(f13, f13, fDp3, f17);
            Path path2 = this.lockHandle;
            path2.rewind();
            float fDp5 = AndroidUtilities.dp(4.33f);
            float fDp6 = f17 - AndroidUtilities.dp(3.66f);
            float f18 = fDp3 + fDp5;
            path2.moveTo(f18, AndroidUtilities.dp(3.66f) + fDp6);
            path2.lineTo(f18, fDp6);
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f19 = fDp3 - fDp5;
            rectF5.set(f19, fDp6 - fDp5, f18, fDp5 + fDp6);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f19, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.lockProgress), 1.0f, f11) * AndroidUtilities.dp(3.66f)) + fDp6);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.cancelling) {
            ImageView imageView = this.roundButton;
            int visibility = imageView.getVisibility();
            ImageView imageView2 = this.periodButton;
            AnimatedFloat animatedFloat3 = this.collapsedT;
            if (visibility == 4 || imageView2.getVisibility() == 4 || animatedFloat3.value > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.keyboardT) * 255.0f), 31);
                Path path3 = this.boundsPath;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || animatedFloat3.value > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f6) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || animatedFloat3.value > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f6) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.flipButton == null) {
            this.flipButton = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.flipButton.setAlpha((int) (f9 * f6));
        float timelineHeight = getTimelineHeight();
        this.flipButton.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.flipButton.draw(canvas);
    }

    @Override
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitDefault;
    }

    @Override
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitPremium;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecordDot recordDot = this.recordPaint;
        recordDot.attachedToWindow = true;
        boolean z = recordDot.playing;
        RLottieDrawable rLottieDrawable = recordDot.drawable;
        if (z) {
            rLottieDrawable.start();
        }
        rLottieDrawable.masterParent = recordDot.parent;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RecordDot recordDot = this.recordPaint;
        recordDot.attachedToWindow = false;
        RLottieDrawable rLottieDrawable = recordDot.drawable;
        rLottieDrawable.isRunning = false;
        rLottieDrawable.checkChoreographer$1();
        recordDot.drawable.masterParent = null;
    }

    @Override
    public final void onUpdateShowKeyboard(float f) {
        float f2 = 1.0f - f;
        this.periodButton.setAlpha(f2);
        this.roundButton.setAlpha(f2);
    }

    public final void releaseRecord(boolean z, boolean z2) {
        AndroidUtilities.cancelRunOnUIThread(this.doneCancel);
        this.stopping = true;
        this.recording = false;
        int iDp = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.slideProgress));
        this.collapsed = false;
        this.collapsedFromX = iDp;
        invalidate();
        AnonymousClass1 anonymousClass1 = this.currentRecorder;
        if (anonymousClass1 != null) {
            if (!z) {
                if (z2) {
                    anonymousClass1.cancelled = true;
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1.stopRunnable);
                    CameraController.getInstance().stopVideoRecording(anonymousClass1.cameraView.getCameraSessionRecording(), false, false);
                    anonymousClass1.destroy(false);
                } else {
                    anonymousClass1.stop();
                }
            }
            this.currentRecorder = null;
        }
        invalidateDrawOver2();
    }

    public void setAmplitude(double d) {
        this.amplitude = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z) {
        ImageView imageView = this.roundButton;
        imageView.setImageResource(z ? R.drawable.input_video_story_remove : R.drawable.input_video_story);
        imageView.setContentDescription(LocaleController.getString(z ? R.string.AccDescrRemoveRoundVideo : R.string.AccDescrVideoMessage));
        this.hasRoundVideo = z;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.onPeriodUpdate = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.onPremiumHintShow = callback;
    }

    public void setPeriod(int i) {
        setPeriod(i, true);
    }

    public void setPeriodVisible(boolean z) {
        this.periodVisible = z;
        this.periodButton.setVisibility((!z || this.keyboardShown) ? 8 : 0);
    }

    public final void showRemoveRoundAlert() {
        if (this.hasRoundVideo) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            builder.setPositiveButton(LocaleController.getString(R.string.Remove), new StoriesViewPager$$ExternalSyntheticLambda0(this, 23));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) builder.show().getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
            }
        }
    }

    public final void setPeriod(int i, boolean z) {
        int i2 = 0;
        while (true) {
            int[] iArr = periods;
            if (i2 >= 4) {
                i2 = 2;
                break;
            } else if (iArr[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (this.periodIndex == i2) {
            return;
        }
        this.periodIndex = i2;
        this.periodDrawable.setValue(i / 3600, false, z);
    }
}
