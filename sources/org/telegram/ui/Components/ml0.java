package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;
public final class ml0 implements gj0 {
    public final int f37319a;
    public final int f37320b;
    public final org.telegram.ui.ActionBar.e2 f37321c;
    public final Object d;

    public ml0(Object obj, int i7, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f37319a = i10;
        this.d = obj;
        this.f37320b = i7;
        this.f37321c = e2Var;
    }

    @Override
    public final void b(int i7, View view) {
        ch.p0 p0Var;
        switch (this.f37319a) {
            case 0:
                ul0 ul0Var = (ul0) this.d;
                ArrayList arrayList = ul0Var.f40102r;
                di.c1 c1Var = ul0Var.d;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    if (!org.telegram.messenger.m10.i(this.f37320b).q()) {
                        new ug.x0(this.f37321c, 24, true).show();
                        return;
                    }
                    long j3 = ((rl0) arrayList.get(i7)).f38995a.h;
                    if (ul0Var.h == j3) {
                        p0Var = null;
                    } else {
                        p0Var = ((rl0) arrayList.get(i7)).f38995a;
                    }
                    if (ul0Var.f(p0Var)) {
                        for (int i10 = 0; i10 < c1Var.getChildCount(); i10++) {
                            if (c1Var.getChildAt(i10) == view) {
                                float f10 = 50.0f;
                                if (i10 <= 1) {
                                    if (i10 == 0) {
                                        f10 = 90.0f;
                                    }
                                    c1Var.w0(-org.telegram.messenger.g0.L(f10), 0, null);
                                } else if (i10 >= c1Var.getChildCount() - 2) {
                                    if (i10 == c1Var.getChildCount() - 1) {
                                        f10 = 80.0f;
                                    }
                                    c1Var.w0(org.telegram.messenger.g0.L(f10), 0, null);
                                }
                            }
                        }
                        c1Var.M(new org.telegram.ui.gq(3));
                        if (ul0Var.h == j3) {
                            ul0Var.h = 0L;
                            return;
                        }
                        ul0Var.h = j3;
                        ((tl0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ug.g1 g1Var = (ug.g1) this.d;
                if (view instanceof org.telegram.ui.fs0) {
                    org.telegram.ui.fs0 fs0Var = (org.telegram.ui.fs0) view;
                    PremiumPreviewFragment.v0(this.f37320b, fs0Var.f47180f.f51269a);
                    g1Var.t(new ug.x0(this.f37321c, fs0Var.f47180f.f51269a, false));
                    return;
                }
                return;
        }
    }
}
