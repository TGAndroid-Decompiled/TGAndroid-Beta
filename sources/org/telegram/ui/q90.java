package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q90 implements org.telegram.messenger.kp {
    public final y60 f40730a;
    public final String f40731b;
    public final org.telegram.ui.ActionBar.k2 f40732c;
    public final long d;
    public final Integer e;
    public final Bundle f40733f;
    public final LaunchActivity h;

    public q90(LaunchActivity launchActivity, y60 y60Var, String str, org.telegram.ui.ActionBar.k2 k2Var, long j10, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.f40730a = y60Var;
        this.f40731b = str;
        this.f40732c = k2Var;
        this.d = j10;
        this.e = num;
        this.f40733f = bundle;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.s4.t0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity.f33360d0), null, org.telegram.messenger.dd.L0(2131749085, null), null);
        }
        try {
            this.f40730a.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void g(boolean z10) {
        try {
            this.f40730a.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            String str = this.f40731b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.k2 k2Var = this.f40732c;
            if (str == null || !(k2Var instanceof un) || ((un) k2Var).a() != j10) {
                if (k2Var instanceof un) {
                    un unVar = (un) k2Var;
                    if (unVar.a() == j10 && this.e == null) {
                        org.telegram.messenger.i0.F3(5.0f, unVar.f42303z0, null);
                        org.telegram.messenger.t2.APP_ERROR.a();
                        mk mkVar = unVar.Z;
                        for (int i10 = 0; i10 < mkVar.getChildCount(); i10++) {
                            org.telegram.messenger.i0.F3(5.0f, mkVar.getChildAt(i10), null);
                        }
                        org.telegram.ui.ActionBar.l actionBar = unVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            org.telegram.messenger.i0.F3(5.0f, actionBar.getChildAt(i11), null);
                        }
                    }
                }
                k2Var = new un(this.f40733f);
                ((ActionBarLayout) launchActivity.M()).R(k2Var);
            }
            org.telegram.messenger.i0.h3(new ag.a3(this, this.f40731b, this.d, k2Var, 10), 150L);
        }
    }
}
