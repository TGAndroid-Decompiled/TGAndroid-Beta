package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f24726a;
    public float f24727b;
    public float f24728c;
    public float d;
    public float e;
    public float f24729f;
    public int f24730g;
    public float[] f24733k;
    public float[] f24734l;
    public float[] f24735m;
    public float[] f24736n;
    public float[] f24737o;
    public float[] f24738p;
    public float[] f24739q;
    public float[] f24740r;
    public float[] f24741s;
    public float[] f24742t;
    public float[] f24743u;
    public float[] v;
    public float[] f24744w;
    public int f24745x;
    public int h = -11318601;
    public final Paint f24731i = new Paint(1);
    public final Random f24732j = new Random();
    public int f24746y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f24731i;
        paint.setColor(i10);
        paint.setAlpha((this.f24730g * this.f24746y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f24745x;
        float f10 = this.f24733k[i10];
        Random random = this.f24732j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f24734l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f24735m[i10];
        float[] fArr2 = this.f24736n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f24738p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f24726a;
    }

    public final void c(int i10) {
        this.f24745x = i10;
        this.f24733k = new float[i10];
        this.f24734l = new float[i10];
        this.f24735m = new float[i10];
        this.f24736n = new float[i10];
        this.f24737o = new float[i10];
        this.f24738p = new float[i10];
        this.f24739q = new float[i10];
        this.f24740r = new float[i10];
        this.f24741s = new float[i10];
        this.f24742t = new float[i10];
        this.f24743u = new float[i10];
        this.v = new float[i10];
        this.f24744w = new float[i10];
        for (int i11 = 0; i11 < this.f24745x; i11++) {
            float[] fArr = this.f24733k;
            Random random = this.f24732j;
            fArr[i11] = random.nextFloat();
            this.f24735m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f24745x;
            b(i11);
            this.f24737o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f24745x; i10++) {
            float[] fArr = this.f24737o;
            float f10 = fArr[i10];
            float f11 = this.f24738p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f24733k[i10] = this.f24734l[i10];
                this.f24735m[i10] = this.f24736n[i10];
                b(i10);
            }
        }
    }
}
