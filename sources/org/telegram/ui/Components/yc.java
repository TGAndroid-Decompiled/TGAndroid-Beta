package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class yc {
    public float f33464a;
    public float f33465b;
    public float f33466c;
    public float d;
    public float f33467e;
    public float f33468f;
    public int f33469g;
    public float[] f33472k;
    public float[] f33473l;
    public float[] f33474m;
    public float[] f33475n;
    public float[] f33476o;
    public float[] f33477p;
    public float[] f33478q;
    public float[] f33479r;
    public float[] f33480s;
    public float[] f33481t;
    public float[] f33482u;
    public float[] v;
    public float[] f33483w;
    public int f33484x;
    public int h = -11318601;
    public final Paint f33470i = new Paint(1);
    public final Random f33471j = new Random();
    public int f33485y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f33470i;
        paint.setColor(i10);
        paint.setAlpha((this.f33469g * this.f33485y) / 255);
    }

    public final void b(int i10) {
        float f10 = 0.18f / this.f33484x;
        float f11 = this.f33472k[i10];
        Random random = this.f33471j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f11;
        float[] fArr = this.f33473l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f10 * 0.35f) + this.f33474m[i10];
        float[] fArr2 = this.f33475n;
        float f12 = -f10;
        if (nextFloat2 < f12) {
            f10 = f12;
        } else if (nextFloat2 <= f10) {
            f10 = nextFloat2;
        }
        fArr2[i10] = f10;
        this.f33477p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f33464a;
    }

    public final void c(int i10) {
        this.f33484x = i10;
        this.f33472k = new float[i10];
        this.f33473l = new float[i10];
        this.f33474m = new float[i10];
        this.f33475n = new float[i10];
        this.f33476o = new float[i10];
        this.f33477p = new float[i10];
        this.f33478q = new float[i10];
        this.f33479r = new float[i10];
        this.f33480s = new float[i10];
        this.f33481t = new float[i10];
        this.f33482u = new float[i10];
        this.v = new float[i10];
        this.f33483w = new float[i10];
        for (int i11 = 0; i11 < this.f33484x; i11++) {
            float[] fArr = this.f33472k;
            Random random = this.f33471j;
            fArr[i11] = random.nextFloat();
            this.f33474m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f33484x;
            b(i11);
            this.f33476o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i10 = 0; i10 < this.f33484x; i10++) {
            float[] fArr = this.f33476o;
            float f11 = fArr[i10];
            float f12 = this.f33477p[i10];
            jh.a aVar = zc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i10] = f13;
            if (f13 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f33472k[i10] = this.f33473l[i10];
                this.f33474m[i10] = this.f33475n[i10];
                b(i10);
            }
        }
    }
}
