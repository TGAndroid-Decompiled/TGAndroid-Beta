package org.telegram.ui.Components;
public abstract class ak0 extends sk0 {
    public boolean E(tk0 tk0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(tk0 tk0Var, float f7, int[] iArr);

    public float H(tk0 tk0Var) {
        return tk0Var.computeVerticalScrollOffset() / ((e() * tk0Var.getChildAt(0).getMeasuredHeight()) - tk0Var.getMeasuredHeight());
    }

    public void J(tk0 tk0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
