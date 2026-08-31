package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cq implements Runnable {
    public final int f35890a;
    public final kq f35891b;

    public cq(kq kqVar, int i10) {
        this.f35890a = i10;
        this.f35891b = kqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f35890a;
        kq kqVar = this.f35891b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = kqVar.v;
                hq hqVar = kqVar.U0;
                if (hqVar != null) {
                    if (kqVar.H) {
                        tL_chatAdminRights = kqVar.J;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    hqVar.b(0, tL_chatAdminRights, null, kqVar.P);
                }
                Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", kqVar.f38484w.f20843id);
                if (!kqVar.getMessagesController().checkCanOpenChat(i12, kqVar)) {
                    kqVar.t0(false);
                    return;
                }
                xn xnVar = new xn(i12);
                kqVar.presentFragment(xnVar, true);
                if (org.telegram.ui.Components.qc.a(xnVar)) {
                    boolean z4 = kqVar.W0;
                    if (z4 && kqVar.H) {
                        String str = user.first_name;
                        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(xnVar.getParentActivity(), xnVar.f43136ba);
                        qbVar.d(R.raw.ic_admin, "Shield");
                        qbVar.f30359b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.ic.g(xnVar, qbVar, 1500).j();
                        return;
                    } else if (!z4 && !kqVar.I && kqVar.H) {
                        org.telegram.ui.Components.qc.C(xnVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                kqVar.r0(false);
                return;
            default:
                if (kqVar.f38477r) {
                    long j10 = kqVar.f38472n;
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(kqVar.getParentActivity(), 3, null)};
                    kqVar.getMessagesController().toggleChatJoinRequest(kqVar.f38479s, j10, true, false, true, new qg(d2VarArr, 2), new qg(d2VarArr, 3));
                    d2VarArr[0].q(300L);
                }
                hq hqVar2 = kqVar.U0;
                if (hqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = kqVar.J;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!kqVar.D || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!kqVar.B || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    hqVar2.b(i11, tL_chatAdminRights2, kqVar.L, kqVar.P);
                    kqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
