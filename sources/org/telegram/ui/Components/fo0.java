package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class fo0 implements em0 {
    public final int f26443a;
    public final int f26444b;
    public final org.telegram.ui.ActionBar.n2 f26445c;
    public final Object d;

    public fo0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.f26443a = i11;
        this.d = obj;
        this.f26444b = i10;
        this.f26445c = n2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.n0 n0Var;
        switch (this.f26443a) {
            case 0:
                no0 no0Var = (no0) this.d;
                ArrayList arrayList = no0Var.f29225r;
                ai.w0 w0Var = no0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f26444b).isPremium()) {
                        new rg.y0(this.f26445c, 24, true).show();
                        return;
                    }
                    long j3 = ((ko0) arrayList.get(i10)).f28115a.h;
                    if (no0Var.h == j3) {
                        n0Var = null;
                    } else {
                        n0Var = ((ko0) arrayList.get(i10)).f28115a;
                    }
                    if (no0Var.f(n0Var)) {
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
                        if (no0Var.h == j3) {
                            no0Var.h = 0L;
                            return;
                        }
                        no0Var.h = j3;
                        ((mo0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.l1 l1Var = (rg.l1) this.d;
                if (view instanceof org.telegram.ui.uw0) {
                    org.telegram.ui.uw0 uw0Var = (org.telegram.ui.uw0) view;
                    PremiumPreviewFragment.r0(this.f26444b, uw0Var.f42573f.f39363a);
                    l1Var.showDialog(new rg.y0(this.f26445c, uw0Var.f42573f.f39363a, false));
                    return;
                }
                return;
        }
    }
}
