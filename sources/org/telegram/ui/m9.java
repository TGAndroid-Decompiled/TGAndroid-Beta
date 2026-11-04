package org.telegram.ui;
public final class m9 extends s9 {
    public final n9 f47564h0;

    public m9(n9 n9Var, int i3) {
        super(i3);
        this.f47564h0 = n9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f47564h0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f47564h0.dismiss();
    }
}
