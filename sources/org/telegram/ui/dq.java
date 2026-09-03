package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dq implements Runnable {
    public final int f33512a;
    public final lq f33513b;

    public dq(lq lqVar, int i10) {
        this.f33512a = i10;
        this.f33513b = lqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f33512a;
        lq lqVar = this.f33513b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = lqVar.v;
                iq iqVar = lqVar.U0;
                if (iqVar != null) {
                    if (lqVar.H) {
                        tL_chatAdminRights = lqVar.J;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    iqVar.b(0, tL_chatAdminRights, null, lqVar.P);
                }
                Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", lqVar.f35891w.f19159id);
                if (!lqVar.getMessagesController().checkCanOpenChat(i12, lqVar)) {
                    lqVar.t0(false);
                    return;
                }
                zn znVar = new zn(i12);
                lqVar.presentFragment(znVar, true);
                if (org.telegram.ui.Components.qc.a(znVar)) {
                    boolean z4 = lqVar.W0;
                    if (z4 && lqVar.H) {
                        String str = user.first_name;
                        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(znVar.getParentActivity(), znVar.f40534ba);
                        qbVar.d(R.raw.ic_admin, "Shield");
                        qbVar.f28137b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.ic.g(znVar, qbVar, 1500).j();
                        return;
                    } else if (!z4 && !lqVar.I && lqVar.H) {
                        org.telegram.ui.Components.qc.C(znVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                lqVar.r0(false);
                return;
            default:
                if (lqVar.f35884r) {
                    long j10 = lqVar.f35879n;
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(lqVar.getParentActivity(), 3, null)};
                    lqVar.getMessagesController().toggleChatJoinRequest(lqVar.f35886s, j10, true, false, true, new sg(d2VarArr, 2), new sg(d2VarArr, 3));
                    d2VarArr[0].q(300L);
                }
                iq iqVar2 = lqVar.U0;
                if (iqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = lqVar.J;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!lqVar.D || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!lqVar.B || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    iqVar2.b(i11, tL_chatAdminRights2, lqVar.L, lqVar.P);
                    lqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
