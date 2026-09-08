package org.telegram.ui;
public final class hj extends org.telegram.ui.ActionBar.n1 {
    public final co f37076o;

    public hj(co coVar, fj fjVar) {
        super(fjVar, -2, -2);
        this.f37076o = coVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        co coVar = this.f37076o;
        if (coVar.Q8 == this) {
            coVar.Q8 = null;
            coVar.T8 = null;
            coVar.S8 = null;
            coVar.f35525z0.R = true;
            if (coVar.R8) {
                coVar.g8(false, true, 0.0f);
            } else {
                coVar.R8 = true;
            }
            mk mkVar = coVar.Y;
            if (mkVar != null && mkVar.getEditField() != null) {
                coVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
