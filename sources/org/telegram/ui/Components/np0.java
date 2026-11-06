package org.telegram.ui.Components;
public final class np0 implements org.telegram.messenger.c20 {
    public final org.telegram.ui.Cells.o7 f36359a;
    public final float f36360b;
    public final float f36361c;

    public np0(org.telegram.ui.Cells.o7 o7Var, float f10, float f11) {
        this.f36359a = o7Var;
        this.f36360b = f10;
        this.f36361c = f11;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f36359a.n(this.f36360b, this.f36361c);
    }
}
