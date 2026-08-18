package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;

public class SeekBarView extends FrameLayout {
    private static Path tmpPath;
    private static float[] tmpRadii;
    private final float TIMESTAMP_GAP;
    private AnimatedFloat animatedThumbX;
    private float bufferedProgress;
    boolean captured;
    private float currentRadius;
    private int currentTimestamp;
    public SeekBarViewDelegate delegate;
    private Drawable hoverDrawable;
    private Paint innerPaint1;
    private CharSequence lastCaption;
    private long lastDuration;
    private int lastTimestamp;
    private int lastTimestampLabelWidth;
    private long lastTimestampUpdate;
    private long lastTimestampsAppearingUpdate;
    private long lastUpdateTime;
    int lastValue;
    private float lastWidth;
    private int lineWidthDp;
    private float minProgress;
    private Paint outerPaint1;
    private boolean pressed;
    private boolean pressedDelayed;
    private int[] pressedState;
    private float progressToSet;
    private RectF rect;
    private boolean reportChanges;
    private final Theme.ResourcesProvider resourcesProvider;
    private final SeekBarAccessibilityDelegate seekBarAccessibilityDelegate;
    private int selectorWidth;
    private int separatorsCount;
    float sx;
    float sy;
    private final AudioPlayerAlert.ClippingTextViewSwitcher textViewSwitcher;
    private int thumbDX;
    private int thumbSize;
    private int thumbX;
    private int timestampChangeDirection;
    private float timestampChangeT;
    private int timestampIndex;
    private StaticLayout[] timestampLabel;
    private TextPaint timestampLabelPaint;
    private ArrayList timestamps;
    private float timestampsAppearing;
    private float transitionProgress;
    private int transitionThumbX;
    private boolean twoSided;

    public interface SeekBarViewDelegate {

        public abstract class CC {
            public static CharSequence $default$getContentDescription(SeekBarViewDelegate seekBarViewDelegate) {
                return null;
            }

            public static int $default$getStepsCount(SeekBarViewDelegate seekBarViewDelegate) {
                return 0;
            }

            public static boolean $default$needVisuallyDivideSteps(SeekBarViewDelegate seekBarViewDelegate) {
                return false;
            }

            public static void $default$onSeekBarPressed(SeekBarViewDelegate seekBarViewDelegate, boolean z) {
            }
        }

        CharSequence getContentDescription();

        int getStepsCount();

        boolean needVisuallyDivideSteps();

        void onSeekBarDrag(boolean z, float f);

        void onSeekBarPressed(boolean z);
    }

    public SeekBarView(Context context) {
        this(context, null);
    }

