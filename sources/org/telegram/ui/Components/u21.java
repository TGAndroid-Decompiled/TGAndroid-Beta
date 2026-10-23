package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u21 {
    public long f30827a;
    public boolean f30828b;
    public final ArrayList f30829c;
    public final ArrayList d;
    public final int e;
    public boolean f30830f;
    public float f30831g;
    public float h;

    public u21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        t21 t21Var;
        ArrayList arrayList = this.f30829c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            t21 t21Var2 = (t21) arrayList.get(i11);
            paint.setAlpha((int) (t21Var2.f30428f * 255.0f * f10));
            canvas.drawPoint(t21Var2.f30425a, t21Var2.f30426b, paint);
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
                t21Var = (t21) arrayList2.get(i10);
            } else {
                t21Var = new Object();
            }
            if (this.f30828b && this.f30830f) {
                float f11 = (i12 + 1) / clamp;
                t21Var.f30425a = AndroidUtilities.lerp(this.f30831g, centerX, f11);
                t21Var.f30426b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                t21Var.f30425a = centerX;
                t21Var.f30426b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            t21Var.f30427c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            t21 t21Var3 = t21Var;
            t21Var3.d = (float) i2.e.f(nextInt, d10, Math.sin(nextInt) * d11);
            t21Var3.f30428f = 1.0f;
            t21Var3.h = 0.0f;
            if (this.f30828b) {
                t21Var3.f30429g = Utilities.random.nextInt(200) + 600;
                t21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                t21Var3.f30429g = Utilities.random.nextInt(100) + 400;
                t21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(t21Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f30830f = z10;
        this.f30831g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f30827a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            t21 t21Var4 = (t21) arrayList.get(i13);
            float f12 = t21Var4.h;
            float f13 = t21Var4.f30429g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(t21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                t21Var4.f30428f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = t21Var4.f30425a;
                float f15 = t21Var4.f30427c;
                float f16 = t21Var4.e;
                float f17 = (float) min;
                t21Var4.f30425a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                t21Var4.f30426b = (((t21Var4.d * f16) * f17) / 200.0f) + t21Var4.f30426b;
                t21Var4.h += f17;
            }
            i13++;
        }
        this.f30827a = elapsedRealtime;
    }

    public u21(int i10) {
        this.f30829c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
