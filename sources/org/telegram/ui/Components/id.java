package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f27082a;
    public float f27083b;
    public float f27084c;
    public float d;
    public float f27085e;
    public float f27086f;
    public int f27087g;
    public float[] f27090k;
    public float[] f27091l;
    public float[] f27092m;
    public float[] f27093n;
    public float[] f27094o;
    public float[] f27095p;
    public float[] f27096q;
    public float[] f27097r;
    public float[] f27098s;
    public float[] f27099t;
    public float[] f27100u;
    public float[] v;
    public float[] f27101w;
    public int f27102x;
    public int h = -11318601;
    public final Paint f27088i = new Paint(1);
    public final Random f27089j = new Random();
    public int f27103y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27088i;
        paint.setColor(i10);
        paint.setAlpha((this.f27087g * this.f27103y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f27102x;
        float f10 = this.f27090k[i10];
        Random random = this.f27089j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f27091l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f27092m[i10];
        float[] fArr2 = this.f27093n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f27095p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f27082a;
    }

    public final void c(int i10) {
        this.f27102x = i10;
        this.f27090k = new float[i10];
        this.f27091l = new float[i10];
        this.f27092m = new float[i10];
        this.f27093n = new float[i10];
        this.f27094o = new float[i10];
        this.f27095p = new float[i10];
        this.f27096q = new float[i10];
        this.f27097r = new float[i10];
        this.f27098s = new float[i10];
        this.f27099t = new float[i10];
        this.f27100u = new float[i10];
        this.v = new float[i10];
        this.f27101w = new float[i10];
        for (int i11 = 0; i11 < this.f27102x; i11++) {
            float[] fArr = this.f27090k;
            Random random = this.f27089j;
            fArr[i11] = random.nextFloat();
            this.f27092m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27102x;
            b(i11);
            this.f27094o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27102x; i10++) {
            float[] fArr = this.f27094o;
            float f10 = fArr[i10];
            float f11 = this.f27095p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27090k[i10] = this.f27091l[i10];
                this.f27092m[i10] = this.f27093n[i10];
                b(i10);
            }
        }
    }
}
