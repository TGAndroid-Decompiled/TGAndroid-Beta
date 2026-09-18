package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class hq implements Runnable {
    public final int f34332a;
    public final pq f34333b;

    public hq(pq pqVar, int i10) {
        this.f34332a = i10;
        this.f34333b = pqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f34332a;
        pq pqVar = this.f34333b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = pqVar.v;
                mq mqVar = pqVar.X0;
                if (mqVar != null) {
                    if (pqVar.K) {
                        tL_chatAdminRights = pqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    mqVar.b(0, tL_chatAdminRights, null, pqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", pqVar.f36711w.f18121id);
                if (!pqVar.getMessagesController().checkCanOpenChat(i12, pqVar)) {
                    pqVar.t0(false);
                    return;
                }
                bo boVar = new bo(i12);
                pqVar.presentFragment(boVar, true);
                if (org.telegram.ui.Components.vc.a(boVar)) {
                    boolean z10 = pqVar.Z0;
                    if (z10 && pqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(boVar.getParentActivity(), boVar.f32279ea);
                        wbVar.d(R.raw.ic_admin, "Shield");
                        wbVar.f29626b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.oc.g(boVar, wbVar, 1500).j();
                        return;
                    } else if (!z10 && !pqVar.L && pqVar.K) {
                        org.telegram.ui.Components.vc.C(boVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                pqVar.r0(false);
                return;
            default:
                if (pqVar.f36704r) {
                    long j3 = pqVar.f36699n;
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(pqVar.getParentActivity(), 3, null)};
                    pqVar.getMessagesController().toggleChatJoinRequest(pqVar.f36706s, j3, true, false, true, new zg(c2VarArr, 2), new zg(c2VarArr, 3));
                    c2VarArr[0].q(300L);
                }
                mq mqVar2 = pqVar.X0;
                if (mqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = pqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!pqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!pqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    mqVar2.b(i11, tL_chatAdminRights2, pqVar.O, pqVar.S);
                    pqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
