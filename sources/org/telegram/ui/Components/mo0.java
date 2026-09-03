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
    public int f29185a;
    public int f29186b;
    public float f29187c;
    public float d;
    public boolean f29188e;
    public boolean f29189f;
    public int f29190g;
    public int h;
    public int f29191i;
    public int f29192j;
    public org.telegram.ui.Cells.t1 f29193k;
    public byte[] f29194l;
    public MessageObject f29195m;
    public org.telegram.ui.Cells.t1 f29196n;
    public boolean f29197o;
    public int f29198p;
    public int f29199q;
    public int f29200r;
    public float f29201s;
    public float f29202t;
    public boolean f29203u;
    public z5 v;
    public float f29204w;
    public Path f29205x;
    public Path f29206y;
    public boolean f29207z;

    public final void a(Path path, float f10, float f11) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int x10 = org.telegram.ui.b.x(14.0f, this.h, 2);
        float f12 = f11 * this.f29204w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f13 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f10) - f13, ((-f12) - f13) + AndroidUtilities.dp(7.0f) + x10, AndroidUtilities.dpf2(1.0f) + f10 + f13, f12 + f13 + AndroidUtilities.dp(7.0f) + x10);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        byte[] bArr = this.f29194l;
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
                    byte min = (byte) ((this.f29194l[i18] >> i19) & ((2 << (Math.min(i11, i20) - 1)) - 1));
                    if (i21 > 0) {
                        int i22 = i18 + 1;
                        byte[] bArr2 = this.f29194l;
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
        MessageObject messageObject = this.f29195m;
        if (messageObject != null && messageObject.isContentUnread() && !this.f29195m.isOut() && this.f29187c <= 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f29203u = z4;
        Paint paint3 = N;
        if (z4) {
            i10 = this.f29199q;
        } else if (this.f29197o) {
            i10 = this.f29200r;
        } else {
            i10 = this.f29198p;
        }
        paint3.setColor(i10);
        O.setColor(this.f29199q);
        z5Var.f33761a = this.f29196n;
        boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.f29195m);
        if (this.f29207z && !isPlayingMessage) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = z5Var.d(f11, false);
        Paint paint4 = N;
        paint4.setColor(i0.a.d(d, paint4.getColor(), this.f29198p));
        float f12 = 1.0f - d;
        O.setAlpha((int) (paint.getAlpha() * f12 * f10));
        N.setAlpha((int) (paint2.getAlpha() * f10));
        canvas.drawRect(0.0f, 0.0f, this.f29190g + dpf2, this.h, N);
        if (d < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f29190g + dpf2) * this.f29187c * f12, this.h, O);
        }
        if (d > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f29190g) > AndroidUtilities.dp(8.0f) || this.E != this.f29198p || this.F != this.f29199q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f29198p;
                this.F = this.f29199q;
                Paint paint5 = this.C;
                float f13 = this.f29190g;
                this.D = f13;
                int i11 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f13, 0.0f, new int[]{i11, this.F, i11}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (d * 255.0f * f10));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.f29190g + 5) - pow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.t1 t1Var = this.f29196n;
            if (t1Var != null) {
                t1Var.invalidate();
            }
        }
    }

    public final void e(float f10) {
        this.f29201s = f10;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f10, boolean z4) {
        float f11;
        int i10;
        if (!this.f29193k.p3()) {
            this.f29187c = 1.0f;
            return;
        }
        boolean z10 = this.f29203u;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.f29187c = f11;
        if (z10) {
            i10 = this.f29190g;
        } else {
            i10 = this.f29185a;
        }
        if (z4 && i10 != 0 && f10 == 0.0f) {
            this.f29202t = 0.0f;
        } else if (!z4) {
            this.f29202t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.f29190g * f10);
        this.f29185a = ceil;
        if (ceil < 0) {
            this.f29185a = 0;
            return;
        }
        int i11 = this.f29190g;
        if (ceil > i11) {
            this.f29185a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.f29190g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.f29190g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i12 != i13 && (this.f29191i != i12 || this.f29192j != i13)) {
            this.f29191i = i12;
            this.f29192j = i13;
            this.H = b((int) (i12 / AndroidUtilities.dpf2(3.0f)));
            this.I = b((int) (this.f29192j / AndroidUtilities.dpf2(3.0f)));
        } else if (i12 == i13) {
            this.I = null;
            this.H = null;
        }
    }
}
