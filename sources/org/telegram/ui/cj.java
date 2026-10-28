package org.telegram.ui;
public final class cj extends org.telegram.ui.ActionBar.o1 {
    public final wn f38373o;

    public cj(wn wnVar, aj ajVar) {
        super(ajVar, -2, -2);
        this.f38373o = wnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        wn wnVar = this.f38373o;
        if (wnVar.f45134g9 == this) {
            wnVar.f45134g9 = null;
            wnVar.f45171j9 = null;
            wnVar.f45159i9 = null;
            wnVar.f45364z0.R = true;
            if (wnVar.f45146h9) {
                wnVar.p8(false, true, 0.0f);
            } else {
                wnVar.f45146h9 = true;
            }
            jk jkVar = wnVar.Y;
            if (jkVar != null && jkVar.getEditField() != null) {
                wnVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
