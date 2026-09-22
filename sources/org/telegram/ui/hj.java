package org.telegram.ui;
public final class hj extends org.telegram.ui.ActionBar.n1 {
    public final bo f34313o;

    public hj(bo boVar, fj fjVar) {
        super(fjVar, -2, -2);
        this.f34313o = boVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        bo boVar = this.f34313o;
        if (boVar.Q8 == this) {
            boVar.Q8 = null;
            boVar.T8 = null;
            boVar.S8 = null;
            boVar.f32544z0.R = true;
            if (boVar.R8) {
                boVar.g8(false, true, 0.0f);
            } else {
                boVar.R8 = true;
            }
            mk mkVar = boVar.Y;
            if (mkVar != null && mkVar.getEditField() != null) {
                boVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
