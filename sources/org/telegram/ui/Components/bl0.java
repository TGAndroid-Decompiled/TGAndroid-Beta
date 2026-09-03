package org.telegram.ui.Components;
public abstract class bl0 extends ql0 {
    public boolean E(rl0 rl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(rl0 rl0Var, float f10, int[] iArr);

    public float H(rl0 rl0Var) {
        return rl0Var.computeVerticalScrollOffset() / ((k() * rl0Var.getChildAt(0).getMeasuredHeight()) - rl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(rl0 rl0Var) {
    }

    public void K() {
    }
}
