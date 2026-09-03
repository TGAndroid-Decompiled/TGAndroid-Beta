package org.telegram.ui.Components;
public final class ve0 extends m6 {
    public final int f29464b;
    public final ze0 f29465c;

    public ve0(ze0 ze0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f29464b = i10;
        switch (i10) {
            case 1:
                this.f29465c = ze0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f29465c = ze0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f29464b) {
            case 0:
                this.f29465c.f31376r = f10;
                ((ze0) obj).invalidate();
                return;
            default:
                this.f29465c.f31375n = f10;
                ((ze0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29464b) {
            case 0:
                ze0 ze0Var = (ze0) obj;
                return Float.valueOf(this.f29465c.f31376r);
            default:
                ze0 ze0Var2 = (ze0) obj;
                return Float.valueOf(this.f29465c.f31375n);
        }
    }
}
