package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b31 extends v4.s0 {
    public final int f32109a = 1;
    public int f32110b;
    public final Object f32111c;

    public b31(bi.g5 g5Var, int i7) {
        this.f32111c = g5Var;
        this.f32110b = i7;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.u8 u8Var;
        switch (this.f32109a) {
            case 0:
                if (i7 == 0) {
                    this.f32110b = 0;
                    return;
                }
                return;
            default:
                if (i7 == 1 && (u8Var = ((org.telegram.ui.Wallet.z5) ((bi.g5) this.f32111c).f3938c).f43454i0) != null) {
                    u8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f32109a) {
            case 0:
                e31 e31Var = (e31) this.f32111c;
                t31 t31Var = e31Var.n1;
                this.f32110b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f32110b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = t31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = t31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && t31Var.c()) {
                    e31Var.f33153o1 = t31Var.getContentTopOffset();
                    e31Var.f28672b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) ((bi.g5) this.f32111c).f3938c;
                if (this.f32110b == 0) {
                    z5Var.E0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.f4(z5Var, 14));
                    return;
                }
        }
    }

    public b31(e31 e31Var) {
        this.f32111c = e31Var;
    }
}
