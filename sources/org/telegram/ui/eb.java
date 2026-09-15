package org.telegram.ui;
public final class eb extends org.telegram.ui.ActionBar.n1 {
    public final ub f33304o;

    public eb(ub ubVar, db dbVar) {
        super(dbVar, -2, -2);
        this.f33304o = ubVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ub ubVar = this.f33304o;
        if (ubVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.oc.e();
        ubVar.F0 = null;
    }
}
