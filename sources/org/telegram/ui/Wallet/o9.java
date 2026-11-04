package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
public final class o9 {
    public static final int[] f43024f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f43025a = new ArrayList();
    public final Random f43026b = new Random();
    public final Paint f43027c = new Paint(1);
    public final Path d;
    public long f43028e;

    public o9() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final n9 a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        ArrayList arrayList = this.f43025a;
        if (arrayList.isEmpty()) {
            this.f43028e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f42959l = 1.0f;
        obj.f42950a = f10;
        obj.f42951b = f11;
        double d = f12;
        obj.f42952c = ((float) Math.cos(d)) * f13;
        obj.d = ((float) Math.sin(d)) * f13;
        obj.f42953e = f14;
        obj.f42954f = f15;
        obj.f42955g = f16;
        obj.f42958k = f43024f[this.f43026b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f42956i = e(-180.0f, 180.0f);
        arrayList.add(obj);
        return obj;
    }

    public final void b(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f22607p;
        for (int i3 = 0; i3 < 28; i3++) {
            a(f10, f11, e(0.0f, 6.2831855f), e(60.0f, 300.0f) * f12, e(2.5f, 6.0f) * f12, e(0.5f, 0.9f), 3.0f);
        }
    }

    public final void c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.f43028e)) / 1000.0f);
        this.f43028e = uptimeMillis;
        ArrayList arrayList = this.f43025a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n9 n9Var = (n9) arrayList.get(size);
            float f10 = n9Var.f42957j + min;
            n9Var.f42957j = f10;
            if (f10 >= 0.0f) {
                if (f10 >= n9Var.f42954f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-n9Var.f42955g) * min);
                    float f11 = n9Var.f42952c * exp;
                    n9Var.f42952c = f11;
                    float f12 = n9Var.d * exp;
                    n9Var.d = f12;
                    n9Var.f42950a = (f11 * min) + n9Var.f42950a;
                    n9Var.f42951b = (f12 * min) + n9Var.f42951b;
                    n9Var.h = (n9Var.f42956i * min) + n9Var.h;
                    float f13 = n9Var.f42957j / n9Var.f42954f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f13 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f13) * n9Var.f42959l;
                    float B = com.google.android.recaptcha.internal.a.B(f13, 0.5f, 1.0f, n9Var.f42953e);
                    int save = canvas.save();
                    canvas.translate(n9Var.f42950a, n9Var.f42951b);
                    canvas.rotate(n9Var.h);
                    canvas.scale(B, B);
                    int i3 = n9Var.f42958k;
                    Paint paint = this.f43027c;
                    paint.setColor(i3);
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
        return !this.f43025a.isEmpty();
    }

    public final float e(float f10, float f11) {
        return com.google.android.recaptcha.internal.a.y(f11, f10, this.f43026b.nextFloat(), f10);
    }

    public final void f() {
        float f10;
        this.f43025a.clear();
        float f11 = org.telegram.messenger.g0.f22607p;
        for (int i3 = 0; i3 < 48; i3++) {
            for (int i10 = -1; i10 <= 1; i10 += 2) {
                if (i10 < 0) {
                    f10 = 3.1415927f;
                } else {
                    f10 = 0.0f;
                }
                n9 a10 = a(0.0f, (e(-3.0f, 3.0f) * f11) + 0.0f, e(-0.6f, 0.6f) + f10, e(150.0f, 310.0f) * f11, e(1.3f, 3.2f) * f11, e(0.65f, 1.05f), 1.8f);
                a10.f42958k = -6562049;
                a10.f42959l = e(0.3f, 1.0f);
                a10.f42957j = (-i3) * 0.006f;
            }
        }
    }

    public final void g(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f22607p;
        a(f10, f11, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f12, e(1.5f, 3.5f) * f12, e(0.35f, 0.6f), 2.0f);
    }
}
