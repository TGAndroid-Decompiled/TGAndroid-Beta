package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class id {
    public float f24986a;
    public float f24987b;
    public float f24988c;
    public float d;
    public float e;
    public float f24989f;
    public int f24990g;
    public float[] f24993k;
    public float[] f24994l;
    public float[] f24995m;
    public float[] f24996n;
    public float[] f24997o;
    public float[] f24998p;
    public float[] f24999q;
    public float[] f25000r;
    public float[] f25001s;
    public float[] f25002t;
    public float[] f25003u;
    public float[] v;
    public float[] f25004w;
    public int f25005x;
    public int h = -11318601;
    public final Paint f24991i = new Paint(1);
    public final Random f24992j = new Random();
    public int f25006y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f24991i;
        paint.setColor(i10);
        paint.setAlpha((this.f24990g * this.f25006y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f25005x;
        float f10 = this.f24993k[i10];
        Random random = this.f24992j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f24994l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f24995m[i10];
        float[] fArr2 = this.f24996n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f24998p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f24986a;
    }

    public final void c(int i10) {
        this.f25005x = i10;
        this.f24993k = new float[i10];
        this.f24994l = new float[i10];
        this.f24995m = new float[i10];
        this.f24996n = new float[i10];
        this.f24997o = new float[i10];
        this.f24998p = new float[i10];
        this.f24999q = new float[i10];
        this.f25000r = new float[i10];
        this.f25001s = new float[i10];
        this.f25002t = new float[i10];
        this.f25003u = new float[i10];
        this.v = new float[i10];
        this.f25004w = new float[i10];
        for (int i11 = 0; i11 < this.f25005x; i11++) {
            float[] fArr = this.f24993k;
            Random random = this.f24992j;
            fArr[i11] = random.nextFloat();
            this.f24995m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f25005x;
            b(i11);
            this.f24997o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f25005x; i10++) {
            float[] fArr = this.f24997o;
            float f10 = fArr[i10];
            float f11 = this.f24998p[i10];
            hd hdVar = jd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f24993k[i10] = this.f24994l[i10];
                this.f24995m[i10] = this.f24996n[i10];
                b(i10);
            }
        }
    }
}
