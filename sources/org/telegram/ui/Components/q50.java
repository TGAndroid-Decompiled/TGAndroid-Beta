package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q50 implements org.telegram.ui.i90 {
    public final r50 f38696a;

    public q50(r50 r50Var) {
        this.f38696a = r50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i7;
        org.telegram.ui.ab abVar = this.f38696a.f39221a.f39500c.f41832e2;
        if (abVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.lb lbVar = abVar.f45643a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.i10.i(lbVar.getAccountInstance().f23343a).f24656n;
            i7 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
            if (new org.telegram.messenger.fj(i7, tL_channelAdminLogEvent, lbVar.f49697o0, lbVar.f49696n0, lbVar.f49687f, lbVar.U, true).U >= 0) {
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
