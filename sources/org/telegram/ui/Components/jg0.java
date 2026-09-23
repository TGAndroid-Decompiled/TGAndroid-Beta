package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class jg0 extends ml0 {
    public final yf.y X2;
    public long Y2;
    public final qg0 Z2;

    public jg0(qg0 qg0Var, Context context) {
        super(context, null);
        this.Z2 = qg0Var;
        this.X2 = new yf.y(8);
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
        qg0 qg0Var = this.Z2;
        if (qg0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.Y2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.Y2 = elapsedRealtime;
            qg0Var.J += (((float) abs) * qg0Var.K) / 1800.0f;
            while (true) {
                f7 = qg0Var.J;
                float f10 = qg0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                }
                qg0Var.J = f7 - f10;
            }
            qg0Var.I.setTranslate(f7, 0.0f);
            qg0Var.H.setLocalMatrix(qg0Var.I);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        yf.y yVar = this.X2;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18877i5, this.f26222p2));
        yVar.draw(canvas);
    }
}
