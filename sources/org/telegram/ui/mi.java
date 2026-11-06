package org.telegram.ui;
public final class mi extends org.telegram.ui.ActionBar.g1 {
    public final an f47813o;

    public mi(an anVar, ki kiVar) {
        super(kiVar, -2, -2);
        this.f47813o = anVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        an anVar = this.f47813o;
        if (anVar.f43782e9 == this) {
            anVar.f43782e9 = null;
            anVar.f43821h9 = null;
            anVar.f43808g9 = null;
            anVar.B0.R = true;
            if (anVar.f43796f9) {
                anVar.v8(false, true, 0.0f);
            } else {
                anVar.f43796f9 = true;
            }
            qj qjVar = anVar.Z;
            if (qjVar != null && qjVar.getEditField() != null) {
                anVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
