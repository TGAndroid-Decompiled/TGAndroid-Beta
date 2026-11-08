package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class ly extends v4.s {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final pj0 V;
    public boolean W;
    public boolean X;

    public ly(int i7, int i10, pj0 pj0Var) {
        super(i7);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = pj0Var;
        this.U = i10;
    }

    public final void B1() {
        pj0 pj0Var;
        v4.g0 adapter;
        int i7;
        pj0 pj0Var2;
        if (this.S > 0 && D1() && (adapter = (pj0Var = this.V).getAdapter()) != null) {
            int i10 = this.J;
            boolean z9 = true;
            int b10 = adapter.b() - 1;
            g.p pVar = this.O;
            boolean z10 = true;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i7 = this.U;
                if (i11 < b10) {
                    int i14 = pVar.i(i11);
                    i12 += i14;
                    if (i14 == i10 || i12 > i10) {
                        z10 = z9;
                        i12 = i14;
                    }
                    if (!z10) {
                        pj0Var2 = pj0Var;
                    } else {
                        int d = adapter.d(i11);
                        SparseArray sparseArray = this.Q;
                        v4.d1 d1Var = (v4.d1) sparseArray.get(d, null);
                        if (d1Var == null) {
                            d1Var = adapter.a(pj0Var, d);
                            View view = d1Var.f57044a;
                            sparseArray.put(d, d1Var);
                            if (view.getLayoutParams() == null) {
                                view.setLayoutParams(n());
                            }
                        }
                        View view2 = d1Var.f57044a;
                        if (this.W) {
                            adapter.t(d1Var, i11);
                        }
                        v4.o0 o0Var = (v4.o0) view2.getLayoutParams();
                        pj0Var2 = pj0Var;
                        view2.measure(v4.n0.s(d(), this.T, this.f57139k, E() + D() + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, ((ViewGroup.MarginLayoutParams) o0Var).width), v4.n0.s(this.X, this.S, this.f57140l, C() + F() + ((ViewGroup.MarginLayoutParams) o0Var).topMargin + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) o0Var).height));
                        i13 += view2.getMeasuredHeight();
                        if (i13 >= (this.S - i7) - pj0Var2.getPaddingBottom()) {
                            break;
                        }
                        z10 = false;
                    }
                    i11++;
                    pj0Var = pj0Var2;
                    z9 = true;
                } else {
                    pj0Var2 = pj0Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i13) - i7) - pj0Var2.getPaddingBottom());
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
    public final void V(RecyclerView recyclerView, int i7, int i10) {
        super.V(recyclerView, i7, i10);
        B1();
    }

    @Override
    public final void W(RecyclerView recyclerView) {
        this.Q.clear();
        B1();
        super.W(recyclerView);
    }

    @Override
    public final void X(RecyclerView recyclerView, int i7, int i10) {
        super.X(recyclerView, i7, i10);
        B1();
    }

    @Override
    public final void Y(RecyclerView recyclerView, int i7, int i10) {
        super.Y(recyclerView, i7, i10);
        B1();
    }

    @Override
    public final void Z() {
        B1();
    }

    @Override
    public final void a0(RecyclerView recyclerView, int i7, int i10, Object obj) {
        super.a0(recyclerView, i7, i10, obj);
        B1();
    }

    @Override
    public final void d0(v4.v0 v0Var, v4.a1 a1Var, int i7, int i10) {
        int i11 = this.S;
        this.T = View.MeasureSpec.getSize(i7);
        int size = View.MeasureSpec.getSize(i10);
        this.S = size;
        if (i11 != size) {
            B1();
        }
        super.d0(v0Var, a1Var, i7, i10);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void w1(int i7, View view, boolean z9) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((v4.o0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(i7, view, z9);
    }

    public ly(int i7, org.telegram.ui.k30 k30Var) {
        super(i7, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = k30Var;
        this.U = 0;
    }
}
