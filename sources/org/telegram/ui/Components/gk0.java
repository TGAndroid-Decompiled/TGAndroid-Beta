package org.telegram.ui.Components;
public abstract class gk0 extends vk0 {
    public boolean E(wk0 wk0Var) {
        return true;
    }

    public abstract String F(int i9);

    public abstract void G(wk0 wk0Var, float f10, int[] iArr);

    public float H(wk0 wk0Var) {
        return wk0Var.computeVerticalScrollOffset() / ((k() * wk0Var.getChildAt(0).getMeasuredHeight()) - wk0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(wk0 wk0Var) {
    }

    public void K() {
    }
}
