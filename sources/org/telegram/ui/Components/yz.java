package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class yz extends s4.c0 {
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

    public yz(nm0 nm0Var, int i10) {
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = nm0Var;
        this.M = i10;
    }

    @Override
    public final void P(View view) {
        s4.e1 T;
        if (this.T) {
            RecyclerView recyclerView = this.N;
            View F = recyclerView.F(view);
            if (F == null) {
                T = null;
            } else {
                T = recyclerView.T(F);
            }
            if (T.b() == B() - 1) {
                ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).height = Math.max(this.J, 0);
            }
        }
        super.P(view);
    }

    @Override
    public final void Q() {
        this.I.clear();
        q1();
    }

    @Override
    public final void V(RecyclerView recyclerView, int i10, int i11) {
        q1();
    }

    @Override
    public final void W(RecyclerView recyclerView) {
        this.I.clear();
        q1();
    }

    @Override
    public final void X(RecyclerView recyclerView, int i10, int i11) {
        q1();
    }

    @Override
    public final void Y(RecyclerView recyclerView, int i10, int i11) {
        q1();
    }

    @Override
    public final void Z() {
        q1();
    }

    @Override
    public final void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        q1();
        q1();
    }

    @Override
    public final void d0(rf.e eVar, s4.b1 b1Var, int i10, int i11) {
        int i12 = this.K;
        this.L = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.K = size;
        if (i12 != size) {
            q1();
        }
        super.d0(eVar, b1Var, i10, i11);
    }

    @Override
    public final boolean e() {
        return this.Q;
    }

    public final void q1() {
        RecyclerView recyclerView;
        s4.h0 adapter;
        if (this.K <= 0 || (adapter = (recyclerView = this.N).getAdapter()) == null) {
            return;
        }
        int h = adapter.h() - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.O; i12 < h; i12++) {
            int j10 = adapter.j(i12);
            SparseArray sparseArray = this.I;
            s4.e1 e1Var = (s4.e1) sparseArray.get(j10, null);
            if (e1Var == null) {
                e1Var = adapter.g(recyclerView, j10);
                View view = e1Var.f47773a;
                sparseArray.put(j10, e1Var);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(n());
                }
            }
            View view2 = e1Var.f47773a;
            if (this.P) {
                adapter.v(e1Var, i12);
            }
            s4.q0 q0Var = (s4.q0) view2.getLayoutParams();
            view2.measure(s4.p0.s(d(), this.L, this.f47860k, E() + D() + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, ((ViewGroup.MarginLayoutParams) q0Var).width), s4.p0.s(this.Q, this.K, this.f47861l, C() + F() + ((ViewGroup.MarginLayoutParams) q0Var).topMargin + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) q0Var).height));
            i10 += view2.getMeasuredHeight();
            if (i12 == 0) {
                i11 = view2.getMeasuredHeight();
            }
            if (this.R) {
                if (i10 >= this.K + i11) {
                    break;
                }
            } else if (i10 >= this.K) {
                break;
            }
        }
        if (this.R) {
            this.J = Math.max(this.S, (((this.K - i10) - this.M) - recyclerView.getPaddingBottom()) + i11);
        } else {
            this.J = Math.max(this.S, ((this.K - i10) - this.M) - recyclerView.getPaddingBottom());
        }
    }

    public yz(int i10, int i11, nm0 nm0Var) {
        super(1, false);
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = nm0Var;
        this.M = i10;
    }
}
