package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class jd {
    public float f26318a;
    public float f26319b;
    public float f26320c;
    public float d;
    public float e;
    public float f26321f;
    public int f26322g;
    public float[] f26325k;
    public float[] f26326l;
    public float[] f26327m;
    public float[] f26328n;
    public float[] f26329o;
    public float[] f26330p;
    public float[] f26331q;
    public float[] f26332r;
    public float[] f26333s;
    public float[] f26334t;
    public float[] f26335u;
    public float[] v;
    public float[] f26336w;
    public int f26337x;
    public int h = -11318601;
    public final Paint f26323i = new Paint(1);
    public final Random f26324j = new Random();
    public int f26338y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f26323i;
        paint.setColor(i10);
        paint.setAlpha((this.f26322g * this.f26338y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jd.b(int):void");
    }

    public final void c(int i10) {
        this.f26337x = i10;
        this.f26325k = new float[i10];
        this.f26326l = new float[i10];
        this.f26327m = new float[i10];
        this.f26328n = new float[i10];
        this.f26329o = new float[i10];
        this.f26330p = new float[i10];
        this.f26331q = new float[i10];
        this.f26332r = new float[i10];
        this.f26333s = new float[i10];
        this.f26334t = new float[i10];
        this.f26335u = new float[i10];
        this.v = new float[i10];
        this.f26336w = new float[i10];
        for (int i11 = 0; i11 < this.f26337x; i11++) {
            float[] fArr = this.f26325k;
            Random random = this.f26324j;
            fArr[i11] = random.nextFloat();
            this.f26327m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f26337x;
            b(i11);
            this.f26329o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f26337x; i10++) {
            float[] fArr = this.f26329o;
            float f10 = fArr[i10];
            float f11 = this.f26330p[i10];
            id idVar = kd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f26325k[i10] = this.f26326l[i10];
                this.f26327m[i10] = this.f26328n[i10];
                b(i10);
            }
        }
    }
}
