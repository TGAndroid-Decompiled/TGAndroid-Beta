package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mi implements Runnable {
    public final int f40570a;
    public final ni f40571b;
    public final int f40572c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 f40573e;
    public final float f40574f;
    public final float h;
    public final kg.q0 f40575n;

    public mi(ni niVar, int i10, boolean z10, org.telegram.ui.Components.fk0 fk0Var, float f9, float f10, kg.q0 q0Var, int i11) {
        this.f40570a = i11;
        this.f40571b = niVar;
        this.f40572c = i10;
        this.d = z10;
        this.f40573e = fk0Var;
        this.f40574f = f9;
        this.h = f10;
        this.f40575n = q0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40570a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mi(this.f40571b, this.f40572c, this.d, this.f40573e, this.f40574f, this.h, this.f40575n, 1), 50L);
                return;
            default:
                tn tnVar = this.f40571b.f40820s;
                org.telegram.ui.Cells.a0 q82 = tnVar.q8(this.f40572c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    kg.m0.d(tnVar, this.f40573e, q82, null, this.f40574f, this.h, this.f40575n, i10, 1);
                    kg.m0.f();
                    return;
                }
                return;
        }
    }
}
