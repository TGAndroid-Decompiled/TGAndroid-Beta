package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g31 {
    public long f28399a;
    public boolean f28400b;
    public final ArrayList f28401c;
    public final ArrayList d;
    public final int e;
    public boolean f28402f;
    public float f28403g;
    public float h;

    public g31() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        f31 f31Var;
        ArrayList arrayList = this.f28401c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            f31 f31Var2 = (f31) arrayList.get(i11);
            paint.setAlpha((int) (f31Var2.f28056f * 255.0f * f10));
            canvas.drawPoint(f31Var2.f28053a, f31Var2.f28054b, paint);
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
                f31Var = (f31) arrayList2.get(i10);
            } else {
                f31Var = new Object();
            }
            if (this.f28400b && this.f28402f) {
                float f11 = (i12 + 1) / clamp;
                f31Var.f28053a = AndroidUtilities.lerp(this.f28403g, centerX, f11);
                f31Var.f28054b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                f31Var.f28053a = centerX;
                f31Var.f28054b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            f31Var.f28055c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            f31 f31Var3 = f31Var;
            f31Var3.d = (float) org.telegram.messenger.t.a(nextInt, d10, Math.sin(nextInt) * d11);
            f31Var3.f28056f = 1.0f;
            f31Var3.h = 0.0f;
            if (this.f28400b) {
                f31Var3.f28057g = Utilities.random.nextInt(200) + 600;
                f31Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                f31Var3.f28057g = Utilities.random.nextInt(100) + 400;
                f31Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(f31Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f28402f = z10;
        this.f28403g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f28399a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            f31 f31Var4 = (f31) arrayList.get(i13);
            float f12 = f31Var4.h;
            float f13 = f31Var4.f28057g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(f31Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                f31Var4.f28056f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = f31Var4.f28053a;
                float f15 = f31Var4.f28055c;
                float f16 = f31Var4.e;
                float f17 = (float) min;
                f31Var4.f28053a = a1.g.C(f15 * f16, f17, 200.0f, f14);
                f31Var4.f28054b = (((f31Var4.d * f16) * f17) / 200.0f) + f31Var4.f28054b;
                f31Var4.h += f17;
            }
            i13++;
        }
        this.f28399a = elapsedRealtime;
    }

    public g31(int i10) {
        this.f28401c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
