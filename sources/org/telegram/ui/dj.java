package org.telegram.ui;
public final class dj extends org.telegram.ui.ActionBar.p1 {
    public final xn f36254o;

    public dj(xn xnVar, bj bjVar) {
        super(bjVar, -2, -2);
        this.f36254o = xnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xn xnVar = this.f36254o;
        if (xnVar.N8 == this) {
            xnVar.N8 = null;
            xnVar.Q8 = null;
            xnVar.P8 = null;
            xnVar.f43389w0.R = true;
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
