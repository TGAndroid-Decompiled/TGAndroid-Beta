package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class bz extends f2.m0 {
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

    public bz(wk0 wk0Var, int i9) {
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = wk0Var;
        this.M = i9;
    }

    @Override
    public final void P(View view) {
        f2.q1 T;
        if (this.T) {
            RecyclerView recyclerView = this.N;
            View F = recyclerView.F(view);
            if (F == null) {
                T = null;
            } else {
                T = recyclerView.T(F);
            }
            if (T.b() == B() - 1) {
                ((ViewGroup.MarginLayoutParams) ((f2.a1) view.getLayoutParams())).height = Math.max(this.J, 0);
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
    public final void V(RecyclerView recyclerView, int i9, int i10) {
        p1();
    }

    @Override
    public final void W(RecyclerView recyclerView) {
        this.I.clear();
        p1();
    }

    @Override
    public final void X(RecyclerView recyclerView, int i9, int i10) {
        p1();
    }

    @Override
    public final void Y(RecyclerView recyclerView, int i9, int i10) {
        p1();
    }

    @Override
    public final void Z() {
        p1();
    }

    @Override
    public final void a0(RecyclerView recyclerView, int i9, int i10, Object obj) {
        p1();
        p1();
    }

    @Override
    public final void d0(f2.g1 g1Var, f2.n1 n1Var, int i9, int i10) {
        int i11 = this.K;
        this.L = View.MeasureSpec.getSize(i9);
        int size = View.MeasureSpec.getSize(i10);
        this.K = size;
        if (i11 != size) {
            p1();
        }
        super.d0(g1Var, n1Var, i9, i10);
    }

    @Override
    public final boolean e() {
        return this.Q;
    }

    public final void p1() {
        RecyclerView recyclerView;
        f2.r0 adapter;
        if (this.K <= 0 || (adapter = (recyclerView = this.N).getAdapter()) == null) {
            return;
        }
        int h = adapter.h() - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = this.O; i11 < h; i11++) {
            int j10 = adapter.j(i11);
            SparseArray sparseArray = this.I;
            f2.q1 q1Var = (f2.q1) sparseArray.get(j10, null);
            if (q1Var == null) {
                q1Var = adapter.g(recyclerView, j10);
                View view = q1Var.f5501a;
                sparseArray.put(j10, q1Var);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(n());
                }
            }
            View view2 = q1Var.f5501a;
            if (this.P) {
                adapter.v(q1Var, i11);
            }
            f2.a1 a1Var = (f2.a1) view2.getLayoutParams();
            view2.measure(f2.z0.s(d(), this.L, this.f5570k, E() + D() + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin, ((ViewGroup.MarginLayoutParams) a1Var).width), f2.z0.s(this.Q, this.K, this.f5571l, C() + F() + ((ViewGroup.MarginLayoutParams) a1Var).topMargin + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin, ((ViewGroup.MarginLayoutParams) a1Var).height));
            i9 += view2.getMeasuredHeight();
            if (i11 == 0) {
                i10 = view2.getMeasuredHeight();
            }
            if (this.R) {
                if (i9 >= this.K + i10) {
                    break;
                }
            } else if (i9 >= this.K) {
                break;
            }
        }
        if (this.R) {
            this.J = Math.max(this.S, (((this.K - i9) - this.M) - recyclerView.getPaddingBottom()) + i10);
        } else {
            this.J = Math.max(this.S, ((this.K - i9) - this.M) - recyclerView.getPaddingBottom());
        }
    }

    public bz(int i9, int i10, wk0 wk0Var) {
        super(1, false);
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = wk0Var;
        this.M = i9;
    }
}
