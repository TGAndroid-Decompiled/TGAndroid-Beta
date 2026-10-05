package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class cs0 extends s4.v {
    public iu0 d;
    public final qv0 f25516e;

    public cs0(qv0 qv0Var) {
        this.f25516e = qv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f46538a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        nv0 nv0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        ps0 ps0Var = null;
        if (adapter instanceof nv0) {
            nv0Var = (nv0) adapter;
        } else {
            nv0Var = null;
        }
        if (k() && nv0Var != null && nv0Var.L(c1Var.b())) {
            ju0 ju0Var = this.f25516e.f30239k0[0];
            if (ju0Var != null) {
                ps0Var = ju0Var.h;
            }
            this.d = ps0Var;
            if (ps0Var != null) {
                ps0Var.setItemAnimator(ju0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        qv0 qv0Var = this.f25516e;
        if (!qv0Var.C1) {
            ls0 ls0Var = qv0Var.W;
            if (ls0Var == null || !ls0Var.f40689w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        nv0 nv0Var;
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof nv0) {
            nv0Var = (nv0) adapter;
        } else {
            nv0Var = null;
        }
        if (nv0Var == null || !nv0Var.L(c1Var.b()) || !nv0Var.L(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = nv0Var.f29161y;
        if (!nv0Var.h && (d9Var = nv0Var.f29158s) != null && b10 >= 0 && b10 < d9Var.f789i.size() && b11 >= 0 && b11 < nv0Var.f29158s.f789i.size()) {
            if (!(nv0Var.f29158s instanceof ai.u8) && nv0Var.f29156n <= 0) {
                arrayList = new ArrayList(nv0Var.f29158s.f788g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < nv0Var.f29158s.f789i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) nv0Var.f29158s.f789i.get(i10)).getId()));
                }
            }
            if (!nv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                nv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) nv0Var.f29158s.f789i.get(b10);
            MessageObject messageObject2 = (MessageObject) nv0Var.f29158s.f789i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            nv0Var.f29158s.C(arrayList, false);
            nv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        boolean z10;
        iu0 iu0Var = this.d;
        if (iu0Var != null && c1Var != null) {
            iu0Var.d1(false);
        }
        if (i10 == 0) {
            iu0 iu0Var2 = this.d;
            if (iu0Var2 != null && (iu0Var2.getAdapter() instanceof nv0)) {
                nv0 nv0Var = (nv0) this.d.getAdapter();
                ArrayList arrayList2 = nv0Var.f29161y;
                if (!nv0Var.h && (d9Var = nv0Var.f29158s) != null && nv0Var.E) {
                    if (!(d9Var instanceof ai.u8) && nv0Var.f29156n <= 0) {
                        arrayList = d9Var.f788g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < nv0Var.f29158s.f789i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) nv0Var.f29158s.f789i.get(i11)).getId()));
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
                        nv0Var.f29158s.C(arrayList, true);
                    }
                    nv0Var.E = false;
                }
            }
            iu0 iu0Var3 = this.d;
            if (iu0Var3 != null) {
                iu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        iu0 iu0Var4 = this.d;
        if (iu0Var4 != null) {
            iu0Var4.J0(false);
        }
        if (c1Var != null) {
            c1Var.f46538a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
