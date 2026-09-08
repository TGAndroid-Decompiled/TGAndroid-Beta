package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class zm0 implements zk0 {
    public final int f33210a;
    public final int f33211b;
    public final org.telegram.ui.ActionBar.n2 f33212c;
    public final Object d;

    public zm0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.f33210a = i11;
        this.d = obj;
        this.f33211b = i10;
        this.f33212c = n2Var;
    }

    @Override
    public final void a(int i10, View view) {
        ah.j1 j1Var;
        switch (this.f33210a) {
            case 0:
                hn0 hn0Var = (hn0) this.d;
                ArrayList arrayList = hn0Var.f26795r;
                bi.o0 o0Var = hn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f33211b).isPremium()) {
                        new sg.a1(this.f33212c, 24, true).show();
                        return;
                    }
                    long j3 = ((en0) arrayList.get(i10)).f25764a.h;
                    if (hn0Var.h == j3) {
                        j1Var = null;
                    } else {
                        j1Var = ((en0) arrayList.get(i10)).f25764a;
                    }
                    if (hn0Var.f(j1Var)) {
                        for (int i11 = 0; i11 < o0Var.getChildCount(); i11++) {
                            if (o0Var.getChildAt(i11) == view) {
                                float f7 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f7 = 90.0f;
                                    }
                                    o0Var.v0(-AndroidUtilities.dp(f7), 0, null);
                                } else if (i11 >= o0Var.getChildCount() - 2) {
                                    if (i11 == o0Var.getChildCount() - 1) {
                                        f7 = 80.0f;
                                    }
                                    o0Var.v0(AndroidUtilities.dp(f7), 0, null);
                                }
                            }
                        }
                        o0Var.M(new org.telegram.ui.lr(3));
                        if (hn0Var.h == j3) {
                            hn0Var.h = 0L;
                            return;
                        }
                        hn0Var.h = j3;
                        ((gn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.o1 o1Var = (sg.o1) this.d;
                if (view instanceof org.telegram.ui.uw0) {
                    org.telegram.ui.uw0 uw0Var = (org.telegram.ui.uw0) view;
                    PremiumPreviewFragment.q0(this.f33211b, uw0Var.f41255f.f38174a);
                    o1Var.showDialog(new sg.a1(this.f33212c, uw0Var.f41255f.f38174a, false));
                    return;
                }
                return;
        }
    }
}
