package org.telegram.ui.Charts;

import android.animation.Animator;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.ChartBottomSignatureData;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LegendSignatureView;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;

public abstract class BaseChartView extends View implements ChartPickerDelegate.Listener {
    public static final boolean ANIMATE_PICKER_SIZES;
    public static final FastOutSlowInInterpolator INTERPOLATOR;
    public static final boolean USE_LINES;
    public ValueAnimator alphaAnimator;
    public ValueAnimator alphaBottomAnimator;
    public boolean animateLegentTo;
    public float animateToMaxHeight;
    public float animateToMinHeight;
    public float animatedToPickerMaxHeight;
    public Bitmap bottomChartBitmap;
    public Canvas bottomChartCanvas;
    public final ArrayList bottomSignatureDate;
    public int bottomSignatureOffset;
    public final TextPaint bottomSignaturePaint;
    public float bottomSignaturePaintAlpha;
    public boolean canCaptureChartSelection;
    public long capturedTime;
    public int capturedX;
    public int capturedY;
    public int chartActiveLineAlpha;
    public final RectF chartArea;
    public int chartBottom;
    public boolean chartCaptured;
    public ChartData chartData;
    public float chartEnd;
    public float chartFullWidth;
    public ChartHeaderView chartHeaderView;
    public float chartStart;
    public float chartWidth;
    public ChartBottomSignatureData currentBottomSignatures;
    public float currentMaxHeight;
    public float currentMinHeight;
    public DateSelectionListener dateSelectionListener;
    public boolean drawPointOnSelection;
    public final Paint emptyPaint;
    public boolean enabled;
    public int endXIndex;
    public final Rect exclusionRect;
    public final ArrayList exclusionRects;
    public final BaseChartView$$ExternalSyntheticLambda1 heightUpdateListener;
    public int hintLinePaintAlpha;
    public final ArrayList horizontalLines;
    public boolean invalidatePickerChart;
    public boolean landscape;
    public int lastH;
    public long lastTime;
    public int lastW;
    public int lastX;
    public int lastY;
    public boolean legendShowing;
    public LegendSignatureView legendSignatureView;
    public final Paint linePaint;
    public final ArrayList lines;
    public AnimatorSet maxValueAnimator;
    public final BaseChartView$$ExternalSyntheticLambda1 minHeightUpdateListener;
    public float minMaxUpdateStep;
    public final Path pathTmp;
    public Animator pickerAnimator;
    public final ChartPickerDelegate pickerDelegate;
    public final AnonymousClass1 pickerHeightUpdateListener;
    public float pickerMaxHeight;
    public float pickerMinHeight;
    public final AnonymousClass1 pickerMinHeightUpdateListener;
    public final Rect pickerRect;
    public final Paint pickerSelectorPaint;
    public float pickerWidth;
    public final int pikerHeight;
    public boolean postTransition;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Paint ripplePaint;
    public int selectedIndex;
    public final Paint selectedLinePaint;
    public float selectionA;
    public ValueAnimator selectionAnimator;
    public final AnonymousClass1 selectionAnimatorListener;
    public final Paint selectionBackgroundPaint;
    public final ArticleViewer.AnonymousClass25 selectorAnimatorEndListener;
    public SharedUiComponents sharedUiComponents;
    public final TextPaint signaturePaint;
    public final TextPaint signaturePaint2;
    public float signaturePaintAlpha;
    public float startFromMax;
    public float startFromMaxH;
    public float startFromMin;
    public float startFromMinH;
    public int startXIndex;
    public boolean superDraw;
    public float thresholdMaxHeight;
    public int tmpI;
    public int tmpN;
    public final int touchSlop;
    public int transitionMode;
    public TransitionParams transitionParams;
    public final Paint unactiveBottomChartPaint;
    public boolean useAlphaSignature;
    public boolean useMinHeight;
    public VibrationEffect vibrationEffect;
    public final Paint whiteLinePaint;
    public static final float HORIZONTAL_PADDING = AndroidUtilities.dpf2(16.0f);
    public static final float SELECTED_LINE_WIDTH = AndroidUtilities.dpf2(1.5f);
    public static final float SIGNATURE_TEXT_SIZE = AndroidUtilities.dpf2(12.0f);
    public static final int SIGNATURE_TEXT_HEIGHT = AndroidUtilities.dp(18.0f);
    public static final int BOTTOM_SIGNATURE_TEXT_HEIGHT = AndroidUtilities.dp(14.0f);
    public static final int BOTTOM_SIGNATURE_START_ALPHA = AndroidUtilities.dp(10.0f);
    public static final int PICKER_PADDING = AndroidUtilities.dp(16.0f);
    public static final int PICKER_CAPTURE_WIDTH = AndroidUtilities.dp(24.0f);
    public static final int LANDSCAPE_END_PADDING = AndroidUtilities.dp(16.0f);
    public static final int BOTTOM_SIGNATURE_OFFSET = AndroidUtilities.dp(10.0f);
    public static final int DP_12 = AndroidUtilities.dp(12.0f);
    public static final int DP_8 = AndroidUtilities.dp(8.0f);
    public static final int DP_6 = AndroidUtilities.dp(6.0f);
    public static final int DP_5 = AndroidUtilities.dp(5.0f);
    public static final int DP_2 = AndroidUtilities.dp(2.0f);
    public static final int DP_1 = AndroidUtilities.dp(1.0f);

    public interface DateSelectionListener {
    }

    public final class SharedUiComponents {
        public Canvas canvas;
        public boolean invalidate;
        public int k;
        public Bitmap pickerRoundBitmap;
        public final RectF rectF = new RectF();
        public final Theme.ResourcesProvider resourcesProvider;
        public final Paint xRefP;

        public SharedUiComponents(Theme.ResourcesProvider resourcesProvider) {
            Paint paint = new Paint(1);
            this.xRefP = paint;
            this.k = 0;
            this.invalidate = true;
            paint.setColor(0);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.resourcesProvider = resourcesProvider;
        }

        public final Bitmap getPickerMaskBitmap(int i, int i2) {
            int i3 = (i + i2) << 10;
            if (i3 != this.k || this.invalidate) {
                this.invalidate = false;
                this.k = i3;
                this.pickerRoundBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                this.canvas = new Canvas(this.pickerRoundBitmap);
                RectF rectF = this.rectF;
                rectF.set(0.0f, 0.0f, i2, i);
                this.canvas.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                this.canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.xRefP);
            }
            return this.pickerRoundBitmap;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        USE_LINES = i < 28;
        ANIMATE_PICKER_SIZES = i > 21;
        INTERPOLATOR = new FastOutSlowInInterpolator();
    }

