package org.telegram.ui;
public final class n9 extends t9 {
    public final o9 f49525h0;

    public n9(o9 o9Var, int i7) {
        super(i7);
        this.f49525h0 = o9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f49525h0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f49525h0.dismiss();
    }
}
