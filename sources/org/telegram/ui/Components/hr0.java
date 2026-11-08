package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class hr0 extends v4.v {
    public rr0 d;
    public final xs0 f34333e;

    public hr0(xs0 xs0Var) {
        this.f34333e = xs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f57044a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        us0 us0Var;
        v4.g0 adapter = recyclerView.getAdapter();
        cq0 cq0Var = null;
        if (adapter instanceof us0) {
            us0Var = (us0) adapter;
        } else {
            us0Var = null;
        }
        if (k() && us0Var != null && us0Var.M(d1Var.b())) {
            sr0 sr0Var = this.f34333e.m0[0];
            if (sr0Var != null) {
                cq0Var = sr0Var.h;
            }
            this.d = cq0Var;
            if (cq0Var != null) {
                cq0Var.setItemAnimator(sr0Var.d);
            }
            return v4.v.l(15, 0);
        }
        return v4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        xs0 xs0Var = this.f34333e;
        if (!xs0Var.E1) {
            yp0 yp0Var = xs0Var.f40395b0;
            if (yp0Var == null || !yp0Var.f47344f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        us0 us0Var;
        di.q6 q6Var;
        ArrayList arrayList;
        v4.g0 adapter = recyclerView.getAdapter();
        if (adapter instanceof us0) {
            us0Var = (us0) adapter;
        } else {
            us0Var = null;
        }
        if (us0Var == null || !us0Var.M(d1Var.b()) || !us0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = us0Var.D;
        if (!us0Var.h && (q6Var = us0Var.f38732s) != null && b10 >= 0 && b10 < q6Var.f9643i.size() && b11 >= 0 && b11 < us0Var.f38732s.f9643i.size()) {
            if (!(us0Var.f38732s instanceof di.j6) && us0Var.f38730n <= 0) {
                arrayList = new ArrayList(us0Var.f38732s.f9642g);
            } else {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < us0Var.f38732s.f9643i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) us0Var.f38732s.f9643i.get(i7)).f1()));
                }
            }
            if (!us0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                us0Var.E = true;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) us0Var.f38732s.f9643i.get(b10);
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) us0Var.f38732s.f9643i.get(b11);
            arrayList.remove(Integer.valueOf(ijVar.f1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ijVar.f1()));
            us0Var.f38732s.C(arrayList, false);
            us0Var.j(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        di.q6 q6Var;
        ArrayList arrayList;
        boolean z9;
        rr0 rr0Var = this.d;
        if (rr0Var != null && d1Var != null) {
            rr0Var.d1(false);
        }
        if (i7 == 0) {
            rr0 rr0Var2 = this.d;
            if (rr0Var2 != null && (rr0Var2.getAdapter() instanceof us0)) {
                us0 us0Var = (us0) this.d.getAdapter();
                ArrayList arrayList2 = us0Var.D;
                if (!us0Var.h && (q6Var = us0Var.f38732s) != null && us0Var.E) {
                    if (!(q6Var instanceof di.j6) && us0Var.f38730n <= 0) {
                        arrayList = q6Var.f9642g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < us0Var.f38732s.f9643i.size(); i10++) {
                            arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) us0Var.f38732s.f9643i.get(i10)).f1()));
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
                        us0Var.f38732s.C(arrayList, true);
                    }
                    us0Var.E = false;
                }
            }
            rr0 rr0Var3 = this.d;
            if (rr0Var3 != null) {
                rr0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        rr0 rr0Var4 = this.d;
        if (rr0Var4 != null) {
            rr0Var4.I0(false);
        }
        if (d1Var != null) {
            d1Var.f57044a.setPressed(true);
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
    }
}
