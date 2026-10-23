package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class fh0 extends jm0 {
    public final zf.y V2;
    public long W2;
    public final lh0 X2;

    public fh0(lh0 lh0Var, Context context) {
        super(context, null);
        this.X2 = lh0Var;
        this.V2 = new zf.y(8);
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
        lh0 lh0Var = this.X2;
        if (lh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.W2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.W2 = elapsedRealtime;
            lh0Var.J += (((float) abs) * lh0Var.K) / 1800.0f;
            while (true) {
                f7 = lh0Var.J;
                float f10 = lh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                }
                lh0Var.J = f7 - f10;
            }
            lh0Var.I.setTranslate(f7, 0.0f);
            lh0Var.H.setLocalMatrix(lh0Var.I);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        zf.y yVar = this.V2;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i5, this.f27583n2));
        yVar.draw(canvas);
    }
}
