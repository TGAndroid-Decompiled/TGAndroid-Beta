package org.telegram.ui.Components;
public final class kf0 extends s6 {
    public final int f27866b;
    public final nf0 f27867c;

    public kf0(nf0 nf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f27866b = i10;
        switch (i10) {
            case 1:
                this.f27867c = nf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f27867c = nf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f27866b) {
            case 0:
                this.f27867c.f28758r = f7;
                ((nf0) obj).invalidate();
                return;
            default:
                this.f27867c.f28757n = f7;
                ((nf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f27866b) {
            case 0:
                nf0 nf0Var = (nf0) obj;
                return Float.valueOf(this.f27867c.f28758r);
            default:
                nf0 nf0Var2 = (nf0) obj;
                return Float.valueOf(this.f27867c.f28757n);
        }
    }
}
