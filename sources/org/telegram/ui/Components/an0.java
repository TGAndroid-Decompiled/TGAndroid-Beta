package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class an0 implements al0 {
    public final int f22476a;
    public final int f22477b;
    public final org.telegram.ui.ActionBar.n2 f22478c;
    public final Object d;

    public an0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.f22476a = i11;
        this.d = obj;
        this.f22477b = i10;
        this.f22478c = n2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.p0 p0Var;
        switch (this.f22476a) {
            case 0:
                in0 in0Var = (in0) this.d;
                ArrayList arrayList = in0Var.f25009r;
                ai.w0 w0Var = in0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f22477b).isPremium()) {
                        new rg.x0(this.f22478c, 24, true).show();
                        return;
                    }
                    long j3 = ((fn0) arrayList.get(i10)).f24013a.h;
                    if (in0Var.h == j3) {
                        p0Var = null;
                    } else {
                        p0Var = ((fn0) arrayList.get(i10)).f24013a;
                    }
                    if (in0Var.f(p0Var)) {
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
                        w0Var.M(new org.telegram.ui.gr(3));
                        if (in0Var.h == j3) {
                            in0Var.h = 0L;
                            return;
                        }
                        in0Var.h = j3;
                        ((hn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.k1 k1Var = (rg.k1) this.d;
                if (view instanceof org.telegram.ui.nw0) {
                    org.telegram.ui.nw0 nw0Var = (org.telegram.ui.nw0) view;
                    PremiumPreviewFragment.q0(this.f22477b, nw0Var.f35618f.f32736a);
                    k1Var.showDialog(new rg.x0(this.f22478c, nw0Var.f35618f.f32736a, false));
                    return;
                }
                return;
        }
    }
}
