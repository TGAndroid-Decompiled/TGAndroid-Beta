package org.telegram.ui.ActionBar;

import android.view.View;
public final class c0 implements View.OnClickListener {
    public final int f28818a;
    public final Object f28819b;
    public final Object f28820c;

    public c0(Object obj, View view, int i7) {
        this.f28818a = i7;
        this.f28819b = obj;
        this.f28820c = view;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28818a) {
            case 0:
                q0 q0Var = (q0) this.f28819b;
                p0 p0Var = (p0) this.f28820c;
                int indexOf = q0Var.f29912h0.indexOf(p0Var.getFilter());
                if (q0Var.f29913i0 != indexOf) {
                    q0Var.f29913i0 = indexOf;
                    q0Var.E();
                    return;
                } else if (p0Var.getFilter().h) {
                    if (!p0Var.f29865a.f57701f) {
                        p0Var.setSelectedForDelete(true);
                        return;
                    }
                    jg.o0 filter = p0Var.getFilter();
                    q0Var.J(filter);
                    m0 m0Var = q0Var.I;
                    if (m0Var != null) {
                        m0Var.j(filter);
                        q0Var.I.l(q0Var.f29907e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                o0 o0Var = (o0) this.f28820c;
                q0 q0Var2 = (q0) this.f28819b;
                if (q0Var2.y() && o0Var.f29835f) {
                    if (!q0Var2.U) {
                        q0Var2.U = true;
                        q0Var2.r();
                    } else {
                        return;
                    }
                }
                y yVar = q0Var2.f29904c;
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
                t1 t1Var = (t1) this.f28819b;
                if (!((m1) this.f28820c).f29813a) {
                    q1 q1Var = t1Var.f30038n0;
                    if (q1Var != null) {
                        q1Var.h(t1Var, -1);
                    }
                    if (t1Var.f30035k0) {
                        t1Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                t1 t1Var2 = (t1) this.f28819b;
                if (!((m1) this.f28820c).f29813a) {
                    q1 q1Var2 = t1Var2.f30040p0;
                    if (q1Var2 != null) {
                        q1Var2.h(t1Var2, -2);
                    }
                    if (t1Var2.f30035k0) {
                        t1Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                t1 t1Var3 = (t1) this.f28819b;
                if (!((m1) this.f28820c).f29813a) {
                    q1 q1Var3 = t1Var3.f30046t0;
                    if (q1Var3 != null) {
                        q1Var3.h(t1Var3, -2);
                    }
                    if (t1Var3.f30035k0) {
                        t1Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                t1 t1Var4 = (t1) this.f28819b;
                if (!((m1) this.f28820c).f29813a) {
                    oi.c4 c4Var = t1Var4.f30043r0;
                    if (c4Var != null) {
                        c4Var.h(t1Var4, -2);
                    }
                    if (t1Var4.f30035k0) {
                        t1Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public c0(o0 o0Var, q0 q0Var) {
        this.f28818a = 1;
        this.f28820c = o0Var;
        this.f28819b = q0Var;
    }
}
