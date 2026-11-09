package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class ep implements Runnable {
    public final int f45482a;
    public final mp f45483b;

    public ep(mp mpVar, int i7) {
        this.f45482a = i7;
        this.f45483b = mpVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i7 = this.f45482a;
        mp mpVar = this.f45483b;
        int i10 = 1;
        switch (i7) {
            case 0:
                TLRPC.User user = mpVar.f47939w;
                jp jpVar = mpVar.X0;
                if (jpVar != null) {
                    if (mpVar.K) {
                        tL_chatAdminRights = mpVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    jpVar.b(0, tL_chatAdminRights, null, mpVar.S);
                }
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                k10.putLong("chat_id", mpVar.f47941x.f26956id);
                if (!mpVar.getMessagesController().E(k10, mpVar, null, null)) {
                    mpVar.y0(false);
                    return;
                }
                cn cnVar = new cn(k10);
                mpVar.presentFragment(cnVar, true);
                if (org.telegram.ui.Components.hc.a(cnVar)) {
                    boolean z9 = mpVar.Z0;
                    if (z9 && mpVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(cnVar.getParentActivity(), cnVar.f44709za);
                        kbVar.d(2131624048, "Shield");
                        org.telegram.messenger.k5.r("UserAddedAsAdminHint", null, 2131743768, new Object[]{str}, kbVar.f35292b);
                        org.telegram.ui.Components.cc.g(cnVar, kbVar, 1500).j();
                        return;
                    } else if (!z9 && !mpVar.L && mpVar.K) {
                        org.telegram.ui.Components.hc.C(user.first_name, cnVar).j();
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
                if (mpVar.f47932r) {
                    long j3 = mpVar.f47927n;
                    org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, mpVar.getParentActivity(), null)};
                    mpVar.getMessagesController().c5(mpVar.f47934s, j3, true, false, true, new ag(u1VarArr, 2), new ag(u1VarArr, 3));
                    u1VarArr[0].r(300L);
                }
                jp jpVar2 = mpVar.X0;
                if (jpVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = mpVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!mpVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!mpVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i10 = 0;
                    }
                    jpVar2.b(i10, tL_chatAdminRights2, mpVar.O, mpVar.S);
                    mpVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
