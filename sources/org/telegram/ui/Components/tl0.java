package org.telegram.ui.Components;
public abstract class tl0 extends km0 {
    public boolean E(lm0 lm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(lm0 lm0Var, float f7, int[] iArr);

    public float H(lm0 lm0Var) {
        return lm0Var.computeVerticalScrollOffset() / ((k() * lm0Var.getChildAt(0).getMeasuredHeight()) - lm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(lm0 lm0Var) {
    }

    public void K() {
    }
}
