package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class rc {
    public float f37652a;
    public float f37653b;
    public float f37654c;
    public float d;
    public float f37655e;
    public float f37656f;
    public int f37657g;
    public float[] f37660k;
    public float[] f37661l;
    public float[] f37662m;
    public float[] f37663n;
    public float[] f37664o;
    public float[] f37665p;
    public float[] f37666q;
    public float[] f37667r;
    public float[] f37668s;
    public float[] f37669t;
    public float[] f37670u;
    public float[] v;
    public float[] f37671w;
    public int f37672x;
    public int h = -11318601;
    public final Paint f37658i = new Paint(1);
    public final Random f37659j = new Random();
    public int f37673y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f37658i;
        paint.setColor(i7);
        paint.setAlpha((this.f37657g * this.f37673y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rc.b(int):void");
    }

    public final void c(int i7) {
        this.f37672x = i7;
        this.f37660k = new float[i7];
        this.f37661l = new float[i7];
        this.f37662m = new float[i7];
        this.f37663n = new float[i7];
        this.f37664o = new float[i7];
        this.f37665p = new float[i7];
        this.f37666q = new float[i7];
        this.f37667r = new float[i7];
        this.f37668s = new float[i7];
        this.f37669t = new float[i7];
        this.f37670u = new float[i7];
        this.v = new float[i7];
        this.f37671w = new float[i7];
        for (int i10 = 0; i10 < this.f37672x; i10++) {
            float[] fArr = this.f37660k;
            Random random = this.f37659j;
            fArr[i10] = random.nextFloat();
            this.f37662m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f37672x;
            b(i10);
            this.f37664o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f37672x; i7++) {
            float[] fArr = this.f37664o;
            float f11 = fArr[i7];
            float f12 = this.f37665p[i7];
            qc qcVar = sc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f37660k[i7] = this.f37661l[i7];
                this.f37662m[i7] = this.f37663n[i7];
                b(i7);
            }
        }
    }
}
