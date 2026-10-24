package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class ao0 implements zl0 {
    public final int f24763a;
    public final int f24764b;
    public final org.telegram.ui.ActionBar.o2 f24765c;
    public final Object d;

    public ao0(Object obj, int i10, org.telegram.ui.ActionBar.o2 o2Var, int i11) {
        this.f24763a = i11;
        this.d = obj;
        this.f24764b = i10;
        this.f24765c = o2Var;
    }

    @Override
    public final void d(int i10, View view) {
        ah.i1 i1Var;
        switch (this.f24763a) {
            case 0:
                io0 io0Var = (io0) this.d;
                ArrayList arrayList = io0Var.f27457r;
                ai.u1 u1Var = io0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f24764b).isPremium()) {
                        new sg.y0(this.f24765c, 24, true).show();
                        return;
                    }
                    long j10 = ((fo0) arrayList.get(i10)).f26400a.h;
                    if (io0Var.h == j10) {
                        i1Var = null;
                    } else {
                        i1Var = ((fo0) arrayList.get(i10)).f26400a;
                    }
                    if (io0Var.f(i1Var)) {
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
                        if (io0Var.h == j10) {
                            io0Var.h = 0L;
                            return;
                        }
                        io0Var.h = j10;
                        ((ho0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.m1 m1Var = (sg.m1) this.d;
                if (view instanceof org.telegram.ui.bw0) {
                    org.telegram.ui.bw0 bw0Var = (org.telegram.ui.bw0) view;
                    PremiumPreviewFragment.q0(this.f24764b, bw0Var.f36153f.f41244a);
                    m1Var.showDialog(new sg.y0(this.f24765c, bw0Var.f36153f.f41244a, false));
                    return;
                }
                return;
        }
    }
}
