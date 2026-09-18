package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m21 {
    public long f26290a;
    public boolean f26291b;
    public final ArrayList f26292c;
    public final ArrayList d;
    public final int e;
    public boolean f26293f;
    public float f26294g;
    public float h;

    public m21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        l21 l21Var;
        ArrayList arrayList = this.f26292c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            l21 l21Var2 = (l21) arrayList.get(i11);
            paint.setAlpha((int) (l21Var2.f25999f * 255.0f * f10));
            canvas.drawPoint(l21Var2.f25996a, l21Var2.f25997b, paint);
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
                l21Var = (l21) arrayList2.get(i10);
            } else {
                l21Var = new Object();
            }
            if (this.f26291b && this.f26293f) {
                float f11 = (i12 + 1) / clamp;
                l21Var.f25996a = AndroidUtilities.lerp(this.f26294g, centerX, f11);
                l21Var.f25997b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                l21Var.f25996a = centerX;
                l21Var.f25997b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            l21Var.f25998c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            l21 l21Var3 = l21Var;
            l21Var3.d = (float) org.telegram.messenger.q.a(nextInt, d10, Math.sin(nextInt) * d11);
            l21Var3.f25999f = 1.0f;
            l21Var3.h = 0.0f;
            if (this.f26291b) {
                l21Var3.f26000g = Utilities.random.nextInt(200) + 600;
                l21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                l21Var3.f26000g = Utilities.random.nextInt(100) + 400;
                l21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(l21Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f26293f = true;
        this.f26294g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f26290a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            l21 l21Var4 = (l21) arrayList.get(i13);
            float f12 = l21Var4.h;
            float f13 = l21Var4.f26000g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(l21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                l21Var4.f25999f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = l21Var4.f25996a;
                float f15 = l21Var4.f25998c;
                float f16 = l21Var4.e;
                float f17 = (float) min;
                l21Var4.f25996a = a4.a.A(f15 * f16, f17, 200.0f, f14);
                l21Var4.f25997b = (((l21Var4.d * f16) * f17) / 200.0f) + l21Var4.f25997b;
                l21Var4.h += f17;
            }
            i13++;
        }
        this.f26290a = elapsedRealtime;
    }

    public m21(int i10) {
        this.f26292c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
