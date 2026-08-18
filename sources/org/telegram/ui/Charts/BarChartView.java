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
        float f5;
        float f6;
        boolean z;
        Paint paint;
        int i3;
        float f7;
        float measuredHeight;
        ChartData chartData = this.chartData;
        if (chartData != null) {
            float f8 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f9 = chartPickerDelegate.pickerEnd;
            float f10 = chartPickerDelegate.pickerStart;
            float f11 = f8 / (f9 - f10);
            float f12 = (f10 * f11) - BaseChartView.HORIZONTAL_PADDING;
            char c = 1;
            int i4 = this.startXIndex - 1;
            int i5 = 0;
            int i6 = i4 < 0 ? 0 : i4;
            int length = this.endXIndex + 1;
            if (length > ((ChartData.Line) chartData.lines.get(0)).y.length - 1) {
                length = ((ChartData.Line) this.chartData.lines.get(0)).y.length - 1;
            }
            int i7 = length;
            canvas.save();
            float f13 = 0.0f;
            canvas.clipRect(this.chartStart, 0.0f, this.chartEnd, getMeasuredHeight() - this.chartBottom);
            canvas.save();
            int i8 = this.transitionMode;
            float f14 = 2.0f;
            int i9 = 2;
            if (i8 == 2) {
                this.postTransition = true;
                this.selectionA = 0.0f;
                TransitionParams transitionParams = this.transitionParams;
                float f15 = transitionParams.progress;
                f2 = 1.0f - f15;
                canvas.scale((f15 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
            } else {
                if (i8 == 1) {
                    TransitionParams transitionParams2 = this.transitionParams;
                    f2 = transitionParams2.progress;
                    canvas.scale(f2, 1.0f, transitionParams2.pX, transitionParams2.pY);
                } else {
                    f = 1.0f;
                }
                i = 0;
                while (i < this.lines.size()) {
                    barViewData = (BarViewData) this.lines.get(i);
                    if (!barViewData.enabled || barViewData.alpha != f13) {
                        fArr = this.chartData.xPercentage;
                        if (fArr.length < i9) {
                            f3 = 1.0f;
                        } else {
                            f3 = fArr[c] * f11;
                        }
                        jArr = barViewData.line.y;
                        f4 = barViewData.alpha;
                        i2 = i6;
                        f5 = 0.0f;
                        f6 = 0.0f;
                        z = false;
                        while (i2 <= i7) {
                            f7 = ((f3 / f14) + (this.chartData.xPercentage[i2] * f11)) - f12;
                            long[] jArr2 = jArr;
                            measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((jArr[i2] / this.currentMaxHeight) * f4) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                            if (i2 == this.selectedIndex || !this.legendShowing) {
                                float[] fArr2 = barViewData.linesPath;
                                fArr2[i5] = f7;
                                fArr2[i5 + 1] = measuredHeight;
                                int i10 = i5 + 3;
                                fArr2[i5 + 2] = f7;
                                i5 += 4;
                                fArr2[i10] = getMeasuredHeight() - this.chartBottom;
                            } else {
                                f5 = measuredHeight;
                                f6 = f7;
                                z = true;
                            }
                            i2++;
                            jArr = jArr2;
                            f14 = 2.0f;
                        }
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
                        i3 = (int) (255.0f * f);
                        paint.setAlpha(i3);
                        canvas.drawLines(barViewData.linesPath, 0, i5, paint);
                        if (z) {
                            barViewData.paint.setStrokeWidth(f3);
                            barViewData.paint.setAlpha(i3);
                            float measuredHeight2 = getMeasuredHeight() - this.chartBottom;
                            Paint paint2 = barViewData.paint;
                            float f16 = f5;
                            i = i;
                            canvas.drawLine(f6, f16, f6, measuredHeight2, paint2);
                            barViewData.paint.setAlpha(255);
                        }
                        i++;
                        i9 = 2;
                        c = 1;
                        i5 = 0;
                        f14 = 2.0f;
                    }
                    i++;
                    i9 = 2;
                    c = 1;
                    i5 = 0;
                    f14 = 2.0f;
                }
                canvas.restore();
                canvas.restore();
            }
            f = f2;
            i = 0;
            while (i < this.lines.size()) {
                barViewData = (BarViewData) this.lines.get(i);
                if (!barViewData.enabled) {
                    fArr = this.chartData.xPercentage;
                    if (fArr.length < i9) {
                        f3 = 1.0f;
                    } else {
                        f3 = fArr[c] * f11;
                    }
                    jArr = barViewData.line.y;
                    f4 = barViewData.alpha;
                    i2 = i6;
                    f5 = 0.0f;
                    f6 = 0.0f;
                    z = false;
                    while (i2 <= i7) {
                        f7 = ((f3 / f14) + (this.chartData.xPercentage[i2] * f11)) - f12;
                        long[] jArr3 = jArr;
                        measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((jArr[i2] / this.currentMaxHeight) * f4) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                        if (i2 == this.selectedIndex) {
                            float[] fArr3 = barViewData.linesPath;
                            fArr3[i5] = f7;
                            fArr3[i5 + 1] = measuredHeight;
                            int i11 = i5 + 3;
                            fArr3[i5 + 2] = f7;
                            i5 += 4;
                            fArr3[i11] = getMeasuredHeight() - this.chartBottom;
                        } else {
                            float[] fArr4 = barViewData.linesPath;
                            fArr4[i5] = f7;
                            fArr4[i5 + 1] = measuredHeight;
                            int i12 = i5 + 3;
                            fArr4[i5 + 2] = f7;
                            i5 += 4;
                            fArr4[i12] = getMeasuredHeight() - this.chartBottom;
                        }
                        i2++;
                        jArr = jArr3;
                        f14 = 2.0f;
                    }
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
                    i3 = (int) (255.0f * f);
                    paint.setAlpha(i3);
                    canvas.drawLines(barViewData.linesPath, 0, i5, paint);
                    if (z) {
                        barViewData.paint.setStrokeWidth(f3);
                        barViewData.paint.setAlpha(i3);
                        float measuredHeight3 = getMeasuredHeight() - this.chartBottom;
                        Paint paint3 = barViewData.paint;
                        float f17 = f5;
                        i = i;
                        canvas.drawLine(f6, f17, f6, measuredHeight3, paint3);
                        barViewData.paint.setAlpha(255);
                    }
                } else {
                    fArr = this.chartData.xPercentage;
                    if (fArr.length < i9) {
                        f3 = 1.0f;
                    } else {
                        f3 = fArr[c] * f11;
                    }
                    jArr = barViewData.line.y;
                    f4 = barViewData.alpha;
                    i2 = i6;
                    f5 = 0.0f;
                    f6 = 0.0f;
                    z = false;
                    while (i2 <= i7) {
                        f7 = ((f3 / f14) + (this.chartData.xPercentage[i2] * f11)) - f12;
                        long[] jArr4 = jArr;
                        measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((jArr[i2] / this.currentMaxHeight) * f4) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                        if (i2 == this.selectedIndex) {
                            float[] fArr5 = barViewData.linesPath;
                            fArr5[i5] = f7;
                            fArr5[i5 + 1] = measuredHeight;
                            int i13 = i5 + 3;
                            fArr5[i5 + 2] = f7;
                            i5 += 4;
                            fArr5[i13] = getMeasuredHeight() - this.chartBottom;
                        } else {
                            float[] fArr6 = barViewData.linesPath;
                            fArr6[i5] = f7;
                            fArr6[i5 + 1] = measuredHeight;
                            int i14 = i5 + 3;
                            fArr6[i5 + 2] = f7;
                            i5 += 4;
                            fArr6[i14] = getMeasuredHeight() - this.chartBottom;
                        }
                        i2++;
                        jArr = jArr4;
                        f14 = 2.0f;
                    }
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
                    i3 = (int) (255.0f * f);
                    paint.setAlpha(i3);
                    canvas.drawLines(barViewData.linesPath, 0, i5, paint);
                    if (z) {
                        barViewData.paint.setStrokeWidth(f3);
                        barViewData.paint.setAlpha(i3);
                        float measuredHeight4 = getMeasuredHeight() - this.chartBottom;
                        Paint paint4 = barViewData.paint;
                        float f18 = f5;
                        i = i;
                        canvas.drawLine(f6, f18, f6, measuredHeight4, paint4);
                        barViewData.paint.setAlpha(255);
                    }
                }
                i++;
                i9 = 2;
                c = 1;
                i5 = 0;
                f14 = 2.0f;
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        int i;
        int measuredHeight = getMeasuredHeight();
        int i2 = BaseChartView.PICKER_PADDING;
        int i3 = measuredHeight - i2;
        int measuredHeight2 = (getMeasuredHeight() - this.pikerHeight) - i2;
        int size = this.lines.size();
        if (this.chartData != null) {
            int i4 = 0;
            while (i4 < size) {
                BarViewData barViewData = (BarViewData) this.lines.get(i4);
                if (barViewData.enabled || barViewData.alpha != 0.0f) {
                    barViewData.bottomLinePath.reset();
                    float[] fArr = this.chartData.xPercentage;
                    int length = fArr.length;
                    float f = fArr.length < 2 ? 1.0f : fArr[1] * this.pickerWidth;
                    long[] jArr = barViewData.line.y;
                    float f2 = barViewData.alpha;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length) {
                        long j = jArr[i5];
                        if (j < 0) {
                            length = length;
                            jArr = jArr;
                        } else {
                            ChartData chartData = this.chartData;
                            float f3 = chartData.xPercentage[i5] * this.pickerWidth;
                            float f4 = (1.0f - ((j / (BaseChartView.ANIMATE_PICKER_SIZES ? this.pickerMaxHeight : chartData.maxValue)) * f2)) * (i3 - measuredHeight2);
                            float[] fArr2 = barViewData.linesPath;
                            fArr2[i6] = f3;
                            fArr2[i6 + 1] = f4;
                            int i7 = i6 + 3;
                            fArr2[i6 + 2] = f3;
                            i6 += 4;
                            fArr2[i7] = getMeasuredHeight() - this.chartBottom;
                        }
                        i5++;
                        length = length;
                        size = size;
                        jArr = jArr;
                    }
                    i = size;
                    barViewData.paint.setStrokeWidth(f + 2.0f);
                    canvas.drawLines(barViewData.linesPath, 0, i6, barViewData.paint);
                } else {
                    i = size;
                }
                i4++;
                size = i;
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
