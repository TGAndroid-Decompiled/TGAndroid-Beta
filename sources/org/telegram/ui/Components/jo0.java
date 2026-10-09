package org.telegram.ui.Components;
public final class jo0 extends s4.o {
    public final no0 f27750b;

    public jo0(no0 no0Var) {
        this.f27750b = no0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        no0 no0Var = this.f27750b;
        return ((ko0) no0Var.f29224n.get(i10)).equals(no0Var.f29225r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        no0 no0Var = this.f27750b;
        if (((ko0) no0Var.f29224n.get(i10)).f28115a.h == ((ko0) no0Var.f29225r.get(i11)).f28115a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27750b.f29225r.size();
    }

    @Override
    public final int e() {
        return this.f27750b.f29224n.size();
    }
}
