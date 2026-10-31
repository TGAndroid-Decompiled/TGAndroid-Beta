package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
public final class qn0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public t5 B;
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
    public pn0 M;
    public int f29688a;
    public int f29689b;
    public float f29690c;
    public float d;
    public boolean e;
    public boolean f29691f;
    public int f29692g;
    public int h;
    public int f29693i;
    public int f29694j;
    public org.telegram.ui.Cells.q1 f29695k;
    public byte[] f29696l;
    public org.telegram.messenger.jj f29697m;
    public org.telegram.ui.Cells.q1 f29698n;
    public boolean f29699o;
    public int f29700p;
    public int f29701q;
    public int f29702r;
    public float f29703s;
    public float f29704t;
    public boolean f29705u;
    public t5 v;
    public float f29706w;
    public Path f29707x;
    public Path f29708y;
    public boolean f29709z;

    public final void a(Path path, float f7, float f10) {
        float N2 = org.telegram.messenger.i0.N(2.0f);
        int y3 = org.telegram.messenger.z20.y(14.0f, this.h, 2);
        float f11 = f10 * this.f29706w;
        RectF rectF = org.telegram.messenger.i0.P;
        float f12 = N2 / 2.0f;
        rectF.set((org.telegram.messenger.i0.N(1.0f) + f7) - f12, ((-f11) - f12) + org.telegram.messenger.i0.L(7.0f) + y3, org.telegram.messenger.i0.N(1.0f) + f7 + f12, f11 + f12 + org.telegram.messenger.i0.L(7.0f) + y3);
        path.addRoundRect(rectF, N2, N2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        int i11;
        byte[] bArr = this.f29696l;
        if (bArr != null && i10 > 0) {
            float[] fArr = new float[i10];
            int i12 = 5;
            int length = (bArr.length * 8) / 5;
            float f7 = length / i10;
            float f10 = 0.0f;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            loop0: while (i13 < length) {
                if (i13 == i14) {
                    int i16 = i14;
                    int i17 = 0;
                    while (i14 == i16) {
                        f10 += f7;
                        i16 = (int) f10;
                        i17++;
                    }
                    int i18 = i13 * 5;
                    int i19 = i18 / 8;
                    int i20 = i18 - (i19 * 8);
                    int i21 = 5 - (8 - i20);
                    byte min = (byte) ((this.f29696l[i19] >> i20) & ((2 << (Math.min(i12, i11) - 1)) - 1));
                    if (i21 > 0) {
                        int i22 = i19 + 1;
                        byte[] bArr2 = this.f29696l;
                        if (i22 < bArr2.length) {
                            min = (byte) (((byte) (min << i21)) | (bArr2[i22] & ((2 << (4 - i11)) - 1)));
                        }
                    }
                    int i23 = 0;
                    while (i23 < i17) {
                        if (i15 >= i10) {
                            break loop0;
                        }
                        fArr[i15] = Math.max(0.0f, (min * 7) / 31.0f);
                        i23++;
                        i15++;
                    }
                    i14 = i16;
                }
                i13++;
                i12 = 5;
            }
            return fArr;
        }
        return null;
    }

    public final void c(android.graphics.Canvas r22, org.telegram.ui.Cells.q1 r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qn0.c(android.graphics.Canvas, org.telegram.ui.Cells.q1):void");
    }

    public final void d(Canvas canvas, float f7) {
        boolean z10;
        int i10;
        float f10;
        Paint paint;
        Paint paint2;
        t5 t5Var = this.B;
        float N2 = org.telegram.messenger.i0.N(2.0f);
        org.telegram.messenger.jj jjVar = this.f29697m;
        if (jjVar != null && jjVar.f16337k.media_unread && !jjVar.N3() && this.f29690c <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29705u = z10;
        Paint paint3 = N;
        if (z10) {
            i10 = this.f29701q;
        } else if (this.f29699o) {
            i10 = this.f29702r;
        } else {
            i10 = this.f29700p;
        }
        paint3.setColor(i10);
        O.setColor(this.f29701q);
        t5Var.f30443a = this.f29698n;
        boolean I = MediaController.B().I(this.f29697m);
        if (this.f29709z && !I) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e = t5Var.e(false, f10);
        Paint paint4 = N;
        paint4.setColor(i0.b.f(e, paint4.getColor(), this.f29700p));
        float f11 = 1.0f - e;
        O.setAlpha((int) (paint.getAlpha() * f11 * f7));
        N.setAlpha((int) (paint2.getAlpha() * f7));
        canvas.drawRect(0.0f, 0.0f, this.f29692g + N2, this.h, N);
        if (e < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f29692g + N2) * this.f29690c * f11, this.h, O);
        }
        if (e > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f29692g) > org.telegram.messenger.i0.L(8.0f) || this.E != this.f29700p || this.F != this.f29701q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f29700p;
                this.F = this.f29701q;
                Paint paint5 = this.C;
                float f12 = this.f29692g;
                this.D = f12;
                int i11 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i11, this.F, i11}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (e * 255.0f * f7));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f29692g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.q1 q1Var = this.f29698n;
            if (q1Var != null) {
                q1Var.invalidate();
            }
        }
    }

    public final void e(float f7) {
        this.f29703s = f7;
    }

    public final void f() {
        g(false, 0.0f);
    }

    public final void g(boolean z10, float f7) {
        float f10;
        int i10;
        if (!this.f29695k.H2()) {
            this.f29690c = 1.0f;
            return;
        }
        boolean z11 = this.f29705u;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = f7;
        }
        this.f29690c = f10;
        if (z11) {
            i10 = this.f29692g;
        } else {
            i10 = this.f29688a;
        }
        if (z10 && i10 != 0 && f7 == 0.0f) {
            this.f29704t = 0.0f;
        } else if (!z10) {
            this.f29704t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f29692g * f7);
        this.f29688a = ceil;
        if (ceil < 0) {
            this.f29688a = 0;
            return;
        }
        int i11 = this.f29692g;
        if (ceil > i11) {
            this.f29688a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.f29692g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / org.telegram.messenger.i0.N(3.0f)))) {
            this.G = b((int) (this.f29692g / org.telegram.messenger.i0.N(3.0f)));
        }
        if (i12 != i13 && (this.f29693i != i12 || this.f29694j != i13)) {
            this.f29693i = i12;
            this.f29694j = i13;
            this.H = b((int) (i12 / org.telegram.messenger.i0.N(3.0f)));
            this.I = b((int) (this.f29694j / org.telegram.messenger.i0.N(3.0f)));
        } else if (i12 == i13) {
            this.I = null;
            this.H = null;
        }
    }
}
