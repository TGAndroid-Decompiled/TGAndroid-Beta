package org.telegram.ui.Charts;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public final class LinearBarChartView extends BaseChartView {
    @Override
    public final LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, true, null);
    }

    @Override
    public final void drawChart(Canvas canvas) {
        Paint paint;
        boolean z;
        float[] fArr;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        int i2;
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
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.lines;
            if (i4 >= arrayList.size()) {
                return;
            }
            LineViewData lineViewData = (LineViewData) arrayList.get(i4);
            if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                float[] fArr2 = this.chartData.xPercentage;
                float f12 = fArr2.length < 2 ? 0.0f : fArr2[1] * f9;
                long[] jArr = lineViewData.line.y;
                int i5 = ((int) (f10 / f12)) + 1;
                Path path = lineViewData.chartPath;
                path.reset();
                int iMax = Math.max(i3, this.startXIndex - i5);
                int iMin = Math.min(this.chartData.xPercentage.length - 1, this.endXIndex + i5);
                boolean z2 = true;
                int i6 = 0;
                while (true) {
                    paint = lineViewData.paint;
                    z = BaseChartView.USE_LINES;
                    fArr = lineViewData.linesPath;
                    if (iMax > iMin) {
                        break;
                    }
                    float f13 = f9;
                    float f14 = f11;
                    long j = jArr[iMax];
                    if (j < 0) {
                        f5 = f10;
                        i2 = i4;
                    } else {
                        f5 = f10;
                        float f15 = (this.chartData.xPercentage[iMax] * f13) - f14;
                        float f16 = this.currentMinHeight;
                        float f17 = (j - f16) / (this.currentMaxHeight - f16);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        i2 = i4;
                        float fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT, strokeWidth, f17, (getMeasuredHeight() - this.chartBottom) - strokeWidth);
                        if (!z) {
                            if (z2) {
                                path.moveTo(f15 - (f12 / 2.0f), fM);
                                z2 = false;
                            } else {
                                path.lineTo(f15 - (f12 / 2.0f), fM);
                            }
                            path.lineTo((f12 / 2.0f) + f15, fM);
                        } else if (i6 == 0) {
                            float f18 = f12 / 2.0f;
                            fArr[i6] = f15 - f18;
                            fArr[i6 + 1] = fM;
                            float f19 = f15 + f18;
                            fArr[i6 + 2] = f19;
                            fArr[i6 + 3] = fM;
                            int i7 = i6 + 5;
                            fArr[i6 + 4] = f19;
                            i6 += 6;
                            fArr[i7] = fM;
                        } else if (iMax == iMin) {
                            float f20 = f12 / 2.0f;
                            float f21 = f15 - f20;
                            fArr[i6] = f21;
                            fArr[i6 + 1] = fM;
                            fArr[i6 + 2] = f21;
                            fArr[i6 + 3] = fM;
                            float f22 = f15 + f20;
                            fArr[i6 + 4] = f22;
                            fArr[i6 + 5] = fM;
                            fArr[i6 + 6] = f22;
                            fArr[i6 + 7] = fM;
                            int i8 = i6 + 9;
                            fArr[i6 + 8] = f22;
                            i6 += 10;
                            fArr[i8] = (getMeasuredHeight() - this.chartBottom) - strokeWidth;
                        } else {
                            float f23 = f12 / 2.0f;
                            float f24 = f15 - f23;
                            fArr[i6] = f24;
                            fArr[i6 + 1] = fM;
                            fArr[i6 + 2] = f24;
                            fArr[i6 + 3] = fM;
                            float f25 = f15 + f23;
                            fArr[i6 + 4] = f25;
                            fArr[i6 + 5] = fM;
                            int i9 = i6 + 7;
                            fArr[i6 + 6] = f25;
                            i6 += 8;
                            fArr[i9] = fM;
                        }
                    }
                    iMax++;
                    f9 = f13;
                    f11 = f14;
                    f10 = f5;
                    i4 = i2;
                }
                f = f9;
                f2 = f11;
                f3 = f10;
                i = i4;
                canvas.save();
                int i10 = this.transitionMode;
                float f26 = 1.0f;
                if (i10 == 2) {
                    TransitionParams transitionParams = this.transitionParams;
                    float f27 = transitionParams.progress;
                    f4 = f27 > 0.5f ? 0.0f : 1.0f - (f27 * 2.0f);
                    canvas.scale((f27 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
                } else {
                    if (i10 == 1) {
                        float f28 = this.transitionParams.progress;
                        f4 = f28 < 0.3f ? 0.0f : f28;
                        canvas.save();
                        TransitionParams transitionParams2 = this.transitionParams;
                        float f29 = transitionParams2.progress;
                        canvas.scale(f29, f29, transitionParams2.pX, transitionParams2.pY);
                    } else if (i10 == 3) {
                        f26 = this.transitionParams.progress;
                    }
                    paint.setAlpha((int) (lineViewData.alpha * 255.0f * f26));
                    if (this.endXIndex - this.startXIndex > 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z) {
                        canvas.drawLines(fArr, 0, i6, paint);
                    } else {
                        canvas.drawPath(path, paint);
                    }
                    canvas.restore();
                }
                f26 = f4;
                paint.setAlpha((int) (lineViewData.alpha * 255.0f * f26));
                if (this.endXIndex - this.startXIndex > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                if (z) {
                    canvas.drawPath(path, paint);
                } else {
                    canvas.drawLines(fArr, 0, i6, paint);
                }
                canvas.restore();
            } else {
                f = f9;
                f2 = f11;
                f3 = f10;
                i = i4;
            }
            i4 = i + 1;
            f9 = f;
            f11 = f2;
            f10 = f3;
            i3 = 0;
        }
    }

    @Override
    public final void drawPickerChart(Canvas canvas) {
        boolean z;
        float[] fArr;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.lines;
        int size = arrayList3.size();
        ChartData chartData = this.chartData;
        if (chartData != null) {
            float[] fArr2 = chartData.xPercentage;
            float f = fArr2.length < 2 ? 1.0f : fArr2[1] * this.pickerWidth;
            int i2 = 0;
            while (i2 < size) {
                LineViewData lineViewData = (LineViewData) arrayList3.get(i2);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    Path path = lineViewData.bottomLinePath;
                    path.reset();
                    int length = this.chartData.xPercentage.length;
                    long[] jArr = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        z = BaseChartView.USE_LINES;
                        fArr = lineViewData.linesPathBottom;
                        if (i3 >= length) {
                            break;
                        }
                        int i5 = length;
                        long j = jArr[i3];
                        if (j < 0) {
                            arrayList2 = arrayList3;
                            size = size;
                        } else {
                            ChartData chartData2 = this.chartData;
                            arrayList2 = arrayList3;
                            float f2 = this.pickerWidth * chartData2.xPercentage[i3];
                            boolean z2 = BaseChartView.ANIMATE_PICKER_SIZES;
                            float f3 = z2 ? this.pickerMaxHeight : chartData2.maxValue;
                            float f4 = z2 ? this.pickerMinHeight : chartData2.minValue;
                            float f5 = (1.0f - ((j - f4) / (f3 - f4))) * this.pikerHeight;
                            if (!z) {
                                if (i3 == 0) {
                                    path.moveTo(f2 - (f / 2.0f), f5);
                                } else {
                                    path.lineTo(f2 - (f / 2.0f), f5);
                                }
                                path.lineTo((f / 2.0f) + f2, f5);
                            } else if (i4 == 0) {
                                float f6 = f / 2.0f;
                                fArr[i4] = f2 - f6;
                                fArr[i4 + 1] = f5;
                                float f7 = f2 + f6;
                                fArr[i4 + 2] = f7;
                                fArr[i4 + 3] = f5;
                                int i6 = i4 + 5;
                                fArr[i4 + 4] = f7;
                                i4 += 6;
                                fArr[i6] = f5;
                            } else if (i3 == i5 - 1) {
                                float f8 = f / 2.0f;
                                float f9 = f2 - f8;
                                fArr[i4] = f9;
                                fArr[i4 + 1] = f5;
                                fArr[i4 + 2] = f9;
                                fArr[i4 + 3] = f5;
                                float f10 = f2 + f8;
                                fArr[i4 + 4] = f10;
                                fArr[i4 + 5] = f5;
                                fArr[i4 + 6] = f10;
                                fArr[i4 + 7] = f5;
                                int i7 = i4 + 9;
                                fArr[i4 + 8] = f10;
                                i4 += 10;
                                fArr[i7] = 0.0f;
                            } else {
                                float f11 = f / 2.0f;
                                float f12 = f2 - f11;
                                fArr[i4] = f12;
                                fArr[i4 + 1] = f5;
                                fArr[i4 + 2] = f12;
                                fArr[i4 + 3] = f5;
                                float f13 = f2 + f11;
                                fArr[i4 + 4] = f13;
                                fArr[i4 + 5] = f5;
                                int i8 = i4 + 7;
                                fArr[i4 + 6] = f13;
                                i4 += 8;
                                fArr[i8] = f5;
                            }
                        }
                        i3++;
                        length = i5;
                        arrayList3 = arrayList2;
                        size = size;
                    }
                    arrayList = arrayList3;
                    i = size;
                    lineViewData.linesPathBottomSize = i4;
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        Paint paint = lineViewData.bottomLinePaint;
                        paint.setAlpha((int) (lineViewData.alpha * 255.0f));
                        if (z) {
                            canvas.drawLines(fArr, 0, lineViewData.linesPathBottomSize, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    i = size;
                }
                i2++;
                arrayList3 = arrayList;
                size = i;
            }
        }
    }

    @Override
    public final void init() {
        this.useMinHeight = true;
        super.init();
    }
}
