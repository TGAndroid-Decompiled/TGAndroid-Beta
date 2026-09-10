package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class tr0 extends s4.v {
    public zt0 d;
    public final iv0 e;

    public tr0(iv0 iv0Var) {
        this.e = iv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f41610a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        fv0 fv0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        gs0 gs0Var = null;
        if (adapter instanceof fv0) {
            fv0Var = (fv0) adapter;
        } else {
            fv0Var = null;
        }
        if (k() && fv0Var != null && fv0Var.M(c1Var.b())) {
            au0 au0Var = this.e.f24107k0[0];
            if (au0Var != null) {
                gs0Var = au0Var.h;
            }
            this.d = gs0Var;
            if (gs0Var != null) {
                gs0Var.setItemAnimator(au0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        iv0 iv0Var = this.e;
        if (!iv0Var.C1) {
            cs0 cs0Var = iv0Var.W;
            if (cs0Var == null || !cs0Var.f33253w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        fv0 fv0Var;
        zh.a5 a5Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof fv0) {
            fv0Var = (fv0) adapter;
        } else {
            fv0Var = null;
        }
        if (fv0Var == null || !fv0Var.M(c1Var.b()) || !fv0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = fv0Var.f23092y;
        if (!fv0Var.h && (a5Var = fv0Var.f23089s) != null && b10 >= 0 && b10 < a5Var.f48240i.size() && b11 >= 0 && b11 < fv0Var.f23089s.f48240i.size()) {
            if (!(fv0Var.f23089s instanceof zh.s4) && fv0Var.f23087n <= 0) {
                arrayList = new ArrayList(fv0Var.f23089s.f48239g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < fv0Var.f23089s.f48240i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) fv0Var.f23089s.f48240i.get(i10)).getId()));
                }
            }
            if (!fv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                fv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) fv0Var.f23089s.f48240i.get(b10);
            MessageObject messageObject2 = (MessageObject) fv0Var.f23089s.f48240i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            fv0Var.f23089s.C(arrayList, false);
            fv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        zh.a5 a5Var;
        ArrayList arrayList;
        boolean z10;
        zt0 zt0Var = this.d;
        if (zt0Var != null && c1Var != null) {
            zt0Var.c1(false);
        }
        if (i10 == 0) {
            zt0 zt0Var2 = this.d;
            if (zt0Var2 != null && (zt0Var2.getAdapter() instanceof fv0)) {
                fv0 fv0Var = (fv0) this.d.getAdapter();
                ArrayList arrayList2 = fv0Var.f23092y;
                if (!fv0Var.h && (a5Var = fv0Var.f23089s) != null && fv0Var.E) {
                    if (!(a5Var instanceof zh.s4) && fv0Var.f23087n <= 0) {
                        arrayList = a5Var.f48239g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < fv0Var.f23089s.f48240i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) fv0Var.f23089s.f48240i.get(i11)).getId()));
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
                        fv0Var.f23089s.C(arrayList, true);
                    }
                    fv0Var.E = false;
                }
            }
            zt0 zt0Var3 = this.d;
            if (zt0Var3 != null) {
                zt0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        zt0 zt0Var4 = this.d;
        if (zt0Var4 != null) {
            zt0Var4.I0(false);
        }
        if (c1Var != null) {
            c1Var.f41610a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
