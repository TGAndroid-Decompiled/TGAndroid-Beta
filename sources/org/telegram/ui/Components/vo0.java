package org.telegram.ui.Components;
public final class vo0 implements o1.g {
    public final int f28038a;
    public final fp0 f28039b;

    public vo0(fp0 fp0Var, int i10) {
        this.f28038a = i10;
        this.f28039b = fp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f28038a) {
            case 0:
                this.f28039b.f23054o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f28039b.f23054o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f28039b.f23054o.setScaleX(1.0f / f7);
                return;
            default:
                this.f28039b.f23054o.setScaleY(1.0f / f7);
                return;
        }
    }
}
