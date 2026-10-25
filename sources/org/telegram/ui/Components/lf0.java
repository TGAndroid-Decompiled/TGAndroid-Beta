package org.telegram.ui.Components;
public final class lf0 extends u6 {
    public final int f30202b;
    public final of0 f30203c;

    public lf0(of0 of0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f30202b = i10;
        switch (i10) {
            case 1:
                this.f30203c = of0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f30203c = of0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f30202b) {
            case 0:
                this.f30203c.f31287r = f7;
                ((of0) obj).invalidate();
                return;
            default:
                this.f30203c.f31286n = f7;
                ((of0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30202b) {
            case 0:
                of0 of0Var = (of0) obj;
                return Float.valueOf(this.f30203c.f31287r);
            default:
                of0 of0Var2 = (of0) obj;
                return Float.valueOf(this.f30203c.f31286n);
        }
    }
}
