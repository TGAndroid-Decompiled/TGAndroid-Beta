package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class p80 implements org.telegram.messenger.ap {
    public final i50 f50905a;
    public final String f50906b;
    public final org.telegram.ui.ActionBar.g2 f50907c;
    public final long d;
    public final Integer f50908e;
    public final Bundle f50909f;
    public final LaunchActivity h;

    public p80(LaunchActivity launchActivity, i50 i50Var, String str, org.telegram.ui.ActionBar.g2 g2Var, long j3, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.f50905a = i50Var;
        this.f50906b = str;
        this.f50907c = g2Var;
        this.d = j3;
        this.f50908e = num;
        this.f50909f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.b5.r0((org.telegram.ui.ActionBar.g2) i5.c.h(1, launchActivity.f43195e0), null, org.telegram.messenger.gd.N0(2131748882, null), null);
        }
        try {
            this.f50905a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void e(boolean z10) {
        try {
            this.f50905a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.f50906b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.g2 g2Var = this.f50907c;
            if (str == null || !(g2Var instanceof bn) || ((bn) g2Var).a() != j3) {
                if (g2Var instanceof bn) {
                    bn bnVar = (bn) g2Var;
                    if (bnVar.a() == j3 && this.f50908e == null) {
                        org.telegram.messenger.g0.E3(5.0f, bnVar.A0, null);
                        org.telegram.messenger.q2.APP_ERROR.a();
                        rj rjVar = bnVar.f46118a0;
                        for (int i7 = 0; i7 < rjVar.getChildCount(); i7++) {
                            org.telegram.messenger.g0.E3(5.0f, rjVar.getChildAt(i7), null);
                        }
                        org.telegram.ui.ActionBar.k actionBar = bnVar.getActionBar();
                        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                            org.telegram.messenger.g0.E3(5.0f, actionBar.getChildAt(i10), null);
                        }
                    }
                }
                g2Var = new bn(this.f50909f);
                ((ActionBarLayout) launchActivity.M()).S(g2Var);
            }
            org.telegram.messenger.g0.h3(new di.j2(this, this.f50906b, this.d, g2Var, 21), 150L);
        }
    }
}
