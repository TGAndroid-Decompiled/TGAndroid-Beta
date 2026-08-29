package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class fg0 extends jl0 {
    public final jf.b0 T2;
    public long U2;
    public final lg0 V2;

    public fg0(lg0 lg0Var, Context context) {
        super(context, null);
        this.V2 = lg0Var;
        this.T2 = new jf.b0(8);
    }

    @Override
    public final boolean E0(float f9) {
        if (f9 >= this.V2.A + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        lg0 lg0Var = this.V2;
        if (lg0Var.H) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.U2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.U2 = elapsedRealtime;
            lg0Var.F += (((float) abs) * lg0Var.G) / 1800.0f;
            while (true) {
                f9 = lg0Var.F;
                float f10 = lg0Var.G * 2.0f;
                if (f9 < f10) {
                    break;
                }
                lg0Var.F = f9 - f10;
            }
            lg0Var.E.setTranslate(f9, 0.0f);
            lg0Var.D.setLocalMatrix(lg0Var.E);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        jf.b0 b0Var = this.T2;
        b0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        b0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23151i5, this.f29709l2));
        b0Var.draw(canvas);
    }
}
