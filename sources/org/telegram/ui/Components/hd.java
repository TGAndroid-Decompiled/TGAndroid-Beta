package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class hd {
    public float f26844a;
    public float f26845b;
    public float f26846c;
    public float d;
    public float e;
    public float f26847f;
    public int f26848g;
    public float[] f26851k;
    public float[] f26852l;
    public float[] f26853m;
    public float[] f26854n;
    public float[] f26855o;
    public float[] f26856p;
    public float[] f26857q;
    public float[] f26858r;
    public float[] f26859s;
    public float[] f26860t;
    public float[] f26861u;
    public float[] v;
    public float[] f26862w;
    public int f26863x;
    public int h = -11318601;
    public final Paint f26849i = new Paint(1);
    public final Random f26850j = new Random();
    public int f26864y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f26849i;
        paint.setColor(i10);
        paint.setAlpha((this.f26848g * this.f26864y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hd.b(int):void");
    }

    public final void c(int i10) {
        this.f26863x = i10;
        this.f26851k = new float[i10];
        this.f26852l = new float[i10];
        this.f26853m = new float[i10];
        this.f26854n = new float[i10];
        this.f26855o = new float[i10];
        this.f26856p = new float[i10];
        this.f26857q = new float[i10];
        this.f26858r = new float[i10];
        this.f26859s = new float[i10];
        this.f26860t = new float[i10];
        this.f26861u = new float[i10];
        this.v = new float[i10];
        this.f26862w = new float[i10];
        for (int i11 = 0; i11 < this.f26863x; i11++) {
            float[] fArr = this.f26851k;
            Random random = this.f26850j;
            fArr[i11] = random.nextFloat();
            this.f26853m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f26863x;
            b(i11);
            this.f26855o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f26863x; i10++) {
            float[] fArr = this.f26855o;
            float f10 = fArr[i10];
            float f11 = this.f26856p[i10];
            gd gdVar = id.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f26851k[i10] = this.f26852l[i10];
                this.f26853m[i10] = this.f26854n[i10];
                b(i10);
            }
        }
    }
}
