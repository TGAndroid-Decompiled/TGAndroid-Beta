package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aj extends of.e {
    public final int d;
    public final int f35987e;
    public final org.telegram.ui.Cells.u1 f35988f;
    public final zn f35989g;

    public aj(zn znVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f35989g = znVar;
        this.f35987e = i10;
        this.f35988f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f35987e, 20), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f35987e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f35987e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f35987e;
                zn znVar = this.f35989g;
                znVar.f45031wb = i10;
                znVar.f45045xb = 6;
                this.f35988f.invalidate();
                return;
            case 1:
                int i11 = this.f35987e;
                zn znVar2 = this.f35989g;
                znVar2.f45031wb = i11;
                znVar2.f45045xb = 5;
                znVar2.f45069zb = null;
                this.f35988f.invalidate();
                return;
            default:
                int i12 = this.f35987e;
                zn znVar3 = this.f35989g;
                znVar3.f45031wb = i12;
                znVar3.f45045xb = 7;
                this.f35988f.invalidate();
                return;
        }
    }
}
