package org.telegram.ui.Components;
public final class qp0 implements org.telegram.messenger.z10 {
    public final org.telegram.ui.Cells.n7 f38740a;
    public final float f38741b;
    public final float f38742c;

    public qp0(org.telegram.ui.Cells.n7 n7Var, float f10, float f11) {
        this.f38740a = n7Var;
        this.f38741b = f10;
        this.f38742c = f11;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f38740a.n(this.f38741b, this.f38742c);
    }
}
