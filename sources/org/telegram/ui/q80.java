package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q80 implements org.telegram.messenger.ap {
    public final o60 f51093a;
    public final String f51094b;
    public final org.telegram.ui.ActionBar.h2 f51095c;
    public final long d;
    public final Integer f51096e;
    public final Bundle f51097f;
    public final LaunchActivity h;

    public q80(LaunchActivity launchActivity, o60 o60Var, String str, org.telegram.ui.ActionBar.h2 h2Var, long j3, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.f51093a = o60Var;
        this.f51094b = str;
        this.f51095c = h2Var;
        this.d = j3;
        this.f51096e = num;
        this.f51097f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.b5.r0((org.telegram.ui.ActionBar.h2) i5.c.h(1, launchActivity.f43075e0), null, org.telegram.messenger.gd.M0(2131748883, null), null);
        }
        try {
            this.f51093a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z10) {
        try {
            this.f51093a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.f51094b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.h2 h2Var = this.f51095c;
            if (str == null || !(h2Var instanceof bn) || ((bn) h2Var).a() != j3) {
                if (h2Var instanceof bn) {
                    bn bnVar = (bn) h2Var;
                    if (bnVar.a() == j3 && this.f51096e == null) {
                        org.telegram.messenger.g0.E3(5.0f, bnVar.A0, null);
                        org.telegram.messenger.q2.APP_ERROR.a();
                        rj rjVar = bnVar.f45923a0;
                        for (int i7 = 0; i7 < rjVar.getChildCount(); i7++) {
                            org.telegram.messenger.g0.E3(5.0f, rjVar.getChildAt(i7), null);
                        }
                        org.telegram.ui.ActionBar.k actionBar = bnVar.getActionBar();
                        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                            org.telegram.messenger.g0.E3(5.0f, actionBar.getChildAt(i10), null);
                        }
                    }
                }
                h2Var = new bn(this.f51097f);
                ((ActionBarLayout) launchActivity.M()).S(h2Var);
            }
            org.telegram.messenger.g0.h3(new di.i2(this, this.f51094b, this.d, h2Var, 21), 150L);
        }
    }
}
