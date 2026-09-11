package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f27081a;
    public float f27082b;
    public float f27083c;
    public float d;
    public float f27084e;
    public float f27085f;
    public int f27086g;
    public float[] f27089k;
    public float[] f27090l;
    public float[] f27091m;
    public float[] f27092n;
    public float[] f27093o;
    public float[] f27094p;
    public float[] f27095q;
    public float[] f27096r;
    public float[] f27097s;
    public float[] f27098t;
    public float[] f27099u;
    public float[] v;
    public float[] f27100w;
    public int f27101x;
    public int h = -11318601;
    public final Paint f27087i = new Paint(1);
    public final Random f27088j = new Random();
    public int f27102y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27087i;
        paint.setColor(i10);
        paint.setAlpha((this.f27086g * this.f27102y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f27101x;
        float f10 = this.f27089k[i10];
        Random random = this.f27088j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f27090l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f27091m[i10];
        float[] fArr2 = this.f27092n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f27094p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f27081a;
    }

    public final void c(int i10) {
        this.f27101x = i10;
        this.f27089k = new float[i10];
        this.f27090l = new float[i10];
        this.f27091m = new float[i10];
        this.f27092n = new float[i10];
        this.f27093o = new float[i10];
        this.f27094p = new float[i10];
        this.f27095q = new float[i10];
        this.f27096r = new float[i10];
        this.f27097s = new float[i10];
        this.f27098t = new float[i10];
        this.f27099u = new float[i10];
        this.v = new float[i10];
        this.f27100w = new float[i10];
        for (int i11 = 0; i11 < this.f27101x; i11++) {
            float[] fArr = this.f27089k;
            Random random = this.f27088j;
            fArr[i11] = random.nextFloat();
            this.f27091m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27101x;
            b(i11);
            this.f27093o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27101x; i10++) {
            float[] fArr = this.f27093o;
            float f10 = fArr[i10];
            float f11 = this.f27094p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27089k[i10] = this.f27090l[i10];
                this.f27091m[i10] = this.f27092n[i10];
                b(i10);
            }
        }
    }
}
