package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class me0 extends tj0 {
    public final cg.b0 f36142f3;
    public long f36143g3;
    public final se0 f36144h3;

    public me0(se0 se0Var, Context context) {
        super(context, null);
        this.f36144h3 = se0Var;
        this.f36142f3 = new cg.b0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.f36144h3.f38000w1 + org.telegram.messenger.g0.f22602m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        se0 se0Var = this.f36144h3;
        if (se0Var.D1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f36143g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f36143g3 = elapsedRealtime;
            se0Var.B1 += (((float) abs) * se0Var.C1) / 1800.0f;
            while (true) {
                f10 = se0Var.B1;
                float f11 = se0Var.C1 * 2.0f;
                if (f10 < f11) {
                    break;
                }
                se0Var.B1 = f10 - f11;
            }
            se0Var.A1.setTranslate(f10, 0.0f);
            se0Var.f38003z1.setLocalMatrix(se0Var.A1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.f22603n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        cg.b0 b0Var = this.f36142f3;
        b0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        b0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27971i5, this.f38460o2));
        b0Var.draw(canvas);
    }
}
