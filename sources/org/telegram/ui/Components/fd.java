package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class fd {
    public float f23891a;
    public float f23892b;
    public float f23893c;
    public float d;
    public float e;
    public float f23894f;
    public int f23895g;
    public float[] f23898k;
    public float[] f23899l;
    public float[] f23900m;
    public float[] f23901n;
    public float[] f23902o;
    public float[] f23903p;
    public float[] f23904q;
    public float[] f23905r;
    public float[] f23906s;
    public float[] f23907t;
    public float[] f23908u;
    public float[] v;
    public float[] f23909w;
    public int f23910x;
    public int h = -11318601;
    public final Paint f23896i = new Paint(1);
    public final Random f23897j = new Random();
    public int f23911y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f23896i;
        paint.setColor(i10);
        paint.setAlpha((this.f23895g * this.f23911y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f23910x;
        float f10 = this.f23898k[i10];
        Random random = this.f23897j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f23899l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f23900m[i10];
        float[] fArr2 = this.f23901n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f23903p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f23891a;
    }

    public final void c(int i10) {
        this.f23910x = i10;
        this.f23898k = new float[i10];
        this.f23899l = new float[i10];
        this.f23900m = new float[i10];
        this.f23901n = new float[i10];
        this.f23902o = new float[i10];
        this.f23903p = new float[i10];
        this.f23904q = new float[i10];
        this.f23905r = new float[i10];
        this.f23906s = new float[i10];
        this.f23907t = new float[i10];
        this.f23908u = new float[i10];
        this.v = new float[i10];
        this.f23909w = new float[i10];
        for (int i11 = 0; i11 < this.f23910x; i11++) {
            float[] fArr = this.f23898k;
            Random random = this.f23897j;
            fArr[i11] = random.nextFloat();
            this.f23900m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f23910x;
            b(i11);
            this.f23902o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f23910x; i10++) {
            float[] fArr = this.f23902o;
            float f10 = fArr[i10];
            float f11 = this.f23903p[i10];
            ed edVar = gd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f23898k[i10] = this.f23899l[i10];
                this.f23900m[i10] = this.f23901n[i10];
                b(i10);
            }
        }
    }
}
