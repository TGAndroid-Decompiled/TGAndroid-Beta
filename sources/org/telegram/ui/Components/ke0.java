package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class ke0 extends pj0 {
    public final bg.c0 f35298e3;
    public long f35299f3;
    public final qe0 f35300g3;

    public ke0(qe0 qe0Var, Context context) {
        super(context, null);
        this.f35300g3 = qe0Var;
        this.f35298e3 = new bg.c0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.f35300g3.f37287y1 + org.telegram.messenger.g0.f22561m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        qe0 qe0Var = this.f35300g3;
        if (qe0Var.F1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f35299f3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f35299f3 = elapsedRealtime;
            qe0Var.D1 += (((float) abs) * qe0Var.E1) / 1800.0f;
            while (true) {
                f10 = qe0Var.D1;
                float f11 = qe0Var.E1 * 2.0f;
                if (f10 < f11) {
                    break;
                }
                qe0Var.D1 = f10 - f11;
            }
            qe0Var.C1.setTranslate(f10, 0.0f);
            qe0Var.B1.setLocalMatrix(qe0Var.C1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.f22562n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.c0 c0Var = this.f35298e3;
        c0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        c0Var.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27981i5, this.f36980n2));
        c0Var.draw(canvas);
    }
}
