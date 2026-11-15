package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
public final class r9 {
    public static final int[] f44457f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f44458a = new ArrayList();
    public final Random f44459b = new Random();
    public final Paint f44460c = new Paint(1);
    public final Path d;
    public long f44461e;

    public r9() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final q9 a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        ArrayList arrayList = this.f44458a;
        if (arrayList.isEmpty()) {
            this.f44461e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f44414l = 1.0f;
        obj.f44405a = f10;
        obj.f44406b = f11;
        double d = f12;
        obj.f44407c = ((float) Math.cos(d)) * f13;
        obj.d = ((float) Math.sin(d)) * f13;
        obj.f44408e = f14;
        obj.f44409f = f15;
        obj.f44410g = f16;
        obj.f44413k = f44457f[this.f44459b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f44411i = e(-180.0f, 180.0f);
        arrayList.add(obj);
        return obj;
    }

    public final void b(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f23608p;
        for (int i7 = 0; i7 < 28; i7++) {
            a(f10, f11, e(0.0f, 6.2831855f), e(60.0f, 300.0f) * f12, e(2.5f, 6.0f) * f12, e(0.5f, 0.9f), 3.0f);
        }
    }

    public final void c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.f44461e)) / 1000.0f);
        this.f44461e = uptimeMillis;
        ArrayList arrayList = this.f44458a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q9 q9Var = (q9) arrayList.get(size);
            float f10 = q9Var.f44412j + min;
            q9Var.f44412j = f10;
            if (f10 >= 0.0f) {
                if (f10 >= q9Var.f44409f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-q9Var.f44410g) * min);
                    float f11 = q9Var.f44407c * exp;
                    q9Var.f44407c = f11;
                    float f12 = q9Var.d * exp;
                    q9Var.d = f12;
                    q9Var.f44405a = (f11 * min) + q9Var.f44405a;
                    q9Var.f44406b = (f12 * min) + q9Var.f44406b;
                    q9Var.h = (q9Var.f44411i * min) + q9Var.h;
                    float f13 = q9Var.f44412j / q9Var.f44409f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f13 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f13) * q9Var.f44414l;
                    float C = com.google.android.gms.internal.vision.e2.C(f13, 0.5f, 1.0f, q9Var.f44408e);
                    int save = canvas.save();
                    canvas.translate(q9Var.f44405a, q9Var.f44406b);
                    canvas.rotate(q9Var.h);
                    canvas.scale(C, C);
                    int i7 = q9Var.f44413k;
                    Paint paint = this.f44460c;
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
        return !this.f44458a.isEmpty();
    }

    public final float e(float f10, float f11) {
        return com.google.android.gms.internal.vision.e2.z(f11, f10, this.f44459b.nextFloat(), f10);
    }

    public final void f() {
        float f10;
        this.f44458a.clear();
        float f11 = org.telegram.messenger.g0.f23608p;
        for (int i7 = 0; i7 < 48; i7++) {
            for (int i10 = -1; i10 <= 1; i10 += 2) {
                if (i10 < 0) {
                    f10 = 3.1415927f;
                } else {
                    f10 = 0.0f;
                }
                q9 a10 = a(0.0f, (e(-3.0f, 3.0f) * f11) + 0.0f, e(-0.6f, 0.6f) + f10, e(150.0f, 310.0f) * f11, e(1.3f, 3.2f) * f11, e(0.65f, 1.05f), 1.8f);
                a10.f44413k = -6562049;
                a10.f44414l = e(0.3f, 1.0f);
                a10.f44412j = (-i7) * 0.006f;
            }
        }
    }

    public final void g(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f23608p;
        a(f10, f11, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f12, e(1.5f, 3.5f) * f12, e(0.35f, 0.6f), 2.0f);
    }
}
