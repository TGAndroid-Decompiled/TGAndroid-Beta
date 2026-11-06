package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b31 extends v4.s0 {
    public final int f32009a = 1;
    public int f32010b;
    public final Object f32011c;

    public b31(bi.g5 g5Var, int i7) {
        this.f32011c = g5Var;
        this.f32010b = i7;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.t8 t8Var;
        switch (this.f32009a) {
            case 0:
                if (i7 == 0) {
                    this.f32010b = 0;
                    return;
                }
                return;
            default:
                if (i7 == 1 && (t8Var = ((org.telegram.ui.Wallet.y5) ((bi.g5) this.f32011c).f3941c).f43375i0) != null) {
                    t8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f32009a) {
            case 0:
                e31 e31Var = (e31) this.f32011c;
                t31 t31Var = e31Var.f33161k1;
                this.f32010b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f32010b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = t31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = t31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && t31Var.c()) {
                    e31Var.l1 = t31Var.getContentTopOffset();
                    e31Var.f28616b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) ((bi.g5) this.f32011c).f3941c;
                if (this.f32010b == 0) {
                    y5Var.E0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.f4(y5Var, 14));
                    return;
                }
        }
    }

    public b31(e31 e31Var) {
        this.f32011c = e31Var;
    }
}
