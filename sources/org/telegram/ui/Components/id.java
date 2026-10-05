package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f27467a;
    public float f27468b;
    public float f27469c;
    public float d;
    public float f27470e;
    public float f27471f;
    public int f27472g;
    public float[] f27475k;
    public float[] f27476l;
    public float[] f27477m;
    public float[] f27478n;
    public float[] f27479o;
    public float[] f27480p;
    public float[] f27481q;
    public float[] f27482r;
    public float[] f27483s;
    public float[] f27484t;
    public float[] f27485u;
    public float[] v;
    public float[] f27486w;
    public int f27487x;
    public int h = -11318601;
    public final Paint f27473i = new Paint(1);
    public final Random f27474j = new Random();
    public int f27488y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27473i;
        paint.setColor(i10);
        paint.setAlpha((this.f27472g * this.f27488y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f27487x;
        float f10 = this.f27475k[i10];
        Random random = this.f27474j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f27476l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f27477m[i10];
        float[] fArr2 = this.f27478n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f27480p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f27467a;
    }

    public final void c(int i10) {
        this.f27487x = i10;
        this.f27475k = new float[i10];
        this.f27476l = new float[i10];
        this.f27477m = new float[i10];
        this.f27478n = new float[i10];
        this.f27479o = new float[i10];
        this.f27480p = new float[i10];
        this.f27481q = new float[i10];
        this.f27482r = new float[i10];
        this.f27483s = new float[i10];
        this.f27484t = new float[i10];
        this.f27485u = new float[i10];
        this.v = new float[i10];
        this.f27486w = new float[i10];
        for (int i11 = 0; i11 < this.f27487x; i11++) {
            float[] fArr = this.f27475k;
            Random random = this.f27474j;
            fArr[i11] = random.nextFloat();
            this.f27477m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27487x;
            b(i11);
            this.f27479o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27487x; i10++) {
            float[] fArr = this.f27479o;
            float f10 = fArr[i10];
            float f11 = this.f27480p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27475k[i10] = this.f27476l[i10];
                this.f27477m[i10] = this.f27478n[i10];
                b(i10);
            }
        }
    }
}
