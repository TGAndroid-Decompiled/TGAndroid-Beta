package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q80 implements org.telegram.messenger.ap {
    public final i50 f51376a;
    public final boolean[] f51377b;
    public final Bundle f51378c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f51379e;

    public q80(LaunchActivity launchActivity, i50 i50Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f51379e = launchActivity;
        this.f51376a = i50Var;
        this.f51377b = zArr;
        this.f51378c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f51379e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.b5.r0((org.telegram.ui.ActionBar.g2) i5.c.h(1, launchActivity.f43195e0), null, org.telegram.messenger.gd.N0(2131748882, null), null);
        }
        try {
            this.f51376a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void e(boolean z10) {
        try {
            this.f51376a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f51377b[0]) {
            return;
        }
        bn bnVar = new bn(this.f51378c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            bnVar.f46153c6 = chatInvite;
        }
        ((ActionBarLayout) this.f51379e.M()).S(bnVar);
    }
}
