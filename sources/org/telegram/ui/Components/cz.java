package org.telegram.ui.Components;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class cz extends f2.x {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final zk0 V;
    public boolean W;
    public boolean X;

    public cz(int i10, int i11, zk0 zk0Var) {
        super(i10);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = zk0Var;
        this.U = i11;
    }

    public final void B1() {
        zk0 zk0Var;
        f2.q0 adapter;
        int i10;
        zk0 zk0Var2;
        if (this.S <= 0 || !D1() || (adapter = (zk0Var = this.V).getAdapter()) == null) {
            return;
        }
        int i11 = this.J;
        int iH = adapter.h() - 1;
        f2.w wVar = this.O;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = true;
        int measuredHeight = 0;
        while (true) {
            i10 = this.U;
            if (i12 >= iH) {
                zk0Var2 = zk0Var;
                break;
            }
            int i14 = wVar.i(i12);
            i13 += i14;
            if (i14 == i11 || i13 > i11) {
                i13 = i14;
                z10 = true;
            }
            if (z10) {
                int iJ = adapter.j(i12);
                SparseArray sparseArray = this.Q;
                f2.o1 o1VarG = (f2.o1) sparseArray.get(iJ, null);
                if (o1VarG == null) {
                    o1VarG = adapter.g(zk0Var, iJ);
                    View view = o1VarG.f5789a;
                    sparseArray.put(iJ, o1VarG);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(n());
                    }
                }
                View view2 = o1VarG.f5789a;
                if (this.W) {
                    adapter.v(o1VarG, i12);
                }
                f2.y0 y0Var = (f2.y0) view2.getLayoutParams();
                zk0Var2 = zk0Var;
                view2.measure(f2.x0.s(d(), this.T, this.f5860k, E() + D() + ((ViewGroup.MarginLayoutParams) y0Var).leftMargin + ((ViewGroup.MarginLayoutParams) y0Var).rightMargin, ((ViewGroup.MarginLayoutParams) y0Var).width), f2.x0.s(this.X, this.S, this.f5861l, C() + F() + ((ViewGroup.MarginLayoutParams) y0Var).topMargin + ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) y0Var).height));
                measuredHeight += view2.getMeasuredHeight();
                if (measuredHeight >= (this.S - i10) - zk0Var2.getPaddingBottom()) {
                    break;
                } else {
                    z10 = false;
                }
            } else {
                zk0Var2 = zk0Var;
            }
            i12++;
            zk0Var = zk0Var2;
        }
        this.R = Math.max(0, ((this.S - measuredHeight) - i10) - zk0Var2.getPaddingBottom());
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
    public final void d0(f2.e1 e1Var, f2.l1 l1Var, int i10, int i11) {
        int i12 = this.S;
        this.T = View.MeasureSpec.getSize(i10);
        int size = View.MeasureSpec.getSize(i11);
        this.S = size;
        if (i12 != size) {
            B1();
        }
        super.d0(e1Var, l1Var, i10, i11);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void w1(View view, int i10, boolean z10) {
        if (this.V.G(view).b() == B() - 1) {
            ((ViewGroup.MarginLayoutParams) ((f2.y0) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.w1(view, i10, z10);
    }

    public cz(int i10, org.telegram.ui.y40 y40Var) {
        super(i10, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = y40Var;
        this.U = 0;
    }
}
