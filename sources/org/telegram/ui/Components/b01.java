package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class b01 {
    public long f31958a;
    public boolean f31959b;
    public final ArrayList f31960c;
    public final ArrayList d;
    public final int f31961e;
    public boolean f31962f;
    public float f31963g;
    public float h;

    public b01() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        a01 a01Var;
        ArrayList arrayList = this.f31960c;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            a01 a01Var2 = (a01) arrayList.get(i10);
            paint.setAlpha((int) (a01Var2.f31625f * 255.0f * f11));
            canvas.drawPoint(a01Var2.f31621a, a01Var2.f31622b, paint);
        }
        double d = (f10 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d2 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d2) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        boolean z9 = true;
        int j3 = Utilities.j(arrayList2.size() / 12, 3, 1);
        int i11 = 0;
        while (i11 < j3) {
            if (!arrayList2.isEmpty()) {
                arrayList2.remove(i7);
                a01Var = (a01) arrayList2.get(i7);
            } else {
                a01Var = new Object();
            }
            if (this.f31959b && this.f31962f) {
                float f12 = (i11 + 1) / j3;
                a01Var.f31621a = org.telegram.messenger.g0.T1(this.f31963g, centerX, f12);
                a01Var.f31622b = org.telegram.messenger.g0.T1(this.h, centerY, f12);
            } else {
                a01Var.f31621a = centerX;
                a01Var.f31622b = centerY;
            }
            SecureRandom secureRandom = Utilities.f21331b;
            double d10 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            a01Var.f31623c = (float) ((Math.cos(nextInt) * d10) - (Math.sin(nextInt) * d2));
            double d11 = nextInt;
            a01 a01Var3 = a01Var;
            a01Var3.d = (float) jg.g.d(d11, d2, Math.sin(nextInt) * d10);
            a01Var3.f31625f = 1.0f;
            a01Var3.h = 0.0f;
            if (this.f31959b) {
                a01Var3.f31626g = secureRandom.nextInt(200) + 600;
                a01Var3.f31624e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                a01Var3.f31626g = secureRandom.nextInt(100) + 400;
                a01Var3.f31624e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(a01Var3);
            i11++;
            sin = d10;
            i7 = 0;
            z9 = true;
        }
        this.f31962f = z9;
        this.f31963g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f31958a);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            a01 a01Var4 = (a01) arrayList.get(i12);
            float f13 = a01Var4.h;
            float f14 = a01Var4.f31626g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f31961e) {
                    arrayList2.add(a01Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                a01Var4.f31625f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f13 / f14);
                float f15 = a01Var4.f31621a;
                float f16 = a01Var4.f31623c;
                float f17 = a01Var4.f31624e;
                float f18 = (float) min;
                a01Var4.f31621a = a8.p0.f(f16 * f17, f18, 200.0f, f15);
                a01Var4.f31622b = (((a01Var4.d * f17) * f18) / 200.0f) + a01Var4.f31622b;
                a01Var4.h += f18;
            }
            i12++;
        }
        this.f31958a = elapsedRealtime;
    }

    public b01(int i7) {
        this.f31960c = new ArrayList();
        this.d = new ArrayList();
        this.f31961e = i7;
        for (int i10 = 0; i10 < i7; i10++) {
            this.d.add(new Object());
        }
    }
}
