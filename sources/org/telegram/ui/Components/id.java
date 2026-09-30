package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f25081a;
    public float f25082b;
    public float f25083c;
    public float d;
    public float e;
    public float f25084f;
    public int f25085g;
    public float[] f25088k;
    public float[] f25089l;
    public float[] f25090m;
    public float[] f25091n;
    public float[] f25092o;
    public float[] f25093p;
    public float[] f25094q;
    public float[] f25095r;
    public float[] f25096s;
    public float[] f25097t;
    public float[] f25098u;
    public float[] v;
    public float[] f25099w;
    public int f25100x;
    public int h = -11318601;
    public final Paint f25086i = new Paint(1);
    public final Random f25087j = new Random();
    public int f25101y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f25086i;
        paint.setColor(i10);
        paint.setAlpha((this.f25085g * this.f25101y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f25100x;
        float f10 = this.f25088k[i10];
        Random random = this.f25087j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f25089l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f25090m[i10];
        float[] fArr2 = this.f25091n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f25093p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f25081a;
    }

    public final void c(int i10) {
        this.f25100x = i10;
        this.f25088k = new float[i10];
        this.f25089l = new float[i10];
        this.f25090m = new float[i10];
        this.f25091n = new float[i10];
        this.f25092o = new float[i10];
        this.f25093p = new float[i10];
        this.f25094q = new float[i10];
        this.f25095r = new float[i10];
        this.f25096s = new float[i10];
        this.f25097t = new float[i10];
        this.f25098u = new float[i10];
        this.v = new float[i10];
        this.f25099w = new float[i10];
        for (int i11 = 0; i11 < this.f25100x; i11++) {
            float[] fArr = this.f25088k;
            Random random = this.f25087j;
            fArr[i11] = random.nextFloat();
            this.f25090m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f25100x;
            b(i11);
            this.f25092o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f25100x; i10++) {
            float[] fArr = this.f25092o;
            float f10 = fArr[i10];
            float f11 = this.f25093p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f25088k[i10] = this.f25089l[i10];
                this.f25090m[i10] = this.f25091n[i10];
                b(i10);
            }
        }
    }
}
