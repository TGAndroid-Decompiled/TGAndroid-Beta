package org.telegram.ui.Components;
public final class un0 implements o1.g {
    public final int f31044a;
    public final do0 f31045b;

    public un0(do0 do0Var, int i10) {
        this.f31044a = i10;
        this.f31045b = do0Var;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f31044a) {
            case 0:
                this.f31045b.f25526o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f31045b.f25526o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f31045b.f25526o.setScaleX(1.0f / f7);
                return;
            default:
                this.f31045b.f25526o.setScaleY(1.0f / f7);
                return;
        }
    }
}
