package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class hs0 extends s4.v {
    public mu0 d;
    public final uv0 e;

    public hs0(uv0 uv0Var) {
        this.e = uv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45920a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        rv0 rv0Var;
        s4.g0 adapter = recyclerView.getAdapter();
        ts0 ts0Var = null;
        if (adapter instanceof rv0) {
            rv0Var = (rv0) adapter;
        } else {
            rv0Var = null;
        }
        if (k() && rv0Var != null && rv0Var.M(b1Var.b())) {
            nu0 nu0Var = this.e.f31050k0[0];
            if (nu0Var != null) {
                ts0Var = nu0Var.h;
            }
            this.d = ts0Var;
            if (ts0Var != null) {
                ts0Var.setItemAnimator(nu0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        uv0 uv0Var = this.e;
        if (!uv0Var.C1) {
            ps0 ps0Var = uv0Var.W;
            if (ps0Var == null || !ps0Var.f36525w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        rv0 rv0Var;
        ci.a7 a7Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        if (adapter instanceof rv0) {
            rv0Var = (rv0) adapter;
        } else {
            rv0Var = null;
        }
        if (rv0Var == null || !rv0Var.M(b1Var.b()) || !rv0Var.M(b1Var2.b())) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ArrayList arrayList2 = rv0Var.f30032y;
        if (!rv0Var.h && (a7Var = rv0Var.f30029s) != null && b10 >= 0 && b10 < a7Var.f5149i.size() && b11 >= 0 && b11 < rv0Var.f30029s.f5149i.size()) {
            if (!(rv0Var.f30029s instanceof ci.t6) && rv0Var.f30027n <= 0) {
                arrayList = new ArrayList(rv0Var.f30029s.f5148g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < rv0Var.f30029s.f5149i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) rv0Var.f30029s.f5149i.get(i10)).getId()));
                }
            }
            if (!rv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                rv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) rv0Var.f30029s.f5149i.get(b10);
            MessageObject messageObject2 = (MessageObject) rv0Var.f30029s.f5149i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            rv0Var.f30029s.C(arrayList, false);
            rv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        ci.a7 a7Var;
        ArrayList arrayList;
        boolean z10;
        mu0 mu0Var = this.d;
        if (mu0Var != null && b1Var != null) {
            mu0Var.d1(false);
        }
        if (i10 == 0) {
            mu0 mu0Var2 = this.d;
            if (mu0Var2 != null && (mu0Var2.getAdapter() instanceof rv0)) {
                rv0 rv0Var = (rv0) this.d.getAdapter();
                ArrayList arrayList2 = rv0Var.f30032y;
                if (!rv0Var.h && (a7Var = rv0Var.f30029s) != null && rv0Var.E) {
                    if (!(a7Var instanceof ci.t6) && rv0Var.f30027n <= 0) {
                        arrayList = a7Var.f5148g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < rv0Var.f30029s.f5149i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) rv0Var.f30029s.f5149i.get(i11)).getId()));
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
                        rv0Var.f30029s.C(arrayList, true);
                    }
                    rv0Var.E = false;
                }
            }
            mu0 mu0Var3 = this.d;
            if (mu0Var3 != null) {
                mu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        mu0 mu0Var4 = this.d;
        if (mu0Var4 != null) {
            mu0Var4.I0(false);
        }
        if (b1Var != null) {
            b1Var.f45920a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
