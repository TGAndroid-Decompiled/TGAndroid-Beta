package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class cp implements Runnable {
    public final int f44844a;
    public final kp f44845b;

    public cp(kp kpVar, int i7) {
        this.f44844a = i7;
        this.f44845b = kpVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i7 = this.f44844a;
        kp kpVar = this.f44845b;
        int i10 = 1;
        switch (i7) {
            case 0:
                TLRPC.User user = kpVar.f47228w;
                hp hpVar = kpVar.X0;
                if (hpVar != null) {
                    if (kpVar.K) {
                        tL_chatAdminRights = kpVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    hpVar.b(0, tL_chatAdminRights, null, kpVar.S);
                }
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                k10.putLong("chat_id", kpVar.f47230x.f26952id);
                if (!kpVar.getMessagesController().E(k10, kpVar, null, null)) {
                    kpVar.y0(false);
                    return;
                }
                an anVar = new an(k10);
                kpVar.presentFragment(anVar, true);
                if (org.telegram.ui.Components.hc.a(anVar)) {
                    boolean z9 = kpVar.Z0;
                    if (z9 && kpVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(anVar.getParentActivity(), anVar.f43998xa);
                        kbVar.d(2131624048, "Shield");
                        org.telegram.messenger.k5.r("UserAddedAsAdminHint", null, 2131743769, new Object[]{str}, kbVar.f35249b);
                        org.telegram.ui.Components.cc.g(anVar, kbVar, 1500).j();
                        return;
                    } else if (!z9 && !kpVar.L && kpVar.K) {
                        org.telegram.ui.Components.hc.C(user.first_name, anVar).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                kpVar.w0(false);
                return;
            default:
                if (kpVar.f47221r) {
                    long j3 = kpVar.f47216n;
                    org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, kpVar.getParentActivity(), null)};
                    kpVar.getMessagesController().c5(kpVar.f47223s, j3, true, false, true, new cg(u1VarArr, 2), new cg(u1VarArr, 3));
                    u1VarArr[0].r(300L);
                }
                hp hpVar2 = kpVar.X0;
                if (hpVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = kpVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!kpVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!kpVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i10 = 0;
                    }
                    hpVar2.b(i10, tL_chatAdminRights2, kpVar.O, kpVar.S);
                    kpVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
