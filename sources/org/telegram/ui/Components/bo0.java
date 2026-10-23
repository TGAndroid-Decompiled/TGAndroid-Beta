package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class bo0 implements am0 {
    public final int f25114a;
    public final int f25115b;
    public final org.telegram.ui.ActionBar.o2 f25116c;
    public final Object d;

    public bo0(Object obj, int i10, org.telegram.ui.ActionBar.o2 o2Var, int i11) {
        this.f25114a = i11;
        this.d = obj;
        this.f25115b = i10;
        this.f25116c = o2Var;
    }

    @Override
    public final void d(int i10, View view) {
        ah.i1 i1Var;
        switch (this.f25114a) {
            case 0:
                jo0 jo0Var = (jo0) this.d;
                ArrayList arrayList = jo0Var.f27727r;
                ai.u1 u1Var = jo0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f25115b).isPremium()) {
                        new sg.y0(this.f25116c, 24, true).show();
                        return;
                    }
                    long j10 = ((go0) arrayList.get(i10)).f26687a.h;
                    if (jo0Var.h == j10) {
                        i1Var = null;
                    } else {
                        i1Var = ((go0) arrayList.get(i10)).f26687a;
                    }
                    if (jo0Var.f(i1Var)) {
                        for (int i11 = 0; i11 < u1Var.getChildCount(); i11++) {
                            if (u1Var.getChildAt(i11) == view) {
                                float f7 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f7 = 90.0f;
                                    }
                                    u1Var.v0(-AndroidUtilities.dp(f7), 0, null);
                                } else if (i11 >= u1Var.getChildCount() - 2) {
                                    if (i11 == u1Var.getChildCount() - 1) {
                                        f7 = 80.0f;
                                    }
                                    u1Var.v0(AndroidUtilities.dp(f7), 0, null);
                                }
                            }
                        }
                        u1Var.M(new org.telegram.ui.zq(3));
                        if (jo0Var.h == j10) {
                            jo0Var.h = 0L;
                            return;
                        }
                        jo0Var.h = j10;
                        ((io0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.m1 m1Var = (sg.m1) this.d;
                if (view instanceof org.telegram.ui.cw0) {
                    org.telegram.ui.cw0 cw0Var = (org.telegram.ui.cw0) view;
                    PremiumPreviewFragment.q0(this.f25115b, cw0Var.f36441f.f41814a);
                    m1Var.showDialog(new sg.y0(this.f25116c, cw0Var.f36441f.f41814a, false));
                    return;
                }
                return;
        }
    }
}
