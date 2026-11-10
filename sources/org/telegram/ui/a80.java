package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class a80 implements org.telegram.messenger.c20 {
    public final int f43600a;
    public final LaunchActivity f43601b;

    public a80(LaunchActivity launchActivity, int i7) {
        this.f43600a = i7;
        this.f43601b = launchActivity;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.f2 lastFragment;
        int i7 = this.f43600a;
        LaunchActivity launchActivity = this.f43601b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f41277o0 != null && booleanValue && org.telegram.messenger.sc.c() < 100 && (lastFragment = launchActivity.f41277o0.getLastFragment()) != null && !(lastFragment instanceof z90)) {
                    int b10 = org.telegram.messenger.sc.b();
                    org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(lastFragment);
                    org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(b10 / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.m6.Y5));
                    String M0 = org.telegram.messenger.id.M0(2131748715, null);
                    String a03 = org.telegram.messenger.id.a0("LowPowerEnabledSubtitle", null, 2131748716, String.format("%d%%", Integer.valueOf(b10)));
                    String M02 = org.telegram.messenger.id.M0(2131751435, null);
                    v60 v60Var = new v60(launchActivity, 11);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.h6 h6Var = a02.f33873c;
                    org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(W, h6Var);
                    ybVar.f40544a.setImageDrawable(m9Var);
                    ybVar.f40545b.setText(M0);
                    ybVar.f40546c.setText(a03);
                    org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(a02.W(), h6Var, true);
                    zbVar.e(M02);
                    zbVar.f40908b = v60Var;
                    ybVar.setButton(zbVar);
                    org.telegram.ui.Components.bc b11 = a02.b(ybVar, 2750);
                    b11.f32203j = 5000;
                    b11.j();
                    return;
                }
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                String str = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity.O).x3(null, user, null, 0, null, false, false);
                return;
        }
    }
}
