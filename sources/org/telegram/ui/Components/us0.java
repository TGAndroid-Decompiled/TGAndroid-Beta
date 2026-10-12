package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class us0 extends s4.w {
    public zu0 d;
    public final hw0 f31258e;

    public us0(hw0 hw0Var) {
        this.f31258e = hw0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47889a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        ew0 ew0Var;
        s4.i0 adapter = recyclerView.getAdapter();
        gt0 gt0Var = null;
        if (adapter instanceof ew0) {
            ew0Var = (ew0) adapter;
        } else {
            ew0Var = null;
        }
        if (k() && ew0Var != null && ew0Var.M(d1Var.b())) {
            av0 av0Var = this.f31258e.f26948k0[0];
            if (av0Var != null) {
                gt0Var = av0Var.h;
            }
            this.d = gt0Var;
            if (gt0Var != null) {
                gt0Var.setItemAnimator(av0Var.d);
            }
            return s4.w.l(15, 0);
        }
        return s4.w.l(0, 0);
    }

    @Override
    public final boolean k() {
        hw0 hw0Var = this.f31258e;
        if (!hw0Var.C1) {
            ct0 ct0Var = hw0Var.W;
            if (ct0Var == null || !ct0Var.f36309w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        ew0 ew0Var;
        ai.e9 e9Var;
        ArrayList arrayList;
        s4.i0 adapter = recyclerView.getAdapter();
        if (adapter instanceof ew0) {
            ew0Var = (ew0) adapter;
        } else {
            ew0Var = null;
        }
        if (ew0Var == null || !ew0Var.M(d1Var.b()) || !ew0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = ew0Var.f25798y;
        if (!ew0Var.h && (e9Var = ew0Var.f25795s) != null && b10 >= 0 && b10 < e9Var.f897i.size() && b11 >= 0 && b11 < ew0Var.f25795s.f897i.size()) {
            if (!(ew0Var.f25795s instanceof ai.v8) && ew0Var.f25793n <= 0) {
                arrayList = new ArrayList(ew0Var.f25795s.f896g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < ew0Var.f25795s.f897i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) ew0Var.f25795s.f897i.get(i10)).getId()));
                }
            }
            if (!ew0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ew0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) ew0Var.f25795s.f897i.get(b10);
            MessageObject messageObject2 = (MessageObject) ew0Var.f25795s.f897i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            ew0Var.f25795s.C(arrayList, false);
            ew0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        ai.e9 e9Var;
        ArrayList arrayList;
        boolean z10;
        zu0 zu0Var = this.d;
        if (zu0Var != null && d1Var != null) {
            zu0Var.d1(false);
        }
        if (i10 == 0) {
            zu0 zu0Var2 = this.d;
            if (zu0Var2 != null && (zu0Var2.getAdapter() instanceof ew0)) {
                ew0 ew0Var = (ew0) this.d.getAdapter();
                ArrayList arrayList2 = ew0Var.f25798y;
                if (!ew0Var.h && (e9Var = ew0Var.f25795s) != null && ew0Var.E) {
                    if (!(e9Var instanceof ai.v8) && ew0Var.f25793n <= 0) {
                        arrayList = e9Var.f896g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < ew0Var.f25795s.f897i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) ew0Var.f25795s.f897i.get(i11)).getId()));
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
                        ew0Var.f25795s.C(arrayList, true);
                    }
                    ew0Var.E = false;
                }
            }
            zu0 zu0Var3 = this.d;
            if (zu0Var3 != null) {
                zu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        zu0 zu0Var4 = this.d;
        if (zu0Var4 != null) {
            zu0Var4.I0(false);
        }
        if (d1Var != null) {
            d1Var.f47889a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
