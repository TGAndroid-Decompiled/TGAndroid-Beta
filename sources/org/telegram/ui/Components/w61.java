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
public final class w61 {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final t5 D;
    public float E;
    public ArrayList F;
    public CharSequence G;
    public long H;
    public StaticLayout[] K;
    public TextPaint L;
    public int N;
    public long O;
    public float f32022a;
    public int h;
    public int f32027i;
    public v61 f32028j;
    public int f32029k;
    public int f32030l;
    public int f32031m;
    public int f32032n;
    public float f32034p;
    public boolean f32035q;
    public float f32037s;
    public float f32038t;
    public long f32039u;
    public final View v;
    public float f32042y;
    public int f32043z;
    public int f32023b = 0;
    public float f32024c = 0.0f;
    public int d = 0;
    public int e = 0;
    public boolean f32025f = false;
    public boolean f32026g = false;
    public final RectF f32033o = new RectF();
    public float f32036r = 1.0f;
    public final int f32040w = org.telegram.messenger.i0.L(4.0f);
    public final int f32041x = org.telegram.messenger.i0.L(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public w61(View view) {
        if (Q == null) {
            Q = new Paint(1);
            Paint paint = new Paint(1);
            R = paint;
            paint.setStyle(Paint.Style.STROKE);
            R.setColor(-16777216);
            R.setStrokeWidth(1.0f);
        }
        this.v = view;
        S = org.telegram.messenger.i0.L(24.0f);
        this.f32038t = org.telegram.messenger.i0.L(6.0f);
        this.D = new t5(0.0f, view, 0L, 300L, gr.h);
    }

    public static void g(float f7, int i10) {
        if (f7 < 1.0f) {
            i10 = i0.b.o(i10, (int) (Color.alpha(i10) * f7));
        }
        Q.setColor(i10);
    }

    public final void a(Canvas canvas, View view) {
        float f7;
        int i10;
        float f10;
        float f11;
        float f12;
        int i11;
        float f13;
        float f14;
        int i12;
        float f15;
        float f16;
        float f17;
        char c10;
        int i13;
        float f18;
        int i14;
        int i15;
        int i16;
        int i17;
        float T1 = org.telegram.messenger.i0.T1(S / 2.0f, 0.0f, this.f32042y) + this.f32043z;
        RectF rectF = this.f32033o;
        rectF.left = T1;
        int i18 = this.f32027i;
        int i19 = this.f32040w;
        rectF.top = org.telegram.messenger.i0.T1((i18 - i19) / 2.0f, (i18 - org.telegram.messenger.i0.L(3.0f)) - this.f32041x, this.f32042y);
        int i20 = this.f32027i;
        rectF.bottom = org.telegram.messenger.i0.T1((i20 + i19) / 2.0f, i20 - org.telegram.messenger.i0.L(3.0f), this.f32042y);
        float f19 = this.f32023b;
        float min = Math.min(this.f32024c, f19);
        this.f32024c = min;
        float T12 = org.telegram.messenger.i0.T1(min, f19, 0.5f);
        this.f32024c = T12;
        int i21 = (Math.abs(f19 - T12) > 0.005f ? 1 : (Math.abs(f19 - T12) == 0.005f ? 0 : -1));
        View view2 = this.v;
        if (i21 > 0) {
            view2.invalidate();
        }
        float f20 = this.f32024c;
        float f21 = this.C;
        if (f21 != 1.0f) {
            float f22 = f21 + 0.07272727f;
            this.C = f22;
            if (f22 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = gr.f26495f.getInterpolation(this.C);
                f20 = (f20 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float e = this.D.e(false, 0.0f);
        if (this.f32025f) {
            e = 0.0f;
        }
        rectF.right = org.telegram.messenger.i0.T1(this.h - (S / 2.0f), view2.getWidth() - (this.f32043z * 2.0f), this.f32042y) + this.f32043z;
        g(1.0f - this.f32042y, this.f32029k);
        b(canvas, rectF, Q);
        float f23 = this.f32036r;
        if (f23 != 1.0f) {
            float f24 = f23 + 0.16f;
            this.f32036r = f24;
            if (f24 > 1.0f) {
                this.f32036r = 1.0f;
            } else {
                view2.invalidate();
            }
        }
        if (this.f32035q) {
            float f25 = this.f32034p;
            if (f25 > 0.0f) {
                f7 = 2.0f;
                rectF.right = org.telegram.messenger.i0.T1((f25 * (this.h - i17)) + (S / 2.0f), view2.getWidth() - (this.f32043z * 2.0f), this.f32042y) + this.f32043z;
                g((1.0f - this.f32036r) * (1.0f - this.f32042y), this.f32030l);
                b(canvas, rectF, Q);
            } else {
                f7 = 2.0f;
            }
            float f26 = this.f32037s;
            if (f26 > 0.0f) {
                rectF.right = org.telegram.messenger.i0.T1((f26 * (this.h - i16)) + (S / f7), view2.getWidth() - (this.f32043z * f7), this.f32042y) + this.f32043z;
                g(1.0f - this.f32042y, this.f32030l);
                b(canvas, rectF, Q);
            }
        } else {
            f7 = 2.0f;
            float f27 = this.f32034p;
            float f28 = this.f32036r;
            float f29 = (this.f32037s * f28) + ((1.0f - f28) * f27);
            if (f29 > 0.0f) {
                rectF.right = org.telegram.messenger.i0.T1((f29 * (this.h - i10)) + (S / 2.0f), view2.getWidth() - (this.f32043z * 2.0f), this.f32042y) + this.f32043z;
                g(1.0f - this.f32042y, this.f32030l);
                b(canvas, rectF, Q);
            }
        }
        if (this.f32025f) {
            f10 = 8.0f;
        } else {
            f10 = 6.0f;
        }
        float L = org.telegram.messenger.i0.L(f10);
        if (this.f32038t != L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f11 = 3.0f;
            f12 = e;
            long j10 = elapsedRealtime - this.f32039u;
            this.f32039u = elapsedRealtime;
            if (j10 > 18) {
                j10 = 16;
            }
            float f30 = this.f32038t;
            i11 = 0;
            if (f30 < L) {
                float c11 = a1.g.c((float) j10, 60.0f, org.telegram.messenger.i0.L(1.0f), f30);
                this.f32038t = c11;
                if (c11 > L) {
                    this.f32038t = L;
                }
            } else {
                float v = org.telegram.messenger.z20.v((float) j10, 60.0f, org.telegram.messenger.i0.L(1.0f), f30);
                this.f32038t = v;
                if (v < L) {
                    this.f32038t = L;
                }
            }
            view2.invalidate();
        } else {
            f11 = 3.0f;
            f12 = e;
            i11 = 0;
        }
        float T13 = org.telegram.messenger.i0.T1(this.f32038t, 0.0f, this.f32042y);
        if (f12 > 0.0f) {
            float f31 = rectF.left;
            f13 = 0.2f;
            f14 = 8.0f;
            float T14 = org.telegram.messenger.i0.T1((S / f7) + (this.h - i14), view2.getWidth() - (this.f32043z * f7), this.f32042y) + this.f32043z;
            rectF.right = T14;
            rectF.left = org.telegram.messenger.i0.T1(f31, T14, 1.0f - f12);
            if (this.f32042y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.f32042y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.b.f(this.f32042y, this.f32032n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f31;
            int i22 = this.f32031m;
            if (c() == 0.0f) {
                i15 = i11;
            } else {
                i15 = this.A;
            }
            g(1.0f - this.f32042y, i0.b.f(this.f32042y, i22, i15));
            canvas.drawCircle(org.telegram.messenger.i0.T1((S / f7) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.f32043z * f7)), this.f32042y) + this.f32043z, rectF.centerY(), T13 * f12, Q);
        } else {
            f13 = 0.2f;
            f14 = 8.0f;
        }
        float f32 = this.f32043z;
        float f33 = S / f7;
        if (this.f32025f) {
            f20 = this.d;
        }
        rectF.right = org.telegram.messenger.i0.T1(f33 + f20, c() * (view2.getWidth() - (this.f32043z * f7)), this.f32042y) + f32;
        if (this.f32042y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.f32042y * 255.0f * f13));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.b.f(this.f32042y, this.f32032n, this.A));
        b(canvas, rectF, Q);
        int i23 = this.f32031m;
        if (c() == 0.0f) {
            i12 = i11;
        } else {
            i12 = this.A;
        }
        g(1.0f - this.f32042y, i0.b.f(this.f32042y, i23, i12));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - f12) * T13, Q);
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!this.f32025f && !this.f32026g) {
                f15 = this.f32024c;
            } else {
                f15 = this.d;
            }
            float f34 = f15 / (this.h - S);
            int size = this.F.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((Float) ((Pair) this.F.get(size)).first).floatValue() - 0.001f <= f34) {
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
            float T15 = org.telegram.messenger.i0.T1(S / f7, 0.0f, this.f32042y) + this.f32043z;
            float T16 = org.telegram.messenger.i0.T1(this.h - (S / f7), view2.getWidth() - (this.f32043z * f7), this.f32042y) + this.f32043z;
            float f35 = (this.h - (S / f7)) + this.f32043z;
            float abs = Math.abs(T15 - f35) - org.telegram.messenger.i0.L(16.0f);
            float f36 = this.P;
            if (f36 > 0.0f && Math.abs(f36 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.K;
                StaticLayout staticLayout = staticLayoutArr[i11];
                if (staticLayout != null) {
                    f17 = f11;
                    CharSequence text = staticLayout.getText();
                    f16 = 255.0f;
                    staticLayoutArr[i11] = d((int) abs, text);
                } else {
                    f16 = 255.0f;
                    f17 = f11;
                }
                StaticLayout[] staticLayoutArr2 = this.K;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = d((int) abs, staticLayout2.getText());
                }
            } else {
                f16 = 255.0f;
                f17 = f11;
            }
            this.P = abs;
            if (size != this.J) {
                StaticLayout[] staticLayoutArr3 = this.K;
                staticLayoutArr3[1] = staticLayoutArr3[i11];
                if (this.f32025f) {
                    org.telegram.messenger.i0.b4(view2);
                }
                if (size >= 0 && size < this.F.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.F.get(size)).second;
                    if (charSequence == null) {
                        this.K[i11] = null;
                    } else {
                        this.K[i11] = d((int) abs, charSequence);
                    }
                } else {
                    this.K[i11] = null;
                }
                this.M = 0.0f;
                if (size == -1) {
                    this.N = -1;
                } else {
                    int i24 = this.J;
                    if (i24 == -1) {
                        this.N = 1;
                    } else if (size < i24) {
                        this.N = -1;
                    } else if (size > i24) {
                        this.N = 1;
                    }
                }
                this.J = size;
            }
            if (this.M < 1.0f) {
                c10 = 1;
                i13 = i19;
                long min2 = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O));
                if (this.F.size() > 8) {
                    f18 = 160.0f;
                } else {
                    f18 = 220.0f;
                }
                this.M = Math.min((((float) min2) / f18) + this.M, 1.0f);
                view2.invalidate();
                this.O = SystemClock.elapsedRealtime();
            } else {
                c10 = 1;
                i13 = i19;
            }
            if (this.I < 1.0f) {
                this.I = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O))) / 200.0f) + this.I, 1.0f);
                view2.invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation2 = gr.f26495f.getInterpolation(this.M);
            canvas.save();
            int i25 = this.f32027i;
            canvas.translate(((T16 - f35) * this.f32042y) + T15, org.telegram.messenger.i0.T1((i25 + i13) / f7, i25 - org.telegram.messenger.i0.L(f17), this.f32042y) + org.telegram.messenger.i0.L(12.0f));
            if (this.K[c10] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate((org.telegram.messenger.i0.L(16.0f) * (-this.N) * interpolation2) + org.telegram.messenger.i0.L(f14), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c10].getHeight()) / f7);
                this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.f32042y) * f16 * this.I));
                this.K[c10].draw(canvas);
                canvas.restore();
            }
            if (this.K[i11] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate(c3.i0.z(1.0f, interpolation2, org.telegram.messenger.i0.L(16.0f) * this.N, org.telegram.messenger.i0.L(f14)), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[i11].getHeight()) / f7);
                this.L.setAlpha((int) (org.telegram.messenger.m5.A(1.0f, this.f32042y, f16, interpolation2) * this.I));
                this.K[i11].draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void b(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w61.b(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final float c() {
        return this.f32023b / (this.h - S);
    }

    public final StaticLayout d(int i10, CharSequence charSequence) {
        if (this.L == null) {
            TextPaint textPaint = new TextPaint(1);
            this.L = textPaint;
            textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
            this.L.setColor(-1);
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.L, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(org.telegram.messenger.i0.L(400.0f), i10)).build();
    }

    public final boolean e(float f7, float f10, int i10) {
        v61 v61Var;
        if (i10 == 0) {
            if (this.f32042y <= 0.0f) {
                int i11 = this.f32027i;
                int i12 = S;
                int i13 = (i11 - i12) / 2;
                if (f7 >= (-i13)) {
                    int i14 = this.h;
                    if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                        int i15 = this.f32023b;
                        if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                            int i16 = ((int) f7) - (i12 / 2);
                            this.f32023b = i16;
                            if (i16 < 0) {
                                this.f32023b = 0;
                            } else if (i16 > i14 - i12) {
                                this.f32023b = i12 - i14;
                            }
                            this.f32024c = this.f32023b;
                        }
                        this.f32026g = true;
                        this.f32025f = true;
                        int i17 = this.f32023b;
                        this.d = i17;
                        this.e = (int) (f7 - i17);
                        return true;
                    }
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f32025f) {
                int i18 = (int) (f7 - this.e);
                this.d = i18;
                if (i18 < 0) {
                    this.d = 0;
                } else {
                    int i19 = this.h - S;
                    if (i18 > i19) {
                        this.d = i19;
                    }
                }
                v61 v61Var2 = this.f32028j;
                if (v61Var2 != null) {
                    v61Var2.d(this.d / (this.h - S));
                }
                return true;
            }
        } else if (this.f32025f) {
            int i20 = this.d;
            this.f32023b = i20;
            float f11 = i20;
            this.f32024c = f11;
            if (i10 == 1 && (v61Var = this.f32028j) != null) {
                v61Var.c(f11 / (this.h - S));
            }
            this.f32025f = false;
            org.telegram.messenger.i0.h3(new j51(this, 5), 50L);
            return true;
        }
        return false;
    }

    public final void f(float f7) {
        boolean z10;
        float f10 = this.f32037s;
        if (f7 != f10) {
            this.f32034p = f10;
            if (f7 < f10) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32035q = z10;
            this.f32037s = f7;
            this.f32036r = 0.0f;
        }
    }

    public final void h(boolean z10, float f7) {
        if (Math.abs(this.f32022a - 1.0f) < 0.04f && Math.abs(f7) < 0.04f) {
            this.D.e(true, 1.0f);
            this.E = this.f32023b;
        }
        this.f32022a = f7;
        int ceil = (int) Math.ceil((this.h - S) * f7);
        if (z10) {
            if (Math.abs(ceil - this.f32023b) > org.telegram.messenger.i0.L(10.0f)) {
                float interpolation = gr.f26495f.getInterpolation(this.C);
                this.B = (int) c3.i0.z(1.0f, interpolation, this.B, this.f32023b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.f32023b;
            }
        }
        this.f32023b = ceil;
        if (ceil < 0) {
            this.f32023b = 0;
        } else {
            int i10 = this.h - S;
            if (ceil > i10) {
                this.f32023b = i10;
            }
        }
        if (Math.abs(this.f32024c - this.f32023b) > org.telegram.messenger.i0.L(8.0f)) {
            this.f32024c = this.f32023b;
        }
    }
}
