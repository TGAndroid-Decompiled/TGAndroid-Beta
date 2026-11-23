package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class vc {
    public float f40726a;
    public float f40727b;
    public float f40728c;
    public float d;
    public float f40729e;
    public float f40730f;
    public int f40731g;
    public float[] f40734k;
    public float[] f40735l;
    public float[] f40736m;
    public float[] f40737n;
    public float[] f40738o;
    public float[] f40739p;
    public float[] f40740q;
    public float[] f40741r;
    public float[] f40742s;
    public float[] f40743t;
    public float[] f40744u;
    public float[] v;
    public float[] f40745w;
    public int f40746x;
    public int h = -11318601;
    public final Paint f40732i = new Paint(1);
    public final Random f40733j = new Random();
    public int f40747y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f40732i;
        paint.setColor(i7);
        paint.setAlpha((this.f40731g * this.f40747y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc.b(int):void");
    }

    public final void c(int i7) {
        this.f40746x = i7;
        this.f40734k = new float[i7];
        this.f40735l = new float[i7];
        this.f40736m = new float[i7];
        this.f40737n = new float[i7];
        this.f40738o = new float[i7];
        this.f40739p = new float[i7];
        this.f40740q = new float[i7];
        this.f40741r = new float[i7];
        this.f40742s = new float[i7];
        this.f40743t = new float[i7];
        this.f40744u = new float[i7];
        this.v = new float[i7];
        this.f40745w = new float[i7];
        for (int i10 = 0; i10 < this.f40746x; i10++) {
            float[] fArr = this.f40734k;
            Random random = this.f40733j;
            fArr[i10] = random.nextFloat();
            this.f40736m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f40746x;
            b(i10);
            this.f40738o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f40746x; i7++) {
            float[] fArr = this.f40738o;
            float f11 = fArr[i7];
            float f12 = this.f40739p[i7];
            uc ucVar = wc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f40734k[i7] = this.f40735l[i7];
                this.f40736m[i7] = this.f40737n[i7];
                b(i7);
            }
        }
    }
}
