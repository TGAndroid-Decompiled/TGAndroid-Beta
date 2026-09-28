package org.telegram.ui.Components;
public final class df0 extends r6 {
    public final int f23652b;
    public final gf0 f23653c;

    public df0(gf0 gf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f23652b = i10;
        switch (i10) {
            case 1:
                this.f23653c = gf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f23653c = gf0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f23652b) {
            case 0:
                this.f23653c.f24544r = f7;
                ((gf0) obj).invalidate();
                return;
            default:
                this.f23653c.f24543n = f7;
                ((gf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23652b) {
            case 0:
                gf0 gf0Var = (gf0) obj;
                return Float.valueOf(this.f23653c.f24544r);
            default:
                gf0 gf0Var2 = (gf0) obj;
                return Float.valueOf(this.f23653c.f24543n);
        }
    }
}
