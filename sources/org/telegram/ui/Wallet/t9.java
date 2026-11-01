package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
public final class t9 {
    public static final int[] f35254f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f35255a = new ArrayList();
    public final Random f35256b = new Random();
    public final Paint f35257c = new Paint(1);
    public final Path d;
    public long e;

    public t9() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final s9 a(float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        ArrayList arrayList = this.f35255a;
        if (arrayList.isEmpty()) {
            this.e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f35220l = 1.0f;
        obj.f35212a = f7;
        obj.f35213b = f10;
        double d = f11;
        obj.f35214c = ((float) Math.cos(d)) * f12;
        obj.d = ((float) Math.sin(d)) * f12;
        obj.e = f13;
        obj.f35215f = f14;
        obj.f35216g = f15;
        obj.f35219k = f35254f[this.f35256b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f35217i = e(-180.0f, 180.0f);
        arrayList.add(obj);
        return obj;
    }

    public final void b(float f7, float f10) {
        float f11 = org.telegram.messenger.i0.f16171p;
        for (int i10 = 0; i10 < 28; i10++) {
            a(f7, f10, e(0.0f, 6.2831855f), e(60.0f, 300.0f) * f11, e(2.5f, 6.0f) * f11, e(0.5f, 0.9f), 3.0f);
        }
    }

    public final void c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.e)) / 1000.0f);
        this.e = uptimeMillis;
        ArrayList arrayList = this.f35255a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s9 s9Var = (s9) arrayList.get(size);
            float f7 = s9Var.f35218j + min;
            s9Var.f35218j = f7;
            if (f7 >= 0.0f) {
                if (f7 >= s9Var.f35215f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-s9Var.f35216g) * min);
                    float f10 = s9Var.f35214c * exp;
                    s9Var.f35214c = f10;
                    float f11 = s9Var.d * exp;
                    s9Var.d = f11;
                    s9Var.f35212a = (f10 * min) + s9Var.f35212a;
                    s9Var.f35213b = (f11 * min) + s9Var.f35213b;
                    s9Var.h = (s9Var.f35217i * min) + s9Var.h;
                    float f12 = s9Var.f35218j / s9Var.f35215f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f12 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f12) * s9Var.f35220l;
                    float D = c3.i0.D(f12, 0.5f, 1.0f, s9Var.e);
                    int save = canvas.save();
                    canvas.translate(s9Var.f35212a, s9Var.f35213b);
                    canvas.rotate(s9Var.h);
                    canvas.scale(D, D);
                    int i10 = s9Var.f35219k;
                    Paint paint = this.f35257c;
                    paint.setColor(i10);
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
        return !this.f35255a.isEmpty();
    }

    public final float e(float f7, float f10) {
        return c3.i0.z(f10, f7, this.f35256b.nextFloat(), f7);
    }

    public final void f() {
        float f7;
        this.f35255a.clear();
        float f10 = org.telegram.messenger.i0.f16171p;
        for (int i10 = 0; i10 < 48; i10++) {
            for (int i11 = -1; i11 <= 1; i11 += 2) {
                if (i11 < 0) {
                    f7 = 3.1415927f;
                } else {
                    f7 = 0.0f;
                }
                s9 a2 = a(0.0f, (e(-3.0f, 3.0f) * f10) + 0.0f, e(-0.6f, 0.6f) + f7, e(150.0f, 310.0f) * f10, e(1.3f, 3.2f) * f10, e(0.65f, 1.05f), 1.8f);
                a2.f35219k = -6562049;
                a2.f35220l = e(0.3f, 1.0f);
                a2.f35218j = (-i10) * 0.006f;
            }
        }
    }

    public final void g(float f7, float f10) {
        float f11 = org.telegram.messenger.i0.f16171p;
        a(f7, f10, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f11, e(1.5f, 3.5f) * f11, e(0.35f, 0.6f), 2.0f);
    }
}
