package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class q81 extends u4.b0 {
    public boolean I;
    public final m91 J;

    public q81(m91 m91Var) {
        this.J = m91Var;
    }

    @Override
    public final void b0(tf.e eVar, u4.a1 a1Var) {
        boolean z10 = org.telegram.messenger.r2.f25040a;
        try {
            super.b0(eVar, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new pu0(this, 20));
        }
    }

    @Override
    public final void b1(View view, View view2, int i3, int i10) {
        this.I = true;
        super.b1(view, view2, i3, i10);
        this.I = false;
    }

    @Override
    public final void h1(int i3, int i10) {
        if (this.I) {
            i10 -= this.J.O.getPaddingTop();
        }
        super.h1(i3, i10);
    }

    @Override
    public final int o0(int r19, tf.e r20, u4.a1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q81.o0(int, tf.e, u4.a1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        if (this.J.f47623y > 0 && i3 == 1) {
            super.v0(recyclerView, a1Var, i3);
            return;
        }
        ni.m mVar = new ni.m(recyclerView.getContext(), 0);
        mVar.f55704a = i3;
        w0(mVar);
    }
}
