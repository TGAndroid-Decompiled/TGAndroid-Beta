package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ej extends of.e {
    public final int d;
    public final int f37122e;
    public final org.telegram.ui.Cells.u1 f37123f;
    public final eo f37124g;

    public ej(eo eoVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f37124g = eoVar;
        this.f37122e = i10;
        this.f37123f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f37122e, 20), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f37122e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.f37122e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f37122e;
                eo eoVar = this.f37124g;
                eoVar.f37475wb = i10;
                eoVar.f37489xb = 6;
                this.f37123f.invalidate();
                return;
            case 1:
                int i11 = this.f37122e;
                eo eoVar2 = this.f37124g;
                eoVar2.f37475wb = i11;
                eoVar2.f37489xb = 5;
                eoVar2.f37513zb = null;
                this.f37123f.invalidate();
                return;
            default:
                int i12 = this.f37122e;
                eo eoVar3 = this.f37124g;
                eoVar3.f37475wb = i12;
                eoVar3.f37489xb = 7;
                this.f37123f.invalidate();
                return;
        }
    }
}
