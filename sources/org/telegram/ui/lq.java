package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lq implements Runnable {
    public final int f38072a;
    public final tq f38073b;

    public lq(tq tqVar, int i10) {
        this.f38072a = i10;
        this.f38073b = tqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f38072a;
        tq tqVar = this.f38073b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = tqVar.v;
                qq qqVar = tqVar.X0;
                if (qqVar != null) {
                    if (tqVar.K) {
                        tL_chatAdminRights = tqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    qqVar.b(0, tL_chatAdminRights, null, tqVar.S);
                }
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                h.putLong("chat_id", tqVar.f40464w.f19216id);
                if (!tqVar.getMessagesController().checkCanOpenChat(h, tqVar)) {
                    tqVar.t0(false);
                    return;
                }
                fo foVar = new fo(h);
                tqVar.presentFragment(foVar, true);
                if (org.telegram.ui.Components.zc.a(foVar)) {
                    boolean z10 = tqVar.Z0;
                    if (z10 && tqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(foVar.getParentActivity(), foVar.f35932ea);
                        acVar.d(R.raw.ic_admin, "Shield");
                        acVar.f23513b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.sc.g(foVar, acVar, 1500).j();
                        return;
                    } else if (!z10 && !tqVar.L && tqVar.K) {
                        org.telegram.ui.Components.zc.C(foVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                tqVar.r0(false);
                return;
            default:
                if (tqVar.f40457r) {
                    long j10 = tqVar.f40452n;
                    org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(tqVar.getParentActivity(), 3, null)};
                    tqVar.getMessagesController().toggleChatJoinRequest(tqVar.f40459s, j10, true, false, true, new ah(a2VarArr, 2), new ah(a2VarArr, 3));
                    a2VarArr[0].q(300L);
                }
                qq qqVar2 = tqVar.X0;
                if (qqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!tqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!tqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    qqVar2.b(i11, tL_chatAdminRights2, tqVar.O, tqVar.S);
                    tqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
