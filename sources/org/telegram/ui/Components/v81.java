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
import org.telegram.messenger.AndroidUtilities;
public final class v81 {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final h6 D;
    public float E;
    public ArrayList F;
    public CharSequence G;
    public long H;
    public StaticLayout[] K;
    public TextPaint L;
    public int N;
    public long O;
    public float f33608a;
    public int h;
    public int f33613i;
    public u81 f33614j;
    public int f33615k;
    public int f33616l;
    public int f33617m;
    public int f33618n;
    public float f33620p;
    public boolean f33621q;
    public float f33623s;
    public float f33624t;
    public long f33625u;
    public final View v;
    public float f33628y;
    public int f33629z;
    public int f33609b = 0;
    public float f33610c = 0.0f;
    public int d = 0;
    public int e = 0;
    public boolean f33611f = false;
    public boolean f33612g = false;
    public final RectF f33619o = new RectF();
    public float f33622r = 1.0f;
    public final int f33626w = AndroidUtilities.dp(4.0f);
    public final int f33627x = AndroidUtilities.dp(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public v81(View view) {
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
        this.f33624t = AndroidUtilities.dp(6.0f);
        this.D = new h6(0.0f, view, 0L, 300L, ds.h);
    }

    public static void g(float f7, int i10) {
        if (f7 < 1.0f) {
            i10 = i0.a.o(i10, (int) (Color.alpha(i10) * f7));
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
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, this.f33628y) + this.f33629z;
        RectF rectF = this.f33619o;
        rectF.left = lerp;
        int i18 = this.f33613i;
        int i19 = this.f33626w;
        rectF.top = AndroidUtilities.lerp((i18 - i19) / 2.0f, (i18 - AndroidUtilities.dp(3.0f)) - this.f33627x, this.f33628y);
        int i20 = this.f33613i;
        rectF.bottom = AndroidUtilities.lerp((i20 + i19) / 2.0f, i20 - AndroidUtilities.dp(3.0f), this.f33628y);
        float f19 = this.f33609b;
        float min = Math.min(this.f33610c, f19);
        this.f33610c = min;
        float lerp2 = AndroidUtilities.lerp(min, f19, 0.5f);
        this.f33610c = lerp2;
        int i21 = (Math.abs(f19 - lerp2) > 0.005f ? 1 : (Math.abs(f19 - lerp2) == 0.005f ? 0 : -1));
        View view2 = this.v;
        if (i21 > 0) {
            view2.invalidate();
        }
        float f20 = this.f33610c;
        float f21 = this.C;
        if (f21 != 1.0f) {
            float f22 = f21 + 0.07272727f;
            this.C = f22;
            if (f22 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = ds.f27530f.getInterpolation(this.C);
                f20 = (f20 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float d = this.D.d(0.0f, false);
        if (this.f33611f) {
            d = 0.0f;
        }
        rectF.right = AndroidUtilities.lerp(this.h - (S / 2.0f), view2.getWidth() - (this.f33629z * 2.0f), this.f33628y) + this.f33629z;
        g(1.0f - this.f33628y, this.f33615k);
        b(canvas, rectF, Q);
        float f23 = this.f33622r;
        if (f23 != 1.0f) {
            float f24 = f23 + 0.16f;
            this.f33622r = f24;
            if (f24 > 1.0f) {
                this.f33622r = 1.0f;
            } else {
                view2.invalidate();
            }
        }
        if (this.f33621q) {
            float f25 = this.f33620p;
            if (f25 > 0.0f) {
                f7 = 2.0f;
                rectF.right = AndroidUtilities.lerp((f25 * (this.h - i17)) + (S / 2.0f), view2.getWidth() - (this.f33629z * 2.0f), this.f33628y) + this.f33629z;
                g((1.0f - this.f33622r) * (1.0f - this.f33628y), this.f33616l);
                b(canvas, rectF, Q);
            } else {
                f7 = 2.0f;
            }
            float f26 = this.f33623s;
            if (f26 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f26 * (this.h - i16)) + (S / f7), view2.getWidth() - (this.f33629z * f7), this.f33628y) + this.f33629z;
                g(1.0f - this.f33628y, this.f33616l);
                b(canvas, rectF, Q);
            }
        } else {
            f7 = 2.0f;
            float f27 = this.f33620p;
            float f28 = this.f33622r;
            float f29 = (this.f33623s * f28) + ((1.0f - f28) * f27);
            if (f29 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f29 * (this.h - i10)) + (S / 2.0f), view2.getWidth() - (this.f33629z * 2.0f), this.f33628y) + this.f33629z;
                g(1.0f - this.f33628y, this.f33616l);
                b(canvas, rectF, Q);
            }
        }
        if (this.f33611f) {
            f10 = 8.0f;
        } else {
            f10 = 6.0f;
        }
        float dp = AndroidUtilities.dp(f10);
        if (this.f33624t != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f11 = 3.0f;
            f12 = d;
            long j10 = elapsedRealtime - this.f33625u;
            this.f33625u = elapsedRealtime;
            if (j10 > 18) {
                j10 = 16;
            }
            float f30 = this.f33624t;
            i11 = 0;
            if (f30 < dp) {
                float c11 = a1.g.c((float) j10, 60.0f, AndroidUtilities.dp(1.0f), f30);
                this.f33624t = c11;
                if (c11 > dp) {
                    this.f33624t = dp;
                }
            } else {
                float w10 = org.telegram.messenger.wh.w((float) j10, 60.0f, AndroidUtilities.dp(1.0f), f30);
                this.f33624t = w10;
                if (w10 < dp) {
                    this.f33624t = dp;
                }
            }
            view2.invalidate();
        } else {
            f11 = 3.0f;
            f12 = d;
            i11 = 0;
        }
        float lerp3 = AndroidUtilities.lerp(this.f33624t, 0.0f, this.f33628y);
        if (f12 > 0.0f) {
            float f31 = rectF.left;
            f13 = 0.2f;
            f14 = 8.0f;
            float lerp4 = AndroidUtilities.lerp((S / f7) + (this.h - i14), view2.getWidth() - (this.f33629z * f7), this.f33628y) + this.f33629z;
            rectF.right = lerp4;
            rectF.left = AndroidUtilities.lerp(f31, lerp4, 1.0f - f12);
            if (this.f33628y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.f33628y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.a.f(this.f33628y, this.f33618n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f31;
            int i22 = this.f33617m;
            if (c() == 0.0f) {
                i15 = i11;
            } else {
                i15 = this.A;
            }
            g(1.0f - this.f33628y, i0.a.f(this.f33628y, i22, i15));
            canvas.drawCircle(AndroidUtilities.lerp((S / f7) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.f33629z * f7)), this.f33628y) + this.f33629z, rectF.centerY(), lerp3 * f12, Q);
        } else {
            f13 = 0.2f;
            f14 = 8.0f;
        }
        float f32 = this.f33629z;
        float f33 = S / f7;
        if (this.f33611f) {
            f20 = this.d;
        }
        rectF.right = AndroidUtilities.lerp(f33 + f20, c() * (view2.getWidth() - (this.f33629z * f7)), this.f33628y) + f32;
        if (this.f33628y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.f33628y * 255.0f * f13));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.a.f(this.f33628y, this.f33618n, this.A));
        b(canvas, rectF, Q);
        int i23 = this.f33617m;
        if (c() == 0.0f) {
            i12 = i11;
        } else {
            i12 = this.A;
        }
        g(1.0f - this.f33628y, i0.a.f(this.f33628y, i23, i12));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - f12) * lerp3, Q);
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!this.f33611f && !this.f33612g) {
                f15 = this.f33610c;
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
            float lerp5 = AndroidUtilities.lerp(S / f7, 0.0f, this.f33628y) + this.f33629z;
            float lerp6 = AndroidUtilities.lerp(this.h - (S / f7), view2.getWidth() - (this.f33629z * f7), this.f33628y) + this.f33629z;
            float f35 = (this.h - (S / f7)) + this.f33629z;
            float abs = Math.abs(lerp5 - f35) - AndroidUtilities.dp(16.0f);
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
                if (this.f33611f) {
                    AndroidUtilities.vibrateCursor(view2);
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
            float interpolation2 = ds.f27530f.getInterpolation(this.M);
            canvas.save();
            int i25 = this.f33613i;
            canvas.translate(((lerp6 - f35) * this.f33628y) + lerp5, AndroidUtilities.lerp((i25 + i13) / f7, i25 - AndroidUtilities.dp(f17), this.f33628y) + AndroidUtilities.dp(12.0f));
            if (this.K[c10] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate((AndroidUtilities.dp(16.0f) * (-this.N) * interpolation2) + AndroidUtilities.dp(f14), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c10].getHeight()) / f7);
                this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.f33628y) * f16 * this.I));
                this.K[c10].draw(canvas);
                canvas.restore();
            }
            if (this.K[i11] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate(c3.h0.z(1.0f, interpolation2, AndroidUtilities.dp(16.0f) * this.N, AndroidUtilities.dp(f14)), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[i11].getHeight()) / f7);
                this.L.setAlpha((int) (org.telegram.messenger.t.A(1.0f, this.f33628y, f16, interpolation2) * this.I));
                this.K[i11].draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void b(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v81.b(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final float c() {
        return this.f33609b / (this.h - S);
    }

    public final StaticLayout d(int i10, CharSequence charSequence) {
        if (this.L == null) {
            TextPaint textPaint = new TextPaint(1);
            this.L = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.L.setColor(-1);
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.L, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
    }

    public final boolean e(float f7, float f10, int i10) {
        u81 u81Var;
        if (i10 == 0) {
            if (this.f33628y <= 0.0f) {
                int i11 = this.f33613i;
                int i12 = S;
                int i13 = (i11 - i12) / 2;
                if (f7 >= (-i13)) {
                    int i14 = this.h;
                    if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                        int i15 = this.f33609b;
                        if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                            int i16 = ((int) f7) - (i12 / 2);
                            this.f33609b = i16;
                            if (i16 < 0) {
                                this.f33609b = 0;
                            } else if (i16 > i14 - i12) {
                                this.f33609b = i12 - i14;
                            }
                            this.f33610c = this.f33609b;
                        }
                        this.f33612g = true;
                        this.f33611f = true;
                        int i17 = this.f33609b;
                        this.d = i17;
                        this.e = (int) (f7 - i17);
                        return true;
                    }
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f33611f) {
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
                u81 u81Var2 = this.f33614j;
                if (u81Var2 != null) {
                    u81Var2.f(this.d / (this.h - S));
                }
                return true;
            }
        } else if (this.f33611f) {
            int i20 = this.d;
            this.f33609b = i20;
            float f11 = i20;
            this.f33610c = f11;
            if (i10 == 1 && (u81Var = this.f33614j) != null) {
                u81Var.c(f11 / (this.h - S));
            }
            this.f33611f = false;
            AndroidUtilities.runOnUIThread(new t51(this, 8), 50L);
            return true;
        }
        return false;
    }

    public final void f(float f7) {
        boolean z10;
        float f10 = this.f33623s;
        if (f7 != f10) {
            this.f33620p = f10;
            if (f7 < f10) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f33621q = z10;
            this.f33623s = f7;
            this.f33622r = 0.0f;
        }
    }

    public final void h(float f7, boolean z10) {
        if (Math.abs(this.f33608a - 1.0f) < 0.04f && Math.abs(f7) < 0.04f) {
            this.D.d(1.0f, true);
            this.E = this.f33609b;
        }
        this.f33608a = f7;
        int ceil = (int) Math.ceil((this.h - S) * f7);
        if (z10) {
            if (Math.abs(ceil - this.f33609b) > AndroidUtilities.dp(10.0f)) {
                float interpolation = ds.f27530f.getInterpolation(this.C);
                this.B = (int) c3.h0.z(1.0f, interpolation, this.B, this.f33609b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.f33609b;
            }
        }
        this.f33609b = ceil;
        if (ceil < 0) {
            this.f33609b = 0;
        } else {
            int i10 = this.h - S;
            if (ceil > i10) {
                this.f33609b = i10;
            }
        }
        if (Math.abs(this.f33610c - this.f33609b) > AndroidUtilities.dp(8.0f)) {
            this.f33610c = this.f33609b;
        }
    }
}
