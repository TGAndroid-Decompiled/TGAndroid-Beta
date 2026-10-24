package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class vz extends s4.s {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final lm0 V;
    public boolean W;
    public boolean X;

    public vz(int i10, int i11, lm0 lm0Var) {
        super(i10);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = lm0Var;
        this.U = i11;
    }

    public final void B1() {
        lm0 lm0Var;
        s4.g0 adapter;
        int i10;
        lm0 lm0Var2;
        if (this.S > 0 && D1() && (adapter = (lm0Var = this.V).getAdapter()) != null) {
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
                        lm0Var2 = lm0Var;
                    } else {
                        int j10 = adapter.j(i12);
                        SparseArray sparseArray = this.Q;
                        s4.b1 b1Var = (s4.b1) sparseArray.get(j10, null);
                        if (b1Var == null) {
                            b1Var = adapter.g(lm0Var, j10);
                            View view = b1Var.f46342a;
                            sparseArray.put(j10, b1Var);
                            if (view.getLayoutParams() == null) {
                                view.setLayoutParams(n());
                            }
                        }
                        View view2 = b1Var.f46342a;
                        if (this.W) {
                            adapter.v(b1Var, i12);
                        }
                        s4.o0 o0Var = (s4.o0) view2.getLayoutParams();
                        lm0Var2 = lm0Var;
                        view2.measure(s4.n0.s(d(), this.T, this.f46441k, E() + D() + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin, ((ViewGroup.MarginLayoutParams) o0Var).width), s4.n0.s(this.X, this.S, this.f46442l, C() + F() + ((ViewGroup.MarginLayoutParams) o0Var).topMargin + ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) o0Var).height));
                        i14 += view2.getMeasuredHeight();
                        if (i14 >= (this.S - i10) - lm0Var2.getPaddingBottom()) {
                            break;
                        }
                        z11 = false;
                    }
                    i12++;
                    lm0Var = lm0Var2;
                    z10 = true;
                } else {
                    lm0Var2 = lm0Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i14) - i10) - lm0Var2.getPaddingBottom());
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
    public final void d0(qf.e eVar, s4.y0 y0Var, int i10, int i11) {
        int i12 = this.S;
        this.T = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.S = size;
        if (i12 != size) {
            B1();
        }
        super.d0(eVar, y0Var, i10, i11);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void w1(View view, int i10, boolean z10) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(view, i10, z10);
    }

    public vz(int i10, org.telegram.ui.z40 z40Var) {
        super(i10, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = z40Var;
        this.U = 0;
    }
}
