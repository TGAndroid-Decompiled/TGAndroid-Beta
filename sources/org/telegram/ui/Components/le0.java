package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class le0 extends qj0 {
    public final bg.c0 f35696e3;
    public long f35697f3;
    public final re0 f35698g3;

    public le0(re0 re0Var, Context context) {
        super(context, null);
        this.f35698g3 = re0Var;
        this.f35696e3 = new bg.c0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.f35698g3.f37696v1 + org.telegram.messenger.g0.f22557m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        re0 re0Var = this.f35698g3;
        if (re0Var.C1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f35697f3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f35697f3 = elapsedRealtime;
            re0Var.A1 += (((float) abs) * re0Var.B1) / 1800.0f;
            while (true) {
                f10 = re0Var.A1;
                float f11 = re0Var.B1 * 2.0f;
                if (f10 < f11) {
                    break;
                }
                re0Var.A1 = f10 - f11;
            }
            re0Var.f37700z1.setTranslate(f10, 0.0f);
            re0Var.f37699y1.setLocalMatrix(re0Var.f37700z1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.f22558n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.c0 c0Var = this.f35696e3;
        c0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        c0Var.b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27956i5, this.f37381n2));
        c0Var.draw(canvas);
    }
}
