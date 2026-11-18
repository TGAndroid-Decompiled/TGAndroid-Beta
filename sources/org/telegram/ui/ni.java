package org.telegram.ui;
public final class ni extends org.telegram.ui.ActionBar.h1 {
    public final bn f50189o;

    public ni(bn bnVar, li liVar) {
        super(liVar, -2, -2);
        this.f50189o = bnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f50189o;
        if (bnVar.f46014g9 == this) {
            bnVar.f46014g9 = null;
            bnVar.f46079l9 = null;
            bnVar.f46067k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46027h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46027h9 = true;
            }
            rj rjVar = bnVar.f45923a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f45923a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
