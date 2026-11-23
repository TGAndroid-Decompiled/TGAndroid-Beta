package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class ep implements Runnable {
    public final int f47601a;
    public final np f47602b;

    public ep(np npVar, int i7) {
        this.f47601a = i7;
        this.f47602b = npVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i7 = this.f47601a;
        np npVar = this.f47602b;
        int i10 = 1;
        switch (i7) {
            case 0:
                TLRPC.User user = npVar.f50382w;
                kp kpVar = npVar.Y0;
                if (kpVar != null) {
                    if (npVar.L) {
                        tL_chatAdminRights = npVar.N;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    kpVar.b(0, tL_chatAdminRights, null, npVar.T);
                }
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                k10.putLong("chat_id", npVar.f50384x.f28492id);
                if (!npVar.getMessagesController().E(k10, npVar, null, null)) {
                    npVar.y0(false);
                    return;
                }
                bn bnVar = new bn(k10);
                npVar.presentFragment(bnVar, true);
                if (org.telegram.ui.Components.kc.a(bnVar)) {
                    boolean z10 = npVar.f50352a1;
                    if (z10 && npVar.L) {
                        String str = user.first_name;
                        org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(bnVar.getParentActivity(), bnVar.Ba);
                        nbVar.d(2131624049, "Shield");
                        org.telegram.messenger.f3.q("UserAddedAsAdminHint", null, 2131743521, new Object[]{str}, nbVar.f37752b);
                        org.telegram.ui.Components.fc.g(bnVar, nbVar, 1500).j();
                        return;
                    } else if (!z10 && !npVar.M && npVar.L) {
                        org.telegram.ui.Components.kc.C(user.first_name, bnVar).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                npVar.w0(false);
                return;
            default:
                if (npVar.f50375r) {
                    long j3 = npVar.f50370n;
                    org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, npVar.getParentActivity(), null)};
                    npVar.getMessagesController().o5(npVar.f50377s, j3, true, false, true, new zf(t1VarArr, 2), new zf(t1VarArr, 3));
                    t1VarArr[0].r(300L);
                }
                kp kpVar2 = npVar.Y0;
                if (kpVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = npVar.N;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!npVar.H || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!npVar.F || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i10 = 0;
                    }
                    kpVar2.b(i10, tL_chatAdminRights2, npVar.P, npVar.T);
                    npVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
