package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w21 {
    public long f32485a;
    public boolean f32486b;
    public final ArrayList f32487c;
    public final ArrayList d;
    public final int f32488e;
    public boolean f32489f;
    public float f32490g;
    public float h;

    public w21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        v21 v21Var;
        ArrayList arrayList = this.f32487c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            v21 v21Var2 = (v21) arrayList.get(i11);
            paint.setAlpha((int) (v21Var2.f31626f * 255.0f * f10));
            canvas.drawPoint(v21Var2.f31622a, v21Var2.f31623b, paint);
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
                v21Var = (v21) arrayList2.get(i10);
            } else {
                v21Var = new Object();
            }
            if (this.f32486b && this.f32489f) {
                float f11 = (i12 + 1) / clamp;
                v21Var.f31622a = AndroidUtilities.lerp(this.f32490g, centerX, f11);
                v21Var.f31623b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                v21Var.f31622a = centerX;
                v21Var.f31623b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            v21Var.f31624c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            v21 v21Var3 = v21Var;
            v21Var3.d = (float) hg.c.e(nextInt, d10, Math.sin(nextInt) * d11);
            v21Var3.f31626f = 1.0f;
            v21Var3.h = 0.0f;
            if (this.f32486b) {
                v21Var3.f31627g = Utilities.random.nextInt(200) + 600;
                v21Var3.f31625e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                v21Var3.f31627g = Utilities.random.nextInt(100) + 400;
                v21Var3.f31625e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(v21Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f32489f = true;
        this.f32490g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f32485a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            v21 v21Var4 = (v21) arrayList.get(i13);
            float f12 = v21Var4.h;
            float f13 = v21Var4.f31627g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.f32488e) {
                    arrayList2.add(v21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                v21Var4.f31626f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = v21Var4.f31622a;
                float f15 = v21Var4.f31624c;
                float f16 = v21Var4.f31625e;
                float f17 = (float) min;
                v21Var4.f31622a = a4.a.B(f15 * f16, f17, 200.0f, f14);
                v21Var4.f31623b = (((v21Var4.d * f16) * f17) / 200.0f) + v21Var4.f31623b;
                v21Var4.h += f17;
            }
            i13++;
        }
        this.f32485a = elapsedRealtime;
    }

    public w21(int i10) {
        this.f32487c = new ArrayList();
        this.d = new ArrayList();
        this.f32488e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
