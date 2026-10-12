package org.telegram.ui;
public final class lj extends org.telegram.ui.ActionBar.m1 {
    public final eo f39772o;

    public lj(eo eoVar, jj jjVar) {
        super(jjVar, -2, -2);
        this.f39772o = eoVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        eo eoVar = this.f39772o;
        if (eoVar.Q8 == this) {
            eoVar.Q8 = null;
            eoVar.T8 = null;
            eoVar.S8 = null;
            eoVar.f37507z0.R = true;
            if (eoVar.R8) {
                eoVar.j8(false, true, 0.0f);
            } else {
                eoVar.R8 = true;
            }
            sk skVar = eoVar.Y;
            if (skVar != null && skVar.getEditField() != null) {
                eoVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
