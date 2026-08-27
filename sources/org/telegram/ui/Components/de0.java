package org.telegram.ui.Components;

public final class de0 extends l6 {

    public final int f27730b;

    public final ge0 f27731c;

    public de0(ge0 ge0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f27730b = i10;
        switch (i10) {
            case 1:
                this.f27731c = ge0Var;
                super("thumbImageVisibleProgress", 0);
                break;
            default:
                this.f27731c = ge0Var;
                break;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f27730b) {
            case 0:
                this.f27731c.f28607r = f10;
                ((ge0) obj).invalidate();
                break;
            default:
                this.f27731c.f28606n = f10;
                ((ge0) obj).invalidate();
                break;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f27730b) {
            case 0:
                return Float.valueOf(this.f27731c.f28607r);
            default:
                return Float.valueOf(this.f27731c.f28606n);
        }
    }
}
