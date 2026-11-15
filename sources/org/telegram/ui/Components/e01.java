package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e01 {
    public long f34126a;
    public boolean f34127b;
    public final ArrayList f34128c;
    public final ArrayList d;
    public final int f34129e;
    public boolean f34130f;
    public float f34131g;
    public float h;

    public e01() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        d01 d01Var;
        ArrayList arrayList = this.f34128c;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            d01 d01Var2 = (d01) arrayList.get(i10);
            paint.setAlpha((int) (d01Var2.f33780f * 255.0f * f11));
            canvas.drawPoint(d01Var2.f33776a, d01Var2.f33777b, paint);
        }
        double d = (f10 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d2 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d2) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        boolean z10 = true;
        int j3 = Utilities.j(arrayList2.size() / 12, 3, 1);
        int i11 = 0;
        while (i11 < j3) {
            if (!arrayList2.isEmpty()) {
                arrayList2.remove(i7);
                d01Var = (d01) arrayList2.get(i7);
            } else {
                d01Var = new Object();
            }
            if (this.f34127b && this.f34130f) {
                float f12 = (i11 + 1) / j3;
                d01Var.f33776a = org.telegram.messenger.g0.T1(this.f34131g, centerX, f12);
                d01Var.f33777b = org.telegram.messenger.g0.T1(this.h, centerY, f12);
            } else {
                d01Var.f33776a = centerX;
                d01Var.f33777b = centerY;
            }
            SecureRandom secureRandom = Utilities.f22414b;
            double d10 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            d01Var.f33778c = (float) ((Math.cos(nextInt) * d10) - (Math.sin(nextInt) * d2));
            double d11 = nextInt;
            d01 d01Var3 = d01Var;
            d01Var3.d = (float) i5.c.c(d11, d2, Math.sin(nextInt) * d10);
            d01Var3.f33780f = 1.0f;
            d01Var3.h = 0.0f;
            if (this.f34127b) {
                d01Var3.f33781g = secureRandom.nextInt(200) + 600;
                d01Var3.f33779e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                d01Var3.f33781g = secureRandom.nextInt(100) + 400;
                d01Var3.f33779e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(d01Var3);
            i11++;
            sin = d10;
            i7 = 0;
            z10 = true;
        }
        this.f34130f = z10;
        this.f34131g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f34126a);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            d01 d01Var4 = (d01) arrayList.get(i12);
            float f13 = d01Var4.h;
            float f14 = d01Var4.f33781g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f34129e) {
                    arrayList2.add(d01Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                d01Var4.f33780f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f13 / f14);
                float f15 = d01Var4.f33776a;
                float f16 = d01Var4.f33778c;
                float f17 = d01Var4.f33779e;
                float f18 = (float) min;
                d01Var4.f33776a = a8.p0.f(f16 * f17, f18, 200.0f, f15);
                d01Var4.f33777b = (((d01Var4.d * f17) * f18) / 200.0f) + d01Var4.f33777b;
                d01Var4.h += f18;
            }
            i12++;
        }
        this.f34126a = elapsedRealtime;
    }

    public e01(int i7) {
        this.f34128c = new ArrayList();
        this.d = new ArrayList();
        this.f34129e = i7;
        for (int i10 = 0; i10 < i7; i10++) {
            this.d.add(new Object());
        }
    }
}
