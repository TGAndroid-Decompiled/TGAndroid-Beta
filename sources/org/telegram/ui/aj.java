package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aj extends of.e {
    public final int d;
    public final int f36100e;
    public final org.telegram.ui.Cells.u1 f36101f;
    public final zn f36102g;

    public aj(zn znVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f36102g = znVar;
        this.f36100e = i10;
        this.f36101f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f36100e, 20), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f36100e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f36100e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f36100e;
                zn znVar = this.f36102g;
                znVar.f44986wb = i10;
                znVar.f45000xb = 6;
                this.f36101f.invalidate();
                return;
            case 1:
                int i11 = this.f36100e;
                zn znVar2 = this.f36102g;
                znVar2.f44986wb = i11;
                znVar2.f45000xb = 5;
                znVar2.f45024zb = null;
                this.f36101f.invalidate();
                return;
            default:
                int i12 = this.f36100e;
                zn znVar3 = this.f36102g;
                znVar3.f44986wb = i12;
                znVar3.f45000xb = 7;
                this.f36101f.invalidate();
                return;
        }
    }
}
