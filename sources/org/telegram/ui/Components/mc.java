package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class mc {
    public float f37196a;
    public float f37197b;
    public float f37198c;
    public float d;
    public float f37199e;
    public float f37200f;
    public int f37201g;
    public float[] f37204k;
    public float[] f37205l;
    public float[] f37206m;
    public float[] f37207n;
    public float[] f37208o;
    public float[] f37209p;
    public float[] f37210q;
    public float[] f37211r;
    public float[] f37212s;
    public float[] f37213t;
    public float[] f37214u;
    public float[] v;
    public float[] f37215w;
    public int f37216x;
    public int h = -11318601;
    public final Paint f37202i = new Paint(1);
    public final Random f37203j = new Random();
    public int f37217y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f37202i;
        paint.setColor(i7);
        paint.setAlpha((this.f37201g * this.f37217y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mc.b(int):void");
    }

    public final void c(int i7) {
        this.f37216x = i7;
        this.f37204k = new float[i7];
        this.f37205l = new float[i7];
        this.f37206m = new float[i7];
        this.f37207n = new float[i7];
        this.f37208o = new float[i7];
        this.f37209p = new float[i7];
        this.f37210q = new float[i7];
        this.f37211r = new float[i7];
        this.f37212s = new float[i7];
        this.f37213t = new float[i7];
        this.f37214u = new float[i7];
        this.v = new float[i7];
        this.f37215w = new float[i7];
        for (int i10 = 0; i10 < this.f37216x; i10++) {
            float[] fArr = this.f37204k;
            Random random = this.f37203j;
            fArr[i10] = random.nextFloat();
            this.f37206m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f37216x;
            b(i10);
            this.f37208o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f37216x; i7++) {
            float[] fArr = this.f37208o;
            float f11 = fArr[i7];
            float f12 = this.f37209p[i7];
            lc lcVar = nc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f37204k[i7] = this.f37205l[i7];
                this.f37206m[i7] = this.f37207n[i7];
                b(i7);
            }
        }
    }
}
