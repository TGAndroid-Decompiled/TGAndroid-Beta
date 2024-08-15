package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.LineViewData;
public class LinearChartView extends BaseChartView<ChartData, LineViewData> {
    public LinearChartView(Context context) {
        super(context);
    }

    @Override
    public void init() {
        this.useMinHeight = true;
        super.init();
    }

    @Override
    protected void drawChart(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.LinearChartView.drawChart(android.graphics.Canvas):void");
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int i;
        long[] jArr;
        float f;
        int i2;
        float f2;
        getMeasuredHeight();
        getMeasuredHeight();
        int size = this.lines.size();
        if (this.chartData != 0) {
            int i3 = 0;
            while (i3 < size) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i3);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    lineViewData.bottomLinePath.reset();
                    int length = this.chartData.xPercentage.length;
                    long[] jArr2 = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        long j = jArr2[i4];
                        if (j < 0) {
                            jArr = jArr2;
                            i2 = i3;
                        } else {
                            T t = this.chartData;
                            float f3 = t.xPercentage[i4] * this.pickerWidth;
                            boolean z = BaseChartView.ANIMATE_PICKER_SIZES;
                            if (z) {
                                f = this.pickerMaxHeight;
                                jArr = jArr2;
                            } else {
                                jArr = jArr2;
                                f = (float) t.maxValue;
                            }
                            if (z) {
                                f2 = this.pickerMinHeight;
                                i2 = i3;
                            } else {
                                i2 = i3;
                                f2 = (float) t.minValue;
                            }
                            float f4 = (1.0f - ((((float) j) - f2) / (f - f2))) * this.pikerHeight;
                            if (BaseChartView.USE_LINES) {
                                if (i5 == 0) {
                                    float[] fArr = lineViewData.linesPathBottom;
                                    int i6 = i5 + 1;
                                    fArr[i5] = f3;
                                    i5 = i6 + 1;
                                    fArr[i6] = f4;
                                } else {
                                    float[] fArr2 = lineViewData.linesPathBottom;
                                    int i7 = i5 + 1;
                                    fArr2[i5] = f3;
                                    int i8 = i7 + 1;
                                    fArr2[i7] = f4;
                                    int i9 = i8 + 1;
                                    fArr2[i8] = f3;
                                    i5 = i9 + 1;
                                    fArr2[i9] = f4;
                                }
                            } else if (i4 == 0) {
                                lineViewData.bottomLinePath.moveTo(f3, f4);
                            } else {
                                lineViewData.bottomLinePath.lineTo(f3, f4);
                            }
                        }
                        i4++;
                        i3 = i2;
                        jArr2 = jArr;
                    }
                    i = i3;
                    lineViewData.linesPathBottomSize = i5;
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        lineViewData.bottomLinePaint.setAlpha((int) (lineViewData.alpha * 255.0f));
                        if (BaseChartView.USE_LINES) {
                            canvas.drawLines(lineViewData.linesPathBottom, 0, lineViewData.linesPathBottomSize, lineViewData.bottomLinePaint);
                        } else {
                            canvas.drawPath(lineViewData.bottomLinePath, lineViewData.bottomLinePaint);
                        }
                        i3 = i + 1;
                    }
                } else {
                    i = i3;
                }
                i3 = i + 1;
            }
        }
    }

    @Override
    public LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, false);
    }
}
