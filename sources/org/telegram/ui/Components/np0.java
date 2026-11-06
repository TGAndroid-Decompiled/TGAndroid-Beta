package org.telegram.ui.Components;
public final class np0 implements org.telegram.messenger.c20 {
    public final org.telegram.ui.Cells.o7 f36398a;
    public final float f36399b;
    public final float f36400c;

    public np0(org.telegram.ui.Cells.o7 o7Var, float f10, float f11) {
        this.f36398a = o7Var;
        this.f36399b = f10;
        this.f36400c = f11;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f36398a.n(this.f36399b, this.f36400c);
    }
}
