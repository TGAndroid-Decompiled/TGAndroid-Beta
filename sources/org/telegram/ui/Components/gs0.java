package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class gs0 extends s4.v {
    public lu0 d;
    public final tv0 e;

    public gs0(tv0 tv0Var) {
        this.e = tv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45910a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        qv0 qv0Var;
        s4.g0 adapter = recyclerView.getAdapter();
        ss0 ss0Var = null;
        if (adapter instanceof qv0) {
            qv0Var = (qv0) adapter;
        } else {
            qv0Var = null;
        }
        if (k() && qv0Var != null && qv0Var.M(b1Var.b())) {
            mu0 mu0Var = this.e.f30710k0[0];
            if (mu0Var != null) {
                ss0Var = mu0Var.h;
            }
            this.d = ss0Var;
            if (ss0Var != null) {
                ss0Var.setItemAnimator(mu0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        tv0 tv0Var = this.e;
        if (!tv0Var.C1) {
            os0 os0Var = tv0Var.W;
            if (os0Var == null || !os0Var.f36524w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        qv0 qv0Var;
        ci.a7 a7Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        if (adapter instanceof qv0) {
            qv0Var = (qv0) adapter;
        } else {
            qv0Var = null;
        }
        if (qv0Var == null || !qv0Var.M(b1Var.b()) || !qv0Var.M(b1Var2.b())) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ArrayList arrayList2 = qv0Var.f29726y;
        if (!qv0Var.h && (a7Var = qv0Var.f29723s) != null && b10 >= 0 && b10 < a7Var.f5151i.size() && b11 >= 0 && b11 < qv0Var.f29723s.f5151i.size()) {
            if (!(qv0Var.f29723s instanceof ci.t6) && qv0Var.f29721n <= 0) {
                arrayList = new ArrayList(qv0Var.f29723s.f5150g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < qv0Var.f29723s.f5151i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) qv0Var.f29723s.f5151i.get(i10)).getId()));
                }
            }
            if (!qv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                qv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) qv0Var.f29723s.f5151i.get(b10);
            MessageObject messageObject2 = (MessageObject) qv0Var.f29723s.f5151i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            qv0Var.f29723s.C(arrayList, false);
            qv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        ci.a7 a7Var;
        ArrayList arrayList;
        boolean z10;
        lu0 lu0Var = this.d;
        if (lu0Var != null && b1Var != null) {
            lu0Var.d1(false);
        }
        if (i10 == 0) {
            lu0 lu0Var2 = this.d;
            if (lu0Var2 != null && (lu0Var2.getAdapter() instanceof qv0)) {
                qv0 qv0Var = (qv0) this.d.getAdapter();
                ArrayList arrayList2 = qv0Var.f29726y;
                if (!qv0Var.h && (a7Var = qv0Var.f29723s) != null && qv0Var.E) {
                    if (!(a7Var instanceof ci.t6) && qv0Var.f29721n <= 0) {
                        arrayList = a7Var.f5150g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < qv0Var.f29723s.f5151i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) qv0Var.f29723s.f5151i.get(i11)).getId()));
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
                        qv0Var.f29723s.C(arrayList, true);
                    }
                    qv0Var.E = false;
                }
            }
            lu0 lu0Var3 = this.d;
            if (lu0Var3 != null) {
                lu0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        lu0 lu0Var4 = this.d;
        if (lu0Var4 != null) {
            lu0Var4.I0(false);
        }
        if (b1Var != null) {
            b1Var.f45910a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
