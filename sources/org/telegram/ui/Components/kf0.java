package org.telegram.ui.Components;
public final class kf0 extends s6 {
    public final int f27837b;
    public final nf0 f27838c;

    public kf0(nf0 nf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f27837b = i10;
        switch (i10) {
            case 1:
                this.f27838c = nf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f27838c = nf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f27837b) {
            case 0:
                this.f27838c.f28767r = f7;
                ((nf0) obj).invalidate();
                return;
            default:
                this.f27838c.f28766n = f7;
                ((nf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f27837b) {
            case 0:
                nf0 nf0Var = (nf0) obj;
                return Float.valueOf(this.f27838c.f28767r);
            default:
                nf0 nf0Var2 = (nf0) obj;
                return Float.valueOf(this.f27838c.f28766n);
        }
    }
}
