package org.telegram.ui.Components;
public abstract class vi0 extends oj0 {
    public boolean E(pj0 pj0Var) {
        return true;
    }

    public abstract String F(int i7);

    public abstract void G(pj0 pj0Var, float f10, int[] iArr);

    public float H(pj0 pj0Var) {
        return pj0Var.computeVerticalScrollOffset() / ((e() * pj0Var.getChildAt(0).getMeasuredHeight()) - pj0Var.getMeasuredHeight());
    }

    public void J(pj0 pj0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
