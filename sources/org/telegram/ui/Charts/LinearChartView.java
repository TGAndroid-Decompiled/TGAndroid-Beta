package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public class LinearChartView extends BaseChartView {
    public LinearChartView(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        this.useMinHeight = true;
        super.init();
    }

    @Override
    protected void drawChart(Canvas canvas) {
        if (this.chartData != null) {
            float f = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f2 = chartPickerDelegate.pickerEnd;
            float f3 = chartPickerDelegate.pickerStart;
            float f4 = f / (f2 - f3);
            float f5 = (f3 * f4) - BaseChartView.HORIZONTAL_PADDING;
            int i = 0;
            int i2 = 0;
            while (i2 < this.lines.size()) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i2);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    float[] fArr = this.chartData.xPercentage;
                    float f6 = fArr.length < 2 ? 0.0f : fArr[1] * f4;
                    long[] jArr = lineViewData.line.y;
                    int i3 = ((int) (BaseChartView.HORIZONTAL_PADDING / f6)) + 1;
                    lineViewData.chartPath.reset();
                    int iMax = Math.max(i, this.startXIndex - i3);
                    int iMin = Math.min(this.chartData.xPercentage.length - 1, this.endXIndex + i3);
                    boolean z = true;
                    int i4 = 0;
                    while (iMax <= iMin) {
                        long[] jArr2 = jArr;
                        long j = jArr2[iMax];
                        if (j >= 0) {
                            float f7 = (this.chartData.xPercentage[iMax] * f4) - f5;
                            float f8 = this.currentMinHeight;
                            float f9 = (j - f8) / (this.currentMaxHeight - f8);
                            float strokeWidth = lineViewData.paint.getStrokeWidth() / 2.0f;
                            float measuredHeight = ((getMeasuredHeight() - this.chartBottom) - strokeWidth) - (f9 * (((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) - strokeWidth));
                            if (BaseChartView.USE_LINES) {
                                if (i4 == 0) {
                                    float[] fArr2 = lineViewData.linesPath;
                                    int i5 = i4 + 1;
                                    fArr2[i4] = f7;
                                    i4 += 2;
                                    fArr2[i5] = measuredHeight;
                                } else {
                                    float[] fArr3 = lineViewData.linesPath;
                                    fArr3[i4] = f7;
                                    fArr3[i4 + 1] = measuredHeight;
                                    int i6 = i4 + 3;
                                    fArr3[i4 + 2] = f7;
                                    i4 += 4;
                                    fArr3[i6] = measuredHeight;
                                }
                            } else if (z) {
                                lineViewData.chartPath.moveTo(f7, measuredHeight);
                                z = false;
                            } else {
                                lineViewData.chartPath.lineTo(f7, measuredHeight);
                            }
                        }
                        iMax++;
                        jArr = jArr2;
                    }
                    canvas.save();
                    int i7 = this.transitionMode;
                    float f10 = 1.0f;
                    if (i7 == 2) {
                        TransitionParams transitionParams = this.transitionParams;
                        float f11 = transitionParams.progress;
                        float f12 = f11 > 0.5f ? 0.0f : 1.0f - (f11 * 2.0f);
                        canvas.scale((f11 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
                        f10 = f12;
                    } else if (i7 == 1) {
                        float f13 = this.transitionParams.progress;
                        float f14 = f13 < 0.3f ? 0.0f : f13;
                        canvas.save();
                        TransitionParams transitionParams2 = this.transitionParams;
                        float f15 = transitionParams2.progress;
                        canvas.scale(f15, transitionParams2.needScaleY ? f15 : 1.0f, transitionParams2.pX, transitionParams2.pY);
                        f10 = f14;
                    } else if (i7 == 3) {
                        f10 = this.transitionParams.progress;
                    }
                    lineViewData.paint.setAlpha((int) (lineViewData.alpha * 255.0f * f10));
                    if (this.endXIndex - this.startXIndex > 100) {
                        lineViewData.paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        lineViewData.paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (BaseChartView.USE_LINES) {
                        canvas.drawLines(lineViewData.linesPath, 0, i4, lineViewData.paint);
                    } else {
                        canvas.drawPath(lineViewData.chartPath, lineViewData.paint);
                    }
                    canvas.restore();
                }
                i2++;
                i = 0;
            }
        }
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int i;
        getMeasuredHeight();
        getMeasuredHeight();
        int size = this.lines.size();
        if (this.chartData != null) {
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
                            ChartData chartData = this.chartData;
                            float f = chartData.xPercentage[i3] * this.pickerWidth;
                            boolean z = BaseChartView.ANIMATE_PICKER_SIZES;
                            float f2 = z ? this.pickerMaxHeight : chartData.maxValue;
                            float f3 = z ? this.pickerMinHeight : chartData.minValue;
                            float f4 = (1.0f - ((j - f3) / (f2 - f3))) * this.pikerHeight;
                            if (BaseChartView.USE_LINES) {
                                if (i4 == 0) {
                                    float[] fArr = lineViewData.linesPathBottom;
                                    int i5 = i4 + 1;
                                    fArr[i4] = f;
                                    i4 += 2;
                                    fArr[i5] = f4;
                                } else {
                                    float[] fArr2 = lineViewData.linesPathBottom;
                                    fArr2[i4] = f;
                                    fArr2[i4 + 1] = f4;
                                    int i6 = i4 + 3;
                                    fArr2[i4 + 2] = f;
                                    i4 += 4;
                                    fArr2[i6] = f4;
                                }
                            } else if (i3 == 0) {
                                lineViewData.bottomLinePath.moveTo(f, f4);
                            } else {
                                lineViewData.bottomLinePath.lineTo(f, f4);
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
        return new LineViewData(line, false);
    }
}
