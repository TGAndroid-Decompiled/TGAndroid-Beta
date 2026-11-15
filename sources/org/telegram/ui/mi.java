package org.telegram.ui;
public final class mi extends org.telegram.ui.ActionBar.g1 {
    public final an f49234o;

    public mi(an anVar, ki kiVar) {
        super(kiVar, -2, -2);
        this.f49234o = anVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        an anVar = this.f49234o;
        if (anVar.f45196f9 == this) {
            anVar.f45196f9 = null;
            anVar.f45261k9 = null;
            anVar.f45247j9 = null;
            anVar.C0.R = true;
            if (anVar.f45208g9) {
                anVar.x8(false, true, 0.0f);
            } else {
                anVar.f45208g9 = true;
            }
            qj qjVar = anVar.f45117a0;
            if (qjVar != null && qjVar.getEditField() != null) {
                anVar.f45117a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
