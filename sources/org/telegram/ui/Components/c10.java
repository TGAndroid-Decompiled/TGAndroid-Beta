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
import java.util.HashSet;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public class c10 extends View implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.u6 L;
    public float[] M;
    public Paint N;
    public int O;
    public int P;
    public float Q;
    public c10 R;
    public boolean S;
    public float T;
    public int f27024a;
    public LinearGradient f27025b;
    public final Paint f27026c;
    public final Paint d;
    public long e;
    public int f27027f;
    public final Matrix h;
    public final RectF f27028n;
    public int f27029r;
    public int f27030s;
    public int v;
    public boolean f27031w;
    public boolean f27032x;
    public boolean f27033y;

    public c10(Context context) {
        this(context, null);
    }

    public final float a(float f7) {
        if (LocaleController.isRTL) {
            return getMeasuredWidth() - f7;
        }
        return f7;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.H));
        hashSet.add(Integer.valueOf(this.I));
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
            case 37:
                return AndroidUtilities.dp(73.0f);
            case 38:
                return AndroidUtilities.dp(58.0f);
            case 39:
                return AndroidUtilities.dp(96.0f);
        }
    }

    public final int d(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.L);
    }

    public final void e(int i10, int i11, int i12) {
        this.H = i10;
        this.I = i11;
        this.J = i12;
        invalidate();
    }

    public final void f() {
        c10 c10Var = this.R;
        if (c10Var != null) {
            c10Var.f();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.e - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int i10 = this.O;
        if (i10 == 0) {
            i10 = getMeasuredWidth();
        }
        int i11 = this.E;
        if (i11 == 34 || i11 == 35 || i11 == 36) {
            i10 = Math.max(i10, AndroidUtilities.displaySize.x);
        }
        int i12 = this.P;
        if (i12 == 0) {
            i12 = getMeasuredHeight();
        }
        this.e = elapsedRealtime;
        boolean z10 = this.f27033y;
        Matrix matrix = this.h;
        if (!z10 && this.E != 13 && getViewType() != 14 && getViewType() != 17) {
            int i13 = (int) ((((float) (abs * i12)) / 400.0f) + this.f27027f);
            this.f27027f = i13;
            if (i13 >= i12 * 2) {
                this.f27027f = (-this.f27024a) * 2;
            }
            matrix.setTranslate(this.Q, this.f27027f);
        } else {
            int i14 = (int) ((((float) (abs * i10)) / 400.0f) + this.f27027f);
            this.f27027f = i14;
            if (i14 >= i10 * 2) {
                this.f27027f = (-this.f27024a) * 2;
            }
            matrix.setTranslate(this.f27027f + this.Q, 0.0f);
        }
        LinearGradient linearGradient = this.f27025b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public int getAdditionalHeight() {
        return 0;
    }

    public int getColumnsCount() {
        return 2;
    }

    public Paint getPaint() {
        return this.f27026c;
    }

    public int getViewType() {
        return this.E;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        boolean z10;
        float f7;
        float f10;
        float f11;
        int i10;
        int dp;
        Paint paint2;
        int dp2;
        float f12;
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
        float f13;
        Paint paint3;
        if (this.R != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                c10 c10Var = this.R;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                c10Var.O = measuredWidth;
                c10Var.P = measuredHeight;
                c10Var.Q = -getX();
            }
            paint = this.R.f27026c;
        } else {
            paint = this.f27026c;
        }
        Paint paint4 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.Q = -getX();
        }
        updateColors();
        f();
        int i13 = this.F;
        if (this.f27032x) {
            int dp20 = AndroidUtilities.dp(32.0f) + i13;
            int i14 = this.J;
            if (i14 >= 0) {
                this.d.setColor(d(i14));
            }
            float measuredWidth2 = getMeasuredWidth();
            float dp21 = AndroidUtilities.dp(32.0f);
            if (this.J >= 0) {
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
        float f14 = 24.0f;
        float f15 = 8.0f;
        int i15 = 0;
        RectF rectF = this.f27028n;
        if (viewType == 39) {
            canvas2.save();
            if (LocaleController.isRTL) {
                canvas2.scale(-1.0f, 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            }
            int i16 = 0;
            while (i13 < getMeasuredHeight()) {
                canvas2.drawCircle(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(18.0f) + i13, AndroidUtilities.dp(8.0f), paint4);
                rectF.set(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(12.0f) + i13, AndroidUtilities.dp(128.0f), AndroidUtilities.dp(f14) + i13);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(83.0f), AndroidUtilities.dp(10.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(82.0f) + i13);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint4);
                int i17 = 0;
                while (i17 < 3) {
                    float dp22 = AndroidUtilities.dp(14.0f);
                    int i18 = i17 * 18;
                    float dp23 = AndroidUtilities.dp(i18 + 33) + i13;
                    int measuredWidth3 = getMeasuredWidth();
                    if (i17 == 2) {
                        f13 = 136.0f;
                    } else {
                        f13 = 100.0f;
                    }
                    rectF.set(dp22, dp23, measuredWidth3 - AndroidUtilities.dp(f13), AndroidUtilities.dp(i18 + 45) + i13);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                    i17++;
                    f14 = f14;
                }
                float f16 = f14;
                i13 = b10.f(this, i13);
                if (this.f27033y && (i16 = i16 + 1) >= this.K) {
                    break;
                }
                f14 = f16;
            }
            canvas2.restore();
        } else if (getViewType() == 7) {
            while (i13 <= getMeasuredHeight()) {
                int c10 = c(getMeasuredWidth());
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + dp19), (c10 >> 1) + i13, AndroidUtilities.dp(28.0f), paint4);
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
                if (this.f27031w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                }
                i13 = b10.f(this, i13);
                int i19 = i15 + 1;
                if (this.f27033y && i19 >= this.K) {
                    break;
                }
                i15 = i19;
            }
        } else if (getViewType() == 24) {
            while (i13 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + dp18), org.telegram.messenger.t.D(10.0f, i13, dp18), AndroidUtilities.dp(14.0f), paint4);
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
                if (this.f27031w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                }
                canvas2.restore();
                i13 += c(getMeasuredWidth());
                int i20 = i15 + 1;
                if (this.f27033y && i20 >= this.K) {
                    break;
                }
                i15 = i20;
            }
        } else {
            float f17 = 2.0f;
            if (getViewType() == 18) {
                int i21 = i13;
                while (i21 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.t.D(9.0f, this.G, dp17)), AndroidUtilities.dp(32.0f) + i21, AndroidUtilities.dp(25.0f), paint4);
                    if (i15 % 2 == 0) {
                        i12 = 52;
                    } else {
                        i12 = 72;
                    }
                    float f18 = 76;
                    rectF.set(AndroidUtilities.dp(f18), AndroidUtilities.dp(20.0f) + i21, AndroidUtilities.dp(i12 + 76), AndroidUtilities.dp(28.0f) + i21);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                    rectF.set(AndroidUtilities.dp(i12 + 84), AndroidUtilities.dp(20.0f) + i21, AndroidUtilities.dp(i12 + 168), AndroidUtilities.dp(28.0f) + i21);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                    rectF.set(AndroidUtilities.dp(f18), AndroidUtilities.dp(42.0f) + i21, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + i21);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint4);
                    Canvas canvas3 = canvas2;
                    Paint paint5 = paint4;
                    canvas3.drawLine(AndroidUtilities.dp(f18), b10.f(this, i21), getMeasuredWidth(), b10.f(this, i21), paint5);
                    canvas2 = canvas3;
                    i21 = b10.f(this, i21);
                    int i22 = i15 + 1;
                    if (this.f27033y && i22 >= this.K) {
                        break;
                    }
                    i15 = i22;
                    paint4 = paint5;
                }
            } else {
                Paint paint6 = paint4;
                float f19 = 10.0f;
                float f20 = 6.0f;
                if (getViewType() != 37 && getViewType() != 38) {
                    if (getViewType() == 19) {
                        int i23 = i13;
                        while (i23 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.t.D(9.0f, this.G, dp16)), AndroidUtilities.dp(29.0f) + i23, AndroidUtilities.dp(20.0f), paint6);
                            if (i15 % 2 == 0) {
                                i11 = 92;
                            } else {
                                i11 = 128;
                            }
                            float f21 = 76;
                            rectF.set(AndroidUtilities.dp(f21), AndroidUtilities.dp(16.0f) + i23, AndroidUtilities.dp(i11 + 76), AndroidUtilities.dp(24.0f) + i23);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(f21), AndroidUtilities.dp(38.0f) + i23, AndroidUtilities.dp(240), AndroidUtilities.dp(46.0f) + i23);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            Canvas canvas4 = canvas2;
                            Paint paint7 = paint6;
                            canvas4.drawLine(AndroidUtilities.dp(f21), b10.f(this, i23), getMeasuredWidth(), b10.f(this, i23), paint7);
                            canvas2 = canvas4;
                            paint6 = paint7;
                            i23 = b10.f(this, i23);
                            int i24 = i15 + 1;
                            if (this.f27033y && i24 >= this.K) {
                                break;
                            }
                            i15 = i24;
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
                            if (this.f27031w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            i13 = b10.f(this, i13);
                            int i25 = i15 + 1;
                            if (this.f27033y && i25 >= this.K) {
                                break;
                            }
                            i15 = i25;
                        }
                    } else if (getViewType() == 2 || getViewType() == 27) {
                        int i26 = 2;
                        int measuredWidth4 = (getMeasuredWidth() - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount();
                        if (getViewType() == 27) {
                            i10 = (int) (measuredWidth4 * 1.25f);
                        } else {
                            i10 = measuredWidth4;
                        }
                        int i27 = i13;
                        int i28 = 0;
                        while (true) {
                            if (i27 >= getMeasuredHeight() && !this.f27033y) {
                                break;
                            }
                            int i29 = 0;
                            while (i29 < getColumnsCount()) {
                                if (i28 == 0 && i29 < this.v) {
                                    paint2 = paint6;
                                } else {
                                    paint2 = paint6;
                                    canvas.drawRect((AndroidUtilities.dp(2.0f) + measuredWidth4) * i29, i27, dp + measuredWidth4, i27 + i10, paint2);
                                }
                                i29++;
                                paint6 = paint2;
                            }
                            Paint paint8 = paint6;
                            i27 = org.telegram.messenger.t.D(2.0f, i10, i27);
                            i28++;
                            int i30 = i26;
                            if (this.f27033y && i28 >= i30) {
                                break;
                            }
                            i26 = i30;
                            paint6 = paint8;
                        }
                    } else if (getViewType() == 3) {
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
                            if (this.f27031w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            i13 = b10.f(this, i13);
                            int i31 = i15 + 1;
                            if (this.f27033y && i31 >= this.K) {
                                break;
                            }
                            i15 = i31;
                        }
                    } else if (getViewType() == 4) {
                        while (i13 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(AndroidUtilities.dp(12.0f) + dp14), org.telegram.messenger.t.D(6.0f, i13, dp14), AndroidUtilities.dp(44.0f) >> 1, paint6);
                            rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i13, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i13, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            if (this.f27031w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            i13 = b10.f(this, i13);
                            int i32 = i15 + 1;
                            if (this.f27033y && i32 >= this.K) {
                                break;
                            }
                            i15 = i32;
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
                            if (this.f27031w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            i13 = b10.f(this, i13);
                            int i33 = i15 + 1;
                            if (this.f27033y && i33 >= this.K) {
                                break;
                            }
                            i15 = i33;
                        }
                    } else if (getViewType() != 6 && getViewType() != 10) {
                        if (getViewType() == 29) {
                            while (i13 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.t.D(9.0f, this.G, dp13)), (AndroidUtilities.dp(64.0f) >> 1) + i13, AndroidUtilities.dp(23.0f), paint6);
                                rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(17.0f) + i13, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(25.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(39.0f) + i13, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(47.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                i13 = b10.f(this, i13);
                                int i34 = i15 + 1;
                                if (this.f27033y && i34 >= this.K) {
                                    break;
                                }
                                i15 = i34;
                            }
                        } else if (getViewType() == 33) {
                            while (i13 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.t.D(13.0f, this.G, dp12)), (AndroidUtilities.dp(58.0f) >> 1) + i13, AndroidUtilities.dp(23.0f), paint6);
                                rectF.set(AndroidUtilities.dp(72.0f) + this.G, AndroidUtilities.dp(17.0f) + i13, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(25.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                rectF.set(AndroidUtilities.dp(72.0f) + this.G, AndroidUtilities.dp(39.0f) + i13, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(47.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                i13 = b10.f(this, i13);
                                int i35 = i15 + 1;
                                if (this.f27033y && i35 >= this.K) {
                                    break;
                                }
                                i15 = i35;
                            }
                        } else if (getViewType() == 30) {
                            while (i13 <= getMeasuredHeight()) {
                                i13 += c(getMeasuredWidth());
                                rectF.set(0.0f, i13, getMeasuredWidth(), i13);
                                b(rectF);
                                canvas2.drawRect(rectF, paint6);
                                int i36 = i15 + 1;
                                if (this.f27033y && i36 >= this.K) {
                                    break;
                                }
                                i15 = i36;
                            }
                        } else if (getViewType() == 8) {
                            while (i13 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.t.D(11.0f, this.G, dp11)), (AndroidUtilities.dp(64.0f) >> 1) + i13, AndroidUtilities.dp(23.0f), paint6);
                                rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(17.0f) + i13, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(25.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(39.0f) + i13, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(47.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                if (this.f27031w) {
                                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                }
                                i13 = b10.f(this, i13);
                                int i37 = i15 + 1;
                                if (this.f27033y && i37 >= this.K) {
                                    break;
                                }
                                i15 = i37;
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
                                if (this.f27031w) {
                                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                }
                                i13 = b10.f(this, i13);
                                int i38 = i15 + 1;
                                if (this.f27033y && i38 >= this.K) {
                                    break;
                                }
                                i15 = i38;
                            }
                        } else if (getViewType() == 11) {
                            int i39 = 0;
                            while (i13 <= getMeasuredHeight()) {
                                rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.M[0] * 40.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.M[0] * 20.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                i13 = b10.f(this, i13);
                                i39++;
                                if (this.f27033y && i39 >= this.K) {
                                    break;
                                }
                            }
                        } else if (getViewType() == 12) {
                            int dp24 = AndroidUtilities.dp(14.0f) + i13;
                            while (dp24 <= getMeasuredHeight()) {
                                int measuredWidth5 = getMeasuredWidth() / 4;
                                for (int i40 = 0; i40 < 4; i40++) {
                                    float f22 = (measuredWidth5 / 2.0f) + (measuredWidth5 * i40);
                                    canvas2.drawCircle(f22, (AndroidUtilities.dp(56.0f) / 2.0f) + AndroidUtilities.dp(7.0f) + dp24, AndroidUtilities.dp(28.0f), paint6);
                                    float dp25 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(7.0f) + dp24;
                                    RectF rectF2 = AndroidUtilities.rectTmp;
                                    rectF2.set(f22 - AndroidUtilities.dp(24.0f), dp25 - AndroidUtilities.dp(4.0f), f22 + AndroidUtilities.dp(24.0f), dp25 + AndroidUtilities.dp(4.0f));
                                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                }
                                dp24 = b10.f(this, dp24);
                                if (this.f27033y) {
                                    break;
                                }
                            }
                        } else if (getViewType() == 13) {
                            float measuredHeight2 = getMeasuredHeight() / 2.0f;
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            rectF3.set(AndroidUtilities.dp(40.0f), measuredHeight2 - AndroidUtilities.dp(4.0f), getMeasuredWidth() - AndroidUtilities.dp(120.0f), AndroidUtilities.dp(4.0f) + measuredHeight2);
                            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            if (this.N == null) {
                                Paint paint9 = new Paint(1);
                                this.N = paint9;
                                paint9.setColor(org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.G8));
                            }
                            for (int i41 = 0; i41 < 3; i41++) {
                                canvas2.drawCircle(org.telegram.messenger.vh.b(12.0f, i41, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(13.0f), this.N);
                                canvas2.drawCircle(org.telegram.messenger.vh.b(12.0f, i41, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(12.0f), paint6);
                            }
                        } else {
                            float f23 = 21.0f;
                            if (getViewType() != 14 && getViewType() != 17) {
                                if (getViewType() == 15) {
                                    int dp26 = AndroidUtilities.dp(23.0f);
                                    int dp27 = AndroidUtilities.dp(4.0f);
                                    while (i13 <= getMeasuredHeight()) {
                                        canvas2.drawCircle(a(org.telegram.messenger.t.D(12.0f, this.G, dp26)), org.telegram.messenger.t.D(8.0f, i13, dp26), dp26, paint6);
                                        rectF.set(AndroidUtilities.dp(74.0f) + this.G, AndroidUtilities.dp(12.0f) + i13, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(20.0f) + i13);
                                        b(rectF);
                                        float f24 = dp27;
                                        canvas2.drawRoundRect(rectF, f24, f24, paint6);
                                        rectF.set(AndroidUtilities.dp(74.0f) + this.G, AndroidUtilities.dp(36.0f) + i13, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(42.0f) + i13);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, f24, f24, paint6);
                                        if (this.T > 0.0f) {
                                            rectF.set(AndroidUtilities.dp(73.0f) + this.G, AndroidUtilities.dp(62.0f) + i13, AndroidUtilities.dp(73.0f) + this.G + this.T, AndroidUtilities.dp(94.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, f24, f24, paint6);
                                        }
                                        i13 = b10.f(this, i13);
                                        int i42 = i15 + 1;
                                        if (this.f27033y && i42 >= this.K) {
                                            break;
                                        }
                                        i15 = i42;
                                    }
                                } else if (getViewType() != 16 && getViewType() != 23) {
                                    int i43 = this.E;
                                    if (i43 == 21) {
                                        while (i13 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + dp10), (AndroidUtilities.dp(58.0f) >> 1) + i13, AndroidUtilities.dp(46.0f) >> 1, paint6);
                                            rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(16.0f) + i13, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(38.0f) + i13, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            i13 = b10.f(this, i13);
                                            int i44 = i15 + 1;
                                            if (this.f27033y && i44 >= this.K) {
                                                break;
                                            }
                                            i15 = i44;
                                        }
                                    } else if (i43 == 22) {
                                        while (i13 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + dp9), org.telegram.messenger.t.D(6.0f, i13, dp9), AndroidUtilities.dp(48.0f) >> 1, paint6);
                                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i13, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i13, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            i13 = b10.f(this, i13);
                                            int i45 = i15 + 1;
                                            if (this.f27033y && i45 >= this.K) {
                                                break;
                                            }
                                            i15 = i45;
                                        }
                                    } else if (i43 == 25) {
                                        while (i13 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(AndroidUtilities.dp(17.0f) + dp8, org.telegram.messenger.t.D(6.0f, i13, dp8), AndroidUtilities.dp(38.0f) >> 1, paint6);
                                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(21.0f) + i13, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(29.0f) + i13);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            i13 = b10.f(this, i13);
                                            int i46 = i15 + 1;
                                            if (this.f27033y && i46 >= this.K) {
                                                break;
                                            }
                                            i15 = i46;
                                        }
                                    } else if (i43 == 26) {
                                        while (i13 <= getMeasuredHeight()) {
                                            int dp28 = AndroidUtilities.dp(21.0f) >> 1;
                                            if (LocaleController.isRTL) {
                                                dp7 = org.telegram.messenger.t.C(21.0f, getMeasuredWidth(), dp28);
                                            } else {
                                                dp7 = AndroidUtilities.dp(21.0f) + dp28;
                                            }
                                            canvas2.drawCircle(dp7, org.telegram.messenger.t.D(16.0f, i13, dp28), dp28, paint6);
                                            rectF.set(AndroidUtilities.dp(60.0f), AndroidUtilities.dp(21.0f) + i13, AndroidUtilities.dp(190.0f), AndroidUtilities.dp(29.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(21.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(62.0f), AndroidUtilities.dp(29.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            i13 = b10.f(this, i13);
                                            int i47 = i15 + 1;
                                            if (this.f27033y && i47 >= this.K) {
                                                break;
                                            }
                                            i15 = i47;
                                        }
                                    } else if (getViewType() == 28) {
                                        while (i13 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(org.telegram.messenger.t.D(f19, this.G, dp6)), (AndroidUtilities.dp(58.0f) >> 1) + i13, AndroidUtilities.dp(24.0f), paint6);
                                            rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(17.0f) + i13, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(25.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(39.0f) + i13, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(47.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            if (this.f27031w) {
                                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i13);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            }
                                            i13 = b10.f(this, i13);
                                            int i48 = i15 + 1;
                                            if (this.f27033y && i48 >= this.K) {
                                                break;
                                            }
                                            i15 = i48;
                                            f19 = 10.0f;
                                        }
                                    } else if (getViewType() == 31) {
                                        while (i13 <= getMeasuredHeight()) {
                                            int c11 = c(getMeasuredWidth());
                                            float f25 = i13;
                                            rectF.set(AndroidUtilities.dp(18.0f) + this.G, ((c11 - AndroidUtilities.dp(22.0f)) / 2.0f) + f25, AndroidUtilities.dp(40.0f) + this.G, ((AndroidUtilities.dp(22.0f) + c11) / 2.0f) + f25);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint6);
                                            rectF.set(AndroidUtilities.dp(58.0f) + this.G, ((c11 - AndroidUtilities.dp(8.0f)) / 2.0f) + f25, org.telegram.ui.d3.g(19.0f, getMeasuredWidth(), AndroidUtilities.dp(132.0f) + this.G), ((AndroidUtilities.dp(8.0f) + c11) / 2.0f) + f25);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            i13 += c11;
                                            int i49 = i15 + 1;
                                            if (this.f27033y && i49 >= this.K) {
                                                break;
                                            }
                                            i15 = i49;
                                        }
                                    } else if (getViewType() == 32) {
                                        while (i13 <= getMeasuredHeight()) {
                                            int c12 = c(getMeasuredWidth());
                                            float f26 = i13;
                                            rectF.set(AndroidUtilities.dp(10.0f) + this.G, ((c12 - AndroidUtilities.dp(32.0f)) / 2.0f) + f26, AndroidUtilities.dp(42.0f) + this.G, ((AndroidUtilities.dp(32.0f) + c12) / 2.0f) + f26);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                                            rectF.set(AndroidUtilities.dp(64.0f) + this.G, (((c12 - AndroidUtilities.dp(14.0f)) - AndroidUtilities.dp(10.0f)) / 2.0f) + f26, org.telegram.ui.d3.g(19.0f, getMeasuredWidth(), AndroidUtilities.dp(118.0f) + this.G), ((AndroidUtilities.dp(10.0f) + (c12 - AndroidUtilities.dp(14.0f))) / 2.0f) + f26);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            rectF.set(AndroidUtilities.dp(64.0f) + this.G, (((AndroidUtilities.dp(14.0f) + c12) - AndroidUtilities.dp(8.0f)) / 2.0f) + f26, org.telegram.ui.d3.g(19.0f, getMeasuredWidth(), AndroidUtilities.dp(144.0f) + this.G), ((AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(14.0f) + c12)) / 2.0f) + f26);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                                            i13 += c12;
                                            int i50 = i15 + 1;
                                            if (this.f27033y && i50 >= this.K) {
                                                break;
                                            }
                                            i15 = i50;
                                        }
                                    } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                                        rectF.set(this.G, this.F, getMeasuredWidth() - this.G, getMeasuredHeight() - this.F);
                                        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
                                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint6);
                                    }
                                } else {
                                    int i51 = 0;
                                    while (i13 <= getMeasuredHeight()) {
                                        canvas2.drawCircle(a(org.telegram.messenger.t.D(8.0f, this.G, dp4)), AndroidUtilities.dp(24.0f) + i13, AndroidUtilities.dp(18.0f), paint6);
                                        rectF.set(AndroidUtilities.dp(58.0f) + this.G, AndroidUtilities.dp(20.0f) + i13, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + i13);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint6);
                                        if (i51 < 4) {
                                            canvas2.drawCircle(a(org.telegram.messenger.t.C(12.0f, getWidth(), dp5)), AndroidUtilities.dp(24.0f) + i13, AndroidUtilities.dp(12.0f), paint6);
                                        }
                                        i13 = b10.f(this, i13);
                                        i51++;
                                        if (this.f27033y && i51 >= this.K) {
                                            break;
                                        }
                                    }
                                    rectF.set(AndroidUtilities.dp(8.0f) + this.G, AndroidUtilities.dp(20.0f) + i13, getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(28.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint6);
                                    rectF.set(AndroidUtilities.dp(8.0f) + this.G, AndroidUtilities.dp(36.0f) + i13, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(44.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint6);
                                }
                            } else {
                                int dp29 = AndroidUtilities.dp(12.0f);
                                int dp30 = AndroidUtilities.dp(77.0f);
                                int dp31 = AndroidUtilities.dp(4.0f);
                                float dp32 = AndroidUtilities.dp(21.0f);
                                float dp33 = AndroidUtilities.dp(41.0f);
                                while (dp29 < getMeasuredWidth()) {
                                    if (this.N == null) {
                                        this.N = new Paint(1);
                                    }
                                    this.N.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23427h5, this.L));
                                    RectF rectF4 = AndroidUtilities.rectTmp;
                                    int i52 = dp29 + dp30;
                                    float f27 = f15;
                                    float f28 = f23;
                                    rectF4.set(AndroidUtilities.dp(4.0f) + dp29, AndroidUtilities.dp(4.0f), i52 - AndroidUtilities.dp(4.0f), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                                    canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(f20), AndroidUtilities.dp(f20), paint6);
                                    if (getViewType() == 14) {
                                        float dp34 = AndroidUtilities.dp(f27) + dp31;
                                        float f29 = dp29;
                                        float dp35 = AndroidUtilities.dp(22.0f) + dp31 + f29;
                                        rectF.set(dp35, dp34, dp35 + dp33, dp34 + dp32);
                                        canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.N);
                                        float dp36 = AndroidUtilities.dp(4.0f) + dp32 + dp34;
                                        float dp37 = f29 + AndroidUtilities.dp(5.0f) + dp31;
                                        rectF.set(dp37, dp36, dp37 + dp33, dp36 + dp32);
                                        canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.N);
                                    } else if (getViewType() == 17) {
                                        float dp38 = AndroidUtilities.dp(5.0f);
                                        float dp39 = AndroidUtilities.dp(32.0f);
                                        f12 = f20;
                                        float B = c3.h0.B(dp30, dp39, f17, dp29);
                                        rectF4.set(B, AndroidUtilities.dp(f28), dp39 + B, AndroidUtilities.dp(32.0f) + dp3);
                                        canvas2.drawRoundRect(rectF4, dp38, dp38, this.N);
                                        canvas2.drawCircle((dp30 / 2) + dp29, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f27), this.N);
                                        dp29 = i52;
                                        f20 = f12;
                                        f15 = f27;
                                        f23 = f28;
                                        f17 = 2.0f;
                                    }
                                    f12 = f20;
                                    canvas2.drawCircle((dp30 / 2) + dp29, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f27), this.N);
                                    dp29 = i52;
                                    f20 = f12;
                                    f15 = f27;
                                    f23 = f28;
                                    f17 = 2.0f;
                                }
                            }
                        }
                    } else {
                        while (i13 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.t.D(9.0f, this.G, dp2)), (AndroidUtilities.dp(64.0f) >> 1) + i13, AndroidUtilities.dp(23.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(17.0f) + i13, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(25.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(39.0f) + i13, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(47.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            if (this.f27031w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                            i13 = b10.f(this, i13);
                            int i53 = i15 + 1;
                            if (this.f27033y && i53 >= this.K) {
                                break;
                            }
                            i15 = i53;
                        }
                    }
                } else {
                    if (getViewType() == 37) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int c13 = c(getMeasuredWidth());
                    while (i13 <= getMeasuredHeight()) {
                        if (z10) {
                            canvas2.drawCircle(AndroidUtilities.dp(36.0f) + this.G, AndroidUtilities.dp(35.0f) + i13, AndroidUtilities.dp(23.0f), paint6);
                        } else {
                            rectF.set(AndroidUtilities.dp(15.0f) + this.G, AndroidUtilities.dp(6.0f) + i13, AndroidUtilities.dp(61.0f) + this.G, AndroidUtilities.dp(52.0f) + i13);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint6);
                        }
                        float dp40 = AndroidUtilities.dp(71.0f) + this.G;
                        int measuredWidth6 = getMeasuredWidth();
                        if (z10) {
                            f7 = 76.0f;
                        } else {
                            f7 = 20.0f;
                        }
                        float max = Math.max(dp40, measuredWidth6 - AndroidUtilities.dp(f7));
                        rectF.set(dp40, AndroidUtilities.dp(14.0f) + i13, Math.min(AndroidUtilities.dp(100.0f) + dp40, max), AndroidUtilities.dp(22.0f) + i13);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (z10) {
                            f10 = 33.0f;
                        } else {
                            f10 = 36.0f;
                        }
                        float dp41 = AndroidUtilities.dp(f10) + i13;
                        float min = Math.min(AndroidUtilities.dp(140.0f) + dp40, max);
                        if (z10) {
                            f11 = 41.0f;
                        } else {
                            f11 = 44.0f;
                        }
                        rectF.set(dp40, dp41, min, AndroidUtilities.dp(f11) + i13);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                        if (z10) {
                            rectF.set(dp40, AndroidUtilities.dp(51.0f) + i13, Math.min(AndroidUtilities.dp(80.0f) + dp40, max), AndroidUtilities.dp(59.0f) + i13);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            if (getMeasuredWidth() - AndroidUtilities.dp(68.0f) >= dp40) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(68.0f), AndroidUtilities.dp(15.0f) + i13, getMeasuredWidth() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(23.0f) + i13);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint6);
                            }
                        }
                        i13 += c13;
                        int i54 = i15 + 1;
                        if (this.f27033y && i54 >= this.K) {
                            break;
                        }
                        i15 = i54;
                    }
                }
            }
        }
        invalidate();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f27033y) {
            int i12 = this.K;
            if (i12 > 1 && this.S) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i10)) * this.K), 1073741824));
                return;
            } else if (i12 > 1 && View.MeasureSpec.getSize(i11) > 0) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i11), c(View.MeasureSpec.getSize(i10)) * this.K), 1073741824));
                return;
            } else {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i10)), 1073741824));
                return;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setGlobalGradientView(c10 c10Var) {
        this.R = c10Var;
    }

    public void setIgnoreHeightCheck(boolean z10) {
        this.S = z10;
    }

    public void setIsSingleCell(boolean z10) {
        this.f27033y = z10;
    }

    public void setItemsCount(int i10) {
        this.K = i10;
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
        this.T = textPaint.measureText(LocaleController.getString(i10)) + dp;
    }

    public void setPaddingLeft(int i10) {
        this.G = i10;
        invalidate();
    }

    public void setPaddingTop(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setUseHeaderOffset(boolean z10) {
        this.f27032x = z10;
    }

    public void setViewType(int i10) {
        this.E = i10;
        if (i10 == 11) {
            Random random = new Random();
            this.M = new float[2];
            for (int i11 = 0; i11 < 2; i11++) {
                this.M[i11] = org.telegram.ui.d3.j(random, 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i10;
        c10 c10Var = this.R;
        if (c10Var != null) {
            c10Var.updateColors();
            return;
        }
        int i11 = this.H;
        org.telegram.ui.ActionBar.u6 u6Var = this.L;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(this.I, u6Var);
        if (this.f27030s == w03 && this.f27029r == w02) {
            return;
        }
        this.f27029r = w02;
        this.f27030s = w03;
        int i12 = this.E;
        if (i12 != 34 && i12 != 35 && i12 != 36) {
            if (!this.f27033y && i12 != 13 && i12 != 14 && i12 != 17) {
                this.f27024a = AndroidUtilities.dp(600.0f);
            } else {
                this.f27024a = AndroidUtilities.dp(200.0f);
            }
        } else {
            this.f27024a = AndroidUtilities.displaySize.x;
        }
        if (!this.f27033y && (i10 = this.E) != 13 && i10 != 14 && i10 != 17) {
            this.f27025b = new LinearGradient(0.0f, 0.0f, 0.0f, this.f27024a, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.f27025b = new LinearGradient(0.0f, 0.0f, this.f27024a, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f27026c.setShader(this.f27025b);
    }

    public c10(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f27026c = new Paint();
        this.d = new Paint();
        this.f27028n = new RectF();
        this.f27031w = true;
        this.H = org.telegram.ui.ActionBar.y6.G8;
        this.I = org.telegram.ui.ActionBar.y6.f23448i6;
        this.J = -1;
        this.K = 1;
        this.L = u6Var;
        this.h = new Matrix();
    }
}
