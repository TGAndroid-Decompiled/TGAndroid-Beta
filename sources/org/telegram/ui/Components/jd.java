package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class jd {
    public float f25959a;
    public float f25960b;
    public float f25961c;
    public float d;
    public float e;
    public float f25962f;
    public int f25963g;
    public float[] f25966k;
    public float[] f25967l;
    public float[] f25968m;
    public float[] f25969n;
    public float[] f25970o;
    public float[] f25971p;
    public float[] f25972q;
    public float[] f25973r;
    public float[] f25974s;
    public float[] f25975t;
    public float[] f25976u;
    public float[] v;
    public float[] f25977w;
    public int f25978x;
    public int h = -11318601;
    public final Paint f25964i = new Paint(1);
    public final Random f25965j = new Random();
    public int f25979y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f25964i;
        paint.setColor(i10);
        paint.setAlpha((this.f25963g * this.f25979y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jd.b(int):void");
    }

    public final void c(int i10) {
        this.f25978x = i10;
        this.f25966k = new float[i10];
        this.f25967l = new float[i10];
        this.f25968m = new float[i10];
        this.f25969n = new float[i10];
        this.f25970o = new float[i10];
        this.f25971p = new float[i10];
        this.f25972q = new float[i10];
        this.f25973r = new float[i10];
        this.f25974s = new float[i10];
        this.f25975t = new float[i10];
        this.f25976u = new float[i10];
        this.v = new float[i10];
        this.f25977w = new float[i10];
        for (int i11 = 0; i11 < this.f25978x; i11++) {
            float[] fArr = this.f25966k;
            Random random = this.f25965j;
            fArr[i11] = random.nextFloat();
            this.f25968m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f25978x;
            b(i11);
            this.f25970o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f25978x; i10++) {
            float[] fArr = this.f25970o;
            float f10 = fArr[i10];
            float f11 = this.f25971p[i10];
            id idVar = kd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f25966k[i10] = this.f25967l[i10];
                this.f25968m[i10] = this.f25969n[i10];
                b(i10);
            }
        }
    }
}
