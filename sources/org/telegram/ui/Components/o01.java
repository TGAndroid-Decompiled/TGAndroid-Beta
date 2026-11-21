package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class o01 {
    public long f38027a;
    public boolean f38028b;
    public final ArrayList f38029c;
    public final ArrayList d;
    public final int f38030e;
    public boolean f38031f;
    public float f38032g;
    public float h;

    public o01() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        n01 n01Var;
        ArrayList arrayList = this.f38029c;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            n01 n01Var2 = (n01) arrayList.get(i10);
            paint.setAlpha((int) (n01Var2.f37714f * 255.0f * f11));
            canvas.drawPoint(n01Var2.f37710a, n01Var2.f37711b, paint);
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
                n01Var = (n01) arrayList2.get(i7);
            } else {
                n01Var = new Object();
            }
            if (this.f38028b && this.f38031f) {
                float f12 = (i11 + 1) / j3;
                n01Var.f37710a = org.telegram.messenger.g0.T1(this.f38032g, centerX, f12);
                n01Var.f37711b = org.telegram.messenger.g0.T1(this.h, centerY, f12);
            } else {
                n01Var.f37710a = centerX;
                n01Var.f37711b = centerY;
            }
            SecureRandom secureRandom = Utilities.f22805b;
            double d10 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            n01Var.f37712c = (float) ((Math.cos(nextInt) * d10) - (Math.sin(nextInt) * d2));
            double d11 = nextInt;
            n01 n01Var3 = n01Var;
            n01Var3.d = (float) i5.c.c(d11, d2, Math.sin(nextInt) * d10);
            n01Var3.f37714f = 1.0f;
            n01Var3.h = 0.0f;
            if (this.f38028b) {
                n01Var3.f37715g = secureRandom.nextInt(200) + 600;
                n01Var3.f37713e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                n01Var3.f37715g = secureRandom.nextInt(100) + 400;
                n01Var3.f37713e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(n01Var3);
            i11++;
            sin = d10;
            i7 = 0;
            z10 = true;
        }
        this.f38031f = z10;
        this.f38032g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f38027a);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            n01 n01Var4 = (n01) arrayList.get(i12);
            float f13 = n01Var4.h;
            float f14 = n01Var4.f37715g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f38030e) {
                    arrayList2.add(n01Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                n01Var4.f37714f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f13 / f14);
                float f15 = n01Var4.f37710a;
                float f16 = n01Var4.f37712c;
                float f17 = n01Var4.f37713e;
                float f18 = (float) min;
                n01Var4.f37710a = a8.p0.f(f16 * f17, f18, 200.0f, f15);
                n01Var4.f37711b = (((n01Var4.d * f17) * f18) / 200.0f) + n01Var4.f37711b;
                n01Var4.h += f18;
            }
            i12++;
        }
        this.f38027a = elapsedRealtime;
    }

    public o01(int i7) {
        this.f38029c = new ArrayList();
        this.d = new ArrayList();
        this.f38030e = i7;
        for (int i10 = 0; i10 < i7; i10++) {
            this.d.add(new Object());
        }
    }
}
