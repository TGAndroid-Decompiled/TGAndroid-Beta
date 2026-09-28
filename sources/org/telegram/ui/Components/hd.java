package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f24781a;
    public float f24782b;
    public float f24783c;
    public float d;
    public float e;
    public float f24784f;
    public int f24785g;
    public float[] f24788k;
    public float[] f24789l;
    public float[] f24790m;
    public float[] f24791n;
    public float[] f24792o;
    public float[] f24793p;
    public float[] f24794q;
    public float[] f24795r;
    public float[] f24796s;
    public float[] f24797t;
    public float[] f24798u;
    public float[] v;
    public float[] f24799w;
    public int f24800x;
    public int h = -11318601;
    public final Paint f24786i = new Paint(1);
    public final Random f24787j = new Random();
    public int f24801y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f24786i;
        paint.setColor(i10);
        paint.setAlpha((this.f24785g * this.f24801y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f24800x;
        float f10 = this.f24788k[i10];
        Random random = this.f24787j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f24789l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f24790m[i10];
        float[] fArr2 = this.f24791n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f24793p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f24781a;
    }

    public final void c(int i10) {
        this.f24800x = i10;
        this.f24788k = new float[i10];
        this.f24789l = new float[i10];
        this.f24790m = new float[i10];
        this.f24791n = new float[i10];
        this.f24792o = new float[i10];
        this.f24793p = new float[i10];
        this.f24794q = new float[i10];
        this.f24795r = new float[i10];
        this.f24796s = new float[i10];
        this.f24797t = new float[i10];
        this.f24798u = new float[i10];
        this.v = new float[i10];
        this.f24799w = new float[i10];
        for (int i11 = 0; i11 < this.f24800x; i11++) {
            float[] fArr = this.f24788k;
            Random random = this.f24787j;
            fArr[i11] = random.nextFloat();
            this.f24790m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f24800x;
            b(i11);
            this.f24792o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f24800x; i10++) {
            float[] fArr = this.f24792o;
            float f10 = fArr[i10];
            float f11 = this.f24793p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f24788k[i10] = this.f24789l[i10];
                this.f24790m[i10] = this.f24791n[i10];
                b(i10);
            }
        }
    }
}
