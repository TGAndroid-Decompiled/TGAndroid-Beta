package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class aq implements Runnable {
    public final int f37807a;
    public final iq f37808b;

    public aq(iq iqVar, int i10) {
        this.f37807a = i10;
        this.f37808b = iqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f37807a;
        iq iqVar = this.f37808b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = iqVar.v;
                fq fqVar = iqVar.X0;
                if (fqVar != null) {
                    if (iqVar.K) {
                        tL_chatAdminRights = iqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    fqVar.b(0, tL_chatAdminRights, null, iqVar.S);
                }
                Bundle i12 = a1.g.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", iqVar.f40255w.f22028id);
                if (!iqVar.getMessagesController().checkCanOpenChat(i12, iqVar)) {
                    iqVar.u0(false);
                    return;
                }
                wn wnVar = new wn(i12);
                iqVar.presentFragment(wnVar, true);
                if (org.telegram.ui.Components.wc.a(wnVar)) {
                    boolean z10 = iqVar.Z0;
                    if (z10 && iqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wnVar.getParentActivity(), wnVar.f45309ua);
                        ybVar.d(R.raw.ic_admin, "Shield");
                        ybVar.f35028b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.qc.g(wnVar, ybVar, 1500).j();
                        return;
                    } else if (!z10 && !iqVar.L && iqVar.K) {
                        org.telegram.ui.Components.wc.C(wnVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                iqVar.s0(false);
                return;
            default:
                if (iqVar.f40248r) {
                    long j10 = iqVar.f40243n;
                    org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(iqVar.getParentActivity(), 3, null)};
                    iqVar.getMessagesController().toggleChatJoinRequest(iqVar.f40250s, j10, true, false, true, new og(e2VarArr, 2), new og(e2VarArr, 3));
                    e2VarArr[0].r(300L);
                }
                fq fqVar2 = iqVar.X0;
                if (fqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = iqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!iqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!iqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    fqVar2.b(i11, tL_chatAdminRights2, iqVar.O, iqVar.S);
                    iqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
