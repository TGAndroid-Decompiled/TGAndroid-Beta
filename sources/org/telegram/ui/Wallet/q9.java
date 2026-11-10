package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
public final class q9 {
    public static final int[] f43084f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f43085a = new ArrayList();
    public final Random f43086b = new Random();
    public final Paint f43087c = new Paint(1);
    public final Path d;
    public long f43088e;

    public q9() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final p9 a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        ArrayList arrayList = this.f43085a;
        if (arrayList.isEmpty()) {
            this.f43088e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f43023l = 1.0f;
        obj.f43014a = f10;
        obj.f43015b = f11;
        double d = f12;
        obj.f43016c = ((float) Math.cos(d)) * f13;
        obj.d = ((float) Math.sin(d)) * f13;
        obj.f43017e = f14;
        obj.f43018f = f15;
        obj.f43019g = f16;
        obj.f43022k = f43084f[this.f43086b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f43020i = e(-180.0f, 180.0f);
        arrayList.add(obj);
        return obj;
    }

    public final void b(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f22566p;
        for (int i7 = 0; i7 < 28; i7++) {
            a(f10, f11, e(0.0f, 6.2831855f), e(60.0f, 300.0f) * f12, e(2.5f, 6.0f) * f12, e(0.5f, 0.9f), 3.0f);
        }
    }

    public final void c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.f43088e)) / 1000.0f);
        this.f43088e = uptimeMillis;
        ArrayList arrayList = this.f43085a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p9 p9Var = (p9) arrayList.get(size);
            float f10 = p9Var.f43021j + min;
            p9Var.f43021j = f10;
            if (f10 >= 0.0f) {
                if (f10 >= p9Var.f43018f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-p9Var.f43019g) * min);
                    float f11 = p9Var.f43016c * exp;
                    p9Var.f43016c = f11;
                    float f12 = p9Var.d * exp;
                    p9Var.d = f12;
                    p9Var.f43014a = (f11 * min) + p9Var.f43014a;
                    p9Var.f43015b = (f12 * min) + p9Var.f43015b;
                    p9Var.h = (p9Var.f43020i * min) + p9Var.h;
                    float f13 = p9Var.f43021j / p9Var.f43018f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f13 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f13) * p9Var.f43023l;
                    float C = com.google.android.recaptcha.internal.a.C(f13, 0.5f, 1.0f, p9Var.f43017e);
                    int save = canvas.save();
                    canvas.translate(p9Var.f43014a, p9Var.f43015b);
                    canvas.rotate(p9Var.h);
                    canvas.scale(C, C);
                    int i7 = p9Var.f43022k;
                    Paint paint = this.f43087c;
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
        return !this.f43085a.isEmpty();
    }

    public final float e(float f10, float f11) {
        return com.google.android.recaptcha.internal.a.z(f11, f10, this.f43086b.nextFloat(), f10);
    }

    public final void f() {
        float f10;
        this.f43085a.clear();
        float f11 = org.telegram.messenger.g0.f22566p;
        for (int i7 = 0; i7 < 48; i7++) {
            for (int i10 = -1; i10 <= 1; i10 += 2) {
                if (i10 < 0) {
                    f10 = 3.1415927f;
                } else {
                    f10 = 0.0f;
                }
                p9 a10 = a(0.0f, (e(-3.0f, 3.0f) * f11) + 0.0f, e(-0.6f, 0.6f) + f10, e(150.0f, 310.0f) * f11, e(1.3f, 3.2f) * f11, e(0.65f, 1.05f), 1.8f);
                a10.f43022k = -6562049;
                a10.f43023l = e(0.3f, 1.0f);
                a10.f43021j = (-i7) * 0.006f;
            }
        }
    }

    public final void g(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f22566p;
        a(f10, f11, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f12, e(1.5f, 3.5f) * f12, e(0.35f, 0.6f), 2.0f);
    }
}
