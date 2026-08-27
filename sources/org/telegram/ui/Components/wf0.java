package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

public final class wf0 extends zk0 {
    public final gf.c0 T2;
    public long U2;
    public final cg0 V2;

    public wf0(cg0 cg0Var, Context context) {
        super(context, null);
        this.V2 = cg0Var;
        this.T2 = new gf.c0(8);
    }

    @Override
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.V2.A + AndroidUtilities.statusBarHeight));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        cg0 cg0Var = this.V2;
        if (cg0Var.H) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jAbs = Math.abs(this.U2 - jElapsedRealtime);
            if (jAbs > 17) {
                jAbs = 16;
            }
            this.U2 = jElapsedRealtime;
            cg0Var.F += (jAbs * cg0Var.G) / 1800.0f;
            while (true) {
                f10 = cg0Var.F;
                float f11 = cg0Var.G * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    cg0Var.F = f10 - f11;
                }
            }
            cg0Var.E.setTranslate(f10, 0.0f);
            cg0Var.D.setLocalMatrix(cg0Var.E);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        gf.c0 c0Var = this.T2;
        c0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        c0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23143i5, this.f35277l2));
        c0Var.draw(canvas);
    }
}
