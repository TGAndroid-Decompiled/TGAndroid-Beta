package org.telegram.ui;
public final class lj extends org.telegram.ui.ActionBar.m1 {
    public final fo f37771o;

    public lj(fo foVar, jj jjVar) {
        super(jjVar, -2, -2);
        this.f37771o = foVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        fo foVar = this.f37771o;
        if (foVar.Q8 == this) {
            foVar.Q8 = null;
            foVar.T8 = null;
            foVar.S8 = null;
            foVar.f35886z0.R = true;
            if (foVar.R8) {
                foVar.j8(false, true, 0.0f);
            } else {
                foVar.R8 = true;
            }
            sk skVar = foVar.Y;
            if (skVar != null && skVar.getEditField() != null) {
                foVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
