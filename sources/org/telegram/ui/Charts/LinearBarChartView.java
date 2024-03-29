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
        float f;
        float f2;
        LineViewData lineViewData;
        int i3;
        getMeasuredHeight();
        getMeasuredHeight();
        int size = this.lines.size();
        T t = this.chartData;
        if (t != 0) {
            float[] fArr = t.xPercentage;
            float f3 = fArr.length < 2 ? 1.0f : fArr[1] * this.pickerWidth;
            int i4 = 0;
            while (i4 < size) {
                LineViewData lineViewData2 = (LineViewData) this.lines.get(i4);
                if (lineViewData2.enabled || lineViewData2.alpha != 0.0f) {
                    lineViewData2.bottomLinePath.reset();
                    int length = this.chartData.xPercentage.length;
                    long[] jArr = lineViewData2.line.y;
                    lineViewData2.chartPath.reset();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length) {
                        if (jArr[i5] < 0) {
                            i2 = i4;
                            lineViewData = lineViewData2;
                        } else {
                            T t2 = this.chartData;
                            float f4 = t2.xPercentage[i5] * this.pickerWidth;
                            boolean z = BaseChartView.ANIMATE_PICKER_SIZES;
                            if (z) {
                                i2 = i4;
                                f = this.pickerMaxHeight;
                            } else {
                                i2 = i4;
                                f = (float) t2.maxValue;
                            }
                            if (z) {
                                f2 = this.pickerMinHeight;
                                lineViewData = lineViewData2;
                            } else {
                                f2 = (float) t2.minValue;
                                lineViewData = lineViewData2;
                            }
                            float f5 = (1.0f - ((((float) jArr[i5]) - f2) / (f - f2))) * this.pikerHeight;
                            if (i6 == 0) {
                                float[] fArr2 = lineViewData.linesPathBottom;
                                int i7 = i6 + 1;
                                float f6 = f3 / 2.0f;
                                fArr2[i6] = f4 - f6;
                                int i8 = i7 + 1;
                                fArr2[i7] = f5;
                                int i9 = i8 + 1;
                                float f7 = f4 + f6;
                                fArr2[i8] = f7;
                                int i10 = i9 + 1;
                                fArr2[i9] = f5;
                                int i11 = i10 + 1;
                                fArr2[i10] = f7;
                                i3 = i11 + 1;
                                fArr2[i11] = f5;
                            } else if (i5 == length - 1) {
                                float[] fArr3 = lineViewData.linesPathBottom;
                                int i12 = i6 + 1;
                                float f8 = f3 / 2.0f;
                                float f9 = f4 - f8;
                                fArr3[i6] = f9;
                                int i13 = i12 + 1;
                                fArr3[i12] = f5;
                                int i14 = i13 + 1;
                                fArr3[i13] = f9;
                                int i15 = i14 + 1;
                                fArr3[i14] = f5;
                                int i16 = i15 + 1;
                                float f10 = f4 + f8;
                                fArr3[i15] = f10;
                                int i17 = i16 + 1;
                                fArr3[i16] = f5;
                                int i18 = i17 + 1;
                                fArr3[i17] = f10;
                                int i19 = i18 + 1;
                                fArr3[i18] = f5;
                                int i20 = i19 + 1;
                                fArr3[i19] = f10;
                                i6 = i20 + 1;
                                fArr3[i20] = 0.0f;
                            } else {
                                float[] fArr4 = lineViewData.linesPathBottom;
                                int i21 = i6 + 1;
                                float f11 = f3 / 2.0f;
                                float f12 = f4 - f11;
                                fArr4[i6] = f12;
                                int i22 = i21 + 1;
                                fArr4[i21] = f5;
                                int i23 = i22 + 1;
                                fArr4[i22] = f12;
                                int i24 = i23 + 1;
                                fArr4[i23] = f5;
                                int i25 = i24 + 1;
                                float f13 = f4 + f11;
                                fArr4[i24] = f13;
                                int i26 = i25 + 1;
                                fArr4[i25] = f5;
                                int i27 = i26 + 1;
                                fArr4[i26] = f13;
                                i3 = i27 + 1;
                                fArr4[i27] = f5;
                            }
                            i6 = i3;
                        }
                        i5++;
                        lineViewData2 = lineViewData;
                        i4 = i2;
                    }
                    i = i4;
                    LineViewData lineViewData3 = lineViewData2;
                    lineViewData3.linesPathBottomSize = i6;
                    if (lineViewData3.enabled || lineViewData3.alpha != 0.0f) {
                        lineViewData3.bottomLinePaint.setAlpha((int) (lineViewData3.alpha * 255.0f));
                        canvas.drawLines(lineViewData3.linesPathBottom, 0, lineViewData3.linesPathBottomSize, lineViewData3.bottomLinePaint);
                        i4 = i + 1;
                    }
                } else {
                    i = i4;
                }
                i4 = i + 1;
            }
        }
    }

    @Override
    public LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, true);
    }
}
