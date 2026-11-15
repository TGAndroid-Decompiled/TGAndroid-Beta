package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class al extends v4.t0 {
    public final int f33007a;
    public final dl f33008b;

    public al(dl dlVar, int i7) {
        this.f33007a = i7;
        this.f33008b = dlVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        cj0 cj0Var;
        switch (this.f33007a) {
            case 0:
                dl dlVar = this.f33008b;
                di.c1 c1Var = dlVar.M;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dlVar.I = z10;
                if (!z10 && dlVar.G != null) {
                    dlVar.G = null;
                }
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    ki kiVar = dlVar.f33607b;
                    int i10 = kiVar.f29716t0;
                    if (((kiVar.Z3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var = (cj0) c1Var.K(0)) != null) {
                        View view = cj0Var.f58535a;
                        if (view.getTop() > 0) {
                            c1Var.w0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    dl dlVar2 = this.f33008b;
                    if (dlVar2.f33977d0 && dlVar2.f33978e0) {
                        org.telegram.messenger.g0.v1(dlVar2.f33607b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f33007a) {
            case 0:
                dl dlVar = this.f33008b;
                dlVar.i0();
                if (dlVar.G != null) {
                    dlVar.H += i10;
                }
                dlVar.f33607b.M1(dlVar, i10);
                return;
            default:
                return;
        }
    }
}
