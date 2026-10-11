package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class go0 implements fm0 {
    public final int f26842a;
    public final int f26843b;
    public final org.telegram.ui.ActionBar.m2 f26844c;
    public final Object d;

    public go0(Object obj, int i10, org.telegram.ui.ActionBar.m2 m2Var, int i11) {
        this.f26842a = i11;
        this.d = obj;
        this.f26843b = i10;
        this.f26844c = m2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.n0 n0Var;
        switch (this.f26842a) {
            case 0:
                oo0 oo0Var = (oo0) this.d;
                ArrayList arrayList = oo0Var.f29571r;
                ai.w0 w0Var = oo0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f26843b).isPremium()) {
                        new rg.y0(this.f26844c, 24, true).show();
                        return;
                    }
                    long j3 = ((lo0) arrayList.get(i10)).f28552a.h;
                    if (oo0Var.h == j3) {
                        n0Var = null;
                    } else {
                        n0Var = ((lo0) arrayList.get(i10)).f28552a;
                    }
                    if (oo0Var.f(n0Var)) {
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
                        w0Var.M(new org.telegram.ui.ir(3));
                        if (oo0Var.h == j3) {
                            oo0Var.h = 0L;
                            return;
                        }
                        oo0Var.h = j3;
                        ((no0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.l1 l1Var = (rg.l1) this.d;
                if (view instanceof org.telegram.ui.tw0) {
                    org.telegram.ui.tw0 tw0Var = (org.telegram.ui.tw0) view;
                    PremiumPreviewFragment.q0(this.f26843b, tw0Var.f42319f.f39171a);
                    l1Var.showDialog(new rg.y0(this.f26844c, tw0Var.f42319f.f39171a, false));
                    return;
                }
                return;
        }
    }
}
