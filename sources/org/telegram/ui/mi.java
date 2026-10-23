package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mi implements Runnable {
    public final int f39606a;
    public final ni f39607b;
    public final int f39608c;
    public final boolean d;
    public final org.telegram.ui.Components.gl0 e;
    public final float f39609f;
    public final float h;
    public final ah.i1 f39610n;

    public mi(ni niVar, int i10, boolean z10, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.f39606a = i11;
        this.f39607b = niVar;
        this.f39608c = i10;
        this.d = z10;
        this.e = gl0Var;
        this.f39609f = f7;
        this.h = f10;
        this.f39610n = i1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39606a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mi(this.f39607b, this.f39608c, this.d, this.e, this.f39609f, this.h, this.f39610n, 1), 50L);
                return;
            default:
                sn snVar = this.f39607b.f39883s;
                org.telegram.ui.Cells.z t82 = snVar.t8(this.f39608c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    ah.d1.d(snVar, this.e, t82, null, this.f39609f, this.h, this.f39610n, i10, 1);
                    ah.d1.f();
                    return;
                }
                return;
        }
    }
}
