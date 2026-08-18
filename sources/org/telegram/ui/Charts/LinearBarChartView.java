package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public class LinearBarChartView extends BaseChartView {
    public LinearBarChartView(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        this.useMinHeight = true;
        super.init();
    }

    @Override
    protected void drawChart(Canvas canvas) {
        float f;
        int i;
        float f2;
        float f3;
        if (this.chartData != null) {
            float f4 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f5 = chartPickerDelegate.pickerEnd;
            float f6 = chartPickerDelegate.pickerStart;
            float f7 = f4 / (f5 - f6);
            float f8 = (f6 * f7) - BaseChartView.HORIZONTAL_PADDING;
            int i2 = 0;
            int i3 = 0;
            while (i3 < this.lines.size()) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i3);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    float[] fArr = this.chartData.xPercentage;
                    float f9 = fArr.length < 2 ? 0.0f : fArr[1] * f7;
                    long[] jArr = lineViewData.line.y;
                    int i4 = ((int) (BaseChartView.HORIZONTAL_PADDING / f9)) + 1;
                    lineViewData.chartPath.reset();
                    int iMax = Math.max(i2, this.startXIndex - i4);
                    int iMin = Math.min(this.chartData.xPercentage.length - 1, this.endXIndex + i4);
                    boolean z = true;
                    int i5 = 0;
                    while (iMax <= iMin) {
                        int i6 = i3;
                        long j = jArr[iMax];
                        if (j < 0) {
                            f3 = f7;
                        } else {
                            float f10 = (this.chartData.xPercentage[iMax] * f7) - f8;
                            float f11 = this.currentMinHeight;
                            float f12 = (j - f11) / (this.currentMaxHeight - f11);
                            float strokeWidth = lineViewData.paint.getStrokeWidth() / 2.0f;
                            f3 = f7;
                            float measuredHeight = ((getMeasuredHeight() - this.chartBottom) - strokeWidth) - (f12 * (((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) - strokeWidth));
                            if (!BaseChartView.USE_LINES) {
                                if (z) {
                                    lineViewData.chartPath.moveTo(f10 - (f9 / 2.0f), measuredHeight);
                                    z = false;
                                } else {
                                    lineViewData.chartPath.lineTo(f10 - (f9 / 2.0f), measuredHeight);
                                }
                                lineViewData.chartPath.lineTo(f10 + (f9 / 2.0f), measuredHeight);
                            } else if (i5 == 0) {
                                float[] fArr2 = lineViewData.linesPath;
                                float f13 = f9 / 2.0f;
                                fArr2[i5] = f10 - f13;
                                fArr2[i5 + 1] = measuredHeight;
                                float f14 = f10 + f13;
                                fArr2[i5 + 2] = f14;
                                fArr2[i5 + 3] = measuredHeight;
                                int i7 = i5 + 5;
                                fArr2[i5 + 4] = f14;
                                i5 += 6;
                                fArr2[i7] = measuredHeight;
                            } else if (iMax == iMin) {
                                float[] fArr3 = lineViewData.linesPath;
                                float f15 = f9 / 2.0f;
                                float f16 = f10 - f15;
                                fArr3[i5] = f16;
                                fArr3[i5 + 1] = measuredHeight;
                                fArr3[i5 + 2] = f16;
                                fArr3[i5 + 3] = measuredHeight;
                                float f17 = f10 + f15;
                                fArr3[i5 + 4] = f17;
                                fArr3[i5 + 5] = measuredHeight;
                                fArr3[i5 + 6] = f17;
                                fArr3[i5 + 7] = measuredHeight;
                                int i8 = i5 + 9;
                                fArr3[i5 + 8] = f17;
                                i5 += 10;
                                fArr3[i8] = (getMeasuredHeight() - this.chartBottom) - strokeWidth;
                            } else {
                                float[] fArr4 = lineViewData.linesPath;
                                float f18 = f9 / 2.0f;
                                float f19 = f10 - f18;
                                fArr4[i5] = f19;
                                fArr4[i5 + 1] = measuredHeight;
                                fArr4[i5 + 2] = f19;
                                fArr4[i5 + 3] = measuredHeight;
                                float f20 = f10 + f18;
                                fArr4[i5 + 4] = f20;
                                fArr4[i5 + 5] = measuredHeight;
                                int i9 = i5 + 7;
                                fArr4[i5 + 6] = f20;
                                i5 += 8;
                                fArr4[i9] = measuredHeight;
                            }
                        }
                        iMax++;
                        i3 = i6;
                        f7 = f3;
                    }
                    f = f7;
                    i = i3;
                    canvas.save();
                    int i10 = this.transitionMode;
                    float f21 = 1.0f;
                    if (i10 == 2) {
                        TransitionParams transitionParams = this.transitionParams;
                        float f22 = transitionParams.progress;
                        f2 = f22 > 0.5f ? 0.0f : 1.0f - (f22 * 2.0f);
                        canvas.scale((f22 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
                    } else {
                        if (i10 == 1) {
                            float f23 = this.transitionParams.progress;
                            f2 = f23 < 0.3f ? 0.0f : f23;
                            canvas.save();
                            TransitionParams transitionParams2 = this.transitionParams;
                            float f24 = transitionParams2.progress;
                            canvas.scale(f24, transitionParams2.needScaleY ? f24 : 1.0f, transitionParams2.pX, transitionParams2.pY);
                        } else if (i10 == 3) {
                            f21 = this.transitionParams.progress;
                        }
                        lineViewData.paint.setAlpha((int) (lineViewData.alpha * 255.0f * f21));
                        if (this.endXIndex - this.startXIndex > 100) {
                            lineViewData.paint.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            lineViewData.paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        if (BaseChartView.USE_LINES) {
                            canvas.drawLines(lineViewData.linesPath, 0, i5, lineViewData.paint);
                        } else {
                            canvas.drawPath(lineViewData.chartPath, lineViewData.paint);
                        }
                        canvas.restore();
                    }
                    f21 = f2;
                    lineViewData.paint.setAlpha((int) (lineViewData.alpha * 255.0f * f21));
                    if (this.endXIndex - this.startXIndex > 100) {
                        lineViewData.paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        lineViewData.paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (BaseChartView.USE_LINES) {
                        canvas.drawPath(lineViewData.chartPath, lineViewData.paint);
                    } else {
                        canvas.drawLines(lineViewData.linesPath, 0, i5, lineViewData.paint);
                    }
                    canvas.restore();
                } else {
                    f = f7;
                    i = i3;
                }
                i3 = i + 1;
                f7 = f;
                i2 = 0;
            }
        }
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int i;
        getMeasuredHeight();
        getMeasuredHeight();
        int size = this.lines.size();
        ChartData chartData = this.chartData;
        if (chartData != null) {
            float[] fArr = chartData.xPercentage;
            float f = fArr.length < 2 ? 1.0f : fArr[1] * this.pickerWidth;
            int i2 = 0;
            while (i2 < size) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i2);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    lineViewData.bottomLinePath.reset();
                    int length = this.chartData.xPercentage.length;
                    long[] jArr = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length) {
                        long j = jArr[i3];
                        if (j < 0) {
                            i2 = i2;
                            jArr = jArr;
                        } else {
                            ChartData chartData2 = this.chartData;
                            float f2 = chartData2.xPercentage[i3] * this.pickerWidth;
                            boolean z = BaseChartView.ANIMATE_PICKER_SIZES;
                            float f3 = z ? this.pickerMaxHeight : chartData2.maxValue;
                            float f4 = z ? this.pickerMinHeight : chartData2.minValue;
                            float f5 = (1.0f - ((j - f4) / (f3 - f4))) * this.pikerHeight;
                            if (!BaseChartView.USE_LINES) {
                                if (i3 == 0) {
                                    lineViewData.bottomLinePath.moveTo(f2 - (f / 2.0f), f5);
                                } else {
                                    lineViewData.bottomLinePath.lineTo(f2 - (f / 2.0f), f5);
                                }
                                lineViewData.bottomLinePath.lineTo(f2 + (f / 2.0f), f5);
                            } else if (i4 == 0) {
                                float[] fArr2 = lineViewData.linesPathBottom;
                                float f6 = f / 2.0f;
                                fArr2[i4] = f2 - f6;
                                fArr2[i4 + 1] = f5;
                                float f7 = f2 + f6;
                                fArr2[i4 + 2] = f7;
                                fArr2[i4 + 3] = f5;
                                int i5 = i4 + 5;
                                fArr2[i4 + 4] = f7;
                                i4 += 6;
                                fArr2[i5] = f5;
                            } else if (i3 == length - 1) {
                                float[] fArr3 = lineViewData.linesPathBottom;
                                float f8 = f / 2.0f;
                                float f9 = f2 - f8;
                                fArr3[i4] = f9;
                                fArr3[i4 + 1] = f5;
                                fArr3[i4 + 2] = f9;
                                fArr3[i4 + 3] = f5;
                                float f10 = f2 + f8;
                                fArr3[i4 + 4] = f10;
                                fArr3[i4 + 5] = f5;
                                fArr3[i4 + 6] = f10;
                                fArr3[i4 + 7] = f5;
                                int i6 = i4 + 9;
                                fArr3[i4 + 8] = f10;
                                i4 += 10;
                                fArr3[i6] = 0.0f;
                            } else {
                                float[] fArr4 = lineViewData.linesPathBottom;
                                float f11 = f / 2.0f;
                                float f12 = f2 - f11;
                                fArr4[i4] = f12;
                                fArr4[i4 + 1] = f5;
                                fArr4[i4 + 2] = f12;
                                fArr4[i4 + 3] = f5;
                                float f13 = f2 + f11;
                                fArr4[i4 + 4] = f13;
                                fArr4[i4 + 5] = f5;
                                int i7 = i4 + 7;
                                fArr4[i4 + 6] = f13;
                                i4 += 8;
                                fArr4[i7] = f5;
                            }
                        }
                        i3++;
                        jArr = jArr;
                        i2 = i2;
                    }
                    i = i2;
                    lineViewData.linesPathBottomSize = i4;
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        lineViewData.bottomLinePaint.setAlpha((int) (lineViewData.alpha * 255.0f));
                        if (BaseChartView.USE_LINES) {
                            canvas.drawLines(lineViewData.linesPathBottom, 0, lineViewData.linesPathBottomSize, lineViewData.bottomLinePaint);
                        } else {
                            canvas.drawPath(lineViewData.bottomLinePath, lineViewData.bottomLinePaint);
                        }
                    }
                    i2 = i + 1;
                } else {
                    i = i2;
                }
                i2 = i + 1;
            }
        }
    }

    @Override
    public LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, true);
    }
}
