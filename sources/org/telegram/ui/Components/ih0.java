package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class ih0 extends nm0 {
    public final ag.h0 f29334f3;
    public long f29335g3;
    public final oh0 f29336h3;

    public ih0(oh0 oh0Var, Context context) {
        super(context, null);
        this.f29336h3 = oh0Var;
        this.f29334f3 = new ag.h0(8);
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= this.f29336h3.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        oh0 oh0Var = this.f29336h3;
        if (oh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f29335g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f29335g3 = elapsedRealtime;
            oh0Var.J += (((float) abs) * oh0Var.K) / 1800.0f;
            while (true) {
                f7 = oh0Var.J;
                float f10 = oh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                }
                oh0Var.J = f7 - f10;
            }
            oh0Var.I.setTranslate(f7, 0.0f);
            oh0Var.H.setLocalMatrix(oh0Var.I);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        ag.h0 h0Var = this.f29334f3;
        h0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        h0Var.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i5, this.f30988n2));
        h0Var.draw(canvas);
    }
}
