package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class on0 implements ml0 {
    public final int f27160a;
    public final int f27161b;
    public final org.telegram.ui.ActionBar.n2 f27162c;
    public final Object d;

    public on0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.f27160a = i11;
        this.d = obj;
        this.f27161b = i10;
        this.f27162c = n2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.p0 p0Var;
        switch (this.f27160a) {
            case 0:
                wn0 wn0Var = (wn0) this.d;
                ArrayList arrayList = wn0Var.f30079r;
                ai.w0 w0Var = wn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f27161b).isPremium()) {
                        new rg.x0(this.f27162c, 24, true).show();
                        return;
                    }
                    long j3 = ((tn0) arrayList.get(i10)).f28501a.h;
                    if (wn0Var.h == j3) {
                        p0Var = null;
                    } else {
                        p0Var = ((tn0) arrayList.get(i10)).f28501a;
                    }
                    if (wn0Var.f(p0Var)) {
                        for (int i11 = 0; i11 < w0Var.getChildCount(); i11++) {
                            if (w0Var.getChildAt(i11) == view) {
                                float f7 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f7 = 90.0f;
                                    }
                                    w0Var.w0(-AndroidUtilities.dp(f7), 0, null);
                                } else if (i11 >= w0Var.getChildCount() - 2) {
                                    if (i11 == w0Var.getChildCount() - 1) {
                                        f7 = 80.0f;
                                    }
                                    w0Var.w0(AndroidUtilities.dp(f7), 0, null);
                                }
                            }
                        }
                        w0Var.N(new org.telegram.ui.ir(3));
                        if (wn0Var.h == j3) {
                            wn0Var.h = 0L;
                            return;
                        }
                        wn0Var.h = j3;
                        ((vn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.k1 k1Var = (rg.k1) this.d;
                if (view instanceof org.telegram.ui.uw0) {
                    org.telegram.ui.uw0 uw0Var = (org.telegram.ui.uw0) view;
                    PremiumPreviewFragment.q0(this.f27161b, uw0Var.f38246f.f35278a);
                    k1Var.showDialog(new rg.x0(this.f27162c, uw0Var.f38246f.f35278a, false));
                    return;
                }
                return;
        }
    }
}
