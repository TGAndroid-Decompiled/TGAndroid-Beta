package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class fs0 extends s4.v {
    public ku0 d;
    public final sv0 e;

    public fs0(sv0 sv0Var) {
        this.e = sv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45938a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        pv0 pv0Var;
        s4.g0 adapter = recyclerView.getAdapter();
        rs0 rs0Var = null;
        if (adapter instanceof pv0) {
            pv0Var = (pv0) adapter;
        } else {
            pv0Var = null;
        }
        if (k() && pv0Var != null && pv0Var.M(b1Var.b())) {
            lu0 lu0Var = this.e.f30364k0[0];
            if (lu0Var != null) {
                rs0Var = lu0Var.h;
            }
            this.d = rs0Var;
            if (rs0Var != null) {
                rs0Var.setItemAnimator(lu0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        sv0 sv0Var = this.e;
        if (!sv0Var.C1) {
            ns0 ns0Var = sv0Var.W;
            if (ns0Var == null || !ns0Var.f37111w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        pv0 pv0Var;
        ci.a7 a7Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        if (adapter instanceof pv0) {
            pv0Var = (pv0) adapter;
        } else {
            pv0Var = null;
        }
        if (pv0Var == null || !pv0Var.M(b1Var.b()) || !pv0Var.M(b1Var2.b())) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ArrayList arrayList2 = pv0Var.f29438y;
        if (!pv0Var.h && (a7Var = pv0Var.f29435s) != null && b10 >= 0 && b10 < a7Var.f5151i.size() && b11 >= 0 && b11 < pv0Var.f29435s.f5151i.size()) {
            if (!(pv0Var.f29435s instanceof ci.t6) && pv0Var.f29433n <= 0) {
                arrayList = new ArrayList(pv0Var.f29435s.f5150g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < pv0Var.f29435s.f5151i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) pv0Var.f29435s.f5151i.get(i10)).getId()));
                }
            }
            if (!pv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                pv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) pv0Var.f29435s.f5151i.get(b10);
            MessageObject messageObject2 = (MessageObject) pv0Var.f29435s.f5151i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            pv0Var.f29435s.C(arrayList, false);
            pv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        ci.a7 a7Var;
        ArrayList arrayList;
        boolean z10;
        ku0 ku0Var = this.d;
        if (ku0Var != null && b1Var != null) {
            ku0Var.d1(false);
        }
        if (i10 == 0) {
            ku0 ku0Var2 = this.d;
            if (ku0Var2 != null && (ku0Var2.getAdapter() instanceof pv0)) {
                pv0 pv0Var = (pv0) this.d.getAdapter();
                ArrayList arrayList2 = pv0Var.f29438y;
                if (!pv0Var.h && (a7Var = pv0Var.f29435s) != null && pv0Var.E) {
                    if (!(a7Var instanceof ci.t6) && pv0Var.f29433n <= 0) {
                        arrayList = a7Var.f5150g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < pv0Var.f29435s.f5151i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) pv0Var.f29435s.f5151i.get(i11)).getId()));
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
                        pv0Var.f29435s.C(arrayList, true);
                    }
                    pv0Var.E = false;
                }
            }
            ku0 ku0Var3 = this.d;
            if (ku0Var3 != null) {
                ku0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        ku0 ku0Var4 = this.d;
        if (ku0Var4 != null) {
            ku0Var4.I0(false);
        }
        if (b1Var != null) {
            b1Var.f45938a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
