package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class vc {
    public float f40568a;
    public float f40569b;
    public float f40570c;
    public float d;
    public float f40571e;
    public float f40572f;
    public int f40573g;
    public float[] f40576k;
    public float[] f40577l;
    public float[] f40578m;
    public float[] f40579n;
    public float[] f40580o;
    public float[] f40581p;
    public float[] f40582q;
    public float[] f40583r;
    public float[] f40584s;
    public float[] f40585t;
    public float[] f40586u;
    public float[] v;
    public float[] f40587w;
    public int f40588x;
    public int h = -11318601;
    public final Paint f40574i = new Paint(1);
    public final Random f40575j = new Random();
    public int f40589y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f40574i;
        paint.setColor(i7);
        paint.setAlpha((this.f40573g * this.f40589y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc.b(int):void");
    }

    public final void c(int i7) {
        this.f40588x = i7;
        this.f40576k = new float[i7];
        this.f40577l = new float[i7];
        this.f40578m = new float[i7];
        this.f40579n = new float[i7];
        this.f40580o = new float[i7];
        this.f40581p = new float[i7];
        this.f40582q = new float[i7];
        this.f40583r = new float[i7];
        this.f40584s = new float[i7];
        this.f40585t = new float[i7];
        this.f40586u = new float[i7];
        this.v = new float[i7];
        this.f40587w = new float[i7];
        for (int i10 = 0; i10 < this.f40588x; i10++) {
            float[] fArr = this.f40576k;
            Random random = this.f40575j;
            fArr[i10] = random.nextFloat();
            this.f40578m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f40588x;
            b(i10);
            this.f40580o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f40588x; i7++) {
            float[] fArr = this.f40580o;
            float f11 = fArr[i7];
            float f12 = this.f40581p[i7];
            uc ucVar = wc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f40576k[i7] = this.f40577l[i7];
                this.f40578m[i7] = this.f40579n[i7];
                b(i7);
            }
        }
    }
}
