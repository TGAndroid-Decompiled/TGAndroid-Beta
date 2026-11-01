package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class k7 implements ua {
    public final int f27739a;
    public final Object f27740b;

    public k7(Object obj, int i10) {
        this.f27739a = i10;
        this.f27740b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f27739a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(wb wbVar) {
        th.v2 v2Var;
        switch (this.f27739a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                bb bbVar = wbVar.e;
                ph.k0 k0Var = (ph.k0) this.f27740b;
                vg.f c10 = k0Var.l1.c(bbVar, null, true);
                wg.d dVar = new wg.d(k0Var.I0);
                dVar.e = new xg.a(0);
                float N = org.telegram.messenger.i0.N(0.5f);
                float N2 = org.telegram.messenger.i0.N(0.5f);
                dVar.f52866f = N;
                dVar.h = N2;
                c10.o(dVar);
                c10.q(org.telegram.messenger.i0.L(16.0f));
                bbVar.setCustomBackground(c10);
                return;
            case 7:
                return;
            case 8:
                if (wbVar.f32195a == 2 && (v2Var = ((th.g2) this.f27740b).f49009y.f49797z1) != null) {
                    th.o7 o7Var = ((th.f7) v2Var).d;
                    o7Var.Y0 = true;
                    o7Var.d0();
                    return;
                }
                return;
            case 9:
            case 10:
            default:
                return;
        }
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f27739a;
    }

    @Override
    public final void d(wb wbVar) {
        th.v2 v2Var;
        switch (this.f27739a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            case 8:
                if (wbVar.f32195a == 2 && (v2Var = ((th.g2) this.f27740b).f49009y.f49797z1) != null) {
                    th.o7 o7Var = ((th.f7) v2Var).d;
                    o7Var.Y0 = false;
                    o7Var.d0();
                    return;
                }
                return;
            case 9:
            case 10:
            default:
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f27739a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i10) {
        int L;
        int R;
        switch (this.f27739a) {
            case 0:
                return ((m7) this.f27740b).e.f32122u1.getHeight();
            case 1:
                ua uaVar = (ua) this.f27740b;
                if (uaVar == null) {
                    return 0;
                }
                return uaVar.f(i10);
            case 2:
                L = org.telegram.messenger.i0.L(126.0f);
                R = ((yl) this.f27740b).f32875c.f30964b.R();
                break;
            case 3:
                L = n90.Z((n90) this.f27740b).d;
                R = org.telegram.messenger.i0.L(72.0f);
                break;
            case 4:
                FrameLayout frameLayout = ((dx0) this.f27740b).f25631s1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 5:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f27740b;
                if (z0Var.getParent() instanceof xh.i3) {
                    xh.i3 i3Var = (xh.i3) z0Var.getParent();
                    return (int) ((i3Var.getSwipeOffsetY() + i3Var.getOffsetY()) - i3Var.getTopActionBarOffsetY());
                }
                return 0;
            case 6:
                return 0;
            case 7:
                return (int) ((sg.b0) ((ph.k) this.f27740b).f45154c).f48303u;
            case 8:
                if (((th.g2) this.f27740b).f49009y.f49725g2) {
                    return 0;
                }
                return org.telegram.messenger.i0.L(64.0f);
            case 9:
                return ((th.y3) this.f27740b).f49689r.getPaddingBottom();
            case 10:
                return 0;
            default:
                L = ((vh.o8) this.f27740b).f51628c1.getEditTextHeight();
                R = org.telegram.messenger.i0.L(12.0f);
                break;
        }
        return R + L;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f27739a) {
            case 0:
                return false;
            case 1:
                ua uaVar = (ua) this.f27740b;
                if (uaVar != null && uaVar.g(i10)) {
                    return true;
                }
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            case 7:
                return false;
            case 8:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 9:
                return false;
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f27739a) {
            case 0:
                return 0;
            case 1:
                ua uaVar = (ua) this.f27740b;
                if (uaVar == null) {
                    return org.telegram.messenger.i0.f16166m;
                }
                return uaVar.h(i10);
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return org.telegram.messenger.i0.f16166m;
            case 7:
                return 0;
            case 8:
                return org.telegram.messenger.i0.L(58.0f);
            case 9:
                return 0;
            case 10:
                return (int) (((th.g4) this.f27740b).f49012a + org.telegram.messenger.i0.L(58.0f));
            default:
                return 0;
        }
    }

    private final void A(wb wbVar) {
    }

    private final void B(wb wbVar) {
    }

    private final void C(wb wbVar) {
    }

    private final void D(wb wbVar) {
    }

    private final void E(wb wbVar) {
    }

    private final void F(wb wbVar) {
    }

    private final void G(wb wbVar) {
    }

    private final void H(wb wbVar) {
    }

    private final void I(wb wbVar) {
    }

    private final void J(wb wbVar) {
    }

    private final void K(wb wbVar) {
    }

    private final void L(wb wbVar) {
    }

    private final void M(wb wbVar) {
    }

    private final void N(wb wbVar) {
    }

    private final void O(wb wbVar) {
    }

    private final void i(float f7) {
    }

    private final void j(float f7) {
    }

    private final void k(float f7) {
    }

    private final void l(float f7) {
    }

    private final void m(float f7) {
    }

    private final void n(float f7) {
    }

    private final void o(float f7) {
    }

    private final void p(float f7) {
    }

    private final void q(float f7) {
    }

    private final void r(float f7) {
    }

    private final void s(float f7) {
    }

    private final void t(float f7) {
    }

    private final void u(wb wbVar) {
    }

    private final void v(wb wbVar) {
    }

    private final void w(wb wbVar) {
    }

    private final void x(wb wbVar) {
    }

    private final void y(wb wbVar) {
    }

    private final void z(wb wbVar) {
    }
}
