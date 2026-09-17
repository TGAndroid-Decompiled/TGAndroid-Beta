package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aj extends of.e {
    public final int d;
    public final int f34460e;
    public final org.telegram.ui.Cells.t1 f34461f;
    public final co f34462g;

    public aj(co coVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f34462g = coVar;
        this.f34460e = i10;
        this.f34461f = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.f34460e, 22), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.f34460e, 24), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.f34460e, 25), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f34460e;
                co coVar = this.f34462g;
                coVar.f35472wb = i10;
                coVar.f35485xb = 6;
                this.f34461f.invalidate();
                return;
            case 1:
                int i11 = this.f34460e;
                co coVar2 = this.f34462g;
                coVar2.f35472wb = i11;
                coVar2.f35485xb = 5;
                coVar2.f35510zb = null;
                this.f34461f.invalidate();
                return;
            default:
                int i12 = this.f34460e;
                co coVar3 = this.f34462g;
                coVar3.f35472wb = i12;
                coVar3.f35485xb = 7;
                this.f34461f.invalidate();
                return;
        }
    }
}
