package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class mr0 extends f2.b0 {
    public qt0 d;
    public final zu0 f29240e;

    public mr0(zu0 zu0Var) {
        this.f29240e = zu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.f5875a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        wu0 wu0Var;
        f2.p0 adapter = recyclerView.getAdapter();
        xr0 xr0Var = null;
        if (adapter instanceof wu0) {
            wu0Var = (wu0) adapter;
        } else {
            wu0Var = null;
        }
        if (k() && wu0Var != null && wu0Var.M(m1Var.b())) {
            rt0 rt0Var = this.f29240e.f33980h0[0];
            if (rt0Var != null) {
                xr0Var = rt0Var.h;
            }
            this.d = xr0Var;
            if (xr0Var != null) {
                xr0Var.setItemAnimator(rt0Var.d);
            }
            return f2.b0.l(15, 0);
        }
        return f2.b0.l(0, 0);
    }

    @Override
    public final boolean k() {
        zu0 zu0Var = this.f29240e;
        if (!zu0Var.f34021z1) {
            tr0 tr0Var = zu0Var.T;
            if (tr0Var == null || !tr0Var.f38934w) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        wu0 wu0Var;
        oh.l6 l6Var;
        ArrayList arrayList;
        f2.p0 adapter = recyclerView.getAdapter();
        if (adapter instanceof wu0) {
            wu0Var = (wu0) adapter;
        } else {
            wu0Var = null;
        }
        if (wu0Var == null || !wu0Var.M(m1Var.b()) || !wu0Var.M(m1Var2.b())) {
            return false;
        }
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        ArrayList arrayList2 = wu0Var.f32860y;
        if (!wu0Var.h && (l6Var = wu0Var.f32857s) != null && b10 >= 0 && b10 < l6Var.f17402i.size() && b11 >= 0 && b11 < wu0Var.f32857s.f17402i.size()) {
            if (!(wu0Var.f32857s instanceof oh.d6) && wu0Var.f32855n <= 0) {
                arrayList = new ArrayList(wu0Var.f32857s.f17401g);
            } else {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < wu0Var.f32857s.f17402i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) wu0Var.f32857s.f17402i.get(i10)).getId()));
                }
            }
            if (!wu0Var.B) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                wu0Var.B = true;
            }
            MessageObject messageObject = (MessageObject) wu0Var.f32857s.f17402i.get(b10);
            MessageObject messageObject2 = (MessageObject) wu0Var.f32857s.f17402i.get(b11);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            wu0Var.f32857s.C(arrayList, false);
            wu0Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        oh.l6 l6Var;
        ArrayList arrayList;
        boolean z4;
        qt0 qt0Var = this.d;
        if (qt0Var != null && m1Var != null) {
            qt0Var.d1(false);
        }
        if (i10 == 0) {
            qt0 qt0Var2 = this.d;
            if (qt0Var2 != null && (qt0Var2.getAdapter() instanceof wu0)) {
                wu0 wu0Var = (wu0) this.d.getAdapter();
                ArrayList arrayList2 = wu0Var.f32860y;
                if (!wu0Var.h && (l6Var = wu0Var.f32857s) != null && wu0Var.B) {
                    if (!(l6Var instanceof oh.d6) && wu0Var.f32855n <= 0) {
                        arrayList = l6Var.f17401g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < wu0Var.f32857s.f17402i.size(); i11++) {
                            arrayList.add(Integer.valueOf(((MessageObject) wu0Var.f32857s.f17402i.get(i11)).getId()));
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i12) != arrayList.get(i12)) {
                                z4 = true;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (z4) {
                        wu0Var.f32857s.C(arrayList, true);
                    }
                    wu0Var.B = false;
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
        if (m1Var != null) {
            m1Var.f5875a.setPressed(true);
        }
    }

    @Override
    public final void q(f2.m1 m1Var) {
    }
}
