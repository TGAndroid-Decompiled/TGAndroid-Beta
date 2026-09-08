package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iq implements Runnable {
    public final int f37448a;
    public final qq f37449b;

    public iq(qq qqVar, int i10) {
        this.f37448a = i10;
        this.f37449b = qqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f37448a;
        qq qqVar = this.f37449b;
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
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", qqVar.f39992w.f19896id);
                if (!qqVar.getMessagesController().checkCanOpenChat(i12, qqVar)) {
                    qqVar.t0(false);
                    return;
                }
                co coVar = new co(i12);
                qqVar.presentFragment(coVar, true);
                if (org.telegram.ui.Components.yc.a(coVar)) {
                    boolean z10 = qqVar.Z0;
                    if (z10 && qqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(coVar.getParentActivity(), coVar.f35274ea);
                        ybVar.d(R.raw.ic_admin, "Shield");
                        ybVar.f32903b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.qc.g(coVar, ybVar, 1500).j();
                        return;
                    } else if (!z10 && !qqVar.L && qqVar.K) {
                        org.telegram.ui.Components.yc.C(coVar, user.first_name).j();
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
                if (qqVar.f39985r) {
                    long j3 = qqVar.f39980n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(qqVar.getParentActivity(), 3, null)};
                    qqVar.getMessagesController().toggleChatJoinRequest(qqVar.f39987s, j3, true, false, true, new xg(b2VarArr, 2), new xg(b2VarArr, 3));
                    b2VarArr[0].q(300L);
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
