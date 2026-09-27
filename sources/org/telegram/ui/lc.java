package org.telegram.ui;
public final class lc extends t61 {
    public final cd e;

    public lc(cd cdVar, kc kcVar) {
        super(kcVar);
        this.e = cdVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
