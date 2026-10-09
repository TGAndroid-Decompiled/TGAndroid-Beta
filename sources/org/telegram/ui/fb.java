package org.telegram.ui;
public final class fb extends org.telegram.ui.ActionBar.n1 {
    public final vb f37504o;

    public fb(vb vbVar, eb ebVar) {
        super(ebVar, -2, -2);
        this.f37504o = vbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        vb vbVar = this.f37504o;
        if (vbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.tc.e();
        vbVar.F0 = null;
    }
}
