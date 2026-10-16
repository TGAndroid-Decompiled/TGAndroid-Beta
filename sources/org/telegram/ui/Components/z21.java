package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z21 {
    public long f31433a;
    public boolean f31434b;
    public final ArrayList f31435c;
    public final ArrayList d;
    public final int e;
    public boolean f31436f;
    public float f31437g;
    public float h;

    public z21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        y21 y21Var;
        ArrayList arrayList = this.f31435c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            y21 y21Var2 = (y21) arrayList.get(i11);
            paint.setAlpha((int) (y21Var2.f31123f * 255.0f * f10));
            canvas.drawPoint(y21Var2.f31120a, y21Var2.f31121b, paint);
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
                y21Var = (y21) arrayList2.get(i10);
            } else {
                y21Var = new Object();
            }
            if (this.f31434b && this.f31436f) {
                float f11 = (i12 + 1) / clamp;
                y21Var.f31120a = AndroidUtilities.lerp(this.f31437g, centerX, f11);
                y21Var.f31121b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                y21Var.f31120a = centerX;
                y21Var.f31121b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            y21Var.f31122c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            y21 y21Var3 = y21Var;
            y21Var3.d = (float) i2.d.f(nextInt, d10, Math.sin(nextInt) * d11);
            y21Var3.f31123f = 1.0f;
            y21Var3.h = 0.0f;
            if (this.f31434b) {
                y21Var3.f31124g = Utilities.random.nextInt(200) + 600;
                y21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                y21Var3.f31124g = Utilities.random.nextInt(100) + 400;
                y21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(y21Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f31436f = z10;
        this.f31437g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f31433a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            y21 y21Var4 = (y21) arrayList.get(i13);
            float f12 = y21Var4.h;
            float f13 = y21Var4.f31124g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(y21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                y21Var4.f31123f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = y21Var4.f31120a;
                float f15 = y21Var4.f31122c;
                float f16 = y21Var4.e;
                float f17 = (float) min;
                y21Var4.f31120a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                y21Var4.f31121b = (((y21Var4.d * f16) * f17) / 200.0f) + y21Var4.f31121b;
                y21Var4.h += f17;
            }
            i13++;
        }
        this.f31433a = elapsedRealtime;
    }

    public z21(int i10) {
        this.f31435c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
