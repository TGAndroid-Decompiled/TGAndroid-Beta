package org.telegram.ui.Components;
public final class np0 implements org.telegram.messenger.c20 {
    public final org.telegram.ui.Cells.o7 f36414a;
    public final float f36415b;
    public final float f36416c;

    public np0(org.telegram.ui.Cells.o7 o7Var, float f10, float f11) {
        this.f36414a = o7Var;
        this.f36415b = f10;
        this.f36416c = f11;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f36414a.n(this.f36415b, this.f36416c);
    }
}
