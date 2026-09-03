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
public final class k71 {
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
    public float f26181a;
    public int h;
    public int f26186i;
    public j71 f26187j;
    public int f26188k;
    public int f26189l;
    public int f26190m;
    public int f26191n;
    public float f26193p;
    public boolean f26194q;
    public float f26196s;
    public float f26197t;
    public long f26198u;
    public final View v;
    public float f26201y;
    public int f26202z;
    public int f26182b = 0;
    public float f26183c = 0.0f;
    public int d = 0;
    public int e = 0;
    public boolean f26184f = false;
    public boolean f26185g = false;
    public final RectF f26192o = new RectF();
    public float f26195r = 1.0f;
    public final int f26199w = AndroidUtilities.dp(4.0f);
    public final int f26200x = AndroidUtilities.dp(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public k71(View view) {
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
        this.f26197t = AndroidUtilities.dp(6.0f);
        this.D = new z5(0.0f, view, 0L, 300L, mr.h);
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
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, this.f26201y) + this.f26202z;
        RectF rectF = this.f26192o;
        rectF.left = lerp;
        int i17 = this.f26186i;
        int i18 = this.f26199w;
        rectF.top = AndroidUtilities.lerp((i17 - i18) / 2.0f, (i17 - AndroidUtilities.dp(3.0f)) - this.f26200x, this.f26201y);
        int i19 = this.f26186i;
        rectF.bottom = AndroidUtilities.lerp((i19 + i18) / 2.0f, i19 - AndroidUtilities.dp(3.0f), this.f26201y);
        float f18 = this.f26182b;
        float min = Math.min(this.f26183c, f18);
        this.f26183c = min;
        float lerp2 = AndroidUtilities.lerp(min, f18, 0.5f);
        this.f26183c = lerp2;
        float abs = Math.abs(f18 - lerp2);
        View view3 = this.v;
        if (abs > 0.005f) {
            view3.invalidate();
        }
        float f19 = this.f26183c;
        float f20 = this.C;
        if (f20 != 1.0f) {
            float f21 = f20 + 0.07272727f;
            this.C = f21;
            if (f21 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = mr.f27122f.getInterpolation(this.C);
                f19 = (f19 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float d = this.D.d(0.0f, false);
        if (this.f26184f) {
            d = 0.0f;
        }
        rectF.right = AndroidUtilities.lerp(this.h - (S / 2.0f), view3.getWidth() - (this.f26202z * 2.0f), this.f26201y) + this.f26202z;
        g(1.0f - this.f26201y, this.f26188k);
        b(canvas, rectF, Q);
        float f22 = this.f26195r;
        if (f22 != 1.0f) {
            float f23 = f22 + 0.16f;
            this.f26195r = f23;
            if (f23 > 1.0f) {
                this.f26195r = 1.0f;
            } else {
                view3.invalidate();
            }
        }
        if (this.f26194q) {
            float f24 = this.f26193p;
            if (f24 > 0.0f) {
                f10 = 2.0f;
                rectF.right = AndroidUtilities.lerp((f24 * (this.h - i16)) + (S / 2.0f), view3.getWidth() - (this.f26202z * 2.0f), this.f26201y) + this.f26202z;
                g((1.0f - this.f26195r) * (1.0f - this.f26201y), this.f26189l);
                b(canvas, rectF, Q);
            } else {
                f10 = 2.0f;
            }
            float f25 = this.f26196s;
            if (f25 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f25 * (this.h - i15)) + (S / f10), view3.getWidth() - (this.f26202z * f10), this.f26201y) + this.f26202z;
                g(1.0f - this.f26201y, this.f26189l);
                b(canvas, rectF, Q);
            }
        } else {
            f10 = 2.0f;
            float f26 = this.f26193p;
            float f27 = this.f26195r;
            float f28 = (this.f26196s * f27) + ((1.0f - f27) * f26);
            if (f28 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f28 * (this.h - i10)) + (S / 2.0f), view3.getWidth() - (this.f26202z * 2.0f), this.f26201y) + this.f26202z;
                g(1.0f - this.f26201y, this.f26189l);
                b(canvas, rectF, Q);
            }
        }
        if (this.f26184f) {
            f11 = 8.0f;
        } else {
            f11 = 6.0f;
        }
        float dp = AndroidUtilities.dp(f11);
        if (this.f26197t != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            view2 = view3;
            long j10 = elapsedRealtime - this.f26198u;
            this.f26198u = elapsedRealtime;
            if (j10 > 18) {
                j10 = 16;
            }
            float f29 = this.f26197t;
            if (f29 < dp) {
                c3 = 0;
                float c11 = vh.w2.c((float) j10, 60.0f, AndroidUtilities.dp(1.0f), f29);
                this.f26197t = c11;
                if (c11 > dp) {
                    this.f26197t = dp;
                }
            } else {
                c3 = 0;
                float A = org.telegram.messenger.y3.A((float) j10, 60.0f, AndroidUtilities.dp(1.0f), f29);
                this.f26197t = A;
                if (A < dp) {
                    this.f26197t = dp;
                }
            }
            view2.invalidate();
        } else {
            view2 = view3;
            c3 = 0;
        }
        float lerp3 = AndroidUtilities.lerp(this.f26197t, 0.0f, this.f26201y);
        if (d > 0.0f) {
            float f30 = rectF.left;
            f12 = 0.2f;
            f13 = 8.0f;
            float lerp4 = AndroidUtilities.lerp((S / f10) + (this.h - i13), view2.getWidth() - (this.f26202z * f10), this.f26201y) + this.f26202z;
            rectF.right = lerp4;
            rectF.left = AndroidUtilities.lerp(f30, lerp4, 1.0f - d);
            if (this.f26201y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.f26201y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.a.d(this.f26201y, this.f26191n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f30;
            int i20 = this.f26190m;
            if (c() == 0.0f) {
                i14 = 0;
            } else {
                i14 = this.A;
            }
            g(1.0f - this.f26201y, i0.a.d(this.f26201y, i20, i14));
            canvas.drawCircle(AndroidUtilities.lerp((S / f10) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.f26202z * f10)), this.f26201y) + this.f26202z, rectF.centerY(), lerp3 * d, Q);
        } else {
            f12 = 0.2f;
            f13 = 8.0f;
        }
        float f31 = this.f26202z;
        float f32 = S / f10;
        if (this.f26184f) {
            f19 = this.d;
        }
        rectF.right = AndroidUtilities.lerp(f32 + f19, c() * (view2.getWidth() - (this.f26202z * f10)), this.f26201y) + f31;
        if (this.f26201y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.f26201y * 255.0f * f12));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.a.d(this.f26201y, this.f26191n, this.A));
        b(canvas, rectF, Q);
        int i21 = this.f26190m;
        if (c() == 0.0f) {
            i11 = 0;
        } else {
            i11 = this.A;
        }
        g(1.0f - this.f26201y, i0.a.d(this.f26201y, i21, i11));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - d) * lerp3, Q);
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!this.f26184f && !this.f26185g) {
                f14 = this.f26183c;
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
            float lerp5 = AndroidUtilities.lerp(S / f10, 0.0f, this.f26201y) + this.f26202z;
            float lerp6 = AndroidUtilities.lerp(this.h - (S / f10), view2.getWidth() - (this.f26202z * f10), this.f26201y) + this.f26202z;
            float f34 = (this.h - (S / f10)) + this.f26202z;
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
                if (this.f26184f) {
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
            float interpolation2 = mr.f27122f.getInterpolation(this.M);
            canvas.save();
            int i23 = this.f26186i;
            canvas.translate(((lerp6 - f34) * this.f26201y) + lerp5, AndroidUtilities.lerp((i23 + i12) / f10, i23 - AndroidUtilities.dp(f15), this.f26201y) + AndroidUtilities.dp(12.0f));
            if (this.K[c10] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate((AndroidUtilities.dp(f16) * (-this.N) * interpolation2) + AndroidUtilities.dp(f13), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c10].getHeight()) / f10);
                this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.f26201y) * 255.0f * this.I));
                this.K[c10].draw(canvas);
                canvas.restore();
            }
            if (this.K[c3] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate(e2.c.w(1.0f, interpolation2, AndroidUtilities.dp(f16) * this.N, AndroidUtilities.dp(f13)), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c3].getHeight()) / f10);
                this.L.setAlpha((int) (org.telegram.messenger.y3.y(1.0f, this.f26201y, 255.0f, interpolation2) * this.I));
                this.K[c3].draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void b(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k71.b(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final float c() {
        return this.f26182b / (this.h - S);
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
        j71 j71Var;
        if (i10 == 0) {
            if (this.f26201y <= 0.0f) {
                int i11 = this.f26186i;
                int i12 = S;
                int i13 = (i11 - i12) / 2;
                if (f10 >= (-i13)) {
                    int i14 = this.h;
                    if (f10 <= i14 + i13 && f11 >= 0.0f && f11 <= i11) {
                        int i15 = this.f26182b;
                        if (i15 - i13 > f10 || f10 > i15 + i12 + i13) {
                            int i16 = ((int) f10) - (i12 / 2);
                            this.f26182b = i16;
                            if (i16 < 0) {
                                this.f26182b = 0;
                            } else if (i16 > i14 - i12) {
                                this.f26182b = i12 - i14;
                            }
                            this.f26183c = this.f26182b;
                        }
                        this.f26185g = true;
                        this.f26184f = true;
                        int i17 = this.f26182b;
                        this.d = i17;
                        this.e = (int) (f10 - i17);
                        return true;
                    }
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f26184f) {
                int i18 = (int) (f10 - this.e);
                this.d = i18;
                if (i18 < 0) {
                    this.d = 0;
                } else {
                    int i19 = this.h - S;
                    if (i18 > i19) {
                        this.d = i19;
                    }
                }
                j71 j71Var2 = this.f26187j;
                if (j71Var2 != null) {
                    j71Var2.d(this.d / (this.h - S));
                }
                return true;
            }
        } else if (this.f26184f) {
            int i20 = this.d;
            this.f26182b = i20;
            float f12 = i20;
            this.f26183c = f12;
            if (i10 == 1 && (j71Var = this.f26187j) != null) {
                j71Var.b(f12 / (this.h - S));
            }
            this.f26184f = false;
            AndroidUtilities.runOnUIThread(new z61(this, 2), 50L);
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        boolean z4;
        float f11 = this.f26196s;
        if (f10 != f11) {
            this.f26193p = f11;
            if (f10 < f11) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f26194q = z4;
            this.f26196s = f10;
            this.f26195r = 0.0f;
        }
    }

    public final void h(float f10, boolean z4) {
        if (Math.abs(this.f26181a - 1.0f) < 0.04f && Math.abs(f10) < 0.04f) {
            this.D.d(1.0f, true);
            this.E = this.f26182b;
        }
        this.f26181a = f10;
        int ceil = (int) Math.ceil((this.h - S) * f10);
        if (z4) {
            if (Math.abs(ceil - this.f26182b) > AndroidUtilities.dp(10.0f)) {
                float interpolation = mr.f27122f.getInterpolation(this.C);
                this.B = (int) e2.c.w(1.0f, interpolation, this.B, this.f26182b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.f26182b;
            }
        }
        this.f26182b = ceil;
        if (ceil < 0) {
            this.f26182b = 0;
        } else {
            int i10 = this.h - S;
            if (ceil > i10) {
                this.f26182b = i10;
            }
        }
        if (Math.abs(this.f26183c - this.f26182b) > AndroidUtilities.dp(8.0f)) {
            this.f26183c = this.f26182b;
        }
    }
}
