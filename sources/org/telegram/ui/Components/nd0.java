package org.telegram.ui.Components;
public final class nd0 extends p6 {
    public final int f37763b;
    public final qd0 f37764c;

    public nd0(qd0 qd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.f37763b = i7;
        switch (i7) {
            case 1:
                this.f37764c = qd0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f37764c = qd0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f37763b) {
            case 0:
                this.f37764c.f38768r = f10;
                ((qd0) obj).invalidate();
                return;
            default:
                this.f37764c.f38767n = f10;
                ((qd0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f37763b) {
            case 0:
                qd0 qd0Var = (qd0) obj;
                return Float.valueOf(this.f37764c.f38768r);
            default:
                qd0 qd0Var2 = (qd0) obj;
                return Float.valueOf(this.f37764c.f38767n);
        }
    }
}
