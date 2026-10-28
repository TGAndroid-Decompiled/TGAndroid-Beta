package org.telegram.ui.Components;
public abstract class ul0 extends mm0 {
    public boolean E(nm0 nm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(nm0 nm0Var, float f7, int[] iArr);

    public float H(nm0 nm0Var) {
        return nm0Var.computeVerticalScrollOffset() / ((k() * nm0Var.getChildAt(0).getMeasuredHeight()) - nm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void K() {
    }

    public void J(nm0 nm0Var) {
    }
}
