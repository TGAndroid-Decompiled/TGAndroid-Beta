package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class jr0 extends s4.v {
    public pt0 d;
    public final xu0 f27560e;

    public jr0(xu0 xu0Var) {
        this.f27560e = xu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f45738a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        uu0 uu0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        wr0 wr0Var = null;
        if (adapter instanceof uu0) {
            uu0Var = (uu0) adapter;
        } else {
            uu0Var = null;
        }
        if (k() && uu0Var != null && uu0Var.M(c1Var.b())) {
            qt0 qt0Var = this.f27560e.f32702k0[0];
            if (qt0Var != null) {
                wr0Var = qt0Var.h;
            }
            this.d = wr0Var;
            if (wr0Var != null) {
                wr0Var.setItemAnimator(qt0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        xu0 xu0Var = this.f27560e;
        if (!xu0Var.C1) {
            sr0 sr0Var = xu0Var.W;
            if (sr0Var == null || !sr0Var.f35629w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        uu0 uu0Var;
        bi.l8 l8Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof uu0) {
            uu0Var = (uu0) adapter;
        } else {
            uu0Var = null;
        }
        if (uu0Var == null || !uu0Var.M(c1Var.b()) || !uu0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = uu0Var.f30987y;
        if (!uu0Var.h && (l8Var = uu0Var.f30984s) != null && b10 >= 0 && b10 < l8Var.f3275i.size() && b11 >= 0 && b11 < uu0Var.f30984s.f3275i.size()) {
            if (!(uu0Var.f30984s instanceof bi.b8) && uu0Var.f30982n <= 0) {
                arrayList = new ArrayList(uu0Var.f30984s.f3274g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < uu0Var.f30984s.f3275i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) uu0Var.f30984s.f3275i.get(i10)).getId()));
                }
            }
            if (!uu0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                uu0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) uu0Var.f30984s.f3275i.get(b10);
            MessageObject messageObject2 = (MessageObject) uu0Var.f30984s.f3275i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            uu0Var.f30984s.C(arrayList, false);
            uu0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        bi.l8 l8Var;
        ArrayList arrayList;
        boolean z10;
        pt0 pt0Var = this.d;
        if (pt0Var != null && c1Var != null) {
            pt0Var.c1(false);
        }
        if (i10 == 0) {
            pt0 pt0Var2 = this.d;
            if (pt0Var2 != null && (pt0Var2.getAdapter() instanceof uu0)) {
                uu0 uu0Var = (uu0) this.d.getAdapter();
                ArrayList arrayList2 = uu0Var.f30987y;
                if (!uu0Var.h && (l8Var = uu0Var.f30984s) != null && uu0Var.E) {
                    if (!(l8Var instanceof bi.b8) && uu0Var.f30982n <= 0) {
                        arrayList = l8Var.f3274g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < uu0Var.f30984s.f3275i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) uu0Var.f30984s.f3275i.get(i11)).getId()));
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
                        uu0Var.f30984s.C(arrayList, true);
                    }
                    uu0Var.E = false;
                }
            }
            pt0 pt0Var3 = this.d;
            if (pt0Var3 != null) {
                pt0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        pt0 pt0Var4 = this.d;
        if (pt0Var4 != null) {
            pt0Var4.I0(false);
        }
        if (c1Var != null) {
            c1Var.f45738a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
