package org.telegram.ui.Components;
public abstract class zl0 extends qm0 {
    public boolean E(rm0 rm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(rm0 rm0Var, float f7, int[] iArr);

    public float H(rm0 rm0Var) {
        return rm0Var.computeVerticalScrollOffset() / ((k() * rm0Var.getChildAt(0).getMeasuredHeight()) - rm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(rm0 rm0Var) {
    }

    public void K() {
    }
}
