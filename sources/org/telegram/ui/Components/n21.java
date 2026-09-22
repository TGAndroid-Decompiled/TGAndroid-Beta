package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n21 {
    public long f26599a;
    public boolean f26600b;
    public final ArrayList f26601c;
    public final ArrayList d;
    public final int e;
    public boolean f26602f;
    public float f26603g;
    public float h;

    public n21() {
        this(40);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        m21 m21Var;
        ArrayList arrayList = this.f26601c;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            m21 m21Var2 = (m21) arrayList.get(i11);
            paint.setAlpha((int) (m21Var2.f26294f * 255.0f * f10));
            canvas.drawPoint(m21Var2.f26291a, m21Var2.f26292b, paint);
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
                m21Var = (m21) arrayList2.get(i10);
            } else {
                m21Var = new Object();
            }
            if (this.f26600b && this.f26602f) {
                float f11 = (i12 + 1) / clamp;
                m21Var.f26291a = AndroidUtilities.lerp(this.f26603g, centerX, f11);
                m21Var.f26292b = AndroidUtilities.lerp(this.h, centerY, f11);
            } else {
                m21Var.f26291a = centerX;
                m21Var.f26292b = centerY;
            }
            double d11 = sin;
            double nextInt = (Utilities.random.nextInt(140) - 70) * 0.017453292519943295d;
            if (nextInt < 0.0d) {
                nextInt += 6.283185307179586d;
            }
            m21Var.f26293c = (float) ((Math.cos(nextInt) * d11) - (Math.sin(nextInt) * d10));
            m21 m21Var3 = m21Var;
            m21Var3.d = (float) hg.k0.e(nextInt, d10, Math.sin(nextInt) * d11);
            m21Var3.f26294f = 1.0f;
            m21Var3.h = 0.0f;
            if (this.f26600b) {
                m21Var3.f26295g = Utilities.random.nextInt(200) + 600;
                m21Var3.e = (Utilities.random.nextFloat() * 20.0f) + 30.0f;
            } else {
                m21Var3.f26295g = Utilities.random.nextInt(100) + 400;
                m21Var3.e = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
            }
            arrayList.add(m21Var3);
            i12++;
            sin = d11;
            i10 = 0;
        }
        this.f26602f = true;
        this.f26603g = centerX;
        this.h = centerY;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(20L, elapsedRealtime - this.f26599a);
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            m21 m21Var4 = (m21) arrayList.get(i13);
            float f12 = m21Var4.h;
            float f13 = m21Var4.f26295g;
            if (f12 >= f13) {
                if (arrayList2.size() < this.e) {
                    arrayList2.add(m21Var4);
                }
                arrayList.remove(i13);
                i13--;
                size2--;
            } else {
                m21Var4.f26294f = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f12 / f13);
                float f14 = m21Var4.f26291a;
                float f15 = m21Var4.f26293c;
                float f16 = m21Var4.e;
                float f17 = (float) min;
                m21Var4.f26291a = a4.a.A(f15 * f16, f17, 200.0f, f14);
                m21Var4.f26292b = (((m21Var4.d * f16) * f17) / 200.0f) + m21Var4.f26292b;
                m21Var4.h += f17;
            }
            i13++;
        }
        this.f26599a = elapsedRealtime;
    }

    public n21(int i10) {
        this.f26601c = new ArrayList();
        this.d = new ArrayList();
        this.e = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            this.d.add(new Object());
        }
    }
}
