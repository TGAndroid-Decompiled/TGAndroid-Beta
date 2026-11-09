package org.telegram.ui.Components;
public final class dd0 extends l6 {
    public final int f32935b;
    public final gd0 f32936c;

    public dd0(gd0 gd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.f32935b = i7;
        switch (i7) {
            case 1:
                this.f32936c = gd0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f32936c = gd0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f32935b) {
            case 0:
                this.f32936c.f33937r = f10;
                ((gd0) obj).invalidate();
                return;
            default:
                this.f32936c.f33936n = f10;
                ((gd0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f32935b) {
            case 0:
                gd0 gd0Var = (gd0) obj;
                return Float.valueOf(this.f32936c.f33937r);
            default:
                gd0 gd0Var2 = (gd0) obj;
                return Float.valueOf(this.f32936c.f33936n);
        }
    }
}
