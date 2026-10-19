package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f26842a;
    public float f26843b;
    public float f26844c;
    public float d;
    public float e;
    public float f26845f;
    public int f26846g;
    public float[] f26849k;
    public float[] f26850l;
    public float[] f26851m;
    public float[] f26852n;
    public float[] f26853o;
    public float[] f26854p;
    public float[] f26855q;
    public float[] f26856r;
    public float[] f26857s;
    public float[] f26858t;
    public float[] f26859u;
    public float[] v;
    public float[] f26860w;
    public int f26861x;
    public int h = -11318601;
    public final Paint f26847i = new Paint(1);
    public final Random f26848j = new Random();
    public int f26862y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f26847i;
        paint.setColor(i10);
        paint.setAlpha((this.f26846g * this.f26862y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hd.b(int):void");
    }

    public final void c(int i10) {
        this.f26861x = i10;
        this.f26849k = new float[i10];
        this.f26850l = new float[i10];
        this.f26851m = new float[i10];
        this.f26852n = new float[i10];
        this.f26853o = new float[i10];
        this.f26854p = new float[i10];
        this.f26855q = new float[i10];
        this.f26856r = new float[i10];
        this.f26857s = new float[i10];
        this.f26858t = new float[i10];
        this.f26859u = new float[i10];
        this.v = new float[i10];
        this.f26860w = new float[i10];
        for (int i11 = 0; i11 < this.f26861x; i11++) {
            float[] fArr = this.f26849k;
            Random random = this.f26848j;
            fArr[i11] = random.nextFloat();
            this.f26851m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f26861x;
            b(i11);
            this.f26853o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f26861x; i10++) {
            float[] fArr = this.f26853o;
            float f10 = fArr[i10];
            float f11 = this.f26854p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f26849k[i10] = this.f26850l[i10];
                this.f26851m[i10] = this.f26852n[i10];
                b(i10);
            }
        }
    }
}
