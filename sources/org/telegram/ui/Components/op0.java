package org.telegram.ui.Components;
public final class op0 implements org.telegram.messenger.u10 {
    public final org.telegram.ui.Cells.n7 f36921a;
    public final float f36922b;
    public final float f36923c;

    public op0(org.telegram.ui.Cells.n7 n7Var, float f10, float f11) {
        this.f36921a = n7Var;
        this.f36922b = f10;
        this.f36923c = f11;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f36921a.n(this.f36922b, this.f36923c);
    }
}
