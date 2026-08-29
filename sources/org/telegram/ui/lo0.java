package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class lo0 extends org.telegram.ui.Components.jl0 {
    public final int T2;
    public final to0 U2;

    public lo0(to0 to0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.U2 = to0Var;
        this.T2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        to0 to0Var = this.U2;
        if ((i10 >= to0Var.P && i10 < to0Var.Q) || (i10 >= to0Var.R && i10 < to0Var.S)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        to0 to0Var = this.U2;
        O0(canvas, to0Var.P, Math.max(to0Var.S, to0Var.Q) - 1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, this.f29709l2), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        jh.k7 k7Var;
        super.onLayout(z10, i10, i11, i12, i13);
        to0 to0Var = this.U2;
        yo0 yo0Var = to0Var.f43077f0;
        to0.a(to0Var);
        if (to0Var.B != null) {
            if (to0Var.A != null && to0Var.c()) {
                to0Var.A.g(false);
                return;
            }
            return;
        }
        if (this.T2 == 1) {
            k7Var = yo0Var.f44943c;
        } else {
            k7Var = yo0Var.f44942b;
        }
        if (k7Var != null && to0Var.c()) {
            k7Var.a();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        to0.a(this.U2);
    }
}
