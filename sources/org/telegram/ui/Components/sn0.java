package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

public final class sn0 {
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
    public j4.v0 M;

    public int f32490a;

    public int f32491b;

    public float f32492c;
    public float d;

    public boolean f32493e;

    public boolean f32494f;

    public int f32495g;
    public int h;

    public int f32496i;

    public int f32497j;

    public org.telegram.ui.Cells.s1 f32498k;

    public byte[] f32499l;

    public MessageObject f32500m;

    public org.telegram.ui.Cells.s1 f32501n;

    public boolean f32502o;

    public int f32503p;

    public int f32504q;

    public int f32505r;

    public float f32506s;

    public float f32507t;

    public boolean f32508u;
    public y5 v;

    public float f32509w;

    public Path f32510x;

    public Path f32511y;

    public boolean f32512z;

    public final void a(Path path, float f10, float f11) {
        float fDpf2 = AndroidUtilities.dpf2(2.0f);
        int iX = org.telegram.messenger.rl.x(14.0f, this.h, 2);
        float f12 = f11 * this.f32509w;
        RectF rectF = AndroidUtilities.rectTmp;
        float f13 = fDpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f10) - f13, ((-f12) - f13) + AndroidUtilities.dp(7.0f) + iX, AndroidUtilities.dpf2(1.0f) + f10 + f13, f12 + f13 + AndroidUtilities.dp(7.0f) + iX);
        path.addRoundRect(rectF, fDpf2, fDpf2, Path.Direction.CW);
    }

    public final float[] b(int i10) {
        byte[] bArr = this.f32499l;
        if (bArr == null || i10 <= 0) {
            return null;
        }
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
                byte bMin = (byte) ((this.f32499l[i18] >> i19) & ((2 << (Math.min(i11, i20) - 1)) - 1));
                if (i21 > 0) {
                    int i22 = i18 + 1;
                    byte[] bArr2 = this.f32499l;
                    if (i22 < bArr2.length) {
                        bMin = (byte) (((byte) (bMin << i21)) | (bArr2[i22] & ((2 << (4 - i20)) - 1)));
                    }
                }
                int i23 = 0;
                while (i23 < i16) {
                    if (i14 >= i10) {
                        break loop0;
                    }
                    fArr[i14] = Math.max(0.0f, (bMin * 7) / 31.0f);
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

    public final void c(Canvas canvas, org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF;
        float[] fArr;
        float[] fArr2;
        MessageObject messageObject;
        if (this.f32499l == null || (i10 = this.f32495g) == 0 || this.f32506s <= 0.0f) {
            return;
        }
        float fDpf2 = i10 / AndroidUtilities.dpf2(3.0f);
        if (fDpf2 <= 0.1f) {
            return;
        }
        float f14 = this.f32507t;
        if (f14 != 1.0f) {
            float f15 = f14 + 0.10666667f;
            this.f32507t = f15;
            if (f15 > 1.0f) {
                this.f32507t = 1.0f;
            } else {
                s1Var.invalidate();
            }
        }
        float fD = this.v.d(1.0f, false);
        Path path = this.f32510x;
        if (path == null) {
            this.f32510x = new Path();
        } else {
            path.reset();
        }
        Path path2 = this.f32511y;
        if (path2 == null) {
            this.f32511y = new Path();
        } else {
            path2.reset();
        }
        org.telegram.ui.Cells.s1 s1Var2 = this.f32498k;
        boolean z10 = (s1Var2 == null || (messageObject = s1Var2.f25546u7) == null || !messageObject.isVoiceOnce()) ? false : true;
        float[] fArr3 = this.H;
        if (fArr3 == null || (fArr2 = this.I) == null) {
            f10 = fDpf2;
            f11 = 3.0f;
            if (this.G != null) {
                int i11 = 0;
                while (true) {
                    float f16 = i11;
                    if (f16 >= f10 || i11 >= this.G.length) {
                        break;
                    }
                    float fDpf3 = AndroidUtilities.dpf2(3.0f) * f16;
                    float fA = h7.n.a((fD * f10) - f16, 0.0f, 1.0f);
                    float[] fArr4 = this.G;
                    a(this.f32510x, fDpf3, org.telegram.ui.Cells.pa.b(1.0f, fA, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(fArr4[z10 ? (fArr4.length - 1) - i11 : i11]) * fA));
                    i11++;
                }
            }
            f12 = 0.0f;
        } else {
            int i12 = this.f32495g;
            int i13 = this.f32496i;
            float f17 = (i12 - i13) / (this.f32497j - i13);
            int iMax = Math.max(fArr3.length, fArr2.length);
            int iMin = Math.min(this.H.length, this.I.length);
            float[] fArr5 = this.H;
            int length = fArr5.length;
            float[] fArr6 = this.I;
            f11 = 3.0f;
            float[] fArr7 = length < fArr6.length ? fArr5 : fArr6;
            float[] fArr8 = fArr5.length < fArr6.length ? fArr6 : fArr5;
            if (fArr5.length >= fArr6.length) {
                f17 = 1.0f - f17;
            }
            int i14 = -1;
            int i15 = 0;
            f12 = 0.0f;
            while (i15 < iMax) {
                float f18 = i15;
                float f19 = fDpf2;
                int iB = h7.n.b((int) Math.floor((f18 / iMax) * iMin), 0, iMin - 1);
                if (i14 < iB) {
                    a(this.f32510x, AndroidUtilities.dpf2(3.0f) * AndroidUtilities.lerp(iB, f18, f17), AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr7[z10 ? (fArr7.length - 1) - iB : iB], fArr8[z10 ? (fArr8.length - 1) - i15 : i15], f17)));
                    i14 = iB;
                } else {
                    float fDpf4 = AndroidUtilities.dpf2(3.0f) * AndroidUtilities.lerp(iB, f18, f17);
                    if (z10) {
                        iB = (fArr7.length - 1) - iB;
                    }
                    a(this.f32511y, fDpf4, AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr7[iB], fArr8[z10 ? (fArr8.length - 1) - i15 : i15], f17)));
                    f12 = f17;
                }
                i15++;
                fDpf2 = f19;
            }
            f10 = fDpf2;
        }
        if (this.J || this.L > 0.0f) {
            canvas.save();
            f13 = 0.0f;
            canvas.clipRect(0.0f, 0.0f, (1.0f - (this.K * this.L)) * AndroidUtilities.dpf2(f11) * f10, this.h);
        } else {
            f13 = 0.0f;
        }
        if (f12 > f13) {
            canvas.save();
            canvas.clipPath(this.f32511y);
            d(canvas, f12 * this.f32506s);
            canvas.restore();
        }
        canvas.save();
        canvas.clipPath(this.f32510x);
        d(canvas, this.f32506s);
        canvas.restore();
        if (this.J || this.L > 0.0f) {
            canvas.restore();
            if (this.M == null) {
                this.M = new j4.v0(new mb0(this, 26));
            }
            float f20 = this.K;
            if (f20 >= 0.99f || (fArr = this.G) == null) {
                rectF = null;
            } else {
                int i16 = (int) ((1.0f - f20) * f10);
                if (z10) {
                    i16 = (int) ((f10 - 1.0f) - i16);
                }
                if (i16 < 0 || i16 >= fArr.length) {
                    rectF = null;
                } else {
                    float fDpf5 = AndroidUtilities.dpf2(this.G[i16]) * h7.n.a((fD * f10) - i16, 0.0f, 1.0f);
                    rectF = AndroidUtilities.rectTmp;
                    float fDpf6 = AndroidUtilities.dpf2(f11) * (1.0f - this.K) * f10;
                    float fDpf7 = AndroidUtilities.dpf2(2.0f);
                    int iX = org.telegram.messenger.rl.x(14.0f, this.h, 2);
                    float f21 = fDpf5 * this.f32509w;
                    float f22 = fDpf7 / 2.0f;
                    rectF.set((AndroidUtilities.dpf2(1.0f) + fDpf6) - f22, ((-f21) - f22) + AndroidUtilities.dp(7.0f) + iX, AndroidUtilities.dpf2(1.0f) + fDpf6 + f22, f21 + f22 + AndroidUtilities.dp(7.0f) + iX);
                }
            }
            j4.v0 v0Var = this.M;
            ((Paint) v0Var.f12693f).setColor(this.f32504q);
            v0Var.f12694g = rectF;
            float f23 = this.L;
            Paint paint = (Paint) v0Var.f12693f;
            ArrayList arrayList = (ArrayList) v0Var.f12692e;
            ArrayList arrayList2 = (ArrayList) v0Var.d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMin = Math.min(20L, jCurrentTimeMillis - v0Var.f12690b);
            v0Var.f12690b = jCurrentTimeMillis;
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                rn0 rn0Var = (rn0) arrayList2.get(i17);
                float f24 = jMin;
                float f25 = rn0Var.f32241f - (f24 / rn0Var.f32242g);
                rn0Var.f32241f = f25;
                if (f25 < 0.0f) {
                    arrayList.add(rn0Var);
                    arrayList2.remove(i17);
                    i17--;
                } else {
                    float f26 = rn0Var.f32237a;
                    float f27 = rn0Var.d;
                    float f28 = rn0Var.f32239c;
                    rn0Var.f32237a = (((f27 * f28) * f24) / 500.0f) + f26;
                    float f29 = rn0Var.f32238b;
                    float f30 = rn0Var.f32240e;
                    rn0Var.f32238b = (((f28 * f30) * f24) / 500.0f) + f29;
                    rn0Var.f32240e = f30 - ((((long) AndroidUtilities.dp(0.33f)) * jMin) / 500.0f);
                }
                i17++;
            }
            if (((RectF) v0Var.f12694g) != null) {
                int iMin2 = Math.min(4, v0Var.f12689a - arrayList2.size());
                for (int i18 = 0; i18 < iMin2; i18++) {
                    rn0 rn0Var2 = arrayList.isEmpty() ? new rn0() : (rn0) arrayList.remove(0);
                    RectF rectF2 = (RectF) v0Var.f12694g;
                    rn0Var2.f32237a = (Utilities.random.nextFloat() * rectF2.width()) + rectF2.left;
                    RectF rectF3 = (RectF) v0Var.f12694g;
                    rn0Var2.f32238b = (Utilities.random.nextFloat() * rectF3.height()) + rectF3.top;
                    double dNextInt = ((double) (Utilities.random.nextInt(200) - 125)) * 0.017453292519943295d;
                    rn0Var2.d = ((float) (Math.cos(dNextInt) - Math.sin(dNextInt))) * 0.8f;
                    rn0Var2.f32240e = ((float) (Math.cos(dNextInt) + Math.sin(dNextInt))) - 0.2f;
                    rn0Var2.f32241f = 1.0f;
                    rn0Var2.f32239c = AndroidUtilities.dp((Utilities.random.nextFloat() * 7.0f) + 10.0f);
                    rn0Var2.f32242g = AndroidUtilities.lerp(420, 550, Utilities.random.nextFloat());
                    arrayList2.add(rn0Var2);
                }
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                rn0 rn0Var3 = (rn0) arrayList2.get(i19);
                paint.setAlpha((int) (255.0f * f23 * rn0Var3.f32241f));
                canvas.drawPoint(rn0Var3.f32237a, rn0Var3.f32238b, paint);
            }
            mb0 mb0Var = (mb0) v0Var.f12691c;
            if (mb0Var != null) {
                mb0Var.run();
            }
        }
    }

    public final void d(Canvas canvas, float f10) {
        int i10;
        y5 y5Var = this.B;
        float fDpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.f32500m;
        boolean z10 = messageObject != null && messageObject.isContentUnread() && !this.f32500m.isOut() && this.f32492c <= 0.0f;
        this.f32508u = z10;
        Paint paint = N;
        if (z10) {
            i10 = this.f32504q;
        } else {
            i10 = this.f32502o ? this.f32505r : this.f32503p;
        }
        paint.setColor(i10);
        O.setColor(this.f32504q);
        y5Var.f34810a = this.f32501n;
        float fD = y5Var.d((!this.f32512z || MediaController.getInstance().isPlayingMessage(this.f32500m)) ? 0.0f : 1.0f, false);
        Paint paint2 = N;
        paint2.setColor(i0.b.d(fD, paint2.getColor(), this.f32503p));
        Paint paint3 = O;
        float f11 = 1.0f - fD;
        paint3.setAlpha((int) (paint3.getAlpha() * f11 * f10));
        Paint paint4 = N;
        paint4.setAlpha((int) (paint4.getAlpha() * f10));
        canvas.drawRect(0.0f, 0.0f, this.f32495g + fDpf2, this.h, N);
        if (fD < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.f32495g + fDpf2) * this.f32492c * f11, this.h, O);
        }
        if (fD > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.f32495g) > AndroidUtilities.dp(8.0f) || this.E != this.f32503p || this.F != this.f32504q) {
                if (this.C == null) {
                    this.C = new Paint(1);
                }
                this.E = this.f32503p;
                this.F = this.f32504q;
                Paint paint5 = this.C;
                float f12 = this.f32495g;
                this.D = f12;
                int i11 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i11, this.F, i11}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (fD * 255.0f * f10));
            canvas.save();
            float fPow = ((((float) Math.pow((SystemClock.elapsedRealtime() - this.A) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(fPow, 0.0f);
            canvas.drawRect(-fPow, 0.0f, (this.f32495g + 5) - fPow, this.h, this.C);
            canvas.restore();
            org.telegram.ui.Cells.s1 s1Var = this.f32501n;
            if (s1Var != null) {
                s1Var.invalidate();
            }
        }
    }

    public final void e(float f10) {
        this.f32506s = f10;
    }

    public final void f() {
        g(0.0f, false);
    }

    public final void g(float f10, boolean z10) {
        if (!this.f32498k.o3()) {
            this.f32492c = 1.0f;
            return;
        }
        boolean z11 = this.f32508u;
        this.f32492c = z11 ? 1.0f : f10;
        int i10 = z11 ? this.f32495g : this.f32490a;
        if (z10 && i10 != 0 && f10 == 0.0f) {
            this.f32507t = 0.0f;
        } else if (!z10) {
            this.f32507t = 1.0f;
        }
        int iCeil = (int) Math.ceil(this.f32495g * f10);
        this.f32490a = iCeil;
        if (iCeil < 0) {
            this.f32490a = 0;
            return;
        }
        int i11 = this.f32495g;
        if (iCeil > i11) {
            this.f32490a = i11;
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        this.f32495g = i10;
        this.h = i11;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i10 / AndroidUtilities.dpf2(3.0f)))) {
            this.G = b((int) (this.f32495g / AndroidUtilities.dpf2(3.0f)));
        }
        if (i12 == i13 || (this.f32496i == i12 && this.f32497j == i13)) {
            if (i12 == i13) {
                this.I = null;
                this.H = null;
                return;
            }
            return;
        }
        this.f32496i = i12;
        this.f32497j = i13;
        this.H = b((int) (i12 / AndroidUtilities.dpf2(3.0f)));
        this.I = b((int) (this.f32497j / AndroidUtilities.dpf2(3.0f)));
    }
}
