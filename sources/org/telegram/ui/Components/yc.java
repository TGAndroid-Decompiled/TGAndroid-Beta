package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class yc {
    public float f33443a;
    public float f33444b;
    public float f33445c;
    public float d;
    public float f33446e;
    public float f33447f;
    public int f33448g;
    public float[] f33451k;
    public float[] f33452l;
    public float[] f33453m;
    public float[] f33454n;
    public float[] f33455o;
    public float[] f33456p;
    public float[] f33457q;
    public float[] f33458r;
    public float[] f33459s;
    public float[] f33460t;
    public float[] f33461u;
    public float[] v;
    public float[] f33462w;
    public int f33463x;
    public int h = -11318601;
    public final Paint f33449i = new Paint(1);
    public final Random f33450j = new Random();
    public int f33464y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f33449i;
        paint.setColor(i10);
        paint.setAlpha((this.f33448g * this.f33464y) / 255);
    }

    public final void b(int i10) {
        float f10 = 0.18f / this.f33463x;
        float f11 = this.f33451k[i10];
        Random random = this.f33450j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f11;
        float[] fArr = this.f33452l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f10 * 0.35f) + this.f33453m[i10];
        float[] fArr2 = this.f33454n;
        float f12 = -f10;
        if (nextFloat2 < f12) {
            f10 = f12;
        } else if (nextFloat2 <= f10) {
            f10 = nextFloat2;
        }
        fArr2[i10] = f10;
        this.f33456p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f33443a;
    }

    public final void c(int i10) {
        this.f33463x = i10;
        this.f33451k = new float[i10];
        this.f33452l = new float[i10];
        this.f33453m = new float[i10];
        this.f33454n = new float[i10];
        this.f33455o = new float[i10];
        this.f33456p = new float[i10];
        this.f33457q = new float[i10];
        this.f33458r = new float[i10];
        this.f33459s = new float[i10];
        this.f33460t = new float[i10];
        this.f33461u = new float[i10];
        this.v = new float[i10];
        this.f33462w = new float[i10];
        for (int i11 = 0; i11 < this.f33463x; i11++) {
            float[] fArr = this.f33451k;
            Random random = this.f33450j;
            fArr[i11] = random.nextFloat();
            this.f33453m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f33463x;
            b(i11);
            this.f33455o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i10 = 0; i10 < this.f33463x; i10++) {
            float[] fArr = this.f33455o;
            float f11 = fArr[i10];
            float f12 = this.f33456p[i10];
            jh.a aVar = zc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i10] = f13;
            if (f13 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f33451k[i10] = this.f33452l[i10];
                this.f33453m[i10] = this.f33454n[i10];
                b(i10);
            }
        }
    }
}
