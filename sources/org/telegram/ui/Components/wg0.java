package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class wg0 extends zl0 {
    public final yf.y f29958e3;
    public long f29959f3;
    public final dh0 f29960g3;

    public wg0(dh0 dh0Var, Context context) {
        super(context, null);
        this.f29960g3 = dh0Var;
        this.f29958e3 = new yf.y(8);
    }

    @Override
    public final boolean F0(float f7) {
        if (f7 >= this.f29960g3.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        dh0 dh0Var = this.f29960g3;
        if (dh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f29959f3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f29959f3 = elapsedRealtime;
            dh0Var.J += (((float) abs) * dh0Var.K) / 1800.0f;
            while (true) {
                f7 = dh0Var.J;
                float f10 = dh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                }
                dh0Var.J = f7 - f10;
            }
            dh0Var.I.setTranslate(f7, 0.0f);
            dh0Var.H.setLocalMatrix(dh0Var.I);
            h1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        yf.y yVar = this.f29958e3;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19164i5, this.f31015p2));
        yVar.draw(canvas);
    }
}
