package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class vc {
    public float f40633a;
    public float f40634b;
    public float f40635c;
    public float d;
    public float f40636e;
    public float f40637f;
    public int f40638g;
    public float[] f40641k;
    public float[] f40642l;
    public float[] f40643m;
    public float[] f40644n;
    public float[] f40645o;
    public float[] f40646p;
    public float[] f40647q;
    public float[] f40648r;
    public float[] f40649s;
    public float[] f40650t;
    public float[] f40651u;
    public float[] v;
    public float[] f40652w;
    public int f40653x;
    public int h = -11318601;
    public final Paint f40639i = new Paint(1);
    public final Random f40640j = new Random();
    public int f40654y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f40639i;
        paint.setColor(i7);
        paint.setAlpha((this.f40638g * this.f40654y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc.b(int):void");
    }

    public final void c(int i7) {
        this.f40653x = i7;
        this.f40641k = new float[i7];
        this.f40642l = new float[i7];
        this.f40643m = new float[i7];
        this.f40644n = new float[i7];
        this.f40645o = new float[i7];
        this.f40646p = new float[i7];
        this.f40647q = new float[i7];
        this.f40648r = new float[i7];
        this.f40649s = new float[i7];
        this.f40650t = new float[i7];
        this.f40651u = new float[i7];
        this.v = new float[i7];
        this.f40652w = new float[i7];
        for (int i10 = 0; i10 < this.f40653x; i10++) {
            float[] fArr = this.f40641k;
            Random random = this.f40640j;
            fArr[i10] = random.nextFloat();
            this.f40643m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f40653x;
            b(i10);
            this.f40645o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f40653x; i7++) {
            float[] fArr = this.f40645o;
            float f11 = fArr[i7];
            float f12 = this.f40646p[i7];
            uc ucVar = wc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f40641k[i7] = this.f40642l[i7];
                this.f40643m[i7] = this.f40644n[i7];
                b(i7);
            }
        }
    }
}
