package org.telegram.ui.Charts;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackBarChartData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.StackBarViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public class StackBarChartView extends BaseChartView {
    private long[] yMaxPoints;

    @Override
    protected void drawSelection(Canvas canvas) {
    }

    @Override
    protected float getMinDistance() {
        return 0.1f;
    }

    public StackBarChartView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.superDraw = true;
        this.useAlphaSignature = true;
    }

    @Override
    public StackBarViewData createLineViewData(ChartData.Line line) {
        return new StackBarViewData(line, this.resourcesProvider);
    }

    @Override
    protected void drawChart(Canvas canvas) {
        float f;
        float f2;
        float f3;
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        float f4 = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f5 = chartPickerDelegate.pickerEnd;
        float f6 = chartPickerDelegate.pickerStart;
        float f7 = f4 / (f5 - f6);
        float f8 = BaseChartView.HORIZONTAL_PADDING;
        float f9 = (f6 * f7) - f8;
        float[] fArr = ((StackBarChartData) chartData).xPercentage;
        if (fArr.length < 2) {
            f = 1.0f;
            f2 = 1.0f;
        } else {
            float f10 = fArr[1];
            float f11 = f10 * f7;
            f = f10 * (f7 - f11);
            f2 = f11;
        }
        int i = ((int) (f8 / f2)) + 1;
        int iMax = Math.max(0, (this.startXIndex - i) - 2);
        int iMin = Math.min(((StackBarChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i + 2);
        for (int i2 = 0; i2 < this.lines.size(); i2++) {
            ((LineViewData) this.lines.get(i2)).linesPathBottomSize = 0;
        }
        canvas.save();
        int i3 = this.transitionMode;
        float f12 = 2.0f;
        float f13 = 0.0f;
        if (i3 == 2) {
            this.postTransition = true;
            this.selectionA = 0.0f;
            TransitionParams transitionParams = this.transitionParams;
            float f14 = transitionParams.progress;
            f3 = 1.0f - f14;
            canvas.scale((f14 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
        } else if (i3 == 1) {
            TransitionParams transitionParams2 = this.transitionParams;
            f3 = transitionParams2.progress;
            canvas.scale(f3, 1.0f, transitionParams2.pX, transitionParams2.pY);
        } else {
            f3 = i3 == 3 ? this.transitionParams.progress : 1.0f;
        }
        boolean z = this.selectedIndex >= 0 && this.legendShowing;
        while (iMax <= iMin) {
            if (this.selectedIndex != iMax || !z) {
                int i4 = 0;
                float f15 = 0.0f;
                while (i4 < this.lines.size()) {
                    LineViewData lineViewData = (LineViewData) this.lines.get(i4);
                    if (lineViewData.enabled || lineViewData.alpha != f13) {
                        long[] jArr = lineViewData.line.y;
                        float f16 = ((f2 / f12) + (((StackBarChartData) this.chartData).xPercentage[iMax] * (f7 - f2))) - f9;
                        float measuredHeight = (jArr[iMax] / this.currentMaxHeight) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) * lineViewData.alpha;
                        float measuredHeight2 = (getMeasuredHeight() - this.chartBottom) - measuredHeight;
                        float[] fArr2 = lineViewData.linesPath;
                        int i5 = lineViewData.linesPathBottomSize;
                        int i6 = i5 + 1;
                        lineViewData.linesPathBottomSize = i6;
                        fArr2[i5] = f16;
                        int i7 = i5 + 2;
                        lineViewData.linesPathBottomSize = i7;
                        fArr2[i6] = measuredHeight2 - f15;
                        int i8 = i5 + 3;
                        lineViewData.linesPathBottomSize = i8;
                        fArr2[i7] = f16;
                        lineViewData.linesPathBottomSize = i5 + 4;
                        fArr2[i8] = (getMeasuredHeight() - this.chartBottom) - f15;
                        f15 += measuredHeight;
                    }
                    i4++;
                    f3 = f3;
                    iMin = iMin;
                    f9 = f9;
                    f12 = 2.0f;
                    f13 = 0.0f;
                }
            }
            iMax++;
            f3 = f3;
            iMin = iMin;
            f9 = f9;
            f12 = 2.0f;
            f13 = 0.0f;
        }
        float f17 = f9;
        float f18 = f3;
        for (int i9 = 0; i9 < this.lines.size(); i9++) {
            StackBarViewData stackBarViewData = (StackBarViewData) this.lines.get(i9);
            Paint paint = (z || this.postTransition) ? stackBarViewData.unselectedPaint : stackBarViewData.paint;
            if (z) {
                stackBarViewData.unselectedPaint.setColor(ColorUtils.blendARGB(stackBarViewData.lineColor, stackBarViewData.blendColor, this.selectionA));
            }
            if (this.postTransition) {
                stackBarViewData.unselectedPaint.setColor(ColorUtils.blendARGB(stackBarViewData.lineColor, stackBarViewData.blendColor, 1.0f));
            }
            paint.setAlpha((int) (f18 * 255.0f));
            paint.setStrokeWidth(f);
            canvas.drawLines(stackBarViewData.linesPath, 0, stackBarViewData.linesPathBottomSize, paint);
        }
        if (z) {
            float f19 = 0.0f;
            for (int i10 = 0; i10 < this.lines.size(); i10++) {
                LineViewData lineViewData2 = (LineViewData) this.lines.get(i10);
                if (lineViewData2.enabled || lineViewData2.alpha != 0.0f) {
                    long[] jArr2 = lineViewData2.line.y;
                    float[] fArr3 = ((StackBarChartData) this.chartData).xPercentage;
                    int i11 = this.selectedIndex;
                    float f20 = ((f2 / 2.0f) + (fArr3[i11] * (f7 - f2))) - f17;
                    float measuredHeight3 = (jArr2[i11] / this.currentMaxHeight) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) * lineViewData2.alpha;
                    float measuredHeight4 = (getMeasuredHeight() - this.chartBottom) - measuredHeight3;
                    lineViewData2.paint.setStrokeWidth(f);
                    lineViewData2.paint.setAlpha((int) (f18 * 255.0f));
                    canvas.drawLine(f20, measuredHeight4 - f19, f20, (getMeasuredHeight() - this.chartBottom) - f19, lineViewData2.paint);
                    f19 += measuredHeight3;
                }
            }
        }
        canvas.restore();
    }

    @Override
    protected void selectXOnChart(int i, int i2) {
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        int i3 = this.selectedIndex;
        float f = this.chartFullWidth;
        float f2 = (this.pickerDelegate.pickerStart * f) - BaseChartView.HORIZONTAL_PADDING;
        StackBarChartData stackBarChartData = (StackBarChartData) chartData;
        float[] fArr = stackBarChartData.xPercentage;
        float f3 = (i + f2) / (f - (fArr.length < 2 ? 1.0f : fArr[1] * f));
        this.selectedCoordinate = f3;
        if (f3 < 0.0f) {
            this.selectedIndex = 0;
            this.selectedCoordinate = 0.0f;
        } else if (f3 > 1.0f) {
            this.selectedIndex = stackBarChartData.x.length - 1;
            this.selectedCoordinate = 1.0f;
        } else {
            int iFindIndex = stackBarChartData.findIndex(this.startXIndex, this.endXIndex, f3);
            this.selectedIndex = iFindIndex;
            int i4 = this.endXIndex;
            if (iFindIndex > i4) {
                this.selectedIndex = i4;
            }
            int i5 = this.selectedIndex;
            int i6 = this.startXIndex;
            if (i5 < i6) {
                this.selectedIndex = i6;
            }
        }
        if (i3 != this.selectedIndex) {
            this.legendShowing = true;
            animateLegend(true);
            moveLegend(f2);
            BaseChartView.DateSelectionListener dateSelectionListener = this.dateSelectionListener;
            if (dateSelectionListener != null) {
                dateSelectionListener.onDateSelected(getSelectedDate());
            }
            invalidate();
            runSmoothHaptic();
        }
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        float f;
        ChartData chartData = this.chartData;
        if (chartData != null) {
            int length = ((StackBarChartData) chartData).xPercentage.length;
            int size = this.lines.size();
            for (int i = 0; i < this.lines.size(); i++) {
                ((LineViewData) this.lines.get(i)).linesPathBottomSize = 0;
            }
            int iMax = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.yMaxPoints;
            if (jArr == null || jArr.length < size) {
                this.yMaxPoints = new long[size];
            }
            for (int i2 = 0; i2 < length; i2++) {
                float f2 = ((StackBarChartData) this.chartData).xPercentage[i2] * this.pickerWidth;
                int i3 = 0;
                while (true) {
                    f = 0.0f;
                    if (i3 >= size) {
                        break;
                    }
                    LineViewData lineViewData = (LineViewData) this.lines.get(i3);
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        long j = lineViewData.line.y[i2];
                        long[] jArr2 = this.yMaxPoints;
                        if (j > jArr2[i3]) {
                            jArr2[i3] = j;
                        }
                    }
                    i3++;
                }
                if (i2 % iMax == 0) {
                    int i4 = 0;
                    float f3 = 0.0f;
                    while (i4 < size) {
                        LineViewData lineViewData2 = (LineViewData) this.lines.get(i4);
                        if (lineViewData2.enabled || lineViewData2.alpha != f) {
                            float f4 = BaseChartView.ANIMATE_PICKER_SIZES ? this.pickerMaxHeight : ((StackBarChartData) this.chartData).maxValue;
                            long[] jArr3 = this.yMaxPoints;
                            float f5 = (jArr3[i4] / f4) * lineViewData2.alpha;
                            float f6 = this.pikerHeight;
                            float f7 = f5 * f6;
                            float[] fArr = lineViewData2.linesPath;
                            int i5 = lineViewData2.linesPathBottomSize;
                            int i6 = i5 + 1;
                            lineViewData2.linesPathBottomSize = i6;
                            fArr[i5] = f2;
                            int i7 = i5 + 2;
                            lineViewData2.linesPathBottomSize = i7;
                            fArr[i6] = (f6 - f7) - f3;
                            int i8 = i5 + 3;
                            lineViewData2.linesPathBottomSize = i8;
                            fArr[i7] = f2;
                            lineViewData2.linesPathBottomSize = i5 + 4;
                            fArr[i8] = f6 - f3;
                            f3 += f7;
                            jArr3[i4] = 0;
                        }
                        i4++;
                        f = 0.0f;
                    }
                }
            }
            float[] fArr2 = ((StackBarChartData) this.chartData).xPercentage;
            float f8 = fArr2.length < 2 ? 1.0f : fArr2[1] * this.pickerWidth;
            for (int i9 = 0; i9 < size; i9++) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(i9);
                lineViewData3.paint.setStrokeWidth(iMax * f8);
                lineViewData3.paint.setAlpha(255);
                canvas.drawLines(lineViewData3.linesPath, 0, lineViewData3.linesPathBottomSize, lineViewData3.paint);
            }
        }
    }

    @Override
    public void onCheckChanged() {
        int length = ((ChartData.Line) ((StackBarChartData) this.chartData).lines.get(0)).y.length;
        int size = ((StackBarChartData) this.chartData).lines.size();
        ((StackBarChartData) this.chartData).ySum = new long[length];
        for (int i = 0; i < length; i++) {
            ((StackBarChartData) this.chartData).ySum[i] = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (((StackBarViewData) this.lines.get(i2)).enabled) {
                    StackBarChartData stackBarChartData = (StackBarChartData) this.chartData;
                    long[] jArr = stackBarChartData.ySum;
                    jArr[i] = jArr[i] + ((ChartData.Line) stackBarChartData.lines.get(i2)).y[i];
                }
            }
        }
        StackBarChartData stackBarChartData2 = (StackBarChartData) this.chartData;
        stackBarChartData2.ySumSegmentTree = new SegmentTree(stackBarChartData2.ySum);
        super.onCheckChanged();
    }

    @Override
    public long findMaxValue(int i, int i2) {
        return ((StackBarChartData) this.chartData).findMax(i, i2);
    }

    @Override
    protected void updatePickerMinMaxHeight() {
        if (BaseChartView.ANIMATE_PICKER_SIZES) {
            int length = ((StackBarChartData) this.chartData).x.length;
            int size = this.lines.size();
            long j = 0;
            for (int i = 0; i < length; i++) {
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    StackBarViewData stackBarViewData = (StackBarViewData) this.lines.get(i2);
                    if (stackBarViewData.enabled) {
                        j2 += stackBarViewData.line.y[i];
                    }
                }
                if (j2 > j) {
                    j = j2;
                }
            }
            if (j > 0) {
                float f = j;
                if (f != this.animatedToPickerMaxHeight) {
                    this.animatedToPickerMaxHeight = f;
                    Animator animator = this.pickerAnimator;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator valueAnimatorCreateAnimator = createAnimator(this.pickerMaxHeight, this.animatedToPickerMaxHeight, new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            StackBarChartView.this.pickerMaxHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            StackBarChartView stackBarChartView = StackBarChartView.this;
                            stackBarChartView.invalidatePickerChart = true;
                            stackBarChartView.invalidate();
                        }
                    });
                    this.pickerAnimator = valueAnimatorCreateAnimator;
                    valueAnimatorCreateAnimator.start();
                }
            }
        }
    }

    @Override
    protected void initPickerMaxHeight() {
        super.initPickerMaxHeight();
        this.pickerMaxHeight = 0.0f;
        int length = ((StackBarChartData) this.chartData).x.length;
        int size = this.lines.size();
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                StackBarViewData stackBarViewData = (StackBarViewData) this.lines.get(i2);
                if (stackBarViewData.enabled) {
                    j += stackBarViewData.line.y[i];
                }
            }
            float f = j;
            if (f > this.pickerMaxHeight) {
                this.pickerMaxHeight = f;
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        tick();
        drawChart(canvas);
        drawBottomLine(canvas);
        this.tmpN = this.horizontalLines.size();
        int i = 0;
        while (true) {
            this.tmpI = i;
            int i2 = this.tmpI;
            if (i2 < this.tmpN) {
                drawHorizontalLines(canvas, (ChartHorizontalLinesData) this.horizontalLines.get(i2));
                drawSignaturesToHorizontalLines(canvas, (ChartHorizontalLinesData) this.horizontalLines.get(this.tmpI));
                i = this.tmpI + 1;
            } else {
                drawBottomSignature(canvas);
                drawPicker(canvas);
                drawSelection(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }
}
