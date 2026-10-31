package org.telegram.ui.Components;
public final class xd0 extends h6 {
    public final int f32459b;
    public final be0 f32460c;

    public xd0(be0 be0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f32459b = i10;
        switch (i10) {
            case 1:
                this.f32460c = be0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f32460c = be0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f32459b) {
            case 0:
                this.f32460c.f24619r = f7;
                ((be0) obj).invalidate();
                return;
            default:
                this.f32460c.f24618n = f7;
                ((be0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f32459b) {
            case 0:
                be0 be0Var = (be0) obj;
                return Float.valueOf(this.f32460c.f24619r);
            default:
                be0 be0Var2 = (be0) obj;
                return Float.valueOf(this.f32460c.f24618n);
        }
    }
}
