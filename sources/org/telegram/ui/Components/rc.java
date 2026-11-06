package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class rc {
    public float f37578a;
    public float f37579b;
    public float f37580c;
    public float d;
    public float f37581e;
    public float f37582f;
    public int f37583g;
    public float[] f37586k;
    public float[] f37587l;
    public float[] f37588m;
    public float[] f37589n;
    public float[] f37590o;
    public float[] f37591p;
    public float[] f37592q;
    public float[] f37593r;
    public float[] f37594s;
    public float[] f37595t;
    public float[] f37596u;
    public float[] v;
    public float[] f37597w;
    public int f37598x;
    public int h = -11318601;
    public final Paint f37584i = new Paint(1);
    public final Random f37585j = new Random();
    public int f37599y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f37584i;
        paint.setColor(i7);
        paint.setAlpha((this.f37583g * this.f37599y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rc.b(int):void");
    }

    public final void c(int i7) {
        this.f37598x = i7;
        this.f37586k = new float[i7];
        this.f37587l = new float[i7];
        this.f37588m = new float[i7];
        this.f37589n = new float[i7];
        this.f37590o = new float[i7];
        this.f37591p = new float[i7];
        this.f37592q = new float[i7];
        this.f37593r = new float[i7];
        this.f37594s = new float[i7];
        this.f37595t = new float[i7];
        this.f37596u = new float[i7];
        this.v = new float[i7];
        this.f37597w = new float[i7];
        for (int i10 = 0; i10 < this.f37598x; i10++) {
            float[] fArr = this.f37586k;
            Random random = this.f37585j;
            fArr[i10] = random.nextFloat();
            this.f37588m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f37598x;
            b(i10);
            this.f37590o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f37598x; i7++) {
            float[] fArr = this.f37590o;
            float f11 = fArr[i7];
            float f12 = this.f37591p[i7];
            qc qcVar = sc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f37586k[i7] = this.f37587l[i7];
                this.f37588m[i7] = this.f37589n[i7];
                b(i7);
            }
        }
    }
}
