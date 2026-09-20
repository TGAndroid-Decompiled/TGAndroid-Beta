package org.telegram.ui;
public final class gj extends org.telegram.ui.ActionBar.n1 {
    public final zn f33921o;

    public gj(zn znVar, ej ejVar) {
        super(ejVar, -2, -2);
        this.f33921o = znVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f33921o;
        if (znVar.Q8 == this) {
            znVar.Q8 = null;
            znVar.T8 = null;
            znVar.S8 = null;
            znVar.f40555z0.R = true;
            if (znVar.R8) {
                znVar.g8(false, true, 0.0f);
            } else {
                znVar.R8 = true;
            }
            lk lkVar = znVar.Y;
            if (lkVar != null && lkVar.getEditField() != null) {
                znVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
