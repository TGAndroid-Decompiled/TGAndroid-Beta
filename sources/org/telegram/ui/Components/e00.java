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
public class e00 extends View implements org.telegram.ui.ActionBar.w5 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.b6 H;
    public float[] I;
    public Paint J;
    public int K;
    public int L;
    public float M;
    public e00 N;
    public boolean O;
    public float P;
    public int f27877a;
    public LinearGradient f27878b;
    public final Paint f27879c;
    public final Paint d;
    public long f27880e;
    public int f27881f;
    public final Matrix h;
    public final RectF f27882n;
    public int f27883r;
    public int f27884s;
    public int v;
    public boolean f27885w;
    public boolean f27886x;
    public boolean f27887y;

    public e00(Context context) {
        this(context, null);
    }

    public final float a(float f10) {
        if (LocaleController.isRTL) {
            return getMeasuredWidth() - f10;
        }
        return f10;
    }

    public final void b(RectF rectF) {
        if (LocaleController.isRTL) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i9) {
        int i10;
        int i11;
        switch (getViewType()) {
            case 1:
                return AndroidUtilities.dp(78.0f) + 1;
            case 2:
                int dp = AndroidUtilities.dp(2.0f);
                return AndroidUtilities.dp(2.0f) + ((i9 - ((getColumnsCount() - 1) * dp)) / getColumnsCount());
            case 3:
            case 4:
                return AndroidUtilities.dp(56.0f);
            case 5:
                return AndroidUtilities.dp(80.0f);
            case 6:
            case 18:
                return AndroidUtilities.dp(64.0f);
            case 7:
                if (SharedConfig.useThreeLinesLayout) {
                    i10 = 78;
                } else {
                    i10 = 72;
                }
                return AndroidUtilities.dp(i10 + 1);
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
                if (SharedConfig.useThreeLinesLayout) {
                    i11 = 76;
                } else {
                    i11 = 64;
                }
                return AndroidUtilities.dp(i11 + 1);
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
        int i9;
        e00 e00Var = this.N;
        if (e00Var != null) {
            e00Var.d();
            return;
        }
        int i10 = this.D;
        org.telegram.ui.ActionBar.b6 b6Var = this.H;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(this.E, b6Var);
        if (this.f27884s == v03 && this.f27883r == v02) {
            return;
        }
        this.f27883r = v02;
        this.f27884s = v03;
        int i11 = this.A;
        if (i11 != 34 && i11 != 35 && i11 != 36) {
            if (!this.f27887y && i11 != 13 && i11 != 14 && i11 != 17) {
                this.f27877a = AndroidUtilities.dp(600.0f);
            } else {
                this.f27877a = AndroidUtilities.dp(200.0f);
            }
        } else {
            this.f27877a = AndroidUtilities.displaySize.x;
        }
        if (!this.f27887y && (i9 = this.A) != 13 && i9 != 14 && i9 != 17) {
            this.f27878b = new LinearGradient(0.0f, 0.0f, 0.0f, this.f27877a, new int[]{v03, v02, v02, v03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.f27878b = new LinearGradient(0.0f, 0.0f, this.f27877a, 0.0f, new int[]{v03, v02, v02, v03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f27879c.setShader(this.f27878b);
    }

    public final int e(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.H);
    }

    public final void f(int i9, int i10, int i11) {
        this.D = i9;
        this.E = i10;
        this.F = i11;
        invalidate();
    }

    public final void g() {
        this.f27885w = false;
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
        return this.f27879c;
    }

    public int getViewType() {
        return this.A;
    }

    public final void h() {
        e00 e00Var = this.N;
        if (e00Var != null) {
            e00Var.h();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f27880e - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int i9 = this.K;
        if (i9 == 0) {
            i9 = getMeasuredWidth();
        }
        int i10 = this.A;
        if (i10 == 34 || i10 == 35 || i10 == 36) {
            i9 = Math.max(i9, AndroidUtilities.displaySize.x);
        }
        int i11 = this.L;
        if (i11 == 0) {
            i11 = getMeasuredHeight();
        }
        this.f27880e = elapsedRealtime;
        boolean z10 = this.f27887y;
        Matrix matrix = this.h;
        if (!z10 && this.A != 13 && getViewType() != 14 && getViewType() != 17) {
            int i12 = (int) ((((float) (abs * i11)) / 400.0f) + this.f27881f);
            this.f27881f = i12;
            if (i12 >= i11 * 2) {
                this.f27881f = (-this.f27877a) * 2;
            }
            matrix.setTranslate(this.M, this.f27881f);
        } else {
            int i13 = (int) ((((float) (abs * i9)) / 400.0f) + this.f27881f);
            this.f27881f = i13;
            if (i13 >= i9 * 2) {
                this.f27881f = (-this.f27877a) * 2;
            }
            matrix.setTranslate(this.f27881f + this.M, 0.0f);
        }
        LinearGradient linearGradient = this.f27878b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        int i9;
        int dp;
        Paint paint2;
        int dp2;
        float f10;
        int dp3;
        int dp4;
        int dp5;
        int dp6;
        int dp7;
        int dp8;
        int dp9;
        int dp10;
        int dp11;
        int dp12;
        int dp13;
        int dp14;
        int dp15;
        int dp16;
        int i10;
        int dp17;
        int i11;
        int dp18;
        int dp19;
        Paint paint3;
        if (this.N != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                e00 e00Var = this.N;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                e00Var.K = measuredWidth;
                e00Var.L = measuredHeight;
                e00Var.M = -getX();
            }
            paint = this.N.f27879c;
        } else {
            paint = this.f27879c;
        }
        Paint paint4 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.M = -getX();
        }
        d();
        h();
        int i12 = this.B;
        if (this.f27886x) {
            int dp20 = AndroidUtilities.dp(32.0f) + i12;
            int i13 = this.F;
            if (i13 >= 0) {
                this.d.setColor(e(i13));
            }
            float measuredWidth2 = getMeasuredWidth();
            float dp21 = AndroidUtilities.dp(32.0f);
            if (this.F >= 0) {
                paint3 = this.d;
            } else {
                paint3 = paint4;
            }
            canvas.drawRect(0.0f, 0.0f, measuredWidth2, dp21, paint3);
            canvas2 = canvas;
            i12 = dp20;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i14 = 0;
        int i15 = 1;
        RectF rectF = this.f27882n;
        if (viewType == 7) {
            while (i12 <= getMeasuredHeight()) {
                int c10 = c(getMeasuredWidth());
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + dp19), (c10 >> 1) + i12, AndroidUtilities.dp(28.0f), paint4);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i12, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + i12);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i12, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + i12);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(54.0f) + i12, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + i12);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                }
                if (this.f27885w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i12);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                }
                i12 = org.telegram.ui.Cells.j2.f(this, i12);
                int i16 = i14 + 1;
                if (this.f27887y && i16 >= this.G) {
                    break;
                }
                i14 = i16;
            }
        } else if (getViewType() == 24) {
            while (i12 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + dp18), org.telegram.messenger.l0.C(10.0f, i12, dp18), AndroidUtilities.dp(14.0f), paint4);
                canvas2.save();
                canvas2.translate(0.0f, -AndroidUtilities.dp(4.0f));
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i12, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + i12);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(38.0f) + i12, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + i12);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(54.0f) + i12, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + i12);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                }
                if (this.f27885w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i12);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                }
                canvas2.restore();
                i12 += c(getMeasuredWidth());
                int i17 = i14 + 1;
                if (this.f27887y && i17 >= this.G) {
                    break;
                }
                i14 = i17;
            }
        } else if (getViewType() == 18) {
            int i18 = i12;
            while (i18 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.l0.C(9.0f, this.C, dp17)), AndroidUtilities.dp(32.0f) + i18, AndroidUtilities.dp(25.0f), paint4);
                if (i14 % 2 == 0) {
                    i11 = 52;
                } else {
                    i11 = 72;
                }
                float f11 = 76;
                rectF.set(AndroidUtilities.dp(f11), AndroidUtilities.dp(20.0f) + i18, AndroidUtilities.dp(i11 + 76), AndroidUtilities.dp(28.0f) + i18);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                rectF.set(AndroidUtilities.dp(i11 + 84), AndroidUtilities.dp(20.0f) + i18, AndroidUtilities.dp(i11 + 168), AndroidUtilities.dp(28.0f) + i18);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                rectF.set(AndroidUtilities.dp(f11), AndroidUtilities.dp(42.0f) + i18, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + i18);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                Canvas canvas3 = canvas2;
                Paint paint5 = paint4;
                canvas3.drawLine(AndroidUtilities.dp(f11), org.telegram.ui.Cells.j2.f(this, i18), getMeasuredWidth(), org.telegram.ui.Cells.j2.f(this, i18), paint5);
                canvas2 = canvas3;
                i18 = org.telegram.ui.Cells.j2.f(this, i18);
                int i19 = i14 + 1;
                if (this.f27887y && i19 >= this.G) {
                    break;
                }
                i14 = i19;
                paint4 = paint5;
            }
        } else {
            Paint paint6 = paint4;
            if (getViewType() == 19) {
                int i20 = i12;
                while (i20 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.l0.C(9.0f, this.C, dp16)), AndroidUtilities.dp(29.0f) + i20, AndroidUtilities.dp(20.0f), paint6);
                    if (i14 % 2 == 0) {
                        i10 = 92;
                    } else {
                        i10 = 128;
                    }
                    float f12 = 76;
                    rectF.set(AndroidUtilities.dp(f12), AndroidUtilities.dp(16.0f) + i20, AndroidUtilities.dp(i10 + 76), AndroidUtilities.dp(24.0f) + i20);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                    rectF.set(AndroidUtilities.dp(f12), AndroidUtilities.dp(38.0f) + i20, AndroidUtilities.dp(240), AndroidUtilities.dp(46.0f) + i20);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                    Canvas canvas4 = canvas2;
                    Paint paint7 = paint6;
                    canvas4.drawLine(AndroidUtilities.dp(f12), org.telegram.ui.Cells.j2.f(this, i20), getMeasuredWidth(), org.telegram.ui.Cells.j2.f(this, i20), paint7);
                    canvas2 = canvas4;
                    paint6 = paint7;
                    i20 = org.telegram.ui.Cells.j2.f(this, i20);
                    int i21 = i14 + 1;
                    if (this.f27887y && i21 >= this.G) {
                        break;
                    }
                    i14 = i21;
                }
            } else if (getViewType() == 1) {
                while (i12 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(AndroidUtilities.dp(9.0f) + dp15), (AndroidUtilities.dp(78.0f) >> 1) + i12, AndroidUtilities.dp(25.0f), paint6);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(20.0f) + i12, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(28.0f) + i12);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(42.0f) + i12, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(50.0f) + i12);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                    if (this.f27885w) {
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                    }
                    i12 = org.telegram.ui.Cells.j2.f(this, i12);
                    int i22 = i14 + 1;
                    if (this.f27887y && i22 >= this.G) {
                        break;
                    }
                    i14 = i22;
                }
            } else if (getViewType() != 2 && getViewType() != 27) {
                float f13 = 8.0f;
                if (getViewType() == 3) {
                    while (i12 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f) + i12, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(48.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i12, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i12, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (this.f27885w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        }
                        i12 = org.telegram.ui.Cells.j2.f(this, i12);
                        int i23 = i14 + 1;
                        if (this.f27887y && i23 >= this.G) {
                            break;
                        }
                        i14 = i23;
                    }
                } else if (getViewType() == 4) {
                    while (i12 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(AndroidUtilities.dp(12.0f) + dp14), org.telegram.messenger.l0.C(6.0f, i12, dp14), AndroidUtilities.dp(44.0f) >> 1, paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i12, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i12, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (this.f27885w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        }
                        i12 = org.telegram.ui.Cells.j2.f(this, i12);
                        int i24 = i14 + 1;
                        if (this.f27887y && i24 >= this.G) {
                            break;
                        }
                        i14 = i24;
                    }
                } else if (getViewType() == 5) {
                    while (i12 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(11.0f) + i12, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(63.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i12, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i12, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(42.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(54.0f) + i12, AndroidUtilities.dp(188.0f), AndroidUtilities.dp(62.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (this.f27885w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        }
                        i12 = org.telegram.ui.Cells.j2.f(this, i12);
                        int i25 = i14 + 1;
                        if (this.f27887y && i25 >= this.G) {
                            break;
                        }
                        i14 = i25;
                    }
                } else if (getViewType() != 6 && getViewType() != 10) {
                    if (getViewType() == 29) {
                        while (i12 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.l0.C(9.0f, this.C, dp13)), (AndroidUtilities.dp(64.0f) >> 1) + i12, AndroidUtilities.dp(23.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i12, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i12, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            i12 = org.telegram.ui.Cells.j2.f(this, i12);
                            int i26 = i14 + 1;
                            if (this.f27887y && i26 >= this.G) {
                                break;
                            }
                            i14 = i26;
                        }
                    } else if (getViewType() == 33) {
                        while (i12 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.l0.C(13.0f, this.C, dp12)), (AndroidUtilities.dp(58.0f) >> 1) + i12, AndroidUtilities.dp(23.0f), paint6);
                            rectF.set(AndroidUtilities.dp(72.0f) + this.C, AndroidUtilities.dp(17.0f) + i12, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(72.0f) + this.C, AndroidUtilities.dp(39.0f) + i12, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            i12 = org.telegram.ui.Cells.j2.f(this, i12);
                            int i27 = i14 + 1;
                            if (this.f27887y && i27 >= this.G) {
                                break;
                            }
                            i14 = i27;
                        }
                    } else if (getViewType() == 30) {
                        while (i12 <= getMeasuredHeight()) {
                            i12 += c(getMeasuredWidth());
                            rectF.set(0.0f, i12, getMeasuredWidth(), i12);
                            b(rectF);
                            canvas2.drawRect(rectF, paint6);
                            int i28 = i14 + 1;
                            if (this.f27887y && i28 >= this.G) {
                                break;
                            }
                            i14 = i28;
                        }
                    } else if (getViewType() == 8) {
                        while (i12 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.l0.C(11.0f, this.C, dp11)), (AndroidUtilities.dp(64.0f) >> 1) + i12, AndroidUtilities.dp(23.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i12, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(25.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i12, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(47.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            if (this.f27885w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            i12 = org.telegram.ui.Cells.j2.f(this, i12);
                            int i29 = i14 + 1;
                            if (this.f27887y && i29 >= this.G) {
                                break;
                            }
                            i14 = i29;
                        }
                    } else if (getViewType() == 9) {
                        while (i12 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(AndroidUtilities.dp(35.0f)), (c(getMeasuredWidth()) >> 1) + i12, AndroidUtilities.dp(32.0f) / 2, paint6);
                            rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(16.0f) + i12, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(24.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(38.0f) + i12, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(46.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            if (this.f27885w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            i12 = org.telegram.ui.Cells.j2.f(this, i12);
                            int i30 = i14 + 1;
                            if (this.f27887y && i30 >= this.G) {
                                break;
                            }
                            i14 = i30;
                        }
                    } else if (getViewType() == 11) {
                        int i31 = 0;
                        while (i12 <= getMeasuredHeight()) {
                            rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.I[0] * 40.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.I[0] * 20.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            i12 = org.telegram.ui.Cells.j2.f(this, i12);
                            i31++;
                            if (this.f27887y && i31 >= this.G) {
                                break;
                            }
                        }
                    } else if (getViewType() == 12) {
                        int dp22 = AndroidUtilities.dp(14.0f) + i12;
                        while (dp22 <= getMeasuredHeight()) {
                            int measuredWidth3 = getMeasuredWidth() / 4;
                            for (int i32 = 0; i32 < 4; i32++) {
                                float f14 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i32);
                                canvas2.drawCircle(f14, (AndroidUtilities.dp(56.0f) / 2.0f) + AndroidUtilities.dp(7.0f) + dp22, AndroidUtilities.dp(28.0f), paint6);
                                float dp23 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(7.0f) + dp22;
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                rectF2.set(f14 - AndroidUtilities.dp(24.0f), dp23 - AndroidUtilities.dp(4.0f), f14 + AndroidUtilities.dp(24.0f), dp23 + AndroidUtilities.dp(4.0f));
                                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            dp22 = org.telegram.ui.Cells.j2.f(this, dp22);
                            if (this.f27887y) {
                                break;
                            }
                        }
                    } else if (getViewType() == 13) {
                        float measuredHeight2 = getMeasuredHeight() / 2.0f;
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(AndroidUtilities.dp(40.0f), measuredHeight2 - AndroidUtilities.dp(4.0f), getMeasuredWidth() - AndroidUtilities.dp(120.0f), AndroidUtilities.dp(4.0f) + measuredHeight2);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (this.J == null) {
                            Paint paint8 = new Paint(1);
                            this.J = paint8;
                            paint8.setColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.G8));
                        }
                        for (int i33 = 0; i33 < 3; i33++) {
                            canvas2.drawCircle(org.telegram.messenger.l0.D(12.0f, i33, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(13.0f), this.J);
                            canvas2.drawCircle(org.telegram.messenger.l0.D(12.0f, i33, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(12.0f), paint6);
                        }
                    } else if (getViewType() != 14 && getViewType() != 17) {
                        if (getViewType() == 15) {
                            int dp24 = AndroidUtilities.dp(23.0f);
                            int dp25 = AndroidUtilities.dp(4.0f);
                            while (i12 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.l0.C(12.0f, this.C, dp24)), org.telegram.messenger.l0.C(8.0f, i12, dp24), dp24, paint6);
                                rectF.set(AndroidUtilities.dp(74.0f) + this.C, AndroidUtilities.dp(12.0f) + i12, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(20.0f) + i12);
                                b(rectF);
                                float f15 = dp25;
                                canvas2.drawRoundRect(rectF, f15, f15, paint6);
                                rectF.set(AndroidUtilities.dp(74.0f) + this.C, AndroidUtilities.dp(36.0f) + i12, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(42.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, f15, f15, paint6);
                                if (this.P > 0.0f) {
                                    rectF.set(AndroidUtilities.dp(73.0f) + this.C, AndroidUtilities.dp(62.0f) + i12, AndroidUtilities.dp(73.0f) + this.C + this.P, AndroidUtilities.dp(94.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, f15, f15, paint6);
                                }
                                i12 = org.telegram.ui.Cells.j2.f(this, i12);
                                int i34 = i14 + 1;
                                if (this.f27887y && i34 >= this.G) {
                                    break;
                                }
                                i14 = i34;
                            }
                        } else if (getViewType() != 16 && getViewType() != 23) {
                            int i35 = this.A;
                            if (i35 == 21) {
                                while (i12 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + dp10), (AndroidUtilities.dp(58.0f) >> 1) + i12, AndroidUtilities.dp(46.0f) >> 1, paint6);
                                    rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(16.0f) + i12, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(38.0f) + i12, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i12 = org.telegram.ui.Cells.j2.f(this, i12);
                                    int i36 = i14 + 1;
                                    if (this.f27887y && i36 >= this.G) {
                                        break;
                                    }
                                    i14 = i36;
                                }
                            } else if (i35 == 22) {
                                while (i12 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + dp9), org.telegram.messenger.l0.C(6.0f, i12, dp9), AndroidUtilities.dp(48.0f) >> 1, paint6);
                                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i12, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i12, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i12 = org.telegram.ui.Cells.j2.f(this, i12);
                                    int i37 = i14 + 1;
                                    if (this.f27887y && i37 >= this.G) {
                                        break;
                                    }
                                    i14 = i37;
                                }
                            } else if (i35 == 25) {
                                while (i12 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(AndroidUtilities.dp(17.0f) + dp8, org.telegram.messenger.l0.C(6.0f, i12, dp8), AndroidUtilities.dp(38.0f) >> 1, paint6);
                                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(21.0f) + i12, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(29.0f) + i12);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i12 = org.telegram.ui.Cells.j2.f(this, i12);
                                    int i38 = i14 + 1;
                                    if (this.f27887y && i38 >= this.G) {
                                        break;
                                    }
                                    i14 = i38;
                                }
                            } else if (i35 == 26) {
                                while (i12 <= getMeasuredHeight()) {
                                    int dp26 = AndroidUtilities.dp(21.0f) >> 1;
                                    if (LocaleController.isRTL) {
                                        dp7 = org.telegram.messenger.l0.B(21.0f, getMeasuredWidth(), dp26);
                                    } else {
                                        dp7 = AndroidUtilities.dp(21.0f) + dp26;
                                    }
                                    canvas2.drawCircle(dp7, org.telegram.messenger.l0.C(16.0f, i12, dp26), dp26, paint6);
                                    rectF.set(AndroidUtilities.dp(60.0f), AndroidUtilities.dp(21.0f) + i12, AndroidUtilities.dp(190.0f), AndroidUtilities.dp(29.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(21.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(62.0f), AndroidUtilities.dp(29.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i12 = org.telegram.ui.Cells.j2.f(this, i12);
                                    int i39 = i14 + 1;
                                    if (this.f27887y && i39 >= this.G) {
                                        break;
                                    }
                                    i14 = i39;
                                }
                            } else if (getViewType() == 28) {
                                while (i12 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(org.telegram.messenger.l0.C(10.0f, this.C, dp6)), (AndroidUtilities.dp(58.0f) >> 1) + i12, AndroidUtilities.dp(24.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i12, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i12, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    if (this.f27885w) {
                                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i12);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    }
                                    i12 = org.telegram.ui.Cells.j2.f(this, i12);
                                    int i40 = i14 + 1;
                                    if (this.f27887y && i40 >= this.G) {
                                        break;
                                    }
                                    i14 = i40;
                                }
                            } else if (getViewType() == 31) {
                                while (i12 <= getMeasuredHeight()) {
                                    int c11 = c(getMeasuredWidth());
                                    float f16 = i12;
                                    rectF.set(AndroidUtilities.dp(18.0f) + this.C, ((c11 - AndroidUtilities.dp(22.0f)) / 2.0f) + f16, AndroidUtilities.dp(40.0f) + this.C, ((AndroidUtilities.dp(22.0f) + c11) / 2.0f) + f16);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(58.0f) + this.C, ((c11 - AndroidUtilities.dp(8.0f)) / 2.0f) + f16, Math.min(AndroidUtilities.dp(132.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + c11) / 2.0f) + f16);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i12 += c11;
                                    int i41 = i14 + 1;
                                    if (this.f27887y && i41 >= this.G) {
                                        break;
                                    }
                                    i14 = i41;
                                }
                            } else if (getViewType() == 32) {
                                while (i12 <= getMeasuredHeight()) {
                                    int c12 = c(getMeasuredWidth());
                                    float f17 = i12;
                                    rectF.set(AndroidUtilities.dp(10.0f) + this.C, ((c12 - AndroidUtilities.dp(32.0f)) / 2.0f) + f17, AndroidUtilities.dp(42.0f) + this.C, ((AndroidUtilities.dp(32.0f) + c12) / 2.0f) + f17);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(64.0f) + this.C, (((c12 - AndroidUtilities.dp(14.0f)) - AndroidUtilities.dp(10.0f)) / 2.0f) + f17, Math.min(AndroidUtilities.dp(118.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(10.0f) + (c12 - AndroidUtilities.dp(14.0f))) / 2.0f) + f17);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(64.0f) + this.C, (((AndroidUtilities.dp(14.0f) + c12) - AndroidUtilities.dp(8.0f)) / 2.0f) + f17, Math.min(AndroidUtilities.dp(144.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(14.0f) + c12)) / 2.0f) + f17);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i12 += c12;
                                    int i42 = i14 + 1;
                                    if (this.f27887y && i42 >= this.G) {
                                        break;
                                    }
                                    i14 = i42;
                                }
                            } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                                rectF.set(this.C, this.B, getMeasuredWidth() - this.C, getMeasuredHeight() - this.B);
                                rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint6);
                            }
                        } else {
                            int i43 = 0;
                            while (i12 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.l0.C(8.0f, this.C, dp4)), AndroidUtilities.dp(24.0f) + i12, AndroidUtilities.dp(18.0f), paint6);
                                rectF.set(AndroidUtilities.dp(58.0f) + this.C, AndroidUtilities.dp(20.0f) + i12, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint6);
                                if (i43 < 4) {
                                    canvas2.drawCircle(a(org.telegram.messenger.l0.B(12.0f, getWidth(), dp5)), AndroidUtilities.dp(24.0f) + i12, AndroidUtilities.dp(12.0f), paint6);
                                }
                                i12 = org.telegram.ui.Cells.j2.f(this, i12);
                                i43++;
                                if (this.f27887y && i43 >= this.G) {
                                    break;
                                }
                            }
                            rectF.set(AndroidUtilities.dp(8.0f) + this.C, AndroidUtilities.dp(20.0f) + i12, getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(28.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint6);
                            rectF.set(AndroidUtilities.dp(8.0f) + this.C, AndroidUtilities.dp(36.0f) + i12, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(44.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint6);
                        }
                    } else {
                        int dp27 = AndroidUtilities.dp(12.0f);
                        int dp28 = AndroidUtilities.dp(77.0f);
                        int dp29 = AndroidUtilities.dp(4.0f);
                        float dp30 = AndroidUtilities.dp(21.0f);
                        float dp31 = AndroidUtilities.dp(41.0f);
                        while (dp27 < getMeasuredWidth()) {
                            if (this.J == null) {
                                this.J = new Paint(i15);
                            }
                            this.J.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, this.H));
                            RectF rectF4 = AndroidUtilities.rectTmp;
                            int i44 = dp27 + dp28;
                            rectF4.set(AndroidUtilities.dp(4.0f) + dp27, AndroidUtilities.dp(4.0f), i44 - AndroidUtilities.dp(4.0f), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                            canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                            if (getViewType() == 14) {
                                float dp32 = AndroidUtilities.dp(f13) + dp29;
                                float f18 = dp27;
                                float dp33 = AndroidUtilities.dp(22.0f) + dp29 + f18;
                                rectF.set(dp33, dp32, dp33 + dp31, dp32 + dp30);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.J);
                                float dp34 = AndroidUtilities.dp(4.0f) + dp30 + dp32;
                                float dp35 = f18 + AndroidUtilities.dp(5.0f) + dp29;
                                rectF.set(dp35, dp34, dp35 + dp31, dp34 + dp30);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.J);
                            } else if (getViewType() == 17) {
                                float dp36 = AndroidUtilities.dp(5.0f);
                                float dp37 = AndroidUtilities.dp(32.0f);
                                f10 = 8.0f;
                                float A = e2.c.A(dp28, dp37, 2.0f, dp27);
                                rectF4.set(A, AndroidUtilities.dp(21.0f), dp37 + A, AndroidUtilities.dp(32.0f) + dp3);
                                canvas2.drawRoundRect(rectF4, dp36, dp36, this.J);
                                canvas2.drawCircle((dp28 / 2) + dp27, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f10), this.J);
                                dp27 = i44;
                                i15 = 1;
                                f13 = 8.0f;
                            }
                            f10 = 8.0f;
                            canvas2.drawCircle((dp28 / 2) + dp27, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f10), this.J);
                            dp27 = i44;
                            i15 = 1;
                            f13 = 8.0f;
                        }
                    }
                } else {
                    while (i12 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.l0.C(9.0f, this.C, dp2)), (AndroidUtilities.dp(64.0f) >> 1) + i12, AndroidUtilities.dp(23.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i12, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i12, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (this.f27885w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i12, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        }
                        i12 = org.telegram.ui.Cells.j2.f(this, i12);
                        int i45 = i14 + 1;
                        if (this.f27887y && i45 >= this.G) {
                            break;
                        }
                        i14 = i45;
                    }
                }
            } else {
                int measuredWidth4 = (getMeasuredWidth() - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount();
                if (getViewType() == 27) {
                    i9 = (int) (measuredWidth4 * 1.25f);
                } else {
                    i9 = measuredWidth4;
                }
                int i46 = i12;
                int i47 = 0;
                while (true) {
                    if (i46 >= getMeasuredHeight() && !this.f27887y) {
                        break;
                    }
                    int i48 = 0;
                    while (i48 < getColumnsCount()) {
                        if (i47 == 0 && i48 < this.v) {
                            paint2 = paint6;
                        } else {
                            paint2 = paint6;
                            canvas.drawRect((AndroidUtilities.dp(2.0f) + measuredWidth4) * i48, i46, dp + measuredWidth4, i46 + i9, paint2);
                        }
                        i48++;
                        paint6 = paint2;
                    }
                    Paint paint9 = paint6;
                    i46 = org.telegram.messenger.l0.C(2.0f, i9, i46);
                    i47++;
                    if (this.f27887y && i47 >= 2) {
                        break;
                    }
                    paint6 = paint9;
                }
            }
        }
        invalidate();
    }

    @Override
    public void onMeasure(int i9, int i10) {
        if (this.f27887y) {
            int i11 = this.G;
            if (i11 > 1 && this.O) {
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i9)) * this.G), 1073741824));
                return;
            } else if (i11 > 1 && View.MeasureSpec.getSize(i10) > 0) {
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i10), c(View.MeasureSpec.getSize(i9)) * this.G), 1073741824));
                return;
            } else {
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i9)), 1073741824));
                return;
            }
        }
        super.onMeasure(i9, i10);
    }

    public void setGlobalGradientView(e00 e00Var) {
        this.N = e00Var;
    }

    public void setIgnoreHeightCheck(boolean z10) {
        this.O = z10;
    }

    public void setIsSingleCell(boolean z10) {
        this.f27887y = z10;
    }

    public void setItemsCount(int i9) {
        this.G = i9;
    }

    public void setMemberRequestButton(boolean z10) {
        int i9;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        float dp = AndroidUtilities.dp(34.0f);
        if (z10) {
            i9 = R.string.AddToChannel;
        } else {
            i9 = R.string.AddToGroup;
        }
        this.P = textPaint.measureText(LocaleController.getString(i9)) + dp;
    }

    public void setPaddingLeft(int i9) {
        this.C = i9;
        invalidate();
    }

    public void setPaddingTop(int i9) {
        this.B = i9;
        invalidate();
    }

    public void setUseHeaderOffset(boolean z10) {
        this.f27886x = z10;
    }

    public void setViewType(int i9) {
        this.A = i9;
        if (i9 == 11) {
            Random random = new Random();
            this.I = new float[2];
            for (int i10 = 0; i10 < 2; i10++) {
                this.I[i10] = org.telegram.ui.Cells.j2.e(random, 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    public e00(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f27879c = new Paint();
        this.d = new Paint();
        this.f27882n = new RectF();
        this.f27885w = true;
        this.D = org.telegram.ui.ActionBar.f6.G8;
        this.E = org.telegram.ui.ActionBar.f6.f23092i6;
        this.F = -1;
        this.G = 1;
        this.H = b6Var;
        this.h = new Matrix();
    }
}
