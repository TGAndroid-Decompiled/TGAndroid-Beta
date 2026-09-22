package org.telegram.ui;
public final class kc extends y61 {
    public final ad e;

    public kc(ad adVar, jc jcVar) {
        super(jcVar);
        this.e = adVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
