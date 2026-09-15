package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class x11 {
    public long f29856a;
    public boolean f29857b;
    public final ArrayList f29858c;
    public final ArrayList d;
    public final int e;
    public boolean f29859f;
    public float f29860g;
    public float h;

    public x11() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        w11 w11Var;
        ArrayList arrayList = this.f29858c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            w11 w11Var2 = (w11) arrayList.get(i11);
            paint.setAlpha((int) (w11Var2.f29539f * 255.0f * f10));
            canvas.drawPoint(w11Var2.f29536a, w11Var2.f29537b, paint);
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
                w11Var = (w11) arrayList2.get(i10);
            } else {
                w11Var = new Object();
            }
            if (this.f29857b && this.f29859f) {
                float f11 = (i12 + 1) / clamp;
                w11Var.f29536a = AndroidUtilities.lerp(this.f29860g, centerX, f11);
                w11Var.f29537b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                w11Var.f29536a = centerX;
                w11Var.f29537b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            w11Var.f29538c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            w11 w11Var3 = w11Var;
            w11Var3.d = (float) hg.k0.e(nextInt, d10, Math.sin(nextInt) * d11);
            w11Var3.f29539f = 1.0f;
            w11Var3.h = 0.0f;
            if (this.f29857b) {
                w11Var3.f29540g = Utilities.random.nextInt(200) + 600;
                w11Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                w11Var3.f29540g = Utilities.random.nextInt(100) + 400;
                w11Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(w11Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f29859f = true;
        this.f29860g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f29856a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            w11 w11Var4 = (w11) arrayList.get(i13);
            float f12 = w11Var4.h;
            float f13 = w11Var4.f29540g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(w11Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                w11Var4.f29539f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = w11Var4.f29536a;
                float f15 = w11Var4.f29538c;
                float f16 = w11Var4.e;
                float f17 = (float) min;
                w11Var4.f29536a = a4.a.A(f15 * f16, f17, 200.0f, f14);
                w11Var4.f29537b = (((w11Var4.d * f16) * f17) / 200.0f) + w11Var4.f29537b;
                w11Var4.h += f17;
            }
            i13++;
        }
        this.f29856a = elapsedRealtime;
    }

    public x11(int i10) {
        this.f29858c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
