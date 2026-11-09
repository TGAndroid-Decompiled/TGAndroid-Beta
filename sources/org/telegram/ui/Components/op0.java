package org.telegram.ui.Components;
public final class op0 implements org.telegram.messenger.c20 {
    public final org.telegram.ui.Cells.o7 f36768a;
    public final float f36769b;
    public final float f36770c;

    public op0(org.telegram.ui.Cells.o7 o7Var, float f10, float f11) {
        this.f36768a = o7Var;
        this.f36769b = f10;
        this.f36770c = f11;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f36768a.n(this.f36769b, this.f36770c);
    }
}
