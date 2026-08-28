package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class mo0 extends org.telegram.ui.Components.wk0 {
    public final int T2;
    public final uo0 U2;

    public mo0(uo0 uo0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.U2 = uo0Var;
        this.T2 = i9;
    }

    @Override
    public final Integer W0(int i9) {
        uo0 uo0Var = this.U2;
        if ((i9 >= uo0Var.P && i9 < uo0Var.Q) || (i9 >= uo0Var.R && i9 < uo0Var.S)) {
            return 0;
        }
        return super.W0(i9);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        uo0 uo0Var = this.U2;
        O0(canvas, uo0Var.P, Math.max(uo0Var.S, uo0Var.Q) - 1, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, this.f34260l2), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        gh.n7 n7Var;
        super.onLayout(z10, i9, i10, i11, i12);
        uo0 uo0Var = this.U2;
        zo0 zo0Var = uo0Var.f43287f0;
        uo0.a(uo0Var);
        if (uo0Var.B != null) {
            if (uo0Var.A != null && uo0Var.c()) {
                uo0Var.A.g(false);
                return;
            }
            return;
        }
        if (this.T2 == 1) {
            n7Var = zo0Var.f45194c;
        } else {
            n7Var = zo0Var.f45193b;
        }
        if (n7Var != null && uo0Var.c()) {
            n7Var.a();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        uo0.a(this.U2);
    }
}
