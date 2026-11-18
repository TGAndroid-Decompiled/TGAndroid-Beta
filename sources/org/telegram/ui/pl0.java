package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class pl0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final int f50864a;
    public final lm0 f50865b;

    public pl0(lm0 lm0Var, int i7) {
        this.f50864a = i7;
        this.f50865b = lm0Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        lm0 lm0Var = this.f50865b;
        lm0Var.f49596c0 = I0;
        wl0 wl0Var = lm0Var.h.f47696b;
        int i7 = I0.f15889a;
        int paddingTop = wl0Var.getPaddingTop();
        i0.b bVar = lm0Var.f49596c0;
        wl0Var.setPadding(i7, paddingTop, bVar.f15891c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        wl0 wl0Var2 = lm0Var.f49601n.f47696b;
        int i10 = lm0Var.f49596c0.f15889a;
        int paddingTop2 = wl0Var2.getPaddingTop();
        i0.b bVar2 = lm0Var.f49596c0;
        wl0Var2.setPadding(i10, paddingTop2, bVar2.f15891c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = lm0Var.Q;
        i0.b bVar3 = lm0Var.f49596c0;
        frameLayout.setPadding(bVar3.f15889a, 0, bVar3.f15891c, bVar3.d);
        return r0.l1.f56257b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50864a) {
            case 1:
                this.f50865b.finishFragment();
                return;
            default:
                this.f50865b.D0();
                return;
        }
    }
}
