package org.telegram.ui.Components;
public final class df0 extends r6 {
    public final int f25768b;
    public final gf0 f25769c;

    public df0(gf0 gf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f25768b = i10;
        switch (i10) {
            case 1:
                this.f25769c = gf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f25769c = gf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f25768b) {
            case 0:
                this.f25769c.f26910r = f7;
                ((gf0) obj).invalidate();
                return;
            default:
                this.f25769c.f26909n = f7;
                ((gf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f25768b) {
            case 0:
                gf0 gf0Var = (gf0) obj;
                return Float.valueOf(this.f25769c.f26910r);
            default:
                gf0 gf0Var2 = (gf0) obj;
                return Float.valueOf(this.f25769c.f26909n);
        }
    }
}
