package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f24754a;
    public float f24755b;
    public float f24756c;
    public float d;
    public float e;
    public float f24757f;
    public int f24758g;
    public float[] f24761k;
    public float[] f24762l;
    public float[] f24763m;
    public float[] f24764n;
    public float[] f24765o;
    public float[] f24766p;
    public float[] f24767q;
    public float[] f24768r;
    public float[] f24769s;
    public float[] f24770t;
    public float[] f24771u;
    public float[] v;
    public float[] f24772w;
    public int f24773x;
    public int h = -11318601;
    public final Paint f24759i = new Paint(1);
    public final Random f24760j = new Random();
    public int f24774y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f24759i;
        paint.setColor(i10);
        paint.setAlpha((this.f24758g * this.f24774y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f24773x;
        float f10 = this.f24761k[i10];
        Random random = this.f24760j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f24762l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f24763m[i10];
        float[] fArr2 = this.f24764n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f24766p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f24754a;
    }

    public final void c(int i10) {
        this.f24773x = i10;
        this.f24761k = new float[i10];
        this.f24762l = new float[i10];
        this.f24763m = new float[i10];
        this.f24764n = new float[i10];
        this.f24765o = new float[i10];
        this.f24766p = new float[i10];
        this.f24767q = new float[i10];
        this.f24768r = new float[i10];
        this.f24769s = new float[i10];
        this.f24770t = new float[i10];
        this.f24771u = new float[i10];
        this.v = new float[i10];
        this.f24772w = new float[i10];
        for (int i11 = 0; i11 < this.f24773x; i11++) {
            float[] fArr = this.f24761k;
            Random random = this.f24760j;
            fArr[i11] = random.nextFloat();
            this.f24763m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f24773x;
            b(i11);
            this.f24765o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f24773x; i10++) {
            float[] fArr = this.f24765o;
            float f10 = fArr[i10];
            float f11 = this.f24766p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f24761k[i10] = this.f24762l[i10];
                this.f24763m[i10] = this.f24764n[i10];
                b(i10);
            }
        }
    }
}
