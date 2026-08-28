package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class sq0 extends f2.d0 {
    public ws0 d;
    public final eu0 f32545e;

    public sq0(eu0 eu0Var) {
        this.f32545e = eu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        q1Var.f5501a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        bu0 bu0Var;
        f2.r0 adapter = recyclerView.getAdapter();
        dr0 dr0Var = null;
        if (adapter instanceof bu0) {
            bu0Var = (bu0) adapter;
        } else {
            bu0Var = null;
        }
        if (k() && bu0Var != null && bu0Var.M(q1Var.b())) {
            xs0 xs0Var = this.f32545e.f28137g0[0];
            if (xs0Var != null) {
                dr0Var = xs0Var.h;
            }
            this.d = dr0Var;
            if (dr0Var != null) {
                dr0Var.setItemAnimator(xs0Var.d);
            }
            return f2.d0.l(15, 0);
        }
        return f2.d0.l(0, 0);
    }

    @Override
    public final boolean k() {
        eu0 eu0Var = this.f32545e;
        if (!eu0Var.f28178y1) {
            zq0 zq0Var = eu0Var.S;
            if (zq0Var == null || !zq0Var.f44304w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        bu0 bu0Var;
        ih.n6 n6Var;
        ArrayList arrayList;
        f2.r0 adapter = recyclerView.getAdapter();
        if (adapter instanceof bu0) {
            bu0Var = (bu0) adapter;
        } else {
            bu0Var = null;
        }
        if (bu0Var == null || !bu0Var.M(q1Var.b()) || !bu0Var.M(q1Var2.b())) {
            return false;
        }
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        ArrayList arrayList2 = bu0Var.f27284y;
        if (!bu0Var.h && (n6Var = bu0Var.f27281s) != null && b10 >= 0 && b10 < n6Var.f11851i.size() && b11 >= 0 && b11 < bu0Var.f27281s.f11851i.size()) {
            if (!(bu0Var.f27281s instanceof ih.f6) && bu0Var.f27279n <= 0) {
                arrayList = new ArrayList(bu0Var.f27281s.f11850g);
            } else {
                arrayList = new ArrayList();
                for (int i9 = 0; i9 < bu0Var.f27281s.f11851i.size(); i9++) {
                    arrayList.add(Integer.valueOf(((MessageObject) bu0Var.f27281s.f11851i.get(i9)).getId()));
                }
            }
            if (!bu0Var.A) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                bu0Var.A = true;
            }
            MessageObject messageObject = (MessageObject) bu0Var.f27281s.f11851i.get(b10);
            MessageObject messageObject2 = (MessageObject) bu0Var.f27281s.f11851i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            bu0Var.f27281s.C(arrayList, false);
            bu0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(f2.q1 q1Var, int i9) {
        ih.n6 n6Var;
        ArrayList arrayList;
        boolean z10;
        ws0 ws0Var = this.d;
        if (ws0Var != null && q1Var != null) {
            ws0Var.d1(false);
        }
        if (i9 == 0) {
            ws0 ws0Var2 = this.d;
            if (ws0Var2 != null && (ws0Var2.getAdapter() instanceof bu0)) {
                bu0 bu0Var = (bu0) this.d.getAdapter();
                ArrayList arrayList2 = bu0Var.f27284y;
                if (!bu0Var.h && (n6Var = bu0Var.f27281s) != null && bu0Var.A) {
                    if (!(n6Var instanceof ih.f6) && bu0Var.f27279n <= 0) {
                        arrayList = n6Var.f11850g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < bu0Var.f27281s.f11851i.size(); i10++) {
                            arrayList.add(Integer.valueOf(((MessageObject) bu0Var.f27281s.f11851i.get(i10)).getId()));
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
                        bu0Var.f27281s.C(arrayList, true);
                    }
                    bu0Var.A = false;
                }
            }
            ws0 ws0Var3 = this.d;
            if (ws0Var3 != null) {
                ws0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        ws0 ws0Var4 = this.d;
        if (ws0Var4 != null) {
            ws0Var4.I0(false);
        }
        if (q1Var != null) {
            q1Var.f5501a.setPressed(true);
        }
    }

    @Override
    public final void q(f2.q1 q1Var) {
    }
}
