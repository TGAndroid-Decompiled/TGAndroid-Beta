package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aj extends of.e {
    public final int d;
    public final int f35943e;
    public final org.telegram.ui.Cells.u1 f35944f;
    public final zn f35945g;

    public aj(zn znVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f35945g = znVar;
        this.f35943e = i10;
        this.f35944f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f35943e, 20), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f35943e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f35943e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f35943e;
                zn znVar = this.f35945g;
                znVar.f44987wb = i10;
                znVar.f45001xb = 6;
                this.f35944f.invalidate();
                return;
            case 1:
                int i11 = this.f35943e;
                zn znVar2 = this.f35945g;
                znVar2.f44987wb = i11;
                znVar2.f45001xb = 5;
                znVar2.f45025zb = null;
                this.f35944f.invalidate();
                return;
            default:
                int i12 = this.f35943e;
                zn znVar3 = this.f35945g;
                znVar3.f44987wb = i12;
                znVar3.f45001xb = 7;
                this.f35944f.invalidate();
                return;
        }
    }
}
