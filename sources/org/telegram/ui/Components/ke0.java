package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class ke0 extends pj0 {
    public final bg.c0 f35269e3;
    public long f35270f3;
    public final qe0 f35271g3;

    public ke0(qe0 qe0Var, Context context) {
        super(context, null);
        this.f35271g3 = qe0Var;
        this.f35269e3 = new bg.c0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.f35271g3.f37285v1 + org.telegram.messenger.g0.f22531m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        qe0 qe0Var = this.f35271g3;
        if (qe0Var.C1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f35270f3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f35270f3 = elapsedRealtime;
            qe0Var.A1 += (((float) abs) * qe0Var.B1) / 1800.0f;
            while (true) {
                f10 = qe0Var.A1;
                float f11 = qe0Var.B1 * 2.0f;
                if (f10 < f11) {
                    break;
                }
                qe0Var.A1 = f10 - f11;
            }
            qe0Var.f37289z1.setTranslate(f10, 0.0f);
            qe0Var.f37288y1.setLocalMatrix(qe0Var.f37289z1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.f22532n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.c0 c0Var = this.f35269e3;
        c0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        c0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27939i5, this.f36939n2));
        c0Var.draw(canvas);
    }
}
