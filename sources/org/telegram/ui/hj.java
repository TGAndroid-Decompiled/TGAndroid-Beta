package org.telegram.ui;
public final class hj extends org.telegram.ui.ActionBar.n1 {
    public final zn f34245o;

    public hj(zn znVar, fj fjVar) {
        super(fjVar, -2, -2);
        this.f34245o = znVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f34245o;
        if (znVar.Q8 == this) {
            znVar.Q8 = null;
            znVar.T8 = null;
            znVar.S8 = null;
            znVar.f40576z0.R = true;
            if (znVar.R8) {
                znVar.g8(false, true, 0.0f);
            } else {
                znVar.R8 = true;
            }
            mk mkVar = znVar.Y;
            if (mkVar != null && mkVar.getEditField() != null) {
                znVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
