package org.telegram.ui;
public final class hj extends org.telegram.ui.ActionBar.k1 {
    public final un f37971o;

    public hj(un unVar, ej ejVar) {
        super(ejVar, -2, -2);
        this.f37971o = unVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        un unVar = this.f37971o;
        if (unVar.f42240e9 == this) {
            unVar.f42240e9 = null;
            unVar.f42276h9 = null;
            unVar.f42265g9 = null;
            unVar.B0.R = true;
            if (unVar.f42252f9) {
                unVar.o8(false, true, 0.0f);
            } else {
                unVar.f42252f9 = true;
            }
            mk mkVar = unVar.Z;
            if (mkVar != null && mkVar.getEditField() != null) {
                unVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
