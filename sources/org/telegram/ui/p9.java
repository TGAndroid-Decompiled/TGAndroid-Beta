package org.telegram.ui;
public final class p9 extends v9 {
    public final q9 f40704h0;

    public p9(q9 q9Var, int i10) {
        super(i10);
        this.f40704h0 = q9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f40704h0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f40704h0.dismiss();
    }
}
