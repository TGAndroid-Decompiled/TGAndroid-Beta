package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aj extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f31852f;
    public final bo f31853g;

    public aj(bo boVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f31853g = boVar;
        this.e = i10;
        this.f31852f = t1Var;
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
                bo boVar = this.f31853g;
                boVar.f32522wb = i10;
                boVar.f32535xb = 6;
                this.f31852f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                bo boVar2 = this.f31853g;
                boVar2.f32522wb = i11;
                boVar2.f32535xb = 5;
                boVar2.f32560zb = null;
                this.f31852f.invalidate();
                return;
            default:
                int i12 = this.e;
                bo boVar3 = this.f31853g;
                boVar3.f32522wb = i12;
                boVar3.f32535xb = 7;
                this.f31852f.invalidate();
                return;
        }
    }
}
