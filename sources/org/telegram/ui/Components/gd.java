package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class gd {
    public float f28536a;
    public float f28537b;
    public float f28538c;
    public float d;
    public float e;
    public float f28539f;
    public int f28540g;
    public float[] f28543k;
    public float[] f28544l;
    public float[] f28545m;
    public float[] f28546n;
    public float[] f28547o;
    public float[] f28548p;
    public float[] f28549q;
    public float[] f28550r;
    public float[] f28551s;
    public float[] f28552t;
    public float[] f28553u;
    public float[] v;
    public float[] f28554w;
    public int f28555x;
    public int h = -11318601;
    public final Paint f28541i = new Paint(1);
    public final Random f28542j = new Random();
    public int f28556y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f28541i;
        paint.setColor(i10);
        paint.setAlpha((this.f28540g * this.f28556y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gd.b(int):void");
    }

    public final void c(int i10) {
        this.f28555x = i10;
        this.f28543k = new float[i10];
        this.f28544l = new float[i10];
        this.f28545m = new float[i10];
        this.f28546n = new float[i10];
        this.f28547o = new float[i10];
        this.f28548p = new float[i10];
        this.f28549q = new float[i10];
        this.f28550r = new float[i10];
        this.f28551s = new float[i10];
        this.f28552t = new float[i10];
        this.f28553u = new float[i10];
        this.v = new float[i10];
        this.f28554w = new float[i10];
        for (int i11 = 0; i11 < this.f28555x; i11++) {
            float[] fArr = this.f28543k;
            Random random = this.f28542j;
            fArr[i11] = random.nextFloat();
            this.f28545m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f28555x;
            b(i11);
            this.f28547o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f28555x; i10++) {
            float[] fArr = this.f28547o;
            float f10 = fArr[i10];
            float f11 = this.f28548p[i10];
            fd fdVar = hd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f28543k[i10] = this.f28544l[i10];
                this.f28545m[i10] = this.f28546n[i10];
                b(i10);
            }
        }
    }
}
