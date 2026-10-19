package org.telegram.ui;
public final class kc extends o51 {
    public final bd e;

    public kc(bd bdVar, jc jcVar) {
        super(jcVar);
        this.e = bdVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
