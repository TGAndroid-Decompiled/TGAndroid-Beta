package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class c31 {
    public long f25221a;
    public boolean f25222b;
    public final ArrayList f25223c;
    public final ArrayList d;
    public final int f25224e;
    public boolean f25225f;
    public float f25226g;
    public float h;

    public c31() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        b31 b31Var;
        ArrayList arrayList = this.f25223c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            b31 b31Var2 = (b31) arrayList.get(i11);
            paint.setAlpha((int) (b31Var2.f24888f * 255.0f * f10));
            canvas.drawPoint(b31Var2.f24884a, b31Var2.f24885b, paint);
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
                b31Var = (b31) arrayList2.get(i10);
            } else {
                b31Var = new Object();
            }
            if (this.f25222b && this.f25225f) {
                float f11 = (i12 + 1) / clamp;
                b31Var.f24884a = AndroidUtilities.lerp(this.f25226g, centerX, f11);
                b31Var.f24885b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                b31Var.f24884a = centerX;
                b31Var.f24885b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            b31Var.f24886c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            b31 b31Var3 = b31Var;
            b31Var3.d = (float) hg.c.e(nextInt, d10, Math.sin(nextInt) * d11);
            b31Var3.f24888f = 1.0f;
            b31Var3.h = 0.0f;
            if (this.f25222b) {
                b31Var3.f24889g = Utilities.random.nextInt(200) + 600;
                b31Var3.f24887e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                b31Var3.f24889g = Utilities.random.nextInt(100) + 400;
                b31Var3.f24887e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(b31Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f25225f = z10;
        this.f25226g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f25221a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            b31 b31Var4 = (b31) arrayList.get(i13);
            float f12 = b31Var4.h;
            float f13 = b31Var4.f24889g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.f25224e) {
                    arrayList2.add(b31Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                b31Var4.f24888f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = b31Var4.f24884a;
                float f15 = b31Var4.f24886c;
                float f16 = b31Var4.f24887e;
                float f17 = (float) min;
                b31Var4.f24884a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                b31Var4.f24885b = (((b31Var4.d * f16) * f17) / 200.0f) + b31Var4.f24885b;
                b31Var4.h += f17;
            }
            i13++;
        }
        this.f25221a = elapsedRealtime;
    }

    public c31(int i10) {
        this.f25223c = new ArrayList();
        this.d = new ArrayList();
        this.f25224e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
