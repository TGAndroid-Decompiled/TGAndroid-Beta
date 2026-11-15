package org.telegram.ui.Components;
public final class qp0 implements org.telegram.messenger.z10 {
    public final org.telegram.ui.Cells.n7 f38738a;
    public final float f38739b;
    public final float f38740c;

    public qp0(org.telegram.ui.Cells.n7 n7Var, float f10, float f11) {
        this.f38738a = n7Var;
        this.f38739b = f10;
        this.f38740c = f11;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f38738a.n(this.f38739b, this.f38740c);
    }
}
