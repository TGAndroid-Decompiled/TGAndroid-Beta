package org.telegram.ui;
public final class lc extends x61 {
    public final bd e;

    public lc(bd bdVar, kc kcVar) {
        super(kcVar);
        this.e = bdVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
