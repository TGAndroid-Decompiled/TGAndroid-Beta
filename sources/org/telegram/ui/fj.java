package org.telegram.ui;
public final class fj extends org.telegram.ui.ActionBar.n1 {
    public final yn f36336o;

    public fj(yn ynVar, dj djVar) {
        super(djVar, -2, -2);
        this.f36336o = ynVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        yn ynVar = this.f36336o;
        if (ynVar.O8 == this) {
            ynVar.O8 = null;
            ynVar.R8 = null;
            ynVar.Q8 = null;
            ynVar.f43551x0.R = true;
            if (ynVar.P8) {
                ynVar.g8(false, true, 0.0f);
            } else {
                ynVar.P8 = true;
            }
            jk jkVar = ynVar.W;
            if (jkVar != null && jkVar.getEditField() != null) {
                ynVar.W.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
