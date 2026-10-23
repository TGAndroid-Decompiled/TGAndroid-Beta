package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f26857a;
    public float f26858b;
    public float f26859c;
    public float d;
    public float e;
    public float f26860f;
    public int f26861g;
    public float[] f26864k;
    public float[] f26865l;
    public float[] f26866m;
    public float[] f26867n;
    public float[] f26868o;
    public float[] f26869p;
    public float[] f26870q;
    public float[] f26871r;
    public float[] f26872s;
    public float[] f26873t;
    public float[] f26874u;
    public float[] v;
    public float[] f26875w;
    public int f26876x;
    public int h = -11318601;
    public final Paint f26862i = new Paint(1);
    public final Random f26863j = new Random();
    public int f26877y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f26862i;
        paint.setColor(i10);
        paint.setAlpha((this.f26861g * this.f26877y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hd.b(int):void");
    }

    public final void c(int i10) {
        this.f26876x = i10;
        this.f26864k = new float[i10];
        this.f26865l = new float[i10];
        this.f26866m = new float[i10];
        this.f26867n = new float[i10];
        this.f26868o = new float[i10];
        this.f26869p = new float[i10];
        this.f26870q = new float[i10];
        this.f26871r = new float[i10];
        this.f26872s = new float[i10];
        this.f26873t = new float[i10];
        this.f26874u = new float[i10];
        this.v = new float[i10];
        this.f26875w = new float[i10];
        for (int i11 = 0; i11 < this.f26876x; i11++) {
            float[] fArr = this.f26864k;
            Random random = this.f26863j;
            fArr[i11] = random.nextFloat();
            this.f26866m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f26876x;
            b(i11);
            this.f26868o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f26876x; i10++) {
            float[] fArr = this.f26868o;
            float f10 = fArr[i10];
            float f11 = this.f26869p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f26864k[i10] = this.f26865l[i10];
                this.f26866m[i10] = this.f26867n[i10];
                b(i10);
            }
        }
    }
}
