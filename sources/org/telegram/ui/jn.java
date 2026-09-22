package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class jn extends nf.e {
    public final org.telegram.ui.Cells.t1 d;
    public final nn e;

    public jn(nn nnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = nnVar;
        this.d = t1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            AndroidUtilities.runOnUIThread(new ak(this.e.f36017a, 8), 250L);
        }
    }

    @Override
    public final void d() {
        nn nnVar = this.e;
        bo boVar = nnVar.f36017a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        boVar.f32503vb = t1Var.getMessageObject().getId();
        bo boVar2 = nnVar.f36017a;
        boVar2.f32517wb = 2;
        boVar2.f32530xb = null;
        t1Var.invalidate();
    }
}
