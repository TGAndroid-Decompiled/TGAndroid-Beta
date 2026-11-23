package org.telegram.ui;
public final class o9 extends t9 {
    public final p9 f50526h0;

    public o9(p9 p9Var, int i7) {
        super(i7);
        this.f50526h0 = p9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f50526h0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f50526h0.dismiss();
    }
}
