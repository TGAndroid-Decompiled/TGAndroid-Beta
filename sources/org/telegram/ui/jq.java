package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jq implements Runnable {
    public final int f34149a;
    public final rq f34150b;

    public jq(rq rqVar, int i10) {
        this.f34149a = i10;
        this.f34150b = rqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f34149a;
        rq rqVar = this.f34150b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = rqVar.v;
                oq oqVar = rqVar.X0;
                if (oqVar != null) {
                    if (rqVar.K) {
                        tL_chatAdminRights = rqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    oqVar.b(0, tL_chatAdminRights, null, rqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", rqVar.f36437w.f17195id);
                if (!rqVar.getMessagesController().checkCanOpenChat(i12, rqVar)) {
                    rqVar.t0(false);
                    return;
                }
                eo eoVar = new eo(i12);
                rqVar.presentFragment(eoVar, true);
                if (org.telegram.ui.Components.wc.a(eoVar)) {
                    boolean z10 = rqVar.Z0;
                    if (z10 && rqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(eoVar.getParentActivity(), eoVar.f32316ea);
                        xbVar.d(R.raw.ic_admin, "Shield");
                        xbVar.f29000b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.pc.g(eoVar, xbVar, 1500).j();
                        return;
                    } else if (!z10 && !rqVar.L && rqVar.K) {
                        org.telegram.ui.Components.wc.C(eoVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                rqVar.r0(false);
                return;
            default:
                if (rqVar.f36430r) {
                    long j3 = rqVar.f36425n;
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(rqVar.getParentActivity(), 3, null)};
                    rqVar.getMessagesController().toggleChatJoinRequest(rqVar.f36432s, j3, true, false, true, new yg(d2VarArr, 2), new yg(d2VarArr, 3));
                    d2VarArr[0].q(300L);
                }
                oq oqVar2 = rqVar.X0;
                if (oqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = rqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!rqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!rqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    oqVar2.b(i11, tL_chatAdminRights2, rqVar.O, rqVar.S);
                    rqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
