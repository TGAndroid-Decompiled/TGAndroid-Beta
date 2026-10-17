package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f26849a;
    public float f26850b;
    public float f26851c;
    public float d;
    public float e;
    public float f26852f;
    public int f26853g;
    public float[] f26856k;
    public float[] f26857l;
    public float[] f26858m;
    public float[] f26859n;
    public float[] f26860o;
    public float[] f26861p;
    public float[] f26862q;
    public float[] f26863r;
    public float[] f26864s;
    public float[] f26865t;
    public float[] f26866u;
    public float[] v;
    public float[] f26867w;
    public int f26868x;
    public int h = -11318601;
    public final Paint f26854i = new Paint(1);
    public final Random f26855j = new Random();
    public int f26869y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f26854i;
        paint.setColor(i10);
        paint.setAlpha((this.f26853g * this.f26869y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hd.b(int):void");
    }

    public final void c(int i10) {
        this.f26868x = i10;
        this.f26856k = new float[i10];
        this.f26857l = new float[i10];
        this.f26858m = new float[i10];
        this.f26859n = new float[i10];
        this.f26860o = new float[i10];
        this.f26861p = new float[i10];
        this.f26862q = new float[i10];
        this.f26863r = new float[i10];
        this.f26864s = new float[i10];
        this.f26865t = new float[i10];
        this.f26866u = new float[i10];
        this.v = new float[i10];
        this.f26867w = new float[i10];
        for (int i11 = 0; i11 < this.f26868x; i11++) {
            float[] fArr = this.f26856k;
            Random random = this.f26855j;
            fArr[i11] = random.nextFloat();
            this.f26858m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f26868x;
            b(i11);
            this.f26860o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f26868x; i10++) {
            float[] fArr = this.f26860o;
            float f10 = fArr[i10];
            float f11 = this.f26861p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f26856k[i10] = this.f26857l[i10];
                this.f26858m[i10] = this.f26859n[i10];
                b(i10);
            }
        }
    }
}
