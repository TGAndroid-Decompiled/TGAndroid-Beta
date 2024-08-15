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
    protected void drawChart(android.graphics.Canvas r23) {
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
        T t = this.chartData;
        if (t != 0) {
            float[] fArr = t.xPercentage;
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
                            T t2 = this.chartData;
                            float f4 = t2.xPercentage[i4] * this.pickerWidth;
                            boolean z = BaseChartView.ANIMATE_PICKER_SIZES;
                            if (z) {
                                f = this.pickerMaxHeight;
                                i2 = i3;
                            } else {
                                i2 = i3;
                                f = (float) t2.maxValue;
                            }
                            if (z) {
                                f2 = this.pickerMinHeight;
                                jArr = jArr2;
                            } else {
                                jArr = jArr2;
                                f2 = (float) t2.minValue;
                            }
                            float f5 = (1.0f - ((((float) j) - f2) / (f - f2))) * this.pikerHeight;
                            if (!BaseChartView.USE_LINES) {
                                if (i4 == 0) {
                                    lineViewData.bottomLinePath.moveTo(f4 - (f3 / 2.0f), f5);
                                } else {
                                    lineViewData.bottomLinePath.lineTo(f4 - (f3 / 2.0f), f5);
                                }
                                lineViewData.bottomLinePath.lineTo(f4 + (f3 / 2.0f), f5);
                            } else if (i5 == 0) {
                                float[] fArr2 = lineViewData.linesPathBottom;
                                int i6 = i5 + 1;
                                float f6 = f3 / 2.0f;
                                fArr2[i5] = f4 - f6;
                                int i7 = i6 + 1;
                                fArr2[i6] = f5;
                                int i8 = i7 + 1;
                                float f7 = f4 + f6;
                                fArr2[i7] = f7;
                                int i9 = i8 + 1;
                                fArr2[i8] = f5;
                                int i10 = i9 + 1;
                                fArr2[i9] = f7;
                                i5 = i10 + 1;
                                fArr2[i10] = f5;
                            } else if (i4 == length - 1) {
                                float[] fArr3 = lineViewData.linesPathBottom;
                                int i11 = i5 + 1;
                                float f8 = f3 / 2.0f;
                                float f9 = f4 - f8;
                                fArr3[i5] = f9;
                                int i12 = i11 + 1;
                                fArr3[i11] = f5;
                                int i13 = i12 + 1;
                                fArr3[i12] = f9;
                                int i14 = i13 + 1;
                                fArr3[i13] = f5;
                                int i15 = i14 + 1;
                                float f10 = f4 + f8;
                                fArr3[i14] = f10;
                                int i16 = i15 + 1;
                                fArr3[i15] = f5;
                                int i17 = i16 + 1;
                                fArr3[i16] = f10;
                                int i18 = i17 + 1;
                                fArr3[i17] = f5;
                                int i19 = i18 + 1;
                                fArr3[i18] = f10;
                                i5 = i19 + 1;
                                fArr3[i19] = 0.0f;
                            } else {
                                float[] fArr4 = lineViewData.linesPathBottom;
                                int i20 = i5 + 1;
                                float f11 = f3 / 2.0f;
                                float f12 = f4 - f11;
                                fArr4[i5] = f12;
                                int i21 = i20 + 1;
                                fArr4[i20] = f5;
                                int i22 = i21 + 1;
                                fArr4[i21] = f12;
                                int i23 = i22 + 1;
                                fArr4[i22] = f5;
                                int i24 = i23 + 1;
                                float f13 = f4 + f11;
                                fArr4[i23] = f13;
                                int i25 = i24 + 1;
                                fArr4[i24] = f5;
                                int i26 = i25 + 1;
                                fArr4[i25] = f13;
                                i5 = i26 + 1;
                                fArr4[i26] = f5;
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
    public LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, true);
    }
}
