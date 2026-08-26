package org.telegram.ui.Charts;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.DoubleLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public final class DoubleLinearChartView extends BaseChartView {
    @Override
    public final ChartHorizontalLinesData createHorizontalLinesData(int i, long j, long j2) {
        float f;
        float[] fArr = ((DoubleLinearChartData) this.chartData).linesK;
        if (fArr.length < 2) {
            f = 1.0f;
        } else {
            f = fArr[fArr[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new ChartHorizontalLinesData(j, j2, this.useMinHeight, f, i, this.signaturePaint, this.signaturePaint2);
    }

    @Override
    public final LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, false, this.resourcesProvider);
    }

    @Override
    public final void drawChart(Canvas canvas) {
        float f;
        Paint paint;
        boolean z;
        float[] fArr;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        boolean z2;
        if (this.chartData == null) {
            return;
        }
        float f6 = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f7 = chartPickerDelegate.pickerEnd;
        float f8 = chartPickerDelegate.pickerStart;
        float f9 = f6 / (f7 - f8);
        float f10 = BaseChartView.HORIZONTAL_PADDING;
        float f11 = (f8 * f9) - f10;
        canvas.save();
        int i2 = this.transitionMode;
        int i3 = 2;
        float f12 = 0.0f;
        if (i2 == 2) {
            TransitionParams transitionParams = this.transitionParams;
            float f13 = transitionParams.progress;
            f = f13 > 0.5f ? 0.0f : 1.0f - (f13 * 2.0f);
            canvas.scale((f13 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
        } else if (i2 == 1) {
            float f14 = this.transitionParams.progress;
            f = f14 < 0.3f ? 0.0f : f14;
            canvas.save();
            TransitionParams transitionParams2 = this.transitionParams;
            float f15 = transitionParams2.progress;
            canvas.scale(f15, f15, transitionParams2.pX, transitionParams2.pY);
        } else {
            f = i2 == 3 ? this.transitionParams.progress : 1.0f;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.lines;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            LineViewData lineViewData = (LineViewData) arrayList.get(i5);
            if (lineViewData.enabled || lineViewData.alpha != f12) {
                long[] jArr = lineViewData.line.y;
                Path path = lineViewData.chartPath;
                path.reset();
                float[] fArr2 = ((DoubleLinearChartData) this.chartData).xPercentage;
                int i6 = ((int) (f10 / (fArr2.length < i3 ? 1.0f : fArr2[1] * f9))) + 1;
                int iMax = Math.max(i4, this.startXIndex - i6);
                int iMin = Math.min(((DoubleLinearChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i6);
                boolean z3 = true;
                int i7 = 0;
                while (true) {
                    paint = lineViewData.paint;
                    z = BaseChartView.USE_LINES;
                    fArr = lineViewData.linesPath;
                    if (iMax > iMin) {
                        break;
                    }
                    float f16 = f9;
                    float f17 = f11;
                    long j = jArr[iMax];
                    if (j < 0) {
                        f5 = f10;
                        i = iMin;
                        z2 = z3;
                    } else {
                        f5 = f10;
                        DoubleLinearChartData doubleLinearChartData = (DoubleLinearChartData) this.chartData;
                        i = iMin;
                        float f18 = (doubleLinearChartData.xPercentage[iMax] * f16) - f17;
                        float f19 = j * doubleLinearChartData.linesK[i5];
                        float f20 = this.currentMinHeight;
                        float f21 = (f19 - f20) / (this.currentMaxHeight - f20);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        z2 = z3;
                        float fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT, strokeWidth, f21, (getMeasuredHeight() - this.chartBottom) - strokeWidth);
                        if (!z) {
                            if (z2) {
                                path.moveTo(f18, fM);
                                z3 = false;
                            } else {
                                path.lineTo(f18, fM);
                            }
                            iMax++;
                            f9 = f16;
                            f11 = f17;
                            f10 = f5;
                            iMin = i;
                        } else if (i7 == 0) {
                            int i8 = i7 + 1;
                            fArr[i7] = f18;
                            i7 += 2;
                            fArr[i8] = fM;
                        } else {
                            fArr[i7] = f18;
                            fArr[i7 + 1] = fM;
                            int i9 = i7 + 3;
                            fArr[i7 + 2] = f18;
                            i7 += 4;
                            fArr[i9] = fM;
                        }
                    }
                    z3 = z2;
                    iMax++;
                    f9 = f16;
                    f11 = f17;
                    f10 = f5;
                    iMin = i;
                }
                f2 = f9;
                f3 = f11;
                f4 = f10;
                if (this.endXIndex - this.startXIndex > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                paint.setAlpha((int) (lineViewData.alpha * 255.0f * f));
                if (z) {
                    canvas.drawLines(fArr, 0, i7, paint);
                } else {
                    canvas.drawPath(path, paint);
                }
            } else {
                f2 = f9;
                f3 = f11;
                f4 = f10;
            }
            i5++;
            f9 = f2;
            f11 = f3;
            f10 = f4;
            i4 = 0;
            i3 = 2;
            f12 = 0.0f;
        }
    }

    @Override
    public final void drawPickerChart(Canvas canvas) {
        boolean z;
        float[] fArr;
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList2;
        int measuredHeight = getMeasuredHeight();
        int i6 = BaseChartView.PICKER_PADDING;
        int i7 = measuredHeight - i6;
        int measuredHeight2 = (getMeasuredHeight() - this.pikerHeight) - i6;
        ArrayList arrayList3 = this.lines;
        int size = arrayList3.size();
        if (this.chartData != null) {
            int i8 = 0;
            while (i8 < size) {
                LineViewData lineViewData = (LineViewData) arrayList3.get(i8);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    Path path = lineViewData.bottomLinePath;
                    path.reset();
                    int length = ((DoubleLinearChartData) this.chartData).xPercentage.length;
                    long[] jArr = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        z = BaseChartView.USE_LINES;
                        fArr = lineViewData.linesPathBottom;
                        if (i9 >= length) {
                            break;
                        }
                        int i11 = i8;
                        long j = jArr[i9];
                        if (j < 0) {
                            i5 = i7;
                            arrayList2 = arrayList3;
                            measuredHeight2 = measuredHeight2;
                            size = size;
                        } else {
                            i5 = i7;
                            DoubleLinearChartData doubleLinearChartData = (DoubleLinearChartData) this.chartData;
                            arrayList2 = arrayList3;
                            float f = this.pickerWidth * doubleLinearChartData.xPercentage[i9];
                            float f2 = (1.0f - ((j * doubleLinearChartData.linesK[i11]) / (BaseChartView.ANIMATE_PICKER_SIZES ? this.pickerMaxHeight : doubleLinearChartData.maxValue))) * (i5 - measuredHeight2);
                            if (z) {
                                if (i10 == 0) {
                                    int i12 = i10 + 1;
                                    fArr[i10] = f;
                                    i10 += 2;
                                    fArr[i12] = f2;
                                } else {
                                    fArr[i10] = f;
                                    fArr[i10 + 1] = f2;
                                    int i13 = i10 + 3;
                                    fArr[i10 + 2] = f;
                                    i10 += 4;
                                    fArr[i13] = f2;
                                }
                            } else if (i9 == 0) {
                                path.moveTo(f, f2);
                            } else {
                                path.lineTo(f, f2);
                            }
                        }
                        i9++;
                        i8 = i11;
                        i7 = i5;
                        arrayList3 = arrayList2;
                        measuredHeight2 = measuredHeight2;
                        size = size;
                    }
                    i = i7;
                    arrayList = arrayList3;
                    i2 = measuredHeight2;
                    i3 = size;
                    i4 = i8;
                    lineViewData.linesPathBottomSize = i10;
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        Paint paint = lineViewData.bottomLinePaint;
                        paint.setAlpha((int) (lineViewData.alpha * 255.0f));
                        if (z) {
                            canvas.drawLines(fArr, 0, lineViewData.linesPathBottomSize, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                    i8 = i4 + 1;
                    i7 = i;
                    arrayList3 = arrayList;
                    measuredHeight2 = i2;
                    size = i3;
                } else {
                    i = i7;
                    arrayList = arrayList3;
                    i2 = measuredHeight2;
                    i3 = size;
                    i4 = i8;
                }
                i8 = i4 + 1;
                i7 = i;
                arrayList3 = arrayList;
                measuredHeight2 = i2;
                size = i3;
            }
        }
    }

    @Override
    public final void drawSelection(Canvas canvas) {
        int i = this.selectedIndex;
        if (i < 0 || !this.legendShowing) {
            return;
        }
        int i2 = (int) (this.chartActiveLineAlpha * this.selectionA);
        float f = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f2 = chartPickerDelegate.pickerEnd;
        float f3 = chartPickerDelegate.pickerStart;
        float f4 = f / (f2 - f3);
        float f5 = (((DoubleLinearChartData) this.chartData).xPercentage[i] * f4) - ((f3 * f4) - BaseChartView.HORIZONTAL_PADDING);
        Paint paint = this.selectedLinePaint;
        paint.setAlpha(i2);
        canvas.drawLine(f5, 0.0f, f5, this.chartArea.bottom, paint);
        ArrayList arrayList = this.lines;
        this.tmpN = arrayList.size();
        this.tmpI = 0;
        while (true) {
            int i3 = this.tmpI;
            if (i3 >= this.tmpN) {
                return;
            }
            LineViewData lineViewData = (LineViewData) arrayList.get(i3);
            if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                float f6 = lineViewData.line.y[this.selectedIndex] * ((DoubleLinearChartData) this.chartData).linesK[this.tmpI];
                float f7 = this.currentMinHeight;
                float measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((f6 - f7) / (this.currentMaxHeight - f7)) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                Paint paint2 = lineViewData.selectionPaint;
                paint2.setAlpha((int) (lineViewData.alpha * 255.0f * this.selectionA));
                Paint paint3 = this.selectionBackgroundPaint;
                paint3.setAlpha((int) (lineViewData.alpha * 255.0f * this.selectionA));
                canvas.drawPoint(f5, measuredHeight, paint2);
                canvas.drawPoint(f5, measuredHeight, paint3);
            }
            this.tmpI++;
        }
    }

    @Override
    public final void drawSignaturesToHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
        float f;
        float f2;
        float f3;
        int i;
        TextPaint textPaint;
        int textSize;
        int i2;
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        CharSequence[] charSequenceArr3;
        ChartHorizontalLinesData chartHorizontalLinesData2 = chartHorizontalLinesData;
        long[] jArr = chartHorizontalLinesData2.values;
        int length = jArr.length;
        int i3 = ((DoubleLinearChartData) this.chartData).linesK[0] == 1.0f ? 1 : 0;
        int i4 = (i3 + 1) % 2;
        if (length > 2) {
            float f4 = (jArr[1] - jArr[0]) / (this.currentMaxHeight - this.currentMinHeight);
            if (f4 < 0.1d) {
                f = f4 / 0.1f;
            } else {
                f = 1.0f;
            }
        } else {
            f = 1.0f;
        }
        int i5 = this.transitionMode;
        if (i5 != 2) {
            if (i5 == 1 || i5 == 3) {
                f3 = this.transitionParams.progress;
            } else {
                f2 = 1.0f;
            }
            this.linePaint.setAlpha((int) (chartHorizontalLinesData2.alpha * 0.1f * f2));
            int measuredHeight = getMeasuredHeight() - this.chartBottom;
            int i6 = BaseChartView.SIGNATURE_TEXT_HEIGHT;
            i = measuredHeight - i6;
            textPaint = this.signaturePaint;
            textSize = (int) (i6 - textPaint.getTextSize());
            i2 = 0;
            while (i2 < length) {
                float measuredHeight2 = getMeasuredHeight() - this.chartBottom;
                int i7 = i3;
                float f5 = chartHorizontalLinesData2.values[i2];
                float f6 = this.currentMinHeight;
                int i8 = (int) (measuredHeight2 - (((f5 - f6) / (this.currentMaxHeight - f6)) * i));
                ArrayList arrayList = this.lines;
                charSequenceArr = chartHorizontalLinesData2.valuesStr;
                charSequenceArr2 = chartHorizontalLinesData2.valuesStr2;
                if (charSequenceArr != null || arrayList.size() <= 0) {
                    charSequenceArr3 = charSequenceArr2;
                } else {
                    if (charSequenceArr2 == null || arrayList.size() < 2) {
                        textPaint.setColor(Theme.getColor(Theme.key_statisticChartSignature, this.resourcesProvider));
                        textPaint.setAlpha((int) MediaController$$ExternalSyntheticOutline0.m(chartHorizontalLinesData2.alpha, this.signaturePaintAlpha, f2, f));
                    } else {
                        textPaint.setColor(((LineViewData) arrayList.get(i4)).lineColor);
                        textPaint.setAlpha((int) MediaController$$ExternalSyntheticOutline0.m(chartHorizontalLinesData2.alpha, ((LineViewData) arrayList.get(i4)).alpha, f2, f));
                    }
                    charSequenceArr3 = charSequenceArr2;
                    chartHorizontalLinesData2.drawText(canvas, BaseChartView.HORIZONTAL_PADDING, 0, i2, i8 - textSize, textPaint);
                }
                TextPaint textPaint2 = textPaint;
                if (charSequenceArr3 == null && arrayList.size() > 1) {
                    TextPaint textPaint3 = this.signaturePaint2;
                    textPaint3.setColor(((LineViewData) arrayList.get(i7)).lineColor);
                    textPaint3.setAlpha((int) MediaController$$ExternalSyntheticOutline0.m(chartHorizontalLinesData2.alpha, ((LineViewData) arrayList.get(i7)).alpha, f2, f));
                    chartHorizontalLinesData2.drawText(canvas, getMeasuredWidth() - BaseChartView.HORIZONTAL_PADDING, 1, i2, i8 - textSize, textPaint3);
                }
                i2++;
                chartHorizontalLinesData2 = chartHorizontalLinesData;
                i3 = i7;
                textSize = textSize;
                textPaint = textPaint2;
            }
        }
        f3 = 1.0f - this.transitionParams.progress;
        f2 = f3;
        this.linePaint.setAlpha((int) (chartHorizontalLinesData2.alpha * 0.1f * f2));
        int measuredHeight3 = getMeasuredHeight() - this.chartBottom;
        int i9 = BaseChartView.SIGNATURE_TEXT_HEIGHT;
        i = measuredHeight3 - i9;
        textPaint = this.signaturePaint;
        textSize = (int) (i9 - textPaint.getTextSize());
        i2 = 0;
        while (i2 < length) {
            float measuredHeight4 = getMeasuredHeight() - this.chartBottom;
            int i10 = i3;
            float f7 = chartHorizontalLinesData2.values[i2];
            float f8 = this.currentMinHeight;
            int i11 = (int) (measuredHeight4 - (((f7 - f8) / (this.currentMaxHeight - f8)) * i));
            ArrayList arrayList2 = this.lines;
            charSequenceArr = chartHorizontalLinesData2.valuesStr;
            charSequenceArr2 = chartHorizontalLinesData2.valuesStr2;
            if (charSequenceArr != null) {
                charSequenceArr3 = charSequenceArr2;
            } else {
                charSequenceArr3 = charSequenceArr2;
            }
            TextPaint textPaint4 = textPaint;
            if (charSequenceArr3 == null) {
            }
            i2++;
            chartHorizontalLinesData2 = chartHorizontalLinesData;
            i3 = i10;
            textSize = textSize;
            textPaint = textPaint4;
        }
    }

    @Override
    public final long findMaxValue(int i, int i2) {
        ArrayList arrayList = this.lines;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long jRMaxQ = ((LineViewData) arrayList.get(i3)).enabled ? (long) (((ChartData.Line) ((DoubleLinearChartData) this.chartData).lines.get(i3)).segmentTree.rMaxQ(i, i2) * ((DoubleLinearChartData) this.chartData).linesK[i3]) : 0L;
            if (jRMaxQ > j) {
                j = jRMaxQ;
            }
        }
        return j;
    }

    @Override
    public final long findMinValue(int i, int i2) {
        ArrayList arrayList = this.lines;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            long jRMinQ = ((LineViewData) arrayList.get(i3)).enabled ? (int) (((ChartData.Line) ((DoubleLinearChartData) this.chartData).lines.get(i3)).segmentTree.rMinQ(i, i2) * ((DoubleLinearChartData) this.chartData).linesK[i3]) : 2147483647L;
            if (jRMinQ < j) {
                j = jRMinQ;
            }
        }
        return j;
    }

    @Override
    public final void init() {
        this.useMinHeight = true;
        super.init();
    }

    @Override
    public final void updatePickerMinMaxHeight() {
        if (BaseChartView.ANIMATE_PICKER_SIZES) {
            ArrayList arrayList = this.lines;
            int i = 0;
            if (((LineViewData) arrayList.get(0)).enabled) {
                super.updatePickerMinMaxHeight();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                LineViewData lineViewData = (LineViewData) obj;
                if (lineViewData.enabled) {
                    long j2 = lineViewData.line.maxValue;
                    if (j2 > j) {
                        j = j2;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j = (long) (j * ((DoubleLinearChartData) this.chartData).linesK[1]);
            }
            if (j > 0) {
                float f = j;
                if (f != this.animatedToPickerMaxHeight) {
                    this.animatedToPickerMaxHeight = f;
                    Animator animator = this.pickerAnimator;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator valueAnimatorCreateAnimator = BaseChartView.createAnimator(this.pickerMaxHeight, this.animatedToPickerMaxHeight, new StackBarChartView.AnonymousClass1(this, 1));
                    this.pickerAnimator = valueAnimatorCreateAnimator;
                    valueAnimatorCreateAnimator.start();
                }
            }
        }
    }
}
