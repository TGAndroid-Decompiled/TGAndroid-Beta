package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class rk extends u4.t0 {
    public final int f37744a;
    public final uk f37745b;

    public rk(uk ukVar, int i3) {
        this.f37744a = i3;
        this.f37745b = ukVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        boolean z10;
        bj0 bj0Var;
        switch (this.f37744a) {
            case 0:
                uk ukVar = this.f37745b;
                ci.j1 j1Var = ukVar.M;
                if (i3 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ukVar.I = z10;
                if (!z10 && ukVar.G != null) {
                    ukVar.G = null;
                }
                if (i3 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    bi biVar = ukVar.f38416b;
                    int i10 = biVar.f28617t0;
                    if (((biVar.W3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var = (bj0) j1Var.K(0)) != null) {
                        View view = bj0Var.f55540a;
                        if (view.getTop() > 0) {
                            j1Var.w0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i3 == 1) {
                    uk ukVar2 = this.f37745b;
                    if (ukVar2.f38783d0 && ukVar2.f38784e0) {
                        org.telegram.messenger.g0.v1(ukVar2.f38416b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.f37744a) {
            case 0:
                uk ukVar = this.f37745b;
                ukVar.i0();
                if (ukVar.G != null) {
                    ukVar.H += i10;
                }
                ukVar.f38416b.M1(ukVar, i10);
                return;
            default:
                return;
        }
    }
}
