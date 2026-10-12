package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class k8 {
    public static final int[] f33407f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f33408a = new ArrayList();
    public final Random f33409b = new Random();
    public final Paint f33410c = new Paint(1);
    public final Path d;
    public long e;

    public k8() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final j8 a(float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        ArrayList arrayList = this.f33408a;
        if (arrayList.isEmpty()) {
            this.e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f33378l = 1.0f;
        obj.f33370a = f7;
        obj.f33371b = f10;
        double d = f11;
        obj.f33372c = ((float) Math.cos(d)) * f12;
        obj.d = ((float) Math.sin(d)) * f12;
        obj.e = f13;
        obj.f33373f = f14;
        obj.f33374g = f15;
        obj.f33377k = f33407f[this.f33409b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f33375i = e(-180.0f, 180.0f);
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
        ArrayList arrayList = this.f33408a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j8 j8Var = (j8) arrayList.get(size);
            float f7 = j8Var.f33376j + min;
            j8Var.f33376j = f7;
            if (f7 >= 0.0f) {
                if (f7 >= j8Var.f33373f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-j8Var.f33374g) * min);
                    float f10 = j8Var.f33372c * exp;
                    j8Var.f33372c = f10;
                    float f11 = j8Var.d * exp;
                    j8Var.d = f11;
                    j8Var.f33370a = (f10 * min) + j8Var.f33370a;
                    j8Var.f33371b = (f11 * min) + j8Var.f33371b;
                    j8Var.h = (j8Var.f33375i * min) + j8Var.h;
                    float f12 = j8Var.f33376j / j8Var.f33373f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f12 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f12) * j8Var.f33378l;
                    float B = com.google.android.gms.internal.play_billing.k3.B(f12, 0.5f, 1.0f, j8Var.e);
                    int save = canvas.save();
                    canvas.translate(j8Var.f33370a, j8Var.f33371b);
                    canvas.rotate(j8Var.h);
                    canvas.scale(B, B);
                    int i10 = j8Var.f33377k;
                    Paint paint = this.f33410c;
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
        return !this.f33408a.isEmpty();
    }

    public final float e(float f7, float f10) {
        return com.google.android.gms.internal.play_billing.k3.y(f10, f7, this.f33409b.nextFloat(), f7);
    }

    public final void f() {
        float f7;
        this.f33408a.clear();
        float f10 = AndroidUtilities.density;
        for (int i10 = 0; i10 < 48; i10++) {
            for (int i11 = -1; i11 <= 1; i11 += 2) {
                if (i11 < 0) {
                    f7 = 3.1415927f;
                } else {
                    f7 = 0.0f;
                }
                j8 a2 = a(0.0f, (e(-3.0f, 3.0f) * f10) + 0.0f, e(-0.6f, 0.6f) + f7, e(150.0f, 310.0f) * f10, e(1.3f, 3.2f) * f10, e(0.65f, 1.05f), 1.8f);
                a2.f33377k = -6562049;
                a2.f33378l = e(0.3f, 1.0f);
                a2.f33376j = (-i10) * 0.006f;
            }
        }
    }

    public final void g(float f7, float f10) {
        float f11 = AndroidUtilities.density;
        a(f7, f10, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f11, e(1.5f, 3.5f) * f11, e(0.35f, 0.6f), 2.0f);
    }
}
