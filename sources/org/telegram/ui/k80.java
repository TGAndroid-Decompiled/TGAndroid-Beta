package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class k80 implements org.telegram.messenger.vo {
    public final ly f46824a;
    public final String f46825b;
    public final org.telegram.ui.ActionBar.d2 f46826c;
    public final long d;
    public final Integer f46827e;
    public final Bundle f46828f;
    public final LaunchActivity h;

    public k80(LaunchActivity launchActivity, ly lyVar, String str, org.telegram.ui.ActionBar.d2 d2Var, long j10, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.f46824a = lyVar;
        this.f46825b = str;
        this.f46826c = d2Var;
        this.d = j10;
        this.f46827e = num;
        this.f46828f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.t4.t0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, launchActivity.f41291e0), null, org.telegram.messenger.bd.M0(2131749083, null), null);
        }
        try {
            this.f46824a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void j(boolean z10) {
        try {
            this.f46824a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.f46825b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.d2 d2Var = this.f46826c;
            if (str == null || !(d2Var instanceof wm) || ((wm) d2Var).a() != j10) {
                if (d2Var instanceof wm) {
                    wm wmVar = (wm) d2Var;
                    if (wmVar.a() == j10 && this.f46827e == null) {
                        org.telegram.messenger.g0.G3(5.0f, wmVar.A0, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        mj mjVar = wmVar.f51237a0;
                        for (int i3 = 0; i3 < mjVar.getChildCount(); i3++) {
                            org.telegram.messenger.g0.G3(5.0f, mjVar.getChildAt(i3), null);
                        }
                        org.telegram.ui.ActionBar.k actionBar = wmVar.getActionBar();
                        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                            org.telegram.messenger.g0.G3(5.0f, actionBar.getChildAt(i10), null);
                        }
                    }
                }
                d2Var = new wm(this.f46828f);
                ((ActionBarLayout) launchActivity.M()).S(d2Var);
            }
            org.telegram.messenger.g0.i3(new ci.l2(this, this.f46825b, this.d, d2Var, 22), 150L);
        }
    }
}
