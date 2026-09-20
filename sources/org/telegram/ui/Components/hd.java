package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f24616a;
    public float f24617b;
    public float f24618c;
    public float d;
    public float e;
    public float f24619f;
    public int f24620g;
    public float[] f24623k;
    public float[] f24624l;
    public float[] f24625m;
    public float[] f24626n;
    public float[] f24627o;
    public float[] f24628p;
    public float[] f24629q;
    public float[] f24630r;
    public float[] f24631s;
    public float[] f24632t;
    public float[] f24633u;
    public float[] v;
    public float[] f24634w;
    public int f24635x;
    public int h = -11318601;
    public final Paint f24621i = new Paint(1);
    public final Random f24622j = new Random();
    public int f24636y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f24621i;
        paint.setColor(i10);
        paint.setAlpha((this.f24620g * this.f24636y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f24635x;
        float f10 = this.f24623k[i10];
        Random random = this.f24622j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f24624l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f24625m[i10];
        float[] fArr2 = this.f24626n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f24628p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f24616a;
    }

    public final void c(int i10) {
        this.f24635x = i10;
        this.f24623k = new float[i10];
        this.f24624l = new float[i10];
        this.f24625m = new float[i10];
        this.f24626n = new float[i10];
        this.f24627o = new float[i10];
        this.f24628p = new float[i10];
        this.f24629q = new float[i10];
        this.f24630r = new float[i10];
        this.f24631s = new float[i10];
        this.f24632t = new float[i10];
        this.f24633u = new float[i10];
        this.v = new float[i10];
        this.f24634w = new float[i10];
        for (int i11 = 0; i11 < this.f24635x; i11++) {
            float[] fArr = this.f24623k;
            Random random = this.f24622j;
            fArr[i11] = random.nextFloat();
            this.f24625m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f24635x;
            b(i11);
            this.f24627o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f24635x; i10++) {
            float[] fArr = this.f24627o;
            float f10 = fArr[i10];
            float f11 = this.f24628p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f24623k[i10] = this.f24624l[i10];
                this.f24625m[i10] = this.f24626n[i10];
                b(i10);
            }
        }
    }
}
