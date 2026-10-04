package org.telegram.ui;
public final class lc extends t61 {
    public final cd f38228e;

    public lc(cd cdVar, kc kcVar) {
        super(kcVar);
        this.f38228e = cdVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f38228e.Q = null;
    }
}
