package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class bs0 extends s4.v {
    public hu0 d;
    public final pv0 f25049e;

    public bs0(pv0 pv0Var) {
        this.f25049e = pv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f46523a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        mv0 mv0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        os0 os0Var = null;
        if (adapter instanceof mv0) {
            mv0Var = (mv0) adapter;
        } else {
            mv0Var = null;
        }
        if (k() && mv0Var != null && mv0Var.L(c1Var.b())) {
            iu0 iu0Var = this.f25049e.f29776k0[0];
            if (iu0Var != null) {
                os0Var = iu0Var.h;
            }
            this.d = os0Var;
            if (os0Var != null) {
                os0Var.setItemAnimator(iu0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        pv0 pv0Var = this.f25049e;
        if (!pv0Var.C1) {
            ks0 ks0Var = pv0Var.W;
            if (ks0Var == null || !ks0Var.f40670w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        mv0 mv0Var;
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof mv0) {
            mv0Var = (mv0) adapter;
        } else {
            mv0Var = null;
        }
        if (mv0Var == null || !mv0Var.L(c1Var.b()) || !mv0Var.L(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = mv0Var.f28732y;
        if (!mv0Var.h && (d9Var = mv0Var.f28729s) != null && b10 >= 0 && b10 < d9Var.f789i.size() && b11 >= 0 && b11 < mv0Var.f28729s.f789i.size()) {
            if (!(mv0Var.f28729s instanceof ai.u8) && mv0Var.f28727n <= 0) {
                arrayList = new ArrayList(mv0Var.f28729s.f788g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < mv0Var.f28729s.f789i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) mv0Var.f28729s.f789i.get(i10)).getId()));
                }
            }
            if (!mv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                mv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) mv0Var.f28729s.f789i.get(b10);
            MessageObject messageObject2 = (MessageObject) mv0Var.f28729s.f789i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            mv0Var.f28729s.C(arrayList, false);
            mv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        boolean z10;
        hu0 hu0Var = this.d;
        if (hu0Var != null && c1Var != null) {
            hu0Var.e1(false);
        }
        if (i10 == 0) {
            hu0 hu0Var2 = this.d;
            if (hu0Var2 != null && (hu0Var2.getAdapter() instanceof mv0)) {
                mv0 mv0Var = (mv0) this.d.getAdapter();
                ArrayList arrayList2 = mv0Var.f28732y;
                if (!mv0Var.h && (d9Var = mv0Var.f28729s) != null && mv0Var.E) {
                    if (!(d9Var instanceof ai.u8) && mv0Var.f28727n <= 0) {
                        arrayList = d9Var.f788g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < mv0Var.f28729s.f789i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) mv0Var.f28729s.f789i.get(i11)).getId()));
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
                        mv0Var.f28729s.C(arrayList, true);
                    }
                    mv0Var.E = false;
                }
            }
            hu0 hu0Var3 = this.d;
            if (hu0Var3 != null) {
                hu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        hu0 hu0Var4 = this.d;
        if (hu0Var4 != null) {
            hu0Var4.J0(false);
        }
        if (c1Var != null) {
            c1Var.f46523a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
