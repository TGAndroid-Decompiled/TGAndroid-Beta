package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class az extends f2.y {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final wk0 V;
    public boolean W;
    public boolean X;

    public az(int i9, int i10, wk0 wk0Var) {
        super(i9);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = wk0Var;
        this.U = i10;
    }

    public final void B1() {
        wk0 wk0Var;
        f2.r0 adapter;
        int i9;
        wk0 wk0Var2;
        if (this.S > 0 && D1() && (adapter = (wk0Var = this.V).getAdapter()) != null) {
            int i10 = this.J;
            int h = adapter.h() - 1;
            f2.x xVar = this.O;
            int i11 = 0;
            int i12 = 0;
            boolean z10 = true;
            int i13 = 0;
            while (true) {
                i9 = this.U;
                if (i11 < h) {
                    int i14 = xVar.i(i11);
                    i12 += i14;
                    if (i14 == i10 || i12 > i10) {
                        i12 = i14;
                        z10 = true;
                    }
                    if (!z10) {
                        wk0Var2 = wk0Var;
                    } else {
                        int j10 = adapter.j(i11);
                        SparseArray sparseArray = this.Q;
                        f2.q1 q1Var = (f2.q1) sparseArray.get(j10, null);
                        if (q1Var == null) {
                            q1Var = adapter.g(wk0Var, j10);
                            View view = q1Var.f5501a;
                            sparseArray.put(j10, q1Var);
                            if (view.getLayoutParams() == null) {
                                view.setLayoutParams(n());
                            }
                        }
                        View view2 = q1Var.f5501a;
                        if (this.W) {
                            adapter.v(q1Var, i11);
                        }
                        f2.a1 a1Var = (f2.a1) view2.getLayoutParams();
                        int i15 = this.T;
                        int i16 = this.f5570k;
                        int D = D();
                        wk0Var2 = wk0Var;
                        view2.measure(f2.z0.s(d(), i15, i16, E() + D + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin, ((ViewGroup.MarginLayoutParams) a1Var).width), f2.z0.s(this.X, this.S, this.f5571l, C() + F() + ((ViewGroup.MarginLayoutParams) a1Var).topMargin + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin, ((ViewGroup.MarginLayoutParams) a1Var).height));
                        i13 += view2.getMeasuredHeight();
                        if (i13 >= (this.S - i9) - wk0Var2.getPaddingBottom()) {
                            break;
                        }
                        z10 = false;
                    }
                    i11++;
                    wk0Var = wk0Var2;
                } else {
                    wk0Var2 = wk0Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i13) - i9) - wk0Var2.getPaddingBottom());
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
    public final void V(RecyclerView recyclerView, int i9, int i10) {
        super.V(recyclerView, i9, i10);
        B1();
    }

    @Override
    public final void W(RecyclerView recyclerView) {
        this.Q.clear();
        B1();
        super.W(recyclerView);
    }

    @Override
    public final void X(RecyclerView recyclerView, int i9, int i10) {
        super.X(recyclerView, i9, i10);
        B1();
    }

    @Override
    public final void Y(RecyclerView recyclerView, int i9, int i10) {
        super.Y(recyclerView, i9, i10);
        B1();
    }

    @Override
    public final void Z() {
        B1();
    }

    @Override
    public final void a0(RecyclerView recyclerView, int i9, int i10, Object obj) {
        super.a0(recyclerView, i9, i10, obj);
        B1();
    }

    @Override
    public final void d0(f2.g1 g1Var, f2.n1 n1Var, int i9, int i10) {
        int i11 = this.S;
        this.T = View.MeasureSpec.getSize(i9);
        int size = View.MeasureSpec.getSize(i10);
        this.S = size;
        if (i11 != size) {
            B1();
        }
        super.d0(g1Var, n1Var, i9, i10);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void w1(View view, int i9, boolean z10) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((f2.a1) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(view, i9, z10);
    }

    public az(int i9, org.telegram.ui.u40 u40Var) {
        super(i9, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = u40Var;
        this.U = 0;
    }
}
