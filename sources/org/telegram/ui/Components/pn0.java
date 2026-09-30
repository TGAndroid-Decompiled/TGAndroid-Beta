package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class pn0 implements nl0 {
    public final int f27410a;
    public final int f27411b;
    public final org.telegram.ui.ActionBar.m2 f27412c;
    public final Object d;

    public pn0(Object obj, int i10, org.telegram.ui.ActionBar.m2 m2Var, int i11) {
        this.f27410a = i11;
        this.d = obj;
        this.f27411b = i10;
        this.f27412c = m2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.o0 o0Var;
        switch (this.f27410a) {
            case 0:
                xn0 xn0Var = (xn0) this.d;
                ArrayList arrayList = xn0Var.f30431r;
                ai.w0 w0Var = xn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f27411b).isPremium()) {
                        new rg.x0(this.f27412c, 24, true).show();
                        return;
                    }
                    long j3 = ((un0) arrayList.get(i10)).f28898a.h;
                    if (xn0Var.h == j3) {
                        o0Var = null;
                    } else {
                        o0Var = ((un0) arrayList.get(i10)).f28898a;
                    }
                    if (xn0Var.f(o0Var)) {
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
                        w0Var.M(new org.telegram.ui.fr(3));
                        if (xn0Var.h == j3) {
                            xn0Var.h = 0L;
                            return;
                        }
                        xn0Var.h = j3;
                        ((wn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.k1 k1Var = (rg.k1) this.d;
                if (view instanceof org.telegram.ui.lw0) {
                    org.telegram.ui.lw0 lw0Var = (org.telegram.ui.lw0) view;
                    PremiumPreviewFragment.q0(this.f27411b, lw0Var.f35515f.f32593a);
                    k1Var.showDialog(new rg.x0(this.f27412c, lw0Var.f35515f.f32593a, false));
                    return;
                }
                return;
        }
    }
}
