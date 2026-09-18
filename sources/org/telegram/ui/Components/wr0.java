package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class wr0 extends s4.v {
    public cu0 d;
    public final kv0 e;

    public wr0(kv0 kv0Var) {
        this.e = kv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42929a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        hv0 hv0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        js0 js0Var = null;
        if (adapter instanceof hv0) {
            hv0Var = (hv0) adapter;
        } else {
            hv0Var = null;
        }
        if (k() && hv0Var != null && hv0Var.M(c1Var.b())) {
            du0 du0Var = this.e.f25824k0[0];
            if (du0Var != null) {
                js0Var = du0Var.h;
            }
            this.d = js0Var;
            if (js0Var != null) {
                js0Var.setItemAnimator(du0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        kv0 kv0Var = this.e;
        if (!kv0Var.C1) {
            fs0 fs0Var = kv0Var.W;
            if (fs0Var == null || !fs0Var.f31926w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        hv0 hv0Var;
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof hv0) {
            hv0Var = (hv0) adapter;
        } else {
            hv0Var = null;
        }
        if (hv0Var == null || !hv0Var.M(c1Var.b()) || !hv0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = hv0Var.f24744y;
        if (!hv0Var.h && (d9Var = hv0Var.f24741s) != null && b10 >= 0 && b10 < d9Var.f721i.size() && b11 >= 0 && b11 < hv0Var.f24741s.f721i.size()) {
            if (!(hv0Var.f24741s instanceof ai.t8) && hv0Var.f24739n <= 0) {
                arrayList = new ArrayList(hv0Var.f24741s.f720g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < hv0Var.f24741s.f721i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) hv0Var.f24741s.f721i.get(i10)).getId()));
                }
            }
            if (!hv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                hv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) hv0Var.f24741s.f721i.get(b10);
            MessageObject messageObject2 = (MessageObject) hv0Var.f24741s.f721i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            hv0Var.f24741s.C(arrayList, false);
            hv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        boolean z10;
        cu0 cu0Var = this.d;
        if (cu0Var != null && c1Var != null) {
            cu0Var.e1(false);
        }
        if (i10 == 0) {
            cu0 cu0Var2 = this.d;
            if (cu0Var2 != null && (cu0Var2.getAdapter() instanceof hv0)) {
                hv0 hv0Var = (hv0) this.d.getAdapter();
                ArrayList arrayList2 = hv0Var.f24744y;
                if (!hv0Var.h && (d9Var = hv0Var.f24741s) != null && hv0Var.E) {
                    if (!(d9Var instanceof ai.t8) && hv0Var.f24739n <= 0) {
                        arrayList = d9Var.f720g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < hv0Var.f24741s.f721i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) hv0Var.f24741s.f721i.get(i11)).getId()));
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
                        hv0Var.f24741s.C(arrayList, true);
                    }
                    hv0Var.E = false;
                }
            }
            cu0 cu0Var3 = this.d;
            if (cu0Var3 != null) {
                cu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        cu0 cu0Var4 = this.d;
        if (cu0Var4 != null) {
            cu0Var4.J0(false);
        }
        if (c1Var != null) {
            c1Var.f42929a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
