package org.telegram.ui.Components;
public abstract class ij0 extends bk0 {
    public boolean E(ck0 ck0Var) {
        return true;
    }

    public abstract String F(int i7);

    public abstract void G(ck0 ck0Var, float f10, int[] iArr);

    public float H(ck0 ck0Var) {
        return ck0Var.computeVerticalScrollOffset() / ((e() * ck0Var.getChildAt(0).getMeasuredHeight()) - ck0Var.getMeasuredHeight());
    }

    public void J(ck0 ck0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
