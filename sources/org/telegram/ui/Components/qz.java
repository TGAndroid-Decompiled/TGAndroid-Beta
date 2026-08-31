package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class qz extends f2.w {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final tl0 V;
    public boolean W;
    public boolean X;

    public qz(int i10, int i11, tl0 tl0Var) {
        super(i10);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = tl0Var;
        this.U = i11;
    }

    public final void B1() {
        tl0 tl0Var;
        f2.p0 adapter;
        int i10;
        tl0 tl0Var2;
        if (this.S > 0 && D1() && (adapter = (tl0Var = this.V).getAdapter()) != null) {
            int i11 = this.J;
            int h = adapter.h() - 1;
            f2.v vVar = this.O;
            int i12 = 0;
            int i13 = 0;
            boolean z4 = true;
            int i14 = 0;
            while (true) {
                i10 = this.U;
                if (i12 < h) {
                    int i15 = vVar.i(i12);
                    i13 += i15;
                    if (i15 == i11 || i13 > i11) {
                        i13 = i15;
                        z4 = true;
                    }
                    if (!z4) {
                        tl0Var2 = tl0Var;
                    } else {
                        int j10 = adapter.j(i12);
                        SparseArray sparseArray = this.Q;
                        f2.m1 m1Var = (f2.m1) sparseArray.get(j10, null);
                        if (m1Var == null) {
                            m1Var = adapter.g(tl0Var, j10);
                            View view = m1Var.f5875a;
                            sparseArray.put(j10, m1Var);
                            if (view.getLayoutParams() == null) {
                                view.setLayoutParams(n());
                            }
                        }
                        View view2 = m1Var.f5875a;
                        if (this.W) {
                            adapter.v(m1Var, i12);
                        }
                        f2.x0 x0Var = (f2.x0) view2.getLayoutParams();
                        int i16 = this.T;
                        int i17 = this.f5948k;
                        int D = D();
                        tl0Var2 = tl0Var;
                        view2.measure(f2.w0.s(d(), i16, i17, E() + D + ((ViewGroup.MarginLayoutParams) x0Var).leftMargin + ((ViewGroup.MarginLayoutParams) x0Var).rightMargin, ((ViewGroup.MarginLayoutParams) x0Var).width), f2.w0.s(this.X, this.S, this.f5949l, C() + F() + ((ViewGroup.MarginLayoutParams) x0Var).topMargin + ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) x0Var).height));
                        i14 += view2.getMeasuredHeight();
                        if (i14 >= (this.S - i10) - tl0Var2.getPaddingBottom()) {
                            break;
                        }
                        z4 = false;
                    }
                    i12++;
                    tl0Var = tl0Var2;
                } else {
                    tl0Var2 = tl0Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i14) - i10) - tl0Var2.getPaddingBottom());
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
    public final void d0(bf.f fVar, f2.j1 j1Var, int i10, int i11) {
        int i12 = this.S;
        this.T = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.S = size;
        if (i12 != size) {
            B1();
        }
        super.d0(fVar, j1Var, i10, i11);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void w1(View view, int i10, boolean z4) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(view, i10, z4);
    }

    public qz(int i10, org.telegram.ui.k50 k50Var) {
        super(i10, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = k50Var;
        this.U = 0;
    }
}
