package org.telegram.ui.Components;
public abstract class gl0 extends xl0 {
    public boolean E(yl0 yl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(yl0 yl0Var, float f7, int[] iArr);

    public float H(yl0 yl0Var) {
        return yl0Var.computeVerticalScrollOffset() / ((k() * yl0Var.getChildAt(0).getMeasuredHeight()) - yl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(yl0 yl0Var) {
    }

    public void K() {
    }
}