    public SeekBarView(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, false, resourcesProvider);
    }

    public SeekBarView(final Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.animatedThumbX = new AnimatedFloat(this, 0L, 60L, CubicBezierInterpolator.EASE_OUT);
        this.progressToSet = -100.0f;
        this.minProgress = -1.0f;
        this.pressedState = new int[]{16842910, 16842919};
        this.transitionProgress = 1.0f;
        this.lineWidthDp = 3;
        this.timestampsAppearing = 0.0f;
        this.TIMESTAMP_GAP = 1.0f;
        this.currentTimestamp = -1;
        this.lastTimestamp = -1;
        this.timestampChangeT = 1.0f;
        this.lastWidth = -1.0f;
        this.rect = new RectF();
        this.timestampIndex = -1;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        this.innerPaint1 = new Paint(1);
        Paint paint = new Paint(1);
        this.outerPaint1 = paint;
        int i = Theme.key_player_progress;
        paint.setColor(getThemedColor(i));
        this.selectorWidth = AndroidUtilities.dp(32.0f);
        this.thumbSize = AndroidUtilities.dp(24.0f);
        this.currentRadius = AndroidUtilities.dp(6.0f);
        Drawable drawableCreateSelectorDrawable = Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i), 40), 1, AndroidUtilities.dp(16.0f));
        this.hoverDrawable = drawableCreateSelectorDrawable;
        drawableCreateSelectorDrawable.setCallback(this);
        this.hoverDrawable.setVisible(true, false);
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = new AudioPlayerAlert.ClippingTextViewSwitcher(context) {
            @Override
            protected TextView createTextView() {
                MarqueeTextView marqueeTextView = new MarqueeTextView(context);
                marqueeTextView.setTextColor(SeekBarView.this.getThemedColor(Theme.key_player_time));
                marqueeTextView.setTextSize(1, 12.0f);
                marqueeTextView.setEllipsize(TextUtils.TruncateAt.END);
                marqueeTextView.setSingleLine(true);
                marqueeTextView.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return marqueeTextView;
            }
        };
        this.textViewSwitcher = clippingTextViewSwitcher;
        clippingTextViewSwitcher.setIsCenter();
        addView(clippingTextViewSwitcher, LayoutHelper.createFrame(-1, -2.0f));
        setImportantForAccessibility(1);
        FloatSeekBarAccessibilityDelegate floatSeekBarAccessibilityDelegate = new FloatSeekBarAccessibilityDelegate(z) {
            @Override
            public float getProgress() {
                return SeekBarView.this.getProgress();
            }

            @Override
            public void setProgress(float f) {
                SeekBarView.this.pressed = true;
                SeekBarView.this.setProgress(f);
                SeekBarView.this.setSeekBarDrag(true, f);
                SeekBarView.this.pressed = false;
            }

            @Override
            protected float getDelta() {
                int stepsCount = SeekBarView.this.delegate.getStepsCount();
                return stepsCount > 0 ? 1.0f / stepsCount : super.getDelta();
            }

            @Override
            public CharSequence getContentDescription(View view) {
                SeekBarViewDelegate seekBarViewDelegate = SeekBarView.this.delegate;
                if (seekBarViewDelegate != null) {
                    return seekBarViewDelegate.getContentDescription();
                }
                return null;
            }
        };
        this.seekBarAccessibilityDelegate = floatSeekBarAccessibilityDelegate;
        setAccessibilityDelegate(floatSeekBarAccessibilityDelegate);
    }

    public void setSeparatorsCount(int i) {
        this.separatorsCount = i;
    }

    public void setTwoSided(boolean z) {
        this.twoSided = z;
    }

    public boolean isTwoSided() {
        return this.twoSided;
    }

    public void setInnerColor(int i) {
        this.innerPaint1.setColor(i);
    }

    public void setOuterColor(int i) {
        this.outerPaint1.setColor(i);
        Drawable drawable = this.hoverDrawable;
        if (drawable != null) {
            Theme.setSelectorDrawableColor(drawable, ColorUtils.setAlphaComponent(i, 40), true);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouch(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouch(motionEvent);
    }

    public void setReportChanges(boolean z) {
        this.reportChanges = z;
    }

    public void setMinProgress(float f) {
        this.minProgress = f;
        float progress = getProgress();
        float f2 = this.minProgress;
        if (progress < f2) {
            setProgress(f2, false);
        }
        invalidate();
    }

    public void setDelegate(SeekBarViewDelegate seekBarViewDelegate) {
        this.delegate = seekBarViewDelegate;
    }

    boolean onTouch(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.sx = motionEvent.getX();
            this.sy = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.captured = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.sy) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight = (getMeasuredHeight() - this.thumbSize) / 2;
                    if (this.thumbX - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.thumbX + this.thumbSize + measuredHeight) {
                        int x = ((int) motionEvent.getX()) - (this.thumbSize / 2);
                        this.thumbX = x;
                        if (x < minThumbX()) {
                            this.thumbX = minThumbX();
                        } else if (this.thumbX > getMeasuredWidth() - this.selectorWidth) {
                            this.thumbX = getMeasuredWidth() - this.selectorWidth;
                        }
                    }
                    this.thumbDX = (int) (motionEvent.getX() - this.thumbX);
                    this.pressedDelayed = true;
                    this.pressed = true;
                }
            }
            if (this.pressed) {
                if (motionEvent.getAction() == 1) {
                    if (this.twoSided) {
                        float measuredWidth = (getMeasuredWidth() - this.selectorWidth) / 2;
                        float f = this.thumbX;
                        if (f >= measuredWidth) {
                            setSeekBarDrag(false, (f - measuredWidth) / measuredWidth);
                        } else {
                            setSeekBarDrag(false, -Math.max(0.01f, 1.0f - ((measuredWidth - f) / measuredWidth)));
                        }
                    } else {
                        setSeekBarDrag(true, this.thumbX / (getMeasuredWidth() - this.selectorWidth));
                    }
                }
                Drawable drawable = this.hoverDrawable;
                if (drawable != null) {
                    drawable.setState(StateSet.NOTHING);
                }
                this.delegate.onSeekBarPressed(false);
                this.pressed = false;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onTouch$0();
                    }
                }, 50L);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.captured) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.sy) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.sx) > viewConfiguration.getScaledTouchSlop()) {
                    this.captured = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    int measuredHeight2 = (getMeasuredHeight() - this.thumbSize) / 2;
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        if (this.thumbX - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.thumbX + this.thumbSize + measuredHeight2) {
                            int x2 = ((int) motionEvent.getX()) - (this.thumbSize / 2);
                            this.thumbX = x2;
                            if (x2 < minThumbX()) {
                                this.thumbX = minThumbX();
                            } else if (this.thumbX > getMeasuredWidth() - this.selectorWidth) {
                                this.thumbX = getMeasuredWidth() - this.selectorWidth;
                            }
                        }
                        this.thumbDX = (int) (motionEvent.getX() - this.thumbX);
                        this.pressedDelayed = true;
                        this.pressed = true;
                        this.delegate.onSeekBarPressed(true);
                        Drawable drawable2 = this.hoverDrawable;
                        if (drawable2 != null) {
                            drawable2.setState(this.pressedState);
                            this.hoverDrawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.pressed) {
                int x3 = (int) (motionEvent.getX() - this.thumbDX);
                this.thumbX = x3;
                if (x3 < minThumbX()) {
                    this.thumbX = minThumbX();
                } else if (this.thumbX > getMeasuredWidth() - this.selectorWidth) {
                    this.thumbX = getMeasuredWidth() - this.selectorWidth;
                }
                if (this.reportChanges) {
                    if (this.twoSided) {
                        float measuredWidth2 = (getMeasuredWidth() - this.selectorWidth) / 2;
                        float f2 = this.thumbX;
                        if (f2 >= measuredWidth2) {
                            setSeekBarDrag(false, (f2 - measuredWidth2) / measuredWidth2);
                        } else {
                            setSeekBarDrag(false, -Math.max(0.01f, 1.0f - ((measuredWidth2 - f2) / measuredWidth2)));
                        }
                    } else {
                        setSeekBarDrag(false, this.thumbX / (getMeasuredWidth() - this.selectorWidth));
                    }
                }
                Drawable drawable3 = this.hoverDrawable;
                if (drawable3 != null) {
                    drawable3.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void lambda$onTouch$0() {
        this.pressedDelayed = false;
    }

    private int minThumbX() {
        return Math.max((int) (this.minProgress * (getMeasuredWidth() - this.selectorWidth)), 0);
    }

    public void setLineWidth(int i) {
        this.lineWidthDp = i;
    }

    public void setSeekBarDrag(boolean z, float f) {
        SeekBarViewDelegate seekBarViewDelegate = this.delegate;
        if (seekBarViewDelegate != null) {
            seekBarViewDelegate.onSeekBarDrag(z, f);
        }
        int i = this.separatorsCount;
        if (i > 1) {
            int iRound = Math.round((i - 1) * f);
            if (!z && iRound != this.lastValue) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.lastValue = iRound;
        }
    }

    public float getProgress() {
        if (getMeasuredWidth() == 0) {
            return this.progressToSet;
        }
        return this.thumbX / (getMeasuredWidth() - this.selectorWidth);
    }

    public void setProgress(float f) {
        setProgress(f, false);
    }

    public void setProgress(float f, boolean z) {
        double dCeil;
        if (getMeasuredWidth() == 0) {
            this.progressToSet = f;
            return;
        }
        this.progressToSet = -100.0f;
        if (this.twoSided) {
            float measuredWidth = (getMeasuredWidth() - this.selectorWidth) / 2;
            if (f < 0.0f) {
                dCeil = Math.ceil(measuredWidth + ((-(f + 1.0f)) * measuredWidth));
            } else {
                dCeil = Math.ceil(measuredWidth + (f * measuredWidth));
            }
        } else {
            dCeil = Math.ceil((getMeasuredWidth() - this.selectorWidth) * f);
        }
        int i = (int) dCeil;
        int i2 = this.thumbX;
        if (i2 != i) {
            if (z) {
                this.transitionThumbX = i2;
                this.transitionProgress = 0.0f;
            }
            this.thumbX = i;
            if (i < minThumbX()) {
                this.thumbX = minThumbX();
            } else if (this.thumbX > getMeasuredWidth() - this.selectorWidth) {
                this.thumbX = getMeasuredWidth() - this.selectorWidth;
            }
            invalidate();
        }
    }

    public void setBufferedProgress(float f) {
        this.bufferedProgress = f;
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.lastTimestampLabelWidth = timestampLabelWidth;
        this.textViewSwitcher.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.progressToSet == -100.0f || getMeasuredWidth() <= 0) {
            return;
        }
        setProgress(this.progressToSet);
        this.progressToSet = -100.0f;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = (getMeasuredHeight() / 2) + AndroidUtilities.dp(14.0f) + (this.textViewSwitcher.getMeasuredHeight() / 2);
        int iDp = (this.selectorWidth / 2) + (this.lastDuration > 600000 ? AndroidUtilities.dp(42.0f) : 0) + AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(8.0f);
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.textViewSwitcher;
        clippingTextViewSwitcher.layout(iDp, measuredHeight - clippingTextViewSwitcher.getMeasuredHeight(), this.textViewSwitcher.getMeasuredWidth() + iDp, measuredHeight);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.hoverDrawable;
    }

    public boolean isDragging() {
        return this.pressed;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float fRound;
        int i;
        int measuredHeight;
        float f;
        float measuredWidth;
        float fDp;
        float fDp2;
        float f2;
        long jElapsedRealtime;
        float f3;
        float f4;
        boolean z;
        float f5;
        float f6;
        float interpolation;
        float f7;
        float fDp3;
        float fDp4;
        int measuredWidth2;
        int i2;
        int i3 = this.thumbX;
        boolean z2 = true;
        if (!this.twoSided && this.separatorsCount > 1) {
            float measuredWidth3 = (getMeasuredWidth() - this.selectorWidth) / (this.separatorsCount - 1.0f);
            fRound = this.animatedThumbX.set(Math.round(i3 / measuredWidth3) * measuredWidth3);
        } else {
            SeekBarViewDelegate seekBarViewDelegate = this.delegate;
            if (seekBarViewDelegate != null && seekBarViewDelegate.needVisuallyDivideSteps()) {
                float measuredWidth4 = (getMeasuredWidth() - this.selectorWidth) / (this.delegate.getStepsCount() - 1.0f);
                fRound = Math.round(i3 / measuredWidth4) * measuredWidth4;
            }
            i = i3;
            measuredHeight = (getMeasuredHeight() - this.thumbSize) / 2;
            this.innerPaint1.setColor(getThemedColor(Theme.key_player_progressBackground));
            float measuredHeight2 = getMeasuredHeight() / 2.0f;
            f = this.selectorWidth / 2.0f;
            measuredWidth = getMeasuredWidth() - (this.selectorWidth / 2);
            fDp = measuredHeight2 - (AndroidUtilities.dp(this.lineWidthDp) / 2.0f);
            fDp2 = measuredHeight2 + (AndroidUtilities.dp(this.lineWidthDp) / 2.0f);
            this.rect.set(f, fDp, measuredWidth, fDp2);
            drawProgressBar(canvas, this.rect, this.innerPaint1);
            if (this.bufferedProgress > 0.0f) {
                this.innerPaint1.setColor(getThemedColor(Theme.key_player_progressCachedBackground));
                this.rect.set(f, fDp, (this.selectorWidth / 2.0f) + (this.bufferedProgress * (getMeasuredWidth() - this.selectorWidth)), fDp2);
                drawProgressBar(canvas, this.rect, this.innerPaint1);
            }
            if (this.twoSided) {
                canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(6.0f), (getMeasuredWidth() / 2) + AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) + AndroidUtilities.dp(6.0f), this.outerPaint1);
                measuredWidth2 = getMeasuredWidth();
                i2 = this.selectorWidth;
                if (i > (measuredWidth2 - i2) / 2) {
                    canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), (this.selectorWidth / 2) + i, (getMeasuredHeight() / 2) + AndroidUtilities.dp(1.0f), this.outerPaint1);
                } else {
                    canvas.drawRect((i2 / 2) + i, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, (getMeasuredHeight() / 2) + AndroidUtilities.dp(1.0f), this.outerPaint1);
                }
            } else {
                f2 = this.minProgress;
                if (f2 >= 0.0f) {
                    float f8 = measuredWidth - f;
                    this.rect.set((f2 * f8) + f, fDp, i + f, fDp2);
                    drawProgressBar(canvas, this.rect, this.outerPaint1);
                    int alpha = this.outerPaint1.getAlpha();
                    this.rect.set(f, fDp, (this.minProgress * f8) + f, fDp2);
                    this.outerPaint1.setAlpha((int) (alpha * 0.5f));
                    drawProgressBar(canvas, this.rect, this.outerPaint1);
                    this.outerPaint1.setAlpha(alpha);
                } else {
                    this.rect.set(f, fDp, i + f, fDp2);
                    drawProgressBar(canvas, this.rect, this.outerPaint1);
                }
            }
            if (this.hoverDrawable != null) {
                int iDp = ((this.selectorWidth / 2) + i) - AndroidUtilities.dp(16.0f);
                int iDp2 = ((this.thumbSize / 2) + measuredHeight) - AndroidUtilities.dp(16.0f);
                this.hoverDrawable.setBounds(iDp, iDp2, AndroidUtilities.dp(32.0f) + iDp, AndroidUtilities.dp(32.0f) + iDp2);
                this.hoverDrawable.draw(canvas);
            }
            int iDp3 = AndroidUtilities.dp(this.pressed ? 8.0f : 6.0f);
            jElapsedRealtime = SystemClock.elapsedRealtime() - this.lastUpdateTime;
            if (jElapsedRealtime > 18) {
                jElapsedRealtime = 16;
            }
            f3 = this.currentRadius;
            f4 = iDp3;
            if (f3 != f4) {
                if (f3 < f4) {
                    fDp4 = f3 + (AndroidUtilities.dp(1.0f) * (jElapsedRealtime / 60.0f));
                    this.currentRadius = fDp4;
                    if (fDp4 > f4) {
                        this.currentRadius = f4;
                    }
                } else {
                    fDp3 = f3 - (AndroidUtilities.dp(1.0f) * (jElapsedRealtime / 60.0f));
                    this.currentRadius = fDp3;
                    if (fDp3 < f4) {
                        this.currentRadius = f4;
                    }
                }
                z = true;
            } else {
                z = false;
            }
            f5 = this.transitionProgress;
            if (f5 < 1.0f) {
                f7 = f5 + (jElapsedRealtime / 225.0f);
                this.transitionProgress = f7;
                if (f7 >= 1.0f) {
                    this.transitionProgress = 1.0f;
                    z2 = z;
                }
            } else {
                z2 = z;
            }
            f6 = this.transitionProgress;
            if (f6 < 1.0f) {
                interpolation = 1.0f - Easings.easeInQuad.getInterpolation(Math.min(1.0f, f6 * 3.0f));
                float interpolation2 = Easings.easeOutQuad.getInterpolation(this.transitionProgress);
                if (interpolation > 0.0f) {
                    canvas.drawCircle(this.transitionThumbX + (this.selectorWidth / 2), (this.thumbSize / 2) + measuredHeight, this.currentRadius * interpolation, this.outerPaint1);
                }
                canvas.drawCircle(i + (this.selectorWidth / 2), measuredHeight + (this.thumbSize / 2), this.currentRadius * interpolation2, this.outerPaint1);
            } else {
                canvas.drawCircle(i + (this.selectorWidth / 2), measuredHeight + (this.thumbSize / 2), this.currentRadius, this.outerPaint1);
            }
            drawTimestampLabel(canvas);
            if (z2) {
                postInvalidateOnAnimation();
            }
        }
        i3 = (int) fRound;
        i = i3;
        measuredHeight = (getMeasuredHeight() - this.thumbSize) / 2;
        this.innerPaint1.setColor(getThemedColor(Theme.key_player_progressBackground));
        float measuredHeight3 = getMeasuredHeight() / 2.0f;
        f = this.selectorWidth / 2.0f;
        measuredWidth = getMeasuredWidth() - (this.selectorWidth / 2);
        fDp = measuredHeight3 - (AndroidUtilities.dp(this.lineWidthDp) / 2.0f);
        fDp2 = measuredHeight3 + (AndroidUtilities.dp(this.lineWidthDp) / 2.0f);
        this.rect.set(f, fDp, measuredWidth, fDp2);
        drawProgressBar(canvas, this.rect, this.innerPaint1);
        if (this.bufferedProgress > 0.0f) {
            this.innerPaint1.setColor(getThemedColor(Theme.key_player_progressCachedBackground));
            this.rect.set(f, fDp, (this.selectorWidth / 2.0f) + (this.bufferedProgress * (getMeasuredWidth() - this.selectorWidth)), fDp2);
            drawProgressBar(canvas, this.rect, this.innerPaint1);
        }
        if (this.twoSided) {
            canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(6.0f), (getMeasuredWidth() / 2) + AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) + AndroidUtilities.dp(6.0f), this.outerPaint1);
            measuredWidth2 = getMeasuredWidth();
            i2 = this.selectorWidth;
            if (i > (measuredWidth2 - i2) / 2) {
                canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), (this.selectorWidth / 2) + i, (getMeasuredHeight() / 2) + AndroidUtilities.dp(1.0f), this.outerPaint1);
            } else {
                canvas.drawRect((i2 / 2) + i, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, (getMeasuredHeight() / 2) + AndroidUtilities.dp(1.0f), this.outerPaint1);
            }
        } else {
            f2 = this.minProgress;
            if (f2 >= 0.0f) {
                float f9 = measuredWidth - f;
                this.rect.set((f2 * f9) + f, fDp, i + f, fDp2);
                drawProgressBar(canvas, this.rect, this.outerPaint1);
                int alpha2 = this.outerPaint1.getAlpha();
                this.rect.set(f, fDp, (this.minProgress * f9) + f, fDp2);
                this.outerPaint1.setAlpha((int) (alpha2 * 0.5f));
                drawProgressBar(canvas, this.rect, this.outerPaint1);
                this.outerPaint1.setAlpha(alpha2);
            } else {
                this.rect.set(f, fDp, i + f, fDp2);
                drawProgressBar(canvas, this.rect, this.outerPaint1);
            }
        }
        if (this.hoverDrawable != null) {
            int iDp4 = ((this.selectorWidth / 2) + i) - AndroidUtilities.dp(16.0f);
            int iDp5 = ((this.thumbSize / 2) + measuredHeight) - AndroidUtilities.dp(16.0f);
            this.hoverDrawable.setBounds(iDp4, iDp5, AndroidUtilities.dp(32.0f) + iDp4, AndroidUtilities.dp(32.0f) + iDp5);
            this.hoverDrawable.draw(canvas);
        }
        int iDp6 = AndroidUtilities.dp(this.pressed ? 8.0f : 6.0f);
        jElapsedRealtime = SystemClock.elapsedRealtime() - this.lastUpdateTime;
        if (jElapsedRealtime > 18) {
            jElapsedRealtime = 16;
        }
        f3 = this.currentRadius;
        f4 = iDp6;
        if (f3 != f4) {
            if (f3 < f4) {
                fDp4 = f3 + (AndroidUtilities.dp(1.0f) * (jElapsedRealtime / 60.0f));
                this.currentRadius = fDp4;
                if (fDp4 > f4) {
                    this.currentRadius = f4;
                }
            } else {
                fDp3 = f3 - (AndroidUtilities.dp(1.0f) * (jElapsedRealtime / 60.0f));
                this.currentRadius = fDp3;
                if (fDp3 < f4) {
                    this.currentRadius = f4;
                }
            }
            z = true;
        } else {
            z = false;
        }
        f5 = this.transitionProgress;
        if (f5 < 1.0f) {
            f7 = f5 + (jElapsedRealtime / 225.0f);
            this.transitionProgress = f7;
            if (f7 >= 1.0f) {
                this.transitionProgress = 1.0f;
                z2 = z;
            }
        } else {
            z2 = z;
        }
        f6 = this.transitionProgress;
        if (f6 < 1.0f) {
            interpolation = 1.0f - Easings.easeInQuad.getInterpolation(Math.min(1.0f, f6 * 3.0f));
            float interpolation3 = Easings.easeOutQuad.getInterpolation(this.transitionProgress);
            if (interpolation > 0.0f) {
                canvas.drawCircle(this.transitionThumbX + (this.selectorWidth / 2), (this.thumbSize / 2) + measuredHeight, this.currentRadius * interpolation, this.outerPaint1);
            }
            canvas.drawCircle(i + (this.selectorWidth / 2), measuredHeight + (this.thumbSize / 2), this.currentRadius * interpolation3, this.outerPaint1);
        } else {
            canvas.drawCircle(i + (this.selectorWidth / 2), measuredHeight + (this.thumbSize / 2), this.currentRadius, this.outerPaint1);
        }
        drawTimestampLabel(canvas);
        if (z2) {
            postInvalidateOnAnimation();
        }
    }

    public void clearTimestamps() {
        this.timestamps = null;
        this.currentTimestamp = -1;
        this.timestampsAppearing = 0.0f;
        StaticLayout[] staticLayoutArr = this.timestampLabel;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.lastCaption = null;
        this.lastDuration = -1L;
    }

    public void updateTimestamps(MessageObject messageObject, Long l) {
        Integer num;
        String str;
        if (messageObject == null) {
            clearTimestamps();
            return;
        }
        if (l == null) {
            l = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        }
        if (l.longValue() < 0) {
            clearTimestamps();
            return;
        }
        CharSequence charSequence = messageObject.caption;
        if (messageObject.isYouTubeVideo()) {
            if (messageObject.youtubeDescription == null && (str = messageObject.messageOwner.media.webpage.description) != null) {
                messageObject.youtubeDescription = SpannableString.valueOf(str);
                MessageObject.addUrlsByPattern(messageObject.isOut(), messageObject.youtubeDescription, false, 3, (int) l.longValue(), false);
            }
            charSequence = messageObject.youtubeDescription;
        }
        boolean z = charSequence != this.lastCaption;
        if (z || this.lastDuration != l.longValue()) {
            this.lastCaption = charSequence;
            this.lastDuration = l.longValue() * 10;
            if (getTimestampLabelWidth() != this.lastTimestampLabelWidth) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.timestamps = null;
                this.currentTimestamp = -1;
                this.timestampsAppearing = 0.0f;
                StaticLayout[] staticLayoutArr = this.timestampLabel;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                URLSpanNoUnderline[] uRLSpanNoUnderlineArr = (URLSpanNoUnderline[]) spanned.getSpans(0, spanned.length(), URLSpanNoUnderline.class);
                this.timestamps = new ArrayList();
                if (z) {
                    this.timestampsAppearing = 0.0f;
                }
                if (this.timestampLabelPaint == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.timestampLabelPaint = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.timestampLabelPaint.setColor(-1);
                }
                for (URLSpanNoUnderline uRLSpanNoUnderline : uRLSpanNoUnderlineArr) {
                    if (uRLSpanNoUnderline != null && uRLSpanNoUnderline.getURL() != null && uRLSpanNoUnderline.label != null && uRLSpanNoUnderline.getURL().startsWith("audio?") && (num = Utilities.parseInt((CharSequence) uRLSpanNoUnderline.getURL().substring(6))) != null && num.intValue() >= 0) {
                        float fIntValue = (((long) num.intValue()) * 1000) / l.longValue();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uRLSpanNoUnderline.label);
                        Emoji.replaceEmoji(spannableStringBuilder, this.timestampLabelPaint.getFontMetricsInt(), false);
                        this.timestamps.add(new Pair(Float.valueOf(fIntValue), spannableStringBuilder));
                    }
                }
                Collections.sort(this.timestamps, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return SeekBarView.lambda$updateTimestamps$1((Pair) obj, (Pair) obj2);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
                this.timestamps = null;
                this.currentTimestamp = -1;
                this.timestampsAppearing = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.timestampLabel;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public static int lambda$updateTimestamps$1(Pair pair, Pair pair2) {
        if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
            return 1;
        }
        return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
    }

    private void drawProgressBar(Canvas canvas, RectF rectF, Paint paint) {
        int size;
        SeekBarView seekBarView = this;
        float fDp = AndroidUtilities.dp(2.0f);
        ArrayList arrayList = seekBarView.timestamps;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, fDp, fDp, paint);
            return;
        }
        float f = rectF.bottom;
        float f2 = seekBarView.selectorWidth / 2.0f;
        float measuredWidth = getMeasuredWidth() - (seekBarView.selectorWidth / 2.0f);
        AndroidUtilities.rectTmp.set(rectF);
        float fDp2 = AndroidUtilities.dp(seekBarView.timestampsAppearing * 1.0f) / 2.0f;
        if (tmpPath == null) {
            tmpPath = new Path();
        }
        tmpPath.reset();
        float fDp3 = AndroidUtilities.dp(4.0f) / (measuredWidth - f2);
        int i = 0;
        while (true) {
            size = -1;
            if (i >= seekBarView.timestamps.size()) {
                i = -1;
                break;
            } else if (((Float) ((Pair) seekBarView.timestamps.get(i)).first).floatValue() >= fDp3) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            i = 0;
        }
        int i2 = 1;
        for (int size2 = seekBarView.timestamps.size() - 1; size2 >= 0; size2--) {
            if (1.0f - ((Float) ((Pair) seekBarView.timestamps.get(size2)).first).floatValue() >= fDp3) {
                size = size2 + 1;
                break;
            }
        }
        if (size < 0) {
            size = seekBarView.timestamps.size();
        }
        int i3 = i;
        while (i3 <= size) {
            float fFloatValue = i3 == i ? 0.0f : ((Float) ((Pair) seekBarView.timestamps.get(i3 - 1)).first).floatValue();
            float fFloatValue2 = i3 == size ? 1.0f : ((Float) ((Pair) seekBarView.timestamps.get(i3)).first).floatValue();
            while (i3 != size && i3 != 0 && i3 < seekBarView.timestamps.size() - i2 && ((Float) ((Pair) seekBarView.timestamps.get(i3)).first).floatValue() - fFloatValue <= fDp3) {
                i3++;
                fFloatValue2 = ((Float) ((Pair) seekBarView.timestamps.get(i3)).first).floatValue();
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(f2, measuredWidth, fFloatValue) + (i3 > 0 ? fDp2 : 0.0f);
            float fLerp = AndroidUtilities.lerp(f2, measuredWidth, fFloatValue2) - (i3 < size ? fDp2 : 0.0f);
            rectF2.right = fLerp;
            float f3 = rectF.right;
            boolean z = fLerp > f3;
            if (z) {
                rectF2.right = f3;
            }
            float f4 = rectF2.right;
            float f5 = rectF.left;
            if (f4 >= f5) {
                if (rectF2.left < f5) {
                    rectF2.left = f5;
                }
                if (tmpRadii == null) {
                    tmpRadii = new float[8];
                }
                if (i3 == i || (z && rectF2.left >= rectF.left)) {
                    float[] fArr = tmpRadii;
                    fArr[7] = fDp;
                    fArr[6] = fDp;
                    fArr[1] = fDp;
                    fArr[0] = fDp;
                    float f6 = 0.7f * fDp * seekBarView.timestampsAppearing;
                    fArr[5] = f6;
                    fArr[4] = f6;
                    fArr[3] = f6;
                    fArr[2] = f6;
                } else if (i3 >= size) {
                    float[] fArr2 = tmpRadii;
                    float f7 = 0.7f * fDp * seekBarView.timestampsAppearing;
                    fArr2[7] = f7;
                    fArr2[6] = f7;
                    fArr2[1] = f7;
                    fArr2[0] = f7;
                    fArr2[5] = fDp;
                    fArr2[4] = fDp;
                    fArr2[3] = fDp;
                    fArr2[2] = fDp;
                } else {
                    float[] fArr3 = tmpRadii;
                    float f8 = 0.7f * fDp * seekBarView.timestampsAppearing;
                    fArr3[5] = f8;
                    fArr3[4] = f8;
                    fArr3[3] = f8;
                    fArr3[2] = f8;
                    fArr3[7] = f8;
                    fArr3[6] = f8;
                    fArr3[1] = f8;
                    fArr3[0] = f8;
                }
                tmpPath.addRoundRect(rectF2, tmpRadii, Path.Direction.CW);
                if (z) {
                    break;
                }
            }
            i3++;
            i2 = 1;
            seekBarView = this;
        }
        canvas.drawPath(tmpPath, paint);
    }

    private void setTimestampIndex(int i) {
        if (this.timestampIndex != i) {
            this.timestampIndex = i;
            if (i < 0 || i >= this.timestamps.size()) {
                return;
            }
            this.textViewSwitcher.setText((CharSequence) ((Pair) this.timestamps.get(this.timestampIndex)).second);
        }
    }

    private int getTimestampLabelWidth() {
        return (int) (Math.abs(((this.selectorWidth / 2.0f) + (this.lastDuration > 600000 ? AndroidUtilities.dp(42.0f) : 0)) - ((getMeasuredWidth() - (this.selectorWidth / 2.0f)) - (this.lastDuration > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f));
    }

    private void drawTimestampLabel(Canvas canvas) {
        CharSequence charSequence;
        ArrayList arrayList = this.timestamps;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float progress = getProgress();
        int size = this.timestamps.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.timestamps.get(size)).first).floatValue() - 0.001f <= progress) {
                break;
            } else {
                size--;
            }
        }
        setTimestampIndex(size);
        if (this.timestampLabel == null) {
            this.timestampLabel = new StaticLayout[2];
        }
        float fDp = (this.selectorWidth / 2.0f) + (this.lastDuration > 600000 ? AndroidUtilities.dp(42.0f) : 0);
        float fAbs = Math.abs(fDp - ((getMeasuredWidth() - (this.selectorWidth / 2.0f)) - (this.lastDuration > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f);
        float f = this.lastWidth;
        if (f > 0.0f && Math.abs(f - fAbs) > 0.01f) {
            StaticLayout[] staticLayoutArr = this.timestampLabel;
            StaticLayout staticLayout = staticLayoutArr[0];
            if (staticLayout != null) {
                staticLayoutArr[0] = makeStaticLayout(staticLayout.getText(), (int) fAbs);
            }
            StaticLayout[] staticLayoutArr2 = this.timestampLabel;
            StaticLayout staticLayout2 = staticLayoutArr2[1];
            if (staticLayout2 != null) {
                staticLayoutArr2[1] = makeStaticLayout(staticLayout2.getText(), (int) fAbs);
            }
        }
        this.lastWidth = fAbs;
        if (size != this.currentTimestamp) {
            StaticLayout[] staticLayoutArr3 = this.timestampLabel;
            staticLayoutArr3[1] = staticLayoutArr3[0];
            if (this.pressed) {
                AndroidUtilities.vibrateCursor(this);
            }
            if (size < 0 || size >= this.timestamps.size() || (charSequence = (CharSequence) ((Pair) this.timestamps.get(size)).second) == null) {
                this.timestampLabel[0] = null;
            } else {
                this.timestampLabel[0] = makeStaticLayout(charSequence, (int) fAbs);
            }
            this.timestampChangeT = 0.0f;
            if (size == -1) {
                this.timestampChangeDirection = -1;
            } else {
                int i = this.currentTimestamp;
                if (i == -1) {
                    this.timestampChangeDirection = 1;
                } else if (size < i) {
                    this.timestampChangeDirection = -1;
                } else if (size > i) {
                    this.timestampChangeDirection = 1;
                }
            }
            this.lastTimestamp = this.currentTimestamp;
            this.currentTimestamp = size;
        }
        if (this.timestampChangeT < 1.0f) {
            this.timestampChangeT = Math.min(this.timestampChangeT + (Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.lastTimestampUpdate)) / (this.timestamps.size() > 8 ? 160.0f : 220.0f)), 1.0f);
            invalidate();
            this.lastTimestampUpdate = SystemClock.elapsedRealtime();
        }
        if (this.timestampsAppearing < 1.0f) {
            this.timestampsAppearing = Math.min(this.timestampsAppearing + (Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.lastTimestampUpdate)) / 200.0f), 1.0f);
            invalidate();
            this.lastTimestampsAppearingUpdate = SystemClock.elapsedRealtime();
        }
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.timestampChangeT);
        canvas.save();
        canvas.translate(fDp + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
        this.timestampLabelPaint.setColor(getThemedColor(Theme.key_player_time));
        if (this.timestampLabel[1] != null) {
            canvas.save();
            if (this.timestampChangeDirection != 0) {
                canvas.translate(AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(16.0f) * (-this.timestampChangeDirection) * interpolation), 0.0f);
            }
            canvas.translate(0.0f, (-this.timestampLabel[1].getHeight()) / 2.0f);
            this.timestampLabelPaint.setAlpha((int) ((1.0f - interpolation) * 255.0f * this.timestampsAppearing));
            canvas.restore();
        }
        if (this.timestampLabel[0] != null) {
            canvas.save();
            if (this.timestampChangeDirection != 0) {
                canvas.translate(AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(16.0f) * this.timestampChangeDirection * (1.0f - interpolation)), 0.0f);
            }
            canvas.translate(0.0f, (-this.timestampLabel[0].getHeight()) / 2.0f);
            this.timestampLabelPaint.setAlpha((int) (interpolation * 255.0f * this.timestampsAppearing));
            canvas.restore();
        }
        canvas.restore();
    }

    private StaticLayout makeStaticLayout(CharSequence charSequence, int i) {
        if (this.timestampLabelPaint == null) {
            TextPaint textPaint = new TextPaint(1);
            this.timestampLabelPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.timestampLabelPaint.setColor(getThemedColor(Theme.key_player_time));
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.timestampLabelPaint, i).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i)).build();
        }
        return new StaticLayout(charSequence2, 0, charSequence2.length(), this.timestampLabelPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i));
    }

    public SeekBarAccessibilityDelegate getSeekBarAccessibilityDelegate() {
        return this.seekBarAccessibilityDelegate;
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
