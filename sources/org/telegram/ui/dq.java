package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dq implements Runnable {
    public final int f32693a;
    public final lq f32694b;

    public dq(lq lqVar, int i10) {
        this.f32693a = i10;
        this.f32694b = lqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f32693a;
        lq lqVar = this.f32694b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = lqVar.v;
                iq iqVar = lqVar.X0;
                if (iqVar != null) {
                    if (lqVar.K) {
                        tL_chatAdminRights = lqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    iqVar.b(0, tL_chatAdminRights, null, lqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", lqVar.f35071w.f18083id);
                if (!lqVar.getMessagesController().checkCanOpenChat(i12, lqVar)) {
                    lqVar.t0(false);
                    return;
                }
                xn xnVar = new xn(i12);
                lqVar.presentFragment(xnVar, true);
                if (org.telegram.ui.Components.xc.a(xnVar)) {
                    boolean z10 = lqVar.Z0;
                    if (z10 && lqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(xnVar.getParentActivity(), xnVar.f39370ea);
                        ybVar.d(R.raw.ic_admin, "Shield");
                        ybVar.f30192b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.qc.g(xnVar, ybVar, 1500).j();
                        return;
                    } else if (!z10 && !lqVar.L && lqVar.K) {
                        org.telegram.ui.Components.xc.C(xnVar, user.first_name).j();
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
                if (lqVar.f35064r) {
                    long j3 = lqVar.f35059n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(lqVar.getParentActivity(), 3, null)};
                    lqVar.getMessagesController().toggleChatJoinRequest(lqVar.f35066s, j3, true, false, true, new vg(b2VarArr, 2), new vg(b2VarArr, 3));
                    b2VarArr[0].q(300L);
                }
                iq iqVar2 = lqVar.X0;
                if (iqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = lqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!lqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!lqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    iqVar2.b(i11, tL_chatAdminRights2, lqVar.O, lqVar.S);
                    lqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
