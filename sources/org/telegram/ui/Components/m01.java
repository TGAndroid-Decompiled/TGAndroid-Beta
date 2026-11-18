package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class m01 {
    public long f37308a;
    public boolean f37309b;
    public final ArrayList f37310c;
    public final ArrayList d;
    public final int f37311e;
    public boolean f37312f;
    public float f37313g;
    public float h;

    public m01() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        l01 l01Var;
        ArrayList arrayList = this.f37310c;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            l01 l01Var2 = (l01) arrayList.get(i10);
            paint.setAlpha((int) (l01Var2.f36949f * 255.0f * f11));
            canvas.drawPoint(l01Var2.f36945a, l01Var2.f36946b, paint);
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
                l01Var = (l01) arrayList2.get(i7);
            } else {
                l01Var = new Object();
            }
            if (this.f37309b && this.f37312f) {
                float f12 = (i11 + 1) / j3;
                l01Var.f36945a = org.telegram.messenger.g0.T1(this.f37313g, centerX, f12);
                l01Var.f36946b = org.telegram.messenger.g0.T1(this.h, centerY, f12);
            } else {
                l01Var.f36945a = centerX;
                l01Var.f36946b = centerY;
            }
            SecureRandom secureRandom = Utilities.f22780b;
            double d10 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            l01Var.f36947c = (float) ((Math.cos(nextInt) * d10) - (Math.sin(nextInt) * d2));
            double d11 = nextInt;
            l01 l01Var3 = l01Var;
            l01Var3.d = (float) i5.c.c(d11, d2, Math.sin(nextInt) * d10);
            l01Var3.f36949f = 1.0f;
            l01Var3.h = 0.0f;
            if (this.f37309b) {
                l01Var3.f36950g = secureRandom.nextInt(200) + 600;
                l01Var3.f36948e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                l01Var3.f36950g = secureRandom.nextInt(100) + 400;
                l01Var3.f36948e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(l01Var3);
            i11++;
            sin = d10;
            i7 = 0;
            z10 = true;
        }
        this.f37312f = z10;
        this.f37313g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f37308a);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            l01 l01Var4 = (l01) arrayList.get(i12);
            float f13 = l01Var4.h;
            float f14 = l01Var4.f36950g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f37311e) {
                    arrayList2.add(l01Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                l01Var4.f36949f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f13 / f14);
                float f15 = l01Var4.f36945a;
                float f16 = l01Var4.f36947c;
                float f17 = l01Var4.f36948e;
                float f18 = (float) min;
                l01Var4.f36945a = a8.p0.f(f16 * f17, f18, 200.0f, f15);
                l01Var4.f36946b = (((l01Var4.d * f17) * f18) / 200.0f) + l01Var4.f36946b;
                l01Var4.h += f18;
            }
            i12++;
        }
        this.f37308a = elapsedRealtime;
    }

    public m01(int i7) {
        this.f37310c = new ArrayList();
        this.d = new ArrayList();
        this.f37311e = i7;
        for (int i10 = 0; i10 < i7; i10++) {
            this.d.add(new Object());
        }
    }
}
