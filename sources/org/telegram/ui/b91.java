package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b91 extends v4.c0 {
    public boolean I;
    public final y91 J;

    public b91(y91 y91Var) {
        this.J = y91Var;
    }

    @Override
    public final void b0(v4.x0 x0Var, v4.c1 c1Var) {
        boolean z10 = org.telegram.messenger.s2.f26730a;
        try {
            super.b0(x0Var, c1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.g3(new ru0(this, 21));
        }
    }

    @Override
    public final void b1(View view, View view2, int i7, int i10) {
        this.I = true;
        super.b1(view, view2, i7, i10);
        this.I = false;
    }

    @Override
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.J.O.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    @Override
    public final int o0(int r19, v4.x0 r20, v4.c1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b91.o0(int, v4.x0, v4.c1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        if (this.J.f54148y > 0 && i7 == 1) {
            super.v0(recyclerView, c1Var, i7);
            return;
        }
        pi.l lVar = new pi.l(recyclerView.getContext(), 0);
        lVar.f59109a = i7;
        w0(lVar);
    }
}
