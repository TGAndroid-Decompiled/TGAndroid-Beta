package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class is0 extends s4.u {
    public rs0 d;
    public final zt0 e;

    public is0(zt0 zt0Var) {
        this.e = zt0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f47898a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        wt0 wt0Var;
        s4.g0 adapter = recyclerView.getAdapter();
        dr0 dr0Var = null;
        if (adapter instanceof wt0) {
            wt0Var = (wt0) adapter;
        } else {
            wt0Var = null;
        }
        if (k() && wt0Var != null && wt0Var.M(c1Var.b())) {
            ss0 ss0Var = this.e.m0[0];
            if (ss0Var != null) {
                dr0Var = ss0Var.h;
            }
            this.d = dr0Var;
            if (dr0Var != null) {
                dr0Var.setItemAnimator(ss0Var.d);
            }
            return s4.u.l(15, 0);
        }
        return s4.u.l(0, 0);
    }

    @Override
    public final boolean k() {
        zt0 zt0Var = this.e;
        if (!zt0Var.E1) {
            zq0 zq0Var = zt0Var.f33173b0;
            if (zq0Var == null || !zq0Var.f44256f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        wt0 wt0Var;
        th.x4 x4Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        if (adapter instanceof wt0) {
            wt0Var = (wt0) adapter;
        } else {
            wt0Var = null;
        }
        if (wt0Var == null || !wt0Var.M(c1Var.b()) || !wt0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = wt0Var.D;
        if (!wt0Var.h && (x4Var = wt0Var.f32251s) != null && b10 >= 0 && b10 < x4Var.f49636i.size() && b11 >= 0 && b11 < wt0Var.f32251s.f49636i.size()) {
            if (!(wt0Var.f32251s instanceof th.q4) && wt0Var.f32249n <= 0) {
                arrayList = new ArrayList(wt0Var.f32251s.f49635g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < wt0Var.f32251s.f49636i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.jj) wt0Var.f32251s.f49636i.get(i10)).f1()));
                }
            }
            if (!wt0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                wt0Var.E = true;
            }
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) wt0Var.f32251s.f49636i.get(b10);
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) wt0Var.f32251s.f49636i.get(b11);
            arrayList.remove(Integer.valueOf(jjVar.f1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(jjVar.f1()));
            wt0Var.f32251s.C(arrayList, false);
            wt0Var.j(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        th.x4 x4Var;
        ArrayList arrayList;
        boolean z10;
        rs0 rs0Var = this.d;
        if (rs0Var != null && c1Var != null) {
            rs0Var.d1(false);
        }
        if (i10 == 0) {
            rs0 rs0Var2 = this.d;
            if (rs0Var2 != null && (rs0Var2.getAdapter() instanceof wt0)) {
                wt0 wt0Var = (wt0) this.d.getAdapter();
                ArrayList arrayList2 = wt0Var.D;
                if (!wt0Var.h && (x4Var = wt0Var.f32251s) != null && wt0Var.E) {
                    if (!(x4Var instanceof th.q4) && wt0Var.f32249n <= 0) {
                        arrayList = x4Var.f49635g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < wt0Var.f32251s.f49636i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((org.telegram.messenger.jj) wt0Var.f32251s.f49636i.get(i11)).f1()));
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
                        wt0Var.f32251s.C(arrayList, true);
                    }
                    wt0Var.E = false;
                }
            }
            rs0 rs0Var3 = this.d;
            if (rs0Var3 != null) {
                rs0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        rs0 rs0Var4 = this.d;
        if (rs0Var4 != null) {
            rs0Var4.I0(false);
        }
        if (c1Var != null) {
            c1Var.f47898a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
