package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class kr0 extends s4.v {
    public qt0 d;
    public final yu0 e;

    public kr0(yu0 yu0Var) {
        this.e = yu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42675a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        vu0 vu0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        xr0 xr0Var = null;
        if (adapter instanceof vu0) {
            vu0Var = (vu0) adapter;
        } else {
            vu0Var = null;
        }
        if (k() && vu0Var != null && vu0Var.M(c1Var.b())) {
            rt0 rt0Var = this.e.f30368k0[0];
            if (rt0Var != null) {
                xr0Var = rt0Var.h;
            }
            this.d = xr0Var;
            if (xr0Var != null) {
                xr0Var.setItemAnimator(rt0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        yu0 yu0Var = this.e;
        if (!yu0Var.C1) {
            tr0 tr0Var = yu0Var.W;
            if (tr0Var == null || !tr0Var.f32033w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        vu0 vu0Var;
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof vu0) {
            vu0Var = (vu0) adapter;
        } else {
            vu0Var = null;
        }
        if (vu0Var == null || !vu0Var.M(c1Var.b()) || !vu0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = vu0Var.f29444y;
        if (!vu0Var.h && (d9Var = vu0Var.f29441s) != null && b10 >= 0 && b10 < d9Var.f716i.size() && b11 >= 0 && b11 < vu0Var.f29441s.f716i.size()) {
            if (!(vu0Var.f29441s instanceof ai.t8) && vu0Var.f29439n <= 0) {
                arrayList = new ArrayList(vu0Var.f29441s.f715g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < vu0Var.f29441s.f716i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) vu0Var.f29441s.f716i.get(i10)).getId()));
                }
            }
            if (!vu0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                vu0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) vu0Var.f29441s.f716i.get(b10);
            MessageObject messageObject2 = (MessageObject) vu0Var.f29441s.f716i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            vu0Var.f29441s.C(arrayList, false);
            vu0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        boolean z10;
        qt0 qt0Var = this.d;
        if (qt0Var != null && c1Var != null) {
            qt0Var.d1(false);
        }
        if (i10 == 0) {
            qt0 qt0Var2 = this.d;
            if (qt0Var2 != null && (qt0Var2.getAdapter() instanceof vu0)) {
                vu0 vu0Var = (vu0) this.d.getAdapter();
                ArrayList arrayList2 = vu0Var.f29444y;
                if (!vu0Var.h && (d9Var = vu0Var.f29441s) != null && vu0Var.E) {
                    if (!(d9Var instanceof ai.t8) && vu0Var.f29439n <= 0) {
                        arrayList = d9Var.f715g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < vu0Var.f29441s.f716i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) vu0Var.f29441s.f716i.get(i11)).getId()));
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
                        vu0Var.f29441s.C(arrayList, true);
                    }
                    vu0Var.E = false;
                }
            }
            qt0 qt0Var3 = this.d;
            if (qt0Var3 != null) {
                qt0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        qt0 qt0Var4 = this.d;
        if (qt0Var4 != null) {
            qt0Var4.I0(false);
        }
        if (c1Var != null) {
            c1Var.f42675a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
