package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class li implements Runnable {

    public final int f40134a;

    public final mi f40135b;

    public final int f40136c;
    public final boolean d;

    public final org.telegram.ui.Components.wj0 f40137e;

    public final float f40138f;
    public final float h;

    public final ig.q0 f40139n;

    public li(mi miVar, int i10, boolean z10, org.telegram.ui.Components.wj0 wj0Var, float f10, float f11, ig.q0 q0Var, int i11) {
        this.f40134a = i11;
        this.f40135b = miVar;
        this.f40136c = i10;
        this.d = z10;
        this.f40137e = wj0Var;
        this.f40138f = f10;
        this.h = f11;
        this.f40139n = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f40134a) {
            case 0:
                AndroidUtilities.runOnUIThread(new li(this.f40135b, this.f40136c, this.d, this.f40137e, this.f40138f, this.h, this.f40139n, 1), 50L);
                break;
            default:
                rn rnVar = this.f40135b.f40529s;
                org.telegram.ui.Cells.a0 a0VarQ8 = rnVar.q8(this.f40136c, true);
                if (this.d) {
                    ig.m0.d(rnVar, this.f40137e, a0VarQ8, null, this.f40138f, this.h, this.f40139n, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, 1);
                    ig.m0.f();
                }
                break;
        }
    }
}
