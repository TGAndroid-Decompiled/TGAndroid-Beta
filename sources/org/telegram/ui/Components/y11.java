package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class y11 {
    public long f30082a;
    public boolean f30083b;
    public final ArrayList f30084c;
    public final ArrayList d;
    public final int e;
    public boolean f30085f;
    public float f30086g;
    public float h;

    public y11() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        x11 x11Var;
        ArrayList arrayList = this.f30084c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            x11 x11Var2 = (x11) arrayList.get(i11);
            paint.setAlpha((int) (x11Var2.f29820f * 255.0f * f10));
            canvas.drawPoint(x11Var2.f29817a, x11Var2.f29818b, paint);
        }
        double d = (f7 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d10 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d10) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        int clamp = Utilities.clamp(arrayList2.size() / 12, 3, 1);
        int i12 = 0;
        while (i12 < clamp) {
            if (!arrayList2.isEmpty()) {
                arrayList2.remove(i10);
                x11Var = (x11) arrayList2.get(i10);
            } else {
                x11Var = new Object();
            }
            if (this.f30083b && this.f30085f) {
                float f11 = (i12 + 1) / clamp;
                x11Var.f29817a = AndroidUtilities.lerp(this.f30086g, centerX, f11);
                x11Var.f29818b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                x11Var.f29817a = centerX;
                x11Var.f29818b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            x11Var.f29819c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            x11 x11Var3 = x11Var;
            x11Var3.d = (float) hg.k0.e(nextInt, d10, Math.sin(nextInt) * d11);
            x11Var3.f29820f = 1.0f;
            x11Var3.h = 0.0f;
            if (this.f30083b) {
                x11Var3.f29821g = Utilities.random.nextInt(200) + 600;
                x11Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                x11Var3.f29821g = Utilities.random.nextInt(100) + 400;
                x11Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(x11Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f30085f = true;
        this.f30086g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f30082a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            x11 x11Var4 = (x11) arrayList.get(i13);
            float f12 = x11Var4.h;
            float f13 = x11Var4.f29821g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(x11Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                x11Var4.f29820f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = x11Var4.f29817a;
                float f15 = x11Var4.f29819c;
                float f16 = x11Var4.e;
                float f17 = (float) min;
                x11Var4.f29817a = a4.a.A(f15 * f16, f17, 200.0f, f14);
                x11Var4.f29818b = (((x11Var4.d * f16) * f17) / 200.0f) + x11Var4.f29818b;
                x11Var4.h += f17;
            }
            i13++;
        }
        this.f30082a = elapsedRealtime;
    }

    public y11(int i10) {
        this.f30084c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
