package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ji implements Runnable {
    public final int f39510a;
    public final ki f39511b;
    public final int f39512c;
    public final boolean d;
    public final org.telegram.ui.Components.uj0 f39513e;
    public final float f39514f;
    public final float h;
    public final hg.r0 f39515n;

    public ji(ki kiVar, int i9, boolean z10, org.telegram.ui.Components.uj0 uj0Var, float f10, float f11, hg.r0 r0Var, int i10) {
        this.f39510a = i10;
        this.f39511b = kiVar;
        this.f39512c = i9;
        this.d = z10;
        this.f39513e = uj0Var;
        this.f39514f = f10;
        this.h = f11;
        this.f39515n = r0Var;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f39510a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ji(this.f39511b, this.f39512c, this.d, this.f39513e, this.f39514f, this.h, this.f39515n, 1), 50L);
                return;
            default:
                qn qnVar = this.f39511b.f39852s;
                org.telegram.ui.Cells.a0 q82 = qnVar.q8(this.f39512c, true);
                if (this.d) {
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    hg.n0.d(qnVar, this.f39513e, q82, null, this.f39514f, this.h, this.f39515n, i9, 1);
                    hg.n0.f();
                    return;
                }
                return;
        }
    }
}
