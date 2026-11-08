package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class v51 {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final w5 D;
    public float E;
    public ArrayList F;
    public CharSequence G;
    public long H;
    public StaticLayout[] K;
    public TextPaint L;
    public int N;
    public long O;
    public float f38896a;
    public int h;
    public int f38902i;
    public u51 f38903j;
    public int f38904k;
    public int f38905l;
    public int f38906m;
    public int f38907n;
    public float f38909p;
    public boolean f38910q;
    public float f38912s;
    public float f38913t;
    public long f38914u;
    public final View v;
    public float f38917y;
    public int f38918z;
    public int f38897b = 0;
    public float f38898c = 0.0f;
    public int d = 0;
    public int f38899e = 0;
    public boolean f38900f = false;
    public boolean f38901g = false;
    public final RectF f38908o = new RectF();
    public float f38911r = 1.0f;
    public final int f38915w = org.telegram.messenger.g0.L(4.0f);
    public final int f38916x = org.telegram.messenger.g0.L(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public v51(View view) {
        if (Q == null) {
            Q = new Paint(1);
            Paint paint = new Paint(1);
            R = paint;
            paint.setStyle(Paint.Style.STROKE);
            R.setColor(-16777216);
            R.setStrokeWidth(1.0f);
        }
        this.v = view;
        S = org.telegram.messenger.g0.L(24.0f);
        this.f38913t = org.telegram.messenger.g0.L(6.0f);
        this.D = new w5(0.0f, view, 0L, 300L, xq.h);
    }

    public static void g(float f10, int i7) {
        if (f10 < 1.0f) {
            i7 = i0.a.o(i7, (int) (Color.alpha(i7) * f10));
        }
        Q.setColor(i7);
    }

    public final void a(Canvas canvas, View view) {
        float f10;
        int i7;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        int i11;
        float f16;
        float f17;
        float f18;
        char c10;
        int i12;
        float f19;
        int i13;
        int i14;
        int i15;
        int i16;
        float T1 = org.telegram.messenger.g0.T1(S / 2.0f, 0.0f, this.f38917y) + this.f38918z;
        RectF rectF = this.f38908o;
        rectF.left = T1;
        int i17 = this.f38902i;
        int i18 = this.f38915w;
        rectF.top = org.telegram.messenger.g0.T1((i17 - i18) / 2.0f, (i17 - org.telegram.messenger.g0.L(3.0f)) - this.f38916x, this.f38917y);
        int i19 = this.f38902i;
        rectF.bottom = org.telegram.messenger.g0.T1((i19 + i18) / 2.0f, i19 - org.telegram.messenger.g0.L(3.0f), this.f38917y);
        float f20 = this.f38897b;
        float min = Math.min(this.f38898c, f20);
        this.f38898c = min;
        float T12 = org.telegram.messenger.g0.T1(min, f20, 0.5f);
        this.f38898c = T12;
        int i20 = (Math.abs(f20 - T12) > 0.005f ? 1 : (Math.abs(f20 - T12) == 0.005f ? 0 : -1));
        View view2 = this.v;
        if (i20 > 0) {
            view2.invalidate();
        }
        float f21 = this.f38898c;
        float f22 = this.C;
        if (f22 != 1.0f) {
            float f23 = f22 + 0.07272727f;
            this.C = f23;
            if (f23 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = xq.f40366f.getInterpolation(this.C);
                f21 = (f21 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float e10 = this.D.e(false, 0.0f);
        if (this.f38900f) {
            e10 = 0.0f;
        }
        rectF.right = org.telegram.messenger.g0.T1(this.h - (S / 2.0f), view2.getWidth() - (this.f38918z * 2.0f), this.f38917y) + this.f38918z;
        g(1.0f - this.f38917y, this.f38904k);
        b(canvas, rectF, Q);
        float f24 = this.f38911r;
        if (f24 != 1.0f) {
            float f25 = f24 + 0.16f;
            this.f38911r = f25;
            if (f25 > 1.0f) {
                this.f38911r = 1.0f;
            } else {
                view2.invalidate();
            }
        }
        if (this.f38910q) {
            float f26 = this.f38909p;
            if (f26 > 0.0f) {
                f10 = 2.0f;
                rectF.right = org.telegram.messenger.g0.T1((f26 * (this.h - i16)) + (S / 2.0f), view2.getWidth() - (this.f38918z * 2.0f), this.f38917y) + this.f38918z;
                g((1.0f - this.f38911r) * (1.0f - this.f38917y), this.f38905l);
                b(canvas, rectF, Q);
            } else {
                f10 = 2.0f;
            }
            float f27 = this.f38912s;
            if (f27 > 0.0f) {
                rectF.right = org.telegram.messenger.g0.T1((f27 * (this.h - i15)) + (S / f10), view2.getWidth() - (this.f38918z * f10), this.f38917y) + this.f38918z;
                g(1.0f - this.f38917y, this.f38905l);
                b(canvas, rectF, Q);
            }
        } else {
            f10 = 2.0f;
            float f28 = this.f38909p;
            float f29 = this.f38911r;
            float f30 = (this.f38912s * f29) + ((1.0f - f29) * f28);
            if (f30 > 0.0f) {
                rectF.right = org.telegram.messenger.g0.T1((f30 * (this.h - i7)) + (S / 2.0f), view2.getWidth() - (this.f38918z * 2.0f), this.f38917y) + this.f38918z;
                g(1.0f - this.f38917y, this.f38905l);
                b(canvas, rectF, Q);
            }
        }
        if (this.f38900f) {
            f11 = 8.0f;
        } else {
            f11 = 6.0f;
        }
        float L = org.telegram.messenger.g0.L(f11);
        if (this.f38913t != L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f12 = 3.0f;
            f13 = e10;
            long j3 = elapsedRealtime - this.f38914u;
            this.f38914u = elapsedRealtime;
            if (j3 > 18) {
                j3 = 16;
            }
            float f31 = this.f38913t;
            i10 = 0;
            if (f31 < L) {
                float c11 = com.google.android.recaptcha.internal.a.c((float) j3, 60.0f, org.telegram.messenger.g0.L(1.0f), f31);
                this.f38913t = c11;
                if (c11 > L) {
                    this.f38913t = L;
                }
            } else {
                float v = org.telegram.messenger.camera.q.v((float) j3, 60.0f, org.telegram.messenger.g0.L(1.0f), f31);
                this.f38913t = v;
                if (v < L) {
                    this.f38913t = L;
                }
            }
            view2.invalidate();
        } else {
            f12 = 3.0f;
            f13 = e10;
            i10 = 0;
        }
        float T13 = org.telegram.messenger.g0.T1(this.f38913t, 0.0f, this.f38917y);
        if (f13 > 0.0f) {
            float f32 = rectF.left;
            f14 = 0.2f;
            f15 = 8.0f;
            float T14 = org.telegram.messenger.g0.T1((S / f10) + (this.h - i13), view2.getWidth() - (this.f38918z * f10), this.f38917y) + this.f38918z;
            rectF.right = T14;
            rectF.left = org.telegram.messenger.g0.T1(f32, T14, 1.0f - f13);
            if (this.f38917y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.f38917y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.a.f(this.f38917y, this.f38907n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f32;
            int i21 = this.f38906m;
            if (c() == 0.0f) {
                i14 = i10;
            } else {
                i14 = this.A;
            }
            g(1.0f - this.f38917y, i0.a.f(this.f38917y, i21, i14));
            canvas.drawCircle(org.telegram.messenger.g0.T1((S / f10) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.f38918z * f10)), this.f38917y) + this.f38918z, rectF.centerY(), T13 * f13, Q);
        } else {
            f14 = 0.2f;
            f15 = 8.0f;
        }
        float f33 = this.f38918z;
        float f34 = S / f10;
        if (this.f38900f) {
            f21 = this.d;
        }
        rectF.right = org.telegram.messenger.g0.T1(f34 + f21, c() * (view2.getWidth() - (this.f38918z * f10)), this.f38917y) + f33;
        if (this.f38917y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.f38917y * 255.0f * f14));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.a.f(this.f38917y, this.f38907n, this.A));
        b(canvas, rectF, Q);
        int i22 = this.f38906m;
        if (c() == 0.0f) {
            i11 = i10;
        } else {
            i11 = this.A;
        }
        g(1.0f - this.f38917y, i0.a.f(this.f38917y, i22, i11));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - f13) * T13, Q);
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!this.f38900f && !this.f38901g) {
                f16 = this.f38898c;
            } else {
                f16 = this.d;
            }
            float f35 = f16 / (this.h - S);
            int size = this.F.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((Float) ((Pair) this.F.get(size)).first).floatValue() - 0.001f <= f35) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (this.K == null) {
                this.K = new StaticLayout[2];
            }
            float T15 = org.telegram.messenger.g0.T1(S / f10, 0.0f, this.f38917y) + this.f38918z;
            float T16 = org.telegram.messenger.g0.T1(this.h - (S / f10), view2.getWidth() - (this.f38918z * f10), this.f38917y) + this.f38918z;
            float f36 = (this.h - (S / f10)) + this.f38918z;
            float abs = Math.abs(T15 - f36) - org.telegram.messenger.g0.L(16.0f);
            float f37 = this.P;
            if (f37 > 0.0f && Math.abs(f37 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.K;
                StaticLayout staticLayout = staticLayoutArr[i10];
                if (staticLayout != null) {
                    f18 = f12;
                    CharSequence text = staticLayout.getText();
                    f17 = 255.0f;
                    staticLayoutArr[i10] = d((int) abs, text);
                } else {
                    f17 = 255.0f;
                    f18 = f12;
                }
                StaticLayout[] staticLayoutArr2 = this.K;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = d((int) abs, staticLayout2.getText());
                }
            } else {
                f17 = 255.0f;
                f18 = f12;
            }
            this.P = abs;
            if (size != this.J) {
                StaticLayout[] staticLayoutArr3 = this.K;
                staticLayoutArr3[1] = staticLayoutArr3[i10];
                if (this.f38900f) {
                    org.telegram.messenger.g0.c4(view2);
                }
                if (size >= 0 && size < this.F.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.F.get(size)).second;
                    if (charSequence == null) {
                        this.K[i10] = null;
                    } else {
                        this.K[i10] = d((int) abs, charSequence);
                    }
                } else {
                    this.K[i10] = null;
                }
                this.M = 0.0f;
                if (size == -1) {
                    this.N = -1;
                } else {
                    int i23 = this.J;
                    if (i23 == -1) {
                        this.N = 1;
                    } else if (size < i23) {
                        this.N = -1;
                    } else if (size > i23) {
                        this.N = 1;
                    }
                }
                this.J = size;
            }
            if (this.M < 1.0f) {
                c10 = 1;
                i12 = i18;
                long min2 = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O));
                if (this.F.size() > 8) {
                    f19 = 160.0f;
                } else {
                    f19 = 220.0f;
                }
                this.M = Math.min((((float) min2) / f19) + this.M, 1.0f);
                view2.invalidate();
                this.O = SystemClock.elapsedRealtime();
            } else {
                c10 = 1;
                i12 = i18;
            }
            if (this.I < 1.0f) {
                this.I = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O))) / 200.0f) + this.I, 1.0f);
                view2.invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation2 = xq.f40366f.getInterpolation(this.M);
            canvas.save();
            int i24 = this.f38902i;
            canvas.translate(((T16 - f36) * this.f38917y) + T15, org.telegram.messenger.g0.T1((i24 + i12) / f10, i24 - org.telegram.messenger.g0.L(f18), this.f38917y) + org.telegram.messenger.g0.L(12.0f));
            if (this.K[c10] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate((org.telegram.messenger.g0.L(16.0f) * (-this.N) * interpolation2) + org.telegram.messenger.g0.L(f15), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c10].getHeight()) / f10);
                this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.f38917y) * f17 * this.I));
                this.K[c10].draw(canvas);
                canvas.restore();
            }
            if (this.K[i10] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, interpolation2, org.telegram.messenger.g0.L(16.0f) * this.N, org.telegram.messenger.g0.L(f15)), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[i10].getHeight()) / f10);
                this.L.setAlpha((int) (org.telegram.messenger.k5.A(1.0f, this.f38917y, f17, interpolation2) * this.I));
                this.K[i10].draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void b(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v51.b(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final float c() {
        return this.f38897b / (this.h - S);
    }

    public final StaticLayout d(int i7, CharSequence charSequence) {
        if (this.L == null) {
            TextPaint textPaint = new TextPaint(1);
            this.L = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            this.L.setColor(-1);
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.L, i7).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(org.telegram.messenger.g0.L(400.0f), i7)).build();
    }

    public final boolean e(float f10, float f11, int i7) {
        u51 u51Var;
        if (i7 == 0) {
            if (this.f38917y <= 0.0f) {
                int i10 = this.f38902i;
                int i11 = S;
                int i12 = (i10 - i11) / 2;
                if (f10 >= (-i12)) {
                    int i13 = this.h;
                    if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                        int i14 = this.f38897b;
                        if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                            int i15 = ((int) f10) - (i11 / 2);
                            this.f38897b = i15;
                            if (i15 < 0) {
                                this.f38897b = 0;
                            } else if (i15 > i13 - i11) {
                                this.f38897b = i11 - i13;
                            }
                            this.f38898c = this.f38897b;
                        }
                        this.f38901g = true;
                        this.f38900f = true;
                        int i16 = this.f38897b;
                        this.d = i16;
                        this.f38899e = (int) (f10 - i16);
                        return true;
                    }
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f38900f) {
                int i17 = (int) (f10 - this.f38899e);
                this.d = i17;
                if (i17 < 0) {
                    this.d = 0;
                } else {
                    int i18 = this.h - S;
                    if (i17 > i18) {
                        this.d = i18;
                    }
                }
                u51 u51Var2 = this.f38903j;
                if (u51Var2 != null) {
                    u51Var2.d(this.d / (this.h - S));
                }
                return true;
            }
        } else if (this.f38900f) {
            int i19 = this.d;
            this.f38897b = i19;
            float f12 = i19;
            this.f38898c = f12;
            if (i7 == 1 && (u51Var = this.f38903j) != null) {
                u51Var.a(f12 / (this.h - S));
            }
            this.f38900f = false;
            org.telegram.messenger.g0.i3(new s51(this, 1), 50L);
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        boolean z9;
        float f11 = this.f38912s;
        if (f10 != f11) {
            this.f38909p = f11;
            if (f10 < f11) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f38910q = z9;
            this.f38912s = f10;
            this.f38911r = 0.0f;
        }
    }

    public final void h(boolean z9, float f10) {
        if (Math.abs(this.f38896a - 1.0f) < 0.04f && Math.abs(f10) < 0.04f) {
            this.D.e(true, 1.0f);
            this.E = this.f38897b;
        }
        this.f38896a = f10;
        int ceil = (int) Math.ceil((this.h - S) * f10);
        if (z9) {
            if (Math.abs(ceil - this.f38897b) > org.telegram.messenger.g0.L(10.0f)) {
                float interpolation = xq.f40366f.getInterpolation(this.C);
                this.B = (int) com.google.android.recaptcha.internal.a.z(1.0f, interpolation, this.B, this.f38897b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.f38897b;
            }
        }
        this.f38897b = ceil;
        if (ceil < 0) {
            this.f38897b = 0;
        } else {
            int i7 = this.h - S;
            if (ceil > i7) {
                this.f38897b = i7;
            }
        }
        if (Math.abs(this.f38898c - this.f38897b) > org.telegram.messenger.g0.L(8.0f)) {
            this.f38898c = this.f38897b;
        }
    }
}
