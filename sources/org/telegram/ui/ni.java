package org.telegram.ui;
public final class ni extends org.telegram.ui.ActionBar.g1 {
    public final bn f50204o;

    public ni(bn bnVar, li liVar) {
        super(liVar, -2, -2);
        this.f50204o = bnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f50204o;
        if (bnVar.f45994g9 == this) {
            bnVar.f45994g9 = null;
            bnVar.f46059l9 = null;
            bnVar.f46047k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46007h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46007h9 = true;
            }
            rj rjVar = bnVar.f45903a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f45903a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
