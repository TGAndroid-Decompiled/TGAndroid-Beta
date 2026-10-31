package org.telegram.ui.Components;
public final class pq0 implements org.telegram.messenger.q20 {
    public final org.telegram.ui.Cells.s7 f29404a;
    public final float f29405b;
    public final float f29406c;

    public pq0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f29404a = s7Var;
        this.f29405b = f7;
        this.f29406c = f10;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f29404a.n(this.f29405b, this.f29406c);
    }
}
