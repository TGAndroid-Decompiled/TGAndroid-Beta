package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
public final class pm0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public w5 B;
    public Paint C;
    public float D;
    public int E;
    public int F;
    public float[] G;
    public float[] H;
    public float[] I;
    public boolean J;
    public float K;
    public float L;
    public om0 M;
    public int f36994a;
    public int f36995b;
    public float f36996c;
    public float d;
    public boolean f36997e;
    public boolean f36998f;
    public int f36999g;
    public int h;
    public int f37000i;
    public int f37001j;
    public org.telegram.ui.Cells.q1 f37002k;
    public byte[] f37003l;
    public org.telegram.messenger.ij f37004m;
    public org.telegram.ui.Cells.q1 f37005n;
    public boolean f37006o;
    public int f37007p;
    public int f37008q;
    public int f37009r;
    public float f37010s;
    public float f37011t;
    public boolean f37012u;
    public w5 v;
    public float f37013w;
    public Path f37014x;
    public Path f37015y;
    public boolean f37016z;

    public final void a(Path path, float f10, float f11) {
        float N2 = org.telegram.messenger.g0.N(2.0f);
        int y10 = org.telegram.messenger.camera.q.y(14.0f, this.h, 2);
        float f12 = f11 * this.f37013w;
        RectF rectF = org.telegram.messenger.g0.P;
        float f13 = N2 / 2.0f;
        rectF.set((org.telegram.messenger.g0.N(1.0f) + f10) - f13, ((-f12) - f13) + org.telegram.messenger.g0.L(7.0f) + y10, org.telegram.messenger.g0.N(1.0f) + f10 + f13, f12 + f13 + org.telegram.messenger.g0.L(7.0f) + y10);
        path.addRoundRect(rectF, N2, N2, Path.Direction.CW);
    }

    public final float[] b(int i7) {
        int i10;
        byte[] bArr = this.f37003l;
        if (bArr != null && i7 > 0) {
            float[] fArr = new float[i7];
            int i11 = 5;
            int length = (bArr.length * 8) / 5;
            float f10 = length / i7;
            float f11 = 0.0f;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            loop0: while (i12 < length) {
                if (i12 == i13) {
                    int i15 = i13;
                    int i16 = 0;
                    while (i13 == i15) {
                        f11 += f10;
                        i15 = (int) f11;
                        i16++;
                    }
                    int i17 = i12 * 5;
                    int i18 = i17 / 8;
                    int i19 = i17 - (i18 * 8);
                    int i20 = 5 - (8 - i19);
                    byte min = (byte) ((this.f37003l[i18] >> i19) & ((2 << (Math.min(i11, i10) - 1)) - 1));
                    if (i20 > 0) {
                        int i21 = i18 + 1;
                        byte[] bArr2 = this.f37003l;
                        if (i21 < bArr2.length) {
                            min = (byte) (((byte) (min << i20)) | (bArr2[i21] & ((2 << (4 - i10)) - 1)));
                        }
                    }
                    int i22 = 0;
                    while (i22 < i16) {
                        if (i14 >= i7) {
                            break loop0;
                        }
                        fArr[i14] = Math.max(0.0f, (min * 7) / 31.0f);
                        i22++;
                        i14++;
                    }
                    i13 = i15;
                }
                i12++;
                i11 = 5;
            }
            return fArr;
        }
        return null;
    }

    public final void c(android.graphics.Canvas r22, org.telegram.ui.Cells.q1 r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pm0.c(android.graphics.Canvas, org.telegram.ui.Cells.q1):void");
    }

    public final void d(Canvas canvas, float f10) {
        boolean z9;
        int i7;
        float f11;
        Paint paint;
        Paint paint2;
        w5 w5Var = this.B;
        float N2 = org.telegram.messenger.g0.N(2.0f);
        org.telegram.messenger.ij ijVar = this.f37004m;
        if (ijVar != null && ijVar.f23244k.media_unread && !ijVar.O3() && this.f36996c <= 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37012u = z9;
        Paint paint3 = N;
        if (z9) {
            i7 = this.f37008q;
        } else if (this.f37006o) {
            i7 = this.f37009r;
        } else {
            i7 = this.f37007p;
        }
        paint3.setColor(i7);
        O.setColor(this.f37008q);
        w5Var.f39853a = this.f37005n;
        boolean I = MediaController.B().I(this.f37004m);
        if (this.f37016z && !I) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float e10 = w5Var.e(false, f11);
        Paint paint4 = N;
        paint4.setColor(i0.a.f(e10, paint4.getColor(), this.f37007p));
        float f12 = 1.0f - e10;
        O.setAlpha((int) (paint.getAlpha() * f12 * f10));
        N.setAlpha((int) (paint2.getAlpha() * f10));
        canvas.drawRect(0.0f, 0.0f, this.f36999g + N2, this.h, N);
        if (e10 < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f36999g + N2) * this.f36996c * f12, this.h, O);
        }
        if (e10 > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f36999g) > org.telegram.messenger.g0.L(8.0f) || this.E != this.f37007p || this.F != this.f37008q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f37007p;
                this.F = this.f37008q;
                Paint paint5 = this.C;
                float f13 = this.f36999g;
                this.D = f13;
                int i10 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f13, 0.0f, new int[]{i10, this.F, i10}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (e10 * 255.0f * f10));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f36999g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.q1 q1Var = this.f37005n;
            if (q1Var != null) {
                q1Var.invalidate();
            }
        }
    }

    public final void e(float f10) {
        this.f37010s = f10;
    }

    public final void f() {
        g(false, 0.0f);
    }

    public final void g(boolean z9, float f10) {
        float f11;
        int i7;
        if (!this.f37002k.K2()) {
            this.f36996c = 1.0f;
            return;
        }
        boolean z10 = this.f37012u;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.f36996c = f11;
        if (z10) {
            i7 = this.f36999g;
        } else {
            i7 = this.f36994a;
        }
        if (z9 && i7 != 0 && f10 == 0.0f) {
            this.f37011t = 0.0f;
        } else if (!z9) {
            this.f37011t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f36999g * f10);
        this.f36994a = ceil;
        if (ceil < 0) {
            this.f36994a = 0;
            return;
        }
        int i10 = this.f36999g;
        if (ceil > i10) {
            this.f36994a = i10;
        }
    }

    public final void h(int i7, int i10, int i11, int i12) {
        this.f36999g = i7;
        this.h = i10;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i7 / org.telegram.messenger.g0.N(3.0f)))) {
            this.G = b((int) (this.f36999g / org.telegram.messenger.g0.N(3.0f)));
        }
        if (i11 != i12 && (this.f37000i != i11 || this.f37001j != i12)) {
            this.f37000i = i11;
            this.f37001j = i12;
            this.H = b((int) (i11 / org.telegram.messenger.g0.N(3.0f)));
            this.I = b((int) (this.f37001j / org.telegram.messenger.g0.N(3.0f)));
        } else if (i11 == i12) {
            this.I = null;
            this.H = null;
        }
    }
}
