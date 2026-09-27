package org.telegram.ui;
public final class gj extends org.telegram.ui.ActionBar.o1 {
    public final xn f33953o;

    public gj(xn xnVar, ej ejVar) {
        super(ejVar, -2, -2);
        this.f33953o = xnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xn xnVar = this.f33953o;
        if (xnVar.Q8 == this) {
            xnVar.Q8 = null;
            xnVar.T8 = null;
            xnVar.S8 = null;
            xnVar.f40002z0.R = true;
            if (xnVar.R8) {
                xnVar.g8(false, true, 0.0f);
            } else {
                xnVar.R8 = true;
            }
            lk lkVar = xnVar.Y;
            if (lkVar != null && lkVar.getEditField() != null) {
                xnVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
