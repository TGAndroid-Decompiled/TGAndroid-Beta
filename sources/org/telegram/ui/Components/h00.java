package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class h00 extends s4.s {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final wm0 V;
    public boolean W;
    public boolean X;

    public h00(int i10, int i11, wm0 wm0Var) {
        super(i10);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = wm0Var;
        this.U = i11;
    }

    public final void B1() {
        wm0 wm0Var;
        s4.i0 adapter;
        int i10;
        wm0 wm0Var2;
        if (this.S > 0 && D1() && (adapter = (wm0Var = this.V).getAdapter()) != null) {
            int i11 = this.J;
            boolean z10 = true;
            int h = adapter.h() - 1;
            g.o oVar = this.O;
            boolean z11 = true;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = this.U;
                if (i12 < h) {
                    int i15 = oVar.i(i12);
                    i13 += i15;
                    if (i15 == i11 || i13 > i11) {
                        z11 = z10;
                        i13 = i15;
                    }
                    if (!z11) {
                        wm0Var2 = wm0Var;
                    } else {
                        int j3 = adapter.j(i12);
                        SparseArray sparseArray = this.Q;
                        s4.d1 d1Var = (s4.d1) sparseArray.get(j3, null);
                        if (d1Var == null) {
                            d1Var = adapter.e(wm0Var, j3);
                            View view = d1Var.f47889a;
                            sparseArray.put(j3, d1Var);
                            if (view.getLayoutParams() == null) {
                                view.setLayoutParams(n());
                            }
                        }
                        View view2 = d1Var.f47889a;
                        if (this.W) {
                            adapter.v(d1Var, i12);
                        }
                        s4.q0 q0Var = (s4.q0) view2.getLayoutParams();
                        wm0Var2 = wm0Var;
                        view2.measure(s4.p0.s(d(), this.T, this.f48002k, E() + D() + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, ((ViewGroup.MarginLayoutParams) q0Var).width), s4.p0.s(this.X, this.S, this.f48003l, C() + F() + ((ViewGroup.MarginLayoutParams) q0Var).topMargin + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) q0Var).height));
                        i14 += view2.getMeasuredHeight();
                        if (i14 >= (this.S - i10) - wm0Var2.getPaddingBottom()) {
                            break;
                        }
                        z11 = false;
                    }
                    i12++;
                    wm0Var = wm0Var2;
                    z10 = true;
                } else {
                    wm0Var2 = wm0Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i14) - i10) - wm0Var2.getPaddingBottom());
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
    public final void d0(pf.e eVar, s4.a1 a1Var, int i10, int i11) {
        int i12 = this.S;
        this.T = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.S = size;
        if (i12 != size) {
            B1();
        }
        super.d0(eVar, a1Var, i10, i11);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void w1(View view, int i10, boolean z10) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((s4.q0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(view, i10, z10);
    }

    public h00(int i10, org.telegram.ui.o50 o50Var) {
        super(i10, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = o50Var;
        this.U = 0;
    }
}
