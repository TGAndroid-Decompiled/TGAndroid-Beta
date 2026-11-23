package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
public final class dn0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public c6 B;
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
    public cn0 M;
    public int f34395a;
    public int f34396b;
    public float f34397c;
    public float d;
    public boolean f34398e;
    public boolean f34399f;
    public int f34400g;
    public int h;
    public int f34401i;
    public int f34402j;
    public org.telegram.ui.Cells.r1 f34403k;
    public byte[] f34404l;
    public org.telegram.messenger.fj f34405m;
    public org.telegram.ui.Cells.r1 f34406n;
    public boolean f34407o;
    public int f34408p;
    public int f34409q;
    public int f34410r;
    public float f34411s;
    public float f34412t;
    public boolean f34413u;
    public c6 v;
    public float f34414w;
    public Path f34415x;
    public Path f34416y;
    public boolean f34417z;

    public final void a(Path path, float f10, float f11) {
        float N2 = org.telegram.messenger.g0.N(2.0f);
        int z10 = org.telegram.messenger.m10.z(14.0f, this.h, 2);
        float f12 = f11 * this.f34414w;
        RectF rectF = org.telegram.messenger.g0.P;
        float f13 = N2 / 2.0f;
        rectF.set((org.telegram.messenger.g0.N(1.0f) + f10) - f13, ((-f12) - f13) + org.telegram.messenger.g0.L(7.0f) + z10, org.telegram.messenger.g0.N(1.0f) + f10 + f13, f12 + f13 + org.telegram.messenger.g0.L(7.0f) + z10);
        path.addRoundRect(rectF, N2, N2, Path.Direction.CW);
    }

    public final float[] b(int i7) {
        int i10;
        byte[] bArr = this.f34404l;
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
                    byte min = (byte) ((this.f34404l[i18] >> i19) & ((2 << (Math.min(i11, i10) - 1)) - 1));
                    if (i20 > 0) {
                        int i21 = i18 + 1;
                        byte[] bArr2 = this.f34404l;
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

    public final void c(android.graphics.Canvas r22, org.telegram.ui.Cells.r1 r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dn0.c(android.graphics.Canvas, org.telegram.ui.Cells.r1):void");
    }

    public final void d(Canvas canvas, float f10) {
        boolean z10;
        int i7;
        float f11;
        Paint paint;
        Paint paint2;
        c6 c6Var = this.B;
        float N2 = org.telegram.messenger.g0.N(2.0f);
        org.telegram.messenger.fj fjVar = this.f34405m;
        if (fjVar != null && fjVar.f24073k.media_unread && !fjVar.N3() && this.f34397c <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34413u = z10;
        Paint paint3 = N;
        if (z10) {
            i7 = this.f34409q;
        } else if (this.f34407o) {
            i7 = this.f34410r;
        } else {
            i7 = this.f34408p;
        }
        paint3.setColor(i7);
        O.setColor(this.f34409q);
        c6Var.f33929a = this.f34406n;
        boolean I = MediaController.B().I(this.f34405m);
        if (this.f34417z && !I) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float e10 = c6Var.e(false, f11);
        Paint paint4 = N;
        paint4.setColor(i0.a.f(e10, paint4.getColor(), this.f34408p));
        float f12 = 1.0f - e10;
        O.setAlpha((int) (paint.getAlpha() * f12 * f10));
        N.setAlpha((int) (paint2.getAlpha() * f10));
        canvas.drawRect(0.0f, 0.0f, this.f34400g + N2, this.h, N);
        if (e10 < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f34400g + N2) * this.f34397c * f12, this.h, O);
        }
        if (e10 > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f34400g) > org.telegram.messenger.g0.L(8.0f) || this.E != this.f34408p || this.F != this.f34409q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f34408p;
                this.F = this.f34409q;
                Paint paint5 = this.C;
                float f13 = this.f34400g;
                this.D = f13;
                int i10 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f13, 0.0f, new int[]{i10, this.F, i10}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (e10 * 255.0f * f10));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f34400g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.r1 r1Var = this.f34406n;
            if (r1Var != null) {
                r1Var.invalidate();
            }
        }
    }

    public final void e(float f10) {
        this.f34411s = f10;
    }

    public final void f() {
        g(false, 0.0f);
    }

    public final void g(boolean z10, float f10) {
        float f11;
        int i7;
        if (!this.f34403k.N2()) {
            this.f34397c = 1.0f;
            return;
        }
        boolean z11 = this.f34413u;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.f34397c = f11;
        if (z11) {
            i7 = this.f34400g;
        } else {
            i7 = this.f34395a;
        }
        if (z10 && i7 != 0 && f10 == 0.0f) {
            this.f34412t = 0.0f;
        } else if (!z10) {
            this.f34412t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f34400g * f10);
        this.f34395a = ceil;
        if (ceil < 0) {
            this.f34395a = 0;
            return;
        }
        int i10 = this.f34400g;
        if (ceil > i10) {
            this.f34395a = i10;
        }
    }

    public final void h(int i7, int i10, int i11, int i12) {
        this.f34400g = i7;
        this.h = i10;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i7 / org.telegram.messenger.g0.N(3.0f)))) {
            this.G = b((int) (this.f34400g / org.telegram.messenger.g0.N(3.0f)));
        }
        if (i11 != i12 && (this.f34401i != i11 || this.f34402j != i12)) {
            this.f34401i = i11;
            this.f34402j = i12;
            this.H = b((int) (i11 / org.telegram.messenger.g0.N(3.0f)));
            this.I = b((int) (this.f34402j / org.telegram.messenger.g0.N(3.0f)));
        } else if (i11 == i12) {
            this.I = null;
            this.H = null;
        }
    }
}
