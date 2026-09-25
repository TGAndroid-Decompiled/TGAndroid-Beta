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
public final class vo0 {
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
    public uo0 M;
    public int f29232a;
    public int f29233b;
    public float f29234c;
    public float d;
    public boolean e;
    public boolean f29235f;
    public int f29236g;
    public int h;
    public int f29237i;
    public int f29238j;
    public org.telegram.ui.Cells.u1 f29239k;
    public byte[] f29240l;
    public MessageObject f29241m;
    public org.telegram.ui.Cells.u1 f29242n;
    public boolean f29243o;
    public int f29244p;
    public int f29245q;
    public int f29246r;
    public float f29247s;
    public float f29248t;
    public boolean f29249u;
    public e6 v;
    public float f29250w;
    public Path f29251x;
    public Path f29252y;
    public boolean f29253z;

    public final void a(Path path, float f7, float f10) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int A = org.telegram.messenger.ok.A(14.0f, this.h, 2);
        float f11 = f10 * this.f29250w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f7) - f12, ((-f11) - f12) + AndroidUtilities.dp(7.0f) + A, AndroidUtilities.dpf2(1.0f) + f7 + f12, f11 + f12 + AndroidUtilities.dp(7.0f) + A);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        byte[] bArr = this.f29240l;
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
                    byte min = (byte) ((this.f29240l[i18] >> i19) & ((2 << (Math.min(i11, i20) - 1)) - 1));
                    if (i21 > 0) {
                        int i22 = i18 + 1;
                        byte[] bArr2 = this.f29240l;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vo0.c(android.graphics.Canvas, org.telegram.ui.Cells.u1):void");
    }

    public final void d(Canvas canvas, float f7) {
        boolean z10;
        int i10;
        float f10;
        Paint paint;
        Paint paint2;
        e6 e6Var = this.B;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.f29241m;
        if (messageObject != null && messageObject.isContentUnread() && !this.f29241m.isOut() && this.f29234c <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29249u = z10;
        Paint paint3 = N;
        if (z10) {
            i10 = this.f29245q;
        } else if (this.f29243o) {
            i10 = this.f29246r;
        } else {
            i10 = this.f29244p;
        }
        paint3.setColor(i10);
        O.setColor(this.f29245q);
        e6Var.f23843a = this.f29242n;
        boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f29241m);
        if (this.f29253z && !isPlayingMessage) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = e6Var.d(f10, false);
        Paint paint4 = N;
        paint4.setColor(i0.a.d(d, paint4.getColor(), this.f29244p));
        float f11 = 1.0f - d;
        O.setAlpha((int) (paint.getAlpha() * f11 * f7));
        N.setAlpha((int) (paint2.getAlpha() * f7));
        canvas.drawRect(0.0f, 0.0f, this.f29236g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f29236g + dpf2) * this.f29234c * f11, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f29236g) > AndroidUtilities.dp(8.0f) || this.E != this.f29244p || this.F != this.f29245q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f29244p;
                this.F = this.f29245q;
                Paint paint5 = this.C;
                float f12 = this.f29236g;
                this.D = f12;
                int i11 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i11, this.F, i11}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f7));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f29236g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.u1 u1Var = this.f29242n;
            if (u1Var != null) {
                u1Var.invalidate();
            }
        }
    }

    public final void e(float f7) {
        this.f29247s = f7;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f7, boolean z10) {
        float f10;
        int i10;
        if (!this.f29239k.p3()) {
            this.f29234c = 1.0f;
            return;
        }
        boolean z11 = this.f29249u;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = f7;
        }
        this.f29234c = f10;
        if (z11) {
            i10 = this.f29236g;
        } else {
            i10 = this.f29232a;
        }
        if (z10 && i10 != 0 && f7 == 0.0f) {
            this.f29248t = 0.0f;
        } else if (!z10) {
            this.f29248t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f29236g * f7);
        this.f29232a = ceil;
        if (ceil < 0) {
            this.f29232a = 0;
            return;
        }
        int i11 = this.f29236g;
        if (ceil > i11) {
            this.f29232a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.f29236g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.f29236g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i12 != i13 && (this.f29237i != i12 || this.f29238j != i13)) {
            this.f29237i = i12;
            this.f29238j = i13;
            this.H = b((int) (i12 / AndroidUtilities.dpf2(3.0f)));
            this.I = b((int) (this.f29238j / AndroidUtilities.dpf2(3.0f)));
        } else if (i12 == i13) {
            this.I = null;
            this.H = null;
        }
    }
}
