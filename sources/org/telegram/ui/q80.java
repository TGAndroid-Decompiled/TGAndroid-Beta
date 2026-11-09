package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q80 implements org.telegram.messenger.ep {
    public final s10 f48975a;
    public final boolean[] f48976b;
    public final Bundle f48977c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f48978e;

    public q80(LaunchActivity launchActivity, s10 s10Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f48978e = launchActivity;
        this.f48975a = s10Var;
        this.f48976b = zArr;
        this.f48977c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f48978e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.v4.r0((org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity.f41267d0), null, org.telegram.messenger.id.M0(2131749075, null), null);
        }
        try {
            this.f48975a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z9) {
        try {
            this.f48975a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f48976b[0]) {
            return;
        }
        cn cnVar = new cn(this.f48977c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            cnVar.f44383a6 = chatInvite;
        }
        ((ActionBarLayout) this.f48978e.M()).S(cnVar);
    }
}
