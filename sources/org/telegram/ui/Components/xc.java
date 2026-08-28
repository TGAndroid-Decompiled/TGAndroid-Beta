package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class xc {
    public float f34637a;
    public float f34638b;
    public float f34639c;
    public float d;
    public float f34640e;
    public float f34641f;
    public int f34642g;
    public float[] f34645k;
    public float[] f34646l;
    public float[] f34647m;
    public float[] f34648n;
    public float[] f34649o;
    public float[] f34650p;
    public float[] f34651q;
    public float[] f34652r;
    public float[] f34653s;
    public float[] f34654t;
    public float[] f34655u;
    public float[] v;
    public float[] f34656w;
    public int f34657x;
    public int h = -11318601;
    public final Paint f34643i = new Paint(1);
    public final Random f34644j = new Random();
    public int f34658y = 255;

    public final void a() {
        int i9 = this.h;
        Paint paint = this.f34643i;
        paint.setColor(i9);
        paint.setAlpha((this.f34642g * this.f34658y) / 255);
    }

    public final void b(int i9) {
        float f10 = 0.18f / this.f34657x;
        float f11 = this.f34645k[i9];
        Random random = this.f34644j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f11;
        float[] fArr = this.f34646l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i9] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f10 * 0.35f) + this.f34647m[i9];
        float[] fArr2 = this.f34648n;
        float f12 = -f10;
        if (nextFloat2 < f12) {
            f10 = f12;
        } else if (nextFloat2 <= f10) {
            f10 = nextFloat2;
        }
        fArr2[i9] = f10;
        this.f34650p[i9] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f34637a;
    }

    public final void c(int i9) {
        this.f34657x = i9;
        this.f34645k = new float[i9];
        this.f34646l = new float[i9];
        this.f34647m = new float[i9];
        this.f34648n = new float[i9];
        this.f34649o = new float[i9];
        this.f34650p = new float[i9];
        this.f34651q = new float[i9];
        this.f34652r = new float[i9];
        this.f34653s = new float[i9];
        this.f34654t = new float[i9];
        this.f34655u = new float[i9];
        this.v = new float[i9];
        this.f34656w = new float[i9];
        for (int i10 = 0; i10 < this.f34657x; i10++) {
            float[] fArr = this.f34645k;
            Random random = this.f34644j;
            fArr[i10] = random.nextFloat();
            this.f34647m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f34657x;
            b(i10);
            this.f34649o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i9 = 0; i9 < this.f34657x; i9++) {
            float[] fArr = this.f34649o;
            float f11 = fArr[i9];
            float f12 = this.f34650p[i9];
            dh.a aVar = yc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i9] = f13;
            if (f13 >= 1.0f) {
                fArr[i9] = 0.0f;
                this.f34645k[i9] = this.f34646l[i9];
                this.f34647m[i9] = this.f34648n[i9];
                b(i9);
            }
        }
    }
}
