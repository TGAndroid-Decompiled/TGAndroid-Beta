package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ej extends v4.u {
    public boolean S;
    public final bn T;

    public ej(bn bnVar, boolean z10) {
        super(z10);
        this.T = bnVar;
    }

    @Override
    public final boolean B1(int i7) {
        int i10;
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.aj u92;
        byte b10;
        bn bnVar = this.T;
        kl klVar = bnVar.D0;
        int i11 = klVar.K;
        if (i7 >= i11 && i7 < klVar.L && (i10 = i7 - i11) >= 0 && i10 < klVar.L().size() && (u92 = bnVar.u9((fjVar = (org.telegram.messenger.fj) bnVar.D0.L().get(i10)))) != null) {
            ArrayList arrayList = u92.f22926e;
            org.telegram.messenger.xi d = u92.d(fjVar);
            if (d.f27908a != d.f27909b && (b10 = d.f27910c) == d.d && b10 != 0) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.xi xiVar = (org.telegram.messenger.xi) arrayList.get(i12);
                    if (xiVar != d) {
                        byte b11 = xiVar.f27910c;
                        byte b12 = d.f27910c;
                        if (b11 <= b12 && xiVar.d >= b12) {
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
        if (view instanceof org.telegram.ui.Cells.r1) {
            return !((org.telegram.ui.Cells.r1) view).getMessageObject().P3();
        }
        return false;
    }

    @Override
    public final int G() {
        if (this.S) {
            return (int) this.T.P9;
        }
        return 0;
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) this.T.P9;
        }
        return F();
    }

    @Override
    public final int K() {
        if (this.S) {
            return (int) ((this.f59256n - this.T.P9) - C());
        }
        return super.K();
    }

    @Override
    public final int X0() {
        return (int) this.T.P9;
    }

    @Override
    public final void b0(v4.x0 x0Var, v4.c1 c1Var) {
        boolean z10 = org.telegram.messenger.s2.f26749a;
        try {
            super.b0(x0Var, c1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.g3(new bh(this, 4));
        }
    }

    @Override
    public final void i1(int i7, int i10, boolean z10) {
        if (!z10) {
            i10 = (int) ((i10 - F()) + this.T.P9);
        }
        super.i1(i7, i10, z10);
    }

    @Override
    public final int j(v4.c1 c1Var) {
        this.S = true;
        int B0 = B0(c1Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int k(v4.c1 c1Var) {
        this.S = true;
        int C0 = C0(c1Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int l(v4.c1 c1Var) {
        this.S = true;
        int D0 = D0(c1Var);
        this.S = false;
        return D0;
    }

    @Override
    public final int o0(int r11, v4.x0 r12, v4.c1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ej.o0(int, v4.x0, v4.c1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        this.T.Pa = false;
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.f59105a = i7;
        w0(lVar);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
