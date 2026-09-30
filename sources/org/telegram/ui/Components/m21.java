package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m21 {
    public long f26258a;
    public boolean f26259b;
    public final ArrayList f26260c;
    public final ArrayList d;
    public final int e;
    public boolean f26261f;
    public float f26262g;
    public float h;

    public m21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        l21 l21Var;
        ArrayList arrayList = this.f26260c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            l21 l21Var2 = (l21) arrayList.get(i11);
            paint.setAlpha((int) (l21Var2.f25884f * 255.0f * f10));
            canvas.drawPoint(l21Var2.f25881a, l21Var2.f25882b, paint);
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
            if (this.f26259b && this.f26261f) {
                float f11 = (i12 + 1) / clamp;
                l21Var.f25881a = AndroidUtilities.lerp(this.f26262g, centerX, f11);
                l21Var.f25882b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                l21Var.f25881a = centerX;
                l21Var.f25882b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            l21Var.f25883c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            l21 l21Var3 = l21Var;
            l21Var3.d = (float) hg.c.e(nextInt, d10, Math.sin(nextInt) * d11);
            l21Var3.f25884f = 1.0f;
            l21Var3.h = 0.0f;
            if (this.f26259b) {
                l21Var3.f25885g = Utilities.random.nextInt(200) + 600;
                l21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                l21Var3.f25885g = Utilities.random.nextInt(100) + 400;
                l21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(l21Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f26261f = true;
        this.f26262g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f26258a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            l21 l21Var4 = (l21) arrayList.get(i13);
            float f12 = l21Var4.h;
            float f13 = l21Var4.f25885g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(l21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                l21Var4.f25884f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = l21Var4.f25881a;
                float f15 = l21Var4.f25883c;
                float f16 = l21Var4.e;
                float f17 = (float) min;
                l21Var4.f25881a = a4.a.B(f15 * f16, f17, 200.0f, f14);
                l21Var4.f25882b = (((l21Var4.d * f16) * f17) / 200.0f) + l21Var4.f25882b;
                l21Var4.h += f17;
            }
            i13++;
        }
        this.f26258a = elapsedRealtime;
    }

    public m21(int i10) {
        this.f26260c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
