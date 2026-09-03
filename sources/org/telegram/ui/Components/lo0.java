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
public final class lo0 {
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
    public int f26810a;
    public int f26811b;
    public float f26812c;
    public float d;
    public boolean e;
    public boolean f26813f;
    public int f26814g;
    public int h;
    public int f26815i;
    public int f26816j;
    public org.telegram.ui.Cells.s1 f26817k;
    public byte[] f26818l;
    public MessageObject f26819m;
    public org.telegram.ui.Cells.s1 f26820n;
    public boolean f26821o;
    public int f26822p;
    public int f26823q;
    public int f26824r;
    public float f26825s;
    public float f26826t;
    public boolean f26827u;
    public z5 v;
    public float f26828w;
    public Path f26829x;
    public Path f26830y;
    public boolean f26831z;

    public final void a(Path path, float f10, float f11) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int x10 = org.telegram.ui.b.x(14.0f, this.h, 2);
        float f12 = f11 * this.f26828w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f13 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f10) - f13, ((-f12) - f13) + AndroidUtilities.dp(7.0f) + x10, AndroidUtilities.dpf2(1.0f) + f10 + f13, f12 + f13 + AndroidUtilities.dp(7.0f) + x10);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        byte[] bArr = this.f26818l;
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
                    byte min = (byte) ((this.f26818l[i18] >> i19) & ((2 << (Math.min(i11, i20) - 1)) - 1));
                    if (i21 > 0) {
                        int i22 = i18 + 1;
                        byte[] bArr2 = this.f26818l;
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

    public final void c(android.graphics.Canvas r21, org.telegram.ui.Cells.s1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lo0.c(android.graphics.Canvas, org.telegram.ui.Cells.s1):void");
    }

    public final void d(Canvas canvas, float f10) {
        boolean z4;
        int i10;
        float f11;
        Paint paint;
        Paint paint2;
        z5 z5Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.f26819m;
        if (messageObject != null && messageObject.isContentUnread() && !this.f26819m.isOut() && this.f26812c <= 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f26827u = z4;
        Paint paint3 = N;
        if (z4) {
            i10 = this.f26823q;
        } else if (this.f26821o) {
            i10 = this.f26824r;
        } else {
            i10 = this.f26822p;
        }
        paint3.setColor(i10);
        O.setColor(this.f26823q);
        z5Var.f31251a = this.f26820n;
        boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f26819m);
        if (this.f26831z && !isPlayingMessage) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = z5Var.d(f11, false);
        Paint paint4 = N;
        paint4.setColor(i0.a.d(d, paint4.getColor(), this.f26822p));
        float f12 = 1.0f - d;
        O.setAlpha((int) (paint.getAlpha() * f12 * f10));
        N.setAlpha((int) (paint2.getAlpha() * f10));
        canvas.drawRect(0.0f, 0.0f, this.f26814g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f26814g + dpf2) * this.f26812c * f12, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f26814g) > AndroidUtilities.dp(8.0f) || this.E != this.f26822p || this.F != this.f26823q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f26822p;
                this.F = this.f26823q;
                Paint paint5 = this.C;
                float f13 = this.f26814g;
                this.D = f13;
                int i11 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f13, 0.0f, new int[]{i11, this.F, i11}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f10));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f26814g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.s1 s1Var = this.f26820n;
            if (s1Var != null) {
                s1Var.invalidate();
            }
        }
    }

    public final void e(float f10) {
        this.f26825s = f10;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f10, boolean z4) {
        float f11;
        int i10;
        if (!this.f26817k.p3()) {
            this.f26812c = 1.0f;
            return;
        }
        boolean z10 = this.f26827u;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.f26812c = f11;
        if (z10) {
            i10 = this.f26814g;
        } else {
            i10 = this.f26810a;
        }
        if (z4 && i10 != 0 && f10 == 0.0f) {
            this.f26826t = 0.0f;
        } else if (!z4) {
            this.f26826t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f26814g * f10);
        this.f26810a = ceil;
        if (ceil < 0) {
            this.f26810a = 0;
            return;
        }
        int i11 = this.f26814g;
        if (ceil > i11) {
            this.f26810a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.f26814g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.f26814g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i12 != i13 && (this.f26815i != i12 || this.f26816j != i13)) {
            this.f26815i = i12;
            this.f26816j = i13;
            this.H = b((int) (i12 / AndroidUtilities.dpf2(3.0f)));
            this.I = b((int) (this.f26816j / AndroidUtilities.dpf2(3.0f)));
        } else if (i12 == i13) {
            this.I = null;
            this.H = null;
        }
    }
}
