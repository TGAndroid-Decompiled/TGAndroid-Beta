package org.telegram.ui.Components;
public abstract class ul0 extends lm0 {
    public boolean E(mm0 mm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(mm0 mm0Var, float f7, int[] iArr);

    public float H(mm0 mm0Var) {
        return mm0Var.computeVerticalScrollOffset() / ((k() * mm0Var.getChildAt(0).getMeasuredHeight()) - mm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(mm0 mm0Var) {
    }

    public void K() {
    }
}
