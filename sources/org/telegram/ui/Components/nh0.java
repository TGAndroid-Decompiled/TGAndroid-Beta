package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class nh0 extends sm0 {
    public final yf.y V2;
    public long W2;
    public final uh0 X2;

    public nh0(uh0 uh0Var, Context context) {
        super(context, null);
        this.X2 = uh0Var;
        this.V2 = new yf.y(8);
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= this.X2.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        uh0 uh0Var = this.X2;
        if (uh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.W2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.W2 = elapsedRealtime;
            uh0Var.J += (((float) abs) * uh0Var.K) / 1800.0f;
            while (true) {
                f7 = uh0Var.J;
                float f10 = uh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                }
                uh0Var.J = f7 - f10;
            }
            uh0Var.I.setTranslate(f7, 0.0f);
            uh0Var.H.setLocalMatrix(uh0Var.I);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        yf.y yVar = this.V2;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20876i5, this.f30807n2));
        yVar.draw(canvas);
    }
}
