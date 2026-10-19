package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mi implements Runnable {
    public final int f39279a;
    public final ni f39280b;
    public final int f39281c;
    public final boolean d;
    public final org.telegram.ui.Components.cl0 e;
    public final float f39282f;
    public final float h;
    public final ah.i1 f39283n;

    public mi(ni niVar, int i10, boolean z10, org.telegram.ui.Components.cl0 cl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.f39279a = i11;
        this.f39280b = niVar;
        this.f39281c = i10;
        this.d = z10;
        this.e = cl0Var;
        this.f39282f = f7;
        this.h = f10;
        this.f39283n = i1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39279a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mi(this.f39280b, this.f39281c, this.d, this.e, this.f39282f, this.h, this.f39283n, 1), 50L);
                return;
            default:
                qn qnVar = this.f39280b.f39600s;
                org.telegram.ui.Cells.a0 t82 = qnVar.t8(this.f39281c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    ah.d1.d(qnVar, this.e, t82, null, this.f39282f, this.h, this.f39283n, i10, 1);
                    ah.d1.f();
                    return;
                }
                return;
        }
    }
}
