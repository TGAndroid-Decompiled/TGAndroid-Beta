package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

public final class tq0 extends f2.c0 {
    public ys0 d;

    public final hu0 f32859e;

    public tq0(hu0 hu0Var) {
        this.f32859e = hu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        o1Var.f5789a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        f2.q0 adapter = recyclerView.getAdapter();
        eu0 eu0Var = adapter instanceof eu0 ? (eu0) adapter : null;
        if (!k() || eu0Var == null || !eu0Var.M(o1Var.b())) {
            return f2.c0.l(0, 0);
        }
        zs0 zs0Var = this.f32859e.f29122g0[0];
        er0 er0Var = zs0Var != null ? zs0Var.h : null;
        this.d = er0Var;
        if (er0Var != null) {
            er0Var.setItemAnimator(zs0Var.d);
        }
        return f2.c0.l(15, 0);
    }

    @Override
    public final boolean k() {
        hu0 hu0Var = this.f32859e;
        if (hu0Var.f29163y1) {
            return true;
        }
        ar0 ar0Var = hu0Var.S;
        return ar0Var != null && ar0Var.f44658w;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        jh.j6 j6Var;
        ArrayList arrayList;
        f2.q0 adapter = recyclerView.getAdapter();
        eu0 eu0Var = adapter instanceof eu0 ? (eu0) adapter : null;
        if (eu0Var == null || !eu0Var.M(o1Var.b()) || !eu0Var.M(o1Var2.b())) {
            return false;
        }
        int iB = o1Var.b();
        int iB2 = o1Var2.b();
        ArrayList arrayList2 = eu0Var.f28158y;
        if (!eu0Var.h && (j6Var = eu0Var.f28155s) != null && iB >= 0 && iB < j6Var.f13540i.size() && iB2 >= 0 && iB2 < eu0Var.f28155s.f13540i.size()) {
            if ((eu0Var.f28155s instanceof jh.b6) || eu0Var.f28153n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < eu0Var.f28155s.f13540i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) eu0Var.f28155s.f13540i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(eu0Var.f28155s.f13539g);
            }
            if (!eu0Var.A) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                eu0Var.A = true;
            }
            MessageObject messageObject = (MessageObject) eu0Var.f28155s.f13540i.get(iB);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(iB2, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            eu0Var.f28155s.C(arrayList, false);
            eu0Var.p(iB, iB2);
        }
        return true;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        jh.j6 j6Var;
        ArrayList arrayList;
        ys0 ys0Var = this.d;
        if (ys0Var != null && o1Var != null) {
            ys0Var.d1(false);
        }
        if (i10 != 0) {
            ys0 ys0Var2 = this.d;
            if (ys0Var2 != null) {
                ys0Var2.I0(false);
            }
            if (o1Var != null) {
                o1Var.f5789a.setPressed(true);
                return;
            }
            return;
        }
        ys0 ys0Var3 = this.d;
        if (ys0Var3 != null && (ys0Var3.getAdapter() instanceof eu0)) {
            eu0 eu0Var = (eu0) this.d.getAdapter();
            ArrayList arrayList2 = eu0Var.f28158y;
            if (!eu0Var.h && (j6Var = eu0Var.f28155s) != null && eu0Var.A) {
                if ((j6Var instanceof jh.b6) || eu0Var.f28153n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < eu0Var.f28155s.f13540i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) eu0Var.f28155s.f13540i.get(i11)).getId()));
                    }
                } else {
                    arrayList = j6Var.f13539g;
                }
                boolean z10 = arrayList2.size() != arrayList.size();
                if (!z10) {
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (arrayList2.get(i12) != arrayList.get(i12)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                if (z10) {
                    eu0Var.f28155s.C(arrayList, true);
                }
                eu0Var.A = false;
            }
        }
        ys0 ys0Var4 = this.d;
        if (ys0Var4 != null) {
            ys0Var4.setItemAnimator(null);
        }
    }

    @Override
    public final void q(f2.o1 o1Var) {
    }
}
