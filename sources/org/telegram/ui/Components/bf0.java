package org.telegram.ui.Components;
public final class bf0 extends r6 {
    public final int f23007b;
    public final ef0 f23008c;

    public bf0(ef0 ef0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f23007b = i10;
        switch (i10) {
            case 1:
                this.f23008c = ef0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f23008c = ef0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f23007b) {
            case 0:
                this.f23008c.f24058r = f7;
                ((ef0) obj).invalidate();
                return;
            default:
                this.f23008c.f24057n = f7;
                ((ef0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23007b) {
            case 0:
                ef0 ef0Var = (ef0) obj;
                return Float.valueOf(this.f23008c.f24058r);
            default:
                ef0 ef0Var2 = (ef0) obj;
                return Float.valueOf(this.f23008c.f24057n);
        }
    }
}
