package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class kc {
    public float f27801a;
    public float f27802b;
    public float f27803c;
    public float d;
    public float e;
    public float f27804f;
    public int f27805g;
    public float[] f27808k;
    public float[] f27809l;
    public float[] f27810m;
    public float[] f27811n;
    public float[] f27812o;
    public float[] f27813p;
    public float[] f27814q;
    public float[] f27815r;
    public float[] f27816s;
    public float[] f27817t;
    public float[] f27818u;
    public float[] v;
    public float[] f27819w;
    public int f27820x;
    public int h = -11318601;
    public final Paint f27806i = new Paint(1);
    public final Random f27807j = new Random();
    public int f27821y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27806i;
        paint.setColor(i10);
        paint.setAlpha((this.f27805g * this.f27821y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kc.b(int):void");
    }

    public final void c(int i10) {
        this.f27820x = i10;
        this.f27808k = new float[i10];
        this.f27809l = new float[i10];
        this.f27810m = new float[i10];
        this.f27811n = new float[i10];
        this.f27812o = new float[i10];
        this.f27813p = new float[i10];
        this.f27814q = new float[i10];
        this.f27815r = new float[i10];
        this.f27816s = new float[i10];
        this.f27817t = new float[i10];
        this.f27818u = new float[i10];
        this.v = new float[i10];
        this.f27819w = new float[i10];
        for (int i11 = 0; i11 < this.f27820x; i11++) {
            float[] fArr = this.f27808k;
            Random random = this.f27807j;
            fArr[i11] = random.nextFloat();
            this.f27810m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27820x;
            b(i11);
            this.f27812o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27820x; i10++) {
            float[] fArr = this.f27812o;
            float f10 = fArr[i10];
            float f11 = this.f27813p[i10];
            nh.a aVar = lc.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27808k[i10] = this.f27809l[i10];
                this.f27810m[i10] = this.f27811n[i10];
                b(i10);
            }
        }
    }
}
