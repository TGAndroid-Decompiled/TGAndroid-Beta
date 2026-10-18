package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class xn0 implements wl0 {
    public final int f32425a;
    public final int f32426b;
    public final org.telegram.ui.ActionBar.n2 f32427c;
    public final Object d;

    public xn0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.f32425a = i11;
        this.d = obj;
        this.f32426b = i10;
        this.f32427c = n2Var;
    }

    @Override
    public final void a(int i10, View view) {
        ah.i1 i1Var;
        switch (this.f32425a) {
            case 0:
                fo0 fo0Var = (fo0) this.d;
                ArrayList arrayList = fo0Var.f26325r;
                ai.u1 u1Var = fo0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f32426b).isPremium()) {
                        new sg.y0(this.f32427c, 24, true).show();
                        return;
                    }
                    long j10 = ((co0) arrayList.get(i10)).f25313a.h;
                    if (fo0Var.h == j10) {
                        i1Var = null;
                    } else {
                        i1Var = ((co0) arrayList.get(i10)).f25313a;
                    }
                    if (fo0Var.f(i1Var)) {
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
                        if (fo0Var.h == j10) {
                            fo0Var.h = 0L;
                            return;
                        }
                        fo0Var.h = j10;
                        ((eo0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.m1 m1Var = (sg.m1) this.d;
                if (view instanceof org.telegram.ui.aw0) {
                    org.telegram.ui.aw0 aw0Var = (org.telegram.ui.aw0) view;
                    PremiumPreviewFragment.q0(this.f32426b, aw0Var.f35495f.f40499a);
                    m1Var.showDialog(new sg.y0(this.f32427c, aw0Var.f35495f.f40499a, false));
                    return;
                }
                return;
        }
    }
}
