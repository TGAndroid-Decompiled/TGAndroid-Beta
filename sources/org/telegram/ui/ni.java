package org.telegram.ui;
public final class ni extends org.telegram.ui.ActionBar.g1 {
    public final bn f50200o;

    public ni(bn bnVar, li liVar) {
        super(liVar, -2, -2);
        this.f50200o = bnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f50200o;
        if (bnVar.f46041g9 == this) {
            bnVar.f46041g9 = null;
            bnVar.f46106l9 = null;
            bnVar.f46094k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46054h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46054h9 = true;
            }
            rj rjVar = bnVar.f45950a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f45950a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
