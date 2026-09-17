package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f27109a;
    public float f27110b;
    public float f27111c;
    public float d;
    public float f27112e;
    public float f27113f;
    public int f27114g;
    public float[] f27117k;
    public float[] f27118l;
    public float[] f27119m;
    public float[] f27120n;
    public float[] f27121o;
    public float[] f27122p;
    public float[] f27123q;
    public float[] f27124r;
    public float[] f27125s;
    public float[] f27126t;
    public float[] f27127u;
    public float[] v;
    public float[] f27128w;
    public int f27129x;
    public int h = -11318601;
    public final Paint f27115i = new Paint(1);
    public final Random f27116j = new Random();
    public int f27130y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27115i;
        paint.setColor(i10);
        paint.setAlpha((this.f27114g * this.f27130y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f27129x;
        float f10 = this.f27117k[i10];
        Random random = this.f27116j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f27118l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f27119m[i10];
        float[] fArr2 = this.f27120n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f27122p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f27109a;
    }

    public final void c(int i10) {
        this.f27129x = i10;
        this.f27117k = new float[i10];
        this.f27118l = new float[i10];
        this.f27119m = new float[i10];
        this.f27120n = new float[i10];
        this.f27121o = new float[i10];
        this.f27122p = new float[i10];
        this.f27123q = new float[i10];
        this.f27124r = new float[i10];
        this.f27125s = new float[i10];
        this.f27126t = new float[i10];
        this.f27127u = new float[i10];
        this.v = new float[i10];
        this.f27128w = new float[i10];
        for (int i11 = 0; i11 < this.f27129x; i11++) {
            float[] fArr = this.f27117k;
            Random random = this.f27116j;
            fArr[i11] = random.nextFloat();
            this.f27119m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27129x;
            b(i11);
            this.f27121o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27129x; i10++) {
            float[] fArr = this.f27121o;
            float f10 = fArr[i10];
            float f11 = this.f27122p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27117k[i10] = this.f27118l[i10];
                this.f27119m[i10] = this.f27120n[i10];
                b(i10);
            }
        }
    }
}
