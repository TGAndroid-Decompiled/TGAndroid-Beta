package org.telegram.ui.Components;
public final class yd0 extends l6 {
    public final int f34953b;
    public final be0 f34954c;

    public yd0(be0 be0Var, int i9) {
        super("thumbAnimationProgress", 0);
        this.f34953b = i9;
        switch (i9) {
            case 1:
                this.f34954c = be0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f34954c = be0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f34953b) {
            case 0:
                this.f34954c.f27188r = f10;
                ((be0) obj).invalidate();
                return;
            default:
                this.f34954c.f27187n = f10;
                ((be0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f34953b) {
            case 0:
                be0 be0Var = (be0) obj;
                return Float.valueOf(this.f34954c.f27188r);
            default:
                be0 be0Var2 = (be0) obj;
                return Float.valueOf(this.f34954c.f27187n);
        }
    }
}
