package org.telegram.ui.Charts;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Iterator;
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
        int i;
        float f3;
        if (this.chartData != 0) {
            float f4 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f5 = chartPickerDelegate.pickerEnd;
            float f6 = chartPickerDelegate.pickerStart;
            float f7 = f4 / (f5 - f6);
            float f8 = (f6 * f7) - BaseChartView.HORIZONTAL_PADDING;
            canvas.save();
            int i2 = this.transitionMode;
            int i3 = 2;
            float f9 = 0.0f;
            float f10 = 2.0f;
            int i4 = 1;
            if (i2 == 2) {
                TransitionParams transitionParams = this.transitionParams;
                float f11 = transitionParams.progress;
                f = f11 > 0.5f ? 0.0f : 1.0f - (f11 * 2.0f);
                canvas.scale((f11 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
            } else if (i2 == 1) {
                float f12 = this.transitionParams.progress;
                f = f12 < 0.3f ? 0.0f : f12;
                canvas.save();
                TransitionParams transitionParams2 = this.transitionParams;
                float f13 = transitionParams2.progress;
                canvas.scale(f13, f13, transitionParams2.pX, transitionParams2.pY);
            } else {
                f = i2 == 3 ? this.transitionParams.progress : 1.0f;
            }
            int i5 = 0;
            int i6 = 0;
            while (i6 < this.lines.size()) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i6);
                if (lineViewData.enabled || lineViewData.alpha != f9) {
                    long[] jArr = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    T t = this.chartData;
                    int i7 = ((int) (BaseChartView.HORIZONTAL_PADDING / (((DoubleLinearChartData) t).xPercentage.length < i3 ? 1.0f : ((DoubleLinearChartData) t).xPercentage[i4] * f7))) + i4;
                    int max = Math.max(i5, this.startXIndex - i7);
                    int min = Math.min(((DoubleLinearChartData) this.chartData).xPercentage.length - i4, this.endXIndex + i7);
                    boolean z = true;
                    int i8 = 0;
                    while (max <= min) {
                        if (jArr[max] < 0) {
                            f3 = f7;
                            i = min;
                        } else {
                            T t2 = this.chartData;
                            float f14 = (((DoubleLinearChartData) t2).xPercentage[max] * f7) - f8;
                            i = min;
                            float f15 = ((float) jArr[max]) * ((DoubleLinearChartData) t2).linesK[i6];
                            float f16 = this.currentMinHeight;
                            float f17 = (f15 - f16) / (this.currentMaxHeight - f16);
                            float strokeWidth = lineViewData.paint.getStrokeWidth() / f10;
                            f3 = f7;
                            float measuredHeight = ((getMeasuredHeight() - this.chartBottom) - strokeWidth) - (f17 * (((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) - strokeWidth));
                            if (BaseChartView.USE_LINES) {
                                if (i8 == 0) {
                                    float[] fArr = lineViewData.linesPath;
                                    int i9 = i8 + 1;
                                    fArr[i8] = f14;
                                    i8 = i9 + 1;
                                    fArr[i9] = measuredHeight;
                                } else {
                                    float[] fArr2 = lineViewData.linesPath;
                                    int i10 = i8 + 1;
                                    fArr2[i8] = f14;
                                    int i11 = i10 + 1;
                                    fArr2[i10] = measuredHeight;
                                    int i12 = i11 + 1;
                                    fArr2[i11] = f14;
                                    i8 = i12 + 1;
                                    fArr2[i12] = measuredHeight;
                                }
                            } else if (z) {
                                lineViewData.chartPath.moveTo(f14, measuredHeight);
                                z = false;
                            } else {
                                lineViewData.chartPath.lineTo(f14, measuredHeight);
                            }
                        }
                        max++;
                        min = i;
                        f7 = f3;
                        f10 = 2.0f;
                    }
                    f2 = f7;
                    if (this.endXIndex - this.startXIndex > 100) {
                        lineViewData.paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        lineViewData.paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    lineViewData.paint.setAlpha((int) (lineViewData.alpha * 255.0f * f));
                    if (BaseChartView.USE_LINES) {
                        canvas.drawLines(lineViewData.linesPath, 0, i8, lineViewData.paint);
                        i6++;
                        f7 = f2;
                        i5 = 0;
                        i3 = 2;
                        f9 = 0.0f;
                        f10 = 2.0f;
                        i4 = 1;
                    } else {
                        canvas.drawPath(lineViewData.chartPath, lineViewData.paint);
                    }
                } else {
                    f2 = f7;
                }
                i6++;
                f7 = f2;
                i5 = 0;
                i3 = 2;
                f9 = 0.0f;
                f10 = 2.0f;
                i4 = 1;
            }
            canvas.restore();
        }
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int i;
        int i2;
        float f;
        int measuredHeight = getMeasuredHeight();
        int i3 = BaseChartView.PICKER_PADDING;
        int i4 = measuredHeight - i3;
        int measuredHeight2 = (getMeasuredHeight() - this.pikerHeight) - i3;
        int size = this.lines.size();
        if (this.chartData != 0) {
            int i5 = 0;
            while (i5 < size) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i5);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    lineViewData.bottomLinePath.reset();
                    int length = ((DoubleLinearChartData) this.chartData).xPercentage.length;
                    long[] jArr = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length) {
                        if (jArr[i6] < 0) {
                            i2 = i5;
                        } else {
                            T t = this.chartData;
                            float f2 = ((DoubleLinearChartData) t).xPercentage[i6] * this.pickerWidth;
                            if (BaseChartView.ANIMATE_PICKER_SIZES) {
                                f = this.pickerMaxHeight;
                                i2 = i5;
                            } else {
                                i2 = i5;
                                f = (float) ((DoubleLinearChartData) t).maxValue;
                            }
                            float f3 = (1.0f - ((((float) jArr[i6]) * ((DoubleLinearChartData) t).linesK[i2]) / f)) * (i4 - measuredHeight2);
                            if (BaseChartView.USE_LINES) {
                                if (i7 == 0) {
                                    float[] fArr = lineViewData.linesPathBottom;
                                    int i8 = i7 + 1;
                                    fArr[i7] = f2;
                                    i7 = i8 + 1;
                                    fArr[i8] = f3;
                                } else {
                                    float[] fArr2 = lineViewData.linesPathBottom;
                                    int i9 = i7 + 1;
                                    fArr2[i7] = f2;
                                    int i10 = i9 + 1;
                                    fArr2[i9] = f3;
                                    int i11 = i10 + 1;
                                    fArr2[i10] = f2;
                                    i7 = i11 + 1;
                                    fArr2[i11] = f3;
                                }
                            } else if (i6 == 0) {
                                lineViewData.bottomLinePath.moveTo(f2, f3);
                            } else {
                                lineViewData.bottomLinePath.lineTo(f2, f3);
                            }
                        }
                        i6++;
                        i5 = i2;
                    }
                    i = i5;
                    lineViewData.linesPathBottomSize = i7;
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        lineViewData.bottomLinePaint.setAlpha((int) (lineViewData.alpha * 255.0f));
                        if (BaseChartView.USE_LINES) {
                            canvas.drawLines(lineViewData.linesPathBottom, 0, lineViewData.linesPathBottomSize, lineViewData.bottomLinePaint);
                        } else {
                            canvas.drawPath(lineViewData.bottomLinePath, lineViewData.bottomLinePaint);
                        }
                        i5 = i + 1;
                    }
                } else {
                    i = i5;
                }
                i5 = i + 1;
            }
        }
    }

    @Override
    public void drawSelection(Canvas canvas) {
        int i = this.selectedIndex;
        if (i < 0 || !this.legendShowing) {
            return;
        }
        int i2 = (int) (this.chartActiveLineAlpha * this.selectionA);
        float f = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f2 = chartPickerDelegate.pickerEnd;
        float f3 = chartPickerDelegate.pickerStart;
        float f4 = f / (f2 - f3);
        float f5 = (((DoubleLinearChartData) this.chartData).xPercentage[i] * f4) - ((f3 * f4) - BaseChartView.HORIZONTAL_PADDING);
        this.selectedLinePaint.setAlpha(i2);
        canvas.drawLine(f5, 0.0f, f5, this.chartArea.bottom, this.selectedLinePaint);
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
                float f6 = ((float) lineViewData.line.y[this.selectedIndex]) * ((DoubleLinearChartData) this.chartData).linesK[this.tmpI];
                float f7 = this.currentMinHeight;
                float measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((f6 - f7) / (this.currentMaxHeight - f7)) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                lineViewData.selectionPaint.setAlpha((int) (lineViewData.alpha * 255.0f * this.selectionA));
                this.selectionBackgroundPaint.setAlpha((int) (lineViewData.alpha * 255.0f * this.selectionA));
                canvas.drawPoint(f5, measuredHeight, lineViewData.selectionPaint);
                canvas.drawPoint(f5, measuredHeight, this.selectionBackgroundPaint);
            }
            i3 = this.tmpI + 1;
        }
    }

    @Override
    public void drawSignaturesToHorizontalLines(android.graphics.Canvas r22, org.telegram.ui.Charts.view_data.ChartHorizontalLinesData r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.DoubleLinearChartView.drawSignaturesToHorizontalLines(android.graphics.Canvas, org.telegram.ui.Charts.view_data.ChartHorizontalLinesData):void");
    }

    @Override
    public LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, false, this.resourcesProvider);
    }

    @Override
    public long findMaxValue(int i, int i2) {
        if (this.lines.isEmpty()) {
            return 0L;
        }
        int size = this.lines.size();
        long j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long rMaxQ = ((LineViewData) this.lines.get(i3)).enabled ? ((float) ((DoubleLinearChartData) this.chartData).lines.get(i3).segmentTree.rMaxQ(i, i2)) * ((DoubleLinearChartData) this.chartData).linesK[i3] : 0L;
            if (rMaxQ > j) {
                j = rMaxQ;
            }
        }
        return j;
    }

    @Override
    public long findMinValue(int i, int i2) {
        if (this.lines.isEmpty()) {
            return 0L;
        }
        int size = this.lines.size();
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            long rMinQ = ((LineViewData) this.lines.get(i3)).enabled ? (int) (((float) ((DoubleLinearChartData) this.chartData).lines.get(i3).segmentTree.rMinQ(i, i2)) * ((DoubleLinearChartData) this.chartData).linesK[i3]) : 2147483647L;
            if (rMinQ < j) {
                j = rMinQ;
            }
        }
        return j;
    }

    @Override
    public void updatePickerMinMaxHeight() {
        if (BaseChartView.ANIMATE_PICKER_SIZES) {
            if (((LineViewData) this.lines.get(0)).enabled) {
                super.updatePickerMinMaxHeight();
                return;
            }
            Iterator it = this.lines.iterator();
            long j = 0;
            while (it.hasNext()) {
                LineViewData lineViewData = (LineViewData) it.next();
                if (lineViewData.enabled) {
                    long j2 = lineViewData.line.maxValue;
                    if (j2 > j) {
                        j = j2;
                    }
                }
            }
            if (this.lines.size() > 1) {
                j = ((float) j) * ((DoubleLinearChartData) this.chartData).linesK[1];
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
    protected ChartHorizontalLinesData createHorizontalLinesData(long j, long j2, int i) {
        float f;
        T t = this.chartData;
        if (((DoubleLinearChartData) t).linesK.length < 2) {
            f = 1.0f;
        } else {
            f = ((DoubleLinearChartData) t).linesK[((DoubleLinearChartData) t).linesK[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new ChartHorizontalLinesData(j, j2, this.useMinHeight, f, i, this.signaturePaint, this.signaturePaint2);
    }
}
