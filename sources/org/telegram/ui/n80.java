package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class n80 implements org.telegram.messenger.ep {
    public final q10 f47966a;
    public final String f47967b;
    public final org.telegram.ui.ActionBar.f2 f47968c;
    public final long d;
    public final Integer f47969e;
    public final Bundle f47970f;
    public final LaunchActivity h;

    public n80(LaunchActivity launchActivity, q10 q10Var, String str, org.telegram.ui.ActionBar.f2 f2Var, long j3, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.f47966a = q10Var;
        this.f47967b = str;
        this.f47968c = f2Var;
        this.d = j3;
        this.f47969e = num;
        this.f47970f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.v4.r0((org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity.f41232d0), null, org.telegram.messenger.hd.M0(2131749074, null), null);
        }
        try {
            this.f47966a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z9) {
        try {
            this.f47966a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.f47967b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.f2 f2Var = this.f47968c;
            if (str == null || !(f2Var instanceof an) || ((an) f2Var).a() != j3) {
                if (f2Var instanceof an) {
                    an anVar = (an) f2Var;
                    if (anVar.a() == j3 && this.f47969e == null) {
                        org.telegram.messenger.g0.G3(5.0f, anVar.f44013z0, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        qj qjVar = anVar.Z;
                        for (int i7 = 0; i7 < qjVar.getChildCount(); i7++) {
                            org.telegram.messenger.g0.G3(5.0f, qjVar.getChildAt(i7), null);
                        }
                        org.telegram.ui.ActionBar.k actionBar = anVar.getActionBar();
                        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                            org.telegram.messenger.g0.G3(5.0f, actionBar.getChildAt(i10), null);
                        }
                    }
                }
                f2Var = new an(this.f47970f);
                ((ActionBarLayout) launchActivity.M()).S(f2Var);
            }
            org.telegram.messenger.g0.i3(new bi.w2(this, this.f47967b, this.d, f2Var, 22), 150L);
        }
    }
}
