package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iq implements Runnable {
    public final int f38970a;
    public final qq f38971b;

    public iq(qq qqVar, int i10) {
        this.f38970a = i10;
        this.f38971b = qqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f38970a;
        qq qqVar = this.f38971b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = qqVar.v;
                nq nqVar = qqVar.X0;
                if (nqVar != null) {
                    if (qqVar.K) {
                        tL_chatAdminRights = qqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    nqVar.b(0, tL_chatAdminRights, null, qqVar.S);
                }
                Bundle i12 = a1.g.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", qqVar.f41419w.f19803id);
                if (!qqVar.getMessagesController().checkCanOpenChat(i12, qqVar)) {
                    qqVar.t0(false);
                    return;
                }
                eo eoVar = new eo(i12);
                qqVar.presentFragment(eoVar, true);
                if (org.telegram.ui.Components.zc.a(eoVar)) {
                    boolean z10 = qqVar.Z0;
                    if (z10 && qqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(eoVar.getParentActivity(), eoVar.f37256ea);
                        acVar.d(R.raw.ic_admin, "Shield");
                        acVar.f24277b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.sc.g(eoVar, acVar, 1500).j();
                        return;
                    } else if (!z10 && !qqVar.L && qqVar.K) {
                        org.telegram.ui.Components.zc.C(eoVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                qqVar.r0(false);
                return;
            default:
                if (qqVar.f41412r) {
                    long j3 = qqVar.f41407n;
                    org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(qqVar.getParentActivity(), 3, null)};
                    qqVar.getMessagesController().toggleChatJoinRequest(qqVar.f41414s, j3, true, false, true, new zg(a2VarArr, 2), new zg(a2VarArr, 3));
                    a2VarArr[0].q(300L);
                }
                nq nqVar2 = qqVar.X0;
                if (nqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = qqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!qqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!qqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    nqVar2.b(i11, tL_chatAdminRights2, qqVar.O, qqVar.S);
                    qqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
