package org.telegram.ui.Components;
public final class qf0 extends u6 {
    public final int f28587b;
    public final tf0 f28588c;

    public qf0(tf0 tf0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f28587b = i10;
        switch (i10) {
            case 1:
                this.f28588c = tf0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f28588c = tf0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f28587b) {
            case 0:
                this.f28588c.f29373r = f7;
                ((tf0) obj).invalidate();
                return;
            default:
                this.f28588c.f29372n = f7;
                ((tf0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f28587b) {
            case 0:
                tf0 tf0Var = (tf0) obj;
                return Float.valueOf(this.f28588c.f29373r);
            default:
                tf0 tf0Var2 = (tf0) obj;
                return Float.valueOf(this.f28588c.f29372n);
        }
    }
}
