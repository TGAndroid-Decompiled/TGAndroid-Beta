package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class c01 {
    public long f32407a;
    public boolean f32408b;
    public final ArrayList f32409c;
    public final ArrayList d;
    public final int f32410e;
    public boolean f32411f;
    public float f32412g;
    public float h;

    public c01() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        b01 b01Var;
        ArrayList arrayList = this.f32409c;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            b01 b01Var2 = (b01) arrayList.get(i10);
            paint.setAlpha((int) (b01Var2.f32072f * 255.0f * f11));
            canvas.drawPoint(b01Var2.f32068a, b01Var2.f32069b, paint);
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
                b01Var = (b01) arrayList2.get(i7);
            } else {
                b01Var = new Object();
            }
            if (this.f32408b && this.f32411f) {
                float f12 = (i11 + 1) / j3;
                b01Var.f32068a = org.telegram.messenger.g0.T1(this.f32412g, centerX, f12);
                b01Var.f32069b = org.telegram.messenger.g0.T1(this.h, centerY, f12);
            } else {
                b01Var.f32068a = centerX;
                b01Var.f32069b = centerY;
            }
            SecureRandom secureRandom = Utilities.f21339b;
            double d10 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            b01Var.f32070c = (float) ((Math.cos(nextInt) * d10) - (Math.sin(nextInt) * d2));
            double d11 = nextInt;
            b01 b01Var3 = b01Var;
            b01Var3.d = (float) jg.g.d(d11, d2, Math.sin(nextInt) * d10);
            b01Var3.f32072f = 1.0f;
            b01Var3.h = 0.0f;
            if (this.f32408b) {
                b01Var3.f32073g = secureRandom.nextInt(200) + 600;
                b01Var3.f32071e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                b01Var3.f32073g = secureRandom.nextInt(100) + 400;
                b01Var3.f32071e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(b01Var3);
            i11++;
            sin = d10;
            i7 = 0;
            z9 = true;
        }
        this.f32411f = z9;
        this.f32412g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f32407a);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            b01 b01Var4 = (b01) arrayList.get(i12);
            float f13 = b01Var4.h;
            float f14 = b01Var4.f32073g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f32410e) {
                    arrayList2.add(b01Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                b01Var4.f32072f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f13 / f14);
                float f15 = b01Var4.f32068a;
                float f16 = b01Var4.f32070c;
                float f17 = b01Var4.f32071e;
                float f18 = (float) min;
                b01Var4.f32068a = a8.p0.f(f16 * f17, f18, 200.0f, f15);
                b01Var4.f32069b = (((b01Var4.d * f17) * f18) / 200.0f) + b01Var4.f32069b;
                b01Var4.h += f18;
            }
            i12++;
        }
        this.f32407a = elapsedRealtime;
    }

    public c01(int i7) {
        this.f32409c = new ArrayList();
        this.d = new ArrayList();
        this.f32410e = i7;
        for (int i10 = 0; i10 < i7; i10++) {
            this.d.add(new Object());
        }
    }
}
