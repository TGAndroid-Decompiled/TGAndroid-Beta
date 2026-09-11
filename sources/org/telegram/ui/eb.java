package org.telegram.ui;
public final class eb extends org.telegram.ui.ActionBar.n1 {
    public final ub f35989o;

    public eb(ub ubVar, db dbVar) {
        super(dbVar, -2, -2);
        this.f35989o = ubVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ub ubVar = this.f35989o;
        if (ubVar.J0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        ubVar.J0 = null;
    }
}
