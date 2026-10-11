package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aj extends of.e {
    public final int d;
    public final int f36134e;
    public final org.telegram.ui.Cells.u1 f36135f;
    public final zn f36136g;

    public aj(zn znVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f36136g = znVar;
        this.f36134e = i10;
        this.f36135f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f36134e, 20), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f36134e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f36134e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f36134e;
                zn znVar = this.f36136g;
                znVar.f45020wb = i10;
                znVar.f45034xb = 6;
                this.f36135f.invalidate();
                return;
            case 1:
                int i11 = this.f36134e;
                zn znVar2 = this.f36136g;
                znVar2.f45020wb = i11;
                znVar2.f45034xb = 5;
                znVar2.f45058zb = null;
                this.f36135f.invalidate();
                return;
            default:
                int i12 = this.f36134e;
                zn znVar3 = this.f36136g;
                znVar3.f45020wb = i12;
                znVar3.f45034xb = 7;
                this.f36135f.invalidate();
                return;
        }
    }
}
