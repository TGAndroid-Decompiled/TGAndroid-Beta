package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class ye0 extends ek0 {
    public final bg.d0 f42437f3;
    public long f42438g3;
    public final ef0 f42439h3;

    public ye0(ef0 ef0Var, Context context) {
        super(context, null);
        this.f42439h3 = ef0Var;
        this.f42437f3 = new bg.d0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.f42439h3.f34714z1 + org.telegram.messenger.g0.f24220m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ef0 ef0Var = this.f42439h3;
        if (ef0Var.G1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f42438g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f42438g3 = elapsedRealtime;
            ef0Var.E1 += (((float) abs) * ef0Var.F1) / 1800.0f;
            while (true) {
                f10 = ef0Var.E1;
                float f11 = ef0Var.F1 * 2.0f;
                if (f10 < f11) {
                    break;
                }
                ef0Var.E1 = f10 - f11;
            }
            ef0Var.D1.setTranslate(f10, 0.0f);
            ef0Var.C1.setLocalMatrix(ef0Var.D1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.f24221n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.d0 d0Var = this.f42437f3;
        d0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        d0Var.b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29542i5, this.f34767o2));
        d0Var.draw(canvas);
    }
}
