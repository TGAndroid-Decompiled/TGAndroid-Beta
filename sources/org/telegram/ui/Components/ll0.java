package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;
public final class ll0 implements fj0 {
    public final int f35788a;
    public final int f35789b;
    public final org.telegram.ui.ActionBar.d2 f35790c;
    public final Object d;

    public ll0(Object obj, int i3, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f35788a = i10;
        this.d = obj;
        this.f35789b = i3;
        this.f35790c = d2Var;
    }

    @Override
    public final void f(int i3, View view) {
        dh.n0 n0Var;
        switch (this.f35788a) {
            case 0:
                tl0 tl0Var = (tl0) this.d;
                ArrayList arrayList = tl0Var.f38491r;
                ci.j1 j1Var = tl0Var.d;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    if (!org.telegram.messenger.h10.i(this.f35789b).q()) {
                        new vg.v0(this.f35790c, 24, true).show();
                        return;
                    }
                    long j10 = ((ql0) arrayList.get(i3)).f37490a.h;
                    if (tl0Var.h == j10) {
                        n0Var = null;
                    } else {
                        n0Var = ((ql0) arrayList.get(i3)).f37490a;
                    }
                    if (tl0Var.f(n0Var)) {
                        for (int i10 = 0; i10 < j1Var.getChildCount(); i10++) {
                            if (j1Var.getChildAt(i10) == view) {
                                float f10 = 50.0f;
                                if (i10 <= 1) {
                                    if (i10 == 0) {
                                        f10 = 90.0f;
                                    }
                                    j1Var.w0(-org.telegram.messenger.g0.L(f10), 0, null);
                                } else if (i10 >= j1Var.getChildCount() - 2) {
                                    if (i10 == j1Var.getChildCount() - 1) {
                                        f10 = 80.0f;
                                    }
                                    j1Var.w0(org.telegram.messenger.g0.L(f10), 0, null);
                                }
                            }
                        }
                        j1Var.M(new org.telegram.ui.cq(3));
                        if (tl0Var.h == j10) {
                            tl0Var.h = 0L;
                            return;
                        }
                        tl0Var.h = j10;
                        ((sl0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                vg.h1 h1Var = (vg.h1) this.d;
                if (view instanceof org.telegram.ui.yr0) {
                    org.telegram.ui.yr0 yr0Var = (org.telegram.ui.yr0) view;
                    PremiumPreviewFragment.v0(this.f35789b, yr0Var.f52390f.f47430a);
                    h1Var.t(new vg.v0(this.f35790c, yr0Var.f52390f.f47430a, false));
                    return;
                }
                return;
        }
    }
}
