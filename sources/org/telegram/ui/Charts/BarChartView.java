package org.telegram.ui.Charts;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.BarViewData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public final class BarChartView extends BaseChartView {
    @Override
    public final LineViewData createLineViewData(ChartData.Line line) {
        return new BarViewData(line, this.resourcesProvider);
    }

    @Override
    public final void drawChart(Canvas canvas) {
        float f;
        float f2;
        int i;
        ArrayList arrayList;
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
        float[] fArr2;
        float f7;
        Paint paint;
        Paint paint2;
        Paint paint3;
        int i5;
        float f8;
        int i6;
        float f9;
        float measuredHeight;
        Canvas canvas2 = canvas;
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        float f10 = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f11 = chartPickerDelegate.pickerEnd;
        float f12 = chartPickerDelegate.pickerStart;
        float f13 = f10 / (f11 - f12);
        float f14 = (f12 * f13) - BaseChartView.HORIZONTAL_PADDING;
        char c = 1;
        int i7 = this.startXIndex - 1;
        int i8 = i7 < 0 ? 0 : i7;
        int length = this.endXIndex + 1;
        if (length > ((ChartData.Line) chartData.lines.get(0)).y.length - 1) {
            length = ((ChartData.Line) this.chartData.lines.get(0)).y.length - 1;
        }
        int i9 = length;
        canvas2.save();
        float f15 = 0.0f;
        canvas2.clipRect(this.chartStart, 0.0f, this.chartEnd, getMeasuredHeight() - this.chartBottom);
        canvas2.save();
        int i10 = this.transitionMode;
        int i11 = 2;
        if (i10 == 2) {
            this.postTransition = true;
            this.selectionA = 0.0f;
            TransitionParams transitionParams = this.transitionParams;
            float f16 = transitionParams.progress;
            f2 = 1.0f - f16;
            canvas2.scale((f16 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
        } else {
            if (i10 == 1) {
                TransitionParams transitionParams2 = this.transitionParams;
                f2 = transitionParams2.progress;
                canvas2.scale(f2, 1.0f, transitionParams2.pX, transitionParams2.pY);
            } else {
                f = 1.0f;
            }
            i = 0;
            while (true) {
                arrayList = this.lines;
                if (i < arrayList.size()) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                barViewData = (BarViewData) arrayList.get(i);
                if (barViewData.enabled && barViewData.alpha == f15) {
                    i2 = i;
                } else {
                    fArr = this.chartData.xPercentage;
                    if (fArr.length < i11) {
                        f3 = 1.0f;
                    } else {
                        f3 = fArr[c] * f13;
                    }
                    jArr = barViewData.line.y;
                    f4 = barViewData.alpha;
                    i2 = i;
                    i3 = i8;
                    f5 = 0.0f;
                    f6 = 0.0f;
                    i4 = 0;
                    z = false;
                    while (true) {
                        fArr2 = barViewData.linesPath;
                        if (i3 > i9) {
                            break;
                        }
                        f8 = ((this.chartData.xPercentage[i3] * f13) + (f3 / 2.0f)) - f14;
                        i6 = i4;
                        f9 = f5;
                        measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((jArr[i3] / this.currentMaxHeight) * f4) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                        if (i3 == this.selectedIndex || !this.legendShowing) {
                            fArr2[i6] = f8;
                            fArr2[i6 + 1] = measuredHeight;
                            fArr2[i6 + 2] = f8;
                            fArr2[i6 + 3] = getMeasuredHeight() - this.chartBottom;
                            i4 = i6 + 4;
                            f5 = f9;
                        } else {
                            f6 = measuredHeight;
                            f5 = f8;
                            i4 = i6;
                            z = true;
                        }
                        i3++;
                    }
                    f7 = f5;
                    int i12 = i4;
                    paint = barViewData.unselectedPaint;
                    paint2 = barViewData.paint;
                    if (!z || this.postTransition) {
                        paint3 = paint;
                    } else {
                        paint3 = paint2;
                    }
                    paint3.setStrokeWidth(f3);
                    if (z) {
                        paint.setColor(ColorUtils.blendARGB(1.0f - this.selectionA, barViewData.lineColor, barViewData.blendColor));
                    }
                    if (this.postTransition) {
                        f15 = 0.0f;
                        paint.setColor(ColorUtils.blendARGB(0.0f, barViewData.lineColor, barViewData.blendColor));
                    } else {
                        f15 = 0.0f;
                    }
                    i5 = (int) (255.0f * f);
                    paint3.setAlpha(i5);
                    canvas2.drawLines(fArr2, 0, i12, paint3);
                    if (z) {
                        paint2.setStrokeWidth(f3);
                        paint2.setAlpha(i5);
                        canvas2.drawLine(f7, f6, f7, getMeasuredHeight() - this.chartBottom, paint2);
                        paint2.setAlpha(255);
                    }
                }
                i = i2 + 1;
                canvas2 = canvas;
                c = 1;
                i11 = 2;
            }
        }
        f = f2;
        i = 0;
        while (true) {
            arrayList = this.lines;
            if (i < arrayList.size()) {
                canvas.restore();
                canvas.restore();
                return;
            }
            barViewData = (BarViewData) arrayList.get(i);
            if (barViewData.enabled) {
                fArr = this.chartData.xPercentage;
                if (fArr.length < i11) {
                    f3 = 1.0f;
                } else {
                    f3 = fArr[c] * f13;
                }
                jArr = barViewData.line.y;
                f4 = barViewData.alpha;
                i2 = i;
                i3 = i8;
                f5 = 0.0f;
                f6 = 0.0f;
                i4 = 0;
                z = false;
                while (true) {
                    fArr2 = barViewData.linesPath;
                    if (i3 > i9) {
                        break;
                        break;
                    }
                    f8 = ((this.chartData.xPercentage[i3] * f13) + (f3 / 2.0f)) - f14;
                    i6 = i4;
                    f9 = f5;
                    measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((jArr[i3] / this.currentMaxHeight) * f4) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                    if (i3 == this.selectedIndex) {
                        fArr2[i6] = f8;
                        fArr2[i6 + 1] = measuredHeight;
                        fArr2[i6 + 2] = f8;
                        fArr2[i6 + 3] = getMeasuredHeight() - this.chartBottom;
                        i4 = i6 + 4;
                        f5 = f9;
                    } else {
                        fArr2[i6] = f8;
                        fArr2[i6 + 1] = measuredHeight;
                        fArr2[i6 + 2] = f8;
                        fArr2[i6 + 3] = getMeasuredHeight() - this.chartBottom;
                        i4 = i6 + 4;
                        f5 = f9;
                    }
                    i3++;
                }
                f7 = f5;
                int i13 = i4;
                paint = barViewData.unselectedPaint;
                paint2 = barViewData.paint;
                if (z) {
                    paint3 = paint;
                } else {
                    paint3 = paint;
                }
                paint3.setStrokeWidth(f3);
                if (z) {
                    paint.setColor(ColorUtils.blendARGB(1.0f - this.selectionA, barViewData.lineColor, barViewData.blendColor));
                }
                if (this.postTransition) {
                    f15 = 0.0f;
                    paint.setColor(ColorUtils.blendARGB(0.0f, barViewData.lineColor, barViewData.blendColor));
                } else {
                    f15 = 0.0f;
                }
                i5 = (int) (255.0f * f);
                paint3.setAlpha(i5);
                canvas2.drawLines(fArr2, 0, i13, paint3);
                if (z) {
                    paint2.setStrokeWidth(f3);
                    paint2.setAlpha(i5);
                    canvas2.drawLine(f7, f6, f7, getMeasuredHeight() - this.chartBottom, paint2);
                    paint2.setAlpha(255);
                }
            } else {
                fArr = this.chartData.xPercentage;
                if (fArr.length < i11) {
                    f3 = 1.0f;
                } else {
                    f3 = fArr[c] * f13;
                }
                jArr = barViewData.line.y;
                f4 = barViewData.alpha;
                i2 = i;
                i3 = i8;
                f5 = 0.0f;
                f6 = 0.0f;
                i4 = 0;
                z = false;
                while (true) {
                    fArr2 = barViewData.linesPath;
                    if (i3 > i9) {
                        break;
                        break;
                    }
                    f8 = ((this.chartData.xPercentage[i3] * f13) + (f3 / 2.0f)) - f14;
                    i6 = i4;
                    f9 = f5;
                    measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((jArr[i3] / this.currentMaxHeight) * f4) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                    if (i3 == this.selectedIndex) {
                        fArr2[i6] = f8;
                        fArr2[i6 + 1] = measuredHeight;
                        fArr2[i6 + 2] = f8;
                        fArr2[i6 + 3] = getMeasuredHeight() - this.chartBottom;
                        i4 = i6 + 4;
                        f5 = f9;
                    } else {
                        fArr2[i6] = f8;
                        fArr2[i6 + 1] = measuredHeight;
                        fArr2[i6 + 2] = f8;
                        fArr2[i6 + 3] = getMeasuredHeight() - this.chartBottom;
                        i4 = i6 + 4;
                        f5 = f9;
                    }
                    i3++;
                }
                f7 = f5;
                int i14 = i4;
                paint = barViewData.unselectedPaint;
                paint2 = barViewData.paint;
                if (z) {
                    paint3 = paint;
                } else {
                    paint3 = paint;
                }
                paint3.setStrokeWidth(f3);
                if (z) {
                    paint.setColor(ColorUtils.blendARGB(1.0f - this.selectionA, barViewData.lineColor, barViewData.blendColor));
                }
                if (this.postTransition) {
                    f15 = 0.0f;
                    paint.setColor(ColorUtils.blendARGB(0.0f, barViewData.lineColor, barViewData.blendColor));
                } else {
                    f15 = 0.0f;
                }
                i5 = (int) (255.0f * f);
                paint3.setAlpha(i5);
                canvas2.drawLines(fArr2, 0, i14, paint3);
                if (z) {
                    paint2.setStrokeWidth(f3);
                    paint2.setAlpha(i5);
                    canvas2.drawLine(f7, f6, f7, getMeasuredHeight() - this.chartBottom, paint2);
                    paint2.setAlpha(255);
                }
            }
            i = i2 + 1;
            canvas2 = canvas;
            c = 1;
            i11 = 2;
        }
    }

    @Override
    public final void drawPickerChart(Canvas canvas) {
        float[] fArr;
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int measuredHeight = getMeasuredHeight();
        int i4 = BaseChartView.PICKER_PADDING;
        int i5 = measuredHeight - i4;
        int measuredHeight2 = (getMeasuredHeight() - this.pikerHeight) - i4;
        ArrayList arrayList2 = this.lines;
        int size = arrayList2.size();
        if (this.chartData != null) {
            int i6 = 0;
            while (i6 < size) {
                BarViewData barViewData = (BarViewData) arrayList2.get(i6);
                if (barViewData.enabled || barViewData.alpha != 0.0f) {
                    barViewData.bottomLinePath.reset();
                    float[] fArr2 = this.chartData.xPercentage;
                    int length = fArr2.length;
                    float f = fArr2.length < 2 ? 1.0f : fArr2[1] * this.pickerWidth;
                    long[] jArr = barViewData.line.y;
                    float f2 = barViewData.alpha;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        fArr = barViewData.linesPath;
                        if (i7 >= length) {
                            break;
                        }
                        int i9 = i6;
                        long j = jArr[i7];
                        if (j < 0) {
                            i3 = i5;
                            arrayList2 = arrayList2;
                        } else {
                            ChartData chartData = this.chartData;
                            i3 = i5;
                            float f3 = this.pickerWidth * chartData.xPercentage[i7];
                            float fM = TextureRenderer$$ExternalSyntheticOutline0.m(j, BaseChartView.ANIMATE_PICKER_SIZES ? this.pickerMaxHeight : chartData.maxValue, f2, 1.0f) * (i3 - measuredHeight2);
                            fArr[i8] = f3;
                            fArr[i8 + 1] = fM;
                            int i10 = i8 + 3;
                            fArr[i8 + 2] = f3;
                            i8 += 4;
                            fArr[i10] = getMeasuredHeight() - this.chartBottom;
                        }
                        i7++;
                        i6 = i9;
                        i5 = i3;
                        arrayList2 = arrayList2;
                    }
                    i = i5;
                    arrayList = arrayList2;
                    i2 = i6;
                    Paint paint = barViewData.paint;
                    paint.setStrokeWidth(f + 2.0f);
                    canvas.drawLines(fArr, 0, i8, paint);
                } else {
                    i = i5;
                    arrayList = arrayList2;
                    i2 = i6;
                }
                i6 = i2 + 1;
                i5 = i;
                arrayList2 = arrayList;
            }
        }
    }

    @Override
    public final void drawSelection(Canvas canvas) {
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        tick();
        drawChart(canvas);
        drawBottomLine(canvas);
        ArrayList arrayList = this.horizontalLines;
        this.tmpN = arrayList.size();
        this.tmpI = 0;
        while (true) {
            int i = this.tmpI;
            if (i >= this.tmpN) {
                drawBottomSignature(canvas);
                drawPicker(canvas);
                super.onDraw(canvas);
                return;
            } else {
                drawHorizontalLines(canvas, (ChartHorizontalLinesData) arrayList.get(i));
                drawSignaturesToHorizontalLines(canvas, (ChartHorizontalLinesData) arrayList.get(this.tmpI));
                this.tmpI++;
            }
        }
    }
}
