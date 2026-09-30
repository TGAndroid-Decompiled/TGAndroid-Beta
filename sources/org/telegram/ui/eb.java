package org.telegram.ui;
public final class eb extends org.telegram.ui.ActionBar.m1 {
    public final ub f33439o;

    public eb(ub ubVar, db dbVar) {
        super(dbVar, -2, -2);
        this.f33439o = ubVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ub ubVar = this.f33439o;
        if (ubVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.rc.e();
        ubVar.F0 = null;
    }
}
