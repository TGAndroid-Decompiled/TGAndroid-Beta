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
public final class pp0 {
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
    public op0 M;
    public int f31675a;
    public int f31676b;
    public float f31677c;
    public float d;
    public boolean e;
    public boolean f31678f;
    public int f31679g;
    public int h;
    public int f31680i;
    public int f31681j;
    public org.telegram.ui.Cells.s1 f31682k;
    public byte[] f31683l;
    public MessageObject f31684m;
    public org.telegram.ui.Cells.s1 f31685n;
    public boolean f31686o;
    public int f31687p;
    public int f31688q;
    public int f31689r;
    public float f31690s;
    public float f31691t;
    public boolean f31692u;
    public h6 v;
    public float f31693w;
    public Path f31694x;
    public Path f31695y;
    public boolean f31696z;

    public final void a(Path path, float f7, float f10) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int B = org.telegram.messenger.vh.B(14.0f, this.h, 2);
        float f11 = f10 * this.f31693w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f7) - f12, ((-f11) - f12) + AndroidUtilities.dp(7.0f) + B, AndroidUtilities.dpf2(1.0f) + f7 + f12, f11 + f12 + AndroidUtilities.dp(7.0f) + B);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        int i11;
        byte[] bArr = this.f31683l;
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
                    byte min = (byte) ((this.f31683l[i19] >> i20) & ((2 << (Math.min(i12, i11) - 1)) - 1));
                    if (i21 > 0) {
                        int i22 = i19 + 1;
                        byte[] bArr2 = this.f31683l;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pp0.c(android.graphics.Canvas, org.telegram.ui.Cells.s1):void");
    }

    public final void d(Canvas canvas, float f7) {
        boolean z10;
        int i10;
        float f10;
        Paint paint;
        Paint paint2;
        h6 h6Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.f31684m;
        if (messageObject != null && messageObject.isContentUnread() && !this.f31684m.isOut() && this.f31677c <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31692u = z10;
        Paint paint3 = N;
        if (z10) {
            i10 = this.f31688q;
        } else if (this.f31686o) {
            i10 = this.f31689r;
        } else {
            i10 = this.f31687p;
        }
        paint3.setColor(i10);
        O.setColor(this.f31688q);
        h6Var.f28809a = this.f31685n;
        boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f31684m);
        if (this.f31696z && !isPlayingMessage) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = h6Var.d(f10, false);
        Paint paint4 = N;
        paint4.setColor(i0.a.f(d, paint4.getColor(), this.f31687p));
        float f11 = 1.0f - d;
        O.setAlpha((int) (paint.getAlpha() * f11 * f7));
        N.setAlpha((int) (paint2.getAlpha() * f7));
        canvas.drawRect(0.0f, 0.0f, this.f31679g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f31679g + dpf2) * this.f31677c * f11, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f31679g) > AndroidUtilities.dp(8.0f) || this.E != this.f31687p || this.F != this.f31688q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f31687p;
                this.F = this.f31688q;
                Paint paint5 = this.C;
                float f12 = this.f31679g;
                this.D = f12;
                int i11 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i11, this.F, i11}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f7));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f31679g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.s1 s1Var = this.f31685n;
            if (s1Var != null) {
                s1Var.invalidate();
            }
        }
    }

    public final void e(float f7) {
        this.f31690s = f7;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f7, boolean z10) {
        float f10;
        int i10;
        if (!this.f31682k.p3()) {
            this.f31677c = 1.0f;
            return;
        }
        boolean z11 = this.f31692u;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = f7;
        }
        this.f31677c = f10;
        if (z11) {
            i10 = this.f31679g;
        } else {
            i10 = this.f31675a;
        }
        if (z10 && i10 != 0 && f7 == 0.0f) {
            this.f31691t = 0.0f;
        } else if (!z10) {
            this.f31691t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f31679g * f7);
        this.f31675a = ceil;
        if (ceil < 0) {
            this.f31675a = 0;
            return;
        }
        int i11 = this.f31679g;
        if (ceil > i11) {
            this.f31675a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.f31679g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.f31679g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i12 != i13 && (this.f31680i != i12 || this.f31681j != i13)) {
            this.f31680i = i12;
            this.f31681j = i13;
            this.H = b((int) (i12 / AndroidUtilities.dpf2(3.0f)));
            this.I = b((int) (this.f31681j / AndroidUtilities.dpf2(3.0f)));
        } else if (i12 == i13) {
            this.I = null;
            this.H = null;
        }
    }
}
