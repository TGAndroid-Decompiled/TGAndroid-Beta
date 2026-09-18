package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class fd {
    public float f23874a;
    public float f23875b;
    public float f23876c;
    public float d;
    public float e;
    public float f23877f;
    public int f23878g;
    public float[] f23881k;
    public float[] f23882l;
    public float[] f23883m;
    public float[] f23884n;
    public float[] f23885o;
    public float[] f23886p;
    public float[] f23887q;
    public float[] f23888r;
    public float[] f23889s;
    public float[] f23890t;
    public float[] f23891u;
    public float[] v;
    public float[] f23892w;
    public int f23893x;
    public int h = -11318601;
    public final Paint f23879i = new Paint(1);
    public final Random f23880j = new Random();
    public int f23894y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f23879i;
        paint.setColor(i10);
        paint.setAlpha((this.f23878g * this.f23894y) / 255);
    }

    public final void b(int i10) {
        float f7 = 0.18f / this.f23893x;
        float f10 = this.f23881k[i10];
        Random random = this.f23880j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f10;
        float[] fArr = this.f23882l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f7 * 0.35f) + this.f23883m[i10];
        float[] fArr2 = this.f23884n;
        float f11 = -f7;
        if (nextFloat2 < f11) {
            f7 = f11;
        } else if (nextFloat2 <= f7) {
            f7 = nextFloat2;
        }
        fArr2[i10] = f7;
        this.f23886p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f23874a;
    }

    public final void c(int i10) {
        this.f23893x = i10;
        this.f23881k = new float[i10];
        this.f23882l = new float[i10];
        this.f23883m = new float[i10];
        this.f23884n = new float[i10];
        this.f23885o = new float[i10];
        this.f23886p = new float[i10];
        this.f23887q = new float[i10];
        this.f23888r = new float[i10];
        this.f23889s = new float[i10];
        this.f23890t = new float[i10];
        this.f23891u = new float[i10];
        this.v = new float[i10];
        this.f23892w = new float[i10];
        for (int i11 = 0; i11 < this.f23893x; i11++) {
            float[] fArr = this.f23881k;
            Random random = this.f23880j;
            fArr[i11] = random.nextFloat();
            this.f23883m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f23893x;
            b(i11);
            this.f23885o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f23893x; i10++) {
            float[] fArr = this.f23885o;
            float f10 = fArr[i10];
            float f11 = this.f23886p[i10];
            ed edVar = gd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f23881k[i10] = this.f23882l[i10];
                this.f23883m[i10] = this.f23884n[i10];
                b(i10);
            }
        }
    }
}
