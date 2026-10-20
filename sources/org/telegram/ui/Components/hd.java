package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f26853a;
    public float f26854b;
    public float f26855c;
    public float d;
    public float e;
    public float f26856f;
    public int f26857g;
    public float[] f26860k;
    public float[] f26861l;
    public float[] f26862m;
    public float[] f26863n;
    public float[] f26864o;
    public float[] f26865p;
    public float[] f26866q;
    public float[] f26867r;
    public float[] f26868s;
    public float[] f26869t;
    public float[] f26870u;
    public float[] v;
    public float[] f26871w;
    public int f26872x;
    public int h = -11318601;
    public final Paint f26858i = new Paint(1);
    public final Random f26859j = new Random();
    public int f26873y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f26858i;
        paint.setColor(i10);
        paint.setAlpha((this.f26857g * this.f26873y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hd.b(int):void");
    }

    public final void c(int i10) {
        this.f26872x = i10;
        this.f26860k = new float[i10];
        this.f26861l = new float[i10];
        this.f26862m = new float[i10];
        this.f26863n = new float[i10];
        this.f26864o = new float[i10];
        this.f26865p = new float[i10];
        this.f26866q = new float[i10];
        this.f26867r = new float[i10];
        this.f26868s = new float[i10];
        this.f26869t = new float[i10];
        this.f26870u = new float[i10];
        this.v = new float[i10];
        this.f26871w = new float[i10];
        for (int i11 = 0; i11 < this.f26872x; i11++) {
            float[] fArr = this.f26860k;
            Random random = this.f26859j;
            fArr[i11] = random.nextFloat();
            this.f26862m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f26872x;
            b(i11);
            this.f26864o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f26872x; i10++) {
            float[] fArr = this.f26864o;
            float f10 = fArr[i10];
            float f11 = this.f26865p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f26860k[i10] = this.f26861l[i10];
                this.f26862m[i10] = this.f26863n[i10];
                b(i10);
            }
        }
    }
}
