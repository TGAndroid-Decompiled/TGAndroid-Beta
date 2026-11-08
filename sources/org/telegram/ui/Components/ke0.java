package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class ke0 extends pj0 {
    public final bg.c0 f35286e3;
    public long f35287f3;
    public final qe0 f35288g3;

    public ke0(qe0 qe0Var, Context context) {
        super(context, null);
        this.f35288g3 = qe0Var;
        this.f35286e3 = new bg.c0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.f35288g3.f37310v1 + org.telegram.messenger.g0.f22557m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        qe0 qe0Var = this.f35288g3;
        if (qe0Var.C1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f35287f3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f35287f3 = elapsedRealtime;
            qe0Var.A1 += (((float) abs) * qe0Var.B1) / 1800.0f;
            while (true) {
                f10 = qe0Var.A1;
                float f11 = qe0Var.B1 * 2.0f;
                if (f10 < f11) {
                    break;
                }
                qe0Var.A1 = f10 - f11;
            }
            qe0Var.f37314z1.setTranslate(f10, 0.0f);
            qe0Var.f37313y1.setLocalMatrix(qe0Var.f37314z1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.f22558n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.c0 c0Var = this.f35286e3;
        c0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        c0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27943i5, this.f36981n2));
        c0Var.draw(canvas);
    }
}
