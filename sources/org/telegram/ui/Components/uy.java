package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class uy extends v4.t {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final ek0 V;
    public boolean W;
    public boolean X;

    public uy(int i7, int i10, ek0 ek0Var) {
        super(i7);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = ek0Var;
        this.U = i10;
    }

    public final void B1() {
        ek0 ek0Var;
        v4.i0 adapter;
        int i7;
        ek0 ek0Var2;
        if (this.S > 0 && D1() && (adapter = (ek0Var = this.V).getAdapter()) != null) {
            int i10 = this.J;
            boolean z10 = true;
            int b10 = adapter.b() - 1;
            g.p pVar = this.O;
            boolean z11 = true;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i7 = this.U;
                if (i11 < b10) {
                    int i14 = pVar.i(i11);
                    i12 += i14;
                    if (i14 == i10 || i12 > i10) {
                        z11 = z10;
                        i12 = i14;
                    }
                    if (!z11) {
                        ek0Var2 = ek0Var;
                    } else {
                        int d = adapter.d(i11);
                        SparseArray sparseArray = this.Q;
                        v4.f1 f1Var = (v4.f1) sparseArray.get(d, null);
                        if (f1Var == null) {
                            f1Var = adapter.a(ek0Var, d);
                            View view = f1Var.f59245a;
                            sparseArray.put(d, f1Var);
                            if (view.getLayoutParams() == null) {
                                view.setLayoutParams(n());
                            }
                        }
                        View view2 = f1Var.f59245a;
                        if (this.W) {
                            adapter.t(f1Var, i11);
                        }
                        v4.q0 q0Var = (v4.q0) view2.getLayoutParams();
                        ek0Var2 = ek0Var;
                        view2.measure(v4.p0.s(d(), this.T, this.f59339k, E() + D() + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, ((ViewGroup.MarginLayoutParams) q0Var).width), v4.p0.s(this.X, this.S, this.f59340l, C() + F() + ((ViewGroup.MarginLayoutParams) q0Var).topMargin + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) q0Var).height));
                        i13 += view2.getMeasuredHeight();
                        if (i13 >= (this.S - i7) - ek0Var2.getPaddingBottom()) {
                            break;
                        }
                        z11 = false;
                    }
                    i11++;
                    ek0Var = ek0Var2;
                    z10 = true;
                } else {
                    ek0Var2 = ek0Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i13) - i7) - ek0Var2.getPaddingBottom());
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
    public final void d0(v4.x0 x0Var, v4.c1 c1Var, int i7, int i10) {
        int i11 = this.S;
        this.T = View.MeasureSpec.getSize(i7);
        int size = View.MeasureSpec.getSize(i10);
        this.S = size;
        if (i11 != size) {
            B1();
        }
        super.d0(x0Var, c1Var, i7, i10);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void w1(int i7, View view, boolean z10) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((v4.q0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(i7, view, z10);
    }

    public uy(int i7, org.telegram.ui.m30 m30Var) {
        super(i7, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = m30Var;
        this.U = 0;
    }
}
