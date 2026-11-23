package org.telegram.ui;
public final class ni extends org.telegram.ui.ActionBar.g1 {
    public final bn f50318o;

    public ni(bn bnVar, li liVar) {
        super(liVar, -2, -2);
        this.f50318o = bnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f50318o;
        if (bnVar.f46209g9 == this) {
            bnVar.f46209g9 = null;
            bnVar.f46274l9 = null;
            bnVar.f46262k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46222h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46222h9 = true;
            }
            rj rjVar = bnVar.f46118a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f46118a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
