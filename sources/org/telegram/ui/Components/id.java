package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f27367a;
    public float f27368b;
    public float f27369c;
    public float d;
    public float f27370e;
    public float f27371f;
    public int f27372g;
    public float[] f27375k;
    public float[] f27376l;
    public float[] f27377m;
    public float[] f27378n;
    public float[] f27379o;
    public float[] f27380p;
    public float[] f27381q;
    public float[] f27382r;
    public float[] f27383s;
    public float[] f27384t;
    public float[] f27385u;
    public float[] v;
    public float[] f27386w;
    public int f27387x;
    public int h = -11318601;
    public final Paint f27373i = new Paint(1);
    public final Random f27374j = new Random();
    public int f27388y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27373i;
        paint.setColor(i10);
        paint.setAlpha((this.f27372g * this.f27388y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f27387x;
        float f10 = this.f27375k[i10];
        Random random = this.f27374j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f27376l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f27377m[i10];
        float[] fArr2 = this.f27378n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f27380p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f27367a;
    }

    public final void c(int i10) {
        this.f27387x = i10;
        this.f27375k = new float[i10];
        this.f27376l = new float[i10];
        this.f27377m = new float[i10];
        this.f27378n = new float[i10];
        this.f27379o = new float[i10];
        this.f27380p = new float[i10];
        this.f27381q = new float[i10];
        this.f27382r = new float[i10];
        this.f27383s = new float[i10];
        this.f27384t = new float[i10];
        this.f27385u = new float[i10];
        this.v = new float[i10];
        this.f27386w = new float[i10];
        for (int i11 = 0; i11 < this.f27387x; i11++) {
            float[] fArr = this.f27375k;
            Random random = this.f27374j;
            fArr[i11] = random.nextFloat();
            this.f27377m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27387x;
            b(i11);
            this.f27379o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27387x; i10++) {
            float[] fArr = this.f27379o;
            float f10 = fArr[i10];
            float f11 = this.f27380p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27375k[i10] = this.f27376l[i10];
                this.f27377m[i10] = this.f27378n[i10];
                b(i10);
            }
        }
    }
}
