package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class dz extends f2.k0 {
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

    public dz(zk0 zk0Var, int i10) {
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = zk0Var;
        this.M = i10;
    }

    @Override
    public final void P(View view) {
        if (this.T) {
            RecyclerView recyclerView = this.N;
            View viewF = recyclerView.F(view);
            if ((viewF == null ? null : recyclerView.T(viewF)).b() == B() - 1) {
                ((ViewGroup.MarginLayoutParams) ((f2.y0) view.getLayoutParams())).height = Math.max(this.J, 0);
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
    public final void d0(f2.e1 e1Var, f2.l1 l1Var, int i10, int i11) {
        int i12 = this.K;
        this.L = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.K = size;
        if (i12 != size) {
            p1();
        }
        super.d0(e1Var, l1Var, i10, i11);
    }

    @Override
    public final boolean e() {
        return this.Q;
    }

    public final void p1() {
        RecyclerView recyclerView;
        ?? adapter;
        ?? r10;
        if (this.K > 0 && (adapter = (recyclerView = this.N).getAdapter()) != 0) {
            int iH = adapter.h() - 1;
            boolean z10 = this.O;
            int measuredHeight = 0;
            int measuredHeight2 = 0;
            while (true) {
                if (r10 >= iH) {
                    r10 = z10;
                    break;
                }
                int iJ = adapter.j(r10);
                SparseArray sparseArray = this.I;
                f2.o1 o1VarG = (f2.o1) sparseArray.get(iJ, null);
                if (o1VarG == null) {
                    o1VarG = adapter.g(recyclerView, iJ);
                    View view = o1VarG.f5789a;
                    sparseArray.put(iJ, o1VarG);
                    if (view.getLayoutParams() == null) {
                        r10 = z10;
                        view.setLayoutParams(n());
                    }
                }
                r10 = z10;
                r10 = z10;
                View view2 = o1VarG.f5789a;
                if (this.P) {
                    adapter.v(o1VarG, r10);
                }
                f2.y0 y0Var = (f2.y0) view2.getLayoutParams();
                view2.measure(f2.x0.s(d(), this.L, this.f5860k, E() + D() + ((ViewGroup.MarginLayoutParams) y0Var).leftMargin + ((ViewGroup.MarginLayoutParams) y0Var).rightMargin, ((ViewGroup.MarginLayoutParams) y0Var).width), f2.x0.s(this.Q, this.K, this.f5861l, C() + F() + ((ViewGroup.MarginLayoutParams) y0Var).topMargin + ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) y0Var).height));
                measuredHeight += view2.getMeasuredHeight();
                if (r10 == 0) {
                    measuredHeight2 = view2.getMeasuredHeight();
                }
                if (this.R) {
                    if (measuredHeight >= this.K + measuredHeight2) {
                        break;
                    } else {
                        r10++;
                    }
                } else if (measuredHeight >= this.K) {
                    break;
                } else {
                    r10++;
                }
            }
            if (this.R) {
                this.J = Math.max(this.S, (((this.K - measuredHeight) - this.M) - recyclerView.getPaddingBottom()) + measuredHeight2);
            } else {
                this.J = Math.max(this.S, ((this.K - measuredHeight) - this.M) - recyclerView.getPaddingBottom());
            }
        }
    }

    public dz(int i10, int i11, zk0 zk0Var) {
        super(1, false);
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = zk0Var;
        this.M = i10;
    }
}
