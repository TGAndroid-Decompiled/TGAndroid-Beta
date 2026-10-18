package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class oi implements Runnable {
    public final int f39803a;
    public final pi f39804b;
    public final int f39805c;
    public final boolean d;
    public final org.telegram.ui.Components.cl0 e;
    public final float f39806f;
    public final float h;
    public final ah.i1 f39807n;

    public oi(pi piVar, int i10, boolean z10, org.telegram.ui.Components.cl0 cl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.f39803a = i11;
        this.f39804b = piVar;
        this.f39805c = i10;
        this.d = z10;
        this.e = cl0Var;
        this.f39806f = f7;
        this.h = f10;
        this.f39807n = i1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39803a) {
            case 0:
                AndroidUtilities.runOnUIThread(new oi(this.f39804b, this.f39805c, this.d, this.e, this.f39806f, this.h, this.f39807n, 1), 50L);
                return;
            default:
                sn snVar = this.f39804b.f40162s;
                org.telegram.ui.Cells.a0 t82 = snVar.t8(this.f39805c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    ah.d1.d(snVar, this.e, t82, null, this.f39806f, this.h, this.f39807n, i10, 1);
                    ah.d1.f();
                    return;
                }
                return;
        }
    }
}
