package org.telegram.ui.Charts;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LegendSignatureView;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.PieLegendView;
import org.telegram.ui.Charts.view_data.StackLinearViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;
import org.telegram.ui.Stars.SuperRipple$$ExternalSyntheticLambda7;

public final class PieChartView extends StackLinearChartView {
    public float MAX_TEXT_SIZE;
    public float MIN_TEXT_SIZE;
    public int currentSelection;
    public float[] darawingValuesPercentage;
    public float emptyDataAlpha;
    public boolean isEmpty;
    public int lastEndIndex;
    public int lastStartIndex;
    public final String[] lookupTable;
    public int oldW;
    public PieLegendView pieLegendView;
    public final RectF rectF;
    public float sum;
    public final TextPaint textPaint;
    public float[] values;

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
            this.lookupTable[i] = RendererCapabilities.CC.m(i, "%");
        }
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.canCaptureChartSelection = true;
    }

    @Override
    public final LegendSignatureView createLegendView() {
        PieLegendView pieLegendView = new PieLegendView(getContext());
        this.pieLegendView = pieLegendView;
        return pieLegendView;
    }

    @Override
    public final LineViewData createLineViewData(ChartData.Line line) {
        return new PieChartViewData(line);
    }

    @Override
    public final void drawBottomLine(Canvas canvas) {
    }

    @Override
    public final void drawBottomSignature(Canvas canvas) {
    }

    @Override
    public final void drawChart(Canvas canvas) {
        int i;
        FastOutSlowInInterpolator fastOutSlowInInterpolator;
        float f;
        float f2;
        int i2;
        int i3;
        float f3;
        if (this.chartData == null) {
            return;
        }
        if (canvas != null) {
            canvas.save();
        }
        if (this.transitionMode == 1) {
            float f4 = this.transitionParams.progress;
            i = (int) (f4 * f4 * 255.0f);
        } else {
            i = 255;
        }
        if (this.isEmpty) {
            float f5 = this.emptyDataAlpha;
            if (f5 != 0.0f) {
                float f6 = f5 - 0.12f;
                this.emptyDataAlpha = f6;
                if (f6 < 0.0f) {
                    this.emptyDataAlpha = 0.0f;
                }
                invalidate();
            }
        } else {
            float f7 = this.emptyDataAlpha;
            if (f7 != 1.0f) {
                float f8 = f7 + 0.12f;
                this.emptyDataAlpha = f8;
                if (f8 > 1.0f) {
                    this.emptyDataAlpha = 1.0f;
                }
                invalidate();
            }
        }
        float f9 = this.emptyDataAlpha;
        int i4 = (int) (i * f9);
        float f10 = (f9 * 0.6f) + 0.4f;
        RectF rectF = this.chartArea;
        if (canvas != null) {
            canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
        }
        float fHeight = rectF.width() > rectF.height() ? rectF.height() : rectF.width();
        RectF rectF2 = this.rectF;
        float f11 = (int) (fHeight * 0.45f);
        rectF2.set(rectF.centerX() - f11, (rectF.centerY() + AndroidUtilities.dp(16.0f)) - f11, rectF.centerX() + f11, rectF.centerY() + AndroidUtilities.dp(16.0f) + f11);
        ArrayList arrayList = this.lines;
        int size = arrayList.size();
        float f12 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            f12 += ((PieChartViewData) arrayList.get(i5)).drawingPart * ((PieChartViewData) arrayList.get(i5)).alpha;
        }
        if (f12 == 0.0f) {
            if (canvas != null) {
                canvas.restore();
                return;
            }
            return;
        }
        int i6 = 0;
        float f13 = -90.0f;
        while (true) {
            fastOutSlowInInterpolator = BaseChartView.INTERPOLATOR;
            f = 2.0f;
            if (i6 >= size) {
                break;
            }
            if (((PieChartViewData) arrayList.get(i6)).alpha > 0.0f || ((PieChartViewData) arrayList.get(i6)).enabled) {
                ((PieChartViewData) arrayList.get(i6)).paint.setAlpha(i4);
                float f14 = (((PieChartViewData) arrayList.get(i6)).drawingPart / f12) * ((PieChartViewData) arrayList.get(i6)).alpha;
                this.darawingValuesPercentage[i6] = f14;
                if (f14 == 0.0f) {
                    i3 = i6;
                } else {
                    if (canvas != null) {
                        canvas.save();
                    }
                    double dM = zzir.m(f14, 2.0f, 360.0f, f13);
                    if (((PieChartViewData) arrayList.get(i6)).selectionA > 0.0f) {
                        float interpolation = fastOutSlowInInterpolator.getInterpolation(((PieChartViewData) arrayList.get(i6)).selectionA);
                        if (canvas != null) {
                            double d = interpolation;
                            canvas.translate((float) (Math.cos(Math.toRadians(dM)) * ((double) AndroidUtilities.dp(8.0f)) * d), (float) (Math.sin(Math.toRadians(dM)) * ((double) AndroidUtilities.dp(8.0f)) * d));
                        }
                    }
                    ((PieChartViewData) arrayList.get(i6)).paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    ((PieChartViewData) arrayList.get(i6)).paint.setStrokeWidth(1.0f);
                    ((PieChartViewData) arrayList.get(i6)).paint.setAntiAlias(!BaseChartView.USE_LINES);
                    if (canvas == null || this.transitionMode == 1) {
                        i3 = i6;
                        f3 = f13;
                    } else {
                        Paint paint = ((PieChartViewData) arrayList.get(i6)).paint;
                        i3 = i6;
                        f3 = f13;
                        canvas.drawArc(rectF2, f3, f14 * 360.0f, true, paint);
                        ((PieChartViewData) arrayList.get(i3)).paint.setStyle(Paint.Style.STROKE);
                        canvas.restore();
                    }
                    ((PieChartViewData) arrayList.get(i3)).paint.setAlpha(255);
                    f13 = (f14 * 360.0f) + f3;
                }
            } else {
                i3 = i6;
            }
            i6 = i3 + 1;
            i4 = i4;
        }
        int i7 = i4;
        if (canvas != null) {
            float f15 = -90.0f;
            int i8 = 0;
            while (i8 < size) {
                if (((PieChartViewData) arrayList.get(i8)).alpha > 0.0f || ((PieChartViewData) arrayList.get(i8)).enabled) {
                    float f16 = (((PieChartViewData) arrayList.get(i8)).drawingPart * ((PieChartViewData) arrayList.get(i8)).alpha) / f12;
                    canvas.save();
                    double dM2 = zzir.m(f16, f, 360.0f, f15);
                    if (((PieChartViewData) arrayList.get(i8)).selectionA > 0.0f) {
                        f2 = 2.0f;
                        double interpolation2 = fastOutSlowInInterpolator.getInterpolation(((PieChartViewData) arrayList.get(i8)).selectionA);
                        canvas.translate((float) (Math.cos(Math.toRadians(dM2)) * ((double) AndroidUtilities.dp(8.0f)) * interpolation2), (float) (Math.sin(Math.toRadians(dM2)) * ((double) AndroidUtilities.dp(8.0f)) * interpolation2));
                    } else {
                        f2 = 2.0f;
                    }
                    int i9 = (int) (100.0f * f16);
                    if (f16 < 0.02f || i9 <= 0 || i9 > 100) {
                        i2 = i7;
                    } else {
                        float fSqrt = (float) (Math.sqrt(1.0f - f16) * ((double) (rectF2.width() * 0.42f)));
                        TextPaint textPaint = this.textPaint;
                        textPaint.setTextSize((this.MAX_TEXT_SIZE * f16) + this.MIN_TEXT_SIZE);
                        i2 = i7;
                        textPaint.setAlpha((int) (i2 * ((PieChartViewData) arrayList.get(i8)).alpha));
                        double d2 = fSqrt;
                        canvas.drawText(this.lookupTable[i9], (float) ((Math.cos(Math.toRadians(dM2)) * d2) + ((double) rectF2.centerX())), ((float) ((Math.sin(Math.toRadians(dM2)) * d2) + ((double) rectF2.centerY()))) - ((textPaint.ascent() + textPaint.descent()) / f2), textPaint);
                    }
                    canvas.restore();
                    ((PieChartViewData) arrayList.get(i8)).paint.setAlpha(255);
                    f15 = (f16 * 360.0f) + f15;
                } else {
                    rectF2 = rectF2;
                    fastOutSlowInInterpolator = fastOutSlowInInterpolator;
                    i2 = i7;
                }
                i8++;
                i7 = i2;
                rectF2 = rectF2;
                fastOutSlowInInterpolator = fastOutSlowInInterpolator;
                f = 2.0f;
            }
            canvas.restore();
        }
    }

    @Override
    public final void drawHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
    }

    @Override
    public final void drawPickerChart(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        PieChartView pieChartView = this;
        ChartData chartData = pieChartView.chartData;
        if (chartData != null) {
            int length = ((StackLinearChartData) chartData).xPercentage.length;
            ArrayList arrayList = pieChartView.lines;
            int size = arrayList.size();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((LineViewData) arrayList.get(i2)).linesPathBottomSize = 0;
            }
            float length2 = (1.0f / ((StackLinearChartData) pieChartView.chartData).xPercentage.length) * pieChartView.pickerWidth;
            int i3 = 0;
            while (i3 < length) {
                float fM = DiffUtil.m(pieChartView.pickerWidth, length2, ((StackLinearChartData) pieChartView.chartData).xPercentage[i3], length2 / 2.0f);
                int i4 = 1;
                int i5 = 0;
                float f4 = 0.0f;
                int i6 = 0;
                boolean z = true;
                while (i5 < size) {
                    LineViewData lineViewData = (LineViewData) arrayList.get(i5);
                    boolean z2 = lineViewData.enabled;
                    if (z2 || lineViewData.alpha != 0.0f) {
                        i = i3;
                        float f5 = lineViewData.line.y[i] * lineViewData.alpha;
                        f4 += f5;
                        if (f5 > 0.0f) {
                            i6++;
                            if (z2) {
                                z = false;
                            }
                        }
                    } else {
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                }
                int i7 = i3;
                int i8 = 0;
                float f6 = 0.0f;
                while (i8 < size) {
                    LineViewData lineViewData2 = (LineViewData) arrayList.get(i8);
                    if (lineViewData2.enabled || lineViewData2.alpha != 0.0f) {
                        long[] jArr = lineViewData2.line.y;
                        if (i6 == i4) {
                            if (jArr[i7] == 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = lineViewData2.alpha;
                            }
                        } else if (f4 == 0.0f) {
                            f3 = 0.0f;
                        } else {
                            if (z) {
                                float f7 = jArr[i7] / f4;
                                f2 = lineViewData2.alpha;
                                f = f7 * f2;
                            } else {
                                f = jArr[i7] / f4;
                                f2 = lineViewData2.alpha;
                            }
                            f3 = f * f2;
                        }
                        float f8 = pieChartView.pikerHeight;
                        float f9 = f3 * f8;
                        int i9 = lineViewData2.linesPathBottomSize;
                        int i10 = i9 + 1;
                        lineViewData2.linesPathBottomSize = i10;
                        float[] fArr = lineViewData2.linesPath;
                        fArr[i9] = fM;
                        int i11 = i9 + 2;
                        lineViewData2.linesPathBottomSize = i11;
                        fArr[i10] = (f8 - f9) - f6;
                        int i12 = i9 + 3;
                        lineViewData2.linesPathBottomSize = i12;
                        fArr[i11] = fM;
                        lineViewData2.linesPathBottomSize = i9 + 4;
                        fArr[i12] = f8 - f6;
                        f6 += f9;
                    }
                    i8++;
                    i4 = 1;
                    pieChartView = this;
                }
                i3 = i7 + 1;
                pieChartView = this;
            }
            for (int i13 = 0; i13 < size; i13++) {
                LineViewData lineViewData3 = (LineViewData) arrayList.get(i13);
                lineViewData3.paint.setStrokeWidth(length2);
                Paint paint = lineViewData3.paint;
                paint.setAlpha(255);
                paint.setAntiAlias(false);
                canvas.drawLines(lineViewData3.linesPath, 0, lineViewData3.linesPathBottomSize, paint);
            }
        }
    }

    @Override
    public final void drawSelection(Canvas canvas) {
    }

    @Override
    public final void drawSignaturesToHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
    }

    @Override
    public final void fillTransitionParams(TransitionParams transitionParams) {
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

    @Override
    public final void onActionUp() {
        this.currentSelection = -1;
        this.pieLegendView.setVisibility(8);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.chartData != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.lines;
                if (i >= arrayList.size()) {
                    break;
                }
                if (i == this.currentSelection) {
                    if (((PieChartViewData) arrayList.get(i)).selectionA < 1.0f) {
                        ((PieChartViewData) arrayList.get(i)).selectionA += 0.1f;
                        if (((PieChartViewData) arrayList.get(i)).selectionA > 1.0f) {
                            ((PieChartViewData) arrayList.get(i)).selectionA = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((PieChartViewData) arrayList.get(i)).selectionA > 0.0f) {
                    ((PieChartViewData) arrayList.get(i)).selectionA -= 0.1f;
                    if (((PieChartViewData) arrayList.get(i)).selectionA < 0.0f) {
                        ((PieChartViewData) arrayList.get(i)).selectionA = 0.0f;
                    }
                    invalidate();
                }
                i++;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != this.oldW) {
            this.oldW = getMeasuredWidth();
            RectF rectF = this.chartArea;
            int iHeight = (int) ((rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f);
            this.MIN_TEXT_SIZE = iHeight / 13;
            this.MAX_TEXT_SIZE = iHeight / 7;
        }
    }

    @Override
    public final void onPickerDataChanged(boolean z, boolean z2, boolean z3) {
        super.onPickerDataChanged(z, z2, z3);
        ChartData chartData = this.chartData;
        if (chartData == null || ((StackLinearChartData) chartData).xPercentage == null) {
            return;
        }
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        updateCharValues(chartPickerDelegate.pickerStart, chartPickerDelegate.pickerEnd, z2);
    }

    @Override
    public final void onPickerJumpTo(float f, float f2, boolean z) {
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
    public final void selectXOnChart(int i, int i2) {
        ArrayList arrayList;
        if (this.chartData == null || this.isEmpty) {
            return;
        }
        RectF rectF = this.chartArea;
        float degrees = (float) (Math.toDegrees(Math.atan2((rectF.centerY() + AndroidUtilities.dp(16.0f)) - i2, rectF.centerX() - i)) - 90.0d);
        float f = 0.0f;
        if (degrees < 0.0f) {
            degrees = (float) (((double) degrees) + 360.0d);
        }
        float f2 = degrees / 360.0f;
        int i3 = 0;
        float f3 = 0.0f;
        while (true) {
            arrayList = this.lines;
            if (i3 >= arrayList.size()) {
                i3 = -1;
                f3 = 0.0f;
                break;
            }
            if (((PieChartViewData) arrayList.get(i3)).enabled || ((PieChartViewData) arrayList.get(i3)).alpha != 0.0f) {
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
            LineViewData lineViewData = (LineViewData) arrayList.get(i3);
            PieLegendView pieLegendView = this.pieLegendView;
            String str = lineViewData.line.name;
            int i4 = (int) this.values[this.currentSelection];
            int i5 = lineViewData.lineColor;
            pieLegendView.signature.setText(str);
            TextView textView = pieLegendView.value;
            textView.setText(Integer.toString(i4));
            textView.setTextColor(i5);
            this.pieLegendView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            RectF rectF2 = this.rectF;
            double dWidth = rectF2.width() / 2.0f;
            double d = (f * 360.0f) - 90.0f;
            double d2 = (f3 * 360.0f) - 90.0f;
            int iMin = (int) Math.min((Math.cos(Math.toRadians(d)) * dWidth) + ((double) rectF2.centerX()), (Math.cos(Math.toRadians(d2)) * dWidth) + ((double) rectF2.centerX()));
            int measuredWidth = iMin >= 0 ? iMin : 0;
            if (this.pieLegendView.getMeasuredWidth() + measuredWidth > getMeasuredWidth() - AndroidUtilities.dp(16.0f)) {
                measuredWidth -= (this.pieLegendView.getMeasuredWidth() + measuredWidth) - (getMeasuredWidth() - AndroidUtilities.dp(16.0f));
            }
            int iMin2 = ((int) Math.min(rectF2.centerY(), (int) Math.min((Math.sin(Math.toRadians(d2)) * dWidth) + ((double) rectF2.centerY()), (Math.sin(Math.toRadians(d)) * dWidth) + ((double) rectF2.centerY())))) - AndroidUtilities.dp(50.0f);
            this.pieLegendView.setTranslationX(measuredWidth);
            this.pieLegendView.setTranslationY(iMin2);
            AndroidUtilities.vibrateCursor(this);
        }
        moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - BaseChartView.HORIZONTAL_PADDING);
    }

    @Override
    public final boolean setData(ChartData chartData) {
        StackLinearChartData stackLinearChartData = (StackLinearChartData) chartData;
        boolean data = super.setData(stackLinearChartData);
        if (stackLinearChartData != null) {
            this.values = new float[stackLinearChartData.lines.size()];
            this.darawingValuesPercentage = new float[stackLinearChartData.lines.size()];
            onPickerDataChanged(false, true, false);
        }
        return data;
    }

    public final void updateCharValues(float f, float f2, boolean z) {
        if (this.values == null) {
            return;
        }
        int length = ((StackLinearChartData) this.chartData).xPercentage.length;
        ArrayList arrayList = this.lines;
        int size = arrayList.size();
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
                if (this.isEmpty && ((PieChartViewData) arrayList.get(i6)).enabled && ((ChartData.Line) ((StackLinearChartData) this.chartData).lines.get(i6)).y[i3] > 0) {
                    this.isEmpty = false;
                }
            }
            i3++;
        }
        if (z) {
            while (i < size) {
                if (this.sum == 0.0f) {
                    ((PieChartViewData) arrayList.get(i)).drawingPart = 0.0f;
                } else {
                    ((PieChartViewData) arrayList.get(i)).drawingPart = this.values[i] / this.sum;
                }
                i++;
            }
            return;
        }
        while (i < size) {
            PieChartViewData pieChartViewData = (PieChartViewData) arrayList.get(i);
            ValueAnimator valueAnimator = pieChartViewData.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f4 = this.sum;
            ValueAnimator valueAnimatorCreateAnimator = BaseChartView.createAnimator(pieChartViewData.drawingPart, f4 == 0.0f ? 0.0f : this.values[i] / f4, new SuperRipple$$ExternalSyntheticLambda7(4, this, pieChartViewData));
            pieChartViewData.animator = valueAnimatorCreateAnimator;
            valueAnimatorCreateAnimator.start();
            i++;
        }
    }

    @Override
    public final void updatePicker(ChartData chartData, long j) {
        int length = chartData.x.length;
        long j2 = j - (j % 86400000);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (j2 >= chartData.x[i2]) {
                i = i2;
            }
        }
        float length2 = chartData.xPercentage.length < 2 ? 0.5f : 1.0f / chartData.x.length;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        if (i == 0) {
            chartPickerDelegate.pickerStart = 0.0f;
            chartPickerDelegate.pickerEnd = length2;
            return;
        }
        if (i >= chartData.x.length - 1) {
            chartPickerDelegate.pickerStart = 1.0f - length2;
            chartPickerDelegate.pickerEnd = 1.0f;
            return;
        }
        float f = i * length2;
        chartPickerDelegate.pickerStart = f;
        float f2 = f + length2;
        chartPickerDelegate.pickerEnd = f2;
        if (f2 > 1.0f) {
            chartPickerDelegate.pickerEnd = 1.0f;
        }
        onPickerDataChanged(true, true, false);
    }

    @Override
    public final StackLinearViewData createLineViewData(ChartData.Line line) {
        return new PieChartViewData(line);
    }
}
