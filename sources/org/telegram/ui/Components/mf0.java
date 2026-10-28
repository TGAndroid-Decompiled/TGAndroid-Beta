package org.telegram.ui.Components;
public final class mf0 extends u6 {
    public final int f30532b;
    public final pf0 f30533c;

    public mf0(pf0 pf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f30532b = i10;
        switch (i10) {
            case 1:
                this.f30533c = pf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f30533c = pf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f30532b) {
            case 0:
                this.f30533c.f31601r = f7;
                ((pf0) obj).invalidate();
                return;
            default:
                this.f30533c.f31600n = f7;
                ((pf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30532b) {
            case 0:
                pf0 pf0Var = (pf0) obj;
                return Float.valueOf(this.f30533c.f31601r);
            default:
                pf0 pf0Var2 = (pf0) obj;
                return Float.valueOf(this.f30533c.f31600n);
        }
    }
}
