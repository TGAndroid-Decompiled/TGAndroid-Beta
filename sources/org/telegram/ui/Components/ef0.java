package org.telegram.ui.Components;
public final class ef0 extends r6 {
    public final int f23972b;
    public final hf0 f23973c;

    public ef0(hf0 hf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f23972b = i10;
        switch (i10) {
            case 1:
                this.f23973c = hf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f23973c = hf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f23972b) {
            case 0:
                this.f23973c.f24860r = f7;
                ((hf0) obj).invalidate();
                return;
            default:
                this.f23973c.f24859n = f7;
                ((hf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23972b) {
            case 0:
                hf0 hf0Var = (hf0) obj;
                return Float.valueOf(this.f23973c.f24860r);
            default:
                hf0 hf0Var2 = (hf0) obj;
                return Float.valueOf(this.f23973c.f24859n);
        }
    }
}
