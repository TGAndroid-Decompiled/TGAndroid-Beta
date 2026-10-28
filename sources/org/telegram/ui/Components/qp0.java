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
public final class qp0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public h6 B;
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
    public pp0 M;
    public int f31980a;
    public int f31981b;
    public float f31982c;
    public float d;
    public boolean e;
    public boolean f31983f;
    public int f31984g;
    public int h;
    public int f31985i;
    public int f31986j;
    public org.telegram.ui.Cells.s1 f31987k;
    public byte[] f31988l;
    public MessageObject f31989m;
    public org.telegram.ui.Cells.s1 f31990n;
    public boolean f31991o;
    public int f31992p;
    public int f31993q;
    public int f31994r;
    public float f31995s;
    public float f31996t;
    public boolean f31997u;
    public h6 v;
    public float f31998w;
    public Path f31999x;
    public Path f32000y;
    public boolean f32001z;

    public final void a(Path path, float f7, float f10) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int B = org.telegram.messenger.wh.B(14.0f, this.h, 2);
        float f11 = f10 * this.f31998w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f7) - f12, ((-f11) - f12) + AndroidUtilities.dp(7.0f) + B, AndroidUtilities.dpf2(1.0f) + f7 + f12, f11 + f12 + AndroidUtilities.dp(7.0f) + B);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        int i11;
        byte[] bArr = this.f31988l;
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
                    byte min = (byte) ((this.f31988l[i19] >> i20) & ((2 << (Math.min(i12, i11) - 1)) - 1));
                    if (i21 > 0) {
                        int i22 = i19 + 1;
                        byte[] bArr2 = this.f31988l;
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

    public final void c(android.graphics.Canvas r21, org.telegram.ui.Cells.s1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qp0.c(android.graphics.Canvas, org.telegram.ui.Cells.s1):void");
    }

    public final void d(Canvas canvas, float f7) {
        boolean z10;
        int i10;
        float f10;
        Paint paint;
        Paint paint2;
        h6 h6Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.f31989m;
        if (messageObject != null && messageObject.isContentUnread() && !this.f31989m.isOut() && this.f31982c <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31997u = z10;
        Paint paint3 = N;
        if (z10) {
            i10 = this.f31993q;
        } else if (this.f31991o) {
            i10 = this.f31994r;
        } else {
            i10 = this.f31992p;
        }
        paint3.setColor(i10);
        O.setColor(this.f31993q);
        h6Var.f28862a = this.f31990n;
        boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f31989m);
        if (this.f32001z && !isPlayingMessage) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = h6Var.d(f10, false);
        Paint paint4 = N;
        paint4.setColor(i0.a.f(d, paint4.getColor(), this.f31992p));
        float f11 = 1.0f - d;
        O.setAlpha((int) (paint.getAlpha() * f11 * f7));
        N.setAlpha((int) (paint2.getAlpha() * f7));
        canvas.drawRect(0.0f, 0.0f, this.f31984g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f31984g + dpf2) * this.f31982c * f11, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f31984g) > AndroidUtilities.dp(8.0f) || this.E != this.f31992p || this.F != this.f31993q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f31992p;
                this.F = this.f31993q;
                Paint paint5 = this.C;
                float f12 = this.f31984g;
                this.D = f12;
                int i11 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i11, this.F, i11}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f7));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f31984g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.s1 s1Var = this.f31990n;
            if (s1Var != null) {
                s1Var.invalidate();
            }
        }
    }

    public final void e(float f7) {
        this.f31995s = f7;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f7, boolean z10) {
        float f10;
        int i10;
        if (!this.f31987k.p3()) {
            this.f31982c = 1.0f;
            return;
        }
        boolean z11 = this.f31997u;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = f7;
        }
        this.f31982c = f10;
        if (z11) {
            i10 = this.f31984g;
        } else {
            i10 = this.f31980a;
        }
        if (z10 && i10 != 0 && f7 == 0.0f) {
            this.f31996t = 0.0f;
        } else if (!z10) {
            this.f31996t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f31984g * f7);
        this.f31980a = ceil;
        if (ceil < 0) {
            this.f31980a = 0;
            return;
        }
        int i11 = this.f31984g;
        if (ceil > i11) {
            this.f31980a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.f31984g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.f31984g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i12 != i13 && (this.f31985i != i12 || this.f31986j != i13)) {
            this.f31985i = i12;
            this.f31986j = i13;
            this.H = b((int) (i12 / AndroidUtilities.dpf2(3.0f)));
            this.I = b((int) (this.f31986j / AndroidUtilities.dpf2(3.0f)));
        } else if (i12 == i13) {
            this.I = null;
            this.H = null;
        }
    }
}
