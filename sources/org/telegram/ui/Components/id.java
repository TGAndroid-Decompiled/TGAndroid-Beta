package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f25051a;
    public float f25052b;
    public float f25053c;
    public float d;
    public float e;
    public float f25054f;
    public int f25055g;
    public float[] f25058k;
    public float[] f25059l;
    public float[] f25060m;
    public float[] f25061n;
    public float[] f25062o;
    public float[] f25063p;
    public float[] f25064q;
    public float[] f25065r;
    public float[] f25066s;
    public float[] f25067t;
    public float[] f25068u;
    public float[] v;
    public float[] f25069w;
    public int f25070x;
    public int h = -11318601;
    public final Paint f25056i = new Paint(1);
    public final Random f25057j = new Random();
    public int f25071y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f25056i;
        paint.setColor(i10);
        paint.setAlpha((this.f25055g * this.f25071y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f25070x;
        float f10 = this.f25058k[i10];
        Random random = this.f25057j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f25059l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f25060m[i10];
        float[] fArr2 = this.f25061n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f25063p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f25051a;
    }

    public final void c(int i10) {
        this.f25070x = i10;
        this.f25058k = new float[i10];
        this.f25059l = new float[i10];
        this.f25060m = new float[i10];
        this.f25061n = new float[i10];
        this.f25062o = new float[i10];
        this.f25063p = new float[i10];
        this.f25064q = new float[i10];
        this.f25065r = new float[i10];
        this.f25066s = new float[i10];
        this.f25067t = new float[i10];
        this.f25068u = new float[i10];
        this.v = new float[i10];
        this.f25069w = new float[i10];
        for (int i11 = 0; i11 < this.f25070x; i11++) {
            float[] fArr = this.f25058k;
            Random random = this.f25057j;
            fArr[i11] = random.nextFloat();
            this.f25060m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f25070x;
            b(i11);
            this.f25062o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f25070x; i10++) {
            float[] fArr = this.f25062o;
            float f10 = fArr[i10];
            float f11 = this.f25063p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f25058k[i10] = this.f25059l[i10];
                this.f25060m[i10] = this.f25061n[i10];
                b(i10);
            }
        }
    }
}
