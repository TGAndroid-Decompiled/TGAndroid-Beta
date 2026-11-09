package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d01 {
    public long f32816a;
    public boolean f32817b;
    public final ArrayList f32818c;
    public final ArrayList d;
    public final int f32819e;
    public boolean f32820f;
    public float f32821g;
    public float h;

    public d01() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        c01 c01Var;
        ArrayList arrayList = this.f32818c;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c01 c01Var2 = (c01) arrayList.get(i10);
            paint.setAlpha((int) (c01Var2.f32480f * 255.0f * f11));
            canvas.drawPoint(c01Var2.f32476a, c01Var2.f32477b, paint);
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
                c01Var = (c01) arrayList2.get(i7);
            } else {
                c01Var = new Object();
            }
            if (this.f32817b && this.f32820f) {
                float f12 = (i11 + 1) / j3;
                c01Var.f32476a = org.telegram.messenger.g0.T1(this.f32821g, centerX, f12);
                c01Var.f32477b = org.telegram.messenger.g0.T1(this.h, centerY, f12);
            } else {
                c01Var.f32476a = centerX;
                c01Var.f32477b = centerY;
            }
            SecureRandom secureRandom = Utilities.f21334b;
            double d10 = sin;
            double nextInt = (secureRandom.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            c01Var.f32478c = (float) ((Math.cos(nextInt) * d10) - (Math.sin(nextInt) * d2));
            double d11 = nextInt;
            c01 c01Var3 = c01Var;
            c01Var3.d = (float) jg.g.d(d11, d2, Math.sin(nextInt) * d10);
            c01Var3.f32480f = 1.0f;
            c01Var3.h = 0.0f;
            if (this.f32817b) {
                c01Var3.f32481g = secureRandom.nextInt(200) + 600;
                c01Var3.f32479e = (secureRandom.nextFloat() * 20.0f) + 30.0f;
            } else {
                c01Var3.f32481g = secureRandom.nextInt(100) + 400;
                c01Var3.f32479e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(c01Var3);
            i11++;
            sin = d10;
            i7 = 0;
            z9 = true;
        }
        this.f32820f = z9;
        this.f32821g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f32816a);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            c01 c01Var4 = (c01) arrayList.get(i12);
            float f13 = c01Var4.h;
            float f14 = c01Var4.f32481g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f32819e) {
                    arrayList2.add(c01Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                c01Var4.f32480f = 1.0f - org.telegram.messenger.g0.F.getInterpolation(f13 / f14);
                float f15 = c01Var4.f32476a;
                float f16 = c01Var4.f32478c;
                float f17 = c01Var4.f32479e;
                float f18 = (float) min;
                c01Var4.f32476a = a8.p0.f(f16 * f17, f18, 200.0f, f15);
                c01Var4.f32477b = (((c01Var4.d * f17) * f18) / 200.0f) + c01Var4.f32477b;
                c01Var4.h += f18;
            }
            i12++;
        }
        this.f32816a = elapsedRealtime;
    }

    public d01(int i7) {
        this.f32818c = new ArrayList();
        this.d = new ArrayList();
        this.f32819e = i7;
        for (int i10 = 0; i10 < i7; i10++) {
            this.d.add(new Object());
        }
    }
}
