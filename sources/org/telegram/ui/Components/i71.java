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
public final class i71 {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final e6 D;
    public float E;
    public ArrayList F;
    public CharSequence G;
    public long H;
    public StaticLayout[] K;
    public TextPaint L;
    public int N;
    public long O;
    public float f26986a;
    public int h;
    public int f26992i;
    public h71 f26993j;
    public int f26994k;
    public int f26995l;
    public int f26996m;
    public int f26997n;
    public float f26999p;
    public boolean f27000q;
    public float f27002s;
    public float f27003t;
    public long f27004u;
    public final View v;
    public float f27007y;
    public int f27008z;
    public int f26987b = 0;
    public float f26988c = 0.0f;
    public int d = 0;
    public int f26989e = 0;
    public boolean f26990f = false;
    public boolean f26991g = false;
    public final RectF f26998o = new RectF();
    public float f27001r = 1.0f;
    public final int f27005w = AndroidUtilities.dp(4.0f);
    public final int f27006x = AndroidUtilities.dp(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public i71(View view) {
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
        this.f27003t = AndroidUtilities.dp(6.0f);
        this.D = new e6(0.0f, view, 0L, 300L, pr.h);
    }

    public static void g(float f7, int i10) {
        if (f7 < 1.0f) {
            i10 = i0.a.k(i10, (int) (Color.alpha(i10) * f7));
        }
        Q.setColor(i10);
    }

    public final void a(Canvas canvas, View view) {
        float f7;
        int i10;
        float f10;
        View view2;
        char c10;
        float f11;
        float f12;
        int i11;
        float f13;
        float f14;
        float f15;
        int i12;
        char c11;
        float f16;
        int i13;
        int i14;
        int i15;
        int i16;
        float lerp = AndroidUtilities.lerp(S / 2.0f, 0.0f, this.f27007y) + this.f27008z;
        RectF rectF = this.f26998o;
        rectF.left = lerp;
        int i17 = this.f26992i;
        int i18 = this.f27005w;
        rectF.top = AndroidUtilities.lerp((i17 - i18) / 2.0f, (i17 - AndroidUtilities.dp(3.0f)) - this.f27006x, this.f27007y);
        int i19 = this.f26992i;
        rectF.bottom = AndroidUtilities.lerp((i19 + i18) / 2.0f, i19 - AndroidUtilities.dp(3.0f), this.f27007y);
        float f17 = this.f26987b;
        float min = Math.min(this.f26988c, f17);
        this.f26988c = min;
        float lerp2 = AndroidUtilities.lerp(min, f17, 0.5f);
        this.f26988c = lerp2;
        float abs = Math.abs(f17 - lerp2);
        View view3 = this.v;
        if (abs > 0.005f) {
            view3.invalidate();
        }
        float f18 = this.f26988c;
        float f19 = this.C;
        if (f19 != 1.0f) {
            float f20 = f19 + 0.07272727f;
            this.C = f20;
            if (f20 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = pr.f29467f.getInterpolation(this.C);
                f18 = (f18 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float d = this.D.d(0.0f, false);
        if (this.f26990f) {
            d = 0.0f;
        }
        rectF.right = AndroidUtilities.lerp(this.h - (S / 2.0f), view3.getWidth() - (this.f27008z * 2.0f), this.f27007y) + this.f27008z;
        g(1.0f - this.f27007y, this.f26994k);
        b(canvas, rectF, Q);
        float f21 = this.f27001r;
        if (f21 != 1.0f) {
            float f22 = f21 + 0.16f;
            this.f27001r = f22;
            if (f22 > 1.0f) {
                this.f27001r = 1.0f;
            } else {
                view3.invalidate();
            }
        }
        if (this.f27000q) {
            float f23 = this.f26999p;
            if (f23 > 0.0f) {
                f7 = 2.0f;
                rectF.right = AndroidUtilities.lerp((f23 * (this.h - i16)) + (S / 2.0f), view3.getWidth() - (this.f27008z * 2.0f), this.f27007y) + this.f27008z;
                g((1.0f - this.f27001r) * (1.0f - this.f27007y), this.f26995l);
                b(canvas, rectF, Q);
            } else {
                f7 = 2.0f;
            }
            float f24 = this.f27002s;
            if (f24 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f24 * (this.h - i15)) + (S / f7), view3.getWidth() - (this.f27008z * f7), this.f27007y) + this.f27008z;
                g(1.0f - this.f27007y, this.f26995l);
                b(canvas, rectF, Q);
            }
        } else {
            f7 = 2.0f;
            float f25 = this.f26999p;
            float f26 = this.f27001r;
            float f27 = (this.f27002s * f26) + ((1.0f - f26) * f25);
            if (f27 > 0.0f) {
                rectF.right = AndroidUtilities.lerp((f27 * (this.h - i10)) + (S / 2.0f), view3.getWidth() - (this.f27008z * 2.0f), this.f27007y) + this.f27008z;
                g(1.0f - this.f27007y, this.f26995l);
                b(canvas, rectF, Q);
            }
        }
        if (this.f26990f) {
            f10 = 8.0f;
        } else {
            f10 = 6.0f;
        }
        float dp = AndroidUtilities.dp(f10);
        if (this.f27003t != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            view2 = view3;
            long j3 = elapsedRealtime - this.f27004u;
            this.f27004u = elapsedRealtime;
            if (j3 > 18) {
                j3 = 16;
            }
            float f28 = this.f27003t;
            if (f28 < dp) {
                c10 = 0;
                float e7 = a4.a.e((float) j3, 60.0f, AndroidUtilities.dp(1.0f), f28);
                this.f27003t = e7;
                if (e7 > dp) {
                    this.f27003t = dp;
                }
            } else {
                c10 = 0;
                float c12 = org.telegram.messenger.vl.c((float) j3, 60.0f, AndroidUtilities.dp(1.0f), f28);
                this.f27003t = c12;
                if (c12 < dp) {
                    this.f27003t = dp;
                }
            }
            view2.invalidate();
        } else {
            view2 = view3;
            c10 = 0;
        }
        float lerp3 = AndroidUtilities.lerp(this.f27003t, 0.0f, this.f27007y);
        if (d > 0.0f) {
            float f29 = rectF.left;
            f11 = 0.2f;
            f12 = 8.0f;
            float lerp4 = AndroidUtilities.lerp((S / f7) + (this.h - i13), view2.getWidth() - (this.f27008z * f7), this.f27007y) + this.f27008z;
            rectF.right = lerp4;
            rectF.left = AndroidUtilities.lerp(f29, lerp4, 1.0f - d);
            if (this.f27007y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.f27007y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, i0.a.d(this.f27007y, this.f26997n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f29;
            int i20 = this.f26996m;
            if (c() == 0.0f) {
                i14 = 0;
            } else {
                i14 = this.A;
            }
            g(1.0f - this.f27007y, i0.a.d(this.f27007y, i20, i14));
            canvas.drawCircle(AndroidUtilities.lerp((S / f7) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.f27008z * f7)), this.f27007y) + this.f27008z, rectF.centerY(), lerp3 * d, Q);
        } else {
            f11 = 0.2f;
            f12 = 8.0f;
        }
        float f30 = this.f27008z;
        float f31 = S / f7;
        if (this.f26990f) {
            f18 = this.d;
        }
        rectF.right = AndroidUtilities.lerp(f31 + f18, c() * (view2.getWidth() - (this.f27008z * f7)), this.f27007y) + f30;
        if (this.f27007y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.f27007y * 255.0f * f11));
            b(canvas, rectF, R);
        }
        g(1.0f, i0.a.d(this.f27007y, this.f26997n, this.A));
        b(canvas, rectF, Q);
        int i21 = this.f26996m;
        if (c() == 0.0f) {
            i11 = 0;
        } else {
            i11 = this.A;
        }
        g(1.0f - this.f27007y, i0.a.d(this.f27007y, i21, i11));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - d) * lerp3, Q);
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!this.f26990f && !this.f26991g) {
                f13 = this.f26988c;
            } else {
                f13 = this.d;
            }
            float f32 = f13 / (this.h - S);
            int size = this.F.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((Float) ((Pair) this.F.get(size)).first).floatValue() - 0.001f <= f32) {
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
            float lerp5 = AndroidUtilities.lerp(S / f7, 0.0f, this.f27007y) + this.f27008z;
            float lerp6 = AndroidUtilities.lerp(this.h - (S / f7), view2.getWidth() - (this.f27008z * f7), this.f27007y) + this.f27008z;
            float f33 = (this.h - (S / f7)) + this.f27008z;
            float abs2 = Math.abs(lerp5 - f33) - AndroidUtilities.dp(16.0f);
            float f34 = this.P;
            if (f34 > 0.0f && Math.abs(f34 - abs2) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.K;
                StaticLayout staticLayout = staticLayoutArr[c10];
                if (staticLayout != null) {
                    f15 = 16.0f;
                    CharSequence text = staticLayout.getText();
                    f14 = 3.0f;
                    staticLayoutArr[c10] = d((int) abs2, text);
                } else {
                    f14 = 3.0f;
                    f15 = 16.0f;
                }
                StaticLayout[] staticLayoutArr2 = this.K;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = d((int) abs2, staticLayout2.getText());
                }
            } else {
                f14 = 3.0f;
                f15 = 16.0f;
            }
            this.P = abs2;
            if (size != this.J) {
                StaticLayout[] staticLayoutArr3 = this.K;
                staticLayoutArr3[1] = staticLayoutArr3[c10];
                if (this.f26990f) {
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
                c11 = 1;
                long min2 = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O));
                if (this.F.size() > 8) {
                    f16 = 160.0f;
                } else {
                    f16 = 220.0f;
                }
                this.M = Math.min((((float) min2) / f16) + this.M, 1.0f);
                view2.invalidate();
                this.O = SystemClock.elapsedRealtime();
            } else {
                i12 = i18;
                c11 = 1;
            }
            if (this.I < 1.0f) {
                this.I = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O))) / 200.0f) + this.I, 1.0f);
                view2.invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation2 = pr.f29467f.getInterpolation(this.M);
            canvas.save();
            int i23 = this.f26992i;
            canvas.translate(((lerp6 - f33) * this.f27007y) + lerp5, AndroidUtilities.lerp((i23 + i12) / f7, i23 - AndroidUtilities.dp(f14), this.f27007y) + AndroidUtilities.dp(12.0f));
            if (this.K[c11] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate((AndroidUtilities.dp(f15) * (-this.N) * interpolation2) + AndroidUtilities.dp(f12), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c11].getHeight()) / f7);
                this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.f27007y) * 255.0f * this.I));
                this.K[c11].draw(canvas);
                canvas.restore();
            }
            if (this.K[c10] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate(com.google.android.gms.internal.vision.e2.z(1.0f, interpolation2, AndroidUtilities.dp(f15) * this.N, AndroidUtilities.dp(f12)), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c10].getHeight()) / f7);
                this.L.setAlpha((int) (org.telegram.messenger.w1.A(1.0f, this.f27007y, 255.0f, interpolation2) * this.I));
                this.K[c10].draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void b(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i71.b(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final float c() {
        return this.f26987b / (this.h - S);
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

    public final boolean e(float f7, float f10, int i10) {
        h71 h71Var;
        if (i10 == 0) {
            if (this.f27007y <= 0.0f) {
                int i11 = this.f26992i;
                int i12 = S;
                int i13 = (i11 - i12) / 2;
                if (f7 >= (-i13)) {
                    int i14 = this.h;
                    if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                        int i15 = this.f26987b;
                        if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                            int i16 = ((int) f7) - (i12 / 2);
                            this.f26987b = i16;
                            if (i16 < 0) {
                                this.f26987b = 0;
                            } else if (i16 > i14 - i12) {
                                this.f26987b = i12 - i14;
                            }
                            this.f26988c = this.f26987b;
                        }
                        this.f26991g = true;
                        this.f26990f = true;
                        int i17 = this.f26987b;
                        this.d = i17;
                        this.f26989e = (int) (f7 - i17);
                        return true;
                    }
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f26990f) {
                int i18 = (int) (f7 - this.f26989e);
                this.d = i18;
                if (i18 < 0) {
                    this.d = 0;
                } else {
                    int i19 = this.h - S;
                    if (i18 > i19) {
                        this.d = i19;
                    }
                }
                h71 h71Var2 = this.f26993j;
                if (h71Var2 != null) {
                    h71Var2.c(this.d / (this.h - S));
                }
                return true;
            }
        } else if (this.f26990f) {
            int i20 = this.d;
            this.f26987b = i20;
            float f11 = i20;
            this.f26988c = f11;
            if (i10 == 1 && (h71Var = this.f26993j) != null) {
                h71Var.b(f11 / (this.h - S));
            }
            this.f26990f = false;
            AndroidUtilities.runOnUIThread(new x61(this, 2), 50L);
            return true;
        }
        return false;
    }

    public final void f(float f7) {
        boolean z10;
        float f10 = this.f27002s;
        if (f7 != f10) {
            this.f26999p = f10;
            if (f7 < f10) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f27000q = z10;
            this.f27002s = f7;
            this.f27001r = 0.0f;
        }
    }

    public final void h(float f7, boolean z10) {
        if (Math.abs(this.f26986a - 1.0f) < 0.04f && Math.abs(f7) < 0.04f) {
            this.D.d(1.0f, true);
            this.E = this.f26987b;
        }
        this.f26986a = f7;
        int ceil = (int) Math.ceil((this.h - S) * f7);
        if (z10) {
            if (Math.abs(ceil - this.f26987b) > AndroidUtilities.dp(10.0f)) {
                float interpolation = pr.f29467f.getInterpolation(this.C);
                this.B = (int) com.google.android.gms.internal.vision.e2.z(1.0f, interpolation, this.B, this.f26987b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.f26987b;
            }
        }
        this.f26987b = ceil;
        if (ceil < 0) {
            this.f26987b = 0;
        } else {
            int i10 = this.h - S;
            if (ceil > i10) {
                this.f26987b = i10;
            }
        }
        if (Math.abs(this.f26988c - this.f26987b) > AndroidUtilities.dp(8.0f)) {
            this.f26988c = this.f26987b;
        }
    }
}
