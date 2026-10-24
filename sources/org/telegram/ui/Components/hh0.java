package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class hh0 extends lm0 {
    public final zf.y Y2;
    public long Z2;
    public final nh0 f27035a3;

    public hh0(nh0 nh0Var, Context context) {
        super(context, null);
        this.f27035a3 = nh0Var;
        this.Y2 = new zf.y(8);
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= this.f27035a3.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        nh0 nh0Var = this.f27035a3;
        if (nh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.Z2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.Z2 = elapsedRealtime;
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
        zf.y yVar = this.Y2;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21272i5, this.f28396n2));
        yVar.draw(canvas);
    }
}
