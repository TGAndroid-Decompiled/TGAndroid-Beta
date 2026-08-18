package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.StackLinearViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

public class StackLinearChartView extends BaseChartView {
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
    public StackLinearViewData createLineViewData(ChartData.Line line) {
        return new StackLinearViewData(line);
    }

    @Override
    protected void drawChart(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        float measuredWidth;
        int i2;
        float f4;
        float f5;
        float f6;
        int i3;
        float f7;
        int i4;
        float f8;
        float f9;
        float measuredWidth2;
        float measuredHeight;
        double degrees;
        int iQuarterForPoint;
        int iQuarterForPoint2;
        boolean z;
        float f10;
        float f11;
        float f12;
        double degrees2;
        float f13;
        if (this.chartData != null) {
            float f14 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f15 = chartPickerDelegate.pickerEnd;
            float f16 = chartPickerDelegate.pickerStart;
            float f17 = f14 / (f15 - f16);
            float f18 = (f16 * f17) - BaseChartView.HORIZONTAL_PADDING;
            float fCenterX = this.chartArea.centerX();
            float fCenterY = this.chartArea.centerY() + AndroidUtilities.dp(16.0f);
            int i5 = 0;
            for (int i6 = 0; i6 < this.lines.size(); i6++) {
                ((StackLinearViewData) this.lines.get(i6)).chartPath.reset();
                ((StackLinearViewData) this.lines.get(i6)).chartPathPicker.reset();
            }
            canvas.save();
            boolean[] zArr = this.skipPoints;
            if (zArr == null || zArr.length < ((StackLinearChartData) this.chartData).lines.size()) {
                this.skipPoints = new boolean[((StackLinearChartData) this.chartData).lines.size()];
                this.startFromY = new float[((StackLinearChartData) this.chartData).lines.size()];
            }
            int i7 = this.transitionMode;
            if (i7 == 2) {
                float f19 = this.transitionParams.progress / 0.6f;
                if (f19 > 1.0f) {
                    f19 = 1.0f;
                }
                this.ovalPath.reset();
                float fWidth = this.chartArea.width() > this.chartArea.height() ? this.chartArea.width() : this.chartArea.height();
                float fHeight = (this.chartArea.width() > this.chartArea.height() ? this.chartArea.height() : this.chartArea.width()) * 0.45f;
                float f20 = fHeight + (((fWidth - fHeight) / 2.0f) * (1.0f - this.transitionParams.progress));
                RectF rectF = new RectF();
                rectF.set(fCenterX - f20, fCenterY - f20, fCenterX + f20, fCenterY + f20);
                this.ovalPath.addRoundRect(rectF, f20, f20, Path.Direction.CW);
                canvas.clipPath(this.ovalPath);
                f = f19;
                i = 255;
            } else {
                i = i7 == 3 ? (int) (this.transitionParams.progress * 255.0f) : 255;
                f = 0.0f;
            }
            float[] fArr = ((StackLinearChartData) this.chartData).xPercentage;
            int i8 = ((int) (BaseChartView.HORIZONTAL_PADDING / (fArr.length < 2 ? 1.0f : fArr[1] * f17))) + 1;
            int iMax = Math.max(0, (this.startXIndex - i8) - 1);
            int iMin = Math.min(((StackLinearChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i8 + 1);
            int i9 = iMax;
            float f21 = 0.0f;
            boolean z2 = false;
            float f22 = 0.0f;
            while (i9 <= iMin) {
                int i10 = 0;
                float f23 = 0.0f;
                int i11 = 0;
                while (i5 < this.lines.size()) {
                    LineViewData lineViewData = (LineViewData) this.lines.get(i5);
                    int i12 = i;
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        long j = lineViewData.line.y[i9];
                        if (j > 0) {
                            f23 += j * lineViewData.alpha;
                            i10++;
                        }
                        i11 = i5;
                    }
                    i5++;
                    i = i12;
                    f = f;
                    f21 = f21;
                }
                int i13 = i;
                float f24 = f;
                float f25 = 0.0f;
                int i14 = 0;
                while (i14 < this.lines.size()) {
                    LineViewData lineViewData2 = (LineViewData) this.lines.get(i14);
                    if (lineViewData2.enabled || lineViewData2.alpha != 0.0f) {
                        long[] jArr = lineViewData2.line.y;
                        f2 = f21;
                        if (i10 == 1) {
                            if (jArr[i9] == 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = lineViewData2.alpha;
                            }
                        } else if (f23 == 0.0f) {
                            f3 = 0.0f;
                        } else {
                            f3 = (jArr[i9] * lineViewData2.alpha) / f23;
                        }
                        float[] fArr2 = ((StackLinearChartData) this.chartData).xPercentage;
                        float f26 = (fArr2[i9] * f17) - f18;
                        if (i9 == iMin) {
                            measuredWidth = getMeasuredWidth();
                        } else {
                            measuredWidth = (fArr2[i9 + 1] * f17) - f18;
                        }
                        i2 = i11;
                        if (f3 == 0.0f && i14 == i2) {
                            z2 = true;
                        }
                        float measuredHeight2 = f3 * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                        float measuredHeight3 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight2) - f25;
                        this.startFromY[i14] = measuredHeight3;
                        boolean z3 = z2;
                        float measuredHeight4 = getMeasuredHeight() - this.chartBottom;
                        if (i9 == iMin) {
                            f22 = f26;
                        } else if (i9 == iMax) {
                            f2 = f26;
                        }
                        if (this.transitionMode != 2 || i14 == i2) {
                            measuredHeight2 = measuredHeight2;
                            iMin = iMin;
                            int i15 = iMax;
                            f4 = fCenterY;
                            f5 = f26;
                            f6 = f5;
                            i3 = i15;
                            f7 = 0.0f;
                        } else {
                            if (f26 < fCenterX) {
                                TransitionParams transitionParams = this.transitionParams;
                                f12 = transitionParams.startX[i14];
                                f11 = transitionParams.startY[i14];
                            } else {
                                TransitionParams transitionParams2 = this.transitionParams;
                                float f27 = transitionParams2.endX[i14];
                                f11 = transitionParams2.endY[i14];
                                f12 = f27;
                            }
                            float f28 = fCenterX - f12;
                            float f29 = fCenterY - f11;
                            float f30 = 1.0f - f24;
                            float f31 = ((((f26 - f12) * f29) / f28) + f11) * f24;
                            float f32 = (measuredHeight3 * f30) + f31;
                            float f33 = (measuredHeight4 * f30) + f31;
                            float f34 = f29 / f28;
                            if (f34 > 0.0f) {
                                degrees2 = Math.toDegrees(-Math.atan(f34));
                            } else {
                                degrees2 = Math.toDegrees(Math.atan(Math.abs(f34)));
                            }
                            f7 = ((float) degrees2) - 90.0f;
                            if (f26 >= fCenterX) {
                                float[] fArr3 = this.mapPoints;
                                fArr3[0] = f26;
                                fArr3[1] = f32;
                                this.matrix.reset();
                                f4 = fCenterY;
                                this.matrix.postRotate(this.transitionParams.progress * f7, fCenterX, f4);
                                this.matrix.mapPoints(this.mapPoints);
                                float[] fArr4 = this.mapPoints;
                                f6 = fArr4[0];
                                f13 = fArr4[1];
                                if (f6 < fCenterX) {
                                    f6 = fCenterX;
                                }
                                fArr4[0] = f26;
                                fArr4[1] = f33;
                                this.matrix.reset();
                                this.matrix.postRotate(this.transitionParams.progress * f7, fCenterX, f4);
                                this.matrix.mapPoints(this.mapPoints);
                                measuredHeight4 = this.mapPoints[1];
                                if (f26 < fCenterX) {
                                    f5 = fCenterX;
                                    measuredHeight3 = f13;
                                } else {
                                    measuredHeight3 = f13;
                                    f5 = f26;
                                }
                            } else {
                                f4 = fCenterY;
                                if (measuredWidth >= fCenterX) {
                                    measuredHeight3 = (f32 * f30) + (f4 * f24);
                                    measuredHeight4 = measuredHeight3;
                                    f5 = (f26 * f30) + (fCenterX * f24);
                                    f6 = f5;
                                } else {
                                    float[] fArr5 = this.mapPoints;
                                    fArr5[0] = f26;
                                    fArr5[1] = f32;
                                    this.matrix.reset();
                                    Matrix matrix = this.matrix;
                                    TransitionParams transitionParams3 = this.transitionParams;
                                    float f35 = transitionParams3.progress;
                                    matrix.postRotate((f35 * f7) + (f35 * transitionParams3.angle[i14]), fCenterX, f4);
                                    this.matrix.mapPoints(this.mapPoints);
                                    float[] fArr6 = this.mapPoints;
                                    f6 = fArr6[0];
                                    f13 = fArr6[1];
                                    if (measuredWidth >= fCenterX) {
                                        float f36 = this.transitionParams.progress;
                                        fArr6[0] = (f26 * (1.0f - f36)) + (f36 * fCenterX);
                                    } else {
                                        fArr6[0] = f26;
                                    }
                                    fArr6[1] = f33;
                                    this.matrix.reset();
                                    Matrix matrix2 = this.matrix;
                                    TransitionParams transitionParams4 = this.transitionParams;
                                    float f37 = transitionParams4.progress;
                                    matrix2.postRotate((f37 * f7) + (f37 * transitionParams4.angle[i14]), fCenterX, f4);
                                    this.matrix.mapPoints(this.mapPoints);
                                    float[] fArr7 = this.mapPoints;
                                    f26 = fArr7[0];
                                    measuredHeight4 = fArr7[1];
                                    measuredHeight3 = f13;
                                    f5 = f26;
                                }
                            }
                            i3 = iMax;
                        }
                        if (i9 == i3) {
                            float measuredHeight5 = getMeasuredHeight();
                            if (this.transitionMode != 2 || i14 == i2) {
                                z = false;
                                f10 = 0.0f;
                            } else {
                                float[] fArr8 = this.mapPoints;
                                fArr8[0] = 0.0f - fCenterX;
                                fArr8[1] = measuredHeight5;
                                this.matrix.reset();
                                Matrix matrix3 = this.matrix;
                                TransitionParams transitionParams5 = this.transitionParams;
                                float f38 = transitionParams5.progress;
                                matrix3.postRotate((f7 * f38) + (f38 * transitionParams5.angle[i14]), fCenterX, f4);
                                this.matrix.mapPoints(this.mapPoints);
                                float[] fArr9 = this.mapPoints;
                                z = false;
                                f10 = fArr9[0];
                                measuredHeight5 = fArr9[1];
                            }
                            lineViewData2.chartPath.moveTo(f10, measuredHeight5);
                            this.skipPoints[i14] = z;
                        }
                        TransitionParams transitionParams6 = this.transitionParams;
                        float f39 = transitionParams6 == null ? 0.0f : transitionParams6.progress;
                        if (f3 == 0.0f && i9 > 0 && jArr[i9 - 1] == 0) {
                            i4 = iMin;
                            if (i9 < i4 && jArr[i9 + 1] == 0 && this.transitionMode != 2) {
                                if (!this.skipPoints[i14]) {
                                    if (i14 == i2) {
                                        lineViewData2.chartPath.lineTo(f5, measuredHeight4 * (1.0f - f39));
                                    } else {
                                        lineViewData2.chartPath.lineTo(f5, measuredHeight4);
                                    }
                                }
                                this.skipPoints[i14] = true;
                            }
                            if (i9 == i4) {
                                measuredWidth2 = getMeasuredWidth();
                                measuredHeight = getMeasuredHeight();
                                if (this.transitionMode != 2 && i14 != i2) {
                                    float[] fArr10 = this.mapPoints;
                                    fArr10[0] = measuredWidth2 + fCenterX;
                                    fArr10[1] = measuredHeight;
                                    this.matrix.reset();
                                    Matrix matrix4 = this.matrix;
                                    TransitionParams transitionParams7 = this.transitionParams;
                                    matrix4.postRotate(transitionParams7.progress * transitionParams7.angle[i14], fCenterX, f4);
                                    this.matrix.mapPoints(this.mapPoints);
                                    float[] fArr11 = this.mapPoints;
                                    float f40 = fArr11[0];
                                    float f41 = fArr11[1];
                                } else {
                                    lineViewData2.chartPath.lineTo(measuredWidth2, measuredHeight);
                                }
                                if (this.transitionMode == 2 || i14 == i2) {
                                    i9 = i9;
                                } else {
                                    TransitionParams transitionParams8 = this.transitionParams;
                                    float f42 = (f4 - transitionParams8.startY[i14]) / (fCenterX - transitionParams8.startX[i14]);
                                    if (f42 > 0.0f) {
                                        degrees = Math.toDegrees(-Math.atan(f42));
                                    } else {
                                        degrees = Math.toDegrees(Math.atan(Math.abs(f42)));
                                    }
                                    TransitionParams transitionParams9 = this.transitionParams;
                                    float f43 = transitionParams9.startX[i14];
                                    float f44 = transitionParams9.startY[i14];
                                    float[] fArr12 = this.mapPoints;
                                    fArr12[0] = f43;
                                    fArr12[1] = f44;
                                    this.matrix.reset();
                                    Matrix matrix5 = this.matrix;
                                    TransitionParams transitionParams10 = this.transitionParams;
                                    float f45 = transitionParams10.progress;
                                    matrix5.postRotate(((((float) degrees) - 90.0f) * f45) + (f45 * transitionParams10.angle[i14]), fCenterX, f4);
                                    this.matrix.mapPoints(this.mapPoints);
                                    float[] fArr13 = this.mapPoints;
                                    float f46 = fArr13[0];
                                    float f47 = fArr13[1];
                                    if (Math.abs(f6 - f46) >= 0.001d || ((f47 >= f4 || measuredHeight3 >= f4) && (f47 <= f4 || measuredHeight3 <= f4))) {
                                        iQuarterForPoint = quarterForPoint(f6, measuredHeight3);
                                        iQuarterForPoint2 = quarterForPoint(f46, f47);
                                    } else {
                                        iQuarterForPoint2 = this.transitionParams.angle[i14] == -180.0f ? 0 : 3;
                                        iQuarterForPoint = 0;
                                    }
                                    while (iQuarterForPoint <= iQuarterForPoint2) {
                                        if (iQuarterForPoint == 0) {
                                            lineViewData2.chartPath.lineTo(getMeasuredWidth(), 0.0f);
                                        } else {
                                            if (iQuarterForPoint == 1) {
                                                lineViewData2.chartPath.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                            } else if (iQuarterForPoint == 2) {
                                                lineViewData2.chartPath.lineTo(0.0f, getMeasuredHeight());
                                            } else {
                                                lineViewData2.chartPath.lineTo(0.0f, 0.0f);
                                            }
                                            iQuarterForPoint++;
                                        }
                                        iQuarterForPoint++;
                                    }
                                }
                            } else {
                                i9 = i9;
                            }
                            f9 = f25 + measuredHeight2;
                            z2 = z3;
                        } else {
                            i4 = iMin;
                        }
                        if (!this.skipPoints[i14]) {
                            f8 = 1.0f;
                        } else if (i14 == i2) {
                            f8 = 1.0f;
                            lineViewData2.chartPath.lineTo(f5, measuredHeight4 * (1.0f - f39));
                        } else {
                            f8 = 1.0f;
                            lineViewData2.chartPath.lineTo(f5, measuredHeight4);
                        }
                        if (i14 == i2) {
                            lineViewData2.chartPath.lineTo(f6, (f8 - f39) * measuredHeight3);
                        } else {
                            lineViewData2.chartPath.lineTo(f6, measuredHeight3);
                        }
                        this.skipPoints[i14] = false;
                        if (i9 == i4) {
                            measuredWidth2 = getMeasuredWidth();
                            measuredHeight = getMeasuredHeight();
                            if (this.transitionMode != 2) {
                                lineViewData2.chartPath.lineTo(measuredWidth2, measuredHeight);
                            } else {
                                lineViewData2.chartPath.lineTo(measuredWidth2, measuredHeight);
                            }
                            if (this.transitionMode == 2) {
                                i9 = i9;
                            } else {
                                i9 = i9;
                            }
                        } else {
                            i9 = i9;
                        }
                        f9 = f25 + measuredHeight2;
                        z2 = z3;
                    } else {
                        f9 = f25;
                        f2 = f21;
                        i3 = iMax;
                        i2 = i11;
                        fCenterX = fCenterX;
                        i9 = i9;
                        int i16 = iMin;
                        f4 = fCenterY;
                        i4 = i16;
                    }
                    i14++;
                    f25 = f9;
                    i9 = i9;
                    fCenterX = fCenterX;
                    i10 = i10;
                    f21 = f2;
                    f18 = f18;
                    iMax = i3;
                    i11 = i2;
                    f17 = f17;
                    float f48 = f4;
                    iMin = i4;
                    fCenterY = f48;
                }
                i5 = 0;
                i9++;
                fCenterX = fCenterX;
                i = i13;
                f = f24;
                f21 = f21;
                iMin = iMin;
                fCenterY = fCenterY;
            }
            int i17 = i;
            canvas.save();
            canvas.clipRect(f21, BaseChartView.SIGNATURE_TEXT_HEIGHT, f22, getMeasuredHeight() - this.chartBottom);
            if (z2) {
                canvas.drawColor(Theme.getColor(Theme.key_statisticChartLineEmpty));
            }
            for (int size = this.lines.size() - 1; size >= 0; size--) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(size);
                lineViewData3.paint.setAlpha(i17);
                canvas.drawPath(lineViewData3.chartPath, lineViewData3.paint);
                lineViewData3.paint.setAlpha(255);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    private int quarterForPoint(float f, float f2) {
        float fCenterX = this.chartArea.centerX();
        float fCenterY = this.chartArea.centerY() + AndroidUtilities.dp(16.0f);
        if (f >= fCenterX && f2 <= fCenterY) {
            return 0;
        }
        if (f < fCenterX || f2 < fCenterY) {
            return (f >= fCenterX || f2 < fCenterY) ? 3 : 2;
        }
        return 1;
    }

    @Override
    protected void drawPickerChart(Canvas canvas) {
        long j;
        LineViewData lineViewData;
        float f;
        float f2;
        long j2;
        if (this.chartData != null) {
            int size = this.lines.size();
            for (int i = 0; i < size; i++) {
                ((StackLinearViewData) this.lines.get(i)).chartPathPicker.reset();
            }
            StackLinearChartData stackLinearChartData = (StackLinearChartData) this.chartData;
            int i2 = stackLinearChartData.simplifiedSize;
            boolean[] zArr = this.skipPoints;
            if (zArr == null || zArr.length < stackLinearChartData.lines.size()) {
                this.skipPoints = new boolean[((StackLinearChartData) this.chartData).lines.size()];
            }
            boolean z = false;
            for (int i3 = 0; i3 < i2; i3++) {
                float f3 = 0.0f;
                int i4 = 0;
                float f4 = 0.0f;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    j = 0;
                    if (i4 >= this.lines.size()) {
                        break;
                    }
                    LineViewData lineViewData2 = (LineViewData) this.lines.get(i4);
                    if (lineViewData2.enabled || lineViewData2.alpha != f3) {
                        long j3 = ((StackLinearChartData) this.chartData).simplifiedY[i4][i3];
                        if (j3 > 0) {
                            f4 += j3 * lineViewData2.alpha;
                            i5++;
                        }
                        i6 = i4;
                    }
                    i4++;
                    f3 = 0.0f;
                }
                int i7 = i2 - 1;
                float f5 = (i3 / i7) * this.pickerWidth;
                int i8 = 0;
                float f6 = 0.0f;
                while (i8 < this.lines.size()) {
                    LineViewData lineViewData3 = (LineViewData) this.lines.get(i8);
                    if (lineViewData3.enabled || lineViewData3.alpha != 0.0f) {
                        if (i5 == 1) {
                            lineViewData = lineViewData3;
                            if (((StackLinearChartData) this.chartData).simplifiedY[i8][i3] == j) {
                                f2 = 0.0f;
                                f = 0.0f;
                            } else {
                                f = lineViewData.alpha;
                                f2 = 0.0f;
                            }
                        } else {
                            lineViewData = lineViewData3;
                            if (f4 == 0.0f) {
                                f2 = 0.0f;
                                f = 0.0f;
                            } else {
                                f = (((StackLinearChartData) this.chartData).simplifiedY[i8][i3] * lineViewData.alpha) / f4;
                                f2 = 0.0f;
                            }
                        }
                        if (f == f2 && i8 == i6) {
                            z = true;
                        }
                        float f7 = this.pikerHeight;
                        float f8 = f * f7;
                        float f9 = (f7 - f8) - f6;
                        if (i3 == 0) {
                            lineViewData.chartPathPicker.moveTo(0.0f, f7);
                            this.skipPoints[i8] = false;
                        }
                        long[] jArr = ((StackLinearChartData) this.chartData).simplifiedY[i8];
                        j2 = 0;
                        if (jArr[i3] == 0 && i3 > 0 && jArr[i3 - 1] == 0 && i3 < i7 && jArr[i3 + 1] == 0) {
                            if (!this.skipPoints[i8]) {
                                lineViewData.chartPathPicker.lineTo(f5, this.pikerHeight);
                            }
                            this.skipPoints[i8] = true;
                        } else {
                            if (this.skipPoints[i8]) {
                                lineViewData.chartPathPicker.lineTo(f5, this.pikerHeight);
                            }
                            lineViewData.chartPathPicker.lineTo(f5, f9);
                            this.skipPoints[i8] = false;
                        }
                        if (i3 == i7) {
                            lineViewData.chartPathPicker.lineTo(this.pickerWidth, this.pikerHeight);
                        }
                        f6 += f8;
                        z = z;
                    } else {
                        j2 = j;
                    }
                    i8++;
                    j = j2;
                    i2 = i2;
                }
            }
            if (z) {
                canvas.drawColor(Theme.getColor(Theme.key_statisticChartLineEmpty));
            }
            for (int size2 = this.lines.size() - 1; size2 >= 0; size2--) {
                LineViewData lineViewData4 = (LineViewData) this.lines.get(size2);
                canvas.drawPath(lineViewData4.chartPathPicker, lineViewData4.paint);
            }
        }
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

    @Override
    public void fillTransitionParams(TransitionParams transitionParams) {
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
            float f8 = 0.0f;
            float f9 = 0.0f;
            int i6 = 0;
            for (int i7 = 0; i7 < this.lines.size(); i7++) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i7);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    long j = lineViewData.line.y[i5];
                    if (j > 0) {
                        f9 += j * lineViewData.alpha;
                        i6++;
                    }
                }
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < this.lines.size()) {
                LineViewData lineViewData2 = (LineViewData) this.lines.get(i8);
                if (lineViewData2.enabled || lineViewData2.alpha != f8) {
                    long[] jArr = lineViewData2.line.y;
                    if (i6 == 1) {
                        if (jArr[i5] == 0) {
                            f = 0.0f;
                        } else {
                            f = lineViewData2.alpha;
                        }
                    } else if (f9 == f8) {
                        f = 0.0f;
                    } else {
                        f = (jArr[i5] * lineViewData2.alpha) / f9;
                    }
                    float f10 = (((StackLinearChartData) this.chartData).xPercentage[i5] * f5) - f7;
                    float measuredHeight = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                    float f11 = i9;
                    float measuredHeight2 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight) - f11;
                    i9 = (int) (f11 + measuredHeight);
                    if (i4 == 0) {
                        TransitionParams transitionParams2 = this.transitionParams;
                        transitionParams2.startX[i8] = f10;
                        transitionParams2.startY[i8] = measuredHeight2;
                    } else {
                        TransitionParams transitionParams3 = this.transitionParams;
                        transitionParams3.endX[i8] = f10;
                        transitionParams3.endY[i8] = measuredHeight2;
                    }
                }
                i8++;
                f8 = 0.0f;
            }
            i4++;
            i = 2;
            i2 = 1;
        }
    }
}
