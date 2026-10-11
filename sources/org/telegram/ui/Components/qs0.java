package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class qs0 extends s4.w {
    public vu0 d;
    public final dw0 f30239e;

    public qs0(dw0 dw0Var) {
        this.f30239e = dw0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47748a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        aw0 aw0Var;
        s4.i0 adapter = recyclerView.getAdapter();
        ct0 ct0Var = null;
        if (adapter instanceof aw0) {
            aw0Var = (aw0) adapter;
        } else {
            aw0Var = null;
        }
        if (k() && aw0Var != null && aw0Var.M(d1Var.b())) {
            wu0 wu0Var = this.f30239e.f25711k0[0];
            if (wu0Var != null) {
                ct0Var = wu0Var.h;
            }
            this.d = ct0Var;
            if (ct0Var != null) {
                ct0Var.setItemAnimator(wu0Var.d);
            }
            return s4.w.l(15, 0);
        }
        return s4.w.l(0, 0);
    }

    @Override
    public final boolean k() {
        dw0 dw0Var = this.f30239e;
        if (!dw0Var.C1) {
            ys0 ys0Var = dw0Var.W;
            if (ys0Var == null || !ys0Var.f44559w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        aw0 aw0Var;
        ai.e9 e9Var;
        ArrayList arrayList;
        s4.i0 adapter = recyclerView.getAdapter();
        if (adapter instanceof aw0) {
            aw0Var = (aw0) adapter;
        } else {
            aw0Var = null;
        }
        if (aw0Var == null || !aw0Var.M(d1Var.b()) || !aw0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = aw0Var.f24611y;
        if (!aw0Var.h && (e9Var = aw0Var.f24608s) != null && b10 >= 0 && b10 < e9Var.f899i.size() && b11 >= 0 && b11 < aw0Var.f24608s.f899i.size()) {
            if (!(aw0Var.f24608s instanceof ai.v8) && aw0Var.f24606n <= 0) {
                arrayList = new ArrayList(aw0Var.f24608s.f898g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < aw0Var.f24608s.f899i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) aw0Var.f24608s.f899i.get(i10)).getId()));
                }
            }
            if (!aw0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                aw0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) aw0Var.f24608s.f899i.get(b10);
            MessageObject messageObject2 = (MessageObject) aw0Var.f24608s.f899i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            aw0Var.f24608s.C(arrayList, false);
            aw0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        ai.e9 e9Var;
        ArrayList arrayList;
        boolean z10;
        vu0 vu0Var = this.d;
        if (vu0Var != null && d1Var != null) {
            vu0Var.d1(false);
        }
        if (i10 == 0) {
            vu0 vu0Var2 = this.d;
            if (vu0Var2 != null && (vu0Var2.getAdapter() instanceof aw0)) {
                aw0 aw0Var = (aw0) this.d.getAdapter();
                ArrayList arrayList2 = aw0Var.f24611y;
                if (!aw0Var.h && (e9Var = aw0Var.f24608s) != null && aw0Var.E) {
                    if (!(e9Var instanceof ai.v8) && aw0Var.f24606n <= 0) {
                        arrayList = e9Var.f898g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < aw0Var.f24608s.f899i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) aw0Var.f24608s.f899i.get(i11)).getId()));
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
                        aw0Var.f24608s.C(arrayList, true);
                    }
                    aw0Var.E = false;
                }
            }
            vu0 vu0Var3 = this.d;
            if (vu0Var3 != null) {
                vu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        vu0 vu0Var4 = this.d;
        if (vu0Var4 != null) {
            vu0Var4.I0(false);
        }
        if (d1Var != null) {
            d1Var.f47748a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
