package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kn extends of.e {
    public final org.telegram.ui.Cells.t1 d;
    public final on f38121e;

    public kn(on onVar, org.telegram.ui.Cells.t1 t1Var) {
        this.f38121e = onVar;
        this.d = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new ak(this.f38121e.f39310a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        on onVar = this.f38121e;
        co coVar = onVar.f39310a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        coVar.f35498wb = t1Var.getMessageObject().getId();
        co coVar2 = onVar.f39310a;
        coVar2.f35511xb = 2;
        coVar2.f35523yb = null;
        t1Var.invalidate();
    }
}
