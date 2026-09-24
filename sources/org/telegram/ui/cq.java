package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cq implements Runnable {
    public final int f32753a;
    public final kq f32754b;

    public cq(kq kqVar, int i10) {
        this.f32753a = i10;
        this.f32754b = kqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f32753a;
        kq kqVar = this.f32754b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = kqVar.v;
                hq hqVar = kqVar.X0;
                if (hqVar != null) {
                    if (kqVar.K) {
                        tL_chatAdminRights = kqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    hqVar.b(0, tL_chatAdminRights, null, kqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", kqVar.f35120w.f18321id);
                if (!kqVar.getMessagesController().checkCanOpenChat(i12, kqVar)) {
                    kqVar.t0(false);
                    return;
                }
                wn wnVar = new wn(i12);
                kqVar.presentFragment(wnVar, true);
                if (org.telegram.ui.Components.yc.a(wnVar)) {
                    boolean z10 = kqVar.Z0;
                    if (z10 && kqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wnVar.getParentActivity(), wnVar.f39454ea);
                        ybVar.d(R.raw.ic_admin, "Shield");
                        ybVar.f30575b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.qc.g(wnVar, ybVar, 1500).j();
                        return;
                    } else if (!z10 && !kqVar.L && kqVar.K) {
                        org.telegram.ui.Components.yc.C(wnVar, user.first_name).j();
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
                if (kqVar.f35113r) {
                    long j3 = kqVar.f35108n;
                    org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(kqVar.getParentActivity(), 3, null)};
                    kqVar.getMessagesController().toggleChatJoinRequest(kqVar.f35115s, j3, true, false, true, new ug(a2VarArr, 2), new ug(a2VarArr, 3));
                    a2VarArr[0].q(300L);
                }
                hq hqVar2 = kqVar.X0;
                if (hqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = kqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!kqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!kqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    hqVar2.b(i11, tL_chatAdminRights2, kqVar.O, kqVar.S);
                    kqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
