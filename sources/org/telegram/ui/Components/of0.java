package org.telegram.ui.Components;
public final class of0 extends s6 {
    public final int f29169b;
    public final rf0 f29170c;

    public of0(rf0 rf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f29169b = i10;
        switch (i10) {
            case 1:
                this.f29170c = rf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f29170c = rf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f29169b) {
            case 0:
                this.f29170c.f30167r = f7;
                ((rf0) obj).invalidate();
                return;
            default:
                this.f29170c.f30166n = f7;
                ((rf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29169b) {
            case 0:
                rf0 rf0Var = (rf0) obj;
                return Float.valueOf(this.f29170c.f30167r);
            default:
                rf0 rf0Var2 = (rf0) obj;
                return Float.valueOf(this.f29170c.f30166n);
        }
    }
}
