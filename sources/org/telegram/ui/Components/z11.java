package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z11 {
    public long f33729a;
    public boolean f33730b;
    public final ArrayList f33731c;
    public final ArrayList d;
    public final int f33732e;
    public boolean f33733f;
    public float f33734g;
    public float h;

    public z11() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        y11 y11Var;
        ArrayList arrayList = this.f33731c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            y11 y11Var2 = (y11) arrayList.get(i11);
            paint.setAlpha((int) (y11Var2.f33295f * 255.0f * f11));
            canvas.drawPoint(y11Var2.f33291a, y11Var2.f33292b, paint);
        }
        double d = (f10 - 90.0f) * 0.017453292519943295d;
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
                y11Var = (y11) arrayList2.get(i10);
            } else {
                y11Var = new Object();
            }
            if (this.f33730b && this.f33733f) {
                float f12 = (i12 + 1) / clamp;
                y11Var.f33291a = AndroidUtilities.lerp(this.f33734g, centerX, f12);
                y11Var.f33292b = AndroidUtilities.lerp(this.h, centerY, f12);
            } else {
                y11Var.f33291a = centerX;
                y11Var.f33292b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            y11Var.f33293c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            y11 y11Var3 = y11Var;
            y11Var3.d = (float) l.d.a(nextInt, d10, Math.sin(nextInt) * d11);
            y11Var3.f33295f = 1.0f;
            y11Var3.h = 0.0f;
            if (this.f33730b) {
                y11Var3.f33296g = Utilities.random.nextInt(200) + 600;
                y11Var3.f33294e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                y11Var3.f33296g = Utilities.random.nextInt(100) + 400;
                y11Var3.f33294e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(y11Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f33733f = true;
        this.f33734g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f33729a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            y11 y11Var4 = (y11) arrayList.get(i13);
            float f13 = y11Var4.h;
            float f14 = y11Var4.f33296g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f33732e) {
                    arrayList2.add(y11Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                y11Var4.f33295f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f13 / f14);
                float f15 = y11Var4.f33291a;
                float f16 = y11Var4.f33293c;
                float f17 = y11Var4.f33294e;
                float f18 = (float) min;
                y11Var4.f33291a = android.support.v4.media.a.d(f16 * f17, f18, 200.0f, f15);
                y11Var4.f33292b = (((y11Var4.d * f17) * f18) / 200.0f) + y11Var4.f33292b;
                y11Var4.h += f18;
            }
            i13++;
        }
        this.f33729a = elapsedRealtime;
    }

    public z11(int i10) {
        this.f33731c = new ArrayList();
        this.d = new ArrayList();
        this.f33732e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
