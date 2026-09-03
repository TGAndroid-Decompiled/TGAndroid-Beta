package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class lr0 extends f2.b0 {
    public pt0 d;
    public final yu0 e;

    public lr0(yu0 yu0Var) {
        this.e = yu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        l1Var.f5774a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        vu0 vu0Var;
        f2.o0 adapter = recyclerView.getAdapter();
        wr0 wr0Var = null;
        if (adapter instanceof vu0) {
            vu0Var = (vu0) adapter;
        } else {
            vu0Var = null;
        }
        if (k() && vu0Var != null && vu0Var.M(l1Var.b())) {
            qt0 qt0Var = this.e.f31131h0[0];
            if (qt0Var != null) {
                wr0Var = qt0Var.h;
            }
            this.d = wr0Var;
            if (wr0Var != null) {
                wr0Var.setItemAnimator(qt0Var.d);
            }
            return f2.b0.l(15, 0);
        }
        return f2.b0.l(0, 0);
    }

    @Override
    public final boolean k() {
        yu0 yu0Var = this.e;
        if (!yu0Var.f31172z1) {
            sr0 sr0Var = yu0Var.T;
            if (sr0Var == null || !sr0Var.f37280w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        vu0 vu0Var;
        nh.l6 l6Var;
        ArrayList arrayList;
        f2.o0 adapter = recyclerView.getAdapter();
        if (adapter instanceof vu0) {
            vu0Var = (vu0) adapter;
        } else {
            vu0Var = null;
        }
        if (vu0Var == null || !vu0Var.M(l1Var.b()) || !vu0Var.M(l1Var2.b())) {
            return false;
        }
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        ArrayList arrayList2 = vu0Var.f30058y;
        if (!vu0Var.h && (l6Var = vu0Var.f30055s) != null && b10 >= 0 && b10 < l6Var.f15560i.size() && b11 >= 0 && b11 < vu0Var.f30055s.f15560i.size()) {
            if (!(vu0Var.f30055s instanceof nh.d6) && vu0Var.f30053n <= 0) {
                arrayList = new ArrayList(vu0Var.f30055s.f15559g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < vu0Var.f30055s.f15560i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) vu0Var.f30055s.f15560i.get(i10)).getId()));
                }
            }
            if (!vu0Var.B) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                vu0Var.B = true;
            }
            MessageObject messageObject = (MessageObject) vu0Var.f30055s.f15560i.get(b10);
            MessageObject messageObject2 = (MessageObject) vu0Var.f30055s.f15560i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            vu0Var.f30055s.C(arrayList, false);
            vu0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(f2.l1 l1Var, int i10) {
        nh.l6 l6Var;
        ArrayList arrayList;
        boolean z4;
        pt0 pt0Var = this.d;
        if (pt0Var != null && l1Var != null) {
            pt0Var.c1(false);
        }
        if (i10 == 0) {
            pt0 pt0Var2 = this.d;
            if (pt0Var2 != null && (pt0Var2.getAdapter() instanceof vu0)) {
                vu0 vu0Var = (vu0) this.d.getAdapter();
                ArrayList arrayList2 = vu0Var.f30058y;
                if (!vu0Var.h && (l6Var = vu0Var.f30055s) != null && vu0Var.B) {
                    if (!(l6Var instanceof nh.d6) && vu0Var.f30053n <= 0) {
                        arrayList = l6Var.f15559g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < vu0Var.f30055s.f15560i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) vu0Var.f30055s.f15560i.get(i11)).getId()));
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i12) != arrayList.get(i12)) {
                                z4 = true;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (z4) {
                        vu0Var.f30055s.C(arrayList, true);
                    }
                    vu0Var.B = false;
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
        if (l1Var != null) {
            l1Var.f5774a.setPressed(true);
        }
    }

    @Override
    public final void q(f2.l1 l1Var) {
    }
}
