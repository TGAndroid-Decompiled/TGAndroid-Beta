package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.BarViewData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;

public class BarChartView extends BaseChartView {
    public BarChartView(Context context) {
        super(context);
        this.superDraw = true;
        this.useAlphaSignature = true;
    }

    @Override
    public BarViewData createLineViewData(ChartData.Line line) {
        return new BarViewData(line, this.resourcesProvider);
    }

    @Override
    protected void drawChart(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.BarChartView.drawChart(android.graphics.Canvas):void");
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int i;
        int i2;
        int i3;
        long[] jArr;
        float f;
        int measuredHeight = getMeasuredHeight();
        int i4 = BaseChartView.PICKER_PADDING;
        int i5 = measuredHeight - i4;
        int measuredHeight2 = (getMeasuredHeight() - this.pikerHeight) - i4;
        int size = this.lines.size();
        if (this.chartData != null) {
            int i6 = 0;
            while (i6 < size) {
                BarViewData barViewData = (BarViewData) this.lines.get(i6);
                if (barViewData.enabled || barViewData.alpha != 0.0f) {
                    barViewData.bottomLinePath.reset();
                    float[] fArr = this.chartData.xPercentage;
                    int length = fArr.length;
                    float f2 = fArr.length < 2 ? 1.0f : fArr[1] * this.pickerWidth;
                    long[] jArr2 = barViewData.line.y;
                    float f3 = barViewData.alpha;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        long j = jArr2[i7];
                        if (j < 0) {
                            i2 = size;
                            i3 = length;
                            jArr = jArr2;
                        } else {
                            ChartData chartData = this.chartData;
                            i2 = size;
                            float f4 = chartData.xPercentage[i7] * this.pickerWidth;
                            if (BaseChartView.ANIMATE_PICKER_SIZES) {
                                f = this.pickerMaxHeight;
                                i3 = length;
                                jArr = jArr2;
                            } else {
                                i3 = length;
                                jArr = jArr2;
                                f = (float) chartData.maxValue;
                            }
                            float[] fArr2 = barViewData.linesPath;
                            fArr2[i8] = f4;
                            fArr2[i8 + 1] = (1.0f - ((((float) j) / f) * f3)) * (i5 - measuredHeight2);
                            int i9 = i8 + 3;
                            fArr2[i8 + 2] = f4;
                            i8 += 4;
                            fArr2[i9] = getMeasuredHeight() - this.chartBottom;
                        }
                        i7++;
                        length = i3;
                        size = i2;
                        jArr2 = jArr;
                    }
                    i = size;
                    barViewData.paint.setStrokeWidth(f2 + 2.0f);
                    canvas.drawLines(barViewData.linesPath, 0, i8, barViewData.paint);
                } else {
                    i = size;
                }
                i6++;
                size = i;
            }
        }
    }

    @Override
    public void drawSelection(Canvas canvas) {
    }

    @Override
    protected float getMinDistance() {
        return 0.1f;
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
            if (i2 >= this.tmpN) {
                drawBottomSignature(canvas);
                drawPicker(canvas);
                drawSelection(canvas);
                super.onDraw(canvas);
                return;
            }
            drawHorizontalLines(canvas, (ChartHorizontalLinesData) this.horizontalLines.get(i2));
            drawSignaturesToHorizontalLines(canvas, (ChartHorizontalLinesData) this.horizontalLines.get(this.tmpI));
            i = this.tmpI + 1;
        }
    }
}
