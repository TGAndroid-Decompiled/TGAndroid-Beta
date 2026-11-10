package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class qc {
    public float f37243a;
    public float f37244b;
    public float f37245c;
    public float d;
    public float f37246e;
    public float f37247f;
    public int f37248g;
    public float[] f37251k;
    public float[] f37252l;
    public float[] f37253m;
    public float[] f37254n;
    public float[] f37255o;
    public float[] f37256p;
    public float[] f37257q;
    public float[] f37258r;
    public float[] f37259s;
    public float[] f37260t;
    public float[] f37261u;
    public float[] v;
    public float[] f37262w;
    public int f37263x;
    public int h = -11318601;
    public final Paint f37249i = new Paint(1);
    public final Random f37250j = new Random();
    public int f37264y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f37249i;
        paint.setColor(i7);
        paint.setAlpha((this.f37248g * this.f37264y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qc.b(int):void");
    }

    public final void c(int i7) {
        this.f37263x = i7;
        this.f37251k = new float[i7];
        this.f37252l = new float[i7];
        this.f37253m = new float[i7];
        this.f37254n = new float[i7];
        this.f37255o = new float[i7];
        this.f37256p = new float[i7];
        this.f37257q = new float[i7];
        this.f37258r = new float[i7];
        this.f37259s = new float[i7];
        this.f37260t = new float[i7];
        this.f37261u = new float[i7];
        this.v = new float[i7];
        this.f37262w = new float[i7];
        for (int i10 = 0; i10 < this.f37263x; i10++) {
            float[] fArr = this.f37251k;
            Random random = this.f37250j;
            fArr[i10] = random.nextFloat();
            this.f37253m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f37263x;
            b(i10);
            this.f37255o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f37263x; i7++) {
            float[] fArr = this.f37255o;
            float f11 = fArr[i7];
            float f12 = this.f37256p[i7];
            pc pcVar = rc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f37251k[i7] = this.f37252l[i7];
                this.f37253m[i7] = this.f37254n[i7];
                b(i7);
            }
        }
    }
}
