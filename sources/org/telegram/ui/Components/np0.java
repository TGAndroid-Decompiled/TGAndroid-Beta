package org.telegram.ui.Components;
public final class np0 implements org.telegram.messenger.c20 {
    public final org.telegram.ui.Cells.o7 f36357a;
    public final float f36358b;
    public final float f36359c;

    public np0(org.telegram.ui.Cells.o7 o7Var, float f10, float f11) {
        this.f36357a = o7Var;
        this.f36358b = f10;
        this.f36359c = f11;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f36357a.n(this.f36358b, this.f36359c);
    }
}
