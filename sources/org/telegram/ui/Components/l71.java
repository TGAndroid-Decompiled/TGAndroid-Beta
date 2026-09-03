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
public final class l71 {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final z5 D;
    public float E;
    public ArrayList F;
    public CharSequence G;
    public long H;
    public StaticLayout[] K;
    public TextPaint L;
    public int N;
    public long O;
    public float f28656a;
    public int h;
    public int f28662i;
    public k71 f28663j;
    public int f28664k;
    public int f28665l;
    public int f28666m;
    public int f28667n;
    public float f28669p;
    public boolean f28670q;
    public float f28672s;
    public float f28673t;
    public long f28674u;
    public final View v;
    public float f28677y;
    public int f28678z;
    public int f28657b = 0;
    public float f28658c = 0.0f;
    public int d = 0;
    public int f28659e = 0;
    public boolean f28660f = false;
    public boolean f28661g = false;
    public final RectF f28668o = new RectF();
    public float f28671r = 1.0f;
    public final int f28675w = AndroidUtilities.dp(4.0f);
    public final int f28676x = AndroidUtilities.dp(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public l71(View view) {
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
        this.f28673t = AndroidUtilities.dp(6.0f);
        this.D = new z5(0.0f, view, 0L, 300L, pr.h);
    }

    public static void g(float f10, int i10) {
        if (f10 < 1.0f) {
            i10 = i0.a.k(i10, (int) (Color.alpha(i10) * f10));
        }
        Q.setColor(i10);
    }

    public final void a(Canvas canvas, View view) {
        float f10;
        int i10;
        float f11;
        View view2;
        char c3;
        float f12;
        float f13;
        int i11;
        float f14;
        float f15;
        float f16;
        int i12;
        char c10;
        float f17;
        int i13;
        int i14;
        int i15;
        int i16;
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, this.f28677y) + this.f28678z;
        RectF rectF = this.f28668o;
        rectF.left = lerp;
        int i17 = this.f28662i;
        int i18 = this.f28675w;
        rectF.top = AndroidUtilities.lerp((i17 - i18) / 2.0f, (i17 - AndroidUtilities.dp(3.0f)) - this.f28676x, this.f28677y);
        int i19 = this.f28662i;
        rectF.bottom = AndroidUtilities.lerp((i19 + i18) / 2.0f, i19 - AndroidUtilities.dp(3.0f), this.f28677y);
        float f18 = this.f28657b;
        float min = Math.min(this.f28658c, f18);
        this.f28658c = min;
        float lerp2 = AndroidUtilities.lerp(min, f18, 0.5f);
        this.f28658c = lerp2;
        float abs = Math.abs(f18 - lerp2);
        View view3 = this.v;
        if (abs > 0.005f) {
            view3.invalidate();
        }
        float f19 = this.f28658c;
        float f20 = this.C;
        if (f20 != 1.0f) {
            float f21 = f20 + 0.07272727f;
            this.C = f21;
            if (f21 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = pr.f30168f.getInterpolation(this.C);
                f19 = (f19 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float d = this.D.d(0.0f, false);
        if (this.f28660f) {
            d = 0.0f;
        }
        rectF.right = AndroidUtilities.lerp(this.h - (S / 2.0f), view3.getWidth() - (this.f28678z * 2.0f), this.f28677y) + this.f28678z;
        g(1.0f - this.f28677y, this.f28664k);
        b(canvas, rectF, Q);
        float f22 = this.f28671r;
        if (f22 != 1.0f) {
            float f23 = f22 + 0.16f;
            this.f28671r = f23;
            if (f23 > 1.0f) {
                this.f28671r = 1.0f;
            } else {
                view3.invalidate();
            }
        }
        if (this.f28670q) {
            float f24 = this.f28669p;
            if (f24 > 0.0f) {
                f10 = 2.0f;
                rectF.right = AndroidUtilities.lerp((f24 * (this.h - i16)) + (S / 2.0f), view3.getWidth() - (this.f28678z * 2.0f), this.f28677y) + this.f28678z;
                g((1.0f - this.f28671r) * (1.0f - this.f28677y), this.f28665l);
                b(canvas, rectF, Q);
            } else {
                f10 = 2.0f;
            }
            float f25 = this.f28672s;
            if (f25 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f25 * (this.h - i15)) + (S / f10), view3.getWidth() - (this.f28678z * f10), this.f28677y) + this.f28678z;
                g(1.0f - this.f28677y, this.f28665l);
                b(canvas, rectF, Q);
            }
        } else {
            f10 = 2.0f;
            float f26 = this.f28669p;
            float f27 = this.f28671r;
            float f28 = (this.f28672s * f27) + ((1.0f - f27) * f26);
            if (f28 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f28 * (this.h - i10)) + (S / 2.0f), view3.getWidth() - (this.f28678z * 2.0f), this.f28677y) + this.f28678z;
                g(1.0f - this.f28677y, this.f28665l);
                b(canvas, rectF, Q);
            }
        }
        if (this.f28660f) {
            f11 = 8.0f;
        } else {
            f11 = 6.0f;
        }
        float dp = AndroidUtilities.dp(f11);
        if (this.f28673t != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            view2 = view3;
            long j10 = elapsedRealtime - this.f28674u;
            this.f28674u = elapsedRealtime;
            if (j10 > 18) {
                j10 = 16;
            }
            float f29 = this.f28673t;
            if (f29 < dp) {
                c3 = 0;
                float c11 = w.c.c((float) j10, 60.0f, AndroidUtilities.dp(1.0f), f29);
                this.f28673t = c11;
                if (c11 > dp) {
                    this.f28673t = dp;
                }
            } else {
                c3 = 0;
                float A = org.telegram.messenger.y3.A((float) j10, 60.0f, AndroidUtilities.dp(1.0f), f29);
                this.f28673t = A;
                if (A < dp) {
                    this.f28673t = dp;
                }
            }
            view2.invalidate();
        } else {
            view2 = view3;
            c3 = 0;
        }
        float lerp3 = AndroidUtilities.lerp(this.f28673t, 0.0f, this.f28677y);
        if (d > 0.0f) {
            float f30 = rectF.left;
            f12 = 0.2f;
            f13 = 8.0f;
            float lerp4 = AndroidUtilities.lerp((S / f10) + (this.h - i13), view2.getWidth() - (this.f28678z * f10), this.f28677y) + this.f28678z;
            rectF.right = lerp4;
            rectF.left = AndroidUtilities.lerp(f30, lerp4, 1.0f - d);
            if (this.f28677y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.f28677y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.a.d(this.f28677y, this.f28667n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f30;
            int i20 = this.f28666m;
            if (c() == 0.0f) {
                i14 = 0;
            } else {
                i14 = this.A;
            }
            g(1.0f - this.f28677y, i0.a.d(this.f28677y, i20, i14));
            canvas.drawCircle(AndroidUtilities.lerp((S / f10) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.f28678z * f10)), this.f28677y) + this.f28678z, rectF.centerY(), lerp3 * d, Q);
        } else {
            f12 = 0.2f;
            f13 = 8.0f;
        }
        float f31 = this.f28678z;
        float f32 = S / f10;
        if (this.f28660f) {
            f19 = this.d;
        }
        rectF.right = AndroidUtilities.lerp(f32 + f19, c() * (view2.getWidth() - (this.f28678z * f10)), this.f28677y) + f31;
        if (this.f28677y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.f28677y * 255.0f * f12));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.a.d(this.f28677y, this.f28667n, this.A));
        b(canvas, rectF, Q);
        int i21 = this.f28666m;
        if (c() == 0.0f) {
            i11 = 0;
        } else {
            i11 = this.A;
        }
        g(1.0f - this.f28677y, i0.a.d(this.f28677y, i21, i11));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - d) * lerp3, Q);
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!this.f28660f && !this.f28661g) {
                f14 = this.f28658c;
            } else {
                f14 = this.d;
            }
            float f33 = f14 / (this.h - S);
            int size = this.F.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((Float) ((Pair) this.F.get(size)).first).floatValue() - 0.001f <= f33) {
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
            float lerp5 = AndroidUtilities.lerp(S / f10, 0.0f, this.f28677y) + this.f28678z;
            float lerp6 = AndroidUtilities.lerp(this.h - (S / f10), view2.getWidth() - (this.f28678z * f10), this.f28677y) + this.f28678z;
            float f34 = (this.h - (S / f10)) + this.f28678z;
            float abs2 = Math.abs(lerp5 - f34) - AndroidUtilities.dp(16.0f);
            float f35 = this.P;
            if (f35 > 0.0f && Math.abs(f35 - abs2) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.K;
                StaticLayout staticLayout = staticLayoutArr[c3];
                if (staticLayout != null) {
                    f16 = 16.0f;
                    CharSequence text = staticLayout.getText();
                    f15 = 3.0f;
                    staticLayoutArr[c3] = d((int) abs2, text);
                } else {
                    f15 = 3.0f;
                    f16 = 16.0f;
                }
                StaticLayout[] staticLayoutArr2 = this.K;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = d((int) abs2, staticLayout2.getText());
                }
            } else {
                f15 = 3.0f;
                f16 = 16.0f;
            }
            this.P = abs2;
            if (size != this.J) {
                StaticLayout[] staticLayoutArr3 = this.K;
                staticLayoutArr3[1] = staticLayoutArr3[c3];
                if (this.f28660f) {
                    AndroidUtilities.vibrateCursor(view2);
                }
                if (size >= 0 && size < this.F.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.F.get(size)).second;
                    if (charSequence == null) {
                        this.K[c3] = null;
                    } else {
                        this.K[c3] = d((int) abs2, charSequence);
                    }
                } else {
                    this.K[c3] = null;
                }
                this.M = 0.0f;
                if (size == -1) {
                    this.N = -1;
                } else {
                    int i22 = this.J;
                    if (i22 == -1) {
                        this.N = 1;
                    } else if (size < i22) {
                        this.N = -1;
                    } else if (size > i22) {
                        this.N = 1;
                    }
                }
                this.J = size;
            }
            if (this.M < 1.0f) {
                i12 = i18;
                c10 = 1;
                long min2 = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O));
                if (this.F.size() > 8) {
                    f17 = 160.0f;
                } else {
                    f17 = 220.0f;
                }
                this.M = Math.min((((float) min2) / f17) + this.M, 1.0f);
                view2.invalidate();
                this.O = SystemClock.elapsedRealtime();
            } else {
                i12 = i18;
                c10 = 1;
            }
            if (this.I < 1.0f) {
                this.I = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O))) / 200.0f) + this.I, 1.0f);
                view2.invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation2 = pr.f30168f.getInterpolation(this.M);
            canvas.save();
            int i23 = this.f28662i;
            canvas.translate(((lerp6 - f34) * this.f28677y) + lerp5, AndroidUtilities.lerp((i23 + i12) / f10, i23 - AndroidUtilities.dp(f15), this.f28677y) + AndroidUtilities.dp(12.0f));
            if (this.K[c10] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate((AndroidUtilities.dp(f16) * (-this.N) * interpolation2) + AndroidUtilities.dp(f13), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c10].getHeight()) / f10);
                this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.f28677y) * 255.0f * this.I));
                this.K[c10].draw(canvas);
                canvas.restore();
            }
            if (this.K[c3] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate(e2.c.w(1.0f, interpolation2, AndroidUtilities.dp(f16) * this.N, AndroidUtilities.dp(f13)), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c3].getHeight()) / f10);
                this.L.setAlpha((int) (org.telegram.messenger.y3.y(1.0f, this.f28677y, 255.0f, interpolation2) * this.I));
                this.K[c3].draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void b(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l71.b(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final float c() {
        return this.f28657b / (this.h - S);
    }

    public final StaticLayout d(int i10, CharSequence charSequence) {
        CharSequence charSequence2;
        if (this.L == null) {
            TextPaint textPaint = new TextPaint(1);
            this.L = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.L.setColor(-1);
        }
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.L, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.L, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i10));
    }

    public final boolean e(float f10, float f11, int i10) {
        k71 k71Var;
        if (i10 == 0) {
            if (this.f28677y <= 0.0f) {
                int i11 = this.f28662i;
                int i12 = S;
                int i13 = (i11 - i12) / 2;
                if (f10 >= (-i13)) {
                    int i14 = this.h;
                    if (f10 <= i14 + i13 && f11 >= 0.0f && f11 <= i11) {
                        int i15 = this.f28657b;
                        if (i15 - i13 > f10 || f10 > i15 + i12 + i13) {
                            int i16 = ((int) f10) - (i12 / 2);
                            this.f28657b = i16;
                            if (i16 < 0) {
                                this.f28657b = 0;
                            } else if (i16 > i14 - i12) {
                                this.f28657b = i12 - i14;
                            }
                            this.f28658c = this.f28657b;
                        }
                        this.f28661g = true;
                        this.f28660f = true;
                        int i17 = this.f28657b;
                        this.d = i17;
                        this.f28659e = (int) (f10 - i17);
                        return true;
                    }
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f28660f) {
                int i18 = (int) (f10 - this.f28659e);
                this.d = i18;
                if (i18 < 0) {
                    this.d = 0;
                } else {
                    int i19 = this.h - S;
                    if (i18 > i19) {
                        this.d = i19;
                    }
                }
                k71 k71Var2 = this.f28663j;
                if (k71Var2 != null) {
                    k71Var2.d(this.d / (this.h - S));
                }
                return true;
            }
        } else if (this.f28660f) {
            int i20 = this.d;
            this.f28657b = i20;
            float f12 = i20;
            this.f28658c = f12;
            if (i10 == 1 && (k71Var = this.f28663j) != null) {
                k71Var.b(f12 / (this.h - S));
            }
            this.f28660f = false;
            AndroidUtilities.runOnUIThread(new a71(this, 2), 50L);
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        boolean z4;
        float f11 = this.f28672s;
        if (f10 != f11) {
            this.f28669p = f11;
            if (f10 < f11) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f28670q = z4;
            this.f28672s = f10;
            this.f28671r = 0.0f;
        }
    }

    public final void h(float f10, boolean z4) {
        if (Math.abs(this.f28656a - 1.0f) < 0.04f && Math.abs(f10) < 0.04f) {
            this.D.d(1.0f, true);
            this.E = this.f28657b;
        }
        this.f28656a = f10;
        int ceil = (int) Math.ceil((this.h - S) * f10);
        if (z4) {
            if (Math.abs(ceil - this.f28657b) > AndroidUtilities.dp(10.0f)) {
                float interpolation = pr.f30168f.getInterpolation(this.C);
                this.B = (int) e2.c.w(1.0f, interpolation, this.B, this.f28657b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.f28657b;
            }
        }
        this.f28657b = ceil;
        if (ceil < 0) {
            this.f28657b = 0;
        } else {
            int i10 = this.h - S;
            if (ceil > i10) {
                this.f28657b = i10;
            }
        }
        if (Math.abs(this.f28658c - this.f28657b) > AndroidUtilities.dp(8.0f)) {
            this.f28658c = this.f28657b;
        }
    }
}
