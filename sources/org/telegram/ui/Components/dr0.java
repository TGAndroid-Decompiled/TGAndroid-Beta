package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class dr0 extends f2.b0 {
    public ht0 d;
    public final qu0 f27863e;

    public dr0(qu0 qu0Var) {
        this.f27863e = qu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        n1Var.f6432a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        nu0 nu0Var;
        f2.p0 adapter = recyclerView.getAdapter();
        or0 or0Var = null;
        if (adapter instanceof nu0) {
            nu0Var = (nu0) adapter;
        } else {
            nu0Var = null;
        }
        if (k() && nu0Var != null && nu0Var.M(n1Var.b())) {
            it0 it0Var = this.f27863e.f32070g0[0];
            if (it0Var != null) {
                or0Var = it0Var.h;
            }
            this.d = or0Var;
            if (or0Var != null) {
                or0Var.setItemAnimator(it0Var.d);
            }
            return f2.b0.l(15, 0);
        }
        return f2.b0.l(0, 0);
    }

    @Override
    public final boolean k() {
        qu0 qu0Var = this.f27863e;
        if (!qu0Var.f32111y1) {
            kr0 kr0Var = qu0Var.S;
            if (kr0Var == null || !kr0Var.f44689w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        nu0 nu0Var;
        lh.k6 k6Var;
        ArrayList arrayList;
        f2.p0 adapter = recyclerView.getAdapter();
        if (adapter instanceof nu0) {
            nu0Var = (nu0) adapter;
        } else {
            nu0Var = null;
        }
        if (nu0Var == null || !nu0Var.M(n1Var.b()) || !nu0Var.M(n1Var2.b())) {
            return false;
        }
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        ArrayList arrayList2 = nu0Var.f31154y;
        if (!nu0Var.h && (k6Var = nu0Var.f31151s) != null && b10 >= 0 && b10 < k6Var.f15838i.size() && b11 >= 0 && b11 < nu0Var.f31151s.f15838i.size()) {
            if (!(nu0Var.f31151s instanceof lh.c6) && nu0Var.f31149n <= 0) {
                arrayList = new ArrayList(nu0Var.f31151s.f15837g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < nu0Var.f31151s.f15838i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) nu0Var.f31151s.f15838i.get(i10)).getId()));
                }
            }
            if (!nu0Var.A) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                nu0Var.A = true;
            }
            MessageObject messageObject = (MessageObject) nu0Var.f31151s.f15838i.get(b10);
            MessageObject messageObject2 = (MessageObject) nu0Var.f31151s.f15838i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            nu0Var.f31151s.C(arrayList, false);
            nu0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(f2.n1 n1Var, int i10) {
        lh.k6 k6Var;
        ArrayList arrayList;
        boolean z10;
        ht0 ht0Var = this.d;
        if (ht0Var != null && n1Var != null) {
            ht0Var.d1(false);
        }
        if (i10 == 0) {
            ht0 ht0Var2 = this.d;
            if (ht0Var2 != null && (ht0Var2.getAdapter() instanceof nu0)) {
                nu0 nu0Var = (nu0) this.d.getAdapter();
                ArrayList arrayList2 = nu0Var.f31154y;
                if (!nu0Var.h && (k6Var = nu0Var.f31151s) != null && nu0Var.A) {
                    if (!(k6Var instanceof lh.c6) && nu0Var.f31149n <= 0) {
                        arrayList = k6Var.f15837g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < nu0Var.f31151s.f15838i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) nu0Var.f31151s.f15838i.get(i11)).getId()));
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
                        nu0Var.f31151s.C(arrayList, true);
                    }
                    nu0Var.A = false;
                }
            }
            ht0 ht0Var3 = this.d;
            if (ht0Var3 != null) {
                ht0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        ht0 ht0Var4 = this.d;
        if (ht0Var4 != null) {
            ht0Var4.I0(false);
        }
        if (n1Var != null) {
            n1Var.f6432a.setPressed(true);
        }
    }

    @Override
    public final void q(f2.n1 n1Var) {
    }
}
