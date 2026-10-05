package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class wg0 extends zl0 {
    public final yf.y f32642e3;
    public long f32643f3;
    public final ch0 f32644g3;

    public wg0(ch0 ch0Var, Context context) {
        super(context, null);
        this.f32644g3 = ch0Var;
        this.f32642e3 = new yf.y(8);
    }

    @Override
    public final boolean F0(float f7) {
        if (f7 >= this.f32644g3.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ch0 ch0Var = this.f32644g3;
        if (ch0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f32643f3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f32643f3 = elapsedRealtime;
            ch0Var.J += (((float) abs) * ch0Var.K) / 1800.0f;
            while (true) {
                f7 = ch0Var.J;
                float f10 = ch0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                }
                ch0Var.J = f7 - f10;
            }
            ch0Var.I.setTranslate(f7, 0.0f);
            ch0Var.H.setLocalMatrix(ch0Var.I);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        yf.y yVar = this.f32642e3;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20917i5, this.f33560p2));
        yVar.draw(canvas);
    }
}
