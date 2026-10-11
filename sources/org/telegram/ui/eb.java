package org.telegram.ui;
public final class eb extends org.telegram.ui.ActionBar.m1 {
    public final ub f37259o;

    public eb(ub ubVar, db dbVar) {
        super(dbVar, -2, -2);
        this.f37259o = ubVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ub ubVar = this.f37259o;
        if (ubVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.sc.e();
        ubVar.F0 = null;
    }
}
