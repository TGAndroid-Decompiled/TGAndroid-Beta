package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v21 {
    public long f31519a;
    public boolean f31520b;
    public final ArrayList f31521c;
    public final ArrayList d;
    public final int f31522e;
    public boolean f31523f;
    public float f31524g;
    public float h;

    public v21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        u21 u21Var;
        ArrayList arrayList = this.f31521c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            u21 u21Var2 = (u21) arrayList.get(i11);
            paint.setAlpha((int) (u21Var2.f31264f * 255.0f * f10));
            canvas.drawPoint(u21Var2.f31260a, u21Var2.f31261b, paint);
        }
        double d = (f7 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d10 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d10) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        int clamp = Utilities.clamp(arrayList2.size() / 12, 3, 1);
        int i12 = 0;
        while (i12 < clamp) {
            if (!arrayList2.isEmpty()) {
                arrayList2.remove(i10);
                u21Var = (u21) arrayList2.get(i10);
            } else {
                u21Var = new Object();
            }
            if (this.f31520b && this.f31523f) {
                float f11 = (i12 + 1) / clamp;
                u21Var.f31260a = AndroidUtilities.lerp(this.f31524g, centerX, f11);
                u21Var.f31261b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                u21Var.f31260a = centerX;
                u21Var.f31261b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            u21Var.f31262c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            u21 u21Var3 = u21Var;
            u21Var3.d = (float) hg.k0.e(nextInt, d10, Math.sin(nextInt) * d11);
            u21Var3.f31264f = 1.0f;
            u21Var3.h = 0.0f;
            if (this.f31520b) {
                u21Var3.f31265g = Utilities.random.nextInt(200) + 600;
                u21Var3.f31263e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                u21Var3.f31265g = Utilities.random.nextInt(100) + 400;
                u21Var3.f31263e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(u21Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f31523f = true;
        this.f31524g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f31519a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            u21 u21Var4 = (u21) arrayList.get(i13);
            float f12 = u21Var4.h;
            float f13 = u21Var4.f31265g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.f31522e) {
                    arrayList2.add(u21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                u21Var4.f31264f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = u21Var4.f31260a;
                float f15 = u21Var4.f31262c;
                float f16 = u21Var4.f31263e;
                float f17 = (float) min;
                u21Var4.f31260a = a4.a.A(f15 * f16, f17, 200.0f, f14);
                u21Var4.f31261b = (((u21Var4.d * f16) * f17) / 200.0f) + u21Var4.f31261b;
                u21Var4.h += f17;
            }
            i13++;
        }
        this.f31519a = elapsedRealtime;
    }

    public v21(int i10) {
        this.f31521c = new ArrayList();
        this.d = new ArrayList();
        this.f31522e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
