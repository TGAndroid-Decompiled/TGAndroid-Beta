package org.telegram.ui.Components;
public final class qq0 implements org.telegram.messenger.r20 {
    public final org.telegram.ui.Cells.s7 f29775a;
    public final float f29776b;
    public final float f29777c;

    public qq0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f29775a = s7Var;
        this.f29776b = f7;
        this.f29777c = f10;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f29775a.n(this.f29776b, this.f29777c);
    }
}
