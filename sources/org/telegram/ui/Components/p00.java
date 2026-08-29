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
public class p00 extends View implements org.telegram.ui.ActionBar.x5 {
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
    public p00 N;
    public boolean O;
    public float P;
    public int f31521a;
    public LinearGradient f31522b;
    public final Paint f31523c;
    public final Paint d;
    public long f31524e;
    public int f31525f;
    public final Matrix h;
    public final RectF f31526n;
    public int f31527r;
    public int f31528s;
    public int v;
    public boolean f31529w;
    public boolean f31530x;
    public boolean f31531y;

    public p00(Context context) {
        this(context, null);
    }

    public final float a(float f9) {
        if (LocaleController.isRTL) {
            return getMeasuredWidth() - f9;
        }
        return f9;
    }

    public final void b(RectF rectF) {
        if (LocaleController.isRTL) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i10) {
        int i11;
        int i12;
        switch (getViewType()) {
            case 1:
                return AndroidUtilities.dp(78.0f) + 1;
            case 2:
                int dp = AndroidUtilities.dp(2.0f);
                return AndroidUtilities.dp(2.0f) + ((i10 - ((getColumnsCount() - 1) * dp)) / getColumnsCount());
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
                    i11 = 78;
                } else {
                    i11 = 72;
                }
                return AndroidUtilities.dp(i11 + 1);
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
                    i12 = 76;
                } else {
                    i12 = 64;
                }
                return AndroidUtilities.dp(i12 + 1);
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

