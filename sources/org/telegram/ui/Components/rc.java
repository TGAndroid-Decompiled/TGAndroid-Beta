package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class rc {
    public float f37599a;
    public float f37600b;
    public float f37601c;
    public float d;
    public float f37602e;
    public float f37603f;
    public int f37604g;
    public float[] f37607k;
    public float[] f37608l;
    public float[] f37609m;
    public float[] f37610n;
    public float[] f37611o;
    public float[] f37612p;
    public float[] f37613q;
    public float[] f37614r;
    public float[] f37615s;
    public float[] f37616t;
    public float[] f37617u;
    public float[] v;
    public float[] f37618w;
    public int f37619x;
    public int h = -11318601;
    public final Paint f37605i = new Paint(1);
    public final Random f37606j = new Random();
    public int f37620y = 255;

    public final void a() {
        int i7 = this.h;
        Paint paint = this.f37605i;
        paint.setColor(i7);
        paint.setAlpha((this.f37604g * this.f37620y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rc.b(int):void");
    }

    public final void c(int i7) {
        this.f37619x = i7;
        this.f37607k = new float[i7];
        this.f37608l = new float[i7];
        this.f37609m = new float[i7];
        this.f37610n = new float[i7];
        this.f37611o = new float[i7];
        this.f37612p = new float[i7];
        this.f37613q = new float[i7];
        this.f37614r = new float[i7];
        this.f37615s = new float[i7];
        this.f37616t = new float[i7];
        this.f37617u = new float[i7];
        this.v = new float[i7];
        this.f37618w = new float[i7];
        for (int i10 = 0; i10 < this.f37619x; i10++) {
            float[] fArr = this.f37607k;
            Random random = this.f37606j;
            fArr[i10] = random.nextFloat();
            this.f37609m[i10] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f37619x;
            b(i10);
            this.f37611o[i10] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i7 = 0; i7 < this.f37619x; i7++) {
            float[] fArr = this.f37611o;
            float f11 = fArr[i7];
            float f12 = this.f37612p[i7];
            qc qcVar = sc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i7] = f13;
            if (f13 >= 1.0f) {
                fArr[i7] = 0.0f;
                this.f37607k[i7] = this.f37608l[i7];
                this.f37609m[i7] = this.f37610n[i7];
                b(i7);
            }
        }
    }
}
