package org.telegram.ui;
public final class ej extends org.telegram.ui.ActionBar.m1 {
    public final wn f33416o;

    public ej(wn wnVar, cj cjVar) {
        super(cjVar, -2, -2);
        this.f33416o = wnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        wn wnVar = this.f33416o;
        if (wnVar.Q8 == this) {
            wnVar.Q8 = null;
            wnVar.T8 = null;
            wnVar.S8 = null;
            wnVar.f39720z0.R = true;
            if (wnVar.R8) {
                wnVar.g8(false, true, 0.0f);
            } else {
                wnVar.R8 = true;
            }
            jk jkVar = wnVar.Y;
            if (jkVar != null && jkVar.getEditField() != null) {
                wnVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
