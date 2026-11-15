package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class ne0 extends uj0 {
    public final bg.c0 f37555f3;
    public long f37556g3;
    public final te0 f37557h3;

    public ne0(te0 te0Var, Context context) {
        super(context, null);
        this.f37557h3 = te0Var;
        this.f37555f3 = new bg.c0(8);
    }

    @Override
    public final boolean E0(float f10) {
        if (f10 >= this.f37557h3.f39689z1 + org.telegram.messenger.g0.f23605m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        te0 te0Var = this.f37557h3;
        if (te0Var.G1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f37556g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f37556g3 = elapsedRealtime;
            te0Var.E1 += (((float) abs) * te0Var.F1) / 1800.0f;
            while (true) {
                f10 = te0Var.E1;
                float f11 = te0Var.F1 * 2.0f;
                if (f10 < f11) {
                    break;
                }
                te0Var.E1 = f10 - f11;
            }
            te0Var.D1.setTranslate(f10, 0.0f);
            te0Var.C1.setLocalMatrix(te0Var.D1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.f23606n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.c0 c0Var = this.f37555f3;
        c0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        c0Var.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28940i5, this.f40069o2));
        c0Var.draw(canvas);
    }
}
