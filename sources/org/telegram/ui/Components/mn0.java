package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class mn0 implements kl0 {
    public final int f26546a;
    public final int f26547b;
    public final org.telegram.ui.ActionBar.m2 f26548c;
    public final Object d;

    public mn0(Object obj, int i10, org.telegram.ui.ActionBar.m2 m2Var, int i11) {
        this.f26546a = i11;
        this.d = obj;
        this.f26547b = i10;
        this.f26548c = m2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.o0 o0Var;
        switch (this.f26546a) {
            case 0:
                un0 un0Var = (un0) this.d;
                ArrayList arrayList = un0Var.f28833r;
                ai.w0 w0Var = un0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f26547b).isPremium()) {
                        new rg.x0(this.f26548c, 24, true).show();
                        return;
                    }
                    long j3 = ((rn0) arrayList.get(i10)).f28003a.h;
                    if (un0Var.h == j3) {
                        o0Var = null;
                    } else {
                        o0Var = ((rn0) arrayList.get(i10)).f28003a;
                    }
                    if (un0Var.f(o0Var)) {
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
                        w0Var.M(new org.telegram.ui.fr(3));
                        if (un0Var.h == j3) {
                            un0Var.h = 0L;
                            return;
                        }
                        un0Var.h = j3;
                        ((tn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.k1 k1Var = (rg.k1) this.d;
                if (view instanceof org.telegram.ui.lw0) {
                    org.telegram.ui.lw0 lw0Var = (org.telegram.ui.lw0) view;
                    PremiumPreviewFragment.q0(this.f26547b, lw0Var.f35412f.f32493a);
                    k1Var.showDialog(new rg.x0(this.f26548c, lw0Var.f35412f.f32493a, false));
                    return;
                }
                return;
        }
    }
}
