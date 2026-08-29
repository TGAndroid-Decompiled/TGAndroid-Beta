package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class bd {
    public float f27032a;
    public float f27033b;
    public float f27034c;
    public float d;
    public float f27035e;
    public float f27036f;
    public int f27037g;
    public float[] f27040k;
    public float[] f27041l;
    public float[] f27042m;
    public float[] f27043n;
    public float[] f27044o;
    public float[] f27045p;
    public float[] f27046q;
    public float[] f27047r;
    public float[] f27048s;
    public float[] f27049t;
    public float[] f27050u;
    public float[] v;
    public float[] f27051w;
    public int f27052x;
    public int h = -11318601;
    public final Paint f27038i = new Paint(1);
    public final Random f27039j = new Random();
    public int f27053y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27038i;
        paint.setColor(i10);
        paint.setAlpha((this.f27037g * this.f27053y) / 255);
    }

    public final void b(int i10) {
        float f9 = 0.18f / this.f27052x;
        float f10 = this.f27040k[i10];
        Random random = this.f27039j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f27041l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f9 * 0.35f) + this.f27042m[i10];
        float[] fArr2 = this.f27043n;
        float f11 = -f9;
        if (nextFloat2 < f11) {
            f9 = f11;
        } else if (nextFloat2 <= f9) {
            f9 = nextFloat2;
        }
        fArr2[i10] = f9;
        this.f27045p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f27032a;
    }

    public final void c(int i10) {
        this.f27052x = i10;
        this.f27040k = new float[i10];
        this.f27041l = new float[i10];
        this.f27042m = new float[i10];
        this.f27043n = new float[i10];
        this.f27044o = new float[i10];
        this.f27045p = new float[i10];
        this.f27046q = new float[i10];
        this.f27047r = new float[i10];
        this.f27048s = new float[i10];
        this.f27049t = new float[i10];
        this.f27050u = new float[i10];
        this.v = new float[i10];
        this.f27051w = new float[i10];
        for (int i11 = 0; i11 < this.f27052x; i11++) {
            float[] fArr = this.f27040k;
            Random random = this.f27039j;
            fArr[i11] = random.nextFloat();
            this.f27042m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27052x;
            b(i11);
            this.f27044o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f9) {
        for (int i10 = 0; i10 < this.f27052x; i10++) {
            float[] fArr = this.f27044o;
            float f10 = fArr[i10];
            float f11 = this.f27045p[i10];
            gh.a aVar = cd.H;
            float f12 = (f11 * f9 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27040k[i10] = this.f27041l[i10];
                this.f27042m[i10] = this.f27043n[i10];
                b(i10);
            }
        }
    }
}
