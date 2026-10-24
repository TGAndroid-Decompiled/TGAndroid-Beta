package org.telegram.ui.Components;
public final class nf0 extends q6 {
    public final int f28902b;
    public final qf0 f28903c;

    public nf0(qf0 qf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f28902b = i10;
        switch (i10) {
            case 1:
                this.f28903c = qf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f28903c = qf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f28902b) {
            case 0:
                this.f28903c.f29907r = f7;
                ((qf0) obj).invalidate();
                return;
            default:
                this.f28903c.f29906n = f7;
                ((qf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f28902b) {
            case 0:
                qf0 qf0Var = (qf0) obj;
                return Float.valueOf(this.f28903c.f29907r);
            default:
                qf0 qf0Var2 = (qf0) obj;
                return Float.valueOf(this.f28903c.f29906n);
        }
    }
}
