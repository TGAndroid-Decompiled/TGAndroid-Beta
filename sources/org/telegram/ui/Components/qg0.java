package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class qg0 extends rl0 {
    public final kf.b0 U2;
    public long V2;
    public final wg0 W2;

    public qg0(wg0 wg0Var, Context context) {
        super(context, null);
        this.W2 = wg0Var;
        this.U2 = new kf.b0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.W2.B + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        wg0 wg0Var = this.W2;
        if (wg0Var.I) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.V2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.V2 = elapsedRealtime;
            wg0Var.G += (((float) abs) * wg0Var.H) / 1800.0f;
            while (true) {
                f10 = wg0Var.G;
                float f11 = wg0Var.H * 2.0f;
                if (f10 < f11) {
                    break;
                }
                wg0Var.G = f10 - f11;
            }
            wg0Var.F.setTranslate(f10, 0.0f);
            wg0Var.E.setLocalMatrix(wg0Var.F);
            e1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        kf.b0 b0Var = this.U2;
        b0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        b0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19970i5, this.f28511m2));
        b0Var.draw(canvas);
    }
}
