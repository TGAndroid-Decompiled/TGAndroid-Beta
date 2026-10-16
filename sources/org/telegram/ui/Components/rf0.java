package org.telegram.ui.Components;
public final class rf0 extends u6 {
    public final int f28518b;
    public final uf0 f28519c;

    public rf0(uf0 uf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f28518b = i10;
        switch (i10) {
            case 1:
                this.f28519c = uf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f28519c = uf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f28518b) {
            case 0:
                this.f28519c.f29371r = f7;
                ((uf0) obj).invalidate();
                return;
            default:
                this.f28519c.f29370n = f7;
                ((uf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f28518b) {
            case 0:
                uf0 uf0Var = (uf0) obj;
                return Float.valueOf(this.f28519c.f29371r);
            default:
                uf0 uf0Var2 = (uf0) obj;
                return Float.valueOf(this.f28519c.f29370n);
        }
    }
}
