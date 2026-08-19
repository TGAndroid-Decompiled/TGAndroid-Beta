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
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        float measuredWidth;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        TransitionParams transitionParams;
        float f11;
        float f12;
        float measuredWidth2;
        float measuredHeight;
        float f13;
        double degrees;
        float f14;
        float f15;
        int iQuarterForPoint;
        int iQuarterForPoint2;
        float measuredHeight2;
        float f16;
        float f17;
        float f18;
        float f19;
        double degrees2;
        float[] fArr;
        int i2;
        if (this.chartData != null) {
            float f20 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f21 = chartPickerDelegate.pickerEnd;
            float f22 = chartPickerDelegate.pickerStart;
            float f23 = f20 / (f21 - f22);
            float f24 = (f22 * f23) - BaseChartView.HORIZONTAL_PADDING;
            float fCenterX = this.chartArea.centerX();
            float fCenterY = this.chartArea.centerY() + AndroidUtilities.dp(16.0f);
            for (int i3 = 0; i3 < this.lines.size(); i3++) {
                ((StackLinearViewData) this.lines.get(i3)).chartPath.reset();
                ((StackLinearViewData) this.lines.get(i3)).chartPathPicker.reset();
            }
            canvas.save();
            boolean[] zArr = this.skipPoints;
            if (zArr == null || zArr.length < ((StackLinearChartData) this.chartData).lines.size()) {
                this.skipPoints = new boolean[((StackLinearChartData) this.chartData).lines.size()];
                this.startFromY = new float[((StackLinearChartData) this.chartData).lines.size()];
            }
            int i4 = this.transitionMode;
            if (i4 == 2) {
                float f25 = this.transitionParams.progress / 0.6f;
                if (f25 > 1.0f) {
                    f25 = 1.0f;
                }
                this.ovalPath.reset();
                float fWidth = this.chartArea.width() > this.chartArea.height() ? this.chartArea.width() : this.chartArea.height();
                float fHeight = (this.chartArea.width() > this.chartArea.height() ? this.chartArea.height() : this.chartArea.width()) * 0.45f;
                float f26 = fHeight + (((fWidth - fHeight) / 2.0f) * (1.0f - this.transitionParams.progress));
                RectF rectF = new RectF();
                f = 1.0f;
                f2 = 0.0f;
                rectF.set(fCenterX - f26, fCenterY - f26, fCenterX + f26, fCenterY + f26);
                this.ovalPath.addRoundRect(rectF, f26, f26, Path.Direction.CW);
                canvas.clipPath(this.ovalPath);
                f3 = f25;
                i = 255;
            } else {
                f = 1.0f;
                f2 = 0.0f;
                i = i4 == 3 ? (int) (this.transitionParams.progress * 255.0f) : 255;
                f3 = 0.0f;
            }
            float[] fArr2 = ((StackLinearChartData) this.chartData).xPercentage;
            int i5 = ((int) (BaseChartView.HORIZONTAL_PADDING / (fArr2.length < 2 ? 1.0f : fArr2[1] * f23))) + 1;
            int iMax = Math.max(0, (this.startXIndex - i5) - 1);
            int iMin = Math.min(((StackLinearChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i5 + 1);
            int i6 = iMax;
            float f27 = 0.0f;
            float f28 = 0.0f;
            boolean z = false;
            while (i6 <= iMin) {
                float f29 = f23;
                float f30 = f24;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                float f31 = 0.0f;
                while (i8 < this.lines.size()) {
                    LineViewData lineViewData = (LineViewData) this.lines.get(i8);
                    float f32 = f3;
                    if (lineViewData.enabled || lineViewData.alpha != f2) {
                        i2 = i8;
                        long j = lineViewData.line.y[i6];
                        if (j > 0) {
                            f31 += j * lineViewData.alpha;
                            i9++;
                        }
                        i7 = i2;
                    } else {
                        i2 = i8;
                    }
                    i8 = i2 + 1;
                    f3 = f32;
                }
                float f33 = f3;
                int i10 = 0;
                float f34 = 0.0f;
                while (i10 < this.lines.size()) {
                    LineViewData lineViewData2 = (LineViewData) this.lines.get(i10);
                    float f35 = f27;
                    if (lineViewData2.enabled || lineViewData2.alpha != f2) {
                        long[] jArr = lineViewData2.line.y;
                        if (i9 == 1) {
                            if (jArr[i6] == 0) {
                                f4 = f28;
                                f5 = 0.0f;
                            } else {
                                float f36 = f28;
                                f5 = lineViewData2.alpha;
                                f4 = f36;
                            }
                        } else if (f31 == f2) {
                            f4 = f28;
                            f5 = 0.0f;
                        } else {
                            f4 = f28;
                            f5 = (jArr[i6] * lineViewData2.alpha) / f31;
                        }
                        float[] fArr3 = ((StackLinearChartData) this.chartData).xPercentage;
                        float f37 = (fArr3[i6] * f29) - f30;
                        if (i6 == iMin) {
                            measuredWidth = getMeasuredWidth();
                        } else {
                            measuredWidth = (fArr3[i6 + 1] * f29) - f30;
                        }
                        if (f5 == f2 && i10 == i7) {
                            z = true;
                        }
                        float f38 = f4;
                        float measuredHeight3 = f5 * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                        float measuredHeight4 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight3) - f34;
                        this.startFromY[i10] = measuredHeight4;
                        float measuredHeight5 = getMeasuredHeight() - this.chartBottom;
                        if (i6 == iMin) {
                            f38 = f37;
                        } else if (i6 == iMax) {
                            f35 = f37;
                        }
                        if (this.transitionMode != 2 || i10 == i7) {
                            f6 = f37;
                            f7 = measuredHeight4;
                            f8 = measuredHeight5;
                            f9 = 0.0f;
                        } else {
                            if (f37 < fCenterX) {
                                TransitionParams transitionParams2 = this.transitionParams;
                                f19 = transitionParams2.startX[i10];
                                f18 = transitionParams2.startY[i10];
                            } else {
                                TransitionParams transitionParams3 = this.transitionParams;
                                float f39 = transitionParams3.endX[i10];
                                f18 = transitionParams3.endY[i10];
                                f19 = f39;
                            }
                            float f40 = fCenterX - f19;
                            float f41 = fCenterY - f18;
                            float f42 = (((f37 - f19) * f41) / f40) + f18;
                            float f43 = f - f33;
                            float f44 = measuredHeight4 * f43;
                            float f45 = f42 * f33;
                            float f46 = f44 + f45;
                            float f47 = (measuredHeight5 * f43) + f45;
                            float f48 = f41 / f40;
                            if (f48 > f2) {
                                degrees2 = Math.toDegrees(-Math.atan(f48));
                            } else {
                                degrees2 = Math.toDegrees(Math.atan(Math.abs(f48)));
                            }
                            float f49 = ((float) degrees2) - 90.0f;
                            if (f37 >= fCenterX) {
                                float[] fArr4 = this.mapPoints;
                                fArr4[0] = f37;
                                fArr4[1] = f46;
                                this.matrix.reset();
                                this.matrix.postRotate(this.transitionParams.progress * f49, fCenterX, fCenterY);
                                this.matrix.mapPoints(this.mapPoints);
                                float[] fArr5 = this.mapPoints;
                                f6 = fArr5[0];
                                float f50 = fArr5[1];
                                if (f6 < fCenterX) {
                                    f6 = fCenterX;
                                }
                                fArr5[0] = f37;
                                fArr5[1] = f47;
                                this.matrix.reset();
                                f9 = f49;
                                this.matrix.postRotate(this.transitionParams.progress * f9, fCenterX, fCenterY);
                                this.matrix.mapPoints(this.mapPoints);
                                float f51 = this.mapPoints[1];
                                if (f37 < fCenterX) {
                                    f8 = f51;
                                    f7 = f50;
                                    f10 = fCenterX;
                                } else {
                                    f10 = f37;
                                    f8 = f51;
                                    f7 = f50;
                                }
                            } else {
                                f9 = f49;
                                if (measuredWidth >= fCenterX) {
                                    float f52 = (f37 * f43) + (fCenterX * f33);
                                    f7 = (f46 * f43) + (fCenterY * f33);
                                    f8 = f7;
                                    f6 = f52;
                                } else {
                                    float[] fArr6 = this.mapPoints;
                                    fArr6[0] = f37;
                                    fArr6[1] = f46;
                                    this.matrix.reset();
                                    Matrix matrix = this.matrix;
                                    TransitionParams transitionParams4 = this.transitionParams;
                                    float f53 = transitionParams4.progress;
                                    matrix.postRotate((f53 * f9) + (f53 * transitionParams4.angle[i10]), fCenterX, fCenterY);
                                    this.matrix.mapPoints(this.mapPoints);
                                    float[] fArr7 = this.mapPoints;
                                    float f54 = fArr7[0];
                                    float f55 = fArr7[1];
                                    if (measuredWidth >= fCenterX) {
                                        fArr = fArr7;
                                        float f56 = this.transitionParams.progress;
                                        fArr[0] = (f37 * (f - f56)) + (f56 * fCenterX);
                                    } else {
                                        fArr = fArr7;
                                        fArr[0] = f37;
                                    }
                                    fArr[1] = f47;
                                    this.matrix.reset();
                                    Matrix matrix2 = this.matrix;
                                    TransitionParams transitionParams5 = this.transitionParams;
                                    float f57 = transitionParams5.progress;
                                    matrix2.postRotate((f57 * f9) + (f57 * transitionParams5.angle[i10]), fCenterX, fCenterY);
                                    this.matrix.mapPoints(this.mapPoints);
                                    float[] fArr8 = this.mapPoints;
                                    f10 = fArr8[0];
                                    f8 = fArr8[1];
                                    f6 = f54;
                                    f7 = f55;
                                }
                            }
                            if (i6 == iMax) {
                                measuredHeight2 = getMeasuredHeight();
                                if (this.transitionMode == 2 || i10 == i7) {
                                    f16 = measuredHeight2;
                                    f17 = 0.0f;
                                } else {
                                    float[] fArr9 = this.mapPoints;
                                    fArr9[0] = f2 - fCenterX;
                                    fArr9[1] = measuredHeight2;
                                    this.matrix.reset();
                                    Matrix matrix3 = this.matrix;
                                    TransitionParams transitionParams6 = this.transitionParams;
                                    float f58 = transitionParams6.progress;
                                    matrix3.postRotate((f9 * f58) + (f58 * transitionParams6.angle[i10]), fCenterX, fCenterY);
                                    this.matrix.mapPoints(this.mapPoints);
                                    float[] fArr10 = this.mapPoints;
                                    float f59 = fArr10[0];
                                    f16 = fArr10[1];
                                    f17 = f59;
                                }
                                lineViewData2.chartPath.moveTo(f17, f16);
                                this.skipPoints[i10] = false;
                            } else {
                                i = i;
                            }
                            transitionParams = this.transitionParams;
                            if (transitionParams == null) {
                                f11 = 0.0f;
                            } else {
                                f11 = transitionParams.progress;
                            }
                            if (f5 != f2 && i6 > 0 && jArr[i6 - 1] == 0 && i6 < iMin && jArr[i6 + 1] == 0 && this.transitionMode != 2) {
                                if (!this.skipPoints[i10]) {
                                    if (i10 == i7) {
                                        lineViewData2.chartPath.lineTo(f10, f8 * (f - f11));
                                    } else {
                                        lineViewData2.chartPath.lineTo(f10, f8);
                                    }
                                }
                                this.skipPoints[i10] = true;
                            } else {
                                if (this.skipPoints[i10]) {
                                    if (i10 == i7) {
                                        lineViewData2.chartPath.lineTo(f10, f8 * (f - f11));
                                    } else {
                                        lineViewData2.chartPath.lineTo(f10, f8);
                                    }
                                }
                                if (i10 == i7) {
                                    lineViewData2.chartPath.lineTo(f6, (f - f11) * f7);
                                } else {
                                    lineViewData2.chartPath.lineTo(f6, f7);
                                }
                                this.skipPoints[i10] = false;
                            }
                            if (i6 == iMin) {
                                measuredWidth2 = getMeasuredWidth();
                                measuredHeight = getMeasuredHeight();
                                if (this.transitionMode != 2 && i10 != i7) {
                                    float[] fArr11 = this.mapPoints;
                                    fArr11[0] = measuredWidth2 + fCenterX;
                                    fArr11[1] = measuredHeight;
                                    this.matrix.reset();
                                    Matrix matrix4 = this.matrix;
                                    TransitionParams transitionParams7 = this.transitionParams;
                                    matrix4.postRotate(transitionParams7.progress * transitionParams7.angle[i10], fCenterX, fCenterY);
                                    this.matrix.mapPoints(this.mapPoints);
                                    float[] fArr12 = this.mapPoints;
                                    float f60 = fArr12[0];
                                    float f61 = fArr12[1];
                                } else {
                                    lineViewData2.chartPath.lineTo(measuredWidth2, measuredHeight);
                                }
                                if (this.transitionMode == 2 && i10 != i7) {
                                    TransitionParams transitionParams8 = this.transitionParams;
                                    f13 = (fCenterY - transitionParams8.startY[i10]) / (fCenterX - transitionParams8.startX[i10]);
                                    if (f13 > f2) {
                                        degrees = Math.toDegrees(-Math.atan(f13));
                                    } else {
                                        degrees = Math.toDegrees(Math.atan(Math.abs(f13)));
                                    }
                                    TransitionParams transitionParams9 = this.transitionParams;
                                    float f62 = transitionParams9.startX[i10];
                                    float f63 = transitionParams9.startY[i10];
                                    float[] fArr13 = this.mapPoints;
                                    fArr13[0] = f62;
                                    fArr13[1] = f63;
                                    this.matrix.reset();
                                    Matrix matrix5 = this.matrix;
                                    TransitionParams transitionParams10 = this.transitionParams;
                                    float f64 = transitionParams10.progress;
                                    matrix5.postRotate(((((float) degrees) - 90.0f) * f64) + (f64 * transitionParams10.angle[i10]), fCenterX, fCenterY);
                                    this.matrix.mapPoints(this.mapPoints);
                                    float[] fArr14 = this.mapPoints;
                                    f14 = fArr14[0];
                                    f15 = fArr14[1];
                                    if (Math.abs(f6 - f14) < 0.001d || ((f15 >= fCenterY || f7 >= fCenterY) && (f15 <= fCenterY || f7 <= fCenterY))) {
                                        iQuarterForPoint = quarterForPoint(f6, f7);
                                        iQuarterForPoint2 = quarterForPoint(f14, f15);
                                    } else if (this.transitionParams.angle[i10] == -180.0f) {
                                        iQuarterForPoint = 0;
                                        iQuarterForPoint2 = 0;
                                    } else {
                                        iQuarterForPoint = 0;
                                        iQuarterForPoint2 = 3;
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
                            }
                            f12 = f34 + measuredHeight3;
                            f28 = f38;
                            z = z;
                        }
                        f10 = f6;
                        if (i6 == iMax) {
                            measuredHeight2 = getMeasuredHeight();
                            if (this.transitionMode == 2) {
                                f16 = measuredHeight2;
                                f17 = 0.0f;
                            } else {
                                f16 = measuredHeight2;
                                f17 = 0.0f;
                            }
                            lineViewData2.chartPath.moveTo(f17, f16);
                            this.skipPoints[i10] = false;
                        } else {
                            i = i;
                        }
                        transitionParams = this.transitionParams;
                        if (transitionParams == null) {
                            f11 = 0.0f;
                        } else {
                            f11 = transitionParams.progress;
                        }
                        if (f5 != f2) {
                            if (this.skipPoints[i10]) {
                                if (i10 == i7) {
                                    lineViewData2.chartPath.lineTo(f10, f8 * (f - f11));
                                } else {
                                    lineViewData2.chartPath.lineTo(f10, f8);
                                }
                            }
                            if (i10 == i7) {
                                lineViewData2.chartPath.lineTo(f6, (f - f11) * f7);
                            } else {
                                lineViewData2.chartPath.lineTo(f6, f7);
                            }
                            this.skipPoints[i10] = false;
                        } else {
                            if (this.skipPoints[i10]) {
                                if (i10 == i7) {
                                    lineViewData2.chartPath.lineTo(f10, f8 * (f - f11));
                                } else {
                                    lineViewData2.chartPath.lineTo(f10, f8);
                                }
                            }
                            if (i10 == i7) {
                                lineViewData2.chartPath.lineTo(f6, (f - f11) * f7);
                            } else {
                                lineViewData2.chartPath.lineTo(f6, f7);
                            }
                            this.skipPoints[i10] = false;
                        }
                        if (i6 == iMin) {
                            measuredWidth2 = getMeasuredWidth();
                            measuredHeight = getMeasuredHeight();
                            if (this.transitionMode != 2) {
                                lineViewData2.chartPath.lineTo(measuredWidth2, measuredHeight);
                            } else {
                                lineViewData2.chartPath.lineTo(measuredWidth2, measuredHeight);
                            }
                            if (this.transitionMode == 2) {
                                TransitionParams transitionParams11 = this.transitionParams;
                                f13 = (fCenterY - transitionParams11.startY[i10]) / (fCenterX - transitionParams11.startX[i10]);
                                if (f13 > f2) {
                                    degrees = Math.toDegrees(-Math.atan(f13));
                                } else {
                                    degrees = Math.toDegrees(Math.atan(Math.abs(f13)));
                                }
                                TransitionParams transitionParams12 = this.transitionParams;
                                float f65 = transitionParams12.startX[i10];
                                float f66 = transitionParams12.startY[i10];
                                float[] fArr15 = this.mapPoints;
                                fArr15[0] = f65;
                                fArr15[1] = f66;
                                this.matrix.reset();
                                Matrix matrix6 = this.matrix;
                                TransitionParams transitionParams13 = this.transitionParams;
                                float f67 = transitionParams13.progress;
                                matrix6.postRotate(((((float) degrees) - 90.0f) * f67) + (f67 * transitionParams13.angle[i10]), fCenterX, fCenterY);
                                this.matrix.mapPoints(this.mapPoints);
                                float[] fArr16 = this.mapPoints;
                                f14 = fArr16[0];
                                f15 = fArr16[1];
                                if (Math.abs(f6 - f14) < 0.001d) {
                                    iQuarterForPoint = quarterForPoint(f6, f7);
                                    iQuarterForPoint2 = quarterForPoint(f14, f15);
                                } else {
                                    iQuarterForPoint = quarterForPoint(f6, f7);
                                    iQuarterForPoint2 = quarterForPoint(f14, f15);
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
                        }
                        f12 = f34 + measuredHeight3;
                        f28 = f38;
                        z = z;
                    } else {
                        i = i;
                        f12 = f34;
                        iMax = iMax;
                        i9 = i9;
                    }
                    f27 = f35;
                    i10++;
                    f34 = f12;
                    i9 = i9;
                    iMax = iMax;
                    i = i;
                    f2 = 0.0f;
                }
                i6++;
                f23 = f29;
                f24 = f30;
                f3 = f33;
                f2 = 0.0f;
            }
            int i11 = i;
            canvas.save();
            canvas.clipRect(f27, BaseChartView.SIGNATURE_TEXT_HEIGHT, f28, getMeasuredHeight() - this.chartBottom);
            if (z) {
                canvas.drawColor(Theme.getColor(Theme.key_statisticChartLineEmpty));
            }
            for (int size = this.lines.size() - 1; size >= 0; size--) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(size);
                lineViewData3.paint.setAlpha(i11);
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
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z2;
        long[] jArr;
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
            int i3 = 0;
            boolean z3 = false;
            while (true) {
                int i4 = 1;
                if (i3 >= i2) {
                    break;
                }
                float f5 = 0.0f;
                int i5 = 0;
                float f6 = 0.0f;
                int i6 = 0;
                int i7 = 0;
                while (i5 < this.lines.size()) {
                    LineViewData lineViewData = (LineViewData) this.lines.get(i5);
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        long j = ((StackLinearChartData) this.chartData).simplifiedY[i5][i3];
                        if (j > 0) {
                            f6 += j * lineViewData.alpha;
                            i6++;
                        }
                        i7 = i5;
                    }
                    i5++;
                    i2 = i2;
                }
                int i8 = i2;
                int i9 = i8 - 1;
                float f7 = (i3 / i9) * this.pickerWidth;
                int i10 = 0;
                float f8 = 0.0f;
                while (i10 < this.lines.size()) {
                    LineViewData lineViewData2 = (LineViewData) this.lines.get(i10);
                    if (lineViewData2.enabled || lineViewData2.alpha != f5) {
                        if (i6 == i4) {
                            if (((StackLinearChartData) this.chartData).simplifiedY[i10][i3] != 0) {
                                f2 = lineViewData2.alpha;
                            }
                            z = true;
                            f = 0.0f;
                            if (f2 == f && i10 == i7) {
                                z3 = true;
                            }
                            f3 = this.pikerHeight;
                            float f9 = f2 * f3;
                            f4 = (f3 - f9) - f8;
                            if (i3 == 0) {
                                z2 = false;
                                lineViewData2.chartPathPicker.moveTo(0.0f, f3);
                                this.skipPoints[i10] = false;
                            } else {
                                z2 = false;
                            }
                            jArr = ((StackLinearChartData) this.chartData).simplifiedY[i10];
                            if (jArr[i3] != 0 && i3 > 0 && jArr[i3 - 1] == 0 && i3 < i9 && jArr[i3 + 1] == 0) {
                                if (!this.skipPoints[i10]) {
                                    lineViewData2.chartPathPicker.lineTo(f7, this.pikerHeight);
                                }
                                this.skipPoints[i10] = z;
                            } else {
                                if (this.skipPoints[i10]) {
                                    lineViewData2.chartPathPicker.lineTo(f7, this.pikerHeight);
                                }
                                lineViewData2.chartPathPicker.lineTo(f7, f4);
                                this.skipPoints[i10] = z2;
                            }
                            if (i3 == i9) {
                                lineViewData2.chartPathPicker.lineTo(this.pickerWidth, this.pikerHeight);
                            }
                            f8 += f9;
                        } else {
                            if (f6 != f5) {
                                z = true;
                                f = 0.0f;
                                f2 = (((StackLinearChartData) this.chartData).simplifiedY[i10][i3] * lineViewData2.alpha) / f6;
                            }
                            if (f2 == f) {
                                z3 = true;
                            }
                            f3 = this.pikerHeight;
                            float f10 = f2 * f3;
                            f4 = (f3 - f10) - f8;
                            if (i3 == 0) {
                                z2 = false;
                                lineViewData2.chartPathPicker.moveTo(0.0f, f3);
                                this.skipPoints[i10] = false;
                            } else {
                                z2 = false;
                            }
                            jArr = ((StackLinearChartData) this.chartData).simplifiedY[i10];
                            if (jArr[i3] != 0) {
                                if (this.skipPoints[i10]) {
                                    lineViewData2.chartPathPicker.lineTo(f7, this.pikerHeight);
                                }
                                lineViewData2.chartPathPicker.lineTo(f7, f4);
                                this.skipPoints[i10] = z2;
                            } else {
                                if (this.skipPoints[i10]) {
                                    lineViewData2.chartPathPicker.lineTo(f7, this.pikerHeight);
                                }
                                lineViewData2.chartPathPicker.lineTo(f7, f4);
                                this.skipPoints[i10] = z2;
                            }
                            if (i3 == i9) {
                                lineViewData2.chartPathPicker.lineTo(this.pickerWidth, this.pikerHeight);
                            }
                            f8 += f10;
                        }
                        f2 = 0.0f;
                        z = true;
                        f = 0.0f;
                        if (f2 == f) {
                            z3 = true;
                        }
                        f3 = this.pikerHeight;
                        float f11 = f2 * f3;
                        f4 = (f3 - f11) - f8;
                        if (i3 == 0) {
                            z2 = false;
                            lineViewData2.chartPathPicker.moveTo(0.0f, f3);
                            this.skipPoints[i10] = false;
                        } else {
                            z2 = false;
                        }
                        jArr = ((StackLinearChartData) this.chartData).simplifiedY[i10];
                        if (jArr[i3] != 0) {
                            if (this.skipPoints[i10]) {
                                lineViewData2.chartPathPicker.lineTo(f7, this.pikerHeight);
                            }
                            lineViewData2.chartPathPicker.lineTo(f7, f4);
                            this.skipPoints[i10] = z2;
                        } else {
                            if (this.skipPoints[i10]) {
                                lineViewData2.chartPathPicker.lineTo(f7, this.pikerHeight);
                            }
                            lineViewData2.chartPathPicker.lineTo(f7, f4);
                            this.skipPoints[i10] = z2;
                        }
                        if (i3 == i9) {
                            lineViewData2.chartPathPicker.lineTo(this.pickerWidth, this.pikerHeight);
                        }
                        f8 += f11;
                    } else {
                        z3 = z3;
                    }
                    i10++;
                    z3 = z3;
                    i4 = 1;
                    f5 = 0.0f;
                }
                i3++;
                i2 = i8;
            }
            if (z3) {
                canvas.drawColor(Theme.getColor(Theme.key_statisticChartLineEmpty));
            }
            for (int size2 = this.lines.size() - 1; size2 >= 0; size2--) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(size2);
                canvas.drawPath(lineViewData3.chartPathPicker, lineViewData3.paint);
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
        int i;
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
        int i2 = 2;
        int i3 = 1;
        int i4 = ((int) (f6 / (fArr.length < 2 ? 1.0f : fArr[1] * f5))) + 1;
        int iMax = Math.max(0, (this.startXIndex - i4) - 1);
        int iMin = Math.min(((StackLinearChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i4 + 1);
        this.transitionParams.startX = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.startY = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.endX = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.endY = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.angle = new float[((StackLinearChartData) this.chartData).lines.size()];
        int i5 = 0;
        while (i5 < i2) {
            int i6 = i5 == i3 ? iMin : iMax;
            float f8 = 0.0f;
            int i7 = 0;
            float f9 = 0.0f;
            int i8 = 0;
            while (i7 < this.lines.size()) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i7);
                if (lineViewData.enabled || lineViewData.alpha != f8) {
                    i = i7;
                    long j = lineViewData.line.y[i6];
                    if (j > 0) {
                        f9 += j * lineViewData.alpha;
                        i8++;
                    }
                } else {
                    i = i7;
                }
                i7 = i + 1;
                f8 = 0.0f;
            }
            int i9 = 0;
            int i10 = 0;
            while (i9 < this.lines.size()) {
                LineViewData lineViewData2 = (LineViewData) this.lines.get(i9);
                if (lineViewData2.enabled || lineViewData2.alpha != 0.0f) {
                    long[] jArr = lineViewData2.line.y;
                    if (i8 == i3) {
                        if (jArr[i6] == 0) {
                            f = 0.0f;
                        } else {
                            f = lineViewData2.alpha;
                        }
                    } else if (f9 == 0.0f) {
                        f = 0.0f;
                    } else {
                        f = (jArr[i6] * lineViewData2.alpha) / f9;
                    }
                    float f10 = (((StackLinearChartData) this.chartData).xPercentage[i6] * f5) - f7;
                    float measuredHeight = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                    float f11 = i10;
                    float measuredHeight2 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight) - f11;
                    i10 = (int) (f11 + measuredHeight);
                    if (i5 == 0) {
                        TransitionParams transitionParams2 = this.transitionParams;
                        transitionParams2.startX[i9] = f10;
                        transitionParams2.startY[i9] = measuredHeight2;
                    } else {
                        TransitionParams transitionParams3 = this.transitionParams;
                        transitionParams3.endX[i9] = f10;
                        transitionParams3.endY[i9] = measuredHeight2;
                    }
                }
                i9++;
                i3 = 1;
            }
            i5++;
            i2 = 2;
            i3 = 1;
        }
    }
}
