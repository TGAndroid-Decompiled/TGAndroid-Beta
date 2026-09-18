package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class lr0 extends s4.v {
    public rt0 d;
    public final zu0 e;

    public lr0(zu0 zu0Var) {
        this.e = zu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42702a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        wu0 wu0Var;
        s4.h0 adapter = recyclerView.getAdapter();
        yr0 yr0Var = null;
        if (adapter instanceof wu0) {
            wu0Var = (wu0) adapter;
        } else {
            wu0Var = null;
        }
        if (k() && wu0Var != null && wu0Var.M(c1Var.b())) {
            st0 st0Var = this.e.f30635k0[0];
            if (st0Var != null) {
                yr0Var = st0Var.h;
            }
            this.d = yr0Var;
            if (yr0Var != null) {
                yr0Var.setItemAnimator(st0Var.d);
            }
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean k() {
        zu0 zu0Var = this.e;
        if (!zu0Var.C1) {
            ur0 ur0Var = zu0Var.W;
            if (ur0Var == null || !ur0Var.f32652w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        wu0 wu0Var;
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        if (adapter instanceof wu0) {
            wu0Var = (wu0) adapter;
        } else {
            wu0Var = null;
        }
        if (wu0Var == null || !wu0Var.M(c1Var.b()) || !wu0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = wu0Var.f29758y;
        if (!wu0Var.h && (d9Var = wu0Var.f29755s) != null && b10 >= 0 && b10 < d9Var.f721i.size() && b11 >= 0 && b11 < wu0Var.f29755s.f721i.size()) {
            if (!(wu0Var.f29755s instanceof ai.t8) && wu0Var.f29753n <= 0) {
                arrayList = new ArrayList(wu0Var.f29755s.f720g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < wu0Var.f29755s.f721i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) wu0Var.f29755s.f721i.get(i10)).getId()));
                }
            }
            if (!wu0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                wu0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) wu0Var.f29755s.f721i.get(b10);
            MessageObject messageObject2 = (MessageObject) wu0Var.f29755s.f721i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            wu0Var.f29755s.C(arrayList, false);
            wu0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        boolean z10;
        rt0 rt0Var = this.d;
        if (rt0Var != null && c1Var != null) {
            rt0Var.e1(false);
        }
        if (i10 == 0) {
            rt0 rt0Var2 = this.d;
            if (rt0Var2 != null && (rt0Var2.getAdapter() instanceof wu0)) {
                wu0 wu0Var = (wu0) this.d.getAdapter();
                ArrayList arrayList2 = wu0Var.f29758y;
                if (!wu0Var.h && (d9Var = wu0Var.f29755s) != null && wu0Var.E) {
                    if (!(d9Var instanceof ai.t8) && wu0Var.f29753n <= 0) {
                        arrayList = d9Var.f720g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < wu0Var.f29755s.f721i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) wu0Var.f29755s.f721i.get(i11)).getId()));
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
                        wu0Var.f29755s.C(arrayList, true);
                    }
                    wu0Var.E = false;
                }
            }
            rt0 rt0Var3 = this.d;
            if (rt0Var3 != null) {
                rt0Var3.setItemAnimator(null);
                return;
            }
            return;
        }
        rt0 rt0Var4 = this.d;
        if (rt0Var4 != null) {
            rt0Var4.J0(false);
        }
        if (c1Var != null) {
            c1Var.f42702a.setPressed(true);
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
