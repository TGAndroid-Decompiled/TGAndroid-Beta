package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.StackLinearViewData;
public class StackLinearChartView<T extends StackLinearViewData> extends BaseChartView<StackLinearChartData, T> {
    private float[] mapPoints;
    private Matrix matrix;
    Path ovalPath;
    boolean[] skipPoints;
    float[] startFromY;

    @Override
    public long findMaxValue(int i, int i2) {
        return 100L;
    }

    @Override
    protected float getMinDistance() {
        return 0.1f;
    }

    public StackLinearChartView(Context context) {
        super(context);
        this.matrix = new Matrix();
        this.mapPoints = new float[2];
        this.ovalPath = new Path();
        this.superDraw = true;
        this.useAlphaSignature = true;
        this.drawPointOnSelection = false;
    }

    @Override
    public T createLineViewData(ChartData.Line line) {
        return (T) new StackLinearViewData(line);
    }

    @Override
    protected void drawChart(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.StackLinearChartView.drawChart(android.graphics.Canvas):void");
    }

    private int quarterForPoint(float f, float f2) {
        float centerX = this.chartArea.centerX();
        float centerY = this.chartArea.centerY() + AndroidUtilities.dp(16.0f);
        if (f < centerX || f2 > centerY) {
            if (f < centerX || f2 < centerY) {
                return (f >= centerX || f2 < centerY) ? 3 : 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        float f;
        float f2;
        int i;
        long j;
        if (this.chartData != 0) {
            int size = this.lines.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((StackLinearViewData) this.lines.get(i2)).chartPathPicker.reset();
            }
            T t = this.chartData;
            int i3 = ((StackLinearChartData) t).simplifiedSize;
            boolean[] zArr = this.skipPoints;
            if (zArr == null || zArr.length < ((StackLinearChartData) t).lines.size()) {
                this.skipPoints = new boolean[((StackLinearChartData) this.chartData).lines.size()];
            }
            int i4 = 0;
            boolean z = false;
            while (true) {
                int i5 = 1;
                if (i4 >= i3) {
                    break;
                }
                float f3 = 0.0f;
                float f4 = 0.0f;
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < this.lines.size(); i8++) {
                    LineViewData lineViewData = (LineViewData) this.lines.get(i8);
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        T t2 = this.chartData;
                        if (((StackLinearChartData) t2).simplifiedY[i8][i4] > 0) {
                            f4 += ((float) ((StackLinearChartData) t2).simplifiedY[i8][i4]) * lineViewData.alpha;
                            i6++;
                        }
                        i7 = i8;
                    }
                }
                int i9 = i3 - 1;
                float f5 = (i4 / i9) * this.pickerWidth;
                int i10 = 0;
                float f6 = 0.0f;
                while (i10 < this.lines.size()) {
                    LineViewData lineViewData2 = (LineViewData) this.lines.get(i10);
                    if (lineViewData2.enabled || lineViewData2.alpha != f3) {
                        if (i6 == i5) {
                            if (((StackLinearChartData) this.chartData).simplifiedY[i10][i4] != 0) {
                                f = lineViewData2.alpha;
                                f2 = 0.0f;
                            }
                            f2 = 0.0f;
                            f = 0.0f;
                        } else {
                            if (f4 != f3) {
                                f = (((float) ((StackLinearChartData) this.chartData).simplifiedY[i10][i4]) * lineViewData2.alpha) / f4;
                                f2 = 0.0f;
                            }
                            f2 = 0.0f;
                            f = 0.0f;
                        }
                        if (f == f2 && i10 == i7) {
                            z = true;
                        }
                        int i11 = this.pikerHeight;
                        float f7 = f * i11;
                        float f8 = (i11 - f7) - f6;
                        if (i4 == 0) {
                            i = i3;
                            lineViewData2.chartPathPicker.moveTo(0.0f, i11);
                            this.skipPoints[i10] = false;
                        } else {
                            i = i3;
                        }
                        T t3 = this.chartData;
                        j = 0;
                        if (((StackLinearChartData) t3).simplifiedY[i10][i4] == 0 && i4 > 0 && ((StackLinearChartData) t3).simplifiedY[i10][i4 - 1] == 0 && i4 < i9 && ((StackLinearChartData) t3).simplifiedY[i10][i4 + 1] == 0) {
                            if (!this.skipPoints[i10]) {
                                lineViewData2.chartPathPicker.lineTo(f5, this.pikerHeight);
                            }
                            this.skipPoints[i10] = true;
                        } else {
                            if (this.skipPoints[i10]) {
                                lineViewData2.chartPathPicker.lineTo(f5, this.pikerHeight);
                            }
                            lineViewData2.chartPathPicker.lineTo(f5, f8);
                            this.skipPoints[i10] = false;
                        }
                        if (i4 == i9) {
                            lineViewData2.chartPathPicker.lineTo(this.pickerWidth, this.pikerHeight);
                        }
                        f6 += f7;
                    } else {
                        i = i3;
                        j = 0;
                    }
                    i10++;
                    i3 = i;
                    i5 = 1;
                    f3 = 0.0f;
                }
                i4++;
            }
            if (z) {
                canvas.drawColor(Theme.getColor(Theme.key_statisticChartLineEmpty));
            }
            for (int size2 = this.lines.size() - 1; size2 >= 0; size2--) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(size2);
                canvas.drawPath(lineViewData3.chartPathPicker, lineViewData3.paint);
            }
        }
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

    @Override
    public void fillTransitionParams(org.telegram.ui.Charts.view_data.TransitionParams r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.StackLinearChartView.fillTransitionParams(org.telegram.ui.Charts.view_data.TransitionParams):void");
    }
}
