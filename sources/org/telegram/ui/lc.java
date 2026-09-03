package org.telegram.ui;
public final class lc extends n61 {
    public final dd e;

    public lc(dd ddVar, kc kcVar) {
        super(kcVar);
        this.e = ddVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.N = null;
    }
}
