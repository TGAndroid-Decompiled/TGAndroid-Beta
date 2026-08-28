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
public final class m61 {
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
    public float f30707a;
    public int h;
    public int f30713i;
    public l61 f30714j;
    public int f30715k;
    public int f30716l;
    public int f30717m;
    public int f30718n;
    public float f30720p;
    public boolean f30721q;
    public float f30723s;
    public float f30724t;
    public long f30725u;
    public final View v;
    public float f30728y;
    public int f30729z;
    public int f30708b = 0;
    public float f30709c = 0.0f;
    public int d = 0;
    public int f30710e = 0;
    public boolean f30711f = false;
    public boolean f30712g = false;
    public final RectF f30719o = new RectF();
    public float f30722r = 1.0f;
    public final int f30726w = AndroidUtilities.dp(4.0f);
    public final int f30727x = AndroidUtilities.dp(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public m61(View view) {
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
        this.f30724t = AndroidUtilities.dp(6.0f);
        this.D = new y5(0.0f, view, 0L, 300L, gr.h);
    }

    public static void g(float f10, int i9) {
        if (f10 < 1.0f) {
            i9 = i0.a.k(i9, (int) (Color.alpha(i9) * f10));
        }
        Q.setColor(i9);
    }

    public final void a(Canvas canvas, View view) {
        float f10;
        int i9;
        float f11;
        View view2;
        char c10;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        float f16;
        int i11;
        char c11;
        float f17;
        int i12;
        int i13;
        int i14;
        int i15;
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, this.f30728y) + this.f30729z;
        RectF rectF = this.f30719o;
        rectF.left = lerp;
        int i16 = this.f30713i;
        int i17 = this.f30726w;
        rectF.top = AndroidUtilities.lerp((i16 - i17) / 2.0f, (i16 - AndroidUtilities.dp(3.0f)) - this.f30727x, this.f30728y);
        int i18 = this.f30713i;
        rectF.bottom = AndroidUtilities.lerp((i18 + i17) / 2.0f, i18 - AndroidUtilities.dp(3.0f), this.f30728y);
        float f18 = this.f30708b;
        float min = Math.min(this.f30709c, f18);
        this.f30709c = min;
        float lerp2 = AndroidUtilities.lerp(min, f18, 0.5f);
        this.f30709c = lerp2;
        float abs = Math.abs(f18 - lerp2);
        View view3 = this.v;
        if (abs > 0.005f) {
            view3.invalidate();
        }
        float f19 = this.f30709c;
        float f20 = this.C;
        if (f20 != 1.0f) {
            float f21 = f20 + 0.07272727f;
            this.C = f21;
            if (f21 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = gr.f28844f.getInterpolation(this.C);
                f19 = (f19 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float d = this.D.d(0.0f, false);
        if (this.f30711f) {
            d = 0.0f;
        }
        rectF.right = AndroidUtilities.lerp(this.h - (S / 2.0f), view3.getWidth() - (this.f30729z * 2.0f), this.f30728y) + this.f30729z;
        g(1.0f - this.f30728y, this.f30715k);
        b(canvas, rectF, Q);
        float f22 = this.f30722r;
        if (f22 != 1.0f) {
            float f23 = f22 + 0.16f;
            this.f30722r = f23;
            if (f23 > 1.0f) {
                this.f30722r = 1.0f;
            } else {
                view3.invalidate();
            }
        }
        if (this.f30721q) {
            float f24 = this.f30720p;
            if (f24 > 0.0f) {
                f10 = 2.0f;
                rectF.right = AndroidUtilities.lerp((f24 * (this.h - i15)) + (S / 2.0f), view3.getWidth() - (this.f30729z * 2.0f), this.f30728y) + this.f30729z;
                g((1.0f - this.f30722r) * (1.0f - this.f30728y), this.f30716l);
                b(canvas, rectF, Q);
            } else {
                f10 = 2.0f;
            }
            float f25 = this.f30723s;
            if (f25 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f25 * (this.h - i14)) + (S / f10), view3.getWidth() - (this.f30729z * f10), this.f30728y) + this.f30729z;
                g(1.0f - this.f30728y, this.f30716l);
                b(canvas, rectF, Q);
            }
        } else {
            f10 = 2.0f;
            float f26 = this.f30720p;
            float f27 = this.f30722r;
            float f28 = (this.f30723s * f27) + ((1.0f - f27) * f26);
            if (f28 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f28 * (this.h - i9)) + (S / 2.0f), view3.getWidth() - (this.f30729z * 2.0f), this.f30728y) + this.f30729z;
                g(1.0f - this.f30728y, this.f30716l);
                b(canvas, rectF, Q);
            }
        }
        if (this.f30711f) {
            f11 = 8.0f;
        } else {
            f11 = 6.0f;
        }
        float dp = AndroidUtilities.dp(f11);
        if (this.f30724t != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            view2 = view3;
            long j10 = elapsedRealtime - this.f30725u;
            this.f30725u = elapsedRealtime;
            if (j10 > 18) {
                j10 = 16;
            }
            float f29 = this.f30724t;
            if (f29 < dp) {
                c10 = 0;
                float b10 = org.telegram.ui.Cells.j2.b((float) j10, 60.0f, AndroidUtilities.dp(1.0f), f29);
                this.f30724t = b10;
                if (b10 > dp) {
                    this.f30724t = dp;
                }
            } else {
                c10 = 0;
                float c12 = org.telegram.messenger.ll.c((float) j10, 60.0f, AndroidUtilities.dp(1.0f), f29);
                this.f30724t = c12;
                if (c12 < dp) {
                    this.f30724t = dp;
                }
            }
            view2.invalidate();
        } else {
            view2 = view3;
            c10 = 0;
        }
        float lerp3 = AndroidUtilities.lerp(this.f30724t, 0.0f, this.f30728y);
        if (d > 0.0f) {
            float f30 = rectF.left;
            f12 = 0.2f;
            f13 = 8.0f;
            float lerp4 = AndroidUtilities.lerp((S / f10) + (this.h - i12), view2.getWidth() - (this.f30729z * f10), this.f30728y) + this.f30729z;
            rectF.right = lerp4;
            rectF.left = AndroidUtilities.lerp(f30, lerp4, 1.0f - d);
            if (this.f30728y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.f30728y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.a.d(this.f30728y, this.f30718n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f30;
            int i19 = this.f30717m;
            if (c() == 0.0f) {
                i13 = 0;
            } else {
                i13 = this.A;
            }
            g(1.0f - this.f30728y, i0.a.d(this.f30728y, i19, i13));
            canvas.drawCircle(AndroidUtilities.lerp((S / f10) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.f30729z * f10)), this.f30728y) + this.f30729z, rectF.centerY(), lerp3 * d, Q);
        } else {
            f12 = 0.2f;
            f13 = 8.0f;
        }
        float f31 = this.f30729z;
        float f32 = S / f10;
        if (this.f30711f) {
            f19 = this.d;
        }
        rectF.right = AndroidUtilities.lerp(f32 + f19, c() * (view2.getWidth() - (this.f30729z * f10)), this.f30728y) + f31;
        if (this.f30728y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.f30728y * 255.0f * f12));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.a.d(this.f30728y, this.f30718n, this.A));
        b(canvas, rectF, Q);
        int i20 = this.f30717m;
        if (c() == 0.0f) {
            i10 = 0;
        } else {
            i10 = this.A;
        }
        g(1.0f - this.f30728y, i0.a.d(this.f30728y, i20, i10));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - d) * lerp3, Q);
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!this.f30711f && !this.f30712g) {
                f14 = this.f30709c;
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
            float lerp5 = AndroidUtilities.lerp(S / f10, 0.0f, this.f30728y) + this.f30729z;
            float lerp6 = AndroidUtilities.lerp(this.h - (S / f10), view2.getWidth() - (this.f30729z * f10), this.f30728y) + this.f30729z;
            float f34 = (this.h - (S / f10)) + this.f30729z;
            float abs2 = Math.abs(lerp5 - f34) - AndroidUtilities.dp(16.0f);
            float f35 = this.P;
            if (f35 > 0.0f && Math.abs(f35 - abs2) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.K;
                StaticLayout staticLayout = staticLayoutArr[c10];
                if (staticLayout != null) {
                    f16 = 16.0f;
                    CharSequence text = staticLayout.getText();
                    f15 = 3.0f;
                    staticLayoutArr[c10] = d((int) abs2, text);
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
                staticLayoutArr3[1] = staticLayoutArr3[c10];
                if (this.f30711f) {
                    AndroidUtilities.vibrateCursor(view2);
                }
                if (size >= 0 && size < this.F.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.F.get(size)).second;
                    if (charSequence == null) {
                        this.K[c10] = null;
                    } else {
                        this.K[c10] = d((int) abs2, charSequence);
                    }
                } else {
                    this.K[c10] = null;
                }
                this.M = 0.0f;
                if (size == -1) {
                    this.N = -1;
                } else {
                    int i21 = this.J;
                    if (i21 == -1) {
                        this.N = 1;
                    } else if (size < i21) {
                        this.N = -1;
                    } else if (size > i21) {
                        this.N = 1;
                    }
                }
                this.J = size;
            }
            if (this.M < 1.0f) {
                i11 = i17;
                c11 = 1;
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
                i11 = i17;
                c11 = 1;
            }
            if (this.I < 1.0f) {
                this.I = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O))) / 200.0f) + this.I, 1.0f);
                view2.invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation2 = gr.f28844f.getInterpolation(this.M);
            canvas.save();
            int i22 = this.f30713i;
            canvas.translate(((lerp6 - f34) * this.f30728y) + lerp5, AndroidUtilities.lerp((i22 + i11) / f10, i22 - AndroidUtilities.dp(f15), this.f30728y) + AndroidUtilities.dp(12.0f));
            if (this.K[c11] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate((AndroidUtilities.dp(f16) * (-this.N) * interpolation2) + AndroidUtilities.dp(f13), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c11].getHeight()) / f10);
                this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.f30728y) * 255.0f * this.I));
                this.K[c11].draw(canvas);
                canvas.restore();
            }
            if (this.K[c10] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate(e2.c.z(1.0f, interpolation2, AndroidUtilities.dp(f16) * this.N, AndroidUtilities.dp(f13)), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c10].getHeight()) / f10);
                this.L.setAlpha((int) (org.telegram.messenger.l0.y(1.0f, this.f30728y, 255.0f, interpolation2) * this.I));
                this.K[c10].draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void b(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m61.b(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final float c() {
        return this.f30708b / (this.h - S);
    }

    public final StaticLayout d(int i9, CharSequence charSequence) {
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
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.L, i9).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i9)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.L, i9, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i9));
    }

    public final boolean e(float f10, float f11, int i9) {
        l61 l61Var;
        if (i9 == 0) {
            if (this.f30728y <= 0.0f) {
                int i10 = this.f30713i;
                int i11 = S;
                int i12 = (i10 - i11) / 2;
                if (f10 >= (-i12)) {
                    int i13 = this.h;
                    if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                        int i14 = this.f30708b;
                        if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                            int i15 = ((int) f10) - (i11 / 2);
                            this.f30708b = i15;
                            if (i15 < 0) {
                                this.f30708b = 0;
                            } else if (i15 > i13 - i11) {
                                this.f30708b = i11 - i13;
                            }
                            this.f30709c = this.f30708b;
                        }
                        this.f30712g = true;
                        this.f30711f = true;
                        int i16 = this.f30708b;
                        this.d = i16;
                        this.f30710e = (int) (f10 - i16);
                        return true;
                    }
                }
            }
        } else if (i9 != 1 && i9 != 3) {
            if (i9 == 2 && this.f30711f) {
                int i17 = (int) (f10 - this.f30710e);
                this.d = i17;
                if (i17 < 0) {
                    this.d = 0;
                } else {
                    int i18 = this.h - S;
                    if (i17 > i18) {
                        this.d = i18;
                    }
                }
                l61 l61Var2 = this.f30714j;
                if (l61Var2 != null) {
                    l61Var2.e(this.d / (this.h - S));
                }
                return true;
            }
        } else if (this.f30711f) {
            int i19 = this.d;
            this.f30708b = i19;
            float f12 = i19;
            this.f30709c = f12;
            if (i9 == 1 && (l61Var = this.f30714j) != null) {
                l61Var.b(f12 / (this.h - S));
            }
            this.f30711f = false;
            AndroidUtilities.runOnUIThread(new b61(this, 2), 50L);
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        boolean z10;
        float f11 = this.f30723s;
        if (f10 != f11) {
            this.f30720p = f11;
            if (f10 < f11) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f30721q = z10;
            this.f30723s = f10;
            this.f30722r = 0.0f;
        }
    }

    public final void h(float f10, boolean z10) {
        if (Math.abs(this.f30707a - 1.0f) < 0.04f && Math.abs(f10) < 0.04f) {
            this.D.d(1.0f, true);
            this.E = this.f30708b;
        }
        this.f30707a = f10;
        int ceil = (int) Math.ceil((this.h - S) * f10);
        if (z10) {
            if (Math.abs(ceil - this.f30708b) > AndroidUtilities.dp(10.0f)) {
                float interpolation = gr.f28844f.getInterpolation(this.C);
                this.B = (int) e2.c.z(1.0f, interpolation, this.B, this.f30708b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.f30708b;
            }
        }
        this.f30708b = ceil;
        if (ceil < 0) {
            this.f30708b = 0;
        } else {
            int i9 = this.h - S;
            if (ceil > i9) {
                this.f30708b = i9;
            }
        }
        if (Math.abs(this.f30709c - this.f30708b) > AndroidUtilities.dp(8.0f)) {
            this.f30709c = this.f30708b;
        }
    }
}
