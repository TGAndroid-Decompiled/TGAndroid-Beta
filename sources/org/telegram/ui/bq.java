package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bq implements Runnable {
    public final int f33014a;
    public final jq f33015b;

    public bq(jq jqVar, int i10) {
        this.f33014a = i10;
        this.f33015b = jqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f33014a;
        jq jqVar = this.f33015b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = jqVar.v;
                gq gqVar = jqVar.U0;
                if (gqVar != null) {
                    if (jqVar.H) {
                        tL_chatAdminRights = jqVar.J;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    gqVar.b(0, tL_chatAdminRights, null, jqVar.P);
                }
                Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", jqVar.f35458w.f19184id);
                if (!jqVar.getMessagesController().checkCanOpenChat(i12, jqVar)) {
                    jqVar.t0(false);
                    return;
                }
                xn xnVar = new xn(i12);
                jqVar.presentFragment(xnVar, true);
                if (org.telegram.ui.Components.qc.a(xnVar)) {
                    boolean z4 = jqVar.W0;
                    if (z4 && jqVar.H) {
                        String str = user.first_name;
                        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(xnVar.getParentActivity(), xnVar.f39968ba);
                        qbVar.d(R.raw.ic_admin, "Shield");
                        qbVar.f28100b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.ic.g(xnVar, qbVar, 1500).j();
                        return;
                    } else if (!z4 && !jqVar.I && jqVar.H) {
                        org.telegram.ui.Components.qc.C(xnVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                jqVar.r0(false);
                return;
            default:
                if (jqVar.f35451r) {
                    long j10 = jqVar.f35446n;
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(jqVar.getParentActivity(), 3, null)};
                    jqVar.getMessagesController().toggleChatJoinRequest(jqVar.f35453s, j10, true, false, true, new qg(d2VarArr, 2), new qg(d2VarArr, 3));
                    d2VarArr[0].q(300L);
                }
                gq gqVar2 = jqVar.U0;
                if (gqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = jqVar.J;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!jqVar.D || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!jqVar.B || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    gqVar2.b(i11, tL_chatAdminRights2, jqVar.L, jqVar.P);
                    jqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
