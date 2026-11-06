package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class ly extends v4.b0 {
    public final SparseArray I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final RecyclerView N;
    public boolean O;
    public boolean P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final boolean T;

    public ly(int i7, pj0 pj0Var) {
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = pj0Var;
        this.M = i7;
    }

    @Override
    public final void P(View view) {
        v4.d1 T;
        if (this.T) {
            RecyclerView recyclerView = this.N;
            View F = recyclerView.F(view);
            if (F == null) {
                T = null;
            } else {
                T = recyclerView.T(F);
            }
            if (T.b() == B() - 1) {
                ((ViewGroup.MarginLayoutParams) ((v4.o0) view.getLayoutParams())).height = Math.max(this.J, 0);
            }
        }
        super.P(view);
    }

    @Override
    public final void Q() {
        this.I.clear();
        p1();
    }

    @Override
    public final void V(RecyclerView recyclerView, int i7, int i10) {
        p1();
    }

    @Override
    public final void W(RecyclerView recyclerView) {
        this.I.clear();
        p1();
    }

    @Override
    public final void X(RecyclerView recyclerView, int i7, int i10) {
        p1();
    }

    @Override
    public final void Y(RecyclerView recyclerView, int i7, int i10) {
        p1();
    }

    @Override
    public final void Z() {
        p1();
    }

    @Override
    public final void a0(RecyclerView recyclerView, int i7, int i10, Object obj) {
        p1();
        p1();
    }

    @Override
    public final void d0(v4.v0 v0Var, v4.a1 a1Var, int i7, int i10) {
        int i11 = this.K;
        this.L = View.MeasureSpec.getSize(i7);
        int size = View.MeasureSpec.getSize(i10);
        this.K = size;
        if (i11 != size) {
            p1();
        }
        super.d0(v0Var, a1Var, i7, i10);
    }

    @Override
    public final boolean e() {
        return this.Q;
    }

    public final void p1() {
        RecyclerView recyclerView;
        v4.g0 adapter;
        if (this.K <= 0 || (adapter = (recyclerView = this.N).getAdapter()) == null) {
            return;
        }
        int b10 = adapter.b() - 1;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = this.O; i11 < b10; i11++) {
            int d = adapter.d(i11);
            SparseArray sparseArray = this.I;
            v4.d1 d1Var = (v4.d1) sparseArray.get(d, null);
            if (d1Var == null) {
                d1Var = adapter.a(recyclerView, d);
                View view = d1Var.f56952a;
                sparseArray.put(d, d1Var);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(n());
                }
            }
            View view2 = d1Var.f56952a;
            if (this.P) {
                adapter.t(d1Var, i11);
            }
            v4.o0 o0Var = (v4.o0) view2.getLayoutParams();
            view2.measure(v4.n0.s(d(), this.L, this.f57047k, E() + D() + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, ((ViewGroup.MarginLayoutParams) o0Var).width), v4.n0.s(this.Q, this.K, this.f57048l, C() + F() + ((ViewGroup.MarginLayoutParams) o0Var).topMargin + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) o0Var).height));
            i7 += view2.getMeasuredHeight();
            if (i11 == 0) {
                i10 = view2.getMeasuredHeight();
            }
            if (this.R) {
                if (i7 >= this.K + i10) {
                    break;
                }
            } else if (i7 >= this.K) {
                break;
            }
        }
        if (this.R) {
            this.J = Math.max(this.S, (((this.K - i7) - this.M) - recyclerView.getPaddingBottom()) + i10);
        } else {
            this.J = Math.max(this.S, ((this.K - i7) - this.M) - recyclerView.getPaddingBottom());
        }
    }

    public ly(int i7, int i10, pj0 pj0Var) {
        super(1, false);
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = pj0Var;
        this.M = i7;
    }
}
