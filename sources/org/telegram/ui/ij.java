package org.telegram.ui;
public final class ij extends org.telegram.ui.ActionBar.o1 {
    public final bo f34605o;

    public ij(bo boVar, gj gjVar) {
        super(gjVar, -2, -2);
        this.f34605o = boVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        bo boVar = this.f34605o;
        if (boVar.Q8 == this) {
            boVar.Q8 = null;
            boVar.T8 = null;
            boVar.S8 = null;
            boVar.f32527z0.R = true;
            if (boVar.R8) {
                boVar.g8(false, true, 0.0f);
            } else {
                boVar.R8 = true;
            }
            nk nkVar = boVar.Y;
            if (nkVar != null && nkVar.getEditField() != null) {
                boVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
