package org.telegram.ui.Components;
public final class nl0 extends v4.o {
    public final rl0 f36394b;

    public nl0(rl0 rl0Var) {
        this.f36394b = rl0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        rl0 rl0Var = this.f36394b;
        return ((ol0) rl0Var.f37738n.get(i7)).equals(rl0Var.f37739r.get(i10));
    }

    @Override
    public final boolean b(int i7, int i10) {
        rl0 rl0Var = this.f36394b;
        if (((ol0) rl0Var.f37738n.get(i7)).f36742a.h == ((ol0) rl0Var.f37739r.get(i10)).f36742a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36394b.f37739r.size();
    }

    @Override
    public final int e() {
        return this.f36394b.f37738n.size();
    }
}
