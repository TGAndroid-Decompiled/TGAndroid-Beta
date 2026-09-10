package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class jn0 implements jl0 {
    public final int f24450a;
    public final int f24451b;
    public final org.telegram.ui.ActionBar.p2 f24452c;
    public final Object d;

    public jn0(Object obj, int i10, org.telegram.ui.ActionBar.p2 p2Var, int i11) {
        this.f24450a = i11;
        this.d = obj;
        this.f24451b = i10;
        this.f24452c = p2Var;
    }

    @Override
    public final void d(int i10, View view) {
        yg.p0 p0Var;
        switch (this.f24450a) {
            case 0:
                rn0 rn0Var = (rn0) this.d;
                ArrayList arrayList = rn0Var.f26702r;
                bi.y1 y1Var = rn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f24451b).isPremium()) {
                        new qg.a1(this.f24452c, 24, true).show();
                        return;
                    }
                    long j3 = ((on0) arrayList.get(i10)).f25845a.h;
                    if (rn0Var.h == j3) {
                        p0Var = null;
                    } else {
                        p0Var = ((on0) arrayList.get(i10)).f25845a;
                    }
                    if (rn0Var.f(p0Var)) {
                        for (int i11 = 0; i11 < y1Var.getChildCount(); i11++) {
                            if (y1Var.getChildAt(i11) == view) {
                                float f7 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f7 = 90.0f;
                                    }
                                    y1Var.v0(-AndroidUtilities.dp(f7), 0, null);
                                } else if (i11 >= y1Var.getChildCount() - 2) {
                                    if (i11 == y1Var.getChildCount() - 1) {
                                        f7 = 80.0f;
                                    }
                                    y1Var.v0(AndroidUtilities.dp(f7), 0, null);
                                }
                            }
                        }
                        y1Var.M(new org.telegram.ui.mr(3));
                        if (rn0Var.h == j3) {
                            rn0Var.h = 0L;
                            return;
                        }
                        rn0Var.h = j3;
                        ((qn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                qg.m1 m1Var = (qg.m1) this.d;
                if (view instanceof org.telegram.ui.ww0) {
                    org.telegram.ui.ww0 ww0Var = (org.telegram.ui.ww0) view;
                    PremiumPreviewFragment.q0(this.f24451b, ww0Var.f38399f.f35073a);
                    m1Var.showDialog(new qg.a1(this.f24452c, ww0Var.f38399f.f35073a, false));
                    return;
                }
                return;
        }
    }
}
