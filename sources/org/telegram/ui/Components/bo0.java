package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class bo0 implements am0 {
    public final int f23528a;
    public final int f23529b;
    public final org.telegram.ui.ActionBar.m2 f23530c;
    public final Object d;

    public bo0(Object obj, int i10, org.telegram.ui.ActionBar.m2 m2Var, int i11) {
        this.f23528a = i11;
        this.d = obj;
        this.f23529b = i10;
        this.f23530c = m2Var;
    }

    @Override
    public final void a(int i10, View view) {
        ah.i1 i1Var;
        switch (this.f23528a) {
            case 0:
                ko0 ko0Var = (ko0) this.d;
                ArrayList arrayList = ko0Var.f26454r;
                bi.o0 o0Var = ko0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f23529b).isPremium()) {
                        new sg.y0(this.f23530c, 24, true).show();
                        return;
                    }
                    long j10 = ((ho0) arrayList.get(i10)).f25367a.h;
                    if (ko0Var.h == j10) {
                        i1Var = null;
                    } else {
                        i1Var = ((ho0) arrayList.get(i10)).f25367a;
                    }
                    if (ko0Var.f(i1Var)) {
                        for (int i11 = 0; i11 < o0Var.getChildCount(); i11++) {
                            if (o0Var.getChildAt(i11) == view) {
                                float f7 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f7 = 90.0f;
                                    }
                                    o0Var.v0(-AndroidUtilities.dp(f7), 0, null);
                                } else if (i11 >= o0Var.getChildCount() - 2) {
                                    if (i11 == o0Var.getChildCount() - 1) {
                                        f7 = 80.0f;
                                    }
                                    o0Var.v0(AndroidUtilities.dp(f7), 0, null);
                                }
                            }
                        }
                        o0Var.M(new org.telegram.ui.or(3));
                        if (ko0Var.h == j10) {
                            ko0Var.h = 0L;
                            return;
                        }
                        ko0Var.h = j10;
                        ((jo0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.m1 m1Var = (sg.m1) this.d;
                if (view instanceof org.telegram.ui.ax0) {
                    org.telegram.ui.ax0 ax0Var = (org.telegram.ui.ax0) view;
                    PremiumPreviewFragment.q0(this.f23529b, ax0Var.f34115f.f39234a);
                    m1Var.showDialog(new sg.y0(this.f23530c, ax0Var.f34115f.f39234a, false));
                    return;
                }
                return;
        }
    }
}
