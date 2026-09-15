package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class fd {
    public float f23892a;
    public float f23893b;
    public float f23894c;
    public float d;
    public float e;
    public float f23895f;
    public int f23896g;
    public float[] f23899k;
    public float[] f23900l;
    public float[] f23901m;
    public float[] f23902n;
    public float[] f23903o;
    public float[] f23904p;
    public float[] f23905q;
    public float[] f23906r;
    public float[] f23907s;
    public float[] f23908t;
    public float[] f23909u;
    public float[] v;
    public float[] f23910w;
    public int f23911x;
    public int h = -11318601;
    public final Paint f23897i = new Paint(1);
    public final Random f23898j = new Random();
    public int f23912y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f23897i;
        paint.setColor(i10);
        paint.setAlpha((this.f23896g * this.f23912y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f23911x;
        float f10 = this.f23899k[i10];
        Random random = this.f23898j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f23900l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f23901m[i10];
        float[] fArr2 = this.f23902n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f23904p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f23892a;
    }

    public final void c(int i10) {
        this.f23911x = i10;
        this.f23899k = new float[i10];
        this.f23900l = new float[i10];
        this.f23901m = new float[i10];
        this.f23902n = new float[i10];
        this.f23903o = new float[i10];
        this.f23904p = new float[i10];
        this.f23905q = new float[i10];
        this.f23906r = new float[i10];
        this.f23907s = new float[i10];
        this.f23908t = new float[i10];
        this.f23909u = new float[i10];
        this.v = new float[i10];
        this.f23910w = new float[i10];
        for (int i11 = 0; i11 < this.f23911x; i11++) {
            float[] fArr = this.f23899k;
            Random random = this.f23898j;
            fArr[i11] = random.nextFloat();
            this.f23901m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f23911x;
            b(i11);
            this.f23903o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f23911x; i10++) {
            float[] fArr = this.f23903o;
            float f10 = fArr[i10];
            float f11 = this.f23904p[i10];
            ed edVar = gd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f23899k[i10] = this.f23900l[i10];
                this.f23901m[i10] = this.f23902n[i10];
                b(i10);
            }
        }
    }
}
