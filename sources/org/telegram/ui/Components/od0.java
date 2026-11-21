package org.telegram.ui.Components;
public final class od0 extends q6 {
    public final int f38176b;
    public final rd0 f38177c;

    public od0(rd0 rd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.f38176b = i7;
        switch (i7) {
            case 1:
                this.f38177c = rd0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f38177c = rd0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f38176b) {
            case 0:
                this.f38177c.f39159r = f10;
                ((rd0) obj).invalidate();
                return;
            default:
                this.f38177c.f39158n = f10;
                ((rd0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f38176b) {
            case 0:
                rd0 rd0Var = (rd0) obj;
                return Float.valueOf(this.f38177c.f39159r);
            default:
                rd0 rd0Var2 = (rd0) obj;
                return Float.valueOf(this.f38177c.f39158n);
        }
    }
}
