package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
public final class sm0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public u5 B;
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
    public rm0 M;
    public int f38065a;
    public int f38066b;
    public float f38067c;
    public float d;
    public boolean f38068e;
    public boolean f38069f;
    public int f38070g;
    public int h;
    public int f38071i;
    public int f38072j;
    public org.telegram.ui.Cells.q1 f38073k;
    public byte[] f38074l;
    public org.telegram.messenger.zi f38075m;
    public org.telegram.ui.Cells.q1 f38076n;
    public boolean f38077o;
    public int f38078p;
    public int f38079q;
    public int f38080r;
    public float f38081s;
    public float f38082t;
    public boolean f38083u;
    public u5 v;
    public float f38084w;
    public Path f38085x;
    public Path f38086y;
    public boolean f38087z;

    public final void a(Path path, float f10, float f11) {
        float N2 = org.telegram.messenger.g0.N(2.0f);
        int y9 = org.telegram.messenger.camera.q.y(14.0f, this.h, 2);
        float f12 = f11 * this.f38084w;
        RectF rectF = org.telegram.messenger.g0.P;
        float f13 = N2 / 2.0f;
        rectF.set((org.telegram.messenger.g0.N(1.0f) + f10) - f13, ((-f12) - f13) + org.telegram.messenger.g0.L(7.0f) + y9, org.telegram.messenger.g0.N(1.0f) + f10 + f13, f12 + f13 + org.telegram.messenger.g0.L(7.0f) + y9);
        path.addRoundRect(rectF, N2, N2, Path.Direction.CW);
    }

    public final float[] b(int i3) {
        int i10;
        byte[] bArr = this.f38074l;
        if (bArr != null && i3 > 0) {
            float[] fArr = new float[i3];
            int i11 = 5;
            int length = (bArr.length * 8) / 5;
            float f10 = length / i3;
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
                    byte min = (byte) ((this.f38074l[i18] >> i19) & ((2 << (Math.min(i11, i10) - 1)) - 1));
                    if (i20 > 0) {
                        int i21 = i18 + 1;
                        byte[] bArr2 = this.f38074l;
                        if (i21 < bArr2.length) {
                            min = (byte) (((byte) (min << i20)) | (bArr2[i21] & ((2 << (4 - i10)) - 1)));
                        }
                    }
                    int i22 = 0;
                    while (i22 < i16) {
                        if (i14 >= i3) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sm0.c(android.graphics.Canvas, org.telegram.ui.Cells.q1):void");
    }

    public final void d(Canvas canvas, float f10) {
        boolean z10;
        int i3;
        float f11;
        Paint paint;
        Paint paint2;
        u5 u5Var = this.B;
        float N2 = org.telegram.messenger.g0.N(2.0f);
        org.telegram.messenger.zi ziVar = this.f38075m;
        if (ziVar != null && ziVar.f26868k.media_unread && !ziVar.O3() && this.f38067c <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38083u = z10;
        Paint paint3 = N;
        if (z10) {
            i3 = this.f38079q;
        } else if (this.f38077o) {
            i3 = this.f38080r;
        } else {
            i3 = this.f38078p;
        }
        paint3.setColor(i3);
        O.setColor(this.f38079q);
        u5Var.f38643a = this.f38076n;
        boolean I = MediaController.B().I(this.f38075m);
        if (this.f38087z && !I) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float e10 = u5Var.e(false, f11);
        Paint paint4 = N;
        paint4.setColor(i0.a.f(e10, paint4.getColor(), this.f38078p));
        float f12 = 1.0f - e10;
        O.setAlpha((int) (paint.getAlpha() * f12 * f10));
        N.setAlpha((int) (paint2.getAlpha() * f10));
        canvas.drawRect(0.0f, 0.0f, this.f38070g + N2, this.h, N);
        if (e10 < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f38070g + N2) * this.f38067c * f12, this.h, O);
        }
        if (e10 > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f38070g) > org.telegram.messenger.g0.L(8.0f) || this.E != this.f38078p || this.F != this.f38079q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f38078p;
                this.F = this.f38079q;
                Paint paint5 = this.C;
                float f13 = this.f38070g;
                this.D = f13;
                int i10 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f13, 0.0f, new int[]{i10, this.F, i10}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (e10 * 255.0f * f10));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f38070g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.q1 q1Var = this.f38076n;
            if (q1Var != null) {
                q1Var.invalidate();
            }
        }
    }

    public final void e(float f10) {
        this.f38081s = f10;
    }

    public final void f() {
        g(false, 0.0f);
    }

    public final void g(boolean z10, float f10) {
        float f11;
        int i3;
        if (!this.f38073k.J2()) {
            this.f38067c = 1.0f;
            return;
        }
        boolean z11 = this.f38083u;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.f38067c = f11;
        if (z11) {
            i3 = this.f38070g;
        } else {
            i3 = this.f38065a;
        }
        if (z10 && i3 != 0 && f10 == 0.0f) {
            this.f38082t = 0.0f;
        } else if (!z10) {
            this.f38082t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f38070g * f10);
        this.f38065a = ceil;
        if (ceil < 0) {
            this.f38065a = 0;
            return;
        }
        int i10 = this.f38070g;
        if (ceil > i10) {
            this.f38065a = i10;
        }
    }

    public final void h(int i3, int i10, int i11, int i12) {
        this.f38070g = i3;
        this.h = i10;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i3 / org.telegram.messenger.g0.N(3.0f)))) {
            this.G = b((int) (this.f38070g / org.telegram.messenger.g0.N(3.0f)));
        }
        if (i11 != i12 && (this.f38071i != i11 || this.f38072j != i12)) {
            this.f38071i = i11;
            this.f38072j = i12;
            this.H = b((int) (i11 / org.telegram.messenger.g0.N(3.0f)));
            this.I = b((int) (this.f38072j / org.telegram.messenger.g0.N(3.0f)));
        } else if (i11 == i12) {
            this.I = null;
            this.H = null;
        }
    }
}
