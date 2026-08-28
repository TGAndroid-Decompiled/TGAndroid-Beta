package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class d11 {
    public long f27628a;
    public boolean f27629b;
    public final ArrayList f27630c;
    public final ArrayList d;
    public final int f27631e;
    public boolean f27632f;
    public float f27633g;
    public float h;

    public d11() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        c11 c11Var;
        ArrayList arrayList = this.f27630c;
        int size = arrayList.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c11 c11Var2 = (c11) arrayList.get(i10);
            paint.setAlpha((int) (c11Var2.f27340f * 255.0f * f11));
            canvas.drawPoint(c11Var2.f27336a, c11Var2.f27337b, paint);
        }
        double d = (f10 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d9 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d9) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        int clamp = Utilities.clamp(arrayList2.size() / 12, 3, 1);
        int i11 = 0;
        while (i11 < clamp) {
            if (!arrayList2.isEmpty()) {
                arrayList2.remove(i9);
                c11Var = (c11) arrayList2.get(i9);
            } else {
                c11Var = new Object();
            }
            if (this.f27629b && this.f27632f) {
                float f12 = (i11 + 1) / clamp;
                c11Var.f27336a = AndroidUtilities.lerp(this.f27633g, centerX, f12);
                c11Var.f27337b = AndroidUtilities.lerp(this.h, centerY, f12);
            } else {
                c11Var.f27336a = centerX;
                c11Var.f27337b = centerY;
            }
            double d10 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            c11Var.f27338c = (float) ((Math.cos(nextInt) * d10) - (Math.sin(nextInt) * d9));
            c11 c11Var3 = c11Var;
            c11Var3.d = (float) j3.r0.b(nextInt, d9, Math.sin(nextInt) * d10);
            c11Var3.f27340f = 1.0f;
            c11Var3.h = 0.0f;
            if (this.f27629b) {
                c11Var3.f27341g = Utilities.random.nextInt(200) + 600;
                c11Var3.f27339e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                c11Var3.f27341g = Utilities.random.nextInt(100) + 400;
                c11Var3.f27339e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(c11Var3);
            i11++;
            sin = d10;
            i9 = 0;
        }
        this.f27632f = true;
        this.f27633g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f27628a);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            c11 c11Var4 = (c11) arrayList.get(i12);
            float f13 = c11Var4.h;
            float f14 = c11Var4.f27341g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f27631e) {
                    arrayList2.add(c11Var4);
                }
                arrayList.remove(i12);
                i12--;
                size2--;
            } else {
                c11Var4.f27340f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f13 / f14);
                float f15 = c11Var4.f27336a;
                float f16 = c11Var4.f27338c;
                float f17 = c11Var4.f27339e;
                float f18 = (float) min;
                c11Var4.f27336a = aa.d.d(f16 * f17, f18, 200.0f, f15);
                c11Var4.f27337b = (((c11Var4.d * f17) * f18) / 200.0f) + c11Var4.f27337b;
                c11Var4.h += f18;
            }
            i12++;
        }
        this.f27628a = elapsedRealtime;
    }

    public d11(int i9) {
        this.f27630c = new ArrayList();
        this.d = new ArrayList();
        this.f27631e = i9;
        for (int i10 = 0; i10 < i9; i10++) {
            this.d.add(new Object());
        }
    }
}
