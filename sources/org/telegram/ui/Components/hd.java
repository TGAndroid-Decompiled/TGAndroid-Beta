package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f24795a;
    public float f24796b;
    public float f24797c;
    public float d;
    public float e;
    public float f24798f;
    public int f24799g;
    public float[] f24802k;
    public float[] f24803l;
    public float[] f24804m;
    public float[] f24805n;
    public float[] f24806o;
    public float[] f24807p;
    public float[] f24808q;
    public float[] f24809r;
    public float[] f24810s;
    public float[] f24811t;
    public float[] f24812u;
    public float[] v;
    public float[] f24813w;
    public int f24814x;
    public int h = -11318601;
    public final Paint f24800i = new Paint(1);
    public final Random f24801j = new Random();
    public int f24815y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f24800i;
        paint.setColor(i10);
        paint.setAlpha((this.f24799g * this.f24815y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f24814x;
        float f10 = this.f24802k[i10];
        Random random = this.f24801j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f24803l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f24804m[i10];
        float[] fArr2 = this.f24805n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f24807p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f24795a;
    }

    public final void c(int i10) {
        this.f24814x = i10;
        this.f24802k = new float[i10];
        this.f24803l = new float[i10];
        this.f24804m = new float[i10];
        this.f24805n = new float[i10];
        this.f24806o = new float[i10];
        this.f24807p = new float[i10];
        this.f24808q = new float[i10];
        this.f24809r = new float[i10];
        this.f24810s = new float[i10];
        this.f24811t = new float[i10];
        this.f24812u = new float[i10];
        this.v = new float[i10];
        this.f24813w = new float[i10];
        for (int i11 = 0; i11 < this.f24814x; i11++) {
            float[] fArr = this.f24802k;
            Random random = this.f24801j;
            fArr[i11] = random.nextFloat();
            this.f24804m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f24814x;
            b(i11);
            this.f24806o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f24814x; i10++) {
            float[] fArr = this.f24806o;
            float f10 = fArr[i10];
            float f11 = this.f24807p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f24802k[i10] = this.f24803l[i10];
                this.f24804m[i10] = this.f24805n[i10];
                b(i10);
            }
        }
    }
}
