package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aj extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f32128f;
    public final zn f32129g;

    public aj(zn znVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f32129g = znVar;
        this.e = i10;
        this.f32128f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 21), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                zn znVar = this.f32129g;
                znVar.f40535vb = i10;
                znVar.f40549wb = 6;
                this.f32128f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                zn znVar2 = this.f32129g;
                znVar2.f40535vb = i11;
                znVar2.f40549wb = 5;
                znVar2.f40574yb = null;
                this.f32128f.invalidate();
                return;
            default:
                int i12 = this.e;
                zn znVar3 = this.f32129g;
                znVar3.f40535vb = i12;
                znVar3.f40549wb = 7;
                this.f32128f.invalidate();
                return;
        }
    }
}
