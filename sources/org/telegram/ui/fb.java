package org.telegram.ui;
public final class fb extends org.telegram.ui.ActionBar.m1 {
    public final vb f36969o;

    public fb(vb vbVar, eb ebVar) {
        super(ebVar, -2, -2);
        this.f36969o = vbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        vb vbVar = this.f36969o;
        if (vbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        vbVar.F0 = null;
    }
}
