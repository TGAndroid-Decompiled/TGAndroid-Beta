package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class kd {
    public float f28024a;
    public float f28025b;
    public float f28026c;
    public float d;
    public float f28027e;
    public float f28028f;
    public int f28029g;
    public float[] f28032k;
    public float[] f28033l;
    public float[] f28034m;
    public float[] f28035n;
    public float[] f28036o;
    public float[] f28037p;
    public float[] f28038q;
    public float[] f28039r;
    public float[] f28040s;
    public float[] f28041t;
    public float[] f28042u;
    public float[] v;
    public float[] f28043w;
    public int f28044x;
    public int h = -11318601;
    public final Paint f28030i = new Paint(1);
    public final Random f28031j = new Random();
    public int f28045y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f28030i;
        paint.setColor(i10);
        paint.setAlpha((this.f28029g * this.f28045y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kd.b(int):void");
    }

    public final void c(int i10) {
        this.f28044x = i10;
        this.f28032k = new float[i10];
        this.f28033l = new float[i10];
        this.f28034m = new float[i10];
        this.f28035n = new float[i10];
        this.f28036o = new float[i10];
        this.f28037p = new float[i10];
        this.f28038q = new float[i10];
        this.f28039r = new float[i10];
        this.f28040s = new float[i10];
        this.f28041t = new float[i10];
        this.f28042u = new float[i10];
        this.v = new float[i10];
        this.f28043w = new float[i10];
        for (int i11 = 0; i11 < this.f28044x; i11++) {
            float[] fArr = this.f28032k;
            Random random = this.f28031j;
            fArr[i11] = random.nextFloat();
            this.f28034m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f28044x;
            b(i11);
            this.f28036o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f28044x; i10++) {
            float[] fArr = this.f28036o;
            float f10 = fArr[i10];
            float f11 = this.f28037p[i10];
            jd jdVar = ld.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f28032k[i10] = this.f28033l[i10];
                this.f28034m[i10] = this.f28035n[i10];
                b(i10);
            }
        }
    }
}
