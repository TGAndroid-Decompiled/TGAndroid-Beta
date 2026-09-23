package org.telegram.ui.Components;
public abstract class uk0 extends ll0 {
    public boolean E(ml0 ml0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(ml0 ml0Var, float f7, int[] iArr);

    public float H(ml0 ml0Var) {
        return ml0Var.computeVerticalScrollOffset() / ((k() * ml0Var.getChildAt(0).getMeasuredHeight()) - ml0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(ml0 ml0Var) {
    }

    public void K() {
    }
}
