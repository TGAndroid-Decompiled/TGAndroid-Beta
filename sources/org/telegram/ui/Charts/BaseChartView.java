package org.telegram.ui.Charts;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.ChartBottomSignatureData;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LegendSignatureView;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;
import org.telegram.ui.Components.CubicBezierInterpolator;

public abstract class BaseChartView extends View implements ChartPickerDelegate.Listener {
    protected static final boolean ANIMATE_PICKER_SIZES;
    public static FastOutSlowInInterpolator INTERPOLATOR;
    public static final boolean USE_LINES;
    private final int ANIM_DURATION;
    ValueAnimator alphaAnimator;
    ValueAnimator alphaBottomAnimator;
    public boolean animateLegentTo;
    float animateToMaxHeight;
    float animateToMinHeight;
    protected float animatedToPickerMaxHeight;
    protected float animatedToPickerMinHeight;
    private Bitmap bottomChartBitmap;
    private Canvas bottomChartCanvas;
    ArrayList bottomSignatureDate;
    protected int bottomSignatureOffset;
    Paint bottomSignaturePaint;
    float bottomSignaturePaintAlpha;
    protected boolean canCaptureChartSelection;
    long capturedTime;
    int capturedX;
    int capturedY;
    int chartActiveLineAlpha;
    public RectF chartArea;
    int chartBottom;
    protected boolean chartCaptured;
    ChartData chartData;
    public float chartEnd;
    public float chartFullWidth;
    ChartHeaderView chartHeaderView;
    public float chartStart;
    public float chartWidth;
    ChartBottomSignatureData currentBottomSignatures;
    public float currentMaxHeight;
    public float currentMinHeight;
    protected DateSelectionListener dateSelectionListener;
    protected boolean drawPointOnSelection;
    Paint emptyPaint;
    public boolean enabled;
    int endXIndex;
    private Rect exclusionRect;
    private List exclusionRects;
    private ValueAnimator.AnimatorUpdateListener heightUpdateListener;
    int hintLinePaintAlpha;
    ArrayList horizontalLines;
    boolean invalidatePickerChart;
    boolean landscape;
    int lastH;
    long lastTime;
    int lastW;
    int lastX;
    int lastY;
    public boolean legendShowing;
    public LegendSignatureView legendSignatureView;
    Paint linePaint;
    public ArrayList lines;
    Animator maxValueAnimator;
    private ValueAnimator.AnimatorUpdateListener minHeightUpdateListener;
    private float minMaxUpdateStep;
    Path pathTmp;
    Animator pickerAnimator;
    public ChartPickerDelegate pickerDelegate;
    private ValueAnimator.AnimatorUpdateListener pickerHeightUpdateListener;
    protected float pickerMaxHeight;
    protected float pickerMinHeight;
    private ValueAnimator.AnimatorUpdateListener pickerMinHeightUpdateListener;
    Rect pickerRect;
    Paint pickerSelectorPaint;
    public float pickerWidth;
    public int pikerHeight;
    boolean postTransition;
    protected Theme.ResourcesProvider resourcesProvider;
    Paint ripplePaint;
    protected float selectedCoordinate;
    protected int selectedIndex;
    Paint selectedLinePaint;
    public float selectionA;
    ValueAnimator selectionAnimator;
    private ValueAnimator.AnimatorUpdateListener selectionAnimatorListener;
    Paint selectionBackgroundPaint;
    private Animator.AnimatorListener selectorAnimatorEndListener;
    public SharedUiComponents sharedUiComponents;
    TextPaint signaturePaint;
    TextPaint signaturePaint2;
    float signaturePaintAlpha;
    private float startFromMax;
    private float startFromMaxH;
    private float startFromMin;
    private float startFromMinH;
    int startXIndex;
    boolean superDraw;
    float thresholdMaxHeight;
    protected int tmpI;
    protected int tmpN;
    private final int touchSlop;
    public int transitionMode;
    public TransitionParams transitionParams;
    Paint unactiveBottomChartPaint;
    boolean useAlphaSignature;
    protected boolean useMinHeight;
    VibrationEffect vibrationEffect;
    Paint whiteLinePaint;
    public static final float HORIZONTAL_PADDING = AndroidUtilities.dpf2(16.0f);
    private static final float SELECTED_LINE_WIDTH = AndroidUtilities.dpf2(1.5f);
    public static final float SIGNATURE_TEXT_SIZE = AndroidUtilities.dpf2(12.0f);
    public static final int SIGNATURE_TEXT_HEIGHT = AndroidUtilities.dp(18.0f);
    private static final int BOTTOM_SIGNATURE_TEXT_HEIGHT = AndroidUtilities.dp(14.0f);
    public static final int BOTTOM_SIGNATURE_START_ALPHA = AndroidUtilities.dp(10.0f);
    protected static final int PICKER_PADDING = AndroidUtilities.dp(16.0f);
    private static final int PICKER_CAPTURE_WIDTH = AndroidUtilities.dp(24.0f);
    private static final int LANDSCAPE_END_PADDING = AndroidUtilities.dp(16.0f);
    private static final int BOTTOM_SIGNATURE_OFFSET = AndroidUtilities.dp(10.0f);
    private static final int DP_12 = AndroidUtilities.dp(12.0f);
    private static final int DP_8 = AndroidUtilities.dp(8.0f);
    private static final int DP_6 = AndroidUtilities.dp(6.0f);
    private static final int DP_5 = AndroidUtilities.dp(5.0f);
    private static final int DP_2 = AndroidUtilities.dp(2.0f);
    private static final int DP_1 = AndroidUtilities.dp(1.0f);

    public interface DateSelectionListener {
        void onDateSelected(long j);
    }

    public abstract LineViewData createLineViewData(ChartData.Line line);

    protected abstract void drawChart(Canvas canvas);

    protected abstract void drawPickerChart(Canvas canvas);

    public void fillTransitionParams(TransitionParams transitionParams) {
    }

    protected void onActionUp() {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        USE_LINES = i < 28;
        ANIMATE_PICKER_SIZES = i > 21;
        INTERPOLATOR = new FastOutSlowInInterpolator();
    }

    public static void $r8$lambda$T3QCHM6hA3ZUdXCIt6AYOrLQ7J0(BaseChartView baseChartView, ValueAnimator valueAnimator) {
        baseChartView.getClass();
        baseChartView.currentMaxHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        baseChartView.invalidate();
    }

    public static void m1588$r8$lambda$l2zuMU38wWH2AefNKR5hI652s(BaseChartView baseChartView, ValueAnimator valueAnimator) {
        baseChartView.getClass();
        baseChartView.currentMinHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        baseChartView.invalidate();
    }

    public BaseChartView(Context context) {
        this(context, null);
    }

