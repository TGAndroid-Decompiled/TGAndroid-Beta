package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e31 {
    public long f25817a;
    public boolean f25818b;
    public final ArrayList f25819c;
    public final ArrayList d;
    public final int f25820e;
    public boolean f25821f;
    public float f25822g;
    public float h;

    public e31() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        d31 d31Var;
        ArrayList arrayList = this.f25819c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            d31 d31Var2 = (d31) arrayList.get(i11);
            paint.setAlpha((int) (d31Var2.f25424f * 255.0f * f10));
            canvas.drawPoint(d31Var2.f25420a, d31Var2.f25421b, paint);
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
                d31Var = (d31) arrayList2.get(i10);
            } else {
                d31Var = new Object();
            }
            if (this.f25818b && this.f25821f) {
                float f11 = (i12 + 1) / clamp;
                d31Var.f25420a = AndroidUtilities.lerp(this.f25822g, centerX, f11);
                d31Var.f25421b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                d31Var.f25420a = centerX;
                d31Var.f25421b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            d31Var.f25422c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            d31 d31Var3 = d31Var;
            d31Var3.d = (float) hg.c.e(nextInt, d10, Math.sin(nextInt) * d11);
            d31Var3.f25424f = 1.0f;
            d31Var3.h = 0.0f;
            if (this.f25818b) {
                d31Var3.f25425g = Utilities.random.nextInt(200) + 600;
                d31Var3.f25423e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                d31Var3.f25425g = Utilities.random.nextInt(100) + 400;
                d31Var3.f25423e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(d31Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f25821f = z10;
        this.f25822g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f25817a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            d31 d31Var4 = (d31) arrayList.get(i13);
            float f12 = d31Var4.h;
            float f13 = d31Var4.f25425g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.f25820e) {
                    arrayList2.add(d31Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                d31Var4.f25424f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = d31Var4.f25420a;
                float f15 = d31Var4.f25422c;
                float f16 = d31Var4.f25423e;
                float f17 = (float) min;
                d31Var4.f25420a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                d31Var4.f25421b = (((d31Var4.d * f16) * f17) / 200.0f) + d31Var4.f25421b;
                d31Var4.h += f17;
            }
            i13++;
        }
        this.f25817a = elapsedRealtime;
    }

    public e31(int i10) {
        this.f25819c = new ArrayList();
        this.d = new ArrayList();
        this.f25820e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
