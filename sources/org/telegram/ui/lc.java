package org.telegram.ui;
public final class lc extends t61 {
    public final cd f38233e;

    public lc(cd cdVar, kc kcVar) {
        super(kcVar);
        this.f38233e = cdVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f38233e.Q = null;
    }
}
