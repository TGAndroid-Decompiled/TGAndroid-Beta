package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class jr0 extends v4.v {
    public tr0 d;
    public final zs0 f35116e;

    public jr0(zs0 zs0Var) {
        this.f35116e = zs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f57056a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        ws0 ws0Var;
        v4.g0 adapter = recyclerView.getAdapter();
        dq0 dq0Var = null;
        if (adapter instanceof ws0) {
            ws0Var = (ws0) adapter;
        } else {
            ws0Var = null;
        }
        if (k() && ws0Var != null && ws0Var.M(d1Var.b())) {
            ur0 ur0Var = this.f35116e.m0[0];
            if (ur0Var != null) {
                dq0Var = ur0Var.h;
            }
            this.d = dq0Var;
            if (dq0Var != null) {
                dq0Var.setItemAnimator(ur0Var.d);
            }
            return v4.v.l(15, 0);
        }
        return v4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        zs0 zs0Var = this.f35116e;
        if (!zs0Var.E1) {
            zp0 zp0Var = zs0Var.f41061b0;
            if (zp0Var == null || !zp0Var.f48549f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        ws0 ws0Var;
        di.r6 r6Var;
        ArrayList arrayList;
        v4.g0 adapter = recyclerView.getAdapter();
        if (adapter instanceof ws0) {
            ws0Var = (ws0) adapter;
        } else {
            ws0Var = null;
        }
        if (ws0Var == null || !ws0Var.M(d1Var.b()) || !ws0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = ws0Var.D;
        if (!ws0Var.h && (r6Var = ws0Var.f40145s) != null && b10 >= 0 && b10 < r6Var.f9694i.size() && b11 >= 0 && b11 < ws0Var.f40145s.f9694i.size()) {
            if (!(ws0Var.f40145s instanceof di.k6) && ws0Var.f40143n <= 0) {
                arrayList = new ArrayList(ws0Var.f40145s.f9693g);
            } else {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < ws0Var.f40145s.f9694i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) ws0Var.f40145s.f9694i.get(i7)).e1()));
                }
            }
            if (!ws0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ws0Var.E = true;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) ws0Var.f40145s.f9694i.get(b10);
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) ws0Var.f40145s.f9694i.get(b11);
            arrayList.remove(Integer.valueOf(ijVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ijVar.e1()));
            ws0Var.f40145s.C(arrayList, false);
            ws0Var.j(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        di.r6 r6Var;
        ArrayList arrayList;
        boolean z9;
        tr0 tr0Var = this.d;
        if (tr0Var != null && d1Var != null) {
            tr0Var.d1(false);
        }
        if (i7 == 0) {
            tr0 tr0Var2 = this.d;
            if (tr0Var2 != null && (tr0Var2.getAdapter() instanceof ws0)) {
                ws0 ws0Var = (ws0) this.d.getAdapter();
                ArrayList arrayList2 = ws0Var.D;
                if (!ws0Var.h && (r6Var = ws0Var.f40145s) != null && ws0Var.E) {
                    if (!(r6Var instanceof di.k6) && ws0Var.f40143n <= 0) {
                        arrayList = r6Var.f9693g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < ws0Var.f40145s.f9694i.size(); i10++) {
                            arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) ws0Var.f40145s.f9694i.get(i10)).e1()));
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i11) != arrayList.get(i11)) {
                                z9 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (z9) {
                        ws0Var.f40145s.C(arrayList, true);
                    }
                    ws0Var.E = false;
                }
            }
            tr0 tr0Var3 = this.d;
            if (tr0Var3 != null) {
                tr0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        tr0 tr0Var4 = this.d;
        if (tr0Var4 != null) {
            tr0Var4.I0(false);
        }
        if (d1Var != null) {
            d1Var.f57056a.setPressed(true);
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
    }
}
