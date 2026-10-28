package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class ju0 extends s4.w {
    public tu0 d;
    public final bw0 e;

    public ju0(bw0 bw0Var) {
        this.e = bw0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f47773a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        yv0 yv0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        et0 et0Var = null;
        if (adapter instanceof yv0) {
            yv0Var = (yv0) adapter;
        } else {
            yv0Var = null;
        }
        if (k() && yv0Var != null && yv0Var.M(e1Var.b())) {
            uu0 uu0Var = this.e.m0[0];
            if (uu0Var != null) {
                et0Var = uu0Var.h;
            }
            this.d = et0Var;
            if (et0Var != null) {
                et0Var.setItemAnimator(uu0Var.d);
            }
            return s4.w.l(15, 0);
        }
        return s4.w.l(0, 0);
    }

    @Override
    public final boolean k() {
        bw0 bw0Var = this.e;
        if (!bw0Var.E1) {
            at0 at0Var = bw0Var.f26928b0;
            if (at0Var == null || !at0Var.f41611f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        yv0 yv0Var;
        di.z6 z6Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof yv0) {
            yv0Var = (yv0) adapter;
        } else {
            yv0Var = null;
        }
        if (yv0Var == null || !yv0Var.M(e1Var.b()) || !yv0Var.M(e1Var2.b())) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        ArrayList arrayList2 = yv0Var.f35176y;
        if (!yv0Var.h && (z6Var = yv0Var.f35173s) != null && b10 >= 0 && b10 < z6Var.f9492i.size() && b11 >= 0 && b11 < yv0Var.f35173s.f9492i.size()) {
            if (!(yv0Var.f35173s instanceof di.s6) && yv0Var.f35171n <= 0) {
                arrayList = new ArrayList(yv0Var.f35173s.f9491g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < yv0Var.f35173s.f9492i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) yv0Var.f35173s.f9492i.get(i10)).getId()));
                }
            }
            if (!yv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                yv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) yv0Var.f35173s.f9492i.get(b10);
            MessageObject messageObject2 = (MessageObject) yv0Var.f35173s.f9492i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            yv0Var.f35173s.C(arrayList, false);
            yv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        di.z6 z6Var;
        ArrayList arrayList;
        boolean z10;
        tu0 tu0Var = this.d;
        if (tu0Var != null && e1Var != null) {
            tu0Var.d1(false);
        }
        if (i10 == 0) {
            tu0 tu0Var2 = this.d;
            if (tu0Var2 != null && (tu0Var2.getAdapter() instanceof yv0)) {
                yv0 yv0Var = (yv0) this.d.getAdapter();
                ArrayList arrayList2 = yv0Var.f35176y;
                if (!yv0Var.h && (z6Var = yv0Var.f35173s) != null && yv0Var.E) {
                    if (!(z6Var instanceof di.s6) && yv0Var.f35171n <= 0) {
                        arrayList = z6Var.f9491g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < yv0Var.f35173s.f9492i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) yv0Var.f35173s.f9492i.get(i11)).getId()));
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
                        yv0Var.f35173s.C(arrayList, true);
                    }
                    yv0Var.E = false;
                }
            }
            tu0 tu0Var3 = this.d;
            if (tu0Var3 != null) {
                tu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        tu0 tu0Var4 = this.d;
        if (tu0Var4 != null) {
            tu0Var4.I0(false);
        }
        if (e1Var != null) {
            e1Var.f47773a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.e1 e1Var) {
    }
}
