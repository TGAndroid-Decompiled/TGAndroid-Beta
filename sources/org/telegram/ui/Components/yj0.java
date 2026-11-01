package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class yj0 extends s4.i0 {
    public final int f32860a;
    public final Object f32861b;

    public yj0(Object obj, int i10) {
        this.f32860a = i10;
        this.f32861b = obj;
    }

    @Override
    public final void a() {
        int i10 = this.f32860a;
        Object obj = this.f32861b;
        switch (i10) {
            case 0:
                uk0 uk0Var = (uk0) obj;
                uk0Var.K0(true);
                if (uk0Var.f31014q2) {
                    uk0Var.f31013q1 = -1;
                    if (uk0Var.T1 == null) {
                        uk0Var.E1.setEmpty();
                    }
                }
                uk0Var.invalidate();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.f1918u0.f48067f = true;
                boolean z10 = org.telegram.messenger.v2.f18578a;
                recyclerView.d.i("notifyDataSetChanged()");
                recyclerView.n0(true);
                if (!recyclerView.d.h()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
            default:
                ((zf.c1) obj).f();
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        switch (this.f32860a) {
            case 2:
                ((zf.c1) this.f32861b).k(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f32860a) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f32861b;
                recyclerView.l(null);
                kg.s0 s0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) s0Var.d;
                if (i11 >= 1) {
                    boolean z10 = org.telegram.messenger.v2.f18578a;
                    StringBuilder m10 = i0.a.m("onItemRangeChanged(", i10, ", ", i11, ", ");
                    m10.append(obj);
                    m10.append(")");
                    s0Var.i(m10.toString());
                    arrayList.add(s0Var.j(4, i10, obj, i11));
                    s0Var.f11264b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.c(i10, i11, obj);
                return;
        }
    }

    @Override
    public final void d(int i10, int i11) {
        int i12 = this.f32860a;
        Object obj = this.f32861b;
        switch (i12) {
            case 0:
                uk0 uk0Var = (uk0) obj;
                uk0Var.K0(true);
                View view = uk0Var.f31011p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    uk0Var.f31013q1 = -1;
                    uk0Var.g1();
                    return;
                }
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                kg.s0 s0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) s0Var.d;
                if (i11 >= 1) {
                    boolean z10 = org.telegram.messenger.v2.f18578a;
                    s0Var.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    arrayList.add(s0Var.j(1, i10, null, i11));
                    s0Var.f11264b = s0Var.f11264b | 1;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((zf.c1) obj).o(i10 + 1, i11);
                return;
        }
    }

    @Override
    public void e(int i10, int i11) {
        int i12 = this.f32860a;
        Object obj = this.f32861b;
        switch (i12) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                kg.s0 s0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) s0Var.d;
                if (i10 != i11) {
                    boolean z10 = org.telegram.messenger.v2.f18578a;
                    s0Var.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    arrayList.add(s0Var.j(8, i10, null, i11));
                    s0Var.f11264b = s0Var.f11264b | 8;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((zf.c1) obj).k(i10 + 1, i11 + 2);
                return;
            default:
                return;
        }
    }

    @Override
    public final void f(int i10, int i11) {
        int i12 = this.f32860a;
        Object obj = this.f32861b;
        switch (i12) {
            case 0:
                ((uk0) obj).K0(true);
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                kg.s0 s0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) s0Var.d;
                if (i11 >= 1) {
                    boolean z10 = org.telegram.messenger.v2.f18578a;
                    s0Var.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    arrayList.add(s0Var.j(2, i10, null, i11));
                    s0Var.f11264b = s0Var.f11264b | 2;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((zf.c1) obj).p(i10 + 1, i11);
                return;
        }
    }

    public void g() {
        int[] iArr = RecyclerView.Q0;
        RecyclerView recyclerView = (RecyclerView) this.f32861b;
        if (recyclerView.H && recyclerView.G) {
            s4.e0 e0Var = recyclerView.f1908n;
            WeakHashMap weakHashMap = r0.h0.f46134a;
            recyclerView.postOnAnimation(e0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
