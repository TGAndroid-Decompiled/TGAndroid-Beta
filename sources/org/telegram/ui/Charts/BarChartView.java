package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.BarViewData;

public class BarChartView extends BaseChartView<ChartData, BarViewData> {
    @Override
    public void drawSelection(Canvas canvas) {
    }

    @Override
    protected float getMinDistance() {
        return 0.1f;
    }

    public BarChartView(Context context) {
        super(context);
        this.superDraw = true;
        this.useAlphaSignature = true;
    }

    @Override
    protected void drawChart(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.BarChartView.drawChart(android.graphics.Canvas):void");
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int i;
        int i2;
        float f;
        int i3;
        int measuredHeight = getMeasuredHeight();
        int i4 = BaseChartView.PICKER_PADDING;
        int i5 = measuredHeight - i4;
        int measuredHeight2 = (getMeasuredHeight() - this.pikerHeight) - i4;
        int size = this.lines.size();
        if (this.chartData != 0) {
            int i6 = 0;
            while (i6 < size) {
                BarViewData barViewData = (BarViewData) this.lines.get(i6);
                if (barViewData.enabled || barViewData.alpha != 0.0f) {
                    barViewData.bottomLinePath.reset();
                    float[] fArr = this.chartData.xPercentage;
                    int length = fArr.length;
                    float f2 = fArr.length < 2 ? 1.0f : fArr[1] * this.pickerWidth;
                    long[] jArr = barViewData.line.y;
                    float f3 = barViewData.alpha;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        if (jArr[i7] < 0) {
                            i2 = i7;
                            i3 = i6;
                        } else {
                            T t = this.chartData;
                            float f4 = t.xPercentage[i7] * this.pickerWidth;
                            if (BaseChartView.ANIMATE_PICKER_SIZES) {
                                f = this.pickerMaxHeight;
                                i2 = i7;
                            } else {
                                i2 = i7;
                                f = (float) t.maxValue;
                            }
                            i3 = i6;
                            float f5 = (1.0f - ((((float) jArr[i2]) / f) * f3)) * (i5 - measuredHeight2);
                            float[] fArr2 = barViewData.linesPath;
                            int i9 = i8 + 1;
                            fArr2[i8] = f4;
                            int i10 = i9 + 1;
                            fArr2[i9] = f5;
                            int i11 = i10 + 1;
                            fArr2[i10] = f4;
                            i8 = i11 + 1;
                            fArr2[i11] = getMeasuredHeight() - this.chartBottom;
                        }
                        i6 = i3;
                        i7 = i2 + 1;
                    }
                    i = i6;
                    barViewData.paint.setStrokeWidth(f2 + 2.0f);
                    canvas.drawLines(barViewData.linesPath, 0, i8, barViewData.paint);
                } else {
                    i = i6;
                }
                i6 = i + 1;
            }
        }
    }

    @Override
    public BarViewData createLineViewData(ChartData.Line line) {
        return new BarViewData(line);
    }

    @Override
    public void onDraw(Canvas canvas) {
        tick();
        drawChart(canvas);
        drawBottomLine(canvas);
        this.tmpN = this.horizontalLines.size();
        int i = 0;
        while (true) {
            this.tmpI = i;
            int i2 = this.tmpI;
            if (i2 < this.tmpN) {
                drawHorizontalLines(canvas, this.horizontalLines.get(i2));
                drawSignaturesToHorizontalLines(canvas, this.horizontalLines.get(this.tmpI));
                i = this.tmpI + 1;
            } else {
                drawBottomSignature(canvas);
                drawPicker(canvas);
                drawSelection(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }
}
