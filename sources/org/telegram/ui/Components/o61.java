package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class o61 {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final y5 D;
    public float E;
    public ArrayList F;
    public CharSequence G;
    public long H;
    public StaticLayout[] K;
    public TextPaint L;
    public int N;
    public long O;

    public float f31177a;
    public int h;

    public int f31183i;

    public n61 f31184j;

    public int f31185k;

    public int f31186l;

    public int f31187m;

    public int f31188n;

    public float f31190p;

    public boolean f31191q;

    public float f31193s;

    public float f31194t;

    public long f31195u;
    public final View v;

    public float f31198y;

    public int f31199z;

    public int f31178b = 0;

    public float f31179c = 0.0f;
    public int d = 0;

    public int f31180e = 0;

    public boolean f31181f = false;

    public boolean f31182g = false;

    public final RectF f31189o = new RectF();

    public float f31192r = 1.0f;

    public final int f31196w = AndroidUtilities.dp(4.0f);

    public final int f31197x = AndroidUtilities.dp(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public o61(View view) {
        if (Q == null) {
            Q = new Paint(1);
            Paint paint = new Paint(1);
            R = paint;
            paint.setStyle(Paint.Style.STROKE);
            R.setColor(-16777216);
            R.setStrokeWidth(1.0f);
        }
        this.v = view;
        S = AndroidUtilities.dp(24.0f);
        this.f31194t = AndroidUtilities.dp(6.0f);
        this.D = new y5(0.0f, view, 0L, 300L, er.h);
    }

    public static void g(float f10, int i10) {
        if (f10 < 1.0f) {
            i10 = i0.b.k(i10, (int) (Color.alpha(i10) * f10));
        }
        Q.setColor(i10);
    }

    public final void a(Canvas canvas, View view) {
        float f10;
        View view2;
        char c10;
        float f11;
        float f12;
        float f13;
        float f14;
        char c11;
        CharSequence charSequence;
        float fLerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, this.f31198y) + this.f31199z;
        RectF rectF = this.f31189o;
        rectF.left = fLerp;
        int i10 = this.f31183i;
        int i11 = this.f31196w;
        rectF.top = AndroidUtilities.lerp((i10 - i11) / 2.0f, (i10 - AndroidUtilities.dp(3.0f)) - this.f31197x, this.f31198y);
        int i12 = this.f31183i;
        rectF.bottom = AndroidUtilities.lerp((i12 + i11) / 2.0f, i12 - AndroidUtilities.dp(3.0f), this.f31198y);
        float f15 = this.f31178b;
        float fMin = Math.min(this.f31179c, f15);
        this.f31179c = fMin;
        float fLerp2 = AndroidUtilities.lerp(fMin, f15, 0.5f);
        this.f31179c = fLerp2;
        float fAbs = Math.abs(f15 - fLerp2);
        View view3 = this.v;
        if (fAbs > 0.005f) {
            view3.invalidate();
        }
        float f16 = this.f31179c;
        float f17 = this.C;
        if (f17 != 1.0f) {
            float f18 = f17 + 0.07272727f;
            this.C = f18;
            if (f18 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = er.f28122f.getInterpolation(this.C);
                f16 = (f16 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float fD = this.D.d(0.0f, false);
        if (this.f31181f) {
            fD = 0.0f;
        }
        rectF.right = AndroidUtilities.lerp(this.h - (S / 2.0f), view3.getWidth() - (this.f31199z * 2.0f), this.f31198y) + this.f31199z;
        g(1.0f - this.f31198y, this.f31185k);
        b(canvas, rectF, Q);
        float f19 = this.f31192r;
        if (f19 != 1.0f) {
            float f20 = f19 + 0.16f;
            this.f31192r = f20;
            if (f20 > 1.0f) {
                this.f31192r = 1.0f;
            } else {
                view3.invalidate();
            }
        }
        if (this.f31191q) {
            float f21 = this.f31190p;
            if (f21 > 0.0f) {
                float f22 = this.f31199z;
                int i13 = S;
                f10 = 2.0f;
                rectF.right = AndroidUtilities.lerp((f21 * (this.h - i13)) + (i13 / 2.0f), view3.getWidth() - (this.f31199z * 2.0f), this.f31198y) + f22;
                g((1.0f - this.f31192r) * (1.0f - this.f31198y), this.f31186l);
                b(canvas, rectF, Q);
            } else {
                f10 = 2.0f;
            }
            float f23 = this.f31193s;
            if (f23 > 0.0f) {
                float f24 = this.f31199z;
                int i14 = S;
                rectF.right = AndroidUtilities.lerp((f23 * (this.h - i14)) + (i14 / f10), view3.getWidth() - (this.f31199z * f10), this.f31198y) + f24;
                g(1.0f - this.f31198y, this.f31186l);
                b(canvas, rectF, Q);
            }
        } else {
            f10 = 2.0f;
            float f25 = this.f31190p;
            float f26 = this.f31192r;
            float f27 = (this.f31193s * f26) + ((1.0f - f26) * f25);
            if (f27 > 0.0f) {
                float f28 = this.f31199z;
                int i15 = S;
                rectF.right = AndroidUtilities.lerp((f27 * (this.h - i15)) + (i15 / 2.0f), view3.getWidth() - (this.f31199z * 2.0f), this.f31198y) + f28;
                g(1.0f - this.f31198y, this.f31186l);
                b(canvas, rectF, Q);
            }
        }
        float fDp = AndroidUtilities.dp(this.f31181f ? 8.0f : 6.0f);
        if (this.f31194t != fDp) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            view2 = view3;
            long j10 = jElapsedRealtime - this.f31195u;
            this.f31195u = jElapsedRealtime;
            if (j10 > 18) {
                j10 = 16;
            }
            float f29 = this.f31194t;
            if (f29 < fDp) {
                c10 = 0;
                float fC = s3.c.c(j10, 60.0f, AndroidUtilities.dp(1.0f), f29);
                this.f31194t = fC;
                if (fC > fDp) {
                    this.f31194t = fDp;
                }
            } else {
                c10 = 0;
                float fC2 = org.telegram.messenger.rl.c(j10, 60.0f, AndroidUtilities.dp(1.0f), f29);
                this.f31194t = fC2;
                if (fC2 < fDp) {
                    this.f31194t = fDp;
                }
            }
            view2.invalidate();
        } else {
            view2 = view3;
            c10 = 0;
        }
        float fLerp3 = AndroidUtilities.lerp(this.f31194t, 0.0f, this.f31198y);
        if (fD > 0.0f) {
            float f30 = rectF.left;
            float f31 = this.f31199z;
            int i16 = S;
            f11 = 0.2f;
            f12 = 8.0f;
            float fLerp4 = AndroidUtilities.lerp((i16 / f10) + (this.h - i16), view2.getWidth() - (this.f31199z * f10), this.f31198y) + f31;
            rectF.right = fLerp4;
            rectF.left = AndroidUtilities.lerp(f30, fLerp4, 1.0f - fD);
            if (this.f31198y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.f31198y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.b.d(this.f31198y, this.f31188n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f30;
            g(1.0f - this.f31198y, i0.b.d(this.f31198y, this.f31187m, c() == 0.0f ? 0 : this.A));
            canvas.drawCircle(AndroidUtilities.lerp((S / f10) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.f31199z * f10)), this.f31198y) + this.f31199z, rectF.centerY(), fLerp3 * fD, Q);
        } else {
            f11 = 0.2f;
            f12 = 8.0f;
        }
        float f32 = this.f31199z;
        float f33 = S / f10;
        if (this.f31181f) {
            f16 = this.d;
        }
        rectF.right = AndroidUtilities.lerp(f33 + f16, c() * (view2.getWidth() - (this.f31199z * f10)), this.f31198y) + f32;
        if (this.f31198y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.f31198y * 255.0f * f11));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.b.d(this.f31198y, this.f31188n, this.A));
        b(canvas, rectF, Q);
        g(1.0f - this.f31198y, i0.b.d(this.f31198y, this.f31187m, c() == 0.0f ? 0 : this.A));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - fD) * fLerp3, Q);
        ArrayList arrayList = this.F;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f34 = ((this.f31181f || this.f31182g) ? this.d : this.f31179c) / (this.h - S);
        int size = this.F.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.F.get(size)).first).floatValue() - 0.001f <= f34) {
                break;
            } else {
                size--;
            }
        }
        if (this.K == null) {
            this.K = new StaticLayout[2];
        }
        float fLerp5 = AndroidUtilities.lerp(S / f10, 0.0f, this.f31198y) + this.f31199z;
        float fLerp6 = AndroidUtilities.lerp(this.h - (S / f10), view2.getWidth() - (this.f31199z * f10), this.f31198y) + this.f31199z;
        float f35 = (this.h - (S / f10)) + this.f31199z;
        float fAbs2 = Math.abs(fLerp5 - f35) - AndroidUtilities.dp(16.0f);
        float f36 = this.P;
        if (f36 <= 0.0f || Math.abs(f36 - fAbs2) <= 0.01f) {
            f13 = 3.0f;
            f14 = 16.0f;
        } else {
            StaticLayout[] staticLayoutArr = this.K;
            StaticLayout staticLayout = staticLayoutArr[c10];
            if (staticLayout != null) {
                f14 = 16.0f;
                CharSequence text = staticLayout.getText();
                f13 = 3.0f;
                staticLayoutArr[c10] = d((int) fAbs2, text);
            } else {
                f13 = 3.0f;
                f14 = 16.0f;
            }
            StaticLayout[] staticLayoutArr2 = this.K;
            StaticLayout staticLayout2 = staticLayoutArr2[1];
            if (staticLayout2 != null) {
                staticLayoutArr2[1] = d((int) fAbs2, staticLayout2.getText());
            }
        }
        this.P = fAbs2;
        if (size != this.J) {
            StaticLayout[] staticLayoutArr3 = this.K;
            staticLayoutArr3[1] = staticLayoutArr3[c10];
            if (this.f31181f) {
                AndroidUtilities.vibrateCursor(view2);
            }
            if (size < 0 || size >= this.F.size() || (charSequence = (CharSequence) ((Pair) this.F.get(size)).second) == null) {
                this.K[c10] = null;
            } else {
                this.K[c10] = d((int) fAbs2, charSequence);
            }
            this.M = 0.0f;
            if (size == -1) {
                this.N = -1;
            } else {
                int i17 = this.J;
                if (i17 == -1) {
                    this.N = 1;
                } else if (size < i17) {
                    this.N = -1;
                } else if (size > i17) {
                    this.N = 1;
                }
            }
            this.J = size;
        }
        if (this.M < 1.0f) {
            c11 = 1;
            this.M = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / (this.F.size() > 8 ? 160.0f : 220.0f)) + this.M, 1.0f);
            view2.invalidate();
            this.O = SystemClock.elapsedRealtime();
        } else {
            c11 = 1;
        }
        if (this.I < 1.0f) {
            this.I = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / 200.0f) + this.I, 1.0f);
            view2.invalidate();
            SystemClock.elapsedRealtime();
        }
        float interpolation2 = er.f28122f.getInterpolation(this.M);
        canvas.save();
        int i18 = this.f31183i;
        canvas.translate(((fLerp6 - f35) * this.f31198y) + fLerp5, AndroidUtilities.lerp((i18 + i11) / f10, i18 - AndroidUtilities.dp(f13), this.f31198y) + AndroidUtilities.dp(12.0f));
        if (this.K[c11] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate((AndroidUtilities.dp(f14) * (-this.N) * interpolation2) + AndroidUtilities.dp(f12), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[c11].getHeight()) / f10);
            this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.f31198y) * 255.0f * this.I));
            this.K[c11].draw(canvas);
            canvas.restore();
        }
        if (this.K[c10] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, interpolation2, AndroidUtilities.dp(f14) * this.N, AndroidUtilities.dp(f12)), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[c10].getHeight()) / f10);
            this.L.setAlpha((int) (org.telegram.messenger.y1.z(1.0f, this.f31198y, 255.0f, interpolation2) * this.I));
            this.K[c10].draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, Paint paint) {
        int size;
        char c10;
        float fFloatValue;
        char c11;
        o61 o61Var = this;
        float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(2, 1, o61Var.f31198y));
        ArrayList arrayList = o61Var.F;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, fDp, fDp, paint);
            return;
        }
        float f10 = rectF.bottom;
        float fLerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, o61Var.f31198y) + o61Var.f31199z;
        float fLerp2 = AndroidUtilities.lerp(o61Var.h - (S / 2.0f), o61Var.v.getWidth() - (o61Var.f31199z * 2.0f), o61Var.f31198y) + o61Var.f31199z;
        AndroidUtilities.rectTmp.set(rectF);
        float fDp2 = AndroidUtilities.dp(o61Var.I * 1.0f) / 2.0f;
        if (U == null) {
            U = new Path();
        }
        U.reset();
        float fDp3 = AndroidUtilities.dp(4.0f) / (fLerp2 - fLerp);
        int i10 = 0;
        while (true) {
            size = -1;
            if (i10 >= o61Var.F.size()) {
                i10 = -1;
                break;
            } else if (((Float) ((Pair) o61Var.F.get(i10)).first).floatValue() >= fDp3) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            i10 = 0;
        }
        for (int size2 = o61Var.F.size() - 1; size2 >= 0; size2--) {
            if (1.0f - ((Float) ((Pair) o61Var.F.get(size2)).first).floatValue() >= fDp3) {
                size = size2 + 1;
                break;
            }
        }
        if (size < 0) {
            size = o61Var.F.size();
        }
        int i11 = size;
        int i12 = i10;
        while (i12 <= i11) {
            if (i12 == i10) {
                fFloatValue = 0.0f;
                c10 = 1;
            } else {
                c10 = 1;
                fFloatValue = ((Float) ((Pair) o61Var.F.get(i12 - 1)).first).floatValue();
            }
            float fFloatValue2 = i12 == i11 ? 1.0f : ((Float) ((Pair) o61Var.F.get(i12)).first).floatValue();
            while (i12 != i11 && i12 != 0 && i12 < o61Var.F.size() - 1 && ((Float) ((Pair) o61Var.F.get(i12)).first).floatValue() - fFloatValue <= fDp3) {
                i12++;
                fFloatValue2 = ((Float) ((Pair) o61Var.F.get(i12)).first).floatValue();
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(fLerp, fLerp2, fFloatValue) + (i12 > 0 ? fDp2 : 0.0f);
            float fLerp3 = AndroidUtilities.lerp(fLerp, fLerp2, fFloatValue2) - (i12 < i11 ? fDp2 : 0.0f);
            rectF2.right = fLerp3;
            float f11 = rectF.right;
            boolean z10 = fLerp3 > f11;
            if (z10) {
                rectF2.right = f11;
            }
            float f12 = rectF2.right;
            float f13 = rectF.left;
            if (f12 >= f13) {
                if (rectF2.left < f13) {
                    rectF2.left = f13;
                }
                if (T == null) {
                    T = new float[8];
                }
                if (i12 != i10) {
                    if (z10) {
                        c11 = 4;
                        if (rectF2.left >= rectF.left) {
                        }
                        U.addRoundRect(rectF2, T, Path.Direction.CW);
                        if (z10) {
                            break;
                        }
                    } else {
                        c11 = 4;
                    }
                    if (i12 >= i11) {
                        float[] fArr = T;
                        float f14 = 0.7f * fDp * o61Var.I;
                        fArr[7] = f14;
                        fArr[6] = f14;
                        fArr[c10] = f14;
                        fArr[0] = f14;
                        fArr[5] = fDp;
                        fArr[c11] = fDp;
                        fArr[3] = fDp;
                        fArr[2] = fDp;
                    } else {
                        float[] fArr2 = T;
                        float f15 = 0.7f * fDp * o61Var.I;
                        fArr2[5] = f15;
                        fArr2[c11] = f15;
                        fArr2[3] = f15;
                        fArr2[2] = f15;
                        fArr2[7] = f15;
                        fArr2[6] = f15;
                        fArr2[c10] = f15;
                        fArr2[0] = f15;
                    }
                    U.addRoundRect(rectF2, T, Path.Direction.CW);
                    if (z10) {
                        break;
                        break;
                    }
                } else {
                    c11 = 4;
                }
                float[] fArr3 = T;
                fArr3[7] = fDp;
                fArr3[6] = fDp;
                fArr3[c10] = fDp;
                fArr3[0] = fDp;
                float f16 = 0.7f * fDp * o61Var.I;
                fArr3[5] = f16;
                fArr3[c11] = f16;
                fArr3[3] = f16;
                fArr3[2] = f16;
                U.addRoundRect(rectF2, T, Path.Direction.CW);
                if (z10) {
                    break;
                    break;
                }
            }
            i12++;
            o61Var = this;
        }
        canvas.drawPath(U, paint);
    }

    public final float c() {
        return this.f31178b / (this.h - S);
    }

    public final StaticLayout d(int i10, CharSequence charSequence) {
        if (this.L == null) {
            TextPaint textPaint = new TextPaint(1);
            this.L = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.L.setColor(-1);
        }
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.L, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.L, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i10));
    }

    public final boolean e(float f10, float f11, int i10) {
        n61 n61Var;
        if (i10 == 0) {
            if (this.f31198y <= 0.0f) {
                int i11 = this.f31183i;
                int i12 = S;
                int i13 = (i11 - i12) / 2;
                if (f10 >= (-i13)) {
                    int i14 = this.h;
                    if (f10 <= i14 + i13 && f11 >= 0.0f && f11 <= i11) {
                        int i15 = this.f31178b;
                        if (i15 - i13 > f10 || f10 > i15 + i12 + i13) {
                            int i16 = ((int) f10) - (i12 / 2);
                            this.f31178b = i16;
                            if (i16 < 0) {
                                this.f31178b = 0;
                            } else if (i16 > i14 - i12) {
                                this.f31178b = i12 - i14;
                            }
                            this.f31179c = this.f31178b;
                        }
                        this.f31182g = true;
                        this.f31181f = true;
                        int i17 = this.f31178b;
                        this.d = i17;
                        this.f31180e = (int) (f10 - i17);
                        return true;
                    }
                }
            }
        } else if (i10 == 1 || i10 == 3) {
            if (this.f31181f) {
                int i18 = this.d;
                this.f31178b = i18;
                float f12 = i18;
                this.f31179c = f12;
                if (i10 == 1 && (n61Var = this.f31184j) != null) {
                    n61Var.b(f12 / (this.h - S));
                }
                this.f31181f = false;
                AndroidUtilities.runOnUIThread(new d61(this, 2), 50L);
                return true;
            }
        } else if (i10 == 2 && this.f31181f) {
            int i19 = (int) (f10 - this.f31180e);
            this.d = i19;
            if (i19 < 0) {
                this.d = 0;
            } else {
                int i20 = this.h - S;
                if (i19 > i20) {
                    this.d = i20;
                }
            }
            n61 n61Var2 = this.f31184j;
            if (n61Var2 != null) {
                n61Var2.e(this.d / (this.h - S));
            }
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        float f11 = this.f31193s;
        if (f10 != f11) {
            this.f31190p = f11;
            this.f31191q = f10 < f11;
            this.f31193s = f10;
            this.f31192r = 0.0f;
        }
    }

    public final void h(float f10, boolean z10) {
        if (Math.abs(this.f31177a - 1.0f) < 0.04f && Math.abs(f10) < 0.04f) {
            this.D.d(1.0f, true);
            this.E = this.f31178b;
        }
        this.f31177a = f10;
        int iCeil = (int) Math.ceil((this.h - S) * f10);
        if (z10) {
            if (Math.abs(iCeil - this.f31178b) > AndroidUtilities.dp(10.0f)) {
                float interpolation = er.f28122f.getInterpolation(this.C);
                this.B = (int) com.google.android.recaptcha.internal.a.z(1.0f, interpolation, this.B, this.f31178b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.f31178b;
            }
        }
        this.f31178b = iCeil;
        if (iCeil < 0) {
            this.f31178b = 0;
        } else {
            int i10 = this.h - S;
            if (iCeil > i10) {
                this.f31178b = i10;
            }
        }
        if (Math.abs(this.f31179c - this.f31178b) > AndroidUtilities.dp(8.0f)) {
            this.f31179c = this.f31178b;
        }
    }
}
