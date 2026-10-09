package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class lh0 extends qm0 {
    public final yf.y V2;
    public long W2;
    public final sh0 X2;

    public lh0(sh0 sh0Var, Context context) {
        super(context, null);
        this.X2 = sh0Var;
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
        sh0 sh0Var = this.X2;
        if (sh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.W2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.W2 = elapsedRealtime;
            sh0Var.J += (((float) abs) * sh0Var.K) / 1800.0f;
            while (true) {
                f7 = sh0Var.J;
                float f10 = sh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                }
                sh0Var.J = f7 - f10;
            }
            sh0Var.I.setTranslate(f7, 0.0f);
            sh0Var.H.setLocalMatrix(sh0Var.I);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        yf.y yVar = this.V2;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20887i5, this.f30216n2));
        yVar.draw(canvas);
    }
}
