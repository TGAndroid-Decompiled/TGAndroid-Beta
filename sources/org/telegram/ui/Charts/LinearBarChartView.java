package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.LineViewData;

public class LinearBarChartView extends BaseChartView {
    public LinearBarChartView(Context context) {
        super(context);
    }

    @Override
    public LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, true);
    }

    @Override
    protected void drawChart(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.LinearBarChartView.drawChart(android.graphics.Canvas):void");
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int i;
        int i2;
        float f;
        long[] jArr;
        float f2;
        getMeasuredHeight();
        getMeasuredHeight();
        int size = this.lines.size();
        ChartData chartData = this.chartData;
        if (chartData != null) {
            float[] fArr = chartData.xPercentage;
            float f3 = fArr.length < 2 ? 1.0f : fArr[1] * this.pickerWidth;
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
                            i2 = i3;
                            jArr = jArr2;
                        } else {
                            ChartData chartData2 = this.chartData;
                            float f4 = chartData2.xPercentage[i4] * this.pickerWidth;
                            boolean z = BaseChartView.ANIMATE_PICKER_SIZES;
                            if (z) {
                                f = this.pickerMaxHeight;
                                i2 = i3;
                            } else {
                                i2 = i3;
                                f = (float) chartData2.maxValue;
                            }
                            if (z) {
                                f2 = this.pickerMinHeight;
                                jArr = jArr2;
                            } else {
                                jArr = jArr2;
                                f2 = (float) chartData2.minValue;
                            }
                            float f5 = (1.0f - ((((float) j) - f2) / (f - f2))) * this.pikerHeight;
                            if (!BaseChartView.USE_LINES) {
                                Path path = lineViewData.bottomLinePath;
                                float f6 = f4 - (f3 / 2.0f);
                                if (i4 == 0) {
                                    path.moveTo(f6, f5);
                                } else {
                                    path.lineTo(f6, f5);
                                }
                                lineViewData.bottomLinePath.lineTo(f4 + (f3 / 2.0f), f5);
                            } else if (i5 == 0) {
                                float[] fArr2 = lineViewData.linesPathBottom;
                                float f7 = f3 / 2.0f;
                                fArr2[i5] = f4 - f7;
                                fArr2[i5 + 1] = f5;
                                float f8 = f4 + f7;
                                fArr2[i5 + 2] = f8;
                                fArr2[i5 + 3] = f5;
                                int i6 = i5 + 5;
                                fArr2[i5 + 4] = f8;
                                i5 += 6;
                                fArr2[i6] = f5;
                            } else if (i4 == length - 1) {
                                float[] fArr3 = lineViewData.linesPathBottom;
                                float f9 = f3 / 2.0f;
                                float f10 = f4 - f9;
                                fArr3[i5] = f10;
                                fArr3[i5 + 1] = f5;
                                fArr3[i5 + 2] = f10;
                                fArr3[i5 + 3] = f5;
                                float f11 = f4 + f9;
                                fArr3[i5 + 4] = f11;
                                fArr3[i5 + 5] = f5;
                                fArr3[i5 + 6] = f11;
                                fArr3[i5 + 7] = f5;
                                int i7 = i5 + 9;
                                fArr3[i5 + 8] = f11;
                                i5 += 10;
                                fArr3[i7] = 0.0f;
                            } else {
                                float[] fArr4 = lineViewData.linesPathBottom;
                                float f12 = f3 / 2.0f;
                                float f13 = f4 - f12;
                                fArr4[i5] = f13;
                                fArr4[i5 + 1] = f5;
                                fArr4[i5 + 2] = f13;
                                fArr4[i5 + 3] = f5;
                                float f14 = f4 + f12;
                                fArr4[i5 + 4] = f14;
                                fArr4[i5 + 5] = f5;
                                int i8 = i5 + 7;
                                fArr4[i5 + 6] = f14;
                                i5 += 8;
                                fArr4[i8] = f5;
                            }
                        }
                        i4++;
                        jArr2 = jArr;
                        i3 = i2;
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
    public void init() {
        this.useMinHeight = true;
        super.init();
    }
}
