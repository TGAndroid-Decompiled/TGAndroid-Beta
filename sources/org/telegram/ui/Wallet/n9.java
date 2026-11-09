package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
public final class n9 {
    public static final int[] f42908f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f42909a = new ArrayList();
    public final Random f42910b = new Random();
    public final Paint f42911c = new Paint(1);
    public final Path d;
    public long f42912e;

    public n9() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final m9 a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        ArrayList arrayList = this.f42909a;
        if (arrayList.isEmpty()) {
            this.f42912e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f42828l = 1.0f;
        obj.f42819a = f10;
        obj.f42820b = f11;
        double d = f12;
        obj.f42821c = ((float) Math.cos(d)) * f13;
        obj.d = ((float) Math.sin(d)) * f13;
        obj.f42822e = f14;
        obj.f42823f = f15;
        obj.f42824g = f16;
        obj.f42827k = f42908f[this.f42910b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f42825i = e(-180.0f, 180.0f);
        arrayList.add(obj);
        return obj;
    }

    public final void b(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f22562p;
        for (int i7 = 0; i7 < 28; i7++) {
            a(f10, f11, e(0.0f, 6.2831855f), e(60.0f, 300.0f) * f12, e(2.5f, 6.0f) * f12, e(0.5f, 0.9f), 3.0f);
        }
    }

    public final void c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.f42912e)) / 1000.0f);
        this.f42912e = uptimeMillis;
        ArrayList arrayList = this.f42909a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m9 m9Var = (m9) arrayList.get(size);
            float f10 = m9Var.f42826j + min;
            m9Var.f42826j = f10;
            if (f10 >= 0.0f) {
                if (f10 >= m9Var.f42823f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-m9Var.f42824g) * min);
                    float f11 = m9Var.f42821c * exp;
                    m9Var.f42821c = f11;
                    float f12 = m9Var.d * exp;
                    m9Var.d = f12;
                    m9Var.f42819a = (f11 * min) + m9Var.f42819a;
                    m9Var.f42820b = (f12 * min) + m9Var.f42820b;
                    m9Var.h = (m9Var.f42825i * min) + m9Var.h;
                    float f13 = m9Var.f42826j / m9Var.f42823f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f13 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f13) * m9Var.f42828l;
                    float C = com.google.android.recaptcha.internal.a.C(f13, 0.5f, 1.0f, m9Var.f42822e);
                    int save = canvas.save();
                    canvas.translate(m9Var.f42819a, m9Var.f42820b);
                    canvas.rotate(m9Var.h);
                    canvas.scale(C, C);
                    int i7 = m9Var.f42827k;
                    Paint paint = this.f42911c;
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
        return !this.f42909a.isEmpty();
    }

    public final float e(float f10, float f11) {
        return com.google.android.recaptcha.internal.a.z(f11, f10, this.f42910b.nextFloat(), f10);
    }

    public final void f() {
        float f10;
        this.f42909a.clear();
        float f11 = org.telegram.messenger.g0.f22562p;
        for (int i7 = 0; i7 < 48; i7++) {
            for (int i10 = -1; i10 <= 1; i10 += 2) {
                if (i10 < 0) {
                    f10 = 3.1415927f;
                } else {
                    f10 = 0.0f;
                }
                m9 a10 = a(0.0f, (e(-3.0f, 3.0f) * f11) + 0.0f, e(-0.6f, 0.6f) + f10, e(150.0f, 310.0f) * f11, e(1.3f, 3.2f) * f11, e(0.65f, 1.05f), 1.8f);
                a10.f42827k = -6562049;
                a10.f42828l = e(0.3f, 1.0f);
                a10.f42826j = (-i7) * 0.006f;
            }
        }
    }

    public final void g(float f10, float f11) {
        float f12 = org.telegram.messenger.g0.f22562p;
        a(f10, f11, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f12, e(1.5f, 3.5f) * f12, e(0.35f, 0.6f), 2.0f);
    }
}