    public final int d(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.H);
    }

    @Override
    public final void e() {
        int i10;
        p00 p00Var = this.N;
        if (p00Var != null) {
            p00Var.e();
            return;
        }
        int i11 = this.D;
        org.telegram.ui.ActionBar.c6 c6Var = this.H;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(this.E, c6Var);
        if (this.f31528s == v03 && this.f31527r == v02) {
            return;
        }
        this.f31527r = v02;
        this.f31528s = v03;
        int i12 = this.A;
        if (i12 != 34 && i12 != 35 && i12 != 36) {
            if (!this.f31531y && i12 != 13 && i12 != 14 && i12 != 17) {
                this.f31521a = AndroidUtilities.dp(600.0f);
            } else {
                this.f31521a = AndroidUtilities.dp(200.0f);
            }
        } else {
            this.f31521a = AndroidUtilities.displaySize.x;
        }
        if (!this.f31531y && (i10 = this.A) != 13 && i10 != 14 && i10 != 17) {
            this.f31522b = new LinearGradient(0.0f, 0.0f, 0.0f, this.f31521a, new int[]{v03, v02, v02, v03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.f31522b = new LinearGradient(0.0f, 0.0f, this.f31521a, 0.0f, new int[]{v03, v02, v02, v03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f31523c.setShader(this.f31522b);
    }

    public final void f(int i10, int i11, int i12) {
        this.D = i10;
        this.E = i11;
        this.F = i12;
        invalidate();
    }

    public final void g() {
        this.f31529w = false;
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
        return this.f31523c;
    }

    public int getViewType() {
        return this.A;
    }

    public final void h() {
        p00 p00Var = this.N;
        if (p00Var != null) {
            p00Var.h();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f31524e - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int i10 = this.K;
        if (i10 == 0) {
            i10 = getMeasuredWidth();
        }
        int i11 = this.A;
        if (i11 == 34 || i11 == 35 || i11 == 36) {
            i10 = Math.max(i10, AndroidUtilities.displaySize.x);
        }
        int i12 = this.L;
        if (i12 == 0) {
            i12 = getMeasuredHeight();
        }
        this.f31524e = elapsedRealtime;
        boolean z10 = this.f31531y;
        Matrix matrix = this.h;
        if (!z10 && this.A != 13 && getViewType() != 14 && getViewType() != 17) {
            int i13 = (int) ((((float) (abs * i12)) / 400.0f) + this.f31525f);
            this.f31525f = i13;
            if (i13 >= i12 * 2) {
                this.f31525f = (-this.f31521a) * 2;
            }
            matrix.setTranslate(this.M, this.f31525f);
        } else {
            int i14 = (int) ((((float) (abs * i10)) / 400.0f) + this.f31525f);
            this.f31525f = i14;
            if (i14 >= i10 * 2) {
                this.f31525f = (-this.f31521a) * 2;
            }
            matrix.setTranslate(this.f31525f + this.M, 0.0f);
        }
        LinearGradient linearGradient = this.f31522b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        int i10;
        int dp;
        Paint paint2;
        int dp2;
        float f9;
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
        int i11;
        int dp17;
        int i12;
        int dp18;
        int dp19;
        Paint paint3;
        if (this.N != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                p00 p00Var = this.N;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                p00Var.K = measuredWidth;
                p00Var.L = measuredHeight;
                p00Var.M = -getX();
            }
            paint = this.N.f31523c;
        } else {
            paint = this.f31523c;
        }
        Paint paint4 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.M = -getX();
        }
        e();
        h();
        int i13 = this.B;
        if (this.f31530x) {
            int dp20 = AndroidUtilities.dp(32.0f) + i13;
            int i14 = this.F;
            if (i14 >= 0) {
                this.d.setColor(d(i14));
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
            i13 = dp20;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i15 = 0;
        int i16 = 1;
        RectF rectF = this.f31526n;
        if (viewType == 7) {
            while (i13 <= getMeasuredHeight()) {
                int c3 = c(getMeasuredWidth());
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + dp19), (c3 >> 1) + i13, AndroidUtilities.dp(28.0f), paint4);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i13, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + i13);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i13, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + i13);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(54.0f) + i13, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                }
                if (this.f31529w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                }
                i13 = org.telegram.ui.th.g(this, i13);
                int i17 = i15 + 1;
                if (this.f31531y && i17 >= this.G) {
                    break;
                }
                i15 = i17;
            }
        } else if (getViewType() == 24) {
            while (i13 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + dp18), org.telegram.messenger.x3.C(10.0f, i13, dp18), AndroidUtilities.dp(14.0f), paint4);
                canvas2.save();
                canvas2.translate(0.0f, -AndroidUtilities.dp(4.0f));
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i13, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + i13);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(38.0f) + i13, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + i13);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(54.0f) + i13, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                }
                if (this.f31529w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                }
                canvas2.restore();
                i13 += c(getMeasuredWidth());
                int i18 = i15 + 1;
                if (this.f31531y && i18 >= this.G) {
                    break;
                }
                i15 = i18;
            }
        } else if (getViewType() == 18) {
            int i19 = i13;
            while (i19 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.x3.C(9.0f, this.C, dp17)), AndroidUtilities.dp(32.0f) + i19, AndroidUtilities.dp(25.0f), paint4);
                if (i15 % 2 == 0) {
                    i12 = 52;
                } else {
                    i12 = 72;
                }
                float f10 = 76;
                rectF.set(AndroidUtilities.dp(f10), AndroidUtilities.dp(20.0f) + i19, AndroidUtilities.dp(i12 + 76), AndroidUtilities.dp(28.0f) + i19);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                rectF.set(AndroidUtilities.dp(i12 + 84), AndroidUtilities.dp(20.0f) + i19, AndroidUtilities.dp(i12 + 168), AndroidUtilities.dp(28.0f) + i19);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                rectF.set(AndroidUtilities.dp(f10), AndroidUtilities.dp(42.0f) + i19, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + i19);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                Canvas canvas3 = canvas2;
                Paint paint5 = paint4;
                canvas3.drawLine(AndroidUtilities.dp(f10), org.telegram.ui.th.g(this, i19), getMeasuredWidth(), org.telegram.ui.th.g(this, i19), paint5);
                canvas2 = canvas3;
                i19 = org.telegram.ui.th.g(this, i19);
                int i20 = i15 + 1;
                if (this.f31531y && i20 >= this.G) {
                    break;
                }
                i15 = i20;
                paint4 = paint5;
            }
        } else {
            Paint paint6 = paint4;
            if (getViewType() == 19) {
                int i21 = i13;
                while (i21 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.x3.C(9.0f, this.C, dp16)), AndroidUtilities.dp(29.0f) + i21, AndroidUtilities.dp(20.0f), paint6);
                    if (i15 % 2 == 0) {
                        i11 = 92;
                    } else {
                        i11 = 128;
                    }
                    float f11 = 76;
                    rectF.set(AndroidUtilities.dp(f11), AndroidUtilities.dp(16.0f) + i21, AndroidUtilities.dp(i11 + 76), AndroidUtilities.dp(24.0f) + i21);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                    rectF.set(AndroidUtilities.dp(f11), AndroidUtilities.dp(38.0f) + i21, AndroidUtilities.dp(240), AndroidUtilities.dp(46.0f) + i21);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                    Canvas canvas4 = canvas2;
                    Paint paint7 = paint6;
                    canvas4.drawLine(AndroidUtilities.dp(f11), org.telegram.ui.th.g(this, i21), getMeasuredWidth(), org.telegram.ui.th.g(this, i21), paint7);
                    canvas2 = canvas4;
                    paint6 = paint7;
                    i21 = org.telegram.ui.th.g(this, i21);
                    int i22 = i15 + 1;
                    if (this.f31531y && i22 >= this.G) {
                        break;
                    }
                    i15 = i22;
                }
            } else if (getViewType() == 1) {
                while (i13 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(AndroidUtilities.dp(9.0f) + dp15), (AndroidUtilities.dp(78.0f) >> 1) + i13, AndroidUtilities.dp(25.0f), paint6);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(20.0f) + i13, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(28.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(42.0f) + i13, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(50.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                    if (this.f31529w) {
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                    }
                    i13 = org.telegram.ui.th.g(this, i13);
                    int i23 = i15 + 1;
                    if (this.f31531y && i23 >= this.G) {
                        break;
                    }
                    i15 = i23;
                }
            } else if (getViewType() != 2 && getViewType() != 27) {
                float f12 = 8.0f;
                if (getViewType() == 3) {
                    while (i13 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(48.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i13, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i13, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (this.f31529w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        }
                        i13 = org.telegram.ui.th.g(this, i13);
                        int i24 = i15 + 1;
                        if (this.f31531y && i24 >= this.G) {
                            break;
                        }
                        i15 = i24;
                    }
                } else if (getViewType() == 4) {
                    while (i13 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(AndroidUtilities.dp(12.0f) + dp14), org.telegram.messenger.x3.C(6.0f, i13, dp14), AndroidUtilities.dp(44.0f) >> 1, paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i13, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i13, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (this.f31529w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        }
                        i13 = org.telegram.ui.th.g(this, i13);
                        int i25 = i15 + 1;
                        if (this.f31531y && i25 >= this.G) {
                            break;
                        }
                        i15 = i25;
                    }
                } else if (getViewType() == 5) {
                    while (i13 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(11.0f) + i13, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(63.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i13, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i13, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(42.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(54.0f) + i13, AndroidUtilities.dp(188.0f), AndroidUtilities.dp(62.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (this.f31529w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        }
                        i13 = org.telegram.ui.th.g(this, i13);
                        int i26 = i15 + 1;
                        if (this.f31531y && i26 >= this.G) {
                            break;
                        }
                        i15 = i26;
                    }
                } else if (getViewType() != 6 && getViewType() != 10) {
                    if (getViewType() == 29) {
                        while (i13 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.x3.C(9.0f, this.C, dp13)), (AndroidUtilities.dp(64.0f) >> 1) + i13, AndroidUtilities.dp(23.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i13, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i13, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            i13 = org.telegram.ui.th.g(this, i13);
                            int i27 = i15 + 1;
                            if (this.f31531y && i27 >= this.G) {
                                break;
                            }
                            i15 = i27;
                        }
                    } else if (getViewType() == 33) {
                        while (i13 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.x3.C(13.0f, this.C, dp12)), (AndroidUtilities.dp(58.0f) >> 1) + i13, AndroidUtilities.dp(23.0f), paint6);
                            rectF.set(AndroidUtilities.dp(72.0f) + this.C, AndroidUtilities.dp(17.0f) + i13, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(72.0f) + this.C, AndroidUtilities.dp(39.0f) + i13, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            i13 = org.telegram.ui.th.g(this, i13);
                            int i28 = i15 + 1;
                            if (this.f31531y && i28 >= this.G) {
                                break;
                            }
                            i15 = i28;
                        }
                    } else if (getViewType() == 30) {
                        while (i13 <= getMeasuredHeight()) {
                            i13 += c(getMeasuredWidth());
                            rectF.set(0.0f, i13, getMeasuredWidth(), i13);
                            b(rectF);
                            canvas2.drawRect(rectF, paint6);
                            int i29 = i15 + 1;
                            if (this.f31531y && i29 >= this.G) {
                                break;
                            }
                            i15 = i29;
                        }
                    } else if (getViewType() == 8) {
                        while (i13 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.x3.C(11.0f, this.C, dp11)), (AndroidUtilities.dp(64.0f) >> 1) + i13, AndroidUtilities.dp(23.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i13, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(25.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i13, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(47.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            if (this.f31529w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            i13 = org.telegram.ui.th.g(this, i13);
                            int i30 = i15 + 1;
                            if (this.f31531y && i30 >= this.G) {
                                break;
                            }
                            i15 = i30;
                        }
                    } else if (getViewType() == 9) {
                        while (i13 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(AndroidUtilities.dp(35.0f)), (c(getMeasuredWidth()) >> 1) + i13, AndroidUtilities.dp(32.0f) / 2, paint6);
                            rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(16.0f) + i13, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(24.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(38.0f) + i13, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(46.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            if (this.f31529w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            i13 = org.telegram.ui.th.g(this, i13);
                            int i31 = i15 + 1;
                            if (this.f31531y && i31 >= this.G) {
                                break;
                            }
                            i15 = i31;
                        }
                    } else if (getViewType() == 11) {
                        int i32 = 0;
                        while (i13 <= getMeasuredHeight()) {
                            rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.I[0] * 40.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.I[0] * 20.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            i13 = org.telegram.ui.th.g(this, i13);
                            i32++;
                            if (this.f31531y && i32 >= this.G) {
                                break;
                            }
                        }
                    } else if (getViewType() == 12) {
                        int dp22 = AndroidUtilities.dp(14.0f) + i13;
                        while (dp22 <= getMeasuredHeight()) {
                            int measuredWidth3 = getMeasuredWidth() / 4;
                            for (int i33 = 0; i33 < 4; i33++) {
                                float f13 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i33);
                                canvas2.drawCircle(f13, (AndroidUtilities.dp(56.0f) / 2.0f) + AndroidUtilities.dp(7.0f) + dp22, AndroidUtilities.dp(28.0f), paint6);
                                float dp23 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(7.0f) + dp22;
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                rectF2.set(f13 - AndroidUtilities.dp(24.0f), dp23 - AndroidUtilities.dp(4.0f), f13 + AndroidUtilities.dp(24.0f), dp23 + AndroidUtilities.dp(4.0f));
                                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            dp22 = org.telegram.ui.th.g(this, dp22);
                            if (this.f31531y) {
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
                            paint8.setColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.G8));
                        }
                        for (int i34 = 0; i34 < 3; i34++) {
                            canvas2.drawCircle(org.telegram.messenger.x3.D(12.0f, i34, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(13.0f), this.J);
                            canvas2.drawCircle(org.telegram.messenger.x3.D(12.0f, i34, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(12.0f), paint6);
                        }
                    } else if (getViewType() != 14 && getViewType() != 17) {
                        if (getViewType() == 15) {
                            int dp24 = AndroidUtilities.dp(23.0f);
                            int dp25 = AndroidUtilities.dp(4.0f);
                            while (i13 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.x3.C(12.0f, this.C, dp24)), org.telegram.messenger.x3.C(8.0f, i13, dp24), dp24, paint6);
                                rectF.set(AndroidUtilities.dp(74.0f) + this.C, AndroidUtilities.dp(12.0f) + i13, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(20.0f) + i13);
                                b(rectF);
                                float f14 = dp25;
                                canvas2.drawRoundRect(rectF, f14, f14, paint6);
                                rectF.set(AndroidUtilities.dp(74.0f) + this.C, AndroidUtilities.dp(36.0f) + i13, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(42.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, f14, f14, paint6);
                                if (this.P > 0.0f) {
                                    rectF.set(AndroidUtilities.dp(73.0f) + this.C, AndroidUtilities.dp(62.0f) + i13, AndroidUtilities.dp(73.0f) + this.C + this.P, AndroidUtilities.dp(94.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, f14, f14, paint6);
                                }
                                i13 = org.telegram.ui.th.g(this, i13);
                                int i35 = i15 + 1;
                                if (this.f31531y && i35 >= this.G) {
                                    break;
                                }
                                i15 = i35;
                            }
                        } else if (getViewType() != 16 && getViewType() != 23) {
                            int i36 = this.A;
                            if (i36 == 21) {
                                while (i13 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + dp10), (AndroidUtilities.dp(58.0f) >> 1) + i13, AndroidUtilities.dp(46.0f) >> 1, paint6);
                                    rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(16.0f) + i13, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(38.0f) + i13, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i13 = org.telegram.ui.th.g(this, i13);
                                    int i37 = i15 + 1;
                                    if (this.f31531y && i37 >= this.G) {
                                        break;
                                    }
                                    i15 = i37;
                                }
                            } else if (i36 == 22) {
                                while (i13 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + dp9), org.telegram.messenger.x3.C(6.0f, i13, dp9), AndroidUtilities.dp(48.0f) >> 1, paint6);
                                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i13, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i13, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i13 = org.telegram.ui.th.g(this, i13);
                                    int i38 = i15 + 1;
                                    if (this.f31531y && i38 >= this.G) {
                                        break;
                                    }
                                    i15 = i38;
                                }
                            } else if (i36 == 25) {
                                while (i13 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(AndroidUtilities.dp(17.0f) + dp8, org.telegram.messenger.x3.C(6.0f, i13, dp8), AndroidUtilities.dp(38.0f) >> 1, paint6);
                                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(21.0f) + i13, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(29.0f) + i13);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i13 = org.telegram.ui.th.g(this, i13);
                                    int i39 = i15 + 1;
                                    if (this.f31531y && i39 >= this.G) {
                                        break;
                                    }
                                    i15 = i39;
                                }
                            } else if (i36 == 26) {
                                while (i13 <= getMeasuredHeight()) {
                                    int dp26 = AndroidUtilities.dp(21.0f) >> 1;
                                    if (LocaleController.isRTL) {
                                        dp7 = org.telegram.messenger.x3.B(21.0f, getMeasuredWidth(), dp26);
                                    } else {
                                        dp7 = AndroidUtilities.dp(21.0f) + dp26;
                                    }
                                    canvas2.drawCircle(dp7, org.telegram.messenger.x3.C(16.0f, i13, dp26), dp26, paint6);
                                    rectF.set(AndroidUtilities.dp(60.0f), AndroidUtilities.dp(21.0f) + i13, AndroidUtilities.dp(190.0f), AndroidUtilities.dp(29.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(21.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(62.0f), AndroidUtilities.dp(29.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i13 = org.telegram.ui.th.g(this, i13);
                                    int i40 = i15 + 1;
                                    if (this.f31531y && i40 >= this.G) {
                                        break;
                                    }
                                    i15 = i40;
                                }
                            } else if (getViewType() == 28) {
                                while (i13 <= getMeasuredHeight()) {
                                    canvas2.drawCircle(a(org.telegram.messenger.x3.C(10.0f, this.C, dp6)), (AndroidUtilities.dp(58.0f) >> 1) + i13, AndroidUtilities.dp(24.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i13, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i13, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    if (this.f31529w) {
                                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i13);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    }
                                    i13 = org.telegram.ui.th.g(this, i13);
                                    int i41 = i15 + 1;
                                    if (this.f31531y && i41 >= this.G) {
                                        break;
                                    }
                                    i15 = i41;
                                }
                            } else if (getViewType() == 31) {
                                while (i13 <= getMeasuredHeight()) {
                                    int c6 = c(getMeasuredWidth());
                                    float f15 = i13;
                                    rectF.set(AndroidUtilities.dp(18.0f) + this.C, ((c6 - AndroidUtilities.dp(22.0f)) / 2.0f) + f15, AndroidUtilities.dp(40.0f) + this.C, ((AndroidUtilities.dp(22.0f) + c6) / 2.0f) + f15);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(58.0f) + this.C, ((c6 - AndroidUtilities.dp(8.0f)) / 2.0f) + f15, Math.min(AndroidUtilities.dp(132.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + c6) / 2.0f) + f15);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i13 += c6;
                                    int i42 = i15 + 1;
                                    if (this.f31531y && i42 >= this.G) {
                                        break;
                                    }
                                    i15 = i42;
                                }
                            } else if (getViewType() == 32) {
                                while (i13 <= getMeasuredHeight()) {
                                    int c10 = c(getMeasuredWidth());
                                    float f16 = i13;
                                    rectF.set(AndroidUtilities.dp(10.0f) + this.C, ((c10 - AndroidUtilities.dp(32.0f)) / 2.0f) + f16, AndroidUtilities.dp(42.0f) + this.C, ((AndroidUtilities.dp(32.0f) + c10) / 2.0f) + f16);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(64.0f) + this.C, (((c10 - AndroidUtilities.dp(14.0f)) - AndroidUtilities.dp(10.0f)) / 2.0f) + f16, Math.min(AndroidUtilities.dp(118.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(10.0f) + (c10 - AndroidUtilities.dp(14.0f))) / 2.0f) + f16);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(64.0f) + this.C, (((AndroidUtilities.dp(14.0f) + c10) - AndroidUtilities.dp(8.0f)) / 2.0f) + f16, Math.min(AndroidUtilities.dp(144.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(14.0f) + c10)) / 2.0f) + f16);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                    i13 += c10;
                                    int i43 = i15 + 1;
                                    if (this.f31531y && i43 >= this.G) {
                                        break;
                                    }
                                    i15 = i43;
                                }
                            } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                                rectF.set(this.C, this.B, getMeasuredWidth() - this.C, getMeasuredHeight() - this.B);
                                rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint6);
                            }
                        } else {
                            int i44 = 0;
                            while (i13 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.x3.C(8.0f, this.C, dp4)), AndroidUtilities.dp(24.0f) + i13, AndroidUtilities.dp(18.0f), paint6);
                                rectF.set(AndroidUtilities.dp(58.0f) + this.C, AndroidUtilities.dp(20.0f) + i13, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint6);
                                if (i44 < 4) {
                                    canvas2.drawCircle(a(org.telegram.messenger.x3.B(12.0f, getWidth(), dp5)), AndroidUtilities.dp(24.0f) + i13, AndroidUtilities.dp(12.0f), paint6);
                                }
                                i13 = org.telegram.ui.th.g(this, i13);
                                i44++;
                                if (this.f31531y && i44 >= this.G) {
                                    break;
                                }
                            }
                            rectF.set(AndroidUtilities.dp(8.0f) + this.C, AndroidUtilities.dp(20.0f) + i13, getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(28.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint6);
                            rectF.set(AndroidUtilities.dp(8.0f) + this.C, AndroidUtilities.dp(36.0f) + i13, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(44.0f) + i13);
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
                                this.J = new Paint(i16);
                            }
                            this.J.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, this.H));
                            RectF rectF4 = AndroidUtilities.rectTmp;
                            int i45 = dp27 + dp28;
                            rectF4.set(AndroidUtilities.dp(4.0f) + dp27, AndroidUtilities.dp(4.0f), i45 - AndroidUtilities.dp(4.0f), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                            canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                            if (getViewType() == 14) {
                                float dp32 = AndroidUtilities.dp(f12) + dp29;
                                float f17 = dp27;
                                float dp33 = AndroidUtilities.dp(22.0f) + dp29 + f17;
                                rectF.set(dp33, dp32, dp33 + dp31, dp32 + dp30);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.J);
                                float dp34 = AndroidUtilities.dp(4.0f) + dp30 + dp32;
                                float dp35 = f17 + AndroidUtilities.dp(5.0f) + dp29;
                                rectF.set(dp35, dp34, dp35 + dp31, dp34 + dp30);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.J);
                            } else if (getViewType() == 17) {
                                float dp36 = AndroidUtilities.dp(5.0f);
                                float dp37 = AndroidUtilities.dp(32.0f);
                                f9 = 8.0f;
                                float A = com.google.android.recaptcha.internal.a.A(dp28, dp37, 2.0f, dp27);
                                rectF4.set(A, AndroidUtilities.dp(21.0f), dp37 + A, AndroidUtilities.dp(32.0f) + dp3);
                                canvas2.drawRoundRect(rectF4, dp36, dp36, this.J);
                                canvas2.drawCircle((dp28 / 2) + dp27, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f9), this.J);
                                dp27 = i45;
                                i16 = 1;
                                f12 = 8.0f;
                            }
                            f9 = 8.0f;
                            canvas2.drawCircle((dp28 / 2) + dp27, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f9), this.J);
                            dp27 = i45;
                            i16 = 1;
                            f12 = 8.0f;
                        }
                    }
                } else {
                    while (i13 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.x3.C(9.0f, this.C, dp2)), (AndroidUtilities.dp(64.0f) >> 1) + i13, AndroidUtilities.dp(23.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i13, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i13, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (this.f31529w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        }
                        i13 = org.telegram.ui.th.g(this, i13);
                        int i46 = i15 + 1;
                        if (this.f31531y && i46 >= this.G) {
                            break;
                        }
                        i15 = i46;
                    }
                }
            } else {
                int measuredWidth4 = (getMeasuredWidth() - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount();
                if (getViewType() == 27) {
                    i10 = (int) (measuredWidth4 * 1.25f);
                } else {
                    i10 = measuredWidth4;
                }
                int i47 = i13;
                int i48 = 0;
                while (true) {
                    if (i47 >= getMeasuredHeight() && !this.f31531y) {
                        break;
                    }
                    int i49 = 0;
                    while (i49 < getColumnsCount()) {
                        if (i48 == 0 && i49 < this.v) {
                            paint2 = paint6;
                        } else {
                            paint2 = paint6;
                            canvas.drawRect((AndroidUtilities.dp(2.0f) + measuredWidth4) * i49, i47, dp + measuredWidth4, i47 + i10, paint2);
                        }
                        i49++;
                        paint6 = paint2;
                    }
                    Paint paint9 = paint6;
                    i47 = org.telegram.messenger.x3.C(2.0f, i10, i47);
                    i48++;
                    if (this.f31531y && i48 >= 2) {
                        break;
                    }
                    paint6 = paint9;
                }
            }
        }
        invalidate();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f31531y) {
            int i12 = this.G;
            if (i12 > 1 && this.O) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i10)) * this.G), 1073741824));
                return;
            } else if (i12 > 1 && View.MeasureSpec.getSize(i11) > 0) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i11), c(View.MeasureSpec.getSize(i10)) * this.G), 1073741824));
                return;
            } else {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i10)), 1073741824));
                return;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setGlobalGradientView(p00 p00Var) {
        this.N = p00Var;
    }

    public void setIgnoreHeightCheck(boolean z10) {
        this.O = z10;
    }

    public void setIsSingleCell(boolean z10) {
        this.f31531y = z10;
    }

    public void setItemsCount(int i10) {
        this.G = i10;
    }

    public void setMemberRequestButton(boolean z10) {
        int i10;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        float dp = AndroidUtilities.dp(34.0f);
        if (z10) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        this.P = textPaint.measureText(LocaleController.getString(i10)) + dp;
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
        this.f31530x = z10;
    }

    public void setViewType(int i10) {
        this.A = i10;
        if (i10 == 11) {
            Random random = new Random();
            this.I = new float[2];
            for (int i11 = 0; i11 < 2; i11++) {
                this.I[i11] = org.telegram.ui.th.f(random, 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    public p00(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f31523c = new Paint();
        this.d = new Paint();
        this.f31526n = new RectF();
        this.f31529w = true;
        this.D = org.telegram.ui.ActionBar.g6.G8;
        this.E = org.telegram.ui.ActionBar.g6.f23152i6;
        this.F = -1;
        this.G = 1;
        this.H = c6Var;
        this.h = new Matrix();
    }
}
