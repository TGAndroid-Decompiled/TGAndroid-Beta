package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mi implements Runnable {
    public final int f39243a;
    public final ni f39244b;
    public final int f39245c;
    public final boolean d;
    public final org.telegram.ui.Components.cl0 e;
    public final float f39246f;
    public final float h;
    public final ah.i1 f39247n;

    public mi(ni niVar, int i10, boolean z10, org.telegram.ui.Components.cl0 cl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.f39243a = i11;
        this.f39244b = niVar;
        this.f39245c = i10;
        this.d = z10;
        this.e = cl0Var;
        this.f39246f = f7;
        this.h = f10;
        this.f39247n = i1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39243a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mi(this.f39244b, this.f39245c, this.d, this.e, this.f39246f, this.h, this.f39247n, 1), 50L);
                return;
            default:
                qn qnVar = this.f39244b.f39598s;
                org.telegram.ui.Cells.a0 t82 = qnVar.t8(this.f39245c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    ah.d1.d(qnVar, this.e, t82, null, this.f39246f, this.h, this.f39247n, i10, 1);
                    ah.d1.f();
                    return;
                }
                return;
        }
    }
}
