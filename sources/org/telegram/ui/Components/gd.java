package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class gd {
    public float f23327a;
    public float f23328b;
    public float f23329c;
    public float d;
    public float e;
    public float f23330f;
    public int f23331g;
    public float[] f23334k;
    public float[] f23335l;
    public float[] f23336m;
    public float[] f23337n;
    public float[] f23338o;
    public float[] f23339p;
    public float[] f23340q;
    public float[] f23341r;
    public float[] f23342s;
    public float[] f23343t;
    public float[] f23344u;
    public float[] v;
    public float[] f23345w;
    public int f23346x;
    public int h = -11318601;
    public final Paint f23332i = new Paint(1);
    public final Random f23333j = new Random();
    public int f23347y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f23332i;
        paint.setColor(i10);
        paint.setAlpha((this.f23331g * this.f23347y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f23346x;
        float f10 = this.f23334k[i10];
        Random random = this.f23333j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f23335l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f23336m[i10];
        float[] fArr2 = this.f23337n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f23339p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f23327a;
    }

    public final void c(int i10) {
        this.f23346x = i10;
        this.f23334k = new float[i10];
        this.f23335l = new float[i10];
        this.f23336m = new float[i10];
        this.f23337n = new float[i10];
        this.f23338o = new float[i10];
        this.f23339p = new float[i10];
        this.f23340q = new float[i10];
        this.f23341r = new float[i10];
        this.f23342s = new float[i10];
        this.f23343t = new float[i10];
        this.f23344u = new float[i10];
        this.v = new float[i10];
        this.f23345w = new float[i10];
        for (int i11 = 0; i11 < this.f23346x; i11++) {
            float[] fArr = this.f23334k;
            Random random = this.f23333j;
            fArr[i11] = random.nextFloat();
            this.f23336m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f23346x;
            b(i11);
            this.f23338o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f23346x; i10++) {
            float[] fArr = this.f23338o;
            float f10 = fArr[i10];
            float f11 = this.f23339p[i10];
            fd fdVar = hd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f23334k[i10] = this.f23335l[i10];
                this.f23336m[i10] = this.f23337n[i10];
                b(i10);
            }
        }
    }
}
