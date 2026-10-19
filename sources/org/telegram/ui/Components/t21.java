package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t21 {
    public long f30409a;
    public boolean f30410b;
    public final ArrayList f30411c;
    public final ArrayList d;
    public final int e;
    public boolean f30412f;
    public float f30413g;
    public float h;

    public t21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        s21 s21Var;
        ArrayList arrayList = this.f30411c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            s21 s21Var2 = (s21) arrayList.get(i11);
            paint.setAlpha((int) (s21Var2.f30157f * 255.0f * f10));
            canvas.drawPoint(s21Var2.f30154a, s21Var2.f30155b, paint);
        }
        double d = (f7 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d10 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d10) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        boolean z10 = true;
        int clamp = Utilities.clamp(arrayList2.size() / 12, 3, 1);
        int i12 = 0;
        while (i12 < clamp) {
            if (!arrayList2.isEmpty()) {
                arrayList2.remove(i10);
                s21Var = (s21) arrayList2.get(i10);
            } else {
                s21Var = new Object();
            }
            if (this.f30410b && this.f30412f) {
                float f11 = (i12 + 1) / clamp;
                s21Var.f30154a = AndroidUtilities.lerp(this.f30413g, centerX, f11);
                s21Var.f30155b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                s21Var.f30154a = centerX;
                s21Var.f30155b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            s21Var.f30156c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            s21 s21Var3 = s21Var;
            s21Var3.d = (float) i2.e.f(nextInt, d10, Math.sin(nextInt) * d11);
            s21Var3.f30157f = 1.0f;
            s21Var3.h = 0.0f;
            if (this.f30410b) {
                s21Var3.f30158g = Utilities.random.nextInt(200) + 600;
                s21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                s21Var3.f30158g = Utilities.random.nextInt(100) + 400;
                s21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(s21Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f30412f = z10;
        this.f30413g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f30409a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            s21 s21Var4 = (s21) arrayList.get(i13);
            float f12 = s21Var4.h;
            float f13 = s21Var4.f30158g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(s21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                s21Var4.f30157f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = s21Var4.f30154a;
                float f15 = s21Var4.f30156c;
                float f16 = s21Var4.e;
                float f17 = (float) min;
                s21Var4.f30154a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                s21Var4.f30155b = (((s21Var4.d * f16) * f17) / 200.0f) + s21Var4.f30155b;
                s21Var4.h += f17;
            }
            i13++;
        }
        this.f30409a = elapsedRealtime;
    }

    public t21(int i10) {
        this.f30411c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
