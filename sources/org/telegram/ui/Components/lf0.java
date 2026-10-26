package org.telegram.ui.Components;
public final class lf0 extends u6 {
    public final int f30204b;
    public final of0 f30205c;

    public lf0(of0 of0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f30204b = i10;
        switch (i10) {
            case 1:
                this.f30205c = of0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f30205c = of0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f30204b) {
            case 0:
                this.f30205c.f31289r = f7;
                ((of0) obj).invalidate();
                return;
            default:
                this.f30205c.f31288n = f7;
                ((of0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30204b) {
            case 0:
                of0 of0Var = (of0) obj;
                return Float.valueOf(this.f30205c.f31289r);
            default:
                of0 of0Var2 = (of0) obj;
                return Float.valueOf(this.f30205c.f31288n);
        }
    }
}
