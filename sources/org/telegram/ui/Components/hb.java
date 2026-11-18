package org.telegram.ui.Components;
public final class hb extends r1.e {
    public final int f35845a;

    public hb(int i7) {
        this.f35845a = i7;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f35845a) {
            case 0:
                return ((lb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.ne0) obj).O;
            default:
                return ((org.telegram.ui.ne0) obj).N;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f35845a) {
            case 0:
                lb.access$2400((lb) obj, f10);
                return;
            case 1:
                org.telegram.ui.ne0 ne0Var = (org.telegram.ui.ne0) obj;
                ne0Var.O = f10;
                ne0Var.invalidate();
                return;
            default:
                org.telegram.ui.ne0 ne0Var2 = (org.telegram.ui.ne0) obj;
                ne0Var2.N = f10;
                ne0Var2.invalidate();
                return;
        }
    }
}
