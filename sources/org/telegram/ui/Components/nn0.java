package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class nn0 implements ll0 {
    public final int f26849a;
    public final int f26850b;
    public final org.telegram.ui.ActionBar.m2 f26851c;
    public final Object d;

    public nn0(Object obj, int i10, org.telegram.ui.ActionBar.m2 m2Var, int i11) {
        this.f26849a = i11;
        this.d = obj;
        this.f26850b = i10;
        this.f26851c = m2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.o0 o0Var;
        switch (this.f26849a) {
            case 0:
                vn0 vn0Var = (vn0) this.d;
                ArrayList arrayList = vn0Var.f29157r;
                ai.w0 w0Var = vn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f26850b).isPremium()) {
                        new rg.x0(this.f26851c, 24, true).show();
                        return;
                    }
                    long j3 = ((sn0) arrayList.get(i10)).f28320a.h;
                    if (vn0Var.h == j3) {
                        o0Var = null;
                    } else {
                        o0Var = ((sn0) arrayList.get(i10)).f28320a;
                    }
                    if (vn0Var.f(o0Var)) {
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
                if (view instanceof org.telegram.ui.lw0) {
                    org.telegram.ui.lw0 lw0Var = (org.telegram.ui.lw0) view;
                    PremiumPreviewFragment.q0(this.f26850b, lw0Var.f35424f.f32506a);
                    k1Var.showDialog(new rg.x0(this.f26851c, lw0Var.f35424f.f32506a, false));
                    return;
                }
                return;
        }
    }
}
