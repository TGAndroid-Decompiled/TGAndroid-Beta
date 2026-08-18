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
        int i;
        float f;
        if (this.chartData != null) {
            float f2 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f3 = chartPickerDelegate.pickerEnd;
            float f4 = chartPickerDelegate.pickerStart;
            float f5 = f2 / (f3 - f4);
            float f6 = (f4 * f5) - BaseChartView.HORIZONTAL_PADDING;
            int i2 = 0;
            int i3 = 0;
            while (i3 < this.lines.size()) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i3);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    float[] fArr = this.chartData.xPercentage;
                    float f7 = fArr.length < 2 ? 0.0f : fArr[1] * f5;
                    long[] jArr = lineViewData.line.y;
                    int i4 = ((int) (BaseChartView.HORIZONTAL_PADDING / f7)) + 1;
                    lineViewData.chartPath.reset();
                    int iMax = Math.max(i2, this.startXIndex - i4);
                    int iMin = Math.min(this.chartData.xPercentage.length - 1, this.endXIndex + i4);
                    boolean z = true;
                    int i5 = 0;
                    while (iMax <= iMin) {
                        int i6 = i3;
                        long j = jArr[iMax];
                        if (j >= 0) {
                            float f8 = (this.chartData.xPercentage[iMax] * f5) - f6;
                            float f9 = this.currentMinHeight;
                            float f10 = (j - f9) / (this.currentMaxHeight - f9);
                            float strokeWidth = lineViewData.paint.getStrokeWidth() / 2.0f;
                            float measuredHeight = ((getMeasuredHeight() - this.chartBottom) - strokeWidth) - (f10 * (((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) - strokeWidth));
                            if (BaseChartView.USE_LINES) {
                                if (i5 == 0) {
                                    float[] fArr2 = lineViewData.linesPath;
                                    int i7 = i5 + 1;
                                    fArr2[i5] = f8;
                                    i5 += 2;
                                    fArr2[i7] = measuredHeight;
                                } else {
                                    float[] fArr3 = lineViewData.linesPath;
                                    fArr3[i5] = f8;
                                    fArr3[i5 + 1] = measuredHeight;
                                    int i8 = i5 + 3;
                                    fArr3[i5 + 2] = f8;
                                    i5 += 4;
                                    fArr3[i8] = measuredHeight;
                                }
                            } else if (z) {
                                lineViewData.chartPath.moveTo(f8, measuredHeight);
                                z = false;
                            } else {
                                lineViewData.chartPath.lineTo(f8, measuredHeight);
                            }
                        }
                        iMax++;
                        i3 = i6;
                    }
                    i = i3;
                    canvas.save();
                    int i9 = this.transitionMode;
                    float f11 = 1.0f;
                    if (i9 == 2) {
                        TransitionParams transitionParams = this.transitionParams;
                        float f12 = transitionParams.progress;
                        f = f12 > 0.5f ? 0.0f : 1.0f - (f12 * 2.0f);
                        canvas.scale((f12 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
                    } else {
                        if (i9 == 1) {
                            float f13 = this.transitionParams.progress;
                            f = f13 < 0.3f ? 0.0f : f13;
                            canvas.save();
                            TransitionParams transitionParams2 = this.transitionParams;
                            float f14 = transitionParams2.progress;
                            canvas.scale(f14, transitionParams2.needScaleY ? f14 : 1.0f, transitionParams2.pX, transitionParams2.pY);
                        } else if (i9 == 3) {
                            f11 = this.transitionParams.progress;
                        }
                        lineViewData.paint.setAlpha((int) (lineViewData.alpha * 255.0f * f11));
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
                    f11 = f;
                    lineViewData.paint.setAlpha((int) (lineViewData.alpha * 255.0f * f11));
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
                    i = i3;
                }
                i3 = i + 1;
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
                            jArr = jArr;
                            i2 = i2;
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
                        i2 = i2;
                        jArr = jArr;
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
