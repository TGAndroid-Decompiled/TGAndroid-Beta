package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class jg0 extends ll0 {
    public final yf.z X2;
    public long Y2;
    public final pg0 Z2;

    public jg0(pg0 pg0Var, Context context) {
        super(context, null);
        this.Z2 = pg0Var;
        this.X2 = new yf.z(8);
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= this.Z2.E + AndroidUtilities.statusBarHeight) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        pg0 pg0Var = this.Z2;
        if (pg0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.Y2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.Y2 = elapsedRealtime;
            pg0Var.J += (((float) abs) * pg0Var.K) / 1800.0f;
            while (true) {
                f7 = pg0Var.J;
                float f10 = pg0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                }
                pg0Var.J = f7 - f10;
            }
            pg0Var.I.setTranslate(f7, 0.0f);
            pg0Var.H.setLocalMatrix(pg0Var.I);
            e1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        yf.z zVar = this.X2;
        zVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        zVar.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20752i5, this.f28224p2));
        zVar.draw(canvas);
    }
}
