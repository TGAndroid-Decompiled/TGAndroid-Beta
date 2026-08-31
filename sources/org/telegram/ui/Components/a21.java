package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a21 {
    public long f25136a;
    public boolean f25137b;
    public final ArrayList f25138c;
    public final ArrayList d;
    public final int f25139e;
    public boolean f25140f;
    public float f25141g;
    public float h;

    public a21() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        z11 z11Var;
        ArrayList arrayList = this.f25138c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            z11 z11Var2 = (z11) arrayList.get(i11);
            paint.setAlpha((int) (z11Var2.f33696f * 255.0f * f11));
            canvas.drawPoint(z11Var2.f33692a, z11Var2.f33693b, paint);
        }
        double d = (f10 - 90.0f) * 0.017453292519943295d;
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
                z11Var = (z11) arrayList2.get(i10);
            } else {
                z11Var = new Object();
            }
            if (this.f25137b && this.f25140f) {
                float f12 = (i12 + 1) / clamp;
                z11Var.f33692a = AndroidUtilities.lerp(this.f25141g, centerX, f12);
                z11Var.f33693b = AndroidUtilities.lerp(this.h, centerY, f12);
            } else {
                z11Var.f33692a = centerX;
                z11Var.f33693b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            z11Var.f33694c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            z11 z11Var3 = z11Var;
            z11Var3.d = (float) l.d.a(nextInt, d10, Math.sin(nextInt) * d11);
            z11Var3.f33696f = 1.0f;
            z11Var3.h = 0.0f;
            if (this.f25137b) {
                z11Var3.f33697g = Utilities.random.nextInt(200) + 600;
                z11Var3.f33695e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                z11Var3.f33697g = Utilities.random.nextInt(100) + 400;
                z11Var3.f33695e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(z11Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f25140f = true;
        this.f25141g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f25136a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            z11 z11Var4 = (z11) arrayList.get(i13);
            float f13 = z11Var4.h;
            float f14 = z11Var4.f33697g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f25139e) {
                    arrayList2.add(z11Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                z11Var4.f33696f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f13 / f14);
                float f15 = z11Var4.f33692a;
                float f16 = z11Var4.f33694c;
                float f17 = z11Var4.f33695e;
                float f18 = (float) min;
                z11Var4.f33692a = android.support.v4.media.a.d(f16 * f17, f18, 200.0f, f15);
                z11Var4.f33693b = (((z11Var4.d * f17) * f18) / 200.0f) + z11Var4.f33693b;
                z11Var4.h += f18;
            }
            i13++;
        }
        this.f25136a = elapsedRealtime;
    }

    public a21(int i10) {
        this.f25138c = new ArrayList();
        this.d = new ArrayList();
        this.f25139e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
