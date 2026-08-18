package org.telegram.ui.Charts;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.DoubleLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public class DoubleLinearChartView extends BaseChartView {
    public DoubleLinearChartView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
    }

    @Override
    protected void init() {
        this.useMinHeight = true;
        super.init();
    }

    @Override
    protected void drawChart(Canvas canvas) {
        float f;
        float f2;
        float f3;
        if (this.chartData != null) {
            float f4 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f5 = chartPickerDelegate.pickerEnd;
            float f6 = chartPickerDelegate.pickerStart;
            float f7 = f4 / (f5 - f6);
            float f8 = (f6 * f7) - BaseChartView.HORIZONTAL_PADDING;
            canvas.save();
            int i = this.transitionMode;
            float f9 = 0.0f;
            int i2 = 2;
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
                    long[] jArr = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    float[] fArr = ((DoubleLinearChartData) this.chartData).xPercentage;
                    int i6 = ((int) (BaseChartView.HORIZONTAL_PADDING / (fArr.length < i2 ? 1.0f : fArr[i3] * f7))) + i3;
                    int iMax = Math.max(i4, this.startXIndex - i6);
                    int iMin = Math.min(((DoubleLinearChartData) this.chartData).xPercentage.length - i3, this.endXIndex + i6);
                    boolean z = true;
                    int i7 = 0;
                    while (iMax <= iMin) {
                        long j = jArr[iMax];
                        if (j < 0) {
                            f3 = f7;
                        } else {
                            DoubleLinearChartData doubleLinearChartData = (DoubleLinearChartData) this.chartData;
                            float f13 = (doubleLinearChartData.xPercentage[iMax] * f7) - f8;
                            float f14 = j * doubleLinearChartData.linesK[i5];
                            float f15 = this.currentMinHeight;
                            float f16 = (f14 - f15) / (this.currentMaxHeight - f15);
                            float strokeWidth = lineViewData.paint.getStrokeWidth() / 2.0f;
                            f3 = f7;
                            float measuredHeight = ((getMeasuredHeight() - this.chartBottom) - strokeWidth) - (f16 * (((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) - strokeWidth));
                            if (BaseChartView.USE_LINES) {
                                if (i7 == 0) {
                                    float[] fArr2 = lineViewData.linesPath;
                                    int i8 = i7 + 1;
                                    fArr2[i7] = f13;
                                    i7 += 2;
                                    fArr2[i8] = measuredHeight;
                                } else {
                                    float[] fArr3 = lineViewData.linesPath;
                                    fArr3[i7] = f13;
                                    fArr3[i7 + 1] = measuredHeight;
                                    int i9 = i7 + 3;
                                    fArr3[i7 + 2] = f13;
                                    i7 += 4;
                                    fArr3[i9] = measuredHeight;
                                }
                            } else if (z) {
                                lineViewData.chartPath.moveTo(f13, measuredHeight);
                                z = false;
                            } else {
                                lineViewData.chartPath.lineTo(f13, measuredHeight);
                            }
                        }
                        iMax++;
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
                    } else {
                        canvas.drawPath(lineViewData.chartPath, lineViewData.paint);
                    }
                    i5++;
                    f7 = f2;
                    i4 = 0;
                    f9 = 0.0f;
                    i2 = 2;
                    i3 = 1;
                } else {
                    f2 = f7;
                }
                i5++;
                f7 = f2;
                i4 = 0;
                f9 = 0.0f;
                i2 = 2;
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
        if (this.chartData != null) {
            for (int i3 = 0; i3 < size; i3++) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i3);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    lineViewData.bottomLinePath.reset();
                    int length = ((DoubleLinearChartData) this.chartData).xPercentage.length;
                    long[] jArr = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        long j = jArr[i4];
                        if (j < 0) {
                            length = length;
                        } else {
                            DoubleLinearChartData doubleLinearChartData = (DoubleLinearChartData) this.chartData;
                            float f = doubleLinearChartData.xPercentage[i4] * this.pickerWidth;
                            float f2 = (1.0f - ((j * doubleLinearChartData.linesK[i3]) / (BaseChartView.ANIMATE_PICKER_SIZES ? this.pickerMaxHeight : doubleLinearChartData.maxValue))) * (i2 - measuredHeight2);
                            if (BaseChartView.USE_LINES) {
                                if (i5 == 0) {
                                    float[] fArr = lineViewData.linesPathBottom;
                                    int i6 = i5 + 1;
                                    fArr[i5] = f;
                                    i5 += 2;
                                    fArr[i6] = f2;
                                } else {
                                    float[] fArr2 = lineViewData.linesPathBottom;
                                    fArr2[i5] = f;
                                    fArr2[i5 + 1] = f2;
                                    int i7 = i5 + 3;
                                    fArr2[i5 + 2] = f;
                                    i5 += 4;
                                    fArr2[i7] = f2;
                                }
                            } else if (i4 == 0) {
                                lineViewData.bottomLinePath.moveTo(f, f2);
                            } else {
                                lineViewData.bottomLinePath.lineTo(f, f2);
                            }
                        }
                        i4++;
                        length = length;
                    }
                    lineViewData.linesPathBottomSize = i5;
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
    protected void drawSelection(Canvas canvas) {
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
                float f6 = lineViewData.line.y[this.selectedIndex] * ((DoubleLinearChartData) this.chartData).linesK[this.tmpI];
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
    protected void drawSignaturesToHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
        float f;
        float f2;
        float f3;
        int i;
        int textSize;
        int i2;
        long[] jArr = chartHorizontalLinesData.values;
        int length = jArr.length;
        int i3 = ((DoubleLinearChartData) this.chartData).linesK[0] == 1.0f ? 1 : 0;
        int i4 = (i3 + 1) % 2;
        if (length > 2) {
            float f4 = (jArr[1] - jArr[0]) / (this.currentMaxHeight - this.currentMinHeight);
            if (f4 < 0.1d) {
                f = f4 / 0.1f;
            } else {
                f = 1.0f;
            }
        } else {
            f = 1.0f;
        }
        int i5 = this.transitionMode;
        if (i5 == 2) {
            f3 = 1.0f - this.transitionParams.progress;
        } else {
            if (i5 == 1 || i5 == 3) {
                f3 = this.transitionParams.progress;
            } else {
                f2 = 1.0f;
            }
            this.linePaint.setAlpha((int) (chartHorizontalLinesData.alpha * 0.1f * f2));
            int measuredHeight = getMeasuredHeight() - this.chartBottom;
            int i6 = BaseChartView.SIGNATURE_TEXT_HEIGHT;
            i = measuredHeight - i6;
            textSize = (int) (i6 - this.signaturePaint.getTextSize());
            i2 = 0;
            while (i2 < length) {
                float measuredHeight2 = getMeasuredHeight() - this.chartBottom;
                int i7 = i3;
                float f5 = chartHorizontalLinesData.values[i2];
                float f6 = this.currentMinHeight;
                int i8 = (int) (measuredHeight2 - (i * ((f5 - f6) / (this.currentMaxHeight - f6))));
                if (chartHorizontalLinesData.valuesStr == null && this.lines.size() > 0) {
                    if (chartHorizontalLinesData.valuesStr2 == null || this.lines.size() < 2) {
                        this.signaturePaint.setColor(Theme.getColor(Theme.key_statisticChartSignature, this.resourcesProvider));
                        this.signaturePaint.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
                    } else {
                        this.signaturePaint.setColor(((LineViewData) this.lines.get(i4)).lineColor);
                        this.signaturePaint.setAlpha((int) (chartHorizontalLinesData.alpha * ((LineViewData) this.lines.get(i4)).alpha * f2 * f));
                    }
                    chartHorizontalLinesData.drawText(canvas, 0, i2, BaseChartView.HORIZONTAL_PADDING, i8 - textSize, this.signaturePaint);
                }
                if (chartHorizontalLinesData.valuesStr2 == null && this.lines.size() > 1) {
                    this.signaturePaint2.setColor(((LineViewData) this.lines.get(i7)).lineColor);
                    this.signaturePaint2.setAlpha((int) (chartHorizontalLinesData.alpha * ((LineViewData) this.lines.get(i7)).alpha * f2 * f));
                    chartHorizontalLinesData.drawText(canvas, 1, i2, getMeasuredWidth() - BaseChartView.HORIZONTAL_PADDING, i8 - textSize, this.signaturePaint2);
                }
                i2++;
                textSize = textSize;
                i3 = i7;
                i = i;
            }
        }
        f2 = f3;
        this.linePaint.setAlpha((int) (chartHorizontalLinesData.alpha * 0.1f * f2));
        int measuredHeight3 = getMeasuredHeight() - this.chartBottom;
        int i9 = BaseChartView.SIGNATURE_TEXT_HEIGHT;
        i = measuredHeight3 - i9;
        textSize = (int) (i9 - this.signaturePaint.getTextSize());
        i2 = 0;
        while (i2 < length) {
            float measuredHeight4 = getMeasuredHeight() - this.chartBottom;
            int i10 = i3;
            float f7 = chartHorizontalLinesData.values[i2];
            float f8 = this.currentMinHeight;
            int i11 = (int) (measuredHeight4 - (i * ((f7 - f8) / (this.currentMaxHeight - f8))));
            if (chartHorizontalLinesData.valuesStr == null) {
            }
            if (chartHorizontalLinesData.valuesStr2 == null) {
            }
            i2++;
            textSize = textSize;
            i3 = i10;
            i = i;
        }
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
            long jRMaxQ = ((LineViewData) this.lines.get(i3)).enabled ? (long) (((ChartData.Line) ((DoubleLinearChartData) this.chartData).lines.get(i3)).segmentTree.rMaxQ(i, i2) * ((DoubleLinearChartData) this.chartData).linesK[i3]) : 0L;
            if (jRMaxQ > j) {
                j = jRMaxQ;
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
            long jRMinQ = ((LineViewData) this.lines.get(i3)).enabled ? (int) (((ChartData.Line) ((DoubleLinearChartData) this.chartData).lines.get(i3)).segmentTree.rMinQ(i, i2) * ((DoubleLinearChartData) this.chartData).linesK[i3]) : 2147483647L;
            if (jRMinQ < j) {
                j = jRMinQ;
            }
        }
        return j;
    }

    @Override
    protected void updatePickerMinMaxHeight() {
        if (BaseChartView.ANIMATE_PICKER_SIZES) {
            if (((LineViewData) this.lines.get(0)).enabled) {
                super.updatePickerMinMaxHeight();
                return;
            }
            long j = 0;
            for (LineViewData lineViewData : this.lines) {
                if (lineViewData.enabled) {
                    long j2 = lineViewData.line.maxValue;
                    if (j2 > j) {
                        j = j2;
                    }
                }
            }
            if (this.lines.size() > 1) {
                j = (long) (j * ((DoubleLinearChartData) this.chartData).linesK[1]);
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
                            DoubleLinearChartView.this.pickerMaxHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            DoubleLinearChartView doubleLinearChartView = DoubleLinearChartView.this;
                            doubleLinearChartView.invalidatePickerChart = true;
                            doubleLinearChartView.invalidate();
                        }
                    });
                    this.pickerAnimator = valueAnimatorCreateAnimator;
                    valueAnimatorCreateAnimator.start();
                }
            }
        }
    }

    @Override
    protected ChartHorizontalLinesData createHorizontalLinesData(long j, long j2, int i) {
        float f;
        float[] fArr = ((DoubleLinearChartData) this.chartData).linesK;
        if (fArr.length < 2) {
            f = 1.0f;
        } else {
            f = fArr[fArr[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new ChartHorizontalLinesData(j, j2, this.useMinHeight, f, i, this.signaturePaint, this.signaturePaint2);
    }
}
