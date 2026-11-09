package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;
public final class il0 implements cj0 {
    public final int f34803a;
    public final int f34804b;
    public final org.telegram.ui.ActionBar.f2 f34805c;
    public final Object d;

    public il0(Object obj, int i7, org.telegram.ui.ActionBar.f2 f2Var, int i10) {
        this.f34803a = i10;
        this.d = obj;
        this.f34804b = i7;
        this.f34805c = f2Var;
    }

    @Override
    public final void c(int i7, View view) {
        ch.o0 o0Var;
        switch (this.f34803a) {
            case 0:
                rl0 rl0Var = (rl0) this.d;
                ArrayList arrayList = rl0Var.f37739r;
                bi.q1 q1Var = rl0Var.d;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    if (!org.telegram.messenger.p10.i(this.f34804b).q()) {
                        new ug.w0(this.f34805c, 24, true).show();
                        return;
                    }
                    long j3 = ((ol0) arrayList.get(i7)).f36742a.h;
                    if (rl0Var.h == j3) {
                        o0Var = null;
                    } else {
                        o0Var = ((ol0) arrayList.get(i7)).f36742a;
                    }
                    if (rl0Var.f(o0Var)) {
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
                        q1Var.M(new org.telegram.ui.gq(3));
                        if (rl0Var.h == j3) {
                            rl0Var.h = 0L;
                            return;
                        }
                        rl0Var.h = j3;
                        ((ql0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ug.f1 f1Var = (ug.f1) this.d;
                if (view instanceof org.telegram.ui.ks0) {
                    org.telegram.ui.ks0 ks0Var = (org.telegram.ui.ks0) view;
                    PremiumPreviewFragment.v0(this.f34804b, ks0Var.f47362f.f51756a);
                    f1Var.t(new ug.w0(this.f34805c, ks0Var.f47362f.f51756a, false));
                    return;
                }
                return;
        }
    }
}
