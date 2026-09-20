package org.telegram.ui.Components;
public final class ze0 extends q6 {
    public final int f30806b;
    public final cf0 f30807c;

    public ze0(cf0 cf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f30806b = i10;
        switch (i10) {
            case 1:
                this.f30807c = cf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f30807c = cf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f30806b) {
            case 0:
                this.f30807c.f23282r = f7;
                ((cf0) obj).invalidate();
                return;
            default:
                this.f30807c.f23281n = f7;
                ((cf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30806b) {
            case 0:
                cf0 cf0Var = (cf0) obj;
                return Float.valueOf(this.f30807c.f23282r);
            default:
                cf0 cf0Var2 = (cf0) obj;
                return Float.valueOf(this.f30807c.f23281n);
        }
    }
}
