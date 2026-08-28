package org.telegram.ui;
public final class n9 extends s9 {
    public final o9 f40650b0;

    public n9(o9 o9Var, int i9) {
        super(i9);
        this.f40650b0 = o9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f40650b0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f40650b0.dismiss();
    }
}
