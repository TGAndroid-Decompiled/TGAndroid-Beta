package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class l8 {
    public static final int[] f33173f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f33174a = new ArrayList();
    public final Random f33175b = new Random();
    public final Paint f33176c = new Paint(1);
    public final Path d;
    public long e;

    public l8() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final k8 a(float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        ArrayList arrayList = this.f33174a;
        if (arrayList.isEmpty()) {
            this.e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f33144l = 1.0f;
        obj.f33136a = f7;
        obj.f33137b = f10;
        double d = f11;
        obj.f33138c = ((float) Math.cos(d)) * f12;
        obj.d = ((float) Math.sin(d)) * f12;
        obj.e = f13;
        obj.f33139f = f14;
        obj.f33140g = f15;
        obj.f33143k = f33173f[this.f33175b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f33141i = e(-180.0f, 180.0f);
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
        ArrayList arrayList = this.f33174a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k8 k8Var = (k8) arrayList.get(size);
            float f7 = k8Var.f33142j + min;
            k8Var.f33142j = f7;
            if (f7 >= 0.0f) {
                if (f7 >= k8Var.f33139f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-k8Var.f33140g) * min);
                    float f10 = k8Var.f33138c * exp;
                    k8Var.f33138c = f10;
                    float f11 = k8Var.d * exp;
                    k8Var.d = f11;
                    k8Var.f33136a = (f10 * min) + k8Var.f33136a;
                    k8Var.f33137b = (f11 * min) + k8Var.f33137b;
                    k8Var.h = (k8Var.f33141i * min) + k8Var.h;
                    float f12 = k8Var.f33142j / k8Var.f33139f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f12 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f12) * k8Var.f33144l;
                    float B = com.google.android.gms.internal.play_billing.k3.B(f12, 0.5f, 1.0f, k8Var.e);
                    int save = canvas.save();
                    canvas.translate(k8Var.f33136a, k8Var.f33137b);
                    canvas.rotate(k8Var.h);
                    canvas.scale(B, B);
                    int i10 = k8Var.f33143k;
                    Paint paint = this.f33176c;
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
        return !this.f33174a.isEmpty();
    }

    public final float e(float f7, float f10) {
        return com.google.android.gms.internal.play_billing.k3.y(f10, f7, this.f33175b.nextFloat(), f7);
    }

    public final void f() {
        float f7;
        this.f33174a.clear();
        float f10 = AndroidUtilities.density;
        for (int i10 = 0; i10 < 48; i10++) {
            for (int i11 = -1; i11 <= 1; i11 += 2) {
                if (i11 < 0) {
                    f7 = 3.1415927f;
                } else {
                    f7 = 0.0f;
                }
                k8 a2 = a(0.0f, (e(-3.0f, 3.0f) * f10) + 0.0f, e(-0.6f, 0.6f) + f7, e(150.0f, 310.0f) * f10, e(1.3f, 3.2f) * f10, e(0.65f, 1.05f), 1.8f);
                a2.f33143k = -6562049;
                a2.f33144l = e(0.3f, 1.0f);
                a2.f33142j = (-i10) * 0.006f;
            }
        }
    }

    public final void g(float f7, float f10) {
        float f11 = AndroidUtilities.density;
        a(f7, f10, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f11, e(1.5f, 3.5f) * f11, e(0.35f, 0.6f), 2.0f);
    }
}
