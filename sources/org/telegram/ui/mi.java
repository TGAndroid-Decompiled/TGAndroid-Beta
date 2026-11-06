package org.telegram.ui;
public final class mi extends org.telegram.ui.ActionBar.g1 {
    public final an f47786o;

    public mi(an anVar, ki kiVar) {
        super(kiVar, -2, -2);
        this.f47786o = anVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        an anVar = this.f47786o;
        if (anVar.f43757e9 == this) {
            anVar.f43757e9 = null;
            anVar.f43796h9 = null;
            anVar.f43783g9 = null;
            anVar.B0.R = true;
            if (anVar.f43771f9) {
                anVar.v8(false, true, 0.0f);
            } else {
                anVar.f43771f9 = true;
            }
            qj qjVar = anVar.Z;
            if (qjVar != null && qjVar.getEditField() != null) {
                anVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
