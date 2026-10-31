package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class h11 {
    public long f26593a;
    public boolean f26594b;
    public final ArrayList f26595c;
    public final ArrayList d;
    public final int e;
    public boolean f26596f;
    public float f26597g;
    public float h;

    public h11() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        g11 g11Var;
        ArrayList arrayList = this.f26595c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            g11 g11Var2 = (g11) arrayList.get(i11);
            paint.setAlpha((int) (g11Var2.f26220f * 255.0f * f10));
            canvas.drawPoint(g11Var2.f26217a, g11Var2.f26218b, paint);
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
                g11Var = (g11) arrayList2.get(i10);
            } else {
                g11Var = new Object();
            }
            if (this.f26594b && this.f26596f) {
                float f11 = (i12 + 1) / j10;
                g11Var.f26217a = org.telegram.messenger.i0.T1(this.f26597g, centerX, f11);
                g11Var.f26218b = org.telegram.messenger.i0.T1(this.h, centerY, f11);
            } else {
                g11Var.f26217a = centerX;
                g11Var.f26218b = centerY;
            }
            SecureRandom secureRandom = Utilities.f14519b;
            double d11 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            g11Var.f26219c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            double d12 = nextInt;
            g11 g11Var3 = g11Var;
            g11Var3.d = (float) i0.a.c(d12, d10, Math.sin(nextInt) * d11);
            g11Var3.f26220f = 1.0f;
            g11Var3.h = 0.0f;
            if (this.f26594b) {
                g11Var3.f26221g = secureRandom.nextInt(200) + 600;
                g11Var3.e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                g11Var3.f26221g = secureRandom.nextInt(100) + 400;
                g11Var3.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(g11Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f26596f = z10;
        this.f26597g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f26593a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            g11 g11Var4 = (g11) arrayList.get(i13);
            float f12 = g11Var4.h;
            float f13 = g11Var4.f26221g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(g11Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                g11Var4.f26220f = 1.0f - org.telegram.messenger.i0.F.getInterpolation(f12 / f13);
                float f14 = g11Var4.f26217a;
                float f15 = g11Var4.f26219c;
                float f16 = g11Var4.e;
                float f17 = (float) min;
                g11Var4.f26217a = a1.g.A(f15 * f16, f17, 200.0f, f14);
                g11Var4.f26218b = (((g11Var4.d * f16) * f17) / 200.0f) + g11Var4.f26218b;
                g11Var4.h += f17;
            }
            i13++;
        }
        this.f26593a = elapsedRealtime;
    }

    public h11(int i10) {
        this.f26595c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
