package org.telegram.ui.Components;
public final class bf0 extends r6 {
    public final int f23001b;
    public final ef0 f23002c;

    public bf0(ef0 ef0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f23001b = i10;
        switch (i10) {
            case 1:
                this.f23002c = ef0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f23002c = ef0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f23001b) {
            case 0:
                this.f23002c.f23952r = f7;
                ((ef0) obj).invalidate();
                return;
            default:
                this.f23002c.f23951n = f7;
                ((ef0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23001b) {
            case 0:
                ef0 ef0Var = (ef0) obj;
                return Float.valueOf(this.f23002c.f23952r);
            default:
                ef0 ef0Var2 = (ef0) obj;
                return Float.valueOf(this.f23002c.f23951n);
        }
    }
}
