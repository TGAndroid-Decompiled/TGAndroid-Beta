package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class zy extends s4.r {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final uk0 V;
    public boolean W;
    public boolean X;

    public zy(int i10, int i11, uk0 uk0Var) {
        super(i10);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = uk0Var;
        this.U = i11;
    }

    public final void B1() {
        uk0 uk0Var;
        s4.g0 adapter;
        int i10;
        uk0 uk0Var2;
        if (this.S > 0 && D1() && (adapter = (uk0Var = this.V).getAdapter()) != null) {
            int i11 = this.J;
            boolean z10 = true;
            int b10 = adapter.b() - 1;
            g.o oVar = this.O;
            boolean z11 = true;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = this.U;
                if (i12 < b10) {
                    int i15 = oVar.i(i12);
                    i13 += i15;
                    if (i15 == i11 || i13 > i11) {
                        z11 = z10;
                        i13 = i15;
                    }
                    if (!z11) {
                        uk0Var2 = uk0Var;
                    } else {
                        int d = adapter.d(i12);
                        SparseArray sparseArray = this.Q;
                        s4.c1 c1Var = (s4.c1) sparseArray.get(d, null);
                        if (c1Var == null) {
                            c1Var = adapter.a(uk0Var, d);
                            View view = c1Var.f47909a;
                            sparseArray.put(d, c1Var);
                            if (view.getLayoutParams() == null) {
                                view.setLayoutParams(n());
                            }
                        }
                        View view2 = c1Var.f47909a;
                        if (this.W) {
                            adapter.t(c1Var, i12);
                        }
                        s4.o0 o0Var = (s4.o0) view2.getLayoutParams();
                        uk0Var2 = uk0Var;
                        view2.measure(s4.n0.s(d(), this.T, this.f47996k, E() + D() + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, ((ViewGroup.MarginLayoutParams) o0Var).width), s4.n0.s(this.X, this.S, this.f47997l, C() + F() + ((ViewGroup.MarginLayoutParams) o0Var).topMargin + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) o0Var).height));
                        i14 += view2.getMeasuredHeight();
                        if (i14 >= (this.S - i10) - uk0Var2.getPaddingBottom()) {
                            break;
                        }
                        z11 = false;
                    }
                    i12++;
                    uk0Var = uk0Var2;
                    z10 = true;
                } else {
                    uk0Var2 = uk0Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i14) - i10) - uk0Var2.getPaddingBottom());
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
    public final void d0(hf.e eVar, s4.z0 z0Var, int i10, int i11) {
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
    public final void w1(int i10, View view, boolean z10) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(i10, view, z10);
    }

    public zy(int i10, org.telegram.ui.h40 h40Var) {
        super(i10, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = h40Var;
        this.U = 0;
    }
}
