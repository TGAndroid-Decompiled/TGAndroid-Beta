package org.telegram.ui.Components;
public final class od0 extends q6 {
    public final int f38136b;
    public final rd0 f38137c;

    public od0(rd0 rd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.f38136b = i7;
        switch (i7) {
            case 1:
                this.f38137c = rd0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f38137c = rd0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f38136b) {
            case 0:
                this.f38137c.f39123r = f10;
                ((rd0) obj).invalidate();
                return;
            default:
                this.f38137c.f39122n = f10;
                ((rd0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f38136b) {
            case 0:
                rd0 rd0Var = (rd0) obj;
                return Float.valueOf(this.f38137c.f39123r);
            default:
                rd0 rd0Var2 = (rd0) obj;
                return Float.valueOf(this.f38137c.f39122n);
        }
    }
}
