package org.telegram.ui;
public final class mi extends org.telegram.ui.ActionBar.g1 {
    public final an f49238o;

    public mi(an anVar, ki kiVar) {
        super(kiVar, -2, -2);
        this.f49238o = anVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        an anVar = this.f49238o;
        if (anVar.f45197f9 == this) {
            anVar.f45197f9 = null;
            anVar.f45262k9 = null;
            anVar.f45248j9 = null;
            anVar.C0.R = true;
            if (anVar.f45209g9) {
                anVar.x8(false, true, 0.0f);
            } else {
                anVar.f45209g9 = true;
            }
            qj qjVar = anVar.f45118a0;
            if (qjVar != null && qjVar.getEditField() != null) {
                anVar.f45118a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
