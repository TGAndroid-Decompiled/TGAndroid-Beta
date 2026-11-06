package org.telegram.ui.Components;
public final class np0 implements org.telegram.messenger.c20 {
    public final org.telegram.ui.Cells.o7 f36465a;
    public final float f36466b;
    public final float f36467c;

    public np0(org.telegram.ui.Cells.o7 o7Var, float f10, float f11) {
        this.f36465a = o7Var;
        this.f36466b = f10;
        this.f36467c = f11;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f36465a.n(this.f36466b, this.f36467c);
    }
}
