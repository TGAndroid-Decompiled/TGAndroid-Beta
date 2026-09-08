package org.telegram.ui.Components;
public final class re0 extends s6 {
    public final int f30046b;
    public final ue0 f30047c;

    public re0(ue0 ue0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f30046b = i10;
        switch (i10) {
            case 1:
                this.f30047c = ue0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f30047c = ue0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f30046b) {
            case 0:
                this.f30047c.f30901r = f7;
                ((ue0) obj).invalidate();
                return;
            default:
                this.f30047c.f30900n = f7;
                ((ue0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30046b) {
            case 0:
                ue0 ue0Var = (ue0) obj;
                return Float.valueOf(this.f30047c.f30901r);
            default:
                ue0 ue0Var2 = (ue0) obj;
                return Float.valueOf(this.f30047c.f30900n);
        }
    }
}
