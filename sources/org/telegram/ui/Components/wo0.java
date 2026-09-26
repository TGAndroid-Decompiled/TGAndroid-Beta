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
public final class wo0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public e6 B;
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
    public vo0 M;
    public int f30154a;
    public int f30155b;
    public float f30156c;
    public float d;
    public boolean e;
    public boolean f30157f;
    public int f30158g;
    public int h;
    public int f30159i;
    public int f30160j;
    public org.telegram.ui.Cells.u1 f30161k;
    public byte[] f30162l;
    public MessageObject f30163m;
    public org.telegram.ui.Cells.u1 f30164n;
    public boolean f30165o;
    public int f30166p;
    public int f30167q;
    public int f30168r;
    public float f30169s;
    public float f30170t;
    public boolean f30171u;
    public e6 v;
    public float f30172w;
    public Path f30173x;
    public Path f30174y;
    public boolean f30175z;

    public final void a(Path path, float f7, float f10) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int A = org.telegram.messenger.ok.A(14.0f, this.h, 2);
        float f11 = f10 * this.f30172w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f7) - f12, ((-f11) - f12) + AndroidUtilities.dp(7.0f) + A, AndroidUtilities.dpf2(1.0f) + f7 + f12, f11 + f12 + AndroidUtilities.dp(7.0f) + A);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        byte[] bArr = this.f30162l;
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
                    byte min = (byte) ((this.f30162l[i18] >> i19) & ((2 << (Math.min(i11, i20) - 1)) - 1));
                    if (i21 > 0) {
                        int i22 = i18 + 1;
                        byte[] bArr2 = this.f30162l;
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

    public final void c(android.graphics.Canvas r21, org.telegram.ui.Cells.u1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wo0.c(android.graphics.Canvas, org.telegram.ui.Cells.u1):void");
    }

    public final void d(Canvas canvas, float f7) {
        boolean z10;
        int i10;
        float f10;
        Paint paint;
        Paint paint2;
        e6 e6Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.f30163m;
        if (messageObject != null && messageObject.isContentUnread() && !this.f30163m.isOut() && this.f30156c <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30171u = z10;
        Paint paint3 = N;
        if (z10) {
            i10 = this.f30167q;
        } else if (this.f30165o) {
            i10 = this.f30168r;
        } else {
            i10 = this.f30166p;
        }
        paint3.setColor(i10);
        O.setColor(this.f30167q);
        e6Var.f23848a = this.f30164n;
        boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f30163m);
        if (this.f30175z && !isPlayingMessage) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = e6Var.d(f10, false);
        Paint paint4 = N;
        paint4.setColor(i0.a.d(d, paint4.getColor(), this.f30166p));
        float f11 = 1.0f - d;
        O.setAlpha((int) (paint.getAlpha() * f11 * f7));
        N.setAlpha((int) (paint2.getAlpha() * f7));
        canvas.drawRect(0.0f, 0.0f, this.f30158g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f30158g + dpf2) * this.f30156c * f11, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f30158g) > AndroidUtilities.dp(8.0f) || this.E != this.f30166p || this.F != this.f30167q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f30166p;
                this.F = this.f30167q;
                Paint paint5 = this.C;
                float f12 = this.f30158g;
                this.D = f12;
                int i11 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i11, this.F, i11}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f7));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f30158g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.u1 u1Var = this.f30164n;
            if (u1Var != null) {
                u1Var.invalidate();
            }
        }
    }

    public final void e(float f7) {
        this.f30169s = f7;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f7, boolean z10) {
        float f10;
        int i10;
        if (!this.f30161k.p3()) {
            this.f30156c = 1.0f;
            return;
        }
        boolean z11 = this.f30171u;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = f7;
        }
        this.f30156c = f10;
        if (z11) {
            i10 = this.f30158g;
        } else {
            i10 = this.f30154a;
        }
        if (z10 && i10 != 0 && f7 == 0.0f) {
            this.f30170t = 0.0f;
        } else if (!z10) {
            this.f30170t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f30158g * f7);
        this.f30154a = ceil;
        if (ceil < 0) {
            this.f30154a = 0;
            return;
        }
        int i11 = this.f30158g;
        if (ceil > i11) {
            this.f30154a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.f30158g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.f30158g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i12 != i13 && (this.f30159i != i12 || this.f30160j != i13)) {
            this.f30159i = i12;
            this.f30160j = i13;
            this.H = b((int) (i12 / AndroidUtilities.dpf2(3.0f)));
            this.I = b((int) (this.f30160j / AndroidUtilities.dpf2(3.0f)));
        } else if (i12 == i13) {
            this.I = null;
            this.H = null;
        }
    }
}
