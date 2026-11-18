package org.telegram.ui.ActionBar;

import android.view.View;
public final class d0 implements View.OnClickListener {
    public final int f28832a;
    public final Object f28833b;
    public final Object f28834c;

    public d0(Object obj, View view, int i7) {
        this.f28832a = i7;
        this.f28833b = obj;
        this.f28834c = view;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28832a) {
            case 0:
                r0 r0Var = (r0) this.f28833b;
                q0 q0Var = (q0) this.f28834c;
                int indexOf = r0Var.f29928h0.indexOf(q0Var.getFilter());
                if (r0Var.f29929i0 != indexOf) {
                    r0Var.f29929i0 = indexOf;
                    r0Var.E();
                    return;
                } else if (q0Var.getFilter().h) {
                    if (!q0Var.f29881a.f57658f) {
                        q0Var.setSelectedForDelete(true);
                        return;
                    }
                    jg.o0 filter = q0Var.getFilter();
                    r0Var.J(filter);
                    n0 n0Var = r0Var.I;
                    if (n0Var != null) {
                        n0Var.j(filter);
                        r0Var.I.l(r0Var.f29923e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                p0 p0Var = (p0) this.f28834c;
                r0 r0Var2 = (r0) this.f28833b;
                if (r0Var2.y() && p0Var.f29851f) {
                    if (!r0Var2.U) {
                        r0Var2.U = true;
                        r0Var2.r();
                    } else {
                        return;
                    }
                }
                z zVar = r0Var2.f29920c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m0 m0Var = r0Var2.Q;
                if (m0Var != null) {
                    m0Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                u1 u1Var = (u1) this.f28833b;
                if (!((n1) this.f28834c).f29829a) {
                    r1 r1Var = u1Var.f30054n0;
                    if (r1Var != null) {
                        r1Var.h(u1Var, -1);
                    }
                    if (u1Var.f30051k0) {
                        u1Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                u1 u1Var2 = (u1) this.f28833b;
                if (!((n1) this.f28834c).f29829a) {
                    r1 r1Var2 = u1Var2.f30056p0;
                    if (r1Var2 != null) {
                        r1Var2.h(u1Var2, -2);
                    }
                    if (u1Var2.f30051k0) {
                        u1Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                u1 u1Var3 = (u1) this.f28833b;
                if (!((n1) this.f28834c).f29829a) {
                    r1 r1Var3 = u1Var3.f30062t0;
                    if (r1Var3 != null) {
                        r1Var3.h(u1Var3, -2);
                    }
                    if (u1Var3.f30051k0) {
                        u1Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                u1 u1Var4 = (u1) this.f28833b;
                if (!((n1) this.f28834c).f29829a) {
                    oi.b4 b4Var = u1Var4.f30059r0;
                    if (b4Var != null) {
                        b4Var.h(u1Var4, -2);
                    }
                    if (u1Var4.f30051k0) {
                        u1Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public d0(p0 p0Var, r0 r0Var) {
        this.f28832a = 1;
        this.f28834c = p0Var;
        this.f28833b = r0Var;
    }
}
