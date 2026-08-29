package org.telegram.ui;
public final class m9 extends r9 {
    public final n9 f40495b0;

    public m9(n9 n9Var, int i10) {
        super(i10);
        this.f40495b0 = n9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f40495b0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f40495b0.dismiss();
    }
}
