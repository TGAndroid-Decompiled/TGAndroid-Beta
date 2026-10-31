package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class nf0 extends tk0 {
    public final rf.w f28785e3;
    public long f28786f3;
    public final tf0 f28787g3;

    public nf0(tf0 tf0Var, Context context) {
        super(context, null);
        this.f28787g3 = tf0Var;
        this.f28785e3 = new rf.w(8);
    }

    @Override
    public final boolean E0(float f7) {
        if (f7 >= this.f28787g3.f30565v1 + org.telegram.messenger.i0.f16020m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        tf0 tf0Var = this.f28787g3;
        if (tf0Var.C1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f28786f3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f28786f3 = elapsedRealtime;
            tf0Var.A1 += (((float) abs) * tf0Var.B1) / 1800.0f;
            while (true) {
                f7 = tf0Var.A1;
                float f10 = tf0Var.B1 * 2.0f;
                if (f7 < f10) {
                    break;
                }
                tf0Var.A1 = f7 - f10;
            }
            tf0Var.f30569z1.setTranslate(f7, 0.0f);
            tf0Var.f30568y1.setLocalMatrix(tf0Var.f30569z1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.f16021n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        rf.w wVar = this.f28785e3;
        wVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        wVar.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21019i5, this.f30625n2));
        wVar.draw(canvas);
    }
}
