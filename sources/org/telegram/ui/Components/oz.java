package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class oz extends f2.w {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final sl0 V;
    public boolean W;
    public boolean X;

    public oz(int i10, int i11, sl0 sl0Var) {
        super(i10);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = sl0Var;
        this.U = i11;
    }

    public final void B1() {
        sl0 sl0Var;
        f2.o0 adapter;
        int i10;
        sl0 sl0Var2;
        if (this.S > 0 && D1() && (adapter = (sl0Var = this.V).getAdapter()) != null) {
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
                        sl0Var2 = sl0Var;
                    } else {
                        int j10 = adapter.j(i12);
                        SparseArray sparseArray = this.Q;
                        f2.l1 l1Var = (f2.l1) sparseArray.get(j10, null);
                        if (l1Var == null) {
                            l1Var = adapter.g(sl0Var, j10);
                            View view = l1Var.f5785a;
                            sparseArray.put(j10, l1Var);
                            if (view.getLayoutParams() == null) {
                                view.setLayoutParams(n());
                            }
                        }
                        View view2 = l1Var.f5785a;
                        if (this.W) {
                            adapter.v(l1Var, i12);
                        }
                        f2.w0 w0Var = (f2.w0) view2.getLayoutParams();
                        int i16 = this.T;
                        int i17 = this.f5854k;
                        int D = D();
                        sl0Var2 = sl0Var;
                        view2.measure(f2.v0.s(d(), i16, i17, E() + D + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, ((ViewGroup.MarginLayoutParams) w0Var).width), f2.v0.s(this.X, this.S, this.f5855l, C() + F() + ((ViewGroup.MarginLayoutParams) w0Var).topMargin + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) w0Var).height));
                        i14 += view2.getMeasuredHeight();
                        if (i14 >= (this.S - i10) - sl0Var2.getPaddingBottom()) {
                            break;
                        }
                        z4 = false;
                    }
                    i12++;
                    sl0Var = sl0Var2;
                } else {
                    sl0Var2 = sl0Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i14) - i10) - sl0Var2.getPaddingBottom());
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
    public final void d0(bf.f fVar, f2.i1 i1Var, int i10, int i11) {
        int i12 = this.S;
        this.T = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.S = size;
        if (i12 != size) {
            B1();
        }
        super.d0(fVar, i1Var, i10, i11);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void w1(View view, int i10, boolean z4) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((f2.w0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(view, i10, z4);
    }

    public oz(int i10, org.telegram.ui.j50 j50Var) {
        super(i10, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = j50Var;
        this.U = 0;
    }
}
