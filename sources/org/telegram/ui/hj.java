package org.telegram.ui;
public final class hj extends org.telegram.ui.ActionBar.n1 {
    public final zn f38363o;

    public hj(zn znVar, fj fjVar) {
        super(fjVar, -2, -2);
        this.f38363o = znVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f38363o;
        if (znVar.Q8 == this) {
            znVar.Q8 = null;
            znVar.T8 = null;
            znVar.S8 = null;
            znVar.f45014z0.R = true;
            if (znVar.R8) {
                znVar.j8(false, true, 0.0f);
            } else {
                znVar.R8 = true;
            }
            ok okVar = znVar.Y;
            if (okVar != null && okVar.getEditField() != null) {
                znVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
