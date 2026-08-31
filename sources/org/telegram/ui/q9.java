package org.telegram.ui;
public final class q9 extends v9 {
    public final r9 f40384c0;

    public q9(r9 r9Var, int i10) {
        super(i10);
        this.f40384c0 = r9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f40384c0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f40384c0.dismiss();
    }
}
