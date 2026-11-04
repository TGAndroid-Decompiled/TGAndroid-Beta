package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class pc {
    public float f37114a;
    public float f37115b;
    public float f37116c;
    public float d;
    public float f37117e;
    public float f37118f;
    public int f37119g;
    public float[] f37122k;
    public float[] f37123l;
    public float[] f37124m;
    public float[] f37125n;
    public float[] f37126o;
    public float[] f37127p;
    public float[] f37128q;
    public float[] f37129r;
    public float[] f37130s;
    public float[] f37131t;
    public float[] f37132u;
    public float[] v;
    public float[] f37133w;
    public int f37134x;
    public int h = -11318601;
    public final Paint f37120i = new Paint(1);
    public final Random f37121j = new Random();
    public int f37135y = 255;

    public final void a() {
        int i3 = this.h;
        Paint paint = this.f37120i;
        paint.setColor(i3);
        paint.setAlpha((this.f37119g * this.f37135y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pc.b(int):void");
    }

    public final void c(int i3) {
        this.f37134x = i3;
        this.f37122k = new float[i3];
        this.f37123l = new float[i3];
        this.f37124m = new float[i3];
        this.f37125n = new float[i3];
        this.f37126o = new float[i3];
        this.f37127p = new float[i3];
        this.f37128q = new float[i3];
        this.f37129r = new float[i3];
        this.f37130s = new float[i3];
        this.f37131t = new float[i3];
        this.f37132u = new float[i3];
        this.v = new float[i3];
        this.f37133w = new float[i3];
        for (int i10 = 0; i10 < this.f37134x; i10++) {
            float[] fArr = this.f37122k;
            Random random = this.f37121j;
            fArr[i10] = random.nextFloat();
            this.f37124m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f37134x;
            b(i10);
            this.f37126o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i3 = 0; i3 < this.f37134x; i3++) {
            float[] fArr = this.f37126o;
            float f11 = fArr[i3];
            float f12 = this.f37127p[i3];
            oc ocVar = qc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i3] = f13;
            if (f13 >= 1.0f) {
                fArr[i3] = 0.0f;
                this.f37122k[i3] = this.f37123l[i3];
                this.f37124m[i3] = this.f37125n[i3];
                b(i3);
            }
        }
    }
}
