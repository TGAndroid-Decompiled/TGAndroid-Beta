package org.telegram.ui.Components;
public abstract class cl0 extends rl0 {
    public boolean E(sl0 sl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(sl0 sl0Var, float f10, int[] iArr);

    public float H(sl0 sl0Var) {
        return sl0Var.computeVerticalScrollOffset() / ((k() * sl0Var.getChildAt(0).getMeasuredHeight()) - sl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(sl0 sl0Var) {
    }

    public void K() {
    }
}
