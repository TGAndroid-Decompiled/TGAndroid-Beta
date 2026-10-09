package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aj extends of.e {
    public final int d;
    public final int f35941e;
    public final org.telegram.ui.Cells.u1 f35942f;
    public final zn f35943g;

    public aj(zn znVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f35943g = znVar;
        this.f35941e = i10;
        this.f35942f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f35941e, 20), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f35941e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f35941e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f35941e;
                zn znVar = this.f35943g;
                znVar.f44985wb = i10;
                znVar.f44999xb = 6;
                this.f35942f.invalidate();
                return;
            case 1:
                int i11 = this.f35941e;
                zn znVar2 = this.f35943g;
                znVar2.f44985wb = i11;
                znVar2.f44999xb = 5;
                znVar2.f45023zb = null;
                this.f35942f.invalidate();
                return;
            default:
                int i12 = this.f35941e;
                zn znVar3 = this.f35943g;
                znVar3.f44985wb = i12;
                znVar3.f44999xb = 7;
                this.f35942f.invalidate();
                return;
        }
    }
}
