package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class d31 {
    public long f25597a;
    public boolean f25598b;
    public final ArrayList f25599c;
    public final ArrayList d;
    public final int f25600e;
    public boolean f25601f;
    public float f25602g;
    public float h;

    public d31() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        c31 c31Var;
        ArrayList arrayList = this.f25599c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c31 c31Var2 = (c31) arrayList.get(i11);
            paint.setAlpha((int) (c31Var2.f25209f * 255.0f * f10));
            canvas.drawPoint(c31Var2.f25205a, c31Var2.f25206b, paint);
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
                c31Var = (c31) arrayList2.get(i10);
            } else {
                c31Var = new Object();
            }
            if (this.f25598b && this.f25601f) {
                float f11 = (i12 + 1) / clamp;
                c31Var.f25205a = AndroidUtilities.lerp(this.f25602g, centerX, f11);
                c31Var.f25206b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                c31Var.f25205a = centerX;
                c31Var.f25206b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            c31Var.f25207c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            c31 c31Var3 = c31Var;
            c31Var3.d = (float) hg.c.e(nextInt, d10, Math.sin(nextInt) * d11);
            c31Var3.f25209f = 1.0f;
            c31Var3.h = 0.0f;
            if (this.f25598b) {
                c31Var3.f25210g = Utilities.random.nextInt(200) + 600;
                c31Var3.f25208e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                c31Var3.f25210g = Utilities.random.nextInt(100) + 400;
                c31Var3.f25208e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(c31Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f25601f = z10;
        this.f25602g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f25597a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            c31 c31Var4 = (c31) arrayList.get(i13);
            float f12 = c31Var4.h;
            float f13 = c31Var4.f25210g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.f25600e) {
                    arrayList2.add(c31Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                c31Var4.f25209f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = c31Var4.f25205a;
                float f15 = c31Var4.f25207c;
                float f16 = c31Var4.f25208e;
                float f17 = (float) min;
                c31Var4.f25205a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                c31Var4.f25206b = (((c31Var4.d * f16) * f17) / 200.0f) + c31Var4.f25206b;
                c31Var4.h += f17;
            }
            i13++;
        }
        this.f25597a = elapsedRealtime;
    }

    public d31(int i10) {
        this.f25599c = new ArrayList();
        this.d = new ArrayList();
        this.f25600e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
