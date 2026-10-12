package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ej extends of.e {
    public final int d;
    public final int f37127e;
    public final org.telegram.ui.Cells.u1 f37128f;
    public final eo f37129g;

    public ej(eo eoVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f37129g = eoVar;
        this.f37127e = i10;
        this.f37128f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f37127e, 20), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f37127e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f37127e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f37127e;
                eo eoVar = this.f37129g;
                eoVar.f37480wb = i10;
                eoVar.f37494xb = 6;
                this.f37128f.invalidate();
                return;
            case 1:
                int i11 = this.f37127e;
                eo eoVar2 = this.f37129g;
                eoVar2.f37480wb = i11;
                eoVar2.f37494xb = 5;
                eoVar2.f37518zb = null;
                this.f37128f.invalidate();
                return;
            default:
                int i12 = this.f37127e;
                eo eoVar3 = this.f37129g;
                eoVar3.f37480wb = i12;
                eoVar3.f37494xb = 7;
                this.f37128f.invalidate();
                return;
        }
    }
}
