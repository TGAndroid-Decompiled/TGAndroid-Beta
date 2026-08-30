package org.telegram.ui.Components;
public final class ue0 extends m6 {
    public final int f29210b;
    public final ye0 f29211c;

    public ue0(ye0 ye0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f29210b = i10;
        switch (i10) {
            case 1:
                this.f29211c = ye0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f29211c = ye0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f29210b) {
            case 0:
                this.f29211c.f31008r = f10;
                ((ye0) obj).invalidate();
                return;
            default:
                this.f29211c.f31007n = f10;
                ((ye0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29210b) {
            case 0:
                ye0 ye0Var = (ye0) obj;
                return Float.valueOf(this.f29211c.f31008r);
            default:
                ye0 ye0Var2 = (ye0) obj;
                return Float.valueOf(this.f29211c.f31007n);
        }
    }
}
