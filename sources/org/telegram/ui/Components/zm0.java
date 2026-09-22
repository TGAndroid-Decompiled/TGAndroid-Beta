package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class zm0 implements zk0 {
    public final int f30616a;
    public final int f30617b;
    public final org.telegram.ui.ActionBar.n2 f30618c;
    public final Object d;

    public zm0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.f30616a = i11;
        this.d = obj;
        this.f30617b = i10;
        this.f30618c = n2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.p0 p0Var;
        switch (this.f30616a) {
            case 0:
                hn0 hn0Var = (hn0) this.d;
                ArrayList arrayList = hn0Var.f24733r;
                ai.w0 w0Var = hn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f30617b).isPremium()) {
                        new rg.x0(this.f30618c, 24, true).show();
                        return;
                    }
                    long j3 = ((en0) arrayList.get(i10)).f23695a.h;
                    if (hn0Var.h == j3) {
                        p0Var = null;
                    } else {
                        p0Var = ((en0) arrayList.get(i10)).f23695a;
                    }
                    if (hn0Var.f(p0Var)) {
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
                        w0Var.M(new org.telegram.ui.kr(3));
                        if (hn0Var.h == j3) {
                            hn0Var.h = 0L;
                            return;
                        }
                        hn0Var.h = j3;
                        ((gn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.k1 k1Var = (rg.k1) this.d;
                if (view instanceof org.telegram.ui.uw0) {
                    org.telegram.ui.uw0 uw0Var = (org.telegram.ui.uw0) view;
                    PremiumPreviewFragment.q0(this.f30617b, uw0Var.f38189f.f35277a);
                    k1Var.showDialog(new rg.x0(this.f30618c, uw0Var.f38189f.f35277a, false));
                    return;
                }
                return;
        }
    }
}
