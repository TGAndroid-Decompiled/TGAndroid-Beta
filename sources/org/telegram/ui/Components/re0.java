package org.telegram.ui.Components;
public final class re0 extends p6 {
    public final int f27599b;
    public final ue0 f27600c;

    public re0(ue0 ue0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f27599b = i10;
        switch (i10) {
            case 1:
                this.f27600c = ue0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f27600c = ue0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f27599b) {
            case 0:
                this.f27600c.f28373r = f7;
                ((ue0) obj).invalidate();
                return;
            default:
                this.f27600c.f28372n = f7;
                ((ue0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f27599b) {
            case 0:
                ue0 ue0Var = (ue0) obj;
                return Float.valueOf(this.f27600c.f28373r);
            default:
                ue0 ue0Var2 = (ue0) obj;
                return Float.valueOf(this.f27600c.f28372n);
        }
    }
}
