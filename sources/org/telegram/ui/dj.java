package org.telegram.ui;
public final class dj extends org.telegram.ui.ActionBar.p1 {
    public final xn f33670o;

    public dj(xn xnVar, bj bjVar) {
        super(bjVar, -2, -2);
        this.f33670o = xnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xn xnVar = this.f33670o;
        if (xnVar.N8 == this) {
            xnVar.N8 = null;
            xnVar.Q8 = null;
            xnVar.P8 = null;
            xnVar.f40220w0.R = true;
            if (xnVar.O8) {
                xnVar.g8(false, true, 0.0f);
            } else {
                xnVar.O8 = true;
            }
            jk jkVar = xnVar.V;
            if (jkVar != null && jkVar.getEditField() != null) {
                xnVar.V.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
