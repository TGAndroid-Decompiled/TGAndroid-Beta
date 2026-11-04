package org.telegram.ui.Components;
public final class xc0 extends j6 {
    public final int f40308b;
    public final ad0 f40309c;

    public xc0(ad0 ad0Var, int i3) {
        super("thumbAnimationProgress", 0);
        this.f40308b = i3;
        switch (i3) {
            case 1:
                this.f40309c = ad0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f40309c = ad0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f40308b) {
            case 0:
                this.f40309c.f31813r = f10;
                ((ad0) obj).invalidate();
                return;
            default:
                this.f40309c.f31812n = f10;
                ((ad0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40308b) {
            case 0:
                ad0 ad0Var = (ad0) obj;
                return Float.valueOf(this.f40309c.f31813r);
            default:
                ad0 ad0Var2 = (ad0) obj;
                return Float.valueOf(this.f40309c.f31812n);
        }
    }
}
