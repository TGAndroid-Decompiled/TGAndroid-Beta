package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class an0 implements al0 {
    public final int f22446a;
    public final int f22447b;
    public final org.telegram.ui.ActionBar.o2 f22448c;
    public final Object d;

    public an0(Object obj, int i10, org.telegram.ui.ActionBar.o2 o2Var, int i11) {
        this.f22446a = i11;
        this.d = obj;
        this.f22447b = i10;
        this.f22448c = o2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.p0 p0Var;
        switch (this.f22446a) {
            case 0:
                jn0 jn0Var = (jn0) this.d;
                ArrayList arrayList = jn0Var.f25363r;
                ai.w0 w0Var = jn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f22447b).isPremium()) {
                        new rg.x0(this.f22448c, 24, true).show();
                        return;
                    }
                    long j3 = ((gn0) arrayList.get(i10)).f24352a.h;
                    if (jn0Var.h == j3) {
                        p0Var = null;
                    } else {
                        p0Var = ((gn0) arrayList.get(i10)).f24352a;
                    }
                    if (jn0Var.f(p0Var)) {
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
                        w0Var.N(new org.telegram.ui.kr(3));
                        if (jn0Var.h == j3) {
                            jn0Var.h = 0L;
                            return;
                        }
                        jn0Var.h = j3;
                        ((in0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.k1 k1Var = (rg.k1) this.d;
                if (view instanceof org.telegram.ui.ww0) {
                    org.telegram.ui.ww0 ww0Var = (org.telegram.ui.ww0) view;
                    PremiumPreviewFragment.q0(this.f22447b, ww0Var.f39188f.f35908a);
                    k1Var.showDialog(new rg.x0(this.f22448c, ww0Var.f39188f.f35908a, false));
                    return;
                }
                return;
        }
    }
}
