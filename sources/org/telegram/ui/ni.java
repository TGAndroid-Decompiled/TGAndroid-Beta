package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ni implements Runnable {
    public final int f41896a;
    public final oi f41897b;
    public final int f41898c;
    public final boolean d;
    public final org.telegram.ui.Components.fl0 e;
    public final float f41899f;
    public final float h;
    public final bh.x0 f41900n;

    public ni(oi oiVar, int i10, boolean z10, org.telegram.ui.Components.fl0 fl0Var, float f7, float f10, bh.x0 x0Var, int i11) {
        this.f41896a = i11;
        this.f41897b = oiVar;
        this.f41898c = i10;
        this.d = z10;
        this.e = fl0Var;
        this.f41899f = f7;
        this.h = f10;
        this.f41900n = x0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41896a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ni(this.f41897b, this.f41898c, this.d, this.e, this.f41899f, this.h, this.f41900n, 1), 50L);
                return;
            default:
                un unVar = this.f41897b.f42198s;
                org.telegram.ui.Cells.z x82 = unVar.x8(this.f41898c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    bh.s0.d(unVar, this.e, x82, null, this.f41899f, this.h, this.f41900n, i10, 1);
                    bh.s0.f();
                    return;
                }
                return;
        }
    }
}
