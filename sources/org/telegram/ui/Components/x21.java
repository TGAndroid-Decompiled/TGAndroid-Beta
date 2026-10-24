package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class x21 {
    public long f32494a;
    public boolean f32495b;
    public final ArrayList f32496c;
    public final ArrayList d;
    public final int e;
    public boolean f32497f;
    public float f32498g;
    public float h;

    public x21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        w21 w21Var;
        ArrayList arrayList = this.f32496c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            w21 w21Var2 = (w21) arrayList.get(i11);
            paint.setAlpha((int) (w21Var2.f32121f * 255.0f * f10));
            canvas.drawPoint(w21Var2.f32118a, w21Var2.f32119b, paint);
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
                w21Var = (w21) arrayList2.get(i10);
            } else {
                w21Var = new Object();
            }
            if (this.f32495b && this.f32497f) {
                float f11 = (i12 + 1) / clamp;
                w21Var.f32118a = AndroidUtilities.lerp(this.f32498g, centerX, f11);
                w21Var.f32119b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                w21Var.f32118a = centerX;
                w21Var.f32119b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            w21Var.f32120c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            w21 w21Var3 = w21Var;
            w21Var3.d = (float) i2.o1.f(nextInt, d10, Math.sin(nextInt) * d11);
            w21Var3.f32121f = 1.0f;
            w21Var3.h = 0.0f;
            if (this.f32495b) {
                w21Var3.f32122g = Utilities.random.nextInt(200) + 600;
                w21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                w21Var3.f32122g = Utilities.random.nextInt(100) + 400;
                w21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(w21Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f32497f = z10;
        this.f32498g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f32494a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            w21 w21Var4 = (w21) arrayList.get(i13);
            float f12 = w21Var4.h;
            float f13 = w21Var4.f32122g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(w21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                w21Var4.f32121f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = w21Var4.f32118a;
                float f15 = w21Var4.f32120c;
                float f16 = w21Var4.e;
                float f17 = (float) min;
                w21Var4.f32118a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                w21Var4.f32119b = (((w21Var4.d * f16) * f17) / 200.0f) + w21Var4.f32119b;
                w21Var4.h += f17;
            }
            i13++;
        }
        this.f32494a = elapsedRealtime;
    }

    public x21(int i10) {
        this.f32496c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
