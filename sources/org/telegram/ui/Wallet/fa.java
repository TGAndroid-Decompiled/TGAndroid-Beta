package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
public final class fa {
    public static final int[] f44272f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f44273a = new ArrayList();
    public final Random f44274b = new Random();
    public final Paint f44275c = new Paint(1);
    public final Path d;
    public long f44276e;

    public fa() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final ea a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        ArrayList arrayList = this.f44273a;
        if (arrayList.isEmpty()) {
            this.f44276e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f44201l = 1.0f;
        obj.f44192a = f10;
        obj.f44193b = f11;
        double d = f12;
        obj.f44194c = ((float) Math.cos(d)) * f13;
        obj.d = ((float) Math.sin(d)) * f13;
        obj.f44195e = f14;
        obj.f44196f = f15;
        obj.f44197g = f16;
        obj.f44200k = f44272f[this.f44274b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f44198i = e(-180.0f, 180.0f);
        arrayList.add(obj);
        return obj;
    }

    public final void b(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f24045p;
        for (int i7 = 0; i7 < 28; i7++) {
            a(f10, f11, e(0.0f, 6.2831855f), e(60.0f, 300.0f) * f12, e(2.5f, 6.0f) * f12, e(0.5f, 0.9f), 3.0f);
        }
    }

    public final void c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.f44276e)) / 1000.0f);
        this.f44276e = uptimeMillis;
        ArrayList arrayList = this.f44273a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ea eaVar = (ea) arrayList.get(size);
            float f10 = eaVar.f44199j + min;
            eaVar.f44199j = f10;
            if (f10 >= 0.0f) {
                if (f10 >= eaVar.f44196f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-eaVar.f44197g) * min);
                    float f11 = eaVar.f44194c * exp;
                    eaVar.f44194c = f11;
                    float f12 = eaVar.d * exp;
                    eaVar.d = f12;
                    eaVar.f44192a = (f11 * min) + eaVar.f44192a;
                    eaVar.f44193b = (f12 * min) + eaVar.f44193b;
                    eaVar.h = (eaVar.f44198i * min) + eaVar.h;
                    float f13 = eaVar.f44199j / eaVar.f44196f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f13 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f13) * eaVar.f44201l;
                    float C = com.google.android.gms.internal.vision.e2.C(f13, 0.5f, 1.0f, eaVar.f44195e);
                    int save = canvas.save();
                    canvas.translate(eaVar.f44192a, eaVar.f44193b);
                    canvas.rotate(eaVar.h);
                    canvas.scale(C, C);
                    int i7 = eaVar.f44200k;
                    Paint paint = this.f44275c;
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
        return !this.f44273a.isEmpty();
    }

    public final float e(float f10, float f11) {
        return com.google.android.gms.internal.vision.e2.z(f11, f10, this.f44274b.nextFloat(), f10);
    }

    public final void f() {
        float f10;
        this.f44273a.clear();
        float f11 = org.telegram.messenger.g0.f24045p;
        for (int i7 = 0; i7 < 48; i7++) {
            for (int i10 = -1; i10 <= 1; i10 += 2) {
                if (i10 < 0) {
                    f10 = 3.1415927f;
                } else {
                    f10 = 0.0f;
                }
                ea a10 = a(0.0f, (e(-3.0f, 3.0f) * f11) + 0.0f, e(-0.6f, 0.6f) + f10, e(150.0f, 310.0f) * f11, e(1.3f, 3.2f) * f11, e(0.65f, 1.05f), 1.8f);
                a10.f44200k = -6562049;
                a10.f44201l = e(0.3f, 1.0f);
                a10.f44199j = (-i7) * 0.006f;
            }
        }
    }

    public final void g(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f24045p;
        a(f10, f11, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f12, e(1.5f, 3.5f) * f12, e(0.35f, 0.6f), 2.0f);
    }
}
