package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f27372a;
    public float f27373b;
    public float f27374c;
    public float d;
    public float f27375e;
    public float f27376f;
    public int f27377g;
    public float[] f27380k;
    public float[] f27381l;
    public float[] f27382m;
    public float[] f27383n;
    public float[] f27384o;
    public float[] f27385p;
    public float[] f27386q;
    public float[] f27387r;
    public float[] f27388s;
    public float[] f27389t;
    public float[] f27390u;
    public float[] v;
    public float[] f27391w;
    public int f27392x;
    public int h = -11318601;
    public final Paint f27378i = new Paint(1);
    public final Random f27379j = new Random();
    public int f27393y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27378i;
        paint.setColor(i10);
        paint.setAlpha((this.f27377g * this.f27393y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f27392x;
        float f10 = this.f27380k[i10];
        Random random = this.f27379j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f27381l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f27382m[i10];
        float[] fArr2 = this.f27383n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f27385p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f27372a;
    }

    public final void c(int i10) {
        this.f27392x = i10;
        this.f27380k = new float[i10];
        this.f27381l = new float[i10];
        this.f27382m = new float[i10];
        this.f27383n = new float[i10];
        this.f27384o = new float[i10];
        this.f27385p = new float[i10];
        this.f27386q = new float[i10];
        this.f27387r = new float[i10];
        this.f27388s = new float[i10];
        this.f27389t = new float[i10];
        this.f27390u = new float[i10];
        this.v = new float[i10];
        this.f27391w = new float[i10];
        for (int i11 = 0; i11 < this.f27392x; i11++) {
            float[] fArr = this.f27380k;
            Random random = this.f27379j;
            fArr[i11] = random.nextFloat();
            this.f27382m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27392x;
            b(i11);
            this.f27384o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27392x; i10++) {
            float[] fArr = this.f27384o;
            float f10 = fArr[i10];
            float f11 = this.f27385p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27380k[i10] = this.f27381l[i10];
                this.f27382m[i10] = this.f27383n[i10];
                b(i10);
            }
        }
    }
}
