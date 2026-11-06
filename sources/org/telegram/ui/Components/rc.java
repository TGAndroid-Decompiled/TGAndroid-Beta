package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class rc {
    public float f37675a;
    public float f37676b;
    public float f37677c;
    public float d;
    public float f37678e;
    public float f37679f;
    public int f37680g;
    public float[] f37683k;
    public float[] f37684l;
    public float[] f37685m;
    public float[] f37686n;
    public float[] f37687o;
    public float[] f37688p;
    public float[] f37689q;
    public float[] f37690r;
    public float[] f37691s;
    public float[] f37692t;
    public float[] f37693u;
    public float[] v;
    public float[] f37694w;
    public int f37695x;
    public int h = -11318601;
    public final Paint f37681i = new Paint(1);
    public final Random f37682j = new Random();
    public int f37696y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f37681i;
        paint.setColor(i7);
        paint.setAlpha((this.f37680g * this.f37696y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rc.b(int):void");
    }

    public final void c(int i7) {
        this.f37695x = i7;
        this.f37683k = new float[i7];
        this.f37684l = new float[i7];
        this.f37685m = new float[i7];
        this.f37686n = new float[i7];
        this.f37687o = new float[i7];
        this.f37688p = new float[i7];
        this.f37689q = new float[i7];
        this.f37690r = new float[i7];
        this.f37691s = new float[i7];
        this.f37692t = new float[i7];
        this.f37693u = new float[i7];
        this.v = new float[i7];
        this.f37694w = new float[i7];
        for (int i10 = 0; i10 < this.f37695x; i10++) {
            float[] fArr = this.f37683k;
            Random random = this.f37682j;
            fArr[i10] = random.nextFloat();
            this.f37685m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f37695x;
            b(i10);
            this.f37687o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f37695x; i7++) {
            float[] fArr = this.f37687o;
            float f11 = fArr[i7];
            float f12 = this.f37688p[i7];
            qc qcVar = sc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f37683k[i7] = this.f37684l[i7];
                this.f37685m[i7] = this.f37686n[i7];
                b(i7);
            }
        }
    }
}
