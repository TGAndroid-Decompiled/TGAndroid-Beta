package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class vc {
    public float f40775a;
    public float f40776b;
    public float f40777c;
    public float d;
    public float f40778e;
    public float f40779f;
    public int f40780g;
    public float[] f40783k;
    public float[] f40784l;
    public float[] f40785m;
    public float[] f40786n;
    public float[] f40787o;
    public float[] f40788p;
    public float[] f40789q;
    public float[] f40790r;
    public float[] f40791s;
    public float[] f40792t;
    public float[] f40793u;
    public float[] v;
    public float[] f40794w;
    public int f40795x;
    public int h = -11318601;
    public final Paint f40781i = new Paint(1);
    public final Random f40782j = new Random();
    public int f40796y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f40781i;
        paint.setColor(i7);
        paint.setAlpha((this.f40780g * this.f40796y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc.b(int):void");
    }

    public final void c(int i7) {
        this.f40795x = i7;
        this.f40783k = new float[i7];
        this.f40784l = new float[i7];
        this.f40785m = new float[i7];
        this.f40786n = new float[i7];
        this.f40787o = new float[i7];
        this.f40788p = new float[i7];
        this.f40789q = new float[i7];
        this.f40790r = new float[i7];
        this.f40791s = new float[i7];
        this.f40792t = new float[i7];
        this.f40793u = new float[i7];
        this.v = new float[i7];
        this.f40794w = new float[i7];
        for (int i10 = 0; i10 < this.f40795x; i10++) {
            float[] fArr = this.f40783k;
            Random random = this.f40782j;
            fArr[i10] = random.nextFloat();
            this.f40785m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f40795x;
            b(i10);
            this.f40787o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f40795x; i7++) {
            float[] fArr = this.f40787o;
            float f11 = fArr[i7];
            float f12 = this.f40788p[i7];
            uc ucVar = wc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f40783k[i7] = this.f40784l[i7];
                this.f40785m[i7] = this.f40786n[i7];
                b(i7);
            }
        }
    }
}
