package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class iu0 extends s4.w {
    public su0 d;
    public final aw0 e;

    public iu0(aw0 aw0Var) {
        this.e = aw0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f47738a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        xv0 xv0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        dt0 dt0Var = null;
        if (adapter instanceof xv0) {
            xv0Var = (xv0) adapter;
        } else {
            xv0Var = null;
        }
        if (k() && xv0Var != null && xv0Var.M(e1Var.b())) {
            tu0 tu0Var = this.e.m0[0];
            if (tu0Var != null) {
                dt0Var = tu0Var.h;
            }
            this.d = dt0Var;
            if (dt0Var != null) {
                dt0Var.setItemAnimator(tu0Var.d);
            }
            return s4.w.l(15, 0);
        }
        return s4.w.l(0, 0);
    }

    @Override
    public final boolean k() {
        aw0 aw0Var = this.e;
        if (!aw0Var.E1) {
            zs0 zs0Var = aw0Var.f26640b0;
            if (zs0Var == null || !zs0Var.f41114f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        xv0 xv0Var;
        di.z6 z6Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof xv0) {
            xv0Var = (xv0) adapter;
        } else {
            xv0Var = null;
        }
        if (xv0Var == null || !xv0Var.M(e1Var.b()) || !xv0Var.M(e1Var2.b())) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        ArrayList arrayList2 = xv0Var.f34836y;
        if (!xv0Var.h && (z6Var = xv0Var.f34833s) != null && b10 >= 0 && b10 < z6Var.f9493i.size() && b11 >= 0 && b11 < xv0Var.f34833s.f9493i.size()) {
            if (!(xv0Var.f34833s instanceof di.s6) && xv0Var.f34831n <= 0) {
                arrayList = new ArrayList(xv0Var.f34833s.f9492g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < xv0Var.f34833s.f9493i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) xv0Var.f34833s.f9493i.get(i10)).getId()));
                }
            }
            if (!xv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                xv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) xv0Var.f34833s.f9493i.get(b10);
            MessageObject messageObject2 = (MessageObject) xv0Var.f34833s.f9493i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            xv0Var.f34833s.C(arrayList, false);
            xv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        di.z6 z6Var;
        ArrayList arrayList;
        boolean z10;
        su0 su0Var = this.d;
        if (su0Var != null && e1Var != null) {
            su0Var.d1(false);
        }
        if (i10 == 0) {
            su0 su0Var2 = this.d;
            if (su0Var2 != null && (su0Var2.getAdapter() instanceof xv0)) {
                xv0 xv0Var = (xv0) this.d.getAdapter();
                ArrayList arrayList2 = xv0Var.f34836y;
                if (!xv0Var.h && (z6Var = xv0Var.f34833s) != null && xv0Var.E) {
                    if (!(z6Var instanceof di.s6) && xv0Var.f34831n <= 0) {
                        arrayList = z6Var.f9492g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < xv0Var.f34833s.f9493i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) xv0Var.f34833s.f9493i.get(i11)).getId()));
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
                        xv0Var.f34833s.C(arrayList, true);
                    }
                    xv0Var.E = false;
                }
            }
            su0 su0Var3 = this.d;
            if (su0Var3 != null) {
                su0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        su0 su0Var4 = this.d;
        if (su0Var4 != null) {
            su0Var4.I0(false);
        }
        if (e1Var != null) {
            e1Var.f47738a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.e1 e1Var) {
    }
}
