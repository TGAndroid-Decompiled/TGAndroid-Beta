package org.telegram.ui.Components;
public final class lf0 extends s6 {
    public final int f28146b;
    public final of0 f28147c;

    public lf0(of0 of0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f28146b = i10;
        switch (i10) {
            case 1:
                this.f28147c = of0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f28147c = of0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f28146b) {
            case 0:
                this.f28147c.f29041r = f7;
                ((of0) obj).invalidate();
                return;
            default:
                this.f28147c.f29040n = f7;
                ((of0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f28146b) {
            case 0:
                of0 of0Var = (of0) obj;
                return Float.valueOf(this.f28147c.f29041r);
            default:
                of0 of0Var2 = (of0) obj;
                return Float.valueOf(this.f28147c.f29040n);
        }
    }
}
