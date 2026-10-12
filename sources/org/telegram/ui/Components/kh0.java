package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class kh0 extends mm0 {
    public final zf.z V2;
    public long W2;
    public final qh0 X2;

    public kh0(qh0 qh0Var, Context context) {
        super(context, null);
        this.X2 = qh0Var;
        this.V2 = new zf.z(8);
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
        qh0 qh0Var = this.X2;
        if (qh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.W2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.W2 = elapsedRealtime;
            qh0Var.J += (((float) abs) * qh0Var.K) / 1800.0f;
            while (true) {
                f7 = qh0Var.J;
                float f10 = qh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                }
                qh0Var.J = f7 - f10;
            }
            qh0Var.I.setTranslate(f7, 0.0f);
            qh0Var.H.setLocalMatrix(qh0Var.I);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        zf.z zVar = this.V2;
        zVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        zVar.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19989i5, this.f27439n2));
        zVar.draw(canvas);
    }
}