    public BaseChartView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.horizontalLines = new ArrayList(10);
        this.bottomSignatureDate = new ArrayList(25);
        this.lines = new ArrayList();
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
        this.legendShowing = false;
        this.selectionA = 0.0f;
        this.superDraw = false;
        this.useAlphaSignature = false;
        this.transitionMode = 0;
        this.pikerHeight = AndroidUtilities.dp(46.0f);
        this.chartArea = new RectF();
        final int i = 0;
        this.pickerHeightUpdateListener = new ValueAnimator.AnimatorUpdateListener(this) {
            public final BaseChartView this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BaseChartView baseChartView = this.this$0;
                        baseChartView.pickerMaxHeight = fFloatValue;
                        baseChartView.invalidatePickerChart = true;
                        baseChartView.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BaseChartView baseChartView2 = this.this$0;
                        baseChartView2.pickerMinHeight = fFloatValue2;
                        baseChartView2.invalidatePickerChart = true;
                        baseChartView2.invalidate();
                        break;
                    default:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BaseChartView baseChartView3 = this.this$0;
                        baseChartView3.selectionA = fFloatValue3;
                        baseChartView3.legendSignatureView.setAlpha(baseChartView3.selectionA);
                        baseChartView3.invalidate();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.pickerMinHeightUpdateListener = new ValueAnimator.AnimatorUpdateListener(this) {
            public final BaseChartView this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BaseChartView baseChartView = this.this$0;
                        baseChartView.pickerMaxHeight = fFloatValue;
                        baseChartView.invalidatePickerChart = true;
                        baseChartView.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BaseChartView baseChartView2 = this.this$0;
                        baseChartView2.pickerMinHeight = fFloatValue2;
                        baseChartView2.invalidatePickerChart = true;
                        baseChartView2.invalidate();
                        break;
                    default:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BaseChartView baseChartView3 = this.this$0;
                        baseChartView3.selectionA = fFloatValue3;
                        baseChartView3.legendSignatureView.setAlpha(baseChartView3.selectionA);
                        baseChartView3.invalidate();
                        break;
                }
            }
        };
        final int i3 = 0;
        this.heightUpdateListener = new ValueAnimator.AnimatorUpdateListener(this) {
            public final BaseChartView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        BaseChartView baseChartView = this.f$0;
                        baseChartView.getClass();
                        baseChartView.currentMaxHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        baseChartView.invalidate();
                        break;
                    default:
                        BaseChartView baseChartView2 = this.f$0;
                        baseChartView2.getClass();
                        baseChartView2.currentMinHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        baseChartView2.invalidate();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.minHeightUpdateListener = new ValueAnimator.AnimatorUpdateListener(this) {
            public final BaseChartView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        BaseChartView baseChartView = this.f$0;
                        baseChartView.getClass();
                        baseChartView.currentMaxHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        baseChartView.invalidate();
                        break;
                    default:
                        BaseChartView baseChartView2 = this.f$0;
                        baseChartView2.getClass();
                        baseChartView2.currentMinHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        baseChartView2.invalidate();
                        break;
                }
            }
        };
        final int i5 = 2;
        this.selectionAnimatorListener = new ValueAnimator.AnimatorUpdateListener(this) {
            public final BaseChartView this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BaseChartView baseChartView = this.this$0;
                        baseChartView.pickerMaxHeight = fFloatValue;
                        baseChartView.invalidatePickerChart = true;
                        baseChartView.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BaseChartView baseChartView2 = this.this$0;
                        baseChartView2.pickerMinHeight = fFloatValue2;
                        baseChartView2.invalidatePickerChart = true;
                        baseChartView2.invalidate();
                        break;
                    default:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BaseChartView baseChartView3 = this.this$0;
                        baseChartView3.selectionA = fFloatValue3;
                        baseChartView3.legendSignatureView.setAlpha(baseChartView3.selectionA);
                        baseChartView3.invalidate();
                        break;
                }
            }
        };
        this.selectorAnimatorEndListener = new ArticleViewer.AnonymousClass25(this, 24);
        this.useMinHeight = false;
        this.lastW = 0;
        this.lastH = 0;
        Rect rect = new Rect();
        this.exclusionRect = rect;
        ArrayList arrayList = new ArrayList();
        this.exclusionRects = arrayList;
        arrayList.add(rect);
        this.lastTime = 0L;
        this.animateLegentTo = false;
        this.resourcesProvider = resourcesProvider;
        init();
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void RoundedRect(Path path, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, boolean z3, boolean z4) {
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
    }

    public static ValueAnimator createAnimator(float f, float f2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setInterpolator(INTERPOLATOR);
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        return valueAnimatorOfFloat;
    }

    public final void animateLegend(boolean z) {
        moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - HORIZONTAL_PADDING);
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

    public ChartHorizontalLinesData createHorizontalLinesData(int i, long j, long j2) {
        return new ChartHorizontalLinesData(j, j2, this.useMinHeight, this.chartData.yRate, i, this.signaturePaint, this.signaturePaint2);
    }

    public LegendSignatureView createLegendView() {
        return new LegendSignatureView(getContext(), this.resourcesProvider);
    }

    public abstract LineViewData createLineViewData(ChartData.Line line);

    public void drawBottomLine(Canvas canvas) {
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
        Paint paint = this.linePaint;
        paint.setAlpha((int) (this.hintLinePaintAlpha * f));
        TextPaint textPaint = this.signaturePaint;
        textPaint.setAlpha((int) (this.signaturePaintAlpha * 255.0f * f));
        this.signaturePaint2.setAlpha((int) (this.signaturePaintAlpha * 255.0f * f));
        int textSize = (int) (SIGNATURE_TEXT_HEIGHT - textPaint.getTextSize());
        int measuredHeight = (getMeasuredHeight() - this.chartBottom) - 1;
        float f2 = measuredHeight;
        canvas.drawLine(this.chartStart, f2, this.chartEnd, f2, paint);
        if (this.useMinHeight) {
            return;
        }
        canvas.drawText("0", HORIZONTAL_PADDING, measuredHeight - textSize, textPaint);
    }

    public void drawBottomSignature(Canvas canvas) {
        float f;
        if (this.chartData == null) {
            return;
        }
        ArrayList arrayList = this.bottomSignatureDate;
        this.tmpN = arrayList.size();
        int i = this.transitionMode;
        int i2 = 1;
        float f2 = 1.0f;
        if (i == 2) {
            f = 1.0f - this.transitionParams.progress;
        } else {
            f = (i == 1 || i == 3) ? this.transitionParams.progress : 1.0f;
        }
        char c = 0;
        this.tmpI = 0;
        while (true) {
            int i3 = this.tmpI;
            if (i3 >= this.tmpN) {
                return;
            }
            int i4 = ((ChartBottomSignatureData) arrayList.get(i3)).alpha;
            int i5 = ((ChartBottomSignatureData) arrayList.get(this.tmpI)).step;
            if (i5 == 0) {
                i5 = 1;
            }
            int i6 = this.startXIndex - this.bottomSignatureOffset;
            while (i6 % i5 != 0) {
                i6--;
            }
            int i7 = this.endXIndex - this.bottomSignatureOffset;
            while (true) {
                if (i7 % i5 == 0 && i7 >= this.chartData.x.length - i2) {
                    break;
                }
                i7++;
                i4 = i4;
                i2 = 1;
                c = 0;
                f2 = 1.0f;
            }
            int i8 = this.bottomSignatureOffset;
            int i9 = i6 + i8;
            int i10 = i7 + i8;
            float f3 = this.chartFullWidth * this.pickerDelegate.pickerStart;
            float f4 = HORIZONTAL_PADDING;
            float f5 = f3 - f4;
            while (i9 < i10) {
                if (i9 >= 0) {
                    long[] jArr = this.chartData.x;
                    if (i9 < jArr.length - i2) {
                        long j = jArr[i9];
                        long j2 = jArr[c];
                        float f6 = (((j - j2) / (jArr[jArr.length - i2] - j2)) * this.chartFullWidth) - f5;
                        float f7 = f6 - BOTTOM_SIGNATURE_OFFSET;
                        if (f7 > 0.0f) {
                            float f8 = this.chartWidth;
                            if (f7 <= f8 + f4) {
                                float f9 = BOTTOM_SIGNATURE_START_ALPHA;
                                TextPaint textPaint = this.bottomSignaturePaint;
                                if (f7 < f9) {
                                    textPaint.setAlpha((int) (i4 * ImageReceiver$$ExternalSyntheticOutline1.m(f9, f7, f9, f2) * this.bottomSignaturePaintAlpha * f));
                                } else if (f7 > f8) {
                                    textPaint.setAlpha((int) (i4 * ImageReceiver$$ExternalSyntheticOutline1.m(f7, f8, f4, f2) * this.bottomSignaturePaintAlpha * f));
                                } else {
                                    textPaint.setAlpha((int) (i4 * this.bottomSignaturePaintAlpha * f));
                                }
                                ChartData chartData = this.chartData;
                                String[] strArr = chartData.daysLookup;
                                long[] jArr2 = chartData.x;
                                i4 = i4;
                                canvas.drawText(strArr[(int) ((jArr2[i9] - jArr2[0]) / chartData.timeStep)], f6, AndroidUtilities.dp(3.0f) + (getMeasuredHeight() - this.chartBottom) + BOTTOM_SIGNATURE_TEXT_HEIGHT, textPaint);
                            }
                        }
                    }
                }
                i9 += i5;
                i4 = i4;
                i2 = 1;
                c = 0;
                f2 = 1.0f;
            }
            this.tmpI++;
            i2 = 1;
            c = 0;
            f2 = 1.0f;
        }
    }

    public abstract void drawChart(Canvas canvas);

    public void drawHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
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
        Paint paint = this.linePaint;
        paint.setAlpha((int) ((this.hintLinePaintAlpha / 255.0f) * chartHorizontalLinesData.alpha * f2 * f));
        this.signaturePaint.setAlpha((int) MediaController$$ExternalSyntheticOutline0.m(chartHorizontalLinesData.alpha, this.signaturePaintAlpha, f2, f));
        this.signaturePaint2.setAlpha((int) MediaController$$ExternalSyntheticOutline0.m(chartHorizontalLinesData.alpha, this.signaturePaintAlpha, f2, f));
        int measuredHeight = (getMeasuredHeight() - this.chartBottom) - SIGNATURE_TEXT_HEIGHT;
        for (int i2 = !this.useMinHeight ? 1 : 0; i2 < length; i2++) {
            float measuredHeight2 = getMeasuredHeight() - this.chartBottom;
            float f4 = chartHorizontalLinesData.values[i2];
            float f5 = this.currentMinHeight;
            int i3 = (int) (measuredHeight2 - (((f4 - f5) / (this.currentMaxHeight - f5)) * measuredHeight));
            canvas.drawRect(this.chartStart, i3, this.chartEnd, i3 + 1, paint);
        }
    }

    public final void drawPicker(Canvas canvas) {
        float f;
        int i;
        int i2;
        ChartData chartData;
        Paint paint;
        Paint paint2;
        int i3;
        int i4;
        int i5;
        char c;
        Canvas canvas2;
        float f2;
        Rect rect;
        ChartPickerDelegate.CapturesData[] capturesDataArr;
        ChartPickerDelegate.CapturesData capturesData;
        int i6;
        ChartPickerDelegate.CapturesData capturesData2;
        int i7;
        int i8;
        ChartPickerDelegate.CapturesData capturesData3;
        Paint paint3;
        int i9;
        int i10;
        boolean z;
        float f3;
        int i11;
        float f4;
        float f5;
        float f6;
        int i12;
        ArrayList arrayList;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.chartData == null) {
            return;
        }
        float f7 = this.pickerWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        chartPickerDelegate.pickerWidth = f7;
        int measuredHeight = getMeasuredHeight();
        int i13 = PICKER_PADDING;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = getMeasuredHeight();
        int i15 = this.pikerHeight;
        int i16 = (measuredHeight2 - i15) - i13;
        float f8 = this.pickerWidth;
        float f9 = chartPickerDelegate.pickerStart * f8;
        float f10 = HORIZONTAL_PADDING;
        int i17 = (int) (f9 + f10);
        int i18 = (int) ((chartPickerDelegate.pickerEnd * f8) + f10);
        int i19 = this.transitionMode;
        if (i19 != 1) {
            if (i19 == 3) {
                f = this.transitionParams.progress;
                i = i17;
                i2 = i18;
            }
            chartData = this.chartData;
            paint = this.unactiveBottomChartPaint;
            paint2 = this.emptyPaint;
            i3 = DP_12;
            if (chartData != null) {
                if (i19 == 0) {
                    i12 = 0;
                    while (true) {
                        arrayList = this.lines;
                        if (i12 < arrayList.size()) {
                            LineViewData lineViewData = (LineViewData) arrayList.get(i12);
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
                    f3 = f;
                    canvas.clipRect(f10, (getMeasuredHeight() - i13) - i15, getMeasuredWidth() - f10, getMeasuredHeight() - i13);
                    canvas.translate(f10, (getMeasuredHeight() - i13) - i15);
                    drawPickerChart(canvas);
                    canvas.restore();
                } else {
                    f3 = f;
                    if (this.invalidatePickerChart) {
                        this.bottomChartBitmap.eraseColor(0);
                        drawPickerChart(this.bottomChartCanvas);
                        this.invalidatePickerChart = false;
                    }
                    if (z) {
                        i11 = this.transitionMode;
                        if (i11 == 2) {
                            float f11 = this.pickerWidth;
                            TransitionParams transitionParams = this.transitionParams;
                            float f12 = (f11 * transitionParams.xPercentage) + f10;
                            paint2.setAlpha((int) ((1.0f - transitionParams.progress) * 255.0f));
                            canvas.save();
                            canvas.clipRect(f10, i16, getMeasuredWidth() - f10, i14);
                            canvas.scale((this.transitionParams.progress * 2.0f) + 1.0f, 1.0f, f12, ((i14 - i16) + i16) >> 1);
                            canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i13) - i15, paint2);
                            canvas.restore();
                        } else {
                            paint = paint;
                            if (i11 == 1) {
                                float f13 = ((i14 - i16) + i16) >> 1;
                                f4 = this.pickerWidth;
                                TransitionParams transitionParams2 = this.transitionParams;
                                f5 = transitionParams2.xPercentage;
                                f6 = f4 * f5;
                                float f14 = f6 + f10;
                                if (f5 <= 0.5f) {
                                    f6 = (1.0f - f5) * f4;
                                }
                                float f15 = f6 * transitionParams2.progress;
                                canvas.save();
                                i4 = i13;
                                canvas.clipRect(f14 - f15, i16, f15 + f14, i14);
                                paint2.setAlpha((int) (this.transitionParams.progress * 255.0f));
                                canvas.scale(this.transitionParams.progress, 1.0f, f14, f13);
                                canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i4) - i15, paint2);
                                canvas.restore();
                            } else {
                                i4 = i13;
                                paint2.setAlpha((int) (f3 * 255.0f));
                                canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i4) - i15, paint2);
                            }
                        }
                        if (this.transitionMode == 2) {
                            return;
                        }
                        float f16 = i16;
                        float f17 = i14;
                        float f18 = HORIZONTAL_PADDING;
                        Paint paint4 = paint;
                        i5 = 2;
                        c = 0;
                        canvas.drawRect(f18, f16, i + i3, f17, paint4);
                        canvas2 = canvas;
                        canvas2.drawRect(i2 - i3, f16, getMeasuredWidth() - f18, f17, paint4);
                        f2 = f10;
                    }
                    i4 = i13;
                    if (this.transitionMode == 2) {
                        return;
                    }
                    float f19 = i16;
                    float f110 = i14;
                    float f111 = HORIZONTAL_PADDING;
                    Paint paint5 = paint;
                    i5 = 2;
                    c = 0;
                    canvas.drawRect(f111, f19, i + i3, f110, paint5);
                    canvas2 = canvas;
                    canvas2.drawRect(i2 - i3, f19, getMeasuredWidth() - f111, f110, paint5);
                    f2 = f10;
                }
                if (z) {
                    i11 = this.transitionMode;
                    if (i11 == 2) {
                        float f112 = this.pickerWidth;
                        TransitionParams transitionParams3 = this.transitionParams;
                        float f113 = (f112 * transitionParams3.xPercentage) + f10;
                        paint2.setAlpha((int) ((1.0f - transitionParams3.progress) * 255.0f));
                        canvas.save();
                        canvas.clipRect(f10, i16, getMeasuredWidth() - f10, i14);
                        canvas.scale((this.transitionParams.progress * 2.0f) + 1.0f, 1.0f, f113, ((i14 - i16) + i16) >> 1);
                        canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i13) - i15, paint2);
                        canvas.restore();
                    } else {
                        paint = paint;
                        if (i11 == 1) {
                            float f114 = ((i14 - i16) + i16) >> 1;
                            f4 = this.pickerWidth;
                            TransitionParams transitionParams4 = this.transitionParams;
                            f5 = transitionParams4.xPercentage;
                            f6 = f4 * f5;
                            float f115 = f6 + f10;
                            if (f5 <= 0.5f) {
                                f6 = (1.0f - f5) * f4;
                            }
                            float f116 = f6 * transitionParams4.progress;
                            canvas.save();
                            i4 = i13;
                            canvas.clipRect(f115 - f116, i16, f116 + f115, i14);
                            paint2.setAlpha((int) (this.transitionParams.progress * 255.0f));
                            canvas.scale(this.transitionParams.progress, 1.0f, f115, f114);
                            canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i4) - i15, paint2);
                            canvas.restore();
                        } else {
                            i4 = i13;
                            paint2.setAlpha((int) (f3 * 255.0f));
                            canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i4) - i15, paint2);
                        }
                    }
                    if (this.transitionMode == 2) {
                        return;
                    }
                    float f117 = i16;
                    float f118 = i14;
                    float f119 = HORIZONTAL_PADDING;
                    Paint paint6 = paint;
                    i5 = 2;
                    c = 0;
                    canvas.drawRect(f119, f117, i + i3, f118, paint6);
                    canvas2 = canvas;
                    canvas2.drawRect(i2 - i3, f117, getMeasuredWidth() - f119, f118, paint6);
                    f2 = f10;
                }
                i4 = i13;
                if (this.transitionMode == 2) {
                    return;
                }
                float f1110 = i16;
                float f1111 = i14;
                float f1112 = HORIZONTAL_PADDING;
                Paint paint7 = paint;
                i5 = 2;
                c = 0;
                canvas.drawRect(f1112, f1110, i + i3, f1111, paint7);
                canvas2 = canvas;
                canvas2.drawRect(i2 - i3, f1110, getMeasuredWidth() - f1112, f1111, paint7);
                f2 = f10;
            } else {
                i4 = i13;
                i5 = 2;
                c = 0;
                canvas2 = canvas;
                f2 = f10;
                canvas2.drawRect(f2, i16, getMeasuredWidth() - f10, i14, paint);
            }
            canvas2.drawBitmap(this.sharedUiComponents.getPickerMaskBitmap(i15, (int) (getMeasuredWidth() - (f2 * 2.0f))), f2, (getMeasuredHeight() - i4) - i15, paint2);
            if (this.chartData != null) {
                rect = this.pickerRect;
                rect.set(i, i16, i2, i14);
                chartPickerDelegate.middlePickerArea.set(rect);
                Path path = this.pathTmp;
                int i20 = rect.left;
                int i21 = rect.top;
                int i22 = DP_1;
                float f20 = rect.bottom + i22;
                float f21 = DP_8;
                RoundedRect(path, i20, i21 - i22, i20 + i3, f20, f21, f21, true, false, false, true);
                Paint paint8 = this.pickerSelectorPaint;
                canvas2.drawPath(path, paint8);
                int i23 = rect.right;
                RoundedRect(path, i23 - i3, rect.top - i22, i23, rect.bottom + i22, f21, f21, false, true, true, false);
                canvas2.drawPath(path, paint8);
                float f22 = rect.left + i3;
                int i24 = rect.bottom;
                canvas2.drawRect(f22, i24, rect.right - i3, i24 + i22, paint8);
                float f23 = rect.left + i3;
                int i25 = rect.top;
                canvas.drawRect(f23, i25 - i22, rect.right - i3, i25, paint8);
                int i26 = rect.left;
                int i27 = DP_6;
                float fCenterY = rect.centerY() - i27;
                float f24 = rect.left + i27;
                float fCenterY2 = rect.centerY() + i27;
                Paint paint9 = this.whiteLinePaint;
                canvas.drawLine(i26 + i27, fCenterY, f24, fCenterY2, paint9);
                canvas.drawLine(rect.right - i27, rect.centerY() - i27, rect.right - i27, rect.centerY() + i27, paint9);
                capturesDataArr = chartPickerDelegate.capturedStates;
                capturesData = capturesDataArr[c];
                if (capturesData == null && capturesData.state == 4) {
                    capturesData2 = capturesData;
                    i6 = 1;
                } else {
                    i6 = 1;
                    capturesData2 = capturesDataArr[1];
                    if (capturesData2 != null || capturesData2.state != 4) {
                        capturesData2 = null;
                    }
                }
                int i28 = rect.bottom;
                int i29 = rect.top;
                i7 = (i28 - i29) >> i6;
                i8 = i29 + i7;
                if (capturesData2 == null) {
                    if (capturesData == null && capturesData.state == i6) {
                        capturesData3 = capturesData;
                    } else {
                        capturesData3 = capturesDataArr[i6];
                        if (capturesData3 != null || capturesData3.state != i6) {
                            capturesData3 = null;
                        }
                    }
                    if ((capturesData != null || capturesData.state != i5) && ((capturesData = capturesDataArr[i6]) == null || capturesData.state != i5)) {
                    }
                    paint3 = this.ripplePaint;
                    i9 = DP_2;
                    i10 = DP_5;
                    if (capturesData3 != null) {
                        canvas.drawCircle(rect.left + i10, i8, (i7 * capturesData3.aValue) - i9, paint3);
                    }
                    if (capturesData != null) {
                        canvas.drawCircle(rect.right - i10, i8, (i7 * capturesData.aValue) - i9, paint3);
                    }
                }
                int i30 = PICKER_CAPTURE_WIDTH;
                int i31 = i30 >> 1;
                chartPickerDelegate.leftPickerArea.set(i - i30, i16, i + i31, i14);
                chartPickerDelegate.rightPickerArea.set(i2 - i31, i16, i2 + i30, i14);
            }
        }
        TransitionParams transitionParams5 = this.transitionParams;
        int i32 = (int) ((transitionParams5.pickerStartOut * f8) + f10);
        int i33 = (int) ((f8 * transitionParams5.pickerEndOut) + f10);
        float f25 = 1.0f - transitionParams5.progress;
        i17 = (int) (((i32 - i17) * f25) + i17);
        i18 = (int) ((f25 * (i33 - i18)) + i18);
        i = i17;
        i2 = i18;
        f = 1.0f;
        chartData = this.chartData;
        paint = this.unactiveBottomChartPaint;
        paint2 = this.emptyPaint;
        i3 = DP_12;
        if (chartData != null) {
            if (i19 == 0) {
                i12 = 0;
                while (true) {
                    arrayList = this.lines;
                    if (i12 < arrayList.size()) {
                        LineViewData lineViewData2 = (LineViewData) arrayList.get(i12);
                        valueAnimator = lineViewData2.animatorIn;
                        i12 = valueAnimator == null ? i12 + 1 : i12 + 1;
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
                f3 = f;
                canvas.clipRect(f10, (getMeasuredHeight() - i13) - i15, getMeasuredWidth() - f10, getMeasuredHeight() - i13);
                canvas.translate(f10, (getMeasuredHeight() - i13) - i15);
                drawPickerChart(canvas);
                canvas.restore();
            } else {
                f3 = f;
                if (this.invalidatePickerChart) {
                    this.bottomChartBitmap.eraseColor(0);
                    drawPickerChart(this.bottomChartCanvas);
                    this.invalidatePickerChart = false;
                }
                if (z) {
                    i11 = this.transitionMode;
                    if (i11 == 2) {
                        float f1113 = this.pickerWidth;
                        TransitionParams transitionParams6 = this.transitionParams;
                        float f1114 = (f1113 * transitionParams6.xPercentage) + f10;
                        paint2.setAlpha((int) ((1.0f - transitionParams6.progress) * 255.0f));
                        canvas.save();
                        canvas.clipRect(f10, i16, getMeasuredWidth() - f10, i14);
                        canvas.scale((this.transitionParams.progress * 2.0f) + 1.0f, 1.0f, f1114, ((i14 - i16) + i16) >> 1);
                        canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i13) - i15, paint2);
                        canvas.restore();
                    } else {
                        paint = paint;
                        if (i11 == 1) {
                            float f1115 = ((i14 - i16) + i16) >> 1;
                            f4 = this.pickerWidth;
                            TransitionParams transitionParams7 = this.transitionParams;
                            f5 = transitionParams7.xPercentage;
                            f6 = f4 * f5;
                            float f1116 = f6 + f10;
                            if (f5 <= 0.5f) {
                                f6 = (1.0f - f5) * f4;
                            }
                            float f1117 = f6 * transitionParams7.progress;
                            canvas.save();
                            i4 = i13;
                            canvas.clipRect(f1116 - f1117, i16, f1117 + f1116, i14);
                            paint2.setAlpha((int) (this.transitionParams.progress * 255.0f));
                            canvas.scale(this.transitionParams.progress, 1.0f, f1116, f1115);
                            canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i4) - i15, paint2);
                            canvas.restore();
                        } else {
                            i4 = i13;
                            paint2.setAlpha((int) (f3 * 255.0f));
                            canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i4) - i15, paint2);
                        }
                    }
                    if (this.transitionMode == 2) {
                        return;
                    }
                    float f1118 = i16;
                    float f1119 = i14;
                    float f11110 = HORIZONTAL_PADDING;
                    Paint paint10 = paint;
                    i5 = 2;
                    c = 0;
                    canvas.drawRect(f11110, f1118, i + i3, f1119, paint10);
                    canvas2 = canvas;
                    canvas2.drawRect(i2 - i3, f1118, getMeasuredWidth() - f11110, f1119, paint10);
                    f2 = f10;
                }
                i4 = i13;
                if (this.transitionMode == 2) {
                    return;
                }
                float f11111 = i16;
                float f11112 = i14;
                float f11113 = HORIZONTAL_PADDING;
                Paint paint11 = paint;
                i5 = 2;
                c = 0;
                canvas.drawRect(f11113, f11111, i + i3, f11112, paint11);
                canvas2 = canvas;
                canvas2.drawRect(i2 - i3, f11111, getMeasuredWidth() - f11113, f11112, paint11);
                f2 = f10;
            }
            if (z) {
                i11 = this.transitionMode;
                if (i11 == 2) {
                    float f11114 = this.pickerWidth;
                    TransitionParams transitionParams8 = this.transitionParams;
                    float f11115 = (f11114 * transitionParams8.xPercentage) + f10;
                    paint2.setAlpha((int) ((1.0f - transitionParams8.progress) * 255.0f));
                    canvas.save();
                    canvas.clipRect(f10, i16, getMeasuredWidth() - f10, i14);
                    canvas.scale((this.transitionParams.progress * 2.0f) + 1.0f, 1.0f, f11115, ((i14 - i16) + i16) >> 1);
                    canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i13) - i15, paint2);
                    canvas.restore();
                } else {
                    paint = paint;
                    if (i11 == 1) {
                        float f11116 = ((i14 - i16) + i16) >> 1;
                        f4 = this.pickerWidth;
                        TransitionParams transitionParams9 = this.transitionParams;
                        f5 = transitionParams9.xPercentage;
                        f6 = f4 * f5;
                        float f11117 = f6 + f10;
                        if (f5 <= 0.5f) {
                            f6 = (1.0f - f5) * f4;
                        }
                        float f11118 = f6 * transitionParams9.progress;
                        canvas.save();
                        i4 = i13;
                        canvas.clipRect(f11117 - f11118, i16, f11118 + f11117, i14);
                        paint2.setAlpha((int) (this.transitionParams.progress * 255.0f));
                        canvas.scale(this.transitionParams.progress, 1.0f, f11117, f11116);
                        canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i4) - i15, paint2);
                        canvas.restore();
                    } else {
                        i4 = i13;
                        paint2.setAlpha((int) (f3 * 255.0f));
                        canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - i4) - i15, paint2);
                    }
                }
                if (this.transitionMode == 2) {
                    return;
                }
                float f11119 = i16;
                float f111110 = i14;
                float f111111 = HORIZONTAL_PADDING;
                Paint paint12 = paint;
                i5 = 2;
                c = 0;
                canvas.drawRect(f111111, f11119, i + i3, f111110, paint12);
                canvas2 = canvas;
                canvas2.drawRect(i2 - i3, f11119, getMeasuredWidth() - f111111, f111110, paint12);
                f2 = f10;
            }
            i4 = i13;
            if (this.transitionMode == 2) {
                return;
            }
            float f111112 = i16;
            float f111113 = i14;
            float f111114 = HORIZONTAL_PADDING;
            Paint paint13 = paint;
            i5 = 2;
            c = 0;
            canvas.drawRect(f111114, f111112, i + i3, f111113, paint13);
            canvas2 = canvas;
            canvas2.drawRect(i2 - i3, f111112, getMeasuredWidth() - f111114, f111113, paint13);
            f2 = f10;
        } else {
            i4 = i13;
            i5 = 2;
            c = 0;
            canvas2 = canvas;
            f2 = f10;
            canvas2.drawRect(f2, i16, getMeasuredWidth() - f10, i14, paint);
        }
        canvas2.drawBitmap(this.sharedUiComponents.getPickerMaskBitmap(i15, (int) (getMeasuredWidth() - (f2 * 2.0f))), f2, (getMeasuredHeight() - i4) - i15, paint2);
        if (this.chartData != null) {
            rect = this.pickerRect;
            rect.set(i, i16, i2, i14);
            chartPickerDelegate.middlePickerArea.set(rect);
            Path path2 = this.pathTmp;
            int i210 = rect.left;
            int i211 = rect.top;
            int i212 = DP_1;
            float f26 = rect.bottom + i212;
            float f27 = DP_8;
            RoundedRect(path2, i210, i211 - i212, i210 + i3, f26, f27, f27, true, false, false, true);
            Paint paint14 = this.pickerSelectorPaint;
            canvas2.drawPath(path2, paint14);
            int i213 = rect.right;
            RoundedRect(path2, i213 - i3, rect.top - i212, i213, rect.bottom + i212, f27, f27, false, true, true, false);
            canvas2.drawPath(path2, paint14);
            float f28 = rect.left + i3;
            int i214 = rect.bottom;
            canvas2.drawRect(f28, i214, rect.right - i3, i214 + i212, paint14);
            float f29 = rect.left + i3;
            int i215 = rect.top;
            canvas.drawRect(f29, i215 - i212, rect.right - i3, i215, paint14);
            int i216 = rect.left;
            int i217 = DP_6;
            float fCenterY3 = rect.centerY() - i217;
            float f210 = rect.left + i217;
            float fCenterY4 = rect.centerY() + i217;
            Paint paint15 = this.whiteLinePaint;
            canvas.drawLine(i216 + i217, fCenterY3, f210, fCenterY4, paint15);
            canvas.drawLine(rect.right - i217, rect.centerY() - i217, rect.right - i217, rect.centerY() + i217, paint15);
            capturesDataArr = chartPickerDelegate.capturedStates;
            capturesData = capturesDataArr[c];
            if (capturesData == null) {
                i6 = 1;
                capturesData2 = capturesDataArr[1];
                if (capturesData2 != null) {
                    capturesData2 = null;
                } else {
                    capturesData2 = null;
                }
            } else {
                i6 = 1;
                capturesData2 = capturesDataArr[1];
                if (capturesData2 != null) {
                    capturesData2 = null;
                } else {
                    capturesData2 = null;
                }
            }
            int i218 = rect.bottom;
            int i219 = rect.top;
            i7 = (i218 - i219) >> i6;
            i8 = i219 + i7;
            if (capturesData2 == null) {
                if (capturesData == null) {
                    capturesData3 = capturesDataArr[i6];
                    if (capturesData3 != null) {
                        capturesData3 = null;
                    } else {
                        capturesData3 = null;
                    }
                } else {
                    capturesData3 = capturesDataArr[i6];
                    if (capturesData3 != null) {
                        capturesData3 = null;
                    } else {
                        capturesData3 = null;
                    }
                }
                capturesData = capturesData != null ? null : null;
                paint3 = this.ripplePaint;
                i9 = DP_2;
                i10 = DP_5;
                if (capturesData3 != null) {
                    canvas.drawCircle(rect.left + i10, i8, (i7 * capturesData3.aValue) - i9, paint3);
                }
                if (capturesData != null) {
                    canvas.drawCircle(rect.right - i10, i8, (i7 * capturesData.aValue) - i9, paint3);
                }
            }
            int i34 = PICKER_CAPTURE_WIDTH;
            int i35 = i34 >> 1;
            chartPickerDelegate.leftPickerArea.set(i - i34, i16, i + i35, i14);
            chartPickerDelegate.rightPickerArea.set(i2 - i35, i16, i2 + i34, i14);
        }
    }

    public abstract void drawPickerChart(Canvas canvas);

    public void drawSelection(Canvas canvas) {
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
        Paint paint = this.selectedLinePaint;
        paint.setAlpha(i2);
        canvas.drawLine(f6, 0.0f, f6, this.chartArea.bottom, paint);
        if (!this.drawPointOnSelection) {
            return;
        }
        ArrayList arrayList = this.lines;
        this.tmpN = arrayList.size();
        this.tmpI = 0;
        while (true) {
            int i3 = this.tmpI;
            if (i3 >= this.tmpN) {
                return;
            }
            LineViewData lineViewData = (LineViewData) arrayList.get(i3);
            if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                float f7 = lineViewData.line.y[this.selectedIndex];
                float f8 = this.currentMinHeight;
                float measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((f7 - f8) / (this.currentMaxHeight - f8)) * ((getMeasuredHeight() - this.chartBottom) - SIGNATURE_TEXT_HEIGHT));
                Paint paint2 = lineViewData.selectionPaint;
                paint2.setAlpha((int) (lineViewData.alpha * 255.0f * this.selectionA));
                Paint paint3 = this.selectionBackgroundPaint;
                paint3.setAlpha((int) (lineViewData.alpha * 255.0f * this.selectionA));
                canvas.drawPoint(f6, measuredHeight, paint2);
                canvas.drawPoint(f6, measuredHeight, paint3);
            }
            this.tmpI++;
        }
    }

    public void drawSignaturesToHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
        float f;
        TextPaint textPaint;
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
        this.linePaint.setAlpha((int) ((this.hintLinePaintAlpha / 255.0f) * chartHorizontalLinesData.alpha * f2 * f));
        TextPaint textPaint2 = this.signaturePaint;
        textPaint2.setAlpha((int) MediaController$$ExternalSyntheticOutline0.m(chartHorizontalLinesData.alpha, this.signaturePaintAlpha, f2, f));
        TextPaint textPaint3 = this.signaturePaint2;
        textPaint3.setAlpha((int) MediaController$$ExternalSyntheticOutline0.m(chartHorizontalLinesData.alpha, this.signaturePaintAlpha, f2, f));
        int measuredHeight = getMeasuredHeight() - this.chartBottom;
        int i2 = SIGNATURE_TEXT_HEIGHT;
        int i3 = measuredHeight - i2;
        int textSize = (int) (i2 - textPaint2.getTextSize());
        int i4 = 1 ^ (this.useMinHeight ? 1 : 0);
        while (i4 < length) {
            float measuredHeight2 = getMeasuredHeight() - this.chartBottom;
            float f4 = chartHorizontalLinesData.values[i4];
            float f5 = this.currentMinHeight;
            float f6 = ((int) (measuredHeight2 - (((f4 - f5) / (this.currentMaxHeight - f5)) * i3))) - textSize;
            int i5 = i4;
            float f7 = HORIZONTAL_PADDING;
            Canvas canvas2 = canvas;
            ChartHorizontalLinesData chartHorizontalLinesData2 = chartHorizontalLinesData;
            chartHorizontalLinesData2.drawText(canvas2, 0, i5, f7, f6, textPaint2);
            if (chartHorizontalLinesData2.valuesStr2 != null) {
                textPaint = textPaint3;
                chartHorizontalLinesData2.drawText(canvas2, 1, i5, getMeasuredWidth() - f7, f6, textPaint);
                i5 = i5;
            } else {
                textPaint = textPaint3;
            }
            i4 = i5 + 1;
            chartHorizontalLinesData = chartHorizontalLinesData2;
            canvas = canvas2;
            textPaint3 = textPaint;
        }
    }

    public void fillTransitionParams(TransitionParams transitionParams) {
    }

    public long findMaxValue(int i, int i2) {
        ArrayList arrayList = this.lines;
        int size = arrayList.size();
        long j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((LineViewData) arrayList.get(i3)).enabled) {
                long jRMaxQ = ((LineViewData) arrayList.get(i3)).line.segmentTree.rMaxQ(i, i2);
                if (jRMaxQ > j) {
                    j = jRMaxQ;
                }
            }
        }
        return j;
    }

    public long findMinValue(int i, int i2) {
        ArrayList arrayList = this.lines;
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            if (((LineViewData) arrayList.get(i3)).enabled) {
                long jRMinQ = ((LineViewData) arrayList.get(i3)).line.segmentTree.rMinQ(i, i2);
                if (jRMinQ < j) {
                    j = jRMinQ;
                }
            }
        }
        return j;
    }

    public long getEndDate() {
        return this.chartData.x[this.endXIndex];
    }

    public float getMinDistance() {
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

    public long getSelectedDate() {
        int i = this.selectedIndex;
        if (i < 0) {
            return -1L;
        }
        return this.chartData.x[i];
    }

    public long getStartDate() {
        return this.chartData.x[this.startXIndex];
    }

    public void init() {
        this.linePaint.setStrokeWidth(1.0f);
        this.selectedLinePaint.setStrokeWidth(SELECTED_LINE_WIDTH);
        TextPaint textPaint = this.signaturePaint;
        float f = SIGNATURE_TEXT_SIZE;
        textPaint.setTextSize(f);
        TextPaint textPaint2 = this.signaturePaint2;
        textPaint2.setTextSize(f);
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        TextPaint textPaint3 = this.bottomSignaturePaint;
        textPaint3.setTextSize(f);
        textPaint3.setTextAlign(Paint.Align.CENTER);
        float fDpf2 = AndroidUtilities.dpf2(6.0f);
        Paint paint = this.selectionBackgroundPaint;
        paint.setStrokeWidth(fDpf2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        LegendSignatureView legendSignatureViewCreateLegendView = createLegendView();
        this.legendSignatureView = legendSignatureViewCreateLegendView;
        legendSignatureViewCreateLegendView.setVisibility(8);
        Paint paint2 = this.whiteLinePaint;
        paint2.setColor(-1);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(3.0f));
        paint2.setStrokeCap(cap);
        updateColors();
    }

    public void initPickerMaxHeight() {
        ArrayList arrayList = this.lines;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            LineViewData lineViewData = (LineViewData) obj;
            boolean z = lineViewData.enabled;
            ChartData.Line line = lineViewData.line;
            if (z) {
                float f = line.maxValue;
                if (f > this.pickerMaxHeight) {
                    this.pickerMaxHeight = f;
                }
            }
            if (z) {
                float f2 = line.minValue;
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

    public final void measureSizes() {
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
        int measuredHeight = getMeasuredHeight() - this.chartBottom;
        float f3 = this.animateToMaxHeight;
        if (f3 == 0.0f || measuredHeight == 0) {
            return;
        }
        this.thresholdMaxHeight = (f3 / measuredHeight) * SIGNATURE_TEXT_SIZE;
    }

    public final void moveLegend(float f) {
        int i;
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
        float f3 = (this.chartStart + this.chartWidth) / 2.0f;
        int i2 = DP_5;
        float width = f2 > f3 ? f2 - (this.legendSignatureView.getWidth() + i2) : f2 + i2;
        if (width < 0.0f) {
            width = 0.0f;
        } else if (this.legendSignatureView.getMeasuredWidth() + width > getMeasuredWidth()) {
            width = getMeasuredWidth() - this.legendSignatureView.getMeasuredWidth();
        }
        this.legendSignatureView.setTranslationX(width);
    }

    public void onActionUp() {
    }

    public void onCheckChanged() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        onPickerDataChanged(true, true, true);
        ArrayList arrayList = this.lines;
        this.tmpN = arrayList.size();
        this.tmpI = 0;
        while (true) {
            int i = this.tmpI;
            if (i >= this.tmpN) {
                break;
            }
            final LineViewData lineViewData = (LineViewData) arrayList.get(i);
            if (lineViewData.enabled && (valueAnimator3 = lineViewData.animatorOut) != null) {
                valueAnimator3.cancel();
            }
            if (!lineViewData.enabled && (valueAnimator2 = lineViewData.animatorIn) != null) {
                valueAnimator2.cancel();
            }
            if (lineViewData.enabled && lineViewData.alpha != 1.0f) {
                ValueAnimator valueAnimator4 = lineViewData.animatorIn;
                if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                    final int i2 = 0;
                    ValueAnimator valueAnimatorCreateAnimator = createAnimator(lineViewData.alpha, 1.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                        public final BaseChartView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            switch (i2) {
                                case 0:
                                    BaseChartView baseChartView = this.f$0;
                                    baseChartView.getClass();
                                    lineViewData.alpha = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    baseChartView.invalidatePickerChart = true;
                                    baseChartView.invalidate();
                                    break;
                                default:
                                    BaseChartView baseChartView2 = this.f$0;
                                    baseChartView2.getClass();
                                    lineViewData.alpha = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                    baseChartView2.invalidatePickerChart = true;
                                    baseChartView2.invalidate();
                                    break;
                            }
                        }
                    });
                    lineViewData.animatorIn = valueAnimatorCreateAnimator;
                    valueAnimatorCreateAnimator.start();
                    if (lineViewData.enabled) {
                    }
                }
            } else if (lineViewData.enabled && lineViewData.alpha != 0.0f && ((valueAnimator = lineViewData.animatorOut) == null || !valueAnimator.isRunning())) {
                final int i3 = 1;
                ValueAnimator valueAnimatorCreateAnimator2 = createAnimator(lineViewData.alpha, 0.0f, new ValueAnimator.AnimatorUpdateListener(this) {
                    public final BaseChartView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        switch (i3) {
                            case 0:
                                BaseChartView baseChartView = this.f$0;
                                baseChartView.getClass();
                                lineViewData.alpha = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                baseChartView.invalidatePickerChart = true;
                                baseChartView.invalidate();
                                break;
                            default:
                                BaseChartView baseChartView2 = this.f$0;
                                baseChartView2.getClass();
                                lineViewData.alpha = ((Float) valueAnimator5.getAnimatedValue()).floatValue();
                                baseChartView2.invalidatePickerChart = true;
                                baseChartView2.invalidate();
                                break;
                        }
                    }
                });
                lineViewData.animatorOut = valueAnimatorCreateAnimator2;
                valueAnimatorCreateAnimator2.start();
            }
            this.tmpI++;
        }
        updatePickerMinMaxHeight();
        if (this.legendShowing) {
            LegendSignatureView legendSignatureView = this.legendSignatureView;
            int i4 = this.selectedIndex;
            ChartData chartData = this.chartData;
            legendSignatureView.setData(i4, chartData.x[i4], arrayList, true, chartData.yTooltipFormatter, chartData.yRate);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.superDraw) {
            super.onDraw(canvas);
            return;
        }
        tick();
        int iSave = canvas.save();
        RectF rectF = this.chartArea;
        canvas.clipRect(0.0f, rectF.top, getMeasuredWidth(), rectF.bottom);
        drawBottomLine(canvas);
        ArrayList arrayList = this.horizontalLines;
        this.tmpN = arrayList.size();
        this.tmpI = 0;
        while (true) {
            int i = this.tmpI;
            if (i >= this.tmpN) {
                break;
            }
            drawHorizontalLines(canvas, (ChartHorizontalLinesData) arrayList.get(i));
            this.tmpI++;
        }
        drawChart(canvas);
        this.tmpI = 0;
        while (true) {
            int i2 = this.tmpI;
            if (i2 >= this.tmpN) {
                canvas.restoreToCount(iSave);
                drawBottomSignature(canvas);
                drawPicker(canvas);
                drawSelection(canvas);
                super.onDraw(canvas);
                return;
            }
            drawSignaturesToHorizontalLines(canvas, (ChartHorizontalLinesData) arrayList.get(i2));
            this.tmpI++;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.landscape) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = this.lastW;
        int i4 = this.pikerHeight;
        if (measuredWidth != i3 || getMeasuredHeight() != this.lastH) {
            this.lastW = getMeasuredWidth();
            this.lastH = getMeasuredHeight();
            float measuredWidth2 = getMeasuredWidth();
            float f = HORIZONTAL_PADDING;
            float f2 = 2.0f * f;
            this.bottomChartBitmap = Bitmap.createBitmap((int) (measuredWidth2 - f2), i4, Bitmap.Config.ARGB_4444);
            this.bottomChartCanvas = new Canvas(this.bottomChartBitmap);
            this.sharedUiComponents.getPickerMaskBitmap(i4, (int) (getMeasuredWidth() - f2));
            measureSizes();
            if (this.legendShowing) {
                moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - f);
            }
            onPickerDataChanged(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int measuredHeight = getMeasuredHeight();
            int i5 = PICKER_PADDING;
            this.exclusionRect.set(0, measuredHeight - ((i4 + i5) + i5), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.exclusionRects);
        }
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
            moveLegend((this.chartFullWidth * chartPickerDelegate.pickerStart) - HORIZONTAL_PADDING);
        }
        invalidate();
    }

    @Override
    public void onPickerJumpTo(float f, float f2, boolean z) {
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        if (!z) {
            updateIndexes();
            invalidate();
        } else {
            int iFindStartIndex = chartData.findStartIndex(Math.max(f, 0.0f));
            int iFindEndIndex = this.chartData.findEndIndex(Math.min(f2, 1.0f), iFindStartIndex);
            setMaxMinValue(findMaxValue(iFindStartIndex, iFindEndIndex), findMinValue(iFindStartIndex, iFindEndIndex), true, true, false);
            animateLegend(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChartPickerDelegate.CapturesData capturesData;
        ChartPickerDelegate.CapturesData capturesData2;
        long jFindMinValue;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.chartData != null) {
            boolean z = this.enabled;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            if (!z) {
                chartPickerDelegate.uncapture(motionEvent.getActionIndex(), motionEvent);
                getParent().requestDisallowInterceptTouchEvent(false);
                this.chartCaptured = false;
                return false;
            }
            int x = (int) motionEvent.getX(motionEvent.getActionIndex());
            int y = (int) motionEvent.getY(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.chartArea;
            if (actionMasked == 0) {
                this.capturedTime = System.currentTimeMillis();
                getParent().requestDisallowInterceptTouchEvent(true);
                if (!chartPickerDelegate.capture(x, y, motionEvent.getActionIndex())) {
                    this.lastX = x;
                    this.capturedX = x;
                    this.lastY = y;
                    this.capturedY = y;
                    if (rectF.contains(x, y)) {
                        if (this.selectedIndex < 0 || !this.animateLegentTo) {
                            this.chartCaptured = true;
                            selectXOnChart(x, y);
                            return true;
                        }
                    }
                }
                return true;
            }
            if (actionMasked == 1) {
                if (!chartPickerDelegate.uncapture(motionEvent.getActionIndex(), motionEvent)) {
                    if (rectF.contains(this.capturedX, this.capturedY) && !this.chartCaptured) {
                        animateLegend(false);
                    }
                    ChartPickerDelegate.CapturesData[] capturesDataArr = chartPickerDelegate.capturedStates;
                    capturesData = capturesDataArr[0];
                    if (capturesData != null && (valueAnimator2 = capturesData.a) != null) {
                        valueAnimator2.cancel();
                    }
                    capturesData2 = capturesDataArr[1];
                    if (capturesData2 != null && (valueAnimator = capturesData2.a) != null) {
                        valueAnimator.cancel();
                    }
                    capturesDataArr[0] = null;
                    capturesDataArr[1] = null;
                    updateLineSignature();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.chartCaptured = false;
                    onActionUp();
                    invalidate();
                    if (this.useMinHeight) {
                        jFindMinValue = findMinValue(this.startXIndex, this.endXIndex);
                    } else {
                        jFindMinValue = 0;
                    }
                    setMaxMinValue(findMaxValue(this.startXIndex, this.endXIndex), jFindMinValue, true, true, false);
                    return true;
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        return chartPickerDelegate.capture(x, y, motionEvent.getActionIndex());
                    }
                    if (actionMasked == 6) {
                        chartPickerDelegate.uncapture(motionEvent.getActionIndex(), motionEvent);
                        return true;
                    }
                }
                if (!chartPickerDelegate.uncapture(motionEvent.getActionIndex(), motionEvent)) {
                    if (rectF.contains(this.capturedX, this.capturedY)) {
                        animateLegend(false);
                    }
                    ChartPickerDelegate.CapturesData[] capturesDataArr2 = chartPickerDelegate.capturedStates;
                    capturesData = capturesDataArr2[0];
                    if (capturesData != null) {
                        valueAnimator2.cancel();
                    }
                    capturesData2 = capturesDataArr2[1];
                    if (capturesData2 != null) {
                        valueAnimator.cancel();
                    }
                    capturesDataArr2[0] = null;
                    capturesDataArr2[1] = null;
                    updateLineSignature();
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.chartCaptured = false;
                    onActionUp();
                    invalidate();
                    if (this.useMinHeight) {
                        jFindMinValue = findMinValue(this.startXIndex, this.endXIndex);
                    } else {
                        jFindMinValue = 0;
                    }
                    setMaxMinValue(findMaxValue(this.startXIndex, this.endXIndex), jFindMinValue, true, true, false);
                    return true;
                }
            } else {
                int i = x - this.lastX;
                int i2 = y - this.lastY;
                if (chartPickerDelegate.capturedStates[0] != null || chartPickerDelegate.tryMoveTo) {
                    boolean zMove = chartPickerDelegate.move(x, motionEvent.getActionIndex());
                    if (motionEvent.getPointerCount() > 1) {
                        int x2 = (int) motionEvent.getX(1);
                        motionEvent.getY(1);
                        chartPickerDelegate.move(x2, 1);
                    }
                    getParent().requestDisallowInterceptTouchEvent(zMove);
                    return true;
                }
                boolean z2 = this.chartCaptured;
                int i3 = this.touchSlop;
                if (z2) {
                    boolean z3 = (this.canCaptureChartSelection && System.currentTimeMillis() - this.capturedTime > 200) || Math.abs(i) > Math.abs(i2) || Math.abs(i2) < i3;
                    this.lastX = x;
                    this.lastY = y;
                    getParent().requestDisallowInterceptTouchEvent(z3);
                    selectXOnChart(x, y);
                    return true;
                }
                if (rectF.contains(this.capturedX, this.capturedY)) {
                    int i4 = this.capturedX - x;
                    int i5 = this.capturedY - y;
                    if (Math.sqrt((i5 * i5) + (i4 * i4)) > i3 || System.currentTimeMillis() - this.capturedTime > 200) {
                        this.chartCaptured = true;
                        selectXOnChart(x, y);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void runSmoothHaptic() {
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.vibrationEffect == null) {
                this.vibrationEffect = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
            }
            vibrator.cancel();
            vibrator.vibrate(this.vibrationEffect);
        }
    }

    public void selectXOnChart(int i, int i2) {
        int i3 = this.selectedIndex;
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        float f = this.chartFullWidth;
        float f2 = (this.pickerDelegate.pickerStart * f) - HORIZONTAL_PADDING;
        float f3 = (i + f2) / f;
        if (f3 < 0.0f) {
            this.selectedIndex = 0;
        } else if (f3 > 1.0f) {
            this.selectedIndex = chartData.x.length - 1;
        } else {
            int iFindIndex = chartData.findIndex(f3, this.startXIndex, this.endXIndex);
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
                getSelectedDate();
                StatisticActivity.BaseChartCell baseChartCell = (StatisticActivity.BaseChartCell) ((StoriesViewPager$$ExternalSyntheticLambda0) dateSelectionListener).f$0;
                baseChartCell.zoomCanceled();
                baseChartCell.chartView.legendSignatureView.showProgress(false, false);
            }
            runSmoothHaptic();
            invalidate();
        }
    }

    public boolean setData(ChartData chartData) {
        boolean z;
        ChartData chartData2 = this.chartData;
        ArrayList arrayList = this.lines;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        if (chartData2 != chartData) {
            invalidate();
            arrayList.clear();
            if (chartData != null && chartData.lines != null) {
                for (int i = 0; i < chartData.lines.size(); i++) {
                    arrayList.add(createLineViewData((ChartData.Line) chartData.lines.get(i)));
                }
            }
            this.selectedIndex = -1;
            this.legendShowing = false;
            this.animateLegentTo = false;
            this.legendSignatureView.setVisibility(8);
            this.selectionA = 0.0f;
            this.chartData = chartData;
            if (chartData != null) {
                if (chartData.x[0] == 0) {
                    chartPickerDelegate.pickerStart = 0.0f;
                    chartPickerDelegate.pickerEnd = 1.0f;
                } else {
                    float minDistance = getMinDistance();
                    chartPickerDelegate.minDistance = minDistance;
                    float f = chartPickerDelegate.pickerEnd;
                    if (f - chartPickerDelegate.pickerStart < minDistance) {
                        float f2 = f - minDistance;
                        chartPickerDelegate.pickerStart = f2;
                        if (f2 < 0.0f) {
                            chartPickerDelegate.pickerStart = 0.0f;
                            chartPickerDelegate.pickerEnd = 1.0f;
                        }
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        measureSizes();
        if (chartData != null) {
            updateIndexes();
            setMaxMinValue(findMaxValue(this.startXIndex, this.endXIndex), this.useMinHeight ? findMinValue(this.startXIndex, this.endXIndex) : 0L, false, false, false);
            this.pickerMaxHeight = 0.0f;
            this.pickerMinHeight = 2.1474836E9f;
            initPickerMaxHeight();
            int i2 = chartData.yTooltipFormatter;
            if (i2 == 1 || i2 == 2) {
                this.legendSignatureView.setSize(arrayList.size() * 2);
            } else {
                this.legendSignatureView.setSize(arrayList.size());
            }
            this.invalidatePickerChart = true;
            updateLineSignature();
            return z;
        }
        chartPickerDelegate.pickerStart = 0.7f;
        chartPickerDelegate.pickerEnd = 1.0f;
        this.pickerMinHeight = 0.0f;
        this.pickerMaxHeight = 0.0f;
        this.horizontalLines.clear();
        AnimatorSet animatorSet = this.maxValueAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.alphaAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.alphaAnimator.cancel();
        }
        return z;
    }

    public void setDateSelectionListener(DateSelectionListener dateSelectionListener) {
        this.dateSelectionListener = dateSelectionListener;
    }

    public void setHeader(ChartHeaderView chartHeaderView) {
        this.chartHeaderView = chartHeaderView;
    }

    public void setLandscape(boolean z) {
        this.landscape = z;
    }

    public final void setMaxMinValue(long j, long j2, boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if ((Math.abs((((long) Math.ceil(((j <= 100 || ((float) (j / 5)) % 10.0f == 0.0f) ? j : ((j / 10) + 1) * 10) / 5.0f)) * 5) - this.animateToMaxHeight) < this.thresholdMaxHeight || j == 0) && j == this.animateToMinHeight) {
            return;
        }
        ChartHorizontalLinesData chartHorizontalLinesDataCreateHorizontalLinesData = createHorizontalLinesData(this.chartData.yTickFormatter, j, j2);
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
            boolean z5 = ((float) j3) != this.animateToMaxHeight;
            if (this.useMinHeight && j4 != this.animateToMinHeight) {
                z5 = true;
            }
            if (z5) {
                AnimatorSet animatorSet = this.maxValueAnimator;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
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
        int measuredHeight = getMeasuredHeight() - this.chartBottom;
        float f7 = this.animateToMaxHeight;
        if (f7 != 0.0f && measuredHeight != 0) {
            this.thresholdMaxHeight = (f7 / measuredHeight) * SIGNATURE_TEXT_SIZE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastTime >= 320 || z2) {
            this.lastTime = jCurrentTimeMillis;
            ValueAnimator valueAnimator = this.alphaAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.alphaAnimator.cancel();
            }
            ArrayList arrayList = this.horizontalLines;
            if (!z) {
                this.currentMaxHeight = f5;
                this.currentMinHeight = f6;
                arrayList.clear();
                arrayList.add(chartHorizontalLinesDataCreateHorizontalLinesData);
                chartHorizontalLinesDataCreateHorizontalLinesData.alpha = 255;
                return;
            }
            arrayList.add(chartHorizontalLinesDataCreateHorizontalLinesData);
            if (z3) {
                AnimatorSet animatorSet2 = this.maxValueAnimator;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.maxValueAnimator.cancel();
                }
                this.minMaxUpdateStep = 0.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(createAnimator(this.currentMaxHeight, f5, this.heightUpdateListener));
                if (this.useMinHeight) {
                    animatorSet3.playTogether(createAnimator(this.currentMinHeight, f6, this.minHeightUpdateListener));
                }
                this.maxValueAnimator = animatorSet3;
                animatorSet3.start();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ChartHorizontalLinesData chartHorizontalLinesData = (ChartHorizontalLinesData) arrayList.get(i);
                if (chartHorizontalLinesData != chartHorizontalLinesDataCreateHorizontalLinesData) {
                    chartHorizontalLinesData.fixedAlpha = chartHorizontalLinesData.alpha;
                }
            }
            ValueAnimator valueAnimatorCreateAnimator = createAnimator(0.0f, 255.0f, new QrActivity$$ExternalSyntheticLambda14(3, this, chartHorizontalLinesDataCreateHorizontalLinesData));
            this.alphaAnimator = valueAnimatorCreateAnimator;
            valueAnimatorCreateAnimator.addListener(new ChatActivity.AnonymousClass74(this, chartHorizontalLinesDataCreateHorizontalLinesData, z4, 5));
            this.alphaAnimator.start();
        }
    }

    public final void tick() {
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
                this.currentMaxHeight = (CubicBezierInterpolator.EASE_OUT.getInterpolation(f4) * (f3 - f5)) + f5;
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
                    this.currentMinHeight = (CubicBezierInterpolator.EASE_OUT.getInterpolation(f8) * (f7 - f9)) + f9;
                }
                invalidate();
            }
        }
    }

    public final void updateColors() {
        int i = this.useAlphaSignature ? Theme.key_statisticChartSignatureAlpha : Theme.key_statisticChartSignature;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        TextPaint textPaint = this.signaturePaint;
        textPaint.setColor(color);
        this.signaturePaint2.setColor(Theme.getColor(this.useAlphaSignature ? Theme.key_statisticChartSignatureAlpha : Theme.key_statisticChartSignature, resourcesProvider));
        int color2 = Theme.getColor(Theme.key_statisticChartSignature, resourcesProvider);
        TextPaint textPaint2 = this.bottomSignaturePaint;
        textPaint2.setColor(color2);
        int color3 = Theme.getColor(Theme.key_statisticChartHintLine, resourcesProvider);
        Paint paint = this.linePaint;
        paint.setColor(color3);
        int color4 = Theme.getColor(Theme.key_statisticChartActiveLine, resourcesProvider);
        Paint paint2 = this.selectedLinePaint;
        paint2.setColor(color4);
        this.pickerSelectorPaint.setColor(Theme.getColor(Theme.key_statisticChartActivePickerChart, resourcesProvider));
        this.unactiveBottomChartPaint.setColor(Theme.getColor(Theme.key_statisticChartInactivePickerChart, resourcesProvider));
        this.selectionBackgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        this.ripplePaint.setColor(Theme.getColor(Theme.key_statisticChartRipple, resourcesProvider));
        this.legendSignatureView.recolor();
        this.hintLinePaintAlpha = paint.getAlpha();
        this.chartActiveLineAlpha = paint2.getAlpha();
        this.signaturePaintAlpha = textPaint.getAlpha() / 255.0f;
        this.bottomSignaturePaintAlpha = textPaint2.getAlpha() / 255.0f;
        ArrayList arrayList = this.lines;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((LineViewData) obj).updateColors();
        }
        if (this.legendShowing) {
            int i3 = this.selectedIndex;
            ChartData chartData = this.chartData;
            long[] jArr = chartData.x;
            if (i3 < jArr.length) {
                this.legendSignatureView.setData(i3, jArr[i3], arrayList, false, chartData.yTooltipFormatter, chartData.yRate);
            }
        }
        this.invalidatePickerChart = true;
    }

    public final void updateIndexes() {
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        int iFindStartIndex = chartData.findStartIndex(Math.max(chartPickerDelegate.pickerStart, 0.0f));
        this.startXIndex = iFindStartIndex;
        int iFindEndIndex = this.chartData.findEndIndex(Math.min(chartPickerDelegate.pickerEnd, 1.0f), iFindStartIndex);
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

    public final void updateLineSignature() {
        ChartData chartData = this.chartData;
        if (chartData != null) {
            float f = this.chartWidth;
            if (f == 0.0f) {
                return;
            }
            int i = (int) ((f / (this.chartFullWidth * chartData.oneDayPercentage)) / 6.0f);
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
                    ChartBottomSignatureData chartBottomSignatureData3 = new ChartBottomSignatureData(iHighestOneBit, (int) (d + d2), (int) (d - d2));
                    chartBottomSignatureData3.alpha = 255;
                    ChartBottomSignatureData chartBottomSignatureData4 = this.currentBottomSignatures;
                    ArrayList arrayList = this.bottomSignatureDate;
                    if (chartBottomSignatureData4 == null) {
                        this.currentBottomSignatures = chartBottomSignatureData3;
                        chartBottomSignatureData3.alpha = 255;
                        arrayList.add(chartBottomSignatureData3);
                        return;
                    }
                    this.currentBottomSignatures = chartBottomSignatureData3;
                    this.tmpN = arrayList.size();
                    for (int i2 = 0; i2 < this.tmpN; i2++) {
                        ChartBottomSignatureData chartBottomSignatureData5 = (ChartBottomSignatureData) arrayList.get(i2);
                        chartBottomSignatureData5.fixedAlpha = chartBottomSignatureData5.alpha;
                    }
                    arrayList.add(chartBottomSignatureData3);
                    if (arrayList.size() > 2) {
                        arrayList.remove(0);
                    }
                    ValueAnimator duration = createAnimator(0.0f, 1.0f, new QrActivity$$ExternalSyntheticLambda14(4, this, chartBottomSignatureData3)).setDuration(200L);
                    this.alphaBottomAnimator = duration;
                    duration.addListener(new ChatActivity.AnonymousClass74(this, chartBottomSignatureData3, false, 6));
                    this.alphaBottomAnimator.start();
                }
            }
        }
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
        float[] fArr = chartData.xPercentage;
        float f = fArr[i2];
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        chartPickerDelegate.pickerStart = f;
        chartPickerDelegate.pickerEnd = fArr[i];
    }

    public void updatePickerMinMaxHeight() {
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
                ChartData.Line line = lineViewData.line;
                if (z) {
                    long j3 = line.maxValue;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
                if (z) {
                    long j4 = line.minValue;
                    if (j4 < j) {
                        j = j4;
                    }
                }
            }
            if ((j == 2147483647L || j == 0.0f) && (j2 <= 0 || j2 == this.animatedToPickerMaxHeight)) {
                return;
            }
            this.animatedToPickerMaxHeight = j2;
            Animator animator = this.pickerAnimator;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(createAnimator(this.pickerMaxHeight, this.animatedToPickerMaxHeight, this.pickerHeightUpdateListener), createAnimator(this.pickerMinHeight, 0.0f, this.pickerMinHeightUpdateListener));
            this.pickerAnimator = animatorSet;
            animatorSet.start();
        }
    }
}
