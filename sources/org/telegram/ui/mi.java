package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mi implements Runnable {
    public final int f39597a;
    public final ni f39598b;
    public final int f39599c;
    public final boolean d;
    public final org.telegram.ui.Components.fl0 e;
    public final float f39600f;
    public final float h;
    public final ah.i1 f39601n;

    public mi(ni niVar, int i10, boolean z10, org.telegram.ui.Components.fl0 fl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.f39597a = i11;
        this.f39598b = niVar;
        this.f39599c = i10;
        this.d = z10;
        this.e = fl0Var;
        this.f39600f = f7;
        this.h = f10;
        this.f39601n = i1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39597a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mi(this.f39598b, this.f39599c, this.d, this.e, this.f39600f, this.h, this.f39601n, 1), 50L);
                return;
            default:
                sn snVar = this.f39598b.f39879s;
                org.telegram.ui.Cells.z t82 = snVar.t8(this.f39599c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    ah.d1.d(snVar, this.e, t82, null, this.f39600f, this.h, this.f39601n, i10, 1);
                    ah.d1.f();
                    return;
                }
                return;
        }
    }
}
