package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;
public final class hl0 implements bj0 {
    public final int f34354a;
    public final int f34355b;
    public final org.telegram.ui.ActionBar.f2 f34356c;
    public final Object d;

    public hl0(Object obj, int i7, org.telegram.ui.ActionBar.f2 f2Var, int i10) {
        this.f34354a = i10;
        this.d = obj;
        this.f34355b = i7;
        this.f34356c = f2Var;
    }

    @Override
    public final void c(int i7, View view) {
        ch.o0 o0Var;
        switch (this.f34354a) {
            case 0:
                ql0 ql0Var = (ql0) this.d;
                ArrayList arrayList = ql0Var.f37333r;
                bi.q1 q1Var = ql0Var.d;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    if (!org.telegram.messenger.p10.i(this.f34355b).q()) {
                        new ug.w0(this.f34356c, 24, true).show();
                        return;
                    }
                    long j3 = ((nl0) arrayList.get(i7)).f36368a.h;
                    if (ql0Var.h == j3) {
                        o0Var = null;
                    } else {
                        o0Var = ((nl0) arrayList.get(i7)).f36368a;
                    }
                    if (ql0Var.f(o0Var)) {
                        for (int i10 = 0; i10 < q1Var.getChildCount(); i10++) {
                            if (q1Var.getChildAt(i10) == view) {
                                float f10 = 50.0f;
                                if (i10 <= 1) {
                                    if (i10 == 0) {
                                        f10 = 90.0f;
                                    }
                                    q1Var.w0(-org.telegram.messenger.g0.L(f10), 0, null);
                                } else if (i10 >= q1Var.getChildCount() - 2) {
                                    if (i10 == q1Var.getChildCount() - 1) {
                                        f10 = 80.0f;
                                    }
                                    q1Var.w0(org.telegram.messenger.g0.L(f10), 0, null);
                                }
                            }
                        }
                        q1Var.M(new org.telegram.ui.eq(3));
                        if (ql0Var.h == j3) {
                            ql0Var.h = 0L;
                            return;
                        }
                        ql0Var.h = j3;
                        ((pl0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ug.f1 f1Var = (ug.f1) this.d;
                if (view instanceof org.telegram.ui.is0) {
                    org.telegram.ui.is0 is0Var = (org.telegram.ui.is0) view;
                    PremiumPreviewFragment.v0(this.f34355b, is0Var.f46738f.f50822a);
                    f1Var.t(new ug.w0(this.f34356c, is0Var.f46738f.f50822a, false));
                    return;
                }
                return;
        }
    }
}
