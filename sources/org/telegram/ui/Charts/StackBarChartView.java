package org.telegram.ui.Charts;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackBarChartData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.StackBarViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public class StackBarChartView extends BaseChartView<StackBarChartData, StackBarViewData> {
    private long[] yMaxPoints;

    @Override
    public void drawSelection(Canvas canvas) {
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
        int i;
        float f4;
        T t = this.chartData;
        if (t == 0) {
            return;
        }
        float f5 = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f6 = chartPickerDelegate.pickerEnd;
        float f7 = chartPickerDelegate.pickerStart;
        float f8 = f5 / (f6 - f7);
        float f9 = BaseChartView.HORIZONTAL_PADDING;
        float f10 = (f7 * f8) - f9;
        float[] fArr = ((StackBarChartData) t).xPercentage;
        if (fArr.length < 2) {
            f = 1.0f;
            f2 = 1.0f;
        } else {
            float f11 = fArr[1];
            float f12 = f11 * f8;
            f = f11 * (f8 - f12);
            f2 = f12;
        }
        int i2 = ((int) (f9 / f2)) + 1;
        int max = Math.max(0, (this.startXIndex - i2) - 2);
        int min = Math.min(((StackBarChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i2 + 2);
        for (int i3 = 0; i3 < this.lines.size(); i3++) {
            ((LineViewData) this.lines.get(i3)).linesPathBottomSize = 0;
        }
        canvas.save();
        int i4 = this.transitionMode;
        float f13 = 2.0f;
        float f14 = 0.0f;
        if (i4 == 2) {
            this.postTransition = true;
            this.selectionA = 0.0f;
            TransitionParams transitionParams = this.transitionParams;
            float f15 = transitionParams.progress;
            f3 = 1.0f - f15;
            canvas.scale((f15 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
        } else if (i4 == 1) {
            TransitionParams transitionParams2 = this.transitionParams;
            f3 = transitionParams2.progress;
            canvas.scale(f3, 1.0f, transitionParams2.pX, transitionParams2.pY);
        } else {
            f3 = i4 == 3 ? this.transitionParams.progress : 1.0f;
        }
        boolean z = this.selectedIndex >= 0 && this.legendShowing;
        while (max <= min) {
            if (this.selectedIndex != max || !z) {
                int i5 = 0;
                float f16 = 0.0f;
                while (i5 < this.lines.size()) {
                    LineViewData lineViewData = (LineViewData) this.lines.get(i5);
                    if (lineViewData.enabled || lineViewData.alpha != f14) {
                        long[] jArr = lineViewData.line.y;
                        float f17 = ((f2 / f13) + (((StackBarChartData) this.chartData).xPercentage[max] * (f8 - f2))) - f10;
                        f4 = f3;
                        float measuredHeight = (((float) jArr[max]) / this.currentMaxHeight) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) * lineViewData.alpha;
                        float[] fArr2 = lineViewData.linesPath;
                        int i6 = lineViewData.linesPathBottomSize;
                        fArr2[i6] = f17;
                        fArr2[i6 + 1] = ((getMeasuredHeight() - this.chartBottom) - measuredHeight) - f16;
                        fArr2[i6 + 2] = f17;
                        lineViewData.linesPathBottomSize = i6 + 4;
                        fArr2[i6 + 3] = (getMeasuredHeight() - this.chartBottom) - f16;
                        f16 += measuredHeight;
                    } else {
                        f4 = f3;
                    }
                    i5++;
                    f3 = f4;
                    f13 = 2.0f;
                    f14 = 0.0f;
                }
            }
            max++;
            f3 = f3;
            f13 = 2.0f;
            f14 = 0.0f;
        }
        float f18 = f3;
        for (int i7 = 0; i7 < this.lines.size(); i7++) {
            StackBarViewData stackBarViewData = (StackBarViewData) this.lines.get(i7);
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
            while (i < this.lines.size()) {
                LineViewData lineViewData2 = (LineViewData) this.lines.get(i);
                i = (!lineViewData2.enabled && lineViewData2.alpha == 0.0f) ? i + 1 : 0;
                long[] jArr2 = lineViewData2.line.y;
                float[] fArr3 = ((StackBarChartData) this.chartData).xPercentage;
                int i8 = this.selectedIndex;
                float f20 = ((f2 / 2.0f) + (fArr3[i8] * (f8 - f2))) - f10;
                float measuredHeight2 = (((float) jArr2[i8]) / this.currentMaxHeight) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) * lineViewData2.alpha;
                lineViewData2.paint.setStrokeWidth(f);
                lineViewData2.paint.setAlpha((int) (f18 * 255.0f));
                canvas.drawLine(f20, ((getMeasuredHeight() - this.chartBottom) - measuredHeight2) - f19, f20, (getMeasuredHeight() - this.chartBottom) - f19, lineViewData2.paint);
                f19 += measuredHeight2;
            }
        }
        canvas.restore();
    }

    @Override
    protected void selectXOnChart(int i, int i2) {
        T t = this.chartData;
        if (t == 0) {
            return;
        }
        int i3 = this.selectedIndex;
        float f = this.chartFullWidth;
        float f2 = (this.pickerDelegate.pickerStart * f) - BaseChartView.HORIZONTAL_PADDING;
        StackBarChartData stackBarChartData = (StackBarChartData) t;
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
            int findIndex = stackBarChartData.findIndex(this.startXIndex, this.endXIndex, f3);
            this.selectedIndex = findIndex;
            int i4 = this.endXIndex;
            if (findIndex > i4) {
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
        T t = this.chartData;
        if (t != 0) {
            int length = ((StackBarChartData) t).xPercentage.length;
            int size = this.lines.size();
            for (int i = 0; i < this.lines.size(); i++) {
                ((LineViewData) this.lines.get(i)).linesPathBottomSize = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
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
                if (i2 % max == 0) {
                    int i4 = 0;
                    float f3 = 0.0f;
                    while (i4 < size) {
                        LineViewData lineViewData2 = (LineViewData) this.lines.get(i4);
                        if (lineViewData2.enabled || lineViewData2.alpha != f) {
                            float f4 = BaseChartView.ANIMATE_PICKER_SIZES ? this.pickerMaxHeight : (float) ((StackBarChartData) this.chartData).maxValue;
                            long[] jArr3 = this.yMaxPoints;
                            float f5 = (((float) jArr3[i4]) / f4) * lineViewData2.alpha;
                            float f6 = this.pikerHeight;
                            float f7 = f5 * f6;
                            float[] fArr = lineViewData2.linesPath;
                            int i5 = lineViewData2.linesPathBottomSize;
                            fArr[i5] = f2;
                            fArr[i5 + 1] = (f6 - f7) - f3;
                            fArr[i5 + 2] = f2;
                            lineViewData2.linesPathBottomSize = i5 + 4;
                            fArr[i5 + 3] = f6 - f3;
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
            for (int i6 = 0; i6 < size; i6++) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(i6);
                lineViewData3.paint.setStrokeWidth(max * f8);
                lineViewData3.paint.setAlpha(255);
                canvas.drawLines(lineViewData3.linesPath, 0, lineViewData3.linesPathBottomSize, lineViewData3.paint);
            }
        }
    }

    @Override
    public void onCheckChanged() {
        int length = ((StackBarChartData) this.chartData).lines.get(0).y.length;
        int size = ((StackBarChartData) this.chartData).lines.size();
        ((StackBarChartData) this.chartData).ySum = new long[length];
        for (int i = 0; i < length; i++) {
            ((StackBarChartData) this.chartData).ySum[i] = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (((StackBarViewData) this.lines.get(i2)).enabled) {
                    StackBarChartData stackBarChartData = (StackBarChartData) this.chartData;
                    long[] jArr = stackBarChartData.ySum;
                    jArr[i] = jArr[i] + stackBarChartData.lines.get(i2).y[i];
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
    public void updatePickerMinMaxHeight() {
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
                float f = (float) j;
                if (f != this.animatedToPickerMaxHeight) {
                    this.animatedToPickerMaxHeight = f;
                    Animator animator = this.pickerAnimator;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator createAnimator = createAnimator(this.pickerMaxHeight, this.animatedToPickerMaxHeight, new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            StackBarChartView.this.pickerMaxHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            StackBarChartView stackBarChartView = StackBarChartView.this;
                            stackBarChartView.invalidatePickerChart = true;
                            stackBarChartView.invalidate();
                        }
                    });
                    this.pickerAnimator = createAnimator;
                    createAnimator.start();
                }
            }
        }
    }

    @Override
    public void initPickerMaxHeight() {
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
            float f = (float) j;
            if (f > this.pickerMaxHeight) {
                this.pickerMaxHeight = f;
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        tick();
        drawChart(canvas);
        drawBottomLine(canvas);
        this.tmpN = this.horizontalLines.size();
        int i = 0;
        while (true) {
            this.tmpI = i;
            int i2 = this.tmpI;
            if (i2 < this.tmpN) {
                drawHorizontalLines(canvas, this.horizontalLines.get(i2));
                drawSignaturesToHorizontalLines(canvas, this.horizontalLines.get(this.tmpI));
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
