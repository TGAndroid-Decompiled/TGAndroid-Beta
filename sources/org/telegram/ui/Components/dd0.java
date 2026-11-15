package org.telegram.ui.Components;
public final class dd0 extends j6 {
    public final int f33924b;
    public final gd0 f33925c;

    public dd0(gd0 gd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.f33924b = i7;
        switch (i7) {
            case 1:
                this.f33925c = gd0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f33925c = gd0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f33924b) {
            case 0:
                this.f33925c.f34912r = f10;
                ((gd0) obj).invalidate();
                return;
            default:
                this.f33925c.f34911n = f10;
                ((gd0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f33924b) {
            case 0:
                gd0 gd0Var = (gd0) obj;
                return Float.valueOf(this.f33925c.f34912r);
            default:
                gd0 gd0Var2 = (gd0) obj;
                return Float.valueOf(this.f33925c.f34911n);
        }
    }
}
