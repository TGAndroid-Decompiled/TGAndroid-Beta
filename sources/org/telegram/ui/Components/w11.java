package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w11 {
    public long f32105a;
    public boolean f32106b;
    public final ArrayList f32107c;
    public final ArrayList d;
    public final int f32108e;
    public boolean f32109f;
    public float f32110g;
    public float h;

    public w11() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        v11 v11Var;
        ArrayList arrayList = this.f32107c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            v11 v11Var2 = (v11) arrayList.get(i11);
            paint.setAlpha((int) (v11Var2.f31073f * 255.0f * f10));
            canvas.drawPoint(v11Var2.f31069a, v11Var2.f31070b, paint);
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
                v11Var = (v11) arrayList2.get(i10);
            } else {
                v11Var = new Object();
            }
            if (this.f32106b && this.f32109f) {
                float f11 = (i12 + 1) / clamp;
                v11Var.f31069a = AndroidUtilities.lerp(this.f32110g, centerX, f11);
                v11Var.f31070b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                v11Var.f31069a = centerX;
                v11Var.f31070b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            v11Var.f31071c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            v11 v11Var3 = v11Var;
            v11Var3.d = (float) i2.g.e(nextInt, d10, Math.sin(nextInt) * d11);
            v11Var3.f31073f = 1.0f;
            v11Var3.h = 0.0f;
            if (this.f32106b) {
                v11Var3.f31074g = Utilities.random.nextInt(200) + 600;
                v11Var3.f31072e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                v11Var3.f31074g = Utilities.random.nextInt(100) + 400;
                v11Var3.f31072e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(v11Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f32109f = true;
        this.f32110g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f32105a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            v11 v11Var4 = (v11) arrayList.get(i13);
            float f12 = v11Var4.h;
            float f13 = v11Var4.f31074g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.f32108e) {
                    arrayList2.add(v11Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                v11Var4.f31073f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = v11Var4.f31069a;
                float f15 = v11Var4.f31071c;
                float f16 = v11Var4.f31072e;
                float f17 = (float) min;
                v11Var4.f31069a = a4.a.A(f15 * f16, f17, 200.0f, f14);
                v11Var4.f31070b = (((v11Var4.d * f16) * f17) / 200.0f) + v11Var4.f31070b;
                v11Var4.h += f17;
            }
            i13++;
        }
        this.f32105a = elapsedRealtime;
    }

    public w11(int i10) {
        this.f32107c = new ArrayList();
        this.d = new ArrayList();
        this.f32108e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
