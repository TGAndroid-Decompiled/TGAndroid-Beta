package org.telegram.ui.Components;
public abstract class kj0 extends dk0 {
    public boolean E(ek0 ek0Var) {
        return true;
    }

    public abstract String F(int i7);

    public abstract void G(ek0 ek0Var, float f10, int[] iArr);

    public float H(ek0 ek0Var) {
        return ek0Var.computeVerticalScrollOffset() / ((e() * ek0Var.getChildAt(0).getMeasuredHeight()) - ek0Var.getMeasuredHeight());
    }

    public void J(ek0 ek0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
