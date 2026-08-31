package org.telegram.ui.Components;
public final class we0 extends m6 {
    public final int f32739b;
    public final af0 f32740c;

    public we0(af0 af0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f32739b = i10;
        switch (i10) {
            case 1:
                this.f32740c = af0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f32740c = af0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f32739b) {
            case 0:
                this.f32740c.f25253r = f10;
                ((af0) obj).invalidate();
                return;
            default:
                this.f32740c.f25252n = f10;
                ((af0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f32739b) {
            case 0:
                af0 af0Var = (af0) obj;
                return Float.valueOf(this.f32740c.f25253r);
            default:
                af0 af0Var2 = (af0) obj;
                return Float.valueOf(this.f32740c.f25252n);
        }
    }
}
