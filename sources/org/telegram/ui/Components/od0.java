package org.telegram.ui.Components;
public final class od0 extends q6 {
    public final int f38170b;
    public final rd0 f38171c;

    public od0(rd0 rd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.f38170b = i7;
        switch (i7) {
            case 1:
                this.f38171c = rd0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f38171c = rd0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f38170b) {
            case 0:
                this.f38171c.f39169r = f10;
                ((rd0) obj).invalidate();
                return;
            default:
                this.f38171c.f39168n = f10;
                ((rd0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f38170b) {
            case 0:
                rd0 rd0Var = (rd0) obj;
                return Float.valueOf(this.f38171c.f39169r);
            default:
                rd0 rd0Var2 = (rd0) obj;
                return Float.valueOf(this.f38171c.f39168n);
        }
    }
}
