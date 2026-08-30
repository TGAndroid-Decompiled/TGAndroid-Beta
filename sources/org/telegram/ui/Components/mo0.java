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
public final class mo0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public z5 B;
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
    public o4.g0 M;
    public int f27083a;
    public int f27084b;
    public float f27085c;
    public float d;
    public boolean e;
    public boolean f27086f;
    public int f27087g;
    public int h;
    public int f27088i;
    public int f27089j;
    public org.telegram.ui.Cells.t1 f27090k;
    public byte[] f27091l;
    public MessageObject f27092m;
    public org.telegram.ui.Cells.t1 f27093n;
    public boolean f27094o;
    public int f27095p;
    public int f27096q;
    public int f27097r;
    public float f27098s;
    public float f27099t;
    public boolean f27100u;
    public z5 v;
    public float f27101w;
    public Path f27102x;
    public Path f27103y;
    public boolean f27104z;

    public final void a(Path path, float f10, float f11) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int x10 = org.telegram.ui.b.x(14.0f, this.h, 2);
        float f12 = f11 * this.f27101w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f13 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f10) - f13, ((-f12) - f13) + AndroidUtilities.dp(7.0f) + x10, AndroidUtilities.dpf2(1.0f) + f10 + f13, f12 + f13 + AndroidUtilities.dp(7.0f) + x10);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        byte[] bArr = this.f27091l;
        if (bArr != null && i10 > 0) {
            float[] fArr = new float[i10];
            int i11 = 5;
            int length = (bArr.length * 8) / 5;
            float f10 = length / i10;
            int i12 = 0;
            int i13 = 0;
            float f11 = 0.0f;
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
                    int i20 = 8 - i19;
                    int i21 = 5 - i20;
                    byte min = (byte) ((this.f27091l[i18] >> i19) & ((2 << (Math.min(i11, i20) - 1)) - 1));
                    if (i21 > 0) {
                        int i22 = i18 + 1;
                        byte[] bArr2 = this.f27091l;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mo0.c(android.graphics.Canvas, org.telegram.ui.Cells.t1):void");
    }

    public final void d(Canvas canvas, float f10) {
        boolean z4;
        int i10;
        float f11;
        Paint paint;
        Paint paint2;
        z5 z5Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.f27092m;
        if (messageObject != null && messageObject.isContentUnread() && !this.f27092m.isOut() && this.f27085c <= 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f27100u = z4;
        Paint paint3 = N;
        if (z4) {
            i10 = this.f27096q;
        } else if (this.f27094o) {
            i10 = this.f27097r;
        } else {
            i10 = this.f27095p;
        }
        paint3.setColor(i10);
        O.setColor(this.f27096q);
        z5Var.f31239a = this.f27093n;
        boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f27092m);
        if (this.f27104z && !isPlayingMessage) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = z5Var.d(f11, false);
        Paint paint4 = N;
        paint4.setColor(i0.a.d(d, paint4.getColor(), this.f27095p));
        float f12 = 1.0f - d;
        O.setAlpha((int) (paint.getAlpha() * f12 * f10));
        N.setAlpha((int) (paint2.getAlpha() * f10));
        canvas.drawRect(0.0f, 0.0f, this.f27087g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f27087g + dpf2) * this.f27085c * f12, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f27087g) > AndroidUtilities.dp(8.0f) || this.E != this.f27095p || this.F != this.f27096q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f27095p;
                this.F = this.f27096q;
                Paint paint5 = this.C;
                float f13 = this.f27087g;
                this.D = f13;
                int i11 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f13, 0.0f, new int[]{i11, this.F, i11}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f10));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f27087g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.t1 t1Var = this.f27093n;
            if (t1Var != null) {
                t1Var.invalidate();
            }
        }
    }

    public final void e(float f10) {
        this.f27098s = f10;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f10, boolean z4) {
        float f11;
        int i10;
        if (!this.f27090k.p3()) {
            this.f27085c = 1.0f;
            return;
        }
        boolean z10 = this.f27100u;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.f27085c = f11;
        if (z10) {
            i10 = this.f27087g;
        } else {
            i10 = this.f27083a;
        }
        if (z4 && i10 != 0 && f10 == 0.0f) {
            this.f27099t = 0.0f;
        } else if (!z4) {
            this.f27099t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f27087g * f10);
        this.f27083a = ceil;
        if (ceil < 0) {
            this.f27083a = 0;
            return;
        }
        int i11 = this.f27087g;
        if (ceil > i11) {
            this.f27083a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.f27087g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.f27087g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i12 != i13 && (this.f27088i != i12 || this.f27089j != i13)) {
            this.f27088i = i12;
            this.f27089j = i13;
            this.H = b((int) (i12 / AndroidUtilities.dpf2(3.0f)));
            this.I = b((int) (this.f27089j / AndroidUtilities.dpf2(3.0f)));
        } else if (i12 == i13) {
            this.I = null;
            this.H = null;
        }
    }
}
