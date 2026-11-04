package org.telegram.ui;

import android.content.Context;
public final class q30 extends org.telegram.ui.Components.voip.k {
    public final int h = 1;
    public final org.telegram.ui.Components.sj0 f48743n;

    public q30(a40 a40Var, Context context) {
        super(context, true);
        this.f48743n = a40Var;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                x30 x30Var = ((r30) this.f48743n).N;
                if (x30Var.I1.getVisibility() == 0 && x30Var.H4) {
                    x30.J0(x30Var, this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                a40 a40Var = (a40) this.f48743n;
                if (a40Var.f43592r && getParticipant() != null) {
                    a40Var.E(this, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.h) {
            case 0:
                super.onDetachedFromWindow();
                x30.J0(((r30) this.f48743n).N, this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((a40) this.f48743n).E(this, false);
                return;
        }
    }

    public q30(r30 r30Var, Context context) {
        super(context, false);
        this.f48743n = r30Var;
    }
}
