package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class n80 implements org.telegram.messenger.bp {
    public final g50 f49518a;
    public final String f49519b;
    public final org.telegram.ui.ActionBar.e2 f49520c;
    public final long d;
    public final Integer f49521e;
    public final Bundle f49522f;
    public final LaunchActivity h;

    public n80(LaunchActivity launchActivity, g50 g50Var, String str, org.telegram.ui.ActionBar.e2 e2Var, long j3, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.f49518a = g50Var;
        this.f49519b = str;
        this.f49520c = e2Var;
        this.d = j3;
        this.f49521e = num;
        this.f49522f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.t4.r0((org.telegram.ui.ActionBar.e2) i5.c.h(1, launchActivity.f42630e0), null, org.telegram.messenger.hd.M0(2131749075, null), null);
        }
        try {
            this.f49518a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z10) {
        try {
            this.f49518a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.f49519b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.e2 e2Var = this.f49520c;
            if (str == null || !(e2Var instanceof an) || ((an) e2Var).a() != j3) {
                if (e2Var instanceof an) {
                    an anVar = (an) e2Var;
                    if (anVar.a() == j3 && this.f49521e == null) {
                        org.telegram.messenger.g0.F3(5.0f, anVar.A0, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        qj qjVar = anVar.f45118a0;
                        for (int i7 = 0; i7 < qjVar.getChildCount(); i7++) {
                            org.telegram.messenger.g0.F3(5.0f, qjVar.getChildAt(i7), null);
                        }
                        org.telegram.ui.ActionBar.k actionBar = anVar.getActionBar();
                        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                            org.telegram.messenger.g0.F3(5.0f, actionBar.getChildAt(i10), null);
                        }
                    }
                }
                e2Var = new an(this.f49522f);
                ((ActionBarLayout) launchActivity.M()).S(e2Var);
            }
            org.telegram.messenger.g0.i3(new di.f2(this, this.f49519b, this.d, e2Var, 22), 150L);
        }
    }
}
