package org.telegram.ui.Components;
public abstract class em0 extends vm0 {
    public boolean E(wm0 wm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(wm0 wm0Var, float f7, int[] iArr);

    public float H(wm0 wm0Var) {
        return wm0Var.computeVerticalScrollOffset() / ((k() * wm0Var.getChildAt(0).getMeasuredHeight()) - wm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(wm0 wm0Var) {
    }

    public void K() {
    }
}
