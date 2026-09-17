package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class fd {
    public float f23871a;
    public float f23872b;
    public float f23873c;
    public float d;
    public float e;
    public float f23874f;
    public int f23875g;
    public float[] f23878k;
    public float[] f23879l;
    public float[] f23880m;
    public float[] f23881n;
    public float[] f23882o;
    public float[] f23883p;
    public float[] f23884q;
    public float[] f23885r;
    public float[] f23886s;
    public float[] f23887t;
    public float[] f23888u;
    public float[] v;
    public float[] f23889w;
    public int f23890x;
    public int h = -11318601;
    public final Paint f23876i = new Paint(1);
    public final Random f23877j = new Random();
    public int f23891y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f23876i;
        paint.setColor(i10);
        paint.setAlpha((this.f23875g * this.f23891y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f23890x;
        float f10 = this.f23878k[i10];
        Random random = this.f23877j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f23879l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f23880m[i10];
        float[] fArr2 = this.f23881n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f23883p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f23871a;
    }

    public final void c(int i10) {
        this.f23890x = i10;
        this.f23878k = new float[i10];
        this.f23879l = new float[i10];
        this.f23880m = new float[i10];
        this.f23881n = new float[i10];
        this.f23882o = new float[i10];
        this.f23883p = new float[i10];
        this.f23884q = new float[i10];
        this.f23885r = new float[i10];
        this.f23886s = new float[i10];
        this.f23887t = new float[i10];
        this.f23888u = new float[i10];
        this.v = new float[i10];
        this.f23889w = new float[i10];
        for (int i11 = 0; i11 < this.f23890x; i11++) {
            float[] fArr = this.f23878k;
            Random random = this.f23877j;
            fArr[i11] = random.nextFloat();
            this.f23880m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f23890x;
            b(i11);
            this.f23882o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f23890x; i10++) {
            float[] fArr = this.f23882o;
            float f10 = fArr[i10];
            float f11 = this.f23883p[i10];
            ed edVar = gd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f23878k[i10] = this.f23879l[i10];
                this.f23880m[i10] = this.f23881n[i10];
                b(i10);
            }
        }
    }
}
