package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class hr0 extends u4.v {
    public qr0 d;
    public final ws0 f34488e;

    public hr0(ws0 ws0Var) {
        this.f34488e = ws0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, u4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f55540a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, u4.d1 d1Var) {
        ts0 ts0Var;
        u4.h0 adapter = recyclerView.getAdapter();
        cq0 cq0Var = null;
        if (adapter instanceof ts0) {
            ts0Var = (ts0) adapter;
        } else {
            ts0Var = null;
        }
        if (k() && ts0Var != null && ts0Var.M(d1Var.b())) {
            rr0 rr0Var = this.f34488e.f40108n0[0];
            if (rr0Var != null) {
                cq0Var = rr0Var.h;
            }
            this.d = cq0Var;
            if (cq0Var != null) {
                cq0Var.setItemAnimator(rr0Var.d);
            }
            return u4.v.l(15, 0);
        }
        return u4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        ws0 ws0Var = this.f34488e;
        if (!ws0Var.F1) {
            yp0 yp0Var = ws0Var.f40076c0;
            if (yp0Var == null || !yp0Var.f44470f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        ts0 ts0Var;
        ei.r6 r6Var;
        ArrayList arrayList;
        u4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof ts0) {
            ts0Var = (ts0) adapter;
        } else {
            ts0Var = null;
        }
        if (ts0Var == null || !ts0Var.M(d1Var.b()) || !ts0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = ts0Var.E;
        if (!ts0Var.h && (r6Var = ts0Var.f38550s) != null && b10 >= 0 && b10 < r6Var.f10876i.size() && b11 >= 0 && b11 < ts0Var.f38550s.f10876i.size()) {
            if (!(ts0Var.f38550s instanceof ei.k6) && ts0Var.f38548n <= 0) {
                arrayList = new ArrayList(ts0Var.f38550s.f10875g);
            } else {
                arrayList = new ArrayList();
                for (int i3 = 0; i3 < ts0Var.f38550s.f10876i.size(); i3++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.zi) ts0Var.f38550s.f10876i.get(i3)).f1()));
                }
            }
            if (!ts0Var.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ts0Var.F = true;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) ts0Var.f38550s.f10876i.get(b10);
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) ts0Var.f38550s.f10876i.get(b11);
            arrayList.remove(Integer.valueOf(ziVar.f1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ziVar.f1()));
            ts0Var.f38550s.C(arrayList, false);
            ts0Var.j(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(u4.d1 d1Var, int i3) {
        ei.r6 r6Var;
        ArrayList arrayList;
        boolean z10;
        qr0 qr0Var = this.d;
        if (qr0Var != null && d1Var != null) {
            qr0Var.d1(false);
        }
        if (i3 == 0) {
            qr0 qr0Var2 = this.d;
            if (qr0Var2 != null && (qr0Var2.getAdapter() instanceof ts0)) {
                ts0 ts0Var = (ts0) this.d.getAdapter();
                ArrayList arrayList2 = ts0Var.E;
                if (!ts0Var.h && (r6Var = ts0Var.f38550s) != null && ts0Var.F) {
                    if (!(r6Var instanceof ei.k6) && ts0Var.f38548n <= 0) {
                        arrayList = r6Var.f10875g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < ts0Var.f38550s.f10876i.size(); i10++) {
                            arrayList.add(Integer.valueOf(((org.telegram.messenger.zi) ts0Var.f38550s.f10876i.get(i10)).f1()));
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i11) != arrayList.get(i11)) {
                                z10 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (z10) {
                        ts0Var.f38550s.C(arrayList, true);
                    }
                    ts0Var.F = false;
                }
            }
            qr0 qr0Var3 = this.d;
            if (qr0Var3 != null) {
                qr0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        qr0 qr0Var4 = this.d;
        if (qr0Var4 != null) {
            qr0Var4.I0(false);
        }
        if (d1Var != null) {
            d1Var.f55540a.setPressed(true);
        }
    }

    @Override
    public final void q(u4.d1 d1Var) {
    }
}
