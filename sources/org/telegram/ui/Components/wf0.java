package org.telegram.ui.Components;
public final class wf0 extends t6 {
    public final int f32383b;
    public final zf0 f32384c;

    public wf0(zf0 zf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f32383b = i10;
        switch (i10) {
            case 1:
                this.f32384c = zf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f32384c = zf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f32383b) {
            case 0:
                this.f32384c.f33347r = f7;
                ((zf0) obj).invalidate();
                return;
            default:
                this.f32384c.f33346n = f7;
                ((zf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f32383b) {
            case 0:
                zf0 zf0Var = (zf0) obj;
                return Float.valueOf(this.f32384c.f33347r);
            default:
                zf0 zf0Var2 = (zf0) obj;
                return Float.valueOf(this.f32384c.f33346n);
        }
    }
}
