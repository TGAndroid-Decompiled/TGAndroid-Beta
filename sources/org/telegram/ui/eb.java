package org.telegram.ui;
public final class eb extends org.telegram.ui.ActionBar.m1 {
    public final ub f33355o;

    public eb(ub ubVar, db dbVar) {
        super(dbVar, -2, -2);
        this.f33355o = ubVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ub ubVar = this.f33355o;
        if (ubVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        ubVar.F0 = null;
    }
}
