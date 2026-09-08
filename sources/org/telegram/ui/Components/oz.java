package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class oz extends s4.s {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final ll0 V;
    public boolean W;
    public boolean X;

    public oz(int i10, int i11, ll0 ll0Var) {
        super(i10);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = ll0Var;
        this.U = i11;
    }

    public final void B1() {
        ll0 ll0Var;
        s4.h0 adapter;
        int i10;
        ll0 ll0Var2;
        if (this.S > 0 && D1() && (adapter = (ll0Var = this.V).getAdapter()) != null) {
            int i11 = this.J;
            int h = adapter.h() - 1;
            g.p pVar = this.O;
            int i12 = 0;
            int i13 = 0;
            boolean z10 = true;
            int i14 = 0;
            while (true) {
                i10 = this.U;
                if (i12 < h) {
                    int i15 = pVar.i(i12);
                    i13 += i15;
                    if (i15 == i11 || i13 > i11) {
                        i13 = i15;
                        z10 = true;
                    }
                    if (!z10) {
                        ll0Var2 = ll0Var;
                    } else {
                        int j3 = adapter.j(i12);
                        SparseArray sparseArray = this.Q;
                        s4.c1 c1Var = (s4.c1) sparseArray.get(j3, null);
                        if (c1Var == null) {
                            c1Var = adapter.g(ll0Var, j3);
                            View view = c1Var.f45766a;
                            sparseArray.put(j3, c1Var);
                            if (view.getLayoutParams() == null) {
                                view.setLayoutParams(n());
                            }
                        }
                        View view2 = c1Var.f45766a;
                        if (this.W) {
                            adapter.v(c1Var, i12);
                        }
                        s4.p0 p0Var = (s4.p0) view2.getLayoutParams();
                        int i16 = this.T;
                        int i17 = this.f45877k;
                        int D = D();
                        ll0Var2 = ll0Var;
                        view2.measure(s4.o0.s(d(), i16, i17, E() + D + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin, ((ViewGroup.MarginLayoutParams) p0Var).width), s4.o0.s(this.X, this.S, this.f45878l, C() + F() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) p0Var).height));
                        i14 += view2.getMeasuredHeight();
                        if (i14 >= (this.S - i10) - ll0Var2.getPaddingBottom()) {
                            break;
                        }
                        z10 = false;
                    }
                    i12++;
                    ll0Var = ll0Var2;
                } else {
                    ll0Var2 = ll0Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i14) - i10) - ll0Var2.getPaddingBottom());
        }
    }

    public final void C1() {
        this.W = false;
    }

    public boolean D1() {
        return true;
    }

    @Override
    public final void Q() {
        this.Q.clear();
        B1();
    }

    @Override
    public final void V(RecyclerView recyclerView, int i10, int i11) {
        super.V(recyclerView, i10, i11);
        B1();
    }

    @Override
    public final void W(RecyclerView recyclerView) {
        this.Q.clear();
        B1();
        super.W(recyclerView);
    }

    @Override
    public final void X(RecyclerView recyclerView, int i10, int i11) {
        super.X(recyclerView, i10, i11);
        B1();
    }

    @Override
    public final void Y(RecyclerView recyclerView, int i10, int i11) {
        super.Y(recyclerView, i10, i11);
        B1();
    }

    @Override
    public final void Z() {
        B1();
    }

    @Override
    public final void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.a0(recyclerView, i10, i11, obj);
        B1();
    }

    @Override
    public final void d0(pf.e eVar, s4.z0 z0Var, int i10, int i11) {
        int i12 = this.S;
        this.T = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.S = size;
        if (i12 != size) {
            B1();
        }
        super.d0(eVar, z0Var, i10, i11);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void w1(View view, int i10, boolean z10) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(view, i10, z10);
    }

    public oz(int i10, org.telegram.ui.p50 p50Var) {
        super(i10, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = p50Var;
        this.U = 0;
    }
}
