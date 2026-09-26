package org.telegram.ui.Components;
public final class cf0 extends r6 {
    public final int f23314b;
    public final ff0 f23315c;

    public cf0(ff0 ff0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f23314b = i10;
        switch (i10) {
            case 1:
                this.f23315c = ff0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f23315c = ff0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f23314b) {
            case 0:
                this.f23315c.f24266r = f7;
                ((ff0) obj).invalidate();
                return;
            default:
                this.f23315c.f24265n = f7;
                ((ff0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23314b) {
            case 0:
                ff0 ff0Var = (ff0) obj;
                return Float.valueOf(this.f23315c.f24266r);
            default:
                ff0 ff0Var2 = (ff0) obj;
                return Float.valueOf(this.f23315c.f24265n);
        }
    }
}
