package org.telegram.ui.Components;
public final class cf0 extends q6 {
    public final int f23352b;
    public final ff0 f23353c;

    public cf0(ff0 ff0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f23352b = i10;
        switch (i10) {
            case 1:
                this.f23353c = ff0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f23353c = ff0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f23352b) {
            case 0:
                this.f23353c.f24221r = f7;
                ((ff0) obj).invalidate();
                return;
            default:
                this.f23353c.f24220n = f7;
                ((ff0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23352b) {
            case 0:
                ff0 ff0Var = (ff0) obj;
                return Float.valueOf(this.f23353c.f24221r);
            default:
                ff0 ff0Var2 = (ff0) obj;
                return Float.valueOf(this.f23353c.f24220n);
        }
    }
}
