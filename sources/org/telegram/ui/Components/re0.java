package org.telegram.ui.Components;
public final class re0 extends p6 {
    public final int f27623b;
    public final ue0 f27624c;

    public re0(ue0 ue0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f27623b = i10;
        switch (i10) {
            case 1:
                this.f27624c = ue0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f27624c = ue0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f27623b) {
            case 0:
                this.f27624c.f28383r = f7;
                ((ue0) obj).invalidate();
                return;
            default:
                this.f27624c.f28382n = f7;
                ((ue0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f27623b) {
            case 0:
                ue0 ue0Var = (ue0) obj;
                return Float.valueOf(this.f27624c.f28383r);
            default:
                ue0 ue0Var2 = (ue0) obj;
                return Float.valueOf(this.f27624c.f28382n);
        }
    }
}
