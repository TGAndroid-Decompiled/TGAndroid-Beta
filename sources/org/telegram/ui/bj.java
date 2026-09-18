package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bj extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f32193f;
    public final bo f32194g;

    public bj(bo boVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f32194g = boVar;
        this.e = i10;
        this.f32193f = t1Var;
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
                bo boVar = this.f32194g;
                boVar.f32490vb = i10;
                boVar.f32504wb = 6;
                this.f32193f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                bo boVar2 = this.f32194g;
                boVar2.f32490vb = i11;
                boVar2.f32504wb = 5;
                boVar2.f32529yb = null;
                this.f32193f.invalidate();
                return;
            default:
                int i12 = this.e;
                bo boVar3 = this.f32194g;
                boVar3.f32490vb = i12;
                boVar3.f32504wb = 7;
                this.f32193f.invalidate();
                return;
        }
    }
}
