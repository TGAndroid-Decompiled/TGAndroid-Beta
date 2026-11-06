package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ll0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final int f47559a;
    public final hm0 f47560b;

    public ll0(hm0 hm0Var, int i7) {
        this.f47559a = i7;
        this.f47560b = hm0Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        hm0 hm0Var = this.f47560b;
        hm0Var.f46453b0 = I0;
        sl0 sl0Var = hm0Var.h.f44429b;
        int i7 = I0.f15117a;
        int paddingTop = sl0Var.getPaddingTop();
        i0.b bVar = hm0Var.f46453b0;
        sl0Var.setPadding(i7, paddingTop, bVar.f15119c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        sl0 sl0Var2 = hm0Var.f46459n.f44429b;
        int i10 = hm0Var.f46453b0.f15117a;
        int paddingTop2 = sl0Var2.getPaddingTop();
        i0.b bVar2 = hm0Var.f46453b0;
        sl0Var2.setPadding(i10, paddingTop2, bVar2.f15119c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = hm0Var.P;
        i0.b bVar3 = hm0Var.f46453b0;
        frameLayout.setPadding(bVar3.f15117a, 0, bVar3.f15119c, bVar3.d);
        return r0.k1.f54108b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47559a) {
            case 1:
                this.f47560b.finishFragment();
                return;
            default:
                this.f47560b.D0();
                return;
        }
    }
}
