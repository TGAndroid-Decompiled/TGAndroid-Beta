package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
public final class ga {
    public static final int[] f44403f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f44404a = new ArrayList();
    public final Random f44405b = new Random();
    public final Paint f44406c = new Paint(1);
    public final Path d;
    public long f44407e;

    public ga() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final fa a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        ArrayList arrayList = this.f44404a;
        if (arrayList.isEmpty()) {
            this.f44407e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f44330l = 1.0f;
        obj.f44321a = f10;
        obj.f44322b = f11;
        double d = f12;
        obj.f44323c = ((float) Math.cos(d)) * f13;
        obj.d = ((float) Math.sin(d)) * f13;
        obj.f44324e = f14;
        obj.f44325f = f15;
        obj.f44326g = f16;
        obj.f44329k = f44403f[this.f44405b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f44327i = e(-180.0f, 180.0f);
        arrayList.add(obj);
        return obj;
    }

    public final void b(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f24225p;
        for (int i7 = 0; i7 < 28; i7++) {
            a(f10, f11, e(0.0f, 6.2831855f), e(60.0f, 300.0f) * f12, e(2.5f, 6.0f) * f12, e(0.5f, 0.9f), 3.0f);
        }
    }

    public final void c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.f44407e)) / 1000.0f);
        this.f44407e = uptimeMillis;
        ArrayList arrayList = this.f44404a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            fa faVar = (fa) arrayList.get(size);
            float f10 = faVar.f44328j + min;
            faVar.f44328j = f10;
            if (f10 >= 0.0f) {
                if (f10 >= faVar.f44325f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-faVar.f44326g) * min);
                    float f11 = faVar.f44323c * exp;
                    faVar.f44323c = f11;
                    float f12 = faVar.d * exp;
                    faVar.d = f12;
                    faVar.f44321a = (f11 * min) + faVar.f44321a;
                    faVar.f44322b = (f12 * min) + faVar.f44322b;
                    faVar.h = (faVar.f44327i * min) + faVar.h;
                    float f13 = faVar.f44328j / faVar.f44325f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f13 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f13) * faVar.f44330l;
                    float C = com.google.android.gms.internal.vision.e2.C(f13, 0.5f, 1.0f, faVar.f44324e);
                    int save = canvas.save();
                    canvas.translate(faVar.f44321a, faVar.f44322b);
                    canvas.rotate(faVar.h);
                    canvas.scale(C, C);
                    int i7 = faVar.f44329k;
                    Paint paint = this.f44406c;
                    paint.setColor(i7);
                    paint.setAlpha(Math.round(20.4f * min2));
                    canvas.drawCircle(0.0f, 0.0f, 1.4f, paint);
                    paint.setAlpha(Math.round(min2 * 255.0f));
                    canvas.drawPath(this.d, paint);
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    public final boolean d() {
        return !this.f44404a.isEmpty();
    }

    public final float e(float f10, float f11) {
        return com.google.android.gms.internal.vision.e2.z(f11, f10, this.f44405b.nextFloat(), f10);
    }

    public final void f() {
        float f10;
        this.f44404a.clear();
        float f11 = org.telegram.messenger.g0.f24225p;
        for (int i7 = 0; i7 < 48; i7++) {
            for (int i10 = -1; i10 <= 1; i10 += 2) {
                if (i10 < 0) {
                    f10 = 3.1415927f;
                } else {
                    f10 = 0.0f;
                }
                fa a10 = a(0.0f, (e(-3.0f, 3.0f) * f11) + 0.0f, e(-0.6f, 0.6f) + f10, e(150.0f, 310.0f) * f11, e(1.3f, 3.2f) * f11, e(0.65f, 1.05f), 1.8f);
                a10.f44329k = -6562049;
                a10.f44330l = e(0.3f, 1.0f);
                a10.f44328j = (-i7) * 0.006f;
            }
        }
    }

    public final void g(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f24225p;
        a(f10, f11, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f12, e(1.5f, 3.5f) * f12, e(0.35f, 0.6f), 2.0f);
    }
}
