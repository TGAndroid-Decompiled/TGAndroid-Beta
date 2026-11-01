package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class i11 {
    public long f26981a;
    public boolean f26982b;
    public final ArrayList f26983c;
    public final ArrayList d;
    public final int e;
    public boolean f26984f;
    public float f26985g;
    public float h;

    public i11() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        h11 h11Var;
        ArrayList arrayList = this.f26983c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            h11 h11Var2 = (h11) arrayList.get(i11);
            paint.setAlpha((int) (h11Var2.f26643f * 255.0f * f10));
            canvas.drawPoint(h11Var2.f26640a, h11Var2.f26641b, paint);
        }
        double d = (f7 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d10 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d10) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        boolean z10 = true;
        int j10 = Utilities.j(arrayList2.size() / 12, 3, 1);
        int i12 = 0;
        while (i12 < j10) {
            if (!arrayList2.isEmpty()) {
                arrayList2.remove(i10);
                h11Var = (h11) arrayList2.get(i10);
            } else {
                h11Var = new Object();
            }
            if (this.f26982b && this.f26984f) {
                float f11 = (i12 + 1) / j10;
                h11Var.f26640a = org.telegram.messenger.i0.T1(this.f26985g, centerX, f11);
                h11Var.f26641b = org.telegram.messenger.i0.T1(this.h, centerY, f11);
            } else {
                h11Var.f26640a = centerX;
                h11Var.f26641b = centerY;
            }
            SecureRandom secureRandom = Utilities.f14520b;
            double d11 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            h11Var.f26642c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            double d12 = nextInt;
            h11 h11Var3 = h11Var;
            h11Var3.d = (float) i0.a.c(d12, d10, Math.sin(nextInt) * d11);
            h11Var3.f26643f = 1.0f;
            h11Var3.h = 0.0f;
            if (this.f26982b) {
                h11Var3.f26644g = secureRandom.nextInt(200) + 600;
                h11Var3.e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                h11Var3.f26644g = secureRandom.nextInt(100) + 400;
                h11Var3.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(h11Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f26984f = z10;
        this.f26985g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f26981a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            h11 h11Var4 = (h11) arrayList.get(i13);
            float f12 = h11Var4.h;
            float f13 = h11Var4.f26644g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(h11Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                h11Var4.f26643f = 1.0f - org.telegram.messenger.i0.F.getInterpolation(f12 / f13);
                float f14 = h11Var4.f26640a;
                float f15 = h11Var4.f26642c;
                float f16 = h11Var4.e;
                float f17 = (float) min;
                h11Var4.f26640a = a1.g.A(f15 * f16, f17, 200.0f, f14);
                h11Var4.f26641b = (((h11Var4.d * f16) * f17) / 200.0f) + h11Var4.f26641b;
                h11Var4.h += f17;
            }
            i13++;
        }
        this.f26981a = elapsedRealtime;
    }

    public i11(int i10) {
        this.f26983c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
