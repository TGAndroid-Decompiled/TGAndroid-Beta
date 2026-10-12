package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i31 {
    public long f27042a;
    public boolean f27043b;
    public final ArrayList f27044c;
    public final ArrayList d;
    public final int f27045e;
    public boolean f27046f;
    public float f27047g;
    public float h;

    public i31() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        h31 h31Var;
        ArrayList arrayList = this.f27044c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            h31 h31Var2 = (h31) arrayList.get(i11);
            paint.setAlpha((int) (h31Var2.f26630f * 255.0f * f10));
            canvas.drawPoint(h31Var2.f26626a, h31Var2.f26627b, paint);
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
                h31Var = (h31) arrayList2.get(i10);
            } else {
                h31Var = new Object();
            }
            if (this.f27043b && this.f27046f) {
                float f11 = (i12 + 1) / clamp;
                h31Var.f26626a = AndroidUtilities.lerp(this.f27047g, centerX, f11);
                h31Var.f26627b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                h31Var.f26626a = centerX;
                h31Var.f26627b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            h31Var.f26628c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            h31 h31Var3 = h31Var;
            h31Var3.d = (float) hg.c.e(nextInt, d10, Math.sin(nextInt) * d11);
            h31Var3.f26630f = 1.0f;
            h31Var3.h = 0.0f;
            if (this.f27043b) {
                h31Var3.f26631g = Utilities.random.nextInt(200) + 600;
                h31Var3.f26629e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                h31Var3.f26631g = Utilities.random.nextInt(100) + 400;
                h31Var3.f26629e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(h31Var3);
            i12++;
            sin = d11;
            i10 = 0;
            z10 = true;
        }
        this.f27046f = z10;
        this.f27047g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f27042a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            h31 h31Var4 = (h31) arrayList.get(i13);
            float f12 = h31Var4.h;
            float f13 = h31Var4.f26631g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.f27045e) {
                    arrayList2.add(h31Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                h31Var4.f26630f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = h31Var4.f26626a;
                float f15 = h31Var4.f26628c;
                float f16 = h31Var4.f26629e;
                float f17 = (float) min;
                h31Var4.f26626a = a1.g.B(f15 * f16, f17, 200.0f, f14);
                h31Var4.f26627b = (((h31Var4.d * f16) * f17) / 200.0f) + h31Var4.f26627b;
                h31Var4.h += f17;
            }
            i13++;
        }
        this.f27042a = elapsedRealtime;
    }

    public i31(int i10) {
        this.f27044c = new ArrayList();
        this.d = new ArrayList();
        this.f27045e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
