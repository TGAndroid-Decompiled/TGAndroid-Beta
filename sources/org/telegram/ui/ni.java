package org.telegram.ui;
public final class ni extends org.telegram.ui.ActionBar.h1 {
    public final bn f50205o;

    public ni(bn bnVar, li liVar) {
        super(liVar, -2, -2);
        this.f50205o = bnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f50205o;
        if (bnVar.f46023g9 == this) {
            bnVar.f46023g9 = null;
            bnVar.f46088l9 = null;
            bnVar.f46076k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46036h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46036h9 = true;
            }
            rj rjVar = bnVar.f45932a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f45932a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
