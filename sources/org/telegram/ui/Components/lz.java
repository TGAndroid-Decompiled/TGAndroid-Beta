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
public class lz extends View implements org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.f6 L;
    public float[] M;
    public Paint N;
    public int O;
    public int P;
    public float Q;
    public lz R;
    public boolean S;
    public float T;
    public int f35798a;
    public LinearGradient f35799b;
    public final Paint f35800c;
    public final Paint d;
    public long f35801e;
    public int f35802f;
    public final Matrix h;
    public final RectF f35803n;
    public int f35804r;
    public int f35805s;
    public int f35806w;
    public boolean f35807x;
    public boolean f35808y;

    public lz(Context context) {
        this(context, null);
    }

    public final float a(float f10) {
        if (org.telegram.messenger.hd.f22871a0) {
            return getMeasuredWidth() - f10;
        }
        return f10;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.H));
        hashSet.add(Integer.valueOf(this.I));
    }

    public final void b(RectF rectF) {
        if (org.telegram.messenger.hd.f22871a0) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i7) {
        int i10;
        int i11;
        switch (getViewType()) {
            case 1:
                return org.telegram.messenger.g0.L(78.0f) + 1;
            case 2:
                int L = org.telegram.messenger.g0.L(2.0f);
                return org.telegram.messenger.g0.L(2.0f) + ((i7 - ((getColumnsCount() - 1) * L)) / getColumnsCount());
            case 3:
            case 4:
                return org.telegram.messenger.g0.L(56.0f);
            case 5:
                return org.telegram.messenger.g0.L(80.0f);
            case 6:
            case 18:
                return org.telegram.messenger.g0.L(64.0f);
            case 7:
                if (org.telegram.messenger.iz.f23399p1) {
                    i10 = 78;
                } else {
                    i10 = 72;
                }
                return org.telegram.messenger.g0.L(i10 + 1);
            case 8:
                return org.telegram.messenger.g0.L(61.0f);
            case 9:
                return org.telegram.messenger.g0.L(66.0f);
            case 10:
                return org.telegram.messenger.g0.L(58.0f);
            case 11:
                return org.telegram.messenger.g0.L(36.0f);
            case 12:
                return org.telegram.messenger.g0.L(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return org.telegram.messenger.g0.L(107.0f);
            case 16:
            case 23:
                return org.telegram.messenger.g0.L(50.0f);
            case 19:
                return org.telegram.messenger.g0.L(58.0f);
            case 21:
                return org.telegram.messenger.g0.L(58.0f);
            case 22:
                return org.telegram.messenger.g0.L(60.0f);
            case 24:
                if (org.telegram.messenger.iz.f23399p1) {
                    i11 = 76;
                } else {
                    i11 = 64;
                }
                return org.telegram.messenger.g0.L(i11 + 1);
            case 25:
                return org.telegram.messenger.g0.L(51.0f);
            case 26:
                return org.telegram.messenger.g0.L(50.0f) + 1;
            case 28:
                return org.telegram.messenger.g0.L(58.0f);
            case 29:
                return org.telegram.messenger.g0.L(60.0f) + 1;
            case 30:
                return org.telegram.messenger.g0.L(32.0f);
            case 31:
                return org.telegram.messenger.g0.L(48.0f) + 1;
            case 32:
                return org.telegram.messenger.g0.L(56.0f) + 1;
            case 33:
                return org.telegram.messenger.g0.L(58.0f);
            case 34:
                return org.telegram.messenger.g0.L(140.0f);
            case 35:
                return org.telegram.messenger.g0.L(112.0f);
            case 36:
                return org.telegram.messenger.g0.L(108.0f);
            case 37:
                return org.telegram.messenger.g0.L(73.0f);
            case 38:
                return org.telegram.messenger.g0.L(58.0f);
        }
    }

    public final int d(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.L);
    }

    public final void e(int i7, int i10, int i11) {
        this.H = i7;
        this.I = i10;
        this.J = i11;
        invalidate();
    }

    public final void f() {
        lz lzVar = this.R;
        if (lzVar != null) {
            lzVar.f();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f35801e - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int i7 = this.O;
        if (i7 == 0) {
            i7 = getMeasuredWidth();
        }
        int i10 = this.E;
        if (i10 == 34 || i10 == 35 || i10 == 36) {
            i7 = Math.max(i7, org.telegram.messenger.g0.f22537q.x);
        }
        int i11 = this.P;
        if (i11 == 0) {
            i11 = getMeasuredHeight();
        }
        this.f35801e = elapsedRealtime;
        boolean z9 = this.D;
        Matrix matrix = this.h;
        if (!z9 && this.E != 13 && getViewType() != 14 && getViewType() != 17) {
            int i12 = (int) ((((float) (abs * i11)) / 400.0f) + this.f35802f);
            this.f35802f = i12;
            if (i12 >= i11 * 2) {
                this.f35802f = (-this.f35798a) * 2;
            }
            matrix.setTranslate(this.Q, this.f35802f);
        } else {
            int i13 = (int) ((((float) (abs * i7)) / 400.0f) + this.f35802f);
            this.f35802f = i13;
            if (i13 >= i7 * 2) {
                this.f35802f = (-this.f35798a) * 2;
            }
            matrix.setTranslate(this.f35802f + this.Q, 0.0f);
        }
        LinearGradient linearGradient = this.f35799b;
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
        return this.f35800c;
    }

    public int getViewType() {
        return this.E;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        boolean z9;
        float f10;
        float f11;
        float f12;
        int i7;
        int L;
        Paint paint2;
        int L2;
        float f13;
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
        int i10;
        int L17;
        int i11;
        int L18;
        int L19;
        Paint paint3;
        if (this.R != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                lz lzVar = this.R;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                lzVar.O = measuredWidth;
                lzVar.P = measuredHeight;
                lzVar.Q = -getX();
            }
            paint = this.R.f35800c;
        } else {
            paint = this.f35800c;
        }
        Paint paint4 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.Q = -getX();
        }
        updateColors();
        f();
        int i12 = this.F;
        if (this.f35808y) {
            int L20 = org.telegram.messenger.g0.L(32.0f) + i12;
            int i13 = this.J;
            if (i13 >= 0) {
                this.d.setColor(d(i13));
            }
            float measuredWidth2 = getMeasuredWidth();
            float L21 = org.telegram.messenger.g0.L(32.0f);
            if (this.J >= 0) {
                paint3 = this.d;
            } else {
                paint3 = paint4;
            }
            canvas.drawRect(0.0f, 0.0f, measuredWidth2, L21, paint3);
            canvas2 = canvas;
            i12 = L20;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i14 = 0;
        int i15 = 1;
        RectF rectF = this.f35803n;
        if (viewType == 7) {
            while (i12 <= getMeasuredHeight()) {
                int c10 = c(getMeasuredWidth());
                canvas2.drawCircle(a(org.telegram.messenger.g0.L(10.0f) + L19), (c10 >> 1) + i12, org.telegram.messenger.g0.L(28.0f), paint4);
                rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(16.0f) + i12, org.telegram.messenger.g0.L(148.0f), org.telegram.messenger.g0.L(24.0f) + i12);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(38.0f) + i12, org.telegram.messenger.g0.L(268.0f), org.telegram.messenger.g0.L(46.0f) + i12);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                if (org.telegram.messenger.iz.f23399p1) {
                    rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(54.0f) + i12, org.telegram.messenger.g0.L(220.0f), org.telegram.messenger.g0.L(62.0f) + i12);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                }
                if (this.f35807x) {
                    rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(16.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(24.0f) + i12);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                }
                i12 = org.telegram.ui.Cells.f1.g(this, i12);
                int i16 = i14 + 1;
                if (this.D && i16 >= this.K) {
                    break;
                }
                i14 = i16;
            }
        } else if (getViewType() == 24) {
            while (i12 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.g0.L(10.0f) + L18), org.telegram.messenger.k5.C(10.0f, i12, L18), org.telegram.messenger.g0.L(14.0f), paint4);
                canvas2.save();
                canvas2.translate(0.0f, -org.telegram.messenger.g0.L(4.0f));
                rectF.set(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(16.0f) + i12, org.telegram.messenger.g0.L(148.0f), org.telegram.messenger.g0.L(24.0f) + i12);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                rectF.set(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(38.0f) + i12, org.telegram.messenger.g0.L(268.0f), org.telegram.messenger.g0.L(46.0f) + i12);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                if (org.telegram.messenger.iz.f23399p1) {
                    rectF.set(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(54.0f) + i12, org.telegram.messenger.g0.L(220.0f), org.telegram.messenger.g0.L(62.0f) + i12);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                }
                if (this.f35807x) {
                    rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(16.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(24.0f) + i12);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                }
                canvas2.restore();
                i12 += c(getMeasuredWidth());
                int i17 = i14 + 1;
                if (this.D && i17 >= this.K) {
                    break;
                }
                i14 = i17;
            }
        } else if (getViewType() == 18) {
            int i18 = i12;
            while (i18 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.k5.C(9.0f, this.G, L17)), org.telegram.messenger.g0.L(32.0f) + i18, org.telegram.messenger.g0.L(25.0f), paint4);
                if (i14 % 2 == 0) {
                    i11 = 52;
                } else {
                    i11 = 72;
                }
                float f14 = 76;
                rectF.set(org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(20.0f) + i18, org.telegram.messenger.g0.L(i11 + 76), org.telegram.messenger.g0.L(28.0f) + i18);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                rectF.set(org.telegram.messenger.g0.L(i11 + 84), org.telegram.messenger.g0.L(20.0f) + i18, org.telegram.messenger.g0.L(i11 + 168), org.telegram.messenger.g0.L(28.0f) + i18);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                rectF.set(org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(42.0f) + i18, org.telegram.messenger.g0.L(140), org.telegram.messenger.g0.L(50.0f) + i18);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint4);
                Canvas canvas3 = canvas2;
                Paint paint5 = paint4;
                canvas3.drawLine(org.telegram.messenger.g0.L(f14), org.telegram.ui.Cells.f1.g(this, i18), getMeasuredWidth(), org.telegram.ui.Cells.f1.g(this, i18), paint5);
                canvas2 = canvas3;
                i18 = org.telegram.ui.Cells.f1.g(this, i18);
                int i19 = i14 + 1;
                if (this.D && i19 >= this.K) {
                    break;
                }
                i14 = i19;
                paint4 = paint5;
            }
        } else {
            Paint paint6 = paint4;
            float f15 = 6.0f;
            if (getViewType() != 37 && getViewType() != 38) {
                if (getViewType() == 19) {
                    int i20 = i12;
                    while (i20 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.k5.C(9.0f, this.G, L16)), org.telegram.messenger.g0.L(29.0f) + i20, org.telegram.messenger.g0.L(20.0f), paint6);
                        if (i14 % 2 == 0) {
                            i10 = 92;
                        } else {
                            i10 = 128;
                        }
                        float f16 = 76;
                        rectF.set(org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(16.0f) + i20, org.telegram.messenger.g0.L(i10 + 76), org.telegram.messenger.g0.L(24.0f) + i20);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        rectF.set(org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(38.0f) + i20, org.telegram.messenger.g0.L(240), org.telegram.messenger.g0.L(46.0f) + i20);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        Canvas canvas4 = canvas2;
                        Paint paint7 = paint6;
                        canvas4.drawLine(org.telegram.messenger.g0.L(f16), org.telegram.ui.Cells.f1.g(this, i20), getMeasuredWidth(), org.telegram.ui.Cells.f1.g(this, i20), paint7);
                        canvas2 = canvas4;
                        paint6 = paint7;
                        i20 = org.telegram.ui.Cells.f1.g(this, i20);
                        int i21 = i14 + 1;
                        if (this.D && i21 >= this.K) {
                            break;
                        }
                        i14 = i21;
                    }
                } else if (getViewType() == 1) {
                    while (i12 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.g0.L(9.0f) + L15), (org.telegram.messenger.g0.L(78.0f) >> 1) + i12, org.telegram.messenger.g0.L(25.0f), paint6);
                        rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(20.0f) + i12, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(28.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(42.0f) + i12, org.telegram.messenger.g0.L(260.0f), org.telegram.messenger.g0.L(50.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        if (this.f35807x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(20.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        }
                        i12 = org.telegram.ui.Cells.f1.g(this, i12);
                        int i22 = i14 + 1;
                        if (this.D && i22 >= this.K) {
                            break;
                        }
                        i14 = i22;
                    }
                } else if (getViewType() == 2 || getViewType() == 27) {
                    int i23 = 2;
                    int measuredWidth3 = (getMeasuredWidth() - ((getColumnsCount() - 1) * org.telegram.messenger.g0.L(2.0f))) / getColumnsCount();
                    if (getViewType() == 27) {
                        i7 = (int) (measuredWidth3 * 1.25f);
                    } else {
                        i7 = measuredWidth3;
                    }
                    int i24 = i12;
                    int i25 = 0;
                    while (true) {
                        if (i24 >= getMeasuredHeight() && !this.D) {
                            break;
                        }
                        int i26 = 0;
                        while (i26 < getColumnsCount()) {
                            if (i25 == 0 && i26 < this.f35806w) {
                                paint2 = paint6;
                            } else {
                                paint2 = paint6;
                                canvas.drawRect((org.telegram.messenger.g0.L(2.0f) + measuredWidth3) * i26, i24, L + measuredWidth3, i24 + i7, paint2);
                            }
                            i26++;
                            paint6 = paint2;
                        }
                        Paint paint8 = paint6;
                        i24 = org.telegram.messenger.k5.C(2.0f, i7, i24);
                        i25++;
                        int i27 = i23;
                        if (this.D && i25 >= i27) {
                            break;
                        }
                        i23 = i27;
                        paint6 = paint8;
                    }
                } else if (getViewType() == 3) {
                    while (i12 <= getMeasuredHeight()) {
                        rectF.set(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f) + i12, org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(48.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(12.0f) + i12, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(20.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(34.0f) + i12, org.telegram.messenger.g0.L(260.0f), org.telegram.messenger.g0.L(42.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        if (this.f35807x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(12.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(20.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        }
                        i12 = org.telegram.ui.Cells.f1.g(this, i12);
                        int i28 = i14 + 1;
                        if (this.D && i28 >= this.K) {
                            break;
                        }
                        i14 = i28;
                    }
                } else if (getViewType() == 4) {
                    while (i12 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.g0.L(12.0f) + L14), org.telegram.messenger.k5.C(6.0f, i12, L14), org.telegram.messenger.g0.L(44.0f) >> 1, paint6);
                        rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(12.0f) + i12, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(20.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(34.0f) + i12, org.telegram.messenger.g0.L(260.0f), org.telegram.messenger.g0.L(42.0f) + i12);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        if (this.f35807x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(12.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(20.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        }
                        i12 = org.telegram.ui.Cells.f1.g(this, i12);
                        int i29 = i14 + 1;
                        if (this.D && i29 >= this.K) {
                            break;
                        }
                        i14 = i29;
                    }
                } else {
                    float f17 = 2.0f;
                    if (getViewType() == 5) {
                        while (i12 <= getMeasuredHeight()) {
                            rectF.set(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(11.0f) + i12, org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(63.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                            rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(12.0f) + i12, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(20.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                            rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(34.0f) + i12, org.telegram.messenger.g0.L(268.0f), org.telegram.messenger.g0.L(42.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                            rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(54.0f) + i12, org.telegram.messenger.g0.L(188.0f), org.telegram.messenger.g0.L(62.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                            if (this.f35807x) {
                                rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(12.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(20.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                            }
                            i12 = org.telegram.ui.Cells.f1.g(this, i12);
                            int i30 = i14 + 1;
                            if (this.D && i30 >= this.K) {
                                break;
                            }
                            i14 = i30;
                        }
                    } else if (getViewType() != 6 && getViewType() != 10) {
                        if (getViewType() == 29) {
                            while (i12 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.k5.C(9.0f, this.G, L13)), (org.telegram.messenger.g0.L(64.0f) >> 1) + i12, org.telegram.messenger.g0.L(23.0f), paint6);
                                rectF.set(org.telegram.messenger.g0.L(68.0f) + this.G, org.telegram.messenger.g0.L(17.0f) + i12, org.telegram.messenger.g0.L(260.0f) + this.G, org.telegram.messenger.g0.L(25.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                rectF.set(org.telegram.messenger.g0.L(68.0f) + this.G, org.telegram.messenger.g0.L(39.0f) + i12, org.telegram.messenger.g0.L(140.0f) + this.G, org.telegram.messenger.g0.L(47.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                int i31 = i14 + 1;
                                if (this.D && i31 >= this.K) {
                                    break;
                                }
                                i14 = i31;
                            }
                        } else if (getViewType() == 33) {
                            while (i12 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.k5.C(13.0f, this.G, L12)), (org.telegram.messenger.g0.L(58.0f) >> 1) + i12, org.telegram.messenger.g0.L(23.0f), paint6);
                                rectF.set(org.telegram.messenger.g0.L(72.0f) + this.G, org.telegram.messenger.g0.L(17.0f) + i12, org.telegram.messenger.g0.L(260.0f) + this.G, org.telegram.messenger.g0.L(25.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                rectF.set(org.telegram.messenger.g0.L(72.0f) + this.G, org.telegram.messenger.g0.L(39.0f) + i12, org.telegram.messenger.g0.L(140.0f) + this.G, org.telegram.messenger.g0.L(47.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                int i32 = i14 + 1;
                                if (this.D && i32 >= this.K) {
                                    break;
                                }
                                i14 = i32;
                            }
                        } else if (getViewType() == 30) {
                            while (i12 <= getMeasuredHeight()) {
                                i12 += c(getMeasuredWidth());
                                rectF.set(0.0f, i12, getMeasuredWidth(), i12);
                                b(rectF);
                                canvas2.drawRect(rectF, paint6);
                                int i33 = i14 + 1;
                                if (this.D && i33 >= this.K) {
                                    break;
                                }
                                i14 = i33;
                            }
                        } else if (getViewType() == 8) {
                            while (i12 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.k5.C(11.0f, this.G, L11)), (org.telegram.messenger.g0.L(64.0f) >> 1) + i12, org.telegram.messenger.g0.L(23.0f), paint6);
                                rectF.set(org.telegram.messenger.g0.L(68.0f) + this.G, org.telegram.messenger.g0.L(17.0f) + i12, org.telegram.messenger.g0.L(140.0f) + this.G, org.telegram.messenger.g0.L(25.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                rectF.set(org.telegram.messenger.g0.L(68.0f) + this.G, org.telegram.messenger.g0.L(39.0f) + i12, org.telegram.messenger.g0.L(260.0f) + this.G, org.telegram.messenger.g0.L(47.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                if (this.f35807x) {
                                    rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(20.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                }
                                i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                int i34 = i14 + 1;
                                if (this.D && i34 >= this.K) {
                                    break;
                                }
                                i14 = i34;
                            }
                        } else if (getViewType() == 9) {
                            while (i12 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.g0.L(35.0f)), (c(getMeasuredWidth()) >> 1) + i12, org.telegram.messenger.g0.L(32.0f) / 2, paint6);
                                rectF.set(org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(16.0f) + i12, org.telegram.messenger.g0.L(268.0f), org.telegram.messenger.g0.L(24.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                rectF.set(org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(38.0f) + i12, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(46.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                if (this.f35807x) {
                                    rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(16.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(24.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                }
                                i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                int i35 = i14 + 1;
                                if (this.D && i35 >= this.K) {
                                    break;
                                }
                                i14 = i35;
                            }
                        } else if (getViewType() == 11) {
                            int i36 = 0;
                            while (i12 <= getMeasuredHeight()) {
                                rectF.set(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(14.0f), (getMeasuredWidth() * 0.5f) + org.telegram.messenger.g0.L(this.M[0] * 40.0f), org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(14.0f));
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - org.telegram.messenger.g0.L(this.M[0] * 20.0f), org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(14.0f));
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                i36++;
                                if (this.D && i36 >= this.K) {
                                    break;
                                }
                            }
                        } else if (getViewType() == 12) {
                            int L22 = org.telegram.messenger.g0.L(14.0f) + i12;
                            while (L22 <= getMeasuredHeight()) {
                                int measuredWidth4 = getMeasuredWidth() / 4;
                                for (int i37 = 0; i37 < 4; i37++) {
                                    float f18 = (measuredWidth4 / 2.0f) + (measuredWidth4 * i37);
                                    canvas2.drawCircle(f18, (org.telegram.messenger.g0.L(56.0f) / 2.0f) + org.telegram.messenger.g0.L(7.0f) + L22, org.telegram.messenger.g0.L(28.0f), paint6);
                                    float L23 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.L(7.0f) + L22;
                                    RectF rectF2 = org.telegram.messenger.g0.P;
                                    rectF2.set(f18 - org.telegram.messenger.g0.L(24.0f), L23 - org.telegram.messenger.g0.L(4.0f), f18 + org.telegram.messenger.g0.L(24.0f), L23 + org.telegram.messenger.g0.L(4.0f));
                                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                }
                                L22 = org.telegram.ui.Cells.f1.g(this, L22);
                                if (this.D) {
                                    break;
                                }
                            }
                        } else if (getViewType() == 13) {
                            float measuredHeight2 = getMeasuredHeight() / 2.0f;
                            RectF rectF3 = org.telegram.messenger.g0.P;
                            rectF3.set(org.telegram.messenger.g0.L(40.0f), measuredHeight2 - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(4.0f) + measuredHeight2);
                            canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                            if (this.N == null) {
                                Paint paint9 = new Paint(1);
                                this.N = paint9;
                                paint9.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8));
                            }
                            for (int i38 = 0; i38 < 3; i38++) {
                                canvas2.drawCircle(org.telegram.messenger.k5.D(12.0f, i38, org.telegram.messenger.g0.L(13.0f) + (getMeasuredWidth() - org.telegram.messenger.g0.L(56.0f))), measuredHeight2, org.telegram.messenger.g0.L(13.0f), this.N);
                                canvas2.drawCircle(org.telegram.messenger.k5.D(12.0f, i38, org.telegram.messenger.g0.L(13.0f) + (getMeasuredWidth() - org.telegram.messenger.g0.L(56.0f))), measuredHeight2, org.telegram.messenger.g0.L(12.0f), paint6);
                            }
                        } else {
                            float f19 = 21.0f;
                            if (getViewType() != 14 && getViewType() != 17) {
                                if (getViewType() == 15) {
                                    int L24 = org.telegram.messenger.g0.L(23.0f);
                                    int L25 = org.telegram.messenger.g0.L(4.0f);
                                    while (i12 <= getMeasuredHeight()) {
                                        canvas2.drawCircle(a(org.telegram.messenger.k5.C(12.0f, this.G, L24)), org.telegram.messenger.k5.C(8.0f, i12, L24), L24, paint6);
                                        rectF.set(org.telegram.messenger.g0.L(74.0f) + this.G, org.telegram.messenger.g0.L(12.0f) + i12, org.telegram.messenger.g0.L(260.0f) + this.G, org.telegram.messenger.g0.L(20.0f) + i12);
                                        b(rectF);
                                        float f20 = L25;
                                        canvas2.drawRoundRect(rectF, f20, f20, paint6);
                                        rectF.set(org.telegram.messenger.g0.L(74.0f) + this.G, org.telegram.messenger.g0.L(36.0f) + i12, org.telegram.messenger.g0.L(140.0f) + this.G, org.telegram.messenger.g0.L(42.0f) + i12);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, f20, f20, paint6);
                                        if (this.T > 0.0f) {
                                            rectF.set(org.telegram.messenger.g0.L(73.0f) + this.G, org.telegram.messenger.g0.L(62.0f) + i12, org.telegram.messenger.g0.L(73.0f) + this.G + this.T, org.telegram.messenger.g0.L(94.0f) + i12);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, f20, f20, paint6);
                                        }
                                        i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                        int i39 = i14 + 1;
                                        if (this.D && i39 >= this.K) {
                                            break;
                                        }
                                        i14 = i39;
                                    }
                                } else if (getViewType() != 16 && getViewType() != 23) {
                                    int i40 = this.E;
                                    if (i40 == 21) {
                                        while (i12 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(org.telegram.messenger.g0.L(20.0f) + L10), (org.telegram.messenger.g0.L(58.0f) >> 1) + i12, org.telegram.messenger.g0.L(46.0f) >> 1, paint6);
                                            rectF.set(org.telegram.messenger.g0.L(74.0f), org.telegram.messenger.g0.L(16.0f) + i12, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(24.0f) + i12);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            rectF.set(org.telegram.messenger.g0.L(74.0f), org.telegram.messenger.g0.L(38.0f) + i12, org.telegram.messenger.g0.L(260.0f), org.telegram.messenger.g0.L(46.0f) + i12);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                            int i41 = i14 + 1;
                                            if (this.D && i41 >= this.K) {
                                                break;
                                            }
                                            i14 = i41;
                                        }
                                    } else if (i40 == 22) {
                                        while (i12 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(org.telegram.messenger.g0.L(20.0f) + L9), org.telegram.messenger.k5.C(6.0f, i12, L9), org.telegram.messenger.g0.L(48.0f) >> 1, paint6);
                                            rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(16.0f) + i12, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(24.0f) + i12);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(38.0f) + i12, org.telegram.messenger.g0.L(260.0f), org.telegram.messenger.g0.L(46.0f) + i12);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                            int i42 = i14 + 1;
                                            if (this.D && i42 >= this.K) {
                                                break;
                                            }
                                            i14 = i42;
                                        }
                                    } else if (i40 == 25) {
                                        while (i12 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(org.telegram.messenger.g0.L(17.0f) + L8, org.telegram.messenger.k5.C(6.0f, i12, L8), org.telegram.messenger.g0.L(38.0f) >> 1, paint6);
                                            rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(21.0f) + i12, org.telegram.messenger.g0.L(220.0f), org.telegram.messenger.g0.L(29.0f) + i12);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                            int i43 = i14 + 1;
                                            if (this.D && i43 >= this.K) {
                                                break;
                                            }
                                            i14 = i43;
                                        }
                                    } else if (i40 == 26) {
                                        while (i12 <= getMeasuredHeight()) {
                                            int L26 = org.telegram.messenger.g0.L(21.0f) >> 1;
                                            if (org.telegram.messenger.hd.f22871a0) {
                                                L7 = org.telegram.messenger.k5.z(21.0f, getMeasuredWidth(), L26);
                                            } else {
                                                L7 = org.telegram.messenger.g0.L(21.0f) + L26;
                                            }
                                            canvas2.drawCircle(L7, org.telegram.messenger.k5.C(16.0f, i12, L26), L26, paint6);
                                            rectF.set(org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(21.0f) + i12, org.telegram.messenger.g0.L(190.0f), org.telegram.messenger.g0.L(29.0f) + i12);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(21.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(29.0f) + i12);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                            int i44 = i14 + 1;
                                            if (this.D && i44 >= this.K) {
                                                break;
                                            }
                                            i14 = i44;
                                        }
                                    } else if (getViewType() == 28) {
                                        while (i12 <= getMeasuredHeight()) {
                                            canvas2.drawCircle(a(org.telegram.messenger.k5.C(10.0f, this.G, L6)), (org.telegram.messenger.g0.L(58.0f) >> 1) + i12, org.telegram.messenger.g0.L(24.0f), paint6);
                                            rectF.set(org.telegram.messenger.g0.L(68.0f) + this.G, org.telegram.messenger.g0.L(17.0f) + i12, org.telegram.messenger.g0.L(260.0f) + this.G, org.telegram.messenger.g0.L(25.0f) + i12);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            rectF.set(org.telegram.messenger.g0.L(68.0f) + this.G, org.telegram.messenger.g0.L(39.0f) + i12, org.telegram.messenger.g0.L(140.0f) + this.G, org.telegram.messenger.g0.L(47.0f) + i12);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            if (this.f35807x) {
                                                rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(20.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f) + i12);
                                                b(rectF);
                                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            }
                                            i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                            int i45 = i14 + 1;
                                            if (this.D && i45 >= this.K) {
                                                break;
                                            }
                                            i14 = i45;
                                        }
                                    } else if (getViewType() == 31) {
                                        while (i12 <= getMeasuredHeight()) {
                                            int c11 = c(getMeasuredWidth());
                                            float f21 = i12;
                                            rectF.set(org.telegram.messenger.g0.L(18.0f) + this.G, ((c11 - org.telegram.messenger.g0.L(22.0f)) / 2.0f) + f21, org.telegram.messenger.g0.L(40.0f) + this.G, ((org.telegram.messenger.g0.L(22.0f) + c11) / 2.0f) + f21);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), paint6);
                                            rectF.set(org.telegram.messenger.g0.L(58.0f) + this.G, ((c11 - org.telegram.messenger.g0.L(8.0f)) / 2.0f) + f21, org.telegram.messenger.camera.q.C(19.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(132.0f) + this.G), ((org.telegram.messenger.g0.L(8.0f) + c11) / 2.0f) + f21);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            i12 += c11;
                                            int i46 = i14 + 1;
                                            if (this.D && i46 >= this.K) {
                                                break;
                                            }
                                            i14 = i46;
                                        }
                                    } else if (getViewType() == 32) {
                                        while (i12 <= getMeasuredHeight()) {
                                            int c12 = c(getMeasuredWidth());
                                            float f22 = i12;
                                            rectF.set(org.telegram.messenger.g0.L(10.0f) + this.G, ((c12 - org.telegram.messenger.g0.L(32.0f)) / 2.0f) + f22, org.telegram.messenger.g0.L(42.0f) + this.G, ((org.telegram.messenger.g0.L(32.0f) + c12) / 2.0f) + f22);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint6);
                                            rectF.set(org.telegram.messenger.g0.L(64.0f) + this.G, (((c12 - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(10.0f)) / 2.0f) + f22, org.telegram.messenger.camera.q.C(19.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(118.0f) + this.G), ((org.telegram.messenger.g0.L(10.0f) + (c12 - org.telegram.messenger.g0.L(14.0f))) / 2.0f) + f22);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            rectF.set(org.telegram.messenger.g0.L(64.0f) + this.G, (((org.telegram.messenger.g0.L(14.0f) + c12) - org.telegram.messenger.g0.L(8.0f)) / 2.0f) + f22, org.telegram.messenger.camera.q.C(19.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(144.0f) + this.G), ((org.telegram.messenger.g0.L(8.0f) + (org.telegram.messenger.g0.L(14.0f) + c12)) / 2.0f) + f22);
                                            b(rectF);
                                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                                            i12 += c12;
                                            int i47 = i14 + 1;
                                            if (this.D && i47 >= this.K) {
                                                break;
                                            }
                                            i14 = i47;
                                        }
                                    } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                                        rectF.set(this.G, this.F, getMeasuredWidth() - this.G, getMeasuredHeight() - this.F);
                                        rectF.inset(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
                                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), paint6);
                                    }
                                } else {
                                    int i48 = 0;
                                    while (i12 <= getMeasuredHeight()) {
                                        canvas2.drawCircle(a(org.telegram.messenger.k5.C(8.0f, this.G, L4)), org.telegram.messenger.g0.L(24.0f) + i12, org.telegram.messenger.g0.L(18.0f), paint6);
                                        rectF.set(org.telegram.messenger.g0.L(58.0f) + this.G, org.telegram.messenger.g0.L(20.0f) + i12, getWidth() - org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(28.0f) + i12);
                                        b(rectF);
                                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint6);
                                        if (i48 < 4) {
                                            canvas2.drawCircle(a(org.telegram.messenger.k5.z(12.0f, getWidth(), L5)), org.telegram.messenger.g0.L(24.0f) + i12, org.telegram.messenger.g0.L(12.0f), paint6);
                                        }
                                        i12 = org.telegram.ui.Cells.f1.g(this, i12);
                                        i48++;
                                        if (this.D && i48 >= this.K) {
                                            break;
                                        }
                                    }
                                    rectF.set(org.telegram.messenger.g0.L(8.0f) + this.G, org.telegram.messenger.g0.L(20.0f) + i12, getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(28.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint6);
                                    rectF.set(org.telegram.messenger.g0.L(8.0f) + this.G, org.telegram.messenger.g0.L(36.0f) + i12, getWidth() - org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(44.0f) + i12);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint6);
                                }
                            } else {
                                int L27 = org.telegram.messenger.g0.L(12.0f);
                                int L28 = org.telegram.messenger.g0.L(77.0f);
                                int L29 = org.telegram.messenger.g0.L(4.0f);
                                float L30 = org.telegram.messenger.g0.L(21.0f);
                                float L31 = org.telegram.messenger.g0.L(41.0f);
                                while (L27 < getMeasuredWidth()) {
                                    if (this.N == null) {
                                        this.N = new Paint(i15);
                                    }
                                    this.N.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.L));
                                    RectF rectF4 = org.telegram.messenger.g0.P;
                                    int i49 = L27 + L28;
                                    int i50 = i15;
                                    float f23 = f15;
                                    rectF4.set(org.telegram.messenger.g0.L(4.0f) + L27, org.telegram.messenger.g0.L(4.0f), i49 - org.telegram.messenger.g0.L(4.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f));
                                    canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.L(f23), org.telegram.messenger.g0.L(f23), paint6);
                                    if (getViewType() == 14) {
                                        float L32 = org.telegram.messenger.g0.L(8.0f) + L29;
                                        float f24 = L27;
                                        float L33 = org.telegram.messenger.g0.L(22.0f) + L29 + f24;
                                        rectF.set(L33, L32, L33 + L31, L32 + L30);
                                        canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.N);
                                        float L34 = org.telegram.messenger.g0.L(4.0f) + L30 + L32;
                                        float L35 = f24 + org.telegram.messenger.g0.L(5.0f) + L29;
                                        rectF.set(L35, L34, L35 + L31, L34 + L30);
                                        canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.N);
                                    } else if (getViewType() == 17) {
                                        float L36 = org.telegram.messenger.g0.L(5.0f);
                                        float L37 = org.telegram.messenger.g0.L(32.0f);
                                        f13 = f19;
                                        float A = com.google.android.recaptcha.internal.a.A(L28, L37, f17, L27);
                                        rectF4.set(A, org.telegram.messenger.g0.L(f13), L37 + A, org.telegram.messenger.g0.L(32.0f) + L3);
                                        canvas2.drawRoundRect(rectF4, L36, L36, this.N);
                                        canvas2.drawCircle((L28 / 2) + L27, getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(8.0f), this.N);
                                        L27 = i49;
                                        f19 = f13;
                                        i15 = i50;
                                        f15 = f23;
                                        f17 = 2.0f;
                                    }
                                    f13 = f19;
                                    canvas2.drawCircle((L28 / 2) + L27, getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(8.0f), this.N);
                                    L27 = i49;
                                    f19 = f13;
                                    i15 = i50;
                                    f15 = f23;
                                    f17 = 2.0f;
                                }
                            }
                        }
                    } else {
                        while (i12 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.k5.C(9.0f, this.G, L2)), (org.telegram.messenger.g0.L(64.0f) >> 1) + i12, org.telegram.messenger.g0.L(23.0f), paint6);
                            rectF.set(org.telegram.messenger.g0.L(68.0f) + this.G, org.telegram.messenger.g0.L(17.0f) + i12, org.telegram.messenger.g0.L(260.0f) + this.G, org.telegram.messenger.g0.L(25.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                            rectF.set(org.telegram.messenger.g0.L(68.0f) + this.G, org.telegram.messenger.g0.L(39.0f) + i12, org.telegram.messenger.g0.L(140.0f) + this.G, org.telegram.messenger.g0.L(47.0f) + i12);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                            if (this.f35807x) {
                                rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(20.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f) + i12);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                            }
                            i12 = org.telegram.ui.Cells.f1.g(this, i12);
                            int i51 = i14 + 1;
                            if (this.D && i51 >= this.K) {
                                break;
                            }
                            i14 = i51;
                        }
                    }
                }
            } else {
                if (getViewType() == 37) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int c13 = c(getMeasuredWidth());
                while (i12 <= getMeasuredHeight()) {
                    if (z9) {
                        canvas2.drawCircle(org.telegram.messenger.g0.L(36.0f) + this.G, org.telegram.messenger.g0.L(35.0f) + i12, org.telegram.messenger.g0.L(23.0f), paint6);
                    } else {
                        rectF.set(org.telegram.messenger.g0.L(15.0f) + this.G, org.telegram.messenger.g0.L(6.0f) + i12, org.telegram.messenger.g0.L(61.0f) + this.G, org.telegram.messenger.g0.L(52.0f) + i12);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint6);
                    }
                    float L38 = org.telegram.messenger.g0.L(71.0f) + this.G;
                    int measuredWidth5 = getMeasuredWidth();
                    if (z9) {
                        f10 = 76.0f;
                    } else {
                        f10 = 20.0f;
                    }
                    float max = Math.max(L38, measuredWidth5 - org.telegram.messenger.g0.L(f10));
                    rectF.set(L38, org.telegram.messenger.g0.L(14.0f) + i12, Math.min(org.telegram.messenger.g0.L(100.0f) + L38, max), org.telegram.messenger.g0.L(22.0f) + i12);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                    if (z9) {
                        f11 = 33.0f;
                    } else {
                        f11 = 36.0f;
                    }
                    float L39 = org.telegram.messenger.g0.L(f11) + i12;
                    float min = Math.min(org.telegram.messenger.g0.L(140.0f) + L38, max);
                    if (z9) {
                        f12 = 41.0f;
                    } else {
                        f12 = 44.0f;
                    }
                    rectF.set(L38, L39, min, org.telegram.messenger.g0.L(f12) + i12);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                    if (z9) {
                        rectF.set(L38, org.telegram.messenger.g0.L(51.0f) + i12, Math.min(org.telegram.messenger.g0.L(80.0f) + L38, max), org.telegram.messenger.g0.L(59.0f) + i12);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        if (getMeasuredWidth() - org.telegram.messenger.g0.L(68.0f) >= L38) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(15.0f) + i12, getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(23.0f) + i12);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint6);
                        }
                    }
                    i12 += c13;
                    int i52 = i14 + 1;
                    if (this.D && i52 >= this.K) {
                        break;
                    }
                    i14 = i52;
                }
            }
        }
        invalidate();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        if (this.D) {
            int i11 = this.K;
            if (i11 > 1 && this.S) {
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i7)) * this.K), 1073741824));
                return;
            } else if (i11 > 1 && View.MeasureSpec.getSize(i10) > 0) {
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i10), c(View.MeasureSpec.getSize(i7)) * this.K), 1073741824));
                return;
            } else {
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i7)), 1073741824));
                return;
            }
        }
        super.onMeasure(i7, i10);
    }

    public void setGlobalGradientView(lz lzVar) {
        this.R = lzVar;
    }

    public void setIgnoreHeightCheck(boolean z9) {
        this.S = z9;
    }

    public void setIsSingleCell(boolean z9) {
        this.D = z9;
    }

    public void setItemsCount(int i7) {
        this.K = i7;
    }

    public void setMemberRequestButton(boolean z9) {
        int i7;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        float L = org.telegram.messenger.g0.L(34.0f);
        if (z9) {
            i7 = 2131754378;
        } else {
            i7 = 2131754373;
        }
        this.T = textPaint.measureText(org.telegram.messenger.hd.M0(i7, null)) + L;
    }

    public void setPaddingLeft(int i7) {
        this.G = i7;
        invalidate();
    }

    public void setPaddingTop(int i7) {
        this.F = i7;
        invalidate();
    }

    public void setUseHeaderOffset(boolean z9) {
        this.f35808y = z9;
    }

    public void setViewType(int i7) {
        this.E = i7;
        if (i7 == 11) {
            Random random = new Random();
            this.M = new float[2];
            for (int i10 = 0; i10 < 2; i10++) {
                this.M[i10] = Math.abs(random.nextInt() % 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        int i7;
        lz lzVar = this.R;
        if (lzVar != null) {
            lzVar.updateColors();
            return;
        }
        int i10 = this.H;
        org.telegram.ui.ActionBar.f6 f6Var = this.L;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(this.I, f6Var);
        if (this.f35805s == w03 && this.f35804r == w02) {
            return;
        }
        this.f35804r = w02;
        this.f35805s = w03;
        int i11 = this.E;
        if (i11 != 34 && i11 != 35 && i11 != 36) {
            if (!this.D && i11 != 13 && i11 != 14 && i11 != 17) {
                this.f35798a = org.telegram.messenger.g0.L(600.0f);
            } else {
                this.f35798a = org.telegram.messenger.g0.L(200.0f);
            }
        } else {
            this.f35798a = org.telegram.messenger.g0.f22537q.x;
        }
        if (!this.D && (i7 = this.E) != 13 && i7 != 14 && i7 != 17) {
            this.f35799b = new LinearGradient(0.0f, 0.0f, 0.0f, this.f35798a, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.f35799b = new LinearGradient(0.0f, 0.0f, this.f35798a, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f35800c.setShader(this.f35799b);
    }

    public lz(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f35800c = new Paint();
        this.d = new Paint();
        this.f35803n = new RectF();
        this.f35807x = true;
        this.H = org.telegram.ui.ActionBar.k6.G8;
        this.I = org.telegram.ui.ActionBar.k6.f27940i6;
        this.J = -1;
        this.K = 1;
        this.L = f6Var;
        this.h = new Matrix();
    }
}
