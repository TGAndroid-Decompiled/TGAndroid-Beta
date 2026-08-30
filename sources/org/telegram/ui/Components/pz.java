package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class pz extends f2.i0 {
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

    public pz(sl0 sl0Var, int i10) {
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = sl0Var;
        this.M = i10;
    }

    @Override
    public final void P(View view) {
        f2.l1 T;
        if (this.T) {
            RecyclerView recyclerView = this.N;
            View F = recyclerView.F(view);
            if (F == null) {
                T = null;
            } else {
                T = recyclerView.T(F);
            }
            if (T.b() == B() - 1) {
                ((ViewGroup.MarginLayoutParams) ((f2.w0) view.getLayoutParams())).height = Math.max(this.J, 0);
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
    public final void V(RecyclerView recyclerView, int i10, int i11) {
        p1();
    }

    @Override
    public final void W(RecyclerView recyclerView) {
        this.I.clear();
        p1();
    }

    @Override
    public final void X(RecyclerView recyclerView, int i10, int i11) {
        p1();
    }

    @Override
    public final void Y(RecyclerView recyclerView, int i10, int i11) {
        p1();
    }

    @Override
    public final void Z() {
        p1();
    }

    @Override
    public final void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        p1();
        p1();
    }

    @Override
    public final void d0(bf.f fVar, f2.i1 i1Var, int i10, int i11) {
        int i12 = this.K;
        this.L = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.K = size;
        if (i12 != size) {
            p1();
        }
        super.d0(fVar, i1Var, i10, i11);
    }

    @Override
    public final boolean e() {
        return this.Q;
    }

    public final void p1() {
        RecyclerView recyclerView;
        f2.o0 adapter;
        if (this.K <= 0 || (adapter = (recyclerView = this.N).getAdapter()) == null) {
            return;
        }
        int h = adapter.h() - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.O; i12 < h; i12++) {
            int j10 = adapter.j(i12);
            SparseArray sparseArray = this.I;
            f2.l1 l1Var = (f2.l1) sparseArray.get(j10, null);
            if (l1Var == null) {
                l1Var = adapter.g(recyclerView, j10);
                View view = l1Var.f5785a;
                sparseArray.put(j10, l1Var);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(n());
                }
            }
            View view2 = l1Var.f5785a;
            if (this.P) {
                adapter.v(l1Var, i12);
            }
            f2.w0 w0Var = (f2.w0) view2.getLayoutParams();
            view2.measure(f2.v0.s(d(), this.L, this.f5854k, E() + D() + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, ((ViewGroup.MarginLayoutParams) w0Var).width), f2.v0.s(this.Q, this.K, this.f5855l, C() + F() + ((ViewGroup.MarginLayoutParams) w0Var).topMargin + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) w0Var).height));
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

    public pz(int i10, int i11, sl0 sl0Var) {
        super(1, false);
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = sl0Var;
        this.M = i10;
    }
}
