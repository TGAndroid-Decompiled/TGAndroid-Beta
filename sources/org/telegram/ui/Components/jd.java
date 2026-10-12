package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class jd {
    public float f27445a;
    public float f27446b;
    public float f27447c;
    public float d;
    public float f27448e;
    public float f27449f;
    public int f27450g;
    public float[] f27453k;
    public float[] f27454l;
    public float[] f27455m;
    public float[] f27456n;
    public float[] f27457o;
    public float[] f27458p;
    public float[] f27459q;
    public float[] f27460r;
    public float[] f27461s;
    public float[] f27462t;
    public float[] f27463u;
    public float[] v;
    public float[] f27464w;
    public int f27465x;
    public int h = -11318601;
    public final Paint f27451i = new Paint(1);
    public final Random f27452j = new Random();
    public int f27466y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27451i;
        paint.setColor(i10);
        paint.setAlpha((this.f27450g * this.f27466y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jd.b(int):void");
    }

    public final void c(int i10) {
        this.f27465x = i10;
        this.f27453k = new float[i10];
        this.f27454l = new float[i10];
        this.f27455m = new float[i10];
        this.f27456n = new float[i10];
        this.f27457o = new float[i10];
        this.f27458p = new float[i10];
        this.f27459q = new float[i10];
        this.f27460r = new float[i10];
        this.f27461s = new float[i10];
        this.f27462t = new float[i10];
        this.f27463u = new float[i10];
        this.v = new float[i10];
        this.f27464w = new float[i10];
        for (int i11 = 0; i11 < this.f27465x; i11++) {
            float[] fArr = this.f27453k;
            Random random = this.f27452j;
            fArr[i11] = random.nextFloat();
            this.f27455m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27465x;
            b(i11);
            this.f27457o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27465x; i10++) {
            float[] fArr = this.f27457o;
            float f10 = fArr[i10];
            float f11 = this.f27458p[i10];
            id idVar = kd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27453k[i10] = this.f27454l[i10];
                this.f27455m[i10] = this.f27456n[i10];
                b(i10);
            }
        }
    }
}
