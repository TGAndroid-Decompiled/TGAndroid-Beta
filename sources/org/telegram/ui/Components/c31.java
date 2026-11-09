package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class c31 extends v4.s0 {
    public final int f32517a = 1;
    public int f32518b;
    public final Object f32519c;

    public c31(bi.g5 g5Var, int i7) {
        this.f32519c = g5Var;
        this.f32518b = i7;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.r8 r8Var;
        switch (this.f32517a) {
            case 0:
                if (i7 == 0) {
                    this.f32518b = 0;
                    return;
                }
                return;
            default:
                if (i7 == 1 && (r8Var = ((org.telegram.ui.Wallet.w5) ((bi.g5) this.f32519c).f3941c).f43259i0) != null) {
                    r8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f32517a) {
            case 0:
                f31 f31Var = (f31) this.f32519c;
                u31 u31Var = f31Var.f33574k1;
                this.f32518b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f32518b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = u31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = u31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && u31Var.c()) {
                    f31Var.l1 = u31Var.getContentTopOffset();
                    f31Var.f28624b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) ((bi.g5) this.f32519c).f3941c;
                if (this.f32518b == 0) {
                    w5Var.E0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.d4(w5Var, 14));
                    return;
                }
        }
    }

    public c31(f31 f31Var) {
        this.f32519c = f31Var;
    }
}
