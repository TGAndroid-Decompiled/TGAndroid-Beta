package org.telegram.ui;
public final class lc extends r61 {
    public final cd f38275e;

    public lc(cd cdVar, kc kcVar) {
        super(kcVar);
        this.f38275e = cdVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f38275e.Q = null;
    }
}
