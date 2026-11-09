package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class fj extends v4.t {
    public boolean S;
    public final cn T;

    public fj(cn cnVar, boolean z9) {
        super(z9);
        this.T = cnVar;
    }

    @Override
    public final boolean B1(int i7) {
        int i10;
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.dj t92;
        byte b10;
        cn cnVar = this.T;
        ll llVar = cnVar.C0;
        int i11 = llVar.J;
        if (i7 >= i11 && i7 < llVar.K && (i10 = i7 - i11) >= 0 && i10 < llVar.L().size() && (t92 = cnVar.t9((ijVar = (org.telegram.messenger.ij) cnVar.C0.L().get(i10)))) != null) {
            ArrayList arrayList = t92.f22037e;
            org.telegram.messenger.aj d = t92.d(ijVar);
            if (d.f21441a != d.f21442b && (b10 = d.f21443c) == d.d && b10 != 0) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) arrayList.get(i12);
                    if (ajVar != d) {
                        byte b11 = ajVar.f21443c;
                        byte b12 = d.f21443c;
                        if (b11 <= b12 && ajVar.d >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            return !((org.telegram.ui.Cells.q1) view).getMessageObject().P3();
        }
        return false;
    }

    @Override
    public final int G() {
        if (this.S) {
            return (int) this.T.N9;
        }
        return 0;
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) this.T.N9;
        }
        return F();
    }

    @Override
    public final int K() {
        if (this.S) {
            return (int) ((this.f57154n - this.T.N9) - C());
        }
        return super.K();
    }

    @Override
    public final int X0() {
        return (int) this.T.N9;
    }

    @Override
    public final void b0(v4.v0 v0Var, v4.a1 a1Var) {
        boolean z9 = org.telegram.messenger.r2.f25212a;
        try {
            super.b0(v0Var, a1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new dh(this, 4));
        }
    }

    @Override
    public final void i1(int i7, int i10, boolean z9) {
        if (!z9) {
            i10 = (int) ((i10 - F()) + this.T.N9);
        }
        super.i1(i7, i10, z9);
    }

    @Override
    public final int j(v4.a1 a1Var) {
        this.S = true;
        int B0 = B0(a1Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int k(v4.a1 a1Var) {
        this.S = true;
        int C0 = C0(a1Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int l(v4.a1 a1Var) {
        this.S = true;
        int D0 = D0(a1Var);
        this.S = false;
        return D0;
    }

    @Override
    public final int o0(int r11, v4.v0 r12, v4.a1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fj.o0(int, v4.v0, v4.a1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        this.T.Na = false;
        mi.m mVar = new mi.m(recyclerView.getContext(), 0);
        mVar.f57225a = i7;
        w0(mVar);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
