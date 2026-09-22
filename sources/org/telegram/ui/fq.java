package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fq implements Runnable {
    public final int f33732a;
    public final nq f33733b;

    public fq(nq nqVar, int i10) {
        this.f33732a = i10;
        this.f33733b = nqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f33732a;
        nq nqVar = this.f33733b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = nqVar.v;
                kq kqVar = nqVar.X0;
                if (kqVar != null) {
                    if (nqVar.K) {
                        tL_chatAdminRights = nqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    kqVar.b(0, tL_chatAdminRights, null, nqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", nqVar.f36125w.f18343id);
                if (!nqVar.getMessagesController().checkCanOpenChat(i12, nqVar)) {
                    nqVar.t0(false);
                    return;
                }
                zn znVar = new zn(i12);
                nqVar.presentFragment(znVar, true);
                if (org.telegram.ui.Components.xc.a(znVar)) {
                    boolean z10 = nqVar.Z0;
                    if (z10 && nqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(znVar.getParentActivity(), znVar.f40324ea);
                        xbVar.d(R.raw.ic_admin, "Shield");
                        xbVar.f30299b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                        org.telegram.ui.Components.pc.g(znVar, xbVar, 1500).j();
                        return;
                    } else if (!z10 && !nqVar.L && nqVar.K) {
                        org.telegram.ui.Components.xc.C(znVar, user.first_name).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                nqVar.r0(false);
                return;
            default:
                if (nqVar.f36118r) {
                    long j3 = nqVar.f36113n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(nqVar.getParentActivity(), 3, null)};
                    nqVar.getMessagesController().toggleChatJoinRequest(nqVar.f36120s, j3, true, false, true, new xg(b2VarArr, 2), new xg(b2VarArr, 3));
                    b2VarArr[0].q(300L);
                }
                kq kqVar2 = nqVar.X0;
                if (kqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = nqVar.M;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!nqVar.G || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!nqVar.E || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i11 = 0;
                    }
                    kqVar2.b(i11, tL_chatAdminRights2, nqVar.O, nqVar.S);
                    nqVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
