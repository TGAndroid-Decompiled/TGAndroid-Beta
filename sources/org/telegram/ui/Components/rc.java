package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class rc {
    public float f37618a;
    public float f37619b;
    public float f37620c;
    public float d;
    public float f37621e;
    public float f37622f;
    public int f37623g;
    public float[] f37626k;
    public float[] f37627l;
    public float[] f37628m;
    public float[] f37629n;
    public float[] f37630o;
    public float[] f37631p;
    public float[] f37632q;
    public float[] f37633r;
    public float[] f37634s;
    public float[] f37635t;
    public float[] f37636u;
    public float[] v;
    public float[] f37637w;
    public int f37638x;
    public int h = -11318601;
    public final Paint f37624i = new Paint(1);
    public final Random f37625j = new Random();
    public int f37639y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f37624i;
        paint.setColor(i7);
        paint.setAlpha((this.f37623g * this.f37639y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rc.b(int):void");
    }

    public final void c(int i7) {
        this.f37638x = i7;
        this.f37626k = new float[i7];
        this.f37627l = new float[i7];
        this.f37628m = new float[i7];
        this.f37629n = new float[i7];
        this.f37630o = new float[i7];
        this.f37631p = new float[i7];
        this.f37632q = new float[i7];
        this.f37633r = new float[i7];
        this.f37634s = new float[i7];
        this.f37635t = new float[i7];
        this.f37636u = new float[i7];
        this.v = new float[i7];
        this.f37637w = new float[i7];
        for (int i10 = 0; i10 < this.f37638x; i10++) {
            float[] fArr = this.f37626k;
            Random random = this.f37625j;
            fArr[i10] = random.nextFloat();
            this.f37628m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f37638x;
            b(i10);
            this.f37630o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f37638x; i7++) {
            float[] fArr = this.f37630o;
            float f11 = fArr[i7];
            float f12 = this.f37631p[i7];
            qc qcVar = sc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f37626k[i7] = this.f37627l[i7];
                this.f37628m[i7] = this.f37629n[i7];
                b(i7);
            }
        }
    }
}
