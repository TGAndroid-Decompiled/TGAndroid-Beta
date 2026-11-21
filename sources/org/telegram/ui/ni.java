package org.telegram.ui;
public final class ni extends org.telegram.ui.ActionBar.g1 {
    public final bn f50196o;

    public ni(bn bnVar, li liVar) {
        super(liVar, -2, -2);
        this.f50196o = bnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f50196o;
        if (bnVar.f46037g9 == this) {
            bnVar.f46037g9 = null;
            bnVar.f46102l9 = null;
            bnVar.f46090k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46050h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46050h9 = true;
            }
            rj rjVar = bnVar.f45946a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f45946a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
