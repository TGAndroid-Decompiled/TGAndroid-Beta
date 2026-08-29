package org.telegram.ui.Components;
public abstract class tk0 extends il0 {
    public boolean E(jl0 jl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(jl0 jl0Var, float f9, int[] iArr);

    public float H(jl0 jl0Var) {
        return jl0Var.computeVerticalScrollOffset() / ((k() * jl0Var.getChildAt(0).getMeasuredHeight()) - jl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(jl0 jl0Var) {
    }

    public void K() {
    }
}
