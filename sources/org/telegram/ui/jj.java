package org.telegram.ui;
public final class jj extends org.telegram.ui.ActionBar.p1 {
    public final eo f34122o;

    public jj(eo eoVar, hj hjVar) {
        super(hjVar, -2, -2);
        this.f34122o = eoVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        eo eoVar = this.f34122o;
        if (eoVar.Q8 == this) {
            eoVar.Q8 = null;
            eoVar.T8 = null;
            eoVar.S8 = null;
            eoVar.f32567z0.R = true;
            if (eoVar.R8) {
                eoVar.g8(false, true, 0.0f);
            } else {
                eoVar.R8 = true;
            }
            ok okVar = eoVar.Y;
            if (okVar != null && okVar.getEditField() != null) {
                eoVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
