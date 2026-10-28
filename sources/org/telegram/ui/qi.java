package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qi implements Runnable {
    public final int f42714a;
    public final ri f42715b;
    public final int f42716c;
    public final boolean d;
    public final org.telegram.ui.Components.gl0 e;
    public final float f42717f;
    public final float h;
    public final bh.x0 f42718n;

    public qi(ri riVar, int i10, boolean z10, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, bh.x0 x0Var, int i11) {
        this.f42714a = i11;
        this.f42715b = riVar;
        this.f42716c = i10;
        this.d = z10;
        this.e = gl0Var;
        this.f42717f = f7;
        this.h = f10;
        this.f42718n = x0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42714a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qi(this.f42715b, this.f42716c, this.d, this.e, this.f42717f, this.h, this.f42718n, 1), 50L);
                return;
            default:
                wn wnVar = this.f42715b.f43053s;
                org.telegram.ui.Cells.z A8 = wnVar.A8(this.f42716c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    bh.s0.d(wnVar, this.e, A8, null, this.f42717f, this.h, this.f42718n, i10, 1);
                    bh.s0.f();
                    return;
                }
                return;
        }
    }
}
