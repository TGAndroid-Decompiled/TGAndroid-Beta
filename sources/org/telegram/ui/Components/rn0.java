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
public final class rn0 {
    public static Paint N;
    public static Paint O;
    public long A;
    public y5 B;
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
    public j4.w0 M;
    public int f32209a;
    public int f32210b;
    public float f32211c;
    public float d;
    public boolean f32212e;
    public boolean f32213f;
    public int f32214g;
    public int h;
    public int f32215i;
    public int f32216j;
    public org.telegram.ui.Cells.t1 f32217k;
    public byte[] f32218l;
    public MessageObject f32219m;
    public org.telegram.ui.Cells.t1 f32220n;
    public boolean f32221o;
    public int f32222p;
    public int f32223q;
    public int f32224r;
    public float f32225s;
    public float f32226t;
    public boolean f32227u;
    public y5 v;
    public float f32228w;
    public Path f32229x;
    public Path f32230y;
    public boolean f32231z;

    public final void a(Path path, float f10, float f11) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int y10 = org.telegram.messenger.ll.y(14.0f, this.h, 2);
        float f12 = f11 * this.f32228w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f13 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f10) - f13, ((-f12) - f13) + AndroidUtilities.dp(7.0f) + y10, AndroidUtilities.dpf2(1.0f) + f10 + f13, f12 + f13 + AndroidUtilities.dp(7.0f) + y10);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i9) {
        byte[] bArr = this.f32218l;
        if (bArr != null && i9 > 0) {
            float[] fArr = new float[i9];
            int i10 = 5;
            int length = (bArr.length * 8) / 5;
            float f10 = length / i9;
            int i11 = 0;
            int i12 = 0;
            float f11 = 0.0f;
            int i13 = 0;
            loop0: while (i11 < length) {
                if (i11 == i12) {
                    int i14 = i12;
                    int i15 = 0;
                    while (i12 == i14) {
                        f11 += f10;
                        i14 = (int) f11;
                        i15++;
                    }
                    int i16 = i11 * 5;
                    int i17 = i16 / 8;
                    int i18 = i16 - (i17 * 8);
                    int i19 = 8 - i18;
                    int i20 = 5 - i19;
                    byte min = (byte) ((this.f32218l[i17] >> i18) & ((2 << (Math.min(i10, i19) - 1)) - 1));
                    if (i20 > 0) {
                        int i21 = i17 + 1;
                        byte[] bArr2 = this.f32218l;
                        if (i21 < bArr2.length) {
                            min = (byte) (((byte) (min << i20)) | (bArr2[i21] & ((2 << (4 - i19)) - 1)));
                        }
                    }
                    int i22 = 0;
                    while (i22 < i15) {
                        if (i13 >= i9) {
                            break loop0;
                        }
                        fArr[i13] = Math.max(0.0f, (min * 7) / 31.0f);
                        i22++;
                        i13++;
                    }
                    i12 = i14;
                }
                i11++;
                i10 = 5;
            }
            return fArr;
        }
        return null;
    }

    public final void c(android.graphics.Canvas r21, org.telegram.ui.Cells.t1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rn0.c(android.graphics.Canvas, org.telegram.ui.Cells.t1):void");
    }

    public final void d(Canvas canvas, float f10) {
        boolean z10;
        int i9;
        float f11;
        Paint paint;
        Paint paint2;
        y5 y5Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.f32219m;
        if (messageObject != null && messageObject.isContentUnread() && !this.f32219m.isOut() && this.f32211c <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32227u = z10;
        Paint paint3 = N;
        if (z10) {
            i9 = this.f32223q;
        } else if (this.f32221o) {
            i9 = this.f32224r;
        } else {
            i9 = this.f32222p;
        }
        paint3.setColor(i9);
        O.setColor(this.f32223q);
        y5Var.f34852a = this.f32220n;
        boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f32219m);
        if (this.f32231z && !isPlayingMessage) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = y5Var.d(f11, false);
        Paint paint4 = N;
        paint4.setColor(i0.a.d(d, paint4.getColor(), this.f32222p));
        float f12 = 1.0f - d;
        O.setAlpha((int) (paint.getAlpha() * f12 * f10));
        N.setAlpha((int) (paint2.getAlpha() * f10));
        canvas.drawRect(0.0f, 0.0f, this.f32214g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f32214g + dpf2) * this.f32211c * f12, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f32214g) > AndroidUtilities.dp(8.0f) || this.E != this.f32222p || this.F != this.f32223q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f32222p;
                this.F = this.f32223q;
                Paint paint5 = this.C;
                float f13 = this.f32214g;
                this.D = f13;
                int i10 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f13, 0.0f, new int[]{i10, this.F, i10}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f10));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f32214g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.t1 t1Var = this.f32220n;
            if (t1Var != null) {
                t1Var.invalidate();
            }
        }
    }

    public final void e(float f10) {
        this.f32225s = f10;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f10, boolean z10) {
        float f11;
        int i9;
        if (!this.f32217k.p3()) {
            this.f32211c = 1.0f;
            return;
        }
        boolean z11 = this.f32227u;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.f32211c = f11;
        if (z11) {
            i9 = this.f32214g;
        } else {
            i9 = this.f32209a;
        }
        if (z10 && i9 != 0 && f10 == 0.0f) {
            this.f32226t = 0.0f;
        } else if (!z10) {
            this.f32226t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f32214g * f10);
        this.f32209a = ceil;
        if (ceil < 0) {
            this.f32209a = 0;
            return;
        }
        int i10 = this.f32214g;
        if (ceil > i10) {
            this.f32209a = i10;
        }
    }

    public final void h(int i9, int i10, int i11, int i12) {
        this.f32214g = i9;
        this.h = i10;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i9 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.f32214g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i11 != i12 && (this.f32215i != i11 || this.f32216j != i12)) {
            this.f32215i = i11;
            this.f32216j = i12;
            this.H = b((int) (i11 / AndroidUtilities.dpf2(3.0f)));
            this.I = b((int) (this.f32216j / AndroidUtilities.dpf2(3.0f)));
        } else if (i11 == i12) {
            this.I = null;
            this.H = null;
        }
    }
}
