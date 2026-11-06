package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tk extends v4.s0 {
    public final int f38368a;
    public final wk f38369b;

    public tk(wk wkVar, int i7) {
        this.f38368a = i7;
        this.f38369b = wkVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z9;
        xi0 xi0Var;
        switch (this.f38368a) {
            case 0:
                wk wkVar = this.f38369b;
                bi.q1 q1Var = wkVar.L;
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                wkVar.H = z9;
                if (!z9 && wkVar.F != null) {
                    wkVar.F = null;
                }
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    di diVar = wkVar.f38951b;
                    int i10 = diVar.f28644s0;
                    if (((diVar.V3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (xi0Var = (xi0) q1Var.K(0)) != null) {
                        View view = xi0Var.f56927a;
                        if (view.getTop() > 0) {
                            q1Var.w0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    wk wkVar2 = this.f38369b;
                    if (wkVar2.f39982c0 && wkVar2.f39983d0) {
                        org.telegram.messenger.g0.v1(wkVar2.f38951b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f38368a) {
            case 0:
                wk wkVar = this.f38369b;
                wkVar.i0();
                if (wkVar.F != null) {
                    wkVar.G += i10;
                }
                wkVar.f38951b.M1(wkVar, i10);
                return;
            default:
                return;
        }
    }
}
