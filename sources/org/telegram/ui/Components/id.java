package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f27366a;
    public float f27367b;
    public float f27368c;
    public float d;
    public float f27369e;
    public float f27370f;
    public int f27371g;
    public float[] f27374k;
    public float[] f27375l;
    public float[] f27376m;
    public float[] f27377n;
    public float[] f27378o;
    public float[] f27379p;
    public float[] f27380q;
    public float[] f27381r;
    public float[] f27382s;
    public float[] f27383t;
    public float[] f27384u;
    public float[] v;
    public float[] f27385w;
    public int f27386x;
    public int h = -11318601;
    public final Paint f27372i = new Paint(1);
    public final Random f27373j = new Random();
    public int f27387y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27372i;
        paint.setColor(i10);
        paint.setAlpha((this.f27371g * this.f27387y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f27386x;
        float f10 = this.f27374k[i10];
        Random random = this.f27373j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f27375l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f27376m[i10];
        float[] fArr2 = this.f27377n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f27379p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f27366a;
    }

    public final void c(int i10) {
        this.f27386x = i10;
        this.f27374k = new float[i10];
        this.f27375l = new float[i10];
        this.f27376m = new float[i10];
        this.f27377n = new float[i10];
        this.f27378o = new float[i10];
        this.f27379p = new float[i10];
        this.f27380q = new float[i10];
        this.f27381r = new float[i10];
        this.f27382s = new float[i10];
        this.f27383t = new float[i10];
        this.f27384u = new float[i10];
        this.v = new float[i10];
        this.f27385w = new float[i10];
        for (int i11 = 0; i11 < this.f27386x; i11++) {
            float[] fArr = this.f27374k;
            Random random = this.f27373j;
            fArr[i11] = random.nextFloat();
            this.f27376m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27386x;
            b(i11);
            this.f27378o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27386x; i10++) {
            float[] fArr = this.f27378o;
            float f10 = fArr[i10];
            float f11 = this.f27379p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27374k[i10] = this.f27375l[i10];
                this.f27376m[i10] = this.f27377n[i10];
                b(i10);
            }
        }
    }
}
