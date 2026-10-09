package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class f00 extends s4.d0 {
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

    public f00(qm0 qm0Var, int i10) {
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = qm0Var;
        this.M = i10;
    }

    @Override
    public final void P(View view) {
        s4.d1 T;
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
    public final void d0(pf.e eVar, s4.a1 a1Var, int i10, int i11) {
        int i12 = this.K;
        this.L = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.K = size;
        if (i12 != size) {
            p1();
        }
        super.d0(eVar, a1Var, i10, i11);
    }

    @Override
    public final boolean e() {
        return this.Q;
    }

    public final void p1() {
        RecyclerView recyclerView;
        s4.i0 adapter;
        if (this.K <= 0 || (adapter = (recyclerView = this.N).getAdapter()) == null) {
            return;
        }
        int h = adapter.h() - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.O; i12 < h; i12++) {
            int j3 = adapter.j(i12);
            SparseArray sparseArray = this.I;
            s4.d1 d1Var = (s4.d1) sparseArray.get(j3, null);
            if (d1Var == null) {
                d1Var = adapter.e(recyclerView, j3);
                View view = d1Var.f47656a;
                sparseArray.put(j3, d1Var);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(n());
                }
            }
            View view2 = d1Var.f47656a;
            if (this.P) {
                adapter.v(d1Var, i12);
            }
            s4.q0 q0Var = (s4.q0) view2.getLayoutParams();
            view2.measure(s4.p0.s(d(), this.L, this.f47769k, E() + D() + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, ((ViewGroup.MarginLayoutParams) q0Var).width), s4.p0.s(this.Q, this.K, this.f47770l, C() + F() + ((ViewGroup.MarginLayoutParams) q0Var).topMargin + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) q0Var).height));
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

    public f00(int i10, int i11, qm0 qm0Var) {
        super(1, false);
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = qm0Var;
        this.M = i10;
    }
}
