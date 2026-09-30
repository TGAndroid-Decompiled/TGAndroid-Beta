package org.telegram.ui.Components;
public final class df0 extends r6 {
    public final int f23637b;
    public final gf0 f23638c;

    public df0(gf0 gf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f23637b = i10;
        switch (i10) {
            case 1:
                this.f23638c = gf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f23638c = gf0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f23637b) {
            case 0:
                this.f23638c.f24546r = f7;
                ((gf0) obj).invalidate();
                return;
            default:
                this.f23638c.f24545n = f7;
                ((gf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23637b) {
            case 0:
                gf0 gf0Var = (gf0) obj;
                return Float.valueOf(this.f23638c.f24546r);
            default:
                gf0 gf0Var2 = (gf0) obj;
                return Float.valueOf(this.f23638c.f24545n);
        }
    }
}
