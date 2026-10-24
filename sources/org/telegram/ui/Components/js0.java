package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class js0 extends s4.v {
    public ou0 d;
    public final wv0 e;

    public js0(wv0 wv0Var) {
        this.e = wv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f46342a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        tv0 tv0Var;
        s4.g0 adapter = recyclerView.getAdapter();
        vs0 vs0Var = null;
        if (adapter instanceof tv0) {
            tv0Var = (tv0) adapter;
        } else {
            tv0Var = null;
        }
        if (k() && tv0Var != null && tv0Var.M(b1Var.b())) {
            pu0 pu0Var = this.e.f32386k0[0];
            if (pu0Var != null) {
                vs0Var = pu0Var.h;
            }
            this.d = vs0Var;
            if (vs0Var != null) {
                vs0Var.setItemAnimator(pu0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        wv0 wv0Var = this.e;
        if (!wv0Var.C1) {
            rs0 rs0Var = wv0Var.W;
            if (rs0Var == null || !rs0Var.f37717w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        tv0 tv0Var;
        ci.z6 z6Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        if (adapter instanceof tv0) {
            tv0Var = (tv0) adapter;
        } else {
            tv0Var = null;
        }
        if (tv0Var == null || !tv0Var.M(b1Var.b()) || !tv0Var.M(b1Var2.b())) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ArrayList arrayList2 = tv0Var.f30905y;
        if (!tv0Var.h && (z6Var = tv0Var.f30902s) != null && b10 >= 0 && b10 < z6Var.f6193i.size() && b11 >= 0 && b11 < tv0Var.f30902s.f6193i.size()) {
            if (!(tv0Var.f30902s instanceof ci.s6) && tv0Var.f30900n <= 0) {
                arrayList = new ArrayList(tv0Var.f30902s.f6192g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < tv0Var.f30902s.f6193i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) tv0Var.f30902s.f6193i.get(i10)).getId()));
                }
            }
            if (!tv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                tv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) tv0Var.f30902s.f6193i.get(b10);
            MessageObject messageObject2 = (MessageObject) tv0Var.f30902s.f6193i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            tv0Var.f30902s.C(arrayList, false);
            tv0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        ci.z6 z6Var;
        ArrayList arrayList;
        boolean z10;
        ou0 ou0Var = this.d;
        if (ou0Var != null && b1Var != null) {
            ou0Var.e1(false);
        }
        if (i10 == 0) {
            ou0 ou0Var2 = this.d;
            if (ou0Var2 != null && (ou0Var2.getAdapter() instanceof tv0)) {
                tv0 tv0Var = (tv0) this.d.getAdapter();
                ArrayList arrayList2 = tv0Var.f30905y;
                if (!tv0Var.h && (z6Var = tv0Var.f30902s) != null && tv0Var.E) {
                    if (!(z6Var instanceof ci.s6) && tv0Var.f30900n <= 0) {
                        arrayList = z6Var.f6192g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < tv0Var.f30902s.f6193i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) tv0Var.f30902s.f6193i.get(i11)).getId()));
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
                        tv0Var.f30902s.C(arrayList, true);
                    }
                    tv0Var.E = false;
                }
            }
            ou0 ou0Var3 = this.d;
            if (ou0Var3 != null) {
                ou0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        ou0 ou0Var4 = this.d;
        if (ou0Var4 != null) {
            ou0Var4.I0(false);
        }
        if (b1Var != null) {
            b1Var.f46342a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
