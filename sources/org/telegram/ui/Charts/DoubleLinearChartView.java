package org.telegram.ui.Charts;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.DoubleLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;
public class DoubleLinearChartView extends BaseChartView<DoubleLinearChartData, LineViewData> {
    public DoubleLinearChartView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
    }

    @Override
    public void init() {
        this.useMinHeight = true;
        super.init();
    }

    @Override
    protected void drawChart(Canvas canvas) {
        float f;
        float f2;
        float f3;
        if (this.chartData != 0) {
            float f4 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f5 = chartPickerDelegate.pickerEnd;
            float f6 = chartPickerDelegate.pickerStart;
            float f7 = f4 / (f5 - f6);
            float f8 = (f6 * f7) - BaseChartView.HORIZONTAL_PADDING;
            canvas.save();
            int i = this.transitionMode;
            int i2 = 2;
            float f9 = 0.0f;
            int i3 = 1;
            if (i == 2) {
                TransitionParams transitionParams = this.transitionParams;
                float f10 = transitionParams.progress;
                f = f10 > 0.5f ? 0.0f : 1.0f - (f10 * 2.0f);
                canvas.scale((f10 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
            } else if (i == 1) {
                float f11 = this.transitionParams.progress;
                f = f11 < 0.3f ? 0.0f : f11;
                canvas.save();
                TransitionParams transitionParams2 = this.transitionParams;
                float f12 = transitionParams2.progress;
                canvas.scale(f12, f12, transitionParams2.pX, transitionParams2.pY);
            } else {
                f = i == 3 ? this.transitionParams.progress : 1.0f;
            }
            int i4 = 0;
            int i5 = 0;
            while (i5 < this.lines.size()) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i5);
                if (lineViewData.enabled || lineViewData.alpha != f9) {
                    int[] iArr = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    T t = this.chartData;
                    int i6 = ((int) (BaseChartView.HORIZONTAL_PADDING / (((DoubleLinearChartData) t).xPercentage.length < i2 ? 1.0f : ((DoubleLinearChartData) t).xPercentage[i3] * f7))) + i3;
                    int max = Math.max(i4, this.startXIndex - i6);
                    int min = Math.min(((DoubleLinearChartData) this.chartData).xPercentage.length - i3, this.endXIndex + i6);
                    boolean z = true;
                    int i7 = 0;
                    while (max <= min) {
                        if (iArr[max] < 0) {
                            f3 = f7;
                        } else {
                            T t2 = this.chartData;
                            float f13 = (((DoubleLinearChartData) t2).xPercentage[max] * f7) - f8;
                            float f14 = iArr[max] * ((DoubleLinearChartData) t2).linesK[i5];
                            float f15 = this.currentMinHeight;
                            float f16 = (f14 - f15) / (this.currentMaxHeight - f15);
                            float strokeWidth = lineViewData.paint.getStrokeWidth() / 2.0f;
                            f3 = f7;
                            float measuredHeight = ((getMeasuredHeight() - this.chartBottom) - strokeWidth) - (f16 * (((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) - strokeWidth));
                            if (BaseChartView.USE_LINES) {
                                if (i7 == 0) {
                                    float[] fArr = lineViewData.linesPath;
                                    int i8 = i7 + 1;
                                    fArr[i7] = f13;
                                    i7 = i8 + 1;
                                    fArr[i8] = measuredHeight;
                                } else {
                                    float[] fArr2 = lineViewData.linesPath;
                                    int i9 = i7 + 1;
                                    fArr2[i7] = f13;
                                    int i10 = i9 + 1;
                                    fArr2[i9] = measuredHeight;
                                    int i11 = i10 + 1;
                                    fArr2[i10] = f13;
                                    i7 = i11 + 1;
                                    fArr2[i11] = measuredHeight;
                                }
                            } else if (z) {
                                lineViewData.chartPath.moveTo(f13, measuredHeight);
                                z = false;
                            } else {
                                lineViewData.chartPath.lineTo(f13, measuredHeight);
                            }
                        }
                        max++;
                        f7 = f3;
                    }
                    f2 = f7;
                    if (this.endXIndex - this.startXIndex > 100) {
                        lineViewData.paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        lineViewData.paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    lineViewData.paint.setAlpha((int) (lineViewData.alpha * 255.0f * f));
                    if (BaseChartView.USE_LINES) {
                        canvas.drawLines(lineViewData.linesPath, 0, i7, lineViewData.paint);
                        i5++;
                        f7 = f2;
                        i4 = 0;
                        i2 = 2;
                        f9 = 0.0f;
                        i3 = 1;
                    } else {
                        canvas.drawPath(lineViewData.chartPath, lineViewData.paint);
                    }
                } else {
                    f2 = f7;
                }
                i5++;
                f7 = f2;
                i4 = 0;
                i2 = 2;
                f9 = 0.0f;
                i3 = 1;
            }
            canvas.restore();
        }
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int measuredHeight = getMeasuredHeight();
        int i = BaseChartView.PICKER_PADDING;
        int i2 = measuredHeight - i;
        int measuredHeight2 = (getMeasuredHeight() - this.pikerHeight) - i;
        int size = this.lines.size();
        if (this.chartData != 0) {
            for (int i3 = 0; i3 < size; i3++) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i3);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    lineViewData.bottomLinePath.reset();
                    int length = ((DoubleLinearChartData) this.chartData).xPercentage.length;
                    int[] iArr = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    int i4 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        if (iArr[i5] >= 0) {
                            T t = this.chartData;
                            float f = ((DoubleLinearChartData) t).xPercentage[i5] * this.pickerWidth;
                            float f2 = (1.0f - ((iArr[i5] * ((DoubleLinearChartData) t).linesK[i3]) / (BaseChartView.ANIMATE_PICKER_SIZES ? this.pickerMaxHeight : ((DoubleLinearChartData) t).maxValue))) * (i2 - measuredHeight2);
                            if (BaseChartView.USE_LINES) {
                                if (i4 == 0) {
                                    float[] fArr = lineViewData.linesPathBottom;
                                    int i6 = i4 + 1;
                                    fArr[i4] = f;
                                    i4 = i6 + 1;
                                    fArr[i6] = f2;
                                } else {
                                    float[] fArr2 = lineViewData.linesPathBottom;
                                    int i7 = i4 + 1;
                                    fArr2[i4] = f;
                                    int i8 = i7 + 1;
                                    fArr2[i7] = f2;
                                    int i9 = i8 + 1;
                                    fArr2[i8] = f;
                                    i4 = i9 + 1;
                                    fArr2[i9] = f2;
                                }
                            } else if (i5 == 0) {
                                lineViewData.bottomLinePath.moveTo(f, f2);
                            } else {
                                lineViewData.bottomLinePath.lineTo(f, f2);
                            }
                        }
                    }
                    lineViewData.linesPathBottomSize = i4;
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        lineViewData.bottomLinePaint.setAlpha((int) (lineViewData.alpha * 255.0f));
                        if (BaseChartView.USE_LINES) {
                            canvas.drawLines(lineViewData.linesPathBottom, 0, lineViewData.linesPathBottomSize, lineViewData.bottomLinePaint);
                        } else {
                            canvas.drawPath(lineViewData.bottomLinePath, lineViewData.bottomLinePaint);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void drawSelection(Canvas canvas) {
        int i = this.selectedIndex;
        if (i < 0 || !this.legendShowing) {
            return;
        }
        float f = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f2 = chartPickerDelegate.pickerEnd;
        float f3 = chartPickerDelegate.pickerStart;
        float f4 = f / (f2 - f3);
        float f5 = (((DoubleLinearChartData) this.chartData).xPercentage[i] * f4) - ((f3 * f4) - BaseChartView.HORIZONTAL_PADDING);
        this.selectedLinePaint.setAlpha((int) (this.chartActiveLineAlpha * this.selectionA));
        canvas.drawLine(f5, 0.0f, f5, this.chartArea.bottom, this.selectedLinePaint);
        this.tmpN = this.lines.size();
        int i2 = 0;
        while (true) {
            this.tmpI = i2;
            int i3 = this.tmpI;
            if (i3 >= this.tmpN) {
                return;
            }
            LineViewData lineViewData = (LineViewData) this.lines.get(i3);
            if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                float f6 = lineViewData.line.y[this.selectedIndex] * ((DoubleLinearChartData) this.chartData).linesK[this.tmpI];
                float f7 = this.currentMinHeight;
                float measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((f6 - f7) / (this.currentMaxHeight - f7)) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                lineViewData.selectionPaint.setAlpha((int) (lineViewData.alpha * 255.0f * this.selectionA));
                this.selectionBackgroundPaint.setAlpha((int) (lineViewData.alpha * 255.0f * this.selectionA));
                canvas.drawPoint(f5, measuredHeight, lineViewData.selectionPaint);
                canvas.drawPoint(f5, measuredHeight, this.selectionBackgroundPaint);
            }
            i2 = this.tmpI + 1;
        }
    }

    @Override
    public void drawSignaturesToHorizontalLines(android.graphics.Canvas r18, org.telegram.ui.Charts.view_data.ChartHorizontalLinesData r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.DoubleLinearChartView.drawSignaturesToHorizontalLines(android.graphics.Canvas, org.telegram.ui.Charts.view_data.ChartHorizontalLinesData):void");
    }

    @Override
    public LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, this.resourcesProvider);
    }

    @Override
    public int findMaxValue(int i, int i2) {
        if (this.lines.isEmpty()) {
            return 0;
        }
        int size = this.lines.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int rMaxQ = ((LineViewData) this.lines.get(i4)).enabled ? (int) (((DoubleLinearChartData) this.chartData).lines.get(i4).segmentTree.rMaxQ(i, i2) * ((DoubleLinearChartData) this.chartData).linesK[i4]) : 0;
            if (rMaxQ > i3) {
                i3 = rMaxQ;
            }
        }
        return i3;
    }

    @Override
    public int findMinValue(int i, int i2) {
        if (this.lines.isEmpty()) {
            return 0;
        }
        int size = this.lines.size();
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i4 = 0; i4 < size; i4++) {
            int rMinQ = ((LineViewData) this.lines.get(i4)).enabled ? (int) (((DoubleLinearChartData) this.chartData).lines.get(i4).segmentTree.rMinQ(i, i2) * ((DoubleLinearChartData) this.chartData).linesK[i4]) : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (rMinQ < i3) {
                i3 = rMinQ;
            }
        }
        return i3;
    }

    @Override
    public void updatePickerMinMaxHeight() {
        int i;
        if (BaseChartView.ANIMATE_PICKER_SIZES) {
            int i2 = 0;
            if (((LineViewData) this.lines.get(0)).enabled) {
                super.updatePickerMinMaxHeight();
                return;
            }
            Iterator it = this.lines.iterator();
            while (it.hasNext()) {
                LineViewData lineViewData = (LineViewData) it.next();
                if (lineViewData.enabled && (i = lineViewData.line.maxValue) > i2) {
                    i2 = i;
                }
            }
            if (this.lines.size() > 1) {
                i2 = (int) (i2 * ((DoubleLinearChartData) this.chartData).linesK[1]);
            }
            if (i2 > 0) {
                float f = i2;
                if (f != this.animatedToPickerMaxHeight) {
                    this.animatedToPickerMaxHeight = f;
                    Animator animator = this.pickerAnimator;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator createAnimator = createAnimator(this.pickerMaxHeight, this.animatedToPickerMaxHeight, new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            DoubleLinearChartView.this.pickerMaxHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            DoubleLinearChartView doubleLinearChartView = DoubleLinearChartView.this;
                            doubleLinearChartView.invalidatePickerChart = true;
                            doubleLinearChartView.invalidate();
                        }
                    });
                    this.pickerAnimator = createAnimator;
                    createAnimator.start();
                }
            }
        }
    }

    @Override
    protected ChartHorizontalLinesData createHorizontalLinesData(int i, int i2) {
        T t = this.chartData;
        float f = 1.0f;
        if (((DoubleLinearChartData) t).linesK.length >= 2) {
            f = ((DoubleLinearChartData) t).linesK[((DoubleLinearChartData) t).linesK[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new ChartHorizontalLinesData(i, i2, this.useMinHeight, f);
    }
}
