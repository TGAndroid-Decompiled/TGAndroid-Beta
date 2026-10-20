package org.telegram.ui.Components;
public abstract class rl0 extends im0 {
    public boolean E(jm0 jm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(jm0 jm0Var, float f7, int[] iArr);

    public float H(jm0 jm0Var) {
        return jm0Var.computeVerticalScrollOffset() / ((k() * jm0Var.getChildAt(0).getMeasuredHeight()) - jm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(jm0 jm0Var) {
    }

    public void K() {
    }
}
