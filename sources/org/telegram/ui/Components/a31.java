package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class a31 extends v4.s0 {
    public final int f31662a = 1;
    public int f31663b;
    public final Object f31664c;

    public a31(bi.g5 g5Var, int i7) {
        this.f31664c = g5Var;
        this.f31663b = i7;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.t8 t8Var;
        switch (this.f31662a) {
            case 0:
                if (i7 == 0) {
                    this.f31663b = 0;
                    return;
                }
                return;
            default:
                if (i7 == 1 && (t8Var = ((org.telegram.ui.Wallet.y5) ((bi.g5) this.f31664c).f3941c).f43376i0) != null) {
                    t8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f31662a) {
            case 0:
                d31 d31Var = (d31) this.f31664c;
                s31 s31Var = d31Var.f32766k1;
                this.f31663b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f31663b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = s31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = s31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && s31Var.c()) {
                    d31Var.l1 = s31Var.getContentTopOffset();
                    d31Var.f28615b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) ((bi.g5) this.f31664c).f3941c;
                if (this.f31663b == 0) {
                    y5Var.E0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.f4(y5Var, 14));
                    return;
                }
        }
    }

    public a31(d31 d31Var) {
        this.f31664c = d31Var;
    }
}
