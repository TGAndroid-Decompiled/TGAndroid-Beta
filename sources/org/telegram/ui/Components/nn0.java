package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class nn0 implements kl0 {
    public final int f26736a;
    public final int f26737b;
    public final org.telegram.ui.ActionBar.n2 f26738c;
    public final Object d;

    public nn0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.f26736a = i11;
        this.d = obj;
        this.f26737b = i10;
        this.f26738c = n2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.o0 o0Var;
        switch (this.f26736a) {
            case 0:
                vn0 vn0Var = (vn0) this.d;
                ArrayList arrayList = vn0Var.f29145r;
                ai.w0 w0Var = vn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f26737b).isPremium()) {
                        new rg.x0(this.f26738c, 24, true).show();
                        return;
                    }
                    long j3 = ((sn0) arrayList.get(i10)).f28200a.h;
                    if (vn0Var.h == j3) {
                        o0Var = null;
                    } else {
                        o0Var = ((sn0) arrayList.get(i10)).f28200a;
                    }
                    if (vn0Var.f(o0Var)) {
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
                        w0Var.N(new org.telegram.ui.ir(3));
                        if (vn0Var.h == j3) {
                            vn0Var.h = 0L;
                            return;
                        }
                        vn0Var.h = j3;
                        ((un0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.k1 k1Var = (rg.k1) this.d;
                if (view instanceof org.telegram.ui.uw0) {
                    org.telegram.ui.uw0 uw0Var = (org.telegram.ui.uw0) view;
                    PremiumPreviewFragment.q0(this.f26737b, uw0Var.f38116f.f35197a);
                    k1Var.showDialog(new rg.x0(this.f26738c, uw0Var.f38116f.f35197a, false));
                    return;
                }
                return;
        }
    }
}
