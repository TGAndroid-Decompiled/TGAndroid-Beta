package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class n01 {
    public long f37708a;
    public boolean f37709b;
    public final ArrayList f37710c;
    public final ArrayList d;
    public final int f37711e;
    public boolean f37712f;
    public float f37713g;
    public float h;

    public n01() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        m01 m01Var;
        ArrayList arrayList = this.f37710c;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            m01 m01Var2 = (m01) arrayList.get(i10);
            paint.setAlpha((int) (m01Var2.f37375f * 255.0f * f11));
            canvas.drawPoint(m01Var2.f37371a, m01Var2.f37372b, paint);
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
                m01Var = (m01) arrayList2.get(i7);
            } else {
                m01Var = new Object();
            }
            if (this.f37709b && this.f37712f) {
                float f12 = (i11 + 1) / j3;
                m01Var.f37371a = org.telegram.messenger.g0.T1(this.f37713g, centerX, f12);
                m01Var.f37372b = org.telegram.messenger.g0.T1(this.h, centerY, f12);
            } else {
                m01Var.f37371a = centerX;
                m01Var.f37372b = centerY;
            }
            SecureRandom secureRandom = Utilities.f22808b;
            double d10 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            m01Var.f37373c = (float) ((Math.cos(nextInt) * d10) - (Math.sin(nextInt) * d2));
            double d11 = nextInt;
            m01 m01Var3 = m01Var;
            m01Var3.d = (float) i5.c.c(d11, d2, Math.sin(nextInt) * d10);
            m01Var3.f37375f = 1.0f;
            m01Var3.h = 0.0f;
            if (this.f37709b) {
                m01Var3.f37376g = secureRandom.nextInt(200) + 600;
                m01Var3.f37374e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                m01Var3.f37376g = secureRandom.nextInt(100) + 400;
                m01Var3.f37374e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(m01Var3);
            i11++;
            sin = d10;
            i7 = 0;
            z10 = true;
        }
        this.f37712f = z10;
        this.f37713g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f37708a);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            m01 m01Var4 = (m01) arrayList.get(i12);
            float f13 = m01Var4.h;
            float f14 = m01Var4.f37376g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f37711e) {
                    arrayList2.add(m01Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                m01Var4.f37375f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f13 / f14);
                float f15 = m01Var4.f37371a;
                float f16 = m01Var4.f37373c;
                float f17 = m01Var4.f37374e;
                float f18 = (float) min;
                m01Var4.f37371a = a8.p0.f(f16 * f17, f18, 200.0f, f15);
                m01Var4.f37372b = (((m01Var4.d * f17) * f18) / 200.0f) + m01Var4.f37372b;
                m01Var4.h += f18;
            }
            i12++;
        }
        this.f37708a = elapsedRealtime;
    }

    public n01(int i7) {
        this.f37710c = new ArrayList();
        this.d = new ArrayList();
        this.f37711e = i7;
        for (int i10 = 0; i10 < i7; i10++) {
            this.d.add(new Object());
        }
    }
}
