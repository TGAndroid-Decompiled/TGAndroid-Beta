package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.cc;
public final class z1 implements ab {
    public final int f28822a;
    public final f2 f28823b;

    public z1(int i7, f2 f2Var) {
        this.f28822a = i7;
        this.f28823b = f2Var;
    }

    @Override
    public final boolean a() {
        switch (this.f28822a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(cc ccVar) {
        int i7 = this.f28822a;
    }

    @Override
    public final void c(float f10) {
        int i7 = this.f28822a;
    }

    @Override
    public final void d(cc ccVar) {
        int i7 = this.f28822a;
    }

    @Override
    public final boolean e() {
        switch (this.f28822a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f28822a) {
            case 0:
                if (this.f28823b.isSupportEdgeToEdge()) {
                    return org.telegram.messenger.g0.f22539n;
                }
                return 0;
            default:
                return this.f28823b.getBottomInset();
        }
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f28822a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f28822a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    private final void i(float f10) {
    }

    private final void j(float f10) {
    }

    private final void k(cc ccVar) {
    }

    private final void l(cc ccVar) {
    }

    private final void m(cc ccVar) {
    }

    private final void n(cc ccVar) {
    }
}
