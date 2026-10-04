package org.telegram.ui.Components;
public abstract class gl0 extends yl0 {
    public boolean E(zl0 zl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(zl0 zl0Var, float f7, int[] iArr);

    public float H(zl0 zl0Var) {
        return zl0Var.computeVerticalScrollOffset() / ((k() * zl0Var.getChildAt(0).getMeasuredHeight()) - zl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(zl0 zl0Var) {
    }

    public void K() {
    }
}
