package org.telegram.ui.Charts;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public final class LinearChartView extends BaseChartView {
    @Override
    public final LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, false, null);
    }

    @Override
    public final void drawChart(Canvas canvas) {
        Paint paint;
        boolean z;
        float[] fArr;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        if (this.chartData == null) {
            return;
        }
        float f8 = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f9 = chartPickerDelegate.pickerEnd;
        float f10 = chartPickerDelegate.pickerStart;
        float f11 = f8 / (f9 - f10);
        float f12 = BaseChartView.HORIZONTAL_PADDING;
        float f13 = (f10 * f11) - f12;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.lines;
            if (i2 >= arrayList.size()) {
                return;
            }
            LineViewData lineViewData = (LineViewData) arrayList.get(i2);
            if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                float[] fArr2 = this.chartData.xPercentage;
                float f14 = fArr2.length < 2 ? 0.0f : fArr2[1] * f11;
                long[] jArr = lineViewData.line.y;
                int i3 = ((int) (f12 / f14)) + 1;
                Path path = lineViewData.chartPath;
                path.reset();
                int iMax = Math.max(i, this.startXIndex - i3);
                int iMin = Math.min(this.chartData.xPercentage.length - 1, this.endXIndex + i3);
                boolean z2 = true;
                int i4 = 0;
                while (true) {
                    paint = lineViewData.paint;
                    z = BaseChartView.USE_LINES;
                    fArr = lineViewData.linesPath;
                    if (iMax > iMin) {
                        break;
                    }
                    long j = jArr[iMax];
                    if (j < 0) {
                        f5 = f11;
                        f6 = f13;
                        f7 = f12;
                    } else {
                        f5 = f11;
                        float f15 = (this.chartData.xPercentage[iMax] * f5) - f13;
                        float f16 = this.currentMinHeight;
                        f6 = f13;
                        float f17 = (j - f16) / (this.currentMaxHeight - f16);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        f7 = f12;
                        float fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT, strokeWidth, f17, (getMeasuredHeight() - this.chartBottom) - strokeWidth);
                        if (z) {
                            if (i4 == 0) {
                                int i5 = i4 + 1;
                                fArr[i4] = f15;
                                i4 += 2;
                                fArr[i5] = fM;
                            } else {
                                fArr[i4] = f15;
                                fArr[i4 + 1] = fM;
                                int i6 = i4 + 3;
                                fArr[i4 + 2] = f15;
                                i4 += 4;
                                fArr[i6] = fM;
                            }
                        } else if (z2) {
                            path.moveTo(f15, fM);
                            z2 = false;
                        } else {
                            path.lineTo(f15, fM);
                        }
                    }
                    iMax++;
                    f11 = f5;
                    f13 = f6;
                    f12 = f7;
                }
                f = f11;
                f2 = f13;
                f3 = f12;
                canvas.save();
                int i7 = this.transitionMode;
                float f18 = 1.0f;
                if (i7 == 2) {
                    TransitionParams transitionParams = this.transitionParams;
                    float f19 = transitionParams.progress;
                    f4 = f19 > 0.5f ? 0.0f : 1.0f - (f19 * 2.0f);
                    canvas.scale((f19 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
                } else {
                    if (i7 == 1) {
                        float f20 = this.transitionParams.progress;
                        f4 = f20 < 0.3f ? 0.0f : f20;
                        canvas.save();
                        TransitionParams transitionParams2 = this.transitionParams;
                        float f21 = transitionParams2.progress;
                        canvas.scale(f21, f21, transitionParams2.pX, transitionParams2.pY);
                    } else if (i7 == 3) {
                        f18 = this.transitionParams.progress;
                    }
                    paint.setAlpha((int) (lineViewData.alpha * 255.0f * f18));
                    if (this.endXIndex - this.startXIndex > 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z) {
                        canvas.drawLines(fArr, 0, i4, paint);
                    } else {
                        canvas.drawPath(path, paint);
                    }
                    canvas.restore();
                }
                f18 = f4;
                paint.setAlpha((int) (lineViewData.alpha * 255.0f * f18));
                if (this.endXIndex - this.startXIndex > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                if (z) {
                    canvas.drawPath(path, paint);
                } else {
                    canvas.drawLines(fArr, 0, i4, paint);
                }
                canvas.restore();
            } else {
                f = f11;
                f2 = f13;
                f3 = f12;
            }
            i2++;
            f11 = f;
            f13 = f2;
            f12 = f3;
            i = 0;
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
        if (this.chartData != null) {
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
                            ChartData chartData = this.chartData;
                            arrayList2 = arrayList3;
                            float f = chartData.xPercentage[i3] * this.pickerWidth;
                            boolean z2 = BaseChartView.ANIMATE_PICKER_SIZES;
                            float f2 = z2 ? this.pickerMaxHeight : chartData.maxValue;
                            float f3 = z2 ? this.pickerMinHeight : chartData.minValue;
                            float f4 = (1.0f - ((j - f3) / (f2 - f3))) * this.pikerHeight;
                            if (z) {
                                if (i4 == 0) {
                                    int i6 = i4 + 1;
                                    fArr[i4] = f;
                                    i4 += 2;
                                    fArr[i6] = f4;
                                } else {
                                    fArr[i4] = f;
                                    fArr[i4 + 1] = f4;
                                    int i7 = i4 + 3;
                                    fArr[i4 + 2] = f;
                                    i4 += 4;
                                    fArr[i7] = f4;
                                }
                            } else if (i3 == 0) {
                                path.moveTo(f, f4);
                            } else {
                                path.lineTo(f, f4);
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
                    i2++;
                    arrayList3 = arrayList;
                    size = i;
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
