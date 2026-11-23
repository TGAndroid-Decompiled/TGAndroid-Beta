package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q80 implements org.telegram.messenger.bp {
    public final o60 f51074a;
    public final String f51075b;
    public final org.telegram.ui.ActionBar.g2 f51076c;
    public final long d;
    public final Integer f51077e;
    public final Bundle f51078f;
    public final LaunchActivity h;

    public q80(LaunchActivity launchActivity, o60 o60Var, String str, org.telegram.ui.ActionBar.g2 g2Var, long j3, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.f51074a = o60Var;
        this.f51075b = str;
        this.f51076c = g2Var;
        this.d = j3;
        this.f51077e = num;
        this.f51078f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.r0((org.telegram.ui.ActionBar.g2) i5.c.h(1, launchActivity.f43085e0), null, org.telegram.messenger.hd.N0(2131748882, null), null);
        }
        try {
            this.f51074a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z10) {
        try {
            this.f51074a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.f51075b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.g2 g2Var = this.f51076c;
            if (str == null || !(g2Var instanceof bn) || ((bn) g2Var).a() != j3) {
                if (g2Var instanceof bn) {
                    bn bnVar = (bn) g2Var;
                    if (bnVar.a() == j3 && this.f51077e == null) {
                        org.telegram.messenger.g0.E3(5.0f, bnVar.A0, null);
                        org.telegram.messenger.q2.APP_ERROR.a();
                        rj rjVar = bnVar.f45903a0;
                        for (int i7 = 0; i7 < rjVar.getChildCount(); i7++) {
                            org.telegram.messenger.g0.E3(5.0f, rjVar.getChildAt(i7), null);
                        }
                        org.telegram.ui.ActionBar.k actionBar = bnVar.getActionBar();
                        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                            org.telegram.messenger.g0.E3(5.0f, actionBar.getChildAt(i10), null);
                        }
                    }
                }
                g2Var = new bn(this.f51078f);
                ((ActionBarLayout) launchActivity.M()).S(g2Var);
            }
            org.telegram.messenger.g0.h3(new di.i2(this, this.f51075b, this.d, g2Var, 21), 150L);
        }
    }
}
