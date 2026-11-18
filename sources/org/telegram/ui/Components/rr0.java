package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class rr0 extends v4.w {
    public as0 d;
    public final gt0 f39280e;

    public rr0(gt0 gt0Var) {
        this.f39280e = gt0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.f59123a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        dt0 dt0Var;
        v4.i0 adapter = recyclerView.getAdapter();
        lq0 lq0Var = null;
        if (adapter instanceof dt0) {
            dt0Var = (dt0) adapter;
        } else {
            dt0Var = null;
        }
        if (k() && dt0Var != null && dt0Var.M(f1Var.b())) {
            bs0 bs0Var = this.f39280e.f35609n0[0];
            if (bs0Var != null) {
                lq0Var = bs0Var.h;
            }
            this.d = lq0Var;
            if (lq0Var != null) {
                lq0Var.setItemAnimator(bs0Var.d);
            }
            return v4.w.l(15, 0);
        }
        return v4.w.l(0, 0);
    }

    @Override
    public final boolean k() {
        gt0 gt0Var = this.f39280e;
        if (!gt0Var.F1) {
            hq0 hq0Var = gt0Var.f35576c0;
            if (hq0Var == null || !hq0Var.f50340f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        dt0 dt0Var;
        fi.h6 h6Var;
        ArrayList arrayList;
        v4.i0 adapter = recyclerView.getAdapter();
        if (adapter instanceof dt0) {
            dt0Var = (dt0) adapter;
        } else {
            dt0Var = null;
        }
        if (dt0Var == null || !dt0Var.M(f1Var.b()) || !dt0Var.M(f1Var2.b())) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        ArrayList arrayList2 = dt0Var.E;
        if (!dt0Var.h && (h6Var = dt0Var.f34504s) != null && b10 >= 0 && b10 < h6Var.f12045i.size() && b11 >= 0 && b11 < dt0Var.f34504s.f12045i.size()) {
            if (!(dt0Var.f34504s instanceof fi.z5) && dt0Var.f34502n <= 0) {
                arrayList = new ArrayList(dt0Var.f34504s.f12044g);
            } else {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < dt0Var.f34504s.f12045i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.fj) dt0Var.f34504s.f12045i.get(i7)).e1()));
                }
            }
            if (!dt0Var.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                dt0Var.F = true;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) dt0Var.f34504s.f12045i.get(b10);
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) dt0Var.f34504s.f12045i.get(b11);
            arrayList.remove(Integer.valueOf(fjVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(fjVar.e1()));
            dt0Var.f34504s.C(arrayList, false);
            dt0Var.j(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        fi.h6 h6Var;
        ArrayList arrayList;
        boolean z10;
        as0 as0Var = this.d;
        if (as0Var != null && f1Var != null) {
            as0Var.d1(false);
        }
        if (i7 == 0) {
            as0 as0Var2 = this.d;
            if (as0Var2 != null && (as0Var2.getAdapter() instanceof dt0)) {
                dt0 dt0Var = (dt0) this.d.getAdapter();
                ArrayList arrayList2 = dt0Var.E;
                if (!dt0Var.h && (h6Var = dt0Var.f34504s) != null && dt0Var.F) {
                    if (!(h6Var instanceof fi.z5) && dt0Var.f34502n <= 0) {
                        arrayList = h6Var.f12044g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < dt0Var.f34504s.f12045i.size(); i10++) {
                            arrayList.add(Integer.valueOf(((org.telegram.messenger.fj) dt0Var.f34504s.f12045i.get(i10)).e1()));
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
                        dt0Var.f34504s.C(arrayList, true);
                    }
                    dt0Var.F = false;
                }
            }
            as0 as0Var3 = this.d;
            if (as0Var3 != null) {
                as0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        as0 as0Var4 = this.d;
        if (as0Var4 != null) {
            as0Var4.I0(false);
        }
        if (f1Var != null) {
            f1Var.f59123a.setPressed(true);
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
    }
}
