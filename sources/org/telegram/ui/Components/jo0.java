package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class jo0 {
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
    public io0 M;
    public int f25378a;
    public int f25379b;
    public float f25380c;
    public float d;
    public boolean e;
    public boolean f25381f;
    public int f25382g;
    public int h;
    public int f25383i;
    public int f25384j;
    public org.telegram.ui.Cells.t1 f25385k;
    public byte[] f25386l;
    public MessageObject f25387m;
    public org.telegram.ui.Cells.t1 f25388n;
    public boolean f25389o;
    public int f25390p;
    public int f25391q;
    public int f25392r;
    public float f25393s;
    public float f25394t;
    public boolean f25395u;
    public c6 v;
    public float f25396w;
    public Path f25397x;
    public Path f25398y;
    public boolean f25399z;

    public final void a(Path path, float f7, float f10) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int y3 = org.telegram.messenger.wl.y(14.0f, this.h, 2);
        float f11 = f10 * this.f25396w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f7) - f12, ((-f11) - f12) + AndroidUtilities.dp(7.0f) + y3, AndroidUtilities.dpf2(1.0f) + f7 + f12, f11 + f12 + AndroidUtilities.dp(7.0f) + y3);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        byte[] bArr = this.f25386l;
        if (bArr != null && i10 > 0) {
            float[] fArr = new float[i10];
            int i11 = 5;
            int length = (bArr.length * 8) / 5;
            float f7 = length / i10;
            int i12 = 0;
            int i13 = 0;
            float f10 = 0.0f;
            int i14 = 0;
            loop0: while (i12 < length) {
                if (i12 == i13) {
                    int i15 = i13;
                    int i16 = 0;
                    while (i13 == i15) {
                        f10 += f7;
                        i15 = (int) f10;
                        i16++;
                    }
                    int i17 = i12 * 5;
                    int i18 = i17 / 8;
                    int i19 = i17 - (i18 * 8);
                    int i20 = 8 - i19;
                    int i21 = 5 - i20;
                    byte min = (byte) ((this.f25386l[i18] >> i19) & ((2 << (Math.min(i11, i20) - 1)) - 1));
                    if (i21 > 0) {
                        int i22 = i18 + 1;
                        byte[] bArr2 = this.f25386l;
                        if (i22 < bArr2.length) {
                            min = (byte) (((byte) (min << i21)) | (bArr2[i22] & ((2 << (4 - i20)) - 1)));
                        }
                    }
                    int i23 = 0;
                    while (i23 < i16) {
                        if (i14 >= i10) {
                            break loop0;
                        }
                        fArr[i14] = Math.max(0.0f, (min * 7) / 31.0f);
                        i23++;
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

    public final void c(android.graphics.Canvas r21, org.telegram.ui.Cells.t1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jo0.c(android.graphics.Canvas, org.telegram.ui.Cells.t1):void");
    }

    public final void d(Canvas canvas, float f7) {
        boolean z10;
        int i10;
        float f10;
        Paint paint;
        Paint paint2;
        c6 c6Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.f25387m;
        if (messageObject != null && messageObject.isContentUnread() && !this.f25387m.isOut() && this.f25380c <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25395u = z10;
        Paint paint3 = N;
        if (z10) {
            i10 = this.f25391q;
        } else if (this.f25389o) {
            i10 = this.f25392r;
        } else {
            i10 = this.f25390p;
        }
        paint3.setColor(i10);
        O.setColor(this.f25391q);
        c6Var.f22938a = this.f25388n;
        boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f25387m);
        if (this.f25399z && !isPlayingMessage) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = c6Var.d(f10, false);
        Paint paint4 = N;
        paint4.setColor(i0.a.d(d, paint4.getColor(), this.f25390p));
        float f11 = 1.0f - d;
        O.setAlpha((int) (paint.getAlpha() * f11 * f7));
        N.setAlpha((int) (paint2.getAlpha() * f7));
        canvas.drawRect(0.0f, 0.0f, this.f25382g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f25382g + dpf2) * this.f25380c * f11, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f25382g) > AndroidUtilities.dp(8.0f) || this.E != this.f25390p || this.F != this.f25391q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f25390p;
                this.F = this.f25391q;
                Paint paint5 = this.C;
                float f12 = this.f25382g;
                this.D = f12;
                int i11 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i11, this.F, i11}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f7));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f25382g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.t1 t1Var = this.f25388n;
            if (t1Var != null) {
                t1Var.invalidate();
            }
        }
    }

    public final void e(float f7) {
        this.f25393s = f7;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f7, boolean z10) {
        float f10;
        int i10;
        if (!this.f25385k.p3()) {
            this.f25380c = 1.0f;
            return;
        }
        boolean z11 = this.f25395u;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = f7;
        }
        this.f25380c = f10;
        if (z11) {
            i10 = this.f25382g;
        } else {
            i10 = this.f25378a;
        }
        if (z10 && i10 != 0 && f7 == 0.0f) {
            this.f25394t = 0.0f;
        } else if (!z10) {
            this.f25394t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f25382g * f7);
        this.f25378a = ceil;
        if (ceil < 0) {
            this.f25378a = 0;
            return;
        }
        int i11 = this.f25382g;
        if (ceil > i11) {
            this.f25378a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.f25382g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.f25382g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i12 != i13 && (this.f25383i != i12 || this.f25384j != i13)) {
            this.f25383i = i12;
            this.f25384j = i13;
            this.H = b((int) (i12 / AndroidUtilities.dpf2(3.0f)));
            this.I = b((int) (this.f25384j / AndroidUtilities.dpf2(3.0f)));
        } else if (i12 == i13) {
            this.I = null;
            this.H = null;
        }
    }
}
