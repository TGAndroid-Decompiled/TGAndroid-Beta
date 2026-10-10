package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class kd {
    public float f27976a;
    public float f27977b;
    public float f27978c;
    public float d;
    public float f27979e;
    public float f27980f;
    public int f27981g;
    public float[] f27984k;
    public float[] f27985l;
    public float[] f27986m;
    public float[] f27987n;
    public float[] f27988o;
    public float[] f27989p;
    public float[] f27990q;
    public float[] f27991r;
    public float[] f27992s;
    public float[] f27993t;
    public float[] f27994u;
    public float[] v;
    public float[] f27995w;
    public int f27996x;
    public int h = -11318601;
    public final Paint f27982i = new Paint(1);
    public final Random f27983j = new Random();
    public int f27997y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27982i;
        paint.setColor(i10);
        paint.setAlpha((this.f27981g * this.f27997y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kd.b(int):void");
    }

    public final void c(int i10) {
        this.f27996x = i10;
        this.f27984k = new float[i10];
        this.f27985l = new float[i10];
        this.f27986m = new float[i10];
        this.f27987n = new float[i10];
        this.f27988o = new float[i10];
        this.f27989p = new float[i10];
        this.f27990q = new float[i10];
        this.f27991r = new float[i10];
        this.f27992s = new float[i10];
        this.f27993t = new float[i10];
        this.f27994u = new float[i10];
        this.v = new float[i10];
        this.f27995w = new float[i10];
        for (int i11 = 0; i11 < this.f27996x; i11++) {
            float[] fArr = this.f27984k;
            Random random = this.f27983j;
            fArr[i11] = random.nextFloat();
            this.f27986m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27996x;
            b(i11);
            this.f27988o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27996x; i10++) {
            float[] fArr = this.f27988o;
            float f10 = fArr[i10];
            float f11 = this.f27989p[i10];
            jd jdVar = ld.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27984k[i10] = this.f27985l[i10];
                this.f27986m[i10] = this.f27987n[i10];
                b(i10);
            }
        }
    }
}
