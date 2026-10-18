package org.telegram.ui;
public final class aj extends org.telegram.ui.ActionBar.m1 {
    public final sn f35432o;

    public aj(sn snVar, yi yiVar) {
        super(yiVar, -2, -2);
        this.f35432o = snVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        sn snVar = this.f35432o;
        if (snVar.Q8 == this) {
            snVar.Q8 = null;
            snVar.T8 = null;
            snVar.S8 = null;
            snVar.f41444z0.R = true;
            if (snVar.R8) {
                snVar.j8(false, true, 0.0f);
            } else {
                snVar.R8 = true;
            }
            hk hkVar = snVar.Y;
            if (hkVar != null && hkVar.getEditField() != null) {
                snVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
