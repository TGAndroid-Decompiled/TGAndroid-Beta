package org.telegram.ui;
public final class mi extends org.telegram.ui.ActionBar.g1 {
    public final an f47812o;

    public mi(an anVar, ki kiVar) {
        super(kiVar, -2, -2);
        this.f47812o = anVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        an anVar = this.f47812o;
        if (anVar.f43787e9 == this) {
            anVar.f43787e9 = null;
            anVar.f43826h9 = null;
            anVar.f43813g9 = null;
            anVar.B0.R = true;
            if (anVar.f43801f9) {
                anVar.v8(false, true, 0.0f);
            } else {
                anVar.f43801f9 = true;
            }
            qj qjVar = anVar.Z;
            if (qjVar != null && qjVar.getEditField() != null) {
                anVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
