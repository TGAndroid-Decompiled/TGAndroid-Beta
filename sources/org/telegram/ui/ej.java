package org.telegram.ui;
public final class ej extends org.telegram.ui.ActionBar.n1 {
    public final xn f32943o;

    public ej(xn xnVar, cj cjVar) {
        super(cjVar, -2, -2);
        this.f32943o = xnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xn xnVar = this.f32943o;
        if (xnVar.Q8 == this) {
            xnVar.Q8 = null;
            xnVar.T8 = null;
            xnVar.S8 = null;
            xnVar.f39621z0.R = true;
            if (xnVar.R8) {
                xnVar.g8(false, true, 0.0f);
            } else {
                xnVar.R8 = true;
            }
            jk jkVar = xnVar.Y;
            if (jkVar != null && jkVar.getEditField() != null) {
                xnVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
