package org.telegram.ui;
public final class hj extends org.telegram.ui.ActionBar.k1 {
    public final un f37824o;

    public hj(un unVar, ej ejVar) {
        super(ejVar, -2, -2);
        this.f37824o = unVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        un unVar = this.f37824o;
        if (unVar.f42051e9 == this) {
            unVar.f42051e9 = null;
            unVar.f42087h9 = null;
            unVar.f42076g9 = null;
            unVar.B0.R = true;
            if (unVar.f42063f9) {
                unVar.s8(false, true, 0.0f);
            } else {
                unVar.f42063f9 = true;
            }
            mk mkVar = unVar.Z;
            if (mkVar != null && mkVar.getEditField() != null) {
                unVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
