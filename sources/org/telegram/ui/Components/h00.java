package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

public class h00 extends View implements org.telegram.ui.ActionBar.x5 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.c6 H;
    public float[] I;
    public Paint J;
    public int K;
    public int L;
    public float M;
    public h00 N;
    public boolean O;
    public float P;

    public int f28879a;

    public LinearGradient f28880b;

    public final Paint f28881c;
    public final Paint d;

    public long f28882e;

    public int f28883f;
    public final Matrix h;

    public final RectF f28884n;

    public int f28885r;

    public int f28886s;
    public int v;

    public boolean f28887w;

    public boolean f28888x;

    public boolean f28889y;

    public h00(Context context) {
        this(context, null);
    }

    public final float a(float f10) {
        return LocaleController.isRTL ? getMeasuredWidth() - f10 : f10;
    }

    public final void b(RectF rectF) {
        if (LocaleController.isRTL) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i10) {
        switch (getViewType()) {
            case 1:
                return AndroidUtilities.dp(78.0f) + 1;
            case 2:
                return AndroidUtilities.dp(2.0f) + ((i10 - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount());
            case 3:
            case 4:
                return AndroidUtilities.dp(56.0f);
            case 5:
                return AndroidUtilities.dp(80.0f);
            case 6:
            case 18:
                return AndroidUtilities.dp(64.0f);
            case 7:
                return AndroidUtilities.dp((SharedConfig.useThreeLinesLayout ? 78 : 72) + 1);
            case 8:
                return AndroidUtilities.dp(61.0f);
            case 9:
                return AndroidUtilities.dp(66.0f);
            case 10:
                return AndroidUtilities.dp(58.0f);
            case 11:
                return AndroidUtilities.dp(36.0f);
            case 12:
                return AndroidUtilities.dp(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return AndroidUtilities.dp(107.0f);
            case 16:
            case 23:
                return AndroidUtilities.dp(50.0f);
            case 19:
                return AndroidUtilities.dp(58.0f);
            case 21:
                return AndroidUtilities.dp(58.0f);
            case 22:
                return AndroidUtilities.dp(60.0f);
            case 24:
                return AndroidUtilities.dp((SharedConfig.useThreeLinesLayout ? 76 : 64) + 1);
            case 25:
                return AndroidUtilities.dp(51.0f);
            case 26:
                return AndroidUtilities.dp(50.0f) + 1;
            case 28:
                return AndroidUtilities.dp(58.0f);
            case 29:
                return AndroidUtilities.dp(60.0f) + 1;
            case 30:
                return AndroidUtilities.dp(32.0f);
            case 31:
                return AndroidUtilities.dp(48.0f) + 1;
            case 32:
                return AndroidUtilities.dp(56.0f) + 1;
            case 33:
                return AndroidUtilities.dp(58.0f);
            case 34:
                return AndroidUtilities.dp(140.0f);
            case 35:
                return AndroidUtilities.dp(112.0f);
            case 36:
                return AndroidUtilities.dp(108.0f);
        }
    }

    @Override
    public final void d() {
        int i10;
        h00 h00Var = this.N;
        if (h00Var != null) {
            h00Var.d();
            return;
        }
        int i11 = this.D;
        org.telegram.ui.ActionBar.c6 c6Var = this.H;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        int iV1 = org.telegram.ui.ActionBar.g6.v0(this.E, c6Var);
        if (this.f28886s == iV1 && this.f28885r == iV0) {
            return;
        }
        this.f28885r = iV0;
        this.f28886s = iV1;
        int i12 = this.A;
        if (i12 == 34 || i12 == 35 || i12 == 36) {
            this.f28879a = AndroidUtilities.displaySize.x;
        } else if (this.f28889y || i12 == 13 || i12 == 14 || i12 == 17) {
            this.f28879a = AndroidUtilities.dp(200.0f);
        } else {
            this.f28879a = AndroidUtilities.dp(600.0f);
        }
        if (this.f28889y || (i10 = this.A) == 13 || i10 == 14 || i10 == 17) {
            this.f28880b = new LinearGradient(0.0f, 0.0f, this.f28879a, 0.0f, new int[]{iV1, iV0, iV0, iV1}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.f28880b = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28879a, new int[]{iV1, iV0, iV0, iV1}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f28881c.setShader(this.f28880b);
    }

    public final int e(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.H);
    }

    public final void f(int i10, int i11, int i12) {
        this.D = i10;
        this.E = i11;
        this.F = i12;
        invalidate();
    }

    public final void g() {
        this.f28887w = false;
    }

    public int getAdditionalHeight() {
        return 0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getColumnsCount() {
        return 2;
    }

    public Paint getPaint() {
        return this.f28881c;
    }

    public int getViewType() {
        return this.A;
    }

    public final void h() {
        h00 h00Var = this.N;
        if (h00Var != null) {
            h00Var.h();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jAbs = Math.abs(this.f28882e - jElapsedRealtime);
        if (jAbs > 17) {
            jAbs = 16;
        }
        if (jAbs < 4) {
            jAbs = 0;
        }
        int iMax = this.K;
        if (iMax == 0) {
            iMax = getMeasuredWidth();
        }
        int i10 = this.A;
        if (i10 == 34 || i10 == 35 || i10 == 36) {
            iMax = Math.max(iMax, AndroidUtilities.displaySize.x);
        }
        int measuredHeight = this.L;
        if (measuredHeight == 0) {
            measuredHeight = getMeasuredHeight();
        }
        this.f28882e = jElapsedRealtime;
        boolean z10 = this.f28889y;
        Matrix matrix = this.h;
        if (z10 || this.A == 13 || getViewType() == 14 || getViewType() == 17) {
            int i11 = (int) (((jAbs * ((long) iMax)) / 400.0f) + this.f28883f);
            this.f28883f = i11;
            if (i11 >= iMax * 2) {
                this.f28883f = (-this.f28879a) * 2;
            }
            matrix.setTranslate(this.f28883f + this.M, 0.0f);
        } else {
            int i12 = (int) (((jAbs * ((long) measuredHeight)) / 400.0f) + this.f28883f);
            this.f28883f = i12;
            if (i12 >= measuredHeight * 2) {
                this.f28883f = (-this.f28879a) * 2;
            }
            matrix.setTranslate(this.M, this.f28883f);
        }
        LinearGradient linearGradient = this.f28880b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        Paint paint2;
        float f10;
        if (this.N != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                h00 h00Var = this.N;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                float f11 = -getX();
                h00Var.K = measuredWidth;
                h00Var.L = measuredHeight;
                h00Var.M = f11;
            }
            paint = this.N.f28881c;
        } else {
            paint = this.f28881c;
        }
        Paint paint3 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.M = -getX();
        }
        d();
        h();
        int iG = this.B;
        if (this.f28888x) {
            int iDp = AndroidUtilities.dp(32.0f) + iG;
            int i10 = this.F;
            if (i10 >= 0) {
                this.d.setColor(e(i10));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(32.0f), this.F >= 0 ? this.d : paint3);
            canvas2 = canvas;
            iG = iDp;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i11 = 0;
        int i12 = 1;
        RectF rectF = this.f28884n;
        if (viewType == 7) {
            while (iG <= getMeasuredHeight()) {
                int iC = c(getMeasuredWidth());
                int iDp2 = AndroidUtilities.dp(28.0f);
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + iDp2), (iC >> 1) + iG, iDp2, paint3);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + iG, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + iG);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + iG, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + iG);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(54.0f) + iG, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + iG);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                if (this.f28887w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + iG);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                iG = org.telegram.ui.Cells.pa.g(this, iG);
                int i13 = i11 + 1;
                if (this.f28889y && i13 >= this.G) {
                    break;
                } else {
                    i11 = i13;
                }
            }
        } else if (getViewType() == 24) {
            while (iG <= getMeasuredHeight()) {
                int iDp3 = AndroidUtilities.dp(14.0f);
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + iDp3), org.telegram.messenger.y1.C(10.0f, iG, iDp3), iDp3, paint3);
                canvas2.save();
                canvas2.translate(0.0f, -AndroidUtilities.dp(4.0f));
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + iG, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + iG);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(38.0f) + iG, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + iG);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(54.0f) + iG, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + iG);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                if (this.f28887w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + iG);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                canvas2.restore();
                iG += c(getMeasuredWidth());
                int i14 = i11 + 1;
                if (this.f28889y && i14 >= this.G) {
                    break;
                } else {
                    i11 = i14;
                }
            }
        } else if (getViewType() == 18) {
            int iG2 = iG;
            while (iG2 <= getMeasuredHeight()) {
                int iDp4 = AndroidUtilities.dp(25.0f);
                canvas2.drawCircle(a(org.telegram.messenger.y1.C(9.0f, this.C, iDp4)), AndroidUtilities.dp(32.0f) + iG2, iDp4, paint3);
                int i15 = i11 % 2 == 0 ? 52 : 72;
                float f12 = 76;
                rectF.set(AndroidUtilities.dp(f12), AndroidUtilities.dp(20.0f) + iG2, AndroidUtilities.dp(i15 + 76), AndroidUtilities.dp(28.0f) + iG2);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(i15 + 84), AndroidUtilities.dp(20.0f) + iG2, AndroidUtilities.dp(i15 + 168), AndroidUtilities.dp(28.0f) + iG2);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(f12), AndroidUtilities.dp(42.0f) + iG2, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + iG2);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                Canvas canvas3 = canvas2;
                Paint paint4 = paint3;
                canvas3.drawLine(AndroidUtilities.dp(f12), org.telegram.ui.Cells.pa.g(this, iG2), getMeasuredWidth(), org.telegram.ui.Cells.pa.g(this, iG2), paint4);
                canvas2 = canvas3;
                iG2 = org.telegram.ui.Cells.pa.g(this, iG2);
                int i16 = i11 + 1;
                if (this.f28889y && i16 >= this.G) {
                    break;
                }
                i11 = i16;
                paint3 = paint4;
            }
        } else {
            Paint paint5 = paint3;
            if (getViewType() == 19) {
                int iG3 = iG;
                while (iG3 <= getMeasuredHeight()) {
                    int iDp5 = AndroidUtilities.dp(20.0f);
                    canvas2.drawCircle(a(org.telegram.messenger.y1.C(9.0f, this.C, iDp5)), AndroidUtilities.dp(29.0f) + iG3, iDp5, paint5);
                    float f13 = 76;
                    rectF.set(AndroidUtilities.dp(f13), AndroidUtilities.dp(16.0f) + iG3, AndroidUtilities.dp((i11 % 2 == 0 ? 92 : 128) + 76), AndroidUtilities.dp(24.0f) + iG3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    rectF.set(AndroidUtilities.dp(f13), AndroidUtilities.dp(38.0f) + iG3, AndroidUtilities.dp(240), AndroidUtilities.dp(46.0f) + iG3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    Canvas canvas4 = canvas2;
                    Paint paint6 = paint5;
                    canvas4.drawLine(AndroidUtilities.dp(f13), org.telegram.ui.Cells.pa.g(this, iG3), getMeasuredWidth(), org.telegram.ui.Cells.pa.g(this, iG3), paint6);
                    canvas2 = canvas4;
                    paint5 = paint6;
                    iG3 = org.telegram.ui.Cells.pa.g(this, iG3);
                    int i17 = i11 + 1;
                    if (this.f28889y && i17 >= this.G) {
                        break;
                    } else {
                        i11 = i17;
                    }
                }
            } else if (getViewType() == 1) {
                while (iG <= getMeasuredHeight()) {
                    int iDp6 = AndroidUtilities.dp(25.0f);
                    canvas2.drawCircle(a(AndroidUtilities.dp(9.0f) + iDp6), (AndroidUtilities.dp(78.0f) >> 1) + iG, iDp6, paint5);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(20.0f) + iG, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(28.0f) + iG);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(42.0f) + iG, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(50.0f) + iG);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    if (this.f28887w) {
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    }
                    iG = org.telegram.ui.Cells.pa.g(this, iG);
                    int i18 = i11 + 1;
                    if (this.f28889y && i18 >= this.G) {
                        break;
                    } else {
                        i11 = i18;
                    }
                }
            } else if (getViewType() == 2 || getViewType() == 27) {
                int measuredWidth2 = (getMeasuredWidth() - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount();
                int i19 = getViewType() == 27 ? (int) (measuredWidth2 * 1.25f) : measuredWidth2;
                int iC2 = iG;
                int i20 = 0;
                while (true) {
                    if (iC2 >= getMeasuredHeight() && !this.f28889y) {
                        break;
                    }
                    int i21 = 0;
                    while (i21 < getColumnsCount()) {
                        if (i20 != 0 || i21 >= this.v) {
                            int iDp7 = (AndroidUtilities.dp(2.0f) + measuredWidth2) * i21;
                            paint2 = paint5;
                            canvas.drawRect(iDp7, iC2, iDp7 + measuredWidth2, iC2 + i19, paint2);
                        } else {
                            paint2 = paint5;
                        }
                        i21++;
                        paint5 = paint2;
                    }
                    Paint paint7 = paint5;
                    iC2 = org.telegram.messenger.y1.C(2.0f, i19, iC2);
                    i20++;
                    if (this.f28889y && i20 >= 2) {
                        break;
                    }
                    paint5 = paint7;
                }
            } else {
                float f14 = 8.0f;
                if (getViewType() == 3) {
                    while (iG <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f) + iG, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(48.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + iG, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + iG, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.f28887w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        int i22 = i11 + 1;
                        if (this.f28889y && i22 >= this.G) {
                            break;
                        } else {
                            i11 = i22;
                        }
                    }
                } else if (getViewType() == 4) {
                    while (iG <= getMeasuredHeight()) {
                        int iDp8 = AndroidUtilities.dp(44.0f) >> 1;
                        canvas2.drawCircle(a(AndroidUtilities.dp(12.0f) + iDp8), org.telegram.messenger.y1.C(6.0f, iG, iDp8), iDp8, paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + iG, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + iG, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.f28887w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        int i23 = i11 + 1;
                        if (this.f28889y && i23 >= this.G) {
                            break;
                        } else {
                            i11 = i23;
                        }
                    }
                } else if (getViewType() == 5) {
                    while (iG <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(11.0f) + iG, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(63.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + iG, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + iG, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(42.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(54.0f) + iG, AndroidUtilities.dp(188.0f), AndroidUtilities.dp(62.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.f28887w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        int i24 = i11 + 1;
                        if (this.f28889y && i24 >= this.G) {
                            break;
                        } else {
                            i11 = i24;
                        }
                    }
                } else if (getViewType() == 6 || getViewType() == 10) {
                    while (iG <= getMeasuredHeight()) {
                        int iDp9 = AndroidUtilities.dp(23.0f);
                        canvas2.drawCircle(a(org.telegram.messenger.y1.C(9.0f, this.C, iDp9)), (AndroidUtilities.dp(64.0f) >> 1) + iG, iDp9, paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + iG, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + iG, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.f28887w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        int i25 = i11 + 1;
                        if (this.f28889y && i25 >= this.G) {
                            break;
                        } else {
                            i11 = i25;
                        }
                    }
                } else if (getViewType() == 29) {
                    while (iG <= getMeasuredHeight()) {
                        int iDp10 = AndroidUtilities.dp(23.0f);
                        canvas2.drawCircle(a(org.telegram.messenger.y1.C(9.0f, this.C, iDp10)), (AndroidUtilities.dp(64.0f) >> 1) + iG, iDp10, paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + iG, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + iG, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        int i26 = i11 + 1;
                        if (this.f28889y && i26 >= this.G) {
                            break;
                        } else {
                            i11 = i26;
                        }
                    }
                } else if (getViewType() == 33) {
                    while (iG <= getMeasuredHeight()) {
                        int iDp11 = AndroidUtilities.dp(23.0f);
                        canvas2.drawCircle(a(org.telegram.messenger.y1.C(13.0f, this.C, iDp11)), (AndroidUtilities.dp(58.0f) >> 1) + iG, iDp11, paint5);
                        rectF.set(AndroidUtilities.dp(72.0f) + this.C, AndroidUtilities.dp(17.0f) + iG, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f) + this.C, AndroidUtilities.dp(39.0f) + iG, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        int i27 = i11 + 1;
                        if (this.f28889y && i27 >= this.G) {
                            break;
                        } else {
                            i11 = i27;
                        }
                    }
                } else if (getViewType() == 30) {
                    while (iG <= getMeasuredHeight()) {
                        iG += c(getMeasuredWidth());
                        rectF.set(0.0f, iG, getMeasuredWidth(), iG);
                        b(rectF);
                        canvas2.drawRect(rectF, paint5);
                        int i28 = i11 + 1;
                        if (this.f28889y && i28 >= this.G) {
                            break;
                        } else {
                            i11 = i28;
                        }
                    }
                } else if (getViewType() == 8) {
                    while (iG <= getMeasuredHeight()) {
                        int iDp12 = AndroidUtilities.dp(23.0f);
                        canvas2.drawCircle(a(org.telegram.messenger.y1.C(11.0f, this.C, iDp12)), (AndroidUtilities.dp(64.0f) >> 1) + iG, iDp12, paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + iG, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(25.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + iG, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(47.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.f28887w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        int i29 = i11 + 1;
                        if (this.f28889y && i29 >= this.G) {
                            break;
                        } else {
                            i11 = i29;
                        }
                    }
                } else if (getViewType() == 9) {
                    while (iG <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(AndroidUtilities.dp(35.0f)), (c(getMeasuredWidth()) >> 1) + iG, AndroidUtilities.dp(32.0f) / 2, paint5);
                        rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(16.0f) + iG, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(24.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(38.0f) + iG, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(46.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.f28887w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        int i30 = i11 + 1;
                        if (this.f28889y && i30 >= this.G) {
                            break;
                        } else {
                            i11 = i30;
                        }
                    }
                } else if (getViewType() == 11) {
                    int i31 = 0;
                    while (iG <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.I[0] * 40.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.I[0] * 20.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        i31++;
                        if (this.f28889y && i31 >= this.G) {
                            break;
                        }
                    }
                } else if (getViewType() == 12) {
                    int iDp13 = AndroidUtilities.dp(14.0f) + iG;
                    while (iDp13 <= getMeasuredHeight()) {
                        int measuredWidth3 = getMeasuredWidth() / 4;
                        for (int i32 = 0; i32 < 4; i32++) {
                            float f15 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i32);
                            canvas2.drawCircle(f15, (AndroidUtilities.dp(56.0f) / 2.0f) + AndroidUtilities.dp(7.0f) + iDp13, AndroidUtilities.dp(28.0f), paint5);
                            float fDp = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(7.0f) + iDp13;
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(f15 - AndroidUtilities.dp(24.0f), fDp - AndroidUtilities.dp(4.0f), f15 + AndroidUtilities.dp(24.0f), fDp + AndroidUtilities.dp(4.0f));
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iDp13 = org.telegram.ui.Cells.pa.g(this, iDp13);
                        if (this.f28889y) {
                            break;
                        }
                    }
                } else if (getViewType() == 13) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(AndroidUtilities.dp(40.0f), measuredHeight2 - AndroidUtilities.dp(4.0f), getMeasuredWidth() - AndroidUtilities.dp(120.0f), AndroidUtilities.dp(4.0f) + measuredHeight2);
                    canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    if (this.J == null) {
                        Paint paint8 = new Paint(1);
                        this.J = paint8;
                        paint8.setColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.G8));
                    }
                    for (int i33 = 0; i33 < 3; i33++) {
                        canvas2.drawCircle(org.telegram.messenger.y1.D(12.0f, i33, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(13.0f), this.J);
                        canvas2.drawCircle(org.telegram.messenger.y1.D(12.0f, i33, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(12.0f), paint5);
                    }
                } else if (getViewType() == 14 || getViewType() == 17) {
                    int iDp14 = AndroidUtilities.dp(12.0f);
                    int iDp15 = AndroidUtilities.dp(77.0f);
                    int iDp16 = AndroidUtilities.dp(4.0f);
                    float fDp2 = AndroidUtilities.dp(21.0f);
                    float fDp3 = AndroidUtilities.dp(41.0f);
                    while (iDp14 < getMeasuredWidth()) {
                        if (this.J == null) {
                            this.J = new Paint(i12);
                        }
                        this.J.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, this.H));
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        int i34 = iDp14 + iDp15;
                        rectF4.set(AndroidUtilities.dp(4.0f) + iDp14, AndroidUtilities.dp(4.0f), i34 - AndroidUtilities.dp(4.0f), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                        if (getViewType() == 14) {
                            float fDp4 = AndroidUtilities.dp(f14) + iDp16;
                            float f16 = iDp14;
                            float fDp5 = AndroidUtilities.dp(22.0f) + iDp16 + f16;
                            rectF.set(fDp5, fDp4, fDp5 + fDp3, fDp4 + fDp2);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.J);
                            float fDp6 = AndroidUtilities.dp(5.0f) + iDp16;
                            float fDp7 = AndroidUtilities.dp(4.0f) + fDp2 + fDp4;
                            float f17 = f16 + fDp6;
                            rectF.set(f17, fDp7, f17 + fDp3, fDp7 + fDp2);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.J);
                        } else {
                            if (getViewType() == 17) {
                                float fDp8 = AndroidUtilities.dp(5.0f);
                                float fDp9 = AndroidUtilities.dp(32.0f);
                                f10 = 8.0f;
                                float fA = com.google.android.recaptcha.internal.a.A(iDp15, fDp9, 2.0f, iDp14);
                                int iDp17 = AndroidUtilities.dp(21.0f);
                                rectF4.set(fA, iDp17, fDp9 + fA, AndroidUtilities.dp(32.0f) + iDp17);
                                canvas2.drawRoundRect(rectF4, fDp8, fDp8, this.J);
                            }
                            canvas2.drawCircle((iDp15 / 2) + iDp14, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f10), this.J);
                            iDp14 = i34;
                            i12 = 1;
                            f14 = 8.0f;
                        }
                        f10 = 8.0f;
                        canvas2.drawCircle((iDp15 / 2) + iDp14, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f10), this.J);
                        iDp14 = i34;
                        i12 = 1;
                        f14 = 8.0f;
                    }
                } else if (getViewType() == 15) {
                    int iDp18 = AndroidUtilities.dp(23.0f);
                    int iDp19 = AndroidUtilities.dp(4.0f);
                    while (iG <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.y1.C(12.0f, this.C, iDp18)), org.telegram.messenger.y1.C(8.0f, iG, iDp18), iDp18, paint5);
                        rectF.set(AndroidUtilities.dp(74.0f) + this.C, AndroidUtilities.dp(12.0f) + iG, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(20.0f) + iG);
                        b(rectF);
                        float f18 = iDp19;
                        canvas2.drawRoundRect(rectF, f18, f18, paint5);
                        rectF.set(AndroidUtilities.dp(74.0f) + this.C, AndroidUtilities.dp(36.0f) + iG, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(42.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, f18, f18, paint5);
                        if (this.P > 0.0f) {
                            rectF.set(AndroidUtilities.dp(73.0f) + this.C, AndroidUtilities.dp(62.0f) + iG, AndroidUtilities.dp(73.0f) + this.C + this.P, AndroidUtilities.dp(94.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, f18, f18, paint5);
                        }
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        int i35 = i11 + 1;
                        if (this.f28889y && i35 >= this.G) {
                            break;
                        } else {
                            i11 = i35;
                        }
                    }
                } else if (getViewType() == 16 || getViewType() == 23) {
                    int i36 = 0;
                    while (iG <= getMeasuredHeight()) {
                        int iDp20 = AndroidUtilities.dp(18.0f);
                        canvas2.drawCircle(a(org.telegram.messenger.y1.C(8.0f, this.C, iDp20)), AndroidUtilities.dp(24.0f) + iG, iDp20, paint5);
                        rectF.set(AndroidUtilities.dp(58.0f) + this.C, AndroidUtilities.dp(20.0f) + iG, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + iG);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                        if (i36 < 4) {
                            int iDp21 = AndroidUtilities.dp(12.0f);
                            canvas2.drawCircle(a(org.telegram.messenger.y1.B(12.0f, getWidth(), iDp21)), AndroidUtilities.dp(24.0f) + iG, iDp21, paint5);
                        }
                        iG = org.telegram.ui.Cells.pa.g(this, iG);
                        i36++;
                        if (this.f28889y && i36 >= this.G) {
                            break;
                        }
                    }
                    rectF.set(AndroidUtilities.dp(8.0f) + this.C, AndroidUtilities.dp(20.0f) + iG, getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(28.0f) + iG);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                    rectF.set(AndroidUtilities.dp(8.0f) + this.C, AndroidUtilities.dp(36.0f) + iG, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(44.0f) + iG);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                } else {
                    int i37 = this.A;
                    if (i37 == 21) {
                        while (iG <= getMeasuredHeight()) {
                            int iDp22 = AndroidUtilities.dp(46.0f) >> 1;
                            canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + iDp22), (AndroidUtilities.dp(58.0f) >> 1) + iG, iDp22, paint5);
                            rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(16.0f) + iG, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(38.0f) + iG, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iG = org.telegram.ui.Cells.pa.g(this, iG);
                            int i38 = i11 + 1;
                            if (this.f28889y && i38 >= this.G) {
                                break;
                            } else {
                                i11 = i38;
                            }
                        }
                    } else if (i37 == 22) {
                        while (iG <= getMeasuredHeight()) {
                            int iDp23 = AndroidUtilities.dp(48.0f) >> 1;
                            canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + iDp23), org.telegram.messenger.y1.C(6.0f, iG, iDp23), iDp23, paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + iG, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + iG, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iG = org.telegram.ui.Cells.pa.g(this, iG);
                            int i39 = i11 + 1;
                            if (this.f28889y && i39 >= this.G) {
                                break;
                            } else {
                                i11 = i39;
                            }
                        }
                    } else if (i37 == 25) {
                        while (iG <= getMeasuredHeight()) {
                            int iDp24 = AndroidUtilities.dp(38.0f) >> 1;
                            canvas2.drawCircle(AndroidUtilities.dp(17.0f) + iDp24, org.telegram.messenger.y1.C(6.0f, iG, iDp24), iDp24, paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(21.0f) + iG, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(29.0f) + iG);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iG = org.telegram.ui.Cells.pa.g(this, iG);
                            int i40 = i11 + 1;
                            if (this.f28889y && i40 >= this.G) {
                                break;
                            } else {
                                i11 = i40;
                            }
                        }
                    } else if (i37 == 26) {
                        while (iG <= getMeasuredHeight()) {
                            int iDp25 = AndroidUtilities.dp(21.0f) >> 1;
                            canvas2.drawCircle(LocaleController.isRTL ? org.telegram.messenger.y1.B(21.0f, getMeasuredWidth(), iDp25) : AndroidUtilities.dp(21.0f) + iDp25, org.telegram.messenger.y1.C(16.0f, iG, iDp25), iDp25, paint5);
                            rectF.set(AndroidUtilities.dp(60.0f), AndroidUtilities.dp(21.0f) + iG, AndroidUtilities.dp(190.0f), AndroidUtilities.dp(29.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(21.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(62.0f), AndroidUtilities.dp(29.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iG = org.telegram.ui.Cells.pa.g(this, iG);
                            int i41 = i11 + 1;
                            if (this.f28889y && i41 >= this.G) {
                                break;
                            } else {
                                i11 = i41;
                            }
                        }
                    } else if (getViewType() == 28) {
                        while (iG <= getMeasuredHeight()) {
                            int iDp26 = AndroidUtilities.dp(24.0f);
                            canvas2.drawCircle(a(org.telegram.messenger.y1.C(10.0f, this.C, iDp26)), (AndroidUtilities.dp(58.0f) >> 1) + iG, iDp26, paint5);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + iG, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + iG, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + iG);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            if (this.f28887w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + iG, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + iG);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            }
                            iG = org.telegram.ui.Cells.pa.g(this, iG);
                            int i42 = i11 + 1;
                            if (this.f28889y && i42 >= this.G) {
                                break;
                            } else {
                                i11 = i42;
                            }
                        }
                    } else if (getViewType() == 31) {
                        while (iG <= getMeasuredHeight()) {
                            int iC3 = c(getMeasuredWidth());
                            float f19 = iG;
                            rectF.set(AndroidUtilities.dp(18.0f) + this.C, ((iC3 - AndroidUtilities.dp(22.0f)) / 2.0f) + f19, AndroidUtilities.dp(40.0f) + this.C, ((AndroidUtilities.dp(22.0f) + iC3) / 2.0f) + f19);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint5);
                            rectF.set(AndroidUtilities.dp(58.0f) + this.C, ((iC3 - AndroidUtilities.dp(8.0f)) / 2.0f) + f19, Math.min(AndroidUtilities.dp(132.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + iC3) / 2.0f) + f19);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iG += iC3;
                            int i43 = i11 + 1;
                            if (this.f28889y && i43 >= this.G) {
                                break;
                            } else {
                                i11 = i43;
                            }
                        }
                    } else if (getViewType() == 32) {
                        while (iG <= getMeasuredHeight()) {
                            int iC4 = c(getMeasuredWidth());
                            float f20 = iG;
                            rectF.set(AndroidUtilities.dp(10.0f) + this.C, ((iC4 - AndroidUtilities.dp(32.0f)) / 2.0f) + f20, AndroidUtilities.dp(42.0f) + this.C, ((AndroidUtilities.dp(32.0f) + iC4) / 2.0f) + f20);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                            rectF.set(AndroidUtilities.dp(64.0f) + this.C, (((iC4 - AndroidUtilities.dp(14.0f)) - AndroidUtilities.dp(10.0f)) / 2.0f) + f20, Math.min(AndroidUtilities.dp(118.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(10.0f) + (iC4 - AndroidUtilities.dp(14.0f))) / 2.0f) + f20);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(64.0f) + this.C, (((AndroidUtilities.dp(14.0f) + iC4) - AndroidUtilities.dp(8.0f)) / 2.0f) + f20, Math.min(AndroidUtilities.dp(144.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(14.0f) + iC4)) / 2.0f) + f20);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iG += iC4;
                            int i44 = i11 + 1;
                            if (this.f28889y && i44 >= this.G) {
                                break;
                            } else {
                                i11 = i44;
                            }
                        }
                    } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                        rectF.set(this.C, this.B, getMeasuredWidth() - this.C, getMeasuredHeight() - this.B);
                        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint5);
                    }
                }
            }
        }
        invalidate();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (!this.f28889y) {
            super.onMeasure(i10, i11);
            return;
        }
        int i12 = this.G;
        if (i12 > 1 && this.O) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i10)) * this.G), 1073741824));
        } else if (i12 <= 1 || View.MeasureSpec.getSize(i11) <= 0) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i10)), 1073741824));
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i11), c(View.MeasureSpec.getSize(i10)) * this.G), 1073741824));
        }
    }

    public void setGlobalGradientView(h00 h00Var) {
        this.N = h00Var;
    }

    public void setIgnoreHeightCheck(boolean z10) {
        this.O = z10;
    }

    public void setIsSingleCell(boolean z10) {
        this.f28889y = z10;
    }

    public void setItemsCount(int i10) {
        this.G = i10;
    }

    public void setMemberRequestButton(boolean z10) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.P = textPaint.measureText(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup)) + AndroidUtilities.dp(34.0f);
    }

    public void setPaddingLeft(int i10) {
        this.C = i10;
        invalidate();
    }

    public void setPaddingTop(int i10) {
        this.B = i10;
        invalidate();
    }

    public void setUseHeaderOffset(boolean z10) {
        this.f28888x = z10;
    }

    public void setViewType(int i10) {
        this.A = i10;
        if (i10 == 11) {
            Random random = new Random();
            this.I = new float[2];
            for (int i11 = 0; i11 < 2; i11++) {
                this.I[i11] = org.telegram.ui.Cells.pa.f(random, 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    public h00(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28881c = new Paint();
        this.d = new Paint();
        this.f28884n = new RectF();
        this.f28887w = true;
        this.D = org.telegram.ui.ActionBar.g6.G8;
        this.E = org.telegram.ui.ActionBar.g6.f23144i6;
        this.F = -1;
        this.G = 1;
        this.H = c6Var;
        this.h = new Matrix();
    }
}
