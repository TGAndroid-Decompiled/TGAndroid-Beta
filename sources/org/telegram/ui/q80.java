package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q80 implements org.telegram.messenger.ep {
    public final f10 f48989a;
    public final String f48990b;
    public final org.telegram.ui.ActionBar.f2 f48991c;
    public final long d;
    public final Integer f48992e;
    public final Bundle f48993f;
    public final LaunchActivity h;

    public q80(LaunchActivity launchActivity, f10 f10Var, String str, org.telegram.ui.ActionBar.f2 f2Var, long j3, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.f48989a = f10Var;
        this.f48990b = str;
        this.f48991c = f2Var;
        this.d = j3;
        this.f48992e = num;
        this.f48993f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.u4.r0((org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity.f41258d0), null, org.telegram.messenger.id.M0(2131749075, null), null);
        }
        try {
            this.f48989a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z9) {
        try {
            this.f48989a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.f48990b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.f2 f2Var = this.f48991c;
            if (str == null || !(f2Var instanceof cn) || ((cn) f2Var).a() != j3) {
                if (f2Var instanceof cn) {
                    cn cnVar = (cn) f2Var;
                    if (cnVar.a() == j3 && this.f48992e == null) {
                        org.telegram.messenger.g0.G3(5.0f, cnVar.f44741z0, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        sj sjVar = cnVar.Z;
                        for (int i7 = 0; i7 < sjVar.getChildCount(); i7++) {
                            org.telegram.messenger.g0.G3(5.0f, sjVar.getChildAt(i7), null);
                        }
                        org.telegram.ui.ActionBar.l actionBar = cnVar.getActionBar();
                        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                            org.telegram.messenger.g0.G3(5.0f, actionBar.getChildAt(i10), null);
                        }
                    }
                }
                f2Var = new cn(this.f48993f);
                ((ActionBarLayout) launchActivity.M()).S(f2Var);
            }
            org.telegram.messenger.g0.i3(new bi.w2(this, this.f48990b, this.d, f2Var, 22), 150L);
        }
    }
}
