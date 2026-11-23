package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class vc {
    public float f40774a;
    public float f40775b;
    public float f40776c;
    public float d;
    public float f40777e;
    public float f40778f;
    public int f40779g;
    public float[] f40782k;
    public float[] f40783l;
    public float[] f40784m;
    public float[] f40785n;
    public float[] f40786o;
    public float[] f40787p;
    public float[] f40788q;
    public float[] f40789r;
    public float[] f40790s;
    public float[] f40791t;
    public float[] f40792u;
    public float[] v;
    public float[] f40793w;
    public int f40794x;
    public int h = -11318601;
    public final Paint f40780i = new Paint(1);
    public final Random f40781j = new Random();
    public int f40795y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f40780i;
        paint.setColor(i7);
        paint.setAlpha((this.f40779g * this.f40795y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc.b(int):void");
    }

    public final void c(int i7) {
        this.f40794x = i7;
        this.f40782k = new float[i7];
        this.f40783l = new float[i7];
        this.f40784m = new float[i7];
        this.f40785n = new float[i7];
        this.f40786o = new float[i7];
        this.f40787p = new float[i7];
        this.f40788q = new float[i7];
        this.f40789r = new float[i7];
        this.f40790s = new float[i7];
        this.f40791t = new float[i7];
        this.f40792u = new float[i7];
        this.v = new float[i7];
        this.f40793w = new float[i7];
        for (int i10 = 0; i10 < this.f40794x; i10++) {
            float[] fArr = this.f40782k;
            Random random = this.f40781j;
            fArr[i10] = random.nextFloat();
            this.f40784m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f40794x;
            b(i10);
            this.f40786o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f40794x; i7++) {
            float[] fArr = this.f40786o;
            float f11 = fArr[i7];
            float f12 = this.f40787p[i7];
            uc ucVar = wc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f40782k[i7] = this.f40783l[i7];
                this.f40784m[i7] = this.f40785n[i7];
                b(i7);
            }
        }
    }
}
