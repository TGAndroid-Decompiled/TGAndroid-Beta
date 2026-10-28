package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class k9 {
    public static final int[] f36827f = {-16106272, -16754689, -14779393, -13326081, -10235137, -6559233};
    public final ArrayList f36828a = new ArrayList();
    public final Random f36829b = new Random();
    public final Paint f36830c = new Paint(1);
    public final Path d;
    public long e;

    public k9() {
        Path path = new Path();
        this.d = path;
        path.moveTo(0.0f, -1.0f);
        path.quadTo(0.12f, -0.12f, 1.0f, 0.0f);
        path.quadTo(0.12f, 0.12f, 0.0f, 1.0f);
        path.quadTo(-0.12f, 0.12f, -1.0f, 0.0f);
        path.quadTo(-0.12f, -0.12f, 0.0f, -1.0f);
        path.close();
    }

    public final j9 a(float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        ArrayList arrayList = this.f36828a;
        if (arrayList.isEmpty()) {
            this.e = SystemClock.uptimeMillis();
        }
        ?? obj = new Object();
        obj.f36784l = 1.0f;
        obj.f36776a = f7;
        obj.f36777b = f10;
        double d = f11;
        obj.f36778c = ((float) Math.cos(d)) * f12;
        obj.d = ((float) Math.sin(d)) * f12;
        obj.e = f13;
        obj.f36779f = f14;
        obj.f36780g = f15;
        obj.f36783k = f36827f[this.f36829b.nextInt(6)];
        obj.h = e(0.0f, 90.0f);
        obj.f36781i = e(-180.0f, 180.0f);
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
        ArrayList arrayList = this.f36828a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j9 j9Var = (j9) arrayList.get(size);
            float f7 = j9Var.f36782j + min;
            j9Var.f36782j = f7;
            if (f7 >= 0.0f) {
                if (f7 >= j9Var.f36779f) {
                    arrayList.remove(size);
                } else {
                    float exp = (float) Math.exp((-j9Var.f36780g) * min);
                    float f10 = j9Var.f36778c * exp;
                    j9Var.f36778c = f10;
                    float f11 = j9Var.d * exp;
                    j9Var.d = f11;
                    j9Var.f36776a = (f10 * min) + j9Var.f36776a;
                    j9Var.f36777b = (f11 * min) + j9Var.f36777b;
                    j9Var.h = (j9Var.f36781i * min) + j9Var.h;
                    float f12 = j9Var.f36782j / j9Var.f36779f;
                    float max = Math.max(0.0f, Math.min(1.0f, (f12 - 0.35f) / 0.65f));
                    float min2 = (1.0f - ((3.0f - (max * 2.0f)) * (max * max))) * Math.min(1.0f, 8.0f * f12) * j9Var.f36784l;
                    float D = c3.h0.D(f12, 0.5f, 1.0f, j9Var.e);
                    int save = canvas.save();
                    canvas.translate(j9Var.f36776a, j9Var.f36777b);
                    canvas.rotate(j9Var.h);
                    canvas.scale(D, D);
                    int i10 = j9Var.f36783k;
                    Paint paint = this.f36830c;
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
        return !this.f36828a.isEmpty();
    }

    public final float e(float f7, float f10) {
        return c3.h0.z(f10, f7, this.f36829b.nextFloat(), f7);
    }

    public final void f() {
        float f7;
        this.f36828a.clear();
        float f10 = AndroidUtilities.density;
        for (int i10 = 0; i10 < 48; i10++) {
            for (int i11 = -1; i11 <= 1; i11 += 2) {
                if (i11 < 0) {
                    f7 = 3.1415927f;
                } else {
                    f7 = 0.0f;
                }
                j9 a2 = a(0.0f, (e(-3.0f, 3.0f) * f10) + 0.0f, e(-0.6f, 0.6f) + f7, e(150.0f, 310.0f) * f10, e(1.3f, 3.2f) * f10, e(0.65f, 1.05f), 1.8f);
                a2.f36783k = -6562049;
                a2.f36784l = e(0.3f, 1.0f);
                a2.f36782j = (-i10) * 0.006f;
            }
        }
    }

    public final void g(float f7, float f10) {
        float f11 = AndroidUtilities.density;
        a(f7, f10, e(0.0f, 6.2831855f), e(0.0f, 28.0f) * f11, e(1.5f, 3.5f) * f11, e(0.35f, 0.6f), 2.0f);
    }
}
