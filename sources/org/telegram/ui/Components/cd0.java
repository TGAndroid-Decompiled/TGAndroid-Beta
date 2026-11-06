package org.telegram.ui.Components;
public final class cd0 extends l6 {
    public final int f32541b;
    public final fd0 f32542c;

    public cd0(fd0 fd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.f32541b = i7;
        switch (i7) {
            case 1:
                this.f32542c = fd0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f32542c = fd0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f32541b) {
            case 0:
                this.f32542c.f33513r = f10;
                ((fd0) obj).invalidate();
                return;
            default:
                this.f32542c.f33512n = f10;
                ((fd0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f32541b) {
            case 0:
                fd0 fd0Var = (fd0) obj;
                return Float.valueOf(this.f32542c.f33513r);
            default:
                fd0 fd0Var2 = (fd0) obj;
                return Float.valueOf(this.f32542c.f33512n);
        }
    }
}
