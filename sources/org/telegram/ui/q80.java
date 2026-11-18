package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q80 implements org.telegram.messenger.ap {
    public final n60 f51169a;
    public final boolean[] f51170b;
    public final Bundle f51171c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f51172e;

    public q80(LaunchActivity launchActivity, n60 n60Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f51172e = launchActivity;
        this.f51169a = n60Var;
        this.f51170b = zArr;
        this.f51171c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f51172e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.b5.r0((org.telegram.ui.ActionBar.h2) i5.c.h(1, launchActivity.f43075e0), null, org.telegram.messenger.gd.M0(2131748883, null), null);
        }
        try {
            this.f51169a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z10) {
        try {
            this.f51169a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f51170b[0]) {
            return;
        }
        bn bnVar = new bn(this.f51171c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            bnVar.f45967c6 = chatInvite;
        }
        ((ActionBarLayout) this.f51172e.M()).S(bnVar);
    }
}
