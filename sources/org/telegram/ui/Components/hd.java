package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f24631a;
    public float f24632b;
    public float f24633c;
    public float d;
    public float e;
    public float f24634f;
    public int f24635g;
    public float[] f24638k;
    public float[] f24639l;
    public float[] f24640m;
    public float[] f24641n;
    public float[] f24642o;
    public float[] f24643p;
    public float[] f24644q;
    public float[] f24645r;
    public float[] f24646s;
    public float[] f24647t;
    public float[] f24648u;
    public float[] v;
    public float[] f24649w;
    public int f24650x;
    public int h = -11318601;
    public final Paint f24636i = new Paint(1);
    public final Random f24637j = new Random();
    public int f24651y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f24636i;
        paint.setColor(i10);
        paint.setAlpha((this.f24635g * this.f24651y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f24650x;
        float f10 = this.f24638k[i10];
        Random random = this.f24637j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f24639l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f24640m[i10];
        float[] fArr2 = this.f24641n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f24643p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f24631a;
    }

    public final void c(int i10) {
        this.f24650x = i10;
        this.f24638k = new float[i10];
        this.f24639l = new float[i10];
        this.f24640m = new float[i10];
        this.f24641n = new float[i10];
        this.f24642o = new float[i10];
        this.f24643p = new float[i10];
        this.f24644q = new float[i10];
        this.f24645r = new float[i10];
        this.f24646s = new float[i10];
        this.f24647t = new float[i10];
        this.f24648u = new float[i10];
        this.v = new float[i10];
        this.f24649w = new float[i10];
        for (int i11 = 0; i11 < this.f24650x; i11++) {
            float[] fArr = this.f24638k;
            Random random = this.f24637j;
            fArr[i11] = random.nextFloat();
            this.f24640m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f24650x;
            b(i11);
            this.f24642o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f24650x; i10++) {
            float[] fArr = this.f24642o;
            float f10 = fArr[i10];
            float f11 = this.f24643p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f24638k[i10] = this.f24639l[i10];
                this.f24640m[i10] = this.f24641n[i10];
                b(i10);
            }
        }
    }
}
