package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h31 {
    public long f28847a;
    public boolean f28848b;
    public final ArrayList f28849c;
    public final ArrayList d;
    public final int e;
    public boolean f28850f;
    public float f28851g;
    public float h;

    public h31() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        g31 g31Var;
        ArrayList arrayList = this.f28849c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            g31 g31Var2 = (g31) arrayList.get(i11);
            paint.setAlpha((int) (g31Var2.f28372f * 255.0f * f10));
            canvas.drawPoint(g31Var2.f28369a, g31Var2.f28370b, paint);
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
                g31Var = (g31) arrayList2.get(i10);
            } else {
                g31Var = new Object();
            }
            if (this.f28848b && this.f28850f) {
                float f11 = (i12 + 1) / clamp;
                g31Var.f28369a = AndroidUtilities.lerp(this.f28851g, centerX, f11);
                g31Var.f28370b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                g31Var.f28369a = centerX;
                g31Var.f28370b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            g31Var.f28371c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            g31 g31Var3 = g31Var;
            g31Var3.d = (float) org.telegram.messenger.t.a(nextInt, d10, Math.sin(nextInt) * d11);
            g31Var3.f28372f = 1.0f;
            g31Var3.h = 0.0f;
            if (this.f28848b) {
                g31Var3.f28373g = Utilities.random.nextInt(200) + 600;
                g31Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                g31Var3.f28373g = Utilities.random.nextInt(100) + 400;
                g31Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(g31Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f28850f = z10;
        this.f28851g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f28847a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            g31 g31Var4 = (g31) arrayList.get(i13);
            float f12 = g31Var4.h;
            float f13 = g31Var4.f28373g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(g31Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                g31Var4.f28372f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = g31Var4.f28369a;
                float f15 = g31Var4.f28371c;
                float f16 = g31Var4.e;
                float f17 = (float) min;
                g31Var4.f28369a = a1.g.C(f15 * f16, f17, 200.0f, f14);
                g31Var4.f28370b = (((g31Var4.d * f16) * f17) / 200.0f) + g31Var4.f28370b;
                g31Var4.h += f17;
            }
            i13++;
        }
        this.f28847a = elapsedRealtime;
    }

    public h31(int i10) {
        this.f28849c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
