package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class p70 implements org.telegram.messenger.u10 {
    public final int f48484a;
    public final LaunchActivity f48485b;

    public p70(LaunchActivity launchActivity, int i3) {
        this.f48484a = i3;
        this.f48485b = launchActivity;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.d2 lastFragment;
        int i3 = this.f48484a;
        LaunchActivity launchActivity = this.f48485b;
        switch (i3) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f41314r0 != null && booleanValue && org.telegram.messenger.lc.c() < 100 && (lastFragment = launchActivity.f41314r0.getLastFragment()) != null && !(lastFragment instanceof t90)) {
                    int b10 = org.telegram.messenger.lc.b();
                    org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(lastFragment);
                    org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.k6.Y5));
                    String M0 = org.telegram.messenger.bd.M0(2131748723, null);
                    String a03 = org.telegram.messenger.bd.a0("LowPowerEnabledSubtitle", null, 2131748724, String.format("%d%%", Integer.valueOf(b10)));
                    String M02 = org.telegram.messenger.bd.M0(2131751436, null);
                    m60 m60Var = new m60(launchActivity, 11);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.e6 e6Var = a02.f33774c;
                    org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(W, e6Var);
                    xbVar.f40302a.setImageDrawable(m9Var);
                    xbVar.f40303b.setText(M0);
                    xbVar.f40304c.setText(a03);
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), e6Var, true);
                    ybVar.e(M02);
                    ybVar.f40672b = m60Var;
                    xbVar.setButton(ybVar);
                    org.telegram.ui.Components.ac b11 = a02.b(xbVar, 2750);
                    b11.f31792j = 5000;
                    b11.j();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str = LaunchActivity.E1;
                org.telegram.messenger.hp.s1(launchActivity.P).x3(null, user, null, 0, null, false, false);
                return;
        }
    }
}
