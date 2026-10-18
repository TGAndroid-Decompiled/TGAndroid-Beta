package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f26856a;
    public float f26857b;
    public float f26858c;
    public float d;
    public float e;
    public float f26859f;
    public int f26860g;
    public float[] f26863k;
    public float[] f26864l;
    public float[] f26865m;
    public float[] f26866n;
    public float[] f26867o;
    public float[] f26868p;
    public float[] f26869q;
    public float[] f26870r;
    public float[] f26871s;
    public float[] f26872t;
    public float[] f26873u;
    public float[] v;
    public float[] f26874w;
    public int f26875x;
    public int h = -11318601;
    public final Paint f26861i = new Paint(1);
    public final Random f26862j = new Random();
    public int f26876y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f26861i;
        paint.setColor(i10);
        paint.setAlpha((this.f26860g * this.f26876y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hd.b(int):void");
    }

    public final void c(int i10) {
        this.f26875x = i10;
        this.f26863k = new float[i10];
        this.f26864l = new float[i10];
        this.f26865m = new float[i10];
        this.f26866n = new float[i10];
        this.f26867o = new float[i10];
        this.f26868p = new float[i10];
        this.f26869q = new float[i10];
        this.f26870r = new float[i10];
        this.f26871s = new float[i10];
        this.f26872t = new float[i10];
        this.f26873u = new float[i10];
        this.v = new float[i10];
        this.f26874w = new float[i10];
        for (int i11 = 0; i11 < this.f26875x; i11++) {
            float[] fArr = this.f26863k;
            Random random = this.f26862j;
            fArr[i11] = random.nextFloat();
            this.f26865m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f26875x;
            b(i11);
            this.f26867o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f26875x; i10++) {
            float[] fArr = this.f26867o;
            float f10 = fArr[i10];
            float f11 = this.f26868p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f26863k[i10] = this.f26864l[i10];
                this.f26865m[i10] = this.f26866n[i10];
                b(i10);
            }
        }
    }
}
