package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t50 implements org.telegram.ui.j90 {
    public final u50 f39781a;

    public t50(u50 u50Var) {
        this.f39781a = u50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i7;
        org.telegram.ui.ab abVar = this.f39781a.f40272a.f40684c.f33316e2;
        if (abVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.lb lbVar = abVar.f45556a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.j10.i(lbVar.getAccountInstance().f23246a).f24817n;
            i7 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
            if (new org.telegram.messenger.fj(i7, tL_channelAdminLogEvent, lbVar.f49558o0, lbVar.f49557n0, lbVar.f49548f, lbVar.U, true).U >= 0) {
                lbVar.W0();
                lbVar.F.f();
                org.telegram.ui.lb.P0(lbVar);
            }
        }
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public final void c(TLObject tLObject) {
    }
}
