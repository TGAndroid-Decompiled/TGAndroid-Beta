package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class ap implements Runnable {
    public final int f43820a;
    public final ip f43821b;

    public ap(ip ipVar, int i3) {
        this.f43820a = i3;
        this.f43821b = ipVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i3 = this.f43820a;
        ip ipVar = this.f43821b;
        int i10 = 1;
        switch (i3) {
            case 0:
                TLRPC.User user = ipVar.f46355w;
                fp fpVar = ipVar.Y0;
                if (fpVar != null) {
                    if (ipVar.L) {
                        tL_chatAdminRights = ipVar.N;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    fpVar.b(0, tL_chatAdminRights, null, ipVar.T);
                }
                Bundle k10 = a1.g.k("scrollToTopOnResume", true);
                k10.putLong("chat_id", ipVar.f46357x.f27001id);
                if (!ipVar.getMessagesController().E(k10, ipVar, null, null)) {
                    ipVar.y0(false);
                    return;
                }
                wm wmVar = new wm(k10);
                ipVar.presentFragment(wmVar, true);
                if (org.telegram.ui.Components.fc.a(wmVar)) {
                    boolean z10 = ipVar.f46325a1;
                    if (z10 && ipVar.L) {
                        String str = user.first_name;
                        org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(wmVar.getParentActivity(), wmVar.f51557ya);
                        ibVar.d(2131624048, "Shield");
                        org.telegram.messenger.k5.r("UserAddedAsAdminHint", null, 2131743778, new Object[]{str}, ibVar.f34651b);
                        org.telegram.ui.Components.ac.g(wmVar, ibVar, 1500).j();
                        return;
                    } else if (!z10 && !ipVar.M && ipVar.L) {
                        org.telegram.ui.Components.fc.C(user.first_name, wmVar).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                ipVar.w0(false);
                return;
            default:
                if (ipVar.f46348r) {
                    long j10 = ipVar.f46343n;
                    org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, ipVar.getParentActivity(), null)};
                    ipVar.getMessagesController().c5(ipVar.f46350s, j10, true, false, true, new yf(s1VarArr, 2), new yf(s1VarArr, 3));
                    s1VarArr[0].r(300L);
                }
                fp fpVar2 = ipVar.Y0;
                if (fpVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = ipVar.N;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!ipVar.H || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!ipVar.F || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i10 = 0;
                    }
                    fpVar2.b(i10, tL_chatAdminRights2, ipVar.P, ipVar.T);
                    ipVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
