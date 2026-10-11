package org.telegram.ui;
public final class o9 extends u9 {
    public final p9 f40448h0;

    public o9(p9 p9Var, int i10) {
        super(i10);
        this.f40448h0 = p9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f40448h0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f40448h0.dismiss();
    }
}
