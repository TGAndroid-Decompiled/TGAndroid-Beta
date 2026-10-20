package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mi implements Runnable {
    public final int f39249a;
    public final ni f39250b;
    public final int f39251c;
    public final boolean d;
    public final org.telegram.ui.Components.dl0 e;
    public final float f39252f;
    public final float h;
    public final ah.i1 f39253n;

    public mi(ni niVar, int i10, boolean z10, org.telegram.ui.Components.dl0 dl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.f39249a = i11;
        this.f39250b = niVar;
        this.f39251c = i10;
        this.d = z10;
        this.e = dl0Var;
        this.f39252f = f7;
        this.h = f10;
        this.f39253n = i1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39249a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mi(this.f39250b, this.f39251c, this.d, this.e, this.f39252f, this.h, this.f39253n, 1), 50L);
                return;
            default:
                qn qnVar = this.f39250b.f39604s;
                org.telegram.ui.Cells.a0 t82 = qnVar.t8(this.f39251c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    ah.d1.d(qnVar, this.e, t82, null, this.f39252f, this.h, this.f39253n, i10, 1);
                    ah.d1.f();
                    return;
                }
                return;
        }
    }
}
