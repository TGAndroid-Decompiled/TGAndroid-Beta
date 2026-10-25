package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class go0 implements zl0 {
    public final int f28659a;
    public final int f28660b;
    public final org.telegram.ui.ActionBar.r2 f28661c;
    public final Object d;

    public go0(Object obj, int i10, org.telegram.ui.ActionBar.r2 r2Var, int i11) {
        this.f28659a = i11;
        this.d = obj;
        this.f28660b = i10;
        this.f28661c = r2Var;
    }

    @Override
    public final void c(int i10, View view) {
        bh.x0 x0Var;
        switch (this.f28659a) {
            case 0:
                oo0 oo0Var = (oo0) this.d;
                ArrayList arrayList = oo0Var.f31339r;
                bi.r1 r1Var = oo0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f28660b).isPremium()) {
                        new tg.y0(this.f28661c, 24, true).show();
                        return;
                    }
                    long j10 = ((lo0) arrayList.get(i10)).f30233a.h;
                    if (oo0Var.h == j10) {
                        x0Var = null;
                    } else {
                        x0Var = ((lo0) arrayList.get(i10)).f30233a;
                    }
                    if (oo0Var.f(x0Var)) {
                        for (int i11 = 0; i11 < r1Var.getChildCount(); i11++) {
                            if (r1Var.getChildAt(i11) == view) {
                                float f7 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f7 = 90.0f;
                                    }
                                    r1Var.w0(-AndroidUtilities.dp(f7), 0, null);
                                } else if (i11 >= r1Var.getChildCount() - 2) {
                                    if (i11 == r1Var.getChildCount() - 1) {
                                        f7 = 80.0f;
                                    }
                                    r1Var.w0(AndroidUtilities.dp(f7), 0, null);
                                }
                            }
                        }
                        r1Var.M(new org.telegram.ui.ar(3));
                        if (oo0Var.h == j10) {
                            oo0Var.h = 0L;
                            return;
                        }
                        oo0Var.h = j10;
                        ((no0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.m1 m1Var = (tg.m1) this.d;
                if (view instanceof org.telegram.ui.gw0) {
                    org.telegram.ui.gw0 gw0Var = (org.telegram.ui.gw0) view;
                    PremiumPreviewFragment.r0(this.f28660b, gw0Var.f39791f.f45563a);
                    m1Var.showDialog(new tg.y0(this.f28661c, gw0Var.f39791f.f45563a, false));
                    return;
                }
                return;
        }
    }
}
