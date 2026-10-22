package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mi implements Runnable {
    public final int f39253a;
    public final ni f39254b;
    public final int f39255c;
    public final boolean d;
    public final org.telegram.ui.Components.dl0 e;
    public final float f39256f;
    public final float h;
    public final ah.i1 f39257n;

    public mi(ni niVar, int i10, boolean z10, org.telegram.ui.Components.dl0 dl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.f39253a = i11;
        this.f39254b = niVar;
        this.f39255c = i10;
        this.d = z10;
        this.e = dl0Var;
        this.f39256f = f7;
        this.h = f10;
        this.f39257n = i1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39253a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mi(this.f39254b, this.f39255c, this.d, this.e, this.f39256f, this.h, this.f39257n, 1), 50L);
                return;
            default:
                qn qnVar = this.f39254b.f39607s;
                org.telegram.ui.Cells.a0 t82 = qnVar.t8(this.f39255c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    ah.d1.d(qnVar, this.e, t82, null, this.f39256f, this.h, this.f39257n, i10, 1);
                    ah.d1.f();
                    return;
                }
                return;
        }
    }
}
