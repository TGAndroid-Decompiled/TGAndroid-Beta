package org.telegram.ui;
public final class dj extends org.telegram.ui.ActionBar.p1 {
    public final xn f36218o;

    public dj(xn xnVar, bj bjVar) {
        super(bjVar, -2, -2);
        this.f36218o = xnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xn xnVar = this.f36218o;
        if (xnVar.N8 == this) {
            xnVar.N8 = null;
            xnVar.Q8 = null;
            xnVar.P8 = null;
            xnVar.f43367w0.R = true;
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