    public BaseChartView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.horizontalLines = new ArrayList(10);
        this.bottomSignatureDate = new ArrayList(25);
        this.lines = new ArrayList();
        this.ANIM_DURATION = 400;
        this.drawPointOnSelection = true;
        this.currentMaxHeight = 250.0f;
        this.currentMinHeight = 0.0f;
        this.animateToMaxHeight = 0.0f;
        this.animateToMinHeight = 0.0f;
        this.thresholdMaxHeight = 0.0f;
        this.invalidatePickerChart = true;
        this.landscape = false;
        this.enabled = true;
        this.emptyPaint = new Paint();
        this.linePaint = new Paint();
        this.selectedLinePaint = new Paint();
        this.signaturePaint = new TextPaint(1);
        this.signaturePaint2 = new TextPaint(1);
        this.bottomSignaturePaint = new TextPaint(1);
        this.pickerSelectorPaint = new Paint(1);
        this.unactiveBottomChartPaint = new Paint();
        this.selectionBackgroundPaint = new Paint(1);
        this.ripplePaint = new Paint(1);
        this.whiteLinePaint = new Paint(1);
        this.pickerRect = new Rect();
        this.pathTmp = new Path();
        this.postTransition = false;
        this.pickerDelegate = new ChartPickerDelegate(this);
        this.chartCaptured = false;
        this.selectedIndex = -1;
        this.selectedCoordinate = -1.0f;
        this.legendShowing = false;
        this.selectionA = 0.0f;
        this.superDraw = false;
        this.useAlphaSignature = false;
        this.transitionMode = 0;
        this.pikerHeight = AndroidUtilities.dp(46.0f);
        this.chartArea = new RectF();
        this.pickerHeightUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseChartView.this.pickerMaxHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseChartView baseChartView = BaseChartView.this;
                baseChartView.invalidatePickerChart = true;
                baseChartView.invalidate();
            }
        };
        this.pickerMinHeightUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseChartView.this.pickerMinHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseChartView baseChartView = BaseChartView.this;
                baseChartView.invalidatePickerChart = true;
                baseChartView.invalidate();
            }
        };
        this.heightUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseChartView.$r8$lambda$T3QCHM6hA3ZUdXCIt6AYOrLQ7J0(this.f$0, valueAnimator);
            }
        };
        this.minHeightUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseChartView.m1588$r8$lambda$l2zuMU38wWH2AefNKR5hI652s(this.f$0, valueAnimator);
            }
        };
        this.selectionAnimatorListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseChartView.this.selectionA = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseChartView baseChartView = BaseChartView.this;
                baseChartView.legendSignatureView.setAlpha(baseChartView.selectionA);
                BaseChartView.this.invalidate();
            }
        };
        this.selectorAnimatorEndListener = new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                BaseChartView baseChartView = BaseChartView.this;
                if (!baseChartView.animateLegentTo) {
                    baseChartView.legendShowing = false;
                    baseChartView.legendSignatureView.setVisibility(8);
                    BaseChartView.this.invalidate();
                }
                BaseChartView.this.postTransition = false;
            }
        };
        this.useMinHeight = false;
        this.lastW = 0;
        this.lastH = 0;
        this.exclusionRect = new Rect();
        ArrayList arrayList = new ArrayList();
        this.exclusionRects = arrayList;
        arrayList.add(this.exclusionRect);
        this.lastTime = 0L;
        this.animateLegentTo = false;
        this.resourcesProvider = resourcesProvider;
        init();
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    protected void init() {
        this.linePaint.setStrokeWidth(1.0f);
        this.selectedLinePaint.setStrokeWidth(SELECTED_LINE_WIDTH);
        TextPaint textPaint = this.signaturePaint;
        float f = SIGNATURE_TEXT_SIZE;
        textPaint.setTextSize(f);
        this.signaturePaint2.setTextSize(f);
        this.signaturePaint2.setTextAlign(Paint.Align.RIGHT);
        this.bottomSignaturePaint.setTextSize(f);
        this.bottomSignaturePaint.setTextAlign(Paint.Align.CENTER);
        this.selectionBackgroundPaint.setStrokeWidth(AndroidUtilities.dpf2(6.0f));
        Paint paint = this.selectionBackgroundPaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        LegendSignatureView legendSignatureViewCreateLegendView = createLegendView();
        this.legendSignatureView = legendSignatureViewCreateLegendView;
        legendSignatureViewCreateLegendView.setVisibility(8);
        this.whiteLinePaint.setColor(-1);
        this.whiteLinePaint.setStrokeWidth(AndroidUtilities.dpf2(3.0f));
        this.whiteLinePaint.setStrokeCap(cap);
        updateColors();
    }

    protected LegendSignatureView createLegendView() {
        return new LegendSignatureView(getContext(), this.resourcesProvider);
    }

    public void updateColors() {
        this.signaturePaint.setColor(Theme.getColor(this.useAlphaSignature ? Theme.key_statisticChartSignatureAlpha : Theme.key_statisticChartSignature, this.resourcesProvider));
        this.signaturePaint2.setColor(Theme.getColor(this.useAlphaSignature ? Theme.key_statisticChartSignatureAlpha : Theme.key_statisticChartSignature, this.resourcesProvider));
        this.bottomSignaturePaint.setColor(Theme.getColor(Theme.key_statisticChartSignature, this.resourcesProvider));
        this.linePaint.setColor(Theme.getColor(Theme.key_statisticChartHintLine, this.resourcesProvider));
        this.selectedLinePaint.setColor(Theme.getColor(Theme.key_statisticChartActiveLine, this.resourcesProvider));
        this.pickerSelectorPaint.setColor(Theme.getColor(Theme.key_statisticChartActivePickerChart, this.resourcesProvider));
        this.unactiveBottomChartPaint.setColor(Theme.getColor(Theme.key_statisticChartInactivePickerChart, this.resourcesProvider));
        this.selectionBackgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
        this.ripplePaint.setColor(Theme.getColor(Theme.key_statisticChartRipple, this.resourcesProvider));
        this.legendSignatureView.recolor();
        this.hintLinePaintAlpha = this.linePaint.getAlpha();
        this.chartActiveLineAlpha = this.selectedLinePaint.getAlpha();
        this.signaturePaintAlpha = this.signaturePaint.getAlpha() / 255.0f;
        this.bottomSignaturePaintAlpha = this.bottomSignaturePaint.getAlpha() / 255.0f;
        ArrayList arrayList = this.lines;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((LineViewData) obj).updateColors();
        }
        if (this.legendShowing) {
            int i2 = this.selectedIndex;
            ChartData chartData = this.chartData;
            long[] jArr = chartData.x;
            if (i2 < jArr.length) {
                this.legendSignatureView.setData(i2, jArr[i2], this.lines, false, chartData.yTooltipFormatter, chartData.yRate);
            }
        }
        this.invalidatePickerChart = true;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.landscape) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f));
        }
        if (getMeasuredWidth() != this.lastW || getMeasuredHeight() != this.lastH) {
            this.lastW = getMeasuredWidth();
            this.lastH = getMeasuredHeight();
            float measuredWidth = getMeasuredWidth();
            float f = HORIZONTAL_PADDING;
            float f2 = 2.0f * f;
            this.bottomChartBitmap = Bitmap.createBitmap((int) (measuredWidth - f2), this.pikerHeight, Bitmap.Config.ARGB_4444);
            this.bottomChartCanvas = new Canvas(this.bottomChartBitmap);
            this.sharedUiComponents.getPickerMaskBitmap(this.pikerHeight, (int) (getMeasuredWidth() - f2));
            measureSizes();
            if (this.legendShowing) {
                moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - f);
            }
            onPickerDataChanged(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect = this.exclusionRect;
            int measuredHeight = getMeasuredHeight();
            int i3 = PICKER_PADDING;
            rect.set(0, measuredHeight - ((this.pikerHeight + i3) + i3), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.exclusionRects);
        }
    }

    private void measureSizes() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float f = HORIZONTAL_PADDING;
        this.pickerWidth = measuredWidth - (2.0f * f);
        this.chartStart = f;
        float measuredWidth2 = getMeasuredWidth() - (this.landscape ? LANDSCAPE_END_PADDING : f);
        this.chartEnd = measuredWidth2;
        float f2 = measuredWidth2 - this.chartStart;
        this.chartWidth = f2;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        this.chartFullWidth = f2 / (chartPickerDelegate.pickerEnd - chartPickerDelegate.pickerStart);
        updateLineSignature();
        this.chartBottom = AndroidUtilities.dp(100.0f);
        this.chartArea.set(this.chartStart - f, 0.0f, this.chartEnd + f, getMeasuredHeight() - this.chartBottom);
        if (this.chartData != null) {
            this.bottomSignatureOffset = (int) (AndroidUtilities.dp(20.0f) / (this.pickerWidth / this.chartData.x.length));
        }
        measureHeightThreshold();
    }

    private void measureHeightThreshold() {
        int measuredHeight = getMeasuredHeight() - this.chartBottom;
        float f = this.animateToMaxHeight;
        if (f == 0.0f || measuredHeight == 0) {
            return;
        }
        this.thresholdMaxHeight = (f / measuredHeight) * SIGNATURE_TEXT_SIZE;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.superDraw) {
            super.onDraw(canvas);
            return;
        }
        tick();
        int iSave = canvas.save();
        canvas.clipRect(0.0f, this.chartArea.top, getMeasuredWidth(), this.chartArea.bottom);
        drawBottomLine(canvas);
        this.tmpN = this.horizontalLines.size();
        int i = 0;
        this.tmpI = 0;
        while (true) {
            int i2 = this.tmpI;
            if (i2 >= this.tmpN) {
                break;
            }
            drawHorizontalLines(canvas, (ChartHorizontalLinesData) this.horizontalLines.get(i2));
            this.tmpI++;
        }
        drawChart(canvas);
        while (true) {
            this.tmpI = i;
            int i3 = this.tmpI;
            if (i3 < this.tmpN) {
                drawSignaturesToHorizontalLines(canvas, (ChartHorizontalLinesData) this.horizontalLines.get(i3));
                i = this.tmpI + 1;
            } else {
                canvas.restoreToCount(iSave);
                drawBottomSignature(canvas);
                drawPicker(canvas);
                drawSelection(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    protected void tick() {
        float f = this.minMaxUpdateStep;
        if (f == 0.0f) {
            return;
        }
        float f2 = this.currentMaxHeight;
        float f3 = this.animateToMaxHeight;
        if (f2 != f3) {
            float f4 = this.startFromMax + f;
            this.startFromMax = f4;
            if (f4 > 1.0f) {
                this.startFromMax = 1.0f;
                this.currentMaxHeight = f3;
            } else {
                float f5 = this.startFromMaxH;
                this.currentMaxHeight = f5 + ((f3 - f5) * CubicBezierInterpolator.EASE_OUT.getInterpolation(f4));
            }
            invalidate();
        }
        if (this.useMinHeight) {
            float f6 = this.currentMinHeight;
            float f7 = this.animateToMinHeight;
            if (f6 != f7) {
                float f8 = this.startFromMin + this.minMaxUpdateStep;
                this.startFromMin = f8;
                if (f8 > 1.0f) {
                    this.startFromMin = 1.0f;
                    this.currentMinHeight = f7;
                } else {
                    float f9 = this.startFromMinH;
                    this.currentMinHeight = f9 + ((f7 - f9) * CubicBezierInterpolator.EASE_OUT.getInterpolation(f8));
                }
                invalidate();
            }
        }
    }

    void drawBottomSignature(Canvas canvas) {
        float f;
        if (this.chartData == null) {
            return;
        }
        this.tmpN = this.bottomSignatureDate.size();
        int i = this.transitionMode;
        if (i == 2) {
            f = 1.0f - this.transitionParams.progress;
        } else {
            f = (i == 1 || i == 3) ? this.transitionParams.progress : 1.0f;
        }
        this.tmpI = 0;
        while (true) {
            int i2 = this.tmpI;
            if (i2 >= this.tmpN) {
                return;
            }
            int i3 = ((ChartBottomSignatureData) this.bottomSignatureDate.get(i2)).alpha;
            int i4 = ((ChartBottomSignatureData) this.bottomSignatureDate.get(this.tmpI)).step;
            if (i4 == 0) {
                i4 = 1;
            }
            int i5 = this.startXIndex - this.bottomSignatureOffset;
            while (i5 % i4 != 0) {
                i5--;
            }
            int i6 = this.endXIndex - this.bottomSignatureOffset;
            while (true) {
                if (i6 % i4 == 0 && i6 >= this.chartData.x.length - 1) {
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = this.bottomSignatureOffset;
            int i8 = i6 + i7;
            float f2 = (this.chartFullWidth * this.pickerDelegate.pickerStart) - HORIZONTAL_PADDING;
            for (int i9 = i5 + i7; i9 < i8; i9 += i4) {
                if (i9 >= 0) {
                    long[] jArr = this.chartData.x;
                    if (i9 < jArr.length - 1) {
                        long j = jArr[i9];
                        long j2 = jArr[0];
                        float f3 = (((j - j2) / (jArr[jArr.length - 1] - j2)) * this.chartFullWidth) - f2;
                        float f4 = f3 - BOTTOM_SIGNATURE_OFFSET;
                        if (f4 > 0.0f) {
                            float f5 = this.chartWidth;
                            float f6 = HORIZONTAL_PADDING;
                            if (f4 <= f5 + f6) {
                                float f7 = BOTTOM_SIGNATURE_START_ALPHA;
                                if (f4 < f7) {
                                    this.bottomSignaturePaint.setAlpha((int) (i3 * (1.0f - ((f7 - f4) / f7)) * this.bottomSignaturePaintAlpha * f));
                                } else if (f4 > f5) {
                                    this.bottomSignaturePaint.setAlpha((int) (i3 * (1.0f - ((f4 - f5) / f6)) * this.bottomSignaturePaintAlpha * f));
                                } else {
                                    this.bottomSignaturePaint.setAlpha((int) (i3 * this.bottomSignaturePaintAlpha * f));
                                }
                                canvas.drawText(this.chartData.getDayString(i9), f3, (getMeasuredHeight() - this.chartBottom) + BOTTOM_SIGNATURE_TEXT_HEIGHT + AndroidUtilities.dp(3.0f), this.bottomSignaturePaint);
                            }
                        }
                    }
                }
            }
            this.tmpI++;
        }
    }

    protected void drawBottomLine(Canvas canvas) {
        if (this.chartData == null) {
            return;
        }
        int i = this.transitionMode;
        float f = 1.0f;
        if (i == 2) {
            f = 1.0f - this.transitionParams.progress;
        } else if (i == 1 || i == 3) {
            f = this.transitionParams.progress;
        }
        this.linePaint.setAlpha((int) (this.hintLinePaintAlpha * f));
        this.signaturePaint.setAlpha((int) (this.signaturePaintAlpha * 255.0f * f));
        this.signaturePaint2.setAlpha((int) (this.signaturePaintAlpha * 255.0f * f));
        int textSize = (int) (SIGNATURE_TEXT_HEIGHT - this.signaturePaint.getTextSize());
        int measuredHeight = (getMeasuredHeight() - this.chartBottom) - 1;
        float f2 = measuredHeight;
        canvas.drawLine(this.chartStart, f2, this.chartEnd, f2, this.linePaint);
        if (this.useMinHeight) {
            return;
        }
        canvas.drawText("0", HORIZONTAL_PADDING, measuredHeight - textSize, this.signaturePaint);
    }

    protected void drawSelection(Canvas canvas) {
        ChartData chartData;
        int i = this.selectedIndex;
        if (i < 0 || !this.legendShowing || (chartData = this.chartData) == null) {
            return;
        }
        int i2 = (int) (this.chartActiveLineAlpha * this.selectionA);
        float f = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f2 = chartPickerDelegate.pickerEnd;
        float f3 = chartPickerDelegate.pickerStart;
        float f4 = f / (f2 - f3);
        float f5 = (f3 * f4) - HORIZONTAL_PADDING;
        float[] fArr = chartData.xPercentage;
        if (i >= fArr.length) {
            return;
        }
        float f6 = (fArr[i] * f4) - f5;
        this.selectedLinePaint.setAlpha(i2);
        canvas.drawLine(f6, 0.0f, f6, this.chartArea.bottom, this.selectedLinePaint);
        if (!this.drawPointOnSelection) {
            return;
        }
        this.tmpN = this.lines.size();
        int i3 = 0;
        while (true) {
            this.tmpI = i3;
            int i4 = this.tmpI;
            if (i4 >= this.tmpN) {
                return;
            }
            LineViewData lineViewData = (LineViewData) this.lines.get(i4);
            if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                float f7 = lineViewData.line.y[this.selectedIndex];
                float f8 = this.currentMinHeight;
                float measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((f7 - f8) / (this.currentMaxHeight - f8)) * ((getMeasuredHeight() - this.chartBottom) - SIGNATURE_TEXT_HEIGHT));
                lineViewData.selectionPaint.setAlpha((int) (lineViewData.alpha * 255.0f * this.selectionA));
                this.selectionBackgroundPaint.setAlpha((int) (lineViewData.alpha * 255.0f * this.selectionA));
                canvas.drawPoint(f6, measuredHeight, lineViewData.selectionPaint);
                canvas.drawPoint(f6, measuredHeight, this.selectionBackgroundPaint);
            }
            i3 = this.tmpI + 1;
        }
    }

    protected void drawHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
        float f;
        long[] jArr = chartHorizontalLinesData.values;
        int length = jArr.length;
        float f2 = 1.0f;
        if (length > 2) {
            float f3 = (jArr[1] - jArr[0]) / (this.currentMaxHeight - this.currentMinHeight);
            if (f3 < 0.1d) {
                f = f3 / 0.1f;
            } else {
                f = 1.0f;
            }
        } else {
            f = 1.0f;
        }
        int i = this.transitionMode;
        if (i == 2) {
            f2 = 1.0f - this.transitionParams.progress;
        } else if (i == 1 || i == 3) {
            f2 = this.transitionParams.progress;
        }
        this.linePaint.setAlpha((int) (chartHorizontalLinesData.alpha * (this.hintLinePaintAlpha / 255.0f) * f2 * f));
        this.signaturePaint.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
        this.signaturePaint2.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
        int measuredHeight = (getMeasuredHeight() - this.chartBottom) - SIGNATURE_TEXT_HEIGHT;
        for (int i2 = !this.useMinHeight ? 1 : 0; i2 < length; i2++) {
            float measuredHeight2 = getMeasuredHeight() - this.chartBottom;
            float f4 = chartHorizontalLinesData.values[i2];
            float f5 = this.currentMinHeight;
            int i3 = (int) (measuredHeight2 - (measuredHeight * ((f4 - f5) / (this.currentMaxHeight - f5))));
            canvas.drawRect(this.chartStart, i3, this.chartEnd, i3 + 1, this.linePaint);
        }
    }

    protected void drawSignaturesToHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
        float f;
        long[] jArr = chartHorizontalLinesData.values;
        int length = jArr.length;
        float f2 = 1.0f;
        if (length > 2) {
            float f3 = (jArr[1] - jArr[0]) / (this.currentMaxHeight - this.currentMinHeight);
            if (f3 < 0.1d) {
                f = f3 / 0.1f;
            } else {
                f = 1.0f;
            }
        } else {
            f = 1.0f;
        }
        int i = this.transitionMode;
        if (i == 2) {
            f2 = 1.0f - this.transitionParams.progress;
        } else if (i == 1 || i == 3) {
            f2 = this.transitionParams.progress;
        }
        this.linePaint.setAlpha((int) (chartHorizontalLinesData.alpha * (this.hintLinePaintAlpha / 255.0f) * f2 * f));
        this.signaturePaint.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
        this.signaturePaint2.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
        int measuredHeight = getMeasuredHeight() - this.chartBottom;
        int i2 = SIGNATURE_TEXT_HEIGHT;
        int i3 = measuredHeight - i2;
        int textSize = (int) (i2 - this.signaturePaint.getTextSize());
        int i4 = 1 ^ (this.useMinHeight ? 1 : 0);
        while (i4 < length) {
            float measuredHeight2 = getMeasuredHeight() - this.chartBottom;
            float f4 = chartHorizontalLinesData.values[i4];
            float f5 = this.currentMinHeight;
            int i5 = (int) (measuredHeight2 - (i3 * ((f4 - f5) / (this.currentMaxHeight - f5))));
            float f6 = HORIZONTAL_PADDING;
            float f7 = i5 - textSize;
            Canvas canvas2 = canvas;
            ChartHorizontalLinesData chartHorizontalLinesData2 = chartHorizontalLinesData;
            chartHorizontalLinesData2.drawText(canvas2, 0, i4, f6, f7, this.signaturePaint);
            if (chartHorizontalLinesData2.valuesStr2 != null) {
                chartHorizontalLinesData2.drawText(canvas2, 1, i4, getMeasuredWidth() - f6, f7, this.signaturePaint2);
            }
            i4++;
            chartHorizontalLinesData = chartHorizontalLinesData2;
            canvas = canvas2;
        }
    }

    void drawPicker(Canvas canvas) {
        float f;
        int i;
        int i2;
        Canvas canvas2;
        ChartPickerDelegate.CapturesData middleCaptured;
        int i3;
        int i4;
        ChartPickerDelegate.CapturesData leftCaptured;
        ChartPickerDelegate.CapturesData rightCaptured;
        boolean z;
        int i5;
        float f2;
        float f3;
        float f4;
        int i6;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.chartData == null) {
            return;
        }
        this.pickerDelegate.pickerWidth = this.pickerWidth;
        int measuredHeight = getMeasuredHeight();
        int i7 = PICKER_PADDING;
        int i8 = measuredHeight - i7;
        int measuredHeight2 = (getMeasuredHeight() - this.pikerHeight) - i7;
        float f5 = HORIZONTAL_PADDING;
        float f6 = this.pickerWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        int i9 = (int) ((chartPickerDelegate.pickerStart * f6) + f5);
        int i10 = (int) ((chartPickerDelegate.pickerEnd * f6) + f5);
        int i11 = this.transitionMode;
        if (i11 == 1) {
            TransitionParams transitionParams = this.transitionParams;
            int i12 = (int) ((transitionParams.pickerStartOut * f6) + f5);
            int i13 = (int) ((f6 * transitionParams.pickerEndOut) + f5);
            float f7 = 1.0f - transitionParams.progress;
            i9 = (int) (i9 + ((i12 - i9) * f7));
            i10 = (int) (i10 + ((i13 - i10) * f7));
        } else {
            if (i11 == 3) {
                f = this.transitionParams.progress;
                i = i10;
                i2 = i9;
            }
            if (this.chartData != null) {
                if (i11 == 0) {
                    i6 = 0;
                    while (true) {
                        if (i6 < this.lines.size()) {
                            LineViewData lineViewData = (LineViewData) this.lines.get(i6);
                            valueAnimator = lineViewData.animatorIn;
                            if ((valueAnimator == null && valueAnimator.isRunning()) || ((valueAnimator2 = lineViewData.animatorOut) != null && valueAnimator2.isRunning())) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    canvas.save();
                    float f8 = HORIZONTAL_PADDING;
                    int measuredHeight3 = getMeasuredHeight();
                    int i14 = PICKER_PADDING;
                    canvas.clipRect(f8, (measuredHeight3 - i14) - this.pikerHeight, getMeasuredWidth() - f8, getMeasuredHeight() - i14);
                    canvas.translate(f8, (getMeasuredHeight() - i14) - this.pikerHeight);
                    drawPickerChart(canvas);
                    canvas.restore();
                } else if (this.invalidatePickerChart) {
                    this.bottomChartBitmap.eraseColor(0);
                    drawPickerChart(this.bottomChartCanvas);
                    this.invalidatePickerChart = false;
                }
                if (z) {
                    i5 = this.transitionMode;
                    if (i5 == 2) {
                        float f9 = HORIZONTAL_PADDING;
                        float f10 = this.pickerWidth;
                        TransitionParams transitionParams2 = this.transitionParams;
                        float f11 = (f10 * transitionParams2.xPercentage) + f9;
                        this.emptyPaint.setAlpha((int) ((1.0f - transitionParams2.progress) * 255.0f));
                        canvas.save();
                        canvas.clipRect(f9, measuredHeight2, getMeasuredWidth() - f9, i8);
                        canvas.scale((this.transitionParams.progress * 2.0f) + 1.0f, 1.0f, f11, ((i8 - measuredHeight2) + measuredHeight2) >> 1);
                        canvas.drawBitmap(this.bottomChartBitmap, f9, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
                        canvas.restore();
                    } else if (i5 == 1) {
                        float f12 = ((i8 - measuredHeight2) + measuredHeight2) >> 1;
                        float f13 = HORIZONTAL_PADDING;
                        f2 = this.pickerWidth;
                        TransitionParams transitionParams3 = this.transitionParams;
                        f3 = transitionParams3.xPercentage;
                        f4 = f2 * f3;
                        float f14 = f13 + f4;
                        if (f3 <= 0.5f) {
                            f4 = f2 * (1.0f - f3);
                        }
                        float f15 = f4 * transitionParams3.progress;
                        canvas.save();
                        canvas.clipRect(f14 - f15, measuredHeight2, f14 + f15, i8);
                        this.emptyPaint.setAlpha((int) (this.transitionParams.progress * 255.0f));
                        canvas.scale(this.transitionParams.progress, 1.0f, f14, f12);
                        canvas.drawBitmap(this.bottomChartBitmap, f13, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
                        canvas.restore();
                    } else {
                        this.emptyPaint.setAlpha((int) (f * 255.0f));
                        canvas.drawBitmap(this.bottomChartBitmap, HORIZONTAL_PADDING, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
                    }
                }
                if (this.transitionMode == 2) {
                    return;
                }
                float f16 = HORIZONTAL_PADDING;
                float f17 = measuredHeight2;
                int i15 = DP_12;
                float f18 = i8;
                canvas.drawRect(f16, f17, i2 + i15, f18, this.unactiveBottomChartPaint);
                canvas2 = canvas;
                canvas2.drawRect(i - i15, f17, getMeasuredWidth() - f16, f18, this.unactiveBottomChartPaint);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(f5, measuredHeight2, getMeasuredWidth() - f5, i8, this.unactiveBottomChartPaint);
            }
            SharedUiComponents sharedUiComponents = this.sharedUiComponents;
            int i16 = this.pikerHeight;
            float measuredWidth = getMeasuredWidth();
            float f19 = HORIZONTAL_PADDING;
            canvas2.drawBitmap(sharedUiComponents.getPickerMaskBitmap(i16, (int) (measuredWidth - (2.0f * f19))), f19, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
            if (this.chartData != null) {
                this.pickerRect.set(i2, measuredHeight2, i, i8);
                this.pickerDelegate.middlePickerArea.set(this.pickerRect);
                Path path = this.pathTmp;
                Rect rect = this.pickerRect;
                int i17 = rect.left;
                int i18 = rect.top;
                int i19 = DP_1;
                int i20 = DP_12;
                float f20 = rect.bottom + i19;
                float f21 = DP_8;
                canvas2.drawPath(RoundedRect(path, i17, i18 - i19, i17 + i20, f20, f21, f21, true, false, false, true), this.pickerSelectorPaint);
                Path path2 = this.pathTmp;
                Rect rect2 = this.pickerRect;
                int i21 = rect2.right;
                canvas2.drawPath(RoundedRect(path2, i21 - i20, rect2.top - i19, i21, rect2.bottom + i19, f21, f21, false, true, true, false), this.pickerSelectorPaint);
                Rect rect3 = this.pickerRect;
                float f22 = rect3.left + i20;
                int i22 = rect3.bottom;
                canvas2.drawRect(f22, i22, rect3.right - i20, i22 + i19, this.pickerSelectorPaint);
                Rect rect4 = this.pickerRect;
                float f23 = rect4.left + i20;
                int i23 = rect4.top;
                canvas.drawRect(f23, i23 - i19, rect4.right - i20, i23, this.pickerSelectorPaint);
                Rect rect5 = this.pickerRect;
                int i24 = rect5.left;
                int i25 = DP_6;
                float fCenterY = rect5.centerY() - i25;
                Rect rect6 = this.pickerRect;
                canvas.drawLine(i24 + i25, fCenterY, rect6.left + i25, rect6.centerY() + i25, this.whiteLinePaint);
                Rect rect7 = this.pickerRect;
                float f24 = rect7.right - i25;
                float fCenterY2 = rect7.centerY() - i25;
                Rect rect8 = this.pickerRect;
                canvas.drawLine(f24, fCenterY2, rect8.right - i25, rect8.centerY() + i25, this.whiteLinePaint);
                middleCaptured = this.pickerDelegate.getMiddleCaptured();
                Rect rect9 = this.pickerRect;
                int i26 = rect9.bottom;
                int i27 = rect9.top;
                i3 = (i26 - i27) >> 1;
                i4 = i27 + i3;
                if (middleCaptured == null) {
                    leftCaptured = this.pickerDelegate.getLeftCaptured();
                    rightCaptured = this.pickerDelegate.getRightCaptured();
                    if (leftCaptured != null) {
                        canvas.drawCircle(this.pickerRect.left + DP_5, i4, (i3 * leftCaptured.aValue) - DP_2, this.ripplePaint);
                    }
                    if (rightCaptured != null) {
                        canvas.drawCircle(this.pickerRect.right - DP_5, i4, (i3 * rightCaptured.aValue) - DP_2, this.ripplePaint);
                    }
                }
                Rect rect10 = this.pickerDelegate.leftPickerArea;
                int i28 = PICKER_CAPTURE_WIDTH;
                int i29 = i28 >> 1;
                rect10.set(i2 - i28, measuredHeight2, i2 + i29, i8);
                this.pickerDelegate.rightPickerArea.set(i - i29, measuredHeight2, i + i28, i8);
            }
        }
        i = i10;
        i2 = i9;
        f = 1.0f;
        if (this.chartData != null) {
            if (i11 == 0) {
                i6 = 0;
                while (true) {
                    if (i6 < this.lines.size()) {
                        LineViewData lineViewData2 = (LineViewData) this.lines.get(i6);
                        valueAnimator = lineViewData2.animatorIn;
                        i6 = valueAnimator == null ? i6 + 1 : i6 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                canvas.save();
                float f25 = HORIZONTAL_PADDING;
                int measuredHeight4 = getMeasuredHeight();
                int i110 = PICKER_PADDING;
                canvas.clipRect(f25, (measuredHeight4 - i110) - this.pikerHeight, getMeasuredWidth() - f25, getMeasuredHeight() - i110);
                canvas.translate(f25, (getMeasuredHeight() - i110) - this.pikerHeight);
                drawPickerChart(canvas);
                canvas.restore();
            } else if (this.invalidatePickerChart) {
                this.bottomChartBitmap.eraseColor(0);
                drawPickerChart(this.bottomChartCanvas);
                this.invalidatePickerChart = false;
            }
            if (z) {
                i5 = this.transitionMode;
                if (i5 == 2) {
                    float f26 = HORIZONTAL_PADDING;
                    float f110 = this.pickerWidth;
                    TransitionParams transitionParams4 = this.transitionParams;
                    float f111 = (f110 * transitionParams4.xPercentage) + f26;
                    this.emptyPaint.setAlpha((int) ((1.0f - transitionParams4.progress) * 255.0f));
                    canvas.save();
                    canvas.clipRect(f26, measuredHeight2, getMeasuredWidth() - f26, i8);
                    canvas.scale((this.transitionParams.progress * 2.0f) + 1.0f, 1.0f, f111, ((i8 - measuredHeight2) + measuredHeight2) >> 1);
                    canvas.drawBitmap(this.bottomChartBitmap, f26, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
                    canvas.restore();
                } else if (i5 == 1) {
                    float f112 = ((i8 - measuredHeight2) + measuredHeight2) >> 1;
                    float f113 = HORIZONTAL_PADDING;
                    f2 = this.pickerWidth;
                    TransitionParams transitionParams5 = this.transitionParams;
                    f3 = transitionParams5.xPercentage;
                    f4 = f2 * f3;
                    float f114 = f113 + f4;
                    if (f3 <= 0.5f) {
                        f4 = f2 * (1.0f - f3);
                    }
                    float f115 = f4 * transitionParams5.progress;
                    canvas.save();
                    canvas.clipRect(f114 - f115, measuredHeight2, f114 + f115, i8);
                    this.emptyPaint.setAlpha((int) (this.transitionParams.progress * 255.0f));
                    canvas.scale(this.transitionParams.progress, 1.0f, f114, f112);
                    canvas.drawBitmap(this.bottomChartBitmap, f113, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
                    canvas.restore();
                } else {
                    this.emptyPaint.setAlpha((int) (f * 255.0f));
                    canvas.drawBitmap(this.bottomChartBitmap, HORIZONTAL_PADDING, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
                }
            }
            if (this.transitionMode == 2) {
                return;
            }
            float f116 = HORIZONTAL_PADDING;
            float f117 = measuredHeight2;
            int i111 = DP_12;
            float f118 = i8;
            canvas.drawRect(f116, f117, i2 + i111, f118, this.unactiveBottomChartPaint);
            canvas2 = canvas;
            canvas2.drawRect(i - i111, f117, getMeasuredWidth() - f116, f118, this.unactiveBottomChartPaint);
        } else {
            canvas2 = canvas;
            canvas2.drawRect(f5, measuredHeight2, getMeasuredWidth() - f5, i8, this.unactiveBottomChartPaint);
        }
        SharedUiComponents sharedUiComponents2 = this.sharedUiComponents;
        int i112 = this.pikerHeight;
        float measuredWidth2 = getMeasuredWidth();
        float f119 = HORIZONTAL_PADDING;
        canvas2.drawBitmap(sharedUiComponents2.getPickerMaskBitmap(i112, (int) (measuredWidth2 - (2.0f * f119))), f119, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
        if (this.chartData != null) {
            this.pickerRect.set(i2, measuredHeight2, i, i8);
            this.pickerDelegate.middlePickerArea.set(this.pickerRect);
            Path path3 = this.pathTmp;
            Rect rect11 = this.pickerRect;
            int i113 = rect11.left;
            int i114 = rect11.top;
            int i115 = DP_1;
            int i210 = DP_12;
            float f27 = rect11.bottom + i115;
            float f28 = DP_8;
            canvas2.drawPath(RoundedRect(path3, i113, i114 - i115, i113 + i210, f27, f28, f28, true, false, false, true), this.pickerSelectorPaint);
            Path path4 = this.pathTmp;
            Rect rect12 = this.pickerRect;
            int i211 = rect12.right;
            canvas2.drawPath(RoundedRect(path4, i211 - i210, rect12.top - i115, i211, rect12.bottom + i115, f28, f28, false, true, true, false), this.pickerSelectorPaint);
            Rect rect13 = this.pickerRect;
            float f29 = rect13.left + i210;
            int i212 = rect13.bottom;
            canvas2.drawRect(f29, i212, rect13.right - i210, i212 + i115, this.pickerSelectorPaint);
            Rect rect14 = this.pickerRect;
            float f210 = rect14.left + i210;
            int i213 = rect14.top;
            canvas.drawRect(f210, i213 - i115, rect14.right - i210, i213, this.pickerSelectorPaint);
            Rect rect15 = this.pickerRect;
            int i214 = rect15.left;
            int i215 = DP_6;
            float fCenterY3 = rect15.centerY() - i215;
            Rect rect16 = this.pickerRect;
            canvas.drawLine(i214 + i215, fCenterY3, rect16.left + i215, rect16.centerY() + i215, this.whiteLinePaint);
            Rect rect17 = this.pickerRect;
            float f211 = rect17.right - i215;
            float fCenterY4 = rect17.centerY() - i215;
            Rect rect18 = this.pickerRect;
            canvas.drawLine(f211, fCenterY4, rect18.right - i215, rect18.centerY() + i215, this.whiteLinePaint);
            middleCaptured = this.pickerDelegate.getMiddleCaptured();
            Rect rect19 = this.pickerRect;
            int i216 = rect19.bottom;
            int i217 = rect19.top;
            i3 = (i216 - i217) >> 1;
            i4 = i217 + i3;
            if (middleCaptured == null) {
                leftCaptured = this.pickerDelegate.getLeftCaptured();
                rightCaptured = this.pickerDelegate.getRightCaptured();
                if (leftCaptured != null) {
                    canvas.drawCircle(this.pickerRect.left + DP_5, i4, (i3 * leftCaptured.aValue) - DP_2, this.ripplePaint);
                }
                if (rightCaptured != null) {
                    canvas.drawCircle(this.pickerRect.right - DP_5, i4, (i3 * rightCaptured.aValue) - DP_2, this.ripplePaint);
                }
            }
            Rect rect110 = this.pickerDelegate.leftPickerArea;
            int i218 = PICKER_CAPTURE_WIDTH;
            int i219 = i218 >> 1;
            rect110.set(i2 - i218, measuredHeight2, i2 + i219, i8);
            this.pickerDelegate.rightPickerArea.set(i - i219, measuredHeight2, i + i218, i8);
        }
    }

    private void setMaxMinValue(long j, long j2, boolean z) {
        setMaxMinValue(j, j2, z, false, false);
    }

    protected void setMaxMinValue(long j, long j2, boolean z, boolean z2, boolean z3) {
        if ((Math.abs(ChartHorizontalLinesData.lookupHeight(j) - this.animateToMaxHeight) < this.thresholdMaxHeight || j == 0) && j == this.animateToMinHeight) {
            return;
        }
        final ChartHorizontalLinesData chartHorizontalLinesDataCreateHorizontalLinesData = createHorizontalLinesData(j, j2, this.chartData.yTickFormatter);
        long[] jArr = chartHorizontalLinesDataCreateHorizontalLinesData.values;
        long j3 = jArr[jArr.length - 1];
        long j4 = jArr[0];
        if (!z3) {
            float f = this.currentMaxHeight - this.currentMinHeight;
            float f2 = j3 - j4;
            float f3 = f / f2;
            if (f3 > 1.0f) {
                f3 = f2 / f;
            }
            double d = f3;
            float f4 = d > 0.7d ? 0.1f : d < 0.1d ? 0.03f : 0.045f;
            boolean z4 = ((float) j3) != this.animateToMaxHeight;
            if (this.useMinHeight && j4 != this.animateToMinHeight) {
                z4 = true;
            }
            if (z4) {
                Animator animator = this.maxValueAnimator;
                if (animator != null) {
                    animator.removeAllListeners();
                    this.maxValueAnimator.cancel();
                }
                this.startFromMaxH = this.currentMaxHeight;
                this.startFromMinH = this.currentMinHeight;
                this.startFromMax = 0.0f;
                this.startFromMin = 0.0f;
                this.minMaxUpdateStep = f4;
            }
        }
        float f5 = j3;
        this.animateToMaxHeight = f5;
        float f6 = j4;
        this.animateToMinHeight = f6;
        measureHeightThreshold();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastTime >= 320 || z2) {
            this.lastTime = jCurrentTimeMillis;
            ValueAnimator valueAnimator = this.alphaAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.alphaAnimator.cancel();
            }
            if (!z) {
                this.currentMaxHeight = f5;
                this.currentMinHeight = f6;
                this.horizontalLines.clear();
                this.horizontalLines.add(chartHorizontalLinesDataCreateHorizontalLinesData);
                chartHorizontalLinesDataCreateHorizontalLinesData.alpha = 255;
                return;
            }
            this.horizontalLines.add(chartHorizontalLinesDataCreateHorizontalLinesData);
            if (z3) {
                Animator animator2 = this.maxValueAnimator;
                if (animator2 != null) {
                    animator2.removeAllListeners();
                    this.maxValueAnimator.cancel();
                }
                this.minMaxUpdateStep = 0.0f;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(createAnimator(this.currentMaxHeight, f5, this.heightUpdateListener));
                if (this.useMinHeight) {
                    animatorSet.playTogether(createAnimator(this.currentMinHeight, f6, this.minHeightUpdateListener));
                }
                this.maxValueAnimator = animatorSet;
                animatorSet.start();
            }
            int size = this.horizontalLines.size();
            for (int i = 0; i < size; i++) {
                ChartHorizontalLinesData chartHorizontalLinesData = (ChartHorizontalLinesData) this.horizontalLines.get(i);
                if (chartHorizontalLinesData != chartHorizontalLinesDataCreateHorizontalLinesData) {
                    chartHorizontalLinesData.fixedAlpha = chartHorizontalLinesData.alpha;
                }
            }
            ValueAnimator valueAnimatorCreateAnimator = createAnimator(0.0f, 255.0f, new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    BaseChartView.m1587$r8$lambda$_UIUglac59bP3yG86uAeXTH42s(this.f$0, chartHorizontalLinesDataCreateHorizontalLinesData, valueAnimator2);
                }
            });
            this.alphaAnimator = valueAnimatorCreateAnimator;
            valueAnimatorCreateAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator3) {
                    BaseChartView.this.horizontalLines.clear();
                    BaseChartView.this.horizontalLines.add(chartHorizontalLinesDataCreateHorizontalLinesData);
                }
            });
            this.alphaAnimator.start();
        }
    }

    public static void m1587$r8$lambda$_UIUglac59bP3yG86uAeXTH42s(BaseChartView baseChartView, ChartHorizontalLinesData chartHorizontalLinesData, ValueAnimator valueAnimator) {
        baseChartView.getClass();
        chartHorizontalLinesData.alpha = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ArrayList arrayList = baseChartView.horizontalLines;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ChartHorizontalLinesData chartHorizontalLinesData2 = (ChartHorizontalLinesData) obj;
            if (chartHorizontalLinesData2 != chartHorizontalLinesData) {
                chartHorizontalLinesData2.alpha = (int) ((chartHorizontalLinesData2.fixedAlpha / 255.0f) * (255 - chartHorizontalLinesData.alpha));
            }
        }
        baseChartView.invalidate();
    }

    protected ChartHorizontalLinesData createHorizontalLinesData(long j, long j2, int i) {
        return new ChartHorizontalLinesData(j, j2, this.useMinHeight, this.chartData.yRate, i, this.signaturePaint, this.signaturePaint2);
    }

    ValueAnimator createAnimator(float f, float f2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setInterpolator(INTERPOLATOR);
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        return valueAnimatorOfFloat;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.chartData == null) {
            return false;
        }
        if (!this.enabled) {
            this.pickerDelegate.uncapture(motionEvent, motionEvent.getActionIndex());
            getParent().requestDisallowInterceptTouchEvent(false);
            this.chartCaptured = false;
            return false;
        }
        int x = (int) motionEvent.getX(motionEvent.getActionIndex());
        int y = (int) motionEvent.getY(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.capturedTime = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.pickerDelegate.capture(x, y, motionEvent.getActionIndex())) {
                return true;
            }
            this.lastX = x;
            this.capturedX = x;
            this.lastY = y;
            this.capturedY = y;
            if (!this.chartArea.contains(x, y)) {
                return false;
            }
            if (this.selectedIndex < 0 || !this.animateLegentTo) {
                this.chartCaptured = true;
                selectXOnChart(x, y);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i = x - this.lastX;
                int i2 = y - this.lastY;
                if (this.pickerDelegate.captured()) {
                    boolean zMove = this.pickerDelegate.move(x, y, motionEvent.getActionIndex());
                    if (motionEvent.getPointerCount() > 1) {
                        this.pickerDelegate.move((int) motionEvent.getX(1), (int) motionEvent.getY(1), 1);
                    }
                    getParent().requestDisallowInterceptTouchEvent(zMove);
                    return true;
                }
                if (this.chartCaptured) {
                    boolean z = (this.canCaptureChartSelection && System.currentTimeMillis() - this.capturedTime > 200) || Math.abs(i) > Math.abs(i2) || Math.abs(i2) < this.touchSlop;
                    this.lastX = x;
                    this.lastY = y;
                    getParent().requestDisallowInterceptTouchEvent(z);
                    selectXOnChart(x, y);
                } else if (this.chartArea.contains(this.capturedX, this.capturedY)) {
                    int i3 = this.capturedX - x;
                    int i4 = this.capturedY - y;
                    if (Math.sqrt((i3 * i3) + (i4 * i4)) > this.touchSlop || System.currentTimeMillis() - this.capturedTime > 200) {
                        this.chartCaptured = true;
                        selectXOnChart(x, y);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    return this.pickerDelegate.capture(x, y, motionEvent.getActionIndex());
                }
                if (actionMasked != 6) {
                    return false;
                }
                this.pickerDelegate.uncapture(motionEvent, motionEvent.getActionIndex());
                return true;
            }
        }
        if (this.pickerDelegate.uncapture(motionEvent, motionEvent.getActionIndex())) {
            return true;
        }
        if (this.chartArea.contains(this.capturedX, this.capturedY) && !this.chartCaptured) {
            animateLegend(false);
        }
        this.pickerDelegate.uncapture();
        updateLineSignature();
        getParent().requestDisallowInterceptTouchEvent(false);
        this.chartCaptured = false;
        onActionUp();
        invalidate();
        setMaxMinValue(findMaxValue(this.startXIndex, this.endXIndex), this.useMinHeight ? findMinValue(this.startXIndex, this.endXIndex) : 0L, true, true, false);
        return true;
    }

    protected void selectXOnChart(int i, int i2) {
        int i3 = this.selectedIndex;
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        float f = this.chartFullWidth;
        float f2 = (this.pickerDelegate.pickerStart * f) - HORIZONTAL_PADDING;
        float f3 = (i + f2) / f;
        this.selectedCoordinate = f3;
        if (f3 < 0.0f) {
            this.selectedIndex = 0;
            this.selectedCoordinate = 0.0f;
        } else if (f3 > 1.0f) {
            this.selectedIndex = chartData.x.length - 1;
            this.selectedCoordinate = 1.0f;
        } else {
            int iFindIndex = chartData.findIndex(this.startXIndex, this.endXIndex, f3);
            this.selectedIndex = iFindIndex;
            int i4 = iFindIndex + 1;
            float[] fArr = this.chartData.xPercentage;
            if (i4 < fArr.length) {
                if (Math.abs(this.chartData.xPercentage[this.selectedIndex + 1] - f3) < Math.abs(fArr[iFindIndex] - f3)) {
                    this.selectedIndex++;
                }
            }
        }
        int i5 = this.selectedIndex;
        int i6 = this.endXIndex;
        if (i5 > i6) {
            this.selectedIndex = i6;
        }
        int i7 = this.selectedIndex;
        int i8 = this.startXIndex;
        if (i7 < i8) {
            this.selectedIndex = i8;
        }
        if (i3 != this.selectedIndex) {
            this.legendShowing = true;
            animateLegend(true);
            moveLegend(f2);
            DateSelectionListener dateSelectionListener = this.dateSelectionListener;
            if (dateSelectionListener != null) {
                dateSelectionListener.onDateSelected(getSelectedDate());
            }
            runSmoothHaptic();
            invalidate();
        }
    }

    protected void runSmoothHaptic() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.vibrationEffect == null) {
                this.vibrationEffect = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.vibrationEffect);
        }
    }

    public void animateLegend(boolean z) {
        moveLegend();
        if (this.animateLegentTo == z) {
            return;
        }
        this.animateLegentTo = z;
        ValueAnimator valueAnimator = this.selectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.selectionAnimator.cancel();
        }
        ValueAnimator duration = createAnimator(this.selectionA, z ? 1.0f : 0.0f, this.selectionAnimatorListener).setDuration(200L);
        this.selectionAnimator = duration;
        duration.addListener(this.selectorAnimatorEndListener);
        this.selectionAnimator.start();
    }

    public void moveLegend(float f) {
        int i;
        float measuredWidth;
        ChartData chartData = this.chartData;
        if (chartData == null || (i = this.selectedIndex) < 0) {
            return;
        }
        long[] jArr = chartData.x;
        if (i >= jArr.length || !this.legendShowing) {
            return;
        }
        this.legendSignatureView.setData(i, jArr[i], this.lines, false, chartData.yTooltipFormatter, chartData.yRate);
        this.legendSignatureView.setVisibility(0);
        this.legendSignatureView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
        float f2 = (this.chartData.xPercentage[this.selectedIndex] * this.chartFullWidth) - f;
        if (f2 > (this.chartStart + this.chartWidth) / 2.0f) {
            measuredWidth = f2 - (this.legendSignatureView.getWidth() + DP_5);
        } else {
            measuredWidth = f2 + DP_5;
        }
        if (measuredWidth < 0.0f) {
            measuredWidth = 0.0f;
        } else if (this.legendSignatureView.getMeasuredWidth() + measuredWidth > getMeasuredWidth()) {
            measuredWidth = getMeasuredWidth() - this.legendSignatureView.getMeasuredWidth();
        }
        this.legendSignatureView.setTranslationX(measuredWidth);
    }

    public long findMaxValue(int i, int i2) {
        int size = this.lines.size();
        long j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((LineViewData) this.lines.get(i3)).enabled) {
                long jRMaxQ = ((LineViewData) this.lines.get(i3)).line.segmentTree.rMaxQ(i, i2);
                if (jRMaxQ > j) {
                    j = jRMaxQ;
                }
            }
        }
        return j;
    }

    public long findMinValue(int i, int i2) {
        int size = this.lines.size();
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            if (((LineViewData) this.lines.get(i3)).enabled) {
                long jRMinQ = ((LineViewData) this.lines.get(i3)).line.segmentTree.rMinQ(i, i2);
                if (jRMinQ < j) {
                    j = jRMinQ;
                }
            }
        }
        return j;
    }

    public boolean setData(ChartData chartData) {
        boolean z = false;
        if (this.chartData != chartData) {
            invalidate();
            this.lines.clear();
            if (chartData != null && chartData.lines != null) {
                for (int i = 0; i < chartData.lines.size(); i++) {
                    this.lines.add(createLineViewData((ChartData.Line) chartData.lines.get(i)));
                }
            }
            clearSelection();
            this.chartData = chartData;
            if (chartData != null) {
                if (chartData.x[0] == 0) {
                    ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
                    chartPickerDelegate.pickerStart = 0.0f;
                    chartPickerDelegate.pickerEnd = 1.0f;
                } else {
                    this.pickerDelegate.minDistance = getMinDistance();
                    ChartPickerDelegate chartPickerDelegate2 = this.pickerDelegate;
                    float f = chartPickerDelegate2.pickerEnd;
                    float f2 = f - chartPickerDelegate2.pickerStart;
                    float f3 = chartPickerDelegate2.minDistance;
                    if (f2 < f3) {
                        float f4 = f - f3;
                        chartPickerDelegate2.pickerStart = f4;
                        if (f4 < 0.0f) {
                            chartPickerDelegate2.pickerStart = 0.0f;
                            chartPickerDelegate2.pickerEnd = 1.0f;
                        }
                    }
                }
            }
            z = true;
        }
        measureSizes();
        if (chartData != null) {
            updateIndexes();
            setMaxMinValue(findMaxValue(this.startXIndex, this.endXIndex), this.useMinHeight ? findMinValue(this.startXIndex, this.endXIndex) : 0L, false);
            this.pickerMaxHeight = 0.0f;
            this.pickerMinHeight = 2.1474836E9f;
            initPickerMaxHeight();
            int i2 = chartData.yTooltipFormatter;
            if (i2 == 1 || i2 == 2) {
                this.legendSignatureView.setSize(this.lines.size() * 2);
            } else {
                this.legendSignatureView.setSize(this.lines.size());
            }
            this.invalidatePickerChart = true;
            updateLineSignature();
            return z;
        }
        ChartPickerDelegate chartPickerDelegate3 = this.pickerDelegate;
        chartPickerDelegate3.pickerStart = 0.7f;
        chartPickerDelegate3.pickerEnd = 1.0f;
        this.pickerMinHeight = 0.0f;
        this.pickerMaxHeight = 0.0f;
        this.horizontalLines.clear();
        Animator animator = this.maxValueAnimator;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimator = this.alphaAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.alphaAnimator.cancel();
        }
        return z;
    }

    protected float getMinDistance() {
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return 0.1f;
        }
        int length = chartData.x.length;
        if (length < 5) {
            return 1.0f;
        }
        float f = 5.0f / length;
        if (f < 0.1f) {
            return 0.1f;
        }
        return f;
    }

    protected void initPickerMaxHeight() {
        ArrayList arrayList = this.lines;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            LineViewData lineViewData = (LineViewData) obj;
            boolean z = lineViewData.enabled;
            if (z) {
                float f = lineViewData.line.maxValue;
                if (f > this.pickerMaxHeight) {
                    this.pickerMaxHeight = f;
                }
            }
            if (z) {
                float f2 = lineViewData.line.minValue;
                if (f2 < this.pickerMinHeight) {
                    this.pickerMinHeight = f2;
                }
            }
            float f3 = this.pickerMaxHeight;
            float f4 = this.pickerMinHeight;
            if (f3 == f4) {
                this.pickerMaxHeight = f3 + 1.0f;
                this.pickerMinHeight = f4 - 1.0f;
            }
        }
    }

    @Override
    public void onPickerDataChanged() {
        onPickerDataChanged(true, false, false);
    }

    public void onPickerDataChanged(boolean z, boolean z2, boolean z3) {
        if (this.chartData == null) {
            return;
        }
        float f = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        this.chartFullWidth = f / (chartPickerDelegate.pickerEnd - chartPickerDelegate.pickerStart);
        updateIndexes();
        setMaxMinValue(findMaxValue(this.startXIndex, this.endXIndex), this.useMinHeight ? findMinValue(this.startXIndex, this.endXIndex) : 0L, z, z2, z3);
        if (this.legendShowing && !z2) {
            animateLegend(false);
            moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - HORIZONTAL_PADDING);
        }
        invalidate();
    }

    @Override
    public void onPickerJumpTo(float f, float f2, boolean z) {
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        if (z) {
            int iFindStartIndex = chartData.findStartIndex(Math.max(f, 0.0f));
            int iFindEndIndex = this.chartData.findEndIndex(iFindStartIndex, Math.min(f2, 1.0f));
            setMaxMinValue(findMaxValue(iFindStartIndex, iFindEndIndex), findMinValue(iFindStartIndex, iFindEndIndex), true, true, false);
            animateLegend(false);
            return;
        }
        updateIndexes();
        invalidate();
    }

    protected void updateIndexes() {
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        int iFindStartIndex = chartData.findStartIndex(Math.max(this.pickerDelegate.pickerStart, 0.0f));
        this.startXIndex = iFindStartIndex;
        int iFindEndIndex = this.chartData.findEndIndex(iFindStartIndex, Math.min(this.pickerDelegate.pickerEnd, 1.0f));
        this.endXIndex = iFindEndIndex;
        int i = this.startXIndex;
        if (iFindEndIndex < i) {
            this.endXIndex = i;
        }
        ChartHeaderView chartHeaderView = this.chartHeaderView;
        if (chartHeaderView != null) {
            long[] jArr = this.chartData.x;
            chartHeaderView.setDates(jArr[i], jArr[this.endXIndex]);
        }
        updateLineSignature();
    }

    private void updateLineSignature() {
        ChartData chartData = this.chartData;
        if (chartData != null) {
            float f = this.chartWidth;
            if (f == 0.0f) {
                return;
            }
            updateDates((int) ((f / (this.chartFullWidth * chartData.oneDayPercentage)) / 6.0f));
        }
    }

    private void updateDates(int i) {
        ChartBottomSignatureData chartBottomSignatureData = this.currentBottomSignatures;
        if (chartBottomSignatureData == null || i >= chartBottomSignatureData.stepMax || i <= chartBottomSignatureData.stepMin) {
            int iHighestOneBit = Integer.highestOneBit(i) << 1;
            ChartBottomSignatureData chartBottomSignatureData2 = this.currentBottomSignatures;
            if (chartBottomSignatureData2 == null || chartBottomSignatureData2.step != iHighestOneBit) {
                ValueAnimator valueAnimator = this.alphaBottomAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.alphaBottomAnimator.cancel();
                }
                double d = iHighestOneBit;
                double d2 = 0.2d * d;
                final ChartBottomSignatureData chartBottomSignatureData3 = new ChartBottomSignatureData(iHighestOneBit, (int) (d + d2), (int) (d - d2));
                chartBottomSignatureData3.alpha = 255;
                if (this.currentBottomSignatures == null) {
                    this.currentBottomSignatures = chartBottomSignatureData3;
                    chartBottomSignatureData3.alpha = 255;
                    this.bottomSignatureDate.add(chartBottomSignatureData3);
                    return;
                }
                this.currentBottomSignatures = chartBottomSignatureData3;
                this.tmpN = this.bottomSignatureDate.size();
                for (int i2 = 0; i2 < this.tmpN; i2++) {
                    ChartBottomSignatureData chartBottomSignatureData4 = (ChartBottomSignatureData) this.bottomSignatureDate.get(i2);
                    chartBottomSignatureData4.fixedAlpha = chartBottomSignatureData4.alpha;
                }
                this.bottomSignatureDate.add(chartBottomSignatureData3);
                if (this.bottomSignatureDate.size() > 2) {
                    this.bottomSignatureDate.remove(0);
                }
                ValueAnimator duration = createAnimator(0.0f, 1.0f, new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        BaseChartView.$r8$lambda$PMDRM0EEyMK3KNO3LtbM2gEtrR0(this.f$0, chartBottomSignatureData3, valueAnimator2);
                    }
                }).setDuration(200L);
                this.alphaBottomAnimator = duration;
                duration.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        BaseChartView.this.bottomSignatureDate.clear();
                        BaseChartView.this.bottomSignatureDate.add(chartBottomSignatureData3);
                    }
                });
                this.alphaBottomAnimator.start();
            }
        }
    }

    public static void $r8$lambda$PMDRM0EEyMK3KNO3LtbM2gEtrR0(BaseChartView baseChartView, ChartBottomSignatureData chartBottomSignatureData, ValueAnimator valueAnimator) {
        baseChartView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ArrayList arrayList = baseChartView.bottomSignatureDate;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ChartBottomSignatureData chartBottomSignatureData2 = (ChartBottomSignatureData) obj;
            if (chartBottomSignatureData2 == chartBottomSignatureData) {
                chartBottomSignatureData.alpha = (int) (255.0f * fFloatValue);
            } else {
                chartBottomSignatureData2.alpha = (int) ((1.0f - fFloatValue) * chartBottomSignatureData2.fixedAlpha);
            }
        }
        baseChartView.invalidate();
    }

    public void onCheckChanged() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        onPickerDataChanged(true, true, true);
        this.tmpN = this.lines.size();
        int i = 0;
        while (true) {
            this.tmpI = i;
            int i2 = this.tmpI;
            if (i2 >= this.tmpN) {
                break;
            }
            final LineViewData lineViewData = (LineViewData) this.lines.get(i2);
            if (lineViewData.enabled && (valueAnimator3 = lineViewData.animatorOut) != null) {
                valueAnimator3.cancel();
            }
            if (!lineViewData.enabled && (valueAnimator2 = lineViewData.animatorIn) != null) {
                valueAnimator2.cancel();
            }
            if (lineViewData.enabled && lineViewData.alpha != 1.0f) {
                ValueAnimator valueAnimator4 = lineViewData.animatorIn;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    ValueAnimator valueAnimatorCreateAnimator = createAnimator(lineViewData.alpha, 1.0f, new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            BaseChartView.m1586$r8$lambda$O1lCwxWXI0SnEBgbROnHINexw(this.f$0, lineViewData, valueAnimator5);
                        }
                    });
                    lineViewData.animatorIn = valueAnimatorCreateAnimator;
                    valueAnimatorCreateAnimator.start();
                    if (lineViewData.enabled) {
                    }
                }
            } else if (lineViewData.enabled && lineViewData.alpha != 0.0f && ((valueAnimator = lineViewData.animatorOut) == null || !valueAnimator.isRunning())) {
                ValueAnimator valueAnimatorCreateAnimator2 = createAnimator(lineViewData.alpha, 0.0f, new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        BaseChartView.$r8$lambda$G87WbkafOTq5U0MWRAfQSTP79OU(this.f$0, lineViewData, valueAnimator5);
                    }
                });
                lineViewData.animatorOut = valueAnimatorCreateAnimator2;
                valueAnimatorCreateAnimator2.start();
            }
            i = this.tmpI + 1;
        }
        updatePickerMinMaxHeight();
        if (this.legendShowing) {
            LegendSignatureView legendSignatureView = this.legendSignatureView;
            int i3 = this.selectedIndex;
            ChartData chartData = this.chartData;
            legendSignatureView.setData(i3, chartData.x[i3], this.lines, true, chartData.yTooltipFormatter, chartData.yRate);
        }
    }

    public static void m1586$r8$lambda$O1lCwxWXI0SnEBgbROnHINexw(BaseChartView baseChartView, LineViewData lineViewData, ValueAnimator valueAnimator) {
        baseChartView.getClass();
        lineViewData.alpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        baseChartView.invalidatePickerChart = true;
        baseChartView.invalidate();
    }

    public static void $r8$lambda$G87WbkafOTq5U0MWRAfQSTP79OU(BaseChartView baseChartView, LineViewData lineViewData, ValueAnimator valueAnimator) {
        baseChartView.getClass();
        lineViewData.alpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        baseChartView.invalidatePickerChart = true;
        baseChartView.invalidate();
    }

    protected void updatePickerMinMaxHeight() {
        if (ANIMATE_PICKER_SIZES) {
            ArrayList arrayList = this.lines;
            int size = arrayList.size();
            long j = Long.MAX_VALUE;
            long j2 = 0;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                LineViewData lineViewData = (LineViewData) obj;
                boolean z = lineViewData.enabled;
                if (z) {
                    long j3 = lineViewData.line.maxValue;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
                if (z) {
                    long j4 = lineViewData.line.minValue;
                    if (j4 < j) {
                        j = j4;
                    }
                }
            }
            if ((j == 2147483647L || j == this.animatedToPickerMinHeight) && (j2 <= 0 || j2 == this.animatedToPickerMaxHeight)) {
                return;
            }
            this.animatedToPickerMaxHeight = j2;
            Animator animator = this.pickerAnimator;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(createAnimator(this.pickerMaxHeight, this.animatedToPickerMaxHeight, this.pickerHeightUpdateListener), createAnimator(this.pickerMinHeight, this.animatedToPickerMinHeight, this.pickerMinHeightUpdateListener));
            this.pickerAnimator = animatorSet;
            animatorSet.start();
        }
    }

    public void setLandscape(boolean z) {
        this.landscape = z;
    }

    public void setHeader(ChartHeaderView chartHeaderView) {
        this.chartHeaderView = chartHeaderView;
    }

    public long getSelectedDate() {
        int i = this.selectedIndex;
        if (i < 0) {
            return -1L;
        }
        return this.chartData.x[i];
    }

    public void clearSelection() {
        this.selectedIndex = -1;
        this.legendShowing = false;
        this.animateLegentTo = false;
        this.legendSignatureView.setVisibility(8);
        this.selectionA = 0.0f;
    }

    public void selectDate(long j) {
        this.selectedIndex = Arrays.binarySearch(this.chartData.x, j);
        this.legendShowing = true;
        this.legendSignatureView.setVisibility(0);
        this.selectionA = 1.0f;
        moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - HORIZONTAL_PADDING);
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public long getStartDate() {
        return this.chartData.x[this.startXIndex];
    }

    public long getEndDate() {
        return this.chartData.x[this.endXIndex];
    }

    public void updatePicker(ChartData chartData, long j) {
        int length = chartData.x.length;
        long j2 = j - (j % 86400000);
        long j3 = 86399999 + j2;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            long j4 = chartData.x[i3];
            if (j2 > j4) {
                i2 = i3;
            }
            if (j3 > j4) {
                i = i3;
            }
        }
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float[] fArr = chartData.xPercentage;
        chartPickerDelegate.pickerStart = fArr[i2];
        chartPickerDelegate.pickerEnd = fArr[i];
    }

    public void moveLegend() {
        moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - HORIZONTAL_PADDING);
    }

    @Override
    public void requestLayout() {
        super.requestLayout();
    }

    public static Path RoundedRect(Path path, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, boolean z3, boolean z4) {
        path.reset();
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = f7 / 2.0f;
        if (f5 > f9) {
            f5 = f9;
        }
        float f10 = f8 / 2.0f;
        if (f6 > f10) {
            f6 = f10;
        }
        float f11 = f7 - (f5 * 2.0f);
        float f12 = f8 - (2.0f * f6);
        path.moveTo(f3, f2 + f6);
        if (z2) {
            float f13 = -f6;
            path.rQuadTo(0.0f, f13, -f5, f13);
        } else {
            path.rLineTo(0.0f, -f6);
            path.rLineTo(-f5, 0.0f);
        }
        path.rLineTo(-f11, 0.0f);
        if (z) {
            float f14 = -f5;
            path.rQuadTo(f14, 0.0f, f14, f6);
        } else {
            path.rLineTo(-f5, 0.0f);
            path.rLineTo(0.0f, f6);
        }
        path.rLineTo(0.0f, f12);
        if (z4) {
            path.rQuadTo(0.0f, f6, f5, f6);
        } else {
            path.rLineTo(0.0f, f6);
            path.rLineTo(f5, 0.0f);
        }
        path.rLineTo(f11, 0.0f);
        if (z3) {
            path.rQuadTo(f5, 0.0f, f5, -f6);
        } else {
            path.rLineTo(f5, 0.0f);
            path.rLineTo(0.0f, -f6);
        }
        path.rLineTo(0.0f, -f12);
        path.close();
        return path;
    }

    public void setDateSelectionListener(DateSelectionListener dateSelectionListener) {
        this.dateSelectionListener = dateSelectionListener;
    }

    public static class SharedUiComponents {
        private Canvas canvas;
        private boolean invalidate;
        int k;
        private Bitmap pickerRoundBitmap;
        private RectF rectF;
        private Theme.ResourcesProvider resourcesProvider;
        private Paint xRefP;

        public SharedUiComponents() {
            this(null);
        }

        public SharedUiComponents(Theme.ResourcesProvider resourcesProvider) {
            this.rectF = new RectF();
            Paint paint = new Paint(1);
            this.xRefP = paint;
            this.k = 0;
            this.invalidate = true;
            paint.setColor(0);
            this.xRefP.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.resourcesProvider = resourcesProvider;
        }

        Bitmap getPickerMaskBitmap(int i, int i2) {
            int i3 = (i + i2) << 10;
            if (i3 != this.k || this.invalidate) {
                this.invalidate = false;
                this.k = i3;
                this.pickerRoundBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                this.canvas = new Canvas(this.pickerRoundBitmap);
                this.rectF.set(0.0f, 0.0f, i2, i);
                this.canvas.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                this.canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.xRefP);
            }
            return this.pickerRoundBitmap;
        }

        public void invalidate() {
            this.invalidate = true;
        }
    }
}
