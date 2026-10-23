package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f26884a;
    public float f26885b;
    public float f26886c;
    public float d;
    public float e;
    public float f26887f;
    public int f26888g;
    public float[] f26891k;
    public float[] f26892l;
    public float[] f26893m;
    public float[] f26894n;
    public float[] f26895o;
    public float[] f26896p;
    public float[] f26897q;
    public float[] f26898r;
    public float[] f26899s;
    public float[] f26900t;
    public float[] f26901u;
    public float[] v;
    public float[] f26902w;
    public int f26903x;
    public int h = -11318601;
    public final Paint f26889i = new Paint(1);
    public final Random f26890j = new Random();
    public int f26904y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f26889i;
        paint.setColor(i10);
        paint.setAlpha((this.f26888g * this.f26904y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hd.b(int):void");
    }

    public final void c(int i10) {
        this.f26903x = i10;
        this.f26891k = new float[i10];
        this.f26892l = new float[i10];
        this.f26893m = new float[i10];
        this.f26894n = new float[i10];
        this.f26895o = new float[i10];
        this.f26896p = new float[i10];
        this.f26897q = new float[i10];
        this.f26898r = new float[i10];
        this.f26899s = new float[i10];
        this.f26900t = new float[i10];
        this.f26901u = new float[i10];
        this.v = new float[i10];
        this.f26902w = new float[i10];
        for (int i11 = 0; i11 < this.f26903x; i11++) {
            float[] fArr = this.f26891k;
            Random random = this.f26890j;
            fArr[i11] = random.nextFloat();
            this.f26893m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f26903x;
            b(i11);
            this.f26895o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f26903x; i10++) {
            float[] fArr = this.f26895o;
            float f10 = fArr[i10];
            float f11 = this.f26896p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f26891k[i10] = this.f26892l[i10];
                this.f26893m[i10] = this.f26894n[i10];
                b(i10);
            }
        }
    }
}
