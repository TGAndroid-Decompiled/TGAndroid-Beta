package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.PremiumPreviewFragment;
public final class ul0 implements oj0 {
    public final int f40374a;
    public final int f40375b;
    public final org.telegram.ui.ActionBar.h2 f40376c;
    public final Object d;

    public ul0(Object obj, int i7, org.telegram.ui.ActionBar.h2 h2Var, int i10) {
        this.f40374a = i10;
        this.d = obj;
        this.f40375b = i7;
        this.f40376c = h2Var;
    }

    @Override
    public final void c(int i7, View view) {
        ch.p0 p0Var;
        switch (this.f40374a) {
            case 0:
                cm0 cm0Var = (cm0) this.d;
                ArrayList arrayList = cm0Var.f34109r;
                di.b1 b1Var = cm0Var.d;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    if (!org.telegram.messenger.j10.i(this.f40375b).q()) {
                        new ug.z0(this.f40376c, 24, true).show();
                        return;
                    }
                    long j3 = ((zl0) arrayList.get(i7)).f42900a.h;
                    if (cm0Var.h == j3) {
                        p0Var = null;
                    } else {
                        p0Var = ((zl0) arrayList.get(i7)).f42900a;
                    }
                    if (cm0Var.f(p0Var)) {
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
                        if (cm0Var.h == j3) {
                            cm0Var.h = 0L;
                            return;
                        }
                        cm0Var.h = j3;
                        ((bm0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                ug.i1 i1Var = (ug.i1) this.d;
                if (view instanceof org.telegram.ui.js0) {
                    org.telegram.ui.js0 js0Var = (org.telegram.ui.js0) view;
                    PremiumPreviewFragment.v0(this.f40375b, js0Var.f49078f.f53518a);
                    i1Var.t(new ug.z0(this.f40376c, js0Var.f49078f.f53518a, false));
                    return;
                }
                return;
        }
    }
}
