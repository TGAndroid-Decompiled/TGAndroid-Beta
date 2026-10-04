package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class sn0 implements ml0 {
    public final int f30834a;
    public final int f30835b;
    public final org.telegram.ui.ActionBar.n2 f30836c;
    public final Object d;

    public sn0(Object obj, int i10, org.telegram.ui.ActionBar.n2 n2Var, int i11) {
        this.f30834a = i11;
        this.d = obj;
        this.f30835b = i10;
        this.f30836c = n2Var;
    }

    @Override
    public final void d(int i10, View view) {
        zg.o0 o0Var;
        switch (this.f30834a) {
            case 0:
                ao0 ao0Var = (ao0) this.d;
                ArrayList arrayList = ao0Var.f24621r;
                ai.w0 w0Var = ao0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f30835b).isPremium()) {
                        new rg.y0(this.f30836c, 24, true).show();
                        return;
                    }
                    long j3 = ((xn0) arrayList.get(i10)).f32955a.h;
                    if (ao0Var.h == j3) {
                        o0Var = null;
                    } else {
                        o0Var = ((xn0) arrayList.get(i10)).f32955a;
                    }
                    if (ao0Var.f(o0Var)) {
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
                        w0Var.M(new org.telegram.ui.hr(3));
                        if (ao0Var.h == j3) {
                            ao0Var.h = 0L;
                            return;
                        }
                        ao0Var.h = j3;
                        ((zn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.m1 m1Var = (rg.m1) this.d;
                if (view instanceof org.telegram.ui.ow0) {
                    org.telegram.ui.ow0 ow0Var = (org.telegram.ui.ow0) view;
                    PremiumPreviewFragment.q0(this.f30835b, ow0Var.f39295f.f36112a);
                    m1Var.showDialog(new rg.y0(this.f30836c, ow0Var.f39295f.f36112a, false));
                    return;
                }
                return;
        }
    }
}
