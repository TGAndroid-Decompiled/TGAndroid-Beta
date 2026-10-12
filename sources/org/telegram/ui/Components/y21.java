package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class y21 {
    public long f31458a;
    public boolean f31459b;
    public final ArrayList f31460c;
    public final ArrayList d;
    public final int e;
    public boolean f31461f;
    public float f31462g;
    public float h;

    public y21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        x21 x21Var;
        ArrayList arrayList = this.f31460c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            x21 x21Var2 = (x21) arrayList.get(i11);
            paint.setAlpha((int) (x21Var2.f31145f * 255.0f * f10));
            canvas.drawPoint(x21Var2.f31142a, x21Var2.f31143b, paint);
        }
        double d = (f7 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d10 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d10) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        ArrayList arrayList2 = this.d;
        boolean z10 = true;
        int clamp = Utilities.clamp(arrayList2.size() / 12, 3, 1);
        int i12 = 0;
        while (i12 < clamp) {
            if (!arrayList2.isEmpty()) {
                arrayList2.remove(i10);
                x21Var = (x21) arrayList2.get(i10);
            } else {
                x21Var = new Object();
            }
            if (this.f31459b && this.f31461f) {
                float f11 = (i12 + 1) / clamp;
                x21Var.f31142a = AndroidUtilities.lerp(this.f31462g, centerX, f11);
                x21Var.f31143b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                x21Var.f31142a = centerX;
                x21Var.f31143b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            x21Var.f31144c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            x21 x21Var3 = x21Var;
            x21Var3.d = (float) org.telegram.messenger.q.a(nextInt, d10, Math.sin(nextInt) * d11);
            x21Var3.f31145f = 1.0f;
            x21Var3.h = 0.0f;
            if (this.f31459b) {
                x21Var3.f31146g = Utilities.random.nextInt(200) + 600;
                x21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                x21Var3.f31146g = Utilities.random.nextInt(100) + 400;
                x21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(x21Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f31461f = z10;
        this.f31462g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f31458a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            x21 x21Var4 = (x21) arrayList.get(i13);
            float f12 = x21Var4.h;
            float f13 = x21Var4.f31146g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(x21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                x21Var4.f31145f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = x21Var4.f31142a;
                float f15 = x21Var4.f31144c;
                float f16 = x21Var4.e;
                float f17 = (float) min;
                x21Var4.f31142a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                x21Var4.f31143b = (((x21Var4.d * f16) * f17) / 200.0f) + x21Var4.f31143b;
                x21Var4.h += f17;
            }
            i13++;
        }
        this.f31458a = elapsedRealtime;
    }

    public y21(int i10) {
        this.f31460c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
