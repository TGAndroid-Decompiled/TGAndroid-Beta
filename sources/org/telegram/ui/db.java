package org.telegram.ui;
public final class db extends org.telegram.ui.ActionBar.p1 {
    public final ub f33398o;

    public db(ub ubVar, cb cbVar) {
        super(cbVar, -2, -2);
        this.f33398o = ubVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ub ubVar = this.f33398o;
        if (ubVar.G0 != this) {
            return;
        }
        org.telegram.ui.Components.ic.e();
        ubVar.G0 = null;
    }
}
