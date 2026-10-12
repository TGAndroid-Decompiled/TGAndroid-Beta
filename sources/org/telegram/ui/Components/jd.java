package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class jd {
    public float f27451a;
    public float f27452b;
    public float f27453c;
    public float d;
    public float f27454e;
    public float f27455f;
    public int f27456g;
    public float[] f27459k;
    public float[] f27460l;
    public float[] f27461m;
    public float[] f27462n;
    public float[] f27463o;
    public float[] f27464p;
    public float[] f27465q;
    public float[] f27466r;
    public float[] f27467s;
    public float[] f27468t;
    public float[] f27469u;
    public float[] v;
    public float[] f27470w;
    public int f27471x;
    public int h = -11318601;
    public final Paint f27457i = new Paint(1);
    public final Random f27458j = new Random();
    public int f27472y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27457i;
        paint.setColor(i10);
        paint.setAlpha((this.f27456g * this.f27472y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jd.b(int):void");
    }

    public final void c(int i10) {
        this.f27471x = i10;
        this.f27459k = new float[i10];
        this.f27460l = new float[i10];
        this.f27461m = new float[i10];
        this.f27462n = new float[i10];
        this.f27463o = new float[i10];
        this.f27464p = new float[i10];
        this.f27465q = new float[i10];
        this.f27466r = new float[i10];
        this.f27467s = new float[i10];
        this.f27468t = new float[i10];
        this.f27469u = new float[i10];
        this.v = new float[i10];
        this.f27470w = new float[i10];
        for (int i11 = 0; i11 < this.f27471x; i11++) {
            float[] fArr = this.f27459k;
            Random random = this.f27458j;
            fArr[i11] = random.nextFloat();
            this.f27461m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27471x;
            b(i11);
            this.f27463o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27471x; i10++) {
            float[] fArr = this.f27463o;
            float f10 = fArr[i10];
            float f11 = this.f27464p[i10];
            id idVar = kd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27459k[i10] = this.f27460l[i10];
                this.f27461m[i10] = this.f27462n[i10];
                b(i10);
            }
        }
    }
}
