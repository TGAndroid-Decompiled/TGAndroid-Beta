package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class gd {
    public float f28534a;
    public float f28535b;
    public float f28536c;
    public float d;
    public float e;
    public float f28537f;
    public int f28538g;
    public float[] f28541k;
    public float[] f28542l;
    public float[] f28543m;
    public float[] f28544n;
    public float[] f28545o;
    public float[] f28546p;
    public float[] f28547q;
    public float[] f28548r;
    public float[] f28549s;
    public float[] f28550t;
    public float[] f28551u;
    public float[] v;
    public float[] f28552w;
    public int f28553x;
    public int h = -11318601;
    public final Paint f28539i = new Paint(1);
    public final Random f28540j = new Random();
    public int f28554y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f28539i;
        paint.setColor(i10);
        paint.setAlpha((this.f28538g * this.f28554y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gd.b(int):void");
    }

    public final void c(int i10) {
        this.f28553x = i10;
        this.f28541k = new float[i10];
        this.f28542l = new float[i10];
        this.f28543m = new float[i10];
        this.f28544n = new float[i10];
        this.f28545o = new float[i10];
        this.f28546p = new float[i10];
        this.f28547q = new float[i10];
        this.f28548r = new float[i10];
        this.f28549s = new float[i10];
        this.f28550t = new float[i10];
        this.f28551u = new float[i10];
        this.v = new float[i10];
        this.f28552w = new float[i10];
        for (int i11 = 0; i11 < this.f28553x; i11++) {
            float[] fArr = this.f28541k;
            Random random = this.f28540j;
            fArr[i11] = random.nextFloat();
            this.f28543m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f28553x;
            b(i11);
            this.f28545o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f28553x; i10++) {
            float[] fArr = this.f28545o;
            float f10 = fArr[i10];
            float f11 = this.f28546p[i10];
            fd fdVar = hd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f28541k[i10] = this.f28542l[i10];
                this.f28543m[i10] = this.f28544n[i10];
                b(i10);
            }
        }
    }
}
