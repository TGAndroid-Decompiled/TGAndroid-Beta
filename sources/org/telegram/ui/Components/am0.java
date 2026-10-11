package org.telegram.ui.Components;
public abstract class am0 extends rm0 {
    public boolean E(sm0 sm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(sm0 sm0Var, float f7, int[] iArr);

    public float H(sm0 sm0Var) {
        return sm0Var.computeVerticalScrollOffset() / ((k() * sm0Var.getChildAt(0).getMeasuredHeight()) - sm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(sm0 sm0Var) {
    }

    public void K() {
    }
}
