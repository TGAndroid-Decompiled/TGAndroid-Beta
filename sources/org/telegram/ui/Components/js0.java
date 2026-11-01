package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class js0 extends s4.u {
    public ss0 d;
    public final au0 e;

    public js0(au0 au0Var) {
        this.e = au0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f47909a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        xt0 xt0Var;
        s4.g0 adapter = recyclerView.getAdapter();
        er0 er0Var = null;
        if (adapter instanceof xt0) {
            xt0Var = (xt0) adapter;
        } else {
            xt0Var = null;
        }
        if (k() && xt0Var != null && xt0Var.M(c1Var.b())) {
            ts0 ts0Var = this.e.m0[0];
            if (ts0Var != null) {
                er0Var = ts0Var.h;
            }
            this.d = er0Var;
            if (er0Var != null) {
                er0Var.setItemAnimator(ts0Var.d);
            }
            return s4.u.l(15, 0);
        }
        return s4.u.l(0, 0);
    }

    @Override
    public final boolean k() {
        au0 au0Var = this.e;
        if (!au0Var.E1) {
            ar0 ar0Var = au0Var.f24501b0;
            if (ar0Var == null || !ar0Var.f43750f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        xt0 xt0Var;
        th.x4 x4Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        if (adapter instanceof xt0) {
            xt0Var = (xt0) adapter;
        } else {
            xt0Var = null;
        }
        if (xt0Var == null || !xt0Var.M(c1Var.b()) || !xt0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = xt0Var.D;
        if (!xt0Var.h && (x4Var = xt0Var.f32635s) != null && b10 >= 0 && b10 < x4Var.f49650i.size() && b11 >= 0 && b11 < xt0Var.f32635s.f49650i.size()) {
            if (!(xt0Var.f32635s instanceof th.q4) && xt0Var.f32633n <= 0) {
                arrayList = new ArrayList(xt0Var.f32635s.f49649g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < xt0Var.f32635s.f49650i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.kj) xt0Var.f32635s.f49650i.get(i10)).f1()));
                }
            }
            if (!xt0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                xt0Var.E = true;
            }
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) xt0Var.f32635s.f49650i.get(b10);
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) xt0Var.f32635s.f49650i.get(b11);
            arrayList.remove(Integer.valueOf(kjVar.f1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(kjVar.f1()));
            xt0Var.f32635s.C(arrayList, false);
            xt0Var.j(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        th.x4 x4Var;
        ArrayList arrayList;
        boolean z10;
        ss0 ss0Var = this.d;
        if (ss0Var != null && c1Var != null) {
            ss0Var.d1(false);
        }
        if (i10 == 0) {
            ss0 ss0Var2 = this.d;
            if (ss0Var2 != null && (ss0Var2.getAdapter() instanceof xt0)) {
                xt0 xt0Var = (xt0) this.d.getAdapter();
                ArrayList arrayList2 = xt0Var.D;
                if (!xt0Var.h && (x4Var = xt0Var.f32635s) != null && xt0Var.E) {
                    if (!(x4Var instanceof th.q4) && xt0Var.f32633n <= 0) {
                        arrayList = x4Var.f49649g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < xt0Var.f32635s.f49650i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((org.telegram.messenger.kj) xt0Var.f32635s.f49650i.get(i11)).f1()));
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i12) != arrayList.get(i12)) {
                                z10 = true;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (z10) {
                        xt0Var.f32635s.C(arrayList, true);
                    }
                    xt0Var.E = false;
                }
            }
            ss0 ss0Var3 = this.d;
            if (ss0Var3 != null) {
                ss0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        ss0 ss0Var4 = this.d;
        if (ss0Var4 != null) {
            ss0Var4.I0(false);
        }
        if (c1Var != null) {
            c1Var.f47909a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
