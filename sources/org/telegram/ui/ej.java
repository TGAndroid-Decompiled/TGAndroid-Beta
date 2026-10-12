package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ej extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f35618f;
    public final fo f35619g;

    public ej(fo foVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f35619g = foVar;
        this.e = i10;
        this.f35618f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 21), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 24), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 25), 240L);
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
                fo foVar = this.f35619g;
                foVar.f36157wb = i10;
                foVar.f36171xb = 6;
                this.f35618f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                fo foVar2 = this.f35619g;
                foVar2.f36157wb = i11;
                foVar2.f36171xb = 5;
                foVar2.f36196zb = null;
                this.f35618f.invalidate();
                return;
            default:
                int i12 = this.e;
                fo foVar3 = this.f35619g;
                foVar3.f36157wb = i12;
                foVar3.f36171xb = 7;
                this.f35618f.invalidate();
                return;
        }
    }
}
