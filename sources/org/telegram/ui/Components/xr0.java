package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class xr0 extends s4.v {
    public du0 d;
    public final lv0 e;

    public xr0(lv0 lv0Var) {
        this.e = lv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42995a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        iv0 iv0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        ks0 ks0Var = null;
        if (adapter instanceof iv0) {
            iv0Var = (iv0) adapter;
        } else {
            iv0Var = null;
        }
        if (k() && iv0Var != null && iv0Var.M(c1Var.b())) {
            eu0 eu0Var = this.e.f26210k0[0];
            if (eu0Var != null) {
                ks0Var = eu0Var.h;
            }
            this.d = ks0Var;
            if (ks0Var != null) {
                ks0Var.setItemAnimator(eu0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        lv0 lv0Var = this.e;
        if (!lv0Var.C1) {
            gs0 gs0Var = lv0Var.W;
            if (gs0Var == null || !gs0Var.f31987w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        iv0 iv0Var;
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof iv0) {
            iv0Var = (iv0) adapter;
        } else {
            iv0Var = null;
        }
        if (iv0Var == null || !iv0Var.M(c1Var.b()) || !iv0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = iv0Var.f25187y;
        if (!iv0Var.h && (d9Var = iv0Var.f25184s) != null && b10 >= 0 && b10 < d9Var.f718i.size() && b11 >= 0 && b11 < iv0Var.f25184s.f718i.size()) {
            if (!(iv0Var.f25184s instanceof ai.t8) && iv0Var.f25182n <= 0) {
                arrayList = new ArrayList(iv0Var.f25184s.f717g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < iv0Var.f25184s.f718i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) iv0Var.f25184s.f718i.get(i10)).getId()));
                }
            }
            if (!iv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                iv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) iv0Var.f25184s.f718i.get(b10);
            MessageObject messageObject2 = (MessageObject) iv0Var.f25184s.f718i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            iv0Var.f25184s.C(arrayList, false);
            iv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        boolean z10;
        du0 du0Var = this.d;
        if (du0Var != null && c1Var != null) {
            du0Var.e1(false);
        }
        if (i10 == 0) {
            du0 du0Var2 = this.d;
            if (du0Var2 != null && (du0Var2.getAdapter() instanceof iv0)) {
                iv0 iv0Var = (iv0) this.d.getAdapter();
                ArrayList arrayList2 = iv0Var.f25187y;
                if (!iv0Var.h && (d9Var = iv0Var.f25184s) != null && iv0Var.E) {
                    if (!(d9Var instanceof ai.t8) && iv0Var.f25182n <= 0) {
                        arrayList = d9Var.f717g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < iv0Var.f25184s.f718i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) iv0Var.f25184s.f718i.get(i11)).getId()));
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
                        iv0Var.f25184s.C(arrayList, true);
                    }
                    iv0Var.E = false;
                }
            }
            du0 du0Var3 = this.d;
            if (du0Var3 != null) {
                du0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        du0 du0Var4 = this.d;
        if (du0Var4 != null) {
            du0Var4.J0(false);
        }
        if (c1Var != null) {
            c1Var.f42995a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
