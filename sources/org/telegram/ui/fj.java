package org.telegram.ui;
public final class fj extends org.telegram.ui.ActionBar.p1 {
    public final zn f34098o;

    public fj(zn znVar, dj djVar) {
        super(djVar, -2, -2);
        this.f34098o = znVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f34098o;
        if (znVar.N8 == this) {
            znVar.N8 = null;
            znVar.Q8 = null;
            znVar.P8 = null;
            znVar.f40786w0.R = true;
            if (znVar.O8) {
                znVar.g8(false, true, 0.0f);
            } else {
                znVar.O8 = true;
            }
            lk lkVar = znVar.V;
            if (lkVar != null && lkVar.getEditField() != null) {
                znVar.V.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
