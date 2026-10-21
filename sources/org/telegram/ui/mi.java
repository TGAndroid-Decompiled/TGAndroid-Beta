package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mi implements Runnable {
    public final int f39250a;
    public final ni f39251b;
    public final int f39252c;
    public final boolean d;
    public final org.telegram.ui.Components.dl0 e;
    public final float f39253f;
    public final float h;
    public final ah.i1 f39254n;

    public mi(ni niVar, int i10, boolean z10, org.telegram.ui.Components.dl0 dl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.f39250a = i11;
        this.f39251b = niVar;
        this.f39252c = i10;
        this.d = z10;
        this.e = dl0Var;
        this.f39253f = f7;
        this.h = f10;
        this.f39254n = i1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39250a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mi(this.f39251b, this.f39252c, this.d, this.e, this.f39253f, this.h, this.f39254n, 1), 50L);
                return;
            default:
                qn qnVar = this.f39251b.f39604s;
                org.telegram.ui.Cells.a0 t82 = qnVar.t8(this.f39252c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    ah.d1.d(qnVar, this.e, t82, null, this.f39253f, this.h, this.f39254n, i10, 1);
                    ah.d1.f();
                    return;
                }
                return;
        }
    }
}
