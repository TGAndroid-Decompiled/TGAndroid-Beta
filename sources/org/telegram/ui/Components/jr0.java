package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class jr0 extends v4.v {
    public sr0 d;
    public final ys0 f36156e;

    public jr0(ys0 ys0Var) {
        this.f36156e = ys0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f58535a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        vs0 vs0Var;
        v4.h0 adapter = recyclerView.getAdapter();
        dq0 dq0Var = null;
        if (adapter instanceof vs0) {
            vs0Var = (vs0) adapter;
        } else {
            vs0Var = null;
        }
        if (k() && vs0Var != null && vs0Var.M(e1Var.b())) {
            tr0 tr0Var = this.f36156e.f42119n0[0];
            if (tr0Var != null) {
                dq0Var = tr0Var.h;
            }
            this.d = dq0Var;
            if (dq0Var != null) {
                dq0Var.setItemAnimator(tr0Var.d);
            }
            return v4.v.l(15, 0);
        }
        return v4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        ys0 ys0Var = this.f36156e;
        if (!ys0Var.F1) {
            zp0 zp0Var = ys0Var.f42086c0;
            if (zp0Var == null || !zp0Var.f48449f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        vs0 vs0Var;
        fi.k6 k6Var;
        ArrayList arrayList;
        v4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof vs0) {
            vs0Var = (vs0) adapter;
        } else {
            vs0Var = null;
        }
        if (vs0Var == null || !vs0Var.M(e1Var.b()) || !vs0Var.M(e1Var2.b())) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        ArrayList arrayList2 = vs0Var.E;
        if (!vs0Var.h && (k6Var = vs0Var.f41149s) != null && b10 >= 0 && b10 < k6Var.f11944i.size() && b11 >= 0 && b11 < vs0Var.f41149s.f11944i.size()) {
            if (!(vs0Var.f41149s instanceof fi.c6) && vs0Var.f41147n <= 0) {
                arrayList = new ArrayList(vs0Var.f41149s.f11943g);
            } else {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < vs0Var.f41149s.f11944i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.gj) vs0Var.f41149s.f11944i.get(i7)).e1()));
                }
            }
            if (!vs0Var.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                vs0Var.F = true;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) vs0Var.f41149s.f11944i.get(b10);
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) vs0Var.f41149s.f11944i.get(b11);
            arrayList.remove(Integer.valueOf(gjVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(gjVar.e1()));
            vs0Var.f41149s.C(arrayList, false);
            vs0Var.j(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        fi.k6 k6Var;
        ArrayList arrayList;
        boolean z10;
        sr0 sr0Var = this.d;
        if (sr0Var != null && e1Var != null) {
            sr0Var.d1(false);
        }
        if (i7 == 0) {
            sr0 sr0Var2 = this.d;
            if (sr0Var2 != null && (sr0Var2.getAdapter() instanceof vs0)) {
                vs0 vs0Var = (vs0) this.d.getAdapter();
                ArrayList arrayList2 = vs0Var.E;
                if (!vs0Var.h && (k6Var = vs0Var.f41149s) != null && vs0Var.F) {
                    if (!(k6Var instanceof fi.c6) && vs0Var.f41147n <= 0) {
                        arrayList = k6Var.f11943g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < vs0Var.f41149s.f11944i.size(); i10++) {
                            arrayList.add(Integer.valueOf(((org.telegram.messenger.gj) vs0Var.f41149s.f11944i.get(i10)).e1()));
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i11) != arrayList.get(i11)) {
                                z10 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (z10) {
                        vs0Var.f41149s.C(arrayList, true);
                    }
                    vs0Var.F = false;
                }
            }
            sr0 sr0Var3 = this.d;
            if (sr0Var3 != null) {
                sr0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        sr0 sr0Var4 = this.d;
        if (sr0Var4 != null) {
            sr0Var4.I0(false);
        }
        if (e1Var != null) {
            e1Var.f58535a.setPressed(true);
        }
    }

    @Override
    public final void q(v4.e1 e1Var) {
    }
}
