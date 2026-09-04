package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class aj extends of.e {
    public final int d;
    public final int f34459e;
    public final org.telegram.ui.Cells.t1 f34460f;
    public final co f34461g;

    public aj(co coVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f34461g = coVar;
        this.f34459e = i10;
        this.f34460f = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.f34459e, 22), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.f34459e, 24), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.f34459e, 25), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f34459e;
                co coVar = this.f34461g;
                coVar.f35471wb = i10;
                coVar.f35484xb = 6;
                this.f34460f.invalidate();
                return;
            case 1:
                int i11 = this.f34459e;
                co coVar2 = this.f34461g;
                coVar2.f35471wb = i11;
                coVar2.f35484xb = 5;
                coVar2.f35509zb = null;
                this.f34460f.invalidate();
                return;
            default:
                int i12 = this.f34459e;
                co coVar3 = this.f34461g;
                coVar3.f35471wb = i12;
                coVar3.f35484xb = 7;
                this.f34460f.invalidate();
                return;
        }
    }
}
