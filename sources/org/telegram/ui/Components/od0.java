package org.telegram.ui.Components;
public final class od0 extends q6 {
    public final int f38169b;
    public final rd0 f38170c;

    public od0(rd0 rd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.f38169b = i7;
        switch (i7) {
            case 1:
                this.f38170c = rd0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f38170c = rd0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f38169b) {
            case 0:
                this.f38170c.f39168r = f10;
                ((rd0) obj).invalidate();
                return;
            default:
                this.f38170c.f39167n = f10;
                ((rd0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f38169b) {
            case 0:
                rd0 rd0Var = (rd0) obj;
                return Float.valueOf(this.f38170c.f39168r);
            default:
                rd0 rd0Var2 = (rd0) obj;
                return Float.valueOf(this.f38170c.f39167n);
        }
    }
}
