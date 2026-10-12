package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class lo0 implements km0 {
    public final int f28242a;
    public final int f28243b;
    public final org.telegram.ui.ActionBar.m2 f28244c;
    public final Object d;

    public lo0(Object obj, int i10, org.telegram.ui.ActionBar.m2 m2Var, int i11) {
        this.f28242a = i11;
        this.d = obj;
        this.f28243b = i10;
        this.f28244c = m2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.n0 n0Var;
        switch (this.f28242a) {
            case 0:
                to0 to0Var = (to0) this.d;
                ArrayList arrayList = to0Var.f30913r;
                ai.w0 w0Var = to0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f28243b).isPremium()) {
                        new rg.y0(this.f28244c, 24, true).show();
                        return;
                    }
                    long j3 = ((qo0) arrayList.get(i10)).f29875a.h;
                    if (to0Var.h == j3) {
                        n0Var = null;
                    } else {
                        n0Var = ((qo0) arrayList.get(i10)).f29875a;
                    }
                    if (to0Var.f(n0Var)) {
                        for (int i11 = 0; i11 < w0Var.getChildCount(); i11++) {
                            if (w0Var.getChildAt(i11) == view) {
                                float f7 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f7 = 90.0f;
                                    }
                                    w0Var.v0(-AndroidUtilities.dp(f7), 0, null);
                                } else if (i11 >= w0Var.getChildCount() - 2) {
                                    if (i11 == w0Var.getChildCount() - 1) {
                                        f7 = 80.0f;
                                    }
                                    w0Var.v0(AndroidUtilities.dp(f7), 0, null);
                                }
                            }
                        }
                        w0Var.M(new org.telegram.ui.lr(3));
                        if (to0Var.h == j3) {
                            to0Var.h = 0L;
                            return;
                        }
                        to0Var.h = j3;
                        ((so0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.l1 l1Var = (rg.l1) this.d;
                if (view instanceof org.telegram.ui.ww0) {
                    org.telegram.ui.ww0 ww0Var = (org.telegram.ui.ww0) view;
                    PremiumPreviewFragment.q0(this.f28243b, ww0Var.f43691f.f40146a);
                    l1Var.showDialog(new rg.y0(this.f28244c, ww0Var.f43691f.f40146a, false));
                    return;
                }
                return;
        }
    }
}
