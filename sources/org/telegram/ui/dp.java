package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class dp implements Runnable {
    public final int f46445a;
    public final mp f46446b;

    public dp(mp mpVar, int i7) {
        this.f46445a = i7;
        this.f46446b = mpVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i7 = this.f46445a;
        mp mpVar = this.f46446b;
        int i10 = 1;
        switch (i7) {
            case 0:
                TLRPC.User user = mpVar.f49299w;
                jp jpVar = mpVar.Y0;
                if (jpVar != null) {
                    if (mpVar.L) {
                        tL_chatAdminRights = mpVar.N;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    jpVar.b(0, tL_chatAdminRights, null, mpVar.T);
                }
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                k10.putLong("chat_id", mpVar.f49301x.f28051id);
                if (!mpVar.getMessagesController().E(k10, mpVar, null, null)) {
                    mpVar.y0(false);
                    return;
                }
                an anVar = new an(k10);
                mpVar.presentFragment(anVar, true);
                if (org.telegram.ui.Components.cc.a(anVar)) {
                    boolean z10 = mpVar.f49269a1;
                    if (z10 && mpVar.L) {
                        String str = user.first_name;
                        org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(anVar.getParentActivity(), anVar.Aa);
                        fbVar.d(2131624049, "Shield");
                        org.telegram.messenger.k5.q("UserAddedAsAdminHint", null, 2131743768, new Object[]{str}, fbVar.f34552b);
                        org.telegram.ui.Components.xb.g(anVar, fbVar, 1500).j();
                        return;
                    } else if (!z10 && !mpVar.M && mpVar.L) {
                        org.telegram.ui.Components.cc.C(user.first_name, anVar).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                mpVar.w0(false);
                return;
            default:
                if (mpVar.f49292r) {
                    long j3 = mpVar.f49287n;
                    org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, mpVar.getParentActivity(), null)};
                    mpVar.getMessagesController().d5(mpVar.f49294s, j3, true, false, true, new xf(t1VarArr, 2), new xf(t1VarArr, 3));
                    t1VarArr[0].r(300L);
                }
                jp jpVar2 = mpVar.Y0;
                if (jpVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = mpVar.N;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!mpVar.H || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!mpVar.F || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i10 = 0;
                    }
                    jpVar2.b(i10, tL_chatAdminRights2, mpVar.P, mpVar.T);
                    mpVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
