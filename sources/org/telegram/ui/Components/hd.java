package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f24782a;
    public float f24783b;
    public float f24784c;
    public float d;
    public float e;
    public float f24785f;
    public int f24786g;
    public float[] f24789k;
    public float[] f24790l;
    public float[] f24791m;
    public float[] f24792n;
    public float[] f24793o;
    public float[] f24794p;
    public float[] f24795q;
    public float[] f24796r;
    public float[] f24797s;
    public float[] f24798t;
    public float[] f24799u;
    public float[] v;
    public float[] f24800w;
    public int f24801x;
    public int h = -11318601;
    public final Paint f24787i = new Paint(1);
    public final Random f24788j = new Random();
    public int f24802y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f24787i;
        paint.setColor(i10);
        paint.setAlpha((this.f24786g * this.f24802y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f24801x;
        float f10 = this.f24789k[i10];
        Random random = this.f24788j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f24790l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f24791m[i10];
        float[] fArr2 = this.f24792n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f24794p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f24782a;
    }

    public final void c(int i10) {
        this.f24801x = i10;
        this.f24789k = new float[i10];
        this.f24790l = new float[i10];
        this.f24791m = new float[i10];
        this.f24792n = new float[i10];
        this.f24793o = new float[i10];
        this.f24794p = new float[i10];
        this.f24795q = new float[i10];
        this.f24796r = new float[i10];
        this.f24797s = new float[i10];
        this.f24798t = new float[i10];
        this.f24799u = new float[i10];
        this.v = new float[i10];
        this.f24800w = new float[i10];
        for (int i11 = 0; i11 < this.f24801x; i11++) {
            float[] fArr = this.f24789k;
            Random random = this.f24788j;
            fArr[i11] = random.nextFloat();
            this.f24791m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f24801x;
            b(i11);
            this.f24793o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f24801x; i10++) {
            float[] fArr = this.f24793o;
            float f10 = fArr[i10];
            float f11 = this.f24794p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f24789k[i10] = this.f24790l[i10];
                this.f24791m[i10] = this.f24792n[i10];
                b(i10);
            }
        }
    }
}
