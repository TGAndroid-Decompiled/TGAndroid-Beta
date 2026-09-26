package org.telegram.ui.Components;
public final class bf0 extends r6 {
    public final int f23000b;
    public final ef0 f23001c;

    public bf0(ef0 ef0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f23000b = i10;
        switch (i10) {
            case 1:
                this.f23001c = ef0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f23001c = ef0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f23000b) {
            case 0:
                this.f23001c.f23951r = f7;
                ((ef0) obj).invalidate();
                return;
            default:
                this.f23001c.f23950n = f7;
                ((ef0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23000b) {
            case 0:
                ef0 ef0Var = (ef0) obj;
                return Float.valueOf(this.f23001c.f23951r);
            default:
                ef0 ef0Var2 = (ef0) obj;
                return Float.valueOf(this.f23001c.f23950n);
        }
    }
}
