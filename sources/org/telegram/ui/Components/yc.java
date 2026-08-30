package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class yc {
    public float f30963a;
    public float f30964b;
    public float f30965c;
    public float d;
    public float e;
    public float f30966f;
    public int f30967g;
    public float[] f30970k;
    public float[] f30971l;
    public float[] f30972m;
    public float[] f30973n;
    public float[] f30974o;
    public float[] f30975p;
    public float[] f30976q;
    public float[] f30977r;
    public float[] f30978s;
    public float[] f30979t;
    public float[] f30980u;
    public float[] v;
    public float[] f30981w;
    public int f30982x;
    public int h = -11318601;
    public final Paint f30968i = new Paint(1);
    public final Random f30969j = new Random();
    public int f30983y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f30968i;
        paint.setColor(i10);
        paint.setAlpha((this.f30967g * this.f30983y) / 255);
    }

    public final void b(int i10) {
        float f10 = 0.18f / this.f30982x;
        float f11 = this.f30970k[i10];
        Random random = this.f30969j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f11;
        float[] fArr = this.f30971l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f10 * 0.35f) + this.f30972m[i10];
        float[] fArr2 = this.f30973n;
        float f12 = -f10;
        if (nextFloat2 < f12) {
            f10 = f12;
        } else if (nextFloat2 <= f10) {
            f10 = nextFloat2;
        }
        fArr2[i10] = f10;
        this.f30975p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f30963a;
    }

    public final void c(int i10) {
        this.f30982x = i10;
        this.f30970k = new float[i10];
        this.f30971l = new float[i10];
        this.f30972m = new float[i10];
        this.f30973n = new float[i10];
        this.f30974o = new float[i10];
        this.f30975p = new float[i10];
        this.f30976q = new float[i10];
        this.f30977r = new float[i10];
        this.f30978s = new float[i10];
        this.f30979t = new float[i10];
        this.f30980u = new float[i10];
        this.v = new float[i10];
        this.f30981w = new float[i10];
        for (int i11 = 0; i11 < this.f30982x; i11++) {
            float[] fArr = this.f30970k;
            Random random = this.f30969j;
            fArr[i11] = random.nextFloat();
            this.f30972m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f30982x;
            b(i11);
            this.f30974o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i10 = 0; i10 < this.f30982x; i10++) {
            float[] fArr = this.f30974o;
            float f11 = fArr[i10];
            float f12 = this.f30975p[i10];
            ih.a aVar = zc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i10] = f13;
            if (f13 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f30970k[i10] = this.f30971l[i10];
                this.f30972m[i10] = this.f30973n[i10];
                b(i10);
            }
        }
    }
}
