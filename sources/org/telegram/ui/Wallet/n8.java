package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class n8 {
    public static final int[] f35137f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f35138a = new ArrayList();
    public final Random f35139b = new Random();
    public final Paint f35140c = new Paint(1);
    public final Path d;
    public long f35141e;

    public n8() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final m8 a(float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        ArrayList arrayList = this.f35138a;
        if (arrayList.isEmpty()) {
            this.f35141e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f35098l = 1.0f;
        obj.f35089a = f7;
        obj.f35090b = f10;
        double d = f11;
        obj.f35091c = ((float) Math.cos(d)) * f12;
        obj.d = ((float) Math.sin(d)) * f12;
        obj.f35092e = f13;
        obj.f35093f = f14;
        obj.f35094g = f15;
        obj.f35097k = f35137f[this.f35139b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f35095i = e(-180.0f, 180.0f);
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
        float min = Math.min(0.033f, ((float) (uptimeMillis - this.f35141e)) / 1000.0f);
        this.f35141e = uptimeMillis;
        ArrayList arrayList = this.f35138a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m8 m8Var = (m8) arrayList.get(size);
            float f7 = m8Var.f35096j + min;
            m8Var.f35096j = f7;
            if (f7 >= 0.0f) {
                if (f7 >= m8Var.f35093f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-m8Var.f35094g) * min);
                    float f10 = m8Var.f35091c * exp;
                    m8Var.f35091c = f10;
                    float f11 = m8Var.d * exp;
                    m8Var.d = f11;
                    m8Var.f35089a = (f10 * min) + m8Var.f35089a;
                    m8Var.f35090b = (f11 * min) + m8Var.f35090b;
                    m8Var.h = (m8Var.f35095i * min) + m8Var.h;
                    float f12 = m8Var.f35096j / m8Var.f35093f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f12 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f12) * m8Var.f35098l;
                    float B = com.google.android.gms.internal.vision.e2.B(f12, 0.5f, 1.0f, m8Var.f35092e);
                    int save = canvas.save();
                    canvas.translate(m8Var.f35089a, m8Var.f35090b);
                    canvas.rotate(m8Var.h);
                    canvas.scale(B, B);
                    int i10 = m8Var.f35097k;
                    Paint paint = this.f35140c;
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
        return !this.f35138a.isEmpty();
    }

    public final float e(float f7, float f10) {
        return com.google.android.gms.internal.vision.e2.y(f10, f7, this.f35139b.nextFloat(), f7);
    }

    public final void f() {
        float f7;
        this.f35138a.clear();
        float f10 = AndroidUtilities.density;
        for (int i10 = 0; i10 < 48; i10++) {
            for (int i11 = -1; i11 <= 1; i11 += 2) {
                if (i11 < 0) {
                    f7 = 3.1415927f;
                } else {
                    f7 = 0.0f;
                }
                m8 a2 = a(0.0f, (e(-3.0f, 3.0f) * f10) + 0.0f, e(-0.6f, 0.6f) + f7, e(150.0f, 310.0f) * f10, e(1.3f, 3.2f) * f10, e(0.65f, 1.05f), 1.8f);
                a2.f35097k = -6562049;
                a2.f35098l = e(0.3f, 1.0f);
                a2.f35096j = (-i10) * 0.006f;
            }
        }
    }

    public final void g(float f7, float f10) {
        float f11 = AndroidUtilities.density;
        a(f7, f10, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f11, e(1.5f, 3.5f) * f11, e(0.35f, 0.6f), 2.0f);
    }
}
