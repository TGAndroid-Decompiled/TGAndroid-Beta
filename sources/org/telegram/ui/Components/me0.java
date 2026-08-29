package org.telegram.ui.Components;
public final class me0 extends q6 {
    public final int f30668b;
    public final pe0 f30669c;

    public me0(pe0 pe0Var, int i10) {
        super("thumbAnimationProgress", 0);
        this.f30668b = i10;
        switch (i10) {
            case 1:
                this.f30669c = pe0Var;
                super("thumbImageVisibleProgress", 0);
                return;
            default:
                this.f30669c = pe0Var;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f9) {
        switch (this.f30668b) {
            case 0:
                this.f30669c.f31662r = f9;
                ((pe0) obj).invalidate();
                return;
            default:
                this.f30669c.f31661n = f9;
                ((pe0) obj).invalidate();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30668b) {
            case 0:
                pe0 pe0Var = (pe0) obj;
                return Float.valueOf(this.f30669c.f31662r);
            default:
                pe0 pe0Var2 = (pe0) obj;
                return Float.valueOf(this.f30669c.f31661n);
        }
    }
}
