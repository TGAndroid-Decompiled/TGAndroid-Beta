package org.telegram.ui.Components;
public final class uf0 extends t6 {
    public final int f31491b;
    public final xf0 f31492c;

    public uf0(xf0 xf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f31491b = i10;
        switch (i10) {
            case 1:
                this.f31492c = xf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f31492c = xf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f31491b) {
            case 0:
                this.f31492c.f32913r = f7;
                ((xf0) obj).invalidate();
                return;
            default:
                this.f31492c.f32912n = f7;
                ((xf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f31491b) {
            case 0:
                xf0 xf0Var = (xf0) obj;
                return Float.valueOf(this.f31492c.f32913r);
            default:
                xf0 xf0Var2 = (xf0) obj;
                return Float.valueOf(this.f31492c.f32912n);
        }
    }
}
