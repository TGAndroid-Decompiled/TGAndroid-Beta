package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class aq implements Runnable {
    public final int f35823a;
    public final iq f35824b;

    public aq(iq iqVar, int i10) {
        this.f35823a = i10;
        this.f35824b = iqVar;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.f35823a;
        iq iqVar = this.f35824b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = iqVar.f38149w;
                fq fqVar = iqVar.X0;
                if (fqVar != null) {
                    if (iqVar.K) {
                        tL_chatAdminRights = iqVar.M;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    fqVar.b(0, tL_chatAdminRights, null, iqVar.S);
                }
                Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                g10.putLong("chat_id", iqVar.f38151x.f19794id);
                if (!iqVar.getMessagesController().E(g10, iqVar, null, null)) {
                    iqVar.y0(false);
                    return;
                }
                un unVar = new un(g10);
                iqVar.presentFragment(unVar, true);
                if (org.telegram.ui.Components.cc.a(unVar)) {
                    boolean z10 = iqVar.Z0;
                    if (z10 && iqVar.K) {
                        String str = user.first_name;
                        org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(unVar.getParentActivity(), unVar.f42288xa);
                        ebVar.d(2131624047, "Shield");
                        org.telegram.messenger.m5.q("UserAddedAsAdminHint", null, 2131743794, new Object[]{str}, ebVar.f25779b);
                        org.telegram.ui.Components.wb.g(unVar, ebVar, 1500).j();
                        return;
                    } else if (!z10 && !iqVar.L && iqVar.K) {
                        org.telegram.ui.Components.cc.C(user.first_name, unVar).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                iqVar.w0(false);
                return;
            default:
                if (iqVar.f38142r) {
                    long j10 = iqVar.f38137n;
                    org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, iqVar.getParentActivity(), null)};
                    iqVar.getMessagesController().Z4(iqVar.f38144s, j10, true, false, true, new qg(x1VarArr, 2), new qg(x1VarArr, 3));
                    x1VarArr[0].r(300L);
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
