package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s21 {
    public long f30170a;
    public boolean f30171b;
    public final ArrayList f30172c;
    public final ArrayList d;
    public final int e;
    public boolean f30173f;
    public float f30174g;
    public float h;

    public s21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        r21 r21Var;
        ArrayList arrayList = this.f30172c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            r21 r21Var2 = (r21) arrayList.get(i11);
            paint.setAlpha((int) (r21Var2.f29806f * 255.0f * f10));
            canvas.drawPoint(r21Var2.f29803a, r21Var2.f29804b, paint);
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
                r21Var = (r21) arrayList2.get(i10);
            } else {
                r21Var = new Object();
            }
            if (this.f30171b && this.f30173f) {
                float f11 = (i12 + 1) / clamp;
                r21Var.f29803a = AndroidUtilities.lerp(this.f30174g, centerX, f11);
                r21Var.f29804b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                r21Var.f29803a = centerX;
                r21Var.f29804b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            r21Var.f29805c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            r21 r21Var3 = r21Var;
            r21Var3.d = (float) i2.d.f(nextInt, d10, Math.sin(nextInt) * d11);
            r21Var3.f29806f = 1.0f;
            r21Var3.h = 0.0f;
            if (this.f30171b) {
                r21Var3.f29807g = Utilities.random.nextInt(200) + 600;
                r21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                r21Var3.f29807g = Utilities.random.nextInt(100) + 400;
                r21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(r21Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f30173f = z10;
        this.f30174g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f30170a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            r21 r21Var4 = (r21) arrayList.get(i13);
            float f12 = r21Var4.h;
            float f13 = r21Var4.f29807g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(r21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                r21Var4.f29806f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = r21Var4.f29803a;
                float f15 = r21Var4.f29805c;
                float f16 = r21Var4.e;
                float f17 = (float) min;
                r21Var4.f29803a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                r21Var4.f29804b = (((r21Var4.d * f16) * f17) / 200.0f) + r21Var4.f29804b;
                r21Var4.h += f17;
            }
            i13++;
        }
        this.f30170a = elapsedRealtime;
    }

    public s21(int i10) {
        this.f30172c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
