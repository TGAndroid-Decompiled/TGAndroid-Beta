package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.BarViewData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public class BarChartView extends BaseChartView {
    @Override
    protected void drawSelection(Canvas canvas) {
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
    protected void drawChart(Canvas canvas) {
        float f;
        float f2;
        int i;
        BarViewData barViewData;
        float[] fArr;
        float f3;
        long[] jArr;
        float f4;
        int i2;
        int i3;
        float f5;
        float f6;
        int i4;
        boolean z;
        int i5;
        Paint paint;
        int i6;
        float f7;
        float measuredHeight;
        Canvas canvas2 = canvas;
        ChartData chartData = this.chartData;
        if (chartData != null) {
            float f8 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f9 = chartPickerDelegate.pickerEnd;
            float f10 = chartPickerDelegate.pickerStart;
            float f11 = f8 / (f9 - f10);
            float f12 = (f10 * f11) - BaseChartView.HORIZONTAL_PADDING;
            char c = 1;
            int i7 = this.startXIndex - 1;
            int i8 = i7 < 0 ? 0 : i7;
            int length = this.endXIndex + 1;
            if (length > ((ChartData.Line) chartData.lines.get(0)).y.length - 1) {
                length = ((ChartData.Line) this.chartData.lines.get(0)).y.length - 1;
            }
            int i9 = length;
            canvas2.save();
            float f13 = 0.0f;
            canvas2.clipRect(this.chartStart, 0.0f, this.chartEnd, getMeasuredHeight() - this.chartBottom);
            canvas2.save();
            int i10 = this.transitionMode;
            int i11 = 2;
            if (i10 == 2) {
                this.postTransition = true;
                this.selectionA = 0.0f;
                TransitionParams transitionParams = this.transitionParams;
                float f14 = transitionParams.progress;
                f2 = 1.0f - f14;
                canvas2.scale((f14 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
            } else {
                if (i10 == 1) {
                    TransitionParams transitionParams2 = this.transitionParams;
                    f2 = transitionParams2.progress;
                    canvas2.scale(f2, 1.0f, transitionParams2.pX, transitionParams2.pY);
                } else {
                    f = 1.0f;
                }
                i = 0;
                while (i < this.lines.size()) {
                    barViewData = (BarViewData) this.lines.get(i);
                    if (barViewData.enabled && barViewData.alpha == f13) {
                        i2 = i;
                        i5 = i8;
                    } else {
                        fArr = this.chartData.xPercentage;
                        if (fArr.length < i11) {
                            f3 = 1.0f;
                        } else {
                            f3 = fArr[c] * f11;
                        }
                        jArr = barViewData.line.y;
                        f4 = barViewData.alpha;
                        i2 = i;
                        i3 = i8;
                        f5 = 0.0f;
                        f6 = 0.0f;
                        i4 = 0;
                        z = false;
                        while (i3 <= i9) {
                            f7 = ((f3 / 2.0f) + (this.chartData.xPercentage[i3] * f11)) - f12;
                            int i12 = i8;
                            measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((jArr[i3] / this.currentMaxHeight) * f4) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                            if (i3 == this.selectedIndex || !this.legendShowing) {
                                float[] fArr2 = barViewData.linesPath;
                                fArr2[i4] = f7;
                                fArr2[i4 + 1] = measuredHeight;
                                int i13 = i4 + 3;
                                fArr2[i4 + 2] = f7;
                                i4 += 4;
                                fArr2[i13] = getMeasuredHeight() - this.chartBottom;
                            } else {
                                f6 = measuredHeight;
                                f5 = f7;
                                z = true;
                            }
                            i3++;
                            i8 = i12;
                        }
                        i5 = i8;
                        if (!z || this.postTransition) {
                            paint = barViewData.unselectedPaint;
                        } else {
                            paint = barViewData.paint;
                        }
                        paint.setStrokeWidth(f3);
                        if (z) {
                            barViewData.unselectedPaint.setColor(ColorUtils.blendARGB(barViewData.lineColor, barViewData.blendColor, 1.0f - this.selectionA));
                        }
                        if (this.postTransition) {
                            f13 = 0.0f;
                            barViewData.unselectedPaint.setColor(ColorUtils.blendARGB(barViewData.lineColor, barViewData.blendColor, 0.0f));
                        } else {
                            f13 = 0.0f;
                        }
                        i6 = (int) (255.0f * f);
                        paint.setAlpha(i6);
                        canvas2.drawLines(barViewData.linesPath, 0, i4, paint);
                        if (z) {
                            barViewData.paint.setStrokeWidth(f3);
                            barViewData.paint.setAlpha(i6);
                            canvas2.drawLine(f5, f6, f5, getMeasuredHeight() - this.chartBottom, barViewData.paint);
                            barViewData.paint.setAlpha(255);
                        }
                    }
                    i = i2 + 1;
                    canvas2 = canvas;
                    i8 = i5;
                    c = 1;
                    i11 = 2;
                }
                canvas.restore();
                canvas.restore();
            }
            f = f2;
            i = 0;
            while (i < this.lines.size()) {
                barViewData = (BarViewData) this.lines.get(i);
                if (barViewData.enabled) {
                    fArr = this.chartData.xPercentage;
                    if (fArr.length < i11) {
                        f3 = 1.0f;
                    } else {
                        f3 = fArr[c] * f11;
                    }
                    jArr = barViewData.line.y;
                    f4 = barViewData.alpha;
                    i2 = i;
                    i3 = i8;
                    f5 = 0.0f;
                    f6 = 0.0f;
                    i4 = 0;
                    z = false;
                    while (i3 <= i9) {
                        f7 = ((f3 / 2.0f) + (this.chartData.xPercentage[i3] * f11)) - f12;
                        int i14 = i8;
                        measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((jArr[i3] / this.currentMaxHeight) * f4) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                        if (i3 == this.selectedIndex) {
                            float[] fArr3 = barViewData.linesPath;
                            fArr3[i4] = f7;
                            fArr3[i4 + 1] = measuredHeight;
                            int i15 = i4 + 3;
                            fArr3[i4 + 2] = f7;
                            i4 += 4;
                            fArr3[i15] = getMeasuredHeight() - this.chartBottom;
                        } else {
                            float[] fArr4 = barViewData.linesPath;
                            fArr4[i4] = f7;
                            fArr4[i4 + 1] = measuredHeight;
                            int i16 = i4 + 3;
                            fArr4[i4 + 2] = f7;
                            i4 += 4;
                            fArr4[i16] = getMeasuredHeight() - this.chartBottom;
                        }
                        i3++;
                        i8 = i14;
                    }
                    i5 = i8;
                    if (z) {
                        paint = barViewData.unselectedPaint;
                    } else {
                        paint = barViewData.unselectedPaint;
                    }
                    paint.setStrokeWidth(f3);
                    if (z) {
                        barViewData.unselectedPaint.setColor(ColorUtils.blendARGB(barViewData.lineColor, barViewData.blendColor, 1.0f - this.selectionA));
                    }
                    if (this.postTransition) {
                        f13 = 0.0f;
                        barViewData.unselectedPaint.setColor(ColorUtils.blendARGB(barViewData.lineColor, barViewData.blendColor, 0.0f));
                    } else {
                        f13 = 0.0f;
                    }
                    i6 = (int) (255.0f * f);
                    paint.setAlpha(i6);
                    canvas2.drawLines(barViewData.linesPath, 0, i4, paint);
                    if (z) {
                        barViewData.paint.setStrokeWidth(f3);
                        barViewData.paint.setAlpha(i6);
                        canvas2.drawLine(f5, f6, f5, getMeasuredHeight() - this.chartBottom, barViewData.paint);
                        barViewData.paint.setAlpha(255);
                    }
                } else {
                    fArr = this.chartData.xPercentage;
                    if (fArr.length < i11) {
                        f3 = 1.0f;
                    } else {
                        f3 = fArr[c] * f11;
                    }
                    jArr = barViewData.line.y;
                    f4 = barViewData.alpha;
                    i2 = i;
                    i3 = i8;
                    f5 = 0.0f;
                    f6 = 0.0f;
                    i4 = 0;
                    z = false;
                    while (i3 <= i9) {
                        f7 = ((f3 / 2.0f) + (this.chartData.xPercentage[i3] * f11)) - f12;
                        int i17 = i8;
                        measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((jArr[i3] / this.currentMaxHeight) * f4) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                        if (i3 == this.selectedIndex) {
                            float[] fArr5 = barViewData.linesPath;
                            fArr5[i4] = f7;
                            fArr5[i4 + 1] = measuredHeight;
                            int i18 = i4 + 3;
                            fArr5[i4 + 2] = f7;
                            i4 += 4;
                            fArr5[i18] = getMeasuredHeight() - this.chartBottom;
                        } else {
                            float[] fArr6 = barViewData.linesPath;
                            fArr6[i4] = f7;
                            fArr6[i4 + 1] = measuredHeight;
                            int i19 = i4 + 3;
                            fArr6[i4 + 2] = f7;
                            i4 += 4;
                            fArr6[i19] = getMeasuredHeight() - this.chartBottom;
                        }
                        i3++;
                        i8 = i17;
                    }
                    i5 = i8;
                    if (z) {
                        paint = barViewData.unselectedPaint;
                    } else {
                        paint = barViewData.unselectedPaint;
                    }
                    paint.setStrokeWidth(f3);
                    if (z) {
                        barViewData.unselectedPaint.setColor(ColorUtils.blendARGB(barViewData.lineColor, barViewData.blendColor, 1.0f - this.selectionA));
                    }
                    if (this.postTransition) {
                        f13 = 0.0f;
                        barViewData.unselectedPaint.setColor(ColorUtils.blendARGB(barViewData.lineColor, barViewData.blendColor, 0.0f));
                    } else {
                        f13 = 0.0f;
                    }
                    i6 = (int) (255.0f * f);
                    paint.setAlpha(i6);
                    canvas2.drawLines(barViewData.linesPath, 0, i4, paint);
                    if (z) {
                        barViewData.paint.setStrokeWidth(f3);
                        barViewData.paint.setAlpha(i6);
                        canvas2.drawLine(f5, f6, f5, getMeasuredHeight() - this.chartBottom, barViewData.paint);
                        barViewData.paint.setAlpha(255);
                    }
                }
                i = i2 + 1;
                canvas2 = canvas;
                i8 = i5;
                c = 1;
                i11 = 2;
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int i;
        int i2;
        int i3;
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
                    float f = fArr.length < 2 ? 1.0f : fArr[1] * this.pickerWidth;
                    long[] jArr = barViewData.line.y;
                    float f2 = barViewData.alpha;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        long j = jArr[i7];
                        if (j < 0) {
                            i3 = i5;
                            size = size;
                        } else {
                            ChartData chartData = this.chartData;
                            i3 = i5;
                            float f3 = chartData.xPercentage[i7] * this.pickerWidth;
                            float f4 = (1.0f - ((j / (BaseChartView.ANIMATE_PICKER_SIZES ? this.pickerMaxHeight : chartData.maxValue)) * f2)) * (i3 - measuredHeight2);
                            float[] fArr2 = barViewData.linesPath;
                            fArr2[i8] = f3;
                            fArr2[i8 + 1] = f4;
                            int i9 = i8 + 3;
                            fArr2[i8 + 2] = f3;
                            i8 += 4;
                            fArr2[i9] = getMeasuredHeight() - this.chartBottom;
                        }
                        i7++;
                        i5 = i3;
                        size = size;
                    }
                    i = i5;
                    i2 = size;
                    barViewData.paint.setStrokeWidth(f + 2.0f);
                    canvas.drawLines(barViewData.linesPath, 0, i8, barViewData.paint);
                } else {
                    i = i5;
                    i2 = size;
                }
                i6++;
                i5 = i;
                size = i2;
            }
        }
    }

    @Override
    public BarViewData createLineViewData(ChartData.Line line) {
        return new BarViewData(line, this.resourcesProvider);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        tick();
        drawChart(canvas);
        drawBottomLine(canvas);
        this.tmpN = this.horizontalLines.size();
        int i = 0;
        while (true) {
            this.tmpI = i;
            int i2 = this.tmpI;
            if (i2 < this.tmpN) {
                drawHorizontalLines(canvas, (ChartHorizontalLinesData) this.horizontalLines.get(i2));
                drawSignaturesToHorizontalLines(canvas, (ChartHorizontalLinesData) this.horizontalLines.get(this.tmpI));
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
