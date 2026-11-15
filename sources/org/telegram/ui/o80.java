package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class o80 implements org.telegram.messenger.bp {
    public final g50 f49872a;
    public final boolean[] f49873b;
    public final Bundle f49874c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f49875e;

    public o80(LaunchActivity launchActivity, g50 g50Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f49875e = launchActivity;
        this.f49872a = g50Var;
        this.f49873b = zArr;
        this.f49874c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f49875e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.t4.r0((org.telegram.ui.ActionBar.e2) i5.c.h(1, launchActivity.f42630e0), null, org.telegram.messenger.hd.M0(2131749075, null), null);
        }
        try {
            this.f49872a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z10) {
        try {
            this.f49872a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f49873b[0]) {
            return;
        }
        an anVar = new an(this.f49874c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            anVar.f45139b6 = chatInvite;
        }
        ((ActionBarLayout) this.f49875e.M()).S(anVar);
    }
}
