package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f27108a;
    public float f27109b;
    public float f27110c;
    public float d;
    public float f27111e;
    public float f27112f;
    public int f27113g;
    public float[] f27116k;
    public float[] f27117l;
    public float[] f27118m;
    public float[] f27119n;
    public float[] f27120o;
    public float[] f27121p;
    public float[] f27122q;
    public float[] f27123r;
    public float[] f27124s;
    public float[] f27125t;
    public float[] f27126u;
    public float[] v;
    public float[] f27127w;
    public int f27128x;
    public int h = -11318601;
    public final Paint f27114i = new Paint(1);
    public final Random f27115j = new Random();
    public int f27129y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27114i;
        paint.setColor(i10);
        paint.setAlpha((this.f27113g * this.f27129y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f27128x;
        float f10 = this.f27116k[i10];
        Random random = this.f27115j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f27117l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f27118m[i10];
        float[] fArr2 = this.f27119n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f27121p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f27108a;
    }

    public final void c(int i10) {
        this.f27128x = i10;
        this.f27116k = new float[i10];
        this.f27117l = new float[i10];
        this.f27118m = new float[i10];
        this.f27119n = new float[i10];
        this.f27120o = new float[i10];
        this.f27121p = new float[i10];
        this.f27122q = new float[i10];
        this.f27123r = new float[i10];
        this.f27124s = new float[i10];
        this.f27125t = new float[i10];
        this.f27126u = new float[i10];
        this.v = new float[i10];
        this.f27127w = new float[i10];
        for (int i11 = 0; i11 < this.f27128x; i11++) {
            float[] fArr = this.f27116k;
            Random random = this.f27115j;
            fArr[i11] = random.nextFloat();
            this.f27118m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27128x;
            b(i11);
            this.f27120o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27128x; i10++) {
            float[] fArr = this.f27120o;
            float f10 = fArr[i10];
            float f11 = this.f27121p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27116k[i10] = this.f27117l[i10];
                this.f27118m[i10] = this.f27119n[i10];
                b(i10);
            }
        }
    }
}
