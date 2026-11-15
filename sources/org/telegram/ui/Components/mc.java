package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class mc {
    public float f37195a;
    public float f37196b;
    public float f37197c;
    public float d;
    public float f37198e;
    public float f37199f;
    public int f37200g;
    public float[] f37203k;
    public float[] f37204l;
    public float[] f37205m;
    public float[] f37206n;
    public float[] f37207o;
    public float[] f37208p;
    public float[] f37209q;
    public float[] f37210r;
    public float[] f37211s;
    public float[] f37212t;
    public float[] f37213u;
    public float[] v;
    public float[] f37214w;
    public int f37215x;
    public int h = -11318601;
    public final Paint f37201i = new Paint(1);
    public final Random f37202j = new Random();
    public int f37216y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f37201i;
        paint.setColor(i7);
        paint.setAlpha((this.f37200g * this.f37216y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mc.b(int):void");
    }

    public final void c(int i7) {
        this.f37215x = i7;
        this.f37203k = new float[i7];
        this.f37204l = new float[i7];
        this.f37205m = new float[i7];
        this.f37206n = new float[i7];
        this.f37207o = new float[i7];
        this.f37208p = new float[i7];
        this.f37209q = new float[i7];
        this.f37210r = new float[i7];
        this.f37211s = new float[i7];
        this.f37212t = new float[i7];
        this.f37213u = new float[i7];
        this.v = new float[i7];
        this.f37214w = new float[i7];
        for (int i10 = 0; i10 < this.f37215x; i10++) {
            float[] fArr = this.f37203k;
            Random random = this.f37202j;
            fArr[i10] = random.nextFloat();
            this.f37205m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f37215x;
            b(i10);
            this.f37207o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f37215x; i7++) {
            float[] fArr = this.f37207o;
            float f11 = fArr[i7];
            float f12 = this.f37208p[i7];
            lc lcVar = nc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f37203k[i7] = this.f37204l[i7];
                this.f37205m[i7] = this.f37206n[i7];
                b(i7);
            }
        }
    }
}
