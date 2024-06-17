package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.LineViewData;

public class LinearBarChartView extends BaseChartView<ChartData, LineViewData> {
    public LinearBarChartView(Context context) {
        super(context);
    }

    @Override
    public void init() {
        this.useMinHeight = true;
        super.init();
    }

    @Override
    protected void drawChart(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.LinearBarChartView.drawChart(android.graphics.Canvas):void");
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        LineViewData lineViewData;
        float f;
        int i3;
        float f2;
        int i4;
        LineViewData lineViewData2;
        int i5;
        Canvas canvas3 = canvas;
        getMeasuredHeight();
        getMeasuredHeight();
        int size = this.lines.size();
        T t = this.chartData;
        if (t != 0) {
            float[] fArr = t.xPercentage;
            float f3 = fArr.length < 2 ? 1.0f : fArr[1] * this.pickerWidth;
            int i6 = 0;
            while (i6 < size) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(i6);
                if (lineViewData3.enabled || lineViewData3.alpha != 0.0f) {
                    lineViewData3.bottomLinePath.reset();
                    int length = this.chartData.xPercentage.length;
                    long[] jArr = lineViewData3.line.y;
                    lineViewData3.chartPath.reset();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        if (jArr[i7] < 0) {
                            lineViewData2 = lineViewData3;
                            i3 = i6;
                            i4 = size;
                        } else {
                            T t2 = this.chartData;
                            float f4 = t2.xPercentage[i7] * this.pickerWidth;
                            boolean z = BaseChartView.ANIMATE_PICKER_SIZES;
                            if (z) {
                                f = this.pickerMaxHeight;
                                lineViewData = lineViewData3;
                            } else {
                                lineViewData = lineViewData3;
                                f = (float) t2.maxValue;
                            }
                            if (z) {
                                f2 = this.pickerMinHeight;
                                i3 = i6;
                            } else {
                                i3 = i6;
                                f2 = (float) t2.minValue;
                            }
                            i4 = size;
                            float f5 = (1.0f - ((((float) jArr[i7]) - f2) / (f - f2))) * this.pikerHeight;
                            if (BaseChartView.USE_LINES) {
                                if (i8 == 0) {
                                    lineViewData2 = lineViewData;
                                    float[] fArr2 = lineViewData2.linesPathBottom;
                                    int i9 = i8 + 1;
                                    float f6 = f3 / 2.0f;
                                    fArr2[i8] = f4 - f6;
                                    int i10 = i9 + 1;
                                    fArr2[i9] = f5;
                                    int i11 = i10 + 1;
                                    float f7 = f4 + f6;
                                    fArr2[i10] = f7;
                                    int i12 = i11 + 1;
                                    fArr2[i11] = f5;
                                    int i13 = i12 + 1;
                                    fArr2[i12] = f7;
                                    i5 = i13 + 1;
                                    fArr2[i13] = f5;
                                } else {
                                    lineViewData2 = lineViewData;
                                    if (i7 == length - 1) {
                                        float[] fArr3 = lineViewData2.linesPathBottom;
                                        int i14 = i8 + 1;
                                        float f8 = f3 / 2.0f;
                                        float f9 = f4 - f8;
                                        fArr3[i8] = f9;
                                        int i15 = i14 + 1;
                                        fArr3[i14] = f5;
                                        int i16 = i15 + 1;
                                        fArr3[i15] = f9;
                                        int i17 = i16 + 1;
                                        fArr3[i16] = f5;
                                        int i18 = i17 + 1;
                                        float f10 = f4 + f8;
                                        fArr3[i17] = f10;
                                        int i19 = i18 + 1;
                                        fArr3[i18] = f5;
                                        int i20 = i19 + 1;
                                        fArr3[i19] = f10;
                                        int i21 = i20 + 1;
                                        fArr3[i20] = f5;
                                        int i22 = i21 + 1;
                                        fArr3[i21] = f10;
                                        i8 = i22 + 1;
                                        fArr3[i22] = 0.0f;
                                    } else {
                                        float[] fArr4 = lineViewData2.linesPathBottom;
                                        int i23 = i8 + 1;
                                        float f11 = f3 / 2.0f;
                                        float f12 = f4 - f11;
                                        fArr4[i8] = f12;
                                        int i24 = i23 + 1;
                                        fArr4[i23] = f5;
                                        int i25 = i24 + 1;
                                        fArr4[i24] = f12;
                                        int i26 = i25 + 1;
                                        fArr4[i25] = f5;
                                        int i27 = i26 + 1;
                                        float f13 = f4 + f11;
                                        fArr4[i26] = f13;
                                        int i28 = i27 + 1;
                                        fArr4[i27] = f5;
                                        int i29 = i28 + 1;
                                        fArr4[i28] = f13;
                                        i5 = i29 + 1;
                                        fArr4[i29] = f5;
                                    }
                                }
                                i8 = i5;
                            } else {
                                lineViewData2 = lineViewData;
                                if (i7 == 0) {
                                    lineViewData2.bottomLinePath.moveTo(f4 - (f3 / 2.0f), f5);
                                } else {
                                    lineViewData2.bottomLinePath.lineTo(f4 - (f3 / 2.0f), f5);
                                }
                                lineViewData2.bottomLinePath.lineTo(f4 + (f3 / 2.0f), f5);
                            }
                        }
                        i7++;
                        size = i4;
                        i6 = i3;
                        lineViewData3 = lineViewData2;
                    }
                    LineViewData lineViewData4 = lineViewData3;
                    i = i6;
                    i2 = size;
                    lineViewData4.linesPathBottomSize = i8;
                    if (lineViewData4.enabled || lineViewData4.alpha != 0.0f) {
                        lineViewData4.bottomLinePaint.setAlpha((int) (lineViewData4.alpha * 255.0f));
                        if (BaseChartView.USE_LINES) {
                            canvas2 = canvas;
                            canvas2.drawLines(lineViewData4.linesPathBottom, 0, lineViewData4.linesPathBottomSize, lineViewData4.bottomLinePaint);
                        } else {
                            canvas2 = canvas;
                            canvas2.drawPath(lineViewData4.bottomLinePath, lineViewData4.bottomLinePaint);
                        }
                    } else {
                        canvas2 = canvas;
                    }
                } else {
                    canvas2 = canvas3;
                    i = i6;
                    i2 = size;
                }
                size = i2;
                i6 = i + 1;
                canvas3 = canvas2;
            }
        }
    }

    @Override
    public LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, true);
    }
}
