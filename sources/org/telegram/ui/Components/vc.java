package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class vc {
    public float f40773a;
    public float f40774b;
    public float f40775c;
    public float d;
    public float f40776e;
    public float f40777f;
    public int f40778g;
    public float[] f40781k;
    public float[] f40782l;
    public float[] f40783m;
    public float[] f40784n;
    public float[] f40785o;
    public float[] f40786p;
    public float[] f40787q;
    public float[] f40788r;
    public float[] f40789s;
    public float[] f40790t;
    public float[] f40791u;
    public float[] v;
    public float[] f40792w;
    public int f40793x;
    public int h = -11318601;
    public final Paint f40779i = new Paint(1);
    public final Random f40780j = new Random();
    public int f40794y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f40779i;
        paint.setColor(i7);
        paint.setAlpha((this.f40778g * this.f40794y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc.b(int):void");
    }

    public final void c(int i7) {
        this.f40793x = i7;
        this.f40781k = new float[i7];
        this.f40782l = new float[i7];
        this.f40783m = new float[i7];
        this.f40784n = new float[i7];
        this.f40785o = new float[i7];
        this.f40786p = new float[i7];
        this.f40787q = new float[i7];
        this.f40788r = new float[i7];
        this.f40789s = new float[i7];
        this.f40790t = new float[i7];
        this.f40791u = new float[i7];
        this.v = new float[i7];
        this.f40792w = new float[i7];
        for (int i10 = 0; i10 < this.f40793x; i10++) {
            float[] fArr = this.f40781k;
            Random random = this.f40780j;
            fArr[i10] = random.nextFloat();
            this.f40783m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f40793x;
            b(i10);
            this.f40785o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f40793x; i7++) {
            float[] fArr = this.f40785o;
            float f11 = fArr[i7];
            float f12 = this.f40786p[i7];
            uc ucVar = wc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f40781k[i7] = this.f40782l[i7];
                this.f40783m[i7] = this.f40784n[i7];
                b(i7);
            }
        }
    }
}
