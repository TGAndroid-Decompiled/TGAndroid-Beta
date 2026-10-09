package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class os0 extends s4.w {
    public tu0 d;
    public final bw0 f29566e;

    public os0(bw0 bw0Var) {
        this.f29566e = bw0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47658a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        yv0 yv0Var;
        s4.i0 adapter = recyclerView.getAdapter();
        at0 at0Var = null;
        if (adapter instanceof yv0) {
            yv0Var = (yv0) adapter;
        } else {
            yv0Var = null;
        }
        if (k() && yv0Var != null && yv0Var.M(d1Var.b())) {
            uu0 uu0Var = this.f29566e.f25142k0[0];
            if (uu0Var != null) {
                at0Var = uu0Var.h;
            }
            this.d = at0Var;
            if (at0Var != null) {
                at0Var.setItemAnimator(uu0Var.d);
            }
            return s4.w.l(15, 0);
        }
        return s4.w.l(0, 0);
    }

    @Override
    public final boolean k() {
        bw0 bw0Var = this.f29566e;
        if (!bw0Var.C1) {
            ws0 ws0Var = bw0Var.W;
            if (ws0Var == null || !ws0Var.f35814w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        yv0 yv0Var;
        ai.e9 e9Var;
        ArrayList arrayList;
        s4.i0 adapter = recyclerView.getAdapter();
        if (adapter instanceof yv0) {
            yv0Var = (yv0) adapter;
        } else {
            yv0Var = null;
        }
        if (yv0Var == null || !yv0Var.M(d1Var.b()) || !yv0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = yv0Var.f33372y;
        if (!yv0Var.h && (e9Var = yv0Var.f33369s) != null && b10 >= 0 && b10 < e9Var.f899i.size() && b11 >= 0 && b11 < yv0Var.f33369s.f899i.size()) {
            if (!(yv0Var.f33369s instanceof ai.v8) && yv0Var.f33367n <= 0) {
                arrayList = new ArrayList(yv0Var.f33369s.f898g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < yv0Var.f33369s.f899i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) yv0Var.f33369s.f899i.get(i10)).getId()));
                }
            }
            if (!yv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                yv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) yv0Var.f33369s.f899i.get(b10);
            MessageObject messageObject2 = (MessageObject) yv0Var.f33369s.f899i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            yv0Var.f33369s.C(arrayList, false);
            yv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        ai.e9 e9Var;
        ArrayList arrayList;
        boolean z10;
        tu0 tu0Var = this.d;
        if (tu0Var != null && d1Var != null) {
            tu0Var.d1(false);
        }
        if (i10 == 0) {
            tu0 tu0Var2 = this.d;
            if (tu0Var2 != null && (tu0Var2.getAdapter() instanceof yv0)) {
                yv0 yv0Var = (yv0) this.d.getAdapter();
                ArrayList arrayList2 = yv0Var.f33372y;
                if (!yv0Var.h && (e9Var = yv0Var.f33369s) != null && yv0Var.E) {
                    if (!(e9Var instanceof ai.v8) && yv0Var.f33367n <= 0) {
                        arrayList = e9Var.f898g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < yv0Var.f33369s.f899i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) yv0Var.f33369s.f899i.get(i11)).getId()));
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
                        yv0Var.f33369s.C(arrayList, true);
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
        if (d1Var != null) {
            d1Var.f47658a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
