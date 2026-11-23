package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class tr0 extends v4.w {
    public cs0 d;
    public final jt0 f40021e;

    public tr0(jt0 jt0Var) {
        this.f40021e = jt0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.f59165a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        gt0 gt0Var;
        v4.i0 adapter = recyclerView.getAdapter();
        nq0 nq0Var = null;
        if (adapter instanceof gt0) {
            gt0Var = (gt0) adapter;
        } else {
            gt0Var = null;
        }
        if (k() && gt0Var != null && gt0Var.M(f1Var.b())) {
            ds0 ds0Var = this.f40021e.f36650n0[0];
            if (ds0Var != null) {
                nq0Var = ds0Var.h;
            }
            this.d = nq0Var;
            if (nq0Var != null) {
                nq0Var.setItemAnimator(ds0Var.d);
            }
            return v4.w.l(15, 0);
        }
        return v4.w.l(0, 0);
    }

    @Override
    public final boolean k() {
        jt0 jt0Var = this.f40021e;
        if (!jt0Var.F1) {
            jq0 jq0Var = jt0Var.f36617c0;
            if (jq0Var == null || !jq0Var.f50351f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        gt0 gt0Var;
        fi.h6 h6Var;
        ArrayList arrayList;
        v4.i0 adapter = recyclerView.getAdapter();
        if (adapter instanceof gt0) {
            gt0Var = (gt0) adapter;
        } else {
            gt0Var = null;
        }
        if (gt0Var == null || !gt0Var.M(f1Var.b()) || !gt0Var.M(f1Var2.b())) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        ArrayList arrayList2 = gt0Var.E;
        if (!gt0Var.h && (h6Var = gt0Var.f35670s) != null && b10 >= 0 && b10 < h6Var.f12089i.size() && b11 >= 0 && b11 < gt0Var.f35670s.f12089i.size()) {
            if (!(gt0Var.f35670s instanceof fi.a6) && gt0Var.f35668n <= 0) {
                arrayList = new ArrayList(gt0Var.f35670s.f12088g);
            } else {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < gt0Var.f35670s.f12089i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.gj) gt0Var.f35670s.f12089i.get(i7)).e1()));
                }
            }
            if (!gt0Var.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                gt0Var.F = true;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) gt0Var.f35670s.f12089i.get(b10);
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) gt0Var.f35670s.f12089i.get(b11);
            arrayList.remove(Integer.valueOf(gjVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(gjVar.e1()));
            gt0Var.f35670s.C(arrayList, false);
            gt0Var.j(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        fi.h6 h6Var;
        ArrayList arrayList;
        boolean z10;
        cs0 cs0Var = this.d;
        if (cs0Var != null && f1Var != null) {
            cs0Var.d1(false);
        }
        if (i7 == 0) {
            cs0 cs0Var2 = this.d;
            if (cs0Var2 != null && (cs0Var2.getAdapter() instanceof gt0)) {
                gt0 gt0Var = (gt0) this.d.getAdapter();
                ArrayList arrayList2 = gt0Var.E;
                if (!gt0Var.h && (h6Var = gt0Var.f35670s) != null && gt0Var.F) {
                    if (!(h6Var instanceof fi.a6) && gt0Var.f35668n <= 0) {
                        arrayList = h6Var.f12088g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < gt0Var.f35670s.f12089i.size(); i10++) {
                            arrayList.add(Integer.valueOf(((org.telegram.messenger.gj) gt0Var.f35670s.f12089i.get(i10)).e1()));
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
                        gt0Var.f35670s.C(arrayList, true);
                    }
                    gt0Var.F = false;
                }
            }
            cs0 cs0Var3 = this.d;
            if (cs0Var3 != null) {
                cs0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        cs0 cs0Var4 = this.d;
        if (cs0Var4 != null) {
            cs0Var4.I0(false);
        }
        if (f1Var != null) {
            f1Var.f59165a.setPressed(true);
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
    }
}
