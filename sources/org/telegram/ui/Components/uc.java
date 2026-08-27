package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;

public final class uc {

    public float f33037a;

    public float f33038b;

    public float f33039c;
    public float d;

    public float f33040e;

    public float f33041f;

    public int f33042g;

    public float[] f33045k;

    public float[] f33046l;

    public float[] f33047m;

    public float[] f33048n;

    public float[] f33049o;

    public float[] f33050p;

    public float[] f33051q;

    public float[] f33052r;

    public float[] f33053s;

    public float[] f33054t;

    public float[] f33055u;
    public float[] v;

    public float[] f33056w;

    public int f33057x;
    public int h = -11318601;

    public final Paint f33043i = new Paint(1);

    public final Random f33044j = new Random();

    public int f33058y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f33043i;
        paint.setColor(i10);
        paint.setAlpha((this.f33042g * this.f33058y) / 255);
    }

    public final void b(int i10) {
        float f10 = 0.18f / this.f33057x;
        float f11 = this.f33045k[i10];
        Random random = this.f33044j;
        float fNextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f11;
        float[] fArr = this.f33046l;
        if (fNextFloat < 0.0f) {
            fNextFloat = 0.0f;
        } else if (fNextFloat > 1.0f) {
            fNextFloat = 1.0f;
        }
        fArr[i10] = fNextFloat;
        float fNextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f10 * 0.35f) + this.f33047m[i10];
        float[] fArr2 = this.f33048n;
        float f12 = -f10;
        if (fNextFloat2 < f12) {
            f10 = f12;
        } else if (fNextFloat2 <= f10) {
            f10 = fNextFloat2;
        }
        fArr2[i10] = f10;
        this.f33050p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f33037a;
    }

    public final void c(int i10) {
        this.f33057x = i10;
        this.f33045k = new float[i10];
        this.f33046l = new float[i10];
        this.f33047m = new float[i10];
        this.f33048n = new float[i10];
        this.f33049o = new float[i10];
        this.f33050p = new float[i10];
        this.f33051q = new float[i10];
        this.f33052r = new float[i10];
        this.f33053s = new float[i10];
        this.f33054t = new float[i10];
        this.f33055u = new float[i10];
        this.v = new float[i10];
        this.f33056w = new float[i10];
        for (int i11 = 0; i11 < this.f33057x; i11++) {
            float[] fArr = this.f33045k;
            Random random = this.f33044j;
            fArr[i11] = random.nextFloat();
            this.f33047m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f33057x;
            b(i11);
            this.f33049o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i10 = 0; i10 < this.f33057x; i10++) {
            float[] fArr = this.f33049o;
            float f11 = fArr[i10];
            float f12 = this.f33050p[i10];
            eh.a aVar = vc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i10] = f13;
            if (f13 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f33045k[i10] = this.f33046l[i10];
                this.f33047m[i10] = this.f33048n[i10];
                b(i10);
            }
        }
    }
}
