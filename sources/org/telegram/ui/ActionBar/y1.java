package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xb;
public final class y1 implements wa {
    public final int f29884a;
    public final e2 f29885b;

    public y1(int i7, e2 e2Var) {
        this.f29884a = i7;
        this.f29885b = e2Var;
    }

    @Override
    public final boolean a() {
        switch (this.f29884a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(xb xbVar) {
        int i7 = this.f29884a;
    }

    @Override
    public final void c(float f10) {
        int i7 = this.f29884a;
    }

    @Override
    public final void d(xb xbVar) {
        int i7 = this.f29884a;
    }

    @Override
    public final boolean e() {
        switch (this.f29884a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f29884a) {
            case 0:
                if (this.f29885b.isSupportEdgeToEdge()) {
                    return org.telegram.messenger.g0.f23604n;
                }
                return 0;
            default:
                return this.f29885b.getBottomInset();
        }
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f29884a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f29884a) {
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

    private final void k(xb xbVar) {
    }

    private final void l(xb xbVar) {
    }

    private final void m(xb xbVar) {
    }

    private final void n(xb xbVar) {
    }
}
