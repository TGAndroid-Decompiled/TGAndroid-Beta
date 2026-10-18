package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class q9 {
    public static final int[] f34806f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f34807a = new ArrayList();
    public final Random f34808b = new Random();
    public final Paint f34809c = new Paint(1);
    public final Path d;
    public long e;

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

    public final p9 a(float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        ArrayList arrayList = this.f34807a;
        if (arrayList.isEmpty()) {
            this.e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f34765l = 1.0f;
        obj.f34757a = f7;
        obj.f34758b = f10;
        double d = f11;
        obj.f34759c = ((float) Math.cos(d)) * f12;
        obj.d = ((float) Math.sin(d)) * f12;
        obj.e = f13;
        obj.f34760f = f14;
        obj.f34761g = f15;
        obj.f34764k = f34806f[this.f34808b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f34762i = e(-180.0f, 180.0f);
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
        ArrayList arrayList = this.f34807a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p9 p9Var = (p9) arrayList.get(size);
            float f7 = p9Var.f34763j + min;
            p9Var.f34763j = f7;
            if (f7 >= 0.0f) {
                if (f7 >= p9Var.f34760f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-p9Var.f34761g) * min);
                    float f10 = p9Var.f34759c * exp;
                    p9Var.f34759c = f10;
                    float f11 = p9Var.d * exp;
                    p9Var.d = f11;
                    p9Var.f34757a = (f10 * min) + p9Var.f34757a;
                    p9Var.f34758b = (f11 * min) + p9Var.f34758b;
                    p9Var.h = (p9Var.f34762i * min) + p9Var.h;
                    float f12 = p9Var.f34763j / p9Var.f34760f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f12 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f12) * p9Var.f34765l;
                    float B = com.google.android.gms.internal.play_billing.k3.B(f12, 0.5f, 1.0f, p9Var.e);
                    int save = canvas.save();
                    canvas.translate(p9Var.f34757a, p9Var.f34758b);
                    canvas.rotate(p9Var.h);
                    canvas.scale(B, B);
                    int i10 = p9Var.f34764k;
                    Paint paint = this.f34809c;
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
        return !this.f34807a.isEmpty();
    }

    public final float e(float f7, float f10) {
        return com.google.android.gms.internal.play_billing.k3.y(f10, f7, this.f34808b.nextFloat(), f7);
    }

    public final void f() {
        float f7;
        this.f34807a.clear();
        float f10 = AndroidUtilities.density;
        for (int i10 = 0; i10 < 48; i10++) {
            for (int i11 = -1; i11 <= 1; i11 += 2) {
                if (i11 < 0) {
                    f7 = 3.1415927f;
                } else {
                    f7 = 0.0f;
                }
                p9 a2 = a(0.0f, (e(-3.0f, 3.0f) * f10) + 0.0f, e(-0.6f, 0.6f) + f7, e(150.0f, 310.0f) * f10, e(1.3f, 3.2f) * f10, e(0.65f, 1.05f), 1.8f);
                a2.f34764k = -6562049;
                a2.f34765l = e(0.3f, 1.0f);
                a2.f34763j = (-i10) * 0.006f;
            }
        }
    }

    public final void g(float f7, float f10) {
        float f11 = AndroidUtilities.density;
        a(f7, f10, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f11, e(1.5f, 3.5f) * f11, e(0.35f, 0.6f), 2.0f);
    }
}
