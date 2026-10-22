package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class yn0 implements xl0 {
    public final int f32710a;
    public final int f32711b;
    public final org.telegram.ui.ActionBar.n2 f32712c;
    public final Object d;

    public yn0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.f32710a = i11;
        this.d = obj;
        this.f32711b = i10;
        this.f32712c = n2Var;
    }

    @Override
    public final void a(int i10, View view) {
        ah.i1 i1Var;
        switch (this.f32710a) {
            case 0:
                go0 go0Var = (go0) this.d;
                ArrayList arrayList = go0Var.f26622r;
                ai.u1 u1Var = go0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f32711b).isPremium()) {
                        new sg.y0(this.f32712c, 24, true).show();
                        return;
                    }
                    long j10 = ((do0) arrayList.get(i10)).f25578a.h;
                    if (go0Var.h == j10) {
                        i1Var = null;
                    } else {
                        i1Var = ((do0) arrayList.get(i10)).f25578a;
                    }
                    if (go0Var.f(i1Var)) {
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
                        u1Var.M(new org.telegram.ui.xq(3));
                        if (go0Var.h == j10) {
                            go0Var.h = 0L;
                            return;
                        }
                        go0Var.h = j10;
                        ((fo0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.m1 m1Var = (sg.m1) this.d;
                if (view instanceof org.telegram.ui.yv0) {
                    org.telegram.ui.yv0 yv0Var = (org.telegram.ui.yv0) view;
                    PremiumPreviewFragment.q0(this.f32711b, yv0Var.f43569f.f39991a);
                    m1Var.showDialog(new sg.y0(this.f32712c, yv0Var.f43569f.f39991a, false));
                    return;
                }
                return;
        }
    }
}
