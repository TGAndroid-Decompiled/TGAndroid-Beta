package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eq implements Runnable {
    public final int f36069a;
    public final mq f36070b;

    public eq(mq mqVar, int i10) {
        this.f36069a = i10;
        this.f36070b = mqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f36069a;
        mq mqVar = this.f36070b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = mqVar.v;
                jq jqVar = mqVar.X0;
                if (jqVar != null) {
                    if (mqVar.K) {
                        tL_chatAdminRights = mqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    jqVar.b(0, tL_chatAdminRights, null, mqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", mqVar.f38736w.f20037id);
                if (!mqVar.getMessagesController().checkCanOpenChat(i12, mqVar)) {
                    mqVar.t0(false);
                    return;
                }
                yn ynVar = new yn(i12);
                mqVar.presentFragment(ynVar, true);
                if (org.telegram.ui.Components.yc.a(ynVar)) {
                    boolean z10 = mqVar.Z0;
                    if (z10 && mqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(ynVar.getParentActivity(), ynVar.f43299ca);
                        zbVar.d(R.raw.ic_admin, "Shield");
                        zbVar.f33465b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.rc.g(ynVar, zbVar, 1500).j();
                        return;
                    } else if (!z10 && !mqVar.L && mqVar.K) {
                        org.telegram.ui.Components.yc.C(ynVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                mqVar.r0(false);
                return;
            default:
                if (mqVar.f38729r) {
                    long j3 = mqVar.f38724n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(mqVar.getParentActivity(), 3, null)};
                    mqVar.getMessagesController().toggleChatJoinRequest(mqVar.f38731s, j3, true, false, true, new xg(b2VarArr, 2), new xg(b2VarArr, 3));
                    b2VarArr[0].q(300L);
                }
                jq jqVar2 = mqVar.X0;
                if (jqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = mqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!mqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!mqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    jqVar2.b(i11, tL_chatAdminRights2, mqVar.O, mqVar.S);
                    mqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
