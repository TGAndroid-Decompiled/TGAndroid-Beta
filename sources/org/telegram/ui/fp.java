package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class fp implements Runnable {
    public final int f47739a;
    public final np f47740b;

    public fp(np npVar, int i7) {
        this.f47739a = i7;
        this.f47740b = npVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i7 = this.f47739a;
        np npVar = this.f47740b;
        int i10 = 1;
        switch (i7) {
            case 0:
                TLRPC.User user = npVar.f50255w;
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
                k10.putLong("chat_id", npVar.f50257x.f28403id);
                if (!npVar.getMessagesController().E(k10, npVar, null, null)) {
                    npVar.y0(false);
                    return;
                }
                bn bnVar = new bn(k10);
                npVar.presentFragment(bnVar, true);
                if (org.telegram.ui.Components.lc.a(bnVar)) {
                    boolean z10 = npVar.f50225a1;
                    if (z10 && npVar.L) {
                        String str = user.first_name;
                        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(bnVar.getParentActivity(), bnVar.Ba);
                        obVar.d(2131624049, "Shield");
                        org.telegram.messenger.f3.q("UserAddedAsAdminHint", null, 2131743531, new Object[]{str}, obVar.f38055b);
                        org.telegram.ui.Components.gc.g(bnVar, obVar, 1500).j();
                        return;
                    } else if (!z10 && !npVar.M && npVar.L) {
                        org.telegram.ui.Components.lc.C(user.first_name, bnVar).j();
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
                if (npVar.f50248r) {
                    long j3 = npVar.f50243n;
                    org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, npVar.getParentActivity(), null)};
                    npVar.getMessagesController().o5(npVar.f50250s, j3, true, false, true, new zf(u1VarArr, 2), new zf(u1VarArr, 3));
                    u1VarArr[0].r(300L);
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
