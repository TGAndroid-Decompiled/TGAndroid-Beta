package org.telegram.ui;
public final class p9 extends u9 {
    public final q9 f39434f0;

    public p9(q9 q9Var, int i10) {
        super(i10);
        this.f39434f0 = q9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f39434f0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f39434f0.dismiss();
    }
}
