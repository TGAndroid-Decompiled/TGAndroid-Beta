package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;
public final class wl0 implements qj0 {
    public final int f41841a;
    public final int f41842b;
    public final org.telegram.ui.ActionBar.g2 f41843c;
    public final Object d;

    public wl0(Object obj, int i7, org.telegram.ui.ActionBar.g2 g2Var, int i10) {
        this.f41841a = i10;
        this.d = obj;
        this.f41842b = i7;
        this.f41843c = g2Var;
    }

    @Override
    public final void c(int i7, View view) {
        ch.p0 p0Var;
        switch (this.f41841a) {
            case 0:
                em0 em0Var = (em0) this.d;
                ArrayList arrayList = em0Var.f34908r;
                di.b1 b1Var = em0Var.d;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    if (!org.telegram.messenger.k10.i(this.f41842b).q()) {
                        new ug.y0(this.f41843c, 24, true).show();
                        return;
                    }
                    long j3 = ((bm0) arrayList.get(i7)).f33856a.h;
                    if (em0Var.h == j3) {
                        p0Var = null;
                    } else {
                        p0Var = ((bm0) arrayList.get(i7)).f33856a;
                    }
                    if (em0Var.f(p0Var)) {
                        for (int i10 = 0; i10 < b1Var.getChildCount(); i10++) {
                            if (b1Var.getChildAt(i10) == view) {
                                float f10 = 50.0f;
                                if (i10 <= 1) {
                                    if (i10 == 0) {
                                        f10 = 90.0f;
                                    }
                                    b1Var.w0(-org.telegram.messenger.g0.L(f10), 0, null);
                                } else if (i10 >= b1Var.getChildCount() - 2) {
                                    if (i10 == b1Var.getChildCount() - 1) {
                                        f10 = 80.0f;
                                    }
                                    b1Var.w0(org.telegram.messenger.g0.L(f10), 0, null);
                                }
                            }
                        }
                        b1Var.M(new org.telegram.ui.hq(3));
                        if (em0Var.h == j3) {
                            em0Var.h = 0L;
                            return;
                        }
                        em0Var.h = j3;
                        ((dm0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ug.h1 h1Var = (ug.h1) this.d;
                if (view instanceof org.telegram.ui.js0) {
                    org.telegram.ui.js0 js0Var = (org.telegram.ui.js0) view;
                    PremiumPreviewFragment.v0(this.f41842b, js0Var.f49092f.f53519a);
                    h1Var.t(new ug.y0(this.f41843c, js0Var.f49092f.f53519a, false));
                    return;
                }
                return;
        }
    }
}
