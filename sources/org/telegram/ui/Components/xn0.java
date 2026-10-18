package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class xn0 implements wl0 {
    public final int f32432a;
    public final int f32433b;
    public final org.telegram.ui.ActionBar.n2 f32434c;
    public final Object d;

    public xn0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.f32432a = i11;
        this.d = obj;
        this.f32433b = i10;
        this.f32434c = n2Var;
    }

    @Override
    public final void a(int i10, View view) {
        ah.i1 i1Var;
        switch (this.f32432a) {
            case 0:
                fo0 fo0Var = (fo0) this.d;
                ArrayList arrayList = fo0Var.f26332r;
                ai.u1 u1Var = fo0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f32433b).isPremium()) {
                        new sg.x0(this.f32434c, 24, true).show();
                        return;
                    }
                    long j10 = ((co0) arrayList.get(i10)).f25320a.h;
                    if (fo0Var.h == j10) {
                        i1Var = null;
                    } else {
                        i1Var = ((co0) arrayList.get(i10)).f25320a;
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
                sg.l1 l1Var = (sg.l1) this.d;
                if (view instanceof org.telegram.ui.aw0) {
                    org.telegram.ui.aw0 aw0Var = (org.telegram.ui.aw0) view;
                    PremiumPreviewFragment.q0(this.f32433b, aw0Var.f35534f.f40533a);
                    l1Var.showDialog(new sg.x0(this.f32434c, aw0Var.f35534f.f40533a, false));
                    return;
                }
                return;
        }
    }
}
