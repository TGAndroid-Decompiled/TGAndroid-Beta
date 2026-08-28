package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class uf0 extends wk0 {
    public final ff.c0 T2;
    public long U2;
    public final ag0 V2;

    public uf0(ag0 ag0Var, Context context) {
        super(context, null);
        this.V2 = ag0Var;
        this.T2 = new ff.c0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.V2.A + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ag0 ag0Var = this.V2;
        if (ag0Var.H) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.U2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.U2 = elapsedRealtime;
            ag0Var.F += (((float) abs) * ag0Var.G) / 1800.0f;
            while (true) {
                f10 = ag0Var.F;
                float f11 = ag0Var.G * 2.0f;
                if (f10 < f11) {
                    break;
                }
                ag0Var.F = f10 - f11;
            }
            ag0Var.E.setTranslate(f10, 0.0f);
            ag0Var.D.setLocalMatrix(ag0Var.E);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        ff.c0 c0Var = this.T2;
        c0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        c0Var.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23091i5, this.f34260l2));
        c0Var.draw(canvas);
    }
}
