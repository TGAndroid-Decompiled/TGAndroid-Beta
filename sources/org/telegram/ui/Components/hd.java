package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f24725a;
    public float f24726b;
    public float f24727c;
    public float d;
    public float e;
    public float f24728f;
    public int f24729g;
    public float[] f24732k;
    public float[] f24733l;
    public float[] f24734m;
    public float[] f24735n;
    public float[] f24736o;
    public float[] f24737p;
    public float[] f24738q;
    public float[] f24739r;
    public float[] f24740s;
    public float[] f24741t;
    public float[] f24742u;
    public float[] v;
    public float[] f24743w;
    public int f24744x;
    public int h = -11318601;
    public final Paint f24730i = new Paint(1);
    public final Random f24731j = new Random();
    public int f24745y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f24730i;
        paint.setColor(i10);
        paint.setAlpha((this.f24729g * this.f24745y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f24744x;
        float f10 = this.f24732k[i10];
        Random random = this.f24731j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f24733l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f24734m[i10];
        float[] fArr2 = this.f24735n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f24737p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f24725a;
    }

    public final void c(int i10) {
        this.f24744x = i10;
        this.f24732k = new float[i10];
        this.f24733l = new float[i10];
        this.f24734m = new float[i10];
        this.f24735n = new float[i10];
        this.f24736o = new float[i10];
        this.f24737p = new float[i10];
        this.f24738q = new float[i10];
        this.f24739r = new float[i10];
        this.f24740s = new float[i10];
        this.f24741t = new float[i10];
        this.f24742u = new float[i10];
        this.v = new float[i10];
        this.f24743w = new float[i10];
        for (int i11 = 0; i11 < this.f24744x; i11++) {
            float[] fArr = this.f24732k;
            Random random = this.f24731j;
            fArr[i11] = random.nextFloat();
            this.f24734m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f24744x;
            b(i11);
            this.f24736o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f24744x; i10++) {
            float[] fArr = this.f24736o;
            float f10 = fArr[i10];
            float f11 = this.f24737p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f24732k[i10] = this.f24733l[i10];
                this.f24734m[i10] = this.f24735n[i10];
                b(i10);
            }
        }
    }
}
