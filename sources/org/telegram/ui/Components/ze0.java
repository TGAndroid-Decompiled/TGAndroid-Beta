package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class ze0 extends ek0 {
    public final bg.d0 f42747f3;
    public long f42748g3;
    public final ff0 f42749h3;

    public ze0(ff0 ff0Var, Context context) {
        super(context, null);
        this.f42749h3 = ff0Var;
        this.f42747f3 = new bg.d0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.f42749h3.f35205z1 + org.telegram.messenger.g0.f24004m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ff0 ff0Var = this.f42749h3;
        if (ff0Var.G1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f42748g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f42748g3 = elapsedRealtime;
            ff0Var.E1 += (((float) abs) * ff0Var.F1) / 1800.0f;
            while (true) {
                f10 = ff0Var.E1;
                float f11 = ff0Var.F1 * 2.0f;
                if (f10 < f11) {
                    break;
                }
                ff0Var.E1 = f10 - f11;
            }
            ff0Var.D1.setTranslate(f10, 0.0f);
            ff0Var.C1.setLocalMatrix(ff0Var.D1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.f24005n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.d0 d0Var = this.f42747f3;
        d0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        d0Var.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29438i5, this.f34859o2));
        d0Var.draw(canvas);
    }
}
