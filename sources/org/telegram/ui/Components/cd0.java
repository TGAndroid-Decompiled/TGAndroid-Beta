package org.telegram.ui.Components;
public final class cd0 extends l6 {
    public final int f32528b;
    public final fd0 f32529c;

    public cd0(fd0 fd0Var, int i7) {
        super("thumbAnimationProgress", 0);
        this.f32528b = i7;
        switch (i7) {
            case 1:
                this.f32529c = fd0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f32529c = fd0Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f32528b) {
            case 0:
                this.f32529c.f33523r = f10;
                ((fd0) obj).invalidate();
                return;
            default:
                this.f32529c.f33522n = f10;
                ((fd0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f32528b) {
            case 0:
                fd0 fd0Var = (fd0) obj;
                return Float.valueOf(this.f32529c.f33523r);
            default:
                fd0 fd0Var2 = (fd0) obj;
                return Float.valueOf(this.f32529c.f33522n);
        }
    }
}
