package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class n9 {
    public static final int[] f34650f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f34651a = new ArrayList();
    public final Random f34652b = new Random();
    public final Paint f34653c = new Paint(1);
    public final Path d;
    public long e;

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

    public final m9 a(float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        ArrayList arrayList = this.f34651a;
        if (arrayList.isEmpty()) {
            this.e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f34619l = 1.0f;
        obj.f34611a = f7;
        obj.f34612b = f10;
        double d = f11;
        obj.f34613c = ((float) Math.cos(d)) * f12;
        obj.d = ((float) Math.sin(d)) * f12;
        obj.e = f13;
        obj.f34614f = f14;
        obj.f34615g = f15;
        obj.f34618k = f34650f[this.f34652b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f34616i = e(-180.0f, 180.0f);
        arrayList.add(obj);
        return obj;
    }

    public final void b(float f7, float f10) {
        float f11 = AndroidUtilities.density;
        for (int i10 = 0; i10 < 28; i10++) {
            a(f7, f10, e(0.0f, 6.2831855f), e(60.0f, 300.0f) * f11, e(2.5f, 6.0f) * f11, e(0.5f, 0.9f), 3.0f);
        }
    }

    public final void c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.e)) / 1000.0f);
        this.e = uptimeMillis;
        ArrayList arrayList = this.f34651a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m9 m9Var = (m9) arrayList.get(size);
            float f7 = m9Var.f34617j + min;
            m9Var.f34617j = f7;
            if (f7 >= 0.0f) {
                if (f7 >= m9Var.f34614f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-m9Var.f34615g) * min);
                    float f10 = m9Var.f34613c * exp;
                    m9Var.f34613c = f10;
                    float f11 = m9Var.d * exp;
                    m9Var.d = f11;
                    m9Var.f34611a = (f10 * min) + m9Var.f34611a;
                    m9Var.f34612b = (f11 * min) + m9Var.f34612b;
                    m9Var.h = (m9Var.f34616i * min) + m9Var.h;
                    float f12 = m9Var.f34617j / m9Var.f34614f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f12 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f12) * m9Var.f34619l;
                    float B = com.google.android.gms.internal.cast.a6.B(f12, 0.5f, 1.0f, m9Var.e);
                    int save = canvas.save();
                    canvas.translate(m9Var.f34611a, m9Var.f34612b);
                    canvas.rotate(m9Var.h);
                    canvas.scale(B, B);
                    int i10 = m9Var.f34618k;
                    Paint paint = this.f34653c;
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
        return !this.f34651a.isEmpty();
    }

    public final float e(float f7, float f10) {
        return com.google.android.gms.internal.cast.a6.x(f10, f7, this.f34652b.nextFloat(), f7);
    }

    public final void f() {
        float f7;
        this.f34651a.clear();
        float f10 = AndroidUtilities.density;
        for (int i10 = 0; i10 < 48; i10++) {
            for (int i11 = -1; i11 <= 1; i11 += 2) {
                if (i11 < 0) {
                    f7 = 3.1415927f;
                } else {
                    f7 = 0.0f;
                }
                m9 a2 = a(0.0f, (e(-3.0f, 3.0f) * f10) + 0.0f, e(-0.6f, 0.6f) + f7, e(150.0f, 310.0f) * f10, e(1.3f, 3.2f) * f10, e(0.65f, 1.05f), 1.8f);
                a2.f34618k = -6562049;
                a2.f34619l = e(0.3f, 1.0f);
                a2.f34617j = (-i10) * 0.006f;
            }
        }
    }

    public final void g(float f7, float f10) {
        float f11 = AndroidUtilities.density;
        a(f7, f10, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f11, e(1.5f, 3.5f) * f11, e(0.35f, 0.6f), 2.0f);
    }
}
