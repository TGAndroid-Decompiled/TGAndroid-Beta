package org.telegram.ui.Components;
public final class tf0 extends t6 {
    public final int f31236b;
    public final wf0 f31237c;

    public tf0(wf0 wf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f31236b = i10;
        switch (i10) {
            case 1:
                this.f31237c = wf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f31237c = wf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f31236b) {
            case 0:
                this.f31237c.f32687r = f7;
                ((wf0) obj).invalidate();
                return;
            default:
                this.f31237c.f32686n = f7;
                ((wf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f31236b) {
            case 0:
                wf0 wf0Var = (wf0) obj;
                return Float.valueOf(this.f31237c.f32687r);
            default:
                wf0 wf0Var2 = (wf0) obj;
                return Float.valueOf(this.f31237c.f32686n);
        }
    }
}
