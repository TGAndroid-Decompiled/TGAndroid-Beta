package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f24634a;
    public float f24635b;
    public float f24636c;
    public float d;
    public float e;
    public float f24637f;
    public int f24638g;
    public float[] f24641k;
    public float[] f24642l;
    public float[] f24643m;
    public float[] f24644n;
    public float[] f24645o;
    public float[] f24646p;
    public float[] f24647q;
    public float[] f24648r;
    public float[] f24649s;
    public float[] f24650t;
    public float[] f24651u;
    public float[] v;
    public float[] f24652w;
    public int f24653x;
    public int h = -11318601;
    public final Paint f24639i = new Paint(1);
    public final Random f24640j = new Random();
    public int f24654y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f24639i;
        paint.setColor(i10);
        paint.setAlpha((this.f24638g * this.f24654y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f24653x;
        float f10 = this.f24641k[i10];
        Random random = this.f24640j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f24642l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f24643m[i10];
        float[] fArr2 = this.f24644n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f24646p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f24634a;
    }

    public final void c(int i10) {
        this.f24653x = i10;
        this.f24641k = new float[i10];
        this.f24642l = new float[i10];
        this.f24643m = new float[i10];
        this.f24644n = new float[i10];
        this.f24645o = new float[i10];
        this.f24646p = new float[i10];
        this.f24647q = new float[i10];
        this.f24648r = new float[i10];
        this.f24649s = new float[i10];
        this.f24650t = new float[i10];
        this.f24651u = new float[i10];
        this.v = new float[i10];
        this.f24652w = new float[i10];
        for (int i11 = 0; i11 < this.f24653x; i11++) {
            float[] fArr = this.f24641k;
            Random random = this.f24640j;
            fArr[i11] = random.nextFloat();
            this.f24643m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f24653x;
            b(i11);
            this.f24645o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f24653x; i10++) {
            float[] fArr = this.f24645o;
            float f10 = fArr[i10];
            float f11 = this.f24646p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f24641k[i10] = this.f24642l[i10];
                this.f24643m[i10] = this.f24644n[i10];
                b(i10);
            }
        }
    }
}
