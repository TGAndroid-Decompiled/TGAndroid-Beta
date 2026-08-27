package org.telegram.ui;

public final class o9 extends t9 {

    public final p9 f41038b0;

    public o9(p9 p9Var, int i10) {
        super(i10);
        this.f41038b0 = p9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f41038b0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f41038b0.dismiss();
    }
}
