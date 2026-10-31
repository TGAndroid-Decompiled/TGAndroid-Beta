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
public class zz extends View implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.p6 L;
    public float[] M;
    public Paint N;
    public int O;
    public int P;
    public float Q;
    public zz R;
    public boolean S;
    public float T;
    public int f33266a;
    public LinearGradient f33267b;
    public final Paint f33268c;
    public final Paint d;
    public long e;
    public int f33269f;
    public final Matrix h;
    public final RectF f33270n;
    public int f33271r;
    public int f33272s;
    public int f33273w;
    public boolean f33274x;
    public boolean f33275y;

    public zz(Context context) {
        this(context, null);
    }

    public final float a(float f7) {
        if (org.telegram.messenger.cd.X) {
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
        if (org.telegram.messenger.cd.X) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i10) {
        int i11;
        int i12;
        switch (getViewType()) {
            case 1:
                return org.telegram.messenger.i0.L(78.0f) + 1;
            case 2:
                int L = org.telegram.messenger.i0.L(2.0f);
                return org.telegram.messenger.i0.L(2.0f) + ((i10 - ((getColumnsCount() - 1) * L)) / getColumnsCount());
            case 3:
            case 4:
                return org.telegram.messenger.i0.L(56.0f);
            case 5:
                return org.telegram.messenger.i0.L(80.0f);
            case 6:
            case 18:
                return org.telegram.messenger.i0.L(64.0f);
            case 7:
                if (org.telegram.messenger.tz.f18173p1) {
                    i11 = 78;
                } else {
                    i11 = 72;
                }
                return org.telegram.messenger.i0.L(i11 + 1);
            case 8:
                return org.telegram.messenger.i0.L(61.0f);
            case 9:
                return org.telegram.messenger.i0.L(66.0f);
            case 10:
                return org.telegram.messenger.i0.L(58.0f);
            case 11:
                return org.telegram.messenger.i0.L(36.0f);
            case 12:
                return org.telegram.messenger.i0.L(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return org.telegram.messenger.i0.L(107.0f);
            case 16:
            case 23:
                return org.telegram.messenger.i0.L(50.0f);
            case 19:
                return org.telegram.messenger.i0.L(58.0f);
            case 21:
                return org.telegram.messenger.i0.L(58.0f);
            case 22:
                return org.telegram.messenger.i0.L(60.0f);
            case 24:
                if (org.telegram.messenger.tz.f18173p1) {
                    i12 = 76;
                } else {
                    i12 = 64;
                }
                return org.telegram.messenger.i0.L(i12 + 1);
            case 25:
                return org.telegram.messenger.i0.L(51.0f);
            case 26:
                return org.telegram.messenger.i0.L(50.0f) + 1;
            case 28:
                return org.telegram.messenger.i0.L(58.0f);
            case 29:
                return org.telegram.messenger.i0.L(60.0f) + 1;
            case 30:
                return org.telegram.messenger.i0.L(32.0f);
            case 31:
                return org.telegram.messenger.i0.L(48.0f) + 1;
            case 32:
                return org.telegram.messenger.i0.L(56.0f) + 1;
            case 33:
                return org.telegram.messenger.i0.L(58.0f);
            case 34:
                return org.telegram.messenger.i0.L(140.0f);
            case 35:
                return org.telegram.messenger.i0.L(112.0f);
            case 36:
                return org.telegram.messenger.i0.L(108.0f);
            case 37:
                return org.telegram.messenger.i0.L(73.0f);
            case 38:
                return org.telegram.messenger.i0.L(58.0f);
        }
    }

    public final int d(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.L);
    }

    public final void e(int i10, int i11, int i12) {
        this.H = i10;
        this.I = i11;
        this.J = i12;
        invalidate();
    }

    public final void f() {
        zz zzVar = this.R;
        if (zzVar != null) {
            zzVar.f();
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
            i10 = Math.max(i10, org.telegram.messenger.i0.f16026q.x);
        }
        int i12 = this.P;
        if (i12 == 0) {
            i12 = getMeasuredHeight();
        }
        this.e = elapsedRealtime;
        boolean z10 = this.D;
        Matrix matrix = this.h;
        if (!z10 && this.E != 13 && getViewType() != 14 && getViewType() != 17) {
            int i13 = (int) ((((float) (abs * i12)) / 400.0f) + this.f33269f);
            this.f33269f = i13;
            if (i13 >= i12 * 2) {
                this.f33269f = (-this.f33266a) * 2;
            }
            matrix.setTranslate(this.Q, this.f33269f);
        } else {
            int i14 = (int) ((((float) (abs * i10)) / 400.0f) + this.f33269f);
            this.f33269f = i14;
            if (i14 >= i10 * 2) {
                this.f33269f = (-this.f33266a) * 2;
            }
            matrix.setTranslate(this.f33269f + this.Q, 0.0f);
        }
        LinearGradient linearGradient = this.f33267b;
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
        return this.f33268c;
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
        int L;
        Paint paint2;
        int L2;
        float f12;
        int L3;
        int L4;
        int L5;
        int L6;
        int L7;
        int L8;
        int L9;
        int L10;
        int L11;
        int L12;
        int L13;
        int L14;
        int L15;
        int L16;
        int i11;
        int L17;
        int i12;
        int L18;
        int L19;
        Paint paint3;
        if (this.R != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                zz zzVar = this.R;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                zzVar.O = measuredWidth;
                zzVar.P = measuredHeight;
                zzVar.Q = -getX();
            }
            paint = this.R.f33268c;
        } else {
            paint = this.f33268c;
        }
        Paint paint4 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.Q = -getX();
        }
        updateColors();
        f();
        int i13 = this.F;
        if (this.f33275y) {
            int L20 = org.telegram.messenger.i0.L(32.0f) + i13;
            int i14 = this.J;
            if (i14 >= 0) {
                this.d.setColor(d(i14));
            }
            float measuredWidth2 = getMeasuredWidth();
            float L21 = org.telegram.messenger.i0.L(32.0f);
            if (this.J >= 0) {
                paint3 = this.d;
            } else {
                paint3 = paint4;
            }
            canvas.drawRect(0.0f, 0.0f, measuredWidth2, L21, paint3);
            canvas2 = canvas;
            i13 = L20;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i15 = 0;
        int i16 = 1;
        RectF rectF = this.f33270n;
        if (viewType == 7) {
            while (i13 <= getMeasuredHeight()) {
                int c10 = c(getMeasuredWidth());
                canvas2.drawCircle(a(org.telegram.messenger.i0.L(10.0f) + L19), (c10 >> 1) + i13, org.telegram.messenger.i0.L(28.0f), paint4);
                rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(16.0f) + i13, org.telegram.messenger.i0.L(148.0f), org.telegram.messenger.i0.L(24.0f) + i13);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(38.0f) + i13, org.telegram.messenger.i0.L(268.0f), org.telegram.messenger.i0.L(46.0f) + i13);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                if (org.telegram.messenger.tz.f18173p1) {
                    rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(54.0f) + i13, org.telegram.messenger.i0.L(220.0f), org.telegram.messenger.i0.L(62.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                }
                if (this.f33274x) {
                    rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(16.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(24.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                }
                i13 = org.telegram.ui.Cells.f1.h(this, i13);
                int i17 = i15 + 1;
                if (this.D && i17 >= this.K) {
                    break;
                }
                i15 = i17;
            }
        } else if (getViewType() == 24) {
            while (i13 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.i0.L(10.0f) + L18), org.telegram.messenger.m5.C(10.0f, i13, L18), org.telegram.messenger.i0.L(14.0f), paint4);
                canvas2.save();
                canvas2.translate(0.0f, -org.telegram.messenger.i0.L(4.0f));
                rectF.set(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(16.0f) + i13, org.telegram.messenger.i0.L(148.0f), org.telegram.messenger.i0.L(24.0f) + i13);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                rectF.set(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(38.0f) + i13, org.telegram.messenger.i0.L(268.0f), org.telegram.messenger.i0.L(46.0f) + i13);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                if (org.telegram.messenger.tz.f18173p1) {
                    rectF.set(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(54.0f) + i13, org.telegram.messenger.i0.L(220.0f), org.telegram.messenger.i0.L(62.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                }
                if (this.f33274x) {
                    rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(16.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(24.0f) + i13);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                }
                canvas2.restore();
                i13 += c(getMeasuredWidth());
                int i18 = i15 + 1;
                if (this.D && i18 >= this.K) {
                    break;
                }
                i15 = i18;
            }
        } else if (getViewType() == 18) {
            int i19 = i13;
            while (i19 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.m5.C(9.0f, this.G, L17)), org.telegram.messenger.i0.L(32.0f) + i19, org.telegram.messenger.i0.L(25.0f), paint4);
                if (i15 % 2 == 0) {
                    i12 = 52;
                } else {
                    i12 = 72;
                }
                float f13 = 76;
                rectF.set(org.telegram.messenger.i0.L(f13), org.telegram.messenger.i0.L(20.0f) + i19, org.telegram.messenger.i0.L(i12 + 76), org.telegram.messenger.i0.L(28.0f) + i19);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                rectF.set(org.telegram.messenger.i0.L(i12 + 84), org.telegram.messenger.i0.L(20.0f) + i19, org.telegram.messenger.i0.L(i12 + 168), org.telegram.messenger.i0.L(28.0f) + i19);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                rectF.set(org.telegram.messenger.i0.L(f13), org.telegram.messenger.i0.L(42.0f) + i19, org.telegram.messenger.i0.L(140), org.telegram.messenger.i0.L(50.0f) + i19);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint4);
                Canvas canvas3 = canvas2;
                Paint paint5 = paint4;
                canvas3.drawLine(org.telegram.messenger.i0.L(f13), org.telegram.ui.Cells.f1.h(this, i19), getMeasuredWidth(), org.telegram.ui.Cells.f1.h(this, i19), paint5);
                canvas2 = canvas3;
                i19 = org.telegram.ui.Cells.f1.h(this, i19);
                int i20 = i15 + 1;
                if (this.D && i20 >= this.K) {
                    break;
                }
                i15 = i20;
                paint4 = paint5;
            }
        } else {
            Paint paint6 = paint4;
            float f14 = 6.0f;
            if (getViewType() != 37 && getViewType() != 38) {
                if (getViewType() == 19) {
                    int i21 = i13;
                    while (i21 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.m5.C(9.0f, this.G, L16)), org.telegram.messenger.i0.L(29.0f) + i21, org.telegram.messenger.i0.L(20.0f), paint6);
                        if (i15 % 2 == 0) {
                            i11 = 92;
                        } else {
                            i11 = 128;
                        }
                        float f15 = 76;
                        rectF.set(org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(16.0f) + i21, org.telegram.messenger.i0.L(i11 + 76), org.telegram.messenger.i0.L(24.0f) + i21);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        rectF.set(org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(38.0f) + i21, org.telegram.messenger.i0.L(240), org.telegram.messenger.i0.L(46.0f) + i21);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        Canvas canvas4 = canvas2;
                        Paint paint7 = paint6;
                        canvas4.drawLine(org.telegram.messenger.i0.L(f15), org.telegram.ui.Cells.f1.h(this, i21), getMeasuredWidth(), org.telegram.ui.Cells.f1.h(this, i21), paint7);
                        canvas2 = canvas4;
                        paint6 = paint7;
                        i21 = org.telegram.ui.Cells.f1.h(this, i21);
                        int i22 = i15 + 1;
                        if (this.D && i22 >= this.K) {
                            break;
                        }
                        i15 = i22;
                    }
                } else if (getViewType() == 1) {
                    while (i13 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.i0.L(9.0f) + L15), (org.telegram.messenger.i0.L(78.0f) >> 1) + i13, org.telegram.messenger.i0.L(25.0f), paint6);
                        rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(20.0f) + i13, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(28.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(42.0f) + i13, org.telegram.messenger.i0.L(260.0f), org.telegram.messenger.i0.L(50.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        if (this.f33274x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(20.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(28.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        }
                        i13 = org.telegram.ui.Cells.f1.h(this, i13);
                        int i23 = i15 + 1;
                        if (this.D && i23 >= this.K) {
                            break;
                        }
                        i15 = i23;
                    }
                } else if (getViewType() == 2 || getViewType() == 27) {
                    int i24 = 2;
                    int measuredWidth3 = (getMeasuredWidth() - ((getColumnsCount() - 1) * org.telegram.messenger.i0.L(2.0f))) / getColumnsCount();
                    if (getViewType() == 27) {
                        i10 = (int) (measuredWidth3 * 1.25f);
                    } else {
                        i10 = measuredWidth3;
                    }
                    int i25 = i13;
                    int i26 = 0;
                    while (true) {
                        if (i25 >= getMeasuredHeight() && !this.D) {
                            break;
                        }
                        int i27 = 0;
                        while (i27 < getColumnsCount()) {
                            if (i26 == 0 && i27 < this.f33273w) {
                                paint2 = paint6;
                            } else {
                                paint2 = paint6;
                                canvas.drawRect((org.telegram.messenger.i0.L(2.0f) + measuredWidth3) * i27, i25, L + measuredWidth3, i25 + i10, paint2);
                            }
                            i27++;
                            paint6 = paint2;
                        }
                        Paint paint8 = paint6;
                        i25 = org.telegram.messenger.m5.C(2.0f, i10, i25);
                        i26++;
                        int i28 = i24;
                        if (this.D && i26 >= i28) {
                            break;
                        }
                        i24 = i28;
                        paint6 = paint8;
                    }
                } else if (getViewType() == 3) {
                    while (i13 <= getMeasuredHeight()) {
                        rectF.set(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f) + i13, org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(48.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(12.0f) + i13, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(20.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(34.0f) + i13, org.telegram.messenger.i0.L(260.0f), org.telegram.messenger.i0.L(42.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        if (this.f33274x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(12.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(20.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        }
                        i13 = org.telegram.ui.Cells.f1.h(this, i13);
                        int i29 = i15 + 1;
                        if (this.D && i29 >= this.K) {
                            break;
                        }
                        i15 = i29;
                    }
                } else if (getViewType() == 4) {
                    while (i13 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.i0.L(12.0f) + L14), org.telegram.messenger.m5.C(6.0f, i13, L14), org.telegram.messenger.i0.L(44.0f) >> 1, paint6);
                        rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(12.0f) + i13, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(20.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(34.0f) + i13, org.telegram.messenger.i0.L(260.0f), org.telegram.messenger.i0.L(42.0f) + i13);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        if (this.f33274x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(12.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(20.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        }
                        i13 = org.telegram.ui.Cells.f1.h(this, i13);
                        int i30 = i15 + 1;
                        if (this.D && i30 >= this.K) {
                            break;
                        }
                        i15 = i30;
                    }
                } else {
                    float f16 = 2.0f;
                    if (getViewType() == 5) {
                        while (i13 <= getMeasuredHeight()) {
                            rectF.set(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(11.0f) + i13, org.telegram.messenger.i0.L(62.0f), org.telegram.messenger.i0.L(63.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                            rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(12.0f) + i13, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(20.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                            rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(34.0f) + i13, org.telegram.messenger.i0.L(268.0f), org.telegram.messenger.i0.L(42.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                            rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(54.0f) + i13, org.telegram.messenger.i0.L(188.0f), org.telegram.messenger.i0.L(62.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                            if (this.f33274x) {
                                rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(12.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(20.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                            }
                            i13 = org.telegram.ui.Cells.f1.h(this, i13);
                            int i31 = i15 + 1;
                            if (this.D && i31 >= this.K) {
                                break;
                            }
                            i15 = i31;
                        }
                    } else if (getViewType() != 6 && getViewType() != 10) {
                        if (getViewType() == 29) {
                            while (i13 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.m5.C(9.0f, this.G, L13)), (org.telegram.messenger.i0.L(64.0f) >> 1) + i13, org.telegram.messenger.i0.L(23.0f), paint6);
                                rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(17.0f) + i13, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(25.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(39.0f) + i13, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(47.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                int i32 = i15 + 1;
                                if (this.D && i32 >= this.K) {
                                    break;
                                }
                                i15 = i32;
                            }
                        } else if (getViewType() == 33) {
                            while (i13 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.m5.C(13.0f, this.G, L12)), (org.telegram.messenger.i0.L(58.0f) >> 1) + i13, org.telegram.messenger.i0.L(23.0f), paint6);
                                rectF.set(org.telegram.messenger.i0.L(72.0f) + this.G, org.telegram.messenger.i0.L(17.0f) + i13, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(25.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                rectF.set(org.telegram.messenger.i0.L(72.0f) + this.G, org.telegram.messenger.i0.L(39.0f) + i13, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(47.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                int i33 = i15 + 1;
                                if (this.D && i33 >= this.K) {
                                    break;
                                }
                                i15 = i33;
                            }
                        } else if (getViewType() == 30) {
                            while (i13 <= getMeasuredHeight()) {
                                i13 += c(getMeasuredWidth());
                                rectF.set(0.0f, i13, getMeasuredWidth(), i13);
                                b(rectF);
                                canvas2.drawRect(rectF, paint6);
                                int i34 = i15 + 1;
                                if (this.D && i34 >= this.K) {
                                    break;
                                }
                                i15 = i34;
                            }
                        } else if (getViewType() == 8) {
                            while (i13 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.m5.C(11.0f, this.G, L11)), (org.telegram.messenger.i0.L(64.0f) >> 1) + i13, org.telegram.messenger.i0.L(23.0f), paint6);
                                rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(17.0f) + i13, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(25.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(39.0f) + i13, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(47.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                if (this.f33274x) {
                                    rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(20.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(28.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                }
                                i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                int i35 = i15 + 1;
                                if (this.D && i35 >= this.K) {
                                    break;
                                }
                                i15 = i35;
                            }
                        } else if (getViewType() == 9) {
                            while (i13 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.i0.L(35.0f)), (c(getMeasuredWidth()) >> 1) + i13, org.telegram.messenger.i0.L(32.0f) / 2, paint6);
                                rectF.set(org.telegram.messenger.i0.L(72.0f), org.telegram.messenger.i0.L(16.0f) + i13, org.telegram.messenger.i0.L(268.0f), org.telegram.messenger.i0.L(24.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                rectF.set(org.telegram.messenger.i0.L(72.0f), org.telegram.messenger.i0.L(38.0f) + i13, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(46.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                if (this.f33274x) {
                                    rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(16.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(24.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                }
                                i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                int i36 = i15 + 1;
                                if (this.D && i36 >= this.K) {
                                    break;
                                }
                                i15 = i36;
                            }
                        } else if (getViewType() == 11) {
                            int i37 = 0;
                            while (i13 <= getMeasuredHeight()) {
                                rectF.set(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(14.0f), (getMeasuredWidth() * 0.5f) + org.telegram.messenger.i0.L(this.M[0] * 40.0f), org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(14.0f));
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - org.telegram.messenger.i0.L(this.M[0] * 20.0f), org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(14.0f));
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                i37++;
                                if (this.D && i37 >= this.K) {
                                    break;
                                }
                            }
                        } else if (getViewType() == 12) {
                            int L22 = org.telegram.messenger.i0.L(14.0f) + i13;
                            while (L22 <= getMeasuredHeight()) {
                                int measuredWidth4 = getMeasuredWidth() / 4;
                                for (int i38 = 0; i38 < 4; i38++) {
                                    float f17 = (measuredWidth4 / 2.0f) + (measuredWidth4 * i38);
                                    canvas2.drawCircle(f17, (org.telegram.messenger.i0.L(56.0f) / 2.0f) + org.telegram.messenger.i0.L(7.0f) + L22, org.telegram.messenger.i0.L(28.0f), paint6);
                                    float L23 = org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.L(7.0f) + L22;
                                    RectF rectF2 = org.telegram.messenger.i0.P;
                                    rectF2.set(f17 - org.telegram.messenger.i0.L(24.0f), L23 - org.telegram.messenger.i0.L(4.0f), f17 + org.telegram.messenger.i0.L(24.0f), L23 + org.telegram.messenger.i0.L(4.0f));
                                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                }
                                L22 = org.telegram.ui.Cells.f1.h(this, L22);
                                if (this.D) {
                                    break;
                                }
                            }
                        } else if (getViewType() == 13) {
                            float measuredHeight2 = getMeasuredHeight() / 2.0f;
                            RectF rectF3 = org.telegram.messenger.i0.P;
                            rectF3.set(org.telegram.messenger.i0.L(40.0f), measuredHeight2 - org.telegram.messenger.i0.L(4.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(4.0f) + measuredHeight2);
                            canvas2.drawRoundRect(rectF3, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                            if (this.N == null) {
                                Paint paint9 = new Paint(1);
                                this.N = paint9;
                                paint9.setColor(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.G8));
                            }
                            for (int i39 = 0; i39 < 3; i39++) {
                                canvas2.drawCircle(org.telegram.messenger.m5.D(12.0f, i39, org.telegram.messenger.i0.L(13.0f) + (getMeasuredWidth() - org.telegram.messenger.i0.L(56.0f))), measuredHeight2, org.telegram.messenger.i0.L(13.0f), this.N);
                                canvas2.drawCircle(org.telegram.messenger.m5.D(12.0f, i39, org.telegram.messenger.i0.L(13.0f) + (getMeasuredWidth() - org.telegram.messenger.i0.L(56.0f))), measuredHeight2, org.telegram.messenger.i0.L(12.0f), paint6);
                            }
                        } else {
                            float f18 = 21.0f;
                            if (getViewType() != 14 && getViewType() != 17) {
                                if (getViewType() == 15) {
                                    int L24 = org.telegram.messenger.i0.L(23.0f);
                                    int L25 = org.telegram.messenger.i0.L(4.0f);
                                    while (i13 <= getMeasuredHeight()) {
                                        canvas2.drawCircle(a(org.telegram.messenger.m5.C(12.0f, this.G, L24)), org.telegram.messenger.m5.C(8.0f, i13, L24), L24, paint6);
                                        rectF.set(org.telegram.messenger.i0.L(74.0f) + this.G, org.telegram.messenger.i0.L(12.0f) + i13, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(20.0f) + i13);
                                        b(rectF);
                                        float f19 = L25;
                                        canvas2.drawRoundRect(rectF, f19, f19, paint6);
                                        rectF.set(org.telegram.messenger.i0.L(74.0f) + this.G, org.telegram.messenger.i0.L(36.0f) + i13, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(42.0f) + i13);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, f19, f19, paint6);
                                        if (this.T > 0.0f) {
                                            rectF.set(org.telegram.messenger.i0.L(73.0f) + this.G, org.telegram.messenger.i0.L(62.0f) + i13, org.telegram.messenger.i0.L(73.0f) + this.G + this.T, org.telegram.messenger.i0.L(94.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, f19, f19, paint6);
                                        }
                                        i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                        int i40 = i15 + 1;
                                        if (this.D && i40 >= this.K) {
                                            break;
                                        }
                                        i15 = i40;
                                    }
                                } else if (getViewType() != 16 && getViewType() != 23) {
                                    int i41 = this.E;
                                    if (i41 == 21) {
                                        while (i13 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(org.telegram.messenger.i0.L(20.0f) + L10), (org.telegram.messenger.i0.L(58.0f) >> 1) + i13, org.telegram.messenger.i0.L(46.0f) >> 1, paint6);
                                            rectF.set(org.telegram.messenger.i0.L(74.0f), org.telegram.messenger.i0.L(16.0f) + i13, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(24.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            rectF.set(org.telegram.messenger.i0.L(74.0f), org.telegram.messenger.i0.L(38.0f) + i13, org.telegram.messenger.i0.L(260.0f), org.telegram.messenger.i0.L(46.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                            int i42 = i15 + 1;
                                            if (this.D && i42 >= this.K) {
                                                break;
                                            }
                                            i15 = i42;
                                        }
                                    } else if (i41 == 22) {
                                        while (i13 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(org.telegram.messenger.i0.L(20.0f) + L9), org.telegram.messenger.m5.C(6.0f, i13, L9), org.telegram.messenger.i0.L(48.0f) >> 1, paint6);
                                            rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(16.0f) + i13, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(24.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(38.0f) + i13, org.telegram.messenger.i0.L(260.0f), org.telegram.messenger.i0.L(46.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                            int i43 = i15 + 1;
                                            if (this.D && i43 >= this.K) {
                                                break;
                                            }
                                            i15 = i43;
                                        }
                                    } else if (i41 == 25) {
                                        while (i13 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(org.telegram.messenger.i0.L(17.0f) + L8, org.telegram.messenger.m5.C(6.0f, i13, L8), org.telegram.messenger.i0.L(38.0f) >> 1, paint6);
                                            rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(21.0f) + i13, org.telegram.messenger.i0.L(220.0f), org.telegram.messenger.i0.L(29.0f) + i13);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                            int i44 = i15 + 1;
                                            if (this.D && i44 >= this.K) {
                                                break;
                                            }
                                            i15 = i44;
                                        }
                                    } else if (i41 == 26) {
                                        while (i13 <= getMeasuredHeight()) {
                                            int L26 = org.telegram.messenger.i0.L(21.0f) >> 1;
                                            if (org.telegram.messenger.cd.X) {
                                                L7 = org.telegram.messenger.m5.z(21.0f, getMeasuredWidth(), L26);
                                            } else {
                                                L7 = org.telegram.messenger.i0.L(21.0f) + L26;
                                            }
                                            canvas2.drawCircle(L7, org.telegram.messenger.m5.C(16.0f, i13, L26), L26, paint6);
                                            rectF.set(org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(21.0f) + i13, org.telegram.messenger.i0.L(190.0f), org.telegram.messenger.i0.L(29.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(21.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(62.0f), org.telegram.messenger.i0.L(29.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                            int i45 = i15 + 1;
                                            if (this.D && i45 >= this.K) {
                                                break;
                                            }
                                            i15 = i45;
                                        }
                                    } else if (getViewType() == 28) {
                                        while (i13 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(org.telegram.messenger.m5.C(10.0f, this.G, L6)), (org.telegram.messenger.i0.L(58.0f) >> 1) + i13, org.telegram.messenger.i0.L(24.0f), paint6);
                                            rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(17.0f) + i13, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(25.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(39.0f) + i13, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(47.0f) + i13);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            if (this.f33274x) {
                                                rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(20.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(28.0f) + i13);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            }
                                            i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                            int i46 = i15 + 1;
                                            if (this.D && i46 >= this.K) {
                                                break;
                                            }
                                            i15 = i46;
                                        }
                                    } else if (getViewType() == 31) {
                                        while (i13 <= getMeasuredHeight()) {
                                            int c11 = c(getMeasuredWidth());
                                            float f20 = i13;
                                            rectF.set(org.telegram.messenger.i0.L(18.0f) + this.G, ((c11 - org.telegram.messenger.i0.L(22.0f)) / 2.0f) + f20, org.telegram.messenger.i0.L(40.0f) + this.G, ((org.telegram.messenger.i0.L(22.0f) + c11) / 2.0f) + f20);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), paint6);
                                            rectF.set(org.telegram.messenger.i0.L(58.0f) + this.G, ((c11 - org.telegram.messenger.i0.L(8.0f)) / 2.0f) + f20, org.telegram.messenger.z20.C(19.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(132.0f) + this.G), ((org.telegram.messenger.i0.L(8.0f) + c11) / 2.0f) + f20);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            i13 += c11;
                                            int i47 = i15 + 1;
                                            if (this.D && i47 >= this.K) {
                                                break;
                                            }
                                            i15 = i47;
                                        }
                                    } else if (getViewType() == 32) {
                                        while (i13 <= getMeasuredHeight()) {
                                            int c12 = c(getMeasuredWidth());
                                            float f21 = i13;
                                            rectF.set(org.telegram.messenger.i0.L(10.0f) + this.G, ((c12 - org.telegram.messenger.i0.L(32.0f)) / 2.0f) + f21, org.telegram.messenger.i0.L(42.0f) + this.G, ((org.telegram.messenger.i0.L(32.0f) + c12) / 2.0f) + f21);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint6);
                                            rectF.set(org.telegram.messenger.i0.L(64.0f) + this.G, (((c12 - org.telegram.messenger.i0.L(14.0f)) - org.telegram.messenger.i0.L(10.0f)) / 2.0f) + f21, org.telegram.messenger.z20.C(19.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(118.0f) + this.G), ((org.telegram.messenger.i0.L(10.0f) + (c12 - org.telegram.messenger.i0.L(14.0f))) / 2.0f) + f21);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            rectF.set(org.telegram.messenger.i0.L(64.0f) + this.G, (((org.telegram.messenger.i0.L(14.0f) + c12) - org.telegram.messenger.i0.L(8.0f)) / 2.0f) + f21, org.telegram.messenger.z20.C(19.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(144.0f) + this.G), ((org.telegram.messenger.i0.L(8.0f) + (org.telegram.messenger.i0.L(14.0f) + c12)) / 2.0f) + f21);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                                            i13 += c12;
                                            int i48 = i15 + 1;
                                            if (this.D && i48 >= this.K) {
                                                break;
                                            }
                                            i15 = i48;
                                        }
                                    } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                                        rectF.set(this.G, this.F, getMeasuredWidth() - this.G, getMeasuredHeight() - this.F);
                                        rectF.inset(org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(4.0f));
                                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), paint6);
                                    }
                                } else {
                                    int i49 = 0;
                                    while (i13 <= getMeasuredHeight()) {
                                        canvas2.drawCircle(a(org.telegram.messenger.m5.C(8.0f, this.G, L4)), org.telegram.messenger.i0.L(24.0f) + i13, org.telegram.messenger.i0.L(18.0f), paint6);
                                        rectF.set(org.telegram.messenger.i0.L(58.0f) + this.G, org.telegram.messenger.i0.L(20.0f) + i13, getWidth() - org.telegram.messenger.i0.L(53.0f), org.telegram.messenger.i0.L(28.0f) + i13);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint6);
                                        if (i49 < 4) {
                                            canvas2.drawCircle(a(org.telegram.messenger.m5.z(12.0f, getWidth(), L5)), org.telegram.messenger.i0.L(24.0f) + i13, org.telegram.messenger.i0.L(12.0f), paint6);
                                        }
                                        i13 = org.telegram.ui.Cells.f1.h(this, i13);
                                        i49++;
                                        if (this.D && i49 >= this.K) {
                                            break;
                                        }
                                    }
                                    rectF.set(org.telegram.messenger.i0.L(8.0f) + this.G, org.telegram.messenger.i0.L(20.0f) + i13, getWidth() - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(28.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint6);
                                    rectF.set(org.telegram.messenger.i0.L(8.0f) + this.G, org.telegram.messenger.i0.L(36.0f) + i13, getWidth() - org.telegram.messenger.i0.L(53.0f), org.telegram.messenger.i0.L(44.0f) + i13);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint6);
                                }
                            } else {
                                int L27 = org.telegram.messenger.i0.L(12.0f);
                                int L28 = org.telegram.messenger.i0.L(77.0f);
                                int L29 = org.telegram.messenger.i0.L(4.0f);
                                float L30 = org.telegram.messenger.i0.L(21.0f);
                                float L31 = org.telegram.messenger.i0.L(41.0f);
                                while (L27 < getMeasuredWidth()) {
                                    if (this.N == null) {
                                        this.N = new Paint(i16);
                                    }
                                    this.N.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.L));
                                    RectF rectF4 = org.telegram.messenger.i0.P;
                                    int i50 = L27 + L28;
                                    int i51 = i16;
                                    float f22 = f14;
                                    rectF4.set(org.telegram.messenger.i0.L(4.0f) + L27, org.telegram.messenger.i0.L(4.0f), i50 - org.telegram.messenger.i0.L(4.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(4.0f));
                                    canvas2.drawRoundRect(rectF4, org.telegram.messenger.i0.L(f22), org.telegram.messenger.i0.L(f22), paint6);
                                    if (getViewType() == 14) {
                                        float L32 = org.telegram.messenger.i0.L(8.0f) + L29;
                                        float f23 = L27;
                                        float L33 = org.telegram.messenger.i0.L(22.0f) + L29 + f23;
                                        rectF.set(L33, L32, L33 + L31, L32 + L30);
                                        canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.N);
                                        float L34 = org.telegram.messenger.i0.L(4.0f) + L30 + L32;
                                        float L35 = f23 + org.telegram.messenger.i0.L(5.0f) + L29;
                                        rectF.set(L35, L34, L35 + L31, L34 + L30);
                                        canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.N);
                                    } else if (getViewType() == 17) {
                                        float L36 = org.telegram.messenger.i0.L(5.0f);
                                        float L37 = org.telegram.messenger.i0.L(32.0f);
                                        f12 = f18;
                                        float B = c3.i0.B(L28, L37, f16, L27);
                                        rectF4.set(B, org.telegram.messenger.i0.L(f12), L37 + B, org.telegram.messenger.i0.L(32.0f) + L3);
                                        canvas2.drawRoundRect(rectF4, L36, L36, this.N);
                                        canvas2.drawCircle((L28 / 2) + L27, getMeasuredHeight() - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(8.0f), this.N);
                                        L27 = i50;
                                        f18 = f12;
                                        i16 = i51;
                                        f14 = f22;
                                        f16 = 2.0f;
                                    }
                                    f12 = f18;
                                    canvas2.drawCircle((L28 / 2) + L27, getMeasuredHeight() - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(8.0f), this.N);
                                    L27 = i50;
                                    f18 = f12;
                                    i16 = i51;
                                    f14 = f22;
                                    f16 = 2.0f;
                                }
                            }
                        }
                    } else {
                        while (i13 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.m5.C(9.0f, this.G, L2)), (org.telegram.messenger.i0.L(64.0f) >> 1) + i13, org.telegram.messenger.i0.L(23.0f), paint6);
                            rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(17.0f) + i13, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(25.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                            rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(39.0f) + i13, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(47.0f) + i13);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                            if (this.f33274x) {
                                rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(20.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(28.0f) + i13);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                            }
                            i13 = org.telegram.ui.Cells.f1.h(this, i13);
                            int i52 = i15 + 1;
                            if (this.D && i52 >= this.K) {
                                break;
                            }
                            i15 = i52;
                        }
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
                        canvas2.drawCircle(org.telegram.messenger.i0.L(36.0f) + this.G, org.telegram.messenger.i0.L(35.0f) + i13, org.telegram.messenger.i0.L(23.0f), paint6);
                    } else {
                        rectF.set(org.telegram.messenger.i0.L(15.0f) + this.G, org.telegram.messenger.i0.L(6.0f) + i13, org.telegram.messenger.i0.L(61.0f) + this.G, org.telegram.messenger.i0.L(52.0f) + i13);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint6);
                    }
                    float L38 = org.telegram.messenger.i0.L(71.0f) + this.G;
                    int measuredWidth5 = getMeasuredWidth();
                    if (z10) {
                        f7 = 76.0f;
                    } else {
                        f7 = 20.0f;
                    }
                    float max = Math.max(L38, measuredWidth5 - org.telegram.messenger.i0.L(f7));
                    rectF.set(L38, org.telegram.messenger.i0.L(14.0f) + i13, Math.min(org.telegram.messenger.i0.L(100.0f) + L38, max), org.telegram.messenger.i0.L(22.0f) + i13);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                    if (z10) {
                        f10 = 33.0f;
                    } else {
                        f10 = 36.0f;
                    }
                    float L39 = org.telegram.messenger.i0.L(f10) + i13;
                    float min = Math.min(org.telegram.messenger.i0.L(140.0f) + L38, max);
                    if (z10) {
                        f11 = 41.0f;
                    } else {
                        f11 = 44.0f;
                    }
                    rectF.set(L38, L39, min, org.telegram.messenger.i0.L(f11) + i13);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                    if (z10) {
                        rectF.set(L38, org.telegram.messenger.i0.L(51.0f) + i13, Math.min(org.telegram.messenger.i0.L(80.0f) + L38, max), org.telegram.messenger.i0.L(59.0f) + i13);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        if (getMeasuredWidth() - org.telegram.messenger.i0.L(68.0f) >= L38) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(15.0f) + i13, getMeasuredWidth() - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(23.0f) + i13);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint6);
                        }
                    }
                    i13 += c13;
                    int i53 = i15 + 1;
                    if (this.D && i53 >= this.K) {
                        break;
                    }
                    i15 = i53;
                }
            }
        }
        invalidate();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.D) {
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

    public void setGlobalGradientView(zz zzVar) {
        this.R = zzVar;
    }

    public void setIgnoreHeightCheck(boolean z10) {
        this.S = z10;
    }

    public void setIsSingleCell(boolean z10) {
        this.D = z10;
    }

    public void setItemsCount(int i10) {
        this.K = i10;
    }

    public void setMemberRequestButton(boolean z10) {
        int i10;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        float L = org.telegram.messenger.i0.L(34.0f);
        if (z10) {
            i10 = 2131754378;
        } else {
            i10 = 2131754373;
        }
        this.T = textPaint.measureText(org.telegram.messenger.cd.L0(i10, null)) + L;
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
        this.f33275y = z10;
    }

    public void setViewType(int i10) {
        this.E = i10;
        if (i10 == 11) {
            Random random = new Random();
            this.M = new float[2];
            for (int i11 = 0; i11 < 2; i11++) {
                this.M[i11] = Math.abs(random.nextInt() % 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i10;
        zz zzVar = this.R;
        if (zzVar != null) {
            zzVar.updateColors();
            return;
        }
        int i11 = this.H;
        org.telegram.ui.ActionBar.p6 p6Var = this.L;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(this.I, p6Var);
        if (this.f33272s == w03 && this.f33271r == w02) {
            return;
        }
        this.f33271r = w02;
        this.f33272s = w03;
        int i12 = this.E;
        if (i12 != 34 && i12 != 35 && i12 != 36) {
            if (!this.D && i12 != 13 && i12 != 14 && i12 != 17) {
                this.f33266a = org.telegram.messenger.i0.L(600.0f);
            } else {
                this.f33266a = org.telegram.messenger.i0.L(200.0f);
            }
        } else {
            this.f33266a = org.telegram.messenger.i0.f16026q.x;
        }
        if (!this.D && (i10 = this.E) != 13 && i10 != 14 && i10 != 17) {
            this.f33267b = new LinearGradient(0.0f, 0.0f, 0.0f, this.f33266a, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.f33267b = new LinearGradient(0.0f, 0.0f, this.f33266a, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f33268c.setShader(this.f33267b);
    }

    public zz(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f33268c = new Paint();
        this.d = new Paint();
        this.f33270n = new RectF();
        this.f33274x = true;
        this.H = org.telegram.ui.ActionBar.t6.G8;
        this.I = org.telegram.ui.ActionBar.t6.f21020i6;
        this.J = -1;
        this.K = 1;
        this.L = p6Var;
        this.h = new Matrix();
    }
}
