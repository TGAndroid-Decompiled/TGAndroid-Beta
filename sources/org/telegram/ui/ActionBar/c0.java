package org.telegram.ui.ActionBar;

import android.view.View;
public final class c0 implements View.OnClickListener {
    public final int f28815a;
    public final Object f28816b;
    public final Object f28817c;

    public c0(Object obj, View view, int i7) {
        this.f28815a = i7;
        this.f28816b = obj;
        this.f28817c = view;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28815a) {
            case 0:
                q0 q0Var = (q0) this.f28816b;
                p0 p0Var = (p0) this.f28817c;
                int indexOf = q0Var.f29909h0.indexOf(p0Var.getFilter());
                if (q0Var.f29910i0 != indexOf) {
                    q0Var.f29910i0 = indexOf;
                    q0Var.E();
                    return;
                } else if (p0Var.getFilter().h) {
                    if (!p0Var.f29862a.f57697f) {
                        p0Var.setSelectedForDelete(true);
                        return;
                    }
                    jg.o0 filter = p0Var.getFilter();
                    q0Var.J(filter);
                    m0 m0Var = q0Var.I;
                    if (m0Var != null) {
                        m0Var.j(filter);
                        q0Var.I.l(q0Var.f29904e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                o0 o0Var = (o0) this.f28817c;
                q0 q0Var2 = (q0) this.f28816b;
                if (q0Var2.y() && o0Var.f29832f) {
                    if (!q0Var2.U) {
                        q0Var2.U = true;
                        q0Var2.r();
                    } else {
                        return;
                    }
                }
                y yVar = q0Var2.f29901c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                l0 l0Var = q0Var2.Q;
                if (l0Var != null) {
                    l0Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                t1 t1Var = (t1) this.f28816b;
                if (!((m1) this.f28817c).f29810a) {
                    q1 q1Var = t1Var.f30035n0;
                    if (q1Var != null) {
                        q1Var.h(t1Var, -1);
                    }
                    if (t1Var.f30032k0) {
                        t1Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                t1 t1Var2 = (t1) this.f28816b;
                if (!((m1) this.f28817c).f29810a) {
                    q1 q1Var2 = t1Var2.f30037p0;
                    if (q1Var2 != null) {
                        q1Var2.h(t1Var2, -2);
                    }
                    if (t1Var2.f30032k0) {
                        t1Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                t1 t1Var3 = (t1) this.f28816b;
                if (!((m1) this.f28817c).f29810a) {
                    q1 q1Var3 = t1Var3.f30043t0;
                    if (q1Var3 != null) {
                        q1Var3.h(t1Var3, -2);
                    }
                    if (t1Var3.f30032k0) {
                        t1Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                t1 t1Var4 = (t1) this.f28816b;
                if (!((m1) this.f28817c).f29810a) {
                    oi.c4 c4Var = t1Var4.f30040r0;
                    if (c4Var != null) {
                        c4Var.h(t1Var4, -2);
                    }
                    if (t1Var4.f30032k0) {
                        t1Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public c0(o0 o0Var, q0 q0Var) {
        this.f28815a = 1;
        this.f28817c = o0Var;
        this.f28816b = q0Var;
    }
}
