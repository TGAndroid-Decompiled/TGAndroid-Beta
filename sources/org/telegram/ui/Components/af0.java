package org.telegram.ui.Components;
public final class af0 extends q6 {
    public final int f21490b;
    public final df0 f21491c;

    public af0(df0 df0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f21490b = i10;
        switch (i10) {
            case 1:
                this.f21491c = df0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f21491c = df0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f21490b) {
            case 0:
                this.f21491c.f22409r = f7;
                ((df0) obj).invalidate();
                return;
            default:
                this.f21491c.f22408n = f7;
                ((df0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21490b) {
            case 0:
                df0 df0Var = (df0) obj;
                return Float.valueOf(this.f21491c.f22409r);
            default:
                df0 df0Var2 = (df0) obj;
                return Float.valueOf(this.f21491c.f22408n);
        }
    }
}
