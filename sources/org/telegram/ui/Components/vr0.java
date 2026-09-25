package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class vr0 extends s4.v {
    public bu0 d;
    public final jv0 e;

    public vr0(jv0 jv0Var) {
        this.e = jv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42961a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        gv0 gv0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        is0 is0Var = null;
        if (adapter instanceof gv0) {
            gv0Var = (gv0) adapter;
        } else {
            gv0Var = null;
        }
        if (k() && gv0Var != null && gv0Var.M(c1Var.b())) {
            cu0 cu0Var = this.e.f25536k0[0];
            if (cu0Var != null) {
                is0Var = cu0Var.h;
            }
            this.d = is0Var;
            if (is0Var != null) {
                is0Var.setItemAnimator(cu0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        jv0 jv0Var = this.e;
        if (!jv0Var.C1) {
            es0 es0Var = jv0Var.W;
            if (es0Var == null || !es0Var.f37570w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        gv0 gv0Var;
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof gv0) {
            gv0Var = (gv0) adapter;
        } else {
            gv0Var = null;
        }
        if (gv0Var == null || !gv0Var.M(c1Var.b()) || !gv0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = gv0Var.f24539y;
        if (!gv0Var.h && (d9Var = gv0Var.f24536s) != null && b10 >= 0 && b10 < d9Var.f725i.size() && b11 >= 0 && b11 < gv0Var.f24536s.f725i.size()) {
            if (!(gv0Var.f24536s instanceof ai.u8) && gv0Var.f24534n <= 0) {
                arrayList = new ArrayList(gv0Var.f24536s.f724g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < gv0Var.f24536s.f725i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) gv0Var.f24536s.f725i.get(i10)).getId()));
                }
            }
            if (!gv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                gv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) gv0Var.f24536s.f725i.get(b10);
            MessageObject messageObject2 = (MessageObject) gv0Var.f24536s.f725i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            gv0Var.f24536s.C(arrayList, false);
            gv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        boolean z10;
        bu0 bu0Var = this.d;
        if (bu0Var != null && c1Var != null) {
            bu0Var.d1(false);
        }
        if (i10 == 0) {
            bu0 bu0Var2 = this.d;
            if (bu0Var2 != null && (bu0Var2.getAdapter() instanceof gv0)) {
                gv0 gv0Var = (gv0) this.d.getAdapter();
                ArrayList arrayList2 = gv0Var.f24539y;
                if (!gv0Var.h && (d9Var = gv0Var.f24536s) != null && gv0Var.E) {
                    if (!(d9Var instanceof ai.u8) && gv0Var.f24534n <= 0) {
                        arrayList = d9Var.f724g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < gv0Var.f24536s.f725i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) gv0Var.f24536s.f725i.get(i11)).getId()));
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
                        gv0Var.f24536s.C(arrayList, true);
                    }
                    gv0Var.E = false;
                }
            }
            bu0 bu0Var3 = this.d;
            if (bu0Var3 != null) {
                bu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        bu0 bu0Var4 = this.d;
        if (bu0Var4 != null) {
            bu0Var4.I0(false);
        }
        if (c1Var != null) {
            c1Var.f42961a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
