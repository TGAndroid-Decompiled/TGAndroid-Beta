package org.telegram.ui.Components;
public abstract class ql0 extends hm0 {
    public boolean E(im0 im0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(im0 im0Var, float f7, int[] iArr);

    public float H(im0 im0Var) {
        return im0Var.computeVerticalScrollOffset() / ((k() * im0Var.getChildAt(0).getMeasuredHeight()) - im0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(im0 im0Var) {
    }

    public void K() {
    }
}
