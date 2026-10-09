package org.telegram.ui.Components;
public final class sf0 extends t6 {
    public final int f30777b;
    public final vf0 f30778c;

    public sf0(vf0 vf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f30777b = i10;
        switch (i10) {
            case 1:
                this.f30778c = vf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f30778c = vf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f30777b) {
            case 0:
                this.f30778c.f31773r = f7;
                ((vf0) obj).invalidate();
                return;
            default:
                this.f30778c.f31772n = f7;
                ((vf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30777b) {
            case 0:
                vf0 vf0Var = (vf0) obj;
                return Float.valueOf(this.f30778c.f31773r);
            default:
                vf0 vf0Var2 = (vf0) obj;
                return Float.valueOf(this.f30778c.f31772n);
        }
    }
}
