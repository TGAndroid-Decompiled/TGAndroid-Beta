package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t50 implements org.telegram.ui.j90 {
    public final u50 f39728a;

    public t50(u50 u50Var) {
        this.f39728a = u50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i7;
        org.telegram.ui.ab abVar = this.f39728a.f40247a.f40637c.f33295e2;
        if (abVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.lb lbVar = abVar.f45527a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.k10.i(lbVar.getAccountInstance().f23166a).f24951n;
            i7 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
            if (new org.telegram.messenger.gj(i7, tL_channelAdminLogEvent, lbVar.f49538o0, lbVar.f49537n0, lbVar.f49528f, lbVar.U, true).U >= 0) {
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
