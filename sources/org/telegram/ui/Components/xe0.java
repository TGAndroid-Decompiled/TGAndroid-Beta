package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class xe0 extends ck0 {
    public final bg.d0 f41991f3;
    public long f41992g3;
    public final df0 f41993h3;

    public xe0(df0 df0Var, Context context) {
        super(context, null);
        this.f41993h3 = df0Var;
        this.f41991f3 = new bg.d0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.f41993h3.f34432z1 + org.telegram.messenger.g0.f24112m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        df0 df0Var = this.f41993h3;
        if (df0Var.G1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f41992g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f41992g3 = elapsedRealtime;
            df0Var.E1 += (((float) abs) * df0Var.F1) / 1800.0f;
            while (true) {
                f10 = df0Var.E1;
                float f11 = df0Var.F1 * 2.0f;
                if (f10 < f11) {
                    break;
                }
                df0Var.E1 = f10 - f11;
            }
            df0Var.D1.setTranslate(f10, 0.0f);
            df0Var.C1.setLocalMatrix(df0Var.D1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.f24113n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.d0 d0Var = this.f41991f3;
        d0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        d0Var.b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29485i5, this.f34074o2));
        d0Var.draw(canvas);
    }
}
