package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ej extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f35314f;
    public final fo f35315g;

    public ej(fo foVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f35315g = foVar;
        this.e = i10;
        this.f35314f = u1Var;
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
                fo foVar = this.f35315g;
                foVar.f35858wb = i10;
                foVar.f35872xb = 6;
                this.f35314f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                fo foVar2 = this.f35315g;
                foVar2.f35858wb = i11;
                foVar2.f35872xb = 5;
                foVar2.f35897zb = null;
                this.f35314f.invalidate();
                return;
            default:
                int i12 = this.e;
                fo foVar3 = this.f35315g;
                foVar3.f35858wb = i12;
                foVar3.f35872xb = 7;
                this.f35314f.invalidate();
                return;
        }
    }
}
