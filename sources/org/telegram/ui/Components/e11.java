package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class e11 {

    public long f27923a;

    public boolean f27924b;

    public final ArrayList f27925c;
    public final ArrayList d;

    public final int f27926e;

    public boolean f27927f;

    public float f27928g;
    public float h;

    public e11() {
        this(40);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        d11 d11Var;
        ArrayList arrayList = this.f27925c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            d11 d11Var2 = (d11) arrayList.get(i11);
            paint.setAlpha((int) (d11Var2.f27611f * 255.0f * f11));
            canvas.drawPoint(d11Var2.f27607a, d11Var2.f27608b, paint);
        }
        double d = ((double) (f10 - 90.0f)) * 0.017453292519943295d;
        double dSin = Math.sin(d);
        double d10 = -Math.cos(d);
        double dWidth = rectF.width() / 2.0f;
        float fCenterX = (float) (((-d10) * dWidth) + ((double) rectF.centerX()));
        float fCenterY = (float) ((dWidth * dSin) + ((double) rectF.centerY()));
        ArrayList arrayList2 = this.d;
        int iClamp = Utilities.clamp(arrayList2.size() / 12, 3, 1);
        int i12 = 0;
        while (i12 < iClamp) {
            if (arrayList2.isEmpty()) {
                d11Var = new d11();
            } else {
                d11Var = (d11) arrayList2.get(i10);
                arrayList2.remove(i10);
            }
            if (this.f27924b && this.f27927f) {
                float f12 = (i12 + 1) / iClamp;
                d11Var.f27607a = AndroidUtilities.lerp(this.f27928g, fCenterX, f12);
                d11Var.f27608b = AndroidUtilities.lerp(this.h, fCenterY, f12);
            } else {
                d11Var.f27607a = fCenterX;
                d11Var.f27608b = fCenterY;
            }
            double d11 = dSin;
            double dNextInt = ((double) (Utilities.random.nextInt(140) - 70)) * 0.017453292519943295d;
            if (dNextInt < 0.0d) {
                dNextInt += 6.283185307179586d;
            }
            d11Var.f27609c = (float) ((Math.cos(dNextInt) * d11) - (Math.sin(dNextInt) * d10));
            d11 d11Var3 = d11Var;
            d11Var3.d = (float) i0.a.b(dNextInt, d10, Math.sin(dNextInt) * d11);
            d11Var3.f27611f = 1.0f;
            d11Var3.h = 0.0f;
            if (this.f27924b) {
                d11Var3.f27612g = Utilities.random.nextInt(200) + 600;
                d11Var3.f27610e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                d11Var3.f27612g = Utilities.random.nextInt(100) + 400;
                d11Var3.f27610e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(d11Var3);
            i12++;
            dSin = d11;
            i10 = 0;
        }
        this.f27927f = true;
        this.f27928g = fCenterX;
        this.h = fCenterY;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMin = Math.min(20L, jElapsedRealtime - this.f27923a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            d11 d11Var4 = (d11) arrayList.get(i13);
            float f13 = d11Var4.h;
            float f14 = d11Var4.f27612g;
            if (f13 >= f14) {
                if (arrayList2.size() < this.f27926e) {
                    arrayList2.add(d11Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                d11Var4.f27611f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f13 / f14);
                float f15 = d11Var4.f27607a;
                float f16 = d11Var4.f27609c;
                float f17 = d11Var4.f27610e;
                float f18 = jMin;
                d11Var4.f27607a = a9.p.d(f16 * f17, f18, 200.0f, f15);
                d11Var4.f27608b = (((d11Var4.d * f17) * f18) / 200.0f) + d11Var4.f27608b;
                d11Var4.h += f18;
            }
            i13++;
        }
        this.f27923a = jElapsedRealtime;
    }

    public e11(int i10) {
        this.f27925c = new ArrayList();
        this.d = new ArrayList();
        this.f27926e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new d11());
        }
    }
}
