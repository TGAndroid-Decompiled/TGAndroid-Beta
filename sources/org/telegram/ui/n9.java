package org.telegram.ui;
public final class n9 extends s9 {
    public final o9 f48162g0;

    public n9(o9 o9Var, int i7) {
        super(i7);
        this.f48162g0 = o9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f48162g0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f48162g0.dismiss();
    }
}
