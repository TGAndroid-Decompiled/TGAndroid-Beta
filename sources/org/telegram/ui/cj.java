package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cj extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f31680f;
    public final eo f31681g;

    public cj(eo eoVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f31681g = eoVar;
        this.e = i10;
        this.f31680f = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bi.s(this, this.e, 20), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bi.s(this, this.e, 22), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bi.s(this, this.e, 23), 240L);
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
                eo eoVar = this.f31681g;
                eoVar.f32540wb = i10;
                eoVar.f32553xb = 6;
                this.f31680f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                eo eoVar2 = this.f31681g;
                eoVar2.f32540wb = i11;
                eoVar2.f32553xb = 5;
                eoVar2.f32578zb = null;
                this.f31680f.invalidate();
                return;
            default:
                int i12 = this.e;
                eo eoVar3 = this.f31681g;
                eoVar3.f32540wb = i12;
                eoVar3.f32553xb = 7;
                this.f31680f.invalidate();
                return;
        }
    }
}
