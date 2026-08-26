package org.telegram.ui.Charts;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackBarChartData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.StackBarViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;

public final class StackBarChartView extends BaseChartView {
    public long[] yMaxPoints;

    public StackBarChartView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.superDraw = true;
        this.useAlphaSignature = true;
    }

    @Override
    public final LineViewData createLineViewData(ChartData.Line line) {
        return new StackBarViewData(line, this.resourcesProvider);
    }

    @Override
    public final void drawChart(Canvas canvas) {
        float f;
        float f2;
        ArrayList arrayList;
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        Canvas canvas2 = canvas;
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        float f6 = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f7 = chartPickerDelegate.pickerEnd;
        float f8 = chartPickerDelegate.pickerStart;
        float f9 = f6 / (f7 - f8);
        float f10 = BaseChartView.HORIZONTAL_PADDING;
        float f11 = (f8 * f9) - f10;
        float[] fArr = ((StackBarChartData) chartData).xPercentage;
        if (fArr.length < 2) {
            f2 = 1.0f;
            f = 1.0f;
        } else {
            float f12 = fArr[1];
            float f13 = f12 * f9;
            f = (f9 - f13) * f12;
            f2 = f13;
        }
        int i3 = ((int) (f10 / f2)) + 1;
        int iMax = Math.max(0, (this.startXIndex - i3) - 2);
        int iMin = Math.min(((StackBarChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i3 + 2);
        int i4 = 0;
        while (true) {
            arrayList = this.lines;
            if (i4 >= arrayList.size()) {
                break;
            }
            ((LineViewData) arrayList.get(i4)).linesPathBottomSize = 0;
            i4++;
        }
        canvas2.save();
        int i5 = this.transitionMode;
        if (i5 == 2) {
            this.postTransition = true;
            this.selectionA = 0.0f;
            TransitionParams transitionParams = this.transitionParams;
            float f14 = transitionParams.progress;
            f4 = 1.0f - f14;
            f3 = 2.0f;
            canvas2.scale((f14 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
        } else {
            f3 = 2.0f;
            if (i5 == 1) {
                TransitionParams transitionParams2 = this.transitionParams;
                float f15 = transitionParams2.progress;
                canvas2.scale(f15, 1.0f, transitionParams2.pX, transitionParams2.pY);
                f4 = f15;
            } else {
                f4 = i5 == 3 ? this.transitionParams.progress : 1.0f;
            }
        }
        boolean z = this.selectedIndex >= 0 && this.legendShowing;
        while (true) {
            i = BaseChartView.SIGNATURE_TEXT_HEIGHT;
            if (iMax > iMin) {
                break;
            }
            if (this.selectedIndex != iMax || !z) {
                int i6 = 0;
                float f16 = 0.0f;
                while (i6 < arrayList.size()) {
                    LineViewData lineViewData = (LineViewData) arrayList.get(i6);
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        long[] jArr = lineViewData.line.y;
                        float f17 = (((f9 - f2) * ((StackBarChartData) this.chartData).xPercentage[iMax]) + (f2 / f3)) - f11;
                        i2 = iMax;
                        float measuredHeight = (jArr[i2] / this.currentMaxHeight) * ((getMeasuredHeight() - this.chartBottom) - i) * lineViewData.alpha;
                        float measuredHeight2 = (getMeasuredHeight() - this.chartBottom) - measuredHeight;
                        int i7 = lineViewData.linesPathBottomSize;
                        int i8 = i7 + 1;
                        lineViewData.linesPathBottomSize = i8;
                        float[] fArr2 = lineViewData.linesPath;
                        fArr2[i7] = f17;
                        int i9 = i7 + 2;
                        lineViewData.linesPathBottomSize = i9;
                        fArr2[i8] = measuredHeight2 - f16;
                        int i10 = i7 + 3;
                        lineViewData.linesPathBottomSize = i10;
                        fArr2[i9] = f17;
                        lineViewData.linesPathBottomSize = i7 + 4;
                        fArr2[i10] = (getMeasuredHeight() - this.chartBottom) - f16;
                        f16 += measuredHeight;
                    } else {
                        i2 = iMax;
                    }
                    i6++;
                    iMin = iMin;
                    iMax = i2;
                }
            }
            iMax++;
            iMin = iMin;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            StackBarViewData stackBarViewData = (StackBarViewData) arrayList.get(i11);
            Paint paint = (z || this.postTransition) ? stackBarViewData.unselectedPaint : stackBarViewData.paint;
            if (z) {
                f5 = 255.0f;
                stackBarViewData.unselectedPaint.setColor(ColorUtils.blendARGB(this.selectionA, stackBarViewData.lineColor, stackBarViewData.blendColor));
            } else {
                f5 = 255.0f;
            }
            if (this.postTransition) {
                stackBarViewData.unselectedPaint.setColor(ColorUtils.blendARGB(1.0f, stackBarViewData.lineColor, stackBarViewData.blendColor));
            }
            paint.setAlpha((int) (f4 * f5));
            paint.setStrokeWidth(f);
            canvas2.drawLines(stackBarViewData.linesPath, 0, stackBarViewData.linesPathBottomSize, paint);
        }
        int i12 = 0;
        if (z) {
            float f18 = 0.0f;
            while (i12 < arrayList.size()) {
                LineViewData lineViewData2 = (LineViewData) arrayList.get(i12);
                if (lineViewData2.enabled || lineViewData2.alpha != 0.0f) {
                    long[] jArr2 = lineViewData2.line.y;
                    float[] fArr3 = ((StackBarChartData) this.chartData).xPercentage;
                    int i13 = this.selectedIndex;
                    float f19 = (((f9 - f2) * fArr3[i13]) + (f2 / f3)) - f11;
                    float measuredHeight3 = (jArr2[i13] / this.currentMaxHeight) * ((getMeasuredHeight() - this.chartBottom) - i) * lineViewData2.alpha;
                    float measuredHeight4 = (getMeasuredHeight() - this.chartBottom) - measuredHeight3;
                    Paint paint2 = lineViewData2.paint;
                    paint2.setStrokeWidth(f);
                    paint2.setAlpha((int) (f4 * 255.0f));
                    canvas2.drawLine(f19, measuredHeight4 - f18, f19, (getMeasuredHeight() - this.chartBottom) - f18, paint2);
                    f18 += measuredHeight3;
                }
                i12++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override
    public final void drawPickerChart(Canvas canvas) {
        float f;
        ChartData chartData = this.chartData;
        if (chartData != null) {
            int length = ((StackBarChartData) chartData).xPercentage.length;
            ArrayList arrayList = this.lines;
            int size = arrayList.size();
            for (int i = 0; i < arrayList.size(); i++) {
                ((LineViewData) arrayList.get(i)).linesPathBottomSize = 0;
            }
            int iMax = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.yMaxPoints;
            if (jArr == null || jArr.length < size) {
                this.yMaxPoints = new long[size];
            }
            int i2 = 0;
            while (i2 < length) {
                float f2 = ((StackBarChartData) this.chartData).xPercentage[i2] * this.pickerWidth;
                int i3 = 0;
                while (true) {
                    f = 0.0f;
                    if (i3 >= size) {
                        break;
                    }
                    LineViewData lineViewData = (LineViewData) arrayList.get(i3);
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
                        LineViewData lineViewData2 = (LineViewData) arrayList.get(i4);
                        if (lineViewData2.enabled || lineViewData2.alpha != f) {
                            float f4 = BaseChartView.ANIMATE_PICKER_SIZES ? this.pickerMaxHeight : ((StackBarChartData) this.chartData).maxValue;
                            long[] jArr3 = this.yMaxPoints;
                            float f5 = (jArr3[i4] / f4) * lineViewData2.alpha;
                            float f6 = this.pikerHeight;
                            float f7 = f5 * f6;
                            int i5 = lineViewData2.linesPathBottomSize;
                            int i6 = i5 + 1;
                            lineViewData2.linesPathBottomSize = i6;
                            float[] fArr = lineViewData2.linesPath;
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
                        i2 = i2;
                        f = 0.0f;
                    }
                }
                i2++;
            }
            float[] fArr2 = ((StackBarChartData) this.chartData).xPercentage;
            float f8 = fArr2.length < 2 ? 1.0f : fArr2[1] * this.pickerWidth;
            for (int i9 = 0; i9 < size; i9++) {
                LineViewData lineViewData3 = (LineViewData) arrayList.get(i9);
                lineViewData3.paint.setStrokeWidth(iMax * f8);
                Paint paint = lineViewData3.paint;
                paint.setAlpha(255);
                canvas.drawLines(lineViewData3.linesPath, 0, lineViewData3.linesPathBottomSize, paint);
            }
        }
    }

    @Override
    public final void drawSelection(Canvas canvas) {
    }

    @Override
    public final long findMaxValue(int i, int i2) {
        return ((StackBarChartData) this.chartData).ySumSegmentTree.rMaxQ(i, i2);
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final void initPickerMaxHeight() {
        super.initPickerMaxHeight();
        this.pickerMaxHeight = 0.0f;
        int length = ((StackBarChartData) this.chartData).x.length;
        ArrayList arrayList = this.lines;
        int size = arrayList.size();
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                StackBarViewData stackBarViewData = (StackBarViewData) arrayList.get(i2);
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
    public final void onCheckChanged() {
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
    public final void onDraw(Canvas canvas) {
        tick();
        drawChart(canvas);
        drawBottomLine(canvas);
        ArrayList arrayList = this.horizontalLines;
        this.tmpN = arrayList.size();
        this.tmpI = 0;
        while (true) {
            int i = this.tmpI;
            if (i >= this.tmpN) {
                drawBottomSignature(canvas);
                drawPicker(canvas);
                super.onDraw(canvas);
                return;
            } else {
                drawHorizontalLines(canvas, (ChartHorizontalLinesData) arrayList.get(i));
                drawSignaturesToHorizontalLines(canvas, (ChartHorizontalLinesData) arrayList.get(this.tmpI));
                this.tmpI++;
            }
        }
    }

    @Override
    public final void selectXOnChart(int i, int i2) {
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
        if (f3 < 0.0f) {
            this.selectedIndex = 0;
        } else if (f3 > 1.0f) {
            this.selectedIndex = stackBarChartData.x.length - 1;
        } else {
            int iFindIndex = stackBarChartData.findIndex(f3, this.startXIndex, this.endXIndex);
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
                getSelectedDate();
                StatisticActivity.BaseChartCell baseChartCell = (StatisticActivity.BaseChartCell) ((StoriesViewPager$$ExternalSyntheticLambda0) dateSelectionListener).f$0;
                baseChartCell.zoomCanceled();
                baseChartCell.chartView.legendSignatureView.showProgress(false, false);
            }
            invalidate();
            runSmoothHaptic();
        }
    }

    @Override
    public final void updatePickerMinMaxHeight() {
        if (BaseChartView.ANIMATE_PICKER_SIZES) {
            int length = ((StackBarChartData) this.chartData).x.length;
            ArrayList arrayList = this.lines;
            int size = arrayList.size();
            long j = 0;
            for (int i = 0; i < length; i++) {
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    StackBarViewData stackBarViewData = (StackBarViewData) arrayList.get(i2);
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
                    ValueAnimator valueAnimatorCreateAnimator = BaseChartView.createAnimator(this.pickerMaxHeight, this.animatedToPickerMaxHeight, new ChatActivity.AnonymousClass133(this, 5));
                    this.pickerAnimator = valueAnimatorCreateAnimator;
                    valueAnimatorCreateAnimator.start();
                }
            }
        }
    }
}
