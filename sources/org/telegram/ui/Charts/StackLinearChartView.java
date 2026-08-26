package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.StackLinearViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public class StackLinearChartView extends BaseChartView {
    public final float[] mapPoints;
    public final Matrix matrix;
    public final Path ovalPath;
    public boolean[] skipPoints;
    public float[] startFromY;

    public StackLinearChartView(Context context) {
        super(context, null);
        this.matrix = new Matrix();
        this.mapPoints = new float[2];
        this.ovalPath = new Path();
        this.superDraw = true;
        this.useAlphaSignature = true;
        this.drawPointOnSelection = false;
    }

    @Override
    public void drawChart(Canvas canvas) {
        ArrayList arrayList;
        float f;
        float f2;
        int i;
        float f3;
        int i2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int i3;
        float f10;
        int i4;
        int i5;
        char c;
        float measuredWidth;
        float measuredHeight;
        float f11;
        double degrees;
        float f12;
        float f13;
        int iQuarterForPoint;
        int iQuarterForPoint2;
        boolean z;
        float f14;
        float f15;
        float f16;
        float f17;
        if (this.chartData != null) {
            float f18 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f19 = chartPickerDelegate.pickerEnd;
            float f20 = chartPickerDelegate.pickerStart;
            float f21 = f18 / (f19 - f20);
            float f22 = BaseChartView.HORIZONTAL_PADDING;
            float f23 = (f20 * f21) - f22;
            RectF rectF = this.chartArea;
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY() + AndroidUtilities.dp(16.0f);
            int i6 = 0;
            while (true) {
                arrayList = this.lines;
                if (i6 >= arrayList.size()) {
                    break;
                }
                ((StackLinearViewData) arrayList.get(i6)).chartPath.reset();
                ((StackLinearViewData) arrayList.get(i6)).chartPathPicker.reset();
                i6++;
            }
            canvas.save();
            boolean[] zArr = this.skipPoints;
            if (zArr == null || zArr.length < ((StackLinearChartData) this.chartData).lines.size()) {
                this.skipPoints = new boolean[((StackLinearChartData) this.chartData).lines.size()];
                this.startFromY = new float[((StackLinearChartData) this.chartData).lines.size()];
            }
            int i7 = this.transitionMode;
            if (i7 == 2) {
                f3 = this.transitionParams.progress / 0.6f;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                Path path = this.ovalPath;
                path.reset();
                float fWidth = rectF.width() > rectF.height() ? rectF.width() : rectF.height();
                float fHeight = (rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f;
                f2 = 0.0f;
                float fM = DiffUtil.m(1.0f, this.transitionParams.progress, (fWidth - fHeight) / 2.0f, fHeight);
                RectF rectF2 = new RectF();
                f = 1.0f;
                rectF2.set(fCenterX - fM, fCenterY - fM, fCenterX + fM, fCenterY + fM);
                path.addRoundRect(rectF2, fM, fM, Path.Direction.CW);
                canvas.clipPath(path);
                i = 255;
            } else {
                f = 1.0f;
                f2 = 0.0f;
                i = i7 == 3 ? (int) (this.transitionParams.progress * 255.0f) : 255;
                f3 = 0.0f;
            }
            float[] fArr = ((StackLinearChartData) this.chartData).xPercentage;
            int i8 = ((int) (f22 / (fArr.length < 2 ? 1.0f : fArr[1] * f21))) + 1;
            int iMax = Math.max(0, (this.startXIndex - i8) - 1);
            int iMin = Math.min(((StackLinearChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i8 + 1);
            int i9 = iMax;
            float f24 = 0.0f;
            boolean z2 = false;
            float f25 = 0.0f;
            while (true) {
                i2 = BaseChartView.SIGNATURE_TEXT_HEIGHT;
                if (i9 > iMin) {
                    break;
                }
                float f26 = f21;
                float f27 = f23;
                float f28 = f3;
                boolean z3 = z2;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                float f29 = 0.0f;
                while (i12 < arrayList.size()) {
                    LineViewData lineViewData = (LineViewData) arrayList.get(i12);
                    int i13 = i12;
                    if (lineViewData.enabled || lineViewData.alpha != f2) {
                        long j = lineViewData.line.y[i9];
                        if (j > 0) {
                            f29 = (j * lineViewData.alpha) + f29;
                            i10++;
                        }
                        i11 = i13;
                    }
                    i12 = i13 + 1;
                    i = i;
                }
                int i14 = i;
                float f30 = 0.0f;
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    LineViewData lineViewData2 = (LineViewData) arrayList.get(i15);
                    float f31 = f24;
                    if (lineViewData2.enabled || lineViewData2.alpha != f2) {
                        long[] jArr = lineViewData2.line.y;
                        if (i10 == 1) {
                            if (jArr[i9] == 0) {
                                f4 = 0.0f;
                            } else {
                                f4 = lineViewData2.alpha;
                            }
                        } else if (f29 == f2) {
                            f4 = 0.0f;
                        } else {
                            f4 = (jArr[i9] * lineViewData2.alpha) / f29;
                        }
                        float[] fArr2 = ((StackLinearChartData) this.chartData).xPercentage;
                        float f32 = (fArr2[i9] * f26) - f27;
                        float measuredWidth2 = i9 == iMin ? getMeasuredWidth() : (fArr2[i9 + 1] * f26) - f27;
                        if (f4 == f2 && i15 == i11) {
                            z3 = true;
                        }
                        float measuredHeight2 = ((getMeasuredHeight() - this.chartBottom) - i2) * f4;
                        float measuredHeight3 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight2) - f30;
                        this.startFromY[i15] = measuredHeight3;
                        float measuredHeight4 = getMeasuredHeight() - this.chartBottom;
                        if (i9 == iMin) {
                            f31 = f32;
                        } else if (i9 == iMax) {
                            f25 = f32;
                        }
                        int i16 = this.transitionMode;
                        float f33 = measuredWidth2;
                        Matrix matrix = this.matrix;
                        float[] fArr3 = this.mapPoints;
                        float f34 = f30;
                        if (i16 != 2 || i15 == i11) {
                            i11 = i11;
                            iMin = iMin;
                            f5 = measuredHeight3;
                            f6 = measuredHeight4;
                            f7 = f32;
                            f8 = f7;
                            f9 = 0.0f;
                        } else {
                            if (f32 < fCenterX) {
                                TransitionParams transitionParams = this.transitionParams;
                                f17 = transitionParams.startX[i15];
                                f16 = transitionParams.startY[i15];
                            } else {
                                TransitionParams transitionParams2 = this.transitionParams;
                                float f35 = transitionParams2.endX[i15];
                                f16 = transitionParams2.endY[i15];
                                f17 = f35;
                            }
                            float f36 = fCenterX - f17;
                            float f37 = fCenterY - f16;
                            float f38 = (((f32 - f17) * f37) / f36) + f16;
                            float f39 = f - f28;
                            float f40 = measuredHeight3 * f39;
                            float f41 = f38 * f28;
                            float f42 = f40 + f41;
                            float f43 = (measuredHeight4 * f39) + f41;
                            float f44 = f37 / f36;
                            float degrees2 = ((float) (f44 > f2 ? Math.toDegrees(-Math.atan(f44)) : Math.toDegrees(Math.atan(Math.abs(f44))))) - 90.0f;
                            if (f32 >= fCenterX) {
                                fArr3[0] = f32;
                                fArr3[1] = f42;
                                matrix.reset();
                                matrix.postRotate(this.transitionParams.progress * degrees2, fCenterX, fCenterY);
                                matrix.mapPoints(fArr3);
                                f7 = fArr3[0];
                                float f45 = fArr3[1];
                                if (f7 < fCenterX) {
                                    f7 = fCenterX;
                                }
                                fArr3[0] = f32;
                                fArr3[1] = f43;
                                matrix.reset();
                                matrix.postRotate(this.transitionParams.progress * degrees2, fCenterX, fCenterY);
                                matrix.mapPoints(fArr3);
                                f6 = fArr3[1];
                                f9 = degrees2;
                                f5 = f45;
                                f8 = f32 < fCenterX ? fCenterX : f32;
                            } else if (f33 >= fCenterX) {
                                f7 = (f32 * f39) + (fCenterX * f28);
                                float f46 = (fCenterY * f28) + (f42 * f39);
                                f9 = degrees2;
                                f5 = f46;
                                f6 = f5;
                                f8 = f7;
                            } else {
                                fArr3[0] = f32;
                                fArr3[1] = f42;
                                matrix.reset();
                                TransitionParams transitionParams3 = this.transitionParams;
                                float f47 = transitionParams3.progress;
                                matrix.postRotate((f47 * transitionParams3.angle[i15]) + (f47 * degrees2), fCenterX, fCenterY);
                                matrix.mapPoints(fArr3);
                                float f48 = fArr3[0];
                                float f49 = fArr3[1];
                                if (f33 >= fCenterX) {
                                    float f50 = this.transitionParams.progress;
                                    fArr3[0] = (f50 * fCenterX) + ((f - f50) * f32);
                                } else {
                                    fArr3[0] = f32;
                                }
                                fArr3[1] = f43;
                                matrix.reset();
                                TransitionParams transitionParams4 = this.transitionParams;
                                f9 = degrees2;
                                float f51 = transitionParams4.progress;
                                matrix.postRotate((f51 * transitionParams4.angle[i15]) + (f51 * f9), fCenterX, fCenterY);
                                matrix.mapPoints(fArr3);
                                f8 = fArr3[0];
                                f5 = f49;
                                f6 = fArr3[1];
                                f7 = f48;
                            }
                        }
                        Path path2 = lineViewData2.chartPath;
                        if (i9 == iMax) {
                            float measuredHeight5 = getMeasuredHeight();
                            if (this.transitionMode == 2) {
                                i3 = i11;
                                if (i15 != i3) {
                                    fArr3[0] = f2 - fCenterX;
                                    fArr3[1] = measuredHeight5;
                                    matrix.reset();
                                    TransitionParams transitionParams5 = this.transitionParams;
                                    float f52 = transitionParams5.progress;
                                    matrix.postRotate((f52 * transitionParams5.angle[i15]) + (f9 * f52), fCenterX, fCenterY);
                                    matrix.mapPoints(fArr3);
                                    z = false;
                                    f15 = fArr3[0];
                                    f14 = fArr3[1];
                                }
                                path2.moveTo(f15, f14);
                                this.skipPoints[i15] = z;
                            } else {
                                i3 = i11;
                            }
                            z = false;
                            f14 = measuredHeight5;
                            f15 = 0.0f;
                            path2.moveTo(f15, f14);
                            this.skipPoints[i15] = z;
                        } else {
                            arrayList = arrayList;
                            i3 = i11;
                        }
                        TransitionParams transitionParams6 = this.transitionParams;
                        float f53 = transitionParams6 == null ? 0.0f : transitionParams6.progress;
                        if (f4 == f2 && i9 > 0 && jArr[i9 - 1] == 0) {
                            i5 = iMin;
                            if (i9 >= i5 || jArr[i9 + 1] != 0) {
                                f10 = f53;
                                i4 = i2;
                            } else {
                                f10 = f53;
                                i4 = i2;
                                if (this.transitionMode != 2) {
                                    if (!this.skipPoints[i15]) {
                                        if (i15 == i3) {
                                            path2.lineTo(f8, (f - f10) * f6);
                                        } else {
                                            path2.lineTo(f8, f6);
                                        }
                                    }
                                    this.skipPoints[i15] = true;
                                    c = 0;
                                }
                                if (i9 == i5) {
                                    measuredWidth = getMeasuredWidth();
                                    measuredHeight = getMeasuredHeight();
                                    if (this.transitionMode == 2 || i15 == i3) {
                                        path2.lineTo(measuredWidth, measuredHeight);
                                    } else {
                                        fArr3[c] = measuredWidth + fCenterX;
                                        fArr3[1] = measuredHeight;
                                        matrix.reset();
                                        TransitionParams transitionParams7 = this.transitionParams;
                                        matrix.postRotate(transitionParams7.progress * transitionParams7.angle[i15], fCenterX, fCenterY);
                                        matrix.mapPoints(fArr3);
                                        float f54 = fArr3[c];
                                        float f55 = fArr3[1];
                                    }
                                    if (this.transitionMode == 2) {
                                        i3 = i3;
                                    } else if (i15 != i3) {
                                        TransitionParams transitionParams8 = this.transitionParams;
                                        f11 = (fCenterY - transitionParams8.startY[i15]) / (fCenterX - transitionParams8.startX[i15]);
                                        if (f11 > f2) {
                                            degrees = Math.toDegrees(-Math.atan(f11));
                                        } else {
                                            degrees = Math.toDegrees(Math.atan(Math.abs(f11)));
                                        }
                                        TransitionParams transitionParams9 = this.transitionParams;
                                        float f56 = transitionParams9.startX[i15];
                                        float f57 = transitionParams9.startY[i15];
                                        fArr3[0] = f56;
                                        fArr3[1] = f57;
                                        matrix.reset();
                                        TransitionParams transitionParams10 = this.transitionParams;
                                        float f58 = transitionParams10.progress;
                                        matrix.postRotate((f58 * transitionParams10.angle[i15]) + ((((float) degrees) - 90.0f) * f58), fCenterX, fCenterY);
                                        matrix.mapPoints(fArr3);
                                        f12 = fArr3[0];
                                        f13 = fArr3[1];
                                        if (Math.abs(f7 - f12) < 0.001d || ((f13 >= fCenterY || f5 >= fCenterY) && (f13 <= fCenterY || f5 <= fCenterY))) {
                                            iQuarterForPoint = quarterForPoint(f7, f5);
                                            iQuarterForPoint2 = quarterForPoint(f12, f13);
                                        } else if (this.transitionParams.angle[i15] == -180.0f) {
                                            iQuarterForPoint = 0;
                                            iQuarterForPoint2 = 0;
                                        } else {
                                            iQuarterForPoint = 0;
                                            iQuarterForPoint2 = 3;
                                        }
                                        while (iQuarterForPoint <= iQuarterForPoint2) {
                                            if (iQuarterForPoint == 0) {
                                                path2.lineTo(getMeasuredWidth(), 0.0f);
                                            } else {
                                                if (iQuarterForPoint == 1) {
                                                    path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                                } else if (iQuarterForPoint == 2) {
                                                    path2.lineTo(0.0f, getMeasuredHeight());
                                                } else {
                                                    path2.lineTo(0.0f, 0.0f);
                                                }
                                                iQuarterForPoint++;
                                            }
                                            iQuarterForPoint++;
                                        }
                                    } else {
                                        i3 = i3;
                                    }
                                } else {
                                    i3 = i3;
                                }
                                f30 = f34 + measuredHeight2;
                            }
                        } else {
                            f10 = f53;
                            i4 = i2;
                            i5 = iMin;
                        }
                        if (this.skipPoints[i15]) {
                            if (i15 == i3) {
                                path2.lineTo(f8, (f - f10) * f6);
                            } else {
                                path2.lineTo(f8, f6);
                            }
                        }
                        if (i15 == i3) {
                            path2.lineTo(f7, (f - f10) * f5);
                        } else {
                            path2.lineTo(f7, f5);
                        }
                        c = 0;
                        this.skipPoints[i15] = false;
                        if (i9 == i5) {
                            measuredWidth = getMeasuredWidth();
                            measuredHeight = getMeasuredHeight();
                            if (this.transitionMode == 2) {
                                path2.lineTo(measuredWidth, measuredHeight);
                            } else {
                                path2.lineTo(measuredWidth, measuredHeight);
                            }
                            if (this.transitionMode == 2) {
                                i3 = i3;
                            } else if (i15 != i3) {
                                TransitionParams transitionParams11 = this.transitionParams;
                                f11 = (fCenterY - transitionParams11.startY[i15]) / (fCenterX - transitionParams11.startX[i15]);
                                if (f11 > f2) {
                                    degrees = Math.toDegrees(-Math.atan(f11));
                                } else {
                                    degrees = Math.toDegrees(Math.atan(Math.abs(f11)));
                                }
                                TransitionParams transitionParams12 = this.transitionParams;
                                float f59 = transitionParams12.startX[i15];
                                float f510 = transitionParams12.startY[i15];
                                fArr3[0] = f59;
                                fArr3[1] = f510;
                                matrix.reset();
                                TransitionParams transitionParams13 = this.transitionParams;
                                float f511 = transitionParams13.progress;
                                matrix.postRotate((f511 * transitionParams13.angle[i15]) + ((((float) degrees) - 90.0f) * f511), fCenterX, fCenterY);
                                matrix.mapPoints(fArr3);
                                f12 = fArr3[0];
                                f13 = fArr3[1];
                                if (Math.abs(f7 - f12) < 0.001d) {
                                    iQuarterForPoint = quarterForPoint(f7, f5);
                                    iQuarterForPoint2 = quarterForPoint(f12, f13);
                                } else {
                                    iQuarterForPoint = quarterForPoint(f7, f5);
                                    iQuarterForPoint2 = quarterForPoint(f12, f13);
                                }
                                while (iQuarterForPoint <= iQuarterForPoint2) {
                                    if (iQuarterForPoint == 0) {
                                        path2.lineTo(getMeasuredWidth(), 0.0f);
                                    } else {
                                        if (iQuarterForPoint == 1) {
                                            path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                        } else if (iQuarterForPoint == 2) {
                                            path2.lineTo(0.0f, getMeasuredHeight());
                                        } else {
                                            path2.lineTo(0.0f, 0.0f);
                                        }
                                        iQuarterForPoint++;
                                    }
                                    iQuarterForPoint++;
                                }
                            } else {
                                i3 = i3;
                            }
                        } else {
                            i3 = i3;
                        }
                        f30 = f34 + measuredHeight2;
                    } else {
                        i10 = i10;
                        i3 = i11;
                        arrayList = arrayList;
                        iMax = iMax;
                        i4 = i2;
                        f25 = f25;
                        i5 = iMin;
                    }
                    f24 = f31;
                    i15++;
                    iMin = i5;
                    i10 = i10;
                    i2 = i4;
                    iMax = iMax;
                    f25 = f25;
                    arrayList = arrayList;
                    i11 = i3;
                    f2 = 0.0f;
                }
                i9++;
                f21 = f26;
                f23 = f27;
                f3 = f28;
                z2 = z3;
                i = i14;
                iMin = iMin;
                f2 = 0.0f;
            }
            int i17 = i;
            ArrayList arrayList2 = arrayList;
            boolean z4 = z2;
            canvas.save();
            canvas.clipRect(f25, i2, f24, getMeasuredHeight() - this.chartBottom);
            if (z4) {
                canvas.drawColor(Theme.getColor(null, Theme.key_statisticChartLineEmpty, false));
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                LineViewData lineViewData3 = (LineViewData) arrayList2.get(size);
                lineViewData3.paint.setAlpha(i17);
                Path path3 = lineViewData3.chartPath;
                Paint paint = lineViewData3.paint;
                canvas.drawPath(path3, paint);
                paint.setAlpha(255);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void drawPickerChart(Canvas canvas) {
        boolean z;
        float f;
        int i;
        float f2;
        float f3;
        Path path;
        long[] jArr;
        if (this.chartData != null) {
            ArrayList arrayList = this.lines;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((StackLinearViewData) arrayList.get(i2)).chartPathPicker.reset();
            }
            StackLinearChartData stackLinearChartData = (StackLinearChartData) this.chartData;
            int i3 = stackLinearChartData.simplifiedSize;
            boolean[] zArr = this.skipPoints;
            if (zArr == null || zArr.length < stackLinearChartData.lines.size()) {
                this.skipPoints = new boolean[((StackLinearChartData) this.chartData).lines.size()];
            }
            int i4 = 0;
            boolean z2 = false;
            while (true) {
                int i5 = 1;
                if (i4 >= i3) {
                    break;
                }
                float f4 = 0.0f;
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    LineViewData lineViewData = (LineViewData) arrayList.get(i8);
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        long j = ((StackLinearChartData) this.chartData).simplifiedY[i8][i4];
                        if (j > 0) {
                            f4 += j * lineViewData.alpha;
                            i6++;
                        }
                        i7 = i8;
                    }
                }
                int i9 = i3 - 1;
                float f5 = (i4 / i9) * this.pickerWidth;
                int i10 = 0;
                float f6 = 0.0f;
                while (i10 < arrayList.size()) {
                    LineViewData lineViewData2 = (LineViewData) arrayList.get(i10);
                    if (lineViewData2.enabled || lineViewData2.alpha != 0.0f) {
                        if (i6 == i5) {
                            if (((StackLinearChartData) this.chartData).simplifiedY[i10][i4] != 0) {
                                f = lineViewData2.alpha;
                            }
                            z = true;
                            if (f == 0.0f && i10 == i7) {
                                z2 = true;
                            }
                            i = this.pikerHeight;
                            f2 = i;
                            float f7 = f * f2;
                            boolean z3 = z2;
                            f3 = (f2 - f7) - f6;
                            path = lineViewData2.chartPathPicker;
                            if (i4 == 0) {
                                path.moveTo(0.0f, f2);
                                this.skipPoints[i10] = false;
                            }
                            jArr = ((StackLinearChartData) this.chartData).simplifiedY[i10];
                            if (jArr[i4] == 0 || i4 <= 0 || jArr[i4 - 1] != 0 || i4 >= i9 || jArr[i4 + 1] != 0) {
                                if (this.skipPoints[i10]) {
                                    path.lineTo(f5, i);
                                }
                                path.lineTo(f5, f3);
                                this.skipPoints[i10] = false;
                            } else {
                                if (!this.skipPoints[i10]) {
                                    path.lineTo(f5, i);
                                }
                                this.skipPoints[i10] = z;
                            }
                            if (i4 == i9) {
                                path.lineTo(this.pickerWidth, i);
                            }
                            f6 += f7;
                            z2 = z3;
                        } else {
                            if (f4 != 0.0f) {
                                z = true;
                                f = (((StackLinearChartData) this.chartData).simplifiedY[i10][i4] * lineViewData2.alpha) / f4;
                            }
                            if (f == 0.0f) {
                                z2 = true;
                            }
                            i = this.pikerHeight;
                            f2 = i;
                            float f8 = f * f2;
                            boolean z4 = z2;
                            f3 = (f2 - f8) - f6;
                            path = lineViewData2.chartPathPicker;
                            if (i4 == 0) {
                                path.moveTo(0.0f, f2);
                                this.skipPoints[i10] = false;
                            }
                            jArr = ((StackLinearChartData) this.chartData).simplifiedY[i10];
                            if (jArr[i4] == 0) {
                                if (this.skipPoints[i10]) {
                                    path.lineTo(f5, i);
                                }
                                path.lineTo(f5, f3);
                                this.skipPoints[i10] = false;
                            } else {
                                if (this.skipPoints[i10]) {
                                    path.lineTo(f5, i);
                                }
                                path.lineTo(f5, f3);
                                this.skipPoints[i10] = false;
                            }
                            if (i4 == i9) {
                                path.lineTo(this.pickerWidth, i);
                            }
                            f6 += f8;
                            z2 = z4;
                        }
                        f = 0.0f;
                        z = true;
                        if (f == 0.0f) {
                            z2 = true;
                        }
                        i = this.pikerHeight;
                        f2 = i;
                        float f9 = f * f2;
                        boolean z5 = z2;
                        f3 = (f2 - f9) - f6;
                        path = lineViewData2.chartPathPicker;
                        if (i4 == 0) {
                            path.moveTo(0.0f, f2);
                            this.skipPoints[i10] = false;
                        }
                        jArr = ((StackLinearChartData) this.chartData).simplifiedY[i10];
                        if (jArr[i4] == 0) {
                            if (this.skipPoints[i10]) {
                                path.lineTo(f5, i);
                            }
                            path.lineTo(f5, f3);
                            this.skipPoints[i10] = false;
                        } else {
                            if (this.skipPoints[i10]) {
                                path.lineTo(f5, i);
                            }
                            path.lineTo(f5, f3);
                            this.skipPoints[i10] = false;
                        }
                        if (i4 == i9) {
                            path.lineTo(this.pickerWidth, i);
                        }
                        f6 += f9;
                        z2 = z5;
                    }
                    i10++;
                    i3 = i3;
                    i5 = 1;
                }
                i4++;
            }
            if (z2) {
                canvas.drawColor(Theme.getColor(null, Theme.key_statisticChartLineEmpty, false));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                LineViewData lineViewData3 = (LineViewData) arrayList.get(size2);
                canvas.drawPath(lineViewData3.chartPathPicker, lineViewData3.paint);
            }
        }
    }

    @Override
    public void fillTransitionParams(TransitionParams transitionParams) {
        ArrayList arrayList;
        float f;
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        float f2 = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f3 = chartPickerDelegate.pickerEnd;
        float f4 = chartPickerDelegate.pickerStart;
        float f5 = f2 / (f3 - f4);
        float f6 = BaseChartView.HORIZONTAL_PADDING;
        float f7 = (f4 * f5) - f6;
        float[] fArr = ((StackLinearChartData) chartData).xPercentage;
        int i = 2;
        int i2 = 1;
        int i3 = ((int) (f6 / (fArr.length < 2 ? 1.0f : fArr[1] * f5))) + 1;
        int iMax = Math.max(0, (this.startXIndex - i3) - 1);
        int iMin = Math.min(((StackLinearChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i3 + 1);
        this.transitionParams.startX = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.startY = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.endX = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.endY = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.angle = new float[((StackLinearChartData) this.chartData).lines.size()];
        int i4 = 0;
        while (i4 < i) {
            int i5 = i4 == i2 ? iMin : iMax;
            int i6 = 0;
            float f8 = 0.0f;
            int i7 = 0;
            while (true) {
                arrayList = this.lines;
                if (i6 >= arrayList.size()) {
                    break;
                }
                LineViewData lineViewData = (LineViewData) arrayList.get(i6);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    long j = lineViewData.line.y[i5];
                    if (j > 0) {
                        f8 += j * lineViewData.alpha;
                        i7++;
                    }
                }
                i6++;
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < arrayList.size()) {
                LineViewData lineViewData2 = (LineViewData) arrayList.get(i8);
                if (lineViewData2.enabled || lineViewData2.alpha != 0.0f) {
                    long[] jArr = lineViewData2.line.y;
                    if (i7 == i2) {
                        if (jArr[i5] == 0) {
                            f = 0.0f;
                        } else {
                            f = lineViewData2.alpha;
                        }
                    } else if (f8 == 0.0f) {
                        f = 0.0f;
                    } else {
                        f = (jArr[i5] * lineViewData2.alpha) / f8;
                    }
                    float f9 = (((StackLinearChartData) this.chartData).xPercentage[i5] * f5) - f7;
                    float measuredHeight = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                    float f10 = i9;
                    float measuredHeight2 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight) - f10;
                    i9 = (int) (f10 + measuredHeight);
                    if (i4 == 0) {
                        TransitionParams transitionParams2 = this.transitionParams;
                        transitionParams2.startX[i8] = f9;
                        transitionParams2.startY[i8] = measuredHeight2;
                    } else {
                        TransitionParams transitionParams3 = this.transitionParams;
                        transitionParams3.endX[i8] = f9;
                        transitionParams3.endY[i8] = measuredHeight2;
                    }
                } else {
                    i4 = i4;
                }
                i8++;
                i4 = i4;
                i2 = 1;
            }
            i4++;
            i = 2;
            i2 = 1;
        }
    }

    @Override
    public final long findMaxValue(int i, int i2) {
        return 100L;
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public void onDraw(Canvas canvas) {
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
                drawSelection(canvas);
                super.onDraw(canvas);
                return;
            }
            drawHorizontalLines(canvas, (ChartHorizontalLinesData) arrayList.get(i));
            drawSignaturesToHorizontalLines(canvas, (ChartHorizontalLinesData) arrayList.get(this.tmpI));
            this.tmpI++;
        }
    }

    public final int quarterForPoint(float f, float f2) {
        RectF rectF = this.chartArea;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY() + AndroidUtilities.dp(16.0f);
        if (f >= fCenterX && f2 <= fCenterY) {
            return 0;
        }
        if (f < fCenterX || f2 < fCenterY) {
            return (f >= fCenterX || f2 < fCenterY) ? 3 : 2;
        }
        return 1;
    }

    @Override
    public StackLinearViewData createLineViewData(ChartData.Line line) {
        return new StackLinearViewData(line);
    }
}
