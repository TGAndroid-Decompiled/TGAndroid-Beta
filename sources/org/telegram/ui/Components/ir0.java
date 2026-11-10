package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ir0 extends v4.v {
    public sr0 d;
    public final ys0 f34724e;

    public ir0(ys0 ys0Var) {
        this.f34724e = ys0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f57052a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        vs0 vs0Var;
        v4.g0 adapter = recyclerView.getAdapter();
        cq0 cq0Var = null;
        if (adapter instanceof vs0) {
            vs0Var = (vs0) adapter;
        } else {
            vs0Var = null;
        }
        if (k() && vs0Var != null && vs0Var.M(d1Var.b())) {
            tr0 tr0Var = this.f34724e.m0[0];
            if (tr0Var != null) {
                cq0Var = tr0Var.h;
            }
            this.d = cq0Var;
            if (cq0Var != null) {
                cq0Var.setItemAnimator(tr0Var.d);
            }
            return v4.v.l(15, 0);
        }
        return v4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        ys0 ys0Var = this.f34724e;
        if (!ys0Var.E1) {
            yp0 yp0Var = ys0Var.f40653b0;
            if (yp0Var == null || !yp0Var.f48865f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        vs0 vs0Var;
        di.r6 r6Var;
        ArrayList arrayList;
        v4.g0 adapter = recyclerView.getAdapter();
        if (adapter instanceof vs0) {
            vs0Var = (vs0) adapter;
        } else {
            vs0Var = null;
        }
        if (vs0Var == null || !vs0Var.M(d1Var.b()) || !vs0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = vs0Var.D;
        if (!vs0Var.h && (r6Var = vs0Var.f39730s) != null && b10 >= 0 && b10 < r6Var.f9699i.size() && b11 >= 0 && b11 < vs0Var.f39730s.f9699i.size()) {
            if (!(vs0Var.f39730s instanceof di.k6) && vs0Var.f39728n <= 0) {
                arrayList = new ArrayList(vs0Var.f39730s.f9698g);
            } else {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < vs0Var.f39730s.f9699i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) vs0Var.f39730s.f9699i.get(i7)).e1()));
                }
            }
            if (!vs0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                vs0Var.E = true;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) vs0Var.f39730s.f9699i.get(b10);
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) vs0Var.f39730s.f9699i.get(b11);
            arrayList.remove(Integer.valueOf(ijVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ijVar.e1()));
            vs0Var.f39730s.C(arrayList, false);
            vs0Var.j(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        di.r6 r6Var;
        ArrayList arrayList;
        boolean z9;
        sr0 sr0Var = this.d;
        if (sr0Var != null && d1Var != null) {
            sr0Var.d1(false);
        }
        if (i7 == 0) {
            sr0 sr0Var2 = this.d;
            if (sr0Var2 != null && (sr0Var2.getAdapter() instanceof vs0)) {
                vs0 vs0Var = (vs0) this.d.getAdapter();
                ArrayList arrayList2 = vs0Var.D;
                if (!vs0Var.h && (r6Var = vs0Var.f39730s) != null && vs0Var.E) {
                    if (!(r6Var instanceof di.k6) && vs0Var.f39728n <= 0) {
                        arrayList = r6Var.f9698g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < vs0Var.f39730s.f9699i.size(); i10++) {
                            arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) vs0Var.f39730s.f9699i.get(i10)).e1()));
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
                        vs0Var.f39730s.C(arrayList, true);
                    }
                    vs0Var.E = false;
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
        if (d1Var != null) {
            d1Var.f57052a.setPressed(true);
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
    }
}
