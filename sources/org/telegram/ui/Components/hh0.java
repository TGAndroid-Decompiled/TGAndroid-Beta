package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class hh0 extends mm0 {
    public final ag.h0 f28967f3;
    public long f28968g3;
    public final nh0 f28969h3;

    public hh0(nh0 nh0Var, Context context) {
        super(context, null);
        this.f28969h3 = nh0Var;
        this.f28967f3 = new ag.h0(8);
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= this.f28969h3.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        nh0 nh0Var = this.f28969h3;
        if (nh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f28968g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f28968g3 = elapsedRealtime;
            nh0Var.J += (((float) abs) * nh0Var.K) / 1800.0f;
            while (true) {
                f7 = nh0Var.J;
                float f10 = nh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                }
                nh0Var.J = f7 - f10;
            }
            nh0Var.I.setTranslate(f7, 0.0f);
            nh0Var.H.setLocalMatrix(nh0Var.I);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        ag.h0 h0Var = this.f28967f3;
        h0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        h0Var.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23445i5, this.f30644n2));
        h0Var.draw(canvas);
    }
}
