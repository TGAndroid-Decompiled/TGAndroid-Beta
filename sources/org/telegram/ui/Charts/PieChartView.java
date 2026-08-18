package org.telegram.ui.Charts;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LegendSignatureView;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.PieLegendView;
import org.telegram.ui.Charts.view_data.TransitionParams;

public class PieChartView extends StackLinearChartView {
    float MAX_TEXT_SIZE;
    float MIN_TEXT_SIZE;
    int currentSelection;
    float[] darawingValuesPercentage;
    float emptyDataAlpha;
    boolean isEmpty;
    int lastEndIndex;
    int lastStartIndex;
    String[] lookupTable;
    int oldW;
    PieLegendView pieLegendView;
    RectF rectF;
    float sum;
    TextPaint textPaint;
    float[] values;

    @Override
    protected void drawBottomLine(Canvas canvas) {
    }

    @Override
    void drawBottomSignature(Canvas canvas) {
    }

    @Override
    protected void drawHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
    }

    @Override
    protected void drawSelection(Canvas canvas) {
    }

    @Override
    protected void drawSignaturesToHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
    }

    public PieChartView(Context context) {
        super(context);
        this.currentSelection = -1;
        this.rectF = new RectF();
        this.MIN_TEXT_SIZE = AndroidUtilities.dp(9.0f);
        this.MAX_TEXT_SIZE = AndroidUtilities.dp(13.0f);
        this.lookupTable = new String[101];
        this.emptyDataAlpha = 1.0f;
        this.oldW = 0;
        this.lastStartIndex = -1;
        this.lastEndIndex = -1;
        for (int i = 1; i <= 100; i++) {
            this.lookupTable[i] = i + "%";
        }
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.textPaint.setColor(-1);
        this.textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.canCaptureChartSelection = true;
    }

    @Override
    protected void drawChart(Canvas canvas) {
        int i;
        float f;
        float f2;
        Canvas canvas2;
        int i2;
        int i3;
        Canvas canvas3 = canvas;
        if (this.chartData == null) {
            return;
        }
        if (canvas3 != null) {
            canvas.save();
        }
        if (this.transitionMode == 1) {
            float f3 = this.transitionParams.progress;
            i = (int) (f3 * f3 * 255.0f);
        } else {
            i = 255;
        }
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (this.isEmpty) {
            float f6 = this.emptyDataAlpha;
            if (f6 != 0.0f) {
                float f7 = f6 - 0.12f;
                this.emptyDataAlpha = f7;
                if (f7 < 0.0f) {
                    this.emptyDataAlpha = 0.0f;
                }
                invalidate();
            }
        } else {
            float f8 = this.emptyDataAlpha;
            if (f8 != 1.0f) {
                float f9 = f8 + 0.12f;
                this.emptyDataAlpha = f9;
                if (f9 > 1.0f) {
                    this.emptyDataAlpha = 1.0f;
                }
                invalidate();
            }
        }
        float f10 = this.emptyDataAlpha;
        int i4 = (int) (i * f10);
        float f11 = (f10 * 0.6f) + 0.4f;
        if (canvas3 != null) {
            canvas3.scale(f11, f11, this.chartArea.centerX(), this.chartArea.centerY());
        }
        float fHeight = (int) ((this.chartArea.width() > this.chartArea.height() ? this.chartArea.height() : this.chartArea.width()) * 0.45f);
        this.rectF.set(this.chartArea.centerX() - fHeight, (this.chartArea.centerY() + AndroidUtilities.dp(16.0f)) - fHeight, this.chartArea.centerX() + fHeight, this.chartArea.centerY() + AndroidUtilities.dp(16.0f) + fHeight);
        int size = this.lines.size();
        float f12 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            f12 += ((PieChartViewData) this.lines.get(i5)).drawingPart * ((PieChartViewData) this.lines.get(i5)).alpha;
        }
        if (f12 == 0.0f) {
            if (canvas3 != null) {
                canvas.restore();
                return;
            }
            return;
        }
        float f13 = -90.0f;
        int i6 = 0;
        float f14 = -90.0f;
        while (true) {
            f = 2.0f;
            f2 = 8.0f;
            if (i6 >= size) {
                break;
            }
            if (((PieChartViewData) this.lines.get(i6)).alpha > f5 || ((PieChartViewData) this.lines.get(i6)).enabled) {
                ((PieChartViewData) this.lines.get(i6)).paint.setAlpha(i4);
                float f15 = (((PieChartViewData) this.lines.get(i6)).drawingPart / f12) * ((PieChartViewData) this.lines.get(i6)).alpha;
                this.darawingValuesPercentage[i6] = f15;
                if (f15 == f5) {
                    i3 = i6;
                    i4 = i4;
                    f12 = f12;
                } else {
                    if (canvas3 != null) {
                        canvas.save();
                    }
                    double d = f14 + ((f15 / 2.0f) * 360.0f);
                    if (((PieChartViewData) this.lines.get(i6)).selectionA > f5) {
                        float interpolation = BaseChartView.INTERPOLATOR.getInterpolation(((PieChartViewData) this.lines.get(i6)).selectionA);
                        if (canvas3 != null) {
                            double d2 = interpolation;
                            canvas3.translate((float) (Math.cos(Math.toRadians(d)) * ((double) AndroidUtilities.dp(8.0f)) * d2), (float) (Math.sin(Math.toRadians(d)) * ((double) AndroidUtilities.dp(8.0f)) * d2));
                        }
                    }
                    ((PieChartViewData) this.lines.get(i6)).paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    ((PieChartViewData) this.lines.get(i6)).paint.setStrokeWidth(1.0f);
                    ((PieChartViewData) this.lines.get(i6)).paint.setAntiAlias(!BaseChartView.USE_LINES);
                    if (canvas3 == null || this.transitionMode == 1) {
                        i3 = i6;
                    } else {
                        i3 = i6;
                        canvas.drawArc(this.rectF, f14, f15 * 360.0f, true, ((PieChartViewData) this.lines.get(i6)).paint);
                        ((PieChartViewData) this.lines.get(i3)).paint.setStyle(Paint.Style.STROKE);
                        canvas.restore();
                    }
                    ((PieChartViewData) this.lines.get(i3)).paint.setAlpha(255);
                    f14 += f15 * 360.0f;
                }
            } else {
                i3 = i6;
                i4 = i4;
                f12 = f12;
            }
            i6 = i3 + 1;
            f12 = f12;
            i4 = i4;
            f5 = 0.0f;
        }
        int i7 = i4;
        float f16 = f12;
        if (canvas3 != null) {
            int i8 = 0;
            while (i8 < size) {
                if (((PieChartViewData) this.lines.get(i8)).alpha > 0.0f || ((PieChartViewData) this.lines.get(i8)).enabled) {
                    float f17 = (((PieChartViewData) this.lines.get(i8)).drawingPart * ((PieChartViewData) this.lines.get(i8)).alpha) / f16;
                    canvas.save();
                    double d3 = f13 + ((f17 / f) * 360.0f);
                    if (((PieChartViewData) this.lines.get(i8)).selectionA > 0.0f) {
                        double interpolation2 = BaseChartView.INTERPOLATOR.getInterpolation(((PieChartViewData) this.lines.get(i8)).selectionA);
                        canvas3.translate((float) (Math.cos(Math.toRadians(d3)) * ((double) AndroidUtilities.dp(f2)) * interpolation2), (float) (Math.sin(Math.toRadians(d3)) * ((double) AndroidUtilities.dp(f2)) * interpolation2));
                    }
                    int i9 = (int) (100.0f * f17);
                    if (f17 < 0.02f || i9 <= 0 || i9 > 100) {
                        canvas2 = canvas3;
                        i2 = i7;
                    } else {
                        float fWidth = (float) (((double) (this.rectF.width() * 0.42f)) * Math.sqrt(f4 - f17));
                        this.textPaint.setTextSize(this.MIN_TEXT_SIZE + (this.MAX_TEXT_SIZE * f17));
                        i2 = i7;
                        this.textPaint.setAlpha((int) (i2 * ((PieChartViewData) this.lines.get(i8)).alpha));
                        double d4 = fWidth;
                        canvas2 = canvas;
                        canvas2.drawText(this.lookupTable[i9], (float) (((double) this.rectF.centerX()) + (Math.cos(Math.toRadians(d3)) * d4)), ((float) (((double) this.rectF.centerY()) + (d4 * Math.sin(Math.toRadians(d3))))) - ((this.textPaint.descent() + this.textPaint.ascent()) / 2.0f), this.textPaint);
                    }
                    canvas.restore();
                    ((PieChartViewData) this.lines.get(i8)).paint.setAlpha(255);
                    f13 += f17 * 360.0f;
                } else {
                    canvas2 = canvas3;
                    i2 = i7;
                }
                i8++;
                canvas3 = canvas2;
                i7 = i2;
                f = 2.0f;
                f2 = 8.0f;
                f4 = 1.0f;
            }
            canvas.restore();
        }
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        ChartData chartData = this.chartData;
        if (chartData != null) {
            int length = ((StackLinearChartData) chartData).xPercentage.length;
            int size = this.lines.size();
            for (int i2 = 0; i2 < this.lines.size(); i2++) {
                ((LineViewData) this.lines.get(i2)).linesPathBottomSize = 0;
            }
            float length2 = (1.0f / ((StackLinearChartData) this.chartData).xPercentage.length) * this.pickerWidth;
            for (int i3 = 0; i3 < length; i3++) {
                float f4 = (length2 / 2.0f) + (((StackLinearChartData) this.chartData).xPercentage[i3] * (this.pickerWidth - length2));
                float f5 = 0.0f;
                int i4 = 0;
                float f6 = 0.0f;
                int i5 = 0;
                boolean z = true;
                while (i4 < size) {
                    LineViewData lineViewData = (LineViewData) this.lines.get(i4);
                    boolean z2 = lineViewData.enabled;
                    if (z2 || lineViewData.alpha != 0.0f) {
                        i = i4;
                        float f7 = lineViewData.line.y[i3] * lineViewData.alpha;
                        f6 += f7;
                        if (f7 > 0.0f) {
                            i5++;
                            if (z2) {
                                z = false;
                            }
                        }
                    } else {
                        i = i4;
                    }
                    i4 = i + 1;
                }
                int i6 = 0;
                float f8 = 0.0f;
                while (i6 < size) {
                    LineViewData lineViewData2 = (LineViewData) this.lines.get(i6);
                    if (lineViewData2.enabled || lineViewData2.alpha != f5) {
                        long[] jArr = lineViewData2.line.y;
                        if (i5 == 1) {
                            if (jArr[i3] == 0) {
                                i6 = i6;
                                f3 = 0.0f;
                            } else {
                                f3 = lineViewData2.alpha;
                                i6 = i6;
                            }
                        } else if (f6 == f5) {
                            i6 = i6;
                            f3 = 0.0f;
                        } else {
                            if (z) {
                                float f9 = jArr[i3] / f6;
                                f2 = lineViewData2.alpha;
                                f = f9 * f2;
                            } else {
                                f = jArr[i3] / f6;
                                f2 = lineViewData2.alpha;
                            }
                            f3 = f * f2;
                        }
                        float f10 = this.pikerHeight;
                        float f11 = f3 * f10;
                        float[] fArr = lineViewData2.linesPath;
                        int i7 = lineViewData2.linesPathBottomSize;
                        int i8 = i7 + 1;
                        lineViewData2.linesPathBottomSize = i8;
                        fArr[i7] = f4;
                        int i9 = i7 + 2;
                        lineViewData2.linesPathBottomSize = i9;
                        fArr[i8] = (f10 - f11) - f8;
                        int i10 = i7 + 3;
                        lineViewData2.linesPathBottomSize = i10;
                        fArr[i9] = f4;
                        lineViewData2.linesPathBottomSize = i7 + 4;
                        fArr[i10] = f10 - f8;
                        f8 += f11;
                    } else {
                        i6 = i6;
                    }
                    i6++;
                    length = length;
                    f5 = 0.0f;
                }
            }
            for (int i11 = 0; i11 < size; i11++) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(i11);
                lineViewData3.paint.setStrokeWidth(length2);
                lineViewData3.paint.setAlpha(255);
                lineViewData3.paint.setAntiAlias(false);
                canvas.drawLines(lineViewData3.linesPath, 0, lineViewData3.linesPathBottomSize, lineViewData3.paint);
            }
        }
    }

    @Override
    public boolean setData(StackLinearChartData stackLinearChartData) {
        boolean data = super.setData((ChartData) stackLinearChartData);
        if (stackLinearChartData != null) {
            this.values = new float[stackLinearChartData.lines.size()];
            this.darawingValuesPercentage = new float[stackLinearChartData.lines.size()];
            onPickerDataChanged(false, true, false);
        }
        return data;
    }

    @Override
    public PieChartViewData createLineViewData(ChartData.Line line) {
        return new PieChartViewData(line);
    }

    @Override
    protected void selectXOnChart(int i, int i2) {
        if (this.chartData == null || this.isEmpty) {
            return;
        }
        float degrees = (float) (Math.toDegrees(Math.atan2((this.chartArea.centerY() + AndroidUtilities.dp(16.0f)) - i2, this.chartArea.centerX() - i)) - 90.0d);
        float f = 0.0f;
        if (degrees < 0.0f) {
            degrees = (float) (((double) degrees) + 360.0d);
        }
        float f2 = degrees / 360.0f;
        int i3 = 0;
        float f3 = 0.0f;
        while (true) {
            if (i3 >= this.lines.size()) {
                i3 = -1;
                f3 = 0.0f;
                break;
            }
            if (((PieChartViewData) this.lines.get(i3)).enabled || ((PieChartViewData) this.lines.get(i3)).alpha != 0.0f) {
                if (f2 > f3) {
                    float f4 = this.darawingValuesPercentage[i3] + f3;
                    if (f2 < f4) {
                        f = f4;
                        break;
                    }
                }
                f3 += this.darawingValuesPercentage[i3];
            }
            i3++;
        }
        if (this.currentSelection != i3 && i3 >= 0) {
            this.currentSelection = i3;
            invalidate();
            this.pieLegendView.setVisibility(0);
            LineViewData lineViewData = (LineViewData) this.lines.get(i3);
            this.pieLegendView.setData(lineViewData.line.name, (int) this.values[this.currentSelection], lineViewData.lineColor);
            this.pieLegendView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            double dWidth = this.rectF.width() / 2.0f;
            double d = (f * 360.0f) - 90.0f;
            double d2 = (f3 * 360.0f) - 90.0f;
            int iMin = (int) Math.min(((double) this.rectF.centerX()) + (Math.cos(Math.toRadians(d)) * dWidth), ((double) this.rectF.centerX()) + (Math.cos(Math.toRadians(d2)) * dWidth));
            int measuredWidth = iMin >= 0 ? iMin : 0;
            if (this.pieLegendView.getMeasuredWidth() + measuredWidth > getMeasuredWidth() - AndroidUtilities.dp(16.0f)) {
                measuredWidth -= (this.pieLegendView.getMeasuredWidth() + measuredWidth) - (getMeasuredWidth() - AndroidUtilities.dp(16.0f));
            }
            int iMin2 = ((int) Math.min(this.rectF.centerY(), (int) Math.min(((double) this.rectF.centerY()) + (Math.sin(Math.toRadians(d2)) * dWidth), ((double) this.rectF.centerY()) + (dWidth * Math.sin(Math.toRadians(d)))))) - AndroidUtilities.dp(50.0f);
            this.pieLegendView.setTranslationX(measuredWidth);
            this.pieLegendView.setTranslationY(iMin2);
            AndroidUtilities.vibrateCursor(this);
        }
        moveLegend();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.chartData != null) {
            for (int i = 0; i < this.lines.size(); i++) {
                if (i == this.currentSelection) {
                    if (((PieChartViewData) this.lines.get(i)).selectionA < 1.0f) {
                        ((PieChartViewData) this.lines.get(i)).selectionA += 0.1f;
                        if (((PieChartViewData) this.lines.get(i)).selectionA > 1.0f) {
                            ((PieChartViewData) this.lines.get(i)).selectionA = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((PieChartViewData) this.lines.get(i)).selectionA > 0.0f) {
                    ((PieChartViewData) this.lines.get(i)).selectionA -= 0.1f;
                    if (((PieChartViewData) this.lines.get(i)).selectionA < 0.0f) {
                        ((PieChartViewData) this.lines.get(i)).selectionA = 0.0f;
                    }
                    invalidate();
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override
    protected void onActionUp() {
        this.currentSelection = -1;
        this.pieLegendView.setVisibility(8);
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != this.oldW) {
            this.oldW = getMeasuredWidth();
            int iHeight = (int) ((this.chartArea.width() > this.chartArea.height() ? this.chartArea.height() : this.chartArea.width()) * 0.45f);
            this.MIN_TEXT_SIZE = iHeight / 13;
            this.MAX_TEXT_SIZE = iHeight / 7;
        }
    }

    @Override
    public void updatePicker(ChartData chartData, long j) {
        int length = chartData.x.length;
        long j2 = j - (j % 86400000);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (j2 >= chartData.x[i2]) {
                i = i2;
            }
        }
        float length2 = chartData.xPercentage.length < 2 ? 0.5f : 1.0f / chartData.x.length;
        if (i == 0) {
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            chartPickerDelegate.pickerStart = 0.0f;
            chartPickerDelegate.pickerEnd = length2;
        } else {
            if (i >= chartData.x.length - 1) {
                ChartPickerDelegate chartPickerDelegate2 = this.pickerDelegate;
                chartPickerDelegate2.pickerStart = 1.0f - length2;
                chartPickerDelegate2.pickerEnd = 1.0f;
                return;
            }
            ChartPickerDelegate chartPickerDelegate3 = this.pickerDelegate;
            float f = i * length2;
            chartPickerDelegate3.pickerStart = f;
            float f2 = f + length2;
            chartPickerDelegate3.pickerEnd = f2;
            if (f2 > 1.0f) {
                chartPickerDelegate3.pickerEnd = 1.0f;
            }
            onPickerDataChanged(true, true, false);
        }
    }

    @Override
    protected LegendSignatureView createLegendView() {
        PieLegendView pieLegendView = new PieLegendView(getContext());
        this.pieLegendView = pieLegendView;
        return pieLegendView;
    }

    @Override
    public void onPickerDataChanged(boolean z, boolean z2, boolean z3) {
        super.onPickerDataChanged(z, z2, z3);
        ChartData chartData = this.chartData;
        if (chartData == null || ((StackLinearChartData) chartData).xPercentage == null) {
            return;
        }
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        updateCharValues(chartPickerDelegate.pickerStart, chartPickerDelegate.pickerEnd, z2);
    }

    private void updateCharValues(float f, float f2, boolean z) {
        if (this.values == null) {
            return;
        }
        int length = ((StackLinearChartData) this.chartData).xPercentage.length;
        int size = this.lines.size();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            float f3 = ((StackLinearChartData) this.chartData).xPercentage[i4];
            if (f3 >= f && i3 == -1) {
                i3 = i4;
            }
            if (f3 <= f2) {
                i2 = i4;
            }
        }
        if (i2 < i3) {
            i3 = i2;
        }
        if (!z && this.lastEndIndex == i2 && this.lastStartIndex == i3) {
            return;
        }
        this.lastEndIndex = i2;
        this.lastStartIndex = i3;
        this.isEmpty = true;
        this.sum = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            this.values[i5] = 0.0f;
        }
        while (i3 <= i2) {
            for (int i6 = 0; i6 < size; i6++) {
                float[] fArr = this.values;
                fArr[i6] = fArr[i6] + ((ChartData.Line) ((StackLinearChartData) this.chartData).lines.get(i6)).y[i3];
                this.sum += ((ChartData.Line) ((StackLinearChartData) this.chartData).lines.get(i6)).y[i3];
                if (this.isEmpty && ((PieChartViewData) this.lines.get(i6)).enabled && ((ChartData.Line) ((StackLinearChartData) this.chartData).lines.get(i6)).y[i3] > 0) {
                    this.isEmpty = false;
                }
            }
            i3++;
        }
        if (z) {
            while (i < size) {
                if (this.sum == 0.0f) {
                    ((PieChartViewData) this.lines.get(i)).drawingPart = 0.0f;
                } else {
                    ((PieChartViewData) this.lines.get(i)).drawingPart = this.values[i] / this.sum;
                }
                i++;
            }
            return;
        }
        while (i < size) {
            final PieChartViewData pieChartViewData = (PieChartViewData) this.lines.get(i);
            Animator animator = pieChartViewData.animator;
            if (animator != null) {
                animator.cancel();
            }
            float f4 = this.sum;
            ValueAnimator valueAnimatorCreateAnimator = createAnimator(pieChartViewData.drawingPart, f4 == 0.0f ? 0.0f : this.values[i] / f4, new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$updateCharValues$0(pieChartViewData, valueAnimator);
                }
            });
            pieChartViewData.animator = valueAnimatorCreateAnimator;
            valueAnimatorCreateAnimator.start();
            i++;
        }
    }

    public void lambda$updateCharValues$0(PieChartViewData pieChartViewData, ValueAnimator valueAnimator) {
        pieChartViewData.drawingPart = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override
    public void onPickerJumpTo(float f, float f2, boolean z) {
        if (this.chartData == null) {
            return;
        }
        if (z) {
            updateCharValues(f, f2, false);
        } else {
            updateIndexes();
            invalidate();
        }
    }

    @Override
    public void fillTransitionParams(TransitionParams transitionParams) {
        drawChart(null);
        float f = 0.0f;
        int i = 0;
        while (true) {
            float[] fArr = this.darawingValuesPercentage;
            if (i >= fArr.length) {
                return;
            }
            f += fArr[i];
            transitionParams.angle[i] = (360.0f * f) - 180.0f;
            i++;
        }
    }
}
