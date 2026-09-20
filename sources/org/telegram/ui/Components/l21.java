package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l21 {
    public long f26000a;
    public boolean f26001b;
    public final ArrayList f26002c;
    public final ArrayList d;
    public final int e;
    public boolean f26003f;
    public float f26004g;
    public float h;

    public l21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        k21 k21Var;
        ArrayList arrayList = this.f26002c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            k21 k21Var2 = (k21) arrayList.get(i11);
            paint.setAlpha((int) (k21Var2.f25642f * 255.0f * f10));
            canvas.drawPoint(k21Var2.f25639a, k21Var2.f25640b, paint);
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
                k21Var = (k21) arrayList2.get(i10);
            } else {
                k21Var = new Object();
            }
            if (this.f26001b && this.f26003f) {
                float f11 = (i12 + 1) / clamp;
                k21Var.f25639a = AndroidUtilities.lerp(this.f26004g, centerX, f11);
                k21Var.f25640b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                k21Var.f25639a = centerX;
                k21Var.f25640b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            k21Var.f25641c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            k21 k21Var3 = k21Var;
            k21Var3.d = (float) hg.k0.e(nextInt, d10, Math.sin(nextInt) * d11);
            k21Var3.f25642f = 1.0f;
            k21Var3.h = 0.0f;
            if (this.f26001b) {
                k21Var3.f25643g = Utilities.random.nextInt(200) + 600;
                k21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                k21Var3.f25643g = Utilities.random.nextInt(100) + 400;
                k21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(k21Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f26003f = true;
        this.f26004g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f26000a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            k21 k21Var4 = (k21) arrayList.get(i13);
            float f12 = k21Var4.h;
            float f13 = k21Var4.f25643g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(k21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                k21Var4.f25642f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = k21Var4.f25639a;
                float f15 = k21Var4.f25641c;
                float f16 = k21Var4.e;
                float f17 = (float) min;
                k21Var4.f25639a = a4.a.A(f15 * f16, f17, 200.0f, f14);
                k21Var4.f25640b = (((k21Var4.d * f16) * f17) / 200.0f) + k21Var4.f25640b;
                k21Var4.h += f17;
            }
            i13++;
        }
        this.f26000a = elapsedRealtime;
    }

    public l21(int i10) {
        this.f26002c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
