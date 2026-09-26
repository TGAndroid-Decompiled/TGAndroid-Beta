package org.telegram.ui.Components;
public abstract class fl0 extends wl0 {
    public boolean E(xl0 xl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(xl0 xl0Var, float f7, int[] iArr);

    public float H(xl0 xl0Var) {
        return xl0Var.computeVerticalScrollOffset() / ((k() * xl0Var.getChildAt(0).getMeasuredHeight()) - xl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(xl0 xl0Var) {
    }

    public void K() {
    }
}
